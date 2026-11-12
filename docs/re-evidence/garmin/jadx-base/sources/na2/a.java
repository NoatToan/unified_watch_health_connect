package na2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothServerSocket;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.UUID;
import k32.n;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"MissingPermission"})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f125207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f125208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f125209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f125210d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f125211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f125212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC2413a f125213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BluetoothServerSocket f125214h;

    /* JADX INFO: renamed from: na2.a$a, reason: collision with other inner class name */
    public interface InterfaceC2413a {
    }

    public a(Context context, UUID uuid) {
        HandlerThread handlerThread = new HandlerThread("BTC_Acceptor_Thread");
        if (context == null) {
            h.s("context is null");
            throw null;
        }
        if (uuid == null) {
            h.s("uuid is null");
            throw null;
        }
        this.f125207a = LoggerFactory.getLogger(oa2.d.a(this, "BluetoothClassicAcceptor"));
        this.f125208b = context.getApplicationContext();
        this.f125209c = uuid;
        handlerThread.start();
        this.f125211e = new Handler(handlerThread.getLooper());
    }

    public final boolean a() {
        boolean z14;
        synchronized (this.f125210d) {
            z14 = this.f125212f;
        }
        return z14;
    }

    public final void b(InterfaceC2413a interfaceC2413a) {
        this.f125207a.debug("BluetoothClassicAcceptor => start() called ");
        synchronized (this.f125210d) {
            try {
                if (this.f125212f) {
                    this.f125207a.trace("Ignoring start() while already running.");
                    return;
                }
                this.f125213g = interfaceC2413a;
                this.f125212f = true;
                this.f125211e.removeCallbacksAndMessages(null);
                this.f125211e.post(new n(this, 24));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(boolean z14) {
        BluetoothServerSocket bluetoothServerSocket;
        g.y("Accepting Connections STOP - ", z14, this.f125207a);
        if (z14) {
            this.f125211e.removeCallbacksAndMessages(null);
        }
        synchronized (this.f125210d) {
            this.f125212f = false;
            this.f125213g = null;
            bluetoothServerSocket = this.f125214h;
            this.f125214h = null;
        }
        e.a(bluetoothServerSocket);
    }
}
