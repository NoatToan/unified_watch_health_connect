package com.huami.watchfacesstore.view.clip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0014J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\"\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u000f\u001a\u00020\u0006R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010$\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010&\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!¨\u0006."}, d2 = {"Lcom/huami/watchfacesstore/view/clip/ClipImageBorderView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "a", "", "w", "h", "oldw", "oldh", "onSizeChanged", "onDraw", "Lkotlin/Pair;", "size", "radius", "setSizeAndRadius", LogUtil.I, "mHorizontalPadding", "b", "mVerticalPadding", "c", "mWidth", GoogleApiAvailabilityLight.a, "mHeight", "e", "f", "mBorderColor", "", "g", "F", "mBorderWidth", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mPaint", "i", "maskPaint", z.j, "eraserPaint", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ClipImageBorderView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mHorizontalPadding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mVerticalPadding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int radius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int mBorderColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float mBorderWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Paint mPaint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Paint maskPaint;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Paint eraserPaint;

    @JvmOverloads
    public ClipImageBorderView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ClipImageBorderView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ClipImageBorderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a(Canvas canvas) {
        this.mPaint.setColor(ContextCompat.getColor(getContext(), R.color.wf_color_pic_mask));
        this.mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.mPaint);
        this.mPaint.setStrokeWidth(ExtensionsKt.getDp(this.mBorderWidth));
        this.mPaint.setColor(this.mBorderColor);
        this.mPaint.setStyle(Paint.Style.STROKE);
        float f = this.mHorizontalPadding;
        float f2 = this.mVerticalPadding;
        float width = getWidth() - this.mHorizontalPadding;
        float height = getHeight() - this.mVerticalPadding;
        int i = this.radius;
        canvas.drawRoundRect(f, f2, width, height, i, i, this.mPaint);
        float f3 = this.mHorizontalPadding;
        float f4 = this.mVerticalPadding;
        float width2 = getWidth() - this.mHorizontalPadding;
        float height2 = getHeight() - this.mVerticalPadding;
        int i2 = this.radius;
        canvas.drawRoundRect(f3, f4, width2, height2, i2, i2, this.eraserPaint);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        float f = this.mHeight * 1.0f;
        int i = this.mWidth;
        float f2 = f / i;
        if (i > getWidth()) {
            int i2 = this.mWidth;
            int width = getWidth() - ExtensionsKt.getDp(20);
            this.mWidth = width;
            this.mHeight = c.roundToInt(width * f2);
            this.radius *= c.roundToInt((this.mWidth * 1.0f) / i2);
        } else if (this.mHeight > getHeight()) {
            int i3 = this.mHeight;
            int height = getHeight() - ExtensionsKt.getDp(60);
            this.mHeight = height;
            this.mWidth = c.roundToInt(height / f2);
            this.radius *= c.roundToInt((this.mHeight * 1.0f) / i3);
        }
        this.mHorizontalPadding = (getWidth() - this.mWidth) / 2;
        this.mVerticalPadding = (getHeight() - this.mHeight) / 2;
    }

    public final void setSizeAndRadius(@NotNull Pair<Integer, Integer> size, int radius) {
        this.mWidth = size.getFirst().intValue();
        this.mHeight = size.getSecond().intValue();
        this.radius = radius;
    }

    @JvmOverloads
    public ClipImageBorderView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBorderColor = -1;
        this.mBorderWidth = 2.0f;
        setLayerType(1, null);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint(1);
        paint2.setColor(-16777216);
        Unit unit = Unit.INSTANCE;
        this.maskPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.eraserPaint = paint3;
    }
}
