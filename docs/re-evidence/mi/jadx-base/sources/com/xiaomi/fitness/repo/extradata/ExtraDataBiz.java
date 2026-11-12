package com.xiaomi.fitness.repo.extradata;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPhysicalStatusReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/repo/extradata/ExtraDataBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyExtraDataReport;", "<init>", "()V", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExtraDataBiz extends BaseProcessBiz<DailyPhysicalStatusReport> {
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyPhysicalStatusReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyPhysicalStatusReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (!Intrinsics.areEqual(viewTag, "home") && TextUtils.isEmpty(sid)) {
            FitnessLogUtils.i(getTAG(), "splitDailyVitalityReport: sid is null or empty");
            return new DailyPhysicalStatusReport(timestamp);
        }
        if (itemMap.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "splitDailyVitalityReport: source data is empty");
            return new DailyPhysicalStatusReport(timestamp);
        }
        DailyPhysicalStatusReport dailyPhysicalStatusReport = new DailyPhysicalStatusReport(timestamp);
        ArrayList arrayList = new ArrayList();
        List<? extends DailyRecordItem> list = itemMap.get("light_sensitivity_value");
        List<? extends DailyRecordItem> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.LightValueItem>");
            ListExtKt.addAll(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList();
        List<? extends DailyRecordItem> list3 = itemMap.get("body_momentum");
        List<? extends DailyRecordItem> list4 = list3;
        if (list4 != null && !list4.isEmpty()) {
            Intrinsics.checkNotNull(list3, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BodyMomentumItem>");
            ListExtKt.addAll(arrayList2, list3);
        }
        dailyPhysicalStatusReport.setBodyMomentumItem(arrayList2);
        dailyPhysicalStatusReport.setSid(sid);
        return dailyPhysicalStatusReport;
    }
}
