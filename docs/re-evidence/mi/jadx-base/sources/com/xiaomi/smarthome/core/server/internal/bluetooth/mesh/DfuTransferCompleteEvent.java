package com.xiaomi.smarthome.core.server.internal.bluetooth.mesh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public final class DfuTransferCompleteEvent extends AbsDfuEvent {
    private int mIndex;
    private int mStatus;

    public DfuTransferCompleteEvent(byte[] bArr) {
        super(bArr);
        this.mStatus = -1;
        this.mIndex = -1;
        initData();
    }

    private void initData() {
        byte[] bArr = this.mParams;
        if (bArr.length >= 3) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            this.mStatus = byteBufferOrder.get();
            this.mIndex = byteBufferOrder.getShort();
        }
    }

    public int getIndex() {
        return this.mIndex;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.AbsDfuEvent
    public int getStatus() {
        return this.mStatus;
    }

    public String toString() {
        return "DfuTransferCompleteEvent{Status=" + this.mStatus + "Index=" + this.mIndex + AbstractJsonLexerKt.END_OBJ;
    }
}
