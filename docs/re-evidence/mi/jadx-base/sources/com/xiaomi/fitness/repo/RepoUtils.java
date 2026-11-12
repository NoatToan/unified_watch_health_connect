package com.xiaomi.fitness.repo;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00072\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007J&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/repo/RepoUtils;", "", "<init>", "()V", "TAG", "", "groupedBySid", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "itemListMap", "itemList", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RepoUtils {

    @NotNull
    public static final RepoUtils INSTANCE = new RepoUtils();

    @NotNull
    private static final String TAG = "Data_repo";

    private RepoUtils() {
    }

    @NotNull
    public final Map<String, Map<String, List<DailyRecordItem>>> groupedBySid(@NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemListMap) {
        Intrinsics.checkNotNullParameter(itemListMap, "itemListMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<? extends DailyRecordItem>> entry : itemListMap.entrySet()) {
            String key = entry.getKey();
            for (Map.Entry<String, List<DailyRecordItem>> entry2 : groupedBySid(entry.getValue()).entrySet()) {
                String key2 = entry2.getKey();
                List<DailyRecordItem> value = entry2.getValue();
                Map linkedHashMap2 = (Map) linkedHashMap.get(key2);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(key2, linkedHashMap2);
                }
                List arrayList = (List) linkedHashMap2.get(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap2.put(key, arrayList);
                }
                arrayList.addAll(value);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, List<DailyRecordItem>> groupedBySid(@NotNull List<? extends DailyRecordItem> itemList) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DailyRecordItem dailyRecordItem : itemList) {
            String sid = dailyRecordItem.getSid();
            if (sid != null && sid.length() != 0) {
                List arrayList = (List) linkedHashMap.get(sid);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(sid, arrayList);
                }
                arrayList.add(dailyRecordItem);
            } else {
                FitnessLogUtils.e(TAG, "sid is null in data: item = " + dailyRecordItem);
            }
        }
        return linkedHashMap;
    }
}
