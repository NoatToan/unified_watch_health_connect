package aurelienribon.tweenengine;

import aurelienribon.tweenengine.equations.Quad;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Tween extends BaseTween<Tween> {
    private static int H = 3;
    private static int I = 0;
    public static final int INFINITY = -1;
    private static final Pool.Callback<Tween> J;
    private static final Pool<Tween> K;
    private static final Map<Class<?>, TweenAccessor<?>> L;
    public static final /* synthetic */ boolean M = false;
    private int A;
    private int B;
    private final float[] C;
    private final float[] D;
    private final float[] E;
    private float[] F;
    private float[] G;
    private Object s;
    private Class<?> t;
    private TweenAccessor<Object> u;
    private int v;
    private TweenEquation w;
    private TweenPath x;
    private boolean y;
    private boolean z;

    public static class a implements Pool.Callback<Tween> {
        @Override // aurelienribon.tweenengine.Pool.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPool(Tween tween) {
            tween.reset();
        }

        @Override // aurelienribon.tweenengine.Pool.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onUnPool(Tween tween) {
            tween.reset();
        }
    }

    public static class b extends Pool<Tween> {
        public b(int i, Pool.Callback callback) {
            super(i, callback);
        }

        @Override // aurelienribon.tweenengine.Pool
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Tween b() {
            return new Tween(null);
        }
    }

    static {
        a aVar = new a();
        J = aVar;
        K = new b(20, aVar);
        L = new HashMap();
    }

    public /* synthetic */ Tween(a aVar) {
        this();
    }

    public static Tween call(TweenCallback tweenCallback) {
        Tween tweenE = K.e();
        tweenE.f(null, -1, 0.0f);
        tweenE.setCallback(tweenCallback);
        tweenE.setCallbackTriggers(2);
        return tweenE;
    }

    private Class<?> e() {
        if (L.containsKey(this.s.getClass())) {
            return this.s.getClass();
        }
        Object obj = this.s;
        if (obj instanceof TweenAccessor) {
            return obj.getClass();
        }
        Class<? super Object> superclass = obj.getClass().getSuperclass();
        while (superclass != null && !L.containsKey(superclass)) {
            superclass = superclass.getSuperclass();
        }
        return superclass;
    }

    public static void ensurePoolCapacity(int i) {
        K.c(i);
    }

    private void f(Object obj, int i, float f) {
        if (f < 0.0f) {
            throw new RuntimeException("Duration can't be negative");
        }
        this.s = obj;
        this.t = obj != null ? e() : null;
        this.v = i;
        this.duration = f;
    }

    public static Tween from(Object obj, int i, float f) {
        Tween tweenE = K.e();
        tweenE.f(obj, i, f);
        tweenE.ease(Quad.INOUT);
        tweenE.path(TweenPaths.catmullRom);
        tweenE.y = true;
        return tweenE;
    }

    private void g() {
        throw new RuntimeException("You cannot combine more than " + H + " attributes in a tween. You can raise this limit with Tween.setCombinedAttributesLimit(), which should be called once in application initialization code.");
    }

    public static int getPoolSize() {
        return K.f();
    }

    public static TweenAccessor<?> getRegisteredAccessor(Class<?> cls) {
        return L.get(cls);
    }

    public static String getVersion() {
        return "6.3.3";
    }

    private void h() {
        throw new RuntimeException("You cannot add more than " + I + " waypoints to a tween. You can raise this limit with Tween.setWaypointsLimit(), which should be called once in application initialization code.");
    }

    public static Tween mark() {
        Tween tweenE = K.e();
        tweenE.f(null, -1, 0.0f);
        return tweenE;
    }

    public static void registerAccessor(Class<?> cls, TweenAccessor<?> tweenAccessor) {
        L.put(cls, tweenAccessor);
    }

    public static Tween set(Object obj, int i) {
        Tween tweenE = K.e();
        tweenE.f(obj, i, 0.0f);
        tweenE.ease(Quad.INOUT);
        return tweenE;
    }

    public static void setCombinedAttributesLimit(int i) {
        H = i;
    }

    public static void setWaypointsLimit(int i) {
        I = i;
    }

    public static Tween to(Object obj, int i, float f) {
        Tween tweenE = K.e();
        tweenE.f(obj, i, f);
        tweenE.ease(Quad.INOUT);
        tweenE.path(TweenPaths.catmullRom);
        return tweenE;
    }

    public Tween cast(Class<?> cls) {
        if (isStarted()) {
            throw new RuntimeException("You can't cast the target of a tween once it is started");
        }
        this.t = cls;
        return this;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public boolean containsTarget(Object obj) {
        return this.s == obj;
    }

    public Tween ease(TweenEquation tweenEquation) {
        this.w = tweenEquation;
        return this;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void forceEndValues() {
        Object obj = this.s;
        if (obj == null) {
            return;
        }
        this.u.setValues(obj, this.v, this.D);
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void forceStartValues() {
        Object obj = this.s;
        if (obj == null) {
            return;
        }
        this.u.setValues(obj, this.v, this.C);
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void free() {
        K.d(this);
    }

    public TweenAccessor<?> getAccessor() {
        return this.u;
    }

    public int getCombinedAttributesCount() {
        return this.A;
    }

    public TweenEquation getEasing() {
        return this.w;
    }

    public Object getTarget() {
        return this.s;
    }

    public Class<?> getTargetClass() {
        return this.t;
    }

    public float[] getTargetValues() {
        return this.D;
    }

    public int getType() {
        return this.v;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void initializeOverride() {
        Object obj = this.s;
        if (obj == null) {
            return;
        }
        this.u.getValues(obj, this.v, this.C);
        for (int i = 0; i < this.A; i++) {
            float[] fArr = this.D;
            fArr[i] = fArr[i] + (this.z ? this.C[i] : 0.0f);
            for (int i2 = 0; i2 < this.B; i2++) {
                float[] fArr2 = this.E;
                int i3 = (this.A * i2) + i;
                fArr2[i3] = fArr2[i3] + (this.z ? this.C[i] : 0.0f);
            }
            if (this.y) {
                float[] fArr3 = this.C;
                float f = fArr3[i];
                float[] fArr4 = this.D;
                fArr3[i] = fArr4[i];
                fArr4[i] = f;
            }
        }
    }

    public Tween path(TweenPath tweenPath) {
        this.x = tweenPath;
        return this;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void reset() {
        super.reset();
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = -1;
        this.w = null;
        this.x = null;
        this.z = false;
        this.y = false;
        this.B = 0;
        this.A = 0;
        int length = this.F.length;
        int i = H;
        if (length != i) {
            this.F = new float[i];
        }
        int length2 = this.G.length;
        int i2 = I;
        if (length2 != (i2 + 2) * i) {
            this.G = new float[(i2 + 2) * i];
        }
    }

    public Tween target(float f) {
        this.D[0] = f;
        return this;
    }

    public Tween targetRelative(float f) {
        this.z = true;
        float[] fArr = this.D;
        if (isInitialized()) {
            f += this.C[0];
        }
        fArr[0] = f;
        return this;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void updateOverride(int i, int i2, boolean z, float f) {
        int i3;
        Object obj = this.s;
        if (obj == null || this.w == null) {
            return;
        }
        if (!z && i > i2) {
            this.u.setValues(obj, this.v, isReverse(i2) ? this.C : this.D);
            return;
        }
        if (!z && i < i2) {
            this.u.setValues(obj, this.v, isReverse(i2) ? this.D : this.C);
            return;
        }
        float f2 = this.duration;
        if (f2 < 1.0E-11f && f > -1.0E-11f) {
            this.u.setValues(obj, this.v, isReverse(i) ? this.D : this.C);
            return;
        }
        if (f2 < 1.0E-11f && f < 1.0E-11f) {
            this.u.setValues(obj, this.v, isReverse(i) ? this.C : this.D);
            return;
        }
        float fCompute = this.w.compute((isReverse(i) ? this.duration - getCurrentTime() : getCurrentTime()) / this.duration);
        if (this.B == 0 || this.x == null) {
            for (int i4 = 0; i4 < this.A; i4++) {
                float[] fArr = this.F;
                float[] fArr2 = this.C;
                fArr[i4] = fArr2[i4] + ((this.D[i4] - fArr2[i4]) * fCompute);
            }
        } else {
            for (int i5 = 0; i5 < this.A; i5++) {
                float[] fArr3 = this.G;
                fArr3[0] = this.C[i5];
                fArr3[this.B + 1] = this.D[i5];
                int i6 = 0;
                while (true) {
                    i3 = this.B;
                    if (i6 < i3) {
                        int i7 = i6 + 1;
                        this.G[i7] = this.E[(i6 * this.A) + i5];
                        i6 = i7;
                    }
                }
                this.F[i5] = this.x.compute(fCompute, this.G, i3 + 2);
            }
        }
        this.u.setValues(this.s, this.v, this.F);
    }

    public Tween waypoint(float f) {
        if (this.B == I) {
            h();
        }
        float[] fArr = this.E;
        int i = this.B;
        fArr[i] = f;
        this.B = i + 1;
        return this;
    }

    private Tween() {
        int i = H;
        this.C = new float[i];
        this.D = new float[i];
        int i2 = I;
        this.E = new float[i2 * i];
        this.F = new float[i];
        this.G = new float[(i2 + 2) * i];
        reset();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // aurelienribon.tweenengine.BaseTween
    public Tween build() {
        if (this.s == null) {
            return this;
        }
        TweenAccessor<?> tweenAccessor = L.get(this.t);
        this.u = tweenAccessor;
        if (tweenAccessor == null) {
            Object obj = this.s;
            if (obj instanceof TweenAccessor) {
                this.u = (TweenAccessor) obj;
            }
        }
        TweenAccessor<Object> tweenAccessor2 = this.u;
        if (tweenAccessor2 == null) {
            throw new RuntimeException("No TweenAccessor was found for the target");
        }
        int values = tweenAccessor2.getValues(this.s, this.v, this.F);
        this.A = values;
        if (values > H) {
            g();
        }
        return this;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public boolean containsTarget(Object obj, int i) {
        return this.s == obj && this.v == i;
    }

    public Tween target(float f, float f2) {
        float[] fArr = this.D;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public Tween targetRelative(float f, float f2) {
        this.z = true;
        float[] fArr = this.D;
        if (isInitialized()) {
            f += this.C[0];
        }
        fArr[0] = f;
        float[] fArr2 = this.D;
        if (isInitialized()) {
            f2 += this.C[1];
        }
        fArr2[1] = f2;
        return this;
    }

    public Tween target(float f, float f2, float f3) {
        float[] fArr = this.D;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        return this;
    }

    public Tween waypoint(float f, float f2) {
        if (this.B == I) {
            h();
        }
        float[] fArr = this.E;
        int i = this.B;
        fArr[i * 2] = f;
        fArr[(i * 2) + 1] = f2;
        this.B = i + 1;
        return this;
    }

    public Tween targetRelative(float f, float f2, float f3) {
        this.z = true;
        float[] fArr = this.D;
        if (isInitialized()) {
            f += this.C[0];
        }
        fArr[0] = f;
        float[] fArr2 = this.D;
        if (isInitialized()) {
            f2 += this.C[1];
        }
        fArr2[1] = f2;
        float[] fArr3 = this.D;
        if (isInitialized()) {
            f3 += this.C[2];
        }
        fArr3[2] = f3;
        return this;
    }

    public Tween target(float... fArr) {
        if (fArr.length > H) {
            g();
        }
        System.arraycopy(fArr, 0, this.D, 0, fArr.length);
        return this;
    }

    public Tween waypoint(float f, float f2, float f3) {
        if (this.B == I) {
            h();
        }
        float[] fArr = this.E;
        int i = this.B;
        fArr[i * 3] = f;
        fArr[(i * 3) + 1] = f2;
        fArr[(i * 3) + 2] = f3;
        this.B = i + 1;
        return this;
    }

    public Tween targetRelative(float... fArr) {
        if (fArr.length > H) {
            g();
        }
        for (int i = 0; i < fArr.length; i++) {
            this.D[i] = isInitialized() ? fArr[i] + this.C[i] : fArr[i];
        }
        this.z = true;
        return this;
    }

    public Tween waypoint(float... fArr) {
        if (this.B == I) {
            h();
        }
        System.arraycopy(fArr, 0, this.E, this.B * fArr.length, fArr.length);
        this.B++;
        return this;
    }
}
