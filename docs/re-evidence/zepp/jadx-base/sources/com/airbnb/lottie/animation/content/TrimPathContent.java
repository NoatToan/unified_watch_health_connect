package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TrimPathContent implements Content, BaseKeyframeAnimation.AnimationListener {
    private final String a;
    private final boolean b;
    private final List<BaseKeyframeAnimation.AnimationListener> c = new ArrayList();
    private final ShapeTrimPath.Type d;
    private final BaseKeyframeAnimation<?, Float> e;
    private final BaseKeyframeAnimation<?, Float> f;
    private final BaseKeyframeAnimation<?, Float> g;

    public TrimPathContent(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
        this.a = shapeTrimPath.getName();
        this.b = shapeTrimPath.isHidden();
        this.d = shapeTrimPath.getType();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = shapeTrimPath.getStart().createAnimation();
        this.e = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation2 = shapeTrimPath.getEnd().createAnimation();
        this.f = baseKeyframeAnimationCreateAnimation2;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation3 = shapeTrimPath.getOffset().createAnimation();
        this.g = baseKeyframeAnimationCreateAnimation3;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
    }

    public void a(BaseKeyframeAnimation.AnimationListener animationListener) {
        this.c.add(animationListener);
    }

    public ShapeTrimPath.Type b() {
        return this.d;
    }

    public BaseKeyframeAnimation<?, Float> getEnd() {
        return this.f;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.a;
    }

    public BaseKeyframeAnimation<?, Float> getOffset() {
        return this.g;
    }

    public BaseKeyframeAnimation<?, Float> getStart() {
        return this.e;
    }

    public boolean isHidden() {
        return this.b;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).onValueChanged();
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }
}
