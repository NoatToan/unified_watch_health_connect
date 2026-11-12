package defpackage;

import android.bluetooth.BluetoothGattDescriptor;
import android.os.Bundle;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback;

/* JADX INFO: loaded from: classes7.dex */
public class dro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f32256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f32258c;
    private IAsynBleTaskCallback d;
    private c e;
    private int f;
    private int g;
    private BleTaskQueueUtil.TaskType i;

    public dro(BleTaskQueueUtil.TaskType taskType, byte[] bArr) {
        this(taskType, bArr, false, -1);
    }

    public dro(BleTaskQueueUtil.TaskType taskType, byte[] bArr, boolean z) {
        this(taskType, bArr, z, -1);
    }

    public dro(BleTaskQueueUtil.TaskType taskType, byte[] bArr, boolean z, int i) {
        this(taskType, bArr, z, i, true);
    }

    public dro(BleTaskQueueUtil.TaskType taskType, byte[] bArr, boolean z, int i, boolean z2) {
        this.g = 0;
        this.i = taskType;
        this.f32256a = bArr == null ? null : (byte[]) bArr.clone();
        this.f32257b = z;
        this.f = i;
        this.e = new c(z2) { // from class: dro.4
            {
                c(new byte[][]{BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE});
            }
        };
    }

    public BleTaskQueueUtil.TaskType f() {
        return this.i;
    }

    public byte[] d() {
        byte[] bArr = this.f32256a;
        return bArr == null ? new byte[0] : (byte[]) bArr.clone();
    }

    public boolean g() {
        return this.f32257b;
    }

    public int h() {
        return this.f;
    }

    public IAsynBleTaskCallback e() {
        return this.d;
    }

    public void c(IAsynBleTaskCallback iAsynBleTaskCallback) {
        this.d = iAsynBleTaskCallback;
    }

    public int a() {
        return this.g;
    }

    public void c(int i) {
        this.g = i;
    }

    public c c() {
        return this.e;
    }

    public void d(c cVar) {
        this.e = cVar;
    }

    public void b(Bundle bundle) {
        this.f32258c = bundle;
    }

    public Bundle b() {
        return this.f32258c;
    }

    public class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f32261c;
        private byte[][] d;

        public c(boolean z) {
            this.f32261c = z;
        }

        public void c(byte[][] bArr) {
            if (bArr != null) {
                this.d = (byte[][]) bArr.clone();
            }
        }

        public byte[][] c() {
            byte[][] bArr = this.d;
            if (bArr != null) {
                return (byte[][]) bArr.clone();
            }
            return new byte[0][];
        }

        public boolean b() {
            return this.f32261c;
        }
    }
}
