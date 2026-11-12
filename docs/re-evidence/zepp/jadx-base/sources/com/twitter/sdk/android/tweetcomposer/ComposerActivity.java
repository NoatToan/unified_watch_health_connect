package com.twitter.sdk.android.tweetcomposer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.twitter.Regex;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterSession;

/* JADX INFO: loaded from: classes18.dex */
public class ComposerActivity extends Activity {
    public static final String a = "EXTRA_USER_TOKEN";
    public static final String b = "EXTRA_IMAGE_URI";
    public static final String c = "EXTRA_THEME";
    public static final String d = "EXTRA_TEXT";
    public static final String e = "EXTRA_HASHTAGS";
    private static final int f = -1;
    private static final String g = "";

    public static class Builder {
        private final Context a;
        private TwitterAuthToken b;
        private int c = R.style.ComposerLight;
        private Uri d;
        private String e;
        private String f;

        public Builder(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            this.a = context;
        }

        public Intent createIntent() {
            if (this.b == null) {
                throw new IllegalStateException("Must set a TwitterSession");
            }
            Intent intent = new Intent(this.a, (Class<?>) ComposerActivity.class);
            intent.putExtra("EXTRA_USER_TOKEN", this.b);
            intent.putExtra("EXTRA_IMAGE_URI", this.d);
            intent.putExtra(ComposerActivity.c, this.c);
            intent.putExtra(ComposerActivity.d, this.e);
            intent.putExtra(ComposerActivity.e, this.f);
            return intent;
        }

        public Builder darkTheme() {
            this.c = R.style.ComposerDark;
            return this;
        }

        public Builder hashtags(String... strArr) {
            if (strArr == null) {
                return this;
            }
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                if (Regex.VALID_HASHTAG.matcher(str).find()) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(str);
                }
            }
            this.f = sb.length() == 0 ? null : sb.toString();
            return this;
        }

        public Builder image(Uri uri) {
            this.d = uri;
            return this;
        }

        public Builder session(TwitterSession twitterSession) {
            if (twitterSession == null) {
                throw new IllegalArgumentException("TwitterSession must not be null");
            }
            TwitterAuthToken authToken = twitterSession.getAuthToken();
            if (authToken == null) {
                throw new IllegalArgumentException("TwitterSession token must not be null");
            }
            this.b = authToken;
            return this;
        }

        public Builder text(String str) {
            this.e = str;
            return this;
        }
    }

    public interface a {
        void finish();
    }

    public class b implements a {
        public b() {
        }

        @Override // com.twitter.sdk.android.tweetcomposer.ComposerActivity.a
        public void finish() {
            ComposerActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        TwitterSession twitterSession = new TwitterSession((TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN"), -1L, "");
        Uri uri = (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI");
        String stringExtra = intent.getStringExtra(d);
        String stringExtra2 = intent.getStringExtra(e);
        setTheme(intent.getIntExtra(c, R.style.ComposerLight));
        setContentView(R.layout.tw__activity_composer);
        new com.twitter.sdk.android.tweetcomposer.a((ComposerView) findViewById(R.id.tw__composer_view), twitterSession, uri, stringExtra, stringExtra2, new b());
    }
}
