package qw0;

import am.z0;
import c22.s3;
import com.garmin.android.apps.connectmobile.k1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqw0/t;", "Lqw0/s;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements s {
    public static com.garmin.android.library.mapsdkadapter.i.d d(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        if (dVar != com.garmin.android.library.mapsdkadapter.i.d.MAPBOX) {
            if (dVar != null) {
                return dVar;
            }
            ie2.n.f93149a.getClass();
            return ((i) ie2.n.a()).f();
        }
        s.f148346a.getClass();
        if (s.a.a()) {
            return dVar;
        }
        ie2.n.f93149a.getClass();
        return ((i) ie2.n.a()).f();
    }

    @Override // qw0.s
    public final boolean B(String str) {
        str.getClass();
        if (!b()) {
            return false;
        }
        s.f148346a.getClass();
        if (!s.a.a()) {
            return false;
        }
        f12.l.f68084a.getClass();
        Boolean boolB = f12.l.a.a().B(str);
        return boolB != null ? boolB.booleanValue() : z0.f(str);
    }

    @Override // qw0.s
    public final boolean C() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().C();
    }

    @Override // qw0.s
    public final void D(String str, com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        f12.l.f68084a.getClass();
        f12.l.a.a().D(str, dVar);
    }

    @Override // qw0.s
    public final com.garmin.android.library.mapsdkadapter.i.d E(String str) {
        str.getClass();
        if (!b()) {
            ie2.n.f93149a.getClass();
            return ((i) ie2.n.a()).f();
        }
        f12.l.f68084a.getClass();
        com.garmin.android.library.mapsdkadapter.i.d dVarE = f12.l.a.a().E(str);
        s.f148346a.getClass();
        if (!s.a.a() || dVarE != null) {
            return d(dVarE);
        }
        if (z0.f(str)) {
            return com.garmin.android.library.mapsdkadapter.i.d.MAPBOX;
        }
        ie2.n.f93149a.getClass();
        return ((i) ie2.n.a()).f();
    }

    @Override // qw0.s
    public final Integer F() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().F();
    }

    @Override // qw0.s
    public final com.garmin.android.library.mapsdkadapter.i.d H() {
        if (b()) {
            f12.l.f68084a.getClass();
            return d(f12.l.a.a().H());
        }
        ie2.n.f93149a.getClass();
        return ((i) ie2.n.a()).f();
    }

    @Override // qw0.s
    public final void a(boolean z14) {
        f12.l.f68084a.getClass();
        f12.l.a.a().a(z14);
    }

    @Override // qw0.s
    public final boolean b() {
        bv.b.f21239a.getClass();
        bv.b.a();
        k1.f37122a.getClass();
        boolean zC = ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("three_d_maps");
        s3.f23252a.getClass();
        return zC || s3.a("ROLE_DI_TESTER");
    }

    @Override // qw0.s
    public final void e(int i14) {
        f12.l.f68084a.getClass();
        f12.l.a.a().e(i14);
    }

    @Override // qw0.s
    public final com.garmin.android.library.mapsdkadapter.i.d l() {
        if (b()) {
            f12.l.f68084a.getClass();
            return d(f12.l.a.a().l());
        }
        ie2.n.f93149a.getClass();
        return ((i) ie2.n.a()).f();
    }

    @Override // qw0.s
    public final void m(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        f12.l.f68084a.getClass();
        f12.l.a.a().m(dVar);
    }

    @Override // qw0.s
    public final boolean n() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().n();
    }

    @Override // qw0.s
    public final void o(int i14, String str) {
        f12.l.f68084a.getClass();
        f12.l.a.a().o(i14, str);
    }

    @Override // qw0.s
    public final void p(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        f12.l.f68084a.getClass();
        f12.l.a.a().p(dVar);
    }

    @Override // qw0.s
    public final Integer q(String str) {
        str.getClass();
        f12.l.f68084a.getClass();
        return f12.l.a.a().q(str);
    }

    @Override // qw0.s
    public final void s(String str, boolean z14) {
        f12.l.f68084a.getClass();
        f12.l.a.a().s(str, z14);
    }

    @Override // qw0.s
    public final com.garmin.android.library.mapsdkadapter.i.d v() {
        if (b()) {
            f12.l.f68084a.getClass();
            return d(f12.l.a.a().v());
        }
        ie2.n.f93149a.getClass();
        return ((i) ie2.n.a()).f();
    }

    @Override // qw0.s
    public final void x(boolean z14) {
        f12.l.f68084a.getClass();
        f12.l.a.a().x(z14);
    }

    @Override // qw0.s
    public final void z(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        f12.l.f68084a.getClass();
        f12.l.a.a().z(dVar);
    }
}
