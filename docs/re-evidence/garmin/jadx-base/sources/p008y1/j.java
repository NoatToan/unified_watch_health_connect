package p008y1;

import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import o53.d0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.p0;
import r53.c2;
import t13.d;
import v13.c;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {1549}, m = "invokeSuspend", v = 1)
public final class j extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Object> f193313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p<Object, d<? super Unit>, Object> f193314d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0<l1> f193315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f193316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<Object, d<? super Unit>, Object> f193317c;

        /* JADX INFO: renamed from: y1.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {1556}, m = "invokeSuspend", v = 1)
        public static final class C3610a extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p<Object, d<? super Unit>, Object> f193319b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f193320c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b0 f193321d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3610a(p<Object, ? super d<? super Unit>, ? extends Object> pVar, Object obj, b0 b0Var, d<? super C3610a> dVar) {
                super(2, dVar);
                this.f193319b = pVar;
                this.f193320c = obj;
                this.f193321d = b0Var;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C3610a(this.f193319b, this.f193320c, this.f193321d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((C3610a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193318a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f193318a = 1;
                    if (this.f193319b.invoke(this.f193320c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                c0.c(this.f193321d, new AnchoredDragFinishedSignal());
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {1552}, m = "emit", v = 1)
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f193322a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public l1 f193323b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f193324c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a<T> f193325d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f193326e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, d<? super b> dVar) {
                super(dVar);
                this.f193325d = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f193324c = obj;
                this.f193326e |= Integer.MIN_VALUE;
                return this.f193325d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(r0<l1> r0Var, b0 b0Var, p<Object, ? super d<? super Unit>, ? extends Object> pVar) {
            this.f193315a = r0Var;
            this.f193316b = b0Var;
            this.f193317c = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, d<? super Unit> dVar) {
            b bVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i14 = bVar.f193326e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    bVar.f193326e = i14 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, dVar);
                }
            } else {
                bVar = new b(this, dVar);
            }
            Object obj2 = bVar.f193324c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = bVar.f193326e;
            r0<l1> r0Var = this.f193315a;
            if (i15 == 0) {
                r.b(obj2);
                l1 l1Var = r0Var.f105810a;
                if (l1Var != null) {
                    l1Var.c(new AnchoredDragFinishedSignal());
                    bVar.f193322a = obj;
                    bVar.f193323b = l1Var;
                    bVar.f193326e = 1;
                    if (l1Var.P(bVar) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = bVar.f193322a;
                r.b(obj2);
            }
            d0 d0Var = d0.UNDISPATCHED;
            p<Object, d<? super Unit>, Object> pVar = this.f193317c;
            b0 b0Var = this.f193316b;
            r0Var.f105810a = (T) ge1.b.T(b0Var, null, d0Var, new C3610a(pVar, obj, b0Var, null), 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(e23.a<Object> aVar, p<Object, ? super d<? super Unit>, ? extends Object> pVar, d<? super j> dVar) {
        super(2, dVar);
        this.f193313c = aVar;
        this.f193314d = pVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        j jVar = new j(this.f193313c, this.f193314d, dVar);
        jVar.f193312b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193311a;
        if (i14 == 0) {
            r.b(obj);
            b0 b0Var = (b0) this.f193312b;
            r0 r0Var = new r0();
            c2 c2VarS = p0.s(this.f193313c);
            a aVar2 = new a(r0Var, b0Var, this.f193314d);
            this.f193311a = 1;
            if (c2VarS.collect(aVar2, this) == aVar) {
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
