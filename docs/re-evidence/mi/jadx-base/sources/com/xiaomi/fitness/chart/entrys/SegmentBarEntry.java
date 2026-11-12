package com.xiaomi.fitness.chart.entrys;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import defpackage.hrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001%B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dB\u001f\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001eB)\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010$J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "", "Lhrl;", "rectModelList", "", "setMaxMinValue", "(Ljava/util/List;)V", "", "rectValueModelList", "Ljava/util/List;", "", "segmentRange", "I", Constants.KEY_RECHARGE_MAXVALUE, "getMaxValue", "()I", "setMaxValue", "(I)V", Constants.KEY_RECHARGE_MINVALUE, "getMinValue", "setMinValue", "", "getRangeStr", "()Ljava/lang/String;", "rangeStr", "", Constants.KEY_RECHARGE_VALUES, "<init>", "([FI)V", "(Ljava/util/List;I)V", "i", "y", "", "startTime", "type", "(IIJI)V", "Companion", "chart_release"}, k = 1, mv = {2, 0, 0})
public class SegmentBarEntry extends RecyclerBarEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int SEGMENT_RANGE_BLOOD_PRESSURE = 5;
    public static final int SEGMENT_RANGE_HRM = 10;
    public static final int SEGMENT_RANGE_SPO = 1;
    public static final int SEGMENT_RANGE_STRESS = 5;
    public static final int SEGMENT_RANGE_TEMPERATURE = 1;
    private int maxValue;
    private int minValue;

    @JvmField
    @Nullable
    public List<hrl> rectValueModelList;
    private int segmentRange;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry$Companion;", "", "", "segmentRange", "", Constants.KEY_RECHARGE_VALUES, "rectColor", "boardColor", "", "Lhrl;", "getRectModels", "(ILjava/util/List;II)Ljava/util/List;", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "entries", "", "getSegmentListMaxValue", "(Ljava/util/List;)F", "getSegmentListMinValue", "SEGMENT_RANGE_STRESS", "I", "SEGMENT_RANGE_HRM", "SEGMENT_RANGE_BLOOD_PRESSURE", "SEGMENT_RANGE_SPO", "SEGMENT_RANGE_TEMPERATURE", "<init>", "()V", "chart_release"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final List<hrl> getRectModels(int segmentRange, @NotNull List<Integer> values, int rectColor, int boardColor) {
            Intrinsics.checkNotNullParameter(values, "values");
            ArrayList arrayList = new ArrayList();
            if (ArrayUtils.isEmpty(values)) {
                return arrayList;
            }
            int i = 1;
            if (values.size() > 1) {
                Collections.sort(values);
            }
            int iIntValue = values.get(0).intValue();
            float f = iIntValue;
            hrl hrlVar = new hrl(f, f);
            hrlVar.c = rectColor;
            hrlVar.d = boardColor;
            arrayList.add(hrlVar);
            int size = values.size();
            while (i < size) {
                int iIntValue2 = values.get(i).intValue();
                if (iIntValue2 - iIntValue > segmentRange) {
                    float f2 = iIntValue2;
                    hrl hrlVar2 = new hrl(f2, f2);
                    hrlVar2.c = rectColor;
                    hrlVar2.d = boardColor;
                    arrayList.add(hrlVar2);
                    hrlVar = hrlVar2;
                } else {
                    hrlVar.f20377a = iIntValue2;
                }
                i++;
                iIntValue = iIntValue2;
            }
            return arrayList;
        }

        public final float getSegmentListMaxValue(@NotNull List<? extends SegmentBarEntry> entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            if (entries.isEmpty()) {
                return 0.0f;
            }
            int maxValue = entries.get(0).getMaxValue();
            int size = entries.size();
            for (int i = 0; i < size; i++) {
                maxValue = Math.max(maxValue, entries.get(i).getMaxValue());
            }
            return maxValue;
        }

        public final float getSegmentListMinValue(@NotNull List<? extends SegmentBarEntry> entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            if (entries.isEmpty()) {
                return 0.0f;
            }
            int minValue = entries.get(0).getMinValue();
            int size = entries.size();
            for (int i = 0; i < size; i++) {
                minValue = Math.min(minValue, entries.get(i).getMinValue());
            }
            return minValue;
        }
    }

    public SegmentBarEntry(@NotNull float[] values, int i) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.segmentRange = i;
        int length = values.length;
        this.rectValueModelList = new ArrayList();
        if (length <= 0) {
            return;
        }
        float f = values[0];
        hrl hrlVar = new hrl(f, f);
        List<hrl> list = this.rectValueModelList;
        if (list != null) {
            list.add(hrlVar);
        }
        int i2 = 1;
        while (i2 < length) {
            float f2 = values[i2];
            if (f2 - f > i) {
                hrl hrlVar2 = new hrl(f2, f2);
                List<hrl> list2 = this.rectValueModelList;
                if (list2 != null) {
                    list2.add(hrlVar2);
                }
                hrlVar = hrlVar2;
            } else {
                hrlVar.f20377a = f2;
                hrlVar.f20378b = f;
            }
            i2++;
            f = f2;
        }
    }

    @JvmStatic
    @NotNull
    public static final List<hrl> getRectModels(int i, @NotNull List<Integer> list, int i2, int i3) {
        return INSTANCE.getRectModels(i, list, i2, i3);
    }

    private final void setMaxMinValue(List<? extends hrl> rectModelList) {
        List<? extends hrl> list = rectModelList;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                hrl hrlVar = rectModelList.get(i);
                arrayList.add(Float.valueOf(hrlVar.f20377a));
                arrayList.add(Float.valueOf(hrlVar.f20378b));
            }
            CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
            this.minValue = Math.round(((Number) arrayList.get(0)).floatValue());
            this.maxValue = Math.round(((Number) arrayList.get(arrayList.size() - 1)).floatValue());
        }
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final String getRangeStr() {
        int i = this.maxValue;
        int i2 = this.minValue;
        if (i <= i2) {
            return String.valueOf(i);
        }
        return i2 + "-" + i;
    }

    public final void setMaxValue(int i) {
        this.maxValue = i;
    }

    public final void setMinValue(int i) {
        this.minValue = i;
    }

    public SegmentBarEntry(@NotNull List<hrl> rectValueModelList, int i) {
        Intrinsics.checkNotNullParameter(rectValueModelList, "rectValueModelList");
        this.rectValueModelList = rectValueModelList;
        this.segmentRange = i;
        setMaxMinValue(rectValueModelList);
    }

    public SegmentBarEntry(int i, int i2, long j, int i3) {
        super(i, i2, j, i3);
    }
}
