package p008y1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.a0;
import b5.h0;
import e23.l;
import e23.p;
import e23.q;
import f5.d0;
import h5.k;
import java.util.concurrent.CancellationException;
import n4.c;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;
import q53.b;
import q53.m;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import wn2.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class r0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f193597a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {624}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h0 f193600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p0 f193601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q<a0, a0, c, Unit> f193602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l<a0, Unit> f193603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f193604g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e23.a<Boolean> f193605h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p<a0, c, Unit> f193606i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h0 h0Var, p0 p0Var, q<? super a0, ? super a0, ? super c, Unit> qVar, l<? super a0, Unit> lVar, e23.a<Unit> aVar, e23.a<Boolean> aVar2, p<? super a0, ? super c, Unit> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f193600c = h0Var;
            this.f193601d = p0Var;
            this.f193602e = qVar;
            this.f193603f = lVar;
            this.f193604g = aVar;
            this.f193605h = aVar2;
            this.f193606i = pVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f193600c, this.f193601d, this.f193602e, this.f193603f, this.f193604g, this.f193605h, this.f193606i, dVar);
            aVar.f193599b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o53.b0] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            ?? r14 = this.f193598a;
            p0 p0Var = this.f193601d;
            try {
                if (r14 == 0) {
                    r.b(obj);
                    b0 b0Var = (b0) this.f193599b;
                    h0 h0Var = this.f193600c;
                    b2 b2Var = p0Var.f193516c;
                    q<a0, a0, c, Unit> qVar = this.f193602e;
                    l<a0, Unit> lVar = this.f193603f;
                    e23.a<Unit> aVar = this.f193604g;
                    e23.a<Boolean> aVar2 = this.f193605h;
                    p<a0, c, Unit> pVar = this.f193606i;
                    this.f193599b = b0Var;
                    this.f193598a = 1;
                    float f14 = m0.f193416a;
                    Object objC = h1.c(h0Var, new l0(aVar2, new q0(), b2Var, qVar, pVar, aVar, lVar, null), this);
                    if (objC != obj2) {
                        objC = Unit.INSTANCE;
                    }
                    if (objC == obj2) {
                        return obj2;
                    }
                } else {
                    if (r14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (CancellationException e4) {
                b bVar = p0Var.f193520g;
                if (bVar != null) {
                    m.a(bVar.i(e0.a.f193173a));
                }
                if (!c0.g(r14)) {
                    throw e4;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public r0(p0 p0Var) {
        this.f193597a = p0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, d<? super Unit> dVar) {
        c5.e eVar = new c5.e();
        q0 q0Var = new q0();
        q0Var.f105808a = d0.f(k.f(this.f193597a));
        final p0 p0Var = this.f193597a;
        vv0.e eVar2 = new vv0.e(28, p0Var, eVar);
        f fVar = new f(eVar, 14, h0Var, p0Var);
        final int i14 = 0;
        e23.a aVar = new e23.a() { // from class: y1.q0
            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        b bVar = p0Var.f193520g;
                        if (bVar != null) {
                            m.a(bVar.i(e0.a.f193173a));
                        }
                        return Unit.INSTANCE;
                    default:
                        return Boolean.valueOf(!p0Var.getF193136z());
                }
            }
        };
        final int i15 = 1;
        Object objE = c0.e(new a(h0Var, p0Var, eVar2, fVar, aVar, new e23.a() { // from class: y1.q0
            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        b bVar = p0Var.f193520g;
                        if (bVar != null) {
                            m.a(bVar.i(e0.a.f193173a));
                        }
                        return Unit.INSTANCE;
                    default:
                        return Boolean.valueOf(!p0Var.getF193136z());
                }
            }
        }, new xk1.e(p0Var, 5, q0Var, eVar), null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
