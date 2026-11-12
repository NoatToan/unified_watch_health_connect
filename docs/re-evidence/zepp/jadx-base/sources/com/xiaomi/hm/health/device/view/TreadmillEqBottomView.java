package com.xiaomi.hm.health.device.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.utils.ex.ViewExKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\"\u0010&B#\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b\"\u0010)J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR)\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/device/view/TreadmillEqBottomView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "a", LogUtil.D, "getGap", "()D", "setGap", "(D)V", "gap", "b", "getEdgeGap", "setEdgeGap", "edgeGap", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "paint", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "eqValues", "e", "getDbValues", "()Ljava/util/ArrayList;", "dbValues", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TreadmillEqBottomView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private double gap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private double edgeGap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Paint paint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> eqValues;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> dbValues;

    public TreadmillEqBottomView(@NotNull Context context) {
        this(context, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final ArrayList<String> getDbValues() {
        return this.dbValues;
    }

    public final double getEdgeGap() {
        return this.edgeGap;
    }

    public final double getGap() {
        return this.gap;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas == null) {
            return;
        }
        if (this.paint == null) {
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setColor(ContextCompat.getColor(getContext(), R.color.s2));
            Paint paint2 = this.paint;
            if (paint2 != null) {
                paint2.setTextAlign(Paint.Align.CENTER);
            }
        }
        Paint paint3 = this.paint;
        if (paint3 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            paint3.setTextSize(ViewExKt.sp2px(this, 13.0f));
            Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
            float f = fontMetrics.bottom - fontMetrics.top;
            double d = i;
            canvas.drawText(this.eqValues.get(i), (float) (getEdgeGap() + (getGap() * d)), -fontMetrics.top, paint3);
            paint3.setTextSize(ViewExKt.sp2px(this, 10.0f));
            canvas.drawText(getDbValues().get(i), (float) (getEdgeGap() + (getGap() * d)), f - paint3.getFontMetrics().top, paint3);
            if (i2 >= 10) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void setEdgeGap(double d) {
        this.edgeGap = d;
    }

    public final void setGap(double d) {
        this.gap = d;
    }

    public TreadmillEqBottomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public TreadmillEqBottomView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gap = -1.0d;
        this.edgeGap = -1.0d;
        this.eqValues = CollectionsKt__CollectionsKt.arrayListOf("63", "100", "160", "250", "500", "1K", "2K", "4K", "8K", "16K");
        this.dbValues = CollectionsKt__CollectionsKt.arrayListOf("-3db", "-3db", "-3db", "-3db", "-3db", "-3db", "-3db", "-3db", "-3db", "-3db");
    }
}
