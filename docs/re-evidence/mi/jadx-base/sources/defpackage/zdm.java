package defpackage;

import com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class zdm extends phh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f41161a;

    public zdm(byte b2) {
        this.f41161a = b2;
    }

    @Override // defpackage.phh
    public String c() {
        return Packet.SINGLE_ACK;
    }

    @Override // defpackage.phh
    public byte[] f() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 3);
        byteBufferOrder.put(this.f41161a);
        return byteBufferOrder.array();
    }

    public byte g() {
        return this.f41161a;
    }
}
