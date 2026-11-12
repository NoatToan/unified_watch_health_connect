package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lp;", "", "", "reason", "I", PluginDeviceInfo.FDESC, "()I", "setReason", "(I)V", "<init>", "(Ljava/lang/String;II)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum p {
    CTS_AR_NO_CHANGE(0),
    CTS_AR_MANUAL_TIME_UPDATE(1),
    CTS_AR_EXTERNAL_REFERENCE_TIME_UPDATE(2),
    CTS_AR_CHANGE_OF_TIME_ZONE(3),
    CTS_AR_CHANGE_OF_DST(8);

    public int t;

    p(int i) {
        this.t = i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getT() {
        return this.t;
    }
}
