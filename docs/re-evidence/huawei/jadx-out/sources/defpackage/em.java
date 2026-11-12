package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.content.GreedyContent;
import com.airbnb.lottie.animation.content.PathContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class em implements DrawingContent, PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LottieDrawable f33163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33165c;
    private final Matrix d;
    private final List<Content> e;
    private List<PathContent> f;
    private final Paint g;
    private final RectF h;
    private final Path i;
    private final RectF j;
    private fl n;

    private static List<Content> b(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer, List<ContentModel> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i).toContent(lottieDrawable, cxVar, baseLayer);
            if (content != null) {
                arrayList.add(content);
            }
        }
        return arrayList;
    }

    static gf a(List<ContentModel> list) {
        for (int i = 0; i < list.size(); i++) {
            ContentModel contentModel = list.get(i);
            if (contentModel instanceof gf) {
                return (gf) contentModel;
            }
        }
        return null;
    }

    public em(LottieDrawable lottieDrawable, BaseLayer baseLayer, go goVar, cx cxVar) {
        this(lottieDrawable, baseLayer, goVar.a(), goVar.d(), b(lottieDrawable, cxVar, baseLayer, goVar.b()), a(goVar.b()));
    }

    em(LottieDrawable lottieDrawable, BaseLayer baseLayer, String str, boolean z, List<Content> list, gf gfVar) {
        this.g = new ef();
        this.j = new RectF();
        this.d = new Matrix();
        this.i = new Path();
        this.h = new RectF();
        this.f33165c = str;
        this.f33163a = lottieDrawable;
        this.f33164b = z;
        this.e = list;
        if (gfVar != null) {
            fl flVarB = gfVar.b();
            this.n = flVarB;
            flVarB.b(baseLayer);
            this.n.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof GreedyContent) {
                arrayList.add((GreedyContent) content);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((GreedyContent) arrayList.get(size2)).absorbContent(list.listIterator(list.size()));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f33163a.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f33165c;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.e.size());
        arrayList.addAll(list);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Content content = this.e.get(size);
            content.setContents(arrayList, this.e.subList(0, size));
            arrayList.add(content);
        }
    }

    public List<Content> c() {
        return this.e;
    }

    List<PathContent> e() {
        if (this.f == null) {
            this.f = new ArrayList();
            for (int i = 0; i < this.e.size(); i++) {
                Content content = this.e.get(i);
                if (content instanceof PathContent) {
                    this.f.add((PathContent) content);
                }
            }
        }
        return this.f;
    }

    Matrix a() {
        fl flVar = this.n;
        if (flVar != null) {
            return flVar.a();
        }
        this.d.reset();
        return this.d;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        this.d.reset();
        fl flVar = this.n;
        if (flVar != null) {
            this.d.set(flVar.a());
        }
        this.i.reset();
        if (this.f33164b) {
            return this.i;
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Content content = this.e.get(size);
            if (content instanceof PathContent) {
                this.i.addPath(((PathContent) content).getPath(), this.d);
            }
        }
        return this.i;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (this.f33164b) {
            return;
        }
        this.d.set(matrix);
        fl flVar = this.n;
        if (flVar != null) {
            this.d.preConcat(flVar.a());
            i = (int) (((((this.n.c() == null ? 100 : this.n.c().getValue().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.f33163a.v() && b() && i != 255;
        if (z) {
            this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
            getBounds(this.j, this.d, true);
            this.g.setAlpha(i);
            je.e(canvas, this.j, this.g);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Content content = this.e.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).draw(canvas, this.d, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    private boolean b() {
        int i = 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            if ((this.e.get(i2) instanceof DrawingContent) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.d.set(matrix);
        fl flVar = this.n;
        if (flVar != null) {
            this.d.preConcat(flVar.a());
        }
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Content content = this.e.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).getBounds(this.h, this.d, z);
                rectF.union(this.h);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        if (foVar.b(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                foVar2 = foVar2.c(getName());
                if (foVar.e(getName(), i)) {
                    list.add(foVar2.e(this));
                }
            }
            if (foVar.c(getName(), i)) {
                int iA = foVar.a(getName(), i);
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    Content content = this.e.get(i2);
                    if (content instanceof KeyPathElement) {
                        ((KeyPathElement) content).resolveKeyPath(foVar, i + iA, list, foVar2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        fl flVar = this.n;
        if (flVar != null) {
            flVar.d(t, jfVar);
        }
    }
}
