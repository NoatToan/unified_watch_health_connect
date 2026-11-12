package ct1;

import c2.q;
import c2.u;
import c2.w;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e2.f0;
import e23.r;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.mh;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p3.x3;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55490a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f55492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f55493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55495f;

    public /* synthetic */ e(int i14, float f14, j23.l lVar, x3 x3Var, e23.l lVar2) {
        this.f55491b = i14;
        this.f55492c = f14;
        this.f55494e = lVar;
        this.f55495f = x3Var;
        this.f55493d = lVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f55490a) {
            case 0:
                final w wVar = (w) this.f55494e;
                final zc.d dVar = (zc.d) this.f55495f;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                final int i14 = this.f55491b;
                final float f14 = this.f55492c;
                final e23.l lVar = this.f55493d;
                f0.f(f0Var, i14, null, new z3.e(2013453010, true, new r() { // from class: ct1.h
                    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
                    @Override // e23.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        float fJ;
                        int iIntValue = ((Integer) obj3).intValue();
                        p3.m mVar = (p3.m) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        ((e2.d) obj2).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
                        }
                        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                            x1 x1Var = p3.n.f135158a;
                            int i15 = i14;
                            w wVar2 = wVar;
                            if (i15 <= 1) {
                                fJ = wVar2.j();
                            } else {
                                float f15 = f14;
                                if (iIntValue == 0 || iIntValue == i15 - 1) {
                                    fJ = wVar2.j() - f15;
                                    g6.f.a aVar = g6.f.f75994b;
                                } else {
                                    g6.f.a aVar2 = g6.f.f75994b;
                                    fJ = wVar2.j() - (f15 * 2);
                                }
                            }
                            h4.r rVarH = x2.h(x2.u(h4.r.S, fJ), gl.b.q(mVar, R.dimen.trail_preview_view_box_height));
                            String strQ = y.Q(mVar, R.string.go_to_trail_photo_content_description);
                            e23.l lVar2 = lVar;
                            boolean zB = mVar.B(lVar2) | ((iIntValue2 & 112) == 32);
                            Object objQ = mVar.q();
                            if (zB) {
                                objQ = new au0.m(lVar2, iIntValue, 4);
                                mVar.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new au0.m(lVar2, iIntValue, 4);
                                    mVar.K(objQ);
                                }
                            }
                            h4.r rVarD = u1.w.d(rVarH, false, strQ, null, (e23.a) objQ, 13);
                            kt1.b bVar = (kt1.b) dVar.a(iIntValue);
                            String str = bVar != null ? bVar.f106449c : null;
                            t4.c cVar = new t4.c(com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar), null);
                            t4.c cVar2 = new t4.c(sn.a.b(mVar), null);
                            f5.k.f68985a.getClass();
                            jf.r.b(str, null, rVarD, cVar, cVar2, null, null, null, null, null, f5.k.a.f68987b, null, mVar, 48, 6, 31712);
                        } else {
                            mVar.e();
                        }
                        return Unit.INSTANCE;
                    }
                }), 6);
                break;
            default:
                final j23.l lVar2 = (j23.l) this.f55494e;
                final x3 x3Var = (x3) this.f55495f;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                final int i15 = 0;
                final float f15 = this.f55492c;
                f0.f(f0Var2, 1, null, new z3.e(1266847543, true, new r() { // from class: xg2.c
                    @Override // e23.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i16 = i15;
                        float f16 = f15;
                        e2.d dVar2 = (e2.d) obj2;
                        ((Integer) obj3).intValue();
                        m mVar = (m) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i16) {
                            case 0:
                                dVar2.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                                    x1 x1Var = n.f135158a;
                                    q.a(x2.h(h4.r.S, f16), mVar, 6);
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                dVar2.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                                    x1 x1Var2 = n.f135158a;
                                    q.a(x2.h(h4.r.S, f16), mVar, 6);
                                } else {
                                    mVar.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 6);
                final e23.l lVar3 = this.f55493d;
                f0.f(f0Var2, this.f55491b, null, new z3.e(-923780882, true, new r() { // from class: xg2.d
                    @Override // e23.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        x0 x0VarF;
                        int iIntValue = ((Integer) obj3).intValue();
                        m mVar = (m) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        ((e2.d) obj2).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
                        }
                        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                            x1 x1Var = n.f135158a;
                            int i16 = lVar2.f96796a + iIntValue;
                            boolean z14 = iIntValue + 1 == ((Number) x3Var.getF182175a()).intValue();
                            h4.r rVarH = x2.h(h4.r.S, f15);
                            h4.d.f81522a.getClass();
                            z0 z0VarD = q.d(h4.d.a.f81528f, false);
                            int iHashCode = Long.hashCode(mVar.getU());
                            i2 i2VarX = mVar.x();
                            h4.r rVarC = h4.k.c(rVarH, mVar);
                            h5.g.V.getClass();
                            e0.a aVar = h5.g.a.f81805b;
                            if (mVar.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, z0VarD, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            u uVar = u.f22885a;
                            if (z14) {
                                mVar.C(-22027998);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                x0VarF = d92.c.b(j92.f.f97932i, mVar);
                            } else {
                                mVar.C(-22026876);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                x0VarF = d92.c.f(j92.f.f97932i, mVar);
                            }
                            mVar.f();
                            x0 x0Var = x0VarF;
                            String str = (String) lVar3.invoke(Integer.valueOf(i16));
                            d6.h.f57752b.getClass();
                            mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 130046);
                            mVar.y();
                        } else {
                            mVar.e();
                        }
                        return Unit.INSTANCE;
                    }
                }), 6);
                final int i16 = 1;
                f0.f(f0Var2, 1, null, new z3.e(905425455, true, new r() { // from class: xg2.c
                    @Override // e23.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i17 = i16;
                        float f16 = f15;
                        e2.d dVar2 = (e2.d) obj2;
                        ((Integer) obj3).intValue();
                        m mVar = (m) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i17) {
                            case 0:
                                dVar2.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                                    x1 x1Var = n.f135158a;
                                    q.a(x2.h(h4.r.S, f16), mVar, 6);
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                dVar2.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                                    x1 x1Var2 = n.f135158a;
                                    q.a(x2.h(h4.r.S, f16), mVar, 6);
                                } else {
                                    mVar.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(int i14, w wVar, float f14, e23.l lVar, zc.d dVar) {
        this.f55491b = i14;
        this.f55494e = wVar;
        this.f55492c = f14;
        this.f55493d = lVar;
        this.f55495f = dVar;
    }
}
