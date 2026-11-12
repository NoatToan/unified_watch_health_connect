package defpackage;

import com.huawei.dynamicanimation.DynamicAnimation;
import com.huawei.dynamicanimation.SpringModelBase;

/* JADX INFO: loaded from: classes4.dex */
public class cqz extends SpringModelBase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31274c;
    private final DynamicAnimation.c e;

    public cqz(float f, float f2) {
        super(f, f2, f5493a);
        this.f31274c = 0.0f;
        this.e = new DynamicAnimation.c();
    }

    public cqz d() {
        this.f31274c = 0.0f;
        this.e.e = 0.0f;
        this.e.f5489a = 0.0f;
        return this;
    }

    public DynamicAnimation.c b(long j) {
        float f = this.f31274c + j;
        this.f31274c = f;
        float f2 = f / 1000.0f;
        this.e.e = getPosition(f2);
        this.e.f5489a = getVelocity(f2);
        return this.e;
    }
}
