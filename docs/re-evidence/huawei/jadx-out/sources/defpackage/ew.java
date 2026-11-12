package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.animation.content.PathContent;
import com.airbnb.lottie.animation.content.ShapeModifierContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ew implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LottieDrawable f33548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33549c;
    private final boolean e;
    private final fi g;
    private final Path d = new Path();
    private final ej h = new ej();

    public ew(LottieDrawable lottieDrawable, BaseLayer baseLayer, gt gtVar) {
        this.f33547a = gtVar.e();
        this.e = gtVar.c();
        this.f33548b = lottieDrawable;
        fi fiVarCreateAnimation = gtVar.d().createAnimation();
        this.g = fiVarCreateAnimation;
        baseLayer.addAnimation(fiVarCreateAnimation);
        fiVarCreateAnimation.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        b();
    }

    private void b() {
        this.f33549c = false;
        this.f33548b.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof ev) {
                ev evVar = (ev) content;
                if (evVar.e() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.h.e(evVar);
                    evVar.b(this);
                } else if (!(content instanceof ShapeModifierContent)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((ShapeModifierContent) content);
                }
            } else if (!(content instanceof ShapeModifierContent)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((ShapeModifierContent) content);
            }
        }
        this.g.d(arrayList);
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        if (this.f33549c && !this.g.hasValueCallback()) {
            return this.d;
        }
        this.d.reset();
        if (this.e) {
            this.f33549c = true;
            return this.d;
        }
        Path value = this.g.getValue();
        if (value == null) {
            return this.d;
        }
        this.d.set(value);
        this.d.setFillType(Path.FillType.EVEN_ODD);
        this.h.e(this.d);
        this.f33549c = true;
        return this.d;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f33547a;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        jc.d(foVar, i, list, foVar2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        if (t == LottieProperty.PATH) {
            this.g.setValueCallback(jfVar);
        }
    }
}
