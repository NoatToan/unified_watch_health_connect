package p008y1;

import b5.a0;
import b5.c;
import b5.h0;
import b5.s;
import e23.p;
import g8.i;
import java.util.List;
import java.util.concurrent.CancellationException;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import t13.g;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend", v = 1)
    public static final class a extends h implements p<c, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f193244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<c, d<? super Unit>, Object> f193245d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g gVar, p<? super c, ? super d<? super Unit>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f193244c = gVar;
            this.f193245d = pVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f193244c, this.f193245d, dVar);
            aVar.f193243b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(c cVar, d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:38|21|(2:24|25)|34) */
        /* JADX WARN: Code duplicated, block: B:24:0x004d  */
        /* JADX WARN: Code duplicated, block: B:32:0x0065  */
        /* JADX WARN: Code duplicated, block: B:35:0x0072  */
        /* JADX WARN: Code duplicated, block: B:36:0x0073  */
        /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        
            r1 = r9;
            r9 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
        
            if (p008y1.h1.b(r1, b5.s.Final, r8) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [b5.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v3, types: [b5.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v13 */
        /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:12:0x0027). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006f -> B:12:0x0027). Please report as a decompilation issue!!! */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r14;
            p pVar;
            ?? r15;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            ?? r16 = this.f193242a;
            g gVar = this.f193244c;
            try {
                if (r16 == 0) {
                    r.b(obj);
                    r14 = (c) this.f193243b;
                    if (i.P(gVar)) {
                        return Unit.INSTANCE;
                    }
                    pVar = this.f193245d;
                    this.f193243b = r14;
                    this.f193242a = 1;
                    if (pVar.invoke(r14, this) != aVar) {
                        r16 = r14;
                        this.f193243b = r16;
                        this.f193242a = 2;
                        Object objB = h1.b(r16, s.Final, this);
                        r15 = r16;
                    }
                    r15 = r16;
                    return aVar;
                }
                if (r16 == 1) {
                    c cVar = (c) this.f193243b;
                    r.b(obj);
                    r16 = cVar;
                    this.f193243b = r16;
                    this.f193242a = 2;
                    Object objB2 = h1.b(r16, s.Final, this);
                    r15 = r16;
                } else if (r16 == 2) {
                    c cVar2 = (c) this.f193243b;
                    r.b(obj);
                    r15 = cVar2;
                } else {
                    if (r16 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c cVar3 = (c) this.f193243b;
                    r.b(obj);
                    r15 = cVar3;
                }
            } catch (CancellationException e4) {
                e = e4;
                if (!i.P(gVar)) {
                    throw e;
                }
                this.f193243b = r16;
                this.f193242a = 3;
            }
            r15 = r16;
            r14 = r15;
            if (i.P(gVar)) {
                return Unit.INSTANCE;
            }
            pVar = this.f193245d;
            this.f193243b = r14;
            this.f193242a = 1;
            if (pVar.invoke(r14, this) != aVar) {
                r16 = r14;
                this.f193243b = r16;
                this.f193242a = 2;
                Object objB3 = h1.b(r16, s.Final, this);
                r15 = r16;
            }
            r15 = r16;
            return aVar;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {48, 51, 56}, m = "forEachGesture", v = 1)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h0 f193246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p f193247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g f193248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f193249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f193250e;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f193249d = obj;
            this.f193250e |= Integer.MIN_VALUE;
            return h1.d(null, null, this);
        }
    }

    public static final boolean a(c cVar) {
        List<a0> list = cVar.k0().f15870a;
        int size = list.size();
        boolean z14 = false;
        for (int i14 = 0; i14 < size; i14++) {
            if (list.get(i14).f15751d) {
                z14 = true;
                break;
            }
        }
        return !z14;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[LOOP:0: B:20:0x0054->B:24:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003e A[EDGE_INSN: B:28:0x003e->B:16:0x003e BREAK  A[LOOP:0: B:20:0x0054->B:24:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(b5.c r7, b5.s r8, v13.a r9) {
        /*
            boolean r0 = r9 instanceof p008y1.g1
            if (r0 == 0) goto L13
            r0 = r9
            y1.g1 r0 = (p008y1.g1) r0
            int r1 = r0.f193217d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f193217d = r1
            goto L18
        L13:
            y1.g1 r0 = new y1.g1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f193216c
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f193217d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            b5.s r7 = r0.f193215b
            b5.c r8 = r0.f193214a
            o13.r.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4b
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L35:
            o13.r.b(r9)
            boolean r9 = a(r7)
            if (r9 != 0) goto L64
        L3e:
            r0.f193214a = r7
            r0.f193215b = r8
            r0.f193217d = r3
            java.lang.Object r9 = r7.W0(r8, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            b5.q r9 = (b5.q) r9
            java.util.List<b5.a0> r9 = r9.f15870a
            int r2 = r9.size()
            r4 = 0
        L54:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r9.get(r4)
            b5.a0 r5 = (b5.a0) r5
            boolean r5 = r5.f15751d
            if (r5 == 0) goto L61
            goto L3e
        L61:
            int r4 = r4 + 1
            goto L54
        L64:
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.h1.b(b5.c, b5.s, v13.a):java.lang.Object");
    }

    public static final Object c(h0 h0Var, p<? super c, ? super d<? super Unit>, ? extends Object> pVar, d<? super Unit> dVar) {
        Object objR = h0Var.R(new a(dVar.getF129302c(), pVar, null), dVar);
        return objR == u13.a.COROUTINE_SUSPENDED ? objR : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[Catch: CancellationException -> 0x0047, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0047, blocks: (B:31:0x0071, B:34:0x0087, B:17:0x0041, B:22:0x004f), top: B:52:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [t13.g] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [b5.h0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [b5.h0] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [b5.h0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [b5.h0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [b5.h0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [t13.g] */
    /* JADX WARN: Type inference failed for: r9v14, types: [t13.g] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [t13.g] */
    /* JADX WARN: Type inference failed for: r9v3, types: [t13.g] */
    /* JADX WARN: Type inference failed for: r9v4, types: [b5.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @o13.e
    public static final java.lang.Object d(b5.h0 r9, e23.p<? super b5.h0, ? super t13.d<? super p005kotlin.Unit>, ? extends java.lang.Object> r10, t13.d<? super p005kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof y1.h1.b
            if (r0 == 0) goto L13
            r0 = r11
            y1.h1$b r0 = (y1.h1.b) r0
            int r1 = r0.f193250e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f193250e = r1
            goto L18
        L13:
            y1.h1$b r0 = new y1.h1$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f193249d
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f193250e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L53
            if (r2 == r6) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L34
            t13.g r9 = r0.f193248c
            e23.p r10 = r0.f193247b
            b5.h0 r2 = r0.f193246a
            o13.r.b(r11)
            goto L44
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r9)
            r9 = 0
            return r9
        L3b:
            t13.g r9 = r0.f193248c
            e23.p r10 = r0.f193247b
            b5.h0 r2 = r0.f193246a
            o13.r.b(r11)     // Catch: java.util.concurrent.CancellationException -> L47
        L44:
            r11 = r9
            r9 = r2
            goto L5a
        L47:
            r11 = move-exception
            goto L91
        L49:
            t13.g r9 = r0.f193248c
            e23.p r10 = r0.f193247b
            b5.h0 r2 = r0.f193246a
            o13.r.b(r11)     // Catch: java.util.concurrent.CancellationException -> L47
            goto L71
        L53:
            o13.r.b(r11)
            t13.g r11 = r0.getF129302c()
        L5a:
            boolean r2 = g8.i.P(r11)
            if (r2 == 0) goto Lb3
            r0.f193246a = r9     // Catch: java.util.concurrent.CancellationException -> L8c
            r0.f193247b = r10     // Catch: java.util.concurrent.CancellationException -> L8c
            r0.f193248c = r11     // Catch: java.util.concurrent.CancellationException -> L8c
            r0.f193250e = r6     // Catch: java.util.concurrent.CancellationException -> L8c
            java.lang.Object r2 = r10.invoke(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L8c
            if (r2 != r1) goto L6f
            goto Lb1
        L6f:
            r2 = r9
            r9 = r11
        L71:
            r0.f193246a = r2     // Catch: java.util.concurrent.CancellationException -> L47
            r0.f193247b = r10     // Catch: java.util.concurrent.CancellationException -> L47
            r0.f193248c = r9     // Catch: java.util.concurrent.CancellationException -> L47
            r0.f193250e = r5     // Catch: java.util.concurrent.CancellationException -> L47
            y1.f1 r11 = new y1.f1     // Catch: java.util.concurrent.CancellationException -> L47
            r11.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L47
            java.lang.Object r11 = r2.R(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L47
            u13.a r7 = u13.a.COROUTINE_SUSPENDED     // Catch: java.util.concurrent.CancellationException -> L47
            if (r11 != r7) goto L87
            goto L89
        L87:
            kotlin.Unit r11 = p005kotlin.Unit.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L47
        L89:
            if (r11 != r1) goto L44
            goto Lb1
        L8c:
            r2 = move-exception
            r8 = r2
            r2 = r9
            r9 = r11
            r11 = r8
        L91:
            boolean r7 = g8.i.P(r9)
            if (r7 == 0) goto Lb2
            r0.f193246a = r2
            r0.f193247b = r10
            r0.f193248c = r9
            r0.f193250e = r4
            y1.f1 r11 = new y1.f1
            r11.<init>(r3)
            java.lang.Object r11 = r2.R(r11, r0)
            u13.a r7 = u13.a.COROUTINE_SUSPENDED
            if (r11 != r7) goto Lad
            goto Laf
        Lad:
            kotlin.Unit r11 = p005kotlin.Unit.INSTANCE
        Laf:
            if (r11 != r1) goto L44
        Lb1:
            return r1
        Lb2:
            throw r11
        Lb3:
            kotlin.Unit r9 = p005kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.h1.d(b5.h0, e23.p, t13.d):java.lang.Object");
    }
}
