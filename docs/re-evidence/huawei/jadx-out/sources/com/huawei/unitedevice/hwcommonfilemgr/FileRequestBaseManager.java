package com.huawei.unitedevice.hwcommonfilemgr;

import android.content.Context;
import android.text.TextUtils;
import defpackage.cph;
import defpackage.cpl;
import defpackage.xhr;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class FileRequestBaseManager {
    public FileRequestBaseManager(Context context) {
    }

    protected byte[] d(String str, int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder(16);
        if (!TextUtils.isEmpty(str)) {
            String strB = cph.b(str);
            sb.append(cph.b(1) + cph.b(strB.length() / 2) + strB);
        } else {
            LogUtil.b("Unite_FileRequestBaseManager", "5.44.1 file name is empty.");
        }
        sb.append(cph.b(2) + cph.b(1) + cph.b(i));
        if (i2 != -1 && i3 != -1) {
            sb.append(cph.b(5));
            sb.append(cph.b(4));
            sb.append(cph.b(i2));
            sb.append(cph.b(6));
            sb.append(cph.b(4));
            sb.append(cph.b(i3));
        } else {
            LogUtil.e("Unite_FileRequestBaseManager", "5.44.1 startTime or endTime is -1, startTime: ", Integer.valueOf(i2), ", end time: ", Integer.valueOf(i3));
        }
        if (i4 > 0 && i == 22) {
            LogUtil.b("Unite_FileRequestBaseManager", "5.44.1 dictTypeId : ", Integer.valueOf(i4));
            String strB2 = cph.b(i4);
            sb.append(cph.b(12) + cph.c(strB2.length() / 2) + strB2);
        }
        return cph.d(sb.toString());
    }

    protected byte[] a(xhr xhrVar) {
        StringBuilder sb = new StringBuilder(16);
        if (!TextUtils.isEmpty(xhrVar.n())) {
            String strB = cph.b(xhrVar.n());
            sb.append(cph.b(1) + cph.b(strB.length() / 2) + strB);
        } else {
            LogUtil.b("Unite_FileRequestBaseManager", "5.44.1 file name is empty.");
        }
        sb.append(cph.b(2) + cph.b(1) + cph.b(xhrVar.y()));
        if (xhrVar.aj() != -1 && xhrVar.k() != -1) {
            sb.append(cph.b(5));
            sb.append(cph.b(4));
            sb.append(cph.b(xhrVar.aj()));
            sb.append(cph.b(6));
            sb.append(cph.b(4));
            sb.append(cph.b(xhrVar.k()));
        } else {
            LogUtil.e("Unite_FileRequestBaseManager", "5.44.1 startTime or endTime is -1, startTime: ", Integer.valueOf(xhrVar.aj()), ", end time: ", Integer.valueOf(xhrVar.k()));
        }
        if (!TextUtils.isEmpty(xhrVar.ag()) && !TextUtils.isEmpty(xhrVar.i()) && !TextUtils.isEmpty(xhrVar.ai()) && !TextUtils.isEmpty(xhrVar.g())) {
            String strB2 = cph.b(xhrVar.j());
            String str = cph.b(11) + cph.b(strB2.length() / 2) + strB2;
            String strB3 = cph.b(xhrVar.ag());
            String str2 = cph.b(7) + cph.b(strB3.length() / 2) + strB3;
            String strB4 = cph.b(xhrVar.i());
            String str3 = cph.b(8) + cph.b(strB4.length() / 2) + strB4;
            String strB5 = cph.b(xhrVar.ai());
            String str4 = cph.b(10) + cph.b(strB5.length() / 2) + strB5;
            String strB6 = cph.b(xhrVar.g());
            String str5 = cph.b(11) + cph.b(strB6.length() / 2) + strB6;
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            sb.append(str4);
            sb.append(str5);
        } else {
            LogUtil.b("Unite_FileRequestBaseManager", "5.44.1 lack source or destination package info.");
        }
        return cph.d(sb.toString());
    }

    protected byte[] d(int i, int i2) {
        byte[] bArrB = b(i);
        byte[] bArrF = f(i2);
        byte[] bArr = new byte[bArrB.length + bArrF.length];
        System.arraycopy(bArrB, 0, bArr, 0, bArrB.length);
        System.arraycopy(bArrF, 0, bArr, bArrB.length, bArrF.length);
        return bArr;
    }

    private byte[] b(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 1;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    private byte[] f(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 2;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    protected byte[] a(int i) {
        byte[] bArrJ = j(i);
        byte[] bArrE = e(2, (byte) 0);
        byte[] bArrE2 = e(3, (byte) 0);
        byte[] bArrE3 = e(3, (byte) 0);
        byte[] bArrE4 = e(5, (byte) 0);
        byte[] bArr = new byte[bArrJ.length + bArrE.length + bArrE2.length + bArrE3.length + bArrE4.length];
        System.arraycopy(bArrJ, 0, bArr, 0, bArrJ.length);
        System.arraycopy(bArrE, 0, bArr, bArrJ.length, bArrE.length);
        System.arraycopy(bArrE2, 0, bArr, bArrJ.length + bArrE.length, bArrE2.length);
        System.arraycopy(bArrE3, 0, bArr, bArrJ.length + bArrE.length + bArrE2.length, bArrE3.length);
        System.arraycopy(bArrE4, 0, bArr, bArrJ.length + bArrE.length + bArrE2.length + bArrE3.length, bArrE4.length);
        cpl.d("Unite_FileRequestBaseManager", bArr, "sendRequestParameter, deviceCommand:");
        return bArr;
    }

    private static byte[] j(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 1;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    private static byte[] e(int i, byte b2) {
        return new byte[]{(byte) i, b2};
    }

    protected byte[] a(int i, long j, long j2, int i2, int i3) {
        byte[] bArrI = i(i);
        byte[] bArrC = c(j);
        byte[] bArrD = d(j2);
        LogUtil.b("Unite_FileRequestBaseManager", "dictTypeId ：", Integer.valueOf(i3), "fileType: ", Integer.valueOf(i2));
        byte[] bArrG = (i3 <= 0 || i2 != 22) ? null : g(i3);
        if (bArrG != null) {
            byte[] bArr = new byte[bArrI.length + bArrC.length + bArrD.length + bArrG.length];
            System.arraycopy(bArrI, 0, bArr, 0, bArrI.length);
            System.arraycopy(bArrC, 0, bArr, bArrI.length, bArrC.length);
            System.arraycopy(bArrD, 0, bArr, bArrI.length + bArrC.length, bArrD.length);
            System.arraycopy(bArrG, 0, bArr, bArrI.length + bArrC.length + bArrD.length, bArrG.length);
            return bArr;
        }
        byte[] bArr2 = new byte[bArrI.length + bArrC.length + bArrD.length];
        System.arraycopy(bArrI, 0, bArr2, 0, bArrI.length);
        System.arraycopy(bArrC, 0, bArr2, bArrI.length, bArrC.length);
        System.arraycopy(bArrD, 0, bArr2, bArrI.length + bArrC.length, bArrD.length);
        return bArr2;
    }

    private static byte[] i(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 1;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    private static byte[] c(long j) {
        byte[] bArrE = cph.e(j);
        byte[] bArr = new byte[bArrE.length + 2];
        bArr[0] = 2;
        bArr[1] = 4;
        System.arraycopy(bArrE, 0, bArr, 2, bArrE.length);
        return bArr;
    }

    private static byte[] d(long j) {
        byte[] bArrG = cph.g((int) j);
        byte[] bArr = new byte[bArrG.length + 2];
        bArr[0] = 3;
        bArr[1] = 4;
        System.arraycopy(bArrG, 0, bArr, 2, bArrG.length);
        return bArr;
    }

    private static byte[] g(int i) {
        byte[] bArrG = cph.g(i);
        byte[] bArrE = cph.e(bArrG.length);
        byte[] bArr = new byte[bArrG.length + 1 + bArrE.length];
        bArr[0] = 4;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrG, 0, bArr, bArrE.length + 1, bArrG.length);
        return bArr;
    }

    protected byte[] b(int i, int i2) {
        byte[] bArrH = h(i);
        byte[] bArrL = l(i2);
        byte[] bArr = new byte[bArrH.length + bArrL.length];
        System.arraycopy(bArrH, 0, bArr, 0, bArrH.length);
        System.arraycopy(bArrL, 0, bArr, bArrH.length, bArrL.length);
        return bArr;
    }

    private static byte[] h(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 1;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    private static byte[] l(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 2;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    protected byte[] d(xhr xhrVar, int i) {
        byte[] bArrE = e(xhrVar.n());
        byte[] bArrE2 = e(xhrVar.y());
        byte[] bArrD = d(xhrVar.m());
        byte[] bArrB = b(xhrVar.u());
        byte[] bArrA = a(xhrVar.ag());
        byte[] bArrC = c(xhrVar.i());
        byte[] bArrD2 = d(xhrVar.ai());
        byte[] bArrB2 = b(xhrVar.g());
        byte[] bArrC2 = c(i);
        byte[] bArr = new byte[bArrE.length + bArrE2.length + bArrD.length + bArrB.length + bArrA.length + bArrC.length + bArrD2.length + bArrB2.length + bArrC2.length];
        System.arraycopy(bArrE, 0, bArr, 0, bArrE.length);
        System.arraycopy(bArrE2, 0, bArr, bArrE.length, bArrE2.length);
        System.arraycopy(bArrD, 0, bArr, bArrE.length + bArrE2.length, bArrD.length);
        System.arraycopy(bArrB, 0, bArr, bArrE.length + bArrE2.length + bArrD.length, bArrB.length);
        System.arraycopy(bArrA, 0, bArr, bArrE.length + bArrE2.length + bArrD.length + bArrB.length, bArrA.length);
        System.arraycopy(bArrC, 0, bArr, bArrE.length + bArrE2.length + bArrD.length + bArrB.length + bArrA.length, bArrC.length);
        System.arraycopy(bArrD2, 0, bArr, bArrE.length + bArrE2.length + bArrD.length + bArrB.length + bArrA.length + bArrC.length, bArrD2.length);
        System.arraycopy(bArrB2, 0, bArr, bArrE.length + bArrE2.length + bArrD.length + bArrB.length + bArrA.length + bArrC.length + bArrD2.length, bArrB2.length);
        System.arraycopy(bArrC2, 0, bArr, bArrE.length + bArrE2.length + bArrD.length + bArrB.length + bArrA.length + bArrC.length + bArrD2.length + bArrB2.length, bArrC2.length);
        return bArr;
    }

    private static byte[] e(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 1;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] e(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 2;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    private static byte[] d(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 3;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    private static byte[] b(long j) {
        byte[] bArrG = cph.g((int) j);
        byte[] bArr = new byte[bArrG.length + 2];
        bArr[0] = 4;
        bArr[1] = 4;
        System.arraycopy(bArrG, 0, bArr, 2, bArrG.length);
        return bArr;
    }

    private static byte[] a(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 8;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] c(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 9;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] d(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 10;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] b(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 11;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] c(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 13;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }
}
