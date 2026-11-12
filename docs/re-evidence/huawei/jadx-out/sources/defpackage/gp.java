package defpackage;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class gp implements ContentModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AnimatableValue<Float, Float> f35876c;
    private final String e;

    public gp(String str, AnimatableValue<Float, Float> animatableValue) {
        this.e = str;
        this.f35876c = animatableValue;
    }

    public String e() {
        return this.e;
    }

    public AnimatableValue<Float, Float> d() {
        return this.f35876c;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new eq(lottieDrawable, baseLayer, this);
    }
}
