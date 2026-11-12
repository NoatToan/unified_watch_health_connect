package defpackage;

import com.airbnb.lottie.animation.keyframe.KeyframeAnimation;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ez extends KeyframeAnimation<gl> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gl f33712b;

    public ez(List<jb<gl>> list) {
        super(list);
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            gl glVar = list.get(i).j;
            if (glVar != null) {
                iMax = Math.max(iMax, glVar.c());
            }
        }
        this.f33712b = new gl(new float[iMax], new int[iMax]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public gl getValue(jb<gl> jbVar, float f) {
        this.f33712b.e(jbVar.j, jbVar.f38328b, f);
        return this.f33712b;
    }
}
