package fo;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.t0;
import c2.l2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.i0;
import e2.k0;
import et1.a2;
import et1.i1;
import et1.s0;
import ew1.r1;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.t1;
import lc.u0;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.c2;
import s5.x0;
import v62.h1;
import x5.f0;
import yc.z0;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListContentKt$ActivitiesListContent$1$1", f = "ActivitiesListContent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ yc.s f72291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f72292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f72293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(yc.s sVar, e23.l<? super Boolean, Unit> lVar, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f72291a = sVar;
            this.f72292b = lVar;
            this.f72293c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f72291a, this.f72292b, this.f72293c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            yc.s sVar = this.f72291a;
            if (!(sVar.f196385a instanceof z0.b)) {
                this.f72293c.setValue(Boolean.TRUE);
            }
            z0 z0Var = sVar.f196385a;
            boolean z14 = z0Var instanceof z0.b;
            e23.l<Boolean, Unit> lVar = this.f72292b;
            if (z14) {
                lVar.invoke(Boolean.TRUE);
            } else {
                if (!(z0Var instanceof z0.a) && !(z0Var instanceof z0.c)) {
                    u0.r();
                    return null;
                }
                lVar.invoke(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListContentKt$ActivityItemsList$1$1", f = "ActivitiesListContent.kt", l = {296, 298, 299}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f72295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zc.d<wo0.a> f72296c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyc/z0;", "it", "", "<anonymous>", "(Lyc/z0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListContentKt$ActivityItemsList$1$1$2", f = "ActivitiesListContent.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<z0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f72297a;

            public a(t13.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f72297a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(z0 z0Var, t13.d<? super Boolean> dVar) {
                return ((a) create(z0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                z0 z0Var = (z0) this.f72297a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return Boolean.valueOf(z0Var instanceof z0.b);
            }
        }

        /* JADX INFO: renamed from: fo.d$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyc/z0;", "it", "", "<anonymous>", "(Lyc/z0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListContentKt$ActivityItemsList$1$1$4", f = "ActivitiesListContent.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1470b extends v13.i implements e23.p<z0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f72298a;

            public C1470b(t13.d<? super C1470b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1470b c1470b = new C1470b(dVar);
                c1470b.f72298a = obj;
                return c1470b;
            }

            @Override // e23.p
            public final Object invoke(z0 z0Var, t13.d<? super Boolean> dVar) {
                return ((C1470b) create(z0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                z0 z0Var = (z0) this.f72298a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return Boolean.valueOf(z0Var instanceof z0.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i0 i0Var, zc.d<wo0.a> dVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f72295b = i0Var;
            this.f72296c = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f72295b, this.f72296c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            if (r7.f72295b.l(0, 0, r7) == r0) goto L20;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f72294a;
            zc.d<wo0.a> dVar = this.f72296c;
            if (i14 == 0) {
                o13.r.b(obj);
                c2 c2VarS = p0.s(new s0(dVar, 2));
                a aVar2 = new a(null);
                this.f72294a = 1;
                if (r53.s.w(c2VarS, aVar2, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                this.f72294a = 3;
                i0.a aVar3 = i0.f62432x;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            c2 c2VarS2 = p0.s(new s0(dVar, 3));
            C1470b c1470b = new C1470b(null);
            this.f72294a = 2;
            if (r53.s.w(c2VarS2, c1470b, this) != aVar) {
                this.f72294a = 3;
                i0.a aVar4 = i0.f62432x;
            }
            return aVar;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72299a;

        static {
            int[] iArr = new int[jo.e.values().length];
            try {
                iArr[jo.e.f99747h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f72299a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084 A[LOOP:0: B:40:0x007e->B:42:0x0084, LOOP_END] */
    public static final void a(int i14, e23.l lVar, h4.r rVar, i53.c cVar, p3.m mVar) {
        int i15;
        i53.c cVar2;
        ArrayList arrayList;
        Iterator<E> it;
        o0 o0VarE = mVar.E(1197825720);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            cVar2 = cVar;
            i15 |= o0VarE.B(cVar2) ? 32 : 16;
        } else {
            cVar2 = cVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                arrayList = new ArrayList();
                it = cVar2.iterator();
                while (it.hasNext()) {
                    p13.d0.v(arrayList, ((jo.c) it.next()).a(context));
                }
                objQ = i53.a.e(arrayList);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    arrayList = new ArrayList();
                    it = cVar2.iterator();
                    while (it.hasNext()) {
                        p13.d0.v(arrayList, ((jo.c) it.next()).a(context));
                    }
                    objQ = i53.a.e(arrayList);
                    o0VarE.K(objQ);
                }
            }
            i53.c cVar3 = (i53.c) objQ;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            e11.a aVar2 = new e11.a(24);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new fh0.b(22);
                o0VarE.K(objQ2);
            }
            e23.l lVar2 = (e23.l) objQ2;
            boolean z15 = (i15 & 896) == 256;
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == c2565a) {
                objQ3 = new fb0.d(lVar, i16);
                o0VarE.K(objQ3);
            }
            e82.a.c(cVar3, aVar2, i0VarA, rVar, lVar2, null, (e23.l) objQ3, o0VarE, ((i15 << 9) & 7168) | 24576, 32);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.a0(rVar, cVar2, lVar, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0249  */
    /* JADX WARN: Code duplicated, block: B:68:0x0250  */
    /* JADX WARN: Code duplicated, block: B:70:0x0258  */
    /* JADX WARN: Code duplicated, block: B:75:0x0276  */
    /* JADX WARN: Code duplicated, block: B:80:0x032b  */
    /* JADX WARN: Code duplicated, block: B:82:0x036d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, int i14, boolean z14, jo.f fVar, i53.c cVar, e23.l lVar, p3.m mVar, int i15) {
        p3.c<?> cVar2;
        h5.g.a.f fVar2;
        String strP;
        String strJ;
        j92.f fVar3;
        h4.r.a aVar;
        Object objQ;
        p1 p1Var;
        j92.b bVar;
        j92.e eVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        p1 p1Var2;
        Object objQ2;
        o0 o0VarE = mVar.E(9576934);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i16 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.B(fVar) ? 2048 : 1024) | (o0VarE.B(cVar) ? 16384 : 8192);
        if ((i15 & 196608) == 0) {
            i16 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ3 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            s2 s2VarA2 = q2.a(c0343j, bVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar2 = cVar3;
            } else {
                cVar2 = cVar3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                if (i14 == 1) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -181425425, R.string.one_activity_capitalized, o0VarE, false);
                } else {
                    o0VarE.C(-181340299);
                    if (z14) {
                        o0VarE.C(-181297240);
                        o0VarE.g0(false);
                        strP = String.valueOf(i14);
                    } else {
                        o0VarE.C(-181241812);
                        strP = gl1.y.P(R.string.lbl_string_with_positive_sign_end, new Object[]{String.valueOf(i14)}, o0VarE);
                        o0VarE.g0(false);
                    }
                    String strP2 = gl1.y.P(R.string.num_activities, new Object[]{strP}, o0VarE);
                    o0VarE.g0(false);
                    strJ = strP2;
                }
                String upperCase = strJ.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                d92.b.f58623a.getClass();
                fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
                aVar = h4.r.S;
                mh.c(upperCase, u2Var.a(aVar, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                h4.r rVarY = x2.y(u2Var.a(aVar, 1.0f, true), h4.d.a.f81529g, 2);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    p1Var = p1Var3;
                    objQ = new a2(p1Var, 18);
                    o0VarE.K(objQ);
                } else {
                    p1Var = p1Var3;
                }
                h4.r rVarD = u1.w.d(rVarY, false, null, null, (e23.a) objQ, 15);
                long jB = d92.b.a(o0VarE).d().a().b();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarE = u1.n.e(rVarD, jB, k2.i.a(eVar.f97917b));
                bVar.getClass();
                float f14 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarZ = c2.l.z(rVarE, f14, eVar.f97918c);
                s2VarA = q2.a(c0343j, bVar2, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarZ, o0VarE);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar2, rVarC, o0VarE);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_sort);
                fVar3.getClass();
                p1Var2 = p1Var;
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                s62.a.f157643a.getClass();
                u4.d dVarA = h1.a(t62.b.f162798a);
                long jB2 = d92.b.a(o0VarE).f().b();
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                bVar.getClass();
                i7.b(dVarA, null, x2.q(rVarC3, eVar.f97919d), jB2, o0VarE, 48, 0);
                h4.r rVarZ2 = x2.z(aVar, null, 3);
                long jF = d92.b.a(o0VarE).c().f();
                bVar.getClass();
                h4.r rVarE2 = u1.n.e(rVarZ2, jF, k2.i.a(eVar.f97917b));
                boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new a2(p1Var2, 19);
                    o0VarE.K(objQ2);
                }
                i3.u.a(zBooleanValue, (e23.a) objQ2, rVarE2, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(791574227, new ak0.j(cVar, fVar, lVar, context, p1Var2), o0VarE), o0VarE, 48, 48, 2040);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC2, o0VarE);
            u2 u2Var2 = u2.f22900a;
            if (i14 == 1) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -181425425, R.string.one_activity_capitalized, o0VarE, false);
            } else {
                o0VarE.C(-181340299);
                if (z14) {
                    o0VarE.C(-181297240);
                    o0VarE.g0(false);
                    strP = String.valueOf(i14);
                } else {
                    o0VarE.C(-181241812);
                    strP = gl1.y.P(R.string.lbl_string_with_positive_sign_end, new Object[]{String.valueOf(i14)}, o0VarE);
                    o0VarE.g0(false);
                }
                String strP3 = gl1.y.P(R.string.num_activities, new Object[]{strP}, o0VarE);
                o0VarE.g0(false);
                strJ = strP3;
            }
            String upperCase2 = strJ.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            d92.b.f58623a.getClass();
            fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97934k, o0VarE);
            aVar = h4.r.S;
            mh.c(upperCase2, u2Var2.a(aVar, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
            h4.r rVarY2 = x2.y(u2Var2.a(aVar, 1.0f, true), h4.d.a.f81529g, 2);
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                p1Var = p1Var3;
                objQ = new a2(p1Var, 18);
                o0VarE.K(objQ);
            } else {
                p1Var = p1Var3;
            }
            h4.r rVarD2 = u1.w.d(rVarY2, false, null, null, (e23.a) objQ, 15);
            long jB3 = d92.b.a(o0VarE).d().a().b();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            h4.r rVarE3 = u1.n.e(rVarD2, jB3, k2.i.a(eVar.f97917b));
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ3 = c2.l.z(rVarE3, f15, eVar.f97918c);
            s2VarA = q2.a(c0343j, bVar2, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarZ3, o0VarE);
            if (cVar2 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar2, rVarC, o0VarE);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_sort);
            fVar3.getClass();
            p1Var2 = p1Var;
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            s62.a.f157643a.getClass();
            u4.d dVarA2 = h1.a(t62.b.f162798a);
            long jB4 = d92.b.a(o0VarE).f().b();
            bVar.getClass();
            h4.r rVarC4 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
            bVar.getClass();
            i7.b(dVarA2, null, x2.q(rVarC4, eVar.f97919d), jB4, o0VarE, 48, 0);
            h4.r rVarZ4 = x2.z(aVar, null, 3);
            long jF2 = d92.b.a(o0VarE).c().f();
            bVar.getClass();
            h4.r rVarE4 = u1.n.e(rVarZ4, jF2, k2.i.a(eVar.f97917b));
            boolean zBooleanValue2 = ((Boolean) p1Var2.getF182175a()).booleanValue();
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a2(p1Var2, 19);
                o0VarE.K(objQ2);
            }
            i3.u.a(zBooleanValue2, (e23.a) objQ2, rVarE4, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(791574227, new ak0.j(cVar, fVar, lVar, context, p1Var2), o0VarE), o0VarE, 48, 48, 2040);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(rVar, i14, z14, fVar, cVar, lVar, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v35 */
    public static final void c(h4.r rVar, final zc.d<wo0.a> dVar, final q qVar, final e23.p<? super Integer, ? super wo0.a, Unit> pVar, final e23.l<? super wo0.a, Unit> lVar, final e23.a<Unit> aVar, final e23.l<? super Boolean, Unit> lVar2, final e23.l<? super String, Unit> lVar3, final e23.l<? super String, Unit> lVar4, final e23.l<? super jo.f, Unit> lVar5, final e23.a<Unit> aVar2, final e23.l<? super jo.b, Unit> lVar6, p3.m mVar, final int i14, final int i15, final int i16) {
        h4.r rVar2;
        int i17;
        int i18;
        final h4.r rVar3;
        h4.r rVar4;
        q qVar2;
        e23.l<? super String, Unit> lVar7;
        int i19;
        boolean z14;
        jo.e eVar;
        dVar.getClass();
        qVar.getClass();
        i53.c<jo.c> cVar = qVar.f72412k;
        am.g gVar = qVar.f72402a;
        String str = qVar.f72403b;
        pVar.getClass();
        lVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        aVar2.getClass();
        lVar6.getClass();
        o0 o0VarE = mVar.E(-419111432);
        int i24 = i16 & 1;
        if (i24 != 0) {
            i17 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i17 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i17 = i14;
        }
        int i25 = i17 | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.B(qVar) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i25 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i25 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i25 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i25 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i25 |= o0VarE.r(lVar3) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i25 |= o0VarE.r(lVar4) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i25 |= o0VarE.r(lVar5) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i18 = i15 | (o0VarE.r(aVar2) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.r(lVar6) ? 32 : 16;
        }
        if (o0VarE.n(i25 & 1, ((i25 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true)) {
            h4.r rVar5 = i24 != 0 ? h4.r.S : rVar2;
            x1 x1Var = p3.n.f135158a;
            yc.s sVarD = dVar.d();
            m4.q qVar3 = (m4.q) o0VarE.A(t1.f91491i);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ;
            boolean z15 = ((Boolean) xy2.b.k(jVar, o0VarE, 6).getF182175a()).booleanValue() && str.length() == 0;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            z0 z0Var = sVarD.f196385a;
            boolean zR = o0VarE.r(sVarD) | ((i25 & 3670016) == 1048576);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new a(sVarD, lVar2, p1Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, z0Var, o0VarE);
            if (z0Var instanceof z0.a) {
                o0VarE.C(-277085249);
                jo.e.a aVar3 = jo.e.f99744e;
                d53.w.J(str);
                lg.d.p(qVar);
                aVar3.getClass();
                gVar.getClass();
                jo.e eVar2 = jo.e.f99749j;
                h4.r rVarD = x2.d(rVar5, 1.0f);
                boolean z16 = (i25 & 112) == 32 || o0VarE.r(dVar);
                Object objQ4 = o0VarE.q();
                if (z16 || objQ4 == c2565a) {
                    objQ4 = new s0(dVar, 1);
                    o0VarE.K(objQ4);
                }
                f(rVarD, null, eVar2, (e23.a) objQ4, o0VarE, 0, 2);
                o0VarE.g0(false);
            } else {
                if (((Boolean) p1Var.getF182175a()).booleanValue() || !(z0Var instanceof z0.b)) {
                    o0VarE.C(-276005860);
                    c2.j jVar2 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97918c;
                    jVar2.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
                    rVar4 = rVar5;
                    int iHashCode = Long.hashCode(o0VarE.U);
                    i2 i2VarA0 = o0VarE.a0();
                    h4.r rVarC = h4.k.c(rVar4, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    int i26 = i25;
                    if (o0VarE.f135177b == null) {
                        p0.l();
                        throw 0;
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
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (!gVar.f3965e || lg.d.B(qVar)) {
                        qVar2 = qVar;
                        lVar7 = lVar4;
                        i19 = 1;
                        z14 = false;
                        o0VarE.C(-2133495533);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-2133810741);
                        qVar2 = qVar;
                        i19 = 1;
                        z14 = false;
                        d(qVar2, jVar, lVar4, lVar3, o0VarE, ((i26 >> 6) & 14) | 48 | ((i26 >> 18) & 896) | ((i26 >> 12) & 7168));
                        lVar7 = lVar4;
                        o0VarE.g0(false);
                    }
                    if (!gVar.f3965e || lg.d.B(qVar2) || cVar == null || ((cVar.isEmpty() ? 1 : 0) ^ i19) != i19 || cVar == null || z15) {
                        o0VarE.C(-2133008461);
                        o0VarE.g0(z14);
                    } else {
                        o0VarE.C(-2133231413);
                        a(((i18 << 3) & 896) | 6, lVar6, h4.r.S, cVar, o0VarE);
                        o0VarE.g0(z14);
                    }
                    if (z15) {
                        o0VarE.C(-2132928574);
                        i53.c<String> cVar2 = qVar2.f72414m;
                        ?? r14 = ((i26 & 234881024) == 67108864 ? i19 : z14) | (o0VarE.r(r28) ? 1 : 0);
                        Object objQ5 = o0VarE.q();
                        if (r14 != 0 || objQ5 == c2565a) {
                            objQ5 = new i1(qVar3, lVar7, i19);
                            o0VarE.K(objQ5);
                        }
                        c0.a(384, (e23.l) objQ5, x2.d(h4.r.S, 1.0f), cVar2, o0VarE);
                        o0VarE.g0(z14);
                    } else {
                        if (dVar.b() == 0) {
                            o0VarE.C(-2132414408);
                            if (z0Var instanceof z0.c) {
                                o0VarE.C(-2132153698);
                                jo.e.a aVar5 = jo.e.f99744e;
                                boolean zJ = d53.w.J(str);
                                boolean zP = lg.d.p(qVar2);
                                aVar5.getClass();
                                gVar.getClass();
                                if (gVar == am.g.f3944h) {
                                    eVar = jo.e.f99746g;
                                } else if (zP) {
                                    eVar = jo.e.f99747h;
                                } else {
                                    eVar = !zJ ? jo.e.f99748i : jo.e.f99745f;
                                }
                                h4.r rVarD2 = x2.d(r29, 1.0f);
                                String str2 = qVar2.f72403b;
                                ?? r15 = (o0VarE.k(eVar.ordinal()) ? 1 : 0) | ((i18 & 14) == 4 ? i19 : z14);
                                Object objQ6 = o0VarE.q();
                                if (r15 != 0 || objQ6 == c2565a) {
                                    objQ6 = new ew1.c2(18, eVar, aVar2);
                                    o0VarE.K(objQ6);
                                }
                                f(rVarD2, str2, eVar, (e23.a) objQ6, o0VarE, 0, 0);
                                o0VarE.g0(z14);
                            } else {
                                o0VarE.C(-2130995693);
                                o0VarE.g0(z14);
                            }
                            o0VarE.g0(z14);
                        } else {
                            o0VarE.C(-2130922192);
                            h4.r rVarD3 = x2.d(h4.r.S, 1.0f);
                            bVar.getClass();
                            int i27 = i26 << 9;
                            e(b0Var, c2.l.A(rVarD3, eVar3.f97920e, 0.0f, 2), qVar2, sVarD, dVar, lVar5, pVar, lVar, aVar, o0VarE, (234881024 & i27) | (i26 & 896) | 32774 | (57344 & i27) | ((i26 >> 12) & 458752) | (i27 & 3670016) | (29360128 & i27));
                            o0VarE = o0VarE;
                            o0VarE.g0(z14);
                        }
                        o0VarE.g0(i19);
                        o0VarE.g0(z14);
                    }
                    o0VarE.g0(i19);
                    o0VarE.g0(z14);
                } else {
                    o0VarE.C(960914044);
                    o0VarE.g0(false);
                }
                rVar3 = rVar4;
            }
            rVar4 = rVar5;
            rVar3 = rVar4;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: fo.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    int iT2 = p0.t(i15);
                    d.c(rVar3, dVar, qVar, pVar, lVar, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    public static final void d(q qVar, a2.j jVar, e23.l<? super String, Unit> lVar, e23.l<? super String, Unit> lVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1458035342);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(qVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(jVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            t0 t0Var = t0.f16792a;
            h4.r rVarF = x2.f(u1.n.e(h4.r.S, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarF, f14, eVar.f97919d);
            String str = qVar.f72403b;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_search);
            x5.v.f188954b.getClass();
            int i16 = x5.v.f188955c;
            x5.p.f188918b.getClass();
            p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, i16, x5.p.f188922f, (f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
            boolean z14 = ((i15 & 896) == 256) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new r1(17, lVar, lVar2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new r1(17, lVar, lVar2);
                    o0VarE.K(objQ);
                }
            }
            t0Var.g(rVarZ, str, strQ, a2Var, jVar, 0L, (e23.p) objQ, o0VarE, ((i15 << 9) & 57344) | 3072, 32);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(qVar, jVar, lVar, lVar2, i14, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    public static final void e(c2.a0 a0Var, h4.r rVar, q qVar, yc.s sVar, zc.d<wo0.a> dVar, e23.l<? super jo.f, Unit> lVar, e23.p<? super Integer, ? super wo0.a, Unit> pVar, e23.l<? super wo0.a, Unit> lVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0Var2;
        i0 i0Var;
        int i15;
        int i16;
        int i17;
        float f14;
        int i18;
        o0 o0VarE = mVar.E(609663928);
        int i19 = (o0VarE.B(rVar) ? 32 : 16) | i14;
        if ((i14 & 384) == 0) {
            i19 |= o0VarE.B(qVar) ? 256 : 128;
        }
        int i24 = i19 | (o0VarE.r(sVar) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            i24 |= o0VarE.r(dVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i24 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i24 |= o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i24 |= o0VarE.r(lVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i24 |= o0VarE.r(aVar) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i24 & 1, (i24 & 38347921) != 38347920)) {
            x1 x1Var = p3.n.f135158a;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            jo.f fVar = qVar.f72408g;
            am.g gVar = qVar.f72402a;
            int i25 = i24 & 57344;
            boolean zB = (i25 == 16384 || o0VarE.r(dVar)) | o0VarE.B(i0VarA);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new b(i0VarA, dVar, null);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b(i0VarA, dVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, fVar, o0VarE);
            if (!gVar.f3965e || lg.d.B(qVar)) {
                o0Var2 = o0VarE;
                i0Var = i0VarA;
                i15 = 67108864;
                i16 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                i17 = 0;
                o0Var2.C(-917129718);
                o0Var2.g0(false);
            } else {
                o0VarE.C(-917509499);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f15 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarZ = c2.l.z(aVar3, f15, eVar.f97917b);
                int i26 = qVar.f72406e;
                boolean z14 = qVar.f72407f;
                i53.c<jo.f> cVar = qVar.f72409h;
                i0Var = i0VarA;
                i15 = 67108864;
                i16 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                b(rVarZ, i26, z14, qVar.f72408g, cVar, lVar, o0VarE, 458752 & i24);
                o0Var2 = o0VarE;
                i17 = 0;
                o0Var2.g0(false);
            }
            if (gVar.f3965e) {
                f14 = i17;
                g6.f.a aVar4 = g6.f.f75994b;
            } else {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f14 = j92.b.f97899b.f97920e;
            }
            l2 l2VarC = c2.l.c(0.0f, f14, 1);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f16 = j92.b.f97899b.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f16);
            boolean zR = ((234881024 & i24) == i15) | ((i24 & 896) == 256) | (i25 == 16384 || o0Var2.r(dVar)) | ((3670016 & i24) == i16) | ((29360128 & i24) == 8388608) | o0Var2.r(sVar);
            Object objQ2 = o0Var2.q();
            if (zR) {
                i18 = i24;
                aa2.p pVar2 = new aa2.p(10, qVar, dVar, sVar, aVar, pVar, lVar2, false);
                o0Var2.K(pVar2);
                objQ2 = pVar2;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    i18 = i24;
                    aa2.p pVar3 = new aa2.p(10, qVar, dVar, sVar, aVar, pVar, lVar2, false);
                    o0Var2.K(pVar3);
                    objQ2 = pVar3;
                } else {
                    i18 = i24;
                }
            }
            o0 o0Var3 = o0Var2;
            e2.c.b(rVar, i0Var, l2VarC, iVarI, null, null, false, null, (e23.l) objQ2, o0Var3, (i18 >> 3) & 14, 488);
            o0Var = o0Var3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(a0Var, rVar, qVar, sVar, dVar, lVar, pVar, lVar2, aVar, i14);
        }
    }

    public static final void f(h4.r rVar, String str, jo.e eVar, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str2;
        String string;
        o0 o0VarE = mVar.E(-1115467107);
        int i17 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        int i18 = i15 & 2;
        int i19 = 16;
        if (i18 != 0) {
            i16 = i17 | 48;
        } else {
            i16 = i17 | (o0VarE.B(str) ? 32 : 16);
        }
        int i24 = i16 | (o0VarE.k(eVar.ordinal()) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i24 & 1, (i24 & 1171) != 1170)) {
            z3.e eVarC = null;
            String str3 = i18 != 0 ? null : str;
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            u4.d dVar = eVar.f99754d;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            context.getClass();
            int i25 = jo.e.b.f99755a[eVar.ordinal()];
            int i26 = eVar.f99751a;
            if (i25 == 1) {
                string = context.getString(i26, am.j.m("\"", str3 == null ? "" : str3, "\""));
                string.getClass();
            } else {
                string = context.getString(i26);
                string.getClass();
            }
            String strQ = gl1.y.Q(o0VarE, eVar.f99752b);
            if (eVar.f99753c == null || aVar == null) {
                o0VarE.C(-1117299897);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1117532800);
                eVarC = z3.f.c(111264999, new r1(i19, eVar, aVar), o0VarE);
                o0VarE.g0(false);
            }
            b82.n.c(dVar, string, strQ, null, eVarC, o0VarE, 0, 8);
            o0VarE.g0(true);
            str2 = str3;
        } else {
            o0VarE.e();
            str2 = str;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(rVar, str2, eVar, (e23.a) aVar, i14, i15);
        }
    }

    public static final void g(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        h4.r rVar2;
        o0 o0VarE = mVar.E(1282752376);
        int i15 = 2;
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            rVar2 = rVar;
            l72.l.f(z3.f.c(335223997, new cq0.p(aVar, 20), o0VarE), rVar2, false, null, o0VarE, 54, 28);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.w(aVar, rVar2, i14, i15);
        }
    }
}
