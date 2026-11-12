package defpackage;

import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ev implements Content, BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BaseKeyframeAnimation<?, Float> f33505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<BaseKeyframeAnimation.AnimationListener> f33506b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BaseKeyframeAnimation<?, Float> f33507c;
    private final boolean d;
    private final String e;
    private final ShapeTrimPath.Type h;
    private final BaseKeyframeAnimation<?, Float> i;

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    public ev(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
        this.e = shapeTrimPath.c();
        this.d = shapeTrimPath.j();
        this.h = shapeTrimPath.d();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = shapeTrimPath.b().createAnimation();
        this.i = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation2 = shapeTrimPath.a().createAnimation();
        this.f33507c = baseKeyframeAnimationCreateAnimation2;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation3 = shapeTrimPath.e().createAnimation();
        this.f33505a = baseKeyframeAnimationCreateAnimation3;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        for (int i = 0; i < this.f33506b.size(); i++) {
            this.f33506b.get(i).onValueChanged();
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.e;
    }

    public void b(BaseKeyframeAnimation.AnimationListener animationListener) {
        this.f33506b.add(animationListener);
    }

    public ShapeTrimPath.Type e() {
        return this.h;
    }

    public BaseKeyframeAnimation<?, Float> a() {
        return this.i;
    }

    public BaseKeyframeAnimation<?, Float> d() {
        return this.f33507c;
    }

    public BaseKeyframeAnimation<?, Float> c() {
        return this.f33505a;
    }

    public boolean b() {
        return this.d;
    }
}
