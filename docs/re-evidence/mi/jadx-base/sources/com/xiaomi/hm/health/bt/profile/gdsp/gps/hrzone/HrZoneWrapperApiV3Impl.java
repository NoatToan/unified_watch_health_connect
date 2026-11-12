package com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/hrzone/HrZoneWrapperApiV3Impl;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/hrzone/HrZoneWrapperApi;", "type", "", "list", "", "activeTime", "", "(I[IJ)V", "getHrZoneType", "getHrZoneValue", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HrZoneWrapperApiV3Impl implements HrZoneWrapperApi {
    private final long activeTime;

    @NotNull
    private final int[] list;
    private final int type;

    public HrZoneWrapperApiV3Impl(int i, @NotNull int[] list, long j) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.type = i;
        this.list = list;
        this.activeTime = j;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone.HrZoneWrapperApi
    /* JADX INFO: renamed from: getHrZoneType, reason: from getter */
    public int getType() {
        return this.type;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone.HrZoneWrapperApi
    @NotNull
    public String getHrZoneValue() {
        int i = 0;
        for (int i2 : this.list) {
            i += i2;
        }
        long j = this.activeTime - ((long) i);
        if (j < 0) {
            j = 0;
        }
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(j));
        int[] iArr = this.list;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList), ";", null, null, 0, null, new Function1<?, CharSequence>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone.HrZoneWrapperApiV3Impl.getHrZoneValue.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final CharSequence invoke2(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it + ",-1";
            }
        }, 30, null);
    }
}
