package p008y1;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import b5.a0;
import b5.c;
import b5.h0;
import b5.q;
import b5.z;
import b82.r0;
import e23.l;
import e23.p;
import g6.f;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.a4;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;
import t13.d;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f193416a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {359, 360, 365}, m = "invokeSuspend", v = 1)
    public static final class a extends h implements p<c, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<n4.c, Unit> f193419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f193420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f193421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p<a0, n4.c, Unit> f193422f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super n4.c, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p<? super a0, ? super n4.c, Unit> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f193419c = lVar;
            this.f193420d = aVar;
            this.f193421e = aVar2;
            this.f193422f = pVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f193419c, this.f193420d, this.f193421e, this.f193422f, dVar);
            aVar.f193418b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(c cVar, d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x005a A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007c, B:35:0x0084, B:37:0x0091, B:39:0x009d, B:40:0x00a0, B:41:0x00a3, B:42:0x00a9, B:15:0x0027, B:27:0x0056, B:29:0x005a, B:18:0x002f, B:24:0x0047, B:21:0x003b), top: B:47:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x007b  */
        /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007c, B:35:0x0084, B:37:0x0091, B:39:0x009d, B:40:0x00a0, B:41:0x00a3, B:42:0x00a9, B:15:0x0027, B:27:0x0056, B:29:0x005a, B:18:0x002f, B:24:0x0047, B:21:0x003b), top: B:47:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x0091 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007c, B:35:0x0084, B:37:0x0091, B:39:0x009d, B:40:0x00a0, B:41:0x00a3, B:42:0x00a9, B:15:0x0027, B:27:0x0056, B:29:0x005a, B:18:0x002f, B:24:0x0047, B:21:0x003b), top: B:47:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x009d A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007c, B:35:0x0084, B:37:0x0091, B:39:0x009d, B:40:0x00a0, B:41:0x00a3, B:42:0x00a9, B:15:0x0027, B:27:0x0056, B:29:0x005a, B:18:0x002f, B:24:0x0047, B:21:0x003b), top: B:47:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00a9 A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007c, B:35:0x0084, B:37:0x0091, B:39:0x009d, B:40:0x00a0, B:41:0x00a3, B:42:0x00a9, B:15:0x0027, B:27:0x0056, B:29:0x005a, B:18:0x002f, B:24:0x0047, B:21:0x003b), top: B:47:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00a0 A[SYNTHETIC] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            a0 a0Var;
            c cVar2;
            List<a0> list;
            int size;
            int i14;
            a0 a0Var2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f193417a;
            e23.a<Unit> aVar2 = this.f193421e;
            try {
                if (i15 == 0) {
                    r.b(obj);
                    cVar = (c) this.f193418b;
                    this.f193418b = cVar;
                    this.f193417a = 1;
                    obj = k3.c(cVar, null, this, 2);
                    if (obj == aVar) {
                    }
                    return aVar;
                }
                if (i15 == 1) {
                    cVar = (c) this.f193418b;
                    r.b(obj);
                } else {
                    if (i15 == 2) {
                        cVar = (c) this.f193418b;
                        r.b(obj);
                        a0Var = (a0) obj;
                        if (a0Var != null) {
                            this.f193419c.invoke(n4.c.a(a0Var.f15750c));
                            long j8 = a0Var.f15748a;
                            r0 r0Var = new r0(this.f193422f, 11);
                            this.f193418b = cVar;
                            this.f193417a = 3;
                            obj = m0.i(cVar, j8, r0Var, this);
                            if (obj != aVar) {
                                cVar2 = cVar;
                            }
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar2 = (c) this.f193418b;
                    r.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    list = cVar2.k0().f15870a;
                    size = list.size();
                    for (i14 = 0; i14 < size; i14++) {
                        a0Var2 = list.get(i14);
                        if (b5.r.c(a0Var2)) {
                            a0Var2.a();
                        }
                    }
                    this.f193420d.invoke();
                } else {
                    aVar2.invoke();
                }
                return Unit.INSTANCE;
                long j14 = ((a0) obj).f15748a;
                this.f193418b = cVar;
                this.f193417a = 2;
                obj = m0.c(cVar, j14, this);
                if (obj != aVar) {
                    a0Var = (a0) obj;
                    if (a0Var != null) {
                        this.f193419c.invoke(n4.c.a(a0Var.f15750c));
                        long j15 = a0Var.f15748a;
                        r0 r0Var2 = new r0(this.f193422f, 11);
                        this.f193418b = cVar;
                        this.f193417a = 3;
                        obj = m0.i(cVar, j15, r0Var2, this);
                        if (obj != aVar) {
                            cVar2 = cVar;
                            if (((Boolean) obj).booleanValue()) {
                                list = cVar2.k0().f15870a;
                                size = list.size();
                                while (i14 < size) {
                                    a0Var2 = list.get(i14);
                                    if (b5.r.c(a0Var2)) {
                                        a0Var2.a();
                                    }
                                }
                                this.f193420d.invoke();
                            } else {
                                aVar2.invoke();
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            } catch (CancellationException e4) {
                aVar2.invoke();
                throw e4;
            }
        }
    }

    static {
        f.a aVar = f.f75994b;
        f193416a = ((float) 0.125d) / 18;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af A[LOOP:0: B:24:0x009a->B:29:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4 A[EDGE_INSN: B:66:0x00b4->B:31:0x00b4 BREAK  A[LOOP:0: B:24:0x009a->B:29:0x00af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0089 -> B:23:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(b5.c r17, b5.a0 r18, b5.s r19, v13.a r20) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.m0.a(b5.c, b5.a0, b5.s, v13.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[LOOP:0: B:23:0x0072->B:27:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x008a A[EDGE_INSN: B:54:0x008a->B:29:0x008a BREAK  A[LOOP:0: B:23:0x0072->B:27:0x0086], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:22:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(b5.c r17, long r18, v13.c r20) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.m0.b(b5.c, long, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, b5.a0] */
    public static final Object c(c cVar, long j8, v13.a aVar) {
        h0 h0Var;
        a0 a0Var;
        p005kotlin.jvm.internal.m0 m0Var;
        Object obj;
        if (aVar instanceof h0) {
            h0Var = (h0) aVar;
            int i14 = h0Var.f193241e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f193241e = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(aVar);
            }
        } else {
            h0Var = new h0(aVar);
        }
        Object obj2 = h0Var.f193240d;
        Object obj3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f193241e;
        try {
            if (i15 == 0) {
                r.b(obj2);
                if (!k(cVar.k0(), j8)) {
                    List<a0> list = cVar.k0().f15870a;
                    int size = list.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            a0Var = null;
                            break;
                        }
                        a0Var = list.get(i16);
                        if (z.b(a0Var.f15748a, j8)) {
                            break;
                        }
                        i16++;
                    }
                    a0 a0Var2 = a0Var;
                    if (a0Var2 != 0) {
                        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                        p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                        r0Var2.f105810a = a0Var2;
                        long jC = cVar.getViewConfiguration().c();
                        p005kotlin.jvm.internal.m0 m0Var2 = new p005kotlin.jvm.internal.m0();
                        p i0Var = new i0(m0Var2, r0Var2, r0Var, null);
                        h0Var.f193237a = a0Var2;
                        h0Var.f193238b = r0Var;
                        h0Var.f193239c = m0Var2;
                        h0Var.f193241e = 1;
                        if (cVar.h1(jC, i0Var, h0Var) == obj3) {
                            return obj3;
                        }
                        m0Var = m0Var2;
                        j8 = r0Var;
                        obj = a0Var2;
                    }
                }
                return null;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m0Var = h0Var.f193239c;
            p005kotlin.jvm.internal.r0 r0Var3 = h0Var.f193238b;
            a0 a0Var3 = h0Var.f193237a;
            r.b(obj2);
            j8 = r0Var3;
            obj = a0Var3;
            if (m0Var.f105804a) {
                a0 a0Var4 = (a0) j8.f105810a;
                return a0Var4 == null ? obj : a0Var4;
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            a0 a0Var5 = (a0) j8.f105810a;
            return a0Var5 == null ? obj : a0Var5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d5 A[LOOP:0: B:25:0x00be->B:29:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00df A[EDGE_INSN: B:68:0x00df->B:31:0x00df BREAK  A[LOOP:0: B:25:0x00be->B:29:0x00d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0161 -> B:62:0x0167). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(b5.c r19, long r20, e23.p r22, v13.a r23) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.m0.d(b5.c, long, e23.p, v13.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d6 A[LOOP:0: B:25:0x00bf->B:29:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0 A[EDGE_INSN: B:68:0x00e0->B:31:0x00e0 BREAK  A[LOOP:0: B:25:0x00bf->B:29:0x00d6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x016e -> B:62:0x0174). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(b5.c r19, long r20, r02.f r22, v13.a r23) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.m0.e(b5.c, long, r02.f, v13.a):java.lang.Object");
    }

    public static final Object f(h0 h0Var, l<? super n4.c, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p<? super a0, ? super n4.c, Unit> pVar, d<? super Unit> dVar) {
        Object objC = h1.c(h0Var, new l0(new xh0.d(15), new q0(), null, new gt1.l(lVar, 6), pVar, aVar2, new xx1.d(aVar, 1), null), dVar);
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        if (objC != aVar3) {
            objC = Unit.INSTANCE;
        }
        return objC == aVar3 ? objC : Unit.INSTANCE;
    }

    public static final Object g(h0 h0Var, l<? super n4.c, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p<? super a0, ? super n4.c, Unit> pVar, d<? super Unit> dVar) {
        Object objC = h1.c(h0Var, new a(lVar, aVar, aVar2, pVar, null), dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object i(b5.c r4, long r5, e23.l r7, v13.a r8) {
        /*
            boolean r0 = r8 instanceof p008y1.n0
            if (r0 == 0) goto L13
            r0 = r8
            y1.n0 r0 = (p008y1.n0) r0
            int r1 = r0.f193436d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f193436d = r1
            goto L18
        L13:
            y1.n0 r0 = new y1.n0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f193435c
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f193436d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            e23.l r4 = r0.f193434b
            b5.c r5 = r0.f193433a
            o13.r.b(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r4)
            r4 = 0
            return r4
        L34:
            o13.r.b(r8)
        L37:
            r0.f193433a = r4
            r0.f193434b = r7
            r0.f193436d = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            b5.a0 r8 = (b5.a0) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = b5.r.d(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.f15748a
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.m0.i(b5.c, long, e23.l, v13.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e A[LOOP:0: B:25:0x0088->B:29:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a7 A[EDGE_INSN: B:74:0x00a7->B:31:0x00a7 BREAK  A[LOOP:0: B:25:0x0088->B:29:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0079 -> B:24:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object j(b5.c r18, long r19, hy.h r21, v13.a r22) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.m0.j(b5.c, long, hy.h, v13.a):java.lang.Object");
    }

    public static final boolean k(q qVar, long j8) {
        a0 a0Var;
        List<a0> list = qVar.f15870a;
        int size = list.size();
        boolean z14 = false;
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                a0Var = null;
                break;
            }
            a0Var = list.get(i14);
            if (z.b(a0Var.f15748a, j8)) {
                break;
            }
            i14++;
        }
        a0 a0Var2 = a0Var;
        if (a0Var2 != null && a0Var2.f15751d) {
            z14 = true;
        }
        return true ^ z14;
    }

    public static final float l(a4 a4Var, int i14) {
        b5.m0.f15849b.getClass();
        return i14 == b5.m0.f15851d ? a4Var.e() * f193416a : a4Var.e();
    }
}
