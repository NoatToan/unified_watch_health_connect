package l3;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.mlkit.common.MlKitException;
import i3.ij;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;
import r53.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class x implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ij f109453a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f109454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f109455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b5.h0 f109456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ij f109457d;

        /* JADX INFO: renamed from: l3.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {210, 216, 238}, m = "invokeSuspend")
        public static final class C2091a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public r53.z1 f109458a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public b5.s f109459b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f109460c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f109461d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public /* synthetic */ Object f109462e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f109463f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ ij f109464g;

            /* JADX INFO: renamed from: l3.x$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "Lb5/a0;", "<anonymous>", "(Lb5/c;)Lb5/a0;"}, k = 3, mv = {2, 0, 0})
            @v13.e(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {217}, m = "invokeSuspend")
            public static final class C2092a extends v13.h implements e23.p<b5.c, t13.d<? super b5.a0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f109465a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f109466b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b5.s f109467c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2092a(b5.s sVar, t13.d<? super C2092a> dVar) {
                    super(2, dVar);
                    this.f109467c = sVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    C2092a c2092a = new C2092a(this.f109467c, dVar);
                    c2092a.f109466b = obj;
                    return c2092a;
                }

                @Override // e23.p
                public final Object invoke(b5.c cVar, t13.d<? super b5.a0> dVar) {
                    return ((C2092a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f109465a;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            o13.r.b(obj);
                            return obj;
                        }
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                    b5.c cVar = (b5.c) this.f109466b;
                    this.f109465a = 1;
                    Object objJ = k3.j(cVar, this.f109467c, this);
                    return objJ == aVar ? aVar : objJ;
                }
            }

            /* JADX INFO: renamed from: l3.x$a$a$b */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
            @v13.e(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", l = {224, 227, 227}, m = "invokeSuspend")
            public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Throwable f109468a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f109469b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ r53.z1<Boolean> f109470c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ij f109471d;

                /* JADX INFO: renamed from: l3.x$a$a$b$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isLongPressed", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
                @v13.e(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
                public static final class C2093a extends v13.i implements e23.p<Boolean, t13.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ boolean f109472a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ij f109473b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2093a(ij ijVar, t13.d<? super C2093a> dVar) {
                        super(2, dVar);
                        this.f109473b = ijVar;
                    }

                    @Override // v13.a
                    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                        C2093a c2093a = new C2093a(this.f109473b, dVar);
                        c2093a.f109472a = ((Boolean) obj).booleanValue();
                        return c2093a;
                    }

                    @Override // e23.p
                    public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C2093a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                        o13.r.b(obj);
                        if (!this.f109472a) {
                            this.f109473b.dismiss();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(r53.z1<Boolean> z1Var, ij ijVar, t13.d<? super b> dVar) {
                    super(2, dVar);
                    this.f109470c = z1Var;
                    this.f109471d = ijVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new b(this.f109470c, this.f109471d, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
                
                    if (r53.s.k(r6, r9, r8) == r0) goto L30;
                 */
                @Override // v13.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Throwable th3;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f109469b;
                    r53.z1<Boolean> z1Var = this.f109470c;
                    ij ijVar = this.f109471d;
                    try {
                        if (i14 == 0) {
                            o13.r.b(obj);
                            z1Var.d(Boolean.TRUE);
                            u1.k1 k1Var = u1.k1.PreventUserInput;
                            this.f109469b = 1;
                            if (ijVar.b(k1Var, this) != aVar) {
                            }
                            return aVar;
                        }
                        if (i14 == 1) {
                            o13.r.b(obj);
                        } else {
                            if (i14 != 2) {
                                if (i14 != 3) {
                                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                th3 = this.f109468a;
                                o13.r.b(obj);
                                throw th3;
                            }
                            o13.r.b(obj);
                        }
                        return Unit.INSTANCE;
                        if (ijVar.isVisible()) {
                            C2093a c2093a = new C2093a(ijVar, null);
                            this.f109469b = 2;
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        if (!ijVar.isVisible()) {
                            throw th4;
                        }
                        C2093a c2093a2 = new C2093a(ijVar, null);
                        this.f109468a = th4;
                        this.f109469b = 3;
                        if (r53.s.k(z1Var, c2093a2, this) != aVar) {
                            th3 = th4;
                        }
                        return aVar;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2091a(o53.b0 b0Var, ij ijVar, t13.d<? super C2091a> dVar) {
                super(2, dVar);
                this.f109463f = b0Var;
                this.f109464g = ijVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2091a c2091a = new C2091a(this.f109463f, this.f109464g, dVar);
                c2091a.f109462e = obj;
                return c2091a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((C2091a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
            /* JADX WARN: Code duplicated, block: B:44:0x00ca A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #4 {all -> 0x0019, blocks: (B:8:0x0014, B:42:0x00c6, B:44:0x00ca), top: B:54:0x0014 }] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                r53.z1 z1VarA;
                b5.s sVar;
                long j8;
                b5.c cVar;
                r53.z1 z1Var;
                r53.z1 z1Var2;
                b5.a0 a0Var;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f109461d;
                if (i14 == 0) {
                    o13.r.b(obj);
                    b5.c cVar2 = (b5.c) this.f109462e;
                    z1VarA = q2.a(Boolean.FALSE);
                    long jC = cVar2.getViewConfiguration().c();
                    sVar = b5.s.Initial;
                    this.f109462e = cVar2;
                    this.f109458a = z1VarA;
                    this.f109459b = sVar;
                    this.f109460c = jC;
                    this.f109461d = 1;
                    Object objC = k3.c(cVar2, sVar, this, 1);
                    if (objC != aVar) {
                        j8 = jC;
                        cVar = cVar2;
                        obj = objC;
                    }
                    return aVar;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1Var2 = (r53.z1) this.f109462e;
                        try {
                            o13.r.b(obj);
                            a0Var = (b5.a0) obj;
                            if (a0Var != null) {
                                a0Var.a();
                            }
                            z1Var2.d(Boolean.FALSE);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            z1Var2.d(Boolean.FALSE);
                            throw th;
                        }
                    }
                    b5.s sVar2 = this.f109459b;
                    z1Var = this.f109458a;
                    cVar = (b5.c) this.f109462e;
                    try {
                        o13.r.b(obj);
                        z1Var.d(Boolean.FALSE);
                    } catch (PointerEventTimeoutCancellationException unused) {
                        sVar = sVar2;
                        z1VarA = z1Var;
                        ge1.b.T(this.f109463f, null, o53.d0.UNDISPATCHED, new b(z1VarA, this.f109464g, null), 1);
                        this.f109462e = z1VarA;
                        this.f109458a = null;
                        this.f109459b = null;
                        this.f109461d = 3;
                        obj = k3.j(cVar, sVar, this);
                        if (obj != aVar) {
                            z1Var2 = z1VarA;
                            a0Var = (b5.a0) obj;
                            if (a0Var != null) {
                                a0Var.a();
                            }
                            z1Var2.d(Boolean.FALSE);
                        }
                        return aVar;
                    } catch (Throwable th4) {
                        th = th4;
                        z1Var2 = z1Var;
                        z1Var2.d(Boolean.FALSE);
                        throw th;
                    }
                    return Unit.INSTANCE;
                }
                long j14 = this.f109460c;
                b5.s sVar3 = this.f109459b;
                r53.z1 z1Var3 = this.f109458a;
                b5.c cVar3 = (b5.c) this.f109462e;
                o13.r.b(obj);
                sVar = sVar3;
                z1VarA = z1Var3;
                j8 = j14;
                cVar = cVar3;
                long j15 = j8;
                int i15 = ((b5.a0) obj).f15756i;
                b5.m0.f15849b.getClass();
                if (i15 == b5.m0.f15850c || i15 == b5.m0.f15852e) {
                    try {
                        try {
                            C2092a c2092a = new C2092a(sVar, null);
                            this.f109462e = cVar;
                            this.f109458a = z1VarA;
                            this.f109459b = sVar;
                            this.f109461d = 2;
                            if (cVar.h1(j15, c2092a, this) != aVar) {
                                z1Var = z1VarA;
                                z1Var.d(Boolean.FALSE);
                            }
                        } catch (PointerEventTimeoutCancellationException unused2) {
                            ge1.b.T(this.f109463f, null, o53.d0.UNDISPATCHED, new b(z1VarA, this.f109464g, null), 1);
                            this.f109462e = z1VarA;
                            this.f109458a = null;
                            this.f109459b = null;
                            this.f109461d = 3;
                            obj = k3.j(cVar, sVar, this);
                            if (obj != aVar) {
                                z1Var2 = z1VarA;
                                a0Var = (b5.a0) obj;
                                if (a0Var != null) {
                                    a0Var.a();
                                }
                                z1Var2.d(Boolean.FALSE);
                                return Unit.INSTANCE;
                            }
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        th = th5;
                        z1Var2 = z1VarA;
                        z1Var2.d(Boolean.FALSE);
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b5.h0 h0Var, ij ijVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f109456c = h0Var;
            this.f109457d = ijVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f109456c, this.f109457d, dVar);
            aVar.f109455b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f109454a;
            if (i14 == 0) {
                o13.r.b(obj);
                C2091a c2091a = new C2091a((o53.b0) this.f109455b, this.f109457d, null);
                this.f109454a = 1;
                if (p008y1.h1.c(this.f109456c, c2091a, this) == aVar) {
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

    public x(ij ijVar) {
        this.f109453a = ijVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        Object objE = o53.c0.e(new a(h0Var, this.f109453a, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
