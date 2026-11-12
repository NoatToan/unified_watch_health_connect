package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Llr;", "", "", PluginDeviceInfo.FDESC, "()B", "", PluginDeviceInfo.FICONON, "()[B", "", "value", "<init>", "(Ljava/lang/String;II)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum lr {
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

    public final int t;

    lr(int i) {
        this.t = i;
    }

    public final byte b() {
        return (byte) this.t;
    }

    @NotNull
    public final byte[] c() {
        return c3.a(this.t, 1);
    }
}
