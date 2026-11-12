package bk0;

import c2.t;
import com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity;
import e23.r;
import h2.c0;
import lc.v;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import vd0.l0;
import vd0.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18491d;

    public /* synthetic */ h(Object obj, tf0.i iVar, boolean z14, int i14) {
        this.f18488a = i14;
        this.f18490c = obj;
        this.f18491d = iVar;
        this.f18489b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x0153  */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, o13.l] */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f18488a;
        boolean z14 = this.f18489b;
        int i15 = 3;
        Object obj5 = this.f18491d;
        Object obj6 = this.f18490c;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((c0) obj).getClass();
                x1 x1Var = n.f135158a;
                j.a(((f) obj6).f18483f.get(iIntValue), !z14, (e23.l) obj5, (m) obj3, 0);
                break;
            case 1:
                AllDogsActivity allDogsActivity = (AllDogsActivity) obj6;
                e23.a aVar = (e23.a) obj5;
                m mVar = (m) obj3;
                ((Integer) obj4).getClass();
                AllDogsActivity.a aVar2 = AllDogsActivity.f34686g;
                ((r1.l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var2 = n.f135158a;
                oe0.l lVar = (oe0.l) allDogsActivity.f34687a.getValue();
                boolean zB = mVar.B(aVar);
                Object objQ = mVar.q();
                m.a aVar3 = m.f135153a;
                if (zB) {
                    objQ = new ux1.g(aVar, 11);
                    mVar.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ux1.g(aVar, 11);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar4 = (e23.a) objQ;
                boolean zR = mVar.r(allDogsActivity);
                Object objQ2 = mVar.q();
                if (zR) {
                    objQ2 = new vd0.v(allDogsActivity, i15);
                    mVar.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new vd0.v(allDogsActivity, i15);
                        mVar.K(objQ2);
                    }
                }
                e23.a aVar5 = (e23.a) objQ2;
                boolean zR2 = mVar.r(allDogsActivity);
                Object objQ3 = mVar.q();
                if (zR2) {
                    objQ3 = new s(allDogsActivity, 2);
                    mVar.K(objQ3);
                } else {
                    aVar3.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new s(allDogsActivity, 2);
                        mVar.K(objQ3);
                    }
                }
                e23.l lVar2 = (e23.l) objQ3;
                boolean zR3 = mVar.r(allDogsActivity);
                Object objQ4 = mVar.q();
                if (zR3) {
                    objQ4 = new vd0.v(allDogsActivity, 4);
                    mVar.K(objQ4);
                } else {
                    aVar3.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new vd0.v(allDogsActivity, 4);
                        mVar.K(objQ4);
                    }
                }
                e23.a aVar6 = (e23.a) objQ4;
                boolean zR4 = mVar.r(allDogsActivity);
                Object objQ5 = mVar.q();
                if (zR4) {
                    objQ5 = new vd0.v(allDogsActivity, 5);
                    mVar.K(objQ5);
                } else {
                    aVar3.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new vd0.v(allDogsActivity, 5);
                        mVar.K(objQ5);
                    }
                }
                e23.a aVar7 = (e23.a) objQ5;
                boolean zR5 = mVar.r(allDogsActivity);
                Object objQ6 = mVar.q();
                if (zR5) {
                    objQ6 = new vd0.v(allDogsActivity, 7);
                    mVar.K(objQ6);
                } else {
                    aVar3.getClass();
                    if (objQ6 == m.a.f135155b) {
                        objQ6 = new vd0.v(allDogsActivity, 7);
                        mVar.K(objQ6);
                    }
                }
                l0.b(lVar, this.f18489b, aVar4, aVar5, lVar2, aVar6, aVar7, (e23.a) objQ6, mVar, 8);
                break;
            case 2:
                u82.d dVar = (u82.d) obj6;
                tf0.i iVar = (tf0.i) obj5;
                o82.a aVar8 = (o82.a) obj2;
                boolean z15 = false;
                m mVar2 = (m) obj3;
                int iD = vb.h.d((Integer) obj4, (o82.g) obj, aVar8);
                if ((iD & 48) == 0) {
                    iD |= mVar2.B(aVar8) ? 32 : 16;
                }
                if ((iD & 145) != 144) {
                    z15 = true;
                }
                if (mVar2.n(iD & 1, z15)) {
                    x1 x1Var3 = n.f135158a;
                    u82.e.b(aVar8, dVar, null, false, z3.f.c(149504087, new h(aVar8, iVar, z14, i15), mVar2), mVar2, ((iD >> 3) & 14) | 27648, 4);
                } else {
                    mVar2.e();
                }
                break;
            default:
                o82.a aVar9 = (o82.a) obj6;
                tf0.i iVar2 = (tf0.i) obj5;
                u82.f fVar = (u82.f) obj2;
                m mVar3 = (m) obj3;
                int iC = vb.h.c((Integer) obj4, (t) obj, fVar);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                }
                if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                    x1 x1Var4 = n.f135158a;
                    wl.b.a((yl.d) fVar.a(), aVar9, iVar2, this.f18489b, mVar3, tf0.i.f164439d << 6);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(Object obj, boolean z14, o13.h hVar, int i14) {
        this.f18488a = i14;
        this.f18490c = obj;
        this.f18489b = z14;
        this.f18491d = hVar;
    }
}
