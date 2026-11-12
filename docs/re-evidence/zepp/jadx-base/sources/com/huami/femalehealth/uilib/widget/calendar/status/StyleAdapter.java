package com.huami.femalehealth.uilib.widget.calendar.status;

import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/StyleAdapter;", "", "", "getItemWidth", "getItemHeight", "Landroid/graphics/Paint;", "paint", "", "text", "offsetX", "offsetY", "Lkotlin/Pair;", "", "getTextPos", "uilib_release"}, k = 1, mv = {1, 5, 1})
public interface StyleAdapter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static Pair<Float, Float> getTextPos(@NotNull StyleAdapter styleAdapter, @NotNull Paint paint, @NotNull String str, int i, int i2) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            return TuplesKt.to(Float.valueOf((i + (styleAdapter.getItemWidth() / 2.0f)) - (paint.measureText(str) / 2.0f)), Float.valueOf(((styleAdapter.getItemHeight() / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2) + i2));
        }
    }

    int getItemHeight();

    int getItemWidth();

    @NotNull
    Pair<Float, Float> getTextPos(@NotNull Paint paint, @NotNull String text, int offsetX, int offsetY);
}
