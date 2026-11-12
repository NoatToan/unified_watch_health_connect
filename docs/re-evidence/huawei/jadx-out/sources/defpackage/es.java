package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.content.GreedyContent;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.animation.content.PathContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes21.dex */
public class es implements DrawingContent, PathContent, GreedyContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private em f33401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BaseLayer f33402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33403c;
    private final BaseKeyframeAnimation<Float, Float> d;
    private final LottieDrawable e;
    private final BaseKeyframeAnimation<Float, Float> h;
    private final String i;
    private final fl j;
    private final Matrix g = new Matrix();
    private final Path f = new Path();

    public es(LottieDrawable lottieDrawable, BaseLayer baseLayer, gr grVar) {
        this.e = lottieDrawable;
        this.f33402b = baseLayer;
        this.i = grVar.c();
        this.f33403c = grVar.d();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = grVar.e().createAnimation();
        this.d = baseKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation2 = grVar.b().createAnimation();
        this.h = baseKeyframeAnimationCreateAnimation2;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        fl flVarB = grVar.a().b();
        this.j = flVarB;
        flVarB.b(baseLayer);
        flVarB.b(this);
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public void absorbContent(ListIterator<Content> listIterator) {
        if (this.f33401a != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f33401a = new em(this.e, this.f33402b, "Repeater", this.f33403c, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.i;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        this.f33401a.setContents(list, list2);
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        Path path = this.f33401a.getPath();
        this.f.reset();
        float fFloatValue = this.d.getValue().floatValue();
        float fFloatValue2 = this.h.getValue().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.g.set(this.j.d(i + fFloatValue2));
            this.f.addPath(path, this.g);
        }
        return this.f;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.d.getValue().floatValue();
        float fFloatValue2 = this.h.getValue().floatValue();
        float fFloatValue3 = this.j.d().getValue().floatValue() / 100.0f;
        float fFloatValue4 = this.j.e().getValue().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.g.set(matrix);
            float f = i2;
            this.g.preConcat(this.j.d(f + fFloatValue2));
            this.f33401a.draw(canvas, this.g, (int) (i * jc.a(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f33401a.getBounds(rectF, matrix, z);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        jc.d(foVar, i, list, foVar2, this);
        for (int i2 = 0; i2 < this.f33401a.c().size(); i2++) {
            Content content = this.f33401a.c().get(i2);
            if (content instanceof KeyPathElementContent) {
                jc.d(foVar, i, list, foVar2, (KeyPathElementContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        if (this.j.d(t, jfVar)) {
            return;
        }
        if (t == LottieProperty.REPEATER_COPIES) {
            this.d.setValueCallback(jfVar);
        } else if (t == LottieProperty.REPEATER_OFFSET) {
            this.h.setValueCallback(jfVar);
        }
    }
}
