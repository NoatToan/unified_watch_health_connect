package com.huami.watch.companion.components.bluetoothproxyserver.utils;

import com.huami.watch.companion.components.bluetoothproxyserver.session.TransferWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public class HttpData {
    public static final int HTTP_DATA_HEAD_LEN = 15;
    private static final String f = "HttpData";
    private static final int g = 2;
    private static final int h = 8;
    private static final int i = 1;
    private static final int j = 4;
    private short a;
    private long b;
    private byte c;
    private int d;
    private byte[] e;

    public HttpData(short s, long j2, byte b, int i2, byte[] bArr) {
        this.a = (short) -1;
        this.b = -1L;
        this.c = (byte) -1;
        this.d = -1;
        this.e = null;
        this.a = s;
        this.b = j2;
        this.c = b;
        this.d = i2;
        this.e = bArr;
    }

    private byte[] a() {
        byte[] bArr = new byte[15];
        parseIntToBytes(this.a, bArr, 0, 2);
        parseIntToBytes(this.b, bArr, 2, 8);
        parseIntToBytes(this.c, bArr, 10, 1);
        parseIntToBytes(this.d, bArr, 11, 4);
        return bArr;
    }

    public static int byteArrayToInt(byte[] bArr) {
        return ((bArr[0] & 255) << 24) | (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16);
    }

    public static short byteArrayToShort(byte[] bArr) {
        return (short) (((bArr[0] & 255) << 8) | (bArr[1] & 255));
    }

    public static long bytesToLong(byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(bArr, 0, bArr.length);
        byteBufferAllocate.flip();
        long j2 = byteBufferAllocate.getLong();
        byteBufferAllocate.clear();
        return j2;
    }

    public static byte[] getBytesFromBTSocket(int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i2 - i3;
            byte[] bArr2 = new byte[i4];
            ProxyLog.D(f, "等待手表端发来的数据..... ");
            int iReceiveData = TransferWrapper.getInstance().receiveData(bArr2);
            ProxyLog.D(f, "len = " + iReceiveData + "   surplus_size = " + i4);
            if (iReceiveData == -1) {
                if (i4 != 10240) {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr3, 0, i3);
                    bArr = bArr3;
                    break;
                }
                ProxyLog.E(f, "InputStream end");
                return null;
            }
            System.arraycopy(bArr2, 0, bArr, i3, iReceiveData);
            i3 += iReceiveData;
        }
        ProxyLog.D(f, "return  rv_data " + bArr.length);
        return bArr;
    }

    public static byte[] getBytesFromTCPSocket(InputStream inputStream) throws IOException {
        ProxyLog.D(f, " getBytesFromSocket  start read");
        int i2 = inputStream.read();
        ProxyLog.D(f, " getBytesFromSocket   read  firstChar = " + i2);
        if (i2 == -1) {
            ProxyLog.E(f, "getBytesFromSocket  inputStream is end");
            return null;
        }
        int iAvailable = inputStream.available();
        if (iAvailable > 10240) {
            iAvailable = 10240;
        }
        int i3 = iAvailable + 1;
        byte[] bArr = new byte[i3];
        bArr[0] = (byte) i2;
        inputStream.read(bArr, 1, iAvailable);
        ProxyLog.D(f, " getBytesFromSocket  return array.length = " + i3);
        return bArr;
    }

    public static byte getGroup(byte[] bArr) {
        return bArr[10];
    }

    public static long getId(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 2, bArr2, 0, 8);
        ProxyLog.D("lidg", "dest.length>>>>8");
        return bytesToLong(bArr2);
    }

    public static short getType(byte[] bArr) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        return byteArrayToShort(bArr2);
    }

    public static int getlength(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 11, bArr2, 0, 4);
        return byteArrayToInt(bArr2);
    }

    public static byte[] longToBytes(long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(0, j2);
        byte[] bArrArray = byteBufferAllocate.array();
        byteBufferAllocate.clear();
        return bArrArray;
    }

    public static final void parseIntToBytes(long j2, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[((i2 + i3) - i4) - 1] = (byte) ((j2 >> (i4 * 8)) & 255);
        }
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[this.e.length + 15];
        byte[] bArrA = a();
        System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
        byte[] bArr2 = this.e;
        if (bArr2.length > 0) {
            System.arraycopy(bArr2, 0, bArr, bArrA.length, bArr2.length);
        }
        return bArr;
    }

    public byte[] getData() {
        return this.e;
    }

    public int getLength() {
        return this.d;
    }

    public byte getGroup() {
        return this.c;
    }

    public short getType() {
        return this.a;
    }

    public long getId() {
        return this.b;
    }
}
