package defpackage;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class gt implements ContentModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fy f36013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36014c;
    private final String d;
    private final boolean e;

    public gt(String str, int i, fy fyVar, boolean z) {
        this.d = str;
        this.f36014c = i;
        this.f36013b = fyVar;
        this.e = z;
    }

    public String e() {
        return this.d;
    }

    public fy d() {
        return this.f36013b;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new ew(lottieDrawable, baseLayer, this);
    }

    public boolean c() {
        return this.e;
    }

    public String toString() {
        return "ShapePath{name=" + this.d + ", index=" + this.f36014c + '}';
    }
}
