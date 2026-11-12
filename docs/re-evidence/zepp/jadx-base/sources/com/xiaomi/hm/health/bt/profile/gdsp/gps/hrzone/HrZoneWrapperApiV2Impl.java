package com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/hrzone/HrZoneWrapperApiV2Impl;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/hrzone/HrZoneWrapperApi;", "", "getHrZoneType", "", "getHrZoneValue", "a", LogUtil.I, "type", "", "b", "Ljava/util/List;", "heartRange", "c", "heartDuration", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HrZoneWrapperApiV2Impl implements HrZoneWrapperApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> heartRange;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> heartDuration;

    public HrZoneWrapperApiV2Impl(int i, @NotNull List<Integer> list, @NotNull List<Integer> list2) {
        this.type = i;
        this.heartRange = list;
        this.heartDuration = list2;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone.HrZoneWrapperApi
    /* JADX INFO: renamed from: getHrZoneType, reason: from getter */
    public int getType() {
        return this.type;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone.HrZoneWrapperApi
    @NotNull
    public String getHrZoneValue() {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = this.heartDuration;
        List<Integer> list2 = this.heartRange;
        Iterator<T> it2 = list.iterator();
        Iterator<T> it3 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            int iIntValue = ((Number) it3.next()).intValue();
            int iIntValue2 = ((Number) next).intValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iIntValue2);
            sb2.append(',');
            sb2.append(iIntValue);
            arrayList.add(sb2.toString());
        }
        sb.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, ";", null, null, 0, null, null, 62, null));
        return sb.toString();
    }
}
