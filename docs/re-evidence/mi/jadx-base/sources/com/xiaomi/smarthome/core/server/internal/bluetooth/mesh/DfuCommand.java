package com.xiaomi.smarthome.core.server.internal.bluetooth.mesh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class DfuCommand {
    public static final int COMMAND_MCU_GET_LAST_FRAGMENT_SIZE = 5;
    public static final int COMMAND_MCU_SWITCH_NEW_FIRMWARE = 6;
    public static final int COMMAND_READ_FRAGMENT_SIZE = 2;
    public static final int COMMAND_READ_LAST_FRAGMENT_SIZE = 3;
    public static final int COMMAND_READ_PROTOCOL_VERSION = 1;
    public static final int COMMAND_SET_DELAY_TO_SWITCH_FIRMWARE = 4;
    public static final int MAX_VALUE_SIZE = 17;
    private int mCommand;
    private byte[] mParams;

    public DfuCommand(int i, byte[] bArr) throws Exception {
        if (bArr != null && bArr.length > 17) {
            throw new Exception("params exceed max size 17");
        }
        this.mCommand = i;
        this.mParams = bArr;
    }

    public byte[] toBytes() {
        byte[] bArr = this.mParams;
        int length = bArr != null ? bArr.length + 3 : 3;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) this.mCommand);
        byteBufferOrder.put((byte) (length - 3));
        byte[] bArr2 = this.mParams;
        if (bArr2 != null && bArr2.length > 0) {
            byteBufferOrder.put(bArr2);
        }
        return byteBufferOrder.array();
    }

    public String toString() {
        return "DfuCommand{Command=" + this.mCommand + AbstractJsonLexerKt.END_OBJ;
    }
}
