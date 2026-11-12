package com.twitter.sdk.android.tweetcomposer;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.twitter.Validator;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.core.services.AccountService;

/* JADX INFO: loaded from: classes18.dex */
class a {
    public final ComposerView a;
    public final TwitterSession b;
    public final Uri c;
    public final ComposerActivity.a d;
    public final d e;

    /* JADX INFO: renamed from: com.twitter.sdk.android.tweetcomposer.a$a, reason: collision with other inner class name */
    public class C0762a extends Callback<User> {
        public C0762a() {
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void failure(TwitterException twitterException) {
            a.this.a.setProfilePhotoView(null);
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void success(Result<User> result) {
            a.this.a.setProfilePhotoView(result.data);
        }
    }

    public interface b {
        void a(String str);

        void b();

        void c(String str);
    }

    public class c implements b {
        public c() {
        }

        @Override // com.twitter.sdk.android.tweetcomposer.a.b
        public void a(String str) {
            a.this.e.b().b(g.f);
            Intent intent = new Intent(a.this.a.getContext(), (Class<?>) TweetUploadService.class);
            intent.putExtra("EXTRA_USER_TOKEN", a.this.b.getAuthToken());
            intent.putExtra(TweetUploadService.e, str);
            intent.putExtra("EXTRA_IMAGE_URI", a.this.c);
            a.this.a.getContext().startService(intent);
            a.this.d.finish();
        }

        @Override // com.twitter.sdk.android.tweetcomposer.a.b
        public void b() {
            a.this.e.b().b(g.g);
            a.this.d.finish();
        }

        @Override // com.twitter.sdk.android.tweetcomposer.a.b
        public void c(String str) {
            int iG = a.this.g(str);
            a.this.a.setCharCount(a.d(iG));
            if (a.c(iG)) {
                a.this.a.setCharCountTextStyle(R.style.tw__ComposerCharCountOverflow);
            } else {
                a.this.a.setCharCountTextStyle(R.style.tw__ComposerCharCount);
            }
            a.this.a.c(a.b(iG));
        }
    }

    public static class d {
        public final Validator a = new Validator();

        public TwitterApiClient a(TwitterSession twitterSession) {
            return TwitterCore.getInstance().getApiClient(twitterSession);
        }

        public com.twitter.sdk.android.tweetcomposer.b b() {
            return new com.twitter.sdk.android.tweetcomposer.c(TweetComposer.getInstance().a());
        }

        public Validator c() {
            return this.a;
        }
    }

    public a(ComposerView composerView, TwitterSession twitterSession, Uri uri, String str, String str2, ComposerActivity.a aVar) {
        this(composerView, twitterSession, uri, str, str2, aVar, new d());
    }

    public static boolean b(int i) {
        return i > 0 && i <= 140;
    }

    public static boolean c(int i) {
        return i > 140;
    }

    public static int d(int i) {
        return 140 - i;
    }

    public String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    public void e(Uri uri) {
        if (uri != null) {
            this.a.setImageView(uri);
        }
    }

    public void f() {
        AccountService accountService = this.e.a(this.b).getAccountService();
        Boolean bool = Boolean.FALSE;
        accountService.verifyCredentials(bool, Boolean.TRUE, bool).enqueue(new C0762a());
    }

    public int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return this.e.c().getTweetLength(str);
    }

    public a(ComposerView composerView, TwitterSession twitterSession, Uri uri, String str, String str2, ComposerActivity.a aVar, d dVar) {
        this.a = composerView;
        this.b = twitterSession;
        this.c = uri;
        this.d = aVar;
        this.e = dVar;
        composerView.setCallbacks(new c());
        composerView.setTweetText(a(str, str2));
        f();
        e(uri);
        dVar.b().a();
    }
}
