package com.huawei.secure.android.common.encrypt.rootkey;

import com.huawei.secure.android.common.encrypt.exception.RootKeyGenException;
import com.huawei.secure.android.common.encrypt.exception.RootKeyParamException;
import com.huawei.secure.android.common.encrypt.hash.PBKDF2;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.b;

/* JADX INFO: loaded from: classes42.dex */
public class RootKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22812a = "RootKey";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22813b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22814c = 16;
    private static final int d = 32;

    private static int a(int i, int i2, int i3) {
        if (i2 < i) {
            i = i2;
        }
        return i3 < i ? i3 : i;
    }

    private static boolean a(int i) {
        return i >= 16;
    }

    private static boolean b(int i) {
        return i >= 16;
    }

    public static byte[] exportRootKey(RootKeyConfig rootKeyConfig) throws RootKeyGenException, RootKeyParamException {
        byte[] bArrPbkdfBottom;
        a(rootKeyConfig);
        byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(rootKeyConfig.getFirst());
        byte[] bArrHexStr2ByteArray2 = HexUtil.hexStr2ByteArray(rootKeyConfig.getSecond());
        byte[] bArrHexStr2ByteArray3 = HexUtil.hexStr2ByteArray(rootKeyConfig.getThird());
        int iA = a(bArrHexStr2ByteArray.length, bArrHexStr2ByteArray2.length, bArrHexStr2ByteArray3.length);
        if (!a(iA, rootKeyConfig.getSalt())) {
            throw new RootKeyParamException("key length must be more than 128bit.");
        }
        char[] cArr = new char[iA];
        for (int i = 0; i < iA; i++) {
            cArr[i] = (char) ((bArrHexStr2ByteArray[i] ^ bArrHexStr2ByteArray2[i]) ^ bArrHexStr2ByteArray3[i]);
        }
        if (rootKeyConfig.isSha256()) {
            b.c(f22812a, "exportRootKey: sha256");
            bArrPbkdfBottom = PBKDF2.pbkdfBottom(cArr, rootKeyConfig.getSalt(), rootKeyConfig.getIteration(), rootKeyConfig.getExportLen() * 8, true);
        } else {
            b.c(f22812a, "exportRootKey: sha1");
            bArrPbkdfBottom = PBKDF2.pbkdfBottom(cArr, rootKeyConfig.getSalt(), rootKeyConfig.getIteration(), rootKeyConfig.getExportLen() * 8, false);
        }
        if (bArrPbkdfBottom == null || bArrPbkdfBottom.length == 0) {
            throw new RootKeyGenException("Failed to generate the rootkey.");
        }
        return bArrPbkdfBottom;
    }

    private static void a(RootKeyConfig rootKeyConfig) throws RootKeyParamException {
        if (rootKeyConfig != null) {
            if (a(rootKeyConfig.getExportLen())) {
                if (rootKeyConfig.getExportLen() < 32) {
                    b.e(f22812a, "It is recommended that the exported length be greater than or equal to 256 bits.");
                }
                if (a(rootKeyConfig.getExportLen(), rootKeyConfig.getFirst())) {
                    if (a(rootKeyConfig.getExportLen(), rootKeyConfig.getSecond())) {
                        if (a(rootKeyConfig.getExportLen(), rootKeyConfig.getThird())) {
                            return;
                        }
                        b.b(f22812a, "material(third) length must be Greater than or equal to export length.");
                        throw new RootKeyParamException("material(third) length must be Greater than or equal to export length.");
                    }
                    b.b(f22812a, "material(second) length must be Greater than or equal to export length.");
                    throw new RootKeyParamException("material(second) length must be Greater than or equal to export length.");
                }
                b.b(f22812a, "material(first) length must be Greater than or equal to export length.");
                throw new RootKeyParamException("material(first) length must be Greater than or equal to export length.");
            }
            b.b(f22812a, "exportLen length must be more than 128bit.");
            throw new RootKeyParamException("exportLen length must be more than 128bit.");
        }
        b.b(f22812a, "rootKeyConfig is null.");
        throw new RootKeyParamException("rootKeyConfig is null.");
    }

    private static boolean a(int i, byte[] bArr) {
        return b(i) & a(bArr);
    }

    private static boolean a(byte[] bArr) {
        return bArr != null && bArr.length >= 16;
    }

    private static boolean a(int i, String str) {
        return str != null && str.length() >= i;
    }
}
