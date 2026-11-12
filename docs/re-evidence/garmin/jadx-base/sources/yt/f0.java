package yt;

import com.google.android.material.internal.ViewUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import yg2.l0;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    public static final void a(h4.r rVar, g6.f fVar, float f14, List list, e23.l lVar, p3.m mVar, int i14) {
        float f15;
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-713298228);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(fVar) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.r(list) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(1715179257);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(z3.f.c(-675106801, new u((eu.g) it.next(), i16), o0VarE));
            }
            o0VarE.g0(false);
            if (fVar != null) {
                f15 = (f14 - fVar.f75997a) / 2;
            } else {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f15 = j92.b.f97899b.f97923h;
            }
            i53.f fVarJ = i53.a.j(arrayList);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f16 = j92.b.f97899b.f97920e;
            z1.u.a aVar = z1.u.a.f200875a;
            boolean zI = o0VarE.i(f15);
            Object objQ = o0VarE.q();
            if (zI) {
                objQ = new a03.o0(f15, 8);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a03.o0(f15, 8);
                    o0VarE.K(objQ);
                }
            }
            m82.d.b(rVar, fVarJ, 1.2711865f, (e23.p) objQ, f16, fVar, fVar, lVar, null, 0, false, aVar, o0VarE, (i15 & 14) | 384 | ((i15 << 12) & 458752) | ((i15 << 15) & 3670016) | ((i15 << 9) & 29360128), 54, ViewUtils.EDGE_TO_EDGE_FLAGS);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qb0.i(rVar, fVar, f14, list, lVar, i14, 2);
        }
    }

    public static final void b(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        aVar.getClass();
        o0 o0VarE = mVar.E(1155744892);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p3.v.a(t1.f91490h.c(e(o0VarE)), z3.f.c(1230514492, new b82.w(13, aVar, rVar), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.w(rVar, aVar, i14, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(h4.r rVar, List list, int i14, p3.m mVar, int i15) {
        List list2;
        int i16;
        list.getClass();
        o0 o0VarE = mVar.E(-1833169476);
        int i17 = (o0VarE.B(rVar) ? 4 : 2) | i15 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1442473905);
                eu.c cVar = eu.c.f66055a;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new l0(p1Var, 6);
                    o0VarE.K(objQ2);
                }
                int i18 = i17 >> 3;
                list2 = list;
                i16 = i14;
                cVar.b(list2, i16, (e23.a) objQ2, o0VarE, (i18 & 14) | 3456 | (i18 & 112));
                o0VarE.g0(false);
            } else {
                list2 = list;
                i16 = i14;
                o0VarE.C(-1442267290);
                o0VarE.g0(false);
            }
            p3.v.a(t1.f91490h.c(e(o0VarE)), z3.f.c(-1758399876, new xm0.h(19, rVar, p1Var), o0VarE), o0VarE, 56);
        } else {
            list2 = list;
            i16 = i14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c82.d(rVar, list2, i16, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final h4.r rVar, final n nVar, final e23.p pVar, p3.m mVar, final int i14) {
        h4.r rVar2;
        n nVar2;
        e23.p pVar2;
        nVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(2128203852);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(nVar) ? 32 : 16) | (o0VarE.r(pVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (((r) o53.f0.F(nVar.f199345f, r.INTRO, o0VarE, 48).getF182175a()) != r.SHARE) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i16 = 0;
                    p2VarI0.f135219d = new e23.p(rVar, nVar, pVar, i14, i16) { // from class: yt.t

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f199393a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ h4.r f199394b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ n f199395c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ e23.p f199396d;

                        {
                            this.f199393a = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i17 = this.f199393a;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i17) {
                                case 0:
                                    f0.d(this.f199394b, this.f199395c, this.f199396d, mVar2, p0.t(1));
                                    break;
                                default:
                                    f0.d(this.f199394b, this.f199395c, this.f199396d, mVar2, p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            rVar2 = rVar;
            nVar2 = nVar;
            pVar2 = pVar;
            c2.v.a(rVar2, null, false, z3.f.c(1880688566, new vv0.e(29, nVar2, pVar2), o0VarE), o0VarE, (i15 & 14) | 3072, 6);
        } else {
            rVar2 = rVar;
            nVar2 = nVar;
            pVar2 = pVar;
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            final h4.r rVar3 = rVar2;
            final int i17 = 1;
            final n nVar3 = nVar2;
            final e23.p pVar3 = pVar2;
            p2VarI1.f135219d = new e23.p(rVar3, nVar3, pVar3, i14, i17) { // from class: yt.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f199393a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f199394b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ n f199395c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.p f199396d;

                {
                    this.f199393a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f199393a;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            f0.d(this.f199394b, this.f199395c, this.f199396d, mVar2, p0.t(1));
                            break;
                        default:
                            f0.d(this.f199394b, this.f199395c, this.f199396d, mVar2, p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final g6.d e(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        g6.c cVar = (g6.c) mVar.A(t1.f91490h);
        float f69050b = cVar.getF69050b();
        float f69051c = cVar.getF69051c();
        if (f69051c > 1.6f) {
            f69051c = 1.6f;
        }
        return new g6.d(f69050b, f69051c);
    }
}
