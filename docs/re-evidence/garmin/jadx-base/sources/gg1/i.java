package gg1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.StepLengthDTO;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.a f77246b;

    public /* synthetic */ i(com.garmin.android.apps.connectmobile.settings.a aVar, int i14) {
        this.f77245a = i14;
        this.f77246b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f77245a;
        com.garmin.android.apps.connectmobile.settings.a aVar = this.f77246b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a = com.garmin.android.apps.connectmobile.settings.a.Y;
                int i15 = com.garmin.android.apps.connectmobile.settings.a.b.f41593b[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    g22.e.l(aVar);
                } else if (i15 == 2) {
                    aVar.X6();
                } else {
                    if (i15 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    a2 a2Var = a2.SETTINGS;
                    String strM = am.j.m("Error deleting Custom Running Step Length to GC [", g3Var.f35302c, "].");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "CustomStrideLengthSettingsFragment", strM);
                    aVar.G6();
                    aVar.X6();
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a2 = com.garmin.android.apps.connectmobile.settings.a.Y;
                int i16 = com.garmin.android.apps.connectmobile.settings.a.b.f41593b[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    g22.e.l(aVar);
                } else if (i16 == 2) {
                    aVar.X6();
                } else {
                    if (i16 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    a2 a2Var2 = a2.SETTINGS;
                    String strM2 = am.j.m("Error deleting Custom Walking Step Length to GC [", g3Var.f35302c, "].");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "CustomStrideLengthSettingsFragment", strM2);
                    aVar.G6();
                    aVar.X6();
                }
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a3 = com.garmin.android.apps.connectmobile.settings.a.Y;
                g3Var.getClass();
                fw.p pVar = g3Var.f35300a;
                StepLengthDTO stepLengthDTO = (StepLengthDTO) g3Var.f35301b;
                Exception exc = g3Var.f35303d;
                aVar.B = stepLengthDTO;
                int i17 = com.garmin.android.apps.connectmobile.settings.a.b.f41593b[pVar.ordinal()];
                if (i17 == 1) {
                    g22.e.l(aVar);
                } else if (i17 == 2) {
                    if (aVar.B == null) {
                        aVar.G6();
                    }
                    z0 z0VarA = z0.a();
                    Context contextRequireContext = aVar.requireContext();
                    StepLengthDTO stepLengthDTO2 = aVar.B;
                    z0VarA.getClass();
                    z0.c(contextRequireContext, stepLengthDTO2);
                    aVar.f41590y--;
                    aVar.S6();
                } else {
                    if (i17 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    aVar.f41590y--;
                    a2 a2Var3 = a2.SETTINGS;
                    String strM3 = am.j.m("Error getting Custom Walking Step Length to GC [", exc != null ? exc.getMessage() : null, "].");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var3, "CustomStrideLengthSettingsFragment", strM3);
                    aVar.G6();
                    g22.e.f(aVar);
                    aVar.J6();
                }
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a4 = com.garmin.android.apps.connectmobile.settings.a.Y;
                g3Var.getClass();
                fw.p pVar2 = g3Var.f35300a;
                StepLengthDTO stepLengthDTO3 = (StepLengthDTO) g3Var.f35301b;
                Exception exc2 = g3Var.f35303d;
                aVar.C = stepLengthDTO3;
                int i18 = com.garmin.android.apps.connectmobile.settings.a.b.f41593b[pVar2.ordinal()];
                if (i18 == 1) {
                    g22.e.l(aVar);
                } else if (i18 == 2) {
                    if (aVar.C == null) {
                        aVar.G6();
                    }
                    z0 z0VarA2 = z0.a();
                    Context contextRequireContext2 = aVar.requireContext();
                    StepLengthDTO stepLengthDTO4 = aVar.C;
                    z0VarA2.getClass();
                    z0.b(contextRequireContext2, stepLengthDTO4);
                    aVar.f41590y--;
                    aVar.S6();
                } else {
                    if (i18 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    aVar.f41590y--;
                    a2 a2Var4 = a2.SETTINGS;
                    String strM4 = am.j.m("Error getting Custom Running Step Length to GC [", exc2 != null ? exc2.getMessage() : null, "].");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var4, "CustomStrideLengthSettingsFragment", strM4);
                    aVar.G6();
                    g22.e.f(aVar);
                    aVar.J6();
                }
                return Unit.INSTANCE;
            case 4:
                com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a5 = com.garmin.android.apps.connectmobile.settings.a.Y;
                g3Var.getClass();
                fw.p pVar3 = g3Var.f35300a;
                Exception exc3 = g3Var.f35303d;
                int i19 = com.garmin.android.apps.connectmobile.settings.a.b.f41593b[pVar3.ordinal()];
                if (i19 == 1) {
                    g22.e.l(aVar);
                } else if (i19 == 2) {
                    aVar.X6();
                } else {
                    if (i19 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    a2 a2Var5 = a2.SETTINGS;
                    String strH = f3.h(exc3, "Error saving Custom Walking Step Length to GC [", "].");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var5, "CustomStrideLengthSettingsFragment", strH);
                    aVar.G6();
                    aVar.X6();
                }
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a6 = com.garmin.android.apps.connectmobile.settings.a.Y;
                g3Var.getClass();
                fw.p pVar4 = g3Var.f35300a;
                Exception exc4 = g3Var.f35303d;
                int i24 = com.garmin.android.apps.connectmobile.settings.a.b.f41593b[pVar4.ordinal()];
                if (i24 == 1) {
                    g22.e.l(aVar);
                } else if (i24 == 2) {
                    aVar.X6();
                } else {
                    if (i24 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    a2 a2Var6 = a2.SETTINGS;
                    String strH2 = f3.h(exc4, "Error saving Custom Walking Step Length to GC [", "].");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var6, "CustomStrideLengthSettingsFragment", strH2);
                    aVar.G6();
                    aVar.X6();
                }
                return Unit.INSTANCE;
        }
    }
}
