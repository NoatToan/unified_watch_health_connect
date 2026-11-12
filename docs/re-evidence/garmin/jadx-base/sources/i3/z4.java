package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class z4 implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3.e0 f90529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3.h0 f90530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f90531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f90532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f90533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l3.d0 f90534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l3 f90535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bc f90536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b3 f90537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List<p5.g> f90538j;

    /* JADX WARN: Multi-variable type inference failed */
    public z4(l3.e0 e0Var, l3.h0 h0Var, Long l14, Long l15, e23.l<? super Long, Unit> lVar, l3.d0 d0Var, l3 l3Var, bc bcVar, b3 b3Var, List<p5.g> list) {
        this.f90529a = e0Var;
        this.f90530b = h0Var;
        this.f90531c = l14;
        this.f90532d = l15;
        this.f90533e = lVar;
        this.f90534f = d0Var;
        this.f90535g = l3Var;
        this.f90536h = bcVar;
        this.f90537i = b3Var;
        this.f90538j = list;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0148  */
    /* JADX WARN: Code duplicated, block: B:48:0x0153  */
    /* JADX WARN: Code duplicated, block: B:50:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:55:0x0163  */
    /* JADX WARN: Code duplicated, block: B:57:0x0167  */
    /* JADX WARN: Code duplicated, block: B:58:0x016d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0170  */
    /* JADX WARN: Code duplicated, block: B:62:0x0176  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        Long l14;
        cc ccVar;
        l3.d0 d0VarB;
        l3.d0 d0VarB2;
        long j8;
        long j14;
        int i15;
        Object ccVar2;
        long j15;
        long j16;
        boolean z14;
        boolean z15;
        int i16;
        int i17;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            l3.h0 h0VarK = this.f90529a.k(this.f90530b, iIntValue);
            h4.r rVarE = dVar2.e(h4.r.S);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarE, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar);
            } else {
                mVar2.c();
            }
            p3.b4.c(h5.g.a.f81810g, zVarA, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.b0 b0Var = c2.b0.f22601a;
            n3.n.f123126a.getClass();
            s5.x0 x0VarA = sj.a(n3.n.A, mVar2);
            l3 l3Var = this.f90535g;
            l3.e0 e0Var = this.f90529a;
            List<p5.g> list = this.f90538j;
            b3 b3Var = this.f90537i;
            mh.a(x0VarA, z3.f.c(-577031469, new y4(l3Var, h0VarK, e0Var, list, b3Var), mVar2), mVar2, 48);
            Long l15 = this.f90531c;
            Long l16 = this.f90532d;
            if (l15 == null || l16 == null) {
                e0Var = e0Var;
                l14 = l15;
                b3Var = b3Var;
                mVar2.C(186488258);
                mVar2.f();
                ccVar = null;
            } else {
                mVar2.C(185956701);
                boolean zB = mVar2.B(l15) | mVar2.B(l16);
                Object objQ = mVar2.q();
                if (zB) {
                    cc.a aVar2 = cc.f87759e;
                    l14 = l15;
                    d0VarB = e0Var.b(l14.longValue());
                    d0VarB2 = e0Var.b(l16.longValue());
                    aVar2.getClass();
                    j8 = d0VarB.f109211d;
                    j14 = h0VarK.f109265f;
                    i15 = h0VarK.f109263d;
                    if (j8 <= j14) {
                        j15 = d0VarB2.f109211d;
                        j16 = h0VarK.f109264e;
                        if (j15 < j16) {
                            ccVar2 = null;
                        } else {
                            if (j8 >= j16) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (j15 <= j14) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                i16 = (d0VarB.f109210c + i15) - 1;
                            } else {
                                i16 = i15;
                            }
                            if (z15) {
                                i17 = d0VarB2.f109210c;
                            } else {
                                i17 = h0VarK.f109262c;
                            }
                            int i18 = (i15 + i17) - 1;
                            long j17 = (((long) (i16 % 7)) << 32) | (((long) (i16 / 7)) & 4294967295L);
                            g6.k.a aVar3 = g6.k.f76003b;
                            ccVar2 = new cc(j17, (((long) (i18 % 7)) << 32) | (((long) (i18 / 7)) & 4294967295L), z14, z15, null);
                        }
                    } else {
                        ccVar2 = null;
                    }
                    mVar2.K(ccVar2);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        cc.a aVar4 = cc.f87759e;
                        l14 = l15;
                        d0VarB = e0Var.b(l14.longValue());
                        d0VarB2 = e0Var.b(l16.longValue());
                        aVar4.getClass();
                        j8 = d0VarB.f109211d;
                        j14 = h0VarK.f109265f;
                        i15 = h0VarK.f109263d;
                        if (j8 <= j14) {
                            j15 = d0VarB2.f109211d;
                            j16 = h0VarK.f109264e;
                            if (j15 < j16) {
                                ccVar2 = null;
                            } else {
                                if (j8 >= j16) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (j15 <= j14) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z14) {
                                    i16 = (d0VarB.f109210c + i15) - 1;
                                } else {
                                    i16 = i15;
                                }
                                if (z15) {
                                    i17 = d0VarB2.f109210c;
                                } else {
                                    i17 = h0VarK.f109262c;
                                }
                                int i19 = (i15 + i17) - 1;
                                long j18 = (((long) (i16 % 7)) << 32) | (((long) (i16 / 7)) & 4294967295L);
                                g6.k.a aVar5 = g6.k.f76003b;
                                ccVar2 = new cc(j18, (((long) (i19 % 7)) << 32) | (((long) (i19 / 7)) & 4294967295L), z14, z15, null);
                            }
                        } else {
                            ccVar2 = null;
                        }
                        mVar2.K(ccVar2);
                    } else {
                        ccVar2 = objQ;
                        l14 = l15;
                    }
                }
                mVar2.f();
                ccVar = (cc) ccVar2;
            }
            x3.i(h0VarK, this.f90533e, this.f90534f.f109211d, l14, l16, ccVar, l3Var, this.f90536h, b3Var, e0Var.f109226a, mVar2, 0);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
