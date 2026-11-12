package l3;

import androidx.compose.material3.internal.AnchoredDragFinishedSignal;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {708}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f109277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Object> f109278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<Object, t13.d<? super Unit>, Object> f109279d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<o53.l1> f109280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f109281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<Object, t13.d<? super Unit>, Object> f109282c;

        /* JADX INFO: renamed from: l3.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {715}, m = "invokeSuspend")
        public static final class C2090a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f109283a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e23.p<Object, t13.d<? super Unit>, Object> f109284b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f109285c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f109286d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2090a(e23.p<Object, ? super t13.d<? super Unit>, ? extends Object> pVar, Object obj, o53.b0 b0Var, t13.d<? super C2090a> dVar) {
                super(2, dVar);
                this.f109284b = pVar;
                this.f109285c = obj;
                this.f109286d = b0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2090a(this.f109284b, this.f109285c, this.f109286d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2090a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f109283a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f109283a = 1;
                    if (this.f109284b.invoke(this.f109285c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                o53.c0.c(this.f109286d, new AnchoredDragFinishedSignal());
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {711}, m = "emit")
        public static final class b extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f109287a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public o53.l1 f109288b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f109289c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a<T> f109290d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f109291e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, t13.d<? super b> dVar) {
                super(dVar);
                this.f109290d = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f109289c = obj;
                this.f109291e |= Integer.MIN_VALUE;
                return this.f109290d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(p005kotlin.jvm.internal.r0<o53.l1> r0Var, o53.b0 b0Var, e23.p<Object, ? super t13.d<? super Unit>, ? extends Object> pVar) {
            this.f109280a = r0Var;
            this.f109281b = b0Var;
            this.f109282c = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d<? super Unit> dVar) {
            b bVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i14 = bVar.f109291e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    bVar.f109291e = i14 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, dVar);
                }
            } else {
                bVar = new b(this, dVar);
            }
            Object obj2 = bVar.f109289c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = bVar.f109291e;
            p005kotlin.jvm.internal.r0<o53.l1> r0Var = this.f109280a;
            if (i15 == 0) {
                o13.r.b(obj2);
                o53.l1 l1Var = r0Var.f105810a;
                if (l1Var != null) {
                    l1Var.c(new AnchoredDragFinishedSignal());
                    bVar.f109287a = obj;
                    bVar.f109288b = l1Var;
                    bVar.f109291e = 1;
                    if (l1Var.P(bVar) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = bVar.f109287a;
                o13.r.b(obj2);
            }
            o53.d0 d0Var = o53.d0.UNDISPATCHED;
            e23.p<Object, t13.d<? super Unit>, Object> pVar = this.f109282c;
            o53.b0 b0Var = this.f109281b;
            r0Var.f105810a = (T) ge1.b.T(b0Var, null, d0Var, new C2090a(pVar, obj, b0Var, null), 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(e23.a<Object> aVar, e23.p<Object, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f109278c = aVar;
        this.f109279d = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f109278c, this.f109279d, dVar);
        jVar.f109277b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f109276a;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.b0 b0Var = (o53.b0) this.f109277b;
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            r53.c2 c2VarS = p3.p0.s(this.f109278c);
            a aVar2 = new a(r0Var, b0Var, this.f109279d);
            this.f109276a = 1;
            if (c2VarS.collect(aVar2, this) == aVar) {
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
