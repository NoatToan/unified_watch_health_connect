package com.huami.bluetooth.profile.channel.module.schedule.dto;

import com.huami.bluetooth.profile.channel.module.schedule.ScheduleCmd;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/dto/AddOrUpdateRequest;", "", "", Constant.h, "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "a", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "item", "", "b", "Z", "supportAddress", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;Z)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AddOrUpdateRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ScheduleModel item;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean supportAddress;

    public AddOrUpdateRequest(@NotNull ScheduleModel scheduleModel, boolean z) {
        this.item = scheduleModel;
        this.supportAddress = z;
    }

    @NotNull
    public final byte[] cmd() {
        return ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[0], ScheduleCmd.CMD_ADD_OR_UPDATE.toByteArray()), this.item.toByteArray(this.supportAddress));
    }

    public /* synthetic */ AddOrUpdateRequest(ScheduleModel scheduleModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(scheduleModel, (i & 2) != 0 ? false : z);
    }
}
