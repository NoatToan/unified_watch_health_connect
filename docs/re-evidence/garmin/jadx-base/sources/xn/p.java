package xn;

import am.z0;
import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxn/p;", "Lh82/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f191619g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f191620f;

    static {
        new a(null);
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1394714078);
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
            this.f191620f = bundle.getString("GCM_extra_activity_type", null);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(this, bundle, i14, 19);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        z0 z0Var = z0.f4390a;
        String str = this.f191620f;
        z0Var.getClass();
        if (!xy2.b.B(z0Var, str) && !xy2.b.C(z0Var, str)) {
            h82.c.b bVar = new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1376657482, true, new m(this, 5)), 4, null);
            h82.c.b bVar2 = new h82.c.b("CALORIE_TRACKING", context.getString(R.string.lbl_calorie_tracking), null, new z3.e(-1613275307, true, new m(this, 6)), 4, null);
            h82.c.b bVar3 = new h82.c.b("FLUID TRACKING", context.getString(R.string.lbl_fluid_tracking), null, new z3.e(-1849893132, true, new m(this, 7)), 4, null);
            String string = context.getString(R.string.lbl_calories_during_an_activity);
            e.f191594a.getClass();
            return p13.x.k(bVar, bVar2, bVar3, new h82.c.b("CALORIES_DURING_ACTIVITY", string, null, e.f191596c, 4, null));
        }
        h82.c.b bVar4 = new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(687260177, true, new m(this, 1)), 4, null);
        h82.c.b bVar5 = new h82.c.b("CALORIE_TRACKING", context.getString(R.string.lbl_calorie_tracking), null, new z3.e(-1353414928, true, new m(this, 2)), 4, null);
        h82.c.b bVar6 = new h82.c.b("FLUID TRACKING", context.getString(R.string.lbl_fluid_tracking), null, new z3.e(900877263, true, new m(this, 3)), 4, null);
        h82.c.b bVar7 = new h82.c.b("PACK CALORIES", context.getString(R.string.lbl_pack_calories_help_title), null, new z3.e(-1139797842, true, new m(this, 4)), 4, null);
        String string2 = context.getString(R.string.lbl_calories_during_an_activity);
        e.f191594a.getClass();
        return p13.x.k(bVar4, bVar5, bVar6, bVar7, new h82.c.b("CALORIES_DURING_ACTIVITY", string2, null, e.f191595b, 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1158599089);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            e.f191594a.getClass();
            h82.e.a(e.f191597d, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, i14, 2);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1571261906);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            e.f191594a.getClass();
            h82.e.a(e.f191598e, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, i14, 1);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1068489343);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(1800451148, new m(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, i14, 0);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(406390842);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(-134650330, new m(this, 8), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, i14, 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lxn/p$a;", "", "<init>", "()V", "", "CALORIE_TRACKING", "Ljava/lang/String;", "FLUID_TRACKING", "PACK_CALORIES", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
