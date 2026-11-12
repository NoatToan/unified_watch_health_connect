package defpackage;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class gm implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GradientType f35649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ShapeStroke.LineCapType f35650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ft f35651c;
    private final fz d;
    private final fu e;
    private final boolean f;
    private final ShapeStroke.LineJoinType g;
    private final List<fu> h;
    private final String i;
    private final float j;
    private final fu k;
    private final gb m;
    private final fz n;

    public gm(String str, GradientType gradientType, ft ftVar, gb gbVar, fz fzVar, fz fzVar2, fu fuVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List<fu> list, fu fuVar2, boolean z) {
        this.i = str;
        this.f35649a = gradientType;
        this.f35651c = ftVar;
        this.m = gbVar;
        this.n = fzVar;
        this.d = fzVar2;
        this.k = fuVar;
        this.f35650b = lineCapType;
        this.g = lineJoinType;
        this.j = f;
        this.h = list;
        this.e = fuVar2;
        this.f = z;
    }

    public String h() {
        return this.i;
    }

    public GradientType a() {
        return this.f35649a;
    }

    public ft d() {
        return this.f35651c;
    }

    public gb i() {
        return this.m;
    }

    public fz k() {
        return this.n;
    }

    public fz e() {
        return this.d;
    }

    public fu l() {
        return this.k;
    }

    public ShapeStroke.LineCapType c() {
        return this.f35650b;
    }

    public ShapeStroke.LineJoinType f() {
        return this.g;
    }

    public List<fu> g() {
        return this.h;
    }

    public fu b() {
        return this.e;
    }

    public float j() {
        return this.j;
    }

    public boolean n() {
        return this.f;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new el(lottieDrawable, baseLayer, this);
    }
}
