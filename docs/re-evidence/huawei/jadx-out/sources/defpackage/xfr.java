package defpackage;

import android.view.animation.AnimationUtils;
import com.huawei.dynamicanimation.SpringModelBase;

/* JADX INFO: loaded from: classes20.dex */
public class xfr extends SpringModelBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f52845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f52846c;
    private long d;
    private float e;

    public xfr(float f, float f2, float f3, float f4, float f5) {
        super(f, f2, 0.001f);
        this.e = f3;
        this.f52845b = f3;
        this.f52846c = f5;
        setValueThreshold(1.0f);
        d(0.0f);
        a(f4 - this.e, f5, -1L);
        this.d = AnimationUtils.currentAnimationTimeMillis();
    }

    public float d() {
        return this.f52845b;
    }

    public boolean e() {
        float fCurrentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - this.d) / 1000.0f;
        this.f52846c = getVelocity(fCurrentAnimationTimeMillis);
        float position = getPosition(fCurrentAnimationTimeMillis);
        float f = this.e;
        float f2 = position + f;
        this.f52845b = f2;
        if (!isAtEquilibrium(f2 - f, this.f52846c)) {
            return false;
        }
        this.f52845b = getEndPosition() + this.e;
        this.f52846c = 0.0f;
        return true;
    }

    public void b(long j) {
        this.d -= j;
    }
}
