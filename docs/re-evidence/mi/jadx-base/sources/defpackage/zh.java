package defpackage;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes3.dex */
public interface zh {

    public interface a {
        void a(BluetoothDevice bluetoothDevice);

        void b(BluetoothDevice bluetoothDevice, int i);

        void c(BluetoothDevice bluetoothDevice);

        void d(BluetoothDevice bluetoothDevice, int i);

        void e(BluetoothDevice bluetoothDevice, boolean z);

        void f(BluetoothDevice bluetoothDevice);

        void g(BluetoothDevice bluetoothDevice, int i);

        void h(BluetoothDevice bluetoothDevice);

        void j(BluetoothDevice bluetoothDevice);
    }

    public interface b {
        void e(byte[] bArr);
    }

    public enum c {
        DISCONNECTING(3),
        DISCONNECTED(0),
        CONNECTING(1),
        CONNECTED(2);

        public int t;

        c(int i) {
            this.t = i;
        }
    }

    void a(boolean z);

    Boolean d();
}
