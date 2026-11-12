package com.huami.bluetooth.profile.ecf.data;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0014\u001a\u00020\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/DialsInfo;", "", "", "", "component1", "ids", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DialsInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Integer> ids;

    public DialsInfo(@NotNull List<Integer> list) {
        this.ids = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialsInfo copy$default(DialsInfo dialsInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dialsInfo.ids;
        }
        return dialsInfo.copy(list);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.ids;
    }

    @NotNull
    public final DialsInfo copy(@NotNull List<Integer> ids) {
        return new DialsInfo(ids);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DialsInfo) && Intrinsics.areEqual(this.ids, ((DialsInfo) other).ids);
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(getIds().size());
        Iterator<T> it2 = getIds().iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(GattUtils.intToBytes(((Number) it2.next()).intValue()));
        }
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public final List<Integer> getIds() {
        return this.ids;
    }

    public int hashCode() {
        return this.ids.hashCode();
    }

    @NotNull
    public String toString() {
        return "DialsInfo(ids=" + this.ids + ')';
    }
}
