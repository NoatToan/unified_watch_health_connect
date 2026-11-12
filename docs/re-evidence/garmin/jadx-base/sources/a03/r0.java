package a03;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b1;
import p008y1.d1;
import p3.c2;
import p3.z1;
import u1.k1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0011B[\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"La03/r0;", "T", "", "initialValue", "Ls1/k;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lkotlin/Function2;", "Lg6/c;", "positionalThreshold", "Lg6/f;", "velocityThreshold", "<init>", "(Ljava/lang/Object;Ls1/k;Le23/l;Le23/p;FLkotlin/jvm/internal/j;)V", "a", "flexible-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f169q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.k<Float> f170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<T, Boolean> f171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.p<g6.c, Float, Float> f172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c2 f177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p3.d0 f178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c2 f179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z1 f180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p3.d0 f181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p3.d0 f182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c2 f183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c2 f184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g6.c f185p;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"a03/r0$b", "Ly1/d1;", "flexible-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<T> f187b;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"a03/r0$b$a", "Ly1/v0;", "flexible-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements p008y1.v0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r0<T> f188a;

            public a(r0<T> r0Var) {
                this.f188a = r0Var;
            }

            @Override // p008y1.v0
            public final void a(float f14) {
                this.f188a.c(f14);
            }
        }

        public b(r0<T> r0Var) {
            this.f187b = r0Var;
            this.f186a = new a(r0Var);
        }

        @Override // p008y1.d1
        public final Object a(k1 k1Var, b1 b1Var, y1.p0.b bVar) {
            x0 x0Var = new x0(b1Var, this, null);
            int i14 = r0.f169q;
            r0<T> r0Var = this.f187b;
            r0Var.getClass();
            Object objE = o53.c0.e(new w0(r0Var, k1Var, x0Var, null), bVar);
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (objE != aVar) {
                objE = Unit.INSTANCE;
            }
            return objE == aVar ? objE : Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r0(T t7, s1.k<Float> kVar, e23.l<? super T, Boolean> lVar, e23.p<? super g6.c, ? super Float, Float> pVar, float f14) {
        kVar.getClass();
        lVar.getClass();
        pVar.getClass();
        this.f170a = kVar;
        this.f171b = lVar;
        this.f172c = pVar;
        this.f173d = f14;
        this.f174e = new d0();
        this.f176g = new b(this);
        this.f177h = p3.p0.n(t7);
        final int i14 = 0;
        this.f178i = p3.p0.f(new e23.a(this) { // from class: a03.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f164b;

            {
                this.f164b = this;
            }

            /* JADX WARN: Code duplicated, block: B:47:0x0104  */
            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                float f15 = 0.0f;
                Float fValueOf = null;
                r0 r0Var = this.f164b;
                switch (i15) {
                    case 0:
                        int i16 = r0.f169q;
                        T f182175a = r0Var.f183n.getF182175a();
                        if (f182175a != 0) {
                            return f182175a;
                        }
                        Float fE = r0Var.e();
                        c2 c2Var = r0Var.f177h;
                        return fE != null ? r0Var.b(fE.floatValue(), 0.0f, c2Var.getF182175a()) : c2Var.getF182175a();
                    case 1:
                        int i17 = r0.f169q;
                        Float f16 = (Float) r0Var.d().get(r0Var.f177h.getF182175a());
                        float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
                        Float f17 = (Float) r0Var.d().get(r0Var.f178i.getF182175a());
                        float fFloatValue2 = (f17 != null ? f17.floatValue() : 0.0f) - fFloatValue;
                        if (Math.abs(fFloatValue2) > 1.0E-6f) {
                            float f18 = (r0Var.f() - fFloatValue) / fFloatValue2;
                            if (f18 >= 1.0E-6f) {
                                if (f18 > 0.999999f) {
                                    f15 = 1.0f;
                                } else {
                                    f15 = f18;
                                }
                            }
                        } else {
                            f15 = 1.0f;
                        }
                        return Float.valueOf(f15);
                    case 2:
                        int i18 = r0.f169q;
                        Iterator it = r0Var.d().entrySet().iterator();
                        if (it.hasNext()) {
                            float fFloatValue3 = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
                            while (it.hasNext()) {
                                fFloatValue3 = Math.min(fFloatValue3, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
                            }
                            fValueOf = Float.valueOf(fFloatValue3);
                        }
                        return Float.valueOf(fValueOf != null ? fValueOf.floatValue() : Float.NEGATIVE_INFINITY);
                    default:
                        int i19 = r0.f169q;
                        Iterator it3 = r0Var.d().entrySet().iterator();
                        if (it3.hasNext()) {
                            float fFloatValue4 = ((Number) ((Map.Entry) it3.next()).getValue()).floatValue();
                            while (it3.hasNext()) {
                                fFloatValue4 = Math.max(fFloatValue4, ((Number) ((Map.Entry) it3.next()).getValue()).floatValue());
                            }
                            fValueOf = Float.valueOf(fFloatValue4);
                        }
                        return Float.valueOf(fValueOf != null ? fValueOf.floatValue() : Float.POSITIVE_INFINITY);
                }
            }
        });
        this.f179j = p3.p0.n(null);
        final int i15 = 1;
        p3.p0.f(new e23.a(this) { // from class: a03.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f164b;

            {
                this.f164b = this;
            }

            /* JADX WARN: Code duplicated, block: B:47:0x0104  */
            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                float f15 = 0.0f;
                Float fValueOf = null;
                r0 r0Var = this.f164b;
                switch (i16) {
                    case 0:
                        int i17 = r0.f169q;
                        T f182175a = r0Var.f183n.getF182175a();
                        if (f182175a != 0) {
                            return f182175a;
                        }
                        Float fE = r0Var.e();
                        c2 c2Var = r0Var.f177h;
                        return fE != null ? r0Var.b(fE.floatValue(), 0.0f, c2Var.getF182175a()) : c2Var.getF182175a();
                    case 1:
                        int i18 = r0.f169q;
                        Float f16 = (Float) r0Var.d().get(r0Var.f177h.getF182175a());
                        float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
                        Float f17 = (Float) r0Var.d().get(r0Var.f178i.getF182175a());
                        float fFloatValue2 = (f17 != null ? f17.floatValue() : 0.0f) - fFloatValue;
                        if (Math.abs(fFloatValue2) > 1.0E-6f) {
                            float f18 = (r0Var.f() - fFloatValue) / fFloatValue2;
                            if (f18 >= 1.0E-6f) {
                                if (f18 > 0.999999f) {
                                    f15 = 1.0f;
                                } else {
                                    f15 = f18;
                                }
                            }
                        } else {
                            f15 = 1.0f;
                        }
                        return Float.valueOf(f15);
                    case 2:
                        int i19 = r0.f169q;
                        Iterator it = r0Var.d().entrySet().iterator();
                        if (it.hasNext()) {
                            float fFloatValue3 = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
                            while (it.hasNext()) {
                                fFloatValue3 = Math.min(fFloatValue3, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
                            }
                            fValueOf = Float.valueOf(fFloatValue3);
                        }
                        return Float.valueOf(fValueOf != null ? fValueOf.floatValue() : Float.NEGATIVE_INFINITY);
                    default:
                        int i110 = r0.f169q;
                        Iterator it3 = r0Var.d().entrySet().iterator();
                        if (it3.hasNext()) {
                            float fFloatValue4 = ((Number) ((Map.Entry) it3.next()).getValue()).floatValue();
                            while (it3.hasNext()) {
                                fFloatValue4 = Math.max(fFloatValue4, ((Number) ((Map.Entry) it3.next()).getValue()).floatValue());
                            }
                            fValueOf = Float.valueOf(fFloatValue4);
                        }
                        return Float.valueOf(fValueOf != null ? fValueOf.floatValue() : Float.POSITIVE_INFINITY);
                }
            }
        });
        this.f180k = new z1(0.0f);
        final int i16 = 2;
        this.f181l = p3.p0.f(new e23.a(this) { // from class: a03.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f164b;

            {
                this.f164b = this;
            }

            /* JADX WARN: Code duplicated, block: B:47:0x0104  */
            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                float f15 = 0.0f;
                Float fValueOf = null;
                r0 r0Var = this.f164b;
                switch (i17) {
                    case 0:
                        int i18 = r0.f169q;
                        T f182175a = r0Var.f183n.getF182175a();
                        if (f182175a != 0) {
                            return f182175a;
                        }
                        Float fE = r0Var.e();
                        c2 c2Var = r0Var.f177h;
                        return fE != null ? r0Var.b(fE.floatValue(), 0.0f, c2Var.getF182175a()) : c2Var.getF182175a();
                    case 1:
                        int i19 = r0.f169q;
                        Float f16 = (Float) r0Var.d().get(r0Var.f177h.getF182175a());
                        float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
                        Float f17 = (Float) r0Var.d().get(r0Var.f178i.getF182175a());
                        float fFloatValue2 = (f17 != null ? f17.floatValue() : 0.0f) - fFloatValue;
                        if (Math.abs(fFloatValue2) > 1.0E-6f) {
                            float f18 = (r0Var.f() - fFloatValue) / fFloatValue2;
                            if (f18 >= 1.0E-6f) {
                                if (f18 > 0.999999f) {
                                    f15 = 1.0f;
                                } else {
                                    f15 = f18;
                                }
                            }
                        } else {
                            f15 = 1.0f;
                        }
                        return Float.valueOf(f15);
                    case 2:
                        int i110 = r0.f169q;
                        Iterator it = r0Var.d().entrySet().iterator();
                        if (it.hasNext()) {
                            float fFloatValue3 = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
                            while (it.hasNext()) {
                                fFloatValue3 = Math.min(fFloatValue3, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
                            }
                            fValueOf = Float.valueOf(fFloatValue3);
                        }
                        return Float.valueOf(fValueOf != null ? fValueOf.floatValue() : Float.NEGATIVE_INFINITY);
                    default:
                        int i111 = r0.f169q;
                        Iterator it3 = r0Var.d().entrySet().iterator();
                        if (it3.hasNext()) {
                            float fFloatValue4 = ((Number) ((Map.Entry) it3.next()).getValue()).floatValue();
                            while (it3.hasNext()) {
                                fFloatValue4 = Math.max(fFloatValue4, ((Number) ((Map.Entry) it3.next()).getValue()).floatValue());
                            }
                            fValueOf = Float.valueOf(fFloatValue4);
                        }
                        return Float.valueOf(fValueOf != null ? fValueOf.floatValue() : Float.POSITIVE_INFINITY);
                }
            }
        });
        final int i17 = 3;
        this.f182m = p3.p0.f(new e23.a(this) { // from class: a03.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f164b;

            {
                this.f164b = this;
            }

            /* JADX WARN: Code duplicated, block: B:47:0x0104  */
            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                float f15 = 0.0f;
                Float fValueOf = null;
                r0 r0Var = this.f164b;
                switch (i18) {
                    case 0:
                        int i19 = r0.f169q;
                        T f182175a = r0Var.f183n.getF182175a();
                        if (f182175a != 0) {
                            return f182175a;
                        }
                        Float fE = r0Var.e();
                        c2 c2Var = r0Var.f177h;
                        return fE != null ? r0Var.b(fE.floatValue(), 0.0f, c2Var.getF182175a()) : c2Var.getF182175a();
                    case 1:
                        int i110 = r0.f169q;
                        Float f16 = (Float) r0Var.d().get(r0Var.f177h.getF182175a());
                        float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
                        Float f17 = (Float) r0Var.d().get(r0Var.f178i.getF182175a());
                        float fFloatValue2 = (f17 != null ? f17.floatValue() : 0.0f) - fFloatValue;
                        if (Math.abs(fFloatValue2) > 1.0E-6f) {
                            float f18 = (r0Var.f() - fFloatValue) / fFloatValue2;
                            if (f18 >= 1.0E-6f) {
                                if (f18 > 0.999999f) {
                                    f15 = 1.0f;
                                } else {
                                    f15 = f18;
                                }
                            }
                        } else {
                            f15 = 1.0f;
                        }
                        return Float.valueOf(f15);
                    case 2:
                        int i111 = r0.f169q;
                        Iterator it = r0Var.d().entrySet().iterator();
                        if (it.hasNext()) {
                            float fFloatValue3 = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
                            while (it.hasNext()) {
                                fFloatValue3 = Math.min(fFloatValue3, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
                            }
                            fValueOf = Float.valueOf(fFloatValue3);
                        }
                        return Float.valueOf(fValueOf != null ? fValueOf.floatValue() : Float.NEGATIVE_INFINITY);
                    default:
                        int i112 = r0.f169q;
                        Iterator it3 = r0Var.d().entrySet().iterator();
                        if (it3.hasNext()) {
                            float fFloatValue4 = ((Number) ((Map.Entry) it3.next()).getValue()).floatValue();
                            while (it3.hasNext()) {
                                fFloatValue4 = Math.max(fFloatValue4, ((Number) ((Map.Entry) it3.next()).getValue()).floatValue());
                            }
                            fValueOf = Float.valueOf(fFloatValue4);
                        }
                        return Float.valueOf(fValueOf != null ? fValueOf.floatValue() : Float.POSITIVE_INFINITY);
                }
            }
        });
        this.f183n = p3.p0.n(null);
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        this.f184o = p3.p0.n(k0Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Object obj, float f14, s1.k kVar, v13.c cVar) throws Throwable {
        s0 s0Var;
        r0<T> r0Var;
        c2 c2Var;
        float f15;
        Iterator<T> it;
        T next;
        Object key;
        c2 c2Var2;
        float f16;
        Iterator<T> it3;
        T next2;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f196d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f196d = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        s0 s0Var2 = s0Var;
        Object obj2 = s0Var2.f194b;
        Object obj3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var2.f196d;
        if (i15 == 0) {
            o13.r.b(obj2);
            if (this.f175f && this.f183n.getF182175a() != null) {
                return Unit.INSTANCE;
            }
            Float f17 = d().get(obj);
            if (f17 != null) {
                try {
                    u0 u0Var = new u0(this, obj, f17, f14, kVar, null);
                    s0Var2.f193a = this;
                    s0Var2.f196d = 1;
                    Object objE = o53.c0.e(new w0(this, k1.Default, u0Var, null), s0Var2);
                    if (objE != obj3) {
                        objE = Unit.INSTANCE;
                    }
                    if (objE == obj3) {
                        return obj3;
                    }
                    r0Var = this;
                    c2 c2Var3 = r0Var.f183n;
                    c2Var2 = r0Var.f177h;
                    c2Var3.setValue(null);
                    f16 = r0Var.f();
                    it3 = r0Var.d().entrySet().iterator();
                    do {
                        if (it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (Math.abs(((Number) ((Map.Entry) next2).getValue()).floatValue() - f16) >= 0.5f);
                    Map.Entry entry = (Map.Entry) next2;
                    if (entry != null) {
                    }
                    if (key == null) {
                        key = c2Var2.getF182175a();
                    }
                    c2Var2.setValue(key);
                } catch (Throwable th3) {
                    th = th3;
                    r0Var = this;
                    c2 c2Var4 = r0Var.f183n;
                    c2Var = r0Var.f177h;
                    c2Var4.setValue(null);
                    f15 = r0Var.f();
                    it = r0Var.d().entrySet().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (Math.abs(((Number) ((Map.Entry) next).getValue()).floatValue() - f15) >= 0.5f);
                    Map.Entry entry2 = (Map.Entry) next;
                    if (entry2 != null) {
                    }
                    if (key == null) {
                        key = c2Var.getF182175a();
                    }
                    c2Var.setValue(key);
                    throw th;
                }
            } else {
                this.f177h.setValue(obj);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = s0Var2.f193a;
            try {
                o13.r.b(obj2);
                c2 c2Var5 = r0Var.f183n;
                c2Var2 = r0Var.f177h;
                c2Var5.setValue(null);
                f16 = r0Var.f();
                it3 = r0Var.d().entrySet().iterator();
                do {
                    if (it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (Math.abs(((Number) ((Map.Entry) next2).getValue()).floatValue() - f16) >= 0.5f);
                Map.Entry entry3 = (Map.Entry) next2;
                key = entry3 != null ? entry3.getKey() : null;
                if (key == null) {
                    key = c2Var2.getF182175a();
                }
                c2Var2.setValue(key);
            } catch (Throwable th4) {
                th = th4;
                c2 c2Var6 = r0Var.f183n;
                c2Var = r0Var.f177h;
                c2Var6.setValue(null);
                f15 = r0Var.f();
                it = r0Var.d().entrySet().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (Math.abs(((Number) ((Map.Entry) next).getValue()).floatValue() - f15) >= 0.5f);
                Map.Entry entry4 = (Map.Entry) next;
                key = entry4 != null ? entry4.getKey() : null;
                if (key == null) {
                    key = c2Var.getF182175a();
                }
                c2Var.setValue(key);
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object b(float f14, float f15, Object obj) {
        Map<T, Float> mapD = d();
        Float f16 = mapD.get(obj);
        g6.c cVar = this.f185p;
        if (cVar == null) {
            androidx.core.view.j.s("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=", this, " SwipeableState?");
            return null;
        }
        float fS0 = cVar.s0(this.f173d);
        if (!p005kotlin.jvm.internal.s.e(f16, f14) && f16 != null) {
            float fFloatValue = f16.floatValue();
            e23.p<g6.c, Float, Float> pVar = this.f172c;
            if (fFloatValue < f14) {
                if (f15 >= fS0) {
                    return p0.a(mapD, f14, true);
                }
                Object objA = p0.a(mapD, f14, true);
                if (f14 >= Math.abs(f16.floatValue() + Math.abs(pVar.invoke(cVar, Float.valueOf(Math.abs(((Number) p13.u0.c(objA, mapD)).floatValue() - f16.floatValue()))).floatValue()))) {
                    return objA;
                }
            } else {
                if (f15 <= (-fS0)) {
                    return p0.a(mapD, f14, false);
                }
                Object objA2 = p0.a(mapD, f14, false);
                float fAbs = Math.abs(f16.floatValue() - Math.abs(pVar.invoke(cVar, Float.valueOf(Math.abs(f16.floatValue() - ((Number) p13.u0.c(objA2, mapD)).floatValue()))).floatValue()));
                if (f14 >= 0.0f ? f14 <= fAbs : Math.abs(f14) >= fAbs) {
                    return objA2;
                }
            }
        }
        return obj;
    }

    public final float c(float f14) {
        Float fE = e();
        float fFloatValue = fE != null ? fE.floatValue() : 0.0f;
        p3.d0 d0Var = this.f181l;
        float fFloatValue2 = ((Number) d0Var.getF182175a()).floatValue();
        p3.d0 d0Var2 = this.f182m;
        float fD = j23.t.d(f14 + fFloatValue, fFloatValue2, ((Number) d0Var2.getF182175a()).floatValue()) - fFloatValue;
        if (Math.abs(fD) >= 0.0f) {
            Float fE2 = e();
            this.f179j.setValue(Float.valueOf(j23.t.d((fE2 != null ? fE2.floatValue() : 0.0f) + fD, ((Number) d0Var.getF182175a()).floatValue(), ((Number) d0Var2.getF182175a()).floatValue())));
        }
        return fD;
    }

    public final Map<T, Float> d() {
        return (Map) this.f184o.getF182175a();
    }

    public final Float e() {
        return (Float) this.f179j.getF182175a();
    }

    public final float f() {
        Float fE = e();
        if (fE != null) {
            return fE.floatValue();
        }
        vb.h.z("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void g(T t7) {
        Float f14 = d().get(t7);
        c2 c2Var = this.f177h;
        if (f14 == null) {
            c2Var.setValue(t7);
            return;
        }
        float fFloatValue = f14.floatValue();
        Float fE = e();
        c(fFloatValue - (fE != null ? fE.floatValue() : 0.0f));
        c2Var.setValue(t7);
        this.f183n.setValue(null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La03/r0$a;", "", "<init>", "()V", "flexible-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ r0(Object obj, s1.k kVar, e23.l lVar, e23.p pVar, float f14, p005kotlin.jvm.internal.j jVar) {
        this(obj, kVar, lVar, pVar, f14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r0(Object obj, s1.k kVar, e23.l lVar, e23.p pVar, float f14, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            m0.f130a.getClass();
            kVar = m0.f131b;
        }
        s1.k kVar2 = kVar;
        e23.l hVar = (i14 & 4) != 0 ? new h(4) : lVar;
        if ((i14 & 8) != 0) {
            m0.f130a.getClass();
            pVar = m0.f133d;
        }
        e23.p pVar2 = pVar;
        if ((i14 & 16) != 0) {
            m0.f130a.getClass();
            f14 = m0.f132c;
        }
        this(obj, kVar2, hVar, pVar2, f14, null);
    }
}
