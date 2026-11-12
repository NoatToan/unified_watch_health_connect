package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.animation.content.PathContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ep implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BaseKeyframeAnimation<?, Float> f33291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BaseKeyframeAnimation<?, Float> f33292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33293c;
    private boolean d;
    private final boolean e;
    private final String f;
    private final LottieDrawable j;
    private final BaseKeyframeAnimation<?, PointF> k;
    private final BaseKeyframeAnimation<?, Float> l;
    private final BaseKeyframeAnimation<?, Float> m;
    private final BaseKeyframeAnimation<?, Float> o;
    private final BaseKeyframeAnimation<?, Float> p;
    private final PolystarShape.Type q;
    private final Path n = new Path();
    private final Path i = new Path();
    private final PathMeasure g = new PathMeasure();
    private final float[] h = new float[2];
    private final ej t = new ej();

    public ep(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.j = lottieDrawable;
        this.f = polystarShape.e();
        PolystarShape.Type typeH = polystarShape.h();
        this.q = typeH;
        this.e = polystarShape.g();
        this.f33293c = polystarShape.m();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = polystarShape.j().createAnimation();
        this.l = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = polystarShape.i().createAnimation();
        this.k = baseKeyframeAnimationCreateAnimation2;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation3 = polystarShape.f().createAnimation();
        this.p = baseKeyframeAnimationCreateAnimation3;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation4 = polystarShape.c().createAnimation();
        this.m = baseKeyframeAnimationCreateAnimation4;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation5 = polystarShape.d().createAnimation();
        this.o = baseKeyframeAnimationCreateAnimation5;
        if (typeH == PolystarShape.Type.STAR) {
            this.f33292b = polystarShape.b().createAnimation();
            this.f33291a = polystarShape.a().createAnimation();
        } else {
            this.f33292b = null;
            this.f33291a = null;
        }
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation4);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation5);
        if (typeH == PolystarShape.Type.STAR) {
            baseLayer.addAnimation(this.f33292b);
            baseLayer.addAnimation(this.f33291a);
        }
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation5.addUpdateListener(this);
        if (typeH == PolystarShape.Type.STAR) {
            this.f33292b.addUpdateListener(this);
            this.f33291a.addUpdateListener(this);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        b();
    }

    private void b() {
        this.d = false;
        this.j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof ev) {
                ev evVar = (ev) content;
                if (evVar.e() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.t.e(evVar);
                    evVar.b(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        if (this.d) {
            return this.n;
        }
        this.n.reset();
        if (this.e) {
            this.d = true;
            return this.n;
        }
        int i = AnonymousClass1.e[this.q.ordinal()];
        if (i == 1) {
            e();
        } else if (i == 2) {
            d();
        }
        this.n.close();
        this.t.e(this.n);
        this.d = true;
        return this.n;
    }

    /* JADX INFO: renamed from: ep$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            e = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f;
    }

    private void e() {
        float f;
        float f2;
        double d;
        float fSin;
        float f3;
        float f4;
        float f5;
        float fFloatValue = this.l.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.p;
        double radians = Math.toRadians((baseKeyframeAnimation == null ? 0.0d : baseKeyframeAnimation.getValue().floatValue()) - 90.0d);
        double d2 = fFloatValue;
        float f6 = (float) (6.283185307179586d / d2);
        if (this.f33293c) {
            f6 *= -1.0f;
        }
        float f7 = f6 / 2.0f;
        float f8 = fFloatValue - ((int) fFloatValue);
        if (f8 != 0.0f) {
            radians += (double) ((1.0f - f8) * f7);
        }
        float fFloatValue2 = this.m.getValue().floatValue();
        float fFloatValue3 = this.f33292b.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f33291a;
        float fFloatValue4 = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.getValue().floatValue() / 100.0f : 0.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.o;
        float fFloatValue5 = baseKeyframeAnimation3 != null ? baseKeyframeAnimation3.getValue().floatValue() / 100.0f : 0.0f;
        if (f8 != 0.0f) {
            f3 = ((fFloatValue2 - fFloatValue3) * f8) + fFloatValue3;
            double d3 = f3;
            float fCos = (float) (d3 * Math.cos(radians));
            fSin = (float) (d3 * Math.sin(radians));
            this.n.moveTo(fCos, fSin);
            d = radians + ((double) ((f6 * f8) / 2.0f));
            f = fCos;
            f2 = f7;
        } else {
            double d4 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d4);
            float fSin2 = (float) (d4 * Math.sin(radians));
            this.n.moveTo(fCos2, fSin2);
            f = fCos2;
            f2 = f7;
            d = radians + ((double) f2);
            fSin = fSin2;
            f3 = 0.0f;
        }
        double dCeil = Math.ceil(d2) * 2.0d;
        int i = 0;
        float f9 = f2;
        float f10 = f;
        boolean z = false;
        while (true) {
            double d5 = i;
            if (d5 < dCeil) {
                float f11 = z ? fFloatValue2 : fFloatValue3;
                float f12 = (f3 == 0.0f || d5 != dCeil - 2.0d) ? f9 : (f6 * f8) / 2.0f;
                if (f3 == 0.0f || d5 != dCeil - 1.0d) {
                    f3 = f11;
                }
                double d6 = f3;
                double d7 = dCeil;
                float fCos3 = (float) (d6 * Math.cos(d));
                float fSin3 = (float) (d6 * Math.sin(d));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    this.n.lineTo(fCos3, fSin3);
                    f4 = fFloatValue4;
                    f5 = fFloatValue5;
                } else {
                    f4 = fFloatValue4;
                    double dAtan2 = (float) (Math.atan2(fSin, f10) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    f5 = fFloatValue5;
                    double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin5 = (float) Math.sin(dAtan3);
                    float f13 = z ? f4 : f5;
                    float f14 = z ? f5 : f4;
                    float f15 = (z ? fFloatValue3 : fFloatValue2) * f13 * 0.47829f;
                    float f16 = fCos4 * f15;
                    float f17 = f15 * fSin4;
                    float f18 = (z ? fFloatValue2 : fFloatValue3) * f14 * 0.47829f;
                    float f19 = fCos5 * f18;
                    float f20 = f18 * fSin5;
                    if (f8 != 0.0f) {
                        if (i == 0) {
                            f16 *= f8;
                            f17 *= f8;
                        } else if (d5 == d7 - 1.0d) {
                            f19 *= f8;
                            f20 *= f8;
                        }
                    }
                    this.n.cubicTo(f10 - f16, fSin - f17, fCos3 + f19, fSin3 + f20, fCos3, fSin3);
                }
                d += (double) f12;
                z = !z;
                i++;
                f10 = fCos3;
                fSin = fSin3;
                fFloatValue5 = f5;
                fFloatValue4 = f4;
                f3 = f3;
                f6 = f6;
                dCeil = d7;
            } else {
                PointF value = this.k.getValue();
                this.n.offset(value.x, value.y);
                this.n.close();
                return;
            }
        }
    }

    private void d() {
        double d;
        float f;
        ep epVar;
        ep epVar2 = this;
        int iFloor = (int) Math.floor(epVar2.l.getValue().floatValue());
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = epVar2.p;
        double radians = Math.toRadians((baseKeyframeAnimation == null ? 0.0d : baseKeyframeAnimation.getValue().floatValue()) - 90.0d);
        double d2 = iFloor;
        float fFloatValue = epVar2.o.getValue().floatValue() / 100.0f;
        float fFloatValue2 = epVar2.m.getValue().floatValue();
        double d3 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d3);
        float fSin = (float) (Math.sin(radians) * d3);
        epVar2.n.moveTo(fCos, fSin);
        double d4 = (float) (6.283185307179586d / d2);
        double dCeil = Math.ceil(d2);
        double d5 = radians + d4;
        int i = 0;
        while (true) {
            double d6 = i;
            if (d6 < dCeil) {
                int i2 = i;
                float fCos2 = (float) (d3 * Math.cos(d5));
                double d7 = d4;
                float fSin2 = (float) (Math.sin(d5) * d3);
                if (fFloatValue != 0.0f) {
                    d = d3;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos3 = (float) Math.cos(dAtan2);
                    float fSin3 = (float) Math.sin(dAtan2);
                    f = fSin2;
                    double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                    float f2 = fFloatValue2 * fFloatValue * 0.25f;
                    float f3 = fCos3 * f2;
                    float f4 = fSin3 * f2;
                    float fCos4 = ((float) Math.cos(dAtan3)) * f2;
                    float fSin4 = f2 * ((float) Math.sin(dAtan3));
                    if (d6 == dCeil - 1.0d) {
                        epVar = this;
                        epVar.i.reset();
                        epVar.i.moveTo(fCos, fSin);
                        float f5 = fCos - f3;
                        float f6 = fSin - f4;
                        float f7 = fCos2 + fCos4;
                        float f8 = fSin4 + f;
                        epVar.i.cubicTo(f5, f6, f7, f8, fCos2, f);
                        epVar.g.setPath(epVar.i, false);
                        PathMeasure pathMeasure = epVar.g;
                        pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, epVar.h, null);
                        Path path = epVar.n;
                        float[] fArr = epVar.h;
                        path.cubicTo(f5, f6, f7, f8, fArr[0], fArr[1]);
                    } else {
                        epVar = this;
                        epVar.n.cubicTo(fCos - f3, fSin - f4, fCos2 + fCos4, f + fSin4, fCos2, f);
                    }
                } else {
                    d = d3;
                    f = fSin2;
                    epVar = epVar2;
                    if (d6 != dCeil - 1.0d) {
                        epVar.n.lineTo(fCos2, f);
                    }
                    fSin = f;
                    fCos = fCos2;
                    d4 = d7;
                    i = i2 + 1;
                    epVar2 = epVar;
                    d3 = d;
                }
                d5 += d7;
                fSin = f;
                fCos = fCos2;
                d4 = d7;
                i = i2 + 1;
                epVar2 = epVar;
                d3 = d;
            } else {
                ep epVar3 = epVar2;
                PointF value = epVar3.k.getValue();
                epVar3.n.offset(value.x, value.y);
                epVar3.n.close();
                return;
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        jc.d(foVar, i, list, foVar2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t == LottieProperty.POLYSTAR_POINTS) {
            this.l.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.POLYSTAR_ROTATION) {
            this.p.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.POSITION) {
            this.k.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.POLYSTAR_INNER_RADIUS && (baseKeyframeAnimation2 = this.f33292b) != null) {
            baseKeyframeAnimation2.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.POLYSTAR_OUTER_RADIUS) {
            this.m.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.POLYSTAR_INNER_ROUNDEDNESS && (baseKeyframeAnimation = this.f33291a) != null) {
            baseKeyframeAnimation.setValueCallback(jfVar);
        } else if (t == LottieProperty.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.o.setValueCallback(jfVar);
        }
    }
}
