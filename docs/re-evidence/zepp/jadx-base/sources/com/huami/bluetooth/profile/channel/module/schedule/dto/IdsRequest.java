package com.huami.bluetooth.profile.channel.module.schedule.dto;

import com.huami.bluetooth.profile.channel.module.schedule.ScheduleCmd;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/dto/IdsRequest;", "", "", "toCmd", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCmd;", "component1", "", "", "component2", Constant.h, "ids", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCmd;", "getCmd", "()Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCmd;", "b", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCmd;Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IdsRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final ScheduleCmd cmd;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Long> ids;

    public IdsRequest(@NotNull ScheduleCmd scheduleCmd, @NotNull List<Long> list) {
        this.cmd = scheduleCmd;
        this.ids = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdsRequest copy$default(IdsRequest idsRequest, ScheduleCmd scheduleCmd, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            scheduleCmd = idsRequest.cmd;
        }
        if ((i & 2) != 0) {
            list = idsRequest.ids;
        }
        return idsRequest.copy(scheduleCmd, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScheduleCmd getCmd() {
        return this.cmd;
    }

    @NotNull
    public final List<Long> component2() {
        return this.ids;
    }

    @NotNull
    public final IdsRequest copy(@NotNull ScheduleCmd cmd, @NotNull List<Long> ids) {
        return new IdsRequest(cmd, ids);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdsRequest)) {
            return false;
        }
        IdsRequest idsRequest = (IdsRequest) other;
        return this.cmd == idsRequest.cmd && Intrinsics.areEqual(this.ids, idsRequest.ids);
    }

    @NotNull
    public final ScheduleCmd getCmd() {
        return this.cmd;
    }

    @NotNull
    public final List<Long> getIds() {
        return this.ids;
    }

    public int hashCode() {
        return (this.cmd.hashCode() * 31) + this.ids.hashCode();
    }

    @NotNull
    public final byte[] toCmd() {
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{this.cmd.toByte()}, ByteUtilsKt.toByteArray(this.ids.size(), 2));
        Iterator<T> it2 = this.ids.iterator();
        while (it2.hasNext()) {
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, SyncRequestKt.a(((Number) it2.next()).longValue()));
        }
        return bArrPlus;
    }

    @NotNull
    public String toString() {
        return "IdsRequest(cmd=" + this.cmd + ", ids=" + this.ids + ')';
    }
}
