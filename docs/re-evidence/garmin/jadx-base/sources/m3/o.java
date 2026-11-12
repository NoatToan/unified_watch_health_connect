package m3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import j23.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm3/o;", "Lh5/m;", "La5/a;", "", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "enabled", "Lm3/r;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lg6/f;", "threshold", "<init>", "(ZLe23/a;ZLm3/r;FLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends h5.m implements a5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f116277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.a<Unit> f116278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f116279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f116280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f116281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a5.g f116282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z1 f116283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z1 f116284j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", f = "PullToRefresh.kt", l = {260}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116285a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f116285a;
            if (i14 == 0) {
                o13.r.b(obj);
                o oVar = o.this;
                r rVar = oVar.f116280f;
                float f14 = oVar.f116277c ? 1.0f : 0.0f;
                this.f116285a = 1;
                if (rVar.c(f14, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1", f = "PullToRefresh.kt", l = {288}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116287a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f116287a;
            if (i14 == 0) {
                o13.r.b(obj);
                o oVar = o.this;
                if (!oVar.f116280f.e()) {
                    r rVar = oVar.f116280f;
                    float floatValue = oVar.f116283i.getFloatValue() / oVar.a2();
                    this.f116287a = 1;
                    if (rVar.c(floatValue, this) == aVar) {
                        return aVar;
                    }
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

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {298}, m = "onPreFling-QWom1Mo")
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f116289a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116291c;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f116289a = obj;
            this.f116291c |= Integer.MIN_VALUE;
            return o.this.mo3onPreFlingQWom1Mo(0L, this);
        }
    }

    private o(boolean z14, e23.a<Unit> aVar, boolean z15, r rVar, float f14) {
        this.f116277c = z14;
        this.f116278d = aVar;
        this.f116279e = z15;
        this.f116280f = rVar;
        this.f116281g = f14;
        this.f116282h = new a5.g(this, null);
        this.f116283i = new z1(0.0f);
        this.f116284j = new z1(0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object X1(o oVar, v13.c cVar) {
        n nVar;
        oVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f116276c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f116276c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(oVar, cVar);
            }
        } else {
            nVar = new n(oVar, cVar);
        }
        Object obj = nVar.f116274a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f116276c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                r rVar = oVar.f116280f;
                nVar.f116276c = 1;
                if (rVar.d(nVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (oVar.getIsAttached()) {
                oVar.c2(oVar.a2());
                oVar.d2(oVar.a2());
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            if (oVar.getIsAttached()) {
                oVar.c2(oVar.a2());
                oVar.d2(oVar.a2());
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y1(v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f116273c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f116273c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.f116271a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f116273c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                r rVar = this.f116280f;
                mVar.f116273c = 1;
                if (rVar.a(mVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            c2(0.0f);
            d2(0.0f);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            c2(0.0f);
            d2(0.0f);
            throw th3;
        }
    }

    public final long Z1(long j8) {
        float floatValue;
        float fA2;
        if (this.f116277c) {
            floatValue = 0.0f;
        } else {
            z1 z1Var = this.f116284j;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 & 4294967295L)) + z1Var.getFloatValue();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            floatValue = fIntBitsToFloat - z1Var.getFloatValue();
            c2(fIntBitsToFloat);
            if (z1Var.getFloatValue() * 0.5f <= a2()) {
                fA2 = z1Var.getFloatValue() * 0.5f;
            } else {
                float fD = t.d(Math.abs((z1Var.getFloatValue() * 0.5f) / a2()) - 1.0f, 0.0f, 2.0f);
                fA2 = a2() + (a2() * (fD - (((float) Math.pow(fD, 2)) / 4)));
            }
            d2(fA2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(floatValue)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public final int a2() {
        return h5.k.g(this).A.f0(this.f116281g);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b2(float f14, v13.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f116295d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f116295d = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f116293b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f116295d;
        if (i15 == 0) {
            o13.r.b(obj);
            if (this.f116277c) {
                return new Float(0.0f);
            }
            z1 z1Var = this.f116284j;
            if (z1Var.getFloatValue() * 0.5f > a2()) {
                this.f116278d.invoke();
            }
            if (z1Var.getFloatValue() == 0.0f || f14 < 0.0f) {
                f14 = 0.0f;
            }
            pVar.f116292a = f14;
            pVar.f116295d = 1;
            if (Y1(pVar) == obj2) {
                return obj2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f14 = pVar.f116292a;
            o13.r.b(obj);
        }
        c2(0.0f);
        return new Float(f14);
    }

    public final void c2(float f14) {
        this.f116284j.i(f14);
    }

    public final void d2(float f14) {
        this.f116283i.i(f14);
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h4.r.c
    public final void onAttach() {
        U1(this.f116282h);
        ge1.b.T(getCoroutineScope(), null, null, new a(null), 3);
        d2(this.f116277c ? a2() : 0.0f);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo2onPostScrollDzOQY0M(long j8, long j14, int i14) {
        if (this.f116280f.e()) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        if (!this.f116279e) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        a5.j.f1233b.getClass();
        if (i14 != a5.j.f1234c) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        long jZ1 = Z1(j14);
        ge1.b.T(getCoroutineScope(), null, null, new b(null), 3);
        return jZ1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a5.a
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo3onPreFlingQWom1Mo(long j8, t13.d<? super g6.s> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f116291c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f116291c = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objB2 = cVar.f116289a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f116291c;
        if (i15 == 0) {
            o13.r.b(objB2);
            float fD = g6.s.d(j8);
            cVar.f116291c = 1;
            objB2 = b2(fD, cVar);
            if (objB2 == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB2);
        }
        return g6.s.a(xy2.b.h(0.0f, ((Number) objB2).floatValue()));
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo4onPreScrollOzD1aCk(long j8, int i14) {
        if (this.f116280f.e()) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        if (!this.f116279e) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        a5.j.f1233b.getClass();
        if (i14 == a5.j.f1234c && Float.intBitsToFloat((int) (4294967295L & j8)) < 0.0f) {
            return Z1(j8);
        }
        n4.c.f123541b.getClass();
        return 0L;
    }

    public /* synthetic */ o(boolean z14, e23.a aVar, boolean z15, r rVar, float f14, p005kotlin.jvm.internal.j jVar) {
        this(z14, aVar, z15, rVar, f14);
    }
}
