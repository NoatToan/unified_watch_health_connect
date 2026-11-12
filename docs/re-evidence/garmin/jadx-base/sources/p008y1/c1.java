package p008y1;

import a2.j;
import b5.m0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import e23.p;
import e23.q;
import g6.s;
import n4.c;
import o13.r;
import o53.b0;
import o53.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u1.k1;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ly1/c1;", "Ly1/p0;", "Ly1/d1;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lb5/m0;", "", "canDrag", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "enabled", "La2/j;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lo53/b0;", "Ln4/c;", "Lt13/d;", "", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Ly1/d1;Le23/l;Ly1/b2;ZLa2/j;ZLe23/q;Le23/q;Z)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c1 extends p0 {
    public q<? super b0, ? super c, ? super d<? super Unit>, ? extends Object> A;
    public q<? super b0, ? super Float, ? super d<? super Unit>, ? extends Object> B;
    public boolean C;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d1 f193134x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b2 f193135y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f193136z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {326}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193138b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f193140d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, d<? super a> dVar) {
            super(2, dVar);
            this.f193140d = j8;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = c1.this.new a(this.f193140d, dVar);
            aVar.f193138b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193137a;
            if (i14 == 0) {
                r.b(obj);
                b0 b0Var = (b0) this.f193138b;
                q<? super b0, ? super c, ? super d<? super Unit>, ? extends Object> qVar = c1.this.A;
                c cVarA = c.a(this.f193140d);
                this.f193137a = 1;
                if (qVar.invoke(b0Var, cVarA, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {333}, m = "invokeSuspend", v = 1)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193142b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e0.d f193144d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0.d dVar, d<? super b> dVar2) {
            super(2, dVar2);
            this.f193144d = dVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            b bVar = c1.this.new b(this.f193144d, dVar);
            bVar.f193142b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193141a;
            if (i14 == 0) {
                r.b(obj);
                b0 b0Var = (b0) this.f193142b;
                c1 c1Var = c1.this;
                q<? super b0, ? super Float, ? super d<? super Unit>, ? extends Object> qVar = c1Var.B;
                long jG = s.g(c1Var.C ? -1.0f : 1.0f, this.f193144d.f193177a);
                b2 b2Var = c1Var.f193135y;
                a1.a aVar2 = a1.f193076a;
                Float f14 = new Float(b2Var == b2.Vertical ? s.d(jG) : s.c(jG));
                this.f193141a = 1;
                if (qVar.invoke(b0Var, f14, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public c1(d1 d1Var, l<? super m0, Boolean> lVar, b2 b2Var, boolean z14, j jVar, boolean z15, q<? super b0, ? super c, ? super d<? super Unit>, ? extends Object> qVar, q<? super b0, ? super Float, ? super d<? super Unit>, ? extends Object> qVar2, boolean z16) {
        super(lVar, z14, jVar, b2Var);
        this.f193134x = d1Var;
        this.f193135y = b2Var;
        this.f193136z = z15;
        this.A = qVar;
        this.B = qVar2;
        this.C = z16;
    }

    @Override // p008y1.p0
    public final Object b2(p0.b.Function1 function1, p0.b bVar) {
        Object objA = this.f193134x.a(k1.UserInput, new b1(function1, this, null), bVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Override // p008y1.p0
    public final void g2(long j8) {
        if (!getIsAttached() || p005kotlin.jvm.internal.s.g(this.A, a1.f193076a)) {
            return;
        }
        ge1.b.T(getCoroutineScope(), null, d0.UNDISPATCHED, new a(j8, null), 1);
    }

    @Override // p008y1.p0
    public final void h2(e0.d dVar) {
        if (!getIsAttached() || p005kotlin.jvm.internal.s.g(this.B, a1.f193077b)) {
            return;
        }
        ge1.b.T(getCoroutineScope(), null, d0.UNDISPATCHED, new b(dVar, null), 1);
    }

    @Override // p008y1.p0
    /* JADX INFO: renamed from: m2, reason: from getter */
    public final boolean getF193136z() {
        return this.f193136z;
    }
}
