package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.BaseStrokeContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class ey extends BaseStrokeContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BaseLayer f33663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> f33665c;
    private final BaseKeyframeAnimation<Integer, Integer> d;
    private final String e;

    public ey(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeStroke shapeStroke) {
        super(lottieDrawable, baseLayer, shapeStroke.a().toPaintCap(), shapeStroke.b().toPaintJoin(), shapeStroke.h(), shapeStroke.j(), shapeStroke.i(), shapeStroke.d(), shapeStroke.c());
        this.f33663a = baseLayer;
        this.e = shapeStroke.g();
        this.f33664b = shapeStroke.f();
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = shapeStroke.e().createAnimation();
        this.d = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (this.f33664b) {
            return;
        }
        this.paint.setColor(((ex) this.d).b());
        if (this.f33665c != null) {
            this.paint.setColorFilter(this.f33665c.getValue());
        }
        super.draw(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.e;
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        super.addValueCallback(t, jfVar);
        if (t == LottieProperty.STROKE_COLOR) {
            this.d.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f33665c;
            if (baseKeyframeAnimation != null) {
                this.f33663a.removeAnimation(baseKeyframeAnimation);
            }
            if (jfVar == null) {
                this.f33665c = null;
                return;
            }
            fm fmVar = new fm(jfVar);
            this.f33665c = fmVar;
            fmVar.addUpdateListener(this);
            this.f33663a.addAnimation(this.d);
        }
    }
}
