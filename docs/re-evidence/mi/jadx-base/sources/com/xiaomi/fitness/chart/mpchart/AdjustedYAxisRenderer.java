package com.xiaomi.fitness.chart.mpchart;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.components.YAxis;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.fmq;
import defpackage.hwq;
import defpackage.ryp;
import defpackage.ttr;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bg\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u00108\u001a\u000207\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0018\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u00102\u001a\u00020\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010 \u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/chart/mpchart/AdjustedYAxisRenderer;", "Lttr;", "", "y", "Landroid/graphics/Paint;", "paint", "adjustInsideContent", "(FLandroid/graphics/Paint;)F", "value", "", "lookupHighlightColor", "(F)Ljava/lang/Integer;", "Landroid/graphics/Canvas;", PluginDeviceInfo.FICONON, "fixedPos", "", "positions", "yOffset", "", "drawYLabels", "(Landroid/graphics/Canvas;F[FF)V", "Lcom/github/mikephil/charting/components/YAxis;", "axis", "Lcom/github/mikephil/charting/components/YAxis;", "", "highlightColors", "Ljava/util/Map;", "getHighlightColors", "()Ljava/util/Map;", "setHighlightColors", "(Ljava/util/Map;)V", "topPaddingLines", "F", "getTopPaddingLines", "()F", "setTopPaddingLines", "(F)V", "bottomPaddingLines", "getBottomPaddingLines", "setBottomPaddingLines", "valueTolerance", "getValueTolerance", "setValueTolerance", "", "autoAvoidEdge", "Z", "getAutoAvoidEdge", "()Z", "setAutoAvoidEdge", "(Z)V", "edgePaddingPx", "getEdgePaddingPx", "setEdgePaddingPx", "Lhwq;", "viewPortHandler", "Lryp;", "trans", "<init>", "(Lhwq;Lcom/github/mikephil/charting/components/YAxis;Lryp;Ljava/util/Map;FFFZF)V", "chart_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAdjustedYAxisRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdjustedYAxisRenderer.kt\ncom/xiaomi/fitness/chart/mpchart/AdjustedYAxisRenderer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n295#2,2:97\n*S KotlinDebug\n*F\n+ 1 AdjustedYAxisRenderer.kt\ncom/xiaomi/fitness/chart/mpchart/AdjustedYAxisRenderer\n*L\n94#1:97,2\n*E\n"})
public final class AdjustedYAxisRenderer extends ttr {
    private boolean autoAvoidEdge;

    @NotNull
    private final YAxis axis;
    private float bottomPaddingLines;
    private float edgePaddingPx;

    @NotNull
    private Map<Float, Integer> highlightColors;
    private float topPaddingLines;
    private float valueTolerance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdjustedYAxisRenderer(@NotNull hwq viewPortHandler, @NotNull YAxis axis, @NotNull ryp trans, @NotNull Map<Float, Integer> highlightColors, float f, float f2, float f3, boolean z, float f4) {
        super(viewPortHandler, axis, trans);
        Intrinsics.checkNotNullParameter(viewPortHandler, "viewPortHandler");
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(trans, "trans");
        Intrinsics.checkNotNullParameter(highlightColors, "highlightColors");
        this.axis = axis;
        this.highlightColors = highlightColors;
        this.topPaddingLines = f;
        this.bottomPaddingLines = f2;
        this.valueTolerance = f3;
        this.autoAvoidEdge = z;
        this.edgePaddingPx = f4;
    }

    private final float adjustInsideContent(float y, Paint paint) {
        float fJ = this.mViewPortHandler.j() + this.edgePaddingPx;
        float f = this.mViewPortHandler.f() - this.edgePaddingPx;
        float fAscent = paint.ascent() + y;
        float fDescent = paint.descent() + y;
        if (fAscent < fJ) {
            return y + (fJ - fAscent);
        }
        return fDescent > f ? y - (fDescent - f) : y;
    }

    private final Integer lookupHighlightColor(float value) {
        Object next;
        Iterator<T> it = this.highlightColors.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (Math.abs(((Number) ((Map.Entry) next).getKey()).floatValue() - value) >= this.valueTolerance);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Integer) entry.getValue();
        }
        return null;
    }

    @Override // defpackage.ttr
    public void drawYLabels(@NotNull Canvas c, float fixedPos, @NotNull float[] positions, float yOffset) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Paint paint = this.mAxisLabelPaint;
        int iA = fmq.a(paint, UserConfig.KEY_MI_BRAIN_SETTING);
        int i = this.axis.mEntryCount;
        for (int i2 = 0; i2 < i; i2++) {
            float fAdjustInsideContent = positions[(i2 * 2) + 1] + yOffset;
            if (i2 == 0) {
                fAdjustInsideContent -= this.bottomPaddingLines * iA;
            } else if (i2 == i - 1) {
                fAdjustInsideContent += this.topPaddingLines * iA;
            }
            if (this.autoAvoidEdge) {
                Intrinsics.checkNotNull(paint);
                fAdjustInsideContent = adjustInsideContent(fAdjustInsideContent, paint);
            }
            Integer numLookupHighlightColor = lookupHighlightColor(this.axis.mEntries[i2]);
            paint.setColor(numLookupHighlightColor != null ? numLookupHighlightColor.intValue() : this.axis.getTextColor());
            c.drawText(this.axis.getFormattedLabel(i2), fixedPos, fAdjustInsideContent, paint);
        }
    }

    public final boolean getAutoAvoidEdge() {
        return this.autoAvoidEdge;
    }

    public final float getBottomPaddingLines() {
        return this.bottomPaddingLines;
    }

    public final float getEdgePaddingPx() {
        return this.edgePaddingPx;
    }

    @NotNull
    public final Map<Float, Integer> getHighlightColors() {
        return this.highlightColors;
    }

    public final float getTopPaddingLines() {
        return this.topPaddingLines;
    }

    public final float getValueTolerance() {
        return this.valueTolerance;
    }

    public final void setAutoAvoidEdge(boolean z) {
        this.autoAvoidEdge = z;
    }

    public final void setBottomPaddingLines(float f) {
        this.bottomPaddingLines = f;
    }

    public final void setEdgePaddingPx(float f) {
        this.edgePaddingPx = f;
    }

    public final void setHighlightColors(@NotNull Map<Float, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.highlightColors = map;
    }

    public final void setTopPaddingLines(float f) {
        this.topPaddingLines = f;
    }

    public final void setValueTolerance(float f) {
        this.valueTolerance = f;
    }

    public /* synthetic */ AdjustedYAxisRenderer(hwq hwqVar, YAxis yAxis, ryp rypVar, Map map, float f, float f2, float f3, boolean z, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hwqVar, yAxis, rypVar, (i & 8) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i & 16) != 0 ? 0.0f : f, (i & 32) != 0 ? 0.0f : f2, (i & 64) != 0 ? 0.01f : f3, (i & 128) != 0 ? true : z, (i & 256) != 0 ? fmq.e(0.0f) : f4);
    }
}
