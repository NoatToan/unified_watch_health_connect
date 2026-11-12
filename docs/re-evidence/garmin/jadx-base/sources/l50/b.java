package l50;

import am.z0;
import android.os.Bundle;
import c2.k3;
import c2.q;
import c2.q3;
import c2.u;
import e23.p;
import h4.k;
import h5.e0;
import h5.g;
import i3.d7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m50.c;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.d2;
import r53.j;
import s20.l;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.courses.presentation.map.components.CourseMapScreenKt$CourseMapScreen$2$1", f = "CourseMapScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f110141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<c50.i> f110142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, p1<c50.i> p1Var, d<? super a> dVar) {
            super(2, dVar);
            this.f110141a = cVar;
            this.f110142b = p1Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f110141a, this.f110142b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object next;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<c50.i> p1Var = this.f110142b;
            c50.i f182175a = p1Var.getF182175a();
            if (f182175a != null && f182175a.isAdded()) {
                c cVar = this.f110141a;
                List<w20.a> list = cVar.f116645b;
                List<w20.a> list2 = cVar.f116645b;
                if (list != null && !list.isEmpty()) {
                    if (list2.size() == 1) {
                        c50.i f182175a2 = p1Var.getF182175a();
                        if (f182175a2 != null) {
                            f182175a2.e8((w20.a) h0.b0(list2));
                        }
                    } else {
                        c50.i f182175a3 = p1Var.getF182175a();
                        if (f182175a3 != null) {
                            ArrayList arrayList = new ArrayList(y.r(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((w20.a) it.next()).f181476a);
                            }
                            f182175a3.J0.clear();
                            l.f156021a.getClass();
                            Iterator it3 = arrayList.iterator();
                            do {
                                obj2 = null;
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                            } while (!z0.h0(((com.garmin.android.apps.connectmobile.courses.model.e) next).g()));
                            f182175a3.b8((com.garmin.android.apps.connectmobile.courses.model.e) next, true, true);
                            l.f156021a.getClass();
                            for (Object obj3 : arrayList) {
                                if (z0.g0(((com.garmin.android.apps.connectmobile.courses.model.e) obj3).g())) {
                                    obj2 = obj3;
                                    break;
                                }
                            }
                            f182175a3.b8((com.garmin.android.apps.connectmobile.courses.model.e) obj2, true, false);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: l50.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.courses.presentation.map.components.CourseMapScreenKt$CourseMapScreen$3$1", f = "CourseMapScreen.kt", l = {68}, m = "invokeSuspend", v = 2)
    public static final class C2104b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2<m50.b> f110144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<c50.i> f110145c;

        /* JADX INFO: renamed from: l50.b$b$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p1<c50.i> f110146a;

            public a(p1<c50.i> p1Var) {
                this.f110146a = p1Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, d dVar) {
                c50.i f182175a;
                c50.i f182175a2;
                c50.i f182175a3;
                m50.b bVar = (m50.b) obj;
                boolean z14 = bVar instanceof m50.b.C2218b;
                p1<c50.i> p1Var = this.f110146a;
                if (z14) {
                    c50.i f182175a4 = p1Var.getF182175a();
                    if (f182175a4 != null && f182175a4.isAdded() && (f182175a3 = p1Var.getF182175a()) != null) {
                        f182175a3.G6(((m50.b.C2218b) bVar).f116643a);
                    }
                } else if ((bVar instanceof m50.b.a) && (f182175a = p1Var.getF182175a()) != null && f182175a.isAdded() && (f182175a2 = p1Var.getF182175a()) != null) {
                    f182175a2.f7();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2104b(d2<? extends m50.b> d2Var, p1<c50.i> p1Var, d<? super C2104b> dVar) {
            super(2, dVar);
            this.f110144b = d2Var;
            this.f110145c = p1Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C2104b(this.f110144b, this.f110145c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C2104b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f110143a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(this.f110145c);
                this.f110143a = 1;
                if (this.f110144b.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(c cVar, d2<? extends m50.b> d2Var, e23.l<? super m50.a, Unit> lVar, m mVar, int i14) {
        d dVar;
        cVar.getClass();
        d2Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(324714244);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(d2Var) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar = h4.r.S;
            int i16 = k3.f22728a;
            h4.r rVarG = c2.l.G(aVar, q3.b(o0VarE));
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarG, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ky0.k(p1Var, 8);
                o0VarE.K(objQ2);
            }
            o0VarE.L(1765406104);
            g8.a.a(c50.i.class, aVar, g8.i.U(o0VarE), Bundle.EMPTY, (e23.l) objQ2, o0VarE, 24576, 0);
            o0VarE.g0(false);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(aVar, j92.b.f97899b.f97920e);
            k2.h hVar = k2.i.f102406a;
            long j8 = d92.b.a(o0VarE).f().f63508c;
            long j14 = d92.b.a(o0VarE).f().f63509d;
            boolean z14 = (i15 & 896) == 256;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new gt1.k(lVar, 16);
                o0VarE.K(objQ3);
            }
            l50.a.f110139a.getClass();
            o0VarE = o0VarE;
            d7.d((e23.a) objQ3, rVarY, hVar, j8, j14, null, l50.a.f110140b, o0VarE, 12582912, 96);
            o0VarE.g0(true);
            c50.i iVar = (c50.i) p1Var.getF182175a();
            List<w20.a> list = cVar.f116645b;
            boolean zR = o0VarE.r(cVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                dVar = null;
                objQ4 = new a(cVar, p1Var, null);
                o0VarE.K(objQ4);
            } else {
                dVar = null;
            }
            l0.f(iVar, list, (p) objQ4, o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0VarE.r(d2Var);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new C2104b(d2Var, p1Var, dVar);
                o0VarE.K(objQ5);
            }
            l0.e((p) objQ5, unit, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(cVar, d2Var, false, lVar, i14, 23);
        }
    }
}
