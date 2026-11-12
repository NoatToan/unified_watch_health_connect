package com.xiaomi.fitness.repo.strength;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudHMStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.MHStrengthRecord;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.MHStrengthItem;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BigValueDistinct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J<\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\n2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/repo/strength/StrengthBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "<init>", "()V", "itemDistinct", "Lcom/xiaomi/fitness/repo/BigValueDistinct;", "Lcom/xiaomi/fit/fitness/export/data/item/MHStrengthItem;", "convertServerAggregateReport", "time", "", CloudContract.COL_VIEW_TAG, "", "dataModel", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "splitDailyReport", "sid", "timestamp", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStrengthBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrengthBiz.kt\ncom/xiaomi/fitness/repo/strength/StrengthBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n216#2:81\n217#2:84\n216#2,2:85\n216#2,2:87\n1863#3,2:82\n*S KotlinDebug\n*F\n+ 1 StrengthBiz.kt\ncom/xiaomi/fitness/repo/strength/StrengthBiz\n*L\n44#1:81\n44#1:84\n54#1:85,2\n69#1:87,2\n46#1:82,2\n*E\n"})
public final class StrengthBiz extends BaseProcessBiz<DailyMHStrengthReport> {

    @NotNull
    private final BigValueDistinct<MHStrengthItem> itemDistinct = new BigValueDistinct<>();

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyMHStrengthReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyMHStrengthReport convertServerAggregateReport(long time, @NotNull String viewTag, @Nullable RelativeDataModel dataModel) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        if (dataModel == null) {
            return new DailyMHStrengthReport(time, viewTag);
        }
        CloudHMStrengthReport cloudHMStrengthReport = (CloudHMStrengthReport) FitnessPersistUtils.INSTANCE.fromJson(dataModel.getValue(), CloudHMStrengthReport.class);
        return cloudHMStrengthReport == null ? new DailyMHStrengthReport(time, viewTag) : new DailyMHStrengthReport(time, viewTag, CollectionsKt__CollectionsKt.emptyList(), cloudHMStrengthReport.getDuration());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyMHStrengthReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Map mapGroupByHalfHour;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (itemMap.isEmpty()) {
            return new DailyMHStrengthReport(timestamp, viewTag);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ? extends List<? extends DailyRecordItem>>> it = itemMap.entrySet().iterator();
        while (it.hasNext()) {
            for (DailyRecordItem dailyRecordItem : it.next().getValue()) {
                Long lValueOf = Long.valueOf(dailyRecordItem.getTimestamp());
                Intrinsics.checkNotNull(dailyRecordItem, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.MHStrengthItem");
                linkedHashMap.put(lValueOf, (MHStrengthItem) dailyRecordItem);
            }
        }
        long jMin = Long.MAX_VALUE;
        long jMax = Long.MIN_VALUE;
        int i = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            i++;
            jMin = Math.min(jMin, ((Number) entry.getKey()).longValue());
            jMax = Math.max(jMax, ((Number) entry.getKey()).longValue() + ((long) 3600));
        }
        Collection collectionValues = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        List list = CollectionsKt___CollectionsKt.toList(collectionValues);
        switch (viewTag) {
            case "months":
                mapGroupByHalfHour = groupByDay(timestamp, list, this.itemDistinct);
                break;
            case "days":
                mapGroupByHalfHour = groupByHalfHour(timestamp, list, this.itemDistinct);
                break;
            case "home":
                mapGroupByHalfHour = groupByHour(timestamp, list, this.itemDistinct);
                break;
            case "weeks":
                mapGroupByHalfHour = groupByDay(timestamp, list, this.itemDistinct);
                break;
            default:
                mapGroupByHalfHour = null;
                break;
        }
        ArrayList arrayList = new ArrayList();
        if (mapGroupByHalfHour != null) {
            for (Iterator it2 = mapGroupByHalfHour.entrySet().iterator(); it2.hasNext(); it2 = it2) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                arrayList.add(new MHStrengthRecord(((Number) entry2.getKey()).longValue(), ((List) entry2.getValue()).size()));
            }
        }
        DailyMHStrengthReport dailyMHStrengthReport = new DailyMHStrengthReport(timestamp, viewTag, arrayList, i);
        if (Intrinsics.areEqual(viewTag, "days")) {
            dailyMHStrengthReport.setMinStartTime(Long.valueOf(jMin));
            dailyMHStrengthReport.setMaxEndTime(Long.valueOf(jMax));
        }
        return dailyMHStrengthReport;
    }
}
