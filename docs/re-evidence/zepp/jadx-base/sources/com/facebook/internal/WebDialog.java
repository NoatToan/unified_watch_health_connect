package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.authorization.AuthorizationResponseParser;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.common.R;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginTargetApp;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.market.sdk.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 `2\u00020\u0001:\u0006a`\nbc\bB\u0019\b\u0014\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010*\u001a\u00020\u001d¢\u0006\u0004\bV\u0010WB!\b\u0012\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010*\u001a\u00020\u001d\u0012\u0006\u0010X\u001a\u00020\u0002¢\u0006\u0004\bV\u0010YB?\b\u0012\u0012\u0006\u0010U\u001a\u00020T\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010[\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010X\u001a\u00020\u0002\u0012\u0006\u0010]\u001a\u00020\\\u0012\b\u0010^\u001a\u0004\u0018\u00010+¢\u0006\u0004\bV\u0010_J(\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0003J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0014J\b\u0010\u0014\u001a\u00020\tH\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0004J\u0012\u0010!\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0017J\u0006\u0010\"\u001a\u00020\tJ\u0012\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0004J\u0012\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010%H\u0004J\b\u0010(\u001a\u00020\tH\u0016R\u0018\u0010*\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010)R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R$\u00101\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00108\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001028\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010H\u001a\b\u0018\u00010ER\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR$\u0010K\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010JR$\u0010P\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bO\u0010J\u001a\u0004\bP\u0010LR\u0018\u0010S\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006d"}, d2 = {"Lcom/facebook/internal/WebDialog;", "Landroid/app/Dialog;", "", Constants.JSON_SCREEN_SIZE, "", Constants.JSON_DENSITY, "noPaddingSize", "maxPaddingSize", "b", "", "a", "margin", "c", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "dismiss", "onStart", "onStop", "onDetachedFromWindow", "onAttachedToWindow", "Landroid/view/WindowManager$LayoutParams;", "params", "onWindowAttributesChanged", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "expectedRedirectUrl", "setExpectedRedirectUrl", "urlString", "parseResponseUri", "resize", "values", "sendSuccessToListener", "", "error", "sendErrorToListener", g.g, "Ljava/lang/String;", "url", "Lcom/facebook/internal/WebDialog$OnCompleteListener;", "Lcom/facebook/internal/WebDialog$OnCompleteListener;", "getOnCompleteListener", "()Lcom/facebook/internal/WebDialog$OnCompleteListener;", "setOnCompleteListener", "(Lcom/facebook/internal/WebDialog$OnCompleteListener;)V", "onCompleteListener", "Landroid/webkit/WebView;", "<set-?>", GoogleApiAvailabilityLight.a, "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "webView", "Landroid/app/ProgressDialog;", "e", "Landroid/app/ProgressDialog;", "spinner", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "crossImageView", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "contentFrameLayout", "Lcom/facebook/internal/WebDialog$b;", "h", "Lcom/facebook/internal/WebDialog$b;", "uploadTask", "i", "Z", "isListenerCalled", "()Z", z.j, "isDetached", hl.k, "isPageFinished", "l", "Landroid/view/WindowManager$LayoutParams;", "windowParams", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "theme", "(Landroid/content/Context;Ljava/lang/String;I)V", "action", "parameters", "Lcom/facebook/login/LoginTargetApp;", "targetApp", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/login/LoginTargetApp;Lcom/facebook/internal/WebDialog$OnCompleteListener;)V", "Companion", ShareStoryContent.Builder.k, "InitCallback", "OnCompleteListener", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class WebDialog extends Dialog {
    public static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
    private static final String m = "FacebookSDK.WebDialog";
    private static final String n = "touch";
    private static final String o = "^/(v\\d+\\.\\d+/)??dialog/.*";
    private static final int p = 4201;
    private static final int q = 480;
    private static final int r = 800;
    private static final int s = 800;
    private static final int t = 1280;
    private static final double u = 0.5d;
    private static final int v = -872415232;
    private static volatile int x;
    private static InitCallback y;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String expectedRedirectUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnCompleteListener onCompleteListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private WebView webView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ProgressDialog spinner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ImageView crossImageView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private FrameLayout contentFrameLayout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private b uploadTask;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isListenerCalled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isDetached;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isPageFinished;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private WindowManager.LayoutParams windowParams;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int w = R.style.com_facebook_activity_theme;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0005J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J>\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\b\u0010\u0012\u001a\u00020\nH\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u0018\u0010)\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u0018¨\u0006."}, d2 = {"Lcom/facebook/internal/WebDialog$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "initDefaultTheme", "", "action", "Landroid/os/Bundle;", "parameters", "", "theme", "Lcom/facebook/internal/WebDialog$OnCompleteListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/internal/WebDialog;", "newInstance", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "getWebDialogTheme", "setWebDialogTheme", "Lcom/facebook/internal/WebDialog$InitCallback;", "callback", "setInitCallback", "API_EC_DIALOG_CANCEL", LogUtil.I, "BACKGROUND_GRAY", "DEFAULT_THEME", "", "DISABLE_SSL_CHECK_FOR_TESTING", "Z", "DISPLAY_TOUCH", "Ljava/lang/String;", "LOG_TAG", "MAX_PADDING_SCREEN_HEIGHT", "MAX_PADDING_SCREEN_WIDTH", "", "MIN_SCALE_FACTOR", LogUtil.D, "NO_PADDING_SCREEN_HEIGHT", "NO_PADDING_SCREEN_WIDTH", "PLATFORM_DIALOG_PATH_REGEX", "initCallback", "Lcom/facebook/internal/WebDialog$InitCallback;", "webDialogTheme", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final int getWebDialogTheme() {
            Validate.sdkInitialized();
            return WebDialog.x;
        }

        @JvmStatic
        public final void initDefaultTheme(@Nullable Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) != null && WebDialog.x == 0) {
                    setWebDialogTheme(applicationInfo.metaData.getInt(FacebookSdk.WEB_DIALOG_THEME));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        @JvmStatic
        @NotNull
        public final WebDialog newInstance(@NotNull Context context, @Nullable String action, @Nullable Bundle parameters, int theme, @Nullable OnCompleteListener listener) {
            initDefaultTheme(context);
            return new WebDialog(context, action, parameters, theme, LoginTargetApp.FACEBOOK, listener, null);
        }

        @JvmStatic
        public final void setInitCallback(@Nullable InitCallback callback) {
            WebDialog.y = callback;
        }

        @JvmStatic
        public final void setWebDialogTheme(int theme) {
            if (theme == 0) {
                theme = WebDialog.w;
            }
            WebDialog.x = theme;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final WebDialog newInstance(@NotNull Context context, @Nullable String action, @Nullable Bundle parameters, int theme, @NotNull LoginTargetApp targetApp, @Nullable OnCompleteListener listener) {
            initDefaultTheme(context);
            return new WebDialog(context, action, parameters, theme, targetApp, listener, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/WebDialog$InitCallback;", "", "Landroid/webkit/WebView;", "webView", "", "onInit", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface InitCallback {
        void onInit(@Nullable WebView webView);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/facebook/internal/WebDialog$OnCompleteListener;", "", "Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "", "onComplete", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface OnCompleteListener {
        void onComplete(@Nullable Bundle values, @Nullable FacebookException error);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J \u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\"\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0019"}, d2 = {"com/facebook/internal/WebDialog$a", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", ViewHierarchyConstants.VIEW_KEY, "", "url", "", "shouldOverrideUrlLoading", "", "errorCode", "description", "failingUrl", "", "onReceivedError", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "onPageFinished", "<init>", "(Lcom/facebook/internal/WebDialog;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView view, @NotNull String url) {
            ProgressDialog progressDialog;
            super.onPageFinished(view, url);
            if (!WebDialog.this.isDetached && (progressDialog = WebDialog.this.spinner) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = WebDialog.this.contentFrameLayout;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webView = WebDialog.this.getWebView();
            if (webView != null) {
                webView.setVisibility(0);
            }
            ImageView imageView = WebDialog.this.crossImageView;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            WebDialog.this.isPageFinished = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NotNull WebView view, @NotNull String url, @Nullable Bitmap favicon) {
            ProgressDialog progressDialog;
            Utility.logd(WebDialog.m, "Webview loading URL: " + url);
            super.onPageStarted(view, url, favicon);
            if (WebDialog.this.isDetached || (progressDialog = WebDialog.this.spinner) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NotNull WebView view, int errorCode, @NotNull String description, @NotNull String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            WebDialog.this.sendErrorToListener(new FacebookDialogException(description, errorCode, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) {
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            WebDialog.this.sendErrorToListener(new FacebookDialogException(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
            int i;
            Utility.logd(WebDialog.m, "Redirect URL: " + url);
            Uri uri = Uri.parse(url);
            boolean z = uri.getPath() != null && Pattern.matches(WebDialog.o, uri.getPath());
            if (!m.startsWith$default(url, WebDialog.this.expectedRedirectUrl, false, 2, null)) {
                if (m.startsWith$default(url, ServerProtocol.DIALOG_CANCEL_URI, false, 2, null)) {
                    WebDialog.this.cancel();
                    return true;
                }
                if (z || StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "touch", false, 2, (Object) null)) {
                    return false;
                }
                try {
                    WebDialog.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            }
            Bundle responseUri = WebDialog.this.parseResponseUri(url);
            String string = responseUri.getString("error");
            if (string == null) {
                string = responseUri.getString("error_type");
            }
            String string2 = responseUri.getString("error_msg");
            if (string2 == null) {
                string2 = responseUri.getString("error_message");
            }
            if (string2 == null) {
                string2 = responseUri.getString("error_description");
            }
            String string3 = responseUri.getString("error_code");
            if (string3 == null || Utility.isNullOrEmpty(string3)) {
                i = -1;
            } else {
                try {
                    i = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                    i = -1;
                }
            }
            if (Utility.isNullOrEmpty(string) && Utility.isNullOrEmpty(string2) && i == -1) {
                WebDialog.this.sendSuccessToListener(responseUri);
            } else if ((string == null || !(Intrinsics.areEqual(string, AuthorizationResponseParser.ERROR_ACCESS_DENIED) || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) && i != WebDialog.p) {
                WebDialog.this.sendErrorToListener(new FacebookServiceException(new FacebookRequestError(i, string, string2), string2));
            } else {
                WebDialog.this.cancel();
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003\"\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\t2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0019"}, d2 = {"com/facebook/internal/WebDialog$b", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "", "p0", "c", "([Ljava/lang/Void;)[Ljava/lang/String;", "results", "", GoogleApiAvailabilityLight.a, "([Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "[Ljava/lang/Exception;", "exceptions", "b", "Ljava/lang/String;", "action", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "parameters", "<init>", "(Lcom/facebook/internal/WebDialog;Ljava/lang/String;Landroid/os/Bundle;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public final class b extends AsyncTask<Void, Void, String[]> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private Exception[] exceptions = new Exception[0];

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Bundle parameters;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "(Lcom/facebook/GraphResponse;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a implements GraphRequest.Callback {
            public final /* synthetic */ String[] b;
            public final /* synthetic */ int c;
            public final /* synthetic */ CountDownLatch d;

            public a(String[] strArr, int i, CountDownLatch countDownLatch) {
                this.b = strArr;
                this.c = i;
                this.d = countDownLatch;
            }

            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(@NotNull GraphResponse graphResponse) {
                try {
                    FacebookRequestError error = graphResponse.getError();
                    String str = "Error staging photo.";
                    if (error != null) {
                        String errorMessage = error.getErrorMessage();
                        if (errorMessage != null) {
                            str = errorMessage;
                        }
                        throw new FacebookGraphResponseException(graphResponse, str);
                    }
                    JSONObject graphObject = graphResponse.getGraphObject();
                    if (graphObject == null) {
                        throw new FacebookException("Error staging photo.");
                    }
                    String strOptString = graphObject.optString("uri");
                    if (strOptString == null) {
                        throw new FacebookException("Error staging photo.");
                    }
                    this.b[this.c] = strOptString;
                    this.d.countDown();
                } catch (Exception e) {
                    b.this.exceptions[this.c] = e;
                }
            }
        }

        public b(@NotNull String str, Bundle bundle) {
            this.action = str;
            this.parameters = bundle;
        }

        @Nullable
        public String[] c(@NotNull Void... p0) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                String[] stringArray = this.parameters.getStringArray("media");
                if (stringArray != null) {
                    String[] strArr = new String[stringArray.length];
                    this.exceptions = new Exception[stringArray.length];
                    CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    AccessToken currentAccessToken = AccessToken.INSTANCE.getCurrentAccessToken();
                    try {
                        int length = stringArray.length;
                        for (int i = 0; i < length; i++) {
                            if (isCancelled()) {
                                Iterator it2 = concurrentLinkedQueue.iterator();
                                while (it2.hasNext()) {
                                    ((GraphRequestAsyncTask) it2.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i]);
                            if (Utility.isWebUri(uri)) {
                                strArr[i] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                concurrentLinkedQueue.add(ShareInternalUtility.newUploadStagingResourceWithImageRequest(currentAccessToken, uri, new a(strArr, i, countDownLatch)).executeAsync());
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it3 = concurrentLinkedQueue.iterator();
                        while (it3.hasNext()) {
                            ((GraphRequestAsyncTask) it3.next()).cancel(true);
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public void d(@Nullable String[] results) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = WebDialog.this.spinner;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                for (Exception exc : this.exceptions) {
                    if (exc != null) {
                        WebDialog.this.sendErrorToListener(exc);
                        return;
                    }
                }
                if (results == null) {
                    WebDialog.this.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                List listAsList = ArraysKt___ArraysJvmKt.asList(results);
                if (listAsList.contains(null)) {
                    WebDialog.this.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                Utility.putJSONValueInBundle(this.parameters, "media", new JSONArray((Collection) listAsList));
                WebDialog.this.url = Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + ServerProtocol.DIALOG_PATH + this.action, this.parameters).toString();
                ImageView imageView = WebDialog.this.crossImageView;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                WebDialog.this.c((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return c(voidArr);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                d(strArr);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                WebDialog.this.cancel();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "it", "", "onCancel", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d implements DialogInterface.OnCancelListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            WebDialog.this.cancel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "v", "Landroid/view/MotionEvent;", "event", "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e implements View.OnTouchListener {
        public static final e a = new e();

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    public /* synthetic */ WebDialog(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i, loginTargetApp, onCompleteListener);
    }

    private final void a() {
        ImageView imageView = new ImageView(getContext());
        this.crossImageView = imageView;
        imageView.setOnClickListener(new c());
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.com_facebook_close);
        ImageView imageView2 = this.crossImageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.crossImageView;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
    }

    private final int b(int screenSize, float density, int noPaddingSize, int maxPaddingSize) {
        int i = (int) (screenSize / density);
        double d2 = 0.5d;
        if (i <= noPaddingSize) {
            d2 = 1.0d;
        } else if (i < maxPaddingSize) {
            d2 = 0.5d + ((((double) (maxPaddingSize - i)) / ((double) (maxPaddingSize - noPaddingSize))) * 0.5d);
        }
        return (int) (((double) screenSize) * d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void c(int margin) {
        WebSettings settings;
        WebSettings settings2;
        WebSettings settings3;
        LinearLayout linearLayout = new LinearLayout(getContext());
        final Context context = getContext();
        WebView webView = new WebView(context) { // from class: com.facebook.internal.WebDialog$setUpWebView$1
            @Override // android.webkit.WebView, android.view.View
            public void onWindowFocusChanged(boolean hasWindowFocus) {
                try {
                    super.onWindowFocusChanged(hasWindowFocus);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.webView = webView;
        InitCallback initCallback = y;
        if (initCallback != null) {
            initCallback.onInit(webView);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setVerticalScrollBarEnabled(false);
        }
        WebView webView3 = this.webView;
        if (webView3 != null) {
            webView3.setHorizontalScrollBarEnabled(false);
        }
        WebView webView4 = this.webView;
        if (webView4 != null) {
            webView4.setWebViewClient(new a());
        }
        WebView webView5 = this.webView;
        if (webView5 != null && (settings3 = webView5.getSettings()) != null) {
            settings3.setJavaScriptEnabled(true);
        }
        WebView webView6 = this.webView;
        if (webView6 != null) {
            String str = this.url;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            webView6.loadUrl(str);
        }
        WebView webView7 = this.webView;
        if (webView7 != null) {
            webView7.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView8 = this.webView;
        if (webView8 != null) {
            webView8.setVisibility(4);
        }
        WebView webView9 = this.webView;
        if (webView9 != null && (settings2 = webView9.getSettings()) != null) {
            settings2.setSavePassword(false);
        }
        WebView webView10 = this.webView;
        if (webView10 != null && (settings = webView10.getSettings()) != null) {
            settings.setSaveFormData(false);
        }
        WebView webView11 = this.webView;
        if (webView11 != null) {
            webView11.setFocusable(true);
        }
        WebView webView12 = this.webView;
        if (webView12 != null) {
            webView12.setFocusableInTouchMode(true);
        }
        WebView webView13 = this.webView;
        if (webView13 != null) {
            webView13.setOnTouchListener(e.a);
        }
        linearLayout.setPadding(margin, margin, margin, margin);
        linearLayout.addView(this.webView);
        linearLayout.setBackgroundColor(v);
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @JvmStatic
    public static final int getWebDialogTheme() {
        return INSTANCE.getWebDialogTheme();
    }

    @JvmStatic
    public static final void initDefaultTheme(@Nullable Context context) {
        INSTANCE.initDefaultTheme(context);
    }

    @JvmStatic
    @NotNull
    public static final WebDialog newInstance(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i, @Nullable OnCompleteListener onCompleteListener) {
        return INSTANCE.newInstance(context, str, bundle, i, onCompleteListener);
    }

    @JvmStatic
    @NotNull
    public static final WebDialog newInstance(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i, @NotNull LoginTargetApp loginTargetApp, @Nullable OnCompleteListener onCompleteListener) {
        return INSTANCE.newInstance(context, str, bundle, i, loginTargetApp, onCompleteListener);
    }

    @JvmStatic
    public static final void setInitCallback(@Nullable InitCallback initCallback) {
        INSTANCE.setInitCallback(initCallback);
    }

    @JvmStatic
    public static final void setWebDialogTheme(int i) {
        INSTANCE.setWebDialogTheme(i);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        sendErrorToListener(new FacebookOperationCanceledException());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.isDetached && (progressDialog = this.spinner) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Nullable
    public final OnCompleteListener getOnCompleteListener() {
        return this.onCompleteListener;
    }

    @Nullable
    public final WebView getWebView() {
        return this.webView;
    }

    /* JADX INFO: renamed from: isListenerCalled, reason: from getter */
    public final boolean getIsListenerCalled() {
        return this.isListenerCalled;
    }

    /* JADX INFO: renamed from: isPageFinished, reason: from getter */
    public final boolean getIsPageFinished() {
        return this.isPageFinished;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.isDetached = false;
        if (Utility.mustFixWindowParamsForAutofill(getContext()) && (layoutParams = this.windowParams) != null) {
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Set token on onAttachedToWindow(): ");
                WindowManager.LayoutParams layoutParams2 = this.windowParams;
                sb.append(layoutParams2 != null ? layoutParams2.token : null);
                Utility.logd(m, sb.toString());
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.spinner = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.spinner;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.spinner;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.spinner;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new d());
        }
        requestWindowFeature(1);
        this.contentFrameLayout = new FrameLayout(getContext());
        resize();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        a();
        if (this.url != null) {
            ImageView imageView = this.crossImageView;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            c((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(this.crossImageView, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.contentFrameLayout;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.isDetached = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        if (keyCode == 4) {
            WebView webView = this.webView;
            if (webView != null && webView != null && webView.canGoBack()) {
                WebView webView2 = this.webView;
                if (webView2 != null) {
                    webView2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b bVar = this.uploadTask;
        if (bVar != null) {
            if ((bVar != null ? bVar.getStatus() : null) == AsyncTask.Status.PENDING) {
                b bVar2 = this.uploadTask;
                if (bVar2 != null) {
                    bVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.spinner;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        resize();
    }

    @Override // android.app.Dialog
    public void onStop() {
        b bVar = this.uploadTask;
        if (bVar != null) {
            bVar.cancel(true);
            ProgressDialog progressDialog = this.spinner;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(@NotNull WindowManager.LayoutParams params) {
        if (params.token == null) {
            this.windowParams = params;
        }
        super.onWindowAttributesChanged(params);
    }

    @VisibleForTesting(otherwise = 4)
    @NotNull
    public Bundle parseResponseUri(@Nullable String urlString) {
        Uri uri = Uri.parse(urlString);
        Bundle urlQueryString = Utility.parseUrlQueryString(uri.getQuery());
        urlQueryString.putAll(Utility.parseUrlQueryString(uri.getFragment()));
        return urlQueryString;
    }

    public final void resize() {
        Object systemService = getContext().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int iMin = Math.min(b(i3, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(b(i, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    public final void sendErrorToListener(@Nullable Throwable error) {
        if (this.onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        this.isListenerCalled = true;
        FacebookException facebookException = error instanceof FacebookException ? (FacebookException) error : new FacebookException(error);
        OnCompleteListener onCompleteListener = this.onCompleteListener;
        if (onCompleteListener != null) {
            onCompleteListener.onComplete(null, facebookException);
        }
        dismiss();
    }

    public final void sendSuccessToListener(@Nullable Bundle values) {
        OnCompleteListener onCompleteListener = this.onCompleteListener;
        if (onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        this.isListenerCalled = true;
        if (onCompleteListener != null) {
            onCompleteListener.onComplete(values, null);
        }
        dismiss();
    }

    public final void setExpectedRedirectUrl(@NotNull String expectedRedirectUrl) {
        this.expectedRedirectUrl = expectedRedirectUrl;
    }

    public final void setOnCompleteListener(@Nullable OnCompleteListener onCompleteListener) {
        this.onCompleteListener = onCompleteListener;
    }

    public WebDialog(@NotNull Context context, @NotNull String str) {
        this(context, str, INSTANCE.getWebDialogTheme());
    }

    private WebDialog(Context context, String str, int i) {
        super(context, i == 0 ? INSTANCE.getWebDialogTheme() : i);
        this.expectedRedirectUrl = ServerProtocol.DIALOG_REDIRECT_URI;
        this.url = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b,\u0010-B-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b,\u0010.J$\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/facebook/internal/WebDialog$Builder;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "action", "Landroid/os/Bundle;", "parameters", "", "a", "", "theme", "setTheme", "Lcom/facebook/internal/WebDialog$OnCompleteListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCompleteListener", "Lcom/facebook/internal/WebDialog;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<set-?>", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getApplicationId", "()Ljava/lang/String;", "applicationId", "c", GoogleApiAvailabilityLight.a, LogUtil.I, "getTheme", "()I", "e", "Lcom/facebook/internal/WebDialog$OnCompleteListener;", "getListener", "()Lcom/facebook/internal/WebDialog$OnCompleteListener;", "f", "Landroid/os/Bundle;", "getParameters", "()Landroid/os/Bundle;", "Lcom/facebook/AccessToken;", "g", "Lcom/facebook/AccessToken;", "accessToken", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String applicationId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private String action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int theme;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private OnCompleteListener listener;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private Bundle parameters;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private AccessToken accessToken;

        public Builder(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
            AccessToken.Companion companion = AccessToken.INSTANCE;
            this.accessToken = companion.getCurrentAccessToken();
            if (!companion.isCurrentAccessTokenActive()) {
                String metadataApplicationId = Utility.getMetadataApplicationId(context);
                if (metadataApplicationId == null) {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.applicationId = metadataApplicationId;
            }
            a(context, str, bundle);
        }

        private final void a(Context context, String action, Bundle parameters) {
            this.context = context;
            this.action = action;
            if (parameters != null) {
                this.parameters = parameters;
            } else {
                this.parameters = new Bundle();
            }
        }

        @Nullable
        public WebDialog build() {
            AccessToken accessToken = this.accessToken;
            if (accessToken != null) {
                Bundle bundle = this.parameters;
                if (bundle != null) {
                    bundle.putString("app_id", accessToken != null ? accessToken.getApplicationId() : null);
                }
                Bundle bundle2 = this.parameters;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.accessToken;
                    bundle2.putString("access_token", accessToken2 != null ? accessToken2.getToken() : null);
                }
            } else {
                Bundle bundle3 = this.parameters;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.applicationId);
                }
            }
            Companion companion = WebDialog.INSTANCE;
            Context context = this.context;
            if (context != null) {
                return companion.newInstance(context, this.action, this.parameters, this.theme, this.listener);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        @Nullable
        public final String getApplicationId() {
            return this.applicationId;
        }

        @Nullable
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        public final OnCompleteListener getListener() {
            return this.listener;
        }

        @Nullable
        public final Bundle getParameters() {
            return this.parameters;
        }

        public final int getTheme() {
            return this.theme;
        }

        @NotNull
        public final Builder setOnCompleteListener(@Nullable OnCompleteListener listener) {
            this.listener = listener;
            return this;
        }

        @NotNull
        public final Builder setTheme(int theme) {
            this.theme = theme;
            return this;
        }

        public Builder(@NotNull Context context, @Nullable String str, @NotNull String str2, @Nullable Bundle bundle) {
            this.applicationId = Validate.notNullOrEmpty(str == null ? Utility.getMetadataApplicationId(context) : str, "applicationId");
            a(context, str2, bundle);
        }
    }

    private WebDialog(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener) {
        Uri uriBuildUri;
        super(context, i == 0 ? INSTANCE.getWebDialogTheme() : i);
        String str2 = ServerProtocol.DIALOG_REDIRECT_URI;
        this.expectedRedirectUrl = ServerProtocol.DIALOG_REDIRECT_URI;
        bundle = bundle == null ? new Bundle() : bundle;
        str2 = Utility.isChromeOS(context) ? ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : str2;
        this.expectedRedirectUrl = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString(ServerProtocol.DIALOG_PARAM_DISPLAY, "touch");
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{FacebookSdk.getSdkVersion()}, 1)));
        this.onCompleteListener = onCompleteListener;
        if (Intrinsics.areEqual(str, "share") && bundle.containsKey("media")) {
            this.uploadTask = new b(str, bundle);
            return;
        }
        if (WhenMappings.$EnumSwitchMapping$0[loginTargetApp.ordinal()] != 1) {
            uriBuildUri = Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + ServerProtocol.DIALOG_PATH + str, bundle);
        } else {
            uriBuildUri = Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), ServerProtocol.INSTAGRAM_OAUTH_PATH, bundle);
        }
        this.url = uriBuildUri.toString();
    }
}
