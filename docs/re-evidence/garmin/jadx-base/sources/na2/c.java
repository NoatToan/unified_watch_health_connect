package na2;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import la2.g;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BluetoothSocket f125218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f125219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f125220d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f125221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f125222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final da2.e f125223g;

    public c(String str, BluetoothSocket bluetoothSocket, Context context, da2.e eVar) {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            h.s("invalid macAddress");
            throw null;
        }
        if (bluetoothSocket == null) {
            h.s("socket is null");
            throw null;
        }
        if (context == null) {
            h.s("context is null");
            throw null;
        }
        if (eVar == null) {
            h.s("configuration is null");
            throw null;
        }
        this.f125217a = str;
        this.f125218b = bluetoothSocket;
        this.f125219c = context.getApplicationContext();
        this.f125221e = LoggerFactory.getLogger(oa2.d.b("GDI#", "BtcConnection", str, -1L, this));
        this.f125223g = eVar;
    }

    public final void a() {
        synchronized (this.f125220d) {
            this.f125222f = null;
        }
        e.a(this.f125218b);
    }
}
