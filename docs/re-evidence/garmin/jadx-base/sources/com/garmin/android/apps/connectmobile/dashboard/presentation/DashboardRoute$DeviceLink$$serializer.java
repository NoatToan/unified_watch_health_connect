package com.garmin.android.apps.connectmobile.dashboard.presentation;

import l63.f;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute.DeviceLink.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardRoute$DeviceLink;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
public final /* synthetic */ class DashboardRoute$DeviceLink$$serializer implements e0<DashboardRoute.DeviceLink> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DashboardRoute$DeviceLink$$serializer f33493a;
    private static final k63.e descriptor;

    static {
        DashboardRoute$DeviceLink$$serializer dashboardRoute$DeviceLink$$serializer = new DashboardRoute$DeviceLink$$serializer();
        f33493a = dashboardRoute$DeviceLink$$serializer;
        m1 m1Var = new m1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.DeviceLink", dashboardRoute$DeviceLink$$serializer, 3);
        m1Var.j("macAddress", false);
        m1Var.j("deviceName", true);
        m1Var.j("productNumber", true);
        descriptor = m1Var;
    }

    private DashboardRoute$DeviceLink$$serializer() {
    }

    @Override // m63.e0
    public final i63.c<?>[] childSerializers() {
        y1 y1Var = y1.f117048a;
        return new i63.c[]{y1Var, j63.a.d(y1Var), j63.a.d(y1Var)};
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        k63.e eVar2 = descriptor;
        l63.c cVarC = eVar.c(eVar2);
        int i14 = l63.c.f110557a;
        boolean z14 = true;
        int i15 = 0;
        String strR = null;
        String str = null;
        String str2 = null;
        while (z14) {
            int iE = cVarC.e(eVar2);
            if (iE == -1) {
                z14 = false;
            } else if (iE == 0) {
                strR = cVarC.r(eVar2, 0);
                i15 |= 1;
            } else if (iE == 1) {
                str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                i15 |= 2;
            } else {
                if (iE != 2) {
                    hb.a.o(iE);
                    return null;
                }
                str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
                i15 |= 4;
            }
        }
        cVarC.b(eVar2);
        return new DashboardRoute.DeviceLink(i15, strR, str, str2, (u1) null);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return descriptor;
    }

    @Override // i63.i
    public final void serialize(f fVar, Object obj) {
        DashboardRoute.DeviceLink deviceLink = (DashboardRoute.DeviceLink) obj;
        deviceLink.getClass();
        k63.e eVar = descriptor;
        l63.d dVarC = fVar.c(eVar);
        String str = deviceLink.f33490b;
        String str2 = deviceLink.f33492d;
        String str3 = deviceLink.f33491c;
        dVarC.k(eVar, 0, str);
        if (dVarC.C(eVar) || str3 != null) {
            dVarC.d(eVar, 1, y1.f117048a, str3);
        }
        if (dVarC.C(eVar) || str2 != null) {
            dVarC.d(eVar, 2, y1.f117048a, str2);
        }
        dVarC.b(eVar);
    }
}
