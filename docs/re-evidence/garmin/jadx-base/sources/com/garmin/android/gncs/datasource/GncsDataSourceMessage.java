package com.garmin.android.gncs.datasource;

import bs2.q4;
import com.google.common.primitives.UnsignedBytes;
import dz2.c;
import java.util.Locale;
import ss2.n;

/* JADX INFO: loaded from: classes11.dex */
public class GncsDataSourceMessage {
    public static final int ANCS_PAYLOAD_OFFSET = 6;
    private static final int ANCS_PAYLOAD_SIZE_LENGTH = 2;
    public static final int ANCS_PAYLOAD_SIZE_OFFSET = 0;
    private static final int DATA_OFFSET_LENGTH = 2;
    public static final int DATA_OFFSET_OFFSET = 4;
    public static final int FIXED_MESSAGE_LENGTH = 6;
    private static final int FIXED_PAYLOAD_END = 6;
    public static final int MAX_ANCS_PAYLOAD_SIZE = 8192;
    private static final int MAX_GNCS_ENCRYPTION_OVERHEAD = 4;
    public static final int MESSAGE_ID = 5035;
    private static final int TRANSFERRED_DATA_CRC_LENGTH = 2;
    private static final int TRANSFERRED_DATA_CRC_OFFSET = 2;
    private final byte[] frame;
    private int messageLength;

    public GncsDataSourceMessage(int i14) {
        this.frame = new byte[i14];
        this.messageLength = i14;
    }

    private int getMaxAncsPayloadSizeInMessage(int i14) {
        return i14 - 10;
    }

    public static int getTwoByteValue(byte[] bArr, int i14) {
        return ((bArr[i14 + 1] << 8) & 65280) | (bArr[i14] & UnsignedBytes.MAX_VALUE);
    }

    private void setAncsPayload(byte[] bArr) {
        if (bArr == null) {
            this.messageLength = 6;
        } else {
            System.arraycopy(bArr, 0, this.frame, 6, bArr.length);
            this.messageLength = bArr.length + 6;
        }
    }

    private void setAncsPayloadSize(int i14) {
        setTwoByteValue(0, i14);
    }

    private void setDataOffset(int i14) {
        setTwoByteValue(4, i14);
    }

    private void setTransferredDataCrc(int i14) {
        setTwoByteValue(2, i14);
    }

    public byte[] getAncsPayload() {
        int i14 = this.messageLength - 6;
        byte[] bArr = new byte[i14];
        System.arraycopy(this.frame, 6, bArr, 0, i14);
        return bArr;
    }

    public int getAncsPayloadSize() {
        return getTwoByteValue(0);
    }

    public int getDataOffset() {
        return getTwoByteValue(4);
    }

    public int getTransferredDataCrc() {
        return getTwoByteValue(2);
    }

    public int populateDataAndCrc(byte[] bArr, int i14, int i15, byte[] bArr2, int i16) {
        int length;
        if (bArr == null || bArr.length <= 0 || bArr.length > 8192 || i14 < 0 || i14 >= bArr.length) {
            return -1;
        }
        int maxAncsPayloadSizeInMessage = getMaxAncsPayloadSizeInMessage(i16);
        if (i14 + maxAncsPayloadSizeInMessage >= bArr.length) {
            maxAncsPayloadSizeInMessage = bArr.length - i14;
        }
        setAncsPayloadSize(bArr.length);
        setDataOffset(i14);
        byte[] bArr3 = new byte[maxAncsPayloadSizeInMessage];
        System.arraycopy(bArr, i14, bArr3, 0, maxAncsPayloadSizeInMessage);
        if (bArr2 != null) {
            byte[] bArrC = n.c(maxAncsPayloadSizeInMessage, true, bArr3, bArr2);
            length = bArrC.length;
            setAncsPayload(bArrC);
        } else {
            setAncsPayload(bArr3);
            length = maxAncsPayloadSizeInMessage;
        }
        int i17 = length + 6;
        this.messageLength = i17;
        byte[] bArr4 = this.frame;
        int iA = (short) i15;
        for (int i18 = 6; i18 < i17; i18++) {
            iA = q4.a(bArr4[i18], iA);
        }
        setTransferredDataCrc((short) iA);
        return maxAncsPayloadSizeInMessage;
    }

    public void setTwoByteValue(int i14, int i15) {
        byte[] bArr = this.frame;
        bArr[i14] = (byte) i15;
        bArr[i14 + 1] = (byte) (i15 >> 8);
    }

    public byte[] toByteArray() {
        int i14 = this.messageLength;
        byte[] bArr = new byte[i14];
        System.arraycopy(this.frame, 0, bArr, 0, i14);
        return bArr;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "[gncs data source] msg id: %1$d, length: %2$d, ancs payload size: %3$d, transferred data crc: 0x%4$04x, data offset: %5$d, ancs payload: %6$s", Integer.valueOf(MESSAGE_ID), Integer.valueOf(this.messageLength), Integer.valueOf(getAncsPayloadSize()), Integer.valueOf(getTransferredDataCrc()), Integer.valueOf(getDataOffset()), c.a(getAncsPayload()));
    }

    public int getTwoByteValue(int i14) {
        return getTwoByteValue(this.frame, i14);
    }
}
