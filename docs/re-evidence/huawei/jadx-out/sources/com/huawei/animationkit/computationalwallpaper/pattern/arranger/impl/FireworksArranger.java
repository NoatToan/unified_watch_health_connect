package com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.pattern.UpdateListener;
import com.huawei.animationkit.computationalwallpaper.pattern.arranger.AbstractArranger;
import com.huawei.animationkit.computationalwallpaper.pattern.variable.VariableType;
import defpackage.bdo;
import defpackage.bfl;
import defpackage.bgf;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

/* JADX INFO: loaded from: classes23.dex */
public class FireworksArranger extends AbstractArranger {
    private static final long ANIMATION_DURATION = 3000;
    public static final Parcelable.Creator<FireworksArranger> CREATOR = new Parcelable.Creator<FireworksArranger>() { // from class: com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.FireworksArranger.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FireworksArranger createFromParcel(Parcel parcel) {
            return new FireworksArranger(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public FireworksArranger[] newArray(int i) {
            return new FireworksArranger[i];
        }
    };
    private static final int DEGREE = 30;
    private static final float SIZE = 500.0f;
    private static final String TAG = "FireworksArranger";
    private final List<d> mAlphaFractionPoint;
    private final Interpolator mAppearInterpolator;
    private List<Integer> mColors;
    private final Interpolator mDisappearInterpolator;
    private final FloatEvaluator mEvaluator;
    private float mFraction;
    private List<Integer> mGradients;
    private final Paint mPaint;
    private final List<d> mSizeFractionPoint;
    private UpdateListener mUpdateListener;
    private final ValueAnimator mValueAnimator;
    private String mVariable;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void releaseBitmap() {
    }

    public FireworksArranger() {
        this.mEvaluator = new FloatEvaluator();
        this.mVariable = VariableType.Random.RANDOM.getKey();
        ArrayList arrayList = new ArrayList();
        this.mSizeFractionPoint = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.mAlphaFractionPoint = arrayList2;
        this.mAppearInterpolator = new PathInterpolator(0.2f, 0.0f, 0.1f, 1.0f);
        this.mDisappearInterpolator = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
        this.mValueAnimator = new ValueAnimator();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        arrayList.add(new d(0.0f, 0.67f, 0.78f, 0.94f));
        arrayList.add(new d(0.0f, 0.75f, 0.805f, 0.97f));
        arrayList.add(new d(0.0f, 0.83f, 0.83f, 1.0f));
        arrayList2.add(new d(0.0f, 0.33f, 0.78f, 0.94f));
        arrayList2.add(new d(0.083f, 0.417f, 0.805f, 0.97f));
        arrayList2.add(new d(0.17f, 0.5f, 0.83f, 1.0f));
    }

    private FireworksArranger(Parcel parcel) {
        this();
        ColorResult colorResult = (ColorResult) parcel.readParcelable(ColorResult.class.getClassLoader());
        super.setColor(colorResult);
        initColors(colorResult);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void arrange(Canvas canvas) {
        float fCenterX = getBound().centerX();
        float fCenterY = getBound().centerY();
        float fraction = getFraction();
        canvas.save();
        float fMax = Math.max(getBound().width(), getBound().height()) / SIZE;
        canvas.scale(fMax, fMax, fCenterX, fCenterY);
        drawFirstLayer(canvas, fraction);
        canvas.rotate(15.0f, fCenterX, fCenterY);
        drawSecondLayer(canvas, fraction);
        canvas.rotate(-15.0f, fCenterX, fCenterY);
        drawThirdLayer(canvas, fraction);
        canvas.restore();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void startAnimation() {
        this.mValueAnimator.setDuration(3000L);
        this.mValueAnimator.setFloatValues(0.0f, 1.0f);
        this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bfm
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.d.m808x9b766cc(valueAnimator);
            }
        });
        this.mValueAnimator.start();
    }

