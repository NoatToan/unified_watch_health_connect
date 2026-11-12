package com.huami.ecg.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010¨\u0006!"}, d2 = {"Lcom/huami/ecg/chart/EcgGainScaleView;", "Landroid/view/View;", "", "getOffsetY", "getScaleHeight", "getHorizontalOffsetX", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "scaleUnit", "setScaleUnit", "", "gain", "setScale", "a", "F", "b", LogUtil.I, "gainValue", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "paint", GoogleApiAvailabilityLight.a, "offsetX", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ecg-chart_release"}, k = 1, mv = {1, 4, 1})
public final class EcgGainScaleView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float scaleUnit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int gainValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float offsetX;
    private HashMap e;

    @JvmOverloads
    public EcgGainScaleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public EcgGainScaleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EcgGainScaleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final float getHorizontalOffsetX() {
        return (float) (((double) this.scaleUnit) * 2.5d);
    }

    private final float getOffsetY() {
        return this.scaleUnit * (this.gainValue + 1);
    }

    private final float getScaleHeight() {
        return this.scaleUnit * this.gainValue;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.e;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        View view = (View) this.e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.e.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        float offsetY = getOffsetY();
        float scaleHeight = getScaleHeight();
        float horizontalOffsetX = getHorizontalOffsetX();
        if (canvas != null) {
            canvas.translate(this.offsetX, offsetY);
        }
        Path path = new Path();
        path.lineTo(horizontalOffsetX, 0.0f);
        float f = -scaleHeight;
        path.lineTo(horizontalOffsetX, f);
        float f2 = 3 * horizontalOffsetX;
        path.lineTo(f2, f);
        path.lineTo(f2, 0.0f);
        path.lineTo(horizontalOffsetX * 4, 0.0f);
        if (canvas != null) {
            canvas.drawPath(path, this.paint);
        }
        if (canvas != null) {
            canvas.translate(-this.offsetX, -offsetY);
        }
    }

    public final void setScale(int gain) {
        this.gainValue = gain;
        invalidate();
    }

    public final void setScaleUnit(float scaleUnit) {
        this.scaleUnit = scaleUnit;
        invalidate();
    }

    @JvmOverloads
    public EcgGainScaleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scaleUnit = 11.8f;
        this.gainValue = 10;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ContextCompat.getColor(context, R.color.s1));
    }
}
