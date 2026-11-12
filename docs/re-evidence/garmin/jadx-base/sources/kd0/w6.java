package kd0;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/w6;", "Lbv/d;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w6 implements bv.d {
    @Override // bv.d
    public final boolean A() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().A();
    }

    @Override // bv.d
    public final void G() {
        f12.l.f68084a.getClass();
        f12.l.a.a().G();
    }

    @Override // bv.d
    public final String H() {
        Locale locale = ((c22.o) KoinJavaComponent.get(c22.o.class)).h().getConfiguration().locale;
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    @Override // bv.d
    public final e12.e I() {
        return bo1.a.a().c();
    }

    @Override // bv.d
    public final String J() {
        return GCMSettingManager.k().a();
    }

    @Override // bv.d
    public final boolean K() {
        return z10.d1.f();
    }

    @Override // bv.d
    public final boolean L() {
        return z10.d1.k();
    }

    @Override // bv.d
    public final boolean M() {
        f12.l.f68084a.getClass();
        return !TextUtils.isEmpty("ROLE_WELLNESS_USER") && f12.l.a.a().N().contains("ROLE_WELLNESS_USER");
    }

    @Override // bv.d
    public final int N() {
        gg1.m mVarE1 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1();
        mVarE1.getClass();
        switch (gg1.m.b.f77273a[mVarE1.ordinal()]) {
            case 1:
                return 7;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 1;
        }
    }

    @Override // bv.d
    public final boolean O() {
        c22.s3.f23252a.getClass();
        return c22.s3.a("ROLE_MBTESTER");
    }

    @Override // bv.d
    public final String b() {
        c22.s1 s1Var = c22.s1.f23251a;
        GarminConnectMobileApp.f28685g.getClass();
        Context contextA = GarminConnectMobileApp.a.a();
        s1Var.getClass();
        return c22.s1.e(contextA);
    }

    @Override // bv.d
    public final boolean c() {
        return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c();
    }

    @Override // bv.d
    public final long d() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().d();
    }

    @Override // bv.d
    public final gg1.o0 g() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().g();
    }

    @Override // bv.d
    public final int getUserProfilePk() {
        return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
    }

    @Override // bv.d
    public final long h() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().h();
    }

    @Override // bv.d
    public final String i() {
        return GCMSettingManager.k().b();
    }

    @Override // bv.d
    public final int u() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().u();
    }

    @Override // bv.d
    public final String w() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().w();
    }

    @Override // bv.d
    public final boolean y() {
        return am.j.z(f12.l.f68084a);
    }
}
