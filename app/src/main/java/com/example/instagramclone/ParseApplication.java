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
                .applicationId("z7JmgttwvAwt1z7t2FJUAcflqvzapYUusRw0o26h")
                .clientKey("eruoFCiW8rWjgkPulkQnKndc6oAnZftGriCo1MC5")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
