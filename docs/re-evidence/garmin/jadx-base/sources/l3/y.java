package l3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import i3.ij;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class y implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ij f109482a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {249}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f109483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f109484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b5.h0 f109485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ij f109486d;

        /* JADX INFO: renamed from: l3.y$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {253}, m = "invokeSuspend")
        public static final class C2094a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public b5.s f109487a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f109488b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f109489c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f109490d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ij f109491e;

            /* JADX INFO: renamed from: l3.y$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
            @v13.e(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {258}, m = "invokeSuspend")
            public static final class C2095a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f109492a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ij f109493b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2095a(ij ijVar, t13.d<? super C2095a> dVar) {
                    super(2, dVar);
                    this.f109493b = ijVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C2095a(this.f109493b, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C2095a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f109492a;
                    if (i14 == 0) {
                        o13.r.b(obj);
                        u1.k1 k1Var = u1.k1.UserInput;
                        this.f109492a = 1;
                        if (this.f109493b.b(k1Var, this) == aVar) {
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
            public C2094a(o53.b0 b0Var, ij ijVar, t13.d<? super C2094a> dVar) {
                super(2, dVar);
                this.f109490d = b0Var;
                this.f109491e = ijVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2094a c2094a = new C2094a(this.f109490d, this.f109491e, dVar);
                c2094a.f109489c = obj;
                return c2094a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((C2094a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:14:0x0047  */
            /* JADX WARN: Code duplicated, block: B:16:0x0054  */
            /* JADX WARN: Code duplicated, block: B:17:0x0061  */
            /* JADX WARN: Code duplicated, block: B:19:0x0065  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r7.f109488b
                    r2 = 1
                    if (r1 == 0) goto L1a
                    if (r1 != r2) goto L13
                    b5.s r1 = r7.f109487a
                    java.lang.Object r3 = r7.f109489c
                    b5.c r3 = (b5.c) r3
                    o13.r.b(r8)
                    goto L31
                L13:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r8)
                    r8 = 0
                    return r8
                L1a:
                    o13.r.b(r8)
                    java.lang.Object r8 = r7.f109489c
                    b5.c r8 = (b5.c) r8
                    b5.s r1 = b5.s.Main
                    r3 = r8
                L24:
                    r7.f109489c = r3
                    r7.f109487a = r1
                    r7.f109488b = r2
                    java.lang.Object r8 = r3.W0(r1, r7)
                    if (r8 != r0) goto L31
                    return r0
                L31:
                    b5.q r8 = (b5.q) r8
                    java.util.List<b5.a0> r4 = r8.f15870a
                    r5 = 0
                    java.lang.Object r4 = r4.get(r5)
                    b5.a0 r4 = (b5.a0) r4
                    int r4 = r4.f15756i
                    b5.m0$a r5 = b5.m0.f15849b
                    r5.getClass()
                    int r5 = b5.m0.f15851d
                    if (r4 != r5) goto L24
                    int r8 = r8.f15875f
                    b5.t$a r4 = b5.t.f15887b
                    r4.getClass()
                    int r4 = b5.t.f15891f
                    i3.ij r5 = r7.f109491e
                    if (r8 != r4) goto L61
                    l3.y$a$a$a r8 = new l3.y$a$a$a
                    r4 = 0
                    r8.<init>(r5, r4)
                    r5 = 3
                    o53.b0 r6 = r7.f109490d
                    ge1.b.T(r6, r4, r4, r8, r5)
                    goto L24
                L61:
                    int r4 = b5.t.f15892g
                    if (r8 != r4) goto L24
                    r5.dismiss()
                    goto L24
                */
                throw new UnsupportedOperationException("Method not decompiled: l3.y.a.C2094a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b5.h0 h0Var, ij ijVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f109485c = h0Var;
            this.f109486d = ijVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f109485c, this.f109486d, dVar);
            aVar.f109484b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f109483a;
            if (i14 == 0) {
                o13.r.b(obj);
                C2094a c2094a = new C2094a((o53.b0) this.f109484b, this.f109486d, null);
                this.f109483a = 1;
                if (this.f109485c.R(c2094a, this) == aVar) {
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

    public y(ij ijVar) {
        this.f109482a = ijVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        Object objE = o53.c0.e(new a(h0Var, this.f109482a, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
