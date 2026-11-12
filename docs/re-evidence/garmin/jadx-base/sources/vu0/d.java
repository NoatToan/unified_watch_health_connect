package vu0;

import bv0.n2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity.b;
import e23.l;
import e23.p;
import l72.c1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveTrackActivity f180234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bv0.a f180235c;

    public /* synthetic */ d(bv0.a aVar, LiveTrackActivity liveTrackActivity) {
        this.f180233a = 2;
        this.f180235c = aVar;
        this.f180234b = liveTrackActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object bVar;
        sc.f fVar;
        m mVar;
        p1 p1Var;
        LiveTrackActivity liveTrackActivity;
        int i14 = this.f180233a;
        bv0.a aVar = this.f180235c;
        LiveTrackActivity liveTrackActivity2 = this.f180234b;
        int i15 = 2;
        boolean z14 = false;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar2 = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                LiveTrackActivity.a aVar2 = LiveTrackActivity.f38637g;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1267982155, new d(liveTrackActivity2, aVar, i16), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            case 1:
                m mVar3 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                LiveTrackActivity.a aVar3 = LiveTrackActivity.f38637g;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(liveTrackActivity2.getOnBackPressedDispatcher()), z3.f.c(1933312651, new d(aVar, liveTrackActivity2), mVar3), mVar3, 56);
                } else {
                    mVar3.e();
                }
                break;
            default:
                m mVar4 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                LiveTrackActivity.a aVar4 = LiveTrackActivity.f38637g;
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    bv0.a aVar5 = this.f180235c;
                    sc.f fVarT = oi0.c.T(new sc.j[]{aVar5}, mVar4);
                    Object objQ = mVar4.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        mVar4.K(objQ);
                    }
                    p1 p1Var2 = (p1) objQ;
                    LiveTrackActivity liveTrackActivity3 = this.f180234b;
                    boolean zR = mVar4.r(liveTrackActivity3) | mVar4.r(aVar5) | mVar4.r(fVarT);
                    Object objQ2 = mVar4.q();
                    if (zR || objQ2 == c2565a) {
                        bVar = liveTrackActivity3.new b(aVar5, fVarT, p1Var2, null);
                        fVar = fVarT;
                        mVar4.K(bVar);
                    } else {
                        fVar = fVarT;
                        bVar = objQ2;
                    }
                    l0.e((p) bVar, aVar5, mVar4);
                    wu0.d.c cVar = (wu0.d.c) liveTrackActivity3.da().f187246d.getF182175a();
                    Boolean bool = (Boolean) p1Var2.getF182175a();
                    bool.getClass();
                    boolean zR2 = mVar4.r(cVar) | mVar4.r(fVar);
                    Object objQ3 = mVar4.q();
                    if (zR2 || objQ3 == c2565a) {
                        objQ3 = new LiveTrackActivity.c(cVar, fVar, p1Var2, null);
                        mVar4.K(objQ3);
                    }
                    l0.f(cVar, bool, (p) objQ3, mVar4);
                    if (((Boolean) liveTrackActivity3.da().f187247e.getF182175a()).booleanValue()) {
                        mVar4.C(-192010629);
                        c1 c1Var = c1.f110940a;
                        String string = liveTrackActivity3.getString(R.string.common_network_reachability_error);
                        String string2 = liveTrackActivity3.getString(R.string.common_internet_connection_required);
                        String string3 = liveTrackActivity3.getString(R.string.lbl_ok);
                        string3.getClass();
                        boolean zR3 = mVar4.r(liveTrackActivity3);
                        Object objQ4 = mVar4.q();
                        if (zR3 || objQ4 == c2565a) {
                            objQ4 = new c(liveTrackActivity3, 8);
                            mVar4.K(objQ4);
                        }
                        p1Var = p1Var2;
                        liveTrackActivity = liveTrackActivity3;
                        c1Var.a(false, string, string2, null, null, string3, false, false, (e23.a) objQ4, null, null, mVar4, 0, 0, 1753);
                        mVar = mVar4;
                        mVar.f();
                    } else {
                        mVar = mVar4;
                        p1Var = p1Var2;
                        liveTrackActivity = liveTrackActivity3;
                        mVar.C(-191583945);
                        mVar.f();
                    }
                    if (((Boolean) p1Var.getF182175a()).booleanValue() || ((Boolean) liveTrackActivity.da().f187248f.getF182175a()).booleanValue() || !(((wu0.d.c) liveTrackActivity.da().f187246d.getF182175a()) == null || s.g(h0.n0(fVar), bv0.a.f.INSTANCE))) {
                        mVar.C(-191299086);
                        mVar.f();
                        liveTrackActivity.showProgressOverlay();
                    } else {
                        mVar.C(-191166127);
                        liveTrackActivity.hideProgressOverlay();
                        gv0.d dVar = (gv0.d) liveTrackActivity.f38639b.getValue();
                        yu0.f fVar2 = (yu0.f) liveTrackActivity.f38640c.getValue();
                        kv0.j jVar = (kv0.j) liveTrackActivity.f38641d.getValue();
                        boolean zR4 = mVar.r(fVar) | mVar.r(liveTrackActivity);
                        Object objQ5 = mVar.q();
                        if (zR4 || objQ5 == c2565a) {
                            objQ5 = new b(fVar, liveTrackActivity);
                            mVar.K(objQ5);
                        }
                        e23.a aVar6 = (e23.a) objQ5;
                        boolean zR5 = mVar.r(liveTrackActivity);
                        Object objQ6 = mVar.q();
                        if (zR5 || objQ6 == c2565a) {
                            objQ6 = new c(liveTrackActivity, z14 ? 1 : 0);
                            mVar.K(objQ6);
                        }
                        e23.a aVar7 = (e23.a) objQ6;
                        int i17 = liveTrackActivity.da().f187252j;
                        boolean zR6 = mVar.r(liveTrackActivity);
                        Object objQ7 = mVar.q();
                        if (zR6 || objQ7 == c2565a) {
                            objQ7 = new c(liveTrackActivity, i16);
                            mVar.K(objQ7);
                        }
                        e23.a aVar8 = (e23.a) objQ7;
                        boolean zR7 = mVar.r(liveTrackActivity) | mVar.r(fVar);
                        Object objQ8 = mVar.q();
                        if (zR7 || objQ8 == c2565a) {
                            objQ8 = new b(liveTrackActivity, fVar);
                            mVar.K(objQ8);
                        }
                        e23.a aVar9 = (e23.a) objQ8;
                        boolean zR8 = mVar.r(liveTrackActivity);
                        Object objQ9 = mVar.q();
                        if (zR8 || objQ9 == c2565a) {
                            objQ9 = new uo1.a(liveTrackActivity, 29);
                            mVar.K(objQ9);
                        }
                        l lVar = (l) objQ9;
                        boolean zR9 = mVar.r(liveTrackActivity);
                        Object objQ10 = mVar.q();
                        if (zR9 || objQ10 == c2565a) {
                            objQ10 = new c(liveTrackActivity, i15);
                            mVar.K(objQ10);
                        }
                        e23.a aVar10 = (e23.a) objQ10;
                        boolean zR10 = mVar.r(liveTrackActivity);
                        Object objQ11 = mVar.q();
                        if (zR10 || objQ11 == c2565a) {
                            objQ11 = new c(liveTrackActivity, 3);
                            mVar.K(objQ11);
                        }
                        sc.f.Companion companion = sc.f.INSTANCE;
                        m mVar5 = mVar;
                        n2.a(fVar, dVar, fVar2, jVar, aVar6, aVar7, i17, aVar8, aVar9, lVar, aVar10, (e23.a) objQ11, mVar5, 0);
                        mVar5.f();
                    }
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(LiveTrackActivity liveTrackActivity, bv0.a aVar, int i14) {
        this.f180233a = i14;
        this.f180234b = liveTrackActivity;
        this.f180235c = aVar;
    }
}
