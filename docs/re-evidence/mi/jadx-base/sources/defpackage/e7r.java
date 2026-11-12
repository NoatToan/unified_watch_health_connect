package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import no.nordicsemi.android.ble.data.Data;

/* JADX INFO: loaded from: classes11.dex */
public class e7r extends l22 {
    public final boolean m;
    public final boolean n;
    public boolean o;
    public int p;
    public String q;

    public class a extends l22.h {

        /* JADX INFO: renamed from: e7r$a$a, reason: collision with other inner class name */
        public class C0920a implements m9g {
            public C0920a() {
            }

            @Override // defpackage.m9g
            public void a(BluetoothDevice bluetoothDevice, int i) {
                e7r.this.o = true;
            }
        }

        public class b implements an5 {
            public b() {
            }

            @Override // defpackage.an5
            public void a(BluetoothDevice bluetoothDevice, Data data) {
                byte b2;
                byte[] bArrD = data.d();
                StringBuilder sb = new StringBuilder();
                if (bArrD != null) {
                    int i = 0;
                    while (i < bArrD.length && i < 3) {
                        byte b3 = bArrD[i];
                        if (i == 0) {
                            b2 = 16;
                        } else {
                            b2 = i == 1 ? (byte) 8 : (byte) 0;
                        }
                        e7r.this.p += b3 << b2;
                        sb.append((int) bArrD[i]);
                        if (i != 2) {
                            sb.append(".");
                        }
                        i++;
                    }
                    e7r.this.q = sb.toString();
                }
            }
        }

        public a() {
            super();
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        public void H0() {
            if (e7r.this.m && !e7r.this.o) {
                e7r.this.J(512).N(new C0920a()).j();
            }
            e7r.this.p = 0;
            BluetoothGattCharacteristic bluetoothGattCharacteristicS = e7r.this.S(qf4.f31472a, qf4.f31473b);
            if (bluetoothGattCharacteristicS != null) {
                e7r.this.H(bluetoothGattCharacteristicS).O(new b()).j();
            }
        }

        @Override // pr2.b, no.nordicsemi.android.ble.BleManagerHandler
        public void S1() {
            try {
                super.S1();
            } catch (Exception unused) {
            }
        }

        @Override // l22.h, no.nordicsemi.android.ble.BleManagerHandler
        public void W1() {
            super.W1();
            e7r.this.F(23);
            e7r.this.o = false;
            e7r.this.p = 0;
        }

        @Override // l22.h, no.nordicsemi.android.ble.BleManagerHandler
        public boolean l1(BluetoothGatt bluetoothGatt) {
            return super.l1(bluetoothGatt);
        }
    }

    public e7r(Context context, qr2 qr2Var, boolean z, boolean z2) {
        super(context, qr2Var);
        this.o = false;
        this.p = 0;
        this.m = z;
        this.n = z2;
    }

    @Override // defpackage.pr2
    public boolean N() {
        return this.n;
    }

    @Override // defpackage.jpc
    public int getVersion() {
        return this.p;
    }

    @Override // defpackage.jpc
    public String getVersionName() {
        String str = this.q;
        return str == null ? "0.0.0" : str;
    }

    @Override // defpackage.pr2
    public pr2.b x() {
        return new a();
    }
}
