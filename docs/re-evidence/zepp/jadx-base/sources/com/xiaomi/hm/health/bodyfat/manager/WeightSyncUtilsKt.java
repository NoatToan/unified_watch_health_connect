package com.xiaomi.hm.health.bodyfat.manager;

import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a.\u0010\b\u001a\u001c\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\"\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "list", "noOwnerRecords", "ownerRecords", "", "", "kotlin.jvm.PlatformType", "groupNoOwnerUserByMac", "", "NO_OWNER_DATE_ID", "J", "bodyfat_midongRelease"}, k = 2, mv = {1, 5, 1})
public final class WeightSyncUtilsKt {
    public static final long NO_OWNER_DATE_ID = 281474976710655L;

    @NotNull
    public static final Map<String, List<WeightInfos>> groupNoOwnerUserByMac(@NotNull List<? extends WeightInfos> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((WeightInfos) obj).getDevice_id() != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            String device_id = ((WeightInfos) obj2).getDevice_id();
            Object arrayList2 = linkedHashMap.get(device_id);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(device_id, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final List<WeightInfos> noOwnerRecords(@NotNull List<? extends WeightInfos> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Long userId = ((WeightInfos) obj).getUserId();
            if (userId != null && userId.longValue() == NO_OWNER_DATE_ID) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<WeightInfos> ownerRecords(@NotNull List<? extends WeightInfos> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Long userId = ((WeightInfos) obj).getUserId();
            if (userId == null || userId.longValue() != NO_OWNER_DATE_ID) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
