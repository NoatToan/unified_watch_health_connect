package z2;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.a4;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", f = "SelectionGestures.kt", l = {111, 119, 122, 124}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f201705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f201706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f201707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f201708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p006l2.p2 f201709e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, l lVar, p006l2.p2 p2Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f201707c = fVar;
            this.f201708d = lVar;
            this.f201709e = p2Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f201707c, this.f201708d, this.f201709e, dVar);
            aVar.f201706b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007c  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
        
            if (z2.o0.d(r2, r17.f201708d, r8, r7, r17) == r1) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
        
            if (z2.o0.e(r2, r8, r7, r17) == r1) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
        
            if (z2.o0.b(r2, r8, r7, r5, r17) == r1) goto L45;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b5.c cVar;
            Object objA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f201705a;
            if (i14 == 0) {
                o13.r.b(obj);
                cVar = (b5.c) this.f201706b;
                this.f201706b = cVar;
                this.f201705a = 1;
                objA = o0.a(cVar, this);
                if (objA != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                cVar = (b5.c) this.f201706b;
                o13.r.b(obj);
                objA = obj;
            } else {
                if (i14 != 2 && i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            b5.q qVar = (b5.q) objA;
            f fVar = this.f201707c;
            a4 a4Var = fVar.f201572a;
            b5.a0 a0Var = fVar.f201574c;
            b5.a0 a0Var2 = qVar.f15870a.get(0);
            if (a0Var == null || a0Var2.f15749b - a0Var.f15749b >= a4Var.b()) {
                fVar.f201573b = 1;
            } else {
                if (n4.c.e(n4.c.i(a0Var.f15750c, a0Var2.f15750c)) < p008y1.m0.l(a4Var, a0Var.f15756i)) {
                    fVar.f201573b++;
                } else {
                    fVar.f201573b = 1;
                }
            }
            fVar.f201574c = a0Var2;
            boolean zA = u0.a(qVar);
            if (zA && (qVar.f15873d & 33) != 0) {
                List<b5.a0> list = qVar.f15870a;
                int size = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        this.f201706b = null;
                        this.f201705a = 2;
                    } else {
                        if (list.get(i15).b()) {
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (!zA) {
                int i16 = fVar.f201573b;
                p006l2.p2 p2Var = this.f201709e;
                if (i16 == 1) {
                    this.f201706b = null;
                    this.f201705a = 3;
                } else {
                    this.f201706b = null;
                    this.f201705a = 4;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(b5.c r7, v13.a r8) {
        /*
            boolean r0 = r8 instanceof z2.n0
            if (r0 == 0) goto L13
            r0 = r8
            z2.n0 r0 = (z2.n0) r0
            int r1 = r0.f201703c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201703c = r1
            goto L18
        L13:
            z2.n0 r0 = new z2.n0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f201702b
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f201703c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            b5.c r7 = r0.f201701a
            o13.r.b(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L30:
            o13.r.b(r8)
        L33:
            b5.s r8 = b5.s.Main
            r0.f201701a = r7
            r0.f201703c = r3
            java.lang.Object r8 = r7.W0(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            b5.q r8 = (b5.q) r8
            java.util.List<b5.a0> r2 = r8.f15870a
            int r4 = r2.size()
            r5 = 0
        L49:
            if (r5 >= r4) goto L5b
            java.lang.Object r6 = r2.get(r5)
            b5.a0 r6 = (b5.a0) r6
            boolean r6 = b5.r.a(r6)
            if (r6 != 0) goto L58
            goto L33
        L58:
            int r5 = r5 + 1
            goto L49
        L5b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.o0.a(b5.c, v13.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        if (r14 == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b5.c cVar, p006l2.p2 p2Var, b5.q qVar, int i14, v13.a aVar) {
        r0 r0Var;
        long j8;
        c0 c0Var;
        p005kotlin.jvm.internal.q0 q0Var;
        if (aVar instanceof r0) {
            r0Var = (r0) aVar;
            int i15 = r0Var.f201763f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                r0Var.f201763f = i15 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(aVar);
            }
        } else {
            r0Var = new r0(aVar);
        }
        Object objT0 = r0Var.f201762e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = r0Var.f201763f;
        try {
            if (i16 == 0) {
                o13.r.b(objT0);
                b5.a0 a0Var = (b5.a0) p13.h0.b0(qVar.f15870a);
                j8 = a0Var.f15748a;
                long j14 = a0Var.f15750c;
                if (i14 > 2) {
                    d0.f201550a.getClass();
                    c0Var = d0.a.f201555e;
                } else {
                    d0.f201550a.getClass();
                    c0Var = d0.a.f201554d;
                }
                p2Var.b(j14, c0Var);
                q0Var = new p005kotlin.jvm.internal.q0();
                n4.c.f123541b.getClass();
                q0Var.f105808a = n4.c.f123543d;
                long jC = cVar.getViewConfiguration().c();
                s0 s0Var = new s0(j8, q0Var, null);
                r0Var.f201758a = cVar;
                r0Var.f201759b = p2Var;
                r0Var.f201760c = q0Var;
                r0Var.f201761d = j8;
                r0Var.f201763f = 1;
                objT0 = cVar.t0(jC, s0Var, r0Var);
                if (objT0 == aVar2) {
                }
                return aVar2;
            }
            if (i16 == 1) {
                long j15 = r0Var.f201761d;
                q0Var = r0Var.f201760c;
                p006l2.p2 p2Var2 = r0Var.f201759b;
                b5.c cVar2 = r0Var.f201758a;
                try {
                    o13.r.b(objT0);
                    j8 = j15;
                    p2Var = p2Var2;
                    cVar = cVar2;
                } catch (CancellationException e4) {
                    e = e4;
                    p2Var = p2Var2;
                    p2Var.onCancel();
                    throw e;
                }
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p2Var = r0Var.f201759b;
                cVar = r0Var.f201758a;
                o13.r.b(objT0);
            }
            if (((Boolean) objT0).booleanValue()) {
                List<b5.a0> list = cVar.k0().f15870a;
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                    b5.a0 a0Var2 = list.get(i17);
                    if (b5.r.c(a0Var2)) {
                        a0Var2.a();
                    }
                }
                p2Var.onStop();
            } else {
                p2Var.onCancel();
            }
            return Unit.INSTANCE;
            i iVar = (i) objT0;
            if (iVar == null) {
                iVar = i.Timeout;
            }
            if (iVar == i.Cancel) {
                p2Var.onCancel();
                return Unit.INSTANCE;
            }
            if (iVar == i.Up) {
                p2Var.onStop();
                return Unit.INSTANCE;
            }
            if (iVar == i.Drag) {
                p2Var.d(q0Var.f105808a);
            }
            p006l2.f2 f2Var = new p006l2.f2(p2Var, 2);
            r0Var.f201758a = cVar;
            r0Var.f201759b = p2Var;
            r0Var.f201760c = null;
            r0Var.f201763f = 2;
            objT0 = p008y1.m0.i(cVar, j8, f2Var, r0Var);
        } catch (CancellationException e14) {
            e = e14;
        }
    }

    public static final Object c(b5.h0 h0Var, l lVar, p006l2.p2 p2Var, t13.d<? super Unit> dVar) {
        Object objC = p008y1.h1.c(h0Var, new a(new f(h0Var.getViewConfiguration()), lVar, p2Var, null), dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007f A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0077, B:33:0x007f, B:35:0x008b, B:37:0x0097, B:28:0x005e), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008b A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0077, B:33:0x007f, B:35:0x008b, B:37:0x0097, B:28:0x005e), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0077, B:33:0x007f, B:35:0x008b, B:37:0x0097, B:28:0x005e), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0113 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00fb, B:56:0x0103, B:58:0x0107, B:60:0x0113, B:62:0x011f, B:50:0x00cd), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x011f A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00fb, B:56:0x0103, B:58:0x0107, B:60:0x0113, B:62:0x011f, B:50:0x00cd), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(b5.c cVar, l lVar, f fVar, b5.q qVar, v13.a aVar) {
        p0 p0Var;
        c0 c0Var;
        b5.c cVar2;
        p005kotlin.jvm.internal.m0 m0Var;
        List<b5.a0> list;
        int size;
        b5.a0 a0Var;
        List<b5.a0> list2;
        int size2;
        b5.a0 a0Var2;
        if (aVar instanceof p0) {
            p0Var = (p0) aVar;
            int i14 = p0Var.f201740e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f201740e = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(aVar);
            }
        } else {
            p0Var = new p0(aVar);
        }
        Object objI = p0Var.f201739d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f201740e;
        int i16 = 0;
        try {
            try {
                if (i15 == 0) {
                    o13.r.b(objI);
                    b5.a0 a0Var3 = qVar.f15870a.get(0);
                    if ((qVar.f15874e & 1) == 0) {
                        int i17 = fVar.f201573b;
                        if (i17 == 1) {
                            d0.f201550a.getClass();
                            c0Var = d0.a.f201552b;
                        } else if (i17 != 2) {
                            d0.f201550a.getClass();
                            c0Var = d0.a.f201555e;
                        } else {
                            d0.f201550a.getClass();
                            c0Var = d0.a.f201554d;
                        }
                        if (lVar.a(a0Var3.f15750c, c0Var, fVar.f201573b)) {
                            p005kotlin.jvm.internal.m0 m0Var2 = new p005kotlin.jvm.internal.m0();
                            d0.f201550a.getClass();
                            m0Var2.f105804a = !p005kotlin.jvm.internal.s.g(c0Var, d0.a.f201552b);
                            long j8 = a0Var3.f15748a;
                            wn2.f fVar2 = new wn2.f(lVar, 24, c0Var, m0Var2);
                            p0Var.f201736a = cVar;
                            p0Var.f201737b = lVar;
                            p0Var.f201738c = m0Var2;
                            p0Var.f201740e = 2;
                            objI = p008y1.m0.i(cVar, j8, fVar2, p0Var);
                            if (objI != aVar2) {
                                cVar2 = cVar;
                                m0Var = m0Var2;
                                if (((Boolean) objI).booleanValue()) {
                                    list2 = cVar2.k0().f15870a;
                                    size2 = list2.size();
                                    while (i16 < size2) {
                                        a0Var2 = list2.get(i16);
                                        if (b5.r.c(a0Var2)) {
                                            a0Var2.a();
                                        }
                                        i16++;
                                    }
                                }
                                lVar.b();
                            }
                            return aVar2;
                        }
                    } else if (lVar.c(a0Var3.f15750c)) {
                        a0Var3.a();
                        long j14 = a0Var3.f15748a;
                        yw2.h hVar = new yw2.h(lVar, 5);
                        p0Var.f201736a = cVar;
                        p0Var.f201737b = lVar;
                        p0Var.f201740e = 1;
                        objI = p008y1.m0.i(cVar, j14, hVar, p0Var);
                        if (objI == aVar2) {
                            return aVar2;
                        }
                        if (((Boolean) objI).booleanValue()) {
                            list = cVar.k0().f15870a;
                            size = list.size();
                            while (i16 < size) {
                                a0Var = list.get(i16);
                                if (b5.r.c(a0Var)) {
                                    a0Var.a();
                                }
                                i16++;
                            }
                        }
                        lVar.b();
                    }
                } else if (i15 == 1) {
                    lVar = p0Var.f201737b;
                    cVar = p0Var.f201736a;
                    o13.r.b(objI);
                    if (((Boolean) objI).booleanValue()) {
                        list = cVar.k0().f15870a;
                        size = list.size();
                        while (i16 < size) {
                            a0Var = list.get(i16);
                            if (b5.r.c(a0Var)) {
                                a0Var.a();
                            }
                            i16++;
                        }
                    }
                    lVar.b();
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m0Var = p0Var.f201738c;
                    lVar = p0Var.f201737b;
                    cVar2 = p0Var.f201736a;
                    o13.r.b(objI);
                    if (((Boolean) objI).booleanValue() && m0Var.f105804a) {
                        list2 = cVar2.k0().f15870a;
                        size2 = list2.size();
                        while (i16 < size2) {
                            a0Var2 = list2.get(i16);
                            if (b5.r.c(a0Var2)) {
                                a0Var2.a();
                            }
                            i16++;
                        }
                    }
                    lVar.b();
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                lVar.b();
                throw th3;
            }
        } catch (Throwable th4) {
            lVar.b();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r14 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(b5.c cVar, p006l2.p2 p2Var, b5.q qVar, v13.a aVar) {
        q0 q0Var;
        b5.a0 a0Var;
        if (aVar instanceof q0) {
            q0Var = (q0) aVar;
            int i14 = q0Var.f201748e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f201748e = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(aVar);
            }
        } else {
            q0Var = new q0(aVar);
        }
        Object objC = q0Var.f201747d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var.f201748e;
        boolean z14 = true;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                a0Var = (b5.a0) p13.h0.b0(qVar.f15870a);
                long j8 = a0Var.f15748a;
                q0Var.f201744a = cVar;
                q0Var.f201745b = p2Var;
                q0Var.f201746c = a0Var;
                q0Var.f201748e = 1;
                objC = p008y1.m0.c(cVar, j8, q0Var);
                if (objC == aVar2) {
                }
                return aVar2;
            }
            if (i15 == 1) {
                b5.a0 a0Var2 = q0Var.f201746c;
                p2Var = q0Var.f201745b;
                b5.c cVar2 = q0Var.f201744a;
                o13.r.b(objC);
                a0Var = a0Var2;
                cVar = cVar2;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p2Var = q0Var.f201745b;
                cVar = q0Var.f201744a;
                o13.r.b(objC);
            }
            if (((Boolean) objC).booleanValue()) {
                List<b5.a0> list = cVar.k0().f15870a;
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                    b5.a0 a0Var3 = list.get(i16);
                    if (b5.r.c(a0Var3)) {
                        a0Var3.a();
                    }
                }
                p2Var.onStop();
            } else {
                p2Var.onCancel();
            }
            return Unit.INSTANCE;
            b5.a0 a0Var4 = (b5.a0) objC;
            if (a0Var4 != null) {
                long j14 = a0Var4.f15750c;
                if (n4.c.e(n4.c.i(a0Var.f15750c, j14)) >= p008y1.m0.l(cVar.getViewConfiguration(), a0Var.f15756i)) {
                    z14 = false;
                }
                if (z14) {
                    d0.f201550a.getClass();
                    p2Var.b(j14, d0.a.f201554d);
                    long j15 = a0Var4.f15748a;
                    p006l2.f2 f2Var = new p006l2.f2(p2Var, 1);
                    q0Var.f201744a = cVar;
                    q0Var.f201745b = p2Var;
                    q0Var.f201746c = null;
                    q0Var.f201748e = 2;
                    objC = p008y1.m0.i(cVar, j15, f2Var, q0Var);
                }
            }
            return Unit.INSTANCE;
        } catch (CancellationException e4) {
            p2Var.onCancel();
            throw e4;
        }
    }
}
