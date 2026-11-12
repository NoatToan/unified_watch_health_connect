package xk1;

import am.x0;
import am.z0;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.x;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxk1/n;", "Lh82/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends h82.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f191265j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f191266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f191267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f191268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l80.a f191269i = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);

    static {
        new a(null);
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1917430032);
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
            long j8 = bundle.getLong("GCM_deviceUnitID", -1L);
            Long lValueOf = Long.valueOf(j8);
            if (j8 <= 0) {
                lValueOf = null;
            }
            this.f191268h = lValueOf;
            this.f191266f = bundle.getString("GCM_extra_activity_type", null);
            this.f191267g = bundle.getBoolean("GCM_extra_activity_owner", false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(this, bundle, i14, 15);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        String str = this.f191266f;
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.f4308n, str)) {
            return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1077472283, true, new k(this, 5)), 4, null));
        }
        if (z0.b(x0.U1, this.f191266f)) {
            return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1325393212, true, new k(this, 6)), 4, null));
        }
        if (z0.b(x0.f4312o, this.f191266f)) {
            return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1986580707, true, new k(this, 7)), 4, null));
        }
        if (!z0.Q(this.f191266f)) {
            if (!z0.b(x0.f4297k1, this.f191266f)) {
                return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-810377563, true, new k(this, 9)), 4, null), new h82.c.b("RUNNING_ACTION", context.getString(R.string.lbl_running_power_zone_help_title1), null, new z3.e(900273284, true, new k(this, 10)), 4, null), new h82.c.b("CYCLING_ACTION", context.getString(R.string.lbl_cycling_power_zones), null, new z3.e(-1684043165, true, new k(this, 11)), 4, null), new h82.c.b("ROWING_ACTION", context.getString(R.string.lbl_rowing_power_zones), null, new z3.e(26607682, true, new k(this, 12)), 4, null), new h82.c.b("WINTER_SPORTS_ACTION", context.getString(R.string.lbl_skiing_power_zone_help_title1), null, new z3.e(1737258529, true, new k(this, 13)), 4, null));
            }
        }
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1003587330, true, new k(this, 8)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1880438740);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1197869919, new k(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(this, i14, 1);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-2133692176);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-401398909, new k(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(this, i14, 0);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1170627639);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-729787958, new k(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(this, i14, 4);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(751311984);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 3;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(1967970621, new k(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(this, i14, 3);
        }
    }

    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-81839405);
        int i15 = 2;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1845397978, new k(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(this, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    public final void l(h82.r rVar, p3.m mVar, int i14) {
        int i15;
        h82.r rVar2;
        o0 o0Var;
        int i16;
        n nVar;
        boolean z14;
        o0 o0VarE = mVar.E(1187530292);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        int i17 = i15;
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (this.f191267g) {
                o0VarE.C(-1244686755);
                Long l14 = this.f191268h;
                if (l14 == null) {
                    o0VarE.C(69416260);
                    o0VarE.g0(false);
                    rVar2 = rVar;
                    o0Var = o0VarE;
                    i16 = 16;
                    z14 = false;
                    nVar = this;
                } else {
                    o0VarE.C(69416261);
                    long jLongValue = l14.longValue();
                    Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar, j92.b.f97899b.f97920e), o0VarE);
                    l72.p2 p2Var = l72.p2.f111205a;
                    String strQ = y.Q(o0VarE, R.string.update_power_zones);
                    boolean zR = o0VarE.r(this) | o0VarE.r(context) | o0VarE.l(jLongValue);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        d62.s sVar = new d62.s(this, context, jLongValue, 10);
                        o0VarE.K(sVar);
                        objQ = sVar;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            d62.s sVar2 = new d62.s(this, context, jLongValue, 10);
                            o0VarE.K(sVar2);
                            objQ = sVar2;
                        }
                    }
                    p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ, o0VarE, 0, 254);
                    z14 = false;
                    i16 = 16;
                    rVar2 = rVar;
                    o0Var = o0VarE;
                    nVar = this;
                    rVar2.o(R.string.update_power_zones_on_device_or_connect, (i17 << 6) & 896, 2, null, o0Var);
                    o0Var.g0(false);
                }
                o0Var.g0(z14);
            } else {
                rVar2 = rVar;
                o0Var = o0VarE;
                i16 = 16;
                nVar = this;
                o0Var.C(69834606);
                o0Var.g0(false);
            }
        } else {
            rVar2 = rVar;
            o0Var = o0VarE;
            i16 = 16;
            nVar = this;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(nVar, rVar2, i14, i16);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lxk1/n$a;", "", "<init>", "()V", "", "RUNNING_ACTION", "Ljava/lang/String;", "CYCLING_ACTION", "ROWING_ACTION", "WINTER_SPORTS_ACTION", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
