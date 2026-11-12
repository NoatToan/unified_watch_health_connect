package w2;

import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.h1;
import z2.x0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo53/l1;", "<anonymous>", "(Lo53/b0;)Lo53/l1;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend", v = 1)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super l1>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f181450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f181451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b5.h0 f181452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f181453d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", l = {506}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f181455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b5.h0 f181456c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, b5.h0 h0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f181455b = nVar;
            this.f181456c = h0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f181455b, this.f181456c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f181454a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f181454a = 1;
                if (this.f181455b.n(this.f181456c, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", l = {508}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b5.h0 f181458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f181459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f181460d;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f181461a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f181462b;

            public a(n nVar, boolean z14) {
                this.f181461a = nVar;
                this.f181462b = z14;
            }

            @Override // w2.e
            public final void a() {
                long jW;
                n nVar = this.f181461a;
                f5.c0 c0VarV = nVar.v();
                if (c0VarV != null) {
                    n4.c.f123541b.getClass();
                    jW = c0VarV.W(0L);
                } else {
                    n4.c.f123541b.getClass();
                    jW = n4.c.f123543d;
                }
                nVar.f181381q.setValue(n4.c.a(jW));
                boolean z14 = this.f181462b;
                nVar.G(z14 ? p006l2.l1.SelectionStart : p006l2.l1.SelectionEnd, x0.a(nVar.t(z14)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b5.h0 h0Var, n nVar, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f181458b = h0Var;
            this.f181459c = nVar;
            this.f181460d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f181458b, this.f181459c, this.f181460d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f181457a;
            if (i14 == 0) {
                o13.r.b(obj);
                boolean z14 = this.f181460d;
                n nVar = this.f181459c;
                a aVar = new a(nVar, z14);
                p006l2.m mVar = new p006l2.m(nVar, 6);
                this.f181457a = 1;
                Object objC = h1.c(this.f181458b, new w2.c(aVar, mVar, null), this);
                if (objC != obj2) {
                    objC = Unit.INSTANCE;
                }
                if (objC == obj2) {
                    return obj2;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$4", f = "TextFieldSelectionState.kt", l = {526}, m = "invokeSuspend", v = 1)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f181464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b5.h0 f181465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f181466d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n nVar, b5.h0 h0Var, boolean z14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f181464b = nVar;
            this.f181465c = h0Var;
            this.f181466d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f181464b, this.f181465c, this.f181466d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f181463a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f181463a = 1;
                if (n.b(this.f181464b, this.f181465c, this.f181466d, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(n nVar, b5.h0 h0Var, boolean z14, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f181451b = nVar;
        this.f181452c = h0Var;
        this.f181453d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x xVar = new x(this.f181451b, this.f181452c, this.f181453d, dVar);
        xVar.f181450a = obj;
        return xVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super l1> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o53.b0 b0Var = (o53.b0) this.f181450a;
        o53.d0 d0Var = o53.d0.UNDISPATCHED;
        n nVar = this.f181451b;
        b5.h0 h0Var = this.f181452c;
        ge1.b.T(b0Var, null, d0Var, new a(nVar, h0Var, null), 1);
        boolean z14 = this.f181453d;
        ge1.b.T(b0Var, null, d0Var, new b(h0Var, nVar, z14, null), 1).J(new p006l2.j(nVar, 2));
        return ge1.b.T(b0Var, null, d0Var, new c(nVar, h0Var, z14, null), 1);
    }
}
