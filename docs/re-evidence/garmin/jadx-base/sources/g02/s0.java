package g02;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.drawablepainter.DrawablePainter2Kt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74546a = new a();

        /* JADX INFO: renamed from: g02.s0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.ProgressOverlayKt$gesturesDisabled$1$1", f = "ProgressOverlay.kt", l = {69}, m = "invokeSuspend", v = 2)
        public static final class C1510a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f74547a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f74548b;

            public C1510a(t13.d<? super C1510a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1510a c1510a = new C1510a(dVar);
                c1510a.f74548b = obj;
                return c1510a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((C1510a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0027 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:15:0x0036 A[LOOP:0: B:13:0x0030->B:15:0x0036, LOOP_END] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = r4.f74548b
                    b5.c r0 = (b5.c) r0
                    u13.a r1 = u13.a.COROUTINE_SUSPENDED
                    int r2 = r4.f74547a
                    r3 = 1
                    if (r2 == 0) goto L18
                    if (r2 != r3) goto L11
                    o13.r.b(r5)
                    goto L28
                L11:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r5)
                    r5 = 0
                    return r5
                L18:
                    o13.r.b(r5)
                L1b:
                    b5.s r5 = b5.s.Initial
                    r4.f74548b = r0
                    r4.f74547a = r3
                    java.lang.Object r5 = r0.W0(r5, r4)
                    if (r5 != r1) goto L28
                    return r1
                L28:
                    b5.q r5 = (b5.q) r5
                    java.util.List<b5.a0> r5 = r5.f15870a
                    java.util.Iterator r5 = r5.iterator()
                L30:
                    boolean r2 = r5.hasNext()
                    if (r2 == 0) goto L1b
                    java.lang.Object r2 = r5.next()
                    b5.a0 r2 = (b5.a0) r2
                    r2.a()
                    goto L30
                */
                throw new UnsupportedOperationException("Method not decompiled: g02.s0.a.C1510a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            Object objR = h0Var.R(new C1510a(null), dVar);
            return objR == u13.a.COROUTINE_SUSPENDED ? objR : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    public static final void a(h4.r rVar, boolean z14, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        h4.r rVarF;
        pVar.getClass();
        p3.o0 o0VarE = mVar.E(-641182595);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(pVar) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            rVarF = i17 != 0 ? x2.f(h4.r.S, 1.0f) : rVar2;
            p3.x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            pVar.invoke(o0VarE, Integer.valueOf((i16 >> 6) & 14));
            if (z14) {
                o0VarE.C(-2126526413);
                d92.b.f58623a.getClass();
                long jD = d92.b.a(o0VarE).e().d();
                h4.r.a aVar2 = h4.r.S;
                h4.r rVarC2 = c(x2.d(aVar2, 1.0f), true);
                boolean zL = o0VarE.l(jD);
                Object objQ = o0VarE.q();
                if (zL) {
                    objQ = new a02.a(jD, 20);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a02.a(jD, 20);
                        o0VarE.K(objQ);
                    }
                }
                u1.n.b(rVarC2, (e23.l) objQ, o0VarE, 0);
                b(uVar.c(aVar2, h4.d.a.f81528f), 0.0f, o0VarE, 0, 2);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2126115105);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
            rVarF = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(rVarF, z14, pVar, i14, i15, 3);
        }
    }

    public static final void b(h4.r rVar, float f14, p3.m mVar, int i14, int i15) {
        int i16;
        p3.o0 o0VarE = mVar.E(1747861491);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            if (i17 != 0) {
                rVar = h4.r.S;
            }
            if (i18 != 0) {
                f14 = 70;
                g6.f.a aVar = g6.f.f75994b;
            }
            p3.x1 x1Var = p3.n.f135158a;
            t4.d dVarRememberDrawablePainter = DrawablePainter2Kt.rememberDrawablePainter(j.a.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), R.drawable.gcm4_running_man_animation), o0VarE, 0);
            h4.r rVarH = x2.h(x2.u(rVar, f14), f14);
            o4.e0.a aVar2 = o4.e0.f128843b;
            d92.b.f58623a.getClass();
            o4.r rVarA = o4.e0.a.a(aVar2, d92.b.a(o0VarE).f().b());
            f5.k.f68985a.getClass();
            u1.y0.a(dVarRememberDrawablePainter, null, rVarH, null, f5.k.a.f68987b, 0.0f, rVarA, o0VarE, 24624, 40);
        } else {
            o0VarE.e();
        }
        h4.r rVar2 = rVar;
        float f15 = f14;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.x(rVar2, f15, i14, i15, 1);
        }
    }

    public static final h4.r c(h4.r rVar, boolean z14) {
        rVar.getClass();
        return z14 ? b5.s0.b(rVar, Unit.INSTANCE, a.f74546a) : rVar;
    }
}
