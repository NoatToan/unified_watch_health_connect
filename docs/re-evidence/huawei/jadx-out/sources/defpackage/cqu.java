package defpackage;

import android.util.Log;
import com.huawei.dynamicanimation.PhysicalModelBase;

/* JADX INFO: loaded from: classes4.dex */
public class cqu extends PhysicalModelBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f31263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f31264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31265c;
    private float d;
    private float e;
    private boolean f;
    private float i;

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public float getAcceleration() {
        return 0.0f;
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public float getAcceleration(float f) {
        return 0.0f;
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public boolean isAtEquilibrium(float f) {
        return false;
    }

    public cqu(float f, float f2) {
        this(f, f2, 0.75f);
    }

    public cqu(float f, float f2, float f3) {
        this.f31264b = 0.0f;
        this.f = true;
        super.setValueThreshold(f3);
        a(f);
        d(f2);
    }

    private void e() {
        if (this.f) {
            d();
            float fLog = ((float) (Math.log(this.mVelocityThreshold / this.e) / ((double) this.d))) * 1000.0f;
            this.f31263a = fLog;
            float fMax = Math.max(fLog, 0.0f);
            this.f31263a = fMax;
            this.f31265c = getPosition(fMax / 1000.0f);
            this.f = false;
            Log.i("FlingModelBase", "reset: estimateTime=" + this.f31263a + ",estimateValue=" + this.f31265c);
        }
    }

    public void d() {
        if (crf.a(this.e)) {
            throw new UnsupportedOperationException("InitVelocity should be set and can not be 0!!");
        }
        if (crf.a(this.d)) {
            throw new UnsupportedOperationException("Friction should be set and can not be 0!!");
        }
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public float getPosition(float f) {
        this.f31264b = f;
        float f2 = this.i;
        float f3 = this.e;
        float f4 = this.d;
        return f2 * ((float) (((double) (f3 / f4)) * (Math.exp(f4 * f) - 1.0d)));
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public float getPosition() {
        return getPosition(this.f31264b);
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public float getVelocity(float f) {
        return this.i * ((float) (((double) this.e) * Math.exp(this.d * f)));
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public float getVelocity() {
        return getVelocity(this.f31264b);
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public boolean isAtEquilibrium() {
        return this.e < this.mVelocityThreshold;
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public boolean isAtEquilibrium(float f, float f2) {
        return Math.abs(f - getEndPosition()) < this.mValueThreshold && Math.abs(f2) < this.mVelocityThreshold;
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public float getEstimatedDuration() {
        e();
        return this.f31263a;
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public float getEndPosition() {
        e();
        return this.f31265c;
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public final PhysicalModelBase setValueThreshold(float f) {
        super.setValueThreshold(f);
        this.f = true;
        return this;
    }

    public final <T extends PhysicalModelBase> T a(float f) {
        this.e = Math.abs(f);
        this.i = Math.signum(f);
        this.f = true;
        return this;
    }

    public final <T extends PhysicalModelBase> T d(float f) {
        this.d = f * (-4.2f);
        this.f = true;
        return this;
    }

    @Override // com.huawei.dynamicanimation.PhysicalModelBase, com.huawei.dynamicanimation.PhysicalModel
    public float getMaxAbsX() {
        e();
        return this.f31265c;
    }
}
