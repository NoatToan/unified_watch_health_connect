package ta0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.s1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e9;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Locale;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import sk0.k1;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceTroubleshootingScreenKt$DeviceTroubleshootingScreen$2$1$1", f = "DeviceTroubleshootingScreen.kt", l = {132}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f163333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f163334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f163334b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f163334b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f163333a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f163333a = 1;
                if (this.f163334b.d(this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p<Context, String, Unit> f163335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f163336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f163337c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.p<? super Context, ? super String, Unit> pVar, Context context, String str) {
            this.f163335a = pVar;
            this.f163336b = context;
            this.f163337c = str;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x01ab  */
        @Override // e23.r
        public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 48) == 0) {
                iIntValue |= mVar2.l(j8) ? 32 : 16;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                h4.r rVarE = u1.n.e(aVar, j8, m1.f128891a);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                int iHashCode = Long.hashCode(mVar2.getU());
                i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(rVarE, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, mVar2);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, mVar2);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r rVarF = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97899b.f97920e;
                h4.r rVarA = c2.l.A(c2.l.C(rVarF, 0.0f, f14, 0.0f, 0.0f, 13), f14, 0.0f, 2);
                s2 s2VarA = q2.a(c2.j.f22696f, h4.d.a.f81533k, mVar2, 6);
                int iHashCode2 = Long.hashCode(mVar2.getU());
                i2 i2VarX2 = mVar2.x();
                h4.r rVarC2 = h4.k.c(rVarA, mVar2);
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                b4.c(eVar, s2VarA, mVar2);
                b4.c(c1623g, i2VarX2, mVar2);
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, mVar2);
                u2 u2Var = u2.f22900a;
                String strQ = gl1.y.Q(mVar2, R.string.smart_troubleshooting_still_not_connecting);
                d92.b.f58624b.getClass();
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar2), mVar2, 0, 0, 131070);
                mVar2.y();
                l72.f0 f0Var = l72.f0.f110999a;
                String strQ2 = gl1.y.Q(mVar2, R.string.smart_troubleshooting_visit_support);
                h4.r rVarY = c2.l.y(x2.f(aVar, 1.0f), f14);
                e23.p<Context, String, Unit> pVar = this.f163335a;
                boolean zB = mVar2.B(pVar);
                Context context = this.f163336b;
                boolean zR = zB | mVar2.r(context);
                String str = this.f163337c;
                boolean zB2 = zR | mVar2.B(str);
                Object objQ = mVar2.q();
                if (zB2) {
                    objQ = new sg0.j(pVar, 19, context, str);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sg0.j(pVar, 19, context, str);
                        mVar2.K(objQ);
                    }
                }
                f0Var.d(0, 9, (e23.a) objQ, rVarY, strQ2, mVar2, null, false);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceTroubleshootingScreenKt$DeviceTroubleshootingScreen$3$2$1$1$1$1$1", f = "DeviceTroubleshootingScreen.kt", l = {263}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f163338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f163339b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f163339b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f163339b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f163338a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f163338a = 1;
                if (this.f163339b.g(this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, o90.a aVar, String str2, i53.c<? extends nv.e> cVar, boolean z14, e23.p<? super Context, ? super String, Unit> pVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        int i15;
        String str3;
        i53.c<? extends nv.e> cVar2;
        boolean z15;
        mc mcVar;
        p3.o0 o0Var;
        char c14;
        p3.o0 o0VarE = mVar.E(-802367110);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            str3 = str2;
            i15 |= o0VarE.B(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i14 & 3072) == 0) {
            cVar2 = cVar;
            i15 |= o0VarE.B(cVar2) ? 2048 : 1024;
        } else {
            cVar2 = cVar;
        }
        if ((i14 & 24576) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 16384 : 8192;
        } else {
            z15 = z14;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 4793491) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new g(4);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            mc mcVarF = e9.f(false, null, o0VarE, 6, 2);
            if (mcVarF.e()) {
                o0VarE.C(-1824663716);
                String strG = g22.n.g(str);
                nv.e eVar = (nv.e) p1Var.getF182175a();
                boolean zR = ((i16 & 458752) == 131072) | o0VarE.r(context);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new sy.i(10, context, pVar);
                    o0VarE.K(objQ3);
                }
                e23.l lVar = (e23.l) objQ3;
                boolean zR2 = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                Object objQ4 = o0VarE.q();
                if (zR2 || objQ4 == c2565a) {
                    c14 = 15;
                    objQ4 = new nw0.n(b0Var, mcVarF, 15);
                    o0VarE.K(objQ4);
                } else {
                    c14 = 15;
                }
                nv.b.a(strG, mcVarF, eVar, lVar, (e23.a) objQ4, o0VarE, 0);
                mcVar = mcVarF;
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                mcVar = mcVarF;
                o0Var = o0VarE;
                o0Var.C(-1824184952);
                o0Var.g0(false);
            }
            o0VarE = o0Var;
            da0.p.d("device_discovery_device_troubleshooting_screen", false, aVar3, null, null, null, z3.f.c(1264770627, new et1.e(pVar, context, str3, aVar, str, z15, cVar2, aVar2, p1Var, b0Var, mcVar), o0Var), o0VarE, ((i16 >> 15) & 896) | 12582918, 122);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(str, aVar, str2, cVar, z14, pVar, aVar2, aVar3, i14);
        }
    }

    public static final void b(e23.p<? super Context, ? super String, Unit> pVar, Context context, nv.e eVar) {
        Integer num;
        eVar.getClass();
        context.getClass();
        String string = null;
        if (nv.e.b.f127947a[eVar.ordinal()] == 1 && (num = eVar.f127945f) != null) {
            string = context.getString(num.intValue());
        }
        if (string != null) {
            pVar.invoke(context, string);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(x xVar, l90.b bVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        nv.e[] eVarArr;
        xVar.getClass();
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(175363696);
        int i15 = i14 | (o0VarE.r(xVar) ? 4 : 2) | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(xVar.f163476v, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                nv.e.a aVar3 = nv.e.f127930h;
                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(bVar.f111522g);
                if (u0Var == null) {
                    u0Var = zb0.u0.f203733h;
                }
                boolean z14 = bVar.f111531p.f58436b != null;
                aVar3.getClass();
                if (zb0.u0.n(u0Var != null ? u0Var.f203854a : null, zb0.u0.W5)) {
                    eVarArr = (nv.e[]) nv.e.f127933k.toArray(new nv.e[0]);
                } else {
                    if (zb0.u0.n(u0Var != null ? u0Var.f203854a : null, zb0.u0.X5)) {
                        eVarArr = (nv.e[]) nv.e.f127934l.toArray(new nv.e[0]);
                    } else {
                        if (zb0.u0.s(u0Var != null ? u0Var.f203854a : null)) {
                            eVarArr = (nv.e[]) nv.e.f127935m.toArray(new nv.e[0]);
                        } else {
                            if (zb0.u0.n(u0Var != null ? u0Var.f203854a : null, zb0.u0.U5)) {
                                eVarArr = (nv.e[]) nv.e.f127936n.toArray(new nv.e[0]);
                            } else {
                                if (zb0.u0.q(u0Var != null ? u0Var.f203854a : null)) {
                                    eVarArr = (nv.e[]) nv.e.f127932j.toArray(new nv.e[0]);
                                } else {
                                    ArrayList arrayListD1 = p13.h0.d1(nv.e.f127931i);
                                    if (!z14) {
                                        arrayListD1.remove(nv.e.f127937o);
                                    }
                                    eVarArr = (nv.e[]) arrayListD1.toArray(new nv.e[0]);
                                }
                            }
                        }
                    }
                }
                objQ = i53.a.f(eVarArr);
                o0VarE.K(objQ);
            }
            i53.c cVar = (i53.c) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.garmin_connect_device_troubleshooting_path);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                Locale locale = Locale.getDefault();
                locale.getClass();
                String strB = s1.b(locale);
                gg1.v0.T.getClass();
                objQ2 = gg1.v0.a.b().i() + "/" + strB + strQ;
                o0VarE.K(objQ2);
            }
            String str = (String) objQ2;
            String str2 = bVar.f111521f;
            o90.a aVar4 = bVar.f111526k;
            boolean zBooleanValue = ((Boolean) p1VarC.getF182175a()).booleanValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new d(12);
                o0VarE.K(objQ3);
            }
            int i16 = i15 << 12;
            a(str2, aVar4, str, cVar, zBooleanValue, (e23.p) objQ3, aVar, aVar2, o0VarE, (3670016 & i16) | 200064 | (i16 & 29360128));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1((Object) xVar, (Object) bVar, (e23.a) aVar, (Object) aVar2, i14, 9);
        }
    }
}
