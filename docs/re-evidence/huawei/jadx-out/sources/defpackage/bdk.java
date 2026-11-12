package defpackage;

import com.huawei.animation.physical2.util.FollowHandRate;

/* JADX INFO: loaded from: classes23.dex */
public class bdk implements FollowHandRate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f1043a = 0.75f;
    private float d;
    private float e;

    public bdk(float f, float f2) {
        this.e = f;
        this.d = f2;
    }

    @Override // com.huawei.animation.physical2.util.FollowHandRate
    public float getRate(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("input can not less than zero!!");
        }
        float f2 = this.e;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        float f3 = f / f2;
        if (Float.compare(f3, 1.0f) > 0) {
            f3 = 1.0f;
        }
        return (float) Math.exp(-(((double) this.d) * ((double) (f3 * this.f1043a))));
    }

    public bdk d(float f) {
        this.d = f;
        return this;
    }
}
