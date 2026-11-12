package com.xiaomi.hm.health.healthdata.utils.stress;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.hmchartui.utils.CommonExtensionUtilsKt;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.model.Stress;
import com.huami.stress.domain.service.StressLevelService;
import com.huami.stress.domain.utils.RationUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.colorsbar.ColorsBarData;
import com.xiaomi.hm.health.healthdata.core.dto.BarDto;
import com.xiaomi.hm.health.healthdata.dto.StressDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.DayStressDetailData;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.StatisticsStressDetailData;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.StressLevelRatio;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.StressStatisticsInfo;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H\u0002J6\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0013H\u0002J\u0016\u0010\u001a\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J$\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ$\u0010!\u001a\u00020 2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"J\u0016\u0010)\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0005R\u001e\u0010,\u001a\n **\u0004\u0018\u00010%0%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010-¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/stress/StressDataHelper;", "", "", "Lcom/huami/stress/domain/model/Stress;", "dayStress", "", "frequency", "f", "", "dayStartTime", "dataTime", "b", "c", "Lcom/huami/stress/domain/model/SingleStress;", "list", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;", "e", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "data", "Lcom/xiaomi/hm/health/healthdata/core/dto/BarDto;", "", GoogleApiAvailabilityLight.a, "stress", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressLevelRatio;", "a", "rawData", "Ljava/util/Date;", "date", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/DayStressDetailData;", "getDayStressDetailData", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StatisticsStressDetailData;", "getStatisticsStressDetailData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "value", "", "getDisplayValue", "Lcom/huami/widget/colorsbar/ColorsBarData;", "getStressColorsBarData", "getStressLevelStr", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "tag", LogUtil.I, "MILLI_SECONDS_IN_MINUTE", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressDataHelper {

    @NotNull
    public static final StressDataHelper INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int MILLI_SECONDS_IN_MINUTE = 60000;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            iArr[TimeMode.YEAR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, int i3, int i4) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "size relax:" + this.a + ",normal:" + this.b + ",medium:" + this.c + ",high:" + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, int i3, int i4) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ration relax:" + this.a + ",normal:" + this.b + ",medium:" + this.c + ",high:" + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Stress> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Stress> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "day stress size=" + this.a.size() + ",start=" + ((Stress) CollectionsKt.first((List) this.a)).getTime() + ",end=" + ((Stress) CollectionsKt.last((List) this.a)).getTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Stress> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<Stress> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "chart list size=" + this.a.size() + ",start=" + ((Stress) CollectionsKt.first((List) this.a)).getTime() + ",end=" + ((Stress) CollectionsKt.last((List) this.a)).getTime();
        }
    }

    static {
        StressDataHelper stressDataHelper = new StressDataHelper();
        INSTANCE = stressDataHelper;
        tag = stressDataHelper.getClass().getSimpleName();
    }

    private StressDataHelper() {
    }

    private final StressLevelRatio a(List<Stress> stress) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stress, 10));
        Iterator<T> it2 = stress.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(StressLevelService.INSTANCE.calculateStressLevel(((Stress) it2.next()).getValue())));
        }
        if (arrayList.isEmpty()) {
            return new StressLevelRatio(0, 0, 0, 0, 0, 31, null);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((Number) next).intValue() == 1) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).intValue() == 2) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Number) obj2).intValue() == 3) {
                arrayList4.add(obj2);
            }
        }
        int size3 = arrayList4.size();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((Number) obj3).intValue() == 4) {
                arrayList5.add(obj3);
            }
        }
        int size4 = arrayList5.size();
        String str = tag;
        HMLog.info(str, new a(size, size2, size3, size4));
        List<Integer> listLargestRemainderRound = RationUtils.INSTANCE.largestRemainderRound(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(size), Integer.valueOf(size2), Integer.valueOf(size3), Integer.valueOf(size4)}), 100);
        int iIntValue = listLargestRemainderRound.get(0).intValue();
        int iIntValue2 = listLargestRemainderRound.get(1).intValue();
        int iIntValue3 = listLargestRemainderRound.get(2).intValue();
        int iIntValue4 = listLargestRemainderRound.get(3).intValue();
        HMLog.info(str, new b(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return new StressLevelRatio(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue + iIntValue2 + iIntValue3 + iIntValue4);
    }

    private final int b(long dayStartTime, long dataTime, int frequency) {
        return ((int) (CommonExtensionUtilsKt.secondToMills(dataTime) - dayStartTime)) / (frequency * 60000);
    }

    private final long c(long dayStartTime, long dataTime, int frequency) {
        return dayStartTime + ((long) (b(dayStartTime, dataTime, frequency) * frequency * 60000));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private final List<BarDto<Float>> d(TimeMode timeMode, Map<Object, ? extends List<Stress>> data) {
        Object next;
        float value;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Object, ? extends List<Stress>> entry : data.entrySet()) {
            Object next2 = null;
            float value2 = 0.0f;
            if (timeMode == TimeMode.DAY) {
                value = 0.0f;
            } else {
                Iterator<T> it2 = entry.getValue().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int value3 = ((Stress) next).getValue();
                        do {
                            Object next3 = it2.next();
                            int value4 = ((Stress) next3).getValue();
                            if (value3 > value4) {
                                next = next3;
                                value3 = value4;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Stress stress = (Stress) next;
                if (stress == null) {
                    value = 0.0f;
                } else {
                    value = stress.getValue();
                }
            }
            Iterator<T> it3 = entry.getValue().iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    int value5 = ((Stress) next2).getValue();
                    do {
                        Object next4 = it3.next();
                        int value6 = ((Stress) next4).getValue();
                        if (value5 < value6) {
                            next2 = next4;
                            value5 = value6;
                        }
                    } while (it3.hasNext());
                }
            }
            Stress stress2 = (Stress) next2;
            if (stress2 != null) {
                value2 = stress2.getValue();
            }
            Pair<Float, Float> healthDataRange = HealthDataUtils.INSTANCE.getHealthDataRange(StressDataType.ALL_DAY);
            arrayList.add(new BarDto(healthDataRange, new Pair(Float.valueOf(value), Float.valueOf(value2)), healthDataRange, null, ((Stress) CollectionsKt.first((List) entry.getValue())).getTime()));
        }
        return arrayList;
    }

    private final StressStatisticsInfo e(List<SingleStress> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((SingleStress) obj).getRawSingle()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((SingleStress) obj2).getRawSingle()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        Object next2 = null;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int value = ((SingleStress) next).getValue();
                do {
                    Object next3 = it2.next();
                    int value2 = ((SingleStress) next3).getValue();
                    if (value < value2) {
                        next = next3;
                        value = value2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        SingleStress singleStress = (SingleStress) next;
        int value3 = singleStress == null ? 0 : singleStress.getValue();
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                int value4 = ((SingleStress) next2).getValue();
                do {
                    Object next4 = it3.next();
                    int value5 = ((SingleStress) next4).getValue();
                    if (value4 > value5) {
                        next2 = next4;
                        value4 = value5;
                    }
                } while (it3.hasNext());
            }
        }
        SingleStress singleStress2 = (SingleStress) next2;
        int value6 = singleStress2 == null ? 0 : singleStress2.getValue();
        double value7 = 0.0d;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            value7 += (double) ((SingleStress) it4.next()).getValue();
        }
        return new StressStatisticsInfo(value3, value6, (int) DataExKt.formatWithDecimalFloat(Float.valueOf((float) (value7 / ((double) list.size()))), 0), arrayList2.size());
    }

    private final List<Stress> f(List<Stress> dayStress, int frequency) {
        Object next;
        ArrayList arrayList;
        if (dayStress.isEmpty() || frequency <= 0) {
            return dayStress;
        }
        HMLog.info(tag, new c(dayStress));
        long dayStartTime = HealthDataTimeUtils.INSTANCE.getDayStartTime(((Stress) CollectionsKt.first((List) dayStress)).getTime());
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : dayStress) {
            Integer numValueOf = Integer.valueOf(INSTANCE.b(dayStartTime, ((Stress) obj).getTime(), frequency));
            Object arrayList3 = linkedHashMap.get(numValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList3);
            }
            ((List) arrayList3).add(obj);
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList4.add((List) ((Map.Entry) it2.next()).getValue());
        }
        if (arrayList4.size() == 1) {
            arrayList2.add(new Stress(((Stress) CollectionsKt.last((List) dayStress)).getValue(), c(dayStartTime, ((Stress) CollectionsKt.last((List) dayStress)).getTime(), frequency)));
            return arrayList2;
        }
        Iterator<T> it3 = dayStress.iterator();
        Object next2 = null;
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                int value = ((Stress) next).getValue();
                do {
                    Object next3 = it3.next();
                    int value2 = ((Stress) next3).getValue();
                    if (value < value2) {
                        next = next3;
                        value = value2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        Stress stress = (Stress) next;
        int iB = b(dayStartTime, stress.getTime(), frequency);
        Iterator<T> it4 = dayStress.iterator();
        if (it4.hasNext()) {
            next2 = it4.next();
            if (it4.hasNext()) {
                int value3 = ((Stress) next2).getValue();
                do {
                    Object next4 = it4.next();
                    int value4 = ((Stress) next4).getValue();
                    if (value3 > value4) {
                        next2 = next4;
                        value3 = value4;
                    }
                } while (it4.hasNext());
            }
        }
        Stress stress2 = (Stress) next2;
        int iB2 = b(dayStartTime, stress2.getTime(), frequency);
        int i = 0;
        for (Object obj2 : arrayList4) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List list = (List) obj2;
            StressDataHelper stressDataHelper = INSTANCE;
            int iB3 = stressDataHelper.b(dayStartTime, ((Stress) CollectionsKt.first(list)).getTime(), frequency);
            if (i == CollectionsKt__CollectionsKt.getLastIndex(arrayList4)) {
                arrayList = arrayList4;
                arrayList2.add(new Stress(((Stress) CollectionsKt.last(list)).getValue(), stressDataHelper.c(dayStartTime, ((Stress) CollectionsKt.last(list)).getTime(), frequency)));
            } else {
                arrayList = arrayList4;
                if (iB3 == iB) {
                    arrayList2.add(new Stress(stress.getValue(), stressDataHelper.c(dayStartTime, stress.getTime(), frequency)));
                } else if (iB3 == iB2) {
                    arrayList2.add(new Stress(stress2.getValue(), stressDataHelper.c(dayStartTime, stress2.getTime(), frequency)));
                } else {
                    arrayList2.add(new Stress(((Stress) CollectionsKt.last(list)).getValue(), stressDataHelper.c(dayStartTime, ((Stress) CollectionsKt.last(list)).getTime(), frequency)));
                }
            }
            i = i2;
            arrayList4 = arrayList;
        }
        HMLog.info(tag, new d(arrayList2));
        return arrayList2;
    }

    @NotNull
    public final DayStressDetailData getDayStressDetailData(@NotNull List<SingleStress> rawData, int frequency, @NotNull Date date) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : rawData) {
            if (!((SingleStress) obj).getRawSingle()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : rawData) {
            if (((SingleStress) obj2).getRawSingle()) {
                arrayList2.add(obj2);
            }
        }
        DayStressDetailData dayStressDetailData = new DayStressDetailData();
        StressDataHelper stressDataHelper = INSTANCE;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(DataConverterKt.toStress((SingleStress) it2.next()));
        }
        dayStressDetailData.setChartData(stressDataHelper.f(arrayList3, frequency));
        dayStressDetailData.setFrequency(frequency);
        dayStressDetailData.setManualStressData(CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.xiaomi.hm.health.healthdata.utils.stress.StressDataHelper$getDayStressDetailData$lambda-18$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SingleStress) t2).getTimestamp()), Long.valueOf(((SingleStress) t).getTimestamp()));
            }
        }));
        StressStatisticsInfo stressStatisticsInfoE = INSTANCE.e(arrayList);
        Iterator<T> it3 = dayStressDetailData.getChartData().iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long time = ((Stress) next).getTime();
                do {
                    Object next2 = it3.next();
                    long time2 = ((Stress) next2).getTime();
                    if (time < time2) {
                        next = next2;
                        time = time2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        Stress stress = (Stress) next;
        stressStatisticsInfoE.setLatestValue(stress == null ? null : Integer.valueOf(stress.getValue()));
        stressStatisticsInfoE.setLatestDate(stress != null ? HealthDataTimeUtils.INSTANCE.formatTimeYMDHHmm(stress.getTime()) : null);
        Unit unit = Unit.INSTANCE;
        dayStressDetailData.setStatisticsInfo(stressStatisticsInfoE);
        StressDataHelper stressDataHelper2 = INSTANCE;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(DataConverterKt.toStress((SingleStress) it4.next()));
        }
        dayStressDetailData.setLevelRatio(stressDataHelper2.a(arrayList4));
        StressDataHelper stressDataHelper3 = INSTANCE;
        TimeMode timeMode = TimeMode.DAY;
        List<Stress> chartData = dayStressDetailData.getChartData();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : chartData) {
            String time3 = HealthDataTimeUtils.INSTANCE.formatTime(((Stress) obj3).getTime(), "HH:mm:ss");
            Object arrayList5 = linkedHashMap.get(time3);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(time3, arrayList5);
            }
            ((List) arrayList5).add(obj3);
        }
        List<BarDto<Float>> listD = stressDataHelper3.d(timeMode, linkedHashMap);
        TimeMode timeMode2 = TimeMode.DAY;
        HealthDataUtils healthDataUtils = HealthDataUtils.INSTANCE;
        StressDataType stressDataType = StressDataType.ALL_DAY;
        dayStressDetailData.setBarChartData(DataConverterKt.toBarChartDataList(listD, date, timeMode2, healthDataUtils.getBarChartOffset(stressDataType), healthDataUtils.getDayFrequency(stressDataType)));
        return dayStressDetailData;
    }

    @NotNull
    public final String getDisplayValue(@NotNull Context context, int value) {
        return value < 0 ? context.getString(R.string.value_invalid) : String.valueOf(value);
    }

    @NotNull
    public final StatisticsStressDetailData getStatisticsStressDetailData(@NotNull List<SingleStress> rawData, @NotNull Date date, @NotNull TimeMode timeMode) {
        List<BarDto<Float>> listD;
        ArrayList arrayList = new ArrayList();
        for (Object obj : rawData) {
            if (!((SingleStress) obj).getRawSingle()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : rawData) {
            if (((SingleStress) obj2).getRawSingle()) {
                arrayList2.add(obj2);
            }
        }
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(DataConverterKt.toStress((SingleStress) it2.next()));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : arrayList3) {
                String dateStr = ((Stress) obj3).getDateStr();
                Object arrayList4 = linkedHashMap.get(dateStr);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(dateStr, arrayList4);
                }
                ((List) arrayList4).add(obj3);
            }
            listD = d(timeMode, linkedHashMap);
        } else if (i == 2) {
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList5.add(DataConverterKt.toStress((SingleStress) it3.next()));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : arrayList5) {
                String dateStr2 = ((Stress) obj4).getDateStr();
                Object arrayList6 = linkedHashMap2.get(dateStr2);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap2.put(dateStr2, arrayList6);
                }
                ((List) arrayList6).add(obj4);
            }
            listD = d(timeMode, linkedHashMap2);
        } else if (i != 3) {
            listD = CollectionsKt__CollectionsKt.emptyList();
        } else {
            ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList7.add(DataConverterKt.toStress((SingleStress) it4.next()));
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj5 : arrayList7) {
                CharSequence charSequenceSubSequence = ((Stress) obj5).getDateStr().subSequence(0, 7);
                Object arrayList8 = linkedHashMap3.get(charSequenceSubSequence);
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                    linkedHashMap3.put(charSequenceSubSequence, arrayList8);
                }
                ((List) arrayList8).add(obj5);
            }
            listD = d(timeMode, linkedHashMap3);
        }
        List<BarDto<Float>> list = listD;
        StatisticsStressDetailData statisticsStressDetailData = new StatisticsStressDetailData();
        statisticsStressDetailData.setChartData(DataConverterKt.toBarChartDataList$default(list, date, timeMode, HealthDataUtils.INSTANCE.getBarChartOffset(StressDataType.ALL_DAY), 0, 8, null));
        statisticsStressDetailData.setStatisticsInfo(INSTANCE.e(rawData));
        return statisticsStressDetailData;
    }

    @NotNull
    public final ColorsBarData getStressColorsBarData(@NotNull Context context) {
        return new ColorsBarData(CollectionsKt__CollectionsKt.mutableListOf(0, 40, 60, 80, 100), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(ContextCompat.getColor(context, R.color.s15)), Integer.valueOf(ContextCompat.getColor(context, R.color.s20)), Integer.valueOf(ContextCompat.getColor(context, R.color.s33)), Integer.valueOf(ContextCompat.getColor(context, R.color.s30))}), 0);
    }

    @NotNull
    public final String getStressLevelStr(@NotNull Context context, int value) {
        int iCalculateStressLevel = StressLevelService.INSTANCE.calculateStressLevel(value);
        if (iCalculateStressLevel == 1) {
            return context.getString(R.string.stress_level_relax);
        }
        if (iCalculateStressLevel == 2) {
            return context.getString(R.string.stress_level_normal);
        }
        if (iCalculateStressLevel != 3) {
            return iCalculateStressLevel != 4 ? "" : context.getString(R.string.stress_level_high);
        }
        return context.getString(R.string.stress_level_medium);
    }
}
