package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3p4PGtCyZq42EnjFpY9Cq8h7yXonsbyrvqsIcRo3")
                .clientKey("0Qj1YDtF4DV4xpSdVtDc01Meez5cP3mMC845Yojk")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
