package yc;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\u00020\u0001B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012.\u0010\b\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/v3;", "", "R", "T", "Lyc/o4;", "terminalSeparatorType", "Lkotlin/Function3;", "Lt13/d;", "generator", "<init>", "(Lyc/o4;Le23/q;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v3<R, T extends R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4 f196544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.q<T, T, t13.d<? super R>, Object> f196545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f196546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f196547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f196548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f196549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b1 f196550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f196551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f196552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f196553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f196554k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196555a;

        static {
            int[] iArr = new int[o4.values().length];
            try {
                iArr[o4.FULLY_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o4.SOURCE_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f196555a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v3(o4 o4Var, e23.q<? super T, ? super T, ? super t13.d<? super R>, ? extends Object> qVar) {
        o4Var.getClass();
        qVar.getClass();
        this.f196544a = o4Var;
        this.f196545b = qVar;
        this.f196546c = new ArrayList();
        this.f196549f = new k1();
    }

    public static p4 d(p4 p4Var) {
        int[] iArr = p4Var.f196318a;
        List<T> list = p4Var.f196319b;
        List listK = p13.x.k(p13.h0.b0(list), p13.h0.m0(list));
        int i14 = p4Var.f196320c;
        List<Integer> list2 = p4Var.f196321d;
        return new p4(iArr, listK, i14, p13.x.k(Integer.valueOf(list2 != null ? ((Number) p13.h0.b0(list2)).intValue() : 0), Integer.valueOf(list2 != null ? ((Number) p13.h0.m0(list2)).intValue() : list.size() - 1)));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [yc.m1$c] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public final Object a(m1 m1Var, v13.c cVar) {
        x3 x3Var;
        v3<R, T> v3Var;
        z0 z0Var;
        Object obj;
        ?? r14;
        m1 m1Var2;
        Object obj2;
        if (cVar instanceof x3) {
            x3Var = (x3) cVar;
            int i14 = x3Var.f196623d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x3Var.f196623d = i14 - Integer.MIN_VALUE;
            } else {
                x3Var = new x3(this, cVar);
            }
        } else {
            x3Var = new x3(this, cVar);
        }
        Object obj3 = x3Var.f196621b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = x3Var.f196623d;
        if (i15 == 0) {
            o13.r.b(obj3);
            if (m1Var instanceof m1.b) {
                x3Var.f196620a = this;
                x3Var.f196623d = 1;
                Object objB = b((m1.b) m1Var, x3Var);
                if (objB != aVar) {
                    v3Var = this;
                    obj = objB;
                    m1Var2 = (m1) obj;
                }
            } else {
                boolean z14 = m1Var instanceof m1.a;
                k1 k1Var = this.f196549f;
                if (z14) {
                    m1.a aVar2 = (m1.a) m1Var;
                    int i16 = aVar2.f196158d;
                    c1 c1Var = aVar2.f196155a;
                    z0.c.f196665b.getClass();
                    k1Var.c(c1Var, z0.c.f196667d);
                    c1 c1Var2 = c1.PREPEND;
                    if (c1Var == c1Var2) {
                        this.f196551h = i16;
                        this.f196554k = false;
                    } else if (c1Var == c1.APPEND) {
                        this.f196552i = i16;
                        this.f196553j = false;
                    }
                    ArrayList arrayList = this.f196546c;
                    if (arrayList.isEmpty()) {
                        if (c1Var == c1Var2) {
                            this.f196548e = false;
                        } else {
                            this.f196547d = false;
                        }
                    }
                    p13.d0.B(new w3(new j23.l(aVar2.f196156b, aVar2.f196157c)), arrayList);
                    v3Var = this;
                    m1Var2 = aVar2;
                } else if (m1Var instanceof m1.c) {
                    ?? B = (m1.c) m1Var;
                    x3Var.f196620a = this;
                    x3Var.f196623d = 2;
                    b1 b1Var = this.f196550g;
                    b1 b1VarD = k1Var.d();
                    b1 b1Var2 = B.f196198a;
                    b1 b1Var3 = B.f196199b;
                    if (!b1VarD.equals(b1Var2) || !p005kotlin.jvm.internal.s.g(b1Var, b1Var3)) {
                        k1Var.b(b1Var2);
                        this.f196550g = b1Var3;
                        if (b1Var3 != null) {
                            z0 z0Var2 = b1Var3.f195770b;
                            if (z0Var2.f196662a) {
                                if (!p005kotlin.jvm.internal.s.g(b1Var != null ? b1Var.f195770b : null, z0Var2)) {
                                    m1.b.a aVar3 = m1.b.f196160g;
                                    p13.j0 j0Var = p13.j0.f134944a;
                                    int i17 = this.f196551h;
                                    aVar3.getClass();
                                    j0Var.getClass();
                                    B = b(new m1.b(c1.PREPEND, j0Var, i17, -1, b1Var2, b1Var3, null), x3Var);
                                } else if (b1Var3 != null) {
                                    z0Var = b1Var3.f195771c;
                                    if (z0Var.f196662a) {
                                        if (!p005kotlin.jvm.internal.s.g(b1Var != null ? b1Var.f195771c : null, z0Var)) {
                                            m1.b.a aVar4 = m1.b.f196160g;
                                            p13.j0 j0Var2 = p13.j0.f134944a;
                                            int i18 = this.f196552i;
                                            aVar4.getClass();
                                            j0Var2.getClass();
                                            B = b(new m1.b(c1.APPEND, j0Var2, -1, i18, b1Var2, b1Var3, null), x3Var);
                                        }
                                    }
                                }
                            } else if (b1Var3 != null) {
                                z0Var = b1Var3.f195771c;
                                if (z0Var.f196662a) {
                                    if (!p005kotlin.jvm.internal.s.g(b1Var != null ? b1Var.f195771c : null, z0Var)) {
                                        m1.b.a aVar5 = m1.b.f196160g;
                                        p13.j0 j0Var3 = p13.j0.f134944a;
                                        int i19 = this.f196552i;
                                        aVar5.getClass();
                                        j0Var3.getClass();
                                        B = b(new m1.b(c1.APPEND, j0Var3, -1, i19, b1Var2, b1Var3, null), x3Var);
                                    }
                                }
                            }
                        } else if (b1Var3 != null) {
                            z0Var = b1Var3.f195771c;
                            if (z0Var.f196662a) {
                                if (!p005kotlin.jvm.internal.s.g(b1Var != null ? b1Var.f195771c : null, z0Var)) {
                                    m1.b.a aVar6 = m1.b.f196160g;
                                    p13.j0 j0Var4 = p13.j0.f134944a;
                                    int i110 = this.f196552i;
                                    aVar6.getClass();
                                    j0Var4.getClass();
                                    B = b(new m1.b(c1.APPEND, j0Var4, -1, i110, b1Var2, b1Var3, null), x3Var);
                                }
                            }
                        }
                    }
                    ?? r15 = B;
                    if (r15 != aVar) {
                        v3Var = this;
                        r14 = r15;
                        m1Var2 = (m1) r14;
                    }
                } else {
                    if (!(m1Var instanceof m1.d)) {
                        lc.u0.r();
                        return null;
                    }
                    x3Var.f196620a = this;
                    x3Var.f196623d = 3;
                    Object objC = c((m1.d) m1Var, x3Var);
                    if (objC != aVar) {
                        v3Var = this;
                        obj2 = objC;
                        m1Var2 = (m1) obj2;
                    }
                }
            }
            return aVar;
        }
        if (i15 == 1) {
            v3Var = x3Var.f196620a;
            o13.r.b(obj3);
            obj = obj3;
            m1Var2 = (m1) obj;
        } else if (i15 == 2) {
            v3Var = x3Var.f196620a;
            o13.r.b(obj3);
            r14 = obj3;
            m1Var2 = (m1) r14;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v3Var = x3Var.f196620a;
            o13.r.b(obj3);
            obj2 = obj3;
            m1Var2 = (m1) obj2;
        }
        boolean z15 = v3Var.f196547d;
        ArrayList arrayList2 = v3Var.f196546c;
        if (z15 && !arrayList2.isEmpty()) {
            vb.h.z("deferred endTerm, page stash should be empty");
            return null;
        }
        if (!v3Var.f196548e || arrayList2.isEmpty()) {
            return m1Var2;
        }
        vb.h.z("deferred startTerm, page stash should be empty");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:166:0x042f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x042f -> B:167:0x043a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x060b -> B:18:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:245:0x06e0 -> B:246:0x06e1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(yc.m1.b r24, v13.c r25) {
        /*
            Method dump skipped, instruction units count: 1976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.v3.b(yc.m1$b, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:21:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(yc.m1.d r11, v13.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof yc.z3
            if (r0 == 0) goto L13
            r0 = r12
            yc.z3 r0 = (yc.z3) r0
            int r1 = r0.f196708i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196708i = r1
            goto L18
        L13:
            yc.z3 r0 = new yc.z3
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f196706g
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f196708i
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L37
            int r11 = r0.f196705f
            int r2 = r0.f196704e
            java.lang.Object r4 = r0.f196703d
            java.util.List r5 = r0.f196702c
            yc.m1$d r6 = r0.f196701b
            yc.v3 r7 = r0.f196700a
            o13.r.b(r12)
            r9 = r4
            r4 = r11
            r11 = r6
            r6 = r9
            goto L75
        L37:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r11)
            r11 = 0
            return r11
        L3e:
            java.util.ArrayList r12 = v.h.x(r12)
            java.util.List<T> r2 = r11.f196200a
            int r2 = r2.size()
            if (r2 < 0) goto L87
            r4 = 0
            r7 = r10
            r5 = r12
        L4d:
            java.util.List<T> r12 = r11.f196200a
            int r6 = r4 + (-1)
            java.lang.Object r12 = p13.h0.e0(r6, r12)
            java.util.List<T> r6 = r11.f196200a
            java.lang.Object r6 = p13.h0.e0(r4, r6)
            e23.q<T extends R, T extends R, t13.d<? super R>, java.lang.Object> r8 = r7.f196545b
            r0.f196700a = r7
            r0.f196701b = r11
            r0.f196702c = r5
            r0.f196703d = r6
            r0.f196704e = r4
            r0.f196705f = r2
            r0.f196708i = r3
            java.lang.Object r12 = r8.invoke(r12, r6, r0)
            if (r12 != r1) goto L72
            return r1
        L72:
            r9 = r4
            r4 = r2
            r2 = r9
        L75:
            if (r12 == 0) goto L7a
            r5.add(r12)
        L7a:
            if (r6 == 0) goto L7f
            r5.add(r6)
        L7f:
            if (r2 == r4) goto L86
            int r12 = r2 + 1
            r2 = r4
            r4 = r12
            goto L4d
        L86:
            r12 = r5
        L87:
            yc.m1$d r0 = new yc.m1$d
            yc.b1 r1 = r11.f196201b
            yc.b1 r11 = r11.f196202c
            r0.<init>(r12, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.v3.c(yc.m1$d, v13.c):java.lang.Object");
    }
}
