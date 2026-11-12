package s1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {600}, m = "invokeSuspend", v = 1)
public final class b1 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f155502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1<Object> f155503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1<Object> f155504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f155505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0<Float> f155506e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2174, 613, 615, 669, 671}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.b f155507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a1 f155508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f155509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a1<Object> f155510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f155511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ t1<Object> f155512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ f0<Float> f155513g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1<Object> a1Var, Object obj, t1<Object> t1Var, f0<Float> f0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f155510d = a1Var;
            this.f155511e = obj;
            this.f155512f = t1Var;
            this.f155513g = f0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f155510d, this.f155511e, this.f155512f, this.f155513g, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c9 A[PHI: r16
          0x00c9: PHI (r16v6 long) = (r16v4 long), (r16v5 long), (r16v10 long) binds: [B:26:0x0090, B:40:0x00c5, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:56:0x0102  */
        /* JADX WARN: Code duplicated, block: B:57:0x0107  */
        /* JADX WARN: Code duplicated, block: B:59:0x010b  */
        /* JADX WARN: Code duplicated, block: B:61:0x011c  */
        /* JADX WARN: Code duplicated, block: B:63:0x012b  */
        /* JADX WARN: Code duplicated, block: B:65:0x012f  */
        /* JADX WARN: Code duplicated, block: B:75:0x0157  */
        /* JADX WARN: Code duplicated, block: B:77:0x0160  */
        /* JADX WARN: Code duplicated, block: B:80:0x0183  */
        /* JADX WARN: Code duplicated, block: B:81:0x018f  */
        /* JADX WARN: Code duplicated, block: B:86:0x01af A[PHI: r24
          0x01af: PHI (r24v5 float) = (r24v1 float), (r24v7 float) binds: [B:84:0x01ac, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x01b9, code lost:
        
            if (s1.a1.h(r14, r25) == r0) goto L88;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j8;
            z53.b bVar;
            a1<Object> a1Var;
            Object objJ;
            p3.c2 c2Var;
            p3.z1 z1Var;
            float f14;
            a1.b bVar2;
            f0<Float> f0Var;
            l2 l2VarA;
            l2 l2Var;
            n nVar;
            n nVar2;
            long j14;
            long jD;
            n nVar3;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155509c;
            Object obj2 = this.f155511e;
            a1<Object> a1Var2 = this.f155510d;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    Object f182175a = a1Var2.f155462b.getF182175a();
                    if (p005kotlin.jvm.internal.s.g(obj2, f182175a)) {
                        j8 = Long.MIN_VALUE;
                    } else {
                        a1.f(a1Var2);
                        a1Var2.p(0.0f);
                        j8 = Long.MIN_VALUE;
                        t1<Object> t1Var = this.f155512f;
                        t1Var.r(obj2);
                        t1Var.p(0L);
                        a1Var2.c(f182175a);
                        a1Var2.f155462b.setValue(obj2);
                    }
                    z53.b bVar3 = a1Var2.f155470j;
                    this.f155507a = bVar3;
                    this.f155508b = a1Var2;
                    this.f155509c = 1;
                    if (bVar3.c(this) != aVar) {
                        bVar = bVar3;
                        a1Var = a1Var2;
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    a1Var = this.f155508b;
                    bVar = this.f155507a;
                    o13.r.b(obj);
                    j8 = Long.MIN_VALUE;
                } else {
                    if (i14 == 2) {
                        o13.r.b(obj);
                        j8 = Long.MIN_VALUE;
                        this.f155509c = 3;
                        if (a1.i(a1Var2, this) != aVar) {
                            c2Var = a1Var2.f155463c;
                            z1Var = a1Var2.f155468h;
                            if (!p005kotlin.jvm.internal.s.g(c2Var.getF182175a(), obj2)) {
                                if (z1Var.getFloatValue() < 1.0f) {
                                    bVar2 = a1Var2.f155474n;
                                    f0Var = this.f155513g;
                                    if (f0Var != null) {
                                        p005kotlin.jvm.internal.m mVar = p005kotlin.jvm.internal.m.f105803a;
                                        l2VarA = f0Var.a((c2<Float, V>) e2.f155568a);
                                    } else {
                                        l2VarA = null;
                                    }
                                    if (bVar2 == null) {
                                    }
                                    if (bVar2 != null) {
                                        l2Var = bVar2.f155479b;
                                    } else {
                                        l2Var = null;
                                    }
                                    if (l2Var != null) {
                                        long j15 = bVar2.f155478a;
                                        n nVar4 = bVar2.f155482e;
                                        a1.f155458r.getClass();
                                        n nVar5 = a1.f155461u;
                                        f14 = 0.0f;
                                        nVar3 = bVar2.f155483f;
                                        if (nVar3 == null) {
                                            nVar3 = a1.f155460t;
                                        }
                                        nVar = (n) l2Var.d(j15, nVar4, nVar5, nVar3);
                                    } else {
                                        f14 = 0.0f;
                                        if (bVar2 != null) {
                                            a1.f155458r.getClass();
                                            nVar = a1.f155460t;
                                        } else {
                                            a1.f155458r.getClass();
                                            nVar = a1.f155460t;
                                        }
                                    }
                                    if (bVar2 == null) {
                                        bVar2 = new a1.b();
                                    }
                                    nVar2 = bVar2.f155482e;
                                    bVar2.f155479b = l2VarA;
                                    bVar2.f155480c = false;
                                    bVar2.f155481d = z1Var.getFloatValue();
                                    nVar2.e(z1Var.getFloatValue(), 0);
                                    j14 = a1Var2.f155466f;
                                    bVar2.f155484g = j14;
                                    bVar2.f155478a = 0L;
                                    bVar2.f155483f = nVar;
                                    if (l2VarA != null) {
                                        a1.f155458r.getClass();
                                        jD = l2VarA.c(nVar2, a1.f155461u, nVar);
                                    } else {
                                        jD = MathKt.d((1.0d - ((double) z1Var.getFloatValue())) * j14);
                                    }
                                    bVar2.f155485h = jD;
                                    a1Var2.f155474n = bVar2;
                                } else {
                                    f14 = 0.0f;
                                }
                                this.f155507a = null;
                                this.f155508b = null;
                                this.f155509c = 4;
                                if (a1.g(a1Var2, this) != aVar) {
                                    a1Var2.c(obj2);
                                    this.f155509c = 5;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        return aVar;
                    }
                    if (i14 == 3) {
                        o13.r.b(obj);
                        j8 = Long.MIN_VALUE;
                        c2Var = a1Var2.f155463c;
                        z1Var = a1Var2.f155468h;
                        if (!p005kotlin.jvm.internal.s.g(c2Var.getF182175a(), obj2)) {
                            if (z1Var.getFloatValue() < 1.0f) {
                                bVar2 = a1Var2.f155474n;
                                f0Var = this.f155513g;
                                if (f0Var != null) {
                                    p005kotlin.jvm.internal.m mVar2 = p005kotlin.jvm.internal.m.f105803a;
                                    l2VarA = f0Var.a((c2<Float, V>) e2.f155568a);
                                } else {
                                    l2VarA = null;
                                }
                                if (bVar2 == null && p005kotlin.jvm.internal.s.g(l2VarA, bVar2.f155479b)) {
                                    f14 = 0.0f;
                                } else {
                                    if (bVar2 != null) {
                                        l2Var = bVar2.f155479b;
                                    } else {
                                        l2Var = null;
                                    }
                                    if (l2Var != null) {
                                        long j16 = bVar2.f155478a;
                                        n nVar6 = bVar2.f155482e;
                                        a1.f155458r.getClass();
                                        n nVar7 = a1.f155461u;
                                        f14 = 0.0f;
                                        nVar3 = bVar2.f155483f;
                                        if (nVar3 == null) {
                                            nVar3 = a1.f155460t;
                                        }
                                        nVar = (n) l2Var.d(j16, nVar6, nVar7, nVar3);
                                    } else {
                                        f14 = 0.0f;
                                        if (bVar2 != null || bVar2.f155478a == 0) {
                                            a1.f155458r.getClass();
                                            nVar = a1.f155460t;
                                        } else {
                                            long j17 = bVar2.f155484g;
                                            if (j17 == j8) {
                                                j17 = a1Var2.f155466f;
                                            }
                                            float f15 = j17 / 1.0E9f;
                                            if (f15 <= 0.0f) {
                                                a1.f155458r.getClass();
                                                nVar = a1.f155460t;
                                            } else {
                                                nVar = new n(1.0f / f15);
                                            }
                                        }
                                    }
                                    if (bVar2 == null) {
                                        bVar2 = new a1.b();
                                    }
                                    nVar2 = bVar2.f155482e;
                                    bVar2.f155479b = l2VarA;
                                    bVar2.f155480c = false;
                                    bVar2.f155481d = z1Var.getFloatValue();
                                    nVar2.e(z1Var.getFloatValue(), 0);
                                    j14 = a1Var2.f155466f;
                                    bVar2.f155484g = j14;
                                    bVar2.f155478a = 0L;
                                    bVar2.f155483f = nVar;
                                    if (l2VarA != null) {
                                        a1.f155458r.getClass();
                                        jD = l2VarA.c(nVar2, a1.f155461u, nVar);
                                    } else {
                                        jD = MathKt.d((1.0d - ((double) z1Var.getFloatValue())) * j14);
                                    }
                                    bVar2.f155485h = jD;
                                    a1Var2.f155474n = bVar2;
                                }
                            } else {
                                f14 = 0.0f;
                            }
                            this.f155507a = null;
                            this.f155508b = null;
                            this.f155509c = 4;
                            if (a1.g(a1Var2, this) != aVar) {
                                a1Var2.c(obj2);
                                this.f155509c = 5;
                            }
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i14 == 4) {
                        o13.r.b(obj);
                        f14 = 0.0f;
                        a1Var2.c(obj2);
                        this.f155509c = 5;
                    } else {
                        if (i14 != 5) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                        f14 = 0.0f;
                    }
                }
                a1.a aVar2 = a1.f155458r;
                a1Var2.p(f14);
                return Unit.INSTANCE;
                Object obj3 = a1Var.f155464d;
                bVar.e(null);
                if (p005kotlin.jvm.internal.s.g(obj2, obj3)) {
                    c2Var = a1Var2.f155463c;
                    z1Var = a1Var2.f155468h;
                    if (!p005kotlin.jvm.internal.s.g(c2Var.getF182175a(), obj2)) {
                        if (z1Var.getFloatValue() < 1.0f) {
                            bVar2 = a1Var2.f155474n;
                            f0Var = this.f155513g;
                            if (f0Var != null) {
                                p005kotlin.jvm.internal.m mVar3 = p005kotlin.jvm.internal.m.f105803a;
                                l2VarA = f0Var.a((c2<Float, V>) e2.f155568a);
                            } else {
                                l2VarA = null;
                            }
                            if (bVar2 == null) {
                            }
                            if (bVar2 != null) {
                                l2Var = bVar2.f155479b;
                            } else {
                                l2Var = null;
                            }
                            if (l2Var != null) {
                                long j18 = bVar2.f155478a;
                                n nVar8 = bVar2.f155482e;
                                a1.f155458r.getClass();
                                n nVar9 = a1.f155461u;
                                f14 = 0.0f;
                                nVar3 = bVar2.f155483f;
                                if (nVar3 == null) {
                                    nVar3 = a1.f155460t;
                                }
                                nVar = (n) l2Var.d(j18, nVar8, nVar9, nVar3);
                            } else {
                                f14 = 0.0f;
                                if (bVar2 != null) {
                                    a1.f155458r.getClass();
                                    nVar = a1.f155460t;
                                } else {
                                    a1.f155458r.getClass();
                                    nVar = a1.f155460t;
                                }
                            }
                            if (bVar2 == null) {
                                bVar2 = new a1.b();
                            }
                            nVar2 = bVar2.f155482e;
                            bVar2.f155479b = l2VarA;
                            bVar2.f155480c = false;
                            bVar2.f155481d = z1Var.getFloatValue();
                            nVar2.e(z1Var.getFloatValue(), 0);
                            j14 = a1Var2.f155466f;
                            bVar2.f155484g = j14;
                            bVar2.f155478a = 0L;
                            bVar2.f155483f = nVar;
                            if (l2VarA != null) {
                                a1.f155458r.getClass();
                                jD = l2VarA.c(nVar2, a1.f155461u, nVar);
                            } else {
                                jD = MathKt.d((1.0d - ((double) z1Var.getFloatValue())) * j14);
                            }
                            bVar2.f155485h = jD;
                            a1Var2.f155474n = bVar2;
                        } else {
                            f14 = 0.0f;
                        }
                        this.f155507a = null;
                        this.f155508b = null;
                        this.f155509c = 4;
                        if (a1.g(a1Var2, this) != aVar) {
                            a1Var2.c(obj2);
                            this.f155509c = 5;
                        }
                    }
                    return Unit.INSTANCE;
                }
                this.f155507a = null;
                this.f155508b = null;
                this.f155509c = 2;
                if (a1Var2.f155472l == j8) {
                    objJ = p3.g1.a(getF157466b()).v(a1Var2.f155475o, this);
                    if (objJ != aVar) {
                        objJ = Unit.INSTANCE;
                    }
                } else {
                    objJ = a1Var2.j(this);
                    if (objJ != aVar) {
                        objJ = Unit.INSTANCE;
                    }
                }
                if (objJ != aVar) {
                    this.f155509c = 3;
                    if (a1.i(a1Var2, this) != aVar) {
                        c2Var = a1Var2.f155463c;
                        z1Var = a1Var2.f155468h;
                        if (!p005kotlin.jvm.internal.s.g(c2Var.getF182175a(), obj2)) {
                            if (z1Var.getFloatValue() < 1.0f) {
                                bVar2 = a1Var2.f155474n;
                                f0Var = this.f155513g;
                                if (f0Var != null) {
                                    p005kotlin.jvm.internal.m mVar4 = p005kotlin.jvm.internal.m.f105803a;
                                    l2VarA = f0Var.a((c2<Float, V>) e2.f155568a);
                                } else {
                                    l2VarA = null;
                                }
                                if (bVar2 == null) {
                                }
                                if (bVar2 != null) {
                                    l2Var = bVar2.f155479b;
                                } else {
                                    l2Var = null;
                                }
                                if (l2Var != null) {
                                    long j19 = bVar2.f155478a;
                                    n nVar10 = bVar2.f155482e;
                                    a1.f155458r.getClass();
                                    n nVar11 = a1.f155461u;
                                    f14 = 0.0f;
                                    nVar3 = bVar2.f155483f;
                                    if (nVar3 == null) {
                                        nVar3 = a1.f155460t;
                                    }
                                    nVar = (n) l2Var.d(j19, nVar10, nVar11, nVar3);
                                } else {
                                    f14 = 0.0f;
                                    if (bVar2 != null) {
                                        a1.f155458r.getClass();
                                        nVar = a1.f155460t;
                                    } else {
                                        a1.f155458r.getClass();
                                        nVar = a1.f155460t;
                                    }
                                }
                                if (bVar2 == null) {
                                    bVar2 = new a1.b();
                                }
                                nVar2 = bVar2.f155482e;
                                bVar2.f155479b = l2VarA;
                                bVar2.f155480c = false;
                                bVar2.f155481d = z1Var.getFloatValue();
                                nVar2.e(z1Var.getFloatValue(), 0);
                                j14 = a1Var2.f155466f;
                                bVar2.f155484g = j14;
                                bVar2.f155478a = 0L;
                                bVar2.f155483f = nVar;
                                if (l2VarA != null) {
                                    a1.f155458r.getClass();
                                    jD = l2VarA.c(nVar2, a1.f155461u, nVar);
                                } else {
                                    jD = MathKt.d((1.0d - ((double) z1Var.getFloatValue())) * j14);
                                }
                                bVar2.f155485h = jD;
                                a1Var2.f155474n = bVar2;
                            } else {
                                f14 = 0.0f;
                            }
                            this.f155507a = null;
                            this.f155508b = null;
                            this.f155509c = 4;
                            if (a1.g(a1Var2, this) != aVar) {
                                a1Var2.c(obj2);
                                this.f155509c = 5;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            } catch (Throwable th3) {
                bVar.e(null);
                throw th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(t1<Object> t1Var, a1<Object> a1Var, Object obj, f0<Float> f0Var, t13.d<? super b1> dVar) {
        super(1, dVar);
        this.f155503b = t1Var;
        this.f155504c = a1Var;
        this.f155505d = obj;
        this.f155506e = f0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b1(this.f155503b, this.f155504c, this.f155505d, this.f155506e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((b1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155502a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f155504c, this.f155505d, this.f155503b, this.f155506e, null);
            this.f155502a = 1;
            if (o53.c0.e(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f155503b.k();
        return Unit.INSTANCE;
    }
}
