package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.k3;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.fb;
import i3.gb;
import i3.i5;
import i3.i7;
import i3.nj;
import java.util.List;
import n70.z2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import v62.s6;
import v62.s8;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f157664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f157665b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.DashboardTopBarComposableKt$AddDataIcon$1$1", f = "DashboardTopBarComposable.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f157666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f157667b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, p3.p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157666a = aVar;
            this.f157667b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157666a, this.f157667b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            float f14 = c0.f157664a;
            if (this.f157667b.getF182175a().booleanValue()) {
                this.f157666a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.DashboardTopBarComposableKt$DeviceIcon$1$1", f = "DashboardTopBarComposable.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f157668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f157669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f157670c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f157668a = aVar;
            this.f157669b = aVar2;
            this.f157670c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f157668a, this.f157669b, this.f157670c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            float f14 = c0.f157664a;
            if (this.f157670c.getF182175a().booleanValue()) {
                this.f157668a.invoke();
                this.f157669b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f157672b;

        static {
            int[] iArr = new int[o70.g.values().length];
            try {
                iArr[o70.g.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.g.NO_BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f157671a = iArr;
            int[] iArr2 = new int[jc0.b.values().length];
            try {
                iArr2[jc0.b.CHARGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[jc0.b.FULLY_CHARGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f157672b = iArr2;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f157664a = 56;
        f157665b = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i53.c<? extends o70.e> cVar, List<z2.b> list, e23.l<? super o70.e, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.p1 p1Var;
        p3.o0 o0VarE = mVar.E(-669853779);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            l22.a aVar2 = new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var3 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n("");
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var4 = (p3.p1) objQ3;
            Boolean bool = (Boolean) p1Var2.getF182175a();
            bool.booleanValue();
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ4 = o0VarE.q();
            if (z14 || objQ4 == c2565a) {
                objQ4 = new a(aVar, p1Var2, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, bool, o0VarE);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarE.C(-1195146703);
                String str = (String) p1Var4.getF182175a();
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new rk0.w(p1Var3, 15);
                    o0VarE.K(objQ5);
                }
                d(48, (e23.a) objQ5, str, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1194989099);
                o0VarE.g0(false);
            }
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(aVar3, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            s62.a.f157643a.getClass();
            u4.d dVarA = s6.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_add_data);
            long jB = d92.b.a(o0VarE).f().b();
            bVar.getClass();
            h4.r rVarQ = x2.q(aVar3, eVar.f97922g);
            p5.l.f136032b.getClass();
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ6;
            bVar.getClass();
            gb gbVarA = fb.a(j92.b.f97901d.f97904c, 4, 0L, false);
            p5.l lVarA = p5.l.a(0);
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                p1Var = p1Var2;
                objQ7 = new rk0.w(p1Var, 16);
                o0VarE.K(objQ7);
            } else {
                p1Var = p1Var2;
            }
            i7.b(dVarA, strQ, u1.w.b(rVarQ, jVar, gbVarA, false, null, lVarA, (e23.a) objQ7, 12), jB, o0VarE, 0, 0);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = new rk0.w(p1Var, 17);
                o0VarE.K(objQ8);
            }
            i3.u.a(zBooleanValue, (e23.a) objQ8, u1.n.e(aVar3, v.h.t(o0VarE), o4.m1.f128891a), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-407471902, new bv0.e(cVar, aVar2, list, lVar, p1Var, p1Var4, p1Var3, 6), o0VarE), o0VarE, 48, 48, 2040);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d((Object) cVar, (Object) list, (e23.l) lVar, (e23.a) aVar, i14, 22);
        }
    }

    public static final void b(e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        p3.o0 o0VarE = mVar.E(-2079748363);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            x.f157821a.getClass();
            aVar2 = aVar;
            i3.u.b(x.f157822b, aVar2, null, null, null, false, null, null, o0VarE, ((i15 << 3) & 112) | 6, 508);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(aVar2, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x031f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0337  */
    /* JADX WARN: Code duplicated, block: B:109:0x0354  */
    /* JADX WARN: Code duplicated, block: B:114:0x0363  */
    /* JADX WARN: Code duplicated, block: B:116:0x0367  */
    /* JADX WARN: Code duplicated, block: B:117:0x0391  */
    /* JADX WARN: Code duplicated, block: B:119:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:123:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:126:0x0426  */
    /* JADX WARN: Code duplicated, block: B:128:0x042c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0438  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x0194  */
    /* JADX WARN: Code duplicated, block: B:58:0x019b  */
    /* JADX WARN: Code duplicated, block: B:59:0x019f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x020b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0251  */
    /* JADX WARN: Code duplicated, block: B:78:0x0279  */
    /* JADX WARN: Code duplicated, block: B:82:0x0292  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:89:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:90:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:98:0x0307  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar, k3 k3Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
        e23.a<Unit> aVar3;
        int i16;
        int i17;
        boolean z14;
        k3 k3Var2;
        e23.a<Unit> aVar4;
        p2 p2VarI0;
        int i18;
        p3.m.a aVar5;
        int i19;
        e23.a<Unit> aVar6;
        k3 k3Var3;
        Object objQ;
        p3.p1 p1VarC;
        o70.a0 a0Var;
        sd2.f fVar;
        p3.p1 p1VarC2;
        p3.p1 p1VarC3;
        p3.p1 p1VarC4;
        p3.p1 p1VarC5;
        Context context;
        Object objQ2;
        p3.m.a.C2565a c2565a;
        int i24;
        n70.g gVar;
        boolean zR;
        Object objQ3;
        c.q qVarC;
        h4.r.a aVar7;
        k3 k3Var4;
        j92.b bVar;
        j92.e eVar;
        float f14;
        s2 s2VarA;
        e23.a<Unit> aVar8;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar9;
        h5.g.a.b bVar2;
        boolean zR2;
        Object objQ4;
        int i25;
        boolean zR3;
        Object objQ5;
        int i26;
        o70.a0 a0Var2;
        com.garmin.android.apps.connectmobile.devices.model.u uVar;
        Object objQ6;
        boolean zR4;
        Object objQ7;
        n70.p1.a aVar10;
        boolean zR5;
        Object objQ8;
        boolean zR6;
        Object objQ9;
        boolean zR7;
        Object objQ10;
        o70.a0 a0Var3;
        n70.p1.a aVar11;
        boolean zR8;
        Object objQ11;
        boolean zR9;
        Object objQ12;
        boolean zR10;
        Object objQ13;
        boolean zR11;
        Object objQ14;
        n70.p1.a aVar12;
        dVar.getClass();
        p3.o0 o0VarE = mVar.E(73591803);
        int i27 = (o0VarE.r(dVar) ? 4 : 2) | i14;
        int i28 = i27 | 16;
        int i29 = i15 & 4;
        if (i29 == 0) {
            if ((i14 & 384) == 0) {
                aVar3 = aVar;
                i28 |= o0VarE.r(aVar3) ? 256 : 128;
            }
            if (o0VarE.r(aVar2)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i17 = i28 | i16;
            if ((i17 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                i18 = i14 & 1;
                aVar5 = p3.m.f135153a;
                if (i18 != 0 || o0VarE.o0()) {
                    nj.f89109a.getClass();
                    c2.x1 x1VarA = nj.a(o0VarE);
                    i19 = i17 & (-113);
                    if (i29 != 0) {
                        objQ = o0VarE.q();
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ro0.h(19);
                            o0VarE.K(objQ);
                        }
                        aVar3 = (e23.a) objQ;
                    }
                    aVar6 = aVar3;
                    k3Var3 = x1VarA;
                } else {
                    o0VarE.e();
                    i19 = i17 & (-113);
                    aVar6 = aVar3;
                    k3Var3 = k3Var;
                }
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                p1VarC = p3.p0.c(dVar.f33560q, o0VarE, 0);
                a0Var = (o70.a0) p1VarC.getF182175a();
                if (a0Var != null || (aVar12 = a0Var.f129912a) == null) {
                    fVar = null;
                } else {
                    fVar = aVar12.f124475b.f34316a;
                }
                p1VarC2 = p3.p0.c(dVar.f33564w, o0VarE, 0);
                p1VarC3 = p3.p0.c(dVar.f33563v, o0VarE, 0);
                p1VarC4 = p3.p0.c(dVar.f33561r, o0VarE, 0);
                p1VarC5 = p3.p0.c(dVar.f33562t, o0VarE, 0);
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                objQ2 = o0VarE.q();
                aVar5.getClass();
                c2565a = p3.m.a.f135155b;
                i24 = 6;
                if (objQ2 == c2565a) {
                    objQ2 = (n70.g) KoinJavaComponent.get$default(n70.g.class, null, null, 6, null);
                    o0VarE.K(objQ2);
                }
                gVar = (n70.g) objQ2;
                g.h hVar = new g.h();
                zR = o0VarE.r(dVar);
                objQ3 = o0VarE.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new b0(dVar, 0);
                    o0VarE.K(objQ3);
                }
                qVarC = c.w.c(hVar, (e23.l) objQ3, o0VarE, 0);
                h4.d.f81522a.getClass();
                h4.g.b bVar3 = h4.d.a.f81534l;
                aVar7 = h4.r.S;
                d92.b.f58623a.getClass();
                k3Var4 = k3Var3;
                h4.r rVarB = x2.b(c2.l.G(x2.f(u1.n.e(aVar7, o4.d0.c(0.5f, d92.b.a(o0VarE).c().c(), 14), o4.m1.f128891a), 1.0f), k3Var3), 0.0f, f157664a, 1);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                float f15 = eVar.f97921f;
                f14 = eVar.f97922g;
                h4.r rVarA = c2.l.A(rVarB, f15, 0.0f, 2);
                c2.j.f22691a.getClass();
                s2VarA = q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
                aVar8 = aVar6;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                h5.g.V.getClass();
                aVar9 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar9);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                b12.b bVar4 = (b12.b) p1VarC2.getF182175a();
                boolean zX3 = dVar.f33552i.X3();
                zR2 = o0VarE.r(qVarC) | o0VarE.r(gVar) | o0VarE.r(context);
                objQ4 = o0VarE.q();
                i25 = 22;
                if (zR2 || objQ4 == c2565a) {
                    objQ4 = new q42.v(qVarC, i25, gVar, context);
                    o0VarE.K(objQ4);
                }
                e23.a aVar13 = (e23.a) objQ4;
                zR3 = o0VarE.r(gVar) | o0VarE.r(context);
                objQ5 = o0VarE.q();
                i26 = 21;
                if (zR3 || objQ5 == c2565a) {
                    objQ5 = new rk0.f(i26, gVar, context);
                    o0VarE.K(objQ5);
                }
                i(bVar4, zX3, aVar8, aVar13, (e23.a) objQ5, aVar2, o0VarE, b12.b.f14385f | (i19 & 896) | ((i19 << 6) & 458752));
                o0VarE = o0VarE;
                g((o70.a0) p1VarC.getF182175a(), o0VarE, 8);
                c2.l.f(u2Var.a(aVar7, 1.0f, true), o0VarE);
                if (fVar != null) {
                    o0VarE.C(-145361239);
                    i53.c cVarE = i53.a.e((List) p1VarC3.getF182175a());
                    List list = (List) p1VarC5.getF182175a();
                    zR5 = o0VarE.r(gVar) | o0VarE.r(context);
                    objQ8 = o0VarE.q();
                    if (zR5 || objQ8 == c2565a) {
                        objQ8 = new rk0.g(21, gVar, context);
                        o0VarE.K(objQ8);
                    }
                    e23.l lVar = (e23.l) objQ8;
                    zR6 = o0VarE.r(dVar);
                    objQ9 = o0VarE.q();
                    if (zR6 || objQ9 == c2565a) {
                        objQ9 = new r70.t(dVar, i24);
                        o0VarE.K(objQ9);
                    }
                    a(cVarE, list, lVar, (e23.a) objQ9, o0VarE, 0);
                    o70.a0 a0Var4 = (o70.a0) p1VarC.getF182175a();
                    zR7 = o0VarE.r(dVar);
                    objQ10 = o0VarE.q();
                    if (zR7 || objQ10 == c2565a) {
                        objQ10 = new r70.t(dVar, 7);
                        o0VarE.K(objQ10);
                    }
                    h(a0Var4, (e23.a) objQ10, o0VarE, 8);
                    a0Var3 = (o70.a0) p1VarC.getF182175a();
                    if (a0Var3 != null) {
                        aVar11 = a0Var3.f129912a;
                    } else {
                        aVar11 = null;
                    }
                    List list2 = (List) p1VarC4.getF182175a();
                    zR8 = o0VarE.r(dVar) | o0VarE.r(context);
                    objQ11 = o0VarE.q();
                    if (zR8 || objQ11 == c2565a) {
                        objQ11 = new rk0.g(22, dVar, context);
                        o0VarE.K(objQ11);
                    }
                    e23.l lVar2 = (e23.l) objQ11;
                    zR9 = o0VarE.r(dVar) | o0VarE.r(context);
                    objQ12 = o0VarE.q();
                    if (zR9 || objQ12 == c2565a) {
                        objQ12 = new rk0.f(22, dVar, context);
                        o0VarE.K(objQ12);
                    }
                    e23.a aVar14 = (e23.a) objQ12;
                    zR10 = o0VarE.r(dVar);
                    objQ13 = o0VarE.q();
                    if (zR10 || objQ13 == c2565a) {
                        objQ13 = new r70.t(dVar, 4);
                        o0VarE.K(objQ13);
                    }
                    e23.a aVar15 = (e23.a) objQ13;
                    zR11 = o0VarE.r(dVar);
                    objQ14 = o0VarE.q();
                    if (zR11 || objQ14 == c2565a) {
                        objQ14 = new r70.t(dVar, 5);
                        o0VarE.K(objQ14);
                    }
                    f(fVar, aVar11, list2, lVar2, aVar14, aVar15, (e23.a) objQ14, o0VarE, 64);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    a0Var2 = (o70.a0) p1VarC.getF182175a();
                    if (a0Var2 != null || (aVar10 = a0Var2.f129912a) == null) {
                        uVar = null;
                    } else {
                        uVar = aVar10.f124475b;
                    }
                    if (uVar == null) {
                        o0VarE.C(-143732158);
                        bVar.getClass();
                        h4.r rVarC2 = c2.l.C(aVar7, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                        bVar.getClass();
                        c2.l.f(x2.q(rVarC2, f14), o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-143488157);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = s6.a(t62.b.f162798a);
                        String strQ = gl1.y.Q(o0VarE, R.string.txt_add_device);
                        bVar.getClass();
                        h4.r rVarC3 = c2.l.C(aVar7, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                        bVar.getClass();
                        h4.r rVarQ = x2.q(rVarC3, f14);
                        p5.l.f136032b.getClass();
                        objQ6 = o0VarE.q();
                        if (objQ6 == c2565a) {
                            objQ6 = kg.f.b(o0VarE);
                        }
                        a2.j jVar = (a2.j) objQ6;
                        bVar.getClass();
                        gb gbVarA = fb.a(j92.b.f97901d.f97904c, 4, 0L, false);
                        p5.l lVarA = p5.l.a(0);
                        zR4 = o0VarE.r(context);
                        objQ7 = o0VarE.q();
                        if (zR4 || objQ7 == c2565a) {
                            objQ7 = new r(context, 1);
                            o0VarE.K(objQ7);
                        }
                        i7.b(dVarA, strQ, u1.w.b(rVarQ, jVar, gbVarA, false, null, lVarA, (e23.a) objQ7, 12), 0L, o0VarE, 0, 8);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    }
                }
                o0VarE.g0(true);
                k3Var2 = k3Var4;
                aVar4 = aVar8;
            } else {
                o0VarE.e();
                k3Var2 = k3Var;
                aVar4 = aVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.f0(i14, i15, 24, dVar, k3Var2, aVar4, aVar2);
            }
        }
        i28 = i27 | 400;
        aVar3 = aVar;
        if (o0VarE.r(aVar2)) {
            i16 = 2048;
        } else {
            i16 = 1024;
        }
        i17 = i28 | i16;
        if ((i17 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            i18 = i14 & 1;
            aVar5 = p3.m.f135153a;
            if (i18 != 0) {
                nj.f89109a.getClass();
                c2.x1 x1VarA2 = nj.a(o0VarE);
                i19 = i17 & (-113);
                if (i29 != 0) {
                    objQ = o0VarE.q();
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ro0.h(19);
                        o0VarE.K(objQ);
                    }
                    aVar3 = (e23.a) objQ;
                }
                aVar6 = aVar3;
                k3Var3 = x1VarA2;
            } else {
                nj.f89109a.getClass();
                c2.x1 x1VarA3 = nj.a(o0VarE);
                i19 = i17 & (-113);
                if (i29 != 0) {
                    objQ = o0VarE.q();
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ro0.h(19);
                        o0VarE.K(objQ);
                    }
                    aVar3 = (e23.a) objQ;
                }
                aVar6 = aVar3;
                k3Var3 = x1VarA3;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            p1VarC = p3.p0.c(dVar.f33560q, o0VarE, 0);
            a0Var = (o70.a0) p1VarC.getF182175a();
            if (a0Var != null) {
                fVar = null;
            } else {
                fVar = null;
            }
            p1VarC2 = p3.p0.c(dVar.f33564w, o0VarE, 0);
            p1VarC3 = p3.p0.c(dVar.f33563v, o0VarE, 0);
            p1VarC4 = p3.p0.c(dVar.f33561r, o0VarE, 0);
            p1VarC5 = p3.p0.c(dVar.f33562t, o0VarE, 0);
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            objQ2 = o0VarE.q();
            aVar5.getClass();
            c2565a = p3.m.a.f135155b;
            i24 = 6;
            if (objQ2 == c2565a) {
                objQ2 = (n70.g) KoinJavaComponent.get$default(n70.g.class, null, null, 6, null);
                o0VarE.K(objQ2);
            }
            gVar = (n70.g) objQ2;
            g.h hVar2 = new g.h();
            zR = o0VarE.r(dVar);
            objQ3 = o0VarE.q();
            if (zR) {
                objQ3 = new b0(dVar, 0);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new b0(dVar, 0);
                o0VarE.K(objQ3);
            }
            qVarC = c.w.c(hVar2, (e23.l) objQ3, o0VarE, 0);
            h4.d.f81522a.getClass();
            h4.g.b bVar5 = h4.d.a.f81534l;
            aVar7 = h4.r.S;
            d92.b.f58623a.getClass();
            k3Var4 = k3Var3;
            h4.r rVarB2 = x2.b(c2.l.G(x2.f(u1.n.e(aVar7, o4.d0.c(0.5f, d92.b.a(o0VarE).c().c(), 14), o4.m1.f128891a), 1.0f), k3Var3), 0.0f, f157664a, 1);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            float f16 = eVar.f97921f;
            f14 = eVar.f97922g;
            h4.r rVarA2 = c2.l.A(rVarB2, f16, 0.0f, 2);
            c2.j.f22691a.getClass();
            s2VarA = q2.a(c2.j.f22692b, bVar5, o0VarE, 48);
            aVar8 = aVar6;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA2, o0VarE);
            h5.g.V.getClass();
            aVar9 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar9);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            b12.b bVar6 = (b12.b) p1VarC2.getF182175a();
            boolean zX4 = dVar.f33552i.X3();
            zR2 = o0VarE.r(qVarC) | o0VarE.r(gVar) | o0VarE.r(context);
            objQ4 = o0VarE.q();
            i25 = 22;
            if (zR2) {
                objQ4 = new q42.v(qVarC, i25, gVar, context);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new q42.v(qVarC, i25, gVar, context);
                o0VarE.K(objQ4);
            }
            e23.a aVar16 = (e23.a) objQ4;
            zR3 = o0VarE.r(gVar) | o0VarE.r(context);
            objQ5 = o0VarE.q();
            i26 = 21;
            if (zR3) {
                objQ5 = new rk0.f(i26, gVar, context);
                o0VarE.K(objQ5);
            } else {
                objQ5 = new rk0.f(i26, gVar, context);
                o0VarE.K(objQ5);
            }
            i(bVar6, zX4, aVar8, aVar16, (e23.a) objQ5, aVar2, o0VarE, b12.b.f14385f | (i19 & 896) | ((i19 << 6) & 458752));
            o0VarE = o0VarE;
            g((o70.a0) p1VarC.getF182175a(), o0VarE, 8);
            c2.l.f(u2Var2.a(aVar7, 1.0f, true), o0VarE);
            if (fVar != null) {
                o0VarE.C(-145361239);
                i53.c cVarE2 = i53.a.e((List) p1VarC3.getF182175a());
                List list3 = (List) p1VarC5.getF182175a();
                zR5 = o0VarE.r(gVar) | o0VarE.r(context);
                objQ8 = o0VarE.q();
                if (zR5) {
                    objQ8 = new rk0.g(21, gVar, context);
                    o0VarE.K(objQ8);
                } else {
                    objQ8 = new rk0.g(21, gVar, context);
                    o0VarE.K(objQ8);
                }
                e23.l lVar3 = (e23.l) objQ8;
                zR6 = o0VarE.r(dVar);
                objQ9 = o0VarE.q();
                if (zR6) {
                    objQ9 = new r70.t(dVar, i24);
                    o0VarE.K(objQ9);
                } else {
                    objQ9 = new r70.t(dVar, i24);
                    o0VarE.K(objQ9);
                }
                a(cVarE2, list3, lVar3, (e23.a) objQ9, o0VarE, 0);
                o70.a0 a0Var5 = (o70.a0) p1VarC.getF182175a();
                zR7 = o0VarE.r(dVar);
                objQ10 = o0VarE.q();
                if (zR7) {
                    objQ10 = new r70.t(dVar, 7);
                    o0VarE.K(objQ10);
                } else {
                    objQ10 = new r70.t(dVar, 7);
                    o0VarE.K(objQ10);
                }
                h(a0Var5, (e23.a) objQ10, o0VarE, 8);
                a0Var3 = (o70.a0) p1VarC.getF182175a();
                if (a0Var3 != null) {
                    aVar11 = a0Var3.f129912a;
                } else {
                    aVar11 = null;
                }
                List list4 = (List) p1VarC4.getF182175a();
                zR8 = o0VarE.r(dVar) | o0VarE.r(context);
                objQ11 = o0VarE.q();
                if (zR8) {
                    objQ11 = new rk0.g(22, dVar, context);
                    o0VarE.K(objQ11);
                } else {
                    objQ11 = new rk0.g(22, dVar, context);
                    o0VarE.K(objQ11);
                }
                e23.l lVar4 = (e23.l) objQ11;
                zR9 = o0VarE.r(dVar) | o0VarE.r(context);
                objQ12 = o0VarE.q();
                if (zR9) {
                    objQ12 = new rk0.f(22, dVar, context);
                    o0VarE.K(objQ12);
                } else {
                    objQ12 = new rk0.f(22, dVar, context);
                    o0VarE.K(objQ12);
                }
                e23.a aVar17 = (e23.a) objQ12;
                zR10 = o0VarE.r(dVar);
                objQ13 = o0VarE.q();
                if (zR10) {
                    objQ13 = new r70.t(dVar, 4);
                    o0VarE.K(objQ13);
                } else {
                    objQ13 = new r70.t(dVar, 4);
                    o0VarE.K(objQ13);
                }
                e23.a aVar18 = (e23.a) objQ13;
                zR11 = o0VarE.r(dVar);
                objQ14 = o0VarE.q();
                if (zR11) {
                    objQ14 = new r70.t(dVar, 5);
                    o0VarE.K(objQ14);
                } else {
                    objQ14 = new r70.t(dVar, 5);
                    o0VarE.K(objQ14);
                }
                f(fVar, aVar11, list4, lVar4, aVar17, aVar18, (e23.a) objQ14, o0VarE, 64);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                a0Var2 = (o70.a0) p1VarC.getF182175a();
                if (a0Var2 != null) {
                    uVar = null;
                } else {
                    uVar = null;
                }
                if (uVar == null) {
                    o0VarE.C(-143732158);
                    bVar.getClass();
                    h4.r rVarC4 = c2.l.C(aVar7, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    bVar.getClass();
                    c2.l.f(x2.q(rVarC4, f14), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-143488157);
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = s6.a(t62.b.f162798a);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.txt_add_device);
                    bVar.getClass();
                    h4.r rVarC5 = c2.l.C(aVar7, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    bVar.getClass();
                    h4.r rVarQ2 = x2.q(rVarC5, f14);
                    p5.l.f136032b.getClass();
                    objQ6 = o0VarE.q();
                    if (objQ6 == c2565a) {
                        objQ6 = kg.f.b(o0VarE);
                    }
                    a2.j jVar2 = (a2.j) objQ6;
                    bVar.getClass();
                    gb gbVarA2 = fb.a(j92.b.f97901d.f97904c, 4, 0L, false);
                    p5.l lVarA2 = p5.l.a(0);
                    zR4 = o0VarE.r(context);
                    objQ7 = o0VarE.q();
                    if (zR4) {
                        objQ7 = new r(context, 1);
                        o0VarE.K(objQ7);
                    } else {
                        objQ7 = new r(context, 1);
                        o0VarE.K(objQ7);
                    }
                    i7.b(dVarA2, strQ2, u1.w.b(rVarQ2, jVar2, gbVarA2, false, null, lVarA2, (e23.a) objQ7, 12), 0L, o0VarE, 0, 8);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
            }
            o0VarE.g0(true);
            k3Var2 = k3Var4;
            aVar4 = aVar8;
        } else {
            o0VarE.e();
            k3Var2 = k3Var;
            aVar4 = aVar3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(i14, i15, 24, dVar, k3Var2, aVar4, aVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    public static final void d(int i14, e23.a aVar, String str, p3.m mVar) {
        p3.o0 o0VarE = mVar.E(-255760010);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new gp.h(aVar, context, 12);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.h(aVar, context, 12);
                    o0VarE.K(objQ);
                }
            }
            w52.u0.b(str, (e23.a) objQ, aVar, o0VarE, (i15 & 14) | 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str, aVar, i14, 26);
        }
    }

    public static final void e(String str, boolean z14, jc0.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-201845942);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            i3.u.b(z3.f.c(2038935322, new r11.l(cVar, str, z14, 3), o0VarE), aVar, null, null, null, false, null, null, o0VarE, ((i15 >> 6) & 112) | 6, 508);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(str, z14, (Object) cVar, (o13.h) aVar, i14, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(sd2.f fVar, n70.p1.a aVar, List<z2.b> list, e23.l<? super Long, Unit> lVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        p3.o0 o0Var;
        int i15;
        long jE;
        p3.o0 o0VarE = mVar.E(-1510948528);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536) | (o0VarE.r(aVar4) ? 1048576 : 524288);
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Boolean bool = (Boolean) p1Var.getF182175a();
            bool.booleanValue();
            boolean z14 = ((i16 & 3670016) == 1048576) | ((i16 & 458752) == 131072);
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new b(aVar3, aVar4, p1Var, null);
                o0VarE.K(objQ2);
            }
            p3.l0.e((e23.p) objQ2, bool, o0VarE);
            h4.r.a aVar5 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            h4.r rVarC = c2.l.C(aVar5, f14, 0.0f, 0.0f, 0.0f, 14);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(aVar5, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar2, rVarC3, o0VarE);
            String strD = zb0.t.d(fVar);
            jf.d dVarA = jf.s.a(fVar.getImageURL(), null, o0VarE, 0, 30);
            String strQ = gl1.y.Q(o0VarE, R.string.concept_devices);
            t4.d dVarA2 = n5.c.a(2131231969, o0VarE, 0);
            f5.k.f68985a.getClass();
            f5.k.a.f fVar3 = f5.k.a.f68991f;
            bVar.getClass();
            h4.r rVarQ = x2.q(aVar5, eVar.f97922g);
            p5.l.f136032b.getClass();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ3;
            bVar.getClass();
            gb gbVarA = fb.a(j92.b.f97901d.f97904c, 4, 0L, false);
            p5.l lVarA = p5.l.a(0);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new rk0.w(p1Var, 12);
                o0VarE.K(objQ4);
            }
            jf.r.b(strD, strQ, u1.w.b(rVarQ, jVar, gbVarA, false, null, lVarA, (e23.a) objQ4, 12), dVarA2, null, dVarA, null, null, null, null, fVar3, null, o0VarE, 0, 6, 31696);
            o70.g gVar = aVar != null ? aVar.f124474a : null;
            int i17 = gVar == null ? -1 : c.f157671a[gVar.ordinal()];
            if (i17 == 1) {
                i15 = 0;
                o0VarE.C(-645643670);
                gl.c.f77766a.getClass();
                jE = gl.c.a(o0VarE).e();
                o0VarE.g0(false);
            } else if (i17 != 2) {
                o0VarE.C(-645639801);
                i15 = 0;
                o0VarE.g0(false);
                o4.d0.f128823b.getClass();
                jE = o4.d0.f128831j;
            } else {
                i15 = 0;
                o0VarE.C(-645641176);
                gl.c.f77766a.getClass();
                jE = gl.c.a(o0VarE).m();
                o0VarE.g0(false);
            }
            bVar.getClass();
            h4.r rVarU = c2.l.u(aVar5, eVar.f97921f, i15);
            bVar.getClass();
            h4.r rVarQ2 = x2.q(rVarU, f15);
            bVar.getClass();
            h4.r rVarB = l4.k.b(rVarQ2, k2.i.a(f15));
            o4.m1.a aVar7 = o4.m1.f128891a;
            c2.q.a(u1.n.e(rVarB, jE, aVar7), o0VarE, i15);
            o0VarE.g0(true);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new rk0.w(p1Var, 13);
                o0VarE.K(objQ5);
            }
            i3.u.a(zBooleanValue, (e23.a) objQ5, u1.n.e(aVar5, d92.b.a(o0VarE).c().a(), aVar7), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-892850885, new mw0.h(list, aVar2, lVar, p1Var, 18), o0VarE), o0VarE, 48, 48, 2040);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k(fVar, aVar, list, lVar, aVar2, aVar3, aVar4, i14, 3);
        }
    }

    public static final void g(o70.a0 a0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-156640793);
        int i15 = (o0VarE.r(a0Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            h4.r rVarC = c2.l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            t4.d dVarA = n5.c.a(R.drawable.notification_filled, o0VarE, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.concept_notifications);
            long jB = d92.b.a(o0VarE).f().b();
            bVar.getClass();
            h4.r rVarQ = x2.q(aVar, eVar.f97922g);
            p5.l.f136032b.getClass();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ;
            bVar.getClass();
            gb gbVarA = fb.a(j92.b.f97901d.f97904c, 4, 0L, false);
            p5.l lVarA = p5.l.a(0);
            boolean zR = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new r(context, 2);
                o0VarE.K(objQ2);
            }
            i7.a(dVarA, strQ, u1.w.b(rVarQ, jVar, gbVarA, false, null, lVarA, (e23.a) objQ2, 12), jB, o0VarE, 0, 0);
            if (a0Var == null || !a0Var.f129913b) {
                o0VarE.C(257108385);
                o0VarE.g0(false);
            } else {
                o0VarE.C(256797021);
                bVar.getClass();
                h4.r rVarU = c2.l.u(aVar, eVar.f97921f, 0);
                bVar.getClass();
                h4.r rVarQ2 = x2.q(rVarU, f15);
                bVar.getClass();
                c2.q.a(u1.n.e(l4.k.b(rVarQ2, k2.i.a(f15)), hb.a.s(o0VarE), o4.m1.f128891a), o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s5.a(a0Var, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0200  */
    public static final void h(o70.a0 a0Var, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1363447709);
        int i15 = (o0VarE.r(a0Var) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            o70.x xVar = a0Var != null ? a0Var.f129914c : null;
            if (p005kotlin.jvm.internal.s.g(xVar, o70.x.a.f130110a)) {
                o0VarE.C(-964793677);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                u1.y0.a(n5.c.a(R.drawable.ic_sync_complete, o0VarE, 0), gl1.y.Q(o0VarE, R.string.SyncCompleteGeneric), x2.d(x2.q(aVar2, j92.b.f97899b.f97922g), 1.0f), null, null, 0.0f, null, o0VarE, 0, 120);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                boolean zG = p005kotlin.jvm.internal.s.g(xVar, o70.x.d.f130113a);
                p3.m.a aVar3 = p3.m.f135153a;
                if (zG) {
                    o0VarE.C(-964396443);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = s8.a(t62.b.f162798a);
                    long jD = hb.a.d(d92.b.f58623a, o0VarE);
                    h4.r.a aVar4 = h4.r.S;
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    h4.r rVarQ = x2.q(aVar4, j92.b.f97899b.f97922g);
                    p5.l.f136032b.getClass();
                    Object objQ = o0VarE.q();
                    aVar3.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = kg.f.b(o0VarE);
                    }
                    a2.j jVar = (a2.j) objQ;
                    bVar.getClass();
                    gb gbVarA = fb.a(j92.b.f97901d.f97904c, 4, 0L, false);
                    p5.l lVarA = p5.l.a(0);
                    boolean z14 = (i15 & 112) == 32;
                    Object objQ2 = o0VarE.q();
                    if (z14 || objQ2 == c2565a) {
                        objQ2 = new rk0.y(aVar, 13);
                        o0VarE.K(objQ2);
                    }
                    i7.b(dVarA, gl1.y.Q(o0VarE, R.string.device_action_sync), u1.w.b(rVarQ, jVar, gbVarA, false, null, lVarA, (e23.a) objQ2, 12), jD, o0VarE, 0, 0);
                    o0VarE.g0(false);
                } else if (xVar instanceof o70.x.e) {
                    o0VarE.C(-963669090);
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ2 = x2.q(aVar5, j92.b.f97899b.f97922g);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(o0VarE.U);
                    i2 i2VarA0 = o0VarE.a0();
                    h4.r rVarC = h4.k.c(rVarQ2, o0VarE);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (o0VarE.f135177b == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    s1.n0.a aVarA = s1.p0.a(s1.p0.c("SyncAnimTag", o0VarE, 0), 0.0f, 360.0f, s1.l.a(s1.l.d(1000, 0, s1.e0.f155563d, 2), null, 6), "SyncAnimTag", o0VarE, 29112, 0);
                    h4.r rVarD = x2.d(aVar5, 1.0f);
                    g6.f.a aVar7 = g6.f.f75994b;
                    l.a(((o70.x.e) xVar).f130116c, am.j.d(o0VarE), 2, rVarD, 0, o0VarE, 3456);
                    o0VarE = o0VarE;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = s8.a(t62.b.f162798a);
                    long jD2 = am.j.d(o0VarE);
                    boolean zB = o0VarE.B(aVarA);
                    Object objQ3 = o0VarE.q();
                    if (zB) {
                        objQ3 = new i5(aVarA, 9);
                        o0VarE.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new i5(aVarA, 9);
                            o0VarE.K(objQ3);
                        }
                    }
                    i7.b(dVarA2, null, c2.l.y(x2.d(uVar.c(o4.s0.a(aVar5, (e23.l) objQ3), h4.d.a.f81528f), 1.0f), f157665b), jD2, o0VarE, 48, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                } else if (p005kotlin.jvm.internal.s.g(xVar, o70.x.b.f130111a)) {
                    o0VarE.C(-962277252);
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = s8.a(t62.b.f162798a);
                    d92.b.f58623a.getClass();
                    long jC = o4.d0.c(0.5f, d92.b.a(o0VarE).f().b(), 14);
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA3, null, x2.q(aVar8, j92.b.f97899b.f97922g), jC, o0VarE, 48, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-961967283);
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.q(aVar9, j92.b.f97899b.f97922g), o0VarE);
                    o0VarE.g0(false);
                }
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rk0.a1(a0Var, aVar, i14, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(b12.b bVar, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(1047225034);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ2;
            h4.r.a aVar5 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarQ = x2.q(aVar5, eVar.f97922g);
            boolean z15 = (i15 & 896) == 256;
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == c2565a) {
                objQ3 = new p40.j0(aVar, p1Var, 5);
                o0VarE.K(objQ3);
            }
            h4.r rVarB = u1.w.b(rVarQ, jVar, null, false, null, null, (e23.a) objQ3, 28);
            boolean zR = o0VarE.r(context);
            int i16 = i15;
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new ot.c(context, 11);
                o0VarE.K(objQ4);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ4, rVarB, false);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            bVar2.getClass();
            b12.k.b(null, null, eVar.f97922g, bVar, o0VarE, (b12.b.f14385f << 9) | ((i16 << 9) & 7168), 19);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new rk0.w(p1Var, 14);
                o0VarE.K(objQ5);
            }
            i3.u.a(zBooleanValue, (e23.a) objQ5, u1.n.e(aVar5, v.h.t(o0VarE), o4.m1.f128891a), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(1086748351, new d62.f(aVar2, aVar3, z14, aVar4, p1Var), o0VarE), o0VarE, 48, 48, 2040);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(bVar, z14, aVar, aVar2, aVar3, aVar4, i14);
        }
    }
}
