package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.tet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRawData;", "", "()V", "detailData", "", "", "getDetailData", "()Ljava/util/List;", "detailSealed", "", "getDetailSealed", "()Z", "setDetailSealed", "(Z)V", "summaryData", "getSummaryData", "summarySealed", "getSummarySealed", "setSummarySealed", "appendDetailData", "", "data", "", "appendSummary", "getSummaryRawData", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SportRawData {
    private boolean detailSealed;
    private boolean summarySealed;

    @NotNull
    private final List<byte[]> summaryData = new ArrayList();

    @NotNull
    private final List<byte[]> detailData = new ArrayList();

    public final void appendDetailData(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] rawData = tet.y(StringsKt__StringsJVMKt.replace$default(data, " ", "", false, 4, (Object) null));
        List<byte[]> list = this.detailData;
        Intrinsics.checkNotNullExpressionValue(rawData, "rawData");
        list.add(ArraysKt___ArraysKt.sliceArray(rawData, new IntRange(1, rawData.length - 1)));
    }

    public final void appendSummary(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.summarySealed) {
            return;
        }
        byte[] rawData = tet.y(StringsKt__StringsJVMKt.replace$default(data, " ", "", false, 4, (Object) null));
        List<byte[]> list = this.summaryData;
        Intrinsics.checkNotNullExpressionValue(rawData, "rawData");
        list.add(ArraysKt___ArraysKt.sliceArray(rawData, new IntRange(1, rawData.length - 1)));
    }

    @NotNull
    public final List<byte[]> getDetailData() {
        return this.detailData;
    }

    public final boolean getDetailSealed() {
        return this.detailSealed;
    }

    @NotNull
    public final List<byte[]> getSummaryData() {
        return this.summaryData;
    }

    @NotNull
    public final byte[] getSummaryRawData() {
        byte[] bArrPlus = new byte[0];
        List<byte[]> list = this.summaryData;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, (byte[]) it.next());
            arrayList.add(Unit.INSTANCE);
        }
        return bArrPlus;
    }

    public final boolean getSummarySealed() {
        return this.summarySealed;
    }

    public final void setDetailSealed(boolean z) {
        this.detailSealed = z;
    }

    public final void setSummarySealed(boolean z) {
        this.summarySealed = z;
    }
}
