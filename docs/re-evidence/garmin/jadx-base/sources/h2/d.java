package h2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.h1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class d implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f80884a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {285}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f80885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b5.h0 f80886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j0 f80887c;

        /* JADX INFO: renamed from: h2.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {287, 291}, m = "invokeSuspend", v = 1)
        public static final class C1613a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public b5.a0 f80888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public b5.a0 f80889b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f80890c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f80891d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j0 f80892e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1613a(j0 j0Var, t13.d<? super C1613a> dVar) {
                super(2, dVar);
                this.f80892e = j0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1613a c1613a = new C1613a(this.f80892e, dVar);
                c1613a.f80891d = obj;
                return c1613a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((C1613a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0073  */
            /* JADX WARN: Code duplicated, block: B:23:0x0080 A[LOOP:0: B:19:0x0071->B:23:0x0080, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:27:0x0083 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:28:0x0055 A[EDGE_INSN: B:28:0x0055->B:14:0x0055 BREAK  A[LOOP:0: B:19:0x0071->B:23:0x0080], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:18:0x0068). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r11.f80890c
                    h2.j0 r2 = r11.f80892e
                    r3 = 2
                    r4 = 0
                    r5 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r5) goto L22
                    if (r1 != r3) goto L1b
                    b5.a0 r1 = r11.f80889b
                    b5.a0 r5 = r11.f80888a
                    java.lang.Object r6 = r11.f80891d
                    b5.c r6 = (b5.c) r6
                    o13.r.b(r12)
                    goto L68
                L1b:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r12)
                    r12 = 0
                    return r12
                L22:
                    java.lang.Object r1 = r11.f80891d
                    b5.c r1 = (b5.c) r1
                    o13.r.b(r12)
                    goto L3f
                L2a:
                    o13.r.b(r12)
                    java.lang.Object r12 = r11.f80891d
                    r1 = r12
                    b5.c r1 = (b5.c) r1
                    b5.s r12 = b5.s.Initial
                    r11.f80891d = r1
                    r11.f80890c = r5
                    java.lang.Object r12 = p008y1.k3.b(r1, r4, r12, r11)
                    if (r12 != r0) goto L3f
                    goto L67
                L3f:
                    b5.a0 r12 = (b5.a0) r12
                    n4.c$a r5 = n4.c.f123541b
                    r5.getClass()
                    p3.c2 r5 = r2.f80927c
                    r6 = 0
                    n4.c r6 = n4.c.a(r6)
                    r5.setValue(r6)
                    r5 = 0
                    r6 = r1
                    r1 = r5
                    r5 = r12
                L55:
                    if (r1 != 0) goto L8d
                    b5.s r12 = b5.s.Initial
                    r11.f80891d = r6
                    r11.f80888a = r5
                    r11.f80889b = r1
                    r11.f80890c = r3
                    java.lang.Object r12 = r6.W0(r12, r11)
                    if (r12 != r0) goto L68
                L67:
                    return r0
                L68:
                    b5.q r12 = (b5.q) r12
                    java.util.List<b5.a0> r7 = r12.f15870a
                    int r8 = r7.size()
                    r9 = r4
                L71:
                    if (r9 >= r8) goto L83
                    java.lang.Object r10 = r7.get(r9)
                    b5.a0 r10 = (b5.a0) r10
                    boolean r10 = b5.r.c(r10)
                    if (r10 != 0) goto L80
                    goto L55
                L80:
                    int r9 = r9 + 1
                    goto L71
                L83:
                    java.util.List<b5.a0> r12 = r12.f15870a
                    java.lang.Object r12 = r12.get(r4)
                    r1 = r12
                    b5.a0 r1 = (b5.a0) r1
                    goto L55
                L8d:
                    long r0 = r1.f15750c
                    long r3 = r5.f15750c
                    long r0 = n4.c.i(r0, r3)
                    p3.c2 r12 = r2.f80927c
                    n4.c r0 = n4.c.a(r0)
                    r12.setValue(r0)
                    kotlin.Unit r12 = p005kotlin.Unit.INSTANCE
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: h2.d.a.C1613a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b5.h0 h0Var, j0 j0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f80886b = h0Var;
            this.f80887c = j0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f80886b, this.f80887c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f80885a;
            if (i14 == 0) {
                o13.r.b(obj);
                C1613a c1613a = new C1613a(this.f80887c, null);
                this.f80885a = 1;
                if (h1.c(this.f80886b, c1613a, this) == aVar) {
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

    public d(j0 j0Var) {
        this.f80884a = j0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        Object objE = o53.c0.e(new a(h0Var, this.f80884a, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
