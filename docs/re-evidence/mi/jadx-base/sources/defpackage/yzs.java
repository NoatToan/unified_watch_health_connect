package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class yzs extends a6t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BluetoothGattCharacteristic f40734b;
    public boolean c;
    public UUID d;
    public UUID e;
    public ej f;
    public int g;
    public final List<WeightAdvData> h;

    /* JADX WARN: Multi-variable type inference failed */
    public yzs(jet jetVar) {
        super(jetVar);
        this.f40734b = null;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 4;
        this.h = new ArrayList();
        if (jetVar instanceof fj) {
            fj fjVar = (fj) jetVar;
            this.d = fjVar.e();
            this.e = fjVar.c();
            this.f = fjVar.g();
            this.g = fjVar.h();
        }
    }

    public List<WeightAdvData> b(long j, int i) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (!registerNotification(this.f40734b, new zh.b() { // from class: wzs
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f38530a.a(atomicBoolean, bArr);
            }
        })) {
            n();
            return null;
        }
        if (!sendCommandWithNoResponse(this.f40734b, new byte[]{2})) {
            n();
            unregisterNotification(this.f40734b);
            return null;
        }
        while (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            waiting(this.f40734b, 10000);
        }
        n();
        if (i == this.h.size()) {
            c(j);
        }
        unregisterNotification(this.f40734b);
        return this.h;
    }

    public final boolean c(long j) {
        return sendCommandWithNoResponse(this.f40734b, d((byte) 4, j));
    }

    public final byte[] d(byte b2, long j) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(b2);
        for (int i = 0; i < this.g; i++) {
            byteArrayOutputStream.write((byte) ((j >> (i * 8)) & 255));
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        return true;
    }

    public int f(long j) {
        qe qeVarSendCommandWithResponse = sendCommandWithResponse(this.f40734b, d((byte) 1, j));
        byte[] bArrJ = qeVarSendCommandWithResponse != null ? qeVarSendCommandWithResponse.j() : null;
        if (bArrJ == null || bArrJ.length < 3 || bArrJ[0] != 1) {
            n();
            return -1;
        }
        int i = (bArrJ[1] & 255) | ((bArrJ[2] & 255) << 8);
        if (i == 0) {
            n();
        }
        return i;
    }

    @Override // defpackage.a6t
    public boolean init() {
        BluetoothGattService service = getService(this.d);
        if (service == null) {
            t5t.d("HMWeightSyncDataProfile", this.d + " is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.e);
        this.f40734b = characteristic;
        if (characteristic != null) {
            return true;
        }
        t5t.d("HMWeightSyncDataProfile", this.e + " is null!!!");
        return false;
    }

    public final boolean n() {
        return sendCommandWithNoResponse(this.f40734b, new byte[]{3});
    }

    public final /* synthetic */ void a(AtomicBoolean atomicBoolean, byte[] bArr) {
        t5t.m("HMWeightSyncDataProfile", "getWeightDatas:" + tet.x(bArr));
        if (bArr == null || bArr.length <= 1) {
            atomicBoolean.set(true);
            watingNotify(this.f40734b);
        } else {
            atomicBoolean.set(false);
            this.h.addAll(this.f.a(bArr));
        }
    }
}
