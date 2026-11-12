package p006l2;

import e23.p;
import kotlin.q3;
import kotlin.s3;
import o13.r;
import o53.b0;
import o53.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import w2.i0;
import w2.j0;
import w2.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll2/q;", "Lw2/i0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q3 f108703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f108704b;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", f = "BasicTextField.kt", l = {333}, m = "showTextToolbar", v = 1)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n4.d f108705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public q3 f108706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b0 f108707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public n f108708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f108709e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f108711g;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f108709e = obj;
            this.f108711g |= Integer.MIN_VALUE;
            return q.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$1$1", f = "BasicTextField.kt", l = {339}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f108713b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n nVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f108713b = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f108713b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f108712a;
            if (i14 == 0) {
                r.b(obj);
                this.f108712a = 1;
                if (this.f108713b.j(true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1", f = "BasicTextField.kt", l = {345}, m = "invokeSuspend", v = 1)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f108715b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n nVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f108715b = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f108715b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f108714a;
            if (i14 == 0) {
                r.b(obj);
                this.f108714a = 1;
                if (this.f108715b.y(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$3$1", f = "BasicTextField.kt", l = {351}, m = "invokeSuspend", v = 1)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f108717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n nVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f108717b = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f108717b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f108716a;
            if (i14 == 0) {
                r.b(obj);
                this.f108716a = 1;
                if (this.f108717b.k(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class e implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f108718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f108719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f108720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f108721d;

        public e(n nVar, j0 j0Var, b0 b0Var, n nVar2) {
            this.f108718a = nVar;
            this.f108719b = j0Var;
            this.f108720c = b0Var;
            this.f108721d = nVar2;
        }

        @Override // e23.a
        public final Unit invoke() {
            ge1.b.T(this.f108720c, null, d0.UNDISPATCHED, new b(this.f108721d, null), 1);
            this.f108718a.D(this.f108719b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class f implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f108722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f108723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f108724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f108725d;

        public f(n nVar, j0 j0Var, b0 b0Var, n nVar2) {
            this.f108722a = nVar;
            this.f108723b = j0Var;
            this.f108724c = b0Var;
            this.f108725d = nVar2;
        }

        @Override // e23.a
        public final Unit invoke() {
            ge1.b.T(this.f108724c, null, d0.UNDISPATCHED, new c(this.f108725d, null), 1);
            this.f108722a.D(this.f108723b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class g implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f108726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f108727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f108728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f108729d;

        public g(n nVar, j0 j0Var, b0 b0Var, n nVar2) {
            this.f108726a = nVar;
            this.f108727b = j0Var;
            this.f108728c = b0Var;
            this.f108729d = nVar2;
        }

        @Override // e23.a
        public final Unit invoke() {
            ge1.b.T(this.f108728c, null, d0.UNDISPATCHED, new d(this.f108729d, null), 1);
            this.f108726a.D(this.f108727b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class h implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f108730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f108731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f108732c;

        public h(n nVar, j0 j0Var, n nVar2) {
            this.f108730a = nVar;
            this.f108731b = j0Var;
            this.f108732c = nVar2;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f108732c.B();
            this.f108730a.D(this.f108731b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class i implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f108733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f108734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f108735c;

        public i(n nVar, j0 j0Var, n nVar2) {
            this.f108733a = nVar;
            this.f108734b = j0Var;
            this.f108735c = nVar2;
        }

        @Override // e23.a
        public final Unit invoke() {
            e23.a<Unit> aVar = this.f108735c.f181379o;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f108733a.D(this.f108734b);
            return Unit.INSTANCE;
        }
    }

    public q(q3 q3Var, b0 b0Var) {
        this.f108703a = q3Var;
        this.f108704b = b0Var;
    }

    @Override // w2.i0
    public final void a() {
        q3 q3Var = this.f108703a;
        if (q3Var.getF91379d() == s3.Shown) {
            q3Var.hide();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w2.i0
    public final Object b(n nVar, n4.d dVar, t13.d<? super Unit> dVar2) {
        a aVar;
        n4.d dVar3;
        q3 q3Var;
        b0 b0Var;
        if (dVar2 instanceof a) {
            aVar = (a) dVar2;
            int i14 = aVar.f108711g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f108711g = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar2);
            }
        } else {
            aVar = new a(dVar2);
        }
        Object obj = aVar.f108709e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f108711g;
        if (i15 == 0) {
            r.b(obj);
            aVar.f108705a = dVar;
            q3 q3Var2 = this.f108703a;
            aVar.f108706b = q3Var2;
            b0 b0Var2 = this.f108704b;
            aVar.f108707c = b0Var2;
            aVar.f108708d = nVar;
            aVar.f108711g = 1;
            if (nVar.F() == aVar2) {
                return aVar2;
            }
            dVar3 = dVar;
            q3Var = q3Var2;
            b0Var = b0Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nVar = aVar.f108708d;
            b0Var = aVar.f108707c;
            q3 q3Var3 = aVar.f108706b;
            n4.d dVar4 = aVar.f108705a;
            r.b(obj);
            dVar3 = dVar4;
            q3Var = q3Var3;
        }
        boolean zE = nVar.e();
        j0 j0Var = j0.None;
        q3Var.a(dVar3, !zE ? null : new e(nVar, j0Var, b0Var, nVar), !nVar.g() ? null : new f(nVar, j0Var, b0Var, nVar), !nVar.f() ? null : new g(nVar, j0Var, b0Var, nVar), !nVar.h() ? null : new h(nVar, j0.Selection, nVar), nVar.d() ? new i(nVar, j0Var, nVar) : null);
        return Unit.INSTANCE;
    }
}
