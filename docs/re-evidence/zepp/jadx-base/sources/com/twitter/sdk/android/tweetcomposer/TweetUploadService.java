package com.twitter.sdk.android.tweetcomposer;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.models.Media;
import com.twitter.sdk.android.core.models.Tweet;
import java.io.File;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes18.dex */
public class TweetUploadService extends IntentService {
    public static final String EXTRA_RETRY_INTENT = "EXTRA_RETRY_INTENT";
    public static final String EXTRA_TWEET_ID = "EXTRA_TWEET_ID";
    public static final String UPLOAD_FAILURE = "com.twitter.sdk.android.tweetcomposer.UPLOAD_FAILURE";
    public static final String UPLOAD_SUCCESS = "com.twitter.sdk.android.tweetcomposer.UPLOAD_SUCCESS";
    public static final String c = "TweetUploadService";
    public static final String d = "EXTRA_USER_TOKEN";
    public static final String e = "EXTRA_TWEET_TEXT";
    public static final String f = "EXTRA_IMAGE_URI";
    private static final int g = -1;
    private static final String h = "";
    public c a;
    public Intent b;

    public class a extends Callback<Media> {
        public final /* synthetic */ TwitterSession a;
        public final /* synthetic */ String b;

        public a(TwitterSession twitterSession, String str) {
            this.a = twitterSession;
            this.b = str;
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void failure(TwitterException twitterException) {
            TweetUploadService.this.a(twitterException);
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void success(Result<Media> result) {
            TweetUploadService.this.f(this.a, this.b, result.data.mediaIdString);
        }
    }

    public class b extends Callback<Tweet> {
        public b() {
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void failure(TwitterException twitterException) {
            TweetUploadService.this.a(twitterException);
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void success(Result<Tweet> result) {
            TweetUploadService.this.c(result.data.getId());
            TweetUploadService.this.stopSelf();
        }
    }

    public static class c {
        public TwitterApiClient a(TwitterSession twitterSession) {
            return TwitterCore.getInstance().getApiClient(twitterSession);
        }
    }

    public TweetUploadService() {
        this(new c());
    }

    public void a(TwitterException twitterException) {
        b(this.b);
        Twitter.getLogger().e(c, "Post Tweet failed", twitterException);
        stopSelf();
    }

    public void b(Intent intent) {
        Intent intent2 = new Intent(UPLOAD_FAILURE);
        intent2.putExtra(EXTRA_RETRY_INTENT, intent);
        intent2.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent2);
    }

    public void c(long j) {
        Intent intent = new Intent(UPLOAD_SUCCESS);
        intent.putExtra(EXTRA_TWEET_ID, j);
        intent.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent);
    }

    public void d(TwitterSession twitterSession, Uri uri, Callback<Media> callback) {
        TwitterApiClient twitterApiClientA = this.a.a(twitterSession);
        String strC = d.c(this, uri);
        if (strC == null) {
            a(new TwitterException("Uri file path resolved to null"));
            return;
        }
        File file = new File(strC);
        twitterApiClientA.getMediaService().upload(RequestBody.create(MediaType.parse(d.b(file)), file), null, null).enqueue(callback);
    }

    public void e(TwitterSession twitterSession, String str, Uri uri) {
        if (uri != null) {
            d(twitterSession, uri, new a(twitterSession, str));
        } else {
            f(twitterSession, str, null);
        }
    }

    public void f(TwitterSession twitterSession, String str, String str2) {
        this.a.a(twitterSession).getStatusesService().update(str, null, null, null, null, null, null, Boolean.TRUE, str2).enqueue(new b());
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN");
        this.b = intent;
        e(new TwitterSession(twitterAuthToken, -1L, ""), intent.getStringExtra(e), (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI"));
    }

    public TweetUploadService(c cVar) {
        super(c);
        this.a = cVar;
    }
}
