package com.xiaomi.hm.health.device.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u001b\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b'\u0010+B#\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b'\u0010-J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R*\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/device/view/EqBottomView;", "Landroid/view/View;", "", "", "a", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", LogUtil.D, "getGap", "()D", "setGap", "(D)V", "gap", "b", "getEdgeGap", "setEdgeGap", "edgeGap", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "paint", "", "value", GoogleApiAvailabilityLight.a, "[I", "getEqValues", "()[I", "setEqValues", "([I)V", "eqValues", "e", "getDbValues", "setDbValues", "dbValues", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EqBottomView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private double gap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private double edgeGap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private int[] eqValues;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private int[] dbValues;

    public EqBottomView(@NotNull Context context) {
        this(context, null);
    }

    private final String a(int i) {
        if (i < 1000) {
            return String.valueOf(i);
        }
        return (i / 1000) + "K";
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final int[] getDbValues() {
        return this.dbValues;
    }

    public final double getEdgeGap() {
        return this.edgeGap;
    }

    @NotNull
    public final int[] getEqValues() {
        return this.eqValues;
    }

    public final double getGap() {
        return this.gap;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.paint.setTextSize(ViewUtils.sp2px(getContext(), 13.0f));
            Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
            float f = fontMetrics.bottom - fontMetrics.top;
            double d = i;
            canvas.drawText(a(this.eqValues[i]), (float) (this.edgeGap + (this.gap * d)), -fontMetrics.top, this.paint);
            this.paint.setTextSize(ViewUtils.sp2px(getContext(), 10.0f));
            Paint.FontMetrics fontMetrics2 = this.paint.getFontMetrics();
            canvas.drawText(this.dbValues[i] + UserDataStore.DATE_OF_BIRTH, (float) (this.edgeGap + (this.gap * d)), f - fontMetrics2.top, this.paint);
            if (i2 >= 10) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void setDbValues(@NotNull int[] iArr) {
        this.dbValues = iArr;
        invalidate();
    }

    public final void setEdgeGap(double d) {
        this.edgeGap = d;
    }

    public final void setEqValues(@NotNull int[] iArr) {
        this.eqValues = iArr;
        invalidate();
    }

    public final void setGap(double d) {
        this.gap = d;
    }

    public EqBottomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public EqBottomView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gap = -1.0d;
        this.edgeGap = -1.0d;
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#999999"));
        paint.setTextAlign(Paint.Align.CENTER);
        Unit unit = Unit.INSTANCE;
        this.paint = paint;
        this.eqValues = new int[]{63, 100, 160, 250, 500, 1000, 2000, 4000, 8000, 16000};
        this.dbValues = new int[]{-3, -3, -3, -3, -3, -3, -3, -3, -3, -3};
    }
}
