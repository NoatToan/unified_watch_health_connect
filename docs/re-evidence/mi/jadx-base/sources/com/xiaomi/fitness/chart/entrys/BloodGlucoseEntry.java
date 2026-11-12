package com.xiaomi.fitness.chart.entrys;

import com.mibi.sdk.component.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0005R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR,\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001e0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000fR\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000fR\u001e\u00100\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "i", "", "value", "", "timestamp", "", "type", "<init>", "(IFJI)V", Constants.KEY_RECHARGE_VALUES, "", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseLineChartData;", "getValues", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "selectX", "getSelectX", "()F", "setSelectX", "(F)V", "selectY", "getSelectY", "()Ljava/lang/Float;", "setSelectY", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "item", "Lkotlin/Pair;", "getItem", "setItem", "fingerBSList", "Lcom/xiaomi/fitness/chart/entrys/FingerBSList;", "getFingerBSList", "fingerHighLightMap", "", "getFingerHighLightMap", "()Ljava/util/Map;", "highLightType", "getHighLightType", "()I", "setHighLightType", "(I)V", "drawAGPList", "Lcom/xiaomi/fitness/chart/entrys/AGPDetailList;", "getDrawAGPList", "drawDetailEndTime", "getDrawDetailEndTime", "()Ljava/lang/Long;", "setDrawDetailEndTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "findRangeIndex", "pointX", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodGlucoseEntry extends MaxMinEntry {

    @NotNull
    private final List<AGPDetailList> drawAGPList;

    @Nullable
    private Long drawDetailEndTime;

    @NotNull
    private final List<FingerBSList> fingerBSList;

    @NotNull
    private final Map<Integer, FingerBSList> fingerHighLightMap;
    private int highLightType;

    @NotNull
    private List<Pair<Float, Float>> item;
    private float selectX;

    @Nullable
    private Float selectY;

    @NotNull
    private List<BloodGlucoseLineChartData> values;

    public BloodGlucoseEntry(int i, float f, long j, int i2) {
        super(i, f, j, i2);
        this.values = new ArrayList();
        this.selectX = -1.0f;
        this.item = new ArrayList();
        this.fingerBSList = new ArrayList();
        this.fingerHighLightMap = new HashMap();
        this.highLightType = 1;
        this.drawAGPList = new ArrayList();
    }

    public final int findRangeIndex(float pointX) {
        if (this.item.isEmpty()) {
            return -1;
        }
        int size = this.item.size() - 1;
        int size2 = this.item.size();
        float f = Float.MAX_VALUE;
        for (int i = 0; i < size2; i++) {
            Pair<Float, Float> pair = this.item.get(i);
            float fFloatValue = pair.component1().floatValue();
            float fFloatValue2 = pair.component2().floatValue();
            float fCoerceAtMost = RangesKt___RangesKt.coerceAtMost(Math.abs(fFloatValue - pointX), Math.abs(fFloatValue2 - pointX));
            if (fCoerceAtMost < f) {
                size = i;
                f = fCoerceAtMost;
            }
            if (fFloatValue <= pointX && pointX <= fFloatValue2) {
                return i;
            }
        }
        if (this.highLightType != 2 || f <= 10.0f) {
            return size;
        }
        return -1;
    }

    @NotNull
    public final List<AGPDetailList> getDrawAGPList() {
        return this.drawAGPList;
    }

    @Nullable
    public final Long getDrawDetailEndTime() {
        return this.drawDetailEndTime;
    }

    @NotNull
    public final List<FingerBSList> getFingerBSList() {
        return this.fingerBSList;
    }

    @NotNull
    public final Map<Integer, FingerBSList> getFingerHighLightMap() {
        return this.fingerHighLightMap;
    }

    public final int getHighLightType() {
        return this.highLightType;
    }

    @NotNull
    public final List<Pair<Float, Float>> getItem() {
        return this.item;
    }

    public final float getSelectX() {
        return this.selectX;
    }

    @Nullable
    public final Float getSelectY() {
        return this.selectY;
    }

    @NotNull
    public final List<BloodGlucoseLineChartData> getValues() {
        return this.values;
    }

    public final void setDrawDetailEndTime(@Nullable Long l) {
        this.drawDetailEndTime = l;
    }

    public final void setHighLightType(int i) {
        this.highLightType = i;
    }

    public final void setItem(@NotNull List<Pair<Float, Float>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.item = list;
    }

    public final void setSelectX(float f) {
        this.selectX = f;
    }

    public final void setSelectY(@Nullable Float f) {
        this.selectY = f;
    }

    public final void setValues(@NotNull List<BloodGlucoseLineChartData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.values = list;
    }
}
