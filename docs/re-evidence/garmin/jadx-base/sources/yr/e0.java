package yr;

import c2.x2;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f198857a;

        static {
            int[] iArr = new int[jr.j.values().length];
            try {
                iArr[jr.j.EVALUATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jr.j.NAVIGATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jr.j.DEVICES_AND_APPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f198857a = iArr;
        }
    }

    public static final void a(final nr.g.k kVar, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        final int i15;
        p3.o0 o0VarE = mVar.E(-50994146);
        int i16 = (o0VarE.r(kVar) ? 4 : 2) | i14;
        final int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            List<Object> list = kVar.f127082c;
            if (list == null || list.isEmpty()) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p(kVar, i14, i17) { // from class: yr.d0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f198855a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ nr.g.k f198856b;

                        {
                            this.f198855a = i17;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = this.f198855a;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    e0.a(this.f198856b, mVar2, p3.p0.t(1));
                                    break;
                                default:
                                    e0.a(this.f198856b, mVar2, p3.p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            h4.r.a aVar = h4.r.S;
            h4.r rVarY = x2.y(u1.n.e(aVar, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), null, 3);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarY, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = kVar.f127081b;
            if (str == null) {
                str = "";
            }
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97930g;
            long jB = d92.b.a(o0VarE).k().b();
            bVar.getClass();
            float f14 = eVar.f97920e;
            bVar.getClass();
            i15 = 1;
            mh.c(str, c2.l.C(aVar, f14, eVar.f97920e, 0.0f, 0.0f, 12), jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
            o0Var = o0VarE;
            jr.j jVar = kVar.f127080a;
            int i18 = jVar == null ? -1 : a.f198857a[jVar.ordinal()];
            if (i18 == 1) {
                o0Var.C(98522358);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof nr.e) {
                        arrayList.add(obj);
                    }
                }
                zr.h.c(arrayList, o0Var, 0);
                o0Var.g0(false);
            } else if (i18 == 2) {
                o0Var.C(98685046);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof nr.f) {
                        arrayList2.add(obj2);
                    }
                }
                zr.i.a(arrayList2, o0Var, 0);
                o0Var.g0(false);
            } else if (i18 != 3) {
                o0Var.C(99031595);
                o0Var.g0(false);
            } else {
                o0Var.C(98854957);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof nr.d) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    p13.d0.v(arrayList4, ((nr.d) it.next()).f127004a);
                }
                zr.b.b(arrayList4, o0Var, 0);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new e23.p(kVar, i14, i15) { // from class: yr.d0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f198855a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ nr.g.k f198856b;

                {
                    this.f198855a = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj4, Object obj5) {
                    int i19 = this.f198855a;
                    p3.m mVar2 = (p3.m) obj4;
                    ((Integer) obj5).getClass();
                    switch (i19) {
                        case 0:
                            e0.a(this.f198856b, mVar2, p3.p0.t(1));
                            break;
                        default:
                            e0.a(this.f198856b, mVar2, p3.p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
