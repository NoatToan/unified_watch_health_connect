package defpackage;

import com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class q extends phh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f30944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Short> f30945b;

    public q(byte b2) {
        this(b2, null);
    }

    @Override // defpackage.phh
    public String c() {
        return Packet.ACK;
    }

    @Override // defpackage.phh
    public byte[] f() {
        int size = this.f30945b.size();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate((size * 2) + 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put(this.f30944a);
        if (size > 0) {
            Iterator<Short> it = this.f30945b.iterator();
            while (it.hasNext()) {
                byteBufferOrder.putShort(it.next().shortValue());
            }
        }
        return byteBufferOrder.array();
    }

    public List<Short> g() {
        return this.f30945b;
    }

    public byte h() {
        return this.f30944a;
    }

    public String toString() {
        return "ACKPacket{status=" + ((int) this.f30944a) + ", sequences=" + this.f30945b.toString() + AbstractJsonLexerKt.END_OBJ;
    }

    public q(byte b2, List<Short> list) {
        this.f30944a = b2;
        if (list != null) {
            this.f30945b = list;
        } else {
            this.f30945b = Collections.emptyList();
        }
    }
}
