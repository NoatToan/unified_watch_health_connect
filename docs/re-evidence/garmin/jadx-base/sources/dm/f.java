package dm;

import am.x0;
import am.z0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import ps.a1;
import ps.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/f;", "Liu1/k;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements iu1.k<com.garmin.android.apps.connectmobile.activities.newmodel.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f60344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f60345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f60346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f60347d;

    public f(g gVar, long j8, boolean z14, boolean z15) {
        this.f60344a = gVar;
        this.f60345b = j8;
        this.f60346c = z14;
        this.f60347d = z15;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
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
        boolean z14;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = hVar;
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        g gVar = this.f60344a;
        ((aq.d) gVar.f50097g.get(eVar)).f11879a = hVar2;
        ArrayList arrayList = new ArrayList();
        a1 a1Var = hVar2.f29459l;
        long j14 = this.f60345b;
        if (a1Var == null || a1Var.getHasIntensityIntervals() == null || !a1Var.getHasIntensityIntervals().booleanValue() || z0.o(hVar2.C().f4358a)) {
            x0 x0VarC = hVar2.C();
            x0VarC.getClass();
            ArrayList arrayList2 = hVar2.f29464q;
            ArrayList<ps.w> arrayList3 = hVar2.f29467v;
            if (tq.k.l(x0VarC, arrayList2, (arrayList3 == null || arrayList3.isEmpty()) ? false : true)) {
                cw.e.a(gVar, gVar.l(j14, true));
            } else if (tq.k.j(hVar2.C()) && hVar2.G()) {
                cw.e.a(gVar, gVar.n(j14, false));
            } else {
                cw.e.a(gVar, gVar.l(j14, false));
            }
        } else {
            cw.e.a(gVar, new y(j14, v0.class, new iu1.g(), new z(gVar, j14)));
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar2.f29460m;
        if (i0Var != null) {
            double d14 = i0Var.f29560x;
            if (d14 != 0.0d && !Double.isNaN(d14)) {
                arrayList.add(new k0(gVar, j14));
            }
        }
        a1 a1Var2 = hVar2.f29459l;
        if (a1Var2 != null && a1Var2.getHasPowerTimeInZones() != null && a1Var2.getHasPowerTimeInZones().booleanValue()) {
            String str = hVar2.C().f4358a;
            z0 z0Var = z0.f4390a;
            if (z0.b(x0.f4308n, str)) {
                z14 = true;
            } else {
                if (z0.b(x0.D2, hVar2.C().f4358a)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            arrayList.add(new j0(gVar, j14, z14));
        }
        a1 a1Var3 = hVar2.f29459l;
        if (a1Var3 != null && a1Var3.getHasChartData() != null && hVar2.f29459l.getHasChartData().booleanValue()) {
            com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2 = hVar2.f29460m;
            if (i0Var2 != null && i0Var2.f29543q2 > 0) {
                cw.e.a(gVar, new em.h(j14, new a0(gVar)));
            }
            x0 x0VarC2 = hVar2.C();
            x0VarC2.getClass();
            boolean zC = ar.h.c(hVar2.C(), hVar2.f29460m.f29505f1);
            List<qs.x> listI = tq.k.i(hVar2.C());
            gVar.getClass();
            gVar.b(new em.a(gVar, this.f60345b, zC, 4000, this.f60346c, listI, !uw0.a.a(x0VarC2), new q(gVar)));
        }
        a1 a1Var4 = hVar2.f29459l;
        if (a1Var4 == null || a1Var4.getDeviceApplicationInstallationId() == null || a1Var4.getDeviceApplicationInstallationId().intValue() <= 0) {
            j8 = j14;
        } else {
            Integer agentApplicationInstallationId = hVar2.f29459l.getAgentApplicationInstallationId();
            int iIntValue = agentApplicationInstallationId != null ? agentApplicationInstallationId.intValue() : 0;
            Integer deviceApplicationInstallationId = hVar2.f29459l.getDeviceApplicationInstallationId();
            j8 = j14;
            cw.e.a(gVar, new em.c(j8, iIntValue, deviceApplicationInstallationId != null ? deviceApplicationInstallationId.intValue() : 0, new r(gVar)));
        }
        if (z0.H(hVar2.C().f4358a)) {
            List<Long> listM = hVar2.f29459l.m();
            if (listM == null) {
                listM = p13.j0.f134944a;
            }
            if (listM.size() > 1) {
                arrayList.addAll(gVar.m());
            }
        }
        if (this.f60347d) {
            cw.e.a(gVar, new em.d(j8, new t(gVar)));
        }
        gVar.c(arrayList);
    }
}
