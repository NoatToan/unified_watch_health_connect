package com.huami.bloodpressure_ui.ext;

import android.util.SparseArray;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_ui.chart.BarChartVo;
import com.huami.bloodpressure_ui.tab.TimeMode;
import com.huami.chart.data.ChartData;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000\u001ab\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000ej\b\u0012\u0004\u0012\u00020\u0003`\u000f2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00110\u0002\u001a\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013*\b\u0012\u0004\u0012\u00020\u00050\u0002\u001a.\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0002*\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0014\u001a\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0000*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001aJ\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u00052\u0006\u0010!\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0014\u001a¢\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010!\u001a\u00020\u00072\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00132\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00132\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00132\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00132\u0006\u0010,\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010-\u001a\u00020\u00072\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0013¨\u00060"}, d2 = {"", "", "", "Lcom/huami/bloodpressure_ui/ext/BloodPressureWrap;", "data", "Lcom/huami/bloodpressure_ui/ext/BloodPressureDto;", "mapBpMaxAndMinValue", "", "intervalData", "maxSbp", "minSbp", "maxDbp", "minDbp", "lastBp", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "minuteLimit", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "toWrap", "Lkotlin/Pair;", "", "getRangeByPoints", "Ljava/util/Date;", "start", "chartOffset", "Lcom/huami/bloodpressure_ui/chart/BarChartVo;", "", "toDailyBpChartDataList", "toDailyMinuteChartMap", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "getDailyMinuteSbpList", "getDailyMinuteDbpList", "index", "Lcom/huami/bloodpressure_ui/tab/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "timeStamp", "chartRange", "toBpChartVo", "highRange", "highPair", "lowRange", "lowPair", "offset", "dayFrequency", "avgPair", "toBarChartVo", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureDbExKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.DAY.ordinal()] = 1;
            iArr[TimeMode.WEEK.ordinal()] = 2;
            iArr[TimeMode.MONTH.ordinal()] = 3;
            iArr[TimeMode.YEAR.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set last data error error " + this.a;
        }
    }

    @NotNull
    public static final SparseArray<ChartData> getDailyMinuteDbpList(@NotNull List<BloodPressureWrap> list) {
        SparseArray<ChartData> sparseArray = new SparseArray<>();
        for (BloodPressureWrap bloodPressureWrap : list) {
            int minuteOfDay = TimeEx.INSTANCE.getMinuteOfDay(Long.valueOf(bloodPressureWrap.getBp().getMeasureTime()), 5);
            sparseArray.put(minuteOfDay, new ChartData(minuteOfDay, bloodPressureWrap.getBp().getDbp()));
        }
        return sparseArray;
    }

    @NotNull
    public static final SparseArray<ChartData> getDailyMinuteSbpList(@NotNull List<BloodPressureWrap> list) {
        SparseArray<ChartData> sparseArray = new SparseArray<>();
        for (BloodPressureWrap bloodPressureWrap : list) {
            int minuteOfDay = TimeEx.INSTANCE.getMinuteOfDay(Long.valueOf(bloodPressureWrap.getBp().getMeasureTime()), 5);
            sparseArray.put(minuteOfDay, new ChartData(minuteOfDay, bloodPressureWrap.getBp().getSbp()));
        }
        return sparseArray;
    }

    @Nullable
    public static final Pair<Float, Float> getRangeByPoints(@NotNull List<BloodPressureDto> list) {
        float fIntValue = 300.0f;
        float fIntValue2 = 30.0f;
        for (BloodPressureDto bloodPressureDto : list) {
            if (fIntValue > bloodPressureDto.getHeightValue().getFirst().intValue()) {
                fIntValue = bloodPressureDto.getHeightValue().getFirst().intValue();
            }
            if (fIntValue > bloodPressureDto.getLowValue().getFirst().intValue()) {
                fIntValue = bloodPressureDto.getLowValue().getFirst().intValue();
            }
            if (fIntValue2 < bloodPressureDto.getHeightValue().getSecond().intValue()) {
                fIntValue2 = bloodPressureDto.getHeightValue().getSecond().intValue();
            }
            if (fIntValue2 < bloodPressureDto.getLowValue().getSecond().intValue()) {
                fIntValue2 = bloodPressureDto.getLowValue().getSecond().intValue();
            }
        }
        List<Float> bp_third_range_list = (fIntValue <= 60.0f || fIntValue2 >= 160.0f) ? (fIntValue <= 40.0f || fIntValue2 >= 200.0f) ? BloodPressureConstKt.getBP_THIRD_RANGE_LIST() : BloodPressureConstKt.getBP_SECOND_RANGE_LIST() : BloodPressureConstKt.getBP_FIRST_RANGE_LIST();
        if (bp_third_range_list == null || bp_third_range_list.isEmpty()) {
            return null;
        }
        return new Pair<>(CollectionsKt.first((List) bp_third_range_list), CollectionsKt.last((List) bp_third_range_list));
    }

    @NotNull
    public static final List<BloodPressureDto> mapBpMaxAndMinValue(@NotNull Map<Object, ? extends List<BloodPressureWrap>> map) {
        Object next;
        Object next2;
        Object next3;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Object, ? extends List<BloodPressureWrap>> entry : map.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((List) entry2.getValue()).size() < 2) {
                BloodPressureWrap bloodPressureWrap = (BloodPressureWrap) CollectionsKt.first((List) entry2.getValue());
                bloodPressureWrap.getLow();
                bloodPressureWrap.getHeight();
                arrayList.add(new BloodPressureDto(bloodPressureWrap.getBp().getMeasureTime(), new Pair(Integer.valueOf(bloodPressureWrap.getLow()), 0), new Pair(Integer.valueOf(bloodPressureWrap.getHeight()), 0)));
            } else {
                Iterator it2 = ((Iterable) entry2.getValue()).iterator();
                Object next4 = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int low = ((BloodPressureWrap) next).getLow();
                        do {
                            Object next5 = it2.next();
                            int low2 = ((BloodPressureWrap) next5).getLow();
                            if (low < low2) {
                                next = next5;
                                low = low2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                BloodPressureWrap bloodPressureWrap2 = (BloodPressureWrap) next;
                int low3 = bloodPressureWrap2 == null ? 0 : bloodPressureWrap2.getLow();
                Iterator it3 = ((Iterable) entry2.getValue()).iterator();
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        int low4 = ((BloodPressureWrap) next2).getLow();
                        do {
                            Object next6 = it3.next();
                            int low5 = ((BloodPressureWrap) next6).getLow();
                            if (low4 > low5) {
                                next2 = next6;
                                low4 = low5;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next2 = null;
                }
                BloodPressureWrap bloodPressureWrap3 = (BloodPressureWrap) next2;
                int low6 = bloodPressureWrap3 == null ? 0 : bloodPressureWrap3.getLow();
                Iterator it4 = ((Iterable) entry2.getValue()).iterator();
                if (it4.hasNext()) {
                    next3 = it4.next();
                    if (it4.hasNext()) {
                        int height = ((BloodPressureWrap) next3).getHeight();
                        do {
                            Object next7 = it4.next();
                            int height2 = ((BloodPressureWrap) next7).getHeight();
                            if (height < height2) {
                                next3 = next7;
                                height = height2;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next3 = null;
                }
                BloodPressureWrap bloodPressureWrap4 = (BloodPressureWrap) next3;
                int height3 = bloodPressureWrap4 == null ? 0 : bloodPressureWrap4.getHeight();
                Iterator it5 = ((Iterable) entry2.getValue()).iterator();
                if (it5.hasNext()) {
                    next4 = it5.next();
                    if (it5.hasNext()) {
                        int height4 = ((BloodPressureWrap) next4).getHeight();
                        do {
                            Object next8 = it5.next();
                            int height5 = ((BloodPressureWrap) next8).getHeight();
                            if (height4 > height5) {
                                next4 = next8;
                                height4 = height5;
                            }
                        } while (it5.hasNext());
                    }
                }
                BloodPressureWrap bloodPressureWrap5 = (BloodPressureWrap) next4;
                int height6 = bloodPressureWrap5 != null ? bloodPressureWrap5.getHeight() : 0;
                if (low3 != 0 && low6 != 0 && height3 != 0 && height6 != 0) {
                    BloodPressureWrap bloodPressureWrap6 = (BloodPressureWrap) CollectionsKt.firstOrNull((List) entry2.getValue());
                    arrayList.add(new BloodPressureDto(bloodPressureWrap6 == null ? 0L : bloodPressureWrap6.getBp().getMeasureTime(), new Pair(Integer.valueOf(low6), Integer.valueOf(low3)), new Pair(Integer.valueOf(height6), Integer.valueOf(height3))));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ArrayList<BloodPressureWrap> minuteLimit(@NotNull Map<Integer, ? extends List<BloodPressureWrap>> map, @Nullable BloodPressureWrap bloodPressureWrap, @Nullable BloodPressureWrap bloodPressureWrap2, @Nullable BloodPressureWrap bloodPressureWrap3, @Nullable BloodPressureWrap bloodPressureWrap4, @Nullable BloodPressureWrap bloodPressureWrap5) {
        Object objM3845constructorimpl;
        ArrayList<BloodPressureWrap> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, ? extends List<BloodPressureWrap>> entry : map.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object objLast = CollectionsKt.last((List<? extends Object>) entry2.getValue());
            if (bloodPressureWrap4 != null && ((List) entry2.getValue()).contains(bloodPressureWrap4)) {
                objLast = bloodPressureWrap4;
            }
            if (bloodPressureWrap2 != null && ((List) entry2.getValue()).contains(bloodPressureWrap2)) {
                objLast = bloodPressureWrap2;
            }
            if (bloodPressureWrap3 != null && ((List) entry2.getValue()).contains(bloodPressureWrap3)) {
                objLast = bloodPressureWrap3;
            }
            if (bloodPressureWrap != null && ((List) entry2.getValue()).contains(bloodPressureWrap)) {
                objLast = bloodPressureWrap;
            }
            arrayList.add(objLast);
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(bloodPressureWrap5 == null ? null : (BloodPressureWrap) arrayList.set(CollectionsKt__CollectionsKt.getLastIndex(arrayList), bloodPressureWrap5));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info$default(null, new a(thM3848exceptionOrNullimpl), 1, null);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x0173  */
    /* JADX WARN: Code duplicated, block: B:53:0x0189  */
    /* JADX WARN: Code duplicated, block: B:55:0x018c  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e5  */
    @NotNull
    public static final BarChartVo<Number> toBarChartVo(int i, @NotNull Pair<? extends Number, ? extends Number> pair, @Nullable Pair<? extends Number, ? extends Number> pair2, @NotNull Pair<? extends Number, ? extends Number> pair3, @Nullable Pair<? extends Number, ? extends Number> pair4, float f, @NotNull TimeMode timeMode, long j, int i2, @Nullable Pair<? extends Number, ? extends Number> pair5) {
        float fFloatValue;
        boolean z;
        boolean z2;
        Pair<? extends Number, ? extends Number> pair6;
        String timeYMD;
        float fFloatValue2;
        boolean z3;
        Pair pair7;
        int blood_pressure_offset = BloodPressureConstKt.getBLOOD_PRESSURE_OFFSET();
        Pair pair8 = new Pair(Float.valueOf(f), Float.valueOf(f));
        Pair pair9 = new Pair(Float.valueOf(f), Float.valueOf(f));
        Pair<? extends Number, ? extends Number> pair10 = null;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z4 = false;
        if (pair2 == null) {
            pair6 = null;
        } else {
            float fFloatValue3 = pair.getFirst().floatValue();
            float fFloatValue4 = pair.getSecond().floatValue();
            if (pair2.getSecond().floatValue() == 0.0f) {
                fFloatValue = pair2.getFirst().floatValue();
                if (fFloatValue3 <= fFloatValue || fFloatValue > fFloatValue3 + blood_pressure_offset) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    float f2 = 2 * f;
                    pair8 = new Pair(fValueOf, Float.valueOf(f2));
                    pair6 = new Pair<>(pair2.getFirst(), Float.valueOf(pair2.getFirst().floatValue() + f2));
                } else {
                    if (fFloatValue4 - blood_pressure_offset <= fFloatValue || fFloatValue > fFloatValue4) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        float f3 = 2 * f;
                        pair8 = new Pair(Float.valueOf(f3), fValueOf);
                        pair6 = new Pair<>(Float.valueOf(pair2.getFirst().floatValue() - f3), pair2.getFirst());
                    } else {
                        pair8 = new Pair(Float.valueOf(f), Float.valueOf(f));
                        pair6 = new Pair<>(Float.valueOf(pair2.getFirst().floatValue() - f), Float.valueOf(pair2.getFirst().floatValue() + f));
                    }
                }
            } else {
                if (pair2.getFirst().floatValue() == pair2.getSecond().floatValue()) {
                    fFloatValue = pair2.getFirst().floatValue();
                    if (fFloatValue3 <= fFloatValue) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z) {
                        float f4 = 2 * f;
                        pair8 = new Pair(fValueOf, Float.valueOf(f4));
                        pair6 = new Pair<>(pair2.getFirst(), Float.valueOf(pair2.getFirst().floatValue() + f4));
                    } else {
                        if (fFloatValue4 - blood_pressure_offset <= fFloatValue) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            float f5 = 2 * f;
                            pair8 = new Pair(Float.valueOf(f5), fValueOf);
                            pair6 = new Pair<>(Float.valueOf(pair2.getFirst().floatValue() - f5), pair2.getFirst());
                        } else {
                            pair8 = new Pair(Float.valueOf(f), Float.valueOf(f));
                            pair6 = new Pair<>(Float.valueOf(pair2.getFirst().floatValue() - f), Float.valueOf(pair2.getFirst().floatValue() + f));
                        }
                    }
                } else {
                    pair8 = new Pair(fValueOf, fValueOf);
                    pair6 = pair2;
                }
            }
        }
        if (pair4 != null) {
            float fFloatValue5 = pair3.getFirst().floatValue();
            float fFloatValue6 = pair3.getSecond().floatValue();
            if (pair4.getSecond().floatValue() == 0.0f) {
                fFloatValue2 = pair4.getFirst().floatValue();
                if (fFloatValue5 <= fFloatValue2 || fFloatValue2 > fFloatValue5 + blood_pressure_offset) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    float f6 = 2 * f;
                    pair7 = new Pair(fValueOf, Float.valueOf(f6));
                    pair10 = new Pair<>(pair4.getFirst(), Float.valueOf(pair4.getFirst().floatValue() + f6));
                } else {
                    if (fFloatValue6 - blood_pressure_offset <= fFloatValue2 && fFloatValue2 <= fFloatValue6) {
                        z4 = true;
                    }
                    if (z4) {
                        float f7 = 2 * f;
                        pair7 = new Pair(Float.valueOf(f7), fValueOf);
                        pair10 = new Pair<>(Float.valueOf(pair4.getFirst().floatValue() - f7), pair4.getFirst());
                    } else {
                        pair7 = new Pair(Float.valueOf(f), Float.valueOf(f));
                        pair10 = new Pair<>(Float.valueOf(pair4.getFirst().floatValue() - f), Float.valueOf(pair4.getFirst().floatValue() + f));
                    }
                }
            } else {
                if (pair4.getFirst().floatValue() == pair4.getSecond().floatValue()) {
                    fFloatValue2 = pair4.getFirst().floatValue();
                    if (fFloatValue5 <= fFloatValue2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        float f8 = 2 * f;
                        pair7 = new Pair(fValueOf, Float.valueOf(f8));
                        pair10 = new Pair<>(pair4.getFirst(), Float.valueOf(pair4.getFirst().floatValue() + f8));
                    } else {
                        if (fFloatValue6 - blood_pressure_offset <= fFloatValue2) {
                            z4 = true;
                        }
                        if (z4) {
                            float f9 = 2 * f;
                            pair7 = new Pair(Float.valueOf(f9), fValueOf);
                            pair10 = new Pair<>(Float.valueOf(pair4.getFirst().floatValue() - f9), pair4.getFirst());
                        } else {
                            pair7 = new Pair(Float.valueOf(f), Float.valueOf(f));
                            pair10 = new Pair<>(Float.valueOf(pair4.getFirst().floatValue() - f), Float.valueOf(pair4.getFirst().floatValue() + f));
                        }
                    }
                } else {
                    pair7 = new Pair(fValueOf, fValueOf);
                    pair10 = pair4;
                }
            }
            pair9 = pair7;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i3 == 1) {
            TimeFormatEx timeFormatEx = TimeFormatEx.INSTANCE;
            timeYMD = timeFormatEx.formatTimeYMDHH(j) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + timeFormatEx.formatTimeHH(j + ((long) (60000 * i2)));
        } else if (i3 == 2 || i3 == 3) {
            timeYMD = TimeFormatEx.INSTANCE.formatTimeYMD(j);
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            timeYMD = TimeFormatEx.INSTANCE.formatTimeYM(j);
        }
        return new BarChartVo<>(i, pair6, pair8, pair10, pair9, timeYMD, pair5);
    }

    public static /* synthetic */ BarChartVo toBarChartVo$default(int i, Pair pair, Pair pair2, Pair pair3, Pair pair4, float f, TimeMode timeMode, long j, int i2, Pair pair5, int i3, Object obj) {
        return toBarChartVo(i, pair, pair2, pair3, pair4, f, timeMode, j, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? null : pair5);
    }

    @NotNull
    public static final BarChartVo<Number> toBpChartVo(@NotNull BloodPressureDto bloodPressureDto, int i, @NotNull TimeMode timeMode, long j, @Nullable Pair<Float, Float> pair, float f) {
        Pair<Float, Float> blood_pressure_data_range = pair == null ? BloodPressureConstKt.getBLOOD_PRESSURE_DATA_RANGE() : pair;
        return toBarChartVo$default(i, blood_pressure_data_range, bloodPressureDto.getHeightValue(), blood_pressure_data_range, bloodPressureDto.getLowValue(), f, timeMode, j, 60, null, 512, null);
    }

    public static /* synthetic */ BarChartVo toBpChartVo$default(BloodPressureDto bloodPressureDto, int i, TimeMode timeMode, long j, Pair pair, float f, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            pair = null;
        }
        return toBpChartVo(bloodPressureDto, i, timeMode, j, pair, (i2 & 16) != 0 ? 6.0f : f);
    }

    @NotNull
    public static final List<BarChartVo<Number>> toDailyBpChartDataList(@NotNull List<BloodPressureDto> list, @NotNull Date date, float f) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(TimeEx.INSTANCE.getDayStartTime(date.getTime()));
        Pair<Float, Float> rangeByPoints = getRangeByPoints(list);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BloodPressureDto bloodPressureDto : list) {
            calendar.setTimeInMillis(bloodPressureDto.getTime());
            if (TimeEx.INSTANCE.isTheSameDay(calendar2.getTimeInMillis(), calendar.getTimeInMillis())) {
                arrayList.add(toBpChartVo(bloodPressureDto, (int) ((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / ((long) 3600000)), TimeMode.DAY, calendar.getTimeInMillis(), rangeByPoints, f));
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return arrayList;
    }

    public static /* synthetic */ List toDailyBpChartDataList$default(List list, Date date, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return toDailyBpChartDataList(list, date, f);
    }

    @NotNull
    public static final Map<Integer, BloodPressureWrap> toDailyMinuteChartMap(@NotNull List<BloodPressureWrap> list) {
        HashMap map = new HashMap();
        for (BloodPressureWrap bloodPressureWrap : list) {
            map.put(Integer.valueOf(TimeEx.INSTANCE.getMinuteOfDay(Long.valueOf(bloodPressureWrap.getBp().getMeasureTime()), 5)), bloodPressureWrap);
        }
        return map;
    }

    @NotNull
    public static final List<BloodPressureWrap> toWrap(@NotNull List<BloodPressureDbVo> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new BloodPressureWrap((BloodPressureDbVo) it2.next()));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }
}
