package com.huawei.watchface;

import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public abstract class u0 {
    public static byte[] a(String str, String str2, r0... r0VarArr) throws IOException {
        if (ArrayUtils.isEmpty(r0VarArr)) {
            HwLog.w("FileMergeUtil", "mergeFile file paths isEmpty");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((r0VarArr.length * 30) + 4);
        int length = r0VarArr.length;
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) length);
        byteBufferAllocate.putShort((short) 0);
        int length2 = r0VarArr.length;
        int length3 = 0;
        for (r0 r0Var : r0VarArr) {
            byteBufferAllocate.putInt((length2 * 30) + 5 + length3);
            byteBufferAllocate.putInt(r0Var.a().length);
            byteBufferAllocate.put(!r0Var.b().contains(WatchFaceConstant.BIN_SUFFIX) ? (byte) 1 : (byte) 0);
            byte[] bArrA = a(str, 11);
            byte[] bArrA2 = a(str2, 10);
            byteBufferAllocate.put(bArrA);
            byteBufferAllocate.put(bArrA2);
            length3 += r0Var.a().length;
        }
        byte[] bArrB = CommonUtils.b(byteBufferAllocate.array());
        if (ArrayUtils.a(bArrB)) {
            HwLog.w("FileMergeUtil", "mergeFile file hashArr isEmpty");
            return null;
        }
        byte b2 = bArrB[bArrB.length - 1];
        byteArrayOutputStream.write(byteBufferAllocate.array());
        byteArrayOutputStream.write(b2);
        for (r0 r0Var2 : r0VarArr) {
            byteArrayOutputStream.write(r0Var2.a());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] a(String str, int i) {
        byte[] bArr = new byte[i];
        int length = str.length();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 >= length) {
                bArr[i2] = 0;
            } else {
                bArr[i2] = (byte) str.charAt(i2);
            }
        }
        return bArr;
    }
}
