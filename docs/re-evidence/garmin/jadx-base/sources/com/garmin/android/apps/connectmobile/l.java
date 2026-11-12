package com.garmin.android.apps.connectmobile;

import android.text.TextUtils;
import c22.s3;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class l implements h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f37126b = Arrays.asList("android");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f37127c = Arrays.asList("android", "android-china");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static l f37128d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37129a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37130a;

        static {
            int[] iArr = new int[gg1.u0.values().length];
            f37130a = iArr;
            try {
                iArr[gg1.u0.FIREBASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private l() {
        k kVar = new k(this, 0);
        this.f37129a = new ArrayList();
        h(null);
        gh2.i.f77458c.a().addObserver(kVar);
    }

    public static void a(boolean z14) {
        i2.d("AppConfig", "Apply Firebase remote config.");
        FirebaseApp.initializeApp(GarminConnectMobileApp.f28688j);
        gh2.i iVar = gh2.i.f77458c;
        new gh2.i.b();
        gh2.b.C1564b c1564b = new gh2.b.C1564b(GarminConnectMobileApp.f28688j, R.xml.remote_config_defaults);
        if (z14) {
            c1564b.f77428c = 0L;
        }
        c1564b.a();
    }

    public static void b(String str, boolean z14, boolean z15, ve2.e eVar) {
        gg1.v0 v0VarA;
        dd2.b bVarB = ((f12.b) KoinJavaComponent.get(f12.b.class)).b();
        String str2 = bVarB.f59210a;
        String str3 = bVarB.f59211b;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            i2.j("AppConfig", "The access of consumer key and secret were not granted. Fallback to local remote config.");
            i2.d("AppConfig", "Apply local remote config.");
            gh2.i iVar = gh2.i.f77458c;
            new gh2.i.b();
            new gh2.f.a(GarminConnectMobileApp.f28688j, R.xml.remote_config_defaults).a();
            return;
        }
        i2.d("AppConfig", "Apply GC remote config (" + str + ").");
        dd2.b bVarD = ((pu.a) KoinJavaComponent.inject(pu.a.class).getValue()).d();
        gh2.i iVar2 = gh2.i.f77458c;
        new gh2.i.b();
        gh2.c.b bVar = new gh2.c.b(GarminConnectMobileApp.f28688j, R.xml.remote_config_defaults);
        if (eVar == null) {
            v0VarA = GCMSettingManager.k();
        } else {
            String strName = eVar.name();
            gg1.v0.T.getClass();
            v0VarA = gg1.v0.a.a(strName);
        }
        bVar.f77441c = v0VarA.a();
        str.getClass();
        bVar.f77442d = str;
        bVar.f77443e = new dd2.c(d53.w.i0(bVarD.f59210a).toString(), d53.w.i0(bVarD.f59211b).toString(), d53.w.i0(bVarB.f59210a).toString(), d53.w.i0(str3).toString());
        bVar.f77445g = z15 ? 0L : 3600L;
        List<String> list = z14 ? f37127c : f37126b;
        list.getClass();
        bVar.f77444f = list;
        bVar.a();
    }

    public static String f() {
        return gh2.i.f77458c.a().f77477b.h("connect_iq_android_app_id");
    }

    public static l g() {
        if (f37128d == null) {
            f37128d = new l();
        }
        return f37128d;
    }

    public static boolean i() {
        return gh2.i.f77458c.a().f77477b.c("connect_iq_app_enabled");
    }

    public static boolean j() {
        k1.f37122a.getClass();
        gg1.v0 v0VarK = GCMSettingManager.k();
        gg1.v0 v0Var = gg1.v0.ChinaServerEnvironment;
        v0VarK.getClass();
        v0Var.getClass();
        return !p005kotlin.jvm.internal.s.g(v0VarK.f77335a.name(), v0Var.f77335a.name());
    }

    public final boolean c() {
        return gh2.i.f77458c.a().f77477b.c("enable_orphaned_card_feature");
    }

    public final long d() {
        return gh2.i.f77458c.a().f77477b.g("authorized_viewers_accept_limit");
    }

    public final long e() {
        return gh2.i.f77458c.a().f77477b.g("authorized_viewers_send_limit");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final void h(ve2.e eVar) {
        boolean z14;
        kg1.a.f104701a.getClass();
        if (kg1.a.C2003a.a().L()) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z14) {
            i2.j("AppConfig", "Remote config dev mode is enabled, the local cache is always considered expired");
        }
        gg1.u0 u0VarJ = kg1.a.C2003a.a().j();
        if (u0VarJ == null) {
            String upperCase = c22.b0.c().toUpperCase(Locale.US);
            if (!TextUtils.isEmpty(GCMSettingManager.f41536b.getString(GCMSettingManager.f41535a.getString(R.string.key_country), null))) {
                upperCase = GCMSettingManager.f41536b.getString(GCMSettingManager.f41535a.getString(R.string.key_country), null);
            }
            if (((f12.b) KoinJavaComponent.get(f12.b.class)).f() || TextUtils.equals(upperCase, "CN")) {
                b("garmin-connect-mobile", true, z14, eVar);
            } else {
                a(z14);
            }
        } else if (a.f37130a[u0VarJ.ordinal()] != 1) {
            b(u0VarJ.f77329b, u0VarJ.f77330c, z14, eVar);
        } else {
            a(z14);
        }
        k();
    }

    public final void k() {
        for (b bVar : this.f37129a) {
            for (Map.Entry entry : bVar.f37132b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String strH = gh2.i.f77458c.a().f77477b.h(str);
                if (!bVar.f37131a || !TextUtils.equals(str2, strH)) {
                    bVar.a();
                    bVar.f37132b.put(str, strH);
                }
            }
        }
    }

    public final String l() {
        return gh2.i.f77458c.a().f77477b.h("garminpay_feature_restricted_business_operators");
    }

    /* JADX WARN: Code duplicated, block: B:6:0x003e  */
    public final boolean m() {
        wr2.p pVar = wr2.p.f186870a;
        String string = GarminConnectMobileApp.f28688j.getString(R.string.disable_ecom_features);
        pVar.getClass();
        boolean zB = wr2.p.b("general_app", string, false);
        boolean zF = ((f12.b) KoinJavaComponent.get(f12.b.class)).f();
        if (!gh2.i.f77458c.a().f77477b.c("garminpay_show_ecom_features")) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                if (zF && !zB) {
                    return true;
                }
            }
        } else if (zF) {
        }
        return false;
    }

    public final boolean n() {
        return gh2.i.f77458c.a().f77477b.c("garminpay_show_updated_terms");
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f37131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f37132b;

        public b(List<String> list, boolean z14) {
            this.f37132b = new HashMap();
            this.f37131a = z14;
            for (String str : list) {
                HashMap map = this.f37132b;
                l.g().getClass();
                map.put(str, gh2.i.f77458c.a().f77477b.h(str));
            }
        }

        public abstract void a();

        public b(String... strArr) {
            this(Arrays.asList(strArr), true);
        }
    }
}
