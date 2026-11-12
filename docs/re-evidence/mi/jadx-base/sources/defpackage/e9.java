package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Le9;", "", "", PluginDeviceInfo.FDESC, "()B", "code", "<init>", "(Ljava/lang/String;IB)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum e9 {
    RESERVED((byte) 0),
    SUCCESS((byte) 1),
    INVALID_STATE((byte) 2),
    OPERATION_FAILED((byte) 3),
    UNKNOW_COMMAND((byte) 5);

    public final byte t;

    e9(byte b2) {
        this.t = b2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte getT() {
        return this.t;
    }
}
