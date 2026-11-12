package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterSession;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AuthHandler {
    public static final String c = "tk";
    public static final String d = "ts";
    public static final String e = "screen_name";
    public static final String f = "user_id";
    public static final String g = "auth_error";
    public static final int h = 1;
    private final TwitterAuthConfig a;
    private final Callback<TwitterSession> b;
    public final int requestCode;

    public AuthHandler(TwitterAuthConfig twitterAuthConfig, Callback<TwitterSession> callback, int i) {
        this.a = twitterAuthConfig;
        this.b = callback;
        this.requestCode = i;
    }

    public TwitterAuthConfig a() {
        return this.a;
    }

    public abstract boolean authorize(Activity activity);

    public Callback<TwitterSession> b() {
        return this.b;
    }

    public boolean handleOnActivityResult(int i, int i2, Intent intent) {
        if (this.requestCode != i) {
            return false;
        }
        Callback<TwitterSession> callbackB = b();
        if (callbackB == null) {
            return true;
        }
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra(c);
            String stringExtra2 = intent.getStringExtra(d);
            String stringExtra3 = intent.getStringExtra("screen_name");
            callbackB.success(new Result<>(new TwitterSession(new TwitterAuthToken(stringExtra, stringExtra2), intent.getLongExtra("user_id", 0L), stringExtra3), null));
            return true;
        }
        if (intent == null || !intent.hasExtra(g)) {
            callbackB.failure(new TwitterAuthException("Authorize failed."));
            return true;
        }
        callbackB.failure((TwitterAuthException) intent.getSerializableExtra(g));
        return true;
    }
}
