package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class gi implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f35160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fz f35162c;
    private final AnimatableValue<PointF, PointF> d;
    private final String e;

    public gi(String str, AnimatableValue<PointF, PointF> animatableValue, fz fzVar, boolean z, boolean z2) {
        this.e = str;
        this.d = animatableValue;
        this.f35162c = fzVar;
        this.f35161b = z;
        this.f35160a = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new eo(lottieDrawable, baseLayer, this);
    }

    public String e() {
        return this.e;
    }

    public AnimatableValue<PointF, PointF> b() {
        return this.d;
    }

    public fz c() {
        return this.f35162c;
    }

    public boolean a() {
        return this.f35161b;
    }

    public boolean d() {
        return this.f35160a;
    }
}
