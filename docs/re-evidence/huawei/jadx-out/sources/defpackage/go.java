package defpackage;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class go implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ContentModel> f35864a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35865c;
    private final boolean d;

    public go(String str, List<ContentModel> list, boolean z) {
        this.f35865c = str;
        this.f35864a = list;
        this.d = z;
    }

    public String a() {
        return this.f35865c;
    }

    public List<ContentModel> b() {
        return this.f35864a;
    }

    public boolean d() {
        return this.d;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new em(lottieDrawable, baseLayer, this, cxVar);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f35865c + "' Shapes: " + Arrays.toString(this.f35864a.toArray()) + '}';
    }
}
