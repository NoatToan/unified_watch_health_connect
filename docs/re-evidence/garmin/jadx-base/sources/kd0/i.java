package kd0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkd0/i;", "Lc22/o;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements c22.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104108a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104109a;

        static {
            int[] iArr = new int[c22.u0.values().length];
            try {
                iArr[c22.u0.ACTIVITY_SYNC_EDITS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c22.u0.ARABICA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c22.u0.FROG_COACH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c22.u0.EPIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c22.u0.NUTRITION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c22.u0.IRON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c22.u0.CYCLING_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c22.u0.GRETA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c22.u0.DOGS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f104109a = iArr;
        }
    }

    public i(Context context) {
        context.getClass();
        this.f104108a = context;
    }

    @Override // c22.o
    public final boolean a() {
        return hb2.i.a(this.f104108a);
    }

    @Override // c22.o
    public final String b() {
        c22.s1.f23251a.getClass();
        return c22.s1.e(this.f104108a);
    }

    @Override // c22.o
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getF104108a() {
        return this.f104108a;
    }

    @Override // c22.o
    public final Context d() {
        int i14;
        Context context = this.f104108a;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        int i15 = context.getResources().getConfiguration().uiMode & (-49);
        int i16 = i.e.f86562b;
        if (i16 != 1) {
            i14 = i16 != 2 ? context.getResources().getConfiguration().uiMode : i15 | 32;
        } else {
            i14 = i15 | 16;
        }
        configuration.uiMode = i14;
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        contextCreateConfigurationContext.getClass();
        return contextCreateConfigurationContext;
    }

    @Override // c22.o
    public final SharedPreferences e() {
        SharedPreferences sharedPreferences = GCMSettingManager.f41536b;
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    @Override // c22.o
    public final int f() {
        DisplayMetrics displayMetrics;
        Resources resources = this.f104108a.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 320;
        }
        return displayMetrics.densityDpi;
    }

    @Override // c22.o
    public final boolean g(c22.u0 u0Var) {
        u0Var.getClass();
        switch (a.f104109a[u0Var.ordinal()]) {
            case 1:
                com.garmin.android.apps.connectmobile.l.g().getClass();
                if (gh2.i.f77458c.a().f77477b.c("sync_activity_edits_released")) {
                    return true;
                }
                c22.s3.f23252a.getClass();
                return c22.s3.a("ROLE_MBTESTER");
            case 2:
                com.garmin.android.apps.connectmobile.l.g().getClass();
                return gh2.i.f77458c.a().f77477b.c("unreleased_vo2_max_estimation");
            case 3:
                return bo1.a.a().c().j();
            case 4:
                return com.garmin.android.apps.connectmobile.k1.f37122a.x();
            case 5:
                return com.garmin.android.apps.connectmobile.k1.f37122a.z();
            case 6:
                return com.garmin.android.apps.connectmobile.k1.f37122a.q();
            case 7:
                com.garmin.android.apps.connectmobile.l.g().getClass();
                if (gh2.i.f77458c.a().f77477b.c("cycling_position_released")) {
                    return true;
                }
                c22.s3.f23252a.getClass();
                return c22.s3.a("ROLE_MBTESTER");
            case 8:
                c22.s3.f23252a.getClass();
                return c22.s3.a("ROLE_MBTESTER") || ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("GretaLaunchEnabled");
            case 9:
                return com.garmin.android.apps.connectmobile.k1.f37122a.H0();
            default:
                lc.u0.r();
                return false;
        }
    }

    @Override // c22.o
    public final Resources h() {
        Resources resources = this.f104108a.getResources();
        resources.getClass();
        return resources;
    }

    @Override // c22.o
    public final boolean i() {
        GarminConnectMobileApp.f28685g.getClass();
        return GarminConnectMobileApp.a.b().f28689a;
    }
}
