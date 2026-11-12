package com.xiaomi.fitness.chart.entrys;

import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.chart.entrys.model.SportRecordItemList;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.aji;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0003J\u000e\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0003J\u000e\u0010-\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0003J\u000e\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0005R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00180\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00180\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/SportRecordLandEntry;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "i", "", "value", "", "timestamp", "", "type", "<init>", "(IFJI)V", "selectX", "getSelectX", "()F", "setSelectX", "(F)V", "item", "", "Lkotlin/Pair;", "getItem", "()Ljava/util/List;", "setItem", "(Ljava/util/List;)V", "dataItem", "Lcom/xiaomi/fitness/chart/entrys/model/SportRecordItemList;", "getDataItem", "()Lcom/xiaomi/fitness/chart/entrys/model/SportRecordItemList;", "setDataItem", "(Lcom/xiaomi/fitness/chart/entrys/model/SportRecordItemList;)V", "otherLineDataList", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "getOtherLineDataList", "()Ljava/util/Map;", "setOtherLineDataList", "(Ljava/util/Map;)V", "otherPointDataList", "getOtherPointDataList", "setOtherPointDataList", "showRecordKeyList", "getShowRecordKeyList", "setShowRecordKeyList", "getChartValues", "index", "getItemValues", "getItemTime", "findRangeIndex", "pointX", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportRecordLandEntry extends MaxMinEntry {

    @NotNull
    private SportRecordItemList dataItem;

    @NotNull
    private List<Pair<Float, Float>> item;

    @NotNull
    private Map<SportRecordKey, SportRecordItemList> otherLineDataList;

    @NotNull
    private Map<SportRecordKey, SportRecordItemList> otherPointDataList;
    private float selectX;

    @NotNull
    private List<? extends SportRecordKey> showRecordKeyList;

    public SportRecordLandEntry(int i, float f, long j, int i2) {
        super(i, f, j, i2);
        this.selectX = -1.0f;
        this.item = new ArrayList();
        this.dataItem = new SportRecordItemList(SportRecordKey.Hr, ExtUtilsKt.getColor(aji.u));
        this.otherLineDataList = new LinkedHashMap();
        this.otherPointDataList = new LinkedHashMap();
        this.showRecordKeyList = new ArrayList();
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
        return size;
    }

    public final float getChartValues(int index) {
        return this.dataItem.getListValue().get(index).getItemChartValue();
    }

    @NotNull
    public final SportRecordItemList getDataItem() {
        return this.dataItem;
    }

    @NotNull
    public final List<Pair<Float, Float>> getItem() {
        return this.item;
    }

    public final long getItemTime(int index) {
        return this.dataItem.getListValue().get(index).getItemTime();
    }

    public final float getItemValues(int index) {
        return this.dataItem.getListValue().get(index).getItemValue();
    }

    @NotNull
    public final Map<SportRecordKey, SportRecordItemList> getOtherLineDataList() {
        return this.otherLineDataList;
    }

    @NotNull
    public final Map<SportRecordKey, SportRecordItemList> getOtherPointDataList() {
        return this.otherPointDataList;
    }

    public final float getSelectX() {
        return this.selectX;
    }

    @NotNull
    public final List<SportRecordKey> getShowRecordKeyList() {
        return this.showRecordKeyList;
    }

    public final void setDataItem(@NotNull SportRecordItemList sportRecordItemList) {
        Intrinsics.checkNotNullParameter(sportRecordItemList, "<set-?>");
        this.dataItem = sportRecordItemList;
    }

    public final void setItem(@NotNull List<Pair<Float, Float>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.item = list;
    }

    public final void setOtherLineDataList(@NotNull Map<SportRecordKey, SportRecordItemList> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.otherLineDataList = map;
    }

    public final void setOtherPointDataList(@NotNull Map<SportRecordKey, SportRecordItemList> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.otherPointDataList = map;
    }

    public final void setSelectX(float f) {
        this.selectX = f;
    }

    public final void setShowRecordKeyList(@NotNull List<? extends SportRecordKey> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.showRecordKeyList = list;
    }
}
