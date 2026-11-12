package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.R;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;

/* JADX INFO: loaded from: classes18.dex */
public class OAuthActivity extends Activity implements b.c {
    public static final String d = "auth_config";
    private static final String e = "progress";
    public b a;
    private ProgressBar b;
    private WebView c;

    @Override // android.app.Activity
    public void onBackPressed() {
        this.a.h(0, new TwitterAuthException("Authorization failed, request was canceled."));
    }

    @Override // com.twitter.sdk.android.core.identity.b.c
    public void onComplete(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tw__activity_oauth);
        this.b = (ProgressBar) findViewById(R.id.tw__spinner);
        this.c = (WebView) findViewById(R.id.tw__web_view);
        this.b.setVisibility(bundle != null ? bundle.getBoolean("progress", false) : true ? 0 : 8);
        b bVar = new b(this.b, this.c, (TwitterAuthConfig) getIntent().getParcelableExtra(d), new OAuth1aService(TwitterCore.getInstance(), new TwitterApi()), this);
        this.a = bVar;
        bVar.n();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (this.b.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }
}
