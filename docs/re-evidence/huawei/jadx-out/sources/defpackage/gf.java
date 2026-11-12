package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class gf implements ModifierContent, ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gb f35005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AnimatableValue<PointF, PointF> f35006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ga f35007c;
    private boolean d;
    private final fu e;
    private final fu f;
    private final fu g;
    private final fu h;
    private final gc i;
    private final fu j;

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return null;
    }

    public gf() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public gf(ga gaVar, AnimatableValue<PointF, PointF> animatableValue, gc gcVar, fu fuVar, gb gbVar, fu fuVar2, fu fuVar3, fu fuVar4, fu fuVar5) {
        this.d = false;
        this.f35007c = gaVar;
        this.f35006b = animatableValue;
        this.i = gcVar;
        this.h = fuVar;
        this.f35005a = gbVar;
        this.g = fuVar2;
        this.e = fuVar3;
        this.j = fuVar4;
        this.f = fuVar5;
    }

    public void c(boolean z) {
        this.d = z;
    }

    public ga a() {
        return this.f35007c;
    }

    public AnimatableValue<PointF, PointF> c() {
        return this.f35006b;
    }

    public gc g() {
        return this.i;
    }

    public fu h() {
        return this.h;
    }

    public gb e() {
        return this.f35005a;
    }

    public fu j() {
        return this.g;
    }

    public fu d() {
        return this.e;
    }

    public fu i() {
        return this.j;
    }

    public fu f() {
        return this.f;
    }

    public boolean o() {
        return this.d;
    }

    public fl b() {
        return new fl(this);
    }
}
