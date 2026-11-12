package com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/hrzone/HrZoneWrapperApiV1Impl;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/hrzone/HrZoneWrapperApi;", "", "getHrZoneType", "", "getHrZoneValue", "a", LogUtil.I, "type", "", "b", "[I", "list", "", "c", "J", "activeTime", "<init>", "(I[IJ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HrZoneWrapperApiV1Impl implements HrZoneWrapperApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final int[] list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long activeTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<?, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Object obj) {
            return obj + ",-1";
        }
    }

    public HrZoneWrapperApiV1Impl(int i, @NotNull int[] iArr, long j) {
        this.type = i;
        this.list = iArr;
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
            i += i2 * 60;
        }
        long j = this.activeTime - ((long) i);
        long j2 = 0;
        if (j >= 0) {
            long j3 = 60;
            j2 = j3 * (j / j3);
        }
        List listListOf = e.listOf(Long.valueOf(j2));
        int[] iArr = this.list;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3 * 60));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList), ";", null, null, 0, null, a.a, 30, null);
    }
}
