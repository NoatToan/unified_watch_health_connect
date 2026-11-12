package com.xiaomi.fitness.repo.vo2max;

import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BigValueDistinct;
import com.xiaomi.fitness.repo.vo2max.VO2MaxBiz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/repo/vo2max/VO2MaxBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "<init>", "()V", "itemDistinct", "Lcom/xiaomi/fitness/repo/BigValueDistinct;", "Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVO2MaxBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VO2MaxBiz.kt\ncom/xiaomi/fitness/repo/vo2max/VO2MaxBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n216#2,2:83\n216#2:86\n217#2:101\n1#3:85\n1971#4,14:87\n*S KotlinDebug\n*F\n+ 1 VO2MaxBiz.kt\ncom/xiaomi/fitness/repo/vo2max/VO2MaxBiz\n*L\n29#1:83,2\n50#1:86\n50#1:101\n60#1:87,14\n*E\n"})
public final class VO2MaxBiz extends BaseProcessBiz<DailyVo2MaxReport> {

    @NotNull
    private final BigValueDistinct<Vo2MaxItem> itemDistinct = new BigValueDistinct<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$1(Vo2MaxItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getVo2Max();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$2(Vo2MaxItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getVo2Max();
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyVo2MaxReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e7 A[LOOP:5: B:85:0x01e1->B:87:0x01e7, LOOP_END] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyVo2MaxReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Iterator it;
        String str;
        String str2;
        LinkedHashSet linkedHashSet;
        Iterator it2;
        Object next;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (itemMap.isEmpty() || !itemMap.containsKey(FitnessPersistKey.Vo2Max)) {
            return new DailyVo2MaxReport(timestamp, viewTag);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ? extends List<? extends DailyRecordItem>>> it3 = itemMap.entrySet().iterator();
        while (it3.hasNext()) {
            for (DailyRecordItem dailyRecordItem : it3.next().getValue()) {
                if (dailyRecordItem.getTimestamp() >= timestamp) {
                    Intrinsics.checkNotNull(dailyRecordItem, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem");
                    arrayList.add((Vo2MaxItem) dailyRecordItem);
                }
            }
        }
        Integer num = (Integer) ListExtKt.maxOfOrDefault(arrayList, 0, new Function1() { // from class: smq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(VO2MaxBiz.splitDailyReport$lambda$1((Vo2MaxItem) obj));
            }
        });
        Integer num2 = (Integer) ListExtKt.minOfOrDefault(arrayList, 0, new Function1() { // from class: tmq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(VO2MaxBiz.splitDailyReport$lambda$2((Vo2MaxItem) obj));
            }
        });
        Iterator it4 = arrayList.iterator();
        int vo2Max = 0;
        while (it4.hasNext()) {
            vo2Max += ((Vo2MaxItem) it4.next()).getVo2Max();
        }
        int size = arrayList.isEmpty() ^ true ? vo2Max / arrayList.size() : 0;
        Map mapEmptyMap = MapsKt__MapsKt.emptyMap();
        String str3 = "days";
        String str4 = "weeks";
        switch (viewTag.hashCode()) {
            case -1068487181:
                if (viewTag.equals("months")) {
                    mapEmptyMap = groupByDay(timestamp, arrayList, this.itemDistinct);
                }
                break;
            case 3076183:
                if (viewTag.equals("days")) {
                    mapEmptyMap = groupByHalfHour(timestamp, arrayList, this.itemDistinct);
                }
                break;
            case 3208415:
                if (viewTag.equals("home")) {
                    mapEmptyMap = groupByHalfHour(timestamp, arrayList, this.itemDistinct);
                }
                break;
            case 113008383:
                if (viewTag.equals("weeks")) {
                    mapEmptyMap = groupByDay(timestamp, arrayList, this.itemDistinct);
                }
                break;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = mapEmptyMap.entrySet().iterator();
        long time = Long.MIN_VALUE;
        Vo2MaxItem vo2MaxItem = null;
        while (it5.hasNext()) {
            Map.Entry entry = (Map.Entry) it5.next();
            List<Vo2MaxItem> list = (List) entry.getValue();
            for (Vo2MaxItem vo2MaxItem2 : list) {
                if (vo2MaxItem2.getTime() > time) {
                    time = vo2MaxItem2.getTime();
                    vo2MaxItem = vo2MaxItem2;
                }
            }
            int iHashCode = viewTag.hashCode();
            if (iHashCode != -1068487181) {
                if (iHashCode != 3076183) {
                    if (iHashCode == 113008383 && viewTag.equals(str4)) {
                        vo2MaxItem = vo2MaxItem;
                        it = it5;
                        str = str3;
                        str2 = str4;
                        linkedHashSet = new LinkedHashSet();
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            linkedHashSet.add(Integer.valueOf(((Vo2MaxItem) it2.next()).getVo2Max()));
                        }
                        arrayList2.add(new TimesDataRecordInt(((Number) entry.getKey()).longValue(), CollectionsKt___CollectionsKt.toIntArray(linkedHashSet)));
                    }
                } else if (viewTag.equals(str3)) {
                    Iterator it6 = list.iterator();
                    if (it6.hasNext()) {
                        next = it6.next();
                        if (it6.hasNext()) {
                            int vo2Max2 = ((Vo2MaxItem) next).getVo2Max();
                            while (true) {
                                Object next2 = it6.next();
                                it = it5;
                                int vo2Max3 = ((Vo2MaxItem) next2).getVo2Max();
                                if (vo2Max2 < vo2Max3) {
                                    vo2Max2 = vo2Max3;
                                    next = next2;
                                }
                                if (it6.hasNext()) {
                                    it5 = it;
                                }
                            }
                        } else {
                            it = it5;
                        }
                    } else {
                        it = it5;
                        next = null;
                    }
                    Vo2MaxItem vo2MaxItem3 = (Vo2MaxItem) next;
                    str = str3;
                    str2 = str4;
                    arrayList2.add(new TimesDataRecordInt(((Number) entry.getKey()).longValue(), new int[]{vo2MaxItem3 != null ? vo2MaxItem3.getVo2Max() : 0}));
                }
                vo2MaxItem = vo2MaxItem;
                it = it5;
                str = str3;
                str2 = str4;
            } else {
                vo2MaxItem = vo2MaxItem;
                it = it5;
                str = str3;
                str2 = str4;
                if (viewTag.equals("months")) {
                    linkedHashSet = new LinkedHashSet();
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(Integer.valueOf(((Vo2MaxItem) it2.next()).getVo2Max()));
                    }
                    arrayList2.add(new TimesDataRecordInt(((Number) entry.getKey()).longValue(), CollectionsKt___CollectionsKt.toIntArray(linkedHashSet)));
                }
            }
            vo2MaxItem = vo2MaxItem;
            str3 = str;
            it5 = it;
            str4 = str2;
        }
        DailyVo2MaxReport dailyVo2MaxReport = new DailyVo2MaxReport(timestamp, viewTag);
        Intrinsics.checkNotNull(num);
        dailyVo2MaxReport.setMaxVo2Max(num.intValue());
        Intrinsics.checkNotNull(num2);
        dailyVo2MaxReport.setMinVo2Max(num2.intValue());
        dailyVo2MaxReport.setAvgVoxMax(size);
        dailyVo2MaxReport.setLatestItem(vo2MaxItem);
        dailyVo2MaxReport.setVo2MaxList(arrayList2);
        return dailyVo2MaxReport;
    }
}
