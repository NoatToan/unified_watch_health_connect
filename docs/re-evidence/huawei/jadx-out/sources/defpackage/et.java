package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.animation.content.PathContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class et implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, PathContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BaseKeyframeAnimation<?, Float> f33438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LottieDrawable f33439c;
    private final boolean d;
    private final String e;
    private final BaseKeyframeAnimation<?, PointF> f;
    private final BaseKeyframeAnimation<?, PointF> i;
    private final Path h = new Path();
    private final RectF g = new RectF();
    private final ej k = new ej();
    private BaseKeyframeAnimation<Float, Float> j = null;

    public et(LottieDrawable lottieDrawable, BaseLayer baseLayer, gj gjVar) {
        this.e = gjVar.c();
        this.d = gjVar.b();
        this.f33439c = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation = gjVar.a().createAnimation();
        this.i = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = gjVar.d().createAnimation();
        this.f = baseKeyframeAnimationCreateAnimation2;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation3 = gjVar.e().createAnimation();
        this.f33438b = baseKeyframeAnimationCreateAnimation3;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.e;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        e();
    }

    private void e() {
        this.f33437a = false;
        this.f33439c.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof ev) {
                ev evVar = (ev) content;
                if (evVar.e() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.k.e(evVar);
                    evVar.b(this);
                } else if (content instanceof eq) {
                    this.j = ((eq) content).b();
                }
            } else if (content instanceof eq) {
                this.j = ((eq) content).b();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation;
        if (this.f33437a) {
            return this.h;
        }
        this.h.reset();
        if (this.d) {
            this.f33437a = true;
            return this.h;
        }
        PointF value = this.f.getValue();
        float f = value.x / 2.0f;
        float f2 = value.y / 2.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f33438b;
        float fA = baseKeyframeAnimation2 == null ? 0.0f : ((fd) baseKeyframeAnimation2).a();
        if (fA == 0.0f && (baseKeyframeAnimation = this.j) != null) {
            fA = Math.min(baseKeyframeAnimation.getValue().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fA > fMin) {
            fA = fMin;
        }
        PointF value2 = this.i.getValue();
        this.h.moveTo(value2.x + f, (value2.y - f2) + fA);
        this.h.lineTo(value2.x + f, (value2.y + f2) - fA);
        if (fA > 0.0f) {
            float f3 = fA * 2.0f;
            this.g.set((value2.x + f) - f3, (value2.y + f2) - f3, value2.x + f, value2.y + f2);
            this.h.arcTo(this.g, 0.0f, 90.0f, false);
        }
        this.h.lineTo((value2.x - f) + fA, value2.y + f2);
        if (fA > 0.0f) {
            float f4 = fA * 2.0f;
            this.g.set(value2.x - f, (value2.y + f2) - f4, (value2.x - f) + f4, value2.y + f2);
            this.h.arcTo(this.g, 90.0f, 90.0f, false);
        }
        this.h.lineTo(value2.x - f, (value2.y - f2) + fA);
        if (fA > 0.0f) {
            float f5 = fA * 2.0f;
            this.g.set(value2.x - f, value2.y - f2, (value2.x - f) + f5, (value2.y - f2) + f5);
            this.h.arcTo(this.g, 180.0f, 90.0f, false);
        }
        this.h.lineTo((value2.x + f) - fA, value2.y - f2);
        if (fA > 0.0f) {
            float f6 = fA * 2.0f;
            this.g.set((value2.x + f) - f6, value2.y - f2, value2.x + f, (value2.y - f2) + f6);
            this.h.arcTo(this.g, 270.0f, 90.0f, false);
        }
        this.h.close();
        this.k.e(this.h);
        this.f33437a = true;
        return this.h;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        jc.d(foVar, i, list, foVar2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        if (t == LottieProperty.RECTANGLE_SIZE) {
            this.f.setValueCallback(jfVar);
        } else if (t == LottieProperty.POSITION) {
            this.i.setValueCallback(jfVar);
        } else if (t == LottieProperty.CORNER_RADIUS) {
            this.f33438b.setValueCallback(jfVar);
        }
    }
}
