package defpackage;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.animatable.BaseAnimatableValue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ft extends BaseAnimatableValue<gl, gl> {
    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ List getKeyframes() {
        return super.getKeyframes();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public ft(List<jb<gl>> list) {
        super((List) e(list));
    }

    private static List<jb<gl>> e(List<jb<gl>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, c(list.get(i)));
        }
        return list;
    }

    private static jb<gl> c(jb<gl> jbVar) {
        gl glVar = jbVar.j;
        gl glVar2 = jbVar.f38328b;
        if (glVar == null || glVar2 == null || glVar.d().length == glVar2.d().length) {
            return jbVar;
        }
        float[] fArrC = c(glVar.d(), glVar2.d());
        return jbVar.e(glVar.a(fArrC), glVar2.a(fArrC));
    }

    static float[] c(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<gl, gl> createAnimation() {
        return new ez(this.keyframes);
    }
}
