package defpackage;

import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class ae4 {
    public static final ae4 c = new ae4("exceed max for connect time: ", -100);
    public static final ae4 d = new ae4("device manager not ready,quit connect", -101);
    public static final ae4 e = new ae4("invoke disconnect ", -102);
    public static final ae4 f = new ae4("device manager err", OTAErrorCode.READ_FRIMWARE_VERSION_FAIL);
    public static final ae4 g = new ae4("connect service init err", OTAErrorCode.READ_REMOTE_VERSION_INFO_FAIL);
    public static final ae4 h = new ae4("no wifi or wifiap", -202);
    public static final ae4 i = new ae4("ip err", -300);
    public static final ae4 j = new ae4("connect err by server", OTAErrorCode.DOWNLOAD_FAIL);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ae4 f917k = new ae4("not receive heartbeat", OTAErrorCode.DOWNLOAD_MD5_NOT_EQUAL);
    public static final ae4 l = new ae4("device off state", OTAErrorCode.DOWNLOAD_URL_IS_EMPTY);
    public static final ae4 m = new ae4("router err ", -304);
    public static final ae4 n = new ae4("get device server err", -305);
    public static final ae4 o = new ae4("ip or router err", -306);
    public static final ae4 p = new ae4("connected err", -400);
    public static final ae4 q = new ae4("not receive heartbeat", OTAErrorCode.DFU_READ_PROTOCOL_VERSION_FAIL);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ae4 f918r = new ae4("no wifi or wifiap", -500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f920b;

    public ae4(String str, int i2) {
        this.f919a = str;
        this.f920b = i2;
    }

    public int a() {
        return this.f920b;
    }

    public String b() {
        return this.f919a;
    }

    public String toString() {
        return "ConnectErr{errMsg='" + this.f919a + "', code=" + this.f920b + AbstractJsonLexerKt.END_OBJ;
    }
}
