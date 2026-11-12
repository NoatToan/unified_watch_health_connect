package p008y1;

import a2.j;
import e23.q;
import g6.s;
import n4.c;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f193076a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f193077b = new b(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Ln4/c;", "it", "", "<anonymous>", "(Lo53/b0;Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements q<b0, c, d<? super Unit>, Object> {
        public a(d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(b0 b0Var, c cVar, d<? super Unit> dVar) {
            long j8 = cVar.f123544a;
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "it", "", "<anonymous>", "(Lo53/b0;F)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends i implements q<b0, Float, d<? super Unit>, Object> {
        public b(d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(b0 b0Var, Float f14, d<? super Unit> dVar) {
            f14.floatValue();
            return new b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Unit.INSTANCE;
        }
    }

    public static h4.r a(h4.r rVar, d1 d1Var, b2 b2Var, boolean z14, j jVar, boolean z15, q qVar, q qVar2, boolean z16, int i14) {
        if ((i14 & 8) != 0) {
            jVar = null;
        }
        return rVar.then(new z0(d1Var, b2Var, z14, jVar, z15, (i14 & 32) != 0 ? f193076a : qVar, qVar2, (i14 & 128) != 0 ? false : z16));
    }

    public static final long b(long j8) {
        return xy2.b.h(Float.isNaN(s.c(j8)) ? 0.0f : s.c(j8), Float.isNaN(s.d(j8)) ? 0.0f : s.d(j8));
    }
}
