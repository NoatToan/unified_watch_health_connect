package com.xiaomi.smarthome.library.bluetooth.channel.packet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class ACKPacket extends Packet {
    public static final int BUSY = 2;
    public static final int CANCEL = 4;
    public static final int READY = 1;
    public static final int SUCCESS = 0;
    public static final int SYNC = 5;
    public static final int TIMEOUT = 3;
    private List<Short> lostSeqs;
    private int status;

    public ACKPacket(int i) {
        this.lostSeqs = Collections.emptyList();
        this.status = i;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public String getName() {
        return Packet.ACK;
    }

    public List<Short> getSeq() {
        return this.lostSeqs;
    }

    public int getStatus() {
        return this.status;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public byte[] toBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate((this.lostSeqs.size() * 2) + 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) this.status);
        if (this.lostSeqs.size() > 0) {
            Iterator<Short> it = this.lostSeqs.iterator();
            while (it.hasNext()) {
                byteBufferOrder.putShort(it.next().shortValue());
            }
        }
        return byteBufferOrder.array();
    }

    public String toString() {
        return "ACKPacket{status=" + this.status + ", seq=" + this.lostSeqs.toString() + AbstractJsonLexerKt.END_OBJ;
    }

    public ACKPacket(int i, List<Short> list) {
        this.lostSeqs = Collections.emptyList();
        this.status = i;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.lostSeqs = list;
    }
}
