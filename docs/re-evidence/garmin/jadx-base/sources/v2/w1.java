package v2;

import android.view.KeyEvent;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.a4;
import kotlin.c3;
import kotlin.d3;
import kotlin.h3;
import kotlin.h4;
import kotlin.m3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;
import v2.w1.d;
import w2.n.b;
import w2.n.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\fBs\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0015\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lv2/w1;", "Lh5/m;", "Lh5/s;", "Li5/c3;", "Lh5/y1;", "Lh5/u;", "Lh5/u1;", "Lz4/g;", "Lh5/h;", "Lg5/g;", "Lh5/i1;", "Lh5/b0;", "Lm4/a0;", "Lv2/h2;", "textFieldState", "Lv2/g2;", "textLayoutState", "Lw2/n;", "textFieldSelectionState", "Lu2/a;", "filter", "", "enabled", "readOnly", "Ll2/a2;", "keyboardOptions", "Lu2/b;", "keyboardActionHandler", "singleLine", "La2/j;", "interactionSource", "isPassword", "Lr53/y1;", "", "stylusHandwritingTrigger", "<init>", "(Lv2/h2;Lv2/g2;Lw2/n;Lu2/a;ZZLl2/a2;Lu2/b;ZLa2/j;ZLr53/y1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w1 extends h5.m implements h5.s, c3, h5.y1, h5.u, h5.u1, z4.g, h5.h, g5.g, h5.i1, h5.b0, m4.a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h2 f175192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g2 f175193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w2.n f175194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f175195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f175196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p006l2.a2 f175197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f175198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a2.j f175199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f175200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r53.y1<Unit> f175201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u1.n0 f175202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b5.u0 f175203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a2.e f175204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k4.j f175205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h4 f175206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o53.c2 f175207r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v2.c f175208t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v1 f175209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o53.c2 f175210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u1 f175211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p3.c2 f175212y;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1", f = "TextFieldDecoratorModifier.kt", l = {666}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175213a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w1.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175213a;
            if (i14 == 0) {
                o13.r.b(obj);
                w2.n nVar = w1.this.f175194e;
                this.f175213a = 1;
                if (nVar.j(true, this) == aVar) {
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
    @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1", f = "TextFieldDecoratorModifier.kt", l = {671}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175215a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w1.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175215a;
            if (i14 == 0) {
                o13.r.b(obj);
                w2.n nVar = w1.this.f175194e;
                this.f175215a = 1;
                if (nVar.k(this) == aVar) {
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
    @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$12$1", f = "TextFieldDecoratorModifier.kt", l = {678}, m = "invokeSuspend", v = 1)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175217a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w1.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175217a;
            if (i14 == 0) {
                o13.r.b(obj);
                w2.n nVar = w1.this.f175194e;
                this.f175217a = 1;
                if (nVar.y(this) == aVar) {
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
    @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$2$2", f = "TextFieldDecoratorModifier.kt", l = {565}, m = "invokeSuspend", v = 1)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175219a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w1.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175219a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f175219a = 1;
                w1 w1Var = w1.this;
                w1Var.getClass();
                Object objCollect = r53.s.L(r53.s.u(p3.p0.s(new u1(w1Var, 8)), 1), 1).collect(new x1(w1Var), this);
                if (objCollect != aVar) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == aVar) {
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
    @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", f = "TextFieldDecoratorModifier.kt", l = {394, 395, 396}, m = "invokeSuspend", v = 1)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p006l2.s1 f175222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w1 f175223c;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f175224a;

            static {
                int[] iArr = new int[p006l2.s1.values().length];
                try {
                    iArr[p006l2.s1.COPY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p006l2.s1.CUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p006l2.s1.PASTE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f175224a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p006l2.s1 s1Var, w1 w1Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f175222b = s1Var;
            this.f175223c = w1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f175222b, this.f175223c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
            if (r6.y(r5) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        
            if (r6.k(r5) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        
            if (r6.j(false, r5) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175221a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = a.f175224a[this.f175222b.ordinal()];
                w1 w1Var = this.f175223c;
                if (i15 == 1) {
                    w2.n nVar = w1Var.f175194e;
                    this.f175221a = 1;
                } else if (i15 == 2) {
                    w2.n nVar2 = w1Var.f175194e;
                    this.f175221a = 2;
                } else if (i15 == 3) {
                    w2.n nVar3 = w1Var.f175194e;
                    this.f175221a = 3;
                }
            } else {
                if (i14 != 1 && i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v2/w1$f", "Ll2/y1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements p006l2.y1 {
        public f(w1 w1Var) {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class g implements PointerInputEventHandler {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f175226a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f175227b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b5.h0 f175228c;

            /* JADX INFO: renamed from: v2.w1$g$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
            @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1", f = "TextFieldDecoratorModifier.kt", l = {248}, m = "invokeSuspend", v = 1)
            public static final class C3262a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f175229a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w2.n f175230b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b5.h0 f175231c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3262a(w2.n nVar, b5.h0 h0Var, t13.d<? super C3262a> dVar) {
                    super(2, dVar);
                    this.f175230b = nVar;
                    this.f175231c = h0Var;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C3262a(this.f175230b, this.f175231c, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C3262a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f175229a;
                    if (i14 == 0) {
                        o13.r.b(obj);
                        this.f175229a = 1;
                        if (this.f175230b.n(this.f175231c, this) == aVar) {
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
            @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", f = "TextFieldDecoratorModifier.kt", l = {250}, m = "invokeSuspend", v = 1)
            public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f175232a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w1 f175233b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w2.n f175234c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ b5.h0 f175235d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.a<Unit> f175236e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(w1 w1Var, w2.n nVar, b5.h0 h0Var, e23.a<Unit> aVar, t13.d<? super b> dVar) {
                    super(2, dVar);
                    this.f175233b = w1Var;
                    this.f175234c = nVar;
                    this.f175235d = h0Var;
                    this.f175236e = aVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new b(this.f175233b, this.f175234c, this.f175235d, this.f175236e, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f175232a;
                    if (i14 == 0) {
                        o13.r.b(obj);
                        w1 w1Var = this.f175233b;
                        a2.j jVar = w1Var.f175199j;
                        u1 u1Var = new u1(w1Var, 12);
                        this.f175232a = 1;
                        w2.n nVar = this.f175234c;
                        nVar.getClass();
                        Object objE = k3.e(this.f175235d, new w2.b0(jVar, nVar, null), new tn2.s0(this.f175236e, 24, nVar, u1Var), this);
                        if (objE != obj2) {
                            objE = Unit.INSTANCE;
                        }
                        if (objE != obj2) {
                            objE = Unit.INSTANCE;
                        }
                        if (objE != obj2) {
                            objE = Unit.INSTANCE;
                        }
                        if (objE == obj2) {
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
            @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3", f = "TextFieldDecoratorModifier.kt", l = {264}, m = "invokeSuspend", v = 1)
            public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f175237a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w2.n f175238b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b5.h0 f175239c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.a<Unit> f175240d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(w2.n nVar, b5.h0 h0Var, e23.a<Unit> aVar, t13.d<? super c> dVar) {
                    super(2, dVar);
                    this.f175238b = nVar;
                    this.f175239c = h0Var;
                    this.f175240d = aVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new c(this.f175238b, this.f175239c, this.f175240d, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f175237a;
                    if (i14 == 0) {
                        o13.r.b(obj);
                        this.f175237a = 1;
                        w2.n nVar = this.f175238b;
                        nVar.getClass();
                        e23.a<Unit> aVar = this.f175240d;
                        Object objC = z2.o0.c(this.f175239c, nVar.new b(aVar), nVar.new c(aVar), this);
                        if (objC != obj2) {
                            objC = Unit.INSTANCE;
                        }
                        if (objC != obj2) {
                            objC = Unit.INSTANCE;
                        }
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w1 w1Var, b5.h0 h0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f175227b = w1Var;
                this.f175228c = h0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f175227b, this.f175228c, dVar);
                aVar.f175226a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f175226a;
                w1 w1Var = this.f175227b;
                w2.n nVar = w1Var.f175194e;
                ug2.h hVar = new ug2.h(18, nVar, w1Var);
                o53.d0 d0Var = o53.d0.UNDISPATCHED;
                b5.h0 h0Var = this.f175228c;
                ge1.b.T(b0Var, null, d0Var, new C3262a(nVar, h0Var, null), 1);
                ge1.b.T(b0Var, null, d0Var, new b(w1Var, nVar, h0Var, hVar, null), 1);
                ge1.b.T(b0Var, null, d0Var, new c(nVar, h0Var, hVar, null), 1);
                return Unit.INSTANCE;
            }
        }

        public g() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            Object objE = o53.c0.e(new a(w1.this, h0Var, null), dVar);
            return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", l = {810}, m = "invokeSuspend", v = 1)
    public static final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175241a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w1.a f175243c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li5/h3;", "", "<anonymous>", "(Li5/h3;)Ljava/lang/Void;"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", l = {811}, m = "invokeSuspend", v = 1)
        public static final class a extends v13.i implements e23.p<h3, t13.d<?>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f175244a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f175245b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w1 f175246c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ w1.a f175247d;

            /* JADX INFO: renamed from: v2.w1$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final /* synthetic */ class C3263a extends p005kotlin.jvm.internal.a implements e23.l<x5.p, Unit> {
                public C3263a(Object obj) {
                    super(1, obj, w1.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8);
                }

                @Override // e23.l
                public final Unit invoke(x5.p pVar) {
                    ((w1) this.receiver).a2(pVar.f188927a);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w1 w1Var, w1.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f175246c = w1Var;
                this.f175247d = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f175246c, this.f175247d, dVar);
                aVar.f175245b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(h3 h3Var, t13.d<?> dVar) {
                return ((a) create(h3Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f175244a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    h3 h3Var = (h3) this.f175245b;
                    w1 w1Var = this.f175246c;
                    h2 h2Var = w1Var.f175192c;
                    g2 g2Var = w1Var.f175193d;
                    x5.q qVarB = w1Var.f175197h.b(w1Var.f175198i);
                    C3263a c3263a = new C3263a(w1Var);
                    u1 u1Var = new u1(w1Var, 13);
                    r53.y1<Unit> y1Var = w1Var.f175201l;
                    a4 a4Var = (a4) h5.i.a(w1Var, kotlin.t1.f91502t);
                    v1 v1Var = new v1(w1Var, 8);
                    this.f175244a = 1;
                    if (i.i(h3Var, h2Var, g2Var, qVarB, this.f175247d, c3263a, u1Var, y1Var, a4Var, v1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w1.a aVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f175243c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w1.this.new h(this.f175243c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175241a;
            if (i14 == 0) {
                o13.r.b(obj);
                w1.a aVar2 = this.f175243c;
                w1 w1Var = w1.this;
                a aVar3 = new a(w1Var, aVar2, null);
                this.f175241a = 1;
                if (d3.a(w1Var, aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    public w1(h2 h2Var, g2 g2Var, w2.n nVar, u2.a aVar, boolean z14, boolean z15, p006l2.a2 a2Var, u2.b bVar, boolean z16, a2.j jVar, boolean z17, r53.y1<Unit> y1Var) {
        this.f175192c = h2Var;
        this.f175193d = g2Var;
        this.f175194e = nVar;
        this.f175195f = z14;
        this.f175196g = z15;
        this.f175197h = a2Var;
        this.f175198i = z16;
        this.f175199j = jVar;
        this.f175200k = z17;
        this.f175201l = y1Var;
        nVar.f181379o = new u1(this, 3);
        this.f175202m = new u1.n0(this.f175199j, 0, new v1(this, 0), 2, null);
        b5.v0 v0VarA = b5.s0.a(new g());
        U1(v0VarA);
        this.f175203n = v0VarA;
        u1 u1Var = new u1(this, 5);
        tr2.o oVar = new tr2.o(this, 13);
        k4.e eVar = new k4.e(null, new k4.g(new uo1.a(u1Var, 11), new a2(new v1(this, 1), oVar, null, new v1(this, 2), new v1(this, 3), new v1(this, 4), null, new v1(this, 5))), 1, null);
        U1(eVar);
        this.f175205p = eVar;
        this.f175208t = new v2.c();
        new f(this);
        this.f175209v = new v1(this, 6);
        this.f175211x = new u1(this, 4);
        this.f175212y = p3.p0.n(Boolean.FALSE);
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        u2.e eVarB = this.f175192c.f175039a.b();
        long j8 = eVarB.f167840d;
        final int i14 = 2;
        s5.c cVar = new s5.c(this.f175192c.f175039a.b().f167839c.toString(), null, 2, null);
        k23.l<Object>[] lVarArr = p5.h0.f136016a;
        p5.d0 d0Var = p5.d0.f135959a;
        d0Var.getClass();
        p5.j0<s5.c> j0Var = p5.d0.G;
        k23.l<Object>[] lVarArr2 = p5.h0.f136016a;
        k23.l<Object> lVar = lVarArr2[18];
        j0Var.getClass();
        k0Var.a(j0Var, cVar);
        s5.c cVar2 = new s5.c(eVarB.f167839c.toString(), null, 2, null);
        d0Var.getClass();
        p5.j0<s5.c> j0Var2 = p5.d0.H;
        k23.l<Object> lVar2 = lVarArr2[19];
        j0Var2.getClass();
        k0Var.a(j0Var2, cVar2);
        d0Var.getClass();
        p5.j0<s5.w0> j0Var3 = p5.d0.I;
        k23.l<Object> lVar3 = lVarArr2[20];
        s5.w0 w0VarA = s5.w0.a(j8);
        j0Var3.getClass();
        k0Var.a(j0Var3, w0VarA);
        if (!this.f175195f) {
            p5.h0.b(k0Var);
        }
        if (this.f175200k) {
            d0Var.getClass();
            k0Var.a(p5.d0.M, Unit.INSTANCE);
        }
        final int i15 = 0;
        final int i16 = 1;
        final boolean z14 = this.f175195f && !this.f175196g;
        d0Var.getClass();
        p5.j0<Boolean> j0Var4 = p5.d0.P;
        k23.l<Object> lVar4 = lVarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z14);
        j0Var4.getClass();
        k0Var.a(j0Var4, boolValueOf);
        i4.r.f90875a.getClass();
        p5.h0.m(k0Var, i4.r.a.f90877b);
        int i17 = i4.t.f90884a;
        p5.h0.q(k0Var, new i4.h(AutofillValue.forText(eVarB)));
        p5.h0.j(k0Var, new e23.l() { // from class: v2.t1
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z15;
                boolean z16;
                switch (i15) {
                    case 0:
                        i4.t tVar = (i4.t) obj;
                        if (z14) {
                            CharSequence charSequenceB = tVar.b();
                            w1 w1Var = this;
                            if (charSequenceB != null) {
                                w1Var.f175192c.g(charSequenceB);
                            }
                            w1Var.f175212y.setValue(Boolean.TRUE);
                            ge1.b.T(w1Var.getCoroutineScope(), null, null, w1Var.new d(null), 3);
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        return Boolean.valueOf(z15);
                    case 1:
                        s5.c cVar3 = (s5.c) obj;
                        if (z14) {
                            this.f175192c.g(cVar3);
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        return Boolean.valueOf(z16);
                    default:
                        s5.c cVar4 = (s5.c) obj;
                        boolean z17 = false;
                        if (z14) {
                            h2.h(this.f175192c, cVar4, null, false, 12);
                            z17 = true;
                        }
                        return Boolean.valueOf(z17);
                }
            }
        });
        int i18 = this.f175197h.f108344c;
        x5.v.f188954b.getClass();
        if (i18 == x5.v.f188960h) {
            i4.s.f90879a.getClass();
            p5.h0.o(k0Var, i4.s.a.f90882c);
        } else if (i18 == x5.v.f188961i || i18 == x5.v.f188962j) {
            i4.s.f90879a.getClass();
            p5.h0.o(k0Var, i4.s.a.f90881b);
        } else if (i18 == x5.v.f188958f) {
            i4.s.f90879a.getClass();
            p5.h0.o(k0Var, i4.s.a.f90883d);
        }
        p5.h0.e(k0Var, new v1(this, 7));
        if (z14) {
            e23.l lVar5 = new e23.l() { // from class: v2.t1
                @Override // e23.l
                public final Object invoke(Object obj) {
                    boolean z15;
                    boolean z16;
                    switch (i16) {
                        case 0:
                            i4.t tVar = (i4.t) obj;
                            if (z14) {
                                CharSequence charSequenceB = tVar.b();
                                w1 w1Var = this;
                                if (charSequenceB != null) {
                                    w1Var.f175192c.g(charSequenceB);
                                }
                                w1Var.f175212y.setValue(Boolean.TRUE);
                                ge1.b.T(w1Var.getCoroutineScope(), null, null, w1Var.new d(null), 3);
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            return Boolean.valueOf(z15);
                        case 1:
                            s5.c cVar3 = (s5.c) obj;
                            if (z14) {
                                this.f175192c.g(cVar3);
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            return Boolean.valueOf(z16);
                        default:
                            s5.c cVar4 = (s5.c) obj;
                            boolean z17 = false;
                            if (z14) {
                                h2.h(this.f175192c, cVar4, null, false, 12);
                                z17 = true;
                            }
                            return Boolean.valueOf(z17);
                    }
                }
            };
            p5.p pVar = p5.p.f136057a;
            pVar.getClass();
            k0Var.a(p5.p.f136068l, new p5.a(null, lVar5));
            e23.l lVar6 = new e23.l() { // from class: v2.t1
                @Override // e23.l
                public final Object invoke(Object obj) {
                    boolean z15;
                    boolean z16;
                    switch (i14) {
                        case 0:
                            i4.t tVar = (i4.t) obj;
                            if (z14) {
                                CharSequence charSequenceB = tVar.b();
                                w1 w1Var = this;
                                if (charSequenceB != null) {
                                    w1Var.f175192c.g(charSequenceB);
                                }
                                w1Var.f175212y.setValue(Boolean.TRUE);
                                ge1.b.T(w1Var.getCoroutineScope(), null, null, w1Var.new d(null), 3);
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            return Boolean.valueOf(z15);
                        case 1:
                            s5.c cVar3 = (s5.c) obj;
                            if (z14) {
                                this.f175192c.g(cVar3);
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            return Boolean.valueOf(z16);
                        default:
                            s5.c cVar4 = (s5.c) obj;
                            boolean z17 = false;
                            if (z14) {
                                h2.h(this.f175192c, cVar4, null, false, 12);
                                z17 = true;
                            }
                            return Boolean.valueOf(z17);
                    }
                }
            };
            pVar.getClass();
            k0Var.a(p5.p.f136072p, new p5.a(null, lVar6));
        }
        int i19 = 12;
        t21.v0 v0Var = new t21.v0(this, i19);
        p5.p pVar2 = p5.p.f136057a;
        pVar2.getClass();
        k0Var.a(p5.p.f136067k, new p5.a(null, v0Var));
        int iA = this.f175197h.a();
        p5.h0.k(k0Var, iA, new ag0.a(this, iA, i19));
        p5.h0.i(k0Var, null, new u1(this, 9));
        u1 u1Var = new u1(this, 10);
        pVar2.getClass();
        k0Var.a(p5.p.f136060d, new p5.a(null, u1Var));
        if (!s5.w0.e(j8) && !this.f175200k) {
            u1 u1Var2 = new u1(this, 11);
            pVar2.getClass();
            k0Var.a(p5.p.f136074r, new p5.a(null, u1Var2));
            if (this.f175195f && !this.f175196g) {
                u1 u1Var3 = new u1(this, i15);
                pVar2.getClass();
                k0Var.a(p5.p.f136075s, new p5.a(null, u1Var3));
            }
        }
        if (z14) {
            u1 u1Var4 = new u1(this, 6);
            pVar2.getClass();
            k0Var.a(p5.p.f136076t, new p5.a(null, u1Var4));
        }
        if (this.f175195f) {
            this.f175202m.D1(k0Var);
        }
    }

    @Override // z4.g
    public final boolean J(KeyEvent keyEvent) {
        return this.f175208t.b(keyEvent, this.f175192c, this.f175194e, (m4.q) h5.i.a(this, kotlin.t1.f91491i), b2());
    }

    @Override // z4.g
    public final boolean M1(KeyEvent keyEvent) {
        return this.f175208t.a(keyEvent, this.f175192c, this.f175193d, this.f175194e, this.f175209v, b2(), this.f175195f && !this.f175196g, this.f175198i, new u1(this, 7));
    }

    @Override // m4.a0
    public final void P1(m4.y yVar) {
        n4.d bounds;
        f5.c0 c0VarB;
        w2.n nVar = this.f175194e;
        g2 g2Var = nVar.f181366b;
        s5.q0 q0VarC = g2Var.c();
        if (q0VarC == null) {
            n4.d.f123545e.getClass();
            bounds = n4.d.f123546f;
        } else if (nVar.f181368d) {
            u2.e eVarD = nVar.f181365a.d();
            if (s5.w0.e(eVarD.f167840d)) {
                bounds = nVar.c(q0VarC, eVarD);
            } else {
                long j8 = eVarD.f167840d;
                if (s5.w0.e(j8)) {
                    n4.d.f123545e.getClass();
                    bounds = n4.d.f123546f;
                } else {
                    int i14 = (int) (j8 >> 32);
                    s5.o oVar = q0VarC.f157281b;
                    int iD = oVar.d(i14);
                    int i15 = (int) (4294967295L & j8);
                    int iD2 = oVar.d(i15);
                    if (iD == iD2) {
                        float f14 = q0VarC.f(i14, true);
                        float f15 = q0VarC.f(i15, true);
                        bounds = new n4.d(Math.min(f14, f15), oVar.f(iD), Math.max(f14, f15), oVar.b(iD2));
                    } else {
                        bounds = q0VarC.k(s5.w0.h(j8), s5.w0.g(j8)).getBounds();
                    }
                }
            }
            f5.c0 c0VarE = g2Var.e();
            if (c0VarE != null) {
                if (!c0VarE.isAttached()) {
                    c0VarE = null;
                }
                if (c0VarE != null && (c0VarB = g2Var.b()) != null) {
                    f5.c0 c0Var = c0VarB.isAttached() ? c0VarB : null;
                    if (c0Var != null) {
                        bounds = bounds.o(c0Var.j0(c0VarE, false).i());
                    }
                }
            }
        } else {
            m4.y.f116543a.getClass();
            bounds = m4.y.a.f116545b;
        }
        yVar.a(bounds);
    }

    public final void X1() {
        o53.c2 c2Var = this.f175210w;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f175210w = null;
        r53.y1<Unit> y1Var = this.f175201l;
        if (y1Var != null) {
            y1Var.c();
        }
    }

    public final void Y1() {
        a2.e eVar = this.f175204o;
        if (eVar != null) {
            this.f175199j.a(new a2.f(eVar));
            this.f175204o = null;
        }
    }

    public final boolean Z1() {
        h4 h4Var;
        return ((m4.h0) this.f175202m.f167631h.a0()).a() && (h4Var = this.f175206q) != null && h4Var.a();
    }

    @Override // h5.u1
    public final void a1() {
        this.f175203n.a1();
    }

    public final boolean a2(int i14) {
        x5.p.a aVar = x5.p.f188918b;
        aVar.getClass();
        aVar.getClass();
        if (i14 == x5.p.f188925i) {
            m4.q qVar = (m4.q) h5.i.a(this, kotlin.t1.f91491i);
            m4.g.f116466b.getClass();
            qVar.l(m4.g.f116467c);
            return true;
        }
        if (i14 == x5.p.f188924h) {
            m4.q qVar2 = (m4.q) h5.i.a(this, kotlin.t1.f91491i);
            m4.g.f116466b.getClass();
            qVar2.l(m4.g.f116468d);
            return true;
        }
        if (i14 != x5.p.f188926j) {
            return false;
        }
        b2().hide();
        return true;
    }

    public final m3 b2() {
        m3 m3Var = (m3) h5.i.a(this, kotlin.t1.f91499q);
        if (m3Var != null) {
            return m3Var;
        }
        vb.h.z("No software keyboard controller");
        return null;
    }

    public final void c2(boolean z14) {
        if (!z14) {
            Boolean bool = this.f175197h.f108347f;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        this.f175210w = ge1.b.T(getCoroutineScope(), null, null, new h(w1.b.a(this), null), 3);
    }

    @Override // h5.b0, h5.w0
    public final void e(long j8) {
        this.f175205p.e(j8);
    }

    @Override // h5.b0
    public final void f(f5.c0 c0Var) {
        this.f175205p.f(c0Var);
    }

    @Override // h5.y1
    /* JADX INFO: renamed from: l1 */
    public final boolean getF136009a() {
        return true;
    }

    @Override // h5.u
    public final void o(h5.c1 c1Var) {
        this.f175193d.f175000f.setValue(c1Var);
        if (this.f175195f) {
            this.f175202m.o(c1Var);
        }
    }

    @Override // h4.r.c
    public final void onAttach() {
        h5.j1.a(this, new u1(this, 1));
        this.f175194e.f181380p = this.f175211x;
        if (this.f175195f) {
            U1(this.f175202m);
        }
    }

    @Override // h4.r.c
    public final void onDetach() {
        X1();
        this.f175194e.f181380p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h5.s
    public final void p(h5.h0 h0Var) {
        h0Var.m1();
        if (((Boolean) this.f175212y.getF182175a()).booleanValue()) {
            o4.w t1Var = (o4.w) h5.i.a(this, p006l2.e.f108446a);
            long j8 = ((o4.d0) h5.i.a(this, p006l2.e.f108447b)).f128833a;
            if (!o4.d0.d(j8, o4.f0.b(1308617531))) {
                t1Var = new o4.t1(j8, null);
            }
            q4.f.C0(h0Var, t1Var, 0L, 0L, 0.0f, null, 0, 126);
        }
    }

    @Override // h5.u1
    public final void u1(b5.q qVar, b5.s sVar, long j8) {
        this.f175203n.u1(qVar, sVar, j8);
    }

    @Override // h5.i1
    public final void x1() {
        h5.j1.a(this, new u1(this, 1));
    }
}
