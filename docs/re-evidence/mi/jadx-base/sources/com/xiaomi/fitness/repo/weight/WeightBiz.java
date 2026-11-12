package com.xiaomi.fitness.repo.weight;

import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.weight.WeightBiz;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0016J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u001e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J(\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/repo/weight/WeightBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "<init>", "()V", "dbGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDbGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dbGetter$delegate", "Lkotlin/Lazy;", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "groupRecordByDay", "list", "homeWeightReport", "splitByDate", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWeightBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightBiz.kt\ncom/xiaomi/fitness/repo/weight/WeightBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n216#2:99\n217#2:114\n1971#3,14:100\n*S KotlinDebug\n*F\n+ 1 WeightBiz.kt\ncom/xiaomi/fitness/repo/weight/WeightBiz\n*L\n60#1:99\n60#1:114\n61#1:100,14\n*E\n"})
public final class WeightBiz extends BaseProcessBiz<DailyWeightReport> {

    /* JADX INFO: renamed from: dbGetter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dbGetter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ver
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WeightBiz.dbGetter_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataGetter dbGetter_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
    }

    private final FitnessDataGetter getDbGetter() {
        return (FitnessDataGetter) this.dbGetter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final DailyWeightReport homeWeightReport(long timestamp, List<? extends DailyRecordItem> list) {
        List<DailyRecordItem> listGroupRecordByDay = groupRecordByDay(list);
        Intrinsics.checkNotNull(listGroupRecordByDay, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.WeightItem>");
        if (listGroupRecordByDay.isEmpty()) {
            return new DailyWeightReport(timestamp, "home");
        }
        Long l = (Long) ListExtKt.maxOfOrDefault(listGroupRecordByDay, Long.valueOf(timestamp), new Function1() { // from class: wer
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(WeightBiz.homeWeightReport$lambda$5((WeightItem) obj));
            }
        });
        Intrinsics.checkNotNull(l);
        DailyWeightReport dailyWeightReport = new DailyWeightReport(l.longValue(), "home");
        dailyWeightReport.setWeightRecordList(listGroupRecordByDay);
        return dailyWeightReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long homeWeightReport$lambda$5(WeightItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTimestamp();
    }

    private final Map<Long, List<DailyRecordItem>> splitByDate(List<? extends DailyRecordItem> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DailyRecordItem dailyRecordItem : list) {
            long j = 1000;
            getCalendar().setTimeInMillis(dailyRecordItem.getTimestamp() * j);
            TimeUtils.setToZeroOClock(getCalendar());
            long timeInMillis = getCalendar().getTimeInMillis() / j;
            List arrayList = (List) linkedHashMap.get(Long.valueOf(timeInMillis));
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(Long.valueOf(timeInMillis), arrayList);
            }
            ListExtKt.add(arrayList, dailyRecordItem);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$1(WeightItem weightItem, WeightItem weightItem2) {
        return (int) (weightItem2.getTime() - weightItem.getTime());
    }

    @NotNull
    public final List<DailyRecordItem> groupRecordByDay(@NotNull List<? extends DailyRecordItem> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Map<Long, List<DailyRecordItem>> mapSplitByDate = splitByDate(list);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Long, List<DailyRecordItem>>> it = mapSplitByDate.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    long timestamp = ((DailyRecordItem) next).getTimestamp();
                    do {
                        Object next2 = it2.next();
                        long timestamp2 = ((DailyRecordItem) next2).getTimestamp();
                        if (timestamp < timestamp2) {
                            next = next2;
                            timestamp = timestamp2;
                        }
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            DailyRecordItem dailyRecordItem = (DailyRecordItem) obj;
            if (dailyRecordItem != null) {
                arrayList.add(dailyRecordItem);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyWeightReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyWeightReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (itemMap.isEmpty() || !itemMap.containsKey("weight")) {
            return new DailyWeightReport(timestamp, viewTag);
        }
        List<? extends DailyRecordItem> list = itemMap.get("weight");
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.xiaomi.fit.fitness.export.data.item.WeightItem>");
        List<WeightItem> listAsMutableList = TypeIntrinsics.asMutableList(list);
        List<WeightItem> list2 = listAsMutableList;
        if (list2 == null || list2.isEmpty()) {
            return new DailyWeightReport(timestamp, viewTag);
        }
        if (Intrinsics.areEqual(viewTag, "home")) {
            return homeWeightReport(timestamp, listAsMutableList);
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(listAsMutableList, new Comparator() { // from class: uer
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return WeightBiz.splitDailyReport$lambda$1((WeightItem) obj, (WeightItem) obj2);
            }
        });
        long j = 1000;
        getCalendarZero().setTimeInMillis(timestamp * j);
        WeightItem weightItem = (WeightItem) FitnessDataGetter.DefaultImpls.getRecentOneData$default(getDbGetter(), "weight", TimeUtils.setToZeroOClock(getCalendarZero()).getTimeInMillis() / j, null, 4, null);
        DailyWeightReport dailyWeightReport = new DailyWeightReport(timestamp, viewTag);
        dailyWeightReport.setWeightRecordList(listAsMutableList);
        dailyWeightReport.setPreDayWeightItem(weightItem);
        return dailyWeightReport;
    }
}
