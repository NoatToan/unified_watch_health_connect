package com.xiaomi.fitness.watch.face.edit.photo.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import androidx.appcompat.widget.AppCompatImageView;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007J\b\u0010$\u001a\u0004\u0018\u00010\u0014J0\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0014J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0014J\u0016\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u000201J\u0016\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020\rJ\b\u00105\u001a\u00020 H\u0002J\u0010\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0010H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/crop/FaceForegroundScaleView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mWidth", "mHeight", "mMarginTop", "", "mSideMargin", "mMatrix", "Landroid/graphics/Matrix;", "mValues", "", "mBitmap", "Landroid/graphics/Bitmap;", "mRectF", "Landroid/graphics/RectF;", "mSrcPaint", "Landroid/graphics/Paint;", "mDstPaint", "mXferMode", "Landroid/graphics/PorterDuffXfermode;", "mCropRect", "init", "", "setForeground", "", "bitmap", "bgWidth", "bgHeight", "crop", "onLayout", "changed", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setScale", "scaleFactor", "detector", "Landroid/view/ScaleGestureDetector;", "setMove", "distanceX", "distanceY", "validateSide", "getMatrixRectF", "matrix", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceForegroundScaleView extends AppCompatImageView {
    private boolean init;
    private Bitmap mBitmap;

    @NotNull
    private final RectF mCropRect;

    @NotNull
    private final Paint mDstPaint;
    private int mHeight;
    private float mMarginTop;

    @NotNull
    private final Matrix mMatrix;

    @NotNull
    private final RectF mRectF;
    private float mSideMargin;

    @NotNull
    private final Paint mSrcPaint;

    @NotNull
    private final float[] mValues;
    private int mWidth;

    @NotNull
    private final PorterDuffXfermode mXferMode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceForegroundScaleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RectF getMatrixRectF(Matrix matrix) {
        Drawable drawable = getDrawable();
        this.mRectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.mRectF);
        return this.mRectF;
    }

    private final void validateSide() {
        float f;
        RectF matrixRectF = getMatrixRectF(this.mMatrix);
        int i = this.mWidth;
        float f2 = matrixRectF.left;
        float f3 = this.mSideMargin;
        float f4 = 0.0f;
        if (f2 > f3) {
            f = (-f2) + f3;
        } else {
            float f5 = matrixRectF.right;
            float f6 = i;
            f = f5 < f6 - f3 ? (f6 - f3) - f5 : 0.0f;
        }
        float f7 = matrixRectF.top;
        float f8 = this.mMarginTop;
        if (f7 > f8) {
            f4 = (-f7) + f8;
        } else {
            float f9 = matrixRectF.bottom;
            float f10 = RectView.c;
            if (f9 < f8 + f10) {
                f4 = (f8 + f10) - f9;
            }
        }
        this.mMatrix.postTranslate(f, f4);
    }

    @Nullable
    public final Bitmap crop() {
        Product.Size size;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && (size = DeviceModelExtKt.getSize(wearableDeviceModel)) != null) {
            if (AppUtil.INSTANCE.isDevChannel()) {
                Bitmap bitmap = this.mBitmap;
                if (bitmap == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBitmap");
                    bitmap = null;
                }
                if (bitmap.getHeight() == size.getHeight()) {
                    Bitmap bitmap2 = this.mBitmap;
                    if (bitmap2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBitmap");
                        bitmap2 = null;
                    }
                    if (bitmap2.getWidth() == size.getWidth()) {
                        Bitmap bitmap3 = this.mBitmap;
                        if (bitmap3 != null) {
                            return bitmap3;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("mBitmap");
                        return null;
                    }
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Path path = new Path();
            RectF rectF = this.mCropRect;
            float f = RectView.d;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(path);
            draw(canvas);
            RectF rectF2 = this.mCropRect;
            int i = (int) rectF2.left;
            int i2 = (int) rectF2.top;
            if (i > 0 && i2 > 0) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, i, i2, RangesKt___RangesKt.coerceAtMost((int) rectF2.width(), bitmapCreateBitmap.getWidth() - i), RangesKt___RangesKt.coerceAtMost((int) this.mCropRect.height(), bitmapCreateBitmap.getHeight() - i2));
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
                return Bitmap.createScaledBitmap(bitmapCreateBitmap2, size.getWidth(), size.getHeight(), true);
            }
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.init) {
            this.init = true;
            Bitmap bitmap = this.mBitmap;
            if (bitmap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBitmap");
                bitmap = null;
            }
            int width = bitmap.getWidth();
            Bitmap bitmap2 = this.mBitmap;
            if (bitmap2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBitmap");
                bitmap2 = null;
            }
            int height = bitmap2.getHeight();
            float f = width;
            float f2 = RectView.f13382b / f;
            float f3 = height;
            float f4 = RectView.c / f3;
            float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(f2, f4);
            if (f2 <= f4) {
                this.mMatrix.postScale(fCoerceAtLeast, fCoerceAtLeast);
                this.mMatrix.postTranslate(-(((f * fCoerceAtLeast) - this.mWidth) / 2.0f), this.mMarginTop);
            } else {
                this.mMatrix.postScale(fCoerceAtLeast, fCoerceAtLeast);
                this.mMatrix.postTranslate(this.mSideMargin, this.mMarginTop - (((f3 * fCoerceAtLeast) - RectView.c) / 2));
            }
            RectF rectF = this.mCropRect;
            float f5 = this.mSideMargin;
            float f6 = this.mMarginTop;
            rectF.set(f5, f6, RectView.f13382b + f5, RectView.c + f6);
            setImageMatrix(this.mMatrix);
            Bitmap bitmap3 = this.mBitmap;
            if (bitmap3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBitmap");
                bitmap3 = null;
            }
            setImageBitmap(bitmap3);
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawRect(0.0f, 0.0f, this.mWidth, this.mHeight, this.mSrcPaint);
        this.mDstPaint.setColor(-16711936);
        this.mDstPaint.setXfermode(this.mXferMode);
        RectF rectF2 = this.mCropRect;
        float f7 = RectView.d;
        canvas.drawRoundRect(rectF2, f7, f7, this.mDstPaint);
        this.mDstPaint.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mWidth = getWidth();
        int height = getHeight();
        this.mHeight = height;
        this.mMarginTop = (height - RectView.c) / 2;
    }

    public final void setForeground(@NotNull Bitmap bitmap, int bgWidth, int bgHeight) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ViewExtKt.visible(this);
        float screenWidth = DisplayUtil.getScreenWidth();
        float f = RectView.f13382b;
        this.mSideMargin = (screenWidth - f) / 2;
        float fCoerceAtMost = RangesKt___RangesKt.coerceAtMost(bgWidth / f, bgHeight / RectView.c);
        Matrix matrix = new Matrix();
        float f2 = 1.0f / fCoerceAtMost;
        matrix.postScale(f2, f2);
        Intrinsics.checkNotNullExpressionValue(Bitmap.createBitmap(bitmap, 0, 0, bgWidth, bgHeight, matrix, false), "createBitmap(...)");
        this.mBitmap = bitmap;
        invalidate();
    }

    public final void setMove(float distanceX, float distanceY) {
        this.mMatrix.postTranslate(distanceX, distanceY);
        validateSide();
        setImageMatrix(this.mMatrix);
    }

    public final void setScale(float scaleFactor, @NotNull ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.mMatrix.postScale(scaleFactor, scaleFactor, detector.getFocusX(), detector.getFocusY());
        setImageMatrix(this.mMatrix);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceForegroundScaleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FaceForegroundScaleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceForegroundScaleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Matrix imageMatrix = getImageMatrix();
        Intrinsics.checkNotNullExpressionValue(imageMatrix, "getImageMatrix(...)");
        this.mMatrix = imageMatrix;
        float[] fArr = new float[9];
        this.mValues = fArr;
        this.mRectF = new RectF();
        Paint paint = new Paint(1);
        paint.setColor(2130706432);
        this.mSrcPaint = paint;
        this.mDstPaint = new Paint(1);
        this.mXferMode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.mCropRect = new RectF();
        this.mBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        setImageMatrix(imageMatrix);
        imageMatrix.getValues(fArr);
    }
}