    /* JADX INFO: renamed from: lambda$startAnimation$0$com-huawei-animationkit-computationalwallpaper-pattern-arranger-impl-FireworksArranger, reason: not valid java name */
    public /* synthetic */ void m808x9b766cc(ValueAnimator valueAnimator) {
        this.mFraction = valueAnimator.getAnimatedFraction();
        Optional.ofNullable(this.mUpdateListener).ifPresent(new bfl());
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void cancelAnimation() {
        if (this.mValueAnimator.isRunning()) {
            this.mValueAnimator.cancel();
        }
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void goFirstFrame() {
        if (this.mValueAnimator.isRunning()) {
            this.mValueAnimator.cancel();
        }
        this.mFraction = 0.0f;
        Optional.ofNullable(this.mUpdateListener).ifPresent(new bfl());
        Log.i(TAG, "goFirstFrame");
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void setUpdateListener(UpdateListener updateListener) {
        this.mUpdateListener = updateListener;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void load(File file, Properties properties, ColorResult colorResult) throws bdo {
        super.load(file, properties, colorResult);
        initColors(colorResult);
    }

    private float getFraction() {
        if (this.mValueAnimator.isRunning()) {
            return (this.mFraction + 0.78f) % 1.0f;
        }
        return 0.78f;
    }

    private void drawFirstLayer(Canvas canvas, float f) {
        float sizeFraction = getSizeFraction(f, this.mSizeFractionPoint.get(0));
        float fFloatValue = this.mEvaluator.evaluate(sizeFraction, (Number) 2, (Number) 9).floatValue();
        float fFloatValue2 = this.mEvaluator.evaluate(sizeFraction, (Number) 3, (Number) 12).floatValue();
        float fFloatValue3 = this.mEvaluator.evaluate(sizeFraction, (Number) 50, (Number) 106).floatValue();
        float fFloatValue4 = this.mEvaluator.evaluate(sizeFraction, (Number) 40, (Number) 100).floatValue();
        this.mPaint.setAlpha(getAlpha(f, this.mAlphaFractionPoint.get(0)));
        c cVar = new c(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4);
        cVar.d(this.mColors.get(0).intValue(), this.mGradients.get(0).intValue());
        drawFlower(canvas, cVar);
    }

    private void drawSecondLayer(Canvas canvas, float f) {
        float sizeFraction = getSizeFraction(f, this.mSizeFractionPoint.get(1));
        float fFloatValue = this.mEvaluator.evaluate(sizeFraction, (Number) 2, (Number) 9).floatValue();
        float fFloatValue2 = this.mEvaluator.evaluate(sizeFraction, (Number) 3, (Number) 12).floatValue();
        float fFloatValue3 = this.mEvaluator.evaluate(sizeFraction, (Number) 50, (Number) 74).floatValue();
        float fFloatValue4 = this.mEvaluator.evaluate(sizeFraction, (Number) 40, (Number) 100).floatValue();
        this.mPaint.setAlpha(getAlpha(f, this.mAlphaFractionPoint.get(1)));
        c cVar = new c(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4);
        cVar.d(this.mColors.get(1).intValue(), this.mGradients.get(1).intValue());
        drawFlower(canvas, cVar);
    }

    private void drawThirdLayer(Canvas canvas, float f) {
        float sizeFraction = getSizeFraction(f, this.mSizeFractionPoint.get(2));
        float fFloatValue = this.mEvaluator.evaluate(sizeFraction, (Number) 2, (Number) 9).floatValue();
        float fFloatValue2 = this.mEvaluator.evaluate(sizeFraction, (Number) 3, (Number) 12).floatValue();
        float fFloatValue3 = this.mEvaluator.evaluate(sizeFraction, (Number) 50, (Number) 30).floatValue();
        float fFloatValue4 = this.mEvaluator.evaluate(sizeFraction, (Number) 40, (Number) 100).floatValue();
        this.mPaint.setAlpha(getAlpha(f, this.mAlphaFractionPoint.get(2)));
        c cVar = new c(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4);
        cVar.d(this.mColors.get(2).intValue(), this.mGradients.get(2).intValue());
        drawFlower(canvas, cVar);
    }

    private void drawFlower(Canvas canvas, c cVar) {
        int i = cVar.d;
        int iD = bgf.d(cVar.f5162c, 0.0f);
        float fCenterX = getBound().centerX();
        float f = cVar.e;
        float f2 = cVar.h;
        float fCenterX2 = getBound().centerX();
        float f3 = cVar.e;
        this.mPaint.setShader(new LinearGradient((fCenterX + f) - f2, getBound().centerY(), fCenterX2 + f3 + cVar.f5161b + cVar.f5160a, getBound().centerY(), new int[]{iD, i}, (float[]) null, Shader.TileMode.CLAMP));
        Path pathCreatePetalPath = createPetalPath(cVar);
        canvas.save();
        for (int i2 = 0; i2 < 360; i2 += 30) {
            canvas.rotate(30, getBound().centerX(), getBound().centerY());
            canvas.drawPath(pathCreatePetalPath, this.mPaint);
        }
        canvas.restore();
    }

    private Path createPetalPath(c cVar) {
        float f = cVar.h;
        float f2 = cVar.f5160a;
        float f3 = cVar.e;
        float f4 = cVar.f5161b;
        PointF pointF = new PointF(getBound().centerX() + f3, getBound().centerY());
        PointF pointF2 = new PointF(pointF.x + f4, pointF.y);
        double dAcos = Math.acos((((double) (f2 - f)) * 1.0d) / ((double) f4));
        PointF pointF3 = new PointF();
        PointF pointF4 = new PointF();
        PointF pointF5 = new PointF();
        PointF pointF6 = new PointF();
        double d2 = f;
        pointF3.x = (float) (((double) pointF.x) - (Math.cos(dAcos) * d2));
        pointF4.x = pointF3.x;
        pointF3.y = (float) (((double) pointF.y) - (Math.sin(dAcos) * d2));
        pointF4.y = (float) (((double) pointF.y) + (d2 * Math.sin(dAcos)));
        double d3 = f2;
        pointF5.x = (float) (((double) pointF2.x) - (Math.cos(dAcos) * d3));
        pointF6.x = pointF5.x;
        pointF5.y = (float) (((double) pointF2.y) - (Math.sin(dAcos) * d3));
        pointF6.y = (float) (((double) pointF2.y) + (d3 * Math.sin(dAcos)));
        Path path = new Path();
        path.addCircle(pointF.x, pointF.y, f, Path.Direction.CW);
        path.addCircle(pointF2.x, pointF2.y, f2, Path.Direction.CW);
        path.op(createPolygonPath(Arrays.asList(pointF, pointF3, pointF5, pointF2, pointF6, pointF4, pointF)), Path.Op.UNION);
        return path;
    }

    private Path createPolygonPath(List<PointF> list) {
        if (list.size() < 2) {
            throw new RuntimeException("The number of points must be greater than 2");
        }
        Path path = new Path();
        path.moveTo(list.get(0).x, list.get(0).y);
        for (int i = 1; i < list.size(); i++) {
            path.lineTo(list.get(i).x, list.get(i).y);
        }
        path.close();
        return path;
    }

    private float getSizeFraction(float f, d dVar) {
        if (f < dVar.d) {
            return 0.0f;
        }
        if (f < dVar.f5164b) {
            return this.mAppearInterpolator.getInterpolation((f - dVar.d) / dVar.d()) * 0.96f;
        }
        if (f < dVar.e) {
            return 0.96f;
        }
        return (this.mDisappearInterpolator.getInterpolation((f - dVar.e) / dVar.c()) * 0.04f) + 0.96f;
    }

    private int getAlpha(float f, d dVar) {
        if (f < dVar.d) {
            return 0;
        }
        if (f < dVar.f5164b) {
            return (int) (this.mAppearInterpolator.getInterpolation((f - dVar.d) / dVar.d()) * 255.0f);
        }
        if (f < dVar.e) {
            return 255;
        }
        if (f >= dVar.f5163a) {
            return 0;
        }
        return (int) ((1.0f - this.mDisappearInterpolator.getInterpolation((f - dVar.e) / dVar.c())) * 255.0f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getColor(), i);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.AbstractArranger, com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void setColor(ColorResult colorResult) {
        super.setColor(colorResult);
        initColors(colorResult);
    }

    private void initColors(ColorResult colorResult) {
        this.mColors = colorResult.getAllColors();
        this.mGradients = colorResult.getAllGradients();
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f5160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f5161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f5162c;
        private int d;
        private final float e;
        private final float h;

        c(float f, float f2, float f3, float f4) {
            this.h = f;
            this.f5160a = f2;
            this.e = f3;
            this.f5161b = f4;
        }

        public void d(int i, int i2) {
            this.d = i;
            this.f5162c = i2;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f5163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f5164b;
        private final float d;
        private final float e;

        private d(float f, float f2, float f3, float f4) {
            this.d = f;
            this.f5164b = f2;
            this.e = f3;
            this.f5163a = f4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float d() {
            return this.f5164b - this.d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float c() {
            return this.f5163a - this.e;
        }
    }
}
