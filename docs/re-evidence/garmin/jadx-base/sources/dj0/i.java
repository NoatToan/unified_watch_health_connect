package dj0;

import b82.g1;
import b82.k1;
import b82.y1;
import c2.x2;
import c2.z;
import c42.d0;
import com.google.maps.android.compose.u;
import e23.p;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m92.h0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.x;
import p13.y;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ftp.reports.presentation.composables.screen.FtpReportScreenKt$FtpReportScreen$1$3$1$1$1", f = "FtpReportScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<yi0.c, Unit> f59918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yi0.c f59919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super yi0.c, Unit> lVar, yi0.c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f59918a = lVar;
            this.f59919b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f59918a, this.f59919b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f59918a.invoke(this.f59919b);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x015b  */
    public static final void a(yi0.c cVar, yi0.b bVar, gj0.f fVar, e23.l<? super yi0.b, Unit> lVar, p3.m mVar, int i14) {
        float f14;
        i53.d<yi0.b, i53.c<h0.e.a>> dVar;
        i53.e eVar;
        o0 o0VarE = mVar.E(-1457761999);
        int i15 = (i14 & 6) == 0 ? (o0VarE.k(cVar.ordinal()) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(bVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            List<yi0.b> listB1 = (fVar == null || (dVar = fVar.f77512a) == null || (eVar = (i53.e) dVar.keySet()) == null) ? null : p13.h0.b1(eVar);
            if (listB1 == null) {
                listB1 = j0.f134944a;
            }
            yi0.b bVar2 = listB1.contains(bVar) ? bVar : (yi0.b) p13.h0.d0(listB1);
            if (listB1.size() > 1) {
                o0VarE.C(-1772873393);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarC = c2.l.C(aVar, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                bVar3.getClass();
                h4.r rVarA = c2.l.A(rVarC, eVar2.f97920e, 0.0f, 2);
                o0VarE.C(-749919663);
                ArrayList arrayList = new ArrayList(y.r(listB1, 10));
                for (yi0.b bVar4 : listB1) {
                    arrayList.add(new g1(gl1.y.Q(o0VarE, bVar4.f197330a), null, gl1.y.Q(o0VarE, bVar4.f197331b), null, 10, null));
                }
                o0VarE.g0(false);
                i53.c cVarE = i53.a.e(arrayList);
                Iterator it = listB1.iterator();
                int i16 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i16 = -1;
                        break;
                    } else if (((yi0.b) it.next()) == bVar2) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i16 < 0) {
                    i16 = 0;
                }
                boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(listB1);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new d0(lVar, listB1, 1);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new d0(lVar, listB1, 1);
                        o0VarE.K(objQ);
                    }
                }
                f14 = 0.0f;
                k1.a(cVarE, i16, rVarA, null, 0.0f, (e23.l) objQ, o0VarE, 3072, 16);
                o0VarE.g0(false);
            } else {
                f14 = 0.0f;
                o0VarE.C(-1772096719);
                o0VarE.g0(false);
            }
            if (bVar2 != null) {
                o0VarE.C(-1772045755);
                h4.r.a aVar2 = h4.r.S;
                h4.r rVarF = x2.f(aVar2, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f15 = eVar3.f97921f;
                float f16 = eVar3.f97920e;
                h4.r rVarC2 = c2.l.C(rVarF, 0.0f, f15, 0.0f, 0.0f, 13);
                bVar5.getClass();
                h4.r rVarA2 = c2.l.A(rVarC2, f16, f14, 2);
                String strQ = gl1.y.Q(o0VarE, bVar2.f197331b);
                d92.b.f58624b.getClass();
                g02.c.a(strQ, rVarA2, 0L, null, 0, false, 2, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), 0.0d, o0VarE, 1572864, 316);
                bVar5.getClass();
                bj0.c.a(cVar, bVar2, fVar, c2.l.A(aVar2, f16, f14, 2), 0.0f, 0.0f, 0.0f, 0, o0VarE, i15 & 910);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1771449935);
                o0VarE.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(cVar, bVar, fVar, lVar, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b5  */
    public static final void b(gj0.a aVar, gj0.d dVar, yi0.c cVar, yi0.b bVar, e23.l<? super yi0.c, Unit> lVar, e23.l<? super yi0.b, Unit> lVar2, p3.m mVar, int i14) {
        i53.d<yi0.c, gj0.e> dVar2;
        boolean z14;
        yi0.c cVar2;
        gj0.f fVar;
        cVar.getClass();
        bVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(814350542);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.k(cVar.ordinal()) ? 256 : 128) | (o0VarE.k(bVar.ordinal()) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if ((aVar != null ? aVar.f77487a : null) != null) {
                i53.d<yi0.c, gj0.e> dVar3 = aVar.f77487a;
                if (dVar3.size() > 1) {
                    o0VarE.C(-1697130393);
                    y1 y1Var = y1.f16902a;
                    o0VarE.C(776540381);
                    Set<yi0.c> setKeySet = dVar3.keySet();
                    ArrayList arrayList = new ArrayList(y.r(setKeySet, 10));
                    Iterator<T> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(gl1.y.Q(o0VarE, ((yi0.c) it.next()).f197342d));
                    }
                    o0VarE.g0(false);
                    i53.c<String> cVarE = i53.a.e(arrayList);
                    Iterator<T> it3 = dVar3.keySet().iterator();
                    int i16 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i16 = -1;
                            break;
                        }
                        Object next = it3.next();
                        if (i16 < 0) {
                            x.q();
                            throw null;
                        }
                        if (((yi0.c) next) == cVar) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    int i17 = i16 < 0 ? 0 : i16;
                    z3.e eVarC = z3.f.c(-1615150859, new ak0.j(aVar, bVar, dVar, lVar2, lVar, 15), o0VarE);
                    y1 y1Var2 = y1.f16902a;
                    y1Var.c(cVarE, i17, false, true, true, 0L, 0L, eVarC, o0VarE, 12610560, 100);
                    o0VarE.g0(false);
                    z14 = true;
                } else {
                    if (aVar != null) {
                        dVar2 = aVar.f77487a;
                    } else {
                        dVar2 = null;
                    }
                    if (dVar2 != null || dVar2.isEmpty()) {
                        o0VarE.C(-1695227551);
                        n.a(null, o0VarE, 0);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1695961290);
                        yi0.c cVar3 = (yi0.c) p13.h0.a0(aVar.f77487a.keySet());
                        h4.r rVarF = x2.f(aVar2, 1.0f);
                        d92.b.f58623a.getClass();
                        j92.b bVar3 = d92.b.f58625c;
                        bVar3.getClass();
                        j92.e eVar = j92.b.f97899b;
                        h4.r rVarC2 = c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                        bVar3.getClass();
                        h4.r rVarA = c2.l.A(rVarC2, eVar.f97920e, 0.0f, 2);
                        String strQ = gl1.y.Q(o0VarE, cVar3.f197342d);
                        d92.b.f58624b.getClass();
                        mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
                        if (dVar != null) {
                            o0VarE = o0VarE;
                            cVar2 = cVar3;
                            fVar = dVar.f77496a.get(cVar2);
                        } else {
                            o0VarE = o0VarE;
                            cVar2 = cVar3;
                            fVar = null;
                        }
                        a(cVar2, bVar, fVar, lVar2, o0VarE, (i15 >> 6) & 7280);
                        o0VarE.g0(false);
                    }
                    z14 = true;
                }
            } else {
                if (aVar != null) {
                    dVar2 = aVar.f77487a;
                } else {
                    dVar2 = null;
                }
                if (dVar2 != null) {
                    o0VarE.C(-1695227551);
                    n.a(null, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1695227551);
                    n.a(null, o0VarE, 0);
                    o0VarE.g0(false);
                }
                z14 = true;
            }
            o0VarE.g0(z14);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.c((Object) aVar, (Object) dVar, (Object) cVar, (Object) bVar, (Object) lVar, (Object) lVar2, i14, 16);
        }
    }
}
