package com.huami.bodymeasurements.temperature.view.vo.chart;

import com.huami.bodymeasurements.temperature.model.TempConstantsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0004"}, d2 = {"", "value", "", "a", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class TempMixLineChartBuilderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(float f) {
        boolean z = false;
        if (35.0f <= f && f <= 37.2f) {
            z = true;
        }
        return z ? TempConstantsKt.getNORMAL_COLOR() : TempConstantsKt.getABNORMAL_COLOR();
    }
}
