package com.xiaomi.fitness.repo.pai;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPaiReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.OneDayPaiReport;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.pai.PaiBiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/repo/pai/PaiBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "<init>", "()V", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaiBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaiBiz.kt\ncom/xiaomi/fitness/repo/pai/PaiBiz\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n774#2:83\n865#2,2:84\n*S KotlinDebug\n*F\n+ 1 PaiBiz.kt\ncom/xiaomi/fitness/repo/pai/PaiBiz\n*L\n56#1:83\n56#1:84,2\n*E\n"})
public final class PaiBiz extends BaseProcessBiz<DailyPaiReport> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean splitDailyReport$lambda$0(DailyRecordItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return ((OneDayPaiReport) item).getTotalPai() > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyRecordItem splitDailyReport$lambda$1(DailyRecordItem newItem, DailyRecordItem dailyRecordItem) {
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (dailyRecordItem == null) {
            return newItem;
        }
        OneDayPaiReport oneDayPaiReport = (OneDayPaiReport) newItem;
        OneDayPaiReport oneDayPaiReport2 = (OneDayPaiReport) dailyRecordItem;
        return oneDayPaiReport.getPai() > oneDayPaiReport2.getPai() ? oneDayPaiReport : oneDayPaiReport2;
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyPaiReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyPaiReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (!Intrinsics.areEqual(viewTag, "home") && TextUtils.isEmpty(sid)) {
            FitnessLogUtils.i(getTAG(), "splitDailyPAIReport: sid is null or empty");
            return new DailyPaiReport(timestamp, null);
        }
        if (itemMap.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "splitDailyPAIReport: source data is empty");
            return new DailyPaiReport(timestamp, null);
        }
        Pair<String, Map<String, List<DailyRecordItem>>> pairSpiltRecordList = spiltRecordList(itemMap, new Function1() { // from class: jih
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(PaiBiz.splitDailyReport$lambda$0((DailyRecordItem) obj));
            }
        }, new Function2() { // from class: kih
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PaiBiz.splitDailyReport$lambda$1((DailyRecordItem) obj, (DailyRecordItem) obj2);
            }
        });
        if (Intrinsics.areEqual(viewTag, "home")) {
            sid = pairSpiltRecordList.getFirst();
        } else {
            Intrinsics.checkNotNull(sid);
        }
        List<DailyRecordItem> list = pairSpiltRecordList.getSecond().get(sid);
        List<DailyRecordItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "pai pairList:no data to sid " + sid + ", time = " + timestamp);
            return new DailyPaiReport(timestamp, sid);
        }
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.OneDayPaiReport>");
        ArrayList<OneDayPaiReport> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((OneDayPaiReport) obj).getTotalPai() > 0.0f) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "pai allRecordList:no data to sid " + sid + ", time = " + timestamp);
            return new DailyPaiReport(timestamp, sid);
        }
        if (Intrinsics.areEqual(viewTag, "days")) {
            return ((OneDayPaiReport) CollectionsKt___CollectionsKt.first((List) arrayList)).convertToDailyPaiReport();
        }
        if (!Intrinsics.areEqual(viewTag, "home")) {
            return new DailyPaiReport(timestamp, null);
        }
        DailyPaiReport dailyPaiReport = new DailyPaiReport(timestamp, sid);
        ArrayList arrayList2 = new ArrayList();
        for (OneDayPaiReport oneDayPaiReport : arrayList) {
            arrayList2.add(oneDayPaiReport);
            if (timestamp == oneDayPaiReport.getTime()) {
                dailyPaiReport.setPai(oneDayPaiReport.getPai());
                dailyPaiReport.setHighZonePai(oneDayPaiReport.getHighZonePai());
                dailyPaiReport.setMediumZonePai(oneDayPaiReport.getMediumZonePai());
                dailyPaiReport.setLowZonePai(oneDayPaiReport.getLowZonePai());
                dailyPaiReport.setTotalPai(oneDayPaiReport.getTotalPai());
            }
        }
        dailyPaiReport.setPaiList(arrayList2);
        return dailyPaiReport;
    }
}
