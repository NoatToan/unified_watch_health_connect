package kq;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import java.util.List;
import p005kotlin.Metadata;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkq/l0;", "Lh82/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f106099g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public im.n f106100f = im.n.SEATED_STANDING;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106101a;

        static {
            int[] iArr = new int[im.n.values().length];
            try {
                iArr[im.n.AUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[im.n.LUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[im.n.SEATED_STANDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f106101a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        Object bVar;
        im.n nVar;
        p3.o0 o0VarE = mVar.E(-909217857);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            String string = bundle.getString("extra_cycling_position_mode");
            if (string != null) {
                try {
                    int i16 = o13.q.f128596b;
                    bVar = im.n.valueOf(string);
                } catch (Throwable th3) {
                    int i17 = o13.q.f128596b;
                    bVar = new o13.q.b(th3);
                }
                if (bVar instanceof o13.q.b) {
                    bVar = null;
                }
                nVar = (im.n) bVar;
                if (nVar == null) {
                    nVar = im.n.SEATED_STANDING;
                }
            } else {
                nVar = im.n.SEATED_STANDING;
            }
            bv.b.f21239a.getClass();
            bv.b.a();
            if (!k1.f37122a.t()) {
                nVar = im.n.SEATED_STANDING;
            }
            this.f106100f = nVar;
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(this, bundle, i14, 19);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(339655378, true, new kh0.d(this, 3)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(966291359);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            o.f106112a.getClass();
            h82.e.a(o.f106113b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(this, i14, 2);
        }
    }

    public final void h(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(922061271);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = b.f106101a[this.f106100f.ordinal()];
            if (i16 == 1 || i16 == 2) {
                o0VarE.C(1337623279);
                g(o0VarE, i15 & 14);
                o0VarE.g0(false);
            } else {
                if (i16 != 3) {
                    throw kg.f.h(o0VarE, 1337619711, false);
                }
                o0VarE.C(1337625746);
                i(o0VarE, i15 & 14);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(this, i14, 0);
        }
    }

    public final void i(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-511741330);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            o.f106112a.getClass();
            h82.e.a(o.f106114c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(this, i14, 1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkq/l0$a;", "", "<init>", "()V", "", "EXTRA_CYCLING_POSITION_MODE", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
