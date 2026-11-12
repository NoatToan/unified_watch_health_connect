package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.graphics.PaintCompat;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.animation.content.PathContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class en implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private eu f33215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BaseKeyframeAnimation<Integer, Integer> f33216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> f33217c;
    float d;
    private BaseKeyframeAnimation<Float, Float> e;
    private final LottieDrawable f;
    private final String g;
    private final BaseKeyframeAnimation<Integer, Integer> h;
    private final BaseLayer i;
    private final boolean j;
    private final List<PathContent> k;
    private final Path n;
    private final Paint o;

    public en(LottieDrawable lottieDrawable, BaseLayer baseLayer, gn gnVar) {
        Path path = new Path();
        this.n = path;
        ef efVar = new ef(1);
        this.o = efVar;
        this.k = new ArrayList();
        this.i = baseLayer;
        this.g = gnVar.e();
        this.j = gnVar.c();
        this.f = lottieDrawable;
        if (baseLayer.getBlurEffect() != null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = baseLayer.getBlurEffect().b().createAnimation();
            this.e = baseKeyframeAnimationCreateAnimation;
            baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.e);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.f33215a = new eu(this, baseLayer, baseLayer.getDropShadowEffect());
        }
        if (gnVar.a() == null || gnVar.b() == null) {
            this.f33216b = null;
            this.h = null;
            return;
        }
        PaintCompat.setBlendMode(efVar, baseLayer.getBlendMode().toNativeBlendMode());
        path.setFillType(gnVar.d());
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation2 = gnVar.a().createAnimation();
        this.f33216b = baseKeyframeAnimationCreateAnimation2;
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation3 = gnVar.b().createAnimation();
        this.h = baseKeyframeAnimationCreateAnimation3;
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = list2.get(i);
            if (content instanceof PathContent) {
                this.k.add((PathContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.g;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (this.j) {
            return;
        }
        if (cv.e()) {
            cv.c("FillContent#draw");
        }
        this.o.setColor((jc.b((int) ((((i / 255.0f) * this.h.getValue().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((ex) this.f33216b).b() & ViewCompat.MEASURED_SIZE_MASK));
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f33217c;
        if (baseKeyframeAnimation != null) {
            this.o.setColorFilter(baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.e;
        if (baseKeyframeAnimation2 != null) {
            float fFloatValue = baseKeyframeAnimation2.getValue().floatValue();
            if (fFloatValue == 0.0f) {
                this.o.setMaskFilter(null);
            } else if (fFloatValue != this.d) {
                this.o.setMaskFilter(this.i.getBlurMaskFilter(fFloatValue));
            }
            this.d = fFloatValue;
        }
        eu euVar = this.f33215a;
        if (euVar != null) {
            euVar.d(this.o);
        }
        this.n.reset();
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            this.n.addPath(this.k.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.n, this.o);
        if (cv.e()) {
            cv.e("FillContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.n.reset();
        for (int i = 0; i < this.k.size(); i++) {
            this.n.addPath(this.k.get(i).getPath(), matrix);
        }
        this.n.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        jc.d(foVar, i, list, foVar2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        eu euVar;
        eu euVar2;
        eu euVar3;
        eu euVar4;
        eu euVar5;
        if (t == LottieProperty.COLOR) {
            this.f33216b.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.OPACITY) {
            this.h.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f33217c;
            if (baseKeyframeAnimation != null) {
                this.i.removeAnimation(baseKeyframeAnimation);
            }
            if (jfVar == null) {
                this.f33217c = null;
                return;
            }
            fm fmVar = new fm(jfVar);
            this.f33217c = fmVar;
            fmVar.addUpdateListener(this);
            this.i.addAnimation(this.f33217c);
            return;
        }
        if (t == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.e;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(jfVar);
                return;
            }
            fm fmVar2 = new fm(jfVar);
            this.e = fmVar2;
            fmVar2.addUpdateListener(this);
            this.i.addAnimation(this.e);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_COLOR && (euVar5 = this.f33215a) != null) {
            euVar5.c(jfVar);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_OPACITY && (euVar4 = this.f33215a) != null) {
            euVar4.d((jf<Float>) jfVar);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_DIRECTION && (euVar3 = this.f33215a) != null) {
            euVar3.b(jfVar);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_DISTANCE && (euVar2 = this.f33215a) != null) {
            euVar2.a(jfVar);
        } else {
            if (t != LottieProperty.DROP_SHADOW_RADIUS || (euVar = this.f33215a) == null) {
                return;
            }
            euVar.e(jfVar);
        }
    }
}
