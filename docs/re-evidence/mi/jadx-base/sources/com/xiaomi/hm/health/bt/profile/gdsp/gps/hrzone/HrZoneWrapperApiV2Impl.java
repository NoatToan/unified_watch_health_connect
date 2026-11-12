package com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/hrzone/HrZoneWrapperApiV2Impl;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/hrzone/HrZoneWrapperApi;", "type", "", "heartRange", "", "heartDuration", "(ILjava/util/List;Ljava/util/List;)V", "getHrZoneType", "getHrZoneValue", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HrZoneWrapperApiV2Impl implements HrZoneWrapperApi {

    @NotNull
    private final List<Integer> heartDuration;

    @NotNull
    private final List<Integer> heartRange;
    private final int type;

    public HrZoneWrapperApiV2Impl(int i, @NotNull List<Integer> heartRange, @NotNull List<Integer> heartDuration) {
        Intrinsics.checkNotNullParameter(heartRange, "heartRange");
        Intrinsics.checkNotNullParameter(heartDuration, "heartDuration");
        this.type = i;
        this.heartRange = heartRange;
        this.heartDuration = heartDuration;
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
        Iterator<T> it = list.iterator();
        Iterator<T> it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            int iIntValue = ((Number) it2.next()).intValue();
            int iIntValue2 = ((Number) next).intValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iIntValue2);
            sb2.append(',');
            sb2.append(iIntValue);
            arrayList.add(sb2.toString());
        }
        sb.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, ";", null, null, 0, null, null, 62, null));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }
}
