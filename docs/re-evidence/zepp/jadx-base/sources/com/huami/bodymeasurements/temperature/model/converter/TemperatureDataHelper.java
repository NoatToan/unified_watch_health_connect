package com.huami.bodymeasurements.temperature.model.converter;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.chart.ChartConfigHelper;
import com.huami.bodymeasurements.common.chart.vo.BarChartVo;
import com.huami.bodymeasurements.common.chart.vo.ChartDataVo;
import com.huami.bodymeasurements.common.ext.NumberFormatExKt;
import com.huami.bodymeasurements.common.utils.TimeUtils;
import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import com.huami.bodymeasurements.temperature.model.koin.data.TempBarConfig;
import com.huami.bodymeasurements.temperature.view.TemperatureTypeConstants;
import com.huami.bodymeasurements.temperature.view.vo.DayTempDetailData;
import com.huami.bodymeasurements.temperature.view.vo.StatisticsTempDetailData;
import com.huami.bodymeasurements.temperature.view.vo.TempStatisticsInfo;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.huami.bodymeasurements.temperature.view.vo.chart.TempBarChartBuilder;
import com.huami.bodymeasurements.temperature.view.vo.chart.TempMixLineChartBuilder;
import com.huami.chart.data.XAxisData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J&\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001c\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/converter/TemperatureDataHelper;", "Lorg/koin/core/component/KoinComponent;", "Ljava/util/Date;", "date", "", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "rawData", "Lcom/huami/bodymeasurements/temperature/view/vo/chart/TempMixLineChartBuilder;", "c", "dataList", GoogleApiAvailabilityLight.a, "", "dateMode", "Lcom/huami/bodymeasurements/temperature/view/vo/chart/TempBarChartBuilder;", "b", "Lcom/huami/bodymeasurements/temperature/view/vo/TempStatisticsInfo;", "a", "Lcom/huami/bodymeasurements/temperature/view/vo/DayTempDetailData;", "getDayTempDetailData", "Lcom/huami/bodymeasurements/temperature/view/vo/StatisticsTempDetailData;", "getStatisticsTempDetailData", "Landroid/content/Context;", "Landroid/content/Context;", "applicationContext", "Lcom/huami/bodymeasurements/temperature/model/koin/data/TempBarConfig;", "Lcom/huami/bodymeasurements/temperature/model/koin/data/TempBarConfig;", "barConfig", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureDataHelper implements KoinComponent {

    @NotNull
    public static final TemperatureDataHelper INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static final TempBarConfig barConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bodymeasurements/common/chart/vo/BarChartVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends BarChartVo>> {
        public final /* synthetic */ List<BarChartVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<BarChartVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends BarChartVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Date date, String str) {
            super(0);
            this.a = date;
            this.b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartConfigHelper.INSTANCE.getXAxisData(this.a, this.b, TemperatureDataHelper.applicationContext);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bodymeasurements/common/chart/vo/ChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<List<? extends ChartDataVo>> {
        public final /* synthetic */ List<ChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<ChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends ChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Date date) {
            super(0);
            this.a = date;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartConfigHelper.INSTANCE.getXAxisData(this.a, "day", TemperatureDataHelper.applicationContext);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ArrayList<Integer>> {
        public final /* synthetic */ List<ChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<ChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<Integer> invoke() {
            ArrayList<Integer> arrayList = new ArrayList<>();
            List<ChartDataVo> list = this.a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((ChartDataVo) it2.next()).getIndex()));
            }
            arrayList.addAll(arrayList2);
            return arrayList;
        }
    }

    static {
        TemperatureDataHelper temperatureDataHelper = new TemperatureDataHelper();
        INSTANCE = temperatureDataHelper;
        applicationContext = (Context) temperatureDataHelper.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        TempExternalApi tempExternalApi = ScopesKt.tempExternalApi(temperatureDataHelper.getKoin());
        barConfig = tempExternalApi != null ? tempExternalApi.getBarConfig() : null;
    }

    private TemperatureDataHelper() {
    }

    private final TempStatisticsInfo a(List<TemperatureVo> rawData) {
        Object next;
        if (rawData.isEmpty()) {
            return new TempStatisticsInfo(0.0f, 0.0f, 0.0f, 7, null);
        }
        Iterator<T> it2 = rawData.iterator();
        Object next2 = null;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float temp = ((TemperatureVo) next).getTemp();
                do {
                    Object next3 = it2.next();
                    float temp2 = ((TemperatureVo) next3).getTemp();
                    if (Float.compare(temp, temp2) < 0) {
                        next = next3;
                        temp = temp2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        float temp3 = ((TemperatureVo) next).getTemp();
        Iterator<T> it3 = rawData.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                float temp4 = ((TemperatureVo) next2).getTemp();
                do {
                    Object next4 = it3.next();
                    float temp5 = ((TemperatureVo) next4).getTemp();
                    if (Float.compare(temp4, temp5) > 0) {
                        next2 = next4;
                        temp4 = temp5;
                    }
                } while (it3.hasNext());
            }
        }
        float temp6 = ((TemperatureVo) next2).getTemp();
        double temp7 = 0.0d;
        Iterator<T> it4 = rawData.iterator();
        while (it4.hasNext()) {
            temp7 += (double) ((TemperatureVo) it4.next()).getTemp();
        }
        Float withDecimalFloat = NumberFormatExKt.formatWithDecimalFloat(Float.valueOf((float) (temp7 / ((double) rawData.size()))), 1);
        return new TempStatisticsInfo(temp3, temp6, withDecimalFloat == null ? Float.NaN : withDecimalFloat.floatValue());
    }

    private final TempBarChartBuilder b(String dateMode, Date date, List<TemperatureVo> rawData) {
        List<BarChartVo> listConvertToBarChartData = TempChartDataConverterKt.convertToBarChartData(rawData, dateMode);
        TempBarConfig tempBarConfig = barConfig;
        return new TempBarChartBuilder(new a(listConvertToBarChartData), new b(date, dateMode), tempBarConfig == null ? false : tempBarConfig.getSupportRadian(), tempBarConfig != null ? tempBarConfig.getSupportGradient() : false);
    }

    private final TempMixLineChartBuilder c(Date date, List<TemperatureVo> rawData) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : rawData) {
            if (!Intrinsics.areEqual(((TemperatureVo) obj).getType(), TemperatureTypeConstants.ALL_DAY_TEMP)) {
                arrayList.add(obj);
            }
        }
        List<ChartDataVo> listConvertToDayChartData = TempChartDataConverterKt.convertToDayChartData(CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.converter.TemperatureDataHelper$getTempMixLineChartBuilder$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureVo) t).getTimestamp()), Long.valueOf(((TemperatureVo) t2).getTimestamp()));
            }
        }));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : rawData) {
            if (Intrinsics.areEqual(((TemperatureVo) obj2).getType(), TemperatureTypeConstants.ALL_DAY_TEMP)) {
                arrayList2.add(obj2);
            }
        }
        List<ChartDataVo> listConvertToDayChartData2 = TempChartDataConverterKt.convertToDayChartData(CollectionsKt___CollectionsKt.sortedWith(d(arrayList2), new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.converter.TemperatureDataHelper$getTempMixLineChartBuilder$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureVo) t).getTimestamp()), Long.valueOf(((TemperatureVo) t2).getTimestamp()));
            }
        }));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(listConvertToDayChartData);
        arrayList3.addAll(listConvertToDayChartData2);
        return new TempMixLineChartBuilder(new c(CollectionsKt___CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.converter.TemperatureDataHelper$getTempMixLineChartBuilder$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((ChartDataVo) t).getIndex()), Integer.valueOf(((ChartDataVo) t2).getIndex()));
            }
        })), new d(date), new e(listConvertToDayChartData));
    }

    /* JADX WARN: Code duplicated, block: B:94:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bd A[Catch: Exception -> 0x01d4, TRY_LEAVE, TryCatch #0 {Exception -> 0x01d4, blocks: (B:67:0x013a, B:68:0x0143, B:70:0x0149, B:77:0x0164, B:78:0x0168, B:80:0x016f, B:82:0x0175, B:83:0x0179, B:92:0x01b0, B:95:0x01bd, B:84:0x017d, B:86:0x0183, B:87:0x0188, B:88:0x018e, B:90:0x0194, B:91:0x01a7), top: B:103:0x013a }] */
    private final List<TemperatureVo> d(List<TemperatureVo> dataList) {
        boolean z;
        Object next;
        Object next2;
        Object next3;
        long j;
        double size;
        float temp;
        Float withDecimalFloat;
        if (!dataList.isEmpty()) {
            boolean z2 = true;
            if (dataList.isEmpty()) {
                z = true;
                break;
            }
            Iterator<T> it2 = dataList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                if (Intrinsics.areEqual(((TemperatureVo) it2.next()).getType(), TemperatureTypeConstants.ALL_DAY_TEMP)) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                ArrayList arrayList = new ArrayList();
                TimeUtils timeUtils = TimeUtils.INSTANCE;
                Iterator<T> it3 = dataList.iterator();
                Object next4 = null;
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        long timestamp = ((TemperatureVo) next).getTimestamp();
                        do {
                            Object next5 = it3.next();
                            long timestamp2 = ((TemperatureVo) next5).getTimestamp();
                            if (timestamp > timestamp2) {
                                next = next5;
                                timestamp = timestamp2;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next = null;
                }
                long timeExactToHour = timeUtils.getTimeExactToHour(((TemperatureVo) next).getTimestamp());
                TimeUtils timeUtils2 = TimeUtils.INSTANCE;
                Iterator<T> it4 = dataList.iterator();
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (it4.hasNext()) {
                        long timestamp3 = ((TemperatureVo) next2).getTimestamp();
                        do {
                            Object next6 = it4.next();
                            long timestamp4 = ((TemperatureVo) next6).getTimestamp();
                            if (timestamp3 < timestamp4) {
                                next2 = next6;
                                timestamp3 = timestamp4;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next2 = null;
                }
                long jOffsetDay = TimeUtils.INSTANCE.offsetDay(timeUtils2.getTimeExactToHour(((TemperatureVo) next2).getTimestamp()), 1);
                int i = 300000;
                Iterator<T> it5 = dataList.iterator();
                if (it5.hasNext()) {
                    next3 = it5.next();
                    if (it5.hasNext()) {
                        float temp2 = ((TemperatureVo) next3).getTemp();
                        do {
                            Object next7 = it5.next();
                            float temp3 = ((TemperatureVo) next7).getTemp();
                            if (Float.compare(temp2, temp3) > 0) {
                                next3 = next7;
                                temp2 = temp3;
                            }
                        } while (it5.hasNext());
                    }
                } else {
                    next3 = null;
                }
                TemperatureVo temperatureVo = (TemperatureVo) next3;
                Iterator<T> it6 = dataList.iterator();
                if (it6.hasNext()) {
                    next4 = it6.next();
                    if (it6.hasNext()) {
                        float temp4 = ((TemperatureVo) next4).getTemp();
                        do {
                            Object next8 = it6.next();
                            float temp5 = ((TemperatureVo) next8).getTemp();
                            if (Float.compare(temp4, temp5) < 0) {
                                next4 = next8;
                                temp4 = temp5;
                            }
                        } while (it6.hasNext());
                    }
                }
                TemperatureVo temperatureVo2 = (TemperatureVo) next4;
                long j2 = timeExactToHour;
                while (timeExactToHour <= jOffsetDay) {
                    long j3 = i;
                    long j4 = j2 + j3;
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : dataList) {
                            long timestamp5 = ((TemperatureVo) obj).getTimestamp();
                            if (timeExactToHour <= timestamp5 && timestamp5 <= j4) {
                                arrayList2.add(obj);
                            }
                        }
                        if (arrayList2.isEmpty() ^ z2) {
                            if (arrayList2.contains(temperatureVo)) {
                                temp = temperatureVo.getTemp();
                            } else {
                                if (arrayList2.contains(temperatureVo2)) {
                                    temp = temperatureVo2.getTemp();
                                } else {
                                    double temp6 = 0.0d;
                                    Iterator it7 = arrayList2.iterator();
                                    while (it7.hasNext()) {
                                        temp6 += (double) ((TemperatureVo) it7.next()).getTemp();
                                        j4 = j4;
                                    }
                                    j = j4;
                                    size = temp6 / ((double) arrayList2.size());
                                }
                                z2 = true;
                                withDecimalFloat = NumberFormatExKt.formatWithDecimalFloat(Float.valueOf((float) size), 1);
                                if (withDecimalFloat == null) {
                                    arrayList.add(new TemperatureVo(timeExactToHour, withDecimalFloat.floatValue(), TemperatureTypeConstants.ALL_DAY_TEMP));
                                }
                            }
                            size = temp;
                            j = j4;
                            z2 = true;
                            withDecimalFloat = NumberFormatExKt.formatWithDecimalFloat(Float.valueOf((float) size), 1);
                            if (withDecimalFloat == null) {
                                arrayList.add(new TemperatureVo(timeExactToHour, withDecimalFloat.floatValue(), TemperatureTypeConstants.ALL_DAY_TEMP));
                            }
                        } else {
                            j = j4;
                        }
                        timeExactToHour += j3;
                        j2 = j;
                        i = 300000;
                    } catch (Exception unused) {
                    }
                }
                return arrayList;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final DayTempDetailData getDayTempDetailData(@NotNull Date date, @NotNull List<TemperatureVo> rawData) {
        return new DayTempDetailData(c(date, rawData), a(rawData));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final StatisticsTempDetailData getStatisticsTempDetailData(@NotNull String dateMode, @NotNull Date date, @NotNull List<TemperatureVo> rawData) {
        return new StatisticsTempDetailData(b(dateMode, date, rawData), a(rawData));
    }
}
