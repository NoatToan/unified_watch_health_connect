package com.airoha.android.lib.RaceCommand.packet;

import com.airoha.android.lib.util.Converter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class RacePacket {
    public static final int IDX_PAYLOAD_START = 6;
    private static final String j = "Airoha_RacePacket";
    public static boolean k = false;
    public byte START_CHANNEL_BYTE;
    private byte a;
    private int b;
    private byte[] c;
    private byte[] d;
    private int e;
    private byte[] f;
    private byte g;
    private volatile boolean h;
    private int i;
    public byte[] mClientAddr;
    public int mPktSeqNum;
    public byte mStatus;
    public byte[] mbAddr;

    public RacePacket(byte b, byte[] bArr, byte[] bArr2) {
        this.START_CHANNEL_BYTE = (byte) 5;
        this.c = new byte[2];
        this.d = new byte[2];
        this.g = (byte) 16;
        this.mbAddr = new byte[4];
        this.mClientAddr = new byte[4];
        this.mStatus = (byte) -1;
        this.mPktSeqNum = 0;
        this.a = b;
        this.d = bArr;
        this.e = (bArr[0] & 255) | ((bArr[1] & 255) << 8);
        setPayload(bArr2);
    }

    public static void setIsFotaStarted(boolean z) {
        k = z;
    }

    public byte[] getAddr() {
        return this.mbAddr;
    }

    public byte[] getClientAddr() {
        return this.mClientAddr;
    }

    public int getPktSeqNum() {
        return this.mPktSeqNum;
    }

    public int getRaceId() {
        return this.e;
    }

    public byte[] getRaw() {
        return getRaw((byte) 0);
    }

    public byte[] getRawFotaMode() {
        return k ? getRaw(this.g) : getRawMmiMode();
    }

    public byte[] getRawMmiMode() {
        return getRaw((byte) 0);
    }

    public void increaseRetryCounter() {
        this.i++;
    }

    public boolean isNeedResp() {
        return this.a == 90;
    }

    public synchronized boolean isRespStatusSuccess() {
        return this.h;
    }

    public boolean isRetryUpperLimit() {
        return this.i >= 3;
    }

    public void setAddr(byte[] bArr) {
        this.mbAddr = bArr;
    }

    public void setClientAddr(byte[] bArr) {
        this.mClientAddr = bArr;
    }

    public synchronized void setIsRespStatusSuccess() {
        this.h = true;
    }

    public void setPayload(byte[] bArr) {
        this.f = bArr;
        byte[] bArr2 = this.d;
        this.b = bArr2.length;
        if (bArr != null) {
            this.b = bArr2.length + bArr.length;
            this.f = bArr;
        }
        byte[] bArr3 = this.c;
        int i = this.b;
        bArr3[0] = (byte) (i & 255);
        bArr3[1] = (byte) ((i >> 8) & 255);
    }

    public void setPktSeqNum(int i) {
        this.mPktSeqNum = i;
    }

    public String toHexString() {
        return Converter.byte2HexStr(getRawFotaMode());
    }

    public byte[] getRaw(byte b) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Byte.valueOf((byte) (b | this.START_CHANNEL_BYTE)));
        arrayList.add(Byte.valueOf(this.a));
        arrayList.add(Byte.valueOf(this.c[0]));
        arrayList.add(Byte.valueOf(this.c[1]));
        arrayList.add(Byte.valueOf(this.d[0]));
        arrayList.add(Byte.valueOf(this.d[1]));
        byte[] bArr = this.f;
        if (bArr != null) {
            for (byte b2 : bArr) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        Byte[] bArr2 = (Byte[]) arrayList.toArray(new Byte[arrayList.size()]);
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = bArr2[i].byteValue();
        }
        return bArr3;
    }

    public RacePacket(byte b, int i, byte[] bArr) {
        this.START_CHANNEL_BYTE = (byte) 5;
        this.c = new byte[2];
        this.d = new byte[2];
        this.g = (byte) 16;
        this.mbAddr = new byte[4];
        this.mClientAddr = new byte[4];
        this.mStatus = (byte) -1;
        this.mPktSeqNum = 0;
        this.a = b;
        this.e = i;
        this.d = new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)};
        setPayload(bArr);
    }

    public RacePacket(byte b, byte b2, int i) {
        this(b2, i, (byte[]) null);
        this.g = b;
    }

    public RacePacket(byte b, int i) {
        this(b, i, (byte[]) null);
    }

    public RacePacket(byte[] bArr) {
        this.START_CHANNEL_BYTE = (byte) 5;
        this.c = new byte[2];
        this.d = new byte[2];
        this.g = (byte) 16;
        byte[] bArr2 = new byte[4];
        this.mbAddr = bArr2;
        this.mClientAddr = new byte[4];
        this.mStatus = (byte) -1;
        this.mPktSeqNum = 0;
        System.arraycopy(bArr, 7, bArr2, 0, bArr2.length);
        this.mStatus = bArr[6];
    }
}
