package com.xiaomi.hm.health.bt.classic;

import androidx.annotation.NonNull;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes19.dex */
public class ClassicCommand {
    private static AtomicInteger h = new AtomicInteger(0);
    private Protocol b;
    private RequestType c;
    private int d;
    private byte[] e;
    private byte[] g;
    private final byte a = RaceType.CMD_NEED_RESP;
    private long f = 0;

    public ClassicCommand(Protocol protocol, byte[] data, RequestType type) {
        this.b = protocol;
        if (h.get() < Integer.MAX_VALUE) {
            h.incrementAndGet();
        } else {
            h.set(0);
        }
        this.d = data != null ? data.length : 0;
        this.e = data;
        this.c = type;
        this.g = a();
    }

    private byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(90);
        byteArrayOutputStream.write(this.b.getValue());
        RequestType requestType = this.c;
        if (requestType != null) {
            byteArrayOutputStream.write(requestType.getValue());
        }
        byte[] bArrIntToBytes = GattUtils.intToBytes(h.get());
        byteArrayOutputStream.write(bArrIntToBytes, 0, bArrIntToBytes.length);
        byte[] bArrShortToBytes = GattUtils.shortToBytes((short) this.d);
        byteArrayOutputStream.write(bArrShortToBytes, 0, bArrShortToBytes.length);
        int i = this.d;
        if (i > 0) {
            byteArrayOutputStream.write(this.e, 0, i);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 0, byteArray.length);
        long value = crc32.getValue();
        this.f = value;
        byte[] bArrIntToBytes2 = GattUtils.intToBytes((int) value);
        byteArrayOutputStream.write(bArrIntToBytes2, 0, bArrIntToBytes2.length);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] getBytes() {
        return this.g;
    }

    public byte[] getData() {
        return this.e;
    }

    public int getFlag() {
        return h.get();
    }

    public Protocol getProtocol() {
        return this.b;
    }

    @NonNull
    public String toString() {
        return "ClassicCommand{PREAMBLE=90, protocol=" + this.b + ", type=" + this.c + ", dataLen=" + this.d + ", data=" + GattUtils.bytesToHexString(this.e) + ", crc32=" + this.f + ", bytesOfCommand=" + GattUtils.bytesToHexString(this.g) + '}';
    }
}
