package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.fitness.common.utils.ByteUtil;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class lem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f24978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24979b;
    public int c;
    public String d;
    public String e;
    public List<BluetoothGattService> f;
    public int g;
    public int h;
    public byte[] i;
    public long j;

    public String toString() {
        return "SinglePacketData{device=" + this.f24978a + ", status=" + this.f24979b + ", newState=" + this.c + ", serviceUuid='" + this.d + "', characteristicUuid='" + this.e + "', services=" + this.f + ", mtu=" + this.g + ", rssi=" + this.h + ", data=" + ByteUtil.byteToString(this.i) + ", time=" + this.j + AbstractJsonLexerKt.END_OBJ;
    }
}
