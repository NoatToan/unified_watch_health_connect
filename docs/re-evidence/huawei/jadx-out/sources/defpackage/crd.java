package defpackage;

import android.util.Log;
import com.huawei.dynamicanimation.FloatPropertyCompat;
import com.huawei.dynamicanimation.PhysicalModelBase;
import com.huawei.dynamicanimation.SpringModelBase;
import com.huawei.dynamicanimation.interpolator.PhysicalInterpolatorBase;

/* JADX INFO: loaded from: classes4.dex */
public class crd extends PhysicalInterpolatorBase<crd> {
    public crd(cra craVar) {
        super(craVar, (PhysicalModelBase) null);
        SpringModelBase springModelBase = new SpringModelBase(800.0f, 15.0f, getValueThreshold());
        springModelBase.setValueThreshold(Math.abs(1.0f) * SpringModelBase.f5493a);
        springModelBase.d(0.0f);
        springModelBase.a(1.0f, 0.0f, -1L);
        setModel(springModelBase);
    }

    public crd() {
        this(new cra(0.0f));
    }

    public crd(cra craVar, float f, float f2) {
        super(craVar, (PhysicalModelBase) null);
        SpringModelBase springModelBase = new SpringModelBase(f, f2, getValueThreshold());
        springModelBase.setValueThreshold(Math.abs(1.0f) * SpringModelBase.f5493a);
        springModelBase.d(0.0f);
        springModelBase.a(1.0f, 0.0f, -1L);
        setModel(springModelBase);
    }

    public crd(float f, float f2) {
        this(new cra(0.0f), f, f2);
    }

    public crd(cra craVar, float f, float f2, float f3) {
        super(craVar, (PhysicalModelBase) null);
        SpringModelBase springModelBase = new SpringModelBase(f, f2, getValueThreshold());
        springModelBase.setValueThreshold(Math.abs(f3 - 0.0f) * SpringModelBase.f5493a);
        springModelBase.d(0.0f);
        springModelBase.a(f3, 0.0f, -1L);
        setModel(springModelBase);
    }

    public crd(float f, float f2, float f3) {
        this(new cra(0.0f), f, f2, f3);
    }

    public crd(cra craVar, float f, float f2, float f3, float f4) {
        super(craVar, (PhysicalModelBase) null);
        SpringModelBase springModelBase = new SpringModelBase(f, f2, getValueThreshold());
        springModelBase.setValueThreshold(Math.abs(f3 - 0.0f) * SpringModelBase.f5493a);
        springModelBase.d(0.0f);
        springModelBase.a(f3, f4, -1L);
        setModel(springModelBase);
    }

    public crd(float f, float f2, float f3, float f4) {
        this(new cra(0.0f), f, f2, f3, f4);
    }

    public crd(cra craVar, float f, float f2, float f3, float f4, float f5) {
        super(craVar, (PhysicalModelBase) null);
        SpringModelBase springModelBase = new SpringModelBase(f, f2, f5 * 0.75f);
        springModelBase.d(0.0f);
        springModelBase.a(f3, f4, -1L);
        setModel(springModelBase);
    }

    public crd(float f, float f2, float f3, float f4, float f5) {
        this(new cra(0.0f), f, f2, f3, f4, f5);
    }

    public <K> crd(FloatPropertyCompat<K> floatPropertyCompat, float f, float f2, float f3) {
        super(floatPropertyCompat, (PhysicalModelBase) null);
        SpringModelBase springModelBase = new SpringModelBase(f, f2, getValueThreshold());
        springModelBase.d(0.0f);
        springModelBase.a(f3, 0.0f, -1L);
        setModel(springModelBase);
    }

    public <K> crd(FloatPropertyCompat<K> floatPropertyCompat, float f, float f2, float f3, float f4) {
        super(floatPropertyCompat, (PhysicalModelBase) null);
        SpringModelBase springModelBase = new SpringModelBase(f, f2, getValueThreshold());
        springModelBase.d(0.0f);
        springModelBase.a(f3, f4, -1L);
        setModel(springModelBase);
    }

    @Override // com.huawei.dynamicanimation.interpolator.PhysicalInterpolatorBase
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public crd setValueThreshold(float f) {
        PhysicalModelBase model = getModel();
        if (model == null) {
            return this;
        }
        model.setValueThreshold(f * 0.75f);
        return this;
    }

    @Override // com.huawei.dynamicanimation.interpolator.PhysicalInterpolatorBase
    public float getEndOffset() {
        return getModel().getEndPosition() - getModel().getStartPosition();
    }

    @Override // com.huawei.dynamicanimation.interpolator.PhysicalInterpolatorBase, android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        super.getInterpolation(f);
        if (Float.compare(f, 1.0f) == 0) {
            return 1.0f;
        }
        float duration = (f * getDuration()) / 1000.0f;
        float position = getModel().getPosition(duration);
        if (getModel().isAtEquilibrium(duration)) {
            Log.i("SpringInterpolator", "done at" + duration + "");
        }
        float endPosition = getModel().getEndPosition() - getModel().getStartPosition();
        float fAbs = (getModel() instanceof SpringModelBase ? Math.abs(((SpringModelBase) getModel()).a()) : 0.0f) + endPosition;
        return crf.a(endPosition) ? (position + fAbs) / fAbs : position / endPosition;
    }
}
