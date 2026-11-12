package na2;

import android.bluetooth.BluetoothSocket;
import android.content.Context;
import com.garmin.android.gfdi.framework.DeviceManager;
import com.garmin.android.gfdi.framework.GfdiDeviceCompat;
import hk0.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import la2.g;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs2.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class d implements na2.a.InterfaceC2413a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final UUID f125224h = UUID.fromString("DEAB91E4-670F-11E1-9ACE-30BC4824019B");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, a> f125225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, c> f125226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na2.a f125227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f125228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f125229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final da2.e f125230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f125231g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f125232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final da2.e f125233b;

        public a(b bVar, da2.e eVar) {
            this.f125232a = bVar;
            this.f125233b = eVar;
        }
    }

    public enum b {
        PERSISTENT,
        PAIRING
    }

    public d(Context context, g gVar, da2.e eVar) {
        if (context == null) {
            h.s("context is null");
            throw null;
        }
        if (gVar == null) {
            h.s("callback is null");
            throw null;
        }
        if (eVar == null) {
            h.s("configuration is null");
            throw null;
        }
        this.f125231g = LoggerFactory.getLogger(oa2.d.a(this, "BluetoothClassicManager"));
        this.f125225a = new HashMap<>();
        this.f125226b = new HashMap<>();
        this.f125227c = new na2.a(context, eVar.f58894e);
        this.f125228d = gVar;
        this.f125229e = context.getApplicationContext();
        this.f125230f = eVar;
    }

    public final void a(String str, b bVar, da2.e eVar) {
        c cVar;
        synchronized (this.f125226b) {
            try {
                a aVarPut = this.f125225a.put(str, new a(bVar, eVar));
                String str2 = "allow known connection for [" + str + "], " + bVar;
                Logger logger = this.f125231g;
                if (aVarPut == null) {
                    logger.info(str2);
                } else {
                    logger.trace(str2);
                }
                cVar = this.f125226b.get(str);
                if (cVar == null || eVar.equals(cVar.f125223g)) {
                    cVar = null;
                } else {
                    this.f125231g.warn("different config from current connection, must disconnect and reconnect\n  oldConfig=" + cVar.f125223g.toString() + "\n  newConfig=" + eVar.toString());
                    this.f125226b.remove(str);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (cVar != null) {
            this.f125231g.debug("Terminating connection , New connection will be recreated next time device tries to connect.");
            cVar.a();
        }
        this.f125231g.debug("BluetoothClassicManager => startAccepting");
        this.f125227c.b(this);
    }

    public final boolean b(String str, BluetoothSocket bluetoothSocket) {
        this.f125231g.debug("BluetoothClassicManager => onDeviceConnected(" + str + "," + bluetoothSocket + ")");
        synchronized (this.f125226b) {
            try {
                a aVar = this.f125225a.get(str);
                if (aVar == null) {
                    this.f125231g.warn("ignoring unknown device " + str);
                    return false;
                }
                b bVar = aVar.f125232a;
                b bVar2 = b.PAIRING;
                if (bVar == bVar2) {
                    this.f125231g.debug("removing pairing connection after first connection");
                    this.f125225a.remove(str);
                }
                da2.e eVar = aVar.f125233b;
                if (eVar == null) {
                    eVar = this.f125230f;
                }
                c cVar = new c(str, bluetoothSocket, this.f125229e, eVar);
                this.f125226b.put(str, cVar);
                this.f125231g.info("onDeviceConnected " + str + " - " + bVar);
                g gVar = this.f125228d;
                boolean z14 = bVar == bVar2;
                if (gVar == null) {
                    h.s("callback is null");
                    return false;
                }
                synchronized (cVar.f125220d) {
                    cVar.f125222f = gVar;
                }
                try {
                    InputStream inputStream = cVar.f125218b.getInputStream();
                    OutputStream outputStream = cVar.f125218b.getOutputStream();
                    DeviceManager deviceManagerRegister = DeviceManager.register(cVar.f125219c, cVar.f125217a, 2);
                    f fVar = da2.d.c(cVar.f125219c).f58887b;
                    if (fVar == null) {
                        cVar.f125221e.error("Failed to start GFDI device. No HostConfiguration available");
                        return true;
                    }
                    na2.b bVar3 = new na2.b(cVar, deviceManagerRegister);
                    wr.g.y("Starting GFDI device : isInPairingFlow ->", z14, cVar.f125221e);
                    GfdiDeviceCompat.INSTANCE.open(inputStream, outputStream, cVar.f125217a, fVar, z14 ? i.b.AUTO_OVERWRITE_MISMATCH : i.b.NOTIFY_MISMATCH, new fm2.b(cVar, 2, deviceManagerRegister, bVar3), new m0.c(1, cVar, deviceManagerRegister));
                    return true;
                } catch (IOException e4) {
                    cVar.f125221e.error("Error setting up connection.", (Throwable) e4);
                    return true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(Exception exc) {
        String str;
        this.f125231g.error("bluetooth classic device search failed", (Throwable) exc);
        synchronized (this.f125226b) {
            try {
                ArrayList arrayList = new ArrayList(this.f125225a.keySet());
                str = arrayList.size() == 1 ? (String) arrayList.get(0) : null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (str != null) {
            this.f125228d.d(str, la2.i.BLUETOOTH_CLASSIC_NOT_STARTED, exc.getMessage());
        }
    }
}
