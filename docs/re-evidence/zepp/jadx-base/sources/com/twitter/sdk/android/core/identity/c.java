package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterSession;

/* JADX INFO: loaded from: classes18.dex */
class c extends AuthHandler {
    public c(TwitterAuthConfig twitterAuthConfig, Callback<TwitterSession> callback, int i) {
        super(twitterAuthConfig, callback, i);
    }

    @Override // com.twitter.sdk.android.core.identity.AuthHandler
    public boolean authorize(Activity activity) {
        activity.startActivityForResult(c(activity), this.requestCode);
        return true;
    }

    public Intent c(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) OAuthActivity.class);
        intent.putExtra(OAuthActivity.d, a());
        return intent;
    }
}
