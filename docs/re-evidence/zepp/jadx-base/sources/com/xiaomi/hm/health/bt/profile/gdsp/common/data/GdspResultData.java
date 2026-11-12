package com.xiaomi.hm.health.bt.profile.gdsp.common.data;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/GdspResultData;", "", "", "toString", "component1", "data", "copy", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GdspResultData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Object data;

    public GdspResultData(@NotNull Object obj) {
        this.data = obj;
    }

    public static /* synthetic */ GdspResultData copy$default(GdspResultData gdspResultData, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = gdspResultData.data;
        }
        return gdspResultData.copy(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final GdspResultData copy(@NotNull Object data) {
        return new GdspResultData(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GdspResultData) && Intrinsics.areEqual(this.data, ((GdspResultData) other).data);
    }

    @NotNull
    public final Object getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        Object obj = this.data;
        return obj instanceof byte[] ? GattUtils.bytesToHexString((byte[]) obj) : obj.toString();
    }
}
