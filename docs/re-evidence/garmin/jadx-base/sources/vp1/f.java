package vp1;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvp1/f;", "Lh82/c;", "<init>", "()V", "a", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends h82.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f179398h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f179399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f179400g;

    static {
        new a(null);
    }

    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(445930329);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            this.f179399f = bundle.getBoolean("EXTRA_HAS_BATTERY_HOT_DATA", false);
            this.f179400g = bundle.getBoolean("EXTRA_HAS_BATTERY_COLD_DATA", false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(this, bundle, i14, 26);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-183600403, true, new d(this, 0)), 4, null), new h82.c.b("CHARGE_OVERVIEW", context.getString(R.string.help_solar_charging_overview), null, new z3.e(409888268, true, new d(this, 1)), 4, null), new h82.c.b("MAXIMIZING_CHARGE", context.getString(R.string.help_solar_charging_maximizing), null, new z3.e(1003376939, true, new d(this, 2)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(-999358616);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(823539643, new d(this, 3), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, i14, 1);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(-359772285);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            b.f179385a.getClass();
            h82.e.a(b.f179391g, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, i14, 0);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(618867602);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(1724963198, new d(this, 4), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, i14, 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lvp1/f$a;", "", "<init>", "()V", "", "EXTRA_HAS_BATTERY_COLD_DATA", "Ljava/lang/String;", "EXTRA_HAS_BATTERY_HOT_DATA", "CHARGE_OVERVIEW", "MAXIMIZING_CHARGE", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
