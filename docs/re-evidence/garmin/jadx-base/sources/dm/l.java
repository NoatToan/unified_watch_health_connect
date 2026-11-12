package dm;

import am.x0;
import am.z0;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import ps.a1;
import ps.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/l;", "Liu1/k;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements iu1.k<com.garmin.android.apps.connectmobile.activities.newmodel.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f60386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f60387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f60388c;

    public l(n nVar, long j8, boolean z14) {
        this.f60386a = nVar;
        this.f60387b = j8;
        this.f60388c = z14;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // iu1.k
    public final void onSuccess(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar) {
        long j8;
        long j14;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = hVar;
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        n nVar = this.f60386a;
        ((aq.d) nVar.f50097g.get(eVar)).f11879a = hVar2;
        ArrayList arrayList = new ArrayList();
        String str = hVar2.C().f4358a;
        a1 a1Var = hVar2.f29459l;
        long j15 = this.f60387b;
        if (a1Var == null || a1Var.getHasIntensityIntervals() == null || !a1Var.getHasIntensityIntervals().booleanValue() || z0.o(str)) {
            x0 x0VarC = hVar2.C();
            x0VarC.getClass();
            ArrayList arrayList2 = hVar2.f29464q;
            ArrayList<ps.w> arrayList3 = hVar2.f29467v;
            if (tq.k.l(x0VarC, arrayList2, (arrayList3 == null || arrayList3.isEmpty()) ? false : true)) {
                cw.e.a(nVar, nVar.l(j15, true));
            } else if (tq.k.j(hVar2.C()) && hVar2.G()) {
                cw.e.a(nVar, nVar.n(j15, false));
            } else {
                cw.e.a(nVar, nVar.l(j15, false));
            }
        } else {
            cw.e.a(nVar, new y(j15, v0.class, new iu1.g(), new z(nVar, j15)));
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar2.f29460m;
        if (i0Var != null) {
            double d14 = i0Var.f29560x;
            if (d14 != 0.0d && !Double.isNaN(d14)) {
                arrayList.add(new k0(nVar, j15));
            }
        }
        a1 a1Var2 = hVar2.f29459l;
        if (a1Var2 != null && a1Var2.getHasPowerTimeInZones() != null && a1Var2.getHasPowerTimeInZones().booleanValue()) {
            z0 z0Var = z0.f4390a;
            arrayList.add(new j0(nVar, j15, z0.b(x0.f4308n, str) || z0.b(x0.D2, str)));
        }
        a1 a1Var3 = hVar2.f29459l;
        if (a1Var3 == null || a1Var3.getHasChartData() == null || !hVar2.f29459l.getHasChartData().booleanValue()) {
            j8 = j15;
        } else {
            com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2 = hVar2.f29460m;
            if (i0Var2 != null && i0Var2.f29543q2 > 0) {
                cw.e.a(nVar, new em.h(j15, new a0(nVar)));
            }
            x0 x0VarC2 = hVar2.C();
            x0VarC2.getClass();
            boolean zC = ar.h.c(hVar2.C(), hVar2.f29460m.f29505f1);
            List<qs.x> listI = tq.k.i(hVar2.C());
            nVar.getClass();
            j8 = j15;
            nVar.b(new em.a(nVar, this.f60387b, zC, 4000, this.f60388c, listI, !uw0.a.a(x0VarC2), new q(nVar)));
        }
        z0 z0Var2 = z0.f4390a;
        if (z0.b(x0.f4312o, str) || z0.b(x0.f4324r, str) || z0.b(x0.f4308n, str) || z0.W(str) || z0.b(x0.f4268a3, str)) {
            arrayList.add(new e0(nVar));
        }
        if (z0.f0(str)) {
            x0 x0VarC3 = hVar2.C();
            x0VarC3.getClass();
            arrayList.add(new i0(nVar, this.f60387b, x0VarC3, p005kotlin.jvm.internal.s.g(hVar2.f29459l.getIsWheelchair(), Boolean.TRUE)));
        }
        x0 x0Var = x0.D;
        if (z0.b(x0Var, str) && !z0.M(str)) {
            arrayList.add(new s(nVar, j8));
        }
        a1 a1Var4 = hVar2.f29459l;
        if (a1Var4 == null || a1Var4.getDeviceApplicationInstallationId() == null || a1Var4.getDeviceApplicationInstallationId().intValue() <= 0) {
            j14 = j8;
        } else {
            Integer agentApplicationInstallationId = hVar2.f29459l.getAgentApplicationInstallationId();
            int iIntValue = agentApplicationInstallationId != null ? agentApplicationInstallationId.intValue() : 0;
            Integer deviceApplicationInstallationId = hVar2.f29459l.getDeviceApplicationInstallationId();
            j14 = j8;
            cw.e.a(nVar, new em.c(j14, iIntValue, deviceApplicationInstallationId != null ? deviceApplicationInstallationId.intValue() : 0, new r(nVar)));
        }
        if (z0.b(x0Var, str) && !z0.M(str)) {
            arrayList.add(new jw.d0(nVar, new w(nVar)));
        }
        if (fr.a.d(hVar2.f29464q, qs.x.WORKOUT_ROUND)) {
            iu1.b bVar = new iu1.b(nVar, new f0(this.f60387b, com.garmin.android.apps.connectmobile.activities.newmodel.f.class, new iu1.g(), new h0(nVar)));
            bVar.f50128h = false;
            nVar.b(bVar);
        }
        if (z0.H(str)) {
            List<Long> listM = hVar2.f29459l.m();
            if (listM == null) {
                listM = p13.j0.f134944a;
            }
            if (listM.size() > 1) {
                arrayList.addAll(nVar.m());
            }
        }
        if (z0.b(x0.f4308n, str) || z0.b(x0.D2, str)) {
            arrayList.add(new m(nVar, new DateTime(hVar2.f29460m.f29484a), true));
        }
        arrayList.add(new j(nVar, j14));
        nVar.c(arrayList);
    }
}
