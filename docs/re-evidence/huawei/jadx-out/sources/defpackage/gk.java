package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class gk implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path.FillType f35352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GradientType f35354c;
    private final ft d;
    private final fz e;
    private final fu f;
    private final fu g;
    private final String h;
    private final gb i;
    private final fz j;

    public gk(String str, GradientType gradientType, Path.FillType fillType, ft ftVar, gb gbVar, fz fzVar, fz fzVar2, fu fuVar, fu fuVar2, boolean z) {
        this.f35354c = gradientType;
        this.f35352a = fillType;
        this.d = ftVar;
        this.i = gbVar;
        this.j = fzVar;
        this.e = fzVar2;
        this.h = str;
        this.f = fuVar;
        this.g = fuVar2;
        this.f35353b = z;
    }

    public String c() {
        return this.h;
    }

    public GradientType d() {
        return this.f35354c;
    }

    public Path.FillType b() {
        return this.f35352a;
    }

    public ft a() {
        return this.d;
    }

    public gb j() {
        return this.i;
    }

    public fz g() {
        return this.j;
    }

    public fz e() {
        return this.e;
    }

    public boolean i() {
        return this.f35353b;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new ek(lottieDrawable, cxVar, baseLayer, this);
    }
}
