package com.xiaomi.smarthome.framework.plugin.rn.utils;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ByteDataBufferCopy {
    final ArrayList<byte[]> dataList = new ArrayList<>();

    public void clear() {
        synchronized (this.dataList) {
            this.dataList.clear();
        }
    }

    public int length() {
        int size;
        synchronized (this.dataList) {
            size = this.dataList.size();
        }
        return size;
    }

    public void put(byte[] bArr) {
        synchronized (this.dataList) {
            this.dataList.add(bArr);
        }
    }

    public boolean take(byte[] bArr) {
        synchronized (this.dataList) {
            try {
                if (this.dataList.size() == 0) {
                    return false;
                }
                int i = 0;
                int length = 0;
                while (i < this.dataList.size() && (length = length + this.dataList.get(i).length) < bArr.length) {
                    i++;
                }
                if (length < bArr.length) {
                    return false;
                }
                int length2 = 0;
                while (i > 0) {
                    byte[] bArrRemove = this.dataList.remove(0);
                    System.arraycopy(bArrRemove, 0, bArr, length2, bArrRemove.length);
                    length2 += bArrRemove.length;
                    i--;
                }
                int length3 = bArr.length - length2;
                byte[] bArrRemove2 = this.dataList.remove(0);
                if (bArrRemove2.length > length3) {
                    System.arraycopy(bArrRemove2, 0, bArr, length2, length3);
                    int length4 = bArrRemove2.length - length3;
                    byte[] bArr2 = new byte[length4];
                    System.arraycopy(bArrRemove2, length3, bArr2, 0, length4);
                    this.dataList.add(0, bArr2);
                } else {
                    System.arraycopy(bArrRemove2, 0, bArr, length2, length3);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte[] takeAll() {
        synchronized (this.dataList) {
            try {
                if (this.dataList.size() == 0) {
                    return null;
                }
                if (this.dataList.size() == 1) {
                    return this.dataList.remove(0);
                }
                int length = 0;
                for (int i = 0; i < this.dataList.size(); i++) {
                    length += this.dataList.get(i).length;
                }
                byte[] bArr = new byte[length];
                int length2 = 0;
                for (int i2 = 0; i2 < this.dataList.size(); i2++) {
                    System.arraycopy(this.dataList.get(i2), 0, bArr, length2, this.dataList.get(i2).length);
                    length2 += this.dataList.get(i2).length;
                }
                this.dataList.clear();
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean take(ByteBuffer byteBuffer) {
        byteBuffer.clear();
        synchronized (this.dataList) {
            try {
                if (this.dataList.size() == 0) {
                    return false;
                }
                int i = 0;
                int length = 0;
                while (i < this.dataList.size() && (length = length + this.dataList.get(i).length) < byteBuffer.remaining()) {
                    i++;
                }
                if (length < byteBuffer.remaining()) {
                    return false;
                }
                while (i > 0) {
                    byteBuffer.put(this.dataList.remove(0));
                    i--;
                }
                int iRemaining = byteBuffer.remaining();
                byte[] bArrRemove = this.dataList.remove(0);
                byteBuffer.put(bArrRemove, 0, iRemaining);
                if (bArrRemove.length > iRemaining) {
                    int length2 = bArrRemove.length - iRemaining;
                    byte[] bArr = new byte[length2];
                    System.arraycopy(bArrRemove, iRemaining, bArr, 0, length2);
                    this.dataList.add(0, bArr);
                }
                byteBuffer.rewind();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
