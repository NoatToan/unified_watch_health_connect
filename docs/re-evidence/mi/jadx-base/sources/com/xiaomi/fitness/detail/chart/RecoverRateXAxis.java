package com.xiaomi.fitness.detail.chart;

import com.github.mikephil.charting.components.XAxis;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/detail/chart/RecoverRateXAxis;", "Lcom/github/mikephil/charting/components/XAxis;", "<init>", "()V", "getLabelCount", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecoverRateXAxis extends XAxis {
    @Override // defpackage.ft1
    public int getLabelCount() {
        float axisMaximum = getAxisMaximum();
        float axisMinimum = getAxisMinimum();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(axisMinimum));
        arrayList.add(Float.valueOf(axisMinimum + (((int) (axisMaximum - axisMinimum)) / 2)));
        arrayList.add(Float.valueOf(axisMaximum));
        this.mEntryCount = 3;
        this.mEntries = new float[3];
        for (int i = 0; i < 3; i++) {
            this.mEntries[i] = ((Number) arrayList.get(i)).floatValue();
        }
        return 3;
    }
}
