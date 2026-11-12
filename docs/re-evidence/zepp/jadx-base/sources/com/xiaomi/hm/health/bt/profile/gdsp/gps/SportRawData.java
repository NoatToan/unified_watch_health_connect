package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.ranges.IntRange;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRawData;", "", "", "data", "", "appendSummary", "", "getSummaryRawData", "appendDetailData", "", "a", "Z", "getSummarySealed", "()Z", "setSummarySealed", "(Z)V", "summarySealed", "b", "getDetailSealed", "setDetailSealed", "detailSealed", "", "c", "Ljava/util/List;", "getSummaryData", "()Ljava/util/List;", "summaryData", GoogleApiAvailabilityLight.a, "getDetailData", "detailData", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportRawData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean summarySealed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean detailSealed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<byte[]> summaryData = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<byte[]> detailData = new ArrayList();

    public final void appendDetailData(@NotNull String data) {
        byte[] bArrHexStringToBytes = GattUtils.hexStringToBytes(m.replace$default(data, " ", "", false, 4, (Object) null));
        this.detailData.add(ArraysKt___ArraysKt.sliceArray(bArrHexStringToBytes, new IntRange(1, bArrHexStringToBytes.length - 1)));
    }

    public final void appendSummary(@NotNull String data) {
        if (this.summarySealed) {
            return;
        }
        byte[] bArrHexStringToBytes = GattUtils.hexStringToBytes(m.replace$default(data, " ", "", false, 4, (Object) null));
        this.summaryData.add(ArraysKt___ArraysKt.sliceArray(bArrHexStringToBytes, new IntRange(1, bArrHexStringToBytes.length - 1)));
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
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, (byte[]) it2.next());
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
