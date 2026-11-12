package com.garmin.feature.garminpay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import c22.b0;
import c83.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l;
import com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationActivity;
import com.garmin.feature.garminpay.providers.gpay.ecom.EcomMainActivity;
import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import com.garmin.feature.garminpay.ui.dev.devices.DevDevicesActivity;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import com.google.common.net.HttpHeaders;
import gt2.c;
import hq2.o;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jn2.u;
import jr2.f;
import kj0.d;
import l13.a;
import ln2.e;
import ms2.i;
import o13.t;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.lang3.BooleanUtils;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.k0;
import p13.y;
import ps2.n;
import ps2.w;
import ps2.x;
import q03.q;
import q03.r;
import qj.m;
import tn2.e0;
import wr.g;
import wr2.p;
import z03.h;
import zn2.f1;
import zn2.j;
import zn2.u0;
import zn2.v0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/garmin/feature/garminpay/GarminPayInitializer;", "Lkj0/d;", "<init>", "()V", "Lq03/b;", "initServiceProviderFactorySingletons", "()Lq03/b;", "notifyProviderOnFeatureEnter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "shouldSendEntryIntentBroadcast", "shouldGetUserStatistics", "Lq03/r;", "Landroid/content/Intent;", "initUserWallet", "(Landroid/content/Context;ZZ)Lq03/r;", "", "checkIfUserHasFitPayAccount", "(Z)V", "", "getUserPrimaryKey", "()Ljava/lang/Long;", "disposeDisposal", "ctx", "handleUserSignedOut", "(Landroid/content/Context;)Lq03/b;", "initialize", "(Landroid/content/Context;ZZ)V", "signOut", "(Landroid/content/Context;)V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "Ls03/b;", "disposable", "Ls03/b;", "isFeatureInitialized", "Z", "userPrimaryKey", "J", "Companion", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GarminPayInitializer implements d {
    public static final String HAS_FITPAY_ACCOUNT = "HAS_FITPAY_ACCOUNT";
    private static final long INIT_TIMEOUT = 30;
    private static final long MAX_WAIT_FOR_WALLET = 10000;
    private s03.b disposable;
    private boolean isFeatureInitialized;
    private final Logger logger;
    private long userPrimaryKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50944a;

        static {
            int[] iArr = new int[is2.b.values().length];
            try {
                iArr[is2.b.FITPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[is2.b.UNION_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[is2.b.NXP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[is2.b.PRELOAD_EASYCARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[is2.b.PRELOAD_IPASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[is2.b.FELICA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[is2.b.RABBIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f50944a = iArr;
        }
    }

    public GarminPayInitializer() {
        boolean z14;
        int i14 = c.f79010a;
        Logger loggerH = gt2.b.f79005a.h("PAY#Initializer");
        this.logger = loggerH;
        loggerH.debug("initialize: initializing PayDeviceFactory... ");
        u uVar = u.f99680a;
        try {
            loggerH.debug("Initializing Singletons and ServiceProvider Factories first time...");
            initServiceProviderFactorySingletons().k(a.f108327b).e();
            loggerH.debug("Singletons and ServiceProvider Factories initialization complete...");
            z14 = true;
        } catch (Exception e4) {
            this.logger.error("Singletons and ServiceProvider Factories initialization failed...", (Throwable) e4);
            z14 = false;
        }
        this.isFeatureInitialized = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkIfUserHasFitPayAccount(boolean shouldGetUserStatistics) {
        this.logger.debug("Checking if user has fit pay account...");
        p.f186870a.getClass();
        String strC = p.c("dynamic_feature_app", HAS_FITPAY_ACCOUNT);
        if (strC == null || strC.length() == 0 || shouldGetUserStatistics) {
            this.logger.debug("getting user statistics...");
            u0.f205864a.getClass();
            f fVar = new f(4);
            int i14 = w03.b.f181178a;
            p.f("dynamic_feature_app", HAS_FITPAY_ACCOUNT, String.valueOf(((a0) new e13.b(fVar).j(a.f108327b).c()).f25745a.code() == 200));
        }
    }

    private final void disposeDisposal() {
        s03.b bVar = this.disposable;
        if (bVar == null || bVar.b()) {
            return;
        }
        bVar.dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Long getUserPrimaryKey() {
        String strString;
        this.logger.debug("getting user primary key...");
        kj0.b.f104940a.getClass();
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk() != -1) {
            return Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
        }
        u0.f205864a.getClass();
        f fVar = new f(5);
        int i14 = w03.b.f181178a;
        a0 a0Var = (a0) new e13.b(fVar).j(a.f108327b).c();
        if (a0Var.f25745a.isSuccessful()) {
            ResponseBody responseBody = (ResponseBody) a0Var.f25746b;
            if (responseBody == null || (strString = responseBody.string()) == null) {
                return null;
            }
            return Long.valueOf(new JSONObject(strString).getLong("profileId"));
        }
        this.logger.error("getUserPrimaryKey: failed to get user primary key, response code: " + a0Var.f25745a.code());
        return null;
    }

    private final q03.b handleUserSignedOut(Context ctx) {
        this.logger.debug("handleUserSignedOut");
        hc0.c cVar = new hc0.c(1, ctx, this);
        int i14 = w03.b.f181178a;
        return new h(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleUserSignedOut$lambda$0(Context context, GarminPayInitializer garminPayInitializer) {
        w.f140538a.getClass();
        w.l();
        e.f113687a.getClass();
        try {
            try {
                OkHttpClient okHttpClient = e.f113690d;
                if (okHttpClient != null) {
                    okHttpClient.dispatcher().executorService().shutdown();
                    okHttpClient.connectionPool().evictAll();
                    Cache cache = okHttpClient.cache();
                    if (cache != null) {
                        cache.close();
                    }
                }
                OkHttpClient okHttpClient2 = e.f113689c;
                if (okHttpClient2 != null) {
                    okHttpClient2.dispatcher().executorService().shutdown();
                    okHttpClient2.connectionPool().evictAll();
                    Cache cache2 = okHttpClient2.cache();
                    if (cache2 != null) {
                        cache2.close();
                    }
                }
            } catch (Throwable th3) {
                e.f113690d = null;
                e.f113689c = null;
                throw th3;
            }
        } catch (IOException e4) {
            e.f113693g.error("shutdown", (Throwable) e4);
        }
        e.f113690d = null;
        e.f113689c = null;
        try {
            ls2.b.f114790a.getClass();
            context.getClass();
            SharedPreferences sharedPreferences = context.getSharedPreferences("push_notif_mgr", 0);
            sharedPreferences.getClass();
            sharedPreferences.edit().clear().commit();
        } catch (Exception e14) {
            garminPayInitializer.logger.error("handleUserSignedOut: error while clearing shared preferences :", (Throwable) e14);
        }
        try {
            zr2.a aVar = zr2.a.f206778a;
            aVar.getClass();
            oi2.a.f132270a.getClass();
            oi2.a.C2513a.c(aVar);
        } catch (Exception e15) {
            garminPayInitializer.logger.error("handleUserSignedOut: ", (Throwable) e15);
        }
        try {
            p.f186870a.getClass();
            p.d("general_app");
            p.d("felicaPrefCache");
            p.d("snowballPrefCache");
        } catch (Exception e16) {
            garminPayInitializer.logger.error("handleUserSignedOut: ", (Throwable) e16);
        }
        try {
            com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(context);
            bVarB.getClass();
            char[] cArr = m.f144982a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
            bVarB.f28453a.f185374f.a().clear();
            kj0.c.f104941a.getClass();
            kj0.c.f104945e.set(kj0.e.NOT_STARTED);
        } catch (IllegalStateException e17) {
            garminPayInitializer.logger.error("handleUserSignedOut: ", (Throwable) e17);
        }
    }

    private final q03.b initServiceProviderFactorySingletons() {
        hn2.e eVar = new hn2.e(this, 0);
        int i14 = w03.b.f181178a;
        return new h(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initServiceProviderFactorySingletons$lambda$0(GarminPayInitializer garminPayInitializer) {
        ms2.h hVar;
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        GarminPayCoreDatabase.b.a(contextC);
        for (is2.b bVar2 : is2.b.values()) {
            switch (b.f50944a[bVar2.ordinal()]) {
                case 1:
                    hVar = j.f205593a;
                    break;
                case 2:
                    hVar = sq2.a.f160536a;
                    break;
                case 3:
                    hVar = gq2.b.f78512a;
                    break;
                case 4:
                    hVar = hq2.h.f85249a;
                    break;
                case 5:
                    hVar = o.f85264a;
                    break;
                case 6:
                    hVar = e0.f165549a;
                    break;
                case 7:
                    hVar = oq2.e.f133318a;
                    break;
                default:
                    lc.u0.r();
                    return;
            }
            garminPayInitializer.logger.debug("registering '" + hVar + "'...");
            i.f120498a.getClass();
            hVar.getClass();
            i.f120499b.put(hVar.a(), hVar);
        }
        zr2.a aVar = zr2.a.f206778a;
        aVar.getClass();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(aVar);
    }

    private final r<Intent> initUserWallet(Context context, boolean shouldSendEntryIntentBroadcast, boolean shouldGetUserStatistics) {
        as2.c cVar = new as2.c(this, context, shouldGetUserStatistics, shouldSendEntryIntentBroadcast);
        int i14 = w03.b.f181178a;
        return new e13.m(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:73:0x028e  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10, types: [ln2.c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [ln2.c] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    public static final Intent initUserWallet$lambda$0(GarminPayInitializer garminPayInitializer, Context context, boolean z14, boolean z15) {
        kj0.a aVar;
        boolean z16;
        boolean z17;
        ?? r14;
        boolean z18;
        long j8;
        zi2.a aVar2;
        jn2.m mVar;
        boolean z19;
        boolean z24;
        garminPayInitializer.logger.debug("configuring 'GarminPayFeatureNetworkServiceFactory'...");
        e eVar = e.f113687a;
        eVar.getClass();
        Logger logger = e.f113693g;
        kj0.b.f104940a.getClass();
        e.f113688b = kj0.b.a();
        try {
            final k0 k0Var = k0.f134949a;
            k0Var.getClass();
            e.f113690d = e.d(eVar, new Interceptor() { // from class: ln2.c
                /* JADX WARN: Code duplicated, block: B:21:0x0054  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0054 -> B:22:0x0055). Please report as a decompilation issue!!! */
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    String keyId;
                    boolean zC;
                    String strB;
                    Map map = k0Var;
                    e eVar2 = e.f113687a;
                    chain.getClass();
                    synchronized (f1.f205508a) {
                        try {
                            jo2.b bVar = jo2.b.KEY_API;
                            jo2.a aVarC = f1.c(bVar);
                            if (aVarC == null || s.g(aVarC.d(), Boolean.TRUE)) {
                                f1.f205511d.debug("getFiPayApiECCKeyId: key is expired, refreshing it");
                                jo2.a aVar3 = (jo2.a) f1.f().j(l13.a.f108327b).c();
                                if (aVar3 != null) {
                                    keyId = aVar3.getKeyId();
                                } else {
                                    keyId = null;
                                }
                            } else {
                                jo2.a aVarC2 = f1.c(bVar);
                                if (aVarC2 != null) {
                                    keyId = aVarC2.getKeyId();
                                } else {
                                    keyId = null;
                                }
                            }
                        } catch (Exception e4) {
                            f1.f205511d.error("error while requesting ECC key pair", (Throwable) e4);
                        }
                    }
                    aq2.j.f12491a.getClass();
                    p pVar = p.f186870a;
                    pVar.getClass();
                    SharedPreferences sharedPreferencesA = p.a("dynamic_feature_app");
                    boolean z25 = false;
                    int i14 = sharedPreferencesA != null ? sharedPreferencesA.getInt("SHOULD_USE_OAUTH2_TOKEN", 0) : 0;
                    if (i14 != 0) {
                        zC = i14 != 1 && i14 == 2;
                    } else {
                        zf.b.r();
                        zC = gh2.i.f77458c.a().f77477b.c("garminpay_fitpay_di_oauth2_enabled");
                    }
                    if (zC) {
                        e.f113693g.debug("createFitPayHttpClient: using OAuth2 token");
                        strB = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).g();
                    } else {
                        e.f113693g.debug("createFitPayHttpClient: using access token");
                        f1.f205508a.getClass();
                        strB = f1.b();
                    }
                    String language = Locale.getDefault().getLanguage();
                    String upperCase = b0.b(null).toUpperCase(Locale.ROOT);
                    String strC = zl.a.c(upperCase, language, "-", upperCase);
                    Request.Builder builderNewBuilder = chain.request().newBuilder();
                    if (strB != null) {
                        builderNewBuilder.header(HttpHeaders.AUTHORIZATION, "Bearer ".concat(strB));
                    }
                    String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.maintenance_mode);
                    string.getClass();
                    pVar.getClass();
                    if (p.b("general_app", string, false)) {
                        builderNewBuilder.header("maintenance-mode", BooleanUtils.TRUE);
                    }
                    if (keyId != null) {
                        builderNewBuilder.header("fp-key-id", keyId);
                    }
                    if (map.isEmpty()) {
                        builderNewBuilder.header(HttpHeaders.ACCEPT, "text/plain, application/json, application/prs.hal-forms+json");
                        builderNewBuilder.header(HttpHeaders.CONTENT_TYPE, "application/json");
                        builderNewBuilder.header(HttpHeaders.CACHE_CONTROL, "no-transform, no-cache");
                    } else {
                        for (Map.Entry entry : map.entrySet()) {
                            builderNewBuilder.header((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    aq2.j.f12491a.getClass();
                    p.f186870a.getClass();
                    if (p.b("dynamic_feature_app", "TEST_IN_PRODUCTION", false)) {
                        builderNewBuilder.header("x-preview", BooleanUtils.TRUE);
                    }
                    builderNewBuilder.header(HttpHeaders.ACCEPT_LANGUAGE, strC);
                    builderNewBuilder.header("X-FitPay-SDK", "Android-" + ((String) aq2.j.f12493c.getValue()));
                    Response responseProceed = chain.proceed(builderNewBuilder.build());
                    if ((responseProceed.code() == 503 || responseProceed.code() == 500) && s.g(responseProceed.headers().get("maintenance-mode"), BooleanUtils.TRUE)) {
                        z25 = true;
                    }
                    aq2.b.f12463a.getClass();
                    aq2.b.f12464b = z25;
                    return responseProceed;
                }
            }, 6);
            final ?? r15 = e.f113692f;
            e.f113691e = e.d(eVar, new Interceptor() { // from class: ln2.c
                /* JADX WARN: Code duplicated, block: B:21:0x0054  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0054 -> B:22:0x0055). Please report as a decompilation issue!!! */
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    String keyId;
                    boolean zC;
                    String strB;
                    Map map = r15;
                    e eVar2 = e.f113687a;
                    chain.getClass();
                    synchronized (f1.f205508a) {
                        try {
                            jo2.b bVar = jo2.b.KEY_API;
                            jo2.a aVarC = f1.c(bVar);
                            if (aVarC == null || s.g(aVarC.d(), Boolean.TRUE)) {
                                f1.f205511d.debug("getFiPayApiECCKeyId: key is expired, refreshing it");
                                jo2.a aVar3 = (jo2.a) f1.f().j(l13.a.f108327b).c();
                                if (aVar3 != null) {
                                    keyId = aVar3.getKeyId();
                                } else {
                                    keyId = null;
                                }
                            } else {
                                jo2.a aVarC2 = f1.c(bVar);
                                if (aVarC2 != null) {
                                    keyId = aVarC2.getKeyId();
                                } else {
                                    keyId = null;
                                }
                            }
                        } catch (Exception e4) {
                            f1.f205511d.error("error while requesting ECC key pair", (Throwable) e4);
                        }
                    }
                    aq2.j.f12491a.getClass();
                    p pVar = p.f186870a;
                    pVar.getClass();
                    SharedPreferences sharedPreferencesA = p.a("dynamic_feature_app");
                    boolean z25 = false;
                    int i14 = sharedPreferencesA != null ? sharedPreferencesA.getInt("SHOULD_USE_OAUTH2_TOKEN", 0) : 0;
                    if (i14 != 0) {
                        zC = i14 != 1 && i14 == 2;
                    } else {
                        zf.b.r();
                        zC = gh2.i.f77458c.a().f77477b.c("garminpay_fitpay_di_oauth2_enabled");
                    }
                    if (zC) {
                        e.f113693g.debug("createFitPayHttpClient: using OAuth2 token");
                        strB = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).g();
                    } else {
                        e.f113693g.debug("createFitPayHttpClient: using access token");
                        f1.f205508a.getClass();
                        strB = f1.b();
                    }
                    String language = Locale.getDefault().getLanguage();
                    String upperCase = b0.b(null).toUpperCase(Locale.ROOT);
                    String strC = zl.a.c(upperCase, language, "-", upperCase);
                    Request.Builder builderNewBuilder = chain.request().newBuilder();
                    if (strB != null) {
                        builderNewBuilder.header(HttpHeaders.AUTHORIZATION, "Bearer ".concat(strB));
                    }
                    String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.maintenance_mode);
                    string.getClass();
                    pVar.getClass();
                    if (p.b("general_app", string, false)) {
                        builderNewBuilder.header("maintenance-mode", BooleanUtils.TRUE);
                    }
                    if (keyId != null) {
                        builderNewBuilder.header("fp-key-id", keyId);
                    }
                    if (map.isEmpty()) {
                        builderNewBuilder.header(HttpHeaders.ACCEPT, "text/plain, application/json, application/prs.hal-forms+json");
                        builderNewBuilder.header(HttpHeaders.CONTENT_TYPE, "application/json");
                        builderNewBuilder.header(HttpHeaders.CACHE_CONTROL, "no-transform, no-cache");
                    } else {
                        for (Map.Entry entry : map.entrySet()) {
                            builderNewBuilder.header((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    aq2.j.f12491a.getClass();
                    p.f186870a.getClass();
                    if (p.b("dynamic_feature_app", "TEST_IN_PRODUCTION", false)) {
                        builderNewBuilder.header("x-preview", BooleanUtils.TRUE);
                    }
                    builderNewBuilder.header(HttpHeaders.ACCEPT_LANGUAGE, strC);
                    builderNewBuilder.header("X-FitPay-SDK", "Android-" + ((String) aq2.j.f12493c.getValue()));
                    Response responseProceed = chain.proceed(builderNewBuilder.build());
                    if ((responseProceed.code() == 503 || responseProceed.code() == 500) && s.g(responseProceed.headers().get("maintenance-mode"), BooleanUtils.TRUE)) {
                        z25 = true;
                    }
                    aq2.b.f12463a.getClass();
                    aq2.b.f12464b = z25;
                    return responseProceed;
                }
            }, 6);
        } catch (IOException e4) {
            logger.error("configureCredentials: error creating FitPay http client", (Throwable) e4);
        } catch (Exception e14) {
            logger.error("configureCredentials: unexpected error creating FitPay http client", (Throwable) e14);
        }
        e.f113689c = e.d(eVar, null, 7);
        x xVar = new x(context);
        garminPayInitializer.logger.debug("initializing user wallet...");
        boolean zC = ((l) zf.b.r()).c();
        g.y("enableOrphanedCardFeature: ", zC, garminPayInitializer.logger);
        if (zC) {
            garminPayInitializer.checkIfUserHasFitPayAccount(z14);
        }
        Long userPrimaryKey = garminPayInitializer.getUserPrimaryKey();
        long jLongValue = userPrimaryKey != null ? userPrimaryKey.longValue() : -1L;
        p.f186870a.getClass();
        boolean z25 = Boolean.parseBoolean(p.c("dynamic_feature_app", HAS_FITPAY_ACCOUNT));
        kj0.c.f104941a.getClass();
        kj0.a aVar3 = kj0.c.f104947g.get();
        boolean z26 = aVar3 instanceof kj0.a.C2012a;
        boolean z27 = z25 || s.g(aVar3, kj0.a.b.f104932a) || z26;
        g.y("shouldInitFitPay: ", z27, garminPayInitializer.logger);
        w wVar = w.f140538a;
        kj0.b.f104940a.getClass();
        zi2.a aVarA = kj0.b.a();
        u uVar = u.f99680a;
        ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).getClass();
        wVar.getClass();
        HashMap map = w.f140541d;
        ch.qos.logback.classic.Logger logger2 = w.f140539b;
        context.getClass();
        aVarA.getClass();
        uVar.getClass();
        context.getApplicationContext().getClass();
        w wVar2 = w.f140538a;
        u.f99682c.add(wVar);
        w.f140540c = xVar;
        w.f140547j = 11657;
        if (w.f140548k == -1) {
            t tVar = xVar.f140558c;
            long j14 = ((SharedPreferences) tVar.getValue()).getLong("KEY_USER_ID", 0L);
            Long lValueOf = j14 > 0 ? Long.valueOf(j14) : null;
            String string = ((SharedPreferences) tVar.getValue()).getString("KEY_ENVIRONMENT", "");
            zi2.a aVarValueOf = (string == null || TextUtils.isEmpty(string)) ? null : zi2.a.valueOf(string);
            if ((lValueOf != null && lValueOf.longValue() != jLongValue) || (aVarValueOf != null && aVarValueOf != aVarA)) {
                logger2.debug("initialize: user or environment changed, clearing cache");
                w.l();
            }
            ((SharedPreferences) tVar.getValue()).edit().putLong("KEY_USER_ID", jLongValue).putString("KEY_ENVIRONMENT", aVarA.name()).apply();
            w.f140549l = aVarA;
            w.f140548k = jLongValue;
            ArrayList arrayListB = xVar.b();
            logger2.debug("cachedDevices: " + arrayListB);
            HashSet hashSetH = w.h(arrayListB, z27);
            HashSet hashSetG = w.g(arrayListB, z27);
            w.f140542e.clear();
            if (!w.k(hashSetH, hashSetG)) {
                if (arrayListB.isEmpty()) {
                    logger2.debug("initialize: no service providers were setup because user hasn't added device yet");
                } else {
                    logger2.error("initialize: no service providers were setup for " + arrayListB.size() + " devices, no cards can be added");
                }
            }
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                hs2.a aVar4 = (hs2.a) it.next();
                ArrayList arrayList = arrayListB;
                Logger logger3 = u.f99681b;
                aVar4.getClass();
                boolean z28 = z27;
                boolean z29 = z26;
                long unitId = aVar4.getUnitId();
                rd2.f.a().f152045a.getClass();
                Iterator it3 = it;
                sd2.f fVarI = rd2.j.i(unitId, null);
                if (fVarI == null) {
                    logger3.error("createPayDevice(" + unitId + "): DB record does not exist, returning null");
                } else {
                    if (fVarI.isPaired()) {
                        j8 = jLongValue;
                        try {
                            aVar2 = aVarA;
                            try {
                                if (((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).b(fVarI.getUnitID()) != null) {
                                    logger3.debug("createPayDevice(" + unitId + "): bluetooth connected");
                                    mVar = new jn2.m(aVar4, hs2.g.IDLE);
                                } else {
                                    logger3.warn("createPayDevice(" + unitId + "): not bluetooth connected");
                                    mVar = new jn2.m(aVar4, hs2.g.DISCONNECTED);
                                }
                            } catch (RemoteException e15) {
                                e = e15;
                                logger3.warn(androidx.room.a0.f(unitId, "createPayDevice(", "): failed to determine if device is bluetooth connected, returning 'disconnected'"), (Throwable) e);
                                mVar = new jn2.m(aVar4, hs2.g.DISCONNECTED);
                            }
                        } catch (RemoteException e16) {
                            e = e16;
                            aVar2 = aVarA;
                        }
                    } else {
                        logger3.warn("createPayDevice(" + unitId + "): not paired, returning null");
                    }
                    if (mVar != null) {
                        z24 = z28;
                        aVarA = aVar2;
                        z19 = z29;
                        jLongValue = j8;
                        map.put(Long.valueOf(aVar4.getUnitId()), new n(aVar4, mVar, jLongValue, aVarA, null, null, 48, null));
                    } else {
                        z19 = z29;
                        z24 = z28;
                        aVarA = aVar2;
                        jLongValue = j8;
                        xVar.d(aVar4.getUnitId());
                    }
                    z26 = z19;
                    z27 = z24;
                    arrayListB = arrayList;
                    it = it3;
                    aVar3 = aVar3;
                }
                j8 = jLongValue;
                aVar2 = aVarA;
                mVar = null;
                if (mVar != null) {
                    z24 = z28;
                    aVarA = aVar2;
                    z19 = z29;
                    jLongValue = j8;
                    map.put(Long.valueOf(aVar4.getUnitId()), new n(aVar4, mVar, jLongValue, aVarA, null, null, 48, null));
                } else {
                    z19 = z29;
                    z24 = z28;
                    aVarA = aVar2;
                    jLongValue = j8;
                    xVar.d(aVar4.getUnitId());
                }
                z26 = z19;
                z27 = z24;
                arrayListB = arrayList;
                it = it3;
                aVar3 = aVar3;
            }
            aVar = aVar3;
            z16 = z27;
            z17 = z26;
            r14 = 0;
            z18 = true;
            logger2.debug("initialize: complete, now managing " + arrayListB.size() + " wallets");
        } else {
            aVar = aVar3;
            z16 = z27;
            z17 = z26;
            r14 = 0;
            z18 = true;
            logger2.warn("initialize: already been called...");
        }
        w.f140550m = z18;
        try {
            j20.x xVar2 = new j20.x(23);
            int i14 = w03.b.f181178a;
            new h(xVar2).k(a.f108327b).e();
        } catch (Exception e17) {
            logger2.error("initialize: error while executing queue items...", (Throwable) e17);
        }
        logger2.debug("initialize: device broadcast queue items are processed, refreshing providers...");
        Collection collectionValues = map.values();
        ArrayList arrayList2 = new ArrayList(y.r(collectionValues, 10));
        Iterator it4 = collectionValues.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((n) it4.next()).f140498a);
        }
        if (w.k(w.h(arrayList2, z16), w.g(arrayList2, z16))) {
            for (n nVar : map.values()) {
                hs2.b bVarH = nVar.h();
                if (bVarH == hs2.b.READY || bVarH == hs2.b.CONNECTING) {
                    nVar.r(hs2.b.CONNECTING, nVar.f140498a);
                }
            }
        }
        ls2.b.f114790a.getClass();
        ch.qos.logback.classic.Logger logger4 = ls2.b.f114792c;
        ArrayList arrayList3 = new ArrayList();
        SharedPreferences sharedPreferences = context.getSharedPreferences("push_notif_mgr", r14);
        sharedPreferences.getClass();
        try {
            Map<String, ?> all = sharedPreferences.getAll();
            if (all != null) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    key.getClass();
                    if (d53.u.y(key, "pending.payload", r14)) {
                        String key2 = entry.getKey();
                        key2.getClass();
                        arrayList3.add(key2);
                        try {
                            String key3 = entry.getKey();
                            key3.getClass();
                            List listW = d53.w.W(d53.w.O(key3, "pending.payload"), new String[]{"."});
                            String str = ((DateFormat) ls2.b.f114791b.getValue()).format(new Date(Long.parseLong((String) listW.get(z18 ? 1 : 0))));
                            HashMap map2 = new HashMap();
                            Object value = entry.getValue();
                            value.getClass();
                            JSONObject jSONObject = new JSONObject((String) value);
                            Iterator<String> itKeys = jSONObject.keys();
                            itKeys.getClass();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                map2.put(next, jSONObject.getString(next));
                            }
                            logger4.debug("delivering " + ((Object) entry.getKey()) + " originally received at " + str);
                            ls2.b.a(map2);
                        } catch (Exception e18) {
                            logger4.error("error delivering pending " + ((Object) entry.getKey()), (Throwable) e18);
                        }
                    }
                    z18 = true;
                }
            }
            if (!arrayList3.isEmpty()) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    editorEdit.remove((String) it5.next());
                }
                editorEdit.commit();
            }
            logger2.debug("Ending initialization");
            if (!z15) {
                return new Intent();
            }
            p pVar = p.f186870a;
            String string2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.should_load_test_devices_on_startup);
            string2.getClass();
            pVar.getClass();
            boolean zB = p.b("dynamic_feature_app", string2, r14);
            garminPayInitializer.notifyProviderOnFeatureEnter().e();
            if (zB) {
                return new Intent(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), (Class<?>) DevDevicesActivity.class).addFlags(268468224);
            }
            kj0.a aVar5 = aVar;
            if (aVar5 instanceof kj0.a.d) {
                UserWalletActivity.a aVar6 = UserWalletActivity.f52217q;
                Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                aVar6.getClass();
                return UserWalletActivity.a.a(contextC);
            }
            if (aVar5 instanceof kj0.a.c) {
                kj0.a.c cVar = (kj0.a.c) aVar5;
                Long l14 = cVar.f104934a;
                if (l14 == null) {
                    vb.h.z("device unit id must not be null");
                    return null;
                }
                DeviceSettingsActivity.a aVar7 = DeviceSettingsActivity.f51993w;
                Context contextC2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                String str2 = cVar.f104935b;
                String str3 = cVar.f104936c;
                aVar7.getClass();
                return DeviceSettingsActivity.a.a(contextC2, l14, str2, str3);
            }
            if (aVar5 instanceof kj0.a.e) {
                PushProvMainActivity.a aVar8 = PushProvMainActivity.f51161t;
                Context contextC3 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                Bundle bundle = ((kj0.a.e) aVar5).f104938a;
                aVar8.getClass();
                Intent intent = new Intent(contextC3, (Class<?>) PushProvMainActivity.class);
                if (bundle == null) {
                    return intent;
                }
                intent.putExtras(bundle);
                return intent;
            }
            if (aVar5 instanceof kj0.a.b) {
                EcomMainActivity.a aVar9 = EcomMainActivity.f51133k;
                Context contextC4 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                aVar9.getClass();
                return new Intent(contextC4, (Class<?>) EcomMainActivity.class);
            }
            if (aVar5 instanceof kj0.a.f) {
                UserWalletActivity.a aVar10 = UserWalletActivity.f52217q;
                Context contextC5 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                aVar10.getClass();
                return UserWalletActivity.a.a(contextC5);
            }
            if (!z17) {
                if (aVar5 == null) {
                    vb.h.z("Entry context shouldn't be null here.");
                    return null;
                }
                lc.u0.r();
                return null;
            }
            AlipayAppletInstallationActivity.a aVar11 = AlipayAppletInstallationActivity.f51097j;
            Context contextC6 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            long j15 = ((kj0.a.C2012a) aVar5).f104931b;
            aVar11.getClass();
            Intent intent2 = new Intent(contextC6, (Class<?>) AlipayAppletInstallationActivity.class);
            intent2.putExtra("extra.deviceUnitId", j15);
            return intent2;
        } catch (Throwable th3) {
            if (!arrayList3.isEmpty()) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    editorEdit2.remove((String) it6.next());
                }
                editorEdit2.commit();
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$0(GarminPayInitializer garminPayInitializer, Intent intent) {
        garminPayInitializer.logger.debug("success, broadcasting firstPageHelperIntent");
        oi2.a.C2513a.a(oi2.a.f132270a, new jj0.a(intent));
        garminPayInitializer.disposeDisposal();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initialize$lambda$2(GarminPayInitializer garminPayInitializer, Throwable th3) {
        garminPayInitializer.logger.error((String) null, th3);
        oi2.a.C2513a.a(oi2.a.f132270a, new jj0.a(null, 1, 0 == true ? 1 : 0));
        garminPayInitializer.disposeDisposal();
        return Unit.INSTANCE;
    }

    private final q03.b notifyProviderOnFeatureEnter() {
        hb.a aVar = new hb.a(14);
        int i14 = w03.b.f181178a;
        return new h(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyProviderOnFeatureEnter$lambda$0() {
        w.f140538a.getClass();
        Iterator it = w.f140542e.values().iterator();
        while (it.hasNext()) {
            ((ms2.g) it.next()).l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void signOut$lambda$0() {
        com.bumptech.glide.b.b(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void signOut$lambda$1(GarminPayInitializer garminPayInitializer) {
        garminPayInitializer.isFeatureInitialized = false;
        garminPayInitializer.logger.debug("onUserSignOut: success ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit signOut$lambda$2(GarminPayInitializer garminPayInitializer, Throwable th3) {
        garminPayInitializer.logger.error("onUserSignOut: can not handle SignOut...", th3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kj0.d
    @SuppressLint({"CheckResult"})
    public void initialize(Context context, boolean shouldSendEntryIntentBroadcast, boolean shouldGetUserStatistics) {
        context.getClass();
        Intent intent = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i14 = 6;
        int i15 = 1;
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c()) {
            this.logger.error("no user signed in");
            oi2.a.C2513a.a(oi2.a.f132270a, new jj0.a(objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0));
            return;
        }
        ls2.b bVar = ls2.b.f114790a;
        v0 v0Var = new v0();
        bVar.getClass();
        synchronized (bVar) {
            ls2.b.f114793d.add(v0Var);
            ls2.b.f114792c.debug("registered " + v0Var);
            Unit unit = Unit.INSTANCE;
        }
        if (!this.isFeatureInitialized) {
            try {
                initServiceProviderFactorySingletons().k(a.f108327b).e();
                this.isFeatureInitialized = true;
            } catch (Exception e4) {
                this.logger.error("initialize: Singletons and ServiceProvider factories failed to reinitialize", (Throwable) e4);
                oi2.a.C2513a.a(oi2.a.f132270a, new jj0.a(intent, i15, objArr3 == true ? 1 : 0));
            }
        }
        this.logger.debug("initialize: Singletons and ServiceProvider factories reinitialized, initializing UserWallet");
        e13.p pVarG = initUserWallet(context, shouldSendEntryIntentBroadcast, shouldGetUserStatistics).j(a.f108327b).g(r03.a.a());
        q qVarA = r03.a.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w03.b.a(timeUnit, "unit is null");
        w03.b.a(qVarA, "scheduler is null");
        this.disposable = new e13.t(pVarG, INIT_TIMEOUT, timeUnit, qVarA, null).h(new gw.j(new hn2.d(this, 0), i14), new gw.j(new hn2.d(this, i15), 7));
    }

    @Override // kj0.d
    @SuppressLint({"CheckResult"})
    public void signOut(Context context) {
        context.getClass();
        z03.m mVarH = handleUserSignedOut(context).k(a.f108327b).h(r03.a.a());
        hb.a aVar = new hb.a(15);
        int i14 = w03.b.f181178a;
        new z03.e(mVarH, aVar).i(new gw.j(new hn2.d(this, 2), 8), new hn2.e(this, 1));
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.GarminPayInitializer$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/GarminPayInitializer$a;", "", "<init>", "()V", "", "INIT_TIMEOUT", "J", "MAX_WAIT_FOR_WALLET", "", GarminPayInitializer.HAS_FITPAY_ACCOUNT, "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
