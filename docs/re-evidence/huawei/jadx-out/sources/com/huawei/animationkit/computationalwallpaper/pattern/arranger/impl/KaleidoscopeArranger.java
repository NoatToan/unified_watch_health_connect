package com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.pattern.UpdateListener;
import com.huawei.animationkit.computationalwallpaper.pattern.arranger.AbstractArranger;
import com.huawei.animationkit.computationalwallpaper.pattern.variable.VariableType;
import defpackage.bdn;
import defpackage.bdo;
import defpackage.bfl;
import defpackage.bft;
import java.io.File;
import java.util.Optional;
import java.util.Properties;

/* JADX INFO: loaded from: classes23.dex */
public class KaleidoscopeArranger extends AbstractArranger {
    private static final long ANIMATION_DURATION = 5000;
    private static final float ANIMATION_VALUE_INCREMENT = 0.05f;
    private static final String INIT_FRACTION = "init_fraction";
    private static final int PATH_OFFSET = 1;
    private static final String RESOURCE = "resource";
    private static final int SAMPLE_DEGREE = 30;
    private static final String TAG = "KaleidoscopeArranger";
    private float mAnimationValue;
    private Bitmap mBitmap;
    private final Bitmap mClipBitmap;
    private final int mClipLength;
    private float mInitFraction;
    private final Interpolator mInterpolator;
    private final Bitmap mMirroredBitmap;
    private final Paint mPaint;
    private final Path mPath;
    private final int mRadius;
    private final Point mSamplePoint;
    private UpdateListener mUpdateListener;
    private final ValueAnimator mValueAnimator;
    private String mVariable;
    private static final float SAMPLE_RADIUS = (float) Math.toRadians(30.0d);
    public static final Parcelable.Creator<KaleidoscopeArranger> CREATOR = new Parcelable.Creator<KaleidoscopeArranger>() { // from class: com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.KaleidoscopeArranger.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public KaleidoscopeArranger createFromParcel(Parcel parcel) {
            return new KaleidoscopeArranger(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public KaleidoscopeArranger[] newArray(int i) {
            return new KaleidoscopeArranger[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public KaleidoscopeArranger() {
        this(bft.b().nextFloat(VariableType.Random.RANDOM.getKey(), 0.0f, 1.0f));
    }

    private KaleidoscopeArranger(float f) {
        int iSqrt = (int) (Math.sqrt(Math.pow(bdn.g(), 2.0d) + Math.pow(bdn.f(), 2.0d)) / 2.0d);
        this.mRadius = iSqrt;
        this.mClipLength = iSqrt;
        this.mVariable = VariableType.Random.RANDOM.getKey();
        this.mInterpolator = new PathInterpolator(0.2f, 0.0f, 0.8f, 1.0f);
        this.mValueAnimator = new ValueAnimator();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPath = getClipPath();
        this.mMirroredBitmap = Bitmap.createBitmap(iSqrt, iSqrt * 2, Bitmap.Config.ARGB_8888);
        this.mClipBitmap = Bitmap.createBitmap(iSqrt, (int) (((double) iSqrt) * Math.tan(SAMPLE_RADIUS)), Bitmap.Config.ARGB_8888);
        this.mInitFraction = f;
        this.mSamplePoint = new Point(600, 600);
        this.mAnimationValue = this.mInitFraction;
        initAnimation();
    }

    private KaleidoscopeArranger(Parcel parcel) {
        this(parcel.readFloat());
        setColor((ColorResult) parcel.readParcelable(ColorResult.class.getClassLoader()));
        setResource(parcel.readString());
    }

    private void initAnimation() {
        this.mValueAnimator.setDuration(5000L);
        this.mValueAnimator.setInterpolator(this.mInterpolator);
        this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bfk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.e.m809x2cf2c0b3(valueAnimator);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initAnimation$0$com-huawei-animationkit-computationalwallpaper-pattern-arranger-impl-KaleidoscopeArranger, reason: not valid java name */
    public /* synthetic */ void m809x2cf2c0b3(ValueAnimator valueAnimator) {
        this.mAnimationValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Optional.ofNullable(this.mUpdateListener).ifPresent(new bfl());
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void arrange(Canvas canvas) {
        try {
            initBitmap();
            draw(canvas);
        } catch (bdo unused) {
            Log.e(TAG, "init bitmap failed");
        }
    }

    private void draw(Canvas canvas) {
        canvas.save();
        int iCenterX = getBound().centerX();
        int iCenterY = getBound().centerY();
        Bitmap bitmapMirrorBitmap = mirrorBitmap(clipBitmap());
        float fSqrt = (float) ((Math.sqrt(Math.pow(getBound().width(), 2.0d) + Math.pow(getBound().height(), 2.0d)) / 2.0d) / ((double) this.mRadius));
        float f = iCenterX;
        float f2 = iCenterY;
        canvas.scale(fSqrt, fSqrt, f, f2);
        for (int i = 0; i < 6; i++) {
            canvas.drawBitmap(bitmapMirrorBitmap, f, iCenterY - this.mRadius, this.mPaint);
            canvas.rotate(60.0f, f, f2);
        }
        canvas.restore();
    }

    private void initBitmap() throws bdo {
        if (this.mBitmap != null) {
            return;
        }
        this.mBitmap = getResourceBitmap(null);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void releaseBitmap() {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mBitmap = null;
        }
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void startAnimation() {
        float f = this.mAnimationValue % 1.0f;
        this.mAnimationValue = f;
        this.mValueAnimator.setFloatValues(f, 0.05f + f);
        this.mValueAnimator.start();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void cancelAnimation() {
        if (this.mValueAnimator.isRunning()) {
            this.mValueAnimator.cancel();
        }
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void setUpdateListener(UpdateListener updateListener) {
        this.mUpdateListener = updateListener;
    }

    private Bitmap mirrorBitmap(Bitmap bitmap) {
        this.mMirroredBitmap.eraseColor(0);
        Canvas canvas = new Canvas(this.mMirroredBitmap);
        float f = 0;
        float f2 = this.mRadius;
        canvas.drawBitmap(bitmap, f, f2, this.mPaint);
        canvas.scale(1.0f, -1.0f, f, f2);
        canvas.drawBitmap(bitmap, f, f2, this.mPaint);
        canvas.scale(1.0f, -1.0f, f, f2);
        return this.mMirroredBitmap;
    }

    private Bitmap clipBitmap() {
        float f = this.mAnimationValue * 360.0f;
        Log.i(TAG, "update position, x=" + this.mSamplePoint.x + " y=" + this.mSamplePoint.y + " degree=" + f);
        this.mClipBitmap.eraseColor(0);
        Canvas canvas = new Canvas(this.mClipBitmap);
        canvas.clipPath(this.mPath);
        canvas.translate(((float) this.mClipLength) / 3.0f, 0.0f);
        canvas.rotate(-f, 0.0f, 0.0f);
        int i = this.mRadius;
        int i2 = -i;
        canvas.drawBitmap(this.mBitmap, new Rect(this.mSamplePoint.x - this.mRadius, this.mSamplePoint.y - this.mRadius, this.mSamplePoint.x + this.mRadius, this.mSamplePoint.y + this.mRadius), new Rect(i2, i2, i, i), new Paint());
        return this.mClipBitmap;
    }

    private Path getClipPath() {
        int iTan = (int) (((double) this.mClipLength) * Math.tan(SAMPLE_RADIUS));
        Path path = new Path();
        path.moveTo(-1.0f, 0.0f);
        path.lineTo(this.mClipLength, 0.0f);
        path.lineTo(this.mClipLength, iTan + 2);
        path.close();
        return path;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void save(File file, Properties properties) throws bdo {
        properties.setProperty(INIT_FRACTION, String.valueOf(this.mInitFraction));
        properties.setProperty(RESOURCE, getResource());
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void load(File file, Properties properties, ColorResult colorResult) throws bdo {
        float f = parseFloat(properties.getProperty(INIT_FRACTION, "0"));
        this.mInitFraction = f;
        this.mAnimationValue = f;
        setResource(properties.getProperty(RESOURCE));
        setColor(colorResult);
        initAnimation();
    }

    private float parseFloat(String str) throws bdo {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            Log.e(TAG, "load init fraction failed", e);
            throw new bdo(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mInitFraction);
        parcel.writeParcelable(getColor(), i);
        parcel.writeString(getResource());
    }
}
