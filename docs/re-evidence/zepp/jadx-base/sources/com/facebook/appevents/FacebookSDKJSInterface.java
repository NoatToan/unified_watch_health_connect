package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.huami.tools.analytics.DbUtils;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007R\u001c\u0010\f\u001a\u00020\u00028G@\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/FacebookSDKJSInterface;", "", "", "pixelId", "eventName", "jsonString", "", "sendEvent", "a", "Ljava/lang/String;", "getProtocol", "()Ljava/lang/String;", "protocol", "Landroid/content/Context;", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookSDKJSInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = FacebookSDKJSInterface.class.getSimpleName();
    private static final String d = "_fb_pixel_referral_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String protocol = "fbmq-0.1";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/FacebookSDKJSInterface$Companion;", "", "Lorg/json/JSONObject;", "jsonObject", "Landroid/os/Bundle;", "b", "", "jsonString", "a", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "PARAMETER_FBSDK_PIXEL_REFERRAL", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle a(String jsonString) {
            try {
                return b(new JSONObject(jsonString));
            } catch (JSONException unused) {
                return new Bundle();
            }
        }

        private final Bundle b(JSONObject jsonObject) throws JSONException {
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jsonObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Objects.requireNonNull(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                bundle.putString(str, jsonObject.getString(str));
            }
            return bundle;
        }

        @NotNull
        public final String getTAG() {
            return FacebookSDKJSInterface.access$getTAG$cp();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FacebookSDKJSInterface(@Nullable Context context) {
        this.context = context;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (CrashShieldHandler.isObjectCrashing(FacebookSDKJSInterface.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSDKJSInterface.class);
            return null;
        }
    }

    @JavascriptInterface
    @NotNull
    public final String getProtocol() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.protocol;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JavascriptInterface
    public final void sendEvent(@Nullable String pixelId, @Nullable String eventName, @Nullable String jsonString) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (pixelId == null) {
                Logger.INSTANCE.log(LoggingBehavior.DEVELOPER_ERRORS, c, "Can't bridge an event without a referral Pixel ID. Check your webview Pixel configuration");
                return;
            }
            InternalAppEventsLogger internalAppEventsLoggerCreateInstance$default = InternalAppEventsLogger.Companion.createInstance$default(InternalAppEventsLogger.INSTANCE, this.context, null, 2, null);
            Bundle bundleA = INSTANCE.a(jsonString);
            bundleA.putString(d, pixelId);
            internalAppEventsLoggerCreateInstance$default.logEvent(eventName, bundleA);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
