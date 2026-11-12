package defpackage;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class gr implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fu f35948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gf f35950c;
    private final fu d;
    private final String e;

    public gr(String str, fu fuVar, fu fuVar2, gf gfVar, boolean z) {
        this.e = str;
        this.d = fuVar;
        this.f35948a = fuVar2;
        this.f35950c = gfVar;
        this.f35949b = z;
    }

    public String c() {
        return this.e;
    }

    public fu e() {
        return this.d;
    }

    public fu b() {
        return this.f35948a;
    }

    public gf a() {
        return this.f35950c;
    }

    public boolean d() {
        return this.f35949b;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new es(lottieDrawable, baseLayer, this);
    }
}
