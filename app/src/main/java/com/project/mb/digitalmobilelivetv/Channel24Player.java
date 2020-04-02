package com.project.mb.digitalmobilelivetv;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Channel24Player extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{

    YouTubePlayer player;
    Button fullScreen;
    DatabaseReference myRef;
    String channel24;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ch24_player);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Channel List");

        myRef.child("Channel 24").setValue(channel24);


        YouTubePlayerView playerView = (YouTubePlayerView)findViewById(R.id.youTubePlayerView);
        playerView.initialize(DeveloperKey.DEVELOPER_KEY,this);

        fullScreen = (Button)findViewById(R.id.button2);

        fullScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setFullscreen(true);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                channel24 = dataSnapshot.getValue(String.class);


            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean b) {

        this.player = player;

        if(!b){

            player.setPlayerStyle(YouTubePlayer.PlayerStyle.MINIMAL);
            // You can change the ID.. of the video to be played
            player.loadVideo(channel24);

        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }


}
