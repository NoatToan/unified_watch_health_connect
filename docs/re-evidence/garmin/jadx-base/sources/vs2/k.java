package vs2;

import com.google.common.base.Ascii;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvs2/k;", "", "", "rawValue", "<init>", "(Ljava/lang/String;IB)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum k {
    SYNC_COMPLETE((byte) 0),
    SYNC_FAIL((byte) 1),
    FACTORY_RESET((byte) 2),
    PAIR_START((byte) 3),
    PAIR_COMPLETE((byte) 4),
    PAIR_FAIL((byte) 5),
    HOST_DID_ENTER_FOREGROUND((byte) 6),
    HOST_DID_ENTER_BACKGROUND((byte) 7),
    HANDSHAKE_COMPLETE((byte) 8),
    NEW_DOWNLOAD_AVAILABLE((byte) 9),
    DEVICE_SOFTWARE_UPDATE((byte) 10),
    DEVICE_DISCONNECT(Ascii.VT),
    TUTORIAL_COMPLETE(Ascii.FF),
    SETUP_WIZARD_START(Ascii.CR),
    SETUP_WIZARD_COMPLETE(Ascii.SO),
    SETUP_WIZARD_SKIPPED(Ascii.SI),
    TIME_UPDATED(Ascii.DLE),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_REBOOT((byte) 17);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f179981a;

    k(byte b14) {
        this.f179981a = b14;
    }
}
