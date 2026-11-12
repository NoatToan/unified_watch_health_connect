package com.huami.bluetooth.profile.channel.module.schedule.dto;

import com.huami.bluetooth.profile.channel.module.schedule.ScheduleCmd;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/dto/SyncRequest;", "", "", "toCmd", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "component1", "items", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SyncRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<ScheduleModel> items;

    public SyncRequest(@NotNull List<ScheduleModel> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncRequest copy$default(SyncRequest syncRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = syncRequest.items;
        }
        return syncRequest.copy(list);
    }

    @NotNull
    public final List<ScheduleModel> component1() {
        return this.items;
    }

    @NotNull
    public final SyncRequest copy(@NotNull List<ScheduleModel> items) {
        return new SyncRequest(items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SyncRequest) && Intrinsics.areEqual(this.items, ((SyncRequest) other).items);
    }

    @NotNull
    public final List<ScheduleModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public final byte[] toCmd() {
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{ScheduleCmd.CMD_SYNC_DATA.toByte()}, ByteUtilsKt.toByteArray(this.items.size(), 2));
        Iterator<T> it2 = this.items.iterator();
        while (it2.hasNext()) {
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, ScheduleModel.toByteArray$default((ScheduleModel) it2.next(), false, 1, null));
        }
        return bArrPlus;
    }

    @NotNull
    public String toString() {
        return "SyncRequest(items=" + this.items + ')';
    }
}
