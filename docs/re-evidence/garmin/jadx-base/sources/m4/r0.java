package m4;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116519a;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f116519a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/g$a;", "", "invoke", "(Lf5/g$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<f5.g.a, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j0 f116520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f116521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n4.d f116522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f116523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<j0, Boolean> f116524e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(j0 j0Var, j0 j0Var2, n4.d dVar, int i14, e23.l<? super j0, Boolean> lVar) {
            super(1);
            this.f116520a = j0Var;
            this.f116521b = j0Var2;
            this.f116522c = dVar;
            this.f116523d = i14;
            this.f116524e = lVar;
        }

        @Override // e23.l
        public final Boolean invoke(f5.g.a aVar) {
            f5.g.a aVar2 = aVar;
            j0 j0Var = this.f116521b;
            if (this.f116520a != h5.k.h(j0Var).getFocusOwner().f()) {
                return Boolean.TRUE;
            }
            boolean zJ = r0.j(j0Var, this.f116522c, this.f116523d, this.f116524e);
            Boolean boolValueOf = Boolean.valueOf(zJ);
            if (zJ || !aVar2.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r11 >= r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r10 <= r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r9 >= r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r8 <= r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r20 != r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0.getClass();
        r15 = m4.g.f116470f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (r20 != r15) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r20 != r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r11 - r18.f123549c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r20 != r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = r18.f123547a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if (r20 != m4.g.f116471g) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        r1 = r9 - r18.f123550d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        if (r20 != m4.g.f116472h) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        r1 = r18.f123548b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        if (r1 >= 0.0f) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008a, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008b, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r20 != r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0092, code lost:
    
        if (r20 != r15) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0094, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0099, code lost:
    
        if (r20 != m4.g.f116471g) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009b, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a0, code lost:
    
        if (r20 != m4.g.f116472h) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a2, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a8, code lost:
    
        if (r11 >= 1.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00aa, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ad, code lost:
    
        if (r1 >= r11) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00af, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b1, code lost:
    
        vb.h.z("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        vb.h.z("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ba, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(n4.d dVar, n4.d dVar2, n4.d dVar3, int i14) {
        boolean zB = b(i14, dVar3, dVar);
        float f14 = dVar3.f123548b;
        float f15 = dVar3.f123550d;
        float f16 = dVar3.f123547a;
        float f17 = dVar3.f123549c;
        float f18 = dVar.f123550d;
        float f19 = dVar.f123548b;
        float f22 = dVar.f123549c;
        float f24 = dVar.f123547a;
        if (zB || !b(i14, dVar2, dVar)) {
            return false;
        }
        g.a aVar = g.f116466b;
        aVar.getClass();
        int i15 = g.f116469e;
        if (i14 != i15) {
            if (i14 != g.f116470f) {
                if (i14 != g.f116471g) {
                    if (i14 != g.f116472h) {
                        vb.h.z("This function should only be used for 2-D focus search");
                        return false;
                    }
                }
            }
        }
    }

    public static final boolean b(int i14, n4.d dVar, n4.d dVar2) {
        g.a aVar = g.f116466b;
        aVar.getClass();
        if (i14 != g.f116469e) {
            aVar.getClass();
            if (i14 != g.f116470f) {
                aVar.getClass();
                if (i14 != g.f116471g) {
                    aVar.getClass();
                    if (i14 != g.f116472h) {
                        vb.h.z("This function should only be used for 2-D focus search");
                        return false;
                    }
                }
                return dVar.f123549c > dVar2.f123547a && dVar.f123547a < dVar2.f123549c;
            }
        }
        return dVar.f123550d > dVar2.f123548b && dVar.f123548b < dVar2.f123550d;
    }

    public static final void c(j0 j0Var, q3.c cVar) {
        if (!j0Var.getNode().getIsAttached()) {
            e5.a.b("visitChildren called on an unattached node");
        }
        q3.c cVar2 = new q3.c(new h4.r.c[16], 0);
        h4.r.c child = j0Var.getNode().getChild();
        if (child == null) {
            h5.k.a(cVar2, j0Var.getNode());
        } else {
            cVar2.b(child);
        }
        while (true) {
            int i14 = cVar2.f142358c;
            if (i14 == 0) {
                return;
            }
            h4.r.c cVarB = (h4.r.c) cVar2.k(i14 - 1);
            if ((cVarB.getAggregateChildKindSet() & 1024) == 0) {
                h5.k.a(cVar2, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.getKindSet() & 1024) != 0) {
                        q3.c cVar3 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof j0) {
                                j0 j0Var2 = (j0) cVarB;
                                if (j0Var2.getIsAttached() && !h5.k.g(j0Var2).M0) {
                                    if (j0Var2.W1().f116546b) {
                                        cVar.b(j0Var2);
                                    } else {
                                        c(j0Var2, cVar);
                                    }
                                }
                            } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                int i15 = 0;
                                for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                    if ((child2.getKindSet() & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            cVarB = child2;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new q3.c(new h4.r.c[16], 0);
                                            }
                                            if (cVarB != null) {
                                                cVar3.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar3.b(child2);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            cVarB = h5.k.b(cVar3);
                        }
                        break;
                    }
                    cVarB = cVarB.getChild();
                }
            }
        }
    }

    public static final j0 d(q3.c<j0> cVar, n4.d dVar, int i14) {
        n4.d dVarN;
        g.f116466b.getClass();
        if (i14 == g.f116469e) {
            dVarN = dVar.n((dVar.f123549c - dVar.f123547a) + 1, 0.0f);
        } else if (i14 == g.f116470f) {
            dVarN = dVar.n(-((dVar.f123549c - dVar.f123547a) + 1), 0.0f);
        } else if (i14 == g.f116471g) {
            dVarN = dVar.n(0.0f, (dVar.f123550d - dVar.f123548b) + 1);
        } else {
            if (i14 != g.f116472h) {
                vb.h.z("This function should only be used for 2-D focus search");
                return null;
            }
            dVarN = dVar.n(0.0f, -((dVar.f123550d - dVar.f123548b) + 1));
        }
        j0[] j0VarArr = cVar.f142356a;
        int i15 = cVar.f142358c;
        j0 j0Var = null;
        for (int i16 = 0; i16 < i15; i16++) {
            j0 j0Var2 = j0VarArr[i16];
            if (m0.d(j0Var2)) {
                n4.d dVarB = m0.b(j0Var2);
                if (g(dVarB, dVarN, dVar, i14)) {
                    j0Var = j0Var2;
                    dVarN = dVarB;
                }
            }
        }
        return j0Var;
    }

    public static final boolean e(j0 j0Var, int i14, e23.l<? super j0, Boolean> lVar) {
        n4.d dVar;
        q3.c cVar = new q3.c(new j0[16], 0);
        c(j0Var, cVar);
        int i15 = cVar.f142358c;
        if (i15 <= 1) {
            j0 j0Var2 = (j0) (i15 == 0 ? null : cVar.f142356a[0]);
            if (j0Var2 != null) {
                return lVar.invoke(j0Var2).booleanValue();
            }
        } else {
            g.f116466b.getClass();
            if (i14 == g.f116473i) {
                i14 = g.f116470f;
            }
            if (i14 == g.f116470f || i14 == g.f116472h) {
                n4.d dVarB = m0.b(j0Var);
                float f14 = dVarB.f123547a;
                float f15 = dVarB.f123548b;
                dVar = new n4.d(f14, f15, f14, f15);
            } else {
                if (i14 != g.f116469e && i14 != g.f116471g) {
                    vb.h.z("This function should only be used for 2-D focus search");
                    return false;
                }
                n4.d dVarB2 = m0.b(j0Var);
                float f16 = dVarB2.f123549c;
                float f17 = dVarB2.f123550d;
                dVar = new n4.d(f16, f17, f16, f17);
            }
            j0 j0VarD = d(cVar, dVar, i14);
            if (j0VarD != null) {
                return lVar.invoke(j0VarD).booleanValue();
            }
        }
        return false;
    }

    public static final boolean f(j0 j0Var, n4.d dVar, int i14, e23.l<? super j0, Boolean> lVar) {
        if (j(j0Var, dVar, i14, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) m4.a.a(j0Var, i14, new b(h5.k.h(j0Var).getFocusOwner().f(), j0Var, dVar, i14, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean g(n4.d dVar, n4.d dVar2, n4.d dVar3, int i14) {
        if (!h(i14, dVar, dVar3)) {
            return false;
        }
        if (h(i14, dVar2, dVar3) && !a(dVar3, dVar, dVar2, i14)) {
            return !a(dVar3, dVar2, dVar, i14) && i(i14, dVar3, dVar) < i(i14, dVar3, dVar2);
        }
        return true;
    }

    public static final boolean h(int i14, n4.d dVar, n4.d dVar2) {
        g.a aVar = g.f116466b;
        aVar.getClass();
        if (i14 == g.f116469e) {
            float f14 = dVar2.f123549c;
            float f15 = dVar2.f123547a;
            float f16 = dVar.f123549c;
            return (f14 > f16 || f15 >= f16) && f15 > dVar.f123547a;
        }
        aVar.getClass();
        if (i14 == g.f116470f) {
            float f17 = dVar2.f123547a;
            float f18 = dVar2.f123549c;
            float f19 = dVar.f123547a;
            return (f17 < f19 || f18 <= f19) && f18 < dVar.f123549c;
        }
        aVar.getClass();
        if (i14 == g.f116471g) {
            float f22 = dVar2.f123550d;
            float f24 = dVar2.f123548b;
            float f25 = dVar.f123550d;
            return (f22 > f25 || f24 >= f25) && f24 > dVar.f123548b;
        }
        aVar.getClass();
        if (i14 != g.f116472h) {
            vb.h.z("This function should only be used for 2-D focus search");
            return false;
        }
        float f26 = dVar2.f123548b;
        float f27 = dVar2.f123550d;
        float f28 = dVar.f123548b;
        return (f26 < f28 || f27 <= f28) && f27 < dVar.f123550d;
    }

    public static final long i(int i14, n4.d dVar, n4.d dVar2) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        g.a aVar = g.f116466b;
        aVar.getClass();
        int i15 = g.f116469e;
        if (i14 == i15) {
            f14 = dVar.f123547a;
            f15 = dVar2.f123549c;
        } else if (i14 == g.f116470f) {
            f14 = dVar2.f123547a;
            f15 = dVar.f123549c;
        } else if (i14 == g.f116471g) {
            f14 = dVar.f123548b;
            f15 = dVar2.f123550d;
        } else {
            if (i14 != g.f116472h) {
                vb.h.z("This function should only be used for 2-D focus search");
                return 0L;
            }
            f14 = dVar2.f123548b;
            f15 = dVar.f123550d;
        }
        float f22 = f14 - f15;
        if (f22 < 0.0f) {
            f22 = 0.0f;
        }
        long j8 = (long) f22;
        aVar.getClass();
        if (i14 == i15 || i14 == g.f116470f) {
            float f24 = dVar.f123548b;
            f16 = 2;
            f17 = ((dVar.f123550d - f24) / f16) + f24;
            f18 = dVar2.f123548b;
            f19 = dVar2.f123550d;
        } else {
            if (i14 != g.f116471g && i14 != g.f116472h) {
                vb.h.z("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f25 = dVar.f123547a;
            f16 = 2;
            f17 = ((dVar.f123549c - f25) / f16) + f25;
            f18 = dVar2.f123547a;
            f19 = dVar2.f123549c;
        }
        long j14 = (long) (f17 - (((f19 - f18) / f16) + f18));
        return (j14 * j14) + (((long) 13) * j8 * j8);
    }

    public static final boolean j(j0 j0Var, n4.d dVar, int i14, e23.l<? super j0, Boolean> lVar) {
        j0 j0VarD;
        q3.c cVar = new q3.c(new j0[16], 0);
        if (!j0Var.getNode().getIsAttached()) {
            e5.a.b("visitChildren called on an unattached node");
        }
        q3.c cVar2 = new q3.c(new h4.r.c[16], 0);
        h4.r.c child = j0Var.getNode().getChild();
        if (child == null) {
            h5.k.a(cVar2, j0Var.getNode());
        } else {
            cVar2.b(child);
        }
        while (true) {
            int i15 = cVar2.f142358c;
            if (i15 == 0) {
                break;
            }
            h4.r.c cVarB = (h4.r.c) cVar2.k(i15 - 1);
            if ((cVarB.getAggregateChildKindSet() & 1024) == 0) {
                h5.k.a(cVar2, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.getKindSet() & 1024) != 0) {
                        q3.c cVar3 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof j0) {
                                j0 j0Var2 = (j0) cVarB;
                                if (j0Var2.getIsAttached()) {
                                    cVar.b(j0Var2);
                                }
                            } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                int i16 = 0;
                                for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                    if ((child2.getKindSet() & 1024) != 0) {
                                        i16++;
                                        if (i16 == 1) {
                                            cVarB = child2;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new q3.c(new h4.r.c[16], 0);
                                            }
                                            if (cVarB != null) {
                                                cVar3.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar3.b(child2);
                                        }
                                    }
                                }
                                if (i16 == 1) {
                                }
                            }
                            cVarB = h5.k.b(cVar3);
                        }
                        break;
                    }
                    cVarB = cVarB.getChild();
                }
            }
        }
        while (cVar.f142358c != 0 && (j0VarD = d(cVar, dVar, i14)) != null) {
            if (j0VarD.W1().f116546b) {
                return lVar.invoke(j0VarD).booleanValue();
            }
            if (f(j0VarD, dVar, i14, lVar)) {
                return true;
            }
            cVar.j(j0VarD);
        }
        return false;
    }

    public static final Boolean k(j0 j0Var, int i14, n4.d dVar, v.b bVar) {
        h0 h0VarA0 = j0Var.a0();
        int[] iArr = a.f116519a;
        int i15 = iArr[h0VarA0.ordinal()];
        if (i15 != 1) {
            if (i15 == 2 || i15 == 3) {
                return Boolean.valueOf(e(j0Var, i14, bVar));
            }
            if (i15 != 4) {
                u0.r();
                return null;
            }
            if (j0Var.W1().f116546b) {
                return (Boolean) bVar.invoke(j0Var);
            }
            return dVar == null ? Boolean.valueOf(e(j0Var, i14, bVar)) : Boolean.valueOf(j(j0Var, dVar, i14, bVar));
        }
        j0 j0VarC = m0.c(j0Var);
        if (j0VarC == null) {
            vb.h.z("ActiveParent must have a focusedChild");
            return null;
        }
        int i16 = iArr[j0VarC.a0().ordinal()];
        if (i16 != 1) {
            if (i16 == 2 || i16 == 3) {
                if (dVar == null) {
                    dVar = m0.b(j0VarC);
                }
                return Boolean.valueOf(f(j0Var, dVar, i14, bVar));
            }
            if (i16 != 4) {
                u0.r();
                return null;
            }
            vb.h.z("ActiveParent must have a focusedChild");
            return null;
        }
        Boolean boolK = k(j0VarC, i14, dVar, bVar);
        if (!p005kotlin.jvm.internal.s.g(boolK, Boolean.FALSE)) {
            return boolK;
        }
        if (dVar == null) {
            if (j0VarC.a0() != h0.ActiveParent) {
                vb.h.z("Searching for active node in inactive hierarchy");
                return null;
            }
            j0 j0VarA = m0.a(j0VarC);
            if (j0VarA == null) {
                vb.h.z("ActiveParent must have a focusedChild");
                return null;
            }
            dVar = m0.b(j0VarA);
        }
        return Boolean.valueOf(f(j0Var, dVar, i14, bVar));
    }
}
