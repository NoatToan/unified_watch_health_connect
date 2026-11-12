package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public class sas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ExecutorService f33469a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static yus f33470b = null;
    public static ReentrantLock c = new ReentrantLock();

    public class a implements zh.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f33471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f33472b;

        public a(AtomicBoolean atomicBoolean, ConditionVariable conditionVariable) {
            this.f33471a = atomicBoolean;
            this.f33472b = conditionVariable;
        }

        @Override // zh.a
        public void a(BluetoothDevice bluetoothDevice) {
            t5t.m("BleScanCenter", "onDeviceConnected");
        }

        @Override // zh.a
        public void b(BluetoothDevice bluetoothDevice, int i) {
            this.f33472b.open();
        }

        @Override // zh.a
        public void c(BluetoothDevice bluetoothDevice) {
        }

        @Override // zh.a
        public void d(BluetoothDevice bluetoothDevice, int i) {
            this.f33472b.open();
        }

        @Override // zh.a
        public void e(BluetoothDevice bluetoothDevice, boolean z) {
            if (z) {
                t5t.m("BleScanCenter", "onInitializationSuccess");
                this.f33471a.set(true);
            } else {
                t5t.m("BleScanCenter", "onInitializationFailed");
            }
            this.f33472b.open();
        }

        @Override // zh.a
        public void f(BluetoothDevice bluetoothDevice) {
        }

        @Override // zh.a
        public void g(BluetoothDevice bluetoothDevice, int i) {
            this.f33472b.open();
        }

        @Override // zh.a
        public void h(BluetoothDevice bluetoothDevice) {
        }

        @Override // zh.a
        public void j(BluetoothDevice bluetoothDevice) {
        }
    }

    public interface b {
        void a(ArrayList<String> arrayList, g4s g4sVar);
    }

    public static /* synthetic */ void a(Context context, BluetoothDevice bluetoothDevice, b bVar) {
        g4s g4sVarZ0;
        t5t.d("BleScanCenter", "DeviceInfoScanner run~");
        ConditionVariable conditionVariable = new ConditionVariable();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c.lock();
        try {
            yus yusVar = new yus(context, bluetoothDevice, new a(atomicBoolean, conditionVariable));
            f33470b = yusVar;
            yusVar.a(false);
            f33470b.f0();
            conditionVariable.block(20000L);
            ArrayList<String> arrayList = new ArrayList<>();
            if (atomicBoolean.get()) {
                List<BluetoothGattService> listN0 = f33470b.n0();
                if (listN0 != null && listN0.size() > 0) {
                    for (BluetoothGattService bluetoothGattService : listN0) {
                        tet.k(bluetoothGattService);
                        t5t.m("BleScanCenter", "UUID:" + bluetoothGattService.getUuid());
                        arrayList.add(bluetoothGattService.getUuid().toString());
                    }
                }
                g4sVarZ0 = f33470b.Z0();
                t5t.m("BleScanCenter", "Device info:" + g4sVarZ0);
            } else {
                g4sVarZ0 = null;
            }
            bVar.a(arrayList, g4sVarZ0);
        } finally {
            c.unlock();
        }
    }

    public static void b(final Context context, final BluetoothDevice bluetoothDevice, final b bVar) {
        f33469a.execute(new Runnable() { // from class: ras
            @Override // java.lang.Runnable
            public final void run() {
                sas.a(context, bluetoothDevice, bVar);
            }
        });
    }
}
