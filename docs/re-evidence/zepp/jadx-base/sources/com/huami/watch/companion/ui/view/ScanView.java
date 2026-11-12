package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.ScanView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010,\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0014R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006/"}, d2 = {"Lcom/huami/watch/companion/ui/view/ScanView;", "Landroid/view/View;", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "startScan", "stopScan", "onDetachedFromWindow", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/Bitmap;", "scanSweepBitmap", "Landroid/graphics/Matrix;", "b", "Landroid/graphics/Matrix;", "mMatrix", "", "c", "F", "mDegrees", GoogleApiAvailabilityLight.a, LogUtil.I, "mCenterX", "e", "mCenterY", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "mHandler", "Ljava/lang/Runnable;", "g", "Ljava/lang/Runnable;", "mRunnable", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class ScanView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Bitmap scanSweepBitmap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Matrix mMatrix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float mDegrees;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mCenterX;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mCenterY;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Handler mHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Runnable mRunnable;

    @JvmOverloads
    public ScanView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ScanView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ScanView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ScanView scanView) {
        float f = scanView.mDegrees + 2.0f;
        scanView.mDegrees = f;
        if (f > 360.0f) {
            scanView.mDegrees = f - 360;
        }
        scanView.invalidate();
        Handler handler = scanView.mHandler;
        Runnable runnable = scanView.mRunnable;
        if (runnable == null) {
            runnable = null;
        }
        handler.postDelayed(runnable, 50L);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopScan();
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        canvas.save();
        canvas.rotate(this.mDegrees, this.mCenterX, this.mCenterY);
        Bitmap bitmap = this.scanSweepBitmap;
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, this.mMatrix, null);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mCenterX = getWidth() / 2;
        this.mCenterY = getHeight() / 2;
    }

    public final void startScan() {
        Handler handler = this.mHandler;
        Runnable runnable = this.mRunnable;
        if (runnable == null) {
            runnable = null;
        }
        handler.post(runnable);
    }

    public final void stopScan() {
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @JvmOverloads
    public ScanView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMatrix = new Matrix();
        this.mHandler = new Handler();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScanView);
            this.scanSweepBitmap = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(R.styleable.ScanView_scanSweep, R.drawable.img_scan));
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mRunnable = new Runnable() { // from class: lh6
            @Override // java.lang.Runnable
            public final void run() {
                ScanView.b(this.a);
            }
        };
    }
}
