package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.BaseLayer;
import j20.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class RoundedCornersContent implements ShapeModifierContent, BaseKeyframeAnimation.AnimationListener {
    private static final float ROUNDED_CORNER_MAGIC_NUMBER = 0.5519f;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<Float, Float> roundedCorners;
    private ShapeData shapeData;

    public RoundedCornersContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RoundedCorners roundedCorners) {
        this.lottieDrawable = lottieDrawable;
        this.name = roundedCorners.getName();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = roundedCorners.getCornerRadius().createAnimation();
        this.roundedCorners = baseKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
    }

    private static int floorDiv(int i14, int i15) {
        int i16 = i14 / i15;
        return ((i14 ^ i15) >= 0 || i15 * i16 == i14) ? i16 : i16 - 1;
    }

    private static int floorMod(int i14, int i15) {
        return i14 - (floorDiv(i14, i15) * i15);
    }

    private ShapeData getShapeData(ShapeData shapeData) {
        List<CubicCurveData> curves = shapeData.getCurves();
        boolean zIsClosed = shapeData.isClosed();
        int size = curves.size() - 1;
        int i14 = 0;
        while (size >= 0) {
            CubicCurveData cubicCurveData = curves.get(size);
            CubicCurveData cubicCurveData2 = curves.get(floorMod(size - 1, curves.size()));
            PointF vertex = (size != 0 || zIsClosed) ? cubicCurveData2.getVertex() : shapeData.getInitialPoint();
            i14 = (((size != 0 || zIsClosed) ? cubicCurveData2.getControlPoint2() : vertex).equals(vertex) && cubicCurveData.getControlPoint1().equals(vertex) && !(!shapeData.isClosed() && (size == 0 || size == curves.size() - 1))) ? i14 + 2 : i14 + 1;
            size--;
        }
        ShapeData shapeData2 = this.shapeData;
        if (shapeData2 == null || shapeData2.getCurves().size() != i14) {
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList.add(new CubicCurveData());
            }
            this.shapeData = new ShapeData(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.shapeData.setClosed(zIsClosed);
        return this.shapeData;
    }

    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public void addUpdateListener(BaseKeyframeAnimation.AnimationListener animationListener) {
        this.roundedCorners.addUpdateListener(animationListener);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    public BaseKeyframeAnimation<Float, Float> getRoundedCorners() {
        return this.roundedCorners;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public ShapeData modifyShape(ShapeData shapeData) {
        boolean z14;
        List<CubicCurveData> curves = shapeData.getCurves();
        if (curves.size() > 2) {
            float fFloatValue = this.roundedCorners.getValue().floatValue();
            if (fFloatValue != 0.0f) {
                ShapeData shapeData2 = getShapeData(shapeData);
                shapeData2.setInitialPoint(shapeData.getInitialPoint().x, shapeData.getInitialPoint().y);
                List<CubicCurveData> curves2 = shapeData2.getCurves();
                boolean zIsClosed = shapeData.isClosed();
                int i14 = 0;
                int i15 = 0;
                while (i14 < curves.size()) {
                    CubicCurveData cubicCurveData = curves.get(i14);
                    CubicCurveData cubicCurveData2 = curves.get(floorMod(i14 - 1, curves.size()));
                    CubicCurveData cubicCurveData3 = curves.get(floorMod(i14 - 2, curves.size()));
                    PointF vertex = (i14 != 0 || zIsClosed) ? cubicCurveData2.getVertex() : shapeData.getInitialPoint();
                    PointF controlPoint2 = (i14 != 0 || zIsClosed) ? cubicCurveData2.getControlPoint2() : vertex;
                    PointF controlPoint1 = cubicCurveData.getControlPoint1();
                    PointF vertex2 = cubicCurveData3.getVertex();
                    PointF vertex3 = cubicCurveData.getVertex();
                    if (shapeData.isClosed()) {
                        z14 = false;
                    } else {
                        z14 = true;
                        if (i14 != 0 && i14 != curves.size() - 1) {
                            z14 = false;
                        }
                    }
                    if (controlPoint2.equals(vertex) && controlPoint1.equals(vertex) && !z14) {
                        float f14 = vertex.x;
                        float f15 = f14 - vertex2.x;
                        float f16 = vertex.y;
                        float f17 = f16 - vertex2.y;
                        float f18 = vertex3.x - f14;
                        float f19 = vertex3.y - f16;
                        float fHypot = (float) Math.hypot(f15, f17);
                        float fHypot2 = (float) Math.hypot(f18, f19);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f22 = vertex.x;
                        float fA = x.a(vertex2.x, f22, fMin, f22);
                        float f24 = vertex.y;
                        float fA2 = x.a(vertex2.y, f24, fMin, f24);
                        float fA3 = x.a(vertex3.x, f22, fMin2, f22);
                        float fA4 = x.a(vertex3.y, f24, fMin2, f24);
                        float f25 = fA - ((fA - f22) * ROUNDED_CORNER_MAGIC_NUMBER);
                        float f26 = fA2 - ((fA2 - f24) * ROUNDED_CORNER_MAGIC_NUMBER);
                        float f27 = fA3 - ((fA3 - f22) * ROUNDED_CORNER_MAGIC_NUMBER);
                        float f28 = fA4 - ((fA4 - f24) * ROUNDED_CORNER_MAGIC_NUMBER);
                        CubicCurveData cubicCurveData4 = curves2.get(floorMod(i15 - 1, curves2.size()));
                        CubicCurveData cubicCurveData5 = curves2.get(i15);
                        cubicCurveData4.setControlPoint2(fA, fA2);
                        cubicCurveData4.setVertex(fA, fA2);
                        if (i14 == 0) {
                            shapeData2.setInitialPoint(fA, fA2);
                        }
                        cubicCurveData5.setControlPoint1(f25, f26);
                        CubicCurveData cubicCurveData6 = curves2.get(i15 + 1);
                        cubicCurveData5.setControlPoint2(f27, f28);
                        cubicCurveData5.setVertex(fA3, fA4);
                        cubicCurveData6.setControlPoint1(fA3, fA4);
                        i15 += 2;
                    } else {
                        CubicCurveData cubicCurveData7 = curves2.get(floorMod(i15 - 1, curves2.size()));
                        CubicCurveData cubicCurveData8 = curves2.get(i15);
                        cubicCurveData7.setControlPoint2(cubicCurveData2.getControlPoint2().x, cubicCurveData2.getControlPoint2().y);
                        cubicCurveData7.setVertex(cubicCurveData2.getVertex().x, cubicCurveData2.getVertex().y);
                        cubicCurveData8.setControlPoint1(cubicCurveData.getControlPoint1().x, cubicCurveData.getControlPoint1().y);
                        i15++;
                    }
                    i14++;
                    curves = curves;
                }
                return shapeData2;
            }
        }
        return shapeData;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }
}
