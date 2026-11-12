package n40;

import b82.r0;
import e23.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import qw0.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123583a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f123584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f123585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f123586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m40.b f123587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f123588f;

    public /* synthetic */ h(boolean z14, m40.b bVar, p pVar, boolean z15, boolean z16) {
        this.f123584b = z14;
        this.f123587e = bVar;
        this.f123588f = pVar;
        this.f123585c = z15;
        this.f123586d = z16;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f123583a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean z14 = this.f123584b;
                    m40.b bVar = this.f123587e;
                    p pVar = this.f123588f;
                    p3.m.a aVar = p3.m.f135153a;
                    if (z14) {
                        mVar.C(1005357563);
                        v vVar = v.POPULARITY_HEATMAP;
                        boolean z15 = bVar.f116575a;
                        boolean zB = mVar.B(pVar);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new r0(pVar, 7);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new r0(pVar, 7);
                                mVar.K(objQ);
                            }
                        }
                        gg.b.i(vVar, false, z15, (e23.l) objQ, mVar, 6, 2);
                        mVar.f();
                    } else {
                        mVar.C(1005629526);
                        mVar.f();
                    }
                    if (((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c()) {
                        mVar.C(1005711273);
                        if (this.f123585c) {
                            mVar.C(1005788804);
                            v vVar2 = v.HIGH_TRAFFIC_ROADS;
                            boolean z16 = bVar.f116577c;
                            boolean zB2 = mVar.B(pVar);
                            Object objQ2 = mVar.q();
                            if (zB2) {
                                objQ2 = new r0(pVar, 8);
                                mVar.K(objQ2);
                            } else {
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new r0(pVar, 8);
                                    mVar.K(objQ2);
                                }
                            }
                            gg.b.i(vVar2, false, z16, (e23.l) objQ2, mVar, 6, 2);
                            mVar.f();
                        } else {
                            mVar.C(1006082870);
                            mVar.f();
                        }
                        mVar.f();
                    } else {
                        mVar.C(1006092790);
                        mVar.f();
                    }
                    if (this.f123586d) {
                        mVar.C(1006164586);
                        v vVar3 = v.UNPAVED_ROADS;
                        boolean z17 = bVar.f116579e;
                        boolean zB3 = mVar.B(pVar);
                        Object objQ3 = mVar.q();
                        if (zB3) {
                            objQ3 = new r0(pVar, 9);
                            mVar.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new r0(pVar, 9);
                                mVar.K(objQ3);
                            }
                        }
                        gg.b.i(vVar3, false, z17, (e23.l) objQ3, mVar, 6, 2);
                        mVar.f();
                    } else {
                        mVar.C(1006422134);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ge1.b.c(this.f123584b, this.f123585c, this.f123586d, this.f123587e, this.f123588f, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(boolean z14, boolean z15, boolean z16, m40.b bVar, p pVar, int i14) {
        this.f123584b = z14;
        this.f123585c = z15;
        this.f123586d = z16;
        this.f123587e = bVar;
        this.f123588f = pVar;
    }
}
