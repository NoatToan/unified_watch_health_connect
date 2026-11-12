package w2;

import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo53/l1;", "<anonymous>", "(Lo53/b0;)Lo53/l1;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend", v = 1)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super l1>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f181414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f181415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b5.h0 f181416c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", f = "TextFieldSelectionState.kt", l = {493}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f181418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b5.h0 f181419c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, b5.h0 h0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f181418b = nVar;
            this.f181419c = h0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f181418b, this.f181419c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f181417a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f181417a = 1;
                if (this.f181418b.n(this.f181419c, this) == aVar) {
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
    @v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", f = "TextFieldSelectionState.kt", l = {494}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f181421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b5.h0 f181422c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n nVar, b5.h0 h0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f181421b = nVar;
            this.f181422c = h0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f181421b, this.f181422c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f181420a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f181420a = 1;
                if (n.a(this.f181421b, this.f181422c, this) == aVar) {
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
    @v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", f = "TextFieldSelectionState.kt", l = {496}, m = "invokeSuspend", v = 1)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b5.h0 f181424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f181425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b5.h0 h0Var, n nVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f181424b = h0Var;
            this.f181425c = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f181424b, this.f181425c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f181423a;
            if (i14 == 0) {
                o13.r.b(obj);
                p006l2.j jVar = new p006l2.j(this.f181425c, 1);
                this.f181423a = 1;
                if (k3.f(this.f181424b, null, null, jVar, this, 7) == aVar) {
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
    public o(n nVar, b5.h0 h0Var, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f181415b = nVar;
        this.f181416c = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f181415b, this.f181416c, dVar);
        oVar.f181414a = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super l1> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o53.b0 b0Var = (o53.b0) this.f181414a;
        o53.d0 d0Var = o53.d0.UNDISPATCHED;
        n nVar = this.f181415b;
        b5.h0 h0Var = this.f181416c;
        ge1.b.T(b0Var, null, d0Var, new a(nVar, h0Var, null), 1);
        ge1.b.T(b0Var, null, d0Var, new b(nVar, h0Var, null), 1);
        return ge1.b.T(b0Var, null, d0Var, new c(h0Var, nVar, null), 1);
    }
}
