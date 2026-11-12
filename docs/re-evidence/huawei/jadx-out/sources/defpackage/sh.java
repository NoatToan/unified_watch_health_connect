package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.alipay.sdk.m.s.e;
import com.braintreepayments.api.Authorization;
import com.braintreepayments.api.AuthorizationCallback;
import com.braintreepayments.api.BraintreeOptions;
import com.braintreepayments.api.ConfigurationCallback;
import com.braintreepayments.api.ConfigurationLoaderCallback;
import com.braintreepayments.api.CrashReporter;
import com.braintreepayments.api.HttpResponseCallback;
import com.braintreepayments.api.NetworkResponseCallback;
import com.braintreepayments.api.PaymentMethod;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0012Bq\b\u0001\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010%J\u001a\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u000208H\u0007J\u0010\u00109\u001a\u0002042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010:\u001a\u0004\u0018\u00010;2\u0006\u00105\u001a\u000206H\u0016J\u0012\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020?H\u0007J\u0012\u0010@\u001a\u0004\u0018\u00010;2\u0006\u00105\u001a\u000206H\u0007J\u0012\u0010A\u001a\u0004\u0018\u00010;2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010B\u001a\u0002042\u0006\u0010>\u001a\u00020CH\u0016J \u0010D\u001a\u0004\u0018\u00010E\"\u0004\b\u0000\u0010F2\u000e\u0010G\u001a\n\u0012\u0004\u0012\u0002HF\u0018\u00010HH\u0007J\b\u0010I\u001a\u00020\u000bH\u0007J\b\u0010J\u001a\u000204H\u0016J(\u0010K\u001a\u000201\"\u0004\b\u0000\u0010F2\b\u0010L\u001a\u0004\u0018\u00010\u000b2\u000e\u0010G\u001a\n\u0012\u0004\u0012\u0002HF\u0018\u00010HH\u0007J\u0006\u00100\u001a\u000201J\u0010\u00100\u001a\u0002042\u0006\u00100\u001a\u000201H\u0016J$\u0010M\u001a\u0004\u0018\u00010;2\u0006\u0010\b\u001a\u00020\t2\u0006\u00107\u001a\u0002082\b\u0010N\u001a\u0004\u0018\u00010OH\u0007J\u000f\u0010P\u001a\u0004\u0018\u000104H\u0007¢\u0006\u0002\u0010QJ\"\u0010R\u001a\u0002042\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010\n\u001a\u00020WH\u0002J\u001a\u0010R\u001a\u0002042\u0006\u0010X\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020YH\u0007J\u0018\u0010Z\u001a\u0002042\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020]H\u0002J\u0018\u0010^\u001a\u0002042\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020aH\u0007J\u001a\u0010b\u001a\u0002042\b\u0010c\u001a\u0004\u0018\u00010d2\u0006\u0010`\u001a\u00020aH\u0007J6\u0010e\u001a\u0002042\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u000b2\u0014\b\u0002\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0h2\u0006\u0010`\u001a\u00020aH\u0007J\u001c\u0010i\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u0010j\u001a\u0004\u0018\u00010kH\u0007R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0013\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0014\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0015\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/¨\u0006l"}, d2 = {"Lcom/braintreepayments/api/BraintreeClient;", "", e.n, "Lcom/braintreepayments/api/BraintreeClientParams;", "(Lcom/braintreepayments/api/BraintreeClientParams;)V", PaymentMethod.OPTIONS_KEY, "Lcom/braintreepayments/api/BraintreeOptions;", "(Lcom/braintreepayments/api/BraintreeOptions;)V", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "authorization", "", "returnUrlScheme", "appLinkReturnUri", "Landroid/net/Uri;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "clientTokenProvider", "Lcom/braintreepayments/api/ClientTokenProvider;", "(Landroid/content/Context;Lcom/braintreepayments/api/ClientTokenProvider;Ljava/lang/String;Landroid/net/Uri;)V", "applicationContext", "integrationType", "sessionId", "authorizationLoader", "Lcom/braintreepayments/api/AuthorizationLoader;", "analyticsClient", "Lcom/braintreepayments/api/AnalyticsClient;", "httpClient", "Lcom/braintreepayments/api/BraintreeHttpClient;", "graphQLClient", "Lcom/braintreepayments/api/BraintreeGraphQLClient;", "browserSwitchClient", "Lcom/braintreepayments/api/BrowserSwitchClient;", "configurationLoader", "Lcom/braintreepayments/api/ConfigurationLoader;", "manifestValidator", "Lcom/braintreepayments/api/ManifestValidator;", "braintreeDeepLinkReturnUrlScheme", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/braintreepayments/api/AuthorizationLoader;Lcom/braintreepayments/api/AnalyticsClient;Lcom/braintreepayments/api/BraintreeHttpClient;Lcom/braintreepayments/api/BraintreeGraphQLClient;Lcom/braintreepayments/api/BrowserSwitchClient;Lcom/braintreepayments/api/ConfigurationLoader;Lcom/braintreepayments/api/ManifestValidator;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "getAppLinkReturnUri", "()Landroid/net/Uri;", "getApplicationContext", "()Landroid/content/Context;", "crashReporter", "Lcom/braintreepayments/api/CrashReporter;", "deviceInspector", "Lcom/braintreepayments/api/DeviceInspector;", "getIntegrationType", "()Ljava/lang/String;", "launchesBrowserSwitchAsNewTask", "", "getSessionId", "assertCanPerformBrowserSwitch", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "requestCode", "", "clearActiveBrowserSwitchRequests", "deliverBrowserSwitchResult", "Lcom/braintreepayments/api/BrowserSwitchResult;", "deliverBrowserSwitchResultFromNewTask", "getAuthorization", ParamConstants.Param.CALLBACK, "Lcom/braintreepayments/api/AuthorizationCallback;", "getBrowserSwitchResult", "getBrowserSwitchResultFromNewTask", "getConfiguration", "Lcom/braintreepayments/api/ConfigurationCallback;", "getManifestActivityInfo", "Landroid/content/pm/ActivityInfo;", ExifInterface.GPS_DIRECTION_TRUE, "klass", "Ljava/lang/Class;", "getReturnUrlScheme", "invalidateClientToken", "isUrlSchemeDeclaredInAndroidManifest", "urlScheme", "parseBrowserSwitchResult", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "reportCrash", "()Lkotlin/Unit;", "sendAnalyticsEvent", "event", "Lcom/braintreepayments/api/AnalyticsEvent;", "configuration", "Lcom/braintreepayments/api/Configuration;", "Lcom/braintreepayments/api/Authorization;", "eventName", "Lcom/braintreepayments/api/AnalyticsEventParams;", "sendAnalyticsTimingEvent", "endpoint", "timing", "Lcom/braintreepayments/api/HttpResponseTiming;", "sendGET", "url", "responseCallback", "Lcom/braintreepayments/api/HttpResponseCallback;", "sendGraphQLPOST", "json", "Lorg/json/JSONObject;", "sendPOST", "data", "additionalHeaders", "", "startBrowserSwitch", "browserSwitchOptions", "Lcom/braintreepayments/api/BrowserSwitchOptions;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f48058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rp f48059c;
    private final se d;
    private final Uri e;
    private final ss f;
    private final CrashReporter g;
    private final sy h;
    private final to i;
    private final tn j;
    private final uc k;
    private final su l;
    private final String m;
    private final String n;
    private boolean o;
    private final String r;

    public sh(Context context, String str, String str2, se seVar, rp rpVar, su suVar, ss ssVar, sy syVar, tn tnVar, uc ucVar, String str3, String str4, Uri uri) {
        zcp.c(context, "");
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(seVar, "");
        zcp.c(rpVar, "");
        zcp.c(suVar, "");
        zcp.c(ssVar, "");
        zcp.c(syVar, "");
        zcp.c(tnVar, "");
        zcp.c(ucVar, "");
        zcp.c(str3, "");
        zcp.c(str4, "");
        this.f48058b = context;
        this.m = str;
        this.r = str2;
        this.d = seVar;
        this.f48059c = rpVar;
        this.l = suVar;
        this.f = ssVar;
        this.h = syVar;
        this.j = tnVar;
        this.k = ucVar;
        this.n = str3;
        this.f48057a = str4;
        this.e = uri;
        CrashReporter crashReporter = new CrashReporter(this);
        this.g = crashReporter;
        crashReporter.e();
        this.i = new to();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Uri getE() {
        return this.e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sh(sq sqVar) {
        this(sqVar.getE(), sqVar.getN(), sqVar.getO(), sqVar.getF48512c(), sqVar.getF48511a(), sqVar.getL(), sqVar.getJ(), sqVar.getI(), sqVar.getG(), sqVar.getM(), sqVar.getK(), sqVar.getH(), sqVar.getD());
        zcp.c(sqVar, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sh(BraintreeOptions braintreeOptions) {
        this(new sq(braintreeOptions));
        zcp.c(braintreeOptions, "");
    }

    public /* synthetic */ sh(Context context, String str, String str2, Uri uri, int i, zcm zcmVar) {
        this(context, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : uri);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sh(Context context, String str, String str2, Uri uri) {
        this(new BraintreeOptions(context, null, str2, uri, str, null, null, 98, null));
        zcp.c(context, "");
        zcp.c(str, "");
    }

    public void c(final ConfigurationCallback configurationCallback) {
        zcp.c(configurationCallback, "");
        a(new AuthorizationCallback() { // from class: sp
            @Override // com.braintreepayments.api.AuthorizationCallback
            public final void onAuthorizationResult(Authorization authorization, Exception exc) {
                sh.c(this.f48485b, configurationCallback, authorization, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final sh shVar, final ConfigurationCallback configurationCallback, Authorization authorization, Exception exc) {
        zcp.c(shVar, "");
        zcp.c(configurationCallback, "");
        if (authorization != null) {
            shVar.j.b(authorization, new ConfigurationLoaderCallback() { // from class: so
                @Override // com.braintreepayments.api.ConfigurationLoaderCallback
                public final void onResult(tf tfVar, Exception exc2, tx txVar) {
                    sh.e(configurationCallback, shVar, tfVar, exc2, txVar);
                }
            });
        } else {
            configurationCallback.onResult(null, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ConfigurationCallback configurationCallback, sh shVar, tf tfVar, Exception exc, tx txVar) {
        zcp.c(configurationCallback, "");
        zcp.c(shVar, "");
        if (tfVar != null) {
            configurationCallback.onResult(tfVar, null);
        } else {
            configurationCallback.onResult(null, exc);
        }
        if (txVar != null) {
            shVar.a("v1/configuration", txVar);
        }
    }

    public final void a(AuthorizationCallback authorizationCallback) {
        zcp.c(authorizationCallback, "");
        this.d.b(authorizationCallback);
    }

    public static /* synthetic */ void b(sh shVar, String str, rz rzVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAnalyticsEvent");
        }
        if ((i & 2) != 0) {
            rzVar = new rz();
        }
        shVar.e(str, rzVar);
    }

    public final void e(final String str, final rz rzVar) {
        zcp.c(str, "");
        zcp.c(rzVar, "");
        a(new AuthorizationCallback() { // from class: sg
            @Override // com.braintreepayments.api.AuthorizationCallback
            public final void onAuthorizationResult(Authorization authorization, Exception exc) {
                sh.a(this.f48017a, str, rzVar, authorization, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final sh shVar, final String str, final rz rzVar, final Authorization authorization, Exception exc) {
        zcp.c(shVar, "");
        zcp.c(str, "");
        zcp.c(rzVar, "");
        if (authorization != null) {
            shVar.c(new ConfigurationCallback() { // from class: sn
                @Override // com.braintreepayments.api.ConfigurationCallback
                public final void onResult(tf tfVar, Exception exc2) throws Throwable {
                    sh.c(this.f48401a, str, rzVar, authorization, tfVar, exc2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sh shVar, String str, rz rzVar, Authorization authorization, tf tfVar, Exception exc) throws Throwable {
        zcp.c(shVar, "");
        zcp.c(str, "");
        zcp.c(rzVar, "");
        shVar.c(new rr(str, rzVar.getF47875c(), rzVar.getF47873a(), shVar.i.e(shVar.f48058b), rzVar.getD(), rzVar.getH(), rzVar.getF47874b(), rzVar.getE(), 0L, 256, null), tfVar, authorization);
    }

    private final void c(rr rrVar, tf tfVar, Authorization authorization) throws Throwable {
        if (tfVar != null) {
            this.f48059c.a(tfVar, rrVar, this.r, this.m, authorization);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(sh shVar, String str, String str2, Map map, HttpResponseCallback httpResponseCallback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPOST");
        }
        if ((i & 4) != 0) {
            map = zae.e();
        }
        shVar.d(str, str2, (Map<String, String>) map, httpResponseCallback);
    }

    public final void d(final String str, final String str2, final Map<String, String> map, final HttpResponseCallback httpResponseCallback) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(map, "");
        zcp.c(httpResponseCallback, "");
        a(new AuthorizationCallback() { // from class: si
            @Override // com.braintreepayments.api.AuthorizationCallback
            public final void onAuthorizationResult(Authorization authorization, Exception exc) {
                sh.a(this.f48113a, httpResponseCallback, str, str2, map, authorization, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final sh shVar, final HttpResponseCallback httpResponseCallback, final String str, final String str2, final Map map, final Authorization authorization, Exception exc) {
        zcp.c(shVar, "");
        zcp.c(httpResponseCallback, "");
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(map, "");
        if (authorization != null) {
            shVar.c(new ConfigurationCallback() { // from class: sl
                @Override // com.braintreepayments.api.ConfigurationCallback
                public final void onResult(tf tfVar, Exception exc2) {
                    sh.b(this.e, str, str2, authorization, map, httpResponseCallback, tfVar, exc2);
                }
            });
        } else {
            httpResponseCallback.onResult(null, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final sh shVar, final String str, String str2, Authorization authorization, Map map, final HttpResponseCallback httpResponseCallback, tf tfVar, Exception exc) {
        zcp.c(shVar, "");
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(map, "");
        zcp.c(httpResponseCallback, "");
        if (tfVar != null) {
            shVar.l.e(str, str2, tfVar, authorization, map, new NetworkResponseCallback() { // from class: sj
                @Override // com.braintreepayments.api.NetworkResponseCallback
                public final void onResult(tv tvVar, Exception exc2) {
                    sh.b(this.d, str, httpResponseCallback, tvVar, exc2);
                }
            });
        } else {
            httpResponseCallback.onResult(null, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(sh shVar, String str, HttpResponseCallback httpResponseCallback, tv tvVar, Exception exc) {
        zcp.c(shVar, "");
        zcp.c(str, "");
        zcp.c(httpResponseCallback, "");
        if (tvVar == null) {
            if (exc != null) {
                httpResponseCallback.onResult(null, exc);
            }
        } else {
            try {
                shVar.a(str, tvVar.getD());
                httpResponseCallback.onResult(tvVar.getE(), null);
            } catch (JSONException e) {
                httpResponseCallback.onResult(null, e);
            }
        }
    }

    public final void b(FragmentActivity fragmentActivity, tb tbVar) throws sx {
        if (fragmentActivity == null || tbVar == null) {
            return;
        }
        this.h.d(fragmentActivity, tbVar);
    }

    public final td b(FragmentActivity fragmentActivity) {
        zcp.c(fragmentActivity, "");
        return this.h.a(fragmentActivity);
    }

    public td e(FragmentActivity fragmentActivity) {
        zcp.c(fragmentActivity, "");
        return this.h.b(fragmentActivity);
    }

    public final td d(Context context) {
        zcp.c(context, "");
        return this.h.d(context);
    }

    public td b(Context context) {
        zcp.c(context, "");
        return this.h.e(context);
    }

    public final String c() {
        if (this.o) {
            return this.f48057a;
        }
        return this.n;
    }

    public final void c(FragmentActivity fragmentActivity, int i) throws sx {
        Uri uri = Uri.parse("https://braintreepayments.com");
        this.h.a(fragmentActivity, new tb().c(uri).b(this.e).a(c()).c(i));
    }

    public final yzc d() {
        final Authorization f47973c = this.d.getF47973c();
        if (f47973c == null) {
            return null;
        }
        c(new ConfigurationCallback() { // from class: sm
            @Override // com.braintreepayments.api.ConfigurationCallback
            public final void onResult(tf tfVar, Exception exc) {
                sh.b(this.f48343b, f47973c, tfVar, exc);
            }
        });
        return yzc.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(sh shVar, Authorization authorization, tf tfVar, Exception exc) {
        zcp.c(shVar, "");
        zcp.c(authorization, "");
        shVar.f48059c.d(shVar.f48058b, tfVar, shVar.r, shVar.m, authorization);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getO() {
        return this.o;
    }

    private final void a(String str, tx txVar) {
        e("core:api-request-latency", new rz(null, null, false, Long.valueOf(txVar.getD()), Long.valueOf(txVar.getF49748b()), new zeu("/merchants/([A-Za-z0-9]+)/client_api").b(str, ""), 7, null));
    }

    public final void c(String str, String str2, HttpResponseCallback httpResponseCallback) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(httpResponseCallback, "");
        a(this, str, str2, (Map) null, httpResponseCallback, 4, (Object) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sh(Context context, String str, String str2) {
        this(context, str, str2, null, 8, null);
        zcp.c(context, "");
        zcp.c(str, "");
    }
}
