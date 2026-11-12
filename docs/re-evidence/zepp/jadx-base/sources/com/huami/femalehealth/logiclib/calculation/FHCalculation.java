package com.huami.femalehealth.logiclib.calculation;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.api.pojo.Items;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.ext.DtoExKt;
import com.huami.femalehealth.logiclib.manager.DataCacheManager;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0004\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/huami/femalehealth/logiclib/calculation/FHCalculation;", "", "<init>", "()V", "Companion", "Assist", "Prediction", "Reality", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class FHCalculation {
    public static final int PREGNANT_DUR = 10;
    private static final long b = 86400000;

    @NotNull
    private static final String c = "FHCalculation";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static BasicInputValue a = BasicInputValue.INSTANCE.getDEFAULT$logiclib_release();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/huami/femalehealth/logiclib/calculation/FHCalculation$Assist;", "", "Lcom/huami/femalehealth/logiclib/calculation/Milli;", "milli", "", "times", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "getPreMenstruation", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "getPreMenstruation2", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Assist {

        @NotNull
        public static final Assist INSTANCE = new Assist();

        private Assist() {
        }

        @NotNull
        public final List<List<MenstruationVo>> getPreMenstruation(@NotNull Milli milli, int times) {
            if (times <= 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List<HistoryItemBean> preMenstruation2 = getPreMenstruation2(milli, times);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(preMenstruation2, 10));
            Iterator<T> it2 = preMenstruation2.iterator();
            while (it2.hasNext()) {
                arrayList.add(DtoExKt.toMenstruationVoList((HistoryItemBean) it2.next()));
            }
            return arrayList;
        }

        @NotNull
        public final List<HistoryItemBean> getPreMenstruation2(@NotNull Milli milli, int times) {
            int i;
            if (times <= 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ApiResponse<Items<HistoryItemBean>> apiResponseLoadAllHistory = DataCacheManager.INSTANCE.loadAllHistory(true);
            if (!(apiResponseLoadAllHistory instanceof ApiSuccessResponse)) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(((Items) ((ApiSuccessResponse) apiResponseLoadAllHistory).getBody()).getItems(), new Comparator() { // from class: com.huami.femalehealth.logiclib.calculation.FHCalculation$Assist$getPreMenstruation2$lambda-3$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryItemBean) t2).getMenstrualPeriod()), Long.valueOf(((HistoryItemBean) t).getMenstrualPeriod()));
                }
            });
            Iterator it2 = listSortedWith.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                HistoryItemBean historyItemBean = (HistoryItemBean) it2.next();
                if (historyItemBean.getMenstrualPeriod() < milli.getValue() || (milli.getValue() >= historyItemBean.getMenstrualPeriod() && historyItemBean.getMenstrualEndTime() != null && milli.getValue() <= historyItemBean.getMenstrualEndTime().longValue())) {
                    break;
                }
                i2++;
            }
            return (i2 == -1 || (i = times + i2) > listSortedWith.size()) ? CollectionsKt__CollectionsKt.emptyList() : listSortedWith.subList(i2, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/femalehealth/logiclib/calculation/FHCalculation$Companion;", "", "Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;", "basicInputValue", "Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;", "getBasicInputValue", "()Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;", "setBasicInputValue", "(Lcom/huami/femalehealth/logiclib/calculation/BasicInputValue;)V", "", "ONE_DAY_MILLI", "J", "", "PREGNANT_DUR", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BasicInputValue getBasicInputValue() {
            return FHCalculation.a;
        }

        public final void setBasicInputValue(@NotNull BasicInputValue basicInputValue) {
            FHCalculation.a = basicInputValue;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u0016\u0010\b\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\u0011"}, d2 = {"Lcom/huami/femalehealth/logiclib/calculation/FHCalculation$Prediction;", "", "", "Lcom/huami/femalehealth/logiclib/calculation/Duration;", "pre3SMenstruationList", "Lcom/huami/femalehealth/logiclib/calculation/Day;", "menstruationDuration", "pre4SMenstruationList", "nextMenstruationCycle", "Lcom/huami/femalehealth/logiclib/calculation/Milli;", "lastMenstruationStartMilli", "menstruationCycle", "ovulationDate", "lastMenstruationStartMill", "pregnantDate", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Prediction {

        @NotNull
        public static final Prediction INSTANCE = new Prediction();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<Duration> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<Duration> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("menstruationDuration pre3SMenstruationList:", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "---------------------------------------";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ List<Duration> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List<Duration> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("Dur pre3SMenstruationList:", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ List<Integer> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(List<Integer> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("Dur temp:", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<String> {
            public static final e a = new e();

            public e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "---------------------------------------";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function0<String> {
            public static final f a = new f();

            public f() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "---------------------------------------";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function0<String> {
            public final /* synthetic */ List<Duration> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(List<Duration> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append("Cycle pre4SMenstruationList:");
                sb.append(this.a);
                sb.append('\n');
                List<Duration> list = this.a;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (Duration duration : list) {
                    StringBuilder sb2 = new StringBuilder();
                    DateHelper dateHelper = DateHelper.INSTANCE;
                    sb2.append(dateHelper.nowDate(duration.getStart()));
                    sb2.append('-');
                    sb2.append(dateHelper.nowDate(duration.getEnd()));
                    arrayList.add(sb2.toString());
                }
                sb.append(arrayList);
                return sb.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function0<String> {
            public final /* synthetic */ List<Integer> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(List<Integer> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("Cycle pre3StartTimeDifferenceList:", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function0<String> {
            public final /* synthetic */ SortedSet<Integer> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(SortedSet<Integer> sortedSet) {
                super(0);
                this.a = sortedSet;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("Cycle temp:", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function0<String> {
            public static final j a = new j();

            public j() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "---------------------------------------";
            }
        }

        private Prediction() {
        }

        @NotNull
        public final Day menstruationDuration(@Nullable List<Duration> pre3SMenstruationList) {
            int iIntValue;
            HMLog.info("xys_FHCalculation", new a(pre3SMenstruationList));
            int menstruationDurationDay = FHCalculation.INSTANCE.getBasicInputValue().getMenstruationDurationDay();
            if (pre3SMenstruationList != null) {
                HMLog.info("xys_FHCalculation", b.a);
                HMLog.info("xys_FHCalculation", new c(pre3SMenstruationList));
                if (pre3SMenstruationList.size() < 3) {
                    return new Day(menstruationDurationDay);
                }
                int size = pre3SMenstruationList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(Integer.valueOf(AidKt.toDay$default(Reality.INSTANCE.menstruationDuration(pre3SMenstruationList.get(i2)), false, 1, null).getValue()));
                }
                HMLog.info("xys_FHCalculation", new d(arrayList));
                HMLog.info("xys_FHCalculation", e.a);
                int size2 = CollectionsKt___CollectionsKt.toSet(arrayList).size();
                if (size2 == 1) {
                    iIntValue = ((Number) arrayList.iterator().next()).intValue();
                } else if (size2 == 2) {
                    iIntValue = ((Number) CollectionsKt___CollectionsKt.sorted(arrayList).get(1)).intValue();
                } else if (size2 == 3) {
                    iIntValue = (int) CollectionsKt___CollectionsKt.averageOfInt(arrayList);
                }
                menstruationDurationDay = iIntValue;
            }
            return new Day(menstruationDurationDay);
        }

        @NotNull
        public final Day nextMenstruationCycle(@Nullable List<Duration> pre4SMenstruationList) {
            if (pre4SMenstruationList != null) {
                HMLog.info("xys_FHCalculation", f.a);
                HMLog.info("xys_FHCalculation", new g(pre4SMenstruationList));
                if (pre4SMenstruationList.size() >= 4) {
                    int size = pre4SMenstruationList.size() - 1;
                    ArrayList arrayList = new ArrayList(size);
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = i2 + 1;
                        arrayList.add(Integer.valueOf(DateHelper.INSTANCE.daysBetween(new Date(pre4SMenstruationList.get(i3).getStart()), new Date(pre4SMenstruationList.get(i2).getStart())) - 1));
                        i2 = i3;
                    }
                    HMLog.info("xys_FHCalculation", new h(arrayList));
                    SortedSet sortedSet = kotlin.collections.j.toSortedSet(arrayList);
                    HMLog.info("xys_FHCalculation", new i(sortedSet));
                    HMLog.info("xys_FHCalculation", j.a);
                    int size2 = sortedSet.size();
                    if (size2 == 1) {
                        return new Day(((Number) arrayList.get(0)).intValue());
                    }
                    if (size2 != 2) {
                        return size2 != 3 ? new Day(FHCalculation.INSTANCE.getBasicInputValue().getMenstruationCycleDay()) : new Day((int) CollectionsKt___CollectionsKt.averageOfInt(sortedSet));
                    }
                    return new Day(((Number) CollectionsKt___CollectionsKt.sorted(arrayList).get(1)).intValue());
                }
            }
            return new Day(FHCalculation.INSTANCE.getBasicInputValue().getMenstruationCycleDay());
        }

        @NotNull
        public final Milli ovulationDate(@NotNull Milli lastMenstruationStartMilli, @NotNull Day menstruationCycle) {
            int value = menstruationCycle.getValue();
            boolean z = false;
            if (12 <= value && value <= 19) {
                z = true;
            }
            return z ? new Milli(lastMenstruationStartMilli.getValue() + 432000000) : new Milli(DateHelper.offsetDayGetCalendar$default(DateHelper.INSTANCE, menstruationCycle.getValue() - 14, lastMenstruationStartMilli.getValue(), false, 4, null).getTimeInMillis());
        }

        @NotNull
        public final Duration pregnantDate(@NotNull Milli lastMenstruationStartMill, @NotNull Day menstruationCycle) {
            Milli milliOvulationDate = ovulationDate(lastMenstruationStartMill, menstruationCycle);
            return AidKt.to(milliOvulationDate.getValue() - 432000000, milliOvulationDate.getValue() + 432000000);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0011"}, d2 = {"Lcom/huami/femalehealth/logiclib/calculation/FHCalculation$Reality;", "", "Lcom/huami/femalehealth/logiclib/calculation/Milli;", "lastMenstruation", "Lcom/huami/femalehealth/logiclib/calculation/Day;", "menstruationCycle", "nextMenstruationStartTime", "menstruationStartMilli", "menstruationDur", "menstruationEndTime", "Lcom/huami/femalehealth/logiclib/calculation/Duration;", "duration", "menstruationDuration", "", "pregnantDuration", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Reality {

        @NotNull
        public static final Reality INSTANCE = new Reality();

        private Reality() {
        }

        @NotNull
        public final Milli menstruationDuration(@NotNull Duration duration) {
            return new Milli((duration.getEnd() - duration.getStart()) + 86400000);
        }

        @NotNull
        public final Milli menstruationEndTime(@NotNull Milli menstruationStartMilli, @NotNull Day menstruationDur) {
            return AidKt.toMilli(DateHelper.INSTANCE.offsetDay(menstruationDur.getValue() - 1, menstruationStartMilli.getValue()));
        }

        @NotNull
        public final Milli nextMenstruationStartTime(@NotNull Milli lastMenstruation, @NotNull Day menstruationCycle) {
            return new Milli(DateHelper.offsetDayGetCalendar$default(DateHelper.INSTANCE, menstruationCycle.getValue(), lastMenstruation.getValue(), false, 4, null).getTimeInMillis());
        }

        public final long pregnantDuration() {
            return 864000000L;
        }
    }
}
