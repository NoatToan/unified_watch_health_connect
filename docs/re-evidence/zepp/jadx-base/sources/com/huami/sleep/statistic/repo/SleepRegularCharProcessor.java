package com.huami.sleep.statistic.repo;

import android.content.Context;
import android.util.SparseArray;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.ChartUtil;
import com.huami.sleep.api.SleepWebApiImpl;
import com.huami.sleep.api.pojo.UserEventsResponse;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.sleepintrodetail.dto.SleepDetail;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.helper.RegularChartBuilder;
import com.huami.sleep.statistic.helper.SleepRegularChartBuilder;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.statistic.vo.SleepRegularChartVo;
import com.huami.sleep.util.ChartXAxisUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.SleepTimeUtilKt;
import com.huami.snore.core.cloud.api.VoiceWebApiImpl;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0016H\u0002J\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0016\u0010'\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010&R\u0016\u0010(\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010&¨\u0006,"}, d2 = {"Lcom/huami/sleep/statistic/repo/SleepRegularCharProcessor;", "", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", GoogleApiAvailabilityLight.a, "", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "data", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "e", "Lcom/huami/sleep/statistic/vo/SleepRegularChartVo;", "c", "f", "i", z.j, "h", hl.k, "", "day", "b", "", "a", "Lcom/huami/sleep/sleepintrodetail/dto/SleepDetail;", "detail", "", "g", "Ljava/util/Date;", "start", "Lcom/huami/sleep/statistic/helper/RegularChartBuilder;", "getBarChartBuilder", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Ljava/lang/String;", "TAG", LogUtil.I, "secInHour", "xCount", "daysOfWeek", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepRegularCharProcessor {

    @NotNull
    public static final SleepRegularCharProcessor INSTANCE = new SleepRegularCharProcessor();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Context context = KoinExtKt.getAppContext();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ChartRepo";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int secInHour = 3600;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int xCount = 5;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int daysOfWeek = 7;

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/sleep/statistic/vo/SleepRegularChartVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends SleepRegularChartVo>> {
        public final /* synthetic */ List<SleepAllInfo> a;
        public final /* synthetic */ TimeMode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<SleepAllInfo> list, TimeMode timeMode) {
            super(0);
            this.a = list;
            this.b = timeMode;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends SleepRegularChartVo> getA() {
            return SleepRegularCharProcessor.INSTANCE.c(this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Float> {
        public final /* synthetic */ TimeMode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TimeMode timeMode) {
            super(0);
            this.a = timeMode;
        }

        public final float a() {
            return SleepRegularCharProcessor.INSTANCE.d(this.a);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Float getA() {
            return Float.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ TimeMode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Date date, TimeMode timeMode) {
            super(0);
            this.a = date;
            this.b = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final SparseArray<XAxisData> getA() {
            return ChartXAxisUtil.INSTANCE.getXAxisDataByType(this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SparseArray<YAxisData>> {
        public final /* synthetic */ TimeMode a;
        public final /* synthetic */ List<SleepAllInfo> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TimeMode timeMode, List<SleepAllInfo> list) {
            super(0);
            this.a = timeMode;
            this.b = list;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final SparseArray<YAxisData> getA() {
            SleepRegularCharProcessor sleepRegularCharProcessor = SleepRegularCharProcessor.INSTANCE;
            TimeMode timeMode = this.a;
            return sleepRegularCharProcessor.e(timeMode, sleepRegularCharProcessor.f(timeMode, this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "maxMinutes..." + this.a;
        }
    }

    private SleepRegularCharProcessor() {
    }

    private final List<SleepAllInfo> a(Map<Object, ? extends List<SleepAllInfo>> data) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Object, ? extends List<SleepAllInfo>>> it2 = data.entrySet().iterator();
        while (it2.hasNext()) {
            List<SleepAllInfo> value = it2.next().getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = value.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (!(((SleepAllInfo) next).getMainSleepDetail().getTotalDur() == 0)) {
                    arrayList2.add(next);
                }
            }
            int size = arrayList2.size();
            if (size > 0) {
                SleepAllInfo sleepAllInfo = new SleepAllInfo(value.get(0).getTimeStamp(), value.get(0).getDate(), null, null, 12, null);
                Iterator<T> it4 = value.iterator();
                while (it4.hasNext()) {
                    INSTANCE.g(sleepAllInfo.getMainSleepDetail(), ((SleepAllInfo) it4.next()).getMainSleepDetail());
                }
                SleepDetail mainSleepDetail = sleepAllInfo.getMainSleepDetail();
                mainSleepDetail.setStartIndex(mainSleepDetail.getStartIndex() / size);
                SleepDetail mainSleepDetail2 = sleepAllInfo.getMainSleepDetail();
                mainSleepDetail2.setEndIndex(mainSleepDetail2.getEndIndex() / size);
                arrayList.add(sleepAllInfo);
            } else {
                SleepAllInfo sleepAllInfo2 = new SleepAllInfo(value.get(0).getTimeStamp(), value.get(0).getDate(), null, null, 12, null);
                sleepAllInfo2.getMainSleepDetail().setStartIndex(0);
                sleepAllInfo2.getMainSleepDetail().setEndIndex(0);
                arrayList.add(sleepAllInfo2);
            }
        }
        return arrayList;
    }

    private final int b(int day) {
        int i = (day + 6) % 7;
        if (i == 0) {
            return 7;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SleepRegularChartVo> c(List<SleepAllInfo> data, TimeMode timeMode) {
        return i(f(timeMode, data), timeMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float d(TimeMode timeMode) {
        UserEventsResponse.Companion companion = UserEventsResponse.INSTANCE;
        SleepWebApiImpl.Companion companion2 = SleepWebApiImpl.INSTANCE;
        VoiceWebApiImpl.Companion companion3 = VoiceWebApiImpl.INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            return 0.0f;
        }
        if (i == 2) {
            return ChartUtil.dp2px(context, 30.0f);
        }
        if (i == 3) {
            return ChartUtil.dp2px(context, 6.0f);
        }
        if (i == 4) {
            return ChartUtil.dp2px(context, 16.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseArray<YAxisData> e(TimeMode timeMode, List<SleepAllInfo> data) {
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i != 2 && i != 3 && i != 4) {
            return new SparseArray<>();
        }
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = data.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (!(((SleepAllInfo) next).getMainSleepDetail().getTotalDur() == 0)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((SleepAllInfo) it3.next()).getMainSleepDetail().getStartIndex()));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((SleepAllInfo) it4.next()).getMainSleepDetail().getEndIndex()));
        }
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList3);
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        HMLog.debug(TAG, new e(iIntValue));
        sparseArray.put(0, new YAxisData(iIntValue2, SleepTimeUtilKt.formatMinTHHmm(iIntValue2, true)));
        sparseArray.put(1, new YAxisData(iIntValue, SleepTimeUtilKt.formatMinTHHmm(iIntValue, true)));
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SleepAllInfo> f(TimeMode timeMode, List<SleepAllInfo> data) {
        if (WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()] != 4) {
            return data;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : data) {
            String timeYM = SleepTimeUtil.INSTANCE.formatTimeYM(((SleepAllInfo) obj).getTimeStamp());
            Object arrayList = linkedHashMap.get(timeYM);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(timeYM, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return a(linkedHashMap);
    }

    private final void g(SleepDetail sleepDetail, SleepDetail sleepDetail2) {
        sleepDetail.setTotalDur(sleepDetail.getTotalDur() + sleepDetail2.getTotalDur());
        sleepDetail.setDeepDur(sleepDetail.getDeepDur() + sleepDetail2.getDeepDur());
        sleepDetail.setLightDur(sleepDetail.getLightDur() + sleepDetail2.getLightDur());
        sleepDetail.setRemDur(sleepDetail.getRemDur() + sleepDetail2.getRemDur());
        sleepDetail.setAwakeDur(sleepDetail.getAwakeDur() + sleepDetail2.getAwakeDur());
        sleepDetail.setStartIndex(sleepDetail.getStartIndex() + sleepDetail2.getStartIndex());
        sleepDetail.setEndIndex(sleepDetail.getEndIndex() + sleepDetail2.getEndIndex());
    }

    private final List<SleepRegularChartVo> h(List<SleepAllInfo> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        if (list.size() > 0) {
            calendar.setTimeInMillis(list.get(0).getTimeStamp());
            Iterator<Integer> it2 = new IntRange(1, calendar.getActualMaximum(5)).iterator();
            while (it2.hasNext()) {
                arrayList.add(new SleepRegularChartVo(((IntIterator) it2).nextInt(), 0, 0, 0L, 8, null));
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SleepAllInfo sleepAllInfo : list) {
            calendar.setTimeInMillis(sleepAllInfo.getTimeStamp());
            int i = calendar.get(5);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (((SleepRegularChartVo) obj).getIndex() == i) {
                    arrayList3.add(obj);
                }
            }
            if (!arrayList3.isEmpty()) {
                SleepRegularChartVo sleepRegularChartVo = (SleepRegularChartVo) arrayList3.get(0);
                sleepRegularChartVo.setStartIndex(sleepAllInfo.getMainSleepDetail().getStartIndex());
                sleepRegularChartVo.setEndIndex(sleepAllInfo.getMainSleepDetail().getEndIndex());
                sleepRegularChartVo.setTimeStamp(sleepAllInfo.getTimeStamp());
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return arrayList;
    }

    private final List<SleepRegularChartVo> i(List<SleepAllInfo> list, TimeMode timeMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 2) {
            return j(list);
        }
        if (i != 3) {
            return i != 4 ? CollectionsKt__CollectionsKt.emptyList() : k(list);
        }
        return h(list);
    }

    private final List<SleepRegularChartVo> j(List<SleepAllInfo> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Iterator<Integer> it2 = new IntRange(1, 7).iterator();
        while (it2.hasNext()) {
            arrayList.add(new SleepRegularChartVo(((IntIterator) it2).nextInt(), 0, 0, 0L, 8, null));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SleepAllInfo sleepAllInfo : list) {
            calendar.setTimeInMillis(sleepAllInfo.getTimeStamp());
            boolean zStartsWith$default = m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null);
            int iB = calendar.get(7);
            if (!zStartsWith$default) {
                iB = INSTANCE.b(iB);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (((SleepRegularChartVo) obj).getIndex() == iB) {
                    arrayList3.add(obj);
                }
            }
            if (!arrayList3.isEmpty()) {
                SleepRegularChartVo sleepRegularChartVo = (SleepRegularChartVo) arrayList3.get(0);
                sleepRegularChartVo.setStartIndex(sleepAllInfo.getMainSleepDetail().getStartIndex());
                sleepRegularChartVo.setEndIndex(sleepAllInfo.getMainSleepDetail().getEndIndex());
                sleepRegularChartVo.setTimeStamp(sleepAllInfo.getTimeStamp());
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return arrayList;
    }

    private final List<SleepRegularChartVo> k(List<SleepAllInfo> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Iterator<Integer> it2 = new IntRange(1, 12).iterator();
        while (it2.hasNext()) {
            arrayList.add(new SleepRegularChartVo(((IntIterator) it2).nextInt(), 0, 0, 0L, 8, null));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SleepAllInfo sleepAllInfo : list) {
            calendar.setTimeInMillis(sleepAllInfo.getTimeStamp());
            int i = calendar.get(2) + 1;
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((SleepRegularChartVo) next).getIndex() == i) {
                    arrayList3.add(next);
                }
            }
            if (!arrayList3.isEmpty()) {
                SleepRegularChartVo sleepRegularChartVo = (SleepRegularChartVo) arrayList3.get(0);
                sleepRegularChartVo.setStartIndex(sleepAllInfo.getMainSleepDetail().getStartIndex());
                sleepRegularChartVo.setEndIndex(sleepAllInfo.getMainSleepDetail().getEndIndex());
            }
            arrayList2.add(arrayList);
        }
        return arrayList;
    }

    @NotNull
    public final RegularChartBuilder getBarChartBuilder(@NotNull Date start, @NotNull TimeMode timeMode, @NotNull List<SleepAllInfo> data) {
        return new SleepRegularChartBuilder(context, new a(data, timeMode), new b(timeMode), new c(start, timeMode), new d(timeMode, data));
    }
}
