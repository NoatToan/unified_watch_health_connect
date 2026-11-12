package com.huami.ecg.core.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntProgression;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-BU\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040'\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040'\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0016¢\u0006\u0004\b*\u0010+B-\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040'\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040'\u0012\u0006\u0010&\u001a\u00020\u0016¢\u0006\u0004\b*\u0010,J\u0006\u0010\u0002\u001a\u00020\u0000R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010 \u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010#\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0019\u0010&\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040'8F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010\b¨\u0006."}, d2 = {"Lcom/huami/ecg/core/model/FilterRecord;", "", "clone", "", "", "a", "Ljava/util/List;", "getFilter", "()Ljava/util/List;", "filter", "b", "getRawData", "rawData", "", "c", "[I", "getNoisePosition", "()[I", "noisePosition", GoogleApiAvailabilityLight.a, "getRpeaks", "rpeaks", "", "e", LogUtil.I, "getNoisePercent", "()I", "noisePercent", "f", "F", "getAverageHR", "()F", "averageHR", "g", "getHRVRmssd", "HRVRmssd", "h", "getDeviceSource", "deviceSource", "", "getFilterData", "filterData", "<init>", "(Ljava/util/List;Ljava/util/List;[I[IIFFI)V", "(Ljava/util/List;Ljava/util/List;I)V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class FilterRecord {
    private static final String i = "FilterRecord";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Float> filter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Float> rawData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final int[] noisePosition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final int[] rpeaks;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int noisePercent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float averageHR;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float HRVRmssd;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int deviceSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(0);
            this.b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "filterData.size:" + this.b.size() + ", noisePosition:" + Arrays.toString(FilterRecord.this.getNoisePosition());
        }
    }

    public FilterRecord(@NotNull List<Float> list, @NotNull List<Float> list2, @NotNull int[] iArr, @NotNull int[] iArr2, int i2, float f, float f2, int i3) {
        Vector vector = new Vector();
        this.filter = vector;
        Vector vector2 = new Vector();
        this.rawData = vector2;
        vector.addAll(list);
        vector2.addAll(list2);
        this.noisePosition = iArr;
        this.rpeaks = iArr2;
        this.noisePercent = i2;
        this.averageHR = f;
        this.HRVRmssd = f2;
        this.deviceSource = i3;
    }

    @NotNull
    public final FilterRecord clone() {
        return new FilterRecord(this.filter, this.rawData, this.noisePosition, this.rpeaks, this.noisePercent, this.averageHR, this.HRVRmssd, this.deviceSource);
    }

    public final float getAverageHR() {
        return this.averageHR;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final List<Float> getFilter() {
        return this.filter;
    }

    @NotNull
    public final List<Float> getFilterData() {
        if (this.noisePosition.length == 0) {
            return this.filter;
        }
        ArrayList arrayList = new ArrayList();
        IntProgression intProgressionStep = e.step(ArraysKt___ArraysKt.getIndices(this.noisePosition), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step < 0 ? first >= last : first <= last) {
            int i2 = 0;
            while (true) {
                if (first == 0 || first == this.noisePosition.length - 2) {
                    if (first == 0) {
                        List<Float> list = this.filter;
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = 0;
                        for (Object obj : list) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            ((Number) obj).floatValue();
                            if (i3 < this.noisePosition[first]) {
                                arrayList2.add(obj);
                            }
                            i3 = i4;
                        }
                        arrayList.addAll(arrayList2);
                    } else {
                        List<Float> list2 = this.filter;
                        ArrayList arrayList3 = new ArrayList();
                        int i5 = 0;
                        for (Object obj2 : list2) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            ((Number) obj2).floatValue();
                            int[] iArr = this.noisePosition;
                            if (i5 >= iArr[i2] && i5 < iArr[first]) {
                                arrayList3.add(obj2);
                            }
                            i5 = i6;
                        }
                        arrayList.addAll(arrayList3);
                    }
                    i2 = first + 1;
                    int[] iArr2 = this.noisePosition;
                    if (first == iArr2.length - 2 && iArr2[i2] != this.filter.size()) {
                        List<Float> list3 = this.filter;
                        ArrayList arrayList4 = new ArrayList();
                        int i7 = 0;
                        for (Object obj3 : list3) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            ((Number) obj3).floatValue();
                            if (i7 >= this.noisePosition[i2]) {
                                arrayList4.add(obj3);
                            }
                            i7 = i8;
                        }
                        arrayList.addAll(arrayList4);
                    }
                } else {
                    List<Float> list4 = this.filter;
                    ArrayList arrayList5 = new ArrayList();
                    int i9 = 0;
                    for (Object obj4 : list4) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        ((Number) obj4).floatValue();
                        int[] iArr3 = this.noisePosition;
                        if (i9 >= iArr3[i2] && i9 < iArr3[first]) {
                            arrayList5.add(obj4);
                        }
                        i9 = i10;
                    }
                    arrayList.addAll(arrayList5);
                    i2 = first + 1;
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        HMLog.info(i, new a(arrayList));
        return arrayList;
    }

    public final float getHRVRmssd() {
        return this.HRVRmssd;
    }

    public final int getNoisePercent() {
        return this.noisePercent;
    }

    @NotNull
    public final int[] getNoisePosition() {
        return this.noisePosition;
    }

    @NotNull
    public final List<Float> getRawData() {
        return this.rawData;
    }

    @NotNull
    public final int[] getRpeaks() {
        return this.rpeaks;
    }

    public FilterRecord(@NotNull List<Float> list, @NotNull List<Float> list2, int i2) {
        Vector vector = new Vector();
        this.filter = vector;
        Vector vector2 = new Vector();
        this.rawData = vector2;
        vector.addAll(list);
        vector2.addAll(list2);
        this.noisePosition = new int[0];
        this.rpeaks = new int[0];
        this.noisePercent = 0;
        this.averageHR = 0.0f;
        this.HRVRmssd = 0.0f;
        this.deviceSource = i2;
    }
}
