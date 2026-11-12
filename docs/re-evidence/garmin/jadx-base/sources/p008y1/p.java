package p008y1;

import a2.j;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import g6.c;
import g6.o;
import g6.s;
import h5.k;
import i3.lc;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import s1.b2;
import s1.z;
import t13.d;
import u1.k1;
import u1.r1;
import v13.e;
import v13.i;
import vb.h;
import xd2.m0;
import xy2.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ly1/p;", "T", "Ly1/p0;", "Ly1/r;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "", "enabled", "reverseDirection", "La2/j;", "interactionSource", "Lu1/r1;", "overscrollEffect", "startDragImmediately", "Ly1/e1;", "flingBehavior", "<init>", "(Ly1/r;Ly1/b2;ZLjava/lang/Boolean;La2/j;Lu1/r1;Ljava/lang/Boolean;Ly1/e1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p<T> extends p0 {
    public r1 A;
    public Boolean B;
    public e1 C;
    public e1 D;
    public c E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r<T> f193507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b2 f193508y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Boolean f193509z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {436, 438}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements e23.p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<T> f193511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0.d f193512c;

        /* JADX INFO: renamed from: y1.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg6/s;", "availableVelocity", "<anonymous>", "(Lg6/s;)Lg6/s;"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", l = {440}, m = "invokeSuspend", v = 1)
        public static final class C3614a extends i implements e23.p<s, d<? super s>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193513a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ long f193514b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p<T> f193515c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3614a(p<T> pVar, d<? super C3614a> dVar) {
                super(2, dVar);
                this.f193515c = pVar;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C3614a c3614a = new C3614a(this.f193515c, dVar);
                c3614a.f193514b = ((s) obj).f76027a;
                return c3614a;
            }

            @Override // e23.p
            public final Object invoke(s sVar, d<? super s> dVar) {
                return ((C3614a) create(s.a(sVar.f76027a), dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                long jH;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193513a;
                p<T> pVar = this.f193515c;
                if (i14 == 0) {
                    r.b(obj);
                    long j8 = this.f193514b;
                    float fD = pVar.f193508y == b2.Vertical ? s.d(j8) : s.c(j8);
                    this.f193514b = j8;
                    this.f193513a = 1;
                    obj = p.p2(pVar, fD, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    jH = j8;
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jH = this.f193514b;
                    r.b(obj);
                }
                float fFloatValue = ((Number) obj).floatValue();
                float fE = pVar.f193507x.e();
                float fE2 = pVar.f193507x.b().e();
                if (fE >= pVar.f193507x.b().d() || fE <= fE2) {
                    b2 b2Var = pVar.f193508y;
                    float f14 = b2Var == b2.Horizontal ? fFloatValue : 0.0f;
                    if (b2Var != b2.Vertical) {
                        fFloatValue = 0.0f;
                    }
                    jH = b.h(f14, fFloatValue);
                }
                return s.a(jH);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p<T> pVar, e0.d dVar, d<? super a> dVar2) {
            super(2, dVar2);
            this.f193511b = pVar;
            this.f193512c = dVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f193511b, this.f193512c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        
            if (p008y1.p.p2(r10, r1, r9) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
        
            if (r5.c(r6, r1, r9) == r0) goto L33;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193510a;
            if (i14 == 0) {
                r.b(obj);
                long j8 = this.f193512c.f193177a;
                p<T> pVar = this.f193511b;
                long jG = s.g(pVar.r2() ? -1.0f : 1.0f, j8);
                b2 b2Var = pVar.f193508y;
                b2 b2Var2 = b2.Vertical;
                float fD = b2Var == b2Var2 ? s.d(jG) : s.c(jG);
                r1 r1Var = pVar.A;
                if (r1Var == null) {
                    this.f193510a = 1;
                } else {
                    b2 b2Var3 = pVar.f193508y;
                    float f14 = b2Var3 == b2.Horizontal ? fD : 0.0f;
                    if (b2Var3 != b2Var2) {
                        fD = 0.0f;
                    }
                    long jH = b.h(f14, fD);
                    C3614a c3614a = new C3614a(pVar, null);
                    this.f193510a = 2;
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                Unit unit = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    public p(r<T> rVar, b2 b2Var, boolean z14, Boolean bool, j jVar, r1 r1Var, Boolean bool2, e1 e1Var) {
        super(e.f193170a, z14, jVar, b2Var);
        this.f193507x = rVar;
        this.f193508y = b2Var;
        this.f193509z = bool;
        this.A = r1Var;
        this.B = bool2;
        this.C = e1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object p2(p pVar, float f14, v13.c cVar) {
        n nVar;
        o0 o0Var;
        pVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f193432d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f193432d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(pVar, cVar);
            }
        } else {
            nVar = new n(pVar, cVar);
        }
        Object obj = nVar.f193430b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f193432d;
        if (i15 == 0) {
            r.b(obj);
            if (pVar.f193507x.c()) {
                r<T> rVar = pVar.f193507x;
                nVar.f193432d = 1;
                if (!rVar.c()) {
                    b2.e.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
                }
                T f182175a = rVar.f193585g.getF182175a();
                w0<T> w0VarB = rVar.b();
                float fE = rVar.e();
                l<? super Float, Float> lVar = rVar.f193580b;
                if (lVar == null) {
                    p005kotlin.jvm.internal.s.m("positionalThreshold");
                    throw null;
                }
                lc lcVar = rVar.f193581c;
                if (lcVar == null) {
                    p005kotlin.jvm.internal.s.m("velocityThreshold");
                    throw null;
                }
                Object objB = e.b(w0VarB, fE, f14, lVar, lcVar);
                Object objF = rVar.f193579a.invoke(objB).booleanValue() ? e.f(rVar, objB, f14, nVar) : e.f(rVar, f182175a, f14, nVar);
                if (objF != aVar) {
                    return objF;
                }
            } else {
                o0 o0Var2 = new o0();
                o0Var2.f105806a = f14;
                r<T> rVar2 = pVar.f193507x;
                o oVar = new o(pVar, o0Var2, f14, null);
                nVar.f193429a = o0Var2;
                nVar.f193432d = 2;
                Object objB2 = rVar2.f193584f.b(k1.Default, new s(rVar2, oVar, null), nVar);
                if (objB2 != aVar) {
                    objB2 = Unit.INSTANCE;
                }
                if (objB2 != aVar) {
                    o0Var = o0Var2;
                }
            }
            return aVar;
        }
        if (i15 == 1) {
            r.b(obj);
            return obj;
        }
        if (i15 != 2) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o0Var = nVar.f193429a;
        r.b(obj);
        return new Float(o0Var.f105806a);
    }

    public static final long q2(p pVar, float f14) {
        b2 b2Var = pVar.f193508y;
        float f15 = b2Var == b2.Horizontal ? f14 : 0.0f;
        if (b2Var != b2.Vertical) {
            f14 = 0.0f;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    @Override // p008y1.p0
    public final Object b2(p0.b.Function1 function1, p0.b bVar) {
        r<T> rVar = this.f193507x;
        m mVar = new m(function1, this, null);
        int i14 = r.f193578o;
        Object objB = rVar.f193584f.b(k1.Default, new s(rVar, mVar, null), bVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objB != aVar) {
            objB = Unit.INSTANCE;
        }
        return objB == aVar ? objB : Unit.INSTANCE;
    }

    @Override // p008y1.p0
    public final void g2(long j8) {
    }

    @Override // p008y1.p0
    public final void h2(e0.d dVar) {
        if (getIsAttached()) {
            ge1.b.T(getCoroutineScope(), null, null, new a(this, dVar, null), 3);
        }
    }

    @Override // p008y1.p0
    public final boolean m2() {
        Boolean bool = this.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return this.f193507x.f193590l.getF182175a() != null;
    }

    @Override // h4.r.c
    public final void onAttach() {
        s2(this.C);
    }

    @Override // h5.j, h5.u1
    public final void onDensityChange() {
        a1();
        if (getIsAttached()) {
            c cVar = k.g(this).A;
            c cVar2 = this.E;
            if (cVar2 == null || !p005kotlin.jvm.internal.s.g(cVar2, cVar)) {
                this.E = cVar;
                s2(this.C);
            }
        }
    }

    public final boolean r2() {
        Boolean bool = this.f193509z;
        if (bool == null) {
            return k.g(this).B == o.Rtl && this.f193508y == b2.Horizontal;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public final void s2(e1 e1Var) {
        if (e1Var == null) {
            b.f193089a.getClass();
            b2 b2Var = b.f193090b;
            m0 m0Var = b.f193091c;
            c cVar = k.g(this).A;
            this.E = cVar;
            r<T> rVar = this.f193507x;
            z zVar = e.f193172c;
            d dVar = new d(rVar, m0Var, new lc(cVar, 3));
            float f14 = z1.s.f200874a;
            e1Var = new z1.o(dVar, zVar, b2Var);
        }
        this.D = e1Var;
    }
}
