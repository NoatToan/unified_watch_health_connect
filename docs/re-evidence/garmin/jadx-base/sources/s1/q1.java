package s1;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate", v = 1)
    public static final class a<T, V extends r> extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m f155702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f155703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e23.l f155704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f155705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f155706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f155707f;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f155706e = obj;
            this.f155707f |= Integer.MIN_VALUE;
            return q1.b(null, null, 0L, null, this);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object a(float f14, float f15, float f16, k<Float> kVar, e23.p<? super Float, ? super Float, Unit> pVar, t13.d<? super Unit> dVar) {
        p005kotlin.jvm.internal.m mVar = p005kotlin.jvm.internal.m.f105803a;
        d2 d2Var = e2.f155568a;
        Object f17 = new Float(f14);
        Float f18 = new Float(f15);
        r rVarC = (r) d2Var.f155546a.invoke((T) new Float(f16));
        if (rVarC == null) {
            rVarC = ((r) d2Var.f155546a.invoke((T) f17)).c();
        }
        r rVar = rVarC;
        Object objB = b(new m(d2Var, f17, rVar, 0L, 0L, false, 56, null), new r1(kVar, (c2<Float, r>) d2Var, (Float) f17, f18, rVar), Long.MIN_VALUE, new rk0.g(11, pVar, d2Var), dVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objB != aVar) {
            objB = Unit.INSTANCE;
        }
        return objB == aVar ? objB : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    /* JADX WARN: Code duplicated, block: B:68:0x016f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r13v0, types: [T, s1.j] */
    public static final <T, V extends r> Object b(m<T, V> mVar, g<T, V> gVar, long j8, e23.l<? super j<T, V>, Unit> lVar, t13.d<? super Unit> dVar) {
        a aVar;
        p005kotlin.jvm.internal.r0 r0Var;
        m<T, V> mVar2;
        m<T, V> mVar3;
        p005kotlin.jvm.internal.r0 r0Var2;
        Object objV;
        e23.l<? super j<T, V>, Unit> lVar2;
        j jVar;
        j jVar2;
        Object objV2;
        g<T, V> gVar2 = gVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f155707f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f155707f = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f155706e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f155707f;
        if (i15 == 0) {
            o13.r.b(obj);
            T tE = gVar2.e(0L);
            r rVarF = gVar2.f(0L);
            r0Var = new p005kotlin.jvm.internal.r0();
            if (j8 == Long.MIN_VALUE) {
                try {
                    mVar2 = mVar;
                    try {
                        m92.v vVar = new m92.v(r0Var, tE, gVar2, rVarF, mVar2, h(aVar2.getF157466b()), lVar, 1);
                        r0Var2 = r0Var;
                        try {
                            aVar2.f155702a = mVar2;
                            aVar2.f155703b = gVar2;
                            aVar2.f155704c = lVar;
                            aVar2.f155705d = r0Var2;
                            aVar2.f155707f = 1;
                            if (gVar2.a()) {
                                objV = l0.a(vVar, aVar2);
                            } else {
                                objV = p3.g1.a(aVar2.getF157466b()).v(new qe2.c(vVar, 19), aVar2);
                            }
                            if (objV != aVar3) {
                                mVar3 = mVar2;
                                lVar2 = lVar;
                                r0Var = r0Var2;
                            }
                            return aVar3;
                        } catch (CancellationException e4) {
                            e = e4;
                            mVar3 = mVar2;
                            r0Var = r0Var2;
                            jVar = (j) r0Var.f105810a;
                            if (jVar != null) {
                                jVar.f155611i.setValue(Boolean.FALSE);
                            }
                            jVar2 = (j) r0Var.f105810a;
                            if (jVar2 != null) {
                                mVar3.f155632f = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e14) {
                        e = e14;
                        mVar3 = mVar2;
                        jVar = (j) r0Var.f105810a;
                        if (jVar != null) {
                            jVar.f155611i.setValue(Boolean.FALSE);
                        }
                        jVar2 = (j) r0Var.f105810a;
                        if (jVar2 != null) {
                            mVar3.f155632f = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e15) {
                    e = e15;
                    mVar2 = mVar;
                }
            } else {
                r0Var2 = r0Var;
                try {
                    ?? r14 = (T) new j(tE, gVar2.d(), rVarF, j8, gVar2.getTargetValue(), j8, true, new o1(0, mVar));
                    g(r14, j8, h(aVar2.getF157466b()), gVar2, mVar, lVar);
                    r0Var2.f105810a = r14;
                    mVar3 = mVar;
                    gVar2 = gVar;
                    lVar2 = lVar;
                    r0Var = r0Var2;
                } catch (CancellationException e16) {
                    e = e16;
                    mVar3 = mVar;
                    r0Var = r0Var2;
                    jVar = (j) r0Var.f105810a;
                    if (jVar != null) {
                        jVar.f155611i.setValue(Boolean.FALSE);
                    }
                    jVar2 = (j) r0Var.f105810a;
                    if (jVar2 != null) {
                        mVar3.f155632f = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i15 != 1 && i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = aVar2.f155705d;
            lVar2 = aVar2.f155704c;
            gVar2 = aVar2.f155703b;
            mVar3 = aVar2.f155702a;
            try {
                o13.r.b(obj);
            } catch (CancellationException e17) {
                e = e17;
                jVar = (j) r0Var.f105810a;
                if (jVar != null) {
                    jVar.f155611i.setValue(Boolean.FALSE);
                }
                jVar2 = (j) r0Var.f105810a;
                if (jVar2 != null) {
                    mVar3.f155632f = false;
                }
                throw e;
            }
        }
        do {
            T t7 = r0Var.f105810a;
            t7.getClass();
            if (!((Boolean) ((j) t7).f155611i.getF182175a()).booleanValue()) {
                return Unit.INSTANCE;
            }
            final float fH = h(aVar2.getF157466b());
            final p005kotlin.jvm.internal.r0 r0Var3 = r0Var;
            final e23.l<? super j<T, V>, Unit> lVar3 = lVar2;
            final g<T, V> gVar3 = gVar2;
            final m<T, V> mVar4 = mVar3;
            try {
                e23.l lVar4 = new e23.l() { // from class: s1.p1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        T t14 = r0Var3.f105810a;
                        t14.getClass();
                        q1.g((j) t14, jLongValue, fH, gVar3, mVar4, lVar3);
                        return Unit.INSTANCE;
                    }
                };
                r0Var = r0Var3;
                gVar2 = gVar3;
                mVar3 = mVar4;
                lVar2 = lVar3;
                aVar2.f155702a = mVar3;
                aVar2.f155703b = gVar2;
                aVar2.f155704c = lVar2;
                aVar2.f155705d = r0Var;
                aVar2.f155707f = 2;
                if (gVar2.a()) {
                    objV2 = l0.a(lVar4, aVar2);
                } else {
                    objV2 = p3.g1.a(aVar2.getF157466b()).v(new qe2.c(lVar4, 19), aVar2);
                }
            } catch (CancellationException e18) {
                e = e18;
                r0Var = r0Var3;
                mVar3 = mVar4;
                jVar = (j) r0Var.f105810a;
                if (jVar != null) {
                    jVar.f155611i.setValue(Boolean.FALSE);
                }
                jVar2 = (j) r0Var.f105810a;
                if (jVar2 != null && jVar2.f155609g == mVar3.f155630d) {
                    mVar3.f155632f = false;
                }
                throw e;
            }
        } while (objV2 != aVar3);
        return aVar3;
    }

    public static /* synthetic */ Object c(float f14, float f15, k kVar, e23.p pVar, t13.d dVar, int i14) {
        if ((i14 & 8) != 0) {
            kVar = l.c(7, 0.0f, 0.0f, null);
        }
        return a(f14, f15, 0.0f, kVar, pVar, dVar);
    }

    public static final Object d(m mVar, y yVar, boolean z14, e23.l lVar, v13.c cVar) {
        Object objB = b(mVar, new x(yVar, (c2) mVar.f155627a, (Object) mVar.f155628b.getF182175a(), (r) mVar.f155629c), z14 ? mVar.f155630d : Long.MIN_VALUE, lVar, cVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    public static final Object e(m mVar, Float f14, k kVar, boolean z14, e23.l lVar, v13.c cVar) {
        Object objB = b(mVar, new r1((k<Float>) kVar, (c2<Float, V>) mVar.f155627a, (Float) mVar.f155628b.getF182175a(), f14, (r) mVar.f155629c), z14 ? mVar.f155630d : Long.MIN_VALUE, lVar, cVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    public static /* synthetic */ Object f(m mVar, Float f14, k kVar, boolean z14, e23.l lVar, v13.c cVar, int i14) {
        if ((i14 & 2) != 0) {
            kVar = l.c(7, 0.0f, 0.0f, null);
        }
        k kVar2 = kVar;
        if ((i14 & 4) != 0) {
            z14 = false;
        }
        boolean z15 = z14;
        if ((i14 & 8) != 0) {
            lVar = new rw0.b(5);
        }
        return e(mVar, f14, kVar2, z15, lVar, cVar);
    }

    public static final <T, V extends r> void g(j<T, V> jVar, long j8, float f14, g<T, V> gVar, m<T, V> mVar, e23.l<? super j<T, V>, Unit> lVar) {
        long jB = f14 == 0.0f ? gVar.getF155847h() : (long) ((j8 - jVar.f155605c) / f14);
        jVar.f155609g = j8;
        jVar.f155607e.setValue(gVar.e(jB));
        jVar.f155608f = (V) gVar.f(jB);
        if (gVar.c(jB)) {
            jVar.f155610h = jVar.f155609g;
            jVar.f155611i.setValue(Boolean.FALSE);
        }
        i(jVar, mVar);
        lVar.invoke(jVar);
    }

    public static final float h(t13.g gVar) {
        h4.s sVar = (h4.s) gVar.get(h4.s.U);
        float fZ = sVar != null ? sVar.z() : 1.0f;
        if (!(fZ >= 0.0f)) {
            x0.b("negative scale factor");
        }
        return fZ;
    }

    public static final <T, V extends r> void i(j<T, V> jVar, m<T, V> mVar) {
        mVar.f155628b.setValue(jVar.f155607e.getF182175a());
        V v14 = mVar.f155629c;
        V v15 = jVar.f155608f;
        int f155643b = v14.getF155699e();
        for (int i14 = 0; i14 < f155643b; i14++) {
            v14.e(v15.a(i14), i14);
        }
        mVar.f155631e = jVar.f155610h;
        mVar.f155630d = jVar.f155609g;
        mVar.f155632f = ((Boolean) jVar.f155611i.getF182175a()).booleanValue();
    }
}
