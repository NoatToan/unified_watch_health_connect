package aurelienribon.tweenengine;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTween<T> {
    public static final /* synthetic */ boolean r = false;
    private int a;
    private int b;
    private boolean c;
    private boolean d;
    public float delay;
    public float duration;
    private float e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private TweenCallback m;
    private int n;
    private Object o;
    public boolean p;
    public boolean q;

    private void a() {
        if (this.f + this.g >= this.delay) {
            initializeOverride();
            this.i = true;
            this.c = true;
            this.a = 0;
            this.g -= this.delay - this.f;
            this.f = 0.0f;
            callCallback(1);
            callCallback(2);
        }
    }

    private void b() {
        int i;
        int i2 = this.b;
        this.j = i2 >= 0 && ((i = this.a) > i2 * 2 || i < 0);
    }

    private void c() {
        int i;
        boolean z = this.c;
        if (!z && this.b >= 0 && this.a < 0) {
            float f = this.f;
            float f2 = this.g;
            if (f + f2 >= 0.0f) {
                this.c = true;
                this.a = 0;
                float f3 = 0.0f - f;
                this.g = f2 - f3;
                this.f = 0.0f;
                callCallback(1);
                callCallback(2);
                int i2 = this.a;
                updateOverride(i2, i2 - 1, this.c, f3);
                return;
            }
        }
        if (z || (i = this.b) < 0 || this.a <= i * 2) {
            return;
        }
        float f4 = this.f;
        float f5 = this.g;
        if (f4 + f5 < 0.0f) {
            this.c = true;
            this.a = i * 2;
            float f6 = 0.0f - f4;
            this.g = f5 - f6;
            this.f = this.duration;
            callCallback(16);
            callCallback(32);
            int i3 = this.a;
            updateOverride(i3, i3 + 1, this.c, f6);
        }
    }

    private void d() {
        while (isValid(this.a)) {
            boolean z = this.c;
            if (!z) {
                float f = this.f;
                float f2 = this.g;
                if (f + f2 <= 0.0f) {
                    this.c = true;
                    int i = this.a - 1;
                    this.a = i;
                    float f3 = 0.0f - f;
                    this.g = f2 - f3;
                    this.f = this.duration;
                    if (isReverse(i)) {
                        forceStartValues();
                    } else {
                        forceEndValues();
                    }
                    callCallback(32);
                    int i2 = this.a;
                    updateOverride(i2, i2 + 1, this.c, f3);
                }
            }
            if (!z) {
                float f4 = this.f;
                float f5 = this.g;
                float f6 = f4 + f5;
                float f7 = this.e;
                if (f6 >= f7) {
                    this.c = true;
                    int i3 = this.a + 1;
                    this.a = i3;
                    float f8 = f7 - f4;
                    this.g = f5 - f8;
                    this.f = 0.0f;
                    if (isReverse(i3)) {
                        forceEndValues();
                    } else {
                        forceStartValues();
                    }
                    callCallback(2);
                    int i4 = this.a;
                    updateOverride(i4, i4 - 1, this.c, f8);
                }
            }
            if (z) {
                float f9 = this.f;
                float f10 = this.g;
                if (f9 + f10 < 0.0f) {
                    this.c = false;
                    int i5 = this.a - 1;
                    this.a = i5;
                    float f11 = 0.0f - f9;
                    this.g = f10 - f11;
                    this.f = 0.0f;
                    updateOverride(i5, i5 + 1, false, f11);
                    callCallback(64);
                    if (this.a >= 0 || this.b < 0) {
                        this.f = this.e;
                    } else {
                        callCallback(128);
                    }
                }
            }
            if (z) {
                float f12 = this.f;
                float f13 = this.g;
                float f14 = f12 + f13;
                float f15 = this.duration;
                if (f14 > f15) {
                    this.c = false;
                    int i6 = this.a + 1;
                    this.a = i6;
                    float f16 = f15 - f12;
                    this.g = f13 - f16;
                    this.f = f15;
                    updateOverride(i6, i6 - 1, false, f16);
                    callCallback(4);
                    int i7 = this.a;
                    int i8 = this.b;
                    if (i7 > i8 * 2 && i8 >= 0) {
                        callCallback(8);
                    }
                    this.f = 0.0f;
                }
            }
            if (!z) {
                float f17 = this.g;
                this.g = f17 - f17;
                this.f += f17;
                return;
            } else {
                float f18 = this.g;
                this.g = f18 - f18;
                this.f += f18;
                int i9 = this.a;
                updateOverride(i9, i9, z, f18);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T build() {
        return this;
    }

    public void callCallback(int i) {
        TweenCallback tweenCallback = this.m;
        if (tweenCallback == null || (this.n & i) <= 0) {
            return;
        }
        tweenCallback.onEvent(i, this);
    }

    public abstract boolean containsTarget(Object obj);

    public abstract boolean containsTarget(Object obj, int i);

    /* JADX WARN: Multi-variable type inference failed */
    public T delay(float f) {
        this.delay += f;
        return this;
    }

    public abstract void forceEndValues();

    public abstract void forceStartValues();

    public void forceToEnd(float f) {
        this.f = f - getFullDuration();
        int i = this.b;
        this.a = (i * 2) + 1;
        this.c = false;
        if (isReverse(i * 2)) {
            forceStartValues();
        } else {
            forceEndValues();
        }
    }

    public void forceToStart() {
        this.f = -this.delay;
        this.a = -1;
        this.c = false;
        if (isReverse(0)) {
            forceEndValues();
        } else {
            forceStartValues();
        }
    }

    public void free() {
    }

    public float getCurrentTime() {
        return this.f;
    }

    public float getDelay() {
        return this.delay;
    }

    public float getDuration() {
        return this.duration;
    }

    public float getFullDuration() {
        int i = this.b;
        if (i < 0) {
            return -1.0f;
        }
        float f = this.delay;
        float f2 = this.duration;
        return f + f2 + ((this.e + f2) * i);
    }

    public int getRepeatCount() {
        return this.b;
    }

    public float getRepeatDelay() {
        return this.e;
    }

    public int getStep() {
        return this.a;
    }

    public Object getUserData() {
        return this.o;
    }

    public void initializeOverride() {
    }

    public boolean isFinished() {
        return this.j || this.k;
    }

    public boolean isInitialized() {
        return this.i;
    }

    public boolean isPaused() {
        return this.l;
    }

    public boolean isReverse(int i) {
        return this.d && Math.abs(i % 4) == 2;
    }

    public boolean isStarted() {
        return this.h;
    }

    public boolean isValid(int i) {
        return (i >= 0 && i <= this.b * 2) || this.b < 0;
    }

    public boolean isYoyo() {
        return this.d;
    }

    public void kill() {
        this.k = true;
    }

    public void killTarget(Object obj) {
        if (containsTarget(obj)) {
            kill();
        }
    }

    public void pause() {
        this.l = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T repeat(int i, float f) {
        if (this.h) {
            throw new RuntimeException("You can't change the repetitions of a tween or timeline once it is started");
        }
        this.b = i;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.e = f;
        this.d = false;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T repeatYoyo(int i, float f) {
        if (this.h) {
            throw new RuntimeException("You can't change the repetitions of a tween or timeline once it is started");
        }
        this.b = i;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.e = f;
        this.d = true;
        return this;
    }

    public void reset() {
        this.a = -2;
        this.b = 0;
        this.d = false;
        this.c = false;
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = 0.0f;
        this.duration = 0.0f;
        this.delay = 0.0f;
        this.l = false;
        this.k = false;
        this.j = false;
        this.i = false;
        this.h = false;
        this.m = null;
        this.n = 8;
        this.o = null;
        this.q = true;
        this.p = true;
    }

    public void resume() {
        this.l = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T setCallback(TweenCallback tweenCallback) {
        this.m = tweenCallback;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T setCallbackTriggers(int i) {
        this.n = i;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T setUserData(Object obj) {
        this.o = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T start() {
        build();
        this.f = 0.0f;
        this.h = true;
        return this;
    }

    public void update(float f) {
        if (!this.h || this.l || this.k) {
            return;
        }
        this.g = f;
        if (!this.i) {
            a();
        }
        if (this.i) {
            c();
            d();
            b();
        }
        this.f += this.g;
        this.g = 0.0f;
    }

    public void updateOverride(int i, int i2, boolean z, float f) {
    }

    public void killTarget(Object obj, int i) {
        if (containsTarget(obj, i)) {
            kill();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T start(TweenManager tweenManager) {
        tweenManager.add(this);
        return this;
    }
}
