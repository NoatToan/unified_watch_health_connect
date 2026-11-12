package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
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
public class eo implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gi f33263b;
    private final LottieDrawable d;
    private boolean e;
    private final BaseKeyframeAnimation<?, PointF> g;
    private final BaseKeyframeAnimation<?, PointF> j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f33264c = new Path();
    private final ej f = new ej();

    public eo(LottieDrawable lottieDrawable, BaseLayer baseLayer, gi giVar) {
        this.f33262a = giVar.e();
        this.d = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation = giVar.c().createAnimation();
        this.g = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = giVar.b().createAnimation();
        this.j = baseKeyframeAnimationCreateAnimation2;
        this.f33263b = giVar;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        e();
    }

    private void e() {
        this.e = false;
        this.d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof ev) {
                ev evVar = (ev) content;
                if (evVar.e() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f.e(evVar);
                    evVar.b(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f33262a;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        if (this.e) {
            return this.f33264c;
        }
        this.f33264c.reset();
        if (this.f33263b.d()) {
            this.e = true;
            return this.f33264c;
        }
        PointF value = this.g.getValue();
        float f = value.x / 2.0f;
        float f2 = value.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f33264c.reset();
        if (this.f33263b.a()) {
            float f5 = -f2;
            this.f33264c.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f33264c.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f33264c.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f33264c.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f33264c.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f33264c.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f33264c.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f33264c.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f33264c.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f33264c.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF value2 = this.j.getValue();
        this.f33264c.offset(value2.x, value2.y);
        this.f33264c.close();
        this.f.e(this.f33264c);
        this.e = true;
        return this.f33264c;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        jc.d(foVar, i, list, foVar2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        if (t == LottieProperty.ELLIPSE_SIZE) {
            this.g.setValueCallback(jfVar);
        } else if (t == LottieProperty.POSITION) {
            this.j.setValueCallback(jfVar);
        }
    }
}
