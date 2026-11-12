package com.huami.widget.share.facebook;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.widget.ShareDialog;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.platform.ErrorMessage;
import com.huami.widget.share.platform.ShareMissionListener;
import com.huami.widget.share.platform.ShareResult;
import com.huami.widget.share.platform.Sharer;

/* JADX INFO: loaded from: classes17.dex */
public class FacebookSharer implements Sharer {
    private static final String e = "FacebookSharer";
    private ShareDialog a;
    private CallbackManager b;
    private ShareMissionListener c;
    private FacebookCallback<com.facebook.share.Sharer.Result> d = new a();

    public class a implements FacebookCallback<com.facebook.share.Sharer.Result> {
        public a() {
        }

        @Override // com.facebook.FacebookCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.facebook.share.Sharer.Result result) {
            if (FacebookSharer.this.c != null) {
                FacebookSharer.this.c.onSuccess(8, new ShareResult());
            }
        }

        @Override // com.facebook.FacebookCallback
        public void onCancel() {
            if (FacebookSharer.this.c != null) {
                FacebookSharer.this.c.onCancel(8);
            }
        }

        @Override // com.facebook.FacebookCallback
        public void onError(FacebookException facebookException) {
            HMLog.e(FacebookSharer.e, facebookException, "onError:" + facebookException.getMessage(), new Object[0]);
            if (FacebookSharer.this.c != null) {
                ErrorMessage errorMessage = new ErrorMessage();
                errorMessage.message = facebookException.getMessage();
                FacebookSharer.this.c.onFailed(8, errorMessage);
            }
        }
    }

    public class b implements FacebookSdk.InitializeCallback {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.FacebookSdk.InitializeCallback
        public void onInitialized() {
            FacebookSharer.this.d(this.a);
        }
    }

    public FacebookSharer(Activity activity) {
        if (FacebookSdk.isInitialized()) {
            d(activity);
        } else {
            FacebookSdk.sdkInitialize(activity.getApplicationContext(), new b(activity));
        }
    }

    private void c() {
        FacebookSdk.setIsDebugEnabled(true);
        FacebookSdk.addLoggingBehavior(LoggingBehavior.REQUESTS);
        FacebookSdk.addLoggingBehavior(LoggingBehavior.APP_EVENTS);
        FacebookSdk.addLoggingBehavior(LoggingBehavior.DEVELOPER_ERRORS);
        FacebookSdk.addLoggingBehavior(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
        FacebookSdk.addLoggingBehavior(LoggingBehavior.INCLUDE_RAW_RESPONSES);
        FacebookSdk.addLoggingBehavior(LoggingBehavior.CACHE);
        FacebookSdk.addLoggingBehavior(LoggingBehavior.GRAPH_API_DEBUG_WARNING);
        FacebookSdk.addLoggingBehavior(LoggingBehavior.GRAPH_API_DEBUG_INFO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity) {
        this.b = CallbackManager.Factory.create();
        ShareDialog shareDialog = new ShareDialog(activity);
        this.a = shareDialog;
        shareDialog.registerCallback(this.b, this.d);
    }

    private void e(String str) {
        if (ShareDialog.canShow((Class<? extends ShareContent>) SharePhotoContent.class)) {
            this.a.show(new SharePhotoContent.Builder().addPhoto(new SharePhoto.Builder().setBitmap(BitmapFactory.decodeFile(str)).build()).build());
            return;
        }
        if (this.c != null) {
            ErrorMessage errorMessage = new ErrorMessage();
            errorMessage.message = "facebook share dialog con`t show";
            this.c.onFailed(8, errorMessage);
        }
    }

    private void f(String str, String str2) {
        if (ShareDialog.canShow((Class<? extends ShareContent>) ShareLinkContent.class)) {
            ShareLinkContent.Builder builder = new ShareLinkContent.Builder();
            if (!TextUtils.isEmpty(str2)) {
                builder.setQuote(str2);
            }
            this.a.show(builder.setContentUrl(Uri.parse(str)).build());
            return;
        }
        if (this.c != null) {
            ErrorMessage errorMessage = new ErrorMessage();
            errorMessage.message = "facebook share dialog con`t show";
            this.c.onFailed(8, errorMessage);
        }
    }

    @Override // com.huami.widget.share.platform.Sharer
    public void onActivityResult(int i, int i2, Intent intent) {
        this.b.onActivityResult(i, i2, intent);
    }

    @Override // com.huami.widget.share.platform.Sharer
    public void shareTo(com.huami.widget.share.ShareContent shareContent, ShareMissionListener shareMissionListener) {
        this.c = shareMissionListener;
        if (!TextUtils.isEmpty(shareContent.bitmapUrl)) {
            e(shareContent.bitmapUrl);
            return;
        }
        if (!TextUtils.isEmpty(shareContent.url)) {
            f(shareContent.url, shareContent.title);
        } else if (this.c != null) {
            ErrorMessage errorMessage = new ErrorMessage();
            errorMessage.message = "you should set Validity url or bitmapUrl to share";
            this.c.onFailed(8, errorMessage);
        }
    }
}
