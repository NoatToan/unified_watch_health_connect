package com.huami.bluetooth.profile.channel.module.schedule;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCmd;", "", "", "toByte", "", "toByteArray", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "CMD_QUERY_PROTOCOL_VERSION", "RESULT_QUERY_PROTOCOL_VERSION", "CMD_QUERY_DATA_CHANGED", "RESULT_QUERY_DATA_CHANGED", "CMD_QUERY_DATA", "RESULT_QUERY_DATA", "CMD_ADD_OR_UPDATE", "RESULT_ADD_OR_UPDATE", "CMD_DELETE", "RESULT_DELETE", "CMD_SYNC_DATA", "RESULT_SYNC_DATA", "NOTIFY_DATA_CHANGED", "CMD_CLEAR_DATA_CHANGED_STATUS", "CMD_DELETE_BY_SOURCE", "RESULT_DELETE_BY_SOURCE", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum ScheduleCmd {
    CMD_QUERY_PROTOCOL_VERSION(1),
    RESULT_QUERY_PROTOCOL_VERSION(2),
    CMD_QUERY_DATA_CHANGED(3),
    RESULT_QUERY_DATA_CHANGED(4),
    CMD_QUERY_DATA(5),
    RESULT_QUERY_DATA(6),
    CMD_ADD_OR_UPDATE(7),
    RESULT_ADD_OR_UPDATE(8),
    CMD_DELETE(9),
    RESULT_DELETE(10),
    CMD_SYNC_DATA(11),
    RESULT_SYNC_DATA(12),
    NOTIFY_DATA_CHANGED(13),
    CMD_CLEAR_DATA_CHANGED_STATUS(14),
    CMD_DELETE_BY_SOURCE(15),
    RESULT_DELETE_BY_SOURCE(16);

    private final int value;

    ScheduleCmd(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final byte toByte() {
        return (byte) this.value;
    }

    @NotNull
    public final byte[] toByteArray() {
        return ByteUtilsKt.toByteArray(this.value, 1);
    }
}
