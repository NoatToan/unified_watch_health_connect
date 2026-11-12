package com.huami.device.feature.health.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B)\b\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0015R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/huami/device/feature/health/ui/view/BloodPressureMeasureProgress;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "value", "a", LogUtil.I, "getPercent", "()I", "setPercent", "(I)V", "percent", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureMeasureProgress extends View {
    private static final float b = 10.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int percent;

    @JvmOverloads
    public BloodPressureMeasureProgress(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public BloodPressureMeasureProgress(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public BloodPressureMeasureProgress(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getPercent() {
        return this.percent;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@NotNull Canvas canvas) {
        Path path = new Path();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#DFEDFF"));
        paint.setStrokeWidth(10.0f);
        path.addCircle(getWidth() / 2.0f, getWidth() / 2.0f, (getWidth() / 2.0f) - 5.0f, Path.Direction.CW);
        canvas.drawPath(path, paint);
        Path path2 = new Path();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(Color.parseColor("#62A1FE"));
        paint2.setStrokeWidth(10.0f);
        path2.addArc(new RectF(5.0f, 5.0f, getWidth() - 5.0f, getWidth() - 5.0f), 270.0f, (float) (((double) 360) - (((double) this.percent) * 3.6d)));
        canvas.drawPath(path2, paint2);
        super.onDraw(canvas);
    }

    public final void setPercent(int i) {
        this.percent = i;
        postInvalidate();
    }

    public /* synthetic */ BloodPressureMeasureProgress(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
