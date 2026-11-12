package com.garmin.android.apps.connectmobile.dashboard.presentation;

import l63.f;
import m63.e0;
import m63.g;
import m63.m1;
import m63.u1;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute.HomeSettings.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$HomeSettings;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
public final /* synthetic */ class DashboardRoute$HomeSettings$$serializer implements e0<DashboardRoute.HomeSettings> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DashboardRoute$HomeSettings$$serializer f33498a;
    private static final k63.e descriptor;

    static {
        DashboardRoute$HomeSettings$$serializer dashboardRoute$HomeSettings$$serializer = new DashboardRoute$HomeSettings$$serializer();
        f33498a = dashboardRoute$HomeSettings$$serializer;
        m1 m1Var = new m1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.HomeSettings", dashboardRoute$HomeSettings$$serializer, 1);
        m1Var.j("setupFlow", true);
        descriptor = m1Var;
    }

    private DashboardRoute$HomeSettings$$serializer() {
    }

    @Override // m63.e0
    public final i63.c<?>[] childSerializers() {
        return new i63.c[]{g.f116948a};
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        k63.e eVar2 = descriptor;
        l63.c cVarC = eVar.c(eVar2);
        int i14 = l63.c.f110557a;
        boolean z14 = true;
        int i15 = 0;
        boolean zG = false;
        while (z14) {
            int iE = cVarC.e(eVar2);
            if (iE == -1) {
                z14 = false;
            } else {
                if (iE != 0) {
                    hb.a.o(iE);
                    return null;
                }
                zG = cVarC.g(eVar2, 0);
                i15 = 1;
            }
        }
        cVarC.b(eVar2);
        return new DashboardRoute.HomeSettings(i15, zG, (u1) null);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return descriptor;
    }

    @Override // i63.i
    public final void serialize(f fVar, Object obj) {
        DashboardRoute.HomeSettings homeSettings = (DashboardRoute.HomeSettings) obj;
        homeSettings.getClass();
        boolean z14 = homeSettings.f33497b;
        k63.e eVar = descriptor;
        l63.d dVarC = fVar.c(eVar);
        if (dVarC.C(eVar) || z14) {
            dVarC.n(eVar, 0, z14);
        }
        dVarC.b(eVar);
    }
}
