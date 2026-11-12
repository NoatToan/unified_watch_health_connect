package com.twitter.sdk.android.tweetcomposer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import io.netty.util.internal.StringUtil;
import java.net.URL;

/* JADX INFO: loaded from: classes18.dex */
public class TweetComposer {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile TweetComposer e = null;
    private static final String f = "text/plain";
    private static final String g = "image/jpeg";
    private static final String h = "com.twitter.android";
    private static final String i = "https://twitter.com/intent/tweet?text=%s&url=%s";
    private static final String j = "TweetComposer";
    public e d = new f(null);
    public SessionManager<TwitterSession> a = TwitterCore.getInstance().getSessionManager();
    public GuestSessionProvider b = TwitterCore.getInstance().getGuestSessionProvider();
    public Context c = Twitter.getInstance().getContext(getIdentifier());

    public static class Builder {
        private final Context a;
        private String b;
        private URL c;
        private Uri d;

        public Builder(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.a = context;
        }

        public Intent a() {
            Intent intent = new Intent("android.intent.action.SEND");
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.b)) {
                sb.append(this.b);
            }
            if (this.c != null) {
                if (sb.length() > 0) {
                    sb.append(StringUtil.SPACE);
                }
                sb.append(this.c.toString());
            }
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
            intent.setType("text/plain");
            Uri uri = this.d;
            if (uri != null) {
                intent.putExtra("android.intent.extra.STREAM", uri);
                intent.setType("image/jpeg");
            }
            for (ResolveInfo resolveInfo : this.a.getPackageManager().queryIntentActivities(intent, 65536)) {
                if (resolveInfo.activityInfo.packageName.startsWith("com.twitter.android")) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                    return intent;
                }
            }
            return null;
        }

        public Intent b() {
            URL url = this.c;
            return new Intent("android.intent.action.VIEW", Uri.parse(String.format(TweetComposer.i, UrlUtils.urlEncode(this.b), UrlUtils.urlEncode(url == null ? "" : url.toString()))));
        }

        public Intent createIntent() {
            Intent intentA = a();
            return intentA == null ? b() : intentA;
        }

        public Builder image(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("imageUri must not be null.");
            }
            if (this.d != null) {
                throw new IllegalStateException("imageUri already set.");
            }
            this.d = uri;
            return this;
        }

        public void show() {
            this.a.startActivity(createIntent());
        }

        public Builder text(String str) {
            if (str == null) {
                throw new IllegalArgumentException("text must not be null.");
            }
            if (this.b != null) {
                throw new IllegalStateException("text already set.");
            }
            this.b = str;
            return this;
        }

        public Builder url(URL url) {
            if (url == null) {
                throw new IllegalArgumentException("url must not be null.");
            }
            if (this.c != null) {
                throw new IllegalStateException("url already set.");
            }
            this.c = url;
            return this;
        }
    }

    public TweetComposer() {
        b();
    }

    private void b() {
        this.d = new f(new DefaultScribeClient(this.c, this.a, this.b, Twitter.getInstance().getIdManager(), DefaultScribeClient.getScribeConfig(j, getVersion())));
    }

    public static TweetComposer getInstance() {
        if (e == null) {
            synchronized (TweetComposer.class) {
                if (e == null) {
                    e = new TweetComposer();
                }
            }
        }
        return e;
    }

    public e a() {
        return this.d;
    }

    public String getIdentifier() {
        return "com.twitter.sdk.android:tweet-composer";
    }

    public String getVersion() {
        return "3.0.0.7";
    }
}
