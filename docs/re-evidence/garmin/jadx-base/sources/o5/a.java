package o5;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.p;
import i3.e5;
import j23.t;
import java.util.function.Consumer;
import o13.r;
import o4.l1;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.g1;
import p5.d0;
import p5.n;
import p5.q;
import p5.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lo5/a;", "Landroid/view/ScrollCaptureCallback;", "Lp5/y;", "node", "Lg6/l;", "viewportBoundsInWindow", "Lo53/b0;", "coroutineScope", "Lo5/a$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View;", "composeView", "<init>", "(Lp5/y;Lg6/l;Lo53/b0;Lo5/a$a;Landroid/view/View;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f129122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6.l f129123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2475a f129124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f129125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f129126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f129127f;

    /* JADX INFO: renamed from: o5.a$a, reason: collision with other inner class name */
    public interface InterfaceC2475a {
        void a();

        void b();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f129128a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Runnable f129130c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f129130c = runnable;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new b(this.f129130c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f129128a;
            a aVar2 = a.this;
            if (i14 == 0) {
                r.b(obj);
                g gVar = aVar2.f129127f;
                this.f129128a = 1;
                Object objA = gVar.a(0.0f - gVar.f129155c, this);
                if (objA != aVar) {
                    objA = Unit.INSTANCE;
                }
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            aVar2.f129124c.a();
            this.f129130c.run();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {120}, m = "invokeSuspend", v = 1)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f129131a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ScrollCaptureSession f129133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Rect f129134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Consumer<Rect> f129135e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f129133c = scrollCaptureSession;
            this.f129134d = rect;
            this.f129135e = consumer;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f129133c, this.f129134d, this.f129135e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f129131a;
            if (i14 == 0) {
                r.b(obj);
                ScrollCaptureSession scrollCaptureSession = this.f129133c;
                Rect rect = this.f129134d;
                g6.l lVar = new g6.l(rect.left, rect.top, rect.right, rect.bottom);
                this.f129131a = 1;
                obj = a.a(a.this, scrollCaptureSession, lVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.f129135e.accept(l1.g((g6.l) obj));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {89}, m = "invokeSuspend", v = 1)
    public static final class d extends v13.i implements p<Float, t13.d<? super Float>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f129136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f129137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ float f129138c;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = a.this.new d(dVar);
            dVar2.f129138c = ((Number) obj).floatValue();
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(Float f14, t13.d<? super Float> dVar) {
            return ((d) create(Float.valueOf(f14.floatValue()), dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f129137b;
            if (i14 == 0) {
                r.b(obj);
                float f14 = this.f129138c;
                a aVar2 = a.this;
                q qVar = aVar2.f129122a.f136098d;
                p5.p.f136057a.getClass();
                p pVar = (p) p5.r.a(qVar, p5.p.f136062f);
                if (pVar == null) {
                    throw e5.m("Required value was null.");
                }
                q qVar2 = aVar2.f129122a.f136098d;
                d0.f135959a.getClass();
                boolean z15 = ((n) qVar2.c(d0.f135982x)).f136048c;
                if (z15) {
                    f14 = -f14;
                }
                n4.c cVarA = n4.c.a((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
                this.f129136a = z15;
                this.f129137b = 1;
                obj = pVar.invoke(cVarA, this);
                if (obj == aVar) {
                    return aVar;
                }
                z14 = z15;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z14 = this.f129136a;
                r.b(obj);
            }
            long j8 = ((n4.c) obj).f123544a;
            return new Float(z14 ? -Float.intBitsToFloat((int) (j8 & 4294967295L)) : Float.intBitsToFloat((int) (j8 & 4294967295L)));
        }
    }

    public a(y yVar, g6.l lVar, b0 b0Var, InterfaceC2475a interfaceC2475a, View view2) {
        this.f129122a = yVar;
        this.f129123b = lVar;
        this.f129124c = interfaceC2475a;
        this.f129125d = view2;
        this.f129126e = c0.h(b0Var, e.f129149a);
        this.f129127f = new g(lVar.b(), new d(null));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(a aVar, ScrollCaptureSession scrollCaptureSession, g6.l lVar, v13.c cVar) {
        o5.b bVar;
        int i14;
        int i15;
        Object objA;
        ScrollCaptureSession scrollCaptureSessionK;
        g6.l lVar2;
        int i16;
        int i17;
        int iE;
        int iE2;
        g6.l lVar3;
        int i18;
        int i19;
        Canvas canvasLockHardwareCanvas;
        aVar.getClass();
        if (cVar instanceof o5.b) {
            bVar = (o5.b) cVar;
            int i24 = bVar.f129146g;
            if ((i24 & Integer.MIN_VALUE) != 0) {
                bVar.f129146g = i24 - Integer.MIN_VALUE;
            } else {
                bVar = new o5.b(aVar, cVar);
            }
        } else {
            bVar = new o5.b(aVar, cVar);
        }
        Object obj = bVar.f129144e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i25 = bVar.f129146g;
        if (i25 == 0) {
            r.b(obj);
            i14 = lVar.f76009b;
            i15 = lVar.f76011d;
            g gVar = aVar.f129127f;
            bVar.f129140a = scrollCaptureSession;
            bVar.f129141b = lVar;
            bVar.f129142c = i14;
            bVar.f129143d = i15;
            bVar.f129146g = 1;
            int i26 = gVar.f129153a;
            if (i14 > i15) {
                vb.h.x(tn.k.e(i14, i15, "Expected min=", " ≤ max="));
                return null;
            }
            int i27 = i15 - i14;
            if (i27 > i26) {
                vb.h.x(tn.k.e(i27, i26, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            float f14 = i14;
            float f15 = gVar.f129155c;
            if (f14 < f15 || i15 > i26 + f15) {
                objA = gVar.a((((i27 / 2) + i14) - (i26 / 2)) - f15, bVar);
                if (objA != aVar2) {
                    objA = Unit.INSTANCE;
                }
                if (objA != aVar2) {
                    objA = Unit.INSTANCE;
                }
            } else {
                objA = Unit.INSTANCE;
            }
            if (objA != aVar2) {
            }
            return aVar2;
        }
        if (i25 == 1) {
            int i28 = bVar.f129143d;
            int i29 = bVar.f129142c;
            g6.l lVar4 = bVar.f129141b;
            ScrollCaptureSession scrollCaptureSessionK2 = ka.i.k(bVar.f129140a);
            r.b(obj);
            i14 = i29;
            lVar = lVar4;
            i15 = i28;
            scrollCaptureSession = scrollCaptureSessionK2;
        } else {
            if (i25 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i17 = bVar.f129143d;
            i16 = bVar.f129142c;
            lVar2 = bVar.f129141b;
            scrollCaptureSessionK = ka.i.k(bVar.f129140a);
            r.b(obj);
        }
        g gVar2 = aVar.f129127f;
        iE = t.e(i16 - MathKt.c(gVar2.f129155c), 0, gVar2.f129153a);
        g gVar3 = aVar.f129127f;
        iE2 = t.e(i17 - MathKt.c(gVar3.f129155c), 0, gVar3.f129153a);
        lVar3 = new g6.l(lVar2.f76008a, iE, lVar2.f76010c, iE2);
        i18 = lVar3.f76009b;
        i19 = lVar3.f76008a;
        if (iE == iE2) {
            g6.l.f76006e.getClass();
            return g6.l.f76007f;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionK.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i19, -i18);
            g6.l lVar5 = aVar.f129123b;
            canvasLockHardwareCanvas.translate(-lVar5.f76008a, -lVar5.f76009b);
            aVar.f129125d.getRootView().draw(canvasLockHardwareCanvas);
            int iC = MathKt.c(aVar.f129127f.f129155c);
            return new g6.l(i19, i18 + iC, lVar3.f76010c, lVar3.f76011d + iC);
        } finally {
            scrollCaptureSessionK.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        o5.c cVar2 = o5.c.f129147a;
        bVar.f129140a = scrollCaptureSession;
        bVar.f129141b = lVar;
        bVar.f129142c = i14;
        bVar.f129143d = i15;
        bVar.f129146g = 2;
        if (g1.a(bVar.getF157466b()).v(cVar2, bVar) != aVar2) {
            scrollCaptureSessionK = scrollCaptureSession;
            lVar2 = lVar;
            i16 = i14;
            i17 = i15;
            g gVar4 = aVar.f129127f;
            iE = t.e(i16 - MathKt.c(gVar4.f129155c), 0, gVar4.f129153a);
            g gVar5 = aVar.f129127f;
            iE2 = t.e(i17 - MathKt.c(gVar5.f129155c), 0, gVar5.f129153a);
            lVar3 = new g6.l(lVar2.f76008a, iE, lVar2.f76010c, iE2);
            i18 = lVar3.f76009b;
            i19 = lVar3.f76008a;
            if (iE == iE2) {
                g6.l.f76006e.getClass();
                return g6.l.f76007f;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionK.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i19, -i18);
            g6.l lVar6 = aVar.f129123b;
            canvasLockHardwareCanvas.translate(-lVar6.f76008a, -lVar6.f76009b);
            aVar.f129125d.getRootView().draw(canvasLockHardwareCanvas);
            int iC2 = MathKt.c(aVar.f129127f.f129155c);
            return new g6.l(i19, i18 + iC2, lVar3.f76010c, lVar3.f76011d + iC2);
        }
        return aVar2;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        ge1.b.T(this.f129126e, v1.f129418a, null, new b(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        c2 c2VarT = ge1.b.T(this.f129126e, null, null, new c(scrollCaptureSession, rect, consumer, null), 3);
        c2VarT.J(new o5.d(cancellationSignal));
        cancellationSignal.setOnCancelListener(new f7.a(c2VarT, 1));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(l1.g(this.f129123b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f129127f.f129155c = 0.0f;
        this.f129124c.b();
        runnable.run();
    }
}
