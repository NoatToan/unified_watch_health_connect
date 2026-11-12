package defpackage;

import android.content.Context;
import android.net.Uri;
import com.braintreepayments.api.BraintreeOptions;
import com.braintreepayments.api.PaymentMethod;
import com.huawei.hms.network.embedded.g4;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 N2\u00020\u0001:\u0001NB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0081\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001c\u001a\u00020\b¢\u0006\u0002\u0010\u001dJ\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0017HÆ\u0003J\t\u0010<\u001a\u00020\u0019HÆ\u0003J\t\u0010=\u001a\u00020\u001bHÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\nHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010C\u001a\u00020\u000fHÆ\u0003J\t\u0010D\u001a\u00020\u0011HÆ\u0003J\t\u0010E\u001a\u00020\u0013HÆ\u0003J\t\u0010F\u001a\u00020\u0015HÆ\u0003J\u008d\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0003\u0010\u001c\u001a\u00020\bHÆ\u0001J\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u001c\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006O"}, d2 = {"Lcom/braintreepayments/api/BraintreeClientParams;", "", PaymentMethod.OPTIONS_KEY, "Lcom/braintreepayments/api/BraintreeOptions;", "(Lcom/braintreepayments/api/BraintreeOptions;)V", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "sessionId", "", "authorizationLoader", "Lcom/braintreepayments/api/AuthorizationLoader;", "returnUrlScheme", "appLinkReturnUri", "Landroid/net/Uri;", "httpClient", "Lcom/braintreepayments/api/BraintreeHttpClient;", "graphQLClient", "Lcom/braintreepayments/api/BraintreeGraphQLClient;", "analyticsClient", "Lcom/braintreepayments/api/AnalyticsClient;", "browserSwitchClient", "Lcom/braintreepayments/api/BrowserSwitchClient;", "manifestValidator", "Lcom/braintreepayments/api/ManifestValidator;", "uuidHelper", "Lcom/braintreepayments/api/UUIDHelper;", "configurationLoader", "Lcom/braintreepayments/api/ConfigurationLoader;", "integrationType", "(Landroid/content/Context;Ljava/lang/String;Lcom/braintreepayments/api/AuthorizationLoader;Ljava/lang/String;Landroid/net/Uri;Lcom/braintreepayments/api/BraintreeHttpClient;Lcom/braintreepayments/api/BraintreeGraphQLClient;Lcom/braintreepayments/api/AnalyticsClient;Lcom/braintreepayments/api/BrowserSwitchClient;Lcom/braintreepayments/api/ManifestValidator;Lcom/braintreepayments/api/UUIDHelper;Lcom/braintreepayments/api/ConfigurationLoader;Ljava/lang/String;)V", "getAnalyticsClient", "()Lcom/braintreepayments/api/AnalyticsClient;", "getAppLinkReturnUri", "()Landroid/net/Uri;", "applicationContext", "getApplicationContext", "()Landroid/content/Context;", "getAuthorizationLoader", "()Lcom/braintreepayments/api/AuthorizationLoader;", "braintreeReturnUrlScheme", "getBraintreeReturnUrlScheme", "()Ljava/lang/String;", "getBrowserSwitchClient", "()Lcom/braintreepayments/api/BrowserSwitchClient;", "getConfigurationLoader", "()Lcom/braintreepayments/api/ConfigurationLoader;", "getContext", "getGraphQLClient", "()Lcom/braintreepayments/api/BraintreeGraphQLClient;", "getHttpClient", "()Lcom/braintreepayments/api/BraintreeHttpClient;", "getIntegrationType", "getManifestValidator", "()Lcom/braintreepayments/api/ManifestValidator;", "getReturnUrlScheme", "getSessionId", "getUuidHelper", "()Lcom/braintreepayments/api/UUIDHelper;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class sq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f48510b = new e(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rp f48511a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final se f48512c;
    private final Uri d;
    private final Context e;
    private final Context f;
    private final tn g;
    private final String h;
    private final sy i;
    private final ss j;
    private final String k;
    private final su l;
    private final uc m;
    private final String n;
    private final String o;
    private final va t;

    public sq(Context context, String str, se seVar, String str2, Uri uri, su suVar, ss ssVar, rp rpVar, sy syVar, uc ucVar, va vaVar, tn tnVar, String str3) {
        zcp.c(context, "");
        zcp.c(str, "");
        zcp.c(seVar, "");
        zcp.c(str2, "");
        zcp.c(suVar, "");
        zcp.c(ssVar, "");
        zcp.c(rpVar, "");
        zcp.c(syVar, "");
        zcp.c(ucVar, "");
        zcp.c(vaVar, "");
        zcp.c(tnVar, "");
        zcp.c(str3, "");
        this.f = context;
        this.o = str;
        this.f48512c = seVar;
        this.k = str2;
        this.d = uri;
        this.l = suVar;
        this.j = ssVar;
        this.f48511a = rpVar;
        this.i = syVar;
        this.m = ucVar;
        this.t = vaVar;
        this.g = tnVar;
        this.n = str3;
        Context applicationContext = context.getApplicationContext();
        zcp.b((Object) applicationContext, "");
        this.e = applicationContext;
        this.h = f48510b.a(context) + ".braintree.deeplinkhandler";
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getO() {
        return this.o;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final se getF48512c() {
        return this.f48512c;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Uri getD() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sq(Context context, String str, se seVar, String str2, Uri uri, su suVar, ss ssVar, rp rpVar, sy syVar, uc ucVar, va vaVar, tn tnVar, String str3, int i, zcm zcmVar) {
        su suVar2;
        int i2 = 1;
        tp tpVar = null;
        Object[] objArr = 0;
        if ((i & 32) != 0) {
            suVar2 = new su(tpVar, i2, objArr == true ? 1 : 0);
        } else {
            suVar2 = suVar;
        }
        this(context, str, seVar, str2, uri, suVar2, (i & 64) != 0 ? new ss(null, 1, null) : ssVar, (i & 128) != 0 ? new rp(context, null, null, null, null, 30, null) : rpVar, (i & 256) != 0 ? new sy() : syVar, (i & 512) != 0 ? new uc() : ucVar, (i & 1024) != 0 ? new va() : vaVar, (i & 2048) != 0 ? new tn(context, suVar2) : tnVar, str3);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final su getL() {
        return this.l;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ss getJ() {
        return this.j;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rp getF48511a() {
        return this.f48511a;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final sy getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final uc getM() {
        return this.m;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final tn getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getN() {
        return this.n;
    }

    public sq(BraintreeOptions braintreeOptions) {
        zcp.c(braintreeOptions, "");
        Context e2 = braintreeOptions.getE();
        se seVar = new se(braintreeOptions.getF4020c(), braintreeOptions.getF4018a());
        String f = braintreeOptions.getF();
        String strA = f == null ? f48510b.a() : f;
        String j = braintreeOptions.getJ();
        String strC = j == null ? f48510b.c(braintreeOptions.getE()) : j;
        Uri d = braintreeOptions.getD();
        String f4019b = braintreeOptions.getF4019b();
        this(e2, strA, seVar, strC, d, null, null, null, null, null, null, null, f4019b == null ? "custom" : f4019b, 4064, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getH() {
        return this.h;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/BraintreeClientParams$Companion;", "", "()V", "createDefaultReturnUrlScheme", "", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "createUniqueSessionId", "getAppPackageNameWithoutUnderscores", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class e {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String a() {
            return new va().c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String a(Context context) {
            String packageName = context.getApplicationContext().getPackageName();
            zcp.b((Object) packageName, "");
            return zes.a(packageName, "_", "", false, 4, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(Context context) {
            return a(context) + ".braintree";
        }

        public /* synthetic */ e(zcm zcmVar) {
            this();
        }
    }

    public String toString() {
        return "BraintreeClientParams(context=" + this.f + ", sessionId=" + this.o + ", authorizationLoader=" + this.f48512c + ", returnUrlScheme=" + this.k + ", appLinkReturnUri=" + this.d + ", httpClient=" + this.l + ", graphQLClient=" + this.j + ", analyticsClient=" + this.f48511a + ", browserSwitchClient=" + this.i + ", manifestValidator=" + this.m + ", uuidHelper=" + this.t + ", configurationLoader=" + this.g + ", integrationType=" + this.n + g4.l;
    }

    public int hashCode() {
        int iHashCode = this.f.hashCode();
        int iHashCode2 = this.o.hashCode();
        int iHashCode3 = this.f48512c.hashCode();
        int iHashCode4 = this.k.hashCode();
        Uri uri = this.d;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (uri == null ? 0 : uri.hashCode())) * 31) + this.l.hashCode()) * 31) + this.j.hashCode()) * 31) + this.f48511a.hashCode()) * 31) + this.i.hashCode()) * 31) + this.m.hashCode()) * 31) + this.t.hashCode()) * 31) + this.g.hashCode()) * 31) + this.n.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof sq)) {
            return false;
        }
        sq sqVar = (sq) other;
        return zcp.b(this.f, sqVar.f) && zcp.b((Object) this.o, (Object) sqVar.o) && zcp.b(this.f48512c, sqVar.f48512c) && zcp.b((Object) this.k, (Object) sqVar.k) && zcp.b(this.d, sqVar.d) && zcp.b(this.l, sqVar.l) && zcp.b(this.j, sqVar.j) && zcp.b(this.f48511a, sqVar.f48511a) && zcp.b(this.i, sqVar.i) && zcp.b(this.m, sqVar.m) && zcp.b(this.t, sqVar.t) && zcp.b(this.g, sqVar.g) && zcp.b((Object) this.n, (Object) sqVar.n);
    }
}
