package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ShapeModifierContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class eq implements ShapeModifierContent, BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BaseKeyframeAnimation<Float, Float> f33347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gq f33348c;
    private final LottieDrawable e;

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    public eq(LottieDrawable lottieDrawable, BaseLayer baseLayer, gp gpVar) {
        this.e = lottieDrawable;
        this.f33346a = gpVar.e();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = gpVar.d().createAnimation();
        this.f33347b = baseKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f33346a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.e.invalidateSelf();
    }

    public BaseKeyframeAnimation<Float, Float> b() {
        return this.f33347b;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public gq modifyShape(gq gqVar) {
        boolean z;
        int i;
        List<fr> listA = gqVar.a();
        if (listA.size() > 2) {
            float fFloatValue = this.f33347b.getValue().floatValue();
            if (fFloatValue != 0.0f) {
                gq gqVarB = b(gqVar);
                gqVarB.e(gqVar.e().x, gqVar.e().y);
                List<fr> listA2 = gqVarB.a();
                boolean zD = gqVar.d();
                int i2 = 0;
                int i3 = 0;
                while (i2 < listA.size()) {
                    fr frVar = listA.get(i2);
                    fr frVar2 = listA.get(a(i2 - 1, listA.size()));
                    fr frVar3 = listA.get(a(i2 - 2, listA.size()));
                    PointF pointFC = (i2 != 0 || zD) ? frVar2.c() : gqVar.e();
                    PointF pointFB = (i2 != 0 || zD) ? frVar2.b() : pointFC;
                    PointF pointFA = frVar.a();
                    PointF pointFC2 = frVar3.c();
                    PointF pointFC3 = frVar.c();
                    if (gqVar.d()) {
                        z = false;
                    } else {
                        z = true;
                        if (i2 != 0 && i2 != listA.size() - 1) {
                            z = false;
                        }
                    }
                    if (pointFB.equals(pointFC) && pointFA.equals(pointFC) && !z) {
                        float f = pointFC.x;
                        float f2 = pointFC2.x;
                        float f3 = pointFC.y;
                        float f4 = pointFC2.y;
                        float f5 = pointFC3.x;
                        float f6 = pointFC.x;
                        float f7 = pointFC3.y;
                        float f8 = pointFC.y;
                        i = i2;
                        float fHypot = (float) Math.hypot(f - f2, f3 - f4);
                        float fHypot2 = (float) Math.hypot(f5 - f6, f7 - f8);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f9 = pointFC.x + ((pointFC2.x - pointFC.x) * fMin);
                        float f10 = pointFC.y + ((pointFC2.y - pointFC.y) * fMin);
                        float f11 = pointFC.x + ((pointFC3.x - pointFC.x) * fMin2);
                        float f12 = pointFC.y + ((pointFC3.y - pointFC.y) * fMin2);
                        float f13 = pointFC.x;
                        float f14 = pointFC.y;
                        float f15 = pointFC.x;
                        float f16 = pointFC.y;
                        fr frVar4 = listA2.get(a(i3 - 1, listA2.size()));
                        fr frVar5 = listA2.get(i3);
                        frVar4.b(f9, f10);
                        frVar4.a(f9, f10);
                        if (i == 0) {
                            gqVarB.e(f9, f10);
                        }
                        frVar5.e(f9 - ((f9 - f13) * 0.5519f), f10 - ((f10 - f14) * 0.5519f));
                        fr frVar6 = listA2.get(i3 + 1);
                        frVar5.b(f11 - ((f11 - f15) * 0.5519f), f12 - ((f12 - f16) * 0.5519f));
                        frVar5.a(f11, f12);
                        frVar6.e(f11, f12);
                        i3 += 2;
                    } else {
                        i = i2;
                        fr frVar7 = listA2.get(a(i3 - 1, listA2.size()));
                        fr frVar8 = listA2.get(i3);
                        frVar7.b(frVar2.b().x, frVar2.b().y);
                        frVar7.a(frVar2.c().x, frVar2.c().y);
                        frVar8.e(frVar.a().x, frVar.a().y);
                        i3++;
                    }
                    i2 = i + 1;
                    listA = listA;
                    zD = zD;
                }
                return gqVarB;
            }
        }
        return gqVar;
    }

    private gq b(gq gqVar) {
        List<fr> listA = gqVar.a();
        boolean zD = gqVar.d();
        int size = listA.size() - 1;
        int i = 0;
        while (size >= 0) {
            fr frVar = listA.get(size);
            fr frVar2 = listA.get(a(size - 1, listA.size()));
            PointF pointFC = (size != 0 || zD) ? frVar2.c() : gqVar.e();
            i = (((size != 0 || zD) ? frVar2.b() : pointFC).equals(pointFC) && frVar.a().equals(pointFC) && !(!gqVar.d() && (size == 0 || size == listA.size() - 1))) ? i + 2 : i + 1;
            size--;
        }
        gq gqVar2 = this.f33348c;
        if (gqVar2 == null || gqVar2.a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new fr());
            }
            this.f33348c = new gq(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f33348c.a(zD);
        return this.f33348c;
    }

    private static int a(int i, int i2) {
        return i - (c(i, i2) * i2);
    }

    private static int c(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}
