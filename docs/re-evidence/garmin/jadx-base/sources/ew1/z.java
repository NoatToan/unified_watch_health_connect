package ew1;

import android.content.Intent;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f66879b;

    public /* synthetic */ z(d0 d0Var, int i14) {
        this.f66878a = i14;
        this.f66879b = d0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f66878a;
        d0 d0Var = this.f66879b;
        switch (i14) {
            case 0:
                d0.a aVar = d0.f66371e;
                if (((Boolean) obj).booleanValue()) {
                    wt1.a aVar2 = (wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null);
                    androidx.fragment.app.m mVarRequireActivity = d0Var.requireActivity();
                    mVarRequireActivity.getClass();
                    aVar2.f(mVarRequireActivity);
                    ((androidx.lifecycle.y0) d0Var.w6().J1.getValue()).m(Boolean.FALSE);
                }
                break;
            case 1:
                xw1.o oVar = (xw1.o) obj;
                d0.a aVar3 = d0.f66371e;
                if (oVar != null) {
                    com.garmin.android.apps.connectmobile.training.atp.create.video.a.C0871a c0871a = com.garmin.android.apps.connectmobile.training.atp.create.video.a.f45334d;
                    androidx.fragment.app.m activity = d0Var.getActivity();
                    c0871a.getClass();
                    Intent intentA = com.garmin.android.apps.connectmobile.training.atp.create.video.a.C0871a.a(activity, oVar);
                    if (intentA != null) {
                        d0Var.startActivity(intentA);
                    }
                }
                break;
            case 2:
                xw1.h hVar = (xw1.h) obj;
                d0.a aVar4 = d0.f66371e;
                hVar.getClass();
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachATPPlanSelected");
                aw1.h hVarW6 = d0Var.w6();
                hVarW6.g8(null);
                hVarW6.f8(hVar);
                hVarW6.i8(vt1.m.STATIC);
                hVarW6.F6();
                break;
            case 3:
                tw1.c cVar = (tw1.c) obj;
                d0.a aVar5 = d0.f66371e;
                cVar.getClass();
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachITPPlanSelected");
                aw1.h hVarW7 = d0Var.w6();
                hVarW7.f8(null);
                hVarW7.g8(cVar);
                hVarW7.i8(vt1.m.ITP);
                hVarW7.F6();
                break;
            default:
                d0.a aVar6 = d0.f66371e;
                ((f.a) obj).getClass();
                aw1.h hVarW8 = d0Var.w6();
                ge1.b.T(androidx.lifecycle.v1.a(hVarW8), null, null, new aw1.n(hVarW8, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
