package rl2;

import ch.qos.logback.classic.Logger;
import com.garmin.device.nfc.NfcCommandHandler;
import com.garmin.device.nfc.g;

/* JADX INFO: loaded from: classes11.dex */
public class c extends NfcCommandHandler {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f153458i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pl2.f f153459h;

    public enum a {
        DEVICE_DRIVEN_SOCKET
    }

    static {
        int i14 = gt2.c.f79010a;
        f153458i = gt2.b.f79005a.i("PAY#NFC#NfcService");
    }

    public c(g gVar, byte b14) {
        super(gVar, b14);
        this.f153459h = null;
    }
}
