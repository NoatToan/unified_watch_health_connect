package com.huami.watch.companion.ble.lostwarning;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
class c {
    private static final boolean d = true;
    private static final String e = "VerifyConsumer";
    private Context a;
    private VerifyStateMachine b;
    private b c;

    public c(Context context) {
        this.a = context;
    }

    public int a(BluetoothDevice bluetoothDevice) {
        VerifyStateMachine verifyStateMachine = this.b;
        if (verifyStateMachine == null) {
            return -2;
        }
        return verifyStateMachine.connectDevice(bluetoothDevice);
    }

    public int b() {
        VerifyStateMachine verifyStateMachine = this.b;
        if (verifyStateMachine == null) {
            return 0;
        }
        return verifyStateMachine.getState();
    }

    public boolean c() {
        return this.b != null;
    }

    public void d() {
        g();
    }

    public void e(b bVar) {
        this.c = bVar;
        VerifyStateMachine verifyStateMachine = this.b;
        if (verifyStateMachine != null) {
            verifyStateMachine.setVerifyCallback(bVar);
        }
    }

    public void f() {
        if (this.b != null) {
            Log.d(e, "VerifyConsumer already started.", new Object[0]);
            return;
        }
        Log.d(e, "VerifyConsumer started. Verson=180105", new Object[0]);
        VerifyStateMachine verifyStateMachine = new VerifyStateMachine(this.a);
        this.b = verifyStateMachine;
        verifyStateMachine.setVerifyCallback(this.c);
    }

    public void g() {
        VerifyStateMachine verifyStateMachine = this.b;
        if (verifyStateMachine != null) {
            verifyStateMachine.destroy();
            this.b.setVerifyCallback(null);
            this.b = null;
        }
    }

    public void h(int i) {
        VerifyStateMachine verifyStateMachine = this.b;
        if (verifyStateMachine != null) {
            verifyStateMachine.verifyPerform(i);
        }
    }
}
