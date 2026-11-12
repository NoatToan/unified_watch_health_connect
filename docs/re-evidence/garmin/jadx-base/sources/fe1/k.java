package fe1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfe1/k;", "Lh82/c;", "<init>", "()V", "a", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f70552f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1252726346, true, new h(this, 0)), 4, null), new h82.c.b("TRACKING_DATA_ACTION", context.getString(R.string.activities_respiration_tracking_title), null, new z3.e(212434507, true, new h(this, 1)), 4, null), new h82.c.b("RUN_RATE_ACTION", context.getString(R.string.activities_breathing_during_runs_title), null, new z3.e(-827857332, true, new h(this, 2)), 4, null), new h82.c.b("RIDE_RATE_ACTION", context.getString(R.string.activities_breathing_during_rides_title), null, new z3.e(-1868149171, true, new h(this, 3)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1986538841);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(-2089895021, new h(this, 4), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, 2);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1552341176);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            c.f70533a.getClass();
            h82.e.a(c.f70536d, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, 3);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1547537615);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            c.f70533a.getClass();
            h82.e.a(c.f70535c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, 0);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(968399977);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            c.f70533a.getClass();
            h82.e.a(c.f70534b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, 1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lfe1/k$a;", "", "<init>", "()V", "", "TRACKING_DATA_ACTION", "Ljava/lang/String;", "RUN_RATE_ACTION", "RIDE_RATE_ACTION", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
