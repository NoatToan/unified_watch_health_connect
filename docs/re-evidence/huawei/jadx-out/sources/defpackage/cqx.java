package defpackage;

import com.huawei.dynamicanimation.AnimationHandler;
import com.huawei.dynamicanimation.DynamicAnimation;
import com.huawei.dynamicanimation.FloatPropertyCompat;

/* JADX INFO: loaded from: classes4.dex */
public class cqx extends DynamicAnimation<cqx> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cqz f31269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f31270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31271c;
    private float d;

    @Override // com.huawei.dynamicanimation.DynamicAnimation
    public float getAcceleration(float f, float f2) {
        return 0.0f;
    }

    public <K> cqx(K k, FloatPropertyCompat<K> floatPropertyCompat, cqz cqzVar) {
        super(k, floatPropertyCompat);
        this.f31270b = 0.0f;
        this.d = 0.0f;
        this.f31271c = Float.MAX_VALUE;
        this.f31269a = cqzVar;
        if (floatPropertyCompat != null) {
            this.f31270b = floatPropertyCompat.getValue(k);
        }
        this.f31269a.setValueThreshold(getValueThreshold()).d(0.0f);
    }

    public cqx a() {
        this.mTarget = null;
        this.mProperty = null;
        setStartVelocity(0.0f);
        this.d = 0.0f;
        this.f31270b = 0.0f;
        this.f31269a.d().d(0.0f).a(1.0f, 0.0f, -1L);
        AnimationHandler.b().b(this);
        return (cqx) super.clearListeners();
    }

    public <K> cqx d(K k, FloatPropertyCompat<K> floatPropertyCompat, float f, float f2, float f3, float f4) {
        super.setObj(k, floatPropertyCompat);
        setStartVelocity(f4);
        this.d = f3;
        b();
        this.f31269a.d().c(f).e(f2).d(0.0f).a(f3 - this.f31270b, f4, -1L);
        return this;
    }

    private void b() {
        if (this.mTarget != null && this.mProperty != null) {
            this.f31270b = this.mProperty.getValue(this.mTarget);
            return;
        }
        if (this.mProperty == null) {
            final cra craVar = new cra(0.0f);
            this.mProperty = new FloatPropertyCompat("FloatValueHolder") { // from class: cqx.1
                @Override // com.huawei.dynamicanimation.FloatPropertyCompat
                public float getValue(Object obj) {
                    return craVar.getValue();
                }

                @Override // com.huawei.dynamicanimation.FloatPropertyCompat
                public void setValue(Object obj, float f) {
                    craVar.setValue(f);
                }
            };
        } else {
            this.mProperty.setValue(this.mTarget, 0.0f);
        }
        this.f31270b = 0.0f;
    }

    @Override // com.huawei.dynamicanimation.DynamicAnimation
    public boolean updateValueAndVelocity(long j) {
        float f = this.f31271c;
        if (f != Float.MAX_VALUE) {
            this.d = f;
            this.f31271c = Float.MAX_VALUE;
            setStartVelocity(this.mVelocity);
            float value = this.mProperty.getValue(this.mTarget);
            this.f31270b = value;
            this.f31269a.c(this.d - value, this.mVelocity);
            DynamicAnimation.c cVarB = this.f31269a.b(j / 2);
            this.mValue = cVarB.e + this.f31270b;
            this.mVelocity = cVarB.f5489a;
            return false;
        }
        DynamicAnimation.c cVarB2 = this.f31269a.b(j);
        this.mValue = cVarB2.e + this.f31270b;
        this.mVelocity = cVarB2.f5489a;
        if (!isAtEquilibrium(this.mValue - this.f31270b, this.mVelocity)) {
            return false;
        }
        this.mValue = this.f31269a.getEndPosition() + this.f31270b;
        this.mVelocity = 0.0f;
        return true;
    }

    @Override // com.huawei.dynamicanimation.DynamicAnimation
    public void setValueThreshold(float f) {
        this.f31269a.setValueThreshold(f);
    }

    @Override // com.huawei.dynamicanimation.DynamicAnimation
    public void start() {
        super.start();
    }

    @Override // com.huawei.dynamicanimation.DynamicAnimation
    public boolean isAtEquilibrium(float f, float f2) {
        return this.f31269a.isAtEquilibrium(f, f2);
    }

    @Override // com.huawei.dynamicanimation.DynamicAnimation
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public cqx setStartValue(float f) {
        super.setStartValue(f);
        this.f31270b = f;
        float startVelocity = this.f31269a.getStartVelocity();
        this.f31269a.d(0.0f);
        this.f31269a.a(this.d - this.f31270b, startVelocity, -1L);
        return this;
    }

    public cqz e() {
        return this.f31269a;
    }
}
