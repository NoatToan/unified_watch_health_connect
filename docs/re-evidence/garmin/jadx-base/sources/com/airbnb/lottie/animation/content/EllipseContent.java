package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class EllipseContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final float ELLIPSE_CONTROL_POINT_PERCENTAGE = 0.55228f;
    private final CircleShape circleShape;
    private boolean isPathValid;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<?, PointF> positionAnimation;
    private final BaseKeyframeAnimation<?, PointF> sizeAnimation;
    private final Path path = new Path();
    private final CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();

    public EllipseContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, CircleShape circleShape) {
        this.name = circleShape.getName();
        this.lottieDrawable = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation = circleShape.getSize().createAnimation();
        this.sizeAnimation = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = circleShape.getPosition().createAnimation();
        this.positionAnimation = baseKeyframeAnimationCreateAnimation2;
        this.circleShape = circleShape;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t7, LottieValueCallback<T> lottieValueCallback) {
        if (t7 == LottieProperty.ELLIPSE_SIZE) {
            this.sizeAnimation.setValueCallback(lottieValueCallback);
        } else if (t7 == LottieProperty.POSITION) {
            this.positionAnimation.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        boolean z14 = this.isPathValid;
        Path path = this.path;
        if (z14) {
            return path;
        }
        path.reset();
        if (this.circleShape.isHidden()) {
            this.isPathValid = true;
            return this.path;
        }
        PointF value = this.sizeAnimation.getValue();
        float f14 = value.x / 2.0f;
        float f15 = value.y / 2.0f;
        float f16 = f14 * ELLIPSE_CONTROL_POINT_PERCENTAGE;
        float f17 = ELLIPSE_CONTROL_POINT_PERCENTAGE * f15;
        this.path.reset();
        boolean zIsReversed = this.circleShape.isReversed();
        Path path2 = this.path;
        if (zIsReversed) {
            float f18 = -f15;
            path2.moveTo(0.0f, f18);
            float f19 = 0.0f - f16;
            float f22 = -f14;
            float f24 = 0.0f - f17;
            this.path.cubicTo(f19, f18, f22, f24, f22, 0.0f);
            float f25 = f17 + 0.0f;
            this.path.cubicTo(f22, f25, f19, f15, 0.0f, f15);
            float f26 = f16 + 0.0f;
            this.path.cubicTo(f26, f15, f14, f25, f14, 0.0f);
            this.path.cubicTo(f14, f24, f26, f18, 0.0f, f18);
        } else {
            float f27 = -f15;
            path2.moveTo(0.0f, f27);
            float f28 = f16 + 0.0f;
            float f29 = 0.0f - f17;
            this.path.cubicTo(f28, f27, f14, f29, f14, 0.0f);
            float f34 = f17 + 0.0f;
            this.path.cubicTo(f14, f34, f28, f15, 0.0f, f15);
            float f35 = 0.0f - f16;
            float f36 = -f14;
            this.path.cubicTo(f35, f15, f36, f34, f36, 0.0f);
            this.path.cubicTo(f36, f29, f35, f27, 0.0f, f27);
        }
        PointF value2 = this.positionAnimation.getValue();
        this.path.offset(value2.x, value2.y);
        this.path.close();
        this.trimPaths.apply(this.path);
        this.isPathValid = true;
        return this.path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        invalidate();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i14, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i14, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            Content content = list.get(i14);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.trimPaths.addTrimPath(trimPathContent);
                    trimPathContent.addListener(this);
                }
            }
        }
    }
}
