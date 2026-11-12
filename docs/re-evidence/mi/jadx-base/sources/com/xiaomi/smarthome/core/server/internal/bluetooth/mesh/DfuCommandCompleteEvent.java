package com.xiaomi.smarthome.core.server.internal.bluetooth.mesh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public final class DfuCommandCompleteEvent extends AbsDfuEvent {
    private int mCommandOpcode;
    private int mStatus;
    private byte[] mValue;

    public DfuCommandCompleteEvent(byte[] bArr) {
        super(bArr);
        this.mCommandOpcode = -1;
        this.mStatus = -1;
        this.mValue = new byte[0];
        initData();
    }

    private void initData() {
        byte[] bArr = this.mParams;
        if (bArr.length >= 2) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            this.mCommandOpcode = byteBufferOrder.getShort();
            if (byteBufferOrder.remaining() > 0) {
                this.mStatus = byteBufferOrder.get();
                byte[] bArr2 = new byte[byteBufferOrder.remaining()];
                this.mValue = bArr2;
                if (bArr2.length > 0) {
                    byteBufferOrder.get(bArr2);
                }
            }
        }
    }

    public int getCommandOpcode() {
        return this.mCommandOpcode;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.AbsDfuEvent
    public int getStatus() {
        return this.mStatus;
    }

    public byte[] getValue() {
        return this.mValue;
    }

    public String toString() {
        return "DfuCommandCompleteEvent{Command Opcode=" + this.mCommandOpcode + "Status=" + this.mStatus + AbstractJsonLexerKt.END_OBJ;
    }
}
