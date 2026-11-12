package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class gj implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AnimatableValue<PointF, PointF> f35246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fu f35248c;
    private final AnimatableValue<PointF, PointF> d;
    private final String e;

    public gj(String str, AnimatableValue<PointF, PointF> animatableValue, AnimatableValue<PointF, PointF> animatableValue2, fu fuVar, boolean z) {
        this.e = str;
        this.f35246a = animatableValue;
        this.d = animatableValue2;
        this.f35248c = fuVar;
        this.f35247b = z;
    }

    public String c() {
        return this.e;
    }

    public fu e() {
        return this.f35248c;
    }

    public AnimatableValue<PointF, PointF> d() {
        return this.d;
    }

    public AnimatableValue<PointF, PointF> a() {
        return this.f35246a;
    }

    public boolean b() {
        return this.f35247b;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new et(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.f35246a + ", size=" + this.d + '}';
    }
}
