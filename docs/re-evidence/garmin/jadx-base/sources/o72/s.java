package o72;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.ChipSelectionExamplesKt$ChipGroupSample$2$2$1", f = "ChipSelectionExamples.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f130551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f130552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f130553c;

        /* JADX INFO: renamed from: o72.s$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.ChipSelectionExamplesKt$ChipGroupSample$2$2$1$1", f = "ChipSelectionExamples.kt", l = {183}, m = "invokeSuspend", v = 2)
        public static final class C2482a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f130554a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e2.i0 f130555b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f130556c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2482a(e2.i0 i0Var, int i14, t13.d<? super C2482a> dVar) {
                super(2, dVar);
                this.f130555b = i0Var;
                this.f130556c = i14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2482a(this.f130555b, this.f130556c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2482a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f130554a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f130554a = 1;
                    if (e2.i0.f(this.f130555b, this.f130556c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o53.b0 b0Var, e2.i0 i0Var, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f130551a = b0Var;
            this.f130552b = i0Var;
            this.f130553c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f130551a, this.f130552b, this.f130553c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ge1.b.T(this.f130551a, null, null, new C2482a(this.f130552b, this.f130553c, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0210  */
    /* JADX WARN: Code duplicated, block: B:68:0x0227  */
    /* JADX WARN: Code duplicated, block: B:72:0x0249  */
    /* JADX WARN: Code duplicated, block: B:74:0x025a  */
    /* JADX WARN: Code duplicated, block: B:85:0x021e A[SYNTHETIC] */
    public static final void a(List list, f82.c cVar, p3.m mVar, int i14) {
        p3.m.a.C2565a c2565a;
        p3.m.a.C2565a c2565a2;
        Object objQ;
        o53.b0 b0Var;
        Iterator it;
        Object next;
        int iIndexOf;
        boolean zR;
        Object objQ2;
        List list2 = list;
        f82.c cVar2 = cVar;
        list2.getClass();
        p3.o0 o0VarE = mVar.E(-1128538181);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(list2) ? 4 : 2) | (o0VarE.r(cVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            Context context = ((View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f)).getContext();
            Object objQ3 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
            if (objQ3 == c2565a3) {
                objQ3 = p3.p0.n(list2);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var = (p3.p1) objQ3;
            e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarC = c2.l.C(aVar, f14, f14, f14, 0.0f, 8);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81533k;
            c2.s2 s2VarA = c2.q2.a(c0343j, bVar, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c("At Least One Chip Selection Strategy w/ Wrapped Chips:", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 6, 0, 131070);
            o0VarE.g0(true);
            h4.r rVarY = c2.l.y(aVar, f14);
            c2.s2 s2VarA2 = c2.q2.a(c0343j, bVar, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarY, o0VarE);
            if (cVar3 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            i53.c cVarE = i53.a.e((Iterable) p1Var.getF182175a());
            boolean zR2 = o0VarE.r(context);
            Object objQ4 = o0VarE.q();
            if (zR2) {
                c2565a = c2565a3;
            } else {
                c2565a = c2565a3;
                if (objQ4 == c2565a) {
                }
                o0VarE = o0VarE;
                c2565a2 = c2565a;
                cVar2 = cVar;
                e82.a.a(cVarE, null, cVar2, (e23.p) objQ4, o0VarE, i15 & 896, 2);
                objQ = o0VarE.q();
                if (objQ == c2565a2) {
                    objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ);
                }
                b0Var = (o53.b0) objQ;
                it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((l72.j0) next).f111076e);
                list2 = list;
                iIndexOf = list2.indexOf(next);
                if (iIndexOf != -1) {
                    o0VarE.C(-972661771);
                    Integer numValueOf = Integer.valueOf(iIndexOf);
                    zR = o0VarE.r(b0Var) | o0VarE.B(i0VarA) | o0VarE.k(iIndexOf);
                    objQ2 = o0VarE.q();
                    if (zR || objQ2 == p3.m.a.f135155b) {
                        objQ2 = new r(b0Var, i0VarA, iIndexOf, null);
                        o0VarE.K(objQ2);
                    }
                    p3.l0.e((e23.p) objQ2, numValueOf, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-972403262);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                p3.x1 x1Var2 = p3.n.f135158a;
            }
            objQ4 = new e(p1Var, context, 2);
            o0VarE.K(objQ4);
            o0VarE = o0VarE;
            c2565a2 = c2565a;
            cVar2 = cVar;
            e82.a.a(cVarE, null, cVar2, (e23.p) objQ4, o0VarE, i15 & 896, 2);
            objQ = o0VarE.q();
            if (objQ == c2565a2) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0Var = (o53.b0) objQ;
            it = list.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((l72.j0) next).f111076e);
            list2 = list;
            iIndexOf = list2.indexOf(next);
            if (iIndexOf != -1) {
                o0VarE.C(-972661771);
                Integer numValueOf2 = Integer.valueOf(iIndexOf);
                zR = o0VarE.r(b0Var) | o0VarE.B(i0VarA) | o0VarE.k(iIndexOf);
                objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new r(b0Var, i0VarA, iIndexOf, null);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new r(b0Var, i0VarA, iIndexOf, null);
                    o0VarE.K(objQ2);
                }
                p3.l0.e((e23.p) objQ2, numValueOf2, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-972403262);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            p3.x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(list2, cVar2, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0182  */
    /* JADX WARN: Code duplicated, block: B:49:0x0189  */
    /* JADX WARN: Code duplicated, block: B:51:0x0191  */
    /* JADX WARN: Code duplicated, block: B:56:0x01af  */
    /* JADX WARN: Code duplicated, block: B:62:0x01de  */
    /* JADX WARN: Code duplicated, block: B:65:0x0201  */
    /* JADX WARN: Code duplicated, block: B:69:0x0216  */
    /* JADX WARN: Code duplicated, block: B:75:0x022d  */
    /* JADX WARN: Code duplicated, block: B:79:0x024f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0261  */
    /* JADX WARN: Code duplicated, block: B:83:0x0270  */
    /* JADX WARN: Code duplicated, block: B:85:0x0276  */
    /* JADX WARN: Code duplicated, block: B:87:0x027c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0286  */
    /* JADX WARN: Code duplicated, block: B:92:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void b(List<l72.j0> list, String str, f82.c cVar, p3.m mVar, int i14, int i15) {
        f82.c bVar;
        int i16;
        boolean z14;
        List<l72.j0> list2;
        p3.p2 p2VarI0;
        f82.c cVar2;
        Context context;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var;
        e2.i0 i0VarA;
        h4.r.a aVar;
        c2.j.C0343j c0343j;
        h4.g.b bVar2;
        c2.s2 s2VarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar3;
        h5.g.a.f fVar;
        int i17;
        c2.s2 s2VarA2;
        int iHashCode2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        boolean zR;
        Object objQ2;
        Object objQ3;
        o53.b0 b0Var;
        Iterator<T> it;
        Object next;
        int iIndexOf;
        boolean zR2;
        Object objQ4;
        list.getClass();
        p3.o0 o0VarE = mVar.E(2132972373);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i18 = i14 | (o0VarE.r(list) ? 4 : 2);
        if ((i15 & 4) == 0) {
            bVar = cVar;
            int i19 = o0VarE.r(bVar) ? 256 : 128;
            i16 = i18 | i19;
            if ((i16 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) == 0 && !o0VarE.o0()) {
                    o0VarE.e();
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                    }
                } else if ((i15 & 4) != 0) {
                    bVar = new f82.b();
                    i16 &= -897;
                }
                cVar2 = bVar;
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                context = ((View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f)).getContext();
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(list);
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) objQ;
                i0VarA = e2.k0.a(0, 0, 3, o0VarE);
                aVar = h4.r.S;
                float f14 = 16;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarC3 = c2.l.C(aVar, f14, f14, f14, 0.0f, 8);
                c2.j.f22691a.getClass();
                c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                bVar2 = h4.d.a.f81533k;
                s2VarA = c2.q2.a(c0343j, bVar2, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC3, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar3 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, s2VarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u2 u2Var = c2.u2.f22900a;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                i17 = i16 >> 3;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 6, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                s2VarA2 = c2.q2.a(c0343j, bVar2, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(aVar, o0VarE);
                if (cVar3 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                i53.c cVarE = i53.a.e((Iterable) p1Var.getF182175a());
                h4.r rVarA = c2.l.A(aVar, 0.0f, 8, 1);
                zR = o0VarE.r(context);
                objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new e(p1Var, context, 1);
                    o0VarE.K(objQ2);
                }
                bVar = cVar2;
                e82.a.b(cVarE, bVar, i0VarA, rVarA, null, (e23.p) objQ2, o0VarE, 3072 | (i17 & 112), 16);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ3);
                }
                b0Var = (o53.b0) objQ3;
                it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((l72.j0) next).f111076e);
                list2 = list;
                iIndexOf = list2.indexOf(next);
                if (iIndexOf != -1) {
                    o0VarE.C(-635940837);
                    Integer numValueOf = Integer.valueOf(iIndexOf);
                    zR2 = o0VarE.r(b0Var) | o0VarE.B(i0VarA) | o0VarE.k(iIndexOf);
                    objQ4 = o0VarE.q();
                    if (zR2 || objQ4 == p3.m.a.f135155b) {
                        objQ4 = new a(b0Var, i0VarA, iIndexOf, null);
                        o0VarE.K(objQ4);
                    }
                    p3.l0.e((e23.p) objQ4, numValueOf, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-635682328);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                p3.x1 x1Var2 = p3.n.f135158a;
            } else {
                list2 = list;
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new mx.h(list2, str, bVar, i14, i15, 4);
            }
        }
        bVar = cVar;
        i16 = i18 | i19;
        if ((i16 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) == 0) {
                if ((i15 & 4) != 0) {
                    bVar = new f82.b();
                    i16 &= -897;
                }
            } else if ((i15 & 4) != 0) {
                bVar = new f82.b();
                i16 &= -897;
            }
            cVar2 = bVar;
            o0VarE.h0();
            p3.x1 x1Var3 = p3.n.f135158a;
            context = ((View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f)).getContext();
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(list);
                o0VarE.K(objQ);
            }
            p1Var = (p3.p1) objQ;
            i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            aVar = h4.r.S;
            float f15 = 16;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarC4 = c2.l.C(aVar, f15, f15, f15, 0.0f, 8);
            c2.j.f22691a.getClass();
            c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            bVar2 = h4.d.a.f81533k;
            s2VarA = c2.q2.a(c0343j, bVar2, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC4, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar3 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u2 u2Var2 = c2.u2.f22900a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            i17 = i16 >> 3;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 6, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            s2VarA2 = c2.q2.a(c0343j, bVar2, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar3 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            i53.c cVarE2 = i53.a.e((Iterable) p1Var.getF182175a());
            h4.r rVarA2 = c2.l.A(aVar, 0.0f, 8, 1);
            zR = o0VarE.r(context);
            objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new e(p1Var, context, 1);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new e(p1Var, context, 1);
                o0VarE.K(objQ2);
            }
            bVar = cVar2;
            e82.a.b(cVarE2, bVar, i0VarA, rVarA2, null, (e23.p) objQ2, o0VarE, 3072 | (i17 & 112), 16);
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            b0Var = (o53.b0) objQ3;
            it = list.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((l72.j0) next).f111076e);
            list2 = list;
            iIndexOf = list2.indexOf(next);
            if (iIndexOf != -1) {
                o0VarE.C(-635940837);
                Integer numValueOf2 = Integer.valueOf(iIndexOf);
                zR2 = o0VarE.r(b0Var) | o0VarE.B(i0VarA) | o0VarE.k(iIndexOf);
                objQ4 = o0VarE.q();
                if (zR2) {
                    objQ4 = new a(b0Var, i0VarA, iIndexOf, null);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a(b0Var, i0VarA, iIndexOf, null);
                    o0VarE.K(objQ4);
                }
                p3.l0.e((e23.p) objQ4, numValueOf2, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-635682328);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            p3.x1 x1Var4 = p3.n.f135158a;
        } else {
            list2 = list;
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(list2, str, bVar, i14, i15, 4);
        }
    }

    public static final void c(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(802102197);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            b(p13.x.k(new l72.j0("Body Battery", null, null, false, false, 30, null), new l72.j0("Stress", null, null, false, false, 30, null), new l72.j0("Rest", null, null, false, false, 30, null)), "At Most One Chip Selection Strategy:", null, o0VarE, 48, 4);
            b(p13.x.k(new l72.j0("Body Battery", null, null, false, false, 30, null), new l72.j0("Stress", null, null, false, false, 22, null), new l72.j0("Rest", null, null, false, false, 30, null)), "At Most One Chip Selection Strategy with disabled chip:", null, o0VarE, 48, 4);
            b(p13.x.k(new l72.j0("Body Battery", null, null, false, true, 14, null), new l72.j0("Stress", null, null, false, false, 30, null), new l72.j0("Rest", null, null, false, false, 30, null)), "Exactly One Chip Selection Strategy:", new f82.d(), o0VarE, 48, 0);
            b(p13.x.k(new l72.j0("Body Battery", null, null, false, true, 14, null), new l72.j0("Stress", null, null, false, false, 30, null), new l72.j0("Rest", null, null, false, false, 22, null)), "Exactly One Chip Selection Strategy with disabled chip:", new f82.d(), o0VarE, 48, 0);
            b(p13.x.k(new l72.j0("Body Battery", null, null, false, true, 14, null), new l72.j0("Stress", null, null, false, true, 14, null), new l72.j0("Rest", null, null, false, true, 14, null)), "At Least One Chip Selection Strategy:", new f82.a(), o0VarE, 48, 0);
            b(p13.x.k(new l72.j0("Body Battery", null, null, false, true, 6, null), new l72.j0("Stress", null, null, false, true, 14, null), new l72.j0("Rest", null, null, false, true, 14, null), new l72.j0("Active", null, null, false, false, 22, null)), "At Least One Chip Selection Strategy with disabled chips:", new f82.a(), o0VarE, 48, 0);
            b(p13.x.k(new l72.j0("Chip 1", null, null, false, false, 30, null), new l72.j0("Chip 2", null, null, false, false, 30, null), new l72.j0("Chip 3", null, null, false, false, 30, null), new l72.j0("Chip 4", null, null, false, false, 30, null), new l72.j0("Chip 5", null, null, false, false, 30, null), new l72.j0("Chip 6", null, null, false, true, 14, null)), "At Most One Chip Selection Strategy with auto scroll to the first selected chip:", new f82.b(), o0VarE, 48, 0);
            b(p13.x.k(new l72.j0("Chip 1", null, null, false, false, 30, null), new l72.j0("Chip 2", null, null, false, false, 30, null), new l72.j0("Chip 3", null, null, false, false, 30, null), new l72.j0("Chip 4", null, null, false, false, 30, null), new l72.j0("Chip 5", null, null, false, false, 30, null), new l72.j0("Chip 6", null, null, false, true, 14, null)), "Multiple Chips Selection Strategy with auto scroll to the first selected chip:", new f82.e(), o0VarE, 48, 0);
            a(p13.x.k(new l72.j0("Sleep", null, null, false, true, 14, null), new l72.j0("Body Battery", null, null, false, false, 30, null), new l72.j0("Training readiness", null, null, false, false, 30, null), new l72.j0("Training Status", null, null, false, false, 30, null), new l72.j0("Steps", null, null, false, false, 30, null), new l72.j0("Intensity Minutes", null, null, false, false, 30, null), new l72.j0("Weight", null, null, false, true, 14, null), new l72.j0("Heart health", null, null, false, false, 30, null), new l72.j0("Women's health", null, null, false, true, 14, null)), new f82.a(), o0VarE, 48);
            d(p13.x.k(new l72.j0("Running", null, null, false, false, 30, null), new l72.j0("Cycling", null, null, false, false, 30, null), new l72.j0("Swimming", null, null, false, false, 30, null), new l72.j0("Walking", null, null, false, false, 30, null), new l72.j0("Hiking", null, null, false, false, 30, null), new l72.j0("Other", null, null, false, false, 30, null)), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 15);
        }
    }

    public static final void d(List list, p3.m mVar, int i14) {
        List list2;
        p3.o0 o0Var;
        e2.i0 i0Var;
        h4.r.a aVar;
        list.getClass();
        p3.o0 o0VarE = mVar.E(620507898);
        int i15 = i14 | (o0VarE.r(list) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(list);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            float f14 = 16;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarC = c2.l.C(aVar2, f14, f14, f14, 0.0f, 8);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c("Remove on selection filter chips:", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 6, 0, 131070);
            p3.o0 o0Var2 = o0VarE;
            o0Var2.g0(true);
            if (p13.h0.L((Iterable) p1Var.getF182175a())) {
                o0Var2.C(11949127);
                i53.c cVarE = i53.a.e((Iterable) p1Var.getF182175a());
                h4.r rVarC3 = c2.l.C(aVar2, 0.0f, 8, 0.0f, 0.0f, 13);
                aVar = aVar2;
                ma0.b bVar2 = new ma0.b(14);
                Object objQ2 = o0Var2.q();
                if (objQ2 == c2565a) {
                    objQ2 = new o62.a(24);
                    o0Var2.K(objQ2);
                }
                e23.l lVar = (e23.l) objQ2;
                Object objQ3 = o0Var2.q();
                if (objQ3 == c2565a) {
                    objQ3 = new md0.f(p1Var, 12);
                    o0Var2.K(objQ3);
                }
                e23.l lVar2 = (e23.l) objQ3;
                i0Var = i0VarA;
                e82.a.c(cVarE, bVar2, i0Var, rVarC3, lVar, null, lVar2, o0Var2, 1600512, 32);
                o0Var2 = o0Var2;
                o0Var2.g0(false);
            } else {
                i0Var = i0VarA;
                aVar = aVar2;
                o0Var2.C(12355816);
                o0Var2.g0(false);
            }
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r rVarZ = c2.l.z(aVar, f14, 8);
            list2 = list;
            boolean zR = o0Var2.r(list2) | o0Var2.B(i0Var);
            Object objQ4 = o0Var2.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new nw0.p(p1Var, 6, list2, i0Var);
                o0Var2.K(objQ4);
            }
            f0Var.i("Reset", rVarZ, false, (e23.a) objQ4, o0Var2, 54, 4);
            o0Var = o0Var2;
        } else {
            list2 = list;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list2, i14, 15);
        }
    }
}
