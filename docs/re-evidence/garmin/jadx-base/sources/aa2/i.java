package aa2;

import androidx.lifecycle.v1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import h5.e0;
import i3.e5;
import i3.mh;
import kotlin.m3;
import kotlin.t1;
import l72.c1;
import lc.u0;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import s5.x0;
import u1.a2;
import u1.d2;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.device.passcode.presentation.DevicePasscodeInputScreenKt$DevicePasscodeInputScreen$1$1", f = "DevicePasscodeInputScreen.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f2332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<t> f2333b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, x3<t> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f2332a = aVar;
            this.f2333b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f2332a, this.f2333b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f2333b.getF182175a().f2384k) {
                this.f2332a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.device.passcode.presentation.DevicePasscodeInputScreenKt$DevicePasscodeInputScreen$2$1", f = "DevicePasscodeInputScreen.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Integer, Unit> f2334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<t> f2335b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super Integer, Unit> lVar, x3<t> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f2334a = lVar;
            this.f2335b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f2334a, this.f2335b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f2335b.getF182175a().f2386m) {
                this.f2334a.invoke(new Integer(1));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.device.passcode.presentation.DevicePasscodeInputScreenKt$DevicePasscodeInputScreen$3$1", f = "DevicePasscodeInputScreen.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f2336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f2337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<t> f2338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a<Unit> aVar, u uVar, x3<t> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f2336a = aVar;
            this.f2337b = uVar;
            this.f2338c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f2336a, this.f2337b, this.f2338c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f2338c.getF182175a().f2385l) {
                this.f2336a.invoke();
                p2 p2Var = this.f2337b.f2393e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, t.a((t) value, null, null, null, null, 0, false, false, false, false, false, false, false, 14335)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2339a;

        static {
            int[] iArr = new int[ca2.b.values().length];
            try {
                iArr[ca2.b.f26605d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ca2.b.f26609h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ca2.b.f26607f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ca2.b.f26606e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ca2.b.f26608g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f2339a = iArr;
        }
    }

    public static final void a(boolean z14, m4.b0 b0Var, m3 m3Var, int i14, String str, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(-78779999);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(b0Var) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.B(m3Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.k(i14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.B(str) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jE = d92.b.a(o0VarE).j().e();
            boolean z15 = i14 < str.length();
            g6.f.a aVar = g6.f.f75994b;
            c2.q.a(d(d(u1.q.b(1, jE, x2.q(h4.r.S, 20), k2.i.f102406a), z15, new e(jE, 0), o0VarE, 0), z14, new f(0, b0Var, m3Var), o0VarE, (i16 << 3) & 112), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(z14, b0Var, m3Var, i14, str, i15);
        }
    }

    public static final void b(int i14, int i15, h4.r rVar, String str, p3.m mVar) {
        String str2;
        o0 o0VarE = mVar.E(1045184857);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i15 | (o0VarE.B(str) ? 32 : 16) | 384;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ;
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            h4.r rVarF = x2.f(rVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(cVar, h4.d.a.f81533k, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-145159724);
            int i17 = 0;
            while (i17 < 4) {
                String str3 = str;
                a(i17 == 0, b0Var, m3Var, i17, str3, o0VarE, ((i16 << 9) & 57344) | 48);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.u(aVar2, j92.b.f97899b.f97918c), o0VarE);
                i17++;
                str = str3;
            }
            str2 = str;
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            i14 = 4;
        } else {
            str2 = str;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.d(rVar, str2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:104:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:106:0x0403  */
    /* JADX WARN: Code duplicated, block: B:107:0x040e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0436  */
    /* JADX WARN: Code duplicated, block: B:112:0x043d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0452  */
    /* JADX WARN: Code duplicated, block: B:116:0x0454  */
    /* JADX WARN: Code duplicated, block: B:119:0x045b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0463  */
    /* JADX WARN: Code duplicated, block: B:123:0x0465  */
    /* JADX WARN: Code duplicated, block: B:125:0x0493  */
    /* JADX WARN: Code duplicated, block: B:127:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:131:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:133:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:136:0x0504  */
    /* JADX WARN: Code duplicated, block: B:138:0x050b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0519  */
    /* JADX WARN: Code duplicated, block: B:142:0x051b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0522  */
    /* JADX WARN: Code duplicated, block: B:147:0x0529  */
    /* JADX WARN: Code duplicated, block: B:151:0x055b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0587  */
    /* JADX WARN: Code duplicated, block: B:161:0x0598  */
    /* JADX WARN: Code duplicated, block: B:163:0x059f  */
    /* JADX WARN: Code duplicated, block: B:166:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:171:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:173:0x05de  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:89:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0319  */
    /* JADX WARN: Code duplicated, block: B:96:0x0339  */
    /* JADX WARN: Code duplicated, block: B:99:0x03c3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final u uVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super Integer, Unit> lVar, p3.m mVar, int i14) {
        char c14;
        char c15;
        String str;
        boolean z14;
        String str2;
        boolean zB;
        Object objQ;
        boolean zR;
        Object objQ2;
        boolean zB2;
        Object objQ3;
        String strQ;
        String strJ;
        boolean zR2;
        Object objQ4;
        boolean zR3;
        Object objQ5;
        boolean z15;
        Object objQ6;
        String strJ2;
        boolean zR4;
        Object objQ7;
        boolean z16;
        Object objQ8;
        char c16;
        Integer num;
        int iIntValue;
        String strJ3;
        uVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1450066197);
        int i15 = i14 | (o0VarE.r(uVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = p0.c(uVar.f2394f, o0VarE, 0);
            Boolean boolValueOf = Boolean.valueOf(((t) p1VarC.getF182175a()).f2384k);
            boolean zB3 = ((i15 & 112) == 32) | o0VarE.B(p1VarC);
            Object objQ9 = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB3) {
                objQ9 = new a(aVar, p1VarC, null);
                o0VarE.K(objQ9);
            } else {
                aVar3.getClass();
                if (objQ9 == p3.m.a.f135155b) {
                    objQ9 = new a(aVar, p1VarC, null);
                    o0VarE.K(objQ9);
                }
            }
            l0.e((e23.p) objQ9, boolValueOf, o0VarE);
            Boolean boolValueOf2 = Boolean.valueOf(((t) p1VarC.getF182175a()).f2386m);
            int i16 = i15 & 7168;
            boolean zB4 = o0VarE.B(p1VarC) | (i16 == 2048);
            Object objQ10 = o0VarE.q();
            if (zB4) {
                objQ10 = new b(lVar, p1VarC, null);
                o0VarE.K(objQ10);
            } else {
                aVar3.getClass();
                if (objQ10 == p3.m.a.f135155b) {
                    objQ10 = new b(lVar, p1VarC, null);
                    o0VarE.K(objQ10);
                }
            }
            l0.e((e23.p) objQ10, boolValueOf2, o0VarE);
            Boolean boolValueOf3 = Boolean.valueOf(((t) p1VarC.getF182175a()).f2385l);
            boolean zB5 = ((i15 & 896) == 256) | o0VarE.B(p1VarC) | o0VarE.r(uVar);
            Object objQ11 = o0VarE.q();
            if (zB5) {
                objQ11 = new c(aVar2, uVar, p1VarC, null);
                o0VarE.K(objQ11);
            } else {
                aVar3.getClass();
                if (objQ11 == p3.m.a.f135155b) {
                    objQ11 = new c(aVar2, uVar, p1VarC, null);
                    o0VarE.K(objQ11);
                }
            }
            l0.e((e23.p) objQ11, boolValueOf3, o0VarE);
            boolean z17 = i16 == 2048;
            Object objQ12 = o0VarE.q();
            if (z17) {
                objQ12 = new a40.a(lVar, 3);
                o0VarE.K(objQ12);
            } else {
                aVar3.getClass();
                if (objQ12 == p3.m.a.f135155b) {
                    objQ12 = new a40.a(lVar, 3);
                    o0VarE.K(objQ12);
                }
            }
            c.w.a(0, 1, (e23.a) objQ12, o0VarE, false);
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarE = u1.n.e(aVar4, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            h4.r rVarB = a2.b(x2.d(c2.l.y(rVarE, f14), 1.0f), a2.a(o0VarE), true);
            c2.j.i iVarG = r1.q2.g(bVar, c2.j.f22691a, f15);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarG, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar4, 1.0f);
            bVar.getClass();
            h4.r rVarY = c2.l.y(rVarF, f15);
            String strQ2 = gl1.y.Q(o0VarE, ((t) p1VarC.getF182175a()).f2374a.f26611a);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97931h;
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            final int i18 = 0;
            mh.c(strQ2, rVarY, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            Integer num2 = ((t) p1VarC.getF182175a()).f2374a.f26612b;
            if (num2 == null) {
                o0VarE.C(831334004);
                o0VarE.g0(false);
            } else {
                o0VarE.C(831334005);
                int iIntValue2 = num2.intValue();
                h4.r rVarF2 = x2.f(aVar4, 1.0f);
                bVar.getClass();
                h4.r rVarY2 = c2.l.y(rVarF2, f15);
                String strQ3 = gl1.y.Q(o0VarE, iIntValue2);
                fVar.getClass();
                mh.c(strQ3, rVarY2, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            ca2.b bVar2 = ((t) p1VarC.getF182175a()).f2374a;
            int[] iArr = d.f2339a;
            int i19 = iArr[bVar2.ordinal()];
            if (i19 != 1) {
                c14 = 2;
                if (i19 != 2) {
                    if (i19 != 3) {
                        c15 = 4;
                        if (i19 != 4) {
                            if (i19 != 5) {
                                u0.r();
                                return;
                            }
                            str = ((t) p1VarC.getF182175a()).f2377d;
                        }
                    } else {
                        c15 = 4;
                    }
                    str = ((t) p1VarC.getF182175a()).f2376c;
                }
                bVar.getClass();
                b(0, 0, c2.l.y(aVar4, f15), str, o0VarE);
                if (((t) p1VarC.getF182175a()).f2379f) {
                    o0VarE.C(-942978869);
                    num = ((t) p1VarC.getF182175a()).f2374a.f26613c;
                    if (num == null) {
                        o0VarE.C(832426134);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(832426135);
                        iIntValue = num.intValue();
                        if (iArr[((t) p1VarC.getF182175a()).f2374a.ordinal()] == 1) {
                            o0VarE.C(-210994451);
                            strJ3 = gl1.y.P(iIntValue, new Object[]{Integer.valueOf(((t) p1VarC.getF182175a()).f2378e)}, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -210991606, iIntValue, o0VarE, false);
                        }
                        h4.r rVarF3 = x2.f(aVar4, 1.0f);
                        bVar.getClass();
                        h4.r rVarY3 = c2.l.y(rVarF3, f15);
                        fVar.getClass();
                        o0 o0Var = o0VarE;
                        mh.c(strJ3, rVarY3, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, d92.b.a(o0VarE).k().e(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 0, 130044);
                        o0VarE = o0Var;
                        Unit unit2 = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    str = str;
                    o0VarE.C(833072237);
                    o0VarE.g0(false);
                }
                if (((t) p1VarC.getF182175a()).f2380g) {
                    o0VarE.C(833197105);
                    strQ = gl1.y.Q(o0VarE, R.string.msg_wrong_passcode_entered);
                    if (((t) p1VarC.getF182175a()).f2382i) {
                        o0VarE.C(833299250);
                        if (((t) p1VarC.getF182175a()).f2387n) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 833352105, R.string.msg_reset_passcode_with_wallet, o0VarE, false);
                        } else {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 833456885, R.string.msg_reset_passcode, o0VarE, false);
                        }
                        c1 c1Var = c1.f110940a;
                        String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_device_is_locked);
                        String strG = e5.g(strQ, "\n", strJ2);
                        String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_reset);
                        zR4 = o0VarE.r(uVar);
                        objQ7 = o0VarE.q();
                        if (zR4) {
                            objQ7 = new e23.a() { // from class: aa2.h
                                @Override // e23.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i18) {
                                        case 0:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        case 1:
                                            uVar.z4(ca2.a.CHANGE_PASSCODE);
                                            return Unit.INSTANCE;
                                        case 2:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        default:
                                            u uVar2 = uVar;
                                            p2 p2Var = uVar2.f2393e;
                                            int i24 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                            if (i24 != 1) {
                                                if (i24 == 2) {
                                                    uVar2.B4();
                                                } else if (i24 == 3 || i24 == 4) {
                                                    uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                } else {
                                                    if (i24 != 5) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                    } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                        do {
                                                            value3 = p2Var.getValue();
                                                        } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                    } else {
                                                        do {
                                                            value2 = p2Var.getValue();
                                                        } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                    }
                                                }
                                            } else if (((t) p2Var.getValue()).f2381h) {
                                                uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                            } else {
                                                uVar2.B4();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            o0VarE.K(objQ7);
                        } else {
                            aVar3.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new e23.a() { // from class: aa2.h
                                    @Override // e23.a
                                    public final Object invoke() {
                                        Object value;
                                        Object value2;
                                        Object value3;
                                        switch (i18) {
                                            case 0:
                                                uVar.y4();
                                                return Unit.INSTANCE;
                                            case 1:
                                                uVar.z4(ca2.a.CHANGE_PASSCODE);
                                                return Unit.INSTANCE;
                                            case 2:
                                                uVar.y4();
                                                return Unit.INSTANCE;
                                            default:
                                                u uVar2 = uVar;
                                                p2 p2Var = uVar2.f2393e;
                                                int i24 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                                if (i24 != 1) {
                                                    if (i24 == 2) {
                                                        uVar2.B4();
                                                    } else if (i24 == 3 || i24 == 4) {
                                                        uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                    } else {
                                                        if (i24 != 5) {
                                                            u0.r();
                                                            return null;
                                                        }
                                                        if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                            do {
                                                                value = p2Var.getValue();
                                                            } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                        } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                            do {
                                                                value3 = p2Var.getValue();
                                                            } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                            ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                        } else {
                                                            do {
                                                                value2 = p2Var.getValue();
                                                            } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                            ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                        }
                                                    }
                                                } else if (((t) p2Var.getValue()).f2381h) {
                                                    uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                } else {
                                                    uVar2.B4();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                o0VarE.K(objQ7);
                            }
                        }
                        e23.a<Unit> aVar6 = (e23.a) objQ7;
                        String strQ6 = gl1.y.Q(o0VarE, R.string.confirm_cancellation_dialog);
                        if (i16 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objQ8 = o0VarE.q();
                        if (z16) {
                            c16 = 4;
                            objQ8 = new a40.a(lVar, 4);
                            o0VarE.K(objQ8);
                        } else {
                            aVar3.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                c16 = 4;
                                objQ8 = new a40.a(lVar, 4);
                                o0VarE.K(objQ8);
                            } else {
                                c16 = 4;
                            }
                        }
                        o0 o0Var2 = o0VarE;
                        c1Var.a(false, strQ4, strG, null, null, strQ5, true, false, aVar6, strQ6, (e23.a) objQ8, o0Var2, 1572864, 0, 153);
                        o0VarE = o0Var2;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(834259661);
                        if (((t) p1VarC.getF182175a()).f2387n) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 834306440, R.string.msg_manage_passcode_with_wallet, o0VarE, false);
                        } else {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 834412212, R.string.msg_manage_passcode, o0VarE, false);
                        }
                        c1 c1Var2 = c1.f110940a;
                        String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_incorrect_passcode);
                        String strG2 = e5.g(strQ, "\n", strJ);
                        String strQ8 = gl1.y.Q(o0VarE, R.string.lbl_change_passcode);
                        String strQ9 = gl1.y.Q(o0VarE, R.string.lbl_reset_passcode);
                        String strQ10 = gl1.y.Q(o0VarE, R.string.confirm_cancellation_dialog);
                        zR2 = o0VarE.r(uVar);
                        objQ4 = o0VarE.q();
                        if (zR2) {
                            final int i24 = 1;
                            objQ4 = new e23.a() { // from class: aa2.h
                                @Override // e23.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i24) {
                                        case 0:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        case 1:
                                            uVar.z4(ca2.a.CHANGE_PASSCODE);
                                            return Unit.INSTANCE;
                                        case 2:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        default:
                                            u uVar2 = uVar;
                                            p2 p2Var = uVar2.f2393e;
                                            int i25 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                            if (i25 != 1) {
                                                if (i25 == 2) {
                                                    uVar2.B4();
                                                } else if (i25 == 3 || i25 == 4) {
                                                    uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                } else {
                                                    if (i25 != 5) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                    } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                        do {
                                                            value3 = p2Var.getValue();
                                                        } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                    } else {
                                                        do {
                                                            value2 = p2Var.getValue();
                                                        } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                    }
                                                }
                                            } else if (((t) p2Var.getValue()).f2381h) {
                                                uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                            } else {
                                                uVar2.B4();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            o0VarE.K(objQ4);
                        } else {
                            aVar3.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                final int i25 = 1;
                                objQ4 = new e23.a() { // from class: aa2.h
                                    @Override // e23.a
                                    public final Object invoke() {
                                        Object value;
                                        Object value2;
                                        Object value3;
                                        switch (i25) {
                                            case 0:
                                                uVar.y4();
                                                return Unit.INSTANCE;
                                            case 1:
                                                uVar.z4(ca2.a.CHANGE_PASSCODE);
                                                return Unit.INSTANCE;
                                            case 2:
                                                uVar.y4();
                                                return Unit.INSTANCE;
                                            default:
                                                u uVar2 = uVar;
                                                p2 p2Var = uVar2.f2393e;
                                                int i26 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                                if (i26 != 1) {
                                                    if (i26 == 2) {
                                                        uVar2.B4();
                                                    } else if (i26 == 3 || i26 == 4) {
                                                        uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                    } else {
                                                        if (i26 != 5) {
                                                            u0.r();
                                                            return null;
                                                        }
                                                        if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                            do {
                                                                value = p2Var.getValue();
                                                            } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                        } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                            do {
                                                                value3 = p2Var.getValue();
                                                            } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                            ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                        } else {
                                                            do {
                                                                value2 = p2Var.getValue();
                                                            } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                            ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                        }
                                                    }
                                                } else if (((t) p2Var.getValue()).f2381h) {
                                                    uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                } else {
                                                    uVar2.B4();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                o0VarE.K(objQ4);
                            }
                        }
                        e23.a aVar7 = (e23.a) objQ4;
                        zR3 = o0VarE.r(uVar);
                        objQ5 = o0VarE.q();
                        if (zR3) {
                            final int i26 = 2;
                            objQ5 = new e23.a() { // from class: aa2.h
                                @Override // e23.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i26) {
                                        case 0:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        case 1:
                                            uVar.z4(ca2.a.CHANGE_PASSCODE);
                                            return Unit.INSTANCE;
                                        case 2:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        default:
                                            u uVar2 = uVar;
                                            p2 p2Var = uVar2.f2393e;
                                            int i27 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                            if (i27 != 1) {
                                                if (i27 == 2) {
                                                    uVar2.B4();
                                                } else if (i27 == 3 || i27 == 4) {
                                                    uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                } else {
                                                    if (i27 != 5) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                    } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                        do {
                                                            value3 = p2Var.getValue();
                                                        } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                    } else {
                                                        do {
                                                            value2 = p2Var.getValue();
                                                        } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                    }
                                                }
                                            } else if (((t) p2Var.getValue()).f2381h) {
                                                uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                            } else {
                                                uVar2.B4();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            o0VarE.K(objQ5);
                        } else {
                            aVar3.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                final int i27 = 2;
                                objQ5 = new e23.a() { // from class: aa2.h
                                    @Override // e23.a
                                    public final Object invoke() {
                                        Object value;
                                        Object value2;
                                        Object value3;
                                        switch (i27) {
                                            case 0:
                                                uVar.y4();
                                                return Unit.INSTANCE;
                                            case 1:
                                                uVar.z4(ca2.a.CHANGE_PASSCODE);
                                                return Unit.INSTANCE;
                                            case 2:
                                                uVar.y4();
                                                return Unit.INSTANCE;
                                            default:
                                                u uVar2 = uVar;
                                                p2 p2Var = uVar2.f2393e;
                                                int i28 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                                if (i28 != 1) {
                                                    if (i28 == 2) {
                                                        uVar2.B4();
                                                    } else if (i28 == 3 || i28 == 4) {
                                                        uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                    } else {
                                                        if (i28 != 5) {
                                                            u0.r();
                                                            return null;
                                                        }
                                                        if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                            do {
                                                                value = p2Var.getValue();
                                                            } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                        } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                            do {
                                                                value3 = p2Var.getValue();
                                                            } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                            ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                        } else {
                                                            do {
                                                                value2 = p2Var.getValue();
                                                            } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                            ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                        }
                                                    }
                                                } else if (((t) p2Var.getValue()).f2381h) {
                                                    uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                } else {
                                                    uVar2.B4();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                o0VarE.K(objQ5);
                            }
                        }
                        e23.a aVar8 = (e23.a) objQ5;
                        if (i16 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objQ6 = o0VarE.q();
                        if (z15) {
                            objQ6 = new a40.a(lVar, 5);
                            o0VarE.K(objQ6);
                        } else {
                            aVar3.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new a40.a(lVar, 5);
                                o0VarE.K(objQ6);
                            }
                        }
                        o0 o0Var3 = o0VarE;
                        c1Var2.b(false, strQ7, strG2, strQ8, strQ9, strQ10, true, aVar7, aVar8, (e23.a) objQ6, null, o0Var3, C.ENCODING_PCM_32BIT, 0, 17689);
                        o0VarE = o0Var3;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    str = str;
                    o0VarE.C(835407405);
                    o0VarE.g0(false);
                }
                c2.l.f(b0Var.a(aVar4, 1.0f, true), o0VarE);
                d2 d2VarA = a2.a(o0VarE);
                if (str.length() == 4 || ((t) p1VarC.getF182175a()).f2383j) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                str2 = str;
                zB = o0VarE.B(str2) | o0VarE.r(uVar);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new a42.i(1, str2, uVar);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a42.i(1, str2, uVar);
                        o0VarE.K(objQ);
                    }
                }
                e23.l lVar2 = (e23.l) objQ;
                zR = o0VarE.r(uVar);
                objQ2 = o0VarE.q();
                if (zR) {
                    final int i28 = 3;
                    objQ2 = new e23.a() { // from class: aa2.h
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            switch (i28) {
                                case 0:
                                    uVar.y4();
                                    return Unit.INSTANCE;
                                case 1:
                                    uVar.z4(ca2.a.CHANGE_PASSCODE);
                                    return Unit.INSTANCE;
                                case 2:
                                    uVar.y4();
                                    return Unit.INSTANCE;
                                default:
                                    u uVar2 = uVar;
                                    p2 p2Var = uVar2.f2393e;
                                    int i29 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                    if (i29 != 1) {
                                        if (i29 == 2) {
                                            uVar2.B4();
                                        } else if (i29 == 3 || i29 == 4) {
                                            uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                        } else {
                                            if (i29 != 5) {
                                                u0.r();
                                                return null;
                                            }
                                            if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                do {
                                                    value = p2Var.getValue();
                                                } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                            } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                do {
                                                    value3 = p2Var.getValue();
                                                } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                            } else {
                                                do {
                                                    value2 = p2Var.getValue();
                                                } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                            }
                                        }
                                    } else if (((t) p2Var.getValue()).f2381h) {
                                        uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                    } else {
                                        uVar2.B4();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        final int i29 = 3;
                        objQ2 = new e23.a() { // from class: aa2.h
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i29) {
                                    case 0:
                                        uVar.y4();
                                        return Unit.INSTANCE;
                                    case 1:
                                        uVar.z4(ca2.a.CHANGE_PASSCODE);
                                        return Unit.INSTANCE;
                                    case 2:
                                        uVar.y4();
                                        return Unit.INSTANCE;
                                    default:
                                        u uVar2 = uVar;
                                        p2 p2Var = uVar2.f2393e;
                                        int i210 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                        if (i210 != 1) {
                                            if (i210 == 2) {
                                                uVar2.B4();
                                            } else if (i210 == 3 || i210 == 4) {
                                                uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                            } else {
                                                if (i210 != 5) {
                                                    u0.r();
                                                    return null;
                                                }
                                                if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                    do {
                                                        value3 = p2Var.getValue();
                                                    } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                    ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                } else {
                                                    do {
                                                        value2 = p2Var.getValue();
                                                    } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                    ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                }
                                            }
                                        } else if (((t) p2Var.getValue()).f2381h) {
                                            uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                        } else {
                                            uVar2.B4();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        o0VarE.K(objQ2);
                    }
                }
                e23.a aVar9 = (e23.a) objQ2;
                zB2 = o0VarE.B(str2) | o0VarE.r(uVar);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new a11.n(12, str2, uVar);
                    o0VarE.K(objQ3);
                } else {
                    aVar3.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new a11.n(12, str2, uVar);
                        o0VarE.K(objQ3);
                    }
                }
                ba2.j.a(null, str2, z14, d2VarA, lVar2, aVar9, (e23.a) objQ3, o0VarE, 0);
                o0VarE.g0(true);
            } else {
                c14 = 2;
            }
            c15 = 4;
            str = ((t) p1VarC.getF182175a()).f2375b;
            bVar.getClass();
            b(0, 0, c2.l.y(aVar4, f15), str, o0VarE);
            if (((t) p1VarC.getF182175a()).f2379f) {
                o0VarE.C(-942978869);
                num = ((t) p1VarC.getF182175a()).f2374a.f26613c;
                if (num == null) {
                    o0VarE.C(832426134);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(832426135);
                    iIntValue = num.intValue();
                    if (iArr[((t) p1VarC.getF182175a()).f2374a.ordinal()] == 1) {
                        o0VarE.C(-210994451);
                        strJ3 = gl1.y.P(iIntValue, new Object[]{Integer.valueOf(((t) p1VarC.getF182175a()).f2378e)}, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -210991606, iIntValue, o0VarE, false);
                    }
                    h4.r rVarF4 = x2.f(aVar4, 1.0f);
                    bVar.getClass();
                    h4.r rVarY4 = c2.l.y(rVarF4, f15);
                    fVar.getClass();
                    o0 o0Var4 = o0VarE;
                    mh.c(strJ3, rVarY4, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, d92.b.a(o0VarE).k().e(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var4, 0, 0, 130044);
                    o0VarE = o0Var4;
                    Unit unit3 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                str = str;
                o0VarE.C(833072237);
                o0VarE.g0(false);
            }
            if (((t) p1VarC.getF182175a()).f2380g) {
                o0VarE.C(833197105);
                strQ = gl1.y.Q(o0VarE, R.string.msg_wrong_passcode_entered);
                if (((t) p1VarC.getF182175a()).f2382i) {
                    o0VarE.C(833299250);
                    if (((t) p1VarC.getF182175a()).f2387n) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 833352105, R.string.msg_reset_passcode_with_wallet, o0VarE, false);
                    } else {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 833456885, R.string.msg_reset_passcode, o0VarE, false);
                    }
                    c1 c1Var3 = c1.f110940a;
                    String strQ11 = gl1.y.Q(o0VarE, R.string.lbl_device_is_locked);
                    String strG3 = e5.g(strQ, "\n", strJ2);
                    String strQ12 = gl1.y.Q(o0VarE, R.string.lbl_reset);
                    zR4 = o0VarE.r(uVar);
                    objQ7 = o0VarE.q();
                    if (zR4) {
                        aVar3.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new e23.a() { // from class: aa2.h
                                @Override // e23.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i18) {
                                        case 0:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        case 1:
                                            uVar.z4(ca2.a.CHANGE_PASSCODE);
                                            return Unit.INSTANCE;
                                        case 2:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        default:
                                            u uVar2 = uVar;
                                            p2 p2Var = uVar2.f2393e;
                                            int i210 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                            if (i210 != 1) {
                                                if (i210 == 2) {
                                                    uVar2.B4();
                                                } else if (i210 == 3 || i210 == 4) {
                                                    uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                } else {
                                                    if (i210 != 5) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                    } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                        do {
                                                            value3 = p2Var.getValue();
                                                        } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                    } else {
                                                        do {
                                                            value2 = p2Var.getValue();
                                                        } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                    }
                                                }
                                            } else if (((t) p2Var.getValue()).f2381h) {
                                                uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                            } else {
                                                uVar2.B4();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            o0VarE.K(objQ7);
                        }
                    } else {
                        objQ7 = new e23.a() { // from class: aa2.h
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i18) {
                                    case 0:
                                        uVar.y4();
                                        return Unit.INSTANCE;
                                    case 1:
                                        uVar.z4(ca2.a.CHANGE_PASSCODE);
                                        return Unit.INSTANCE;
                                    case 2:
                                        uVar.y4();
                                        return Unit.INSTANCE;
                                    default:
                                        u uVar2 = uVar;
                                        p2 p2Var = uVar2.f2393e;
                                        int i210 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                        if (i210 != 1) {
                                            if (i210 == 2) {
                                                uVar2.B4();
                                            } else if (i210 == 3 || i210 == 4) {
                                                uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                            } else {
                                                if (i210 != 5) {
                                                    u0.r();
                                                    return null;
                                                }
                                                if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                    do {
                                                        value3 = p2Var.getValue();
                                                    } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                    ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                } else {
                                                    do {
                                                        value2 = p2Var.getValue();
                                                    } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                    ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                }
                                            }
                                        } else if (((t) p2Var.getValue()).f2381h) {
                                            uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                        } else {
                                            uVar2.B4();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        o0VarE.K(objQ7);
                    }
                    e23.a<Unit> aVar10 = (e23.a) objQ7;
                    String strQ13 = gl1.y.Q(o0VarE, R.string.confirm_cancellation_dialog);
                    if (i16 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ8 = o0VarE.q();
                    if (z16) {
                        aVar3.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            c16 = 4;
                            objQ8 = new a40.a(lVar, 4);
                            o0VarE.K(objQ8);
                        } else {
                            c16 = 4;
                        }
                    } else {
                        c16 = 4;
                        objQ8 = new a40.a(lVar, 4);
                        o0VarE.K(objQ8);
                    }
                    o0 o0Var5 = o0VarE;
                    c1Var3.a(false, strQ11, strG3, null, null, strQ12, true, false, aVar10, strQ13, (e23.a) objQ8, o0Var5, 1572864, 0, 153);
                    o0VarE = o0Var5;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(834259661);
                    if (((t) p1VarC.getF182175a()).f2387n) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 834306440, R.string.msg_manage_passcode_with_wallet, o0VarE, false);
                    } else {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 834412212, R.string.msg_manage_passcode, o0VarE, false);
                    }
                    c1 c1Var4 = c1.f110940a;
                    String strQ14 = gl1.y.Q(o0VarE, R.string.lbl_incorrect_passcode);
                    String strG4 = e5.g(strQ, "\n", strJ);
                    String strQ15 = gl1.y.Q(o0VarE, R.string.lbl_change_passcode);
                    String strQ16 = gl1.y.Q(o0VarE, R.string.lbl_reset_passcode);
                    String strQ17 = gl1.y.Q(o0VarE, R.string.confirm_cancellation_dialog);
                    zR2 = o0VarE.r(uVar);
                    objQ4 = o0VarE.q();
                    if (zR2) {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int i210 = 1;
                            objQ4 = new e23.a() { // from class: aa2.h
                                @Override // e23.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i210) {
                                        case 0:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        case 1:
                                            uVar.z4(ca2.a.CHANGE_PASSCODE);
                                            return Unit.INSTANCE;
                                        case 2:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        default:
                                            u uVar2 = uVar;
                                            p2 p2Var = uVar2.f2393e;
                                            int i211 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                            if (i211 != 1) {
                                                if (i211 == 2) {
                                                    uVar2.B4();
                                                } else if (i211 == 3 || i211 == 4) {
                                                    uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                } else {
                                                    if (i211 != 5) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                    } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                        do {
                                                            value3 = p2Var.getValue();
                                                        } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                    } else {
                                                        do {
                                                            value2 = p2Var.getValue();
                                                        } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                    }
                                                }
                                            } else if (((t) p2Var.getValue()).f2381h) {
                                                uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                            } else {
                                                uVar2.B4();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            o0VarE.K(objQ4);
                        }
                    } else {
                        final int i211 = 1;
                        objQ4 = new e23.a() { // from class: aa2.h
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i211) {
                                    case 0:
                                        uVar.y4();
                                        return Unit.INSTANCE;
                                    case 1:
                                        uVar.z4(ca2.a.CHANGE_PASSCODE);
                                        return Unit.INSTANCE;
                                    case 2:
                                        uVar.y4();
                                        return Unit.INSTANCE;
                                    default:
                                        u uVar2 = uVar;
                                        p2 p2Var = uVar2.f2393e;
                                        int i212 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                        if (i212 != 1) {
                                            if (i212 == 2) {
                                                uVar2.B4();
                                            } else if (i212 == 3 || i212 == 4) {
                                                uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                            } else {
                                                if (i212 != 5) {
                                                    u0.r();
                                                    return null;
                                                }
                                                if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                    do {
                                                        value3 = p2Var.getValue();
                                                    } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                    ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                } else {
                                                    do {
                                                        value2 = p2Var.getValue();
                                                    } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                    ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                }
                                            }
                                        } else if (((t) p2Var.getValue()).f2381h) {
                                            uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                        } else {
                                            uVar2.B4();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        o0VarE.K(objQ4);
                    }
                    e23.a aVar11 = (e23.a) objQ4;
                    zR3 = o0VarE.r(uVar);
                    objQ5 = o0VarE.q();
                    if (zR3) {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            final int i212 = 2;
                            objQ5 = new e23.a() { // from class: aa2.h
                                @Override // e23.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i212) {
                                        case 0:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        case 1:
                                            uVar.z4(ca2.a.CHANGE_PASSCODE);
                                            return Unit.INSTANCE;
                                        case 2:
                                            uVar.y4();
                                            return Unit.INSTANCE;
                                        default:
                                            u uVar2 = uVar;
                                            p2 p2Var = uVar2.f2393e;
                                            int i213 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                            if (i213 != 1) {
                                                if (i213 == 2) {
                                                    uVar2.B4();
                                                } else if (i213 == 3 || i213 == 4) {
                                                    uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                                } else {
                                                    if (i213 != 5) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                    } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                        do {
                                                            value3 = p2Var.getValue();
                                                        } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                    } else {
                                                        do {
                                                            value2 = p2Var.getValue();
                                                        } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                        ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                    }
                                                }
                                            } else if (((t) p2Var.getValue()).f2381h) {
                                                uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                            } else {
                                                uVar2.B4();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            o0VarE.K(objQ5);
                        }
                    } else {
                        final int i213 = 2;
                        objQ5 = new e23.a() { // from class: aa2.h
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i213) {
                                    case 0:
                                        uVar.y4();
                                        return Unit.INSTANCE;
                                    case 1:
                                        uVar.z4(ca2.a.CHANGE_PASSCODE);
                                        return Unit.INSTANCE;
                                    case 2:
                                        uVar.y4();
                                        return Unit.INSTANCE;
                                    default:
                                        u uVar2 = uVar;
                                        p2 p2Var = uVar2.f2393e;
                                        int i214 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                        if (i214 != 1) {
                                            if (i214 == 2) {
                                                uVar2.B4();
                                            } else if (i214 == 3 || i214 == 4) {
                                                uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                            } else {
                                                if (i214 != 5) {
                                                    u0.r();
                                                    return null;
                                                }
                                                if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                                } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                    do {
                                                        value3 = p2Var.getValue();
                                                    } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                    ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                                } else {
                                                    do {
                                                        value2 = p2Var.getValue();
                                                    } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                    ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                                }
                                            }
                                        } else if (((t) p2Var.getValue()).f2381h) {
                                            uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                        } else {
                                            uVar2.B4();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        o0VarE.K(objQ5);
                    }
                    e23.a aVar12 = (e23.a) objQ5;
                    if (i16 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ6 = o0VarE.q();
                    if (z15) {
                        aVar3.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new a40.a(lVar, 5);
                            o0VarE.K(objQ6);
                        }
                    } else {
                        objQ6 = new a40.a(lVar, 5);
                        o0VarE.K(objQ6);
                    }
                    o0 o0Var6 = o0VarE;
                    c1Var4.b(false, strQ14, strG4, strQ15, strQ16, strQ17, true, aVar11, aVar12, (e23.a) objQ6, null, o0Var6, C.ENCODING_PCM_32BIT, 0, 17689);
                    o0VarE = o0Var6;
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                str = str;
                o0VarE.C(835407405);
                o0VarE.g0(false);
            }
            c2.l.f(b0Var.a(aVar4, 1.0f, true), o0VarE);
            d2 d2VarA2 = a2.a(o0VarE);
            if (str.length() == 4) {
                z14 = false;
            } else {
                z14 = false;
            }
            str2 = str;
            zB = o0VarE.B(str2) | o0VarE.r(uVar);
            objQ = o0VarE.q();
            if (zB) {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a42.i(1, str2, uVar);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new a42.i(1, str2, uVar);
                o0VarE.K(objQ);
            }
            e23.l lVar3 = (e23.l) objQ;
            zR = o0VarE.r(uVar);
            objQ2 = o0VarE.q();
            if (zR) {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    final int i214 = 3;
                    objQ2 = new e23.a() { // from class: aa2.h
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            switch (i214) {
                                case 0:
                                    uVar.y4();
                                    return Unit.INSTANCE;
                                case 1:
                                    uVar.z4(ca2.a.CHANGE_PASSCODE);
                                    return Unit.INSTANCE;
                                case 2:
                                    uVar.y4();
                                    return Unit.INSTANCE;
                                default:
                                    u uVar2 = uVar;
                                    p2 p2Var = uVar2.f2393e;
                                    int i215 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                    if (i215 != 1) {
                                        if (i215 == 2) {
                                            uVar2.B4();
                                        } else if (i215 == 3 || i215 == 4) {
                                            uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                        } else {
                                            if (i215 != 5) {
                                                u0.r();
                                                return null;
                                            }
                                            if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                                do {
                                                    value = p2Var.getValue();
                                                } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                            } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                                do {
                                                    value3 = p2Var.getValue();
                                                } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                            } else {
                                                do {
                                                    value2 = p2Var.getValue();
                                                } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                                ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                            }
                                        }
                                    } else if (((t) p2Var.getValue()).f2381h) {
                                        uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                    } else {
                                        uVar2.B4();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    o0VarE.K(objQ2);
                }
            } else {
                final int i215 = 3;
                objQ2 = new e23.a() { // from class: aa2.h
                    @Override // e23.a
                    public final Object invoke() {
                        Object value;
                        Object value2;
                        Object value3;
                        switch (i215) {
                            case 0:
                                uVar.y4();
                                return Unit.INSTANCE;
                            case 1:
                                uVar.z4(ca2.a.CHANGE_PASSCODE);
                                return Unit.INSTANCE;
                            case 2:
                                uVar.y4();
                                return Unit.INSTANCE;
                            default:
                                u uVar2 = uVar;
                                p2 p2Var = uVar2.f2393e;
                                int i216 = u.b.f2395a[((t) p2Var.getValue()).f2374a.ordinal()];
                                if (i216 != 1) {
                                    if (i216 == 2) {
                                        uVar2.B4();
                                    } else if (i216 == 3 || i216 == 4) {
                                        uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                    } else {
                                        if (i216 != 5) {
                                            u0.r();
                                            return null;
                                        }
                                        if (!p005kotlin.jvm.internal.s.g(((t) p2Var.getValue()).f2376c, ((t) p2Var.getValue()).f2377d)) {
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, t.a((t) value, null, null, null, "", 0, true, false, false, false, false, false, false, 16343)));
                                        } else if (uVar2.f2389a == ca2.a.SET_PASSCODE) {
                                            do {
                                                value3 = p2Var.getValue();
                                            } while (!p2Var.b(value3, t.a((t) value3, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                            ge1.b.T(v1.a(uVar2), null, null, new x(uVar2, null), 3);
                                        } else {
                                            do {
                                                value2 = p2Var.getValue();
                                            } while (!p2Var.b(value2, t.a((t) value2, null, null, null, null, 0, false, false, false, false, true, false, false, 15871)));
                                            ge1.b.T(v1.a(uVar2), null, null, new v(uVar2, null), 3);
                                        }
                                    }
                                } else if (((t) p2Var.getValue()).f2381h) {
                                    uVar2.A4(ca2.c.a(((t) p2Var.getValue()).f2374a));
                                } else {
                                    uVar2.B4();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                };
                o0VarE.K(objQ2);
            }
            e23.a aVar13 = (e23.a) objQ2;
            zB2 = o0VarE.B(str2) | o0VarE.r(uVar);
            objQ3 = o0VarE.q();
            if (zB2) {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new a11.n(12, str2, uVar);
                    o0VarE.K(objQ3);
                }
            } else {
                objQ3 = new a11.n(12, str2, uVar);
                o0VarE.K(objQ3);
            }
            ba2.j.a(null, str2, z14, d2VarA2, lVar3, aVar13, (e23.a) objQ3, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l((Object) uVar, (Object) aVar, (Object) aVar2, (e23.l) lVar, i14, 1);
        }
    }

    public static final h4.r d(h4.r rVar, boolean z14, e23.q<? super h4.r, ? super p3.m, ? super Integer, ? extends h4.r> qVar, p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        if (!z14) {
            mVar.C(-1260264692);
            mVar.f();
            return rVar;
        }
        mVar.C(-1260309704);
        h4.r rVarThen = rVar.then(qVar.invoke(h4.r.S, mVar, Integer.valueOf(((i14 >> 3) & 112) | 6)));
        mVar.f();
        return rVarThen;
    }
}
