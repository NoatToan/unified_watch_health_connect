package com.huawei.hms.network.file.a.k.b.j;

import com.huawei.hms.network.embedded.y1;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.secure.android.common.encrypt.aes.AesGcm;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class b {
    public static byte[] b(byte[] bArr) throws a {
        byte[] bArrEncrypt = AesGcm.encrypt(bArr, com.huawei.hms.network.file.a.k.b.j.a.a(true));
        if (bArrEncrypt == null || bArrEncrypt.length == 0) {
            throw new a("Encrypt body failed");
        }
        return bArrEncrypt;
    }

    public static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.file.a.k.b.j.b$b, reason: collision with other inner class name */
    public static class C0166b extends IOException {
        public C0166b(String str) {
            super(str);
        }
    }

    public static byte[] a(byte[] bArr) throws a {
        if (bArr == null || bArr.length == 0) {
            throw new a("Decrypt body is empty");
        }
        try {
            byte[] bArrDecrypt = AesGcm.decrypt(bArr, com.huawei.hms.network.file.a.k.b.j.a.a(false));
            if (bArrDecrypt == null || bArrDecrypt.length == 0) {
                throw new a("Decrypt body failed");
            }
            return bArrDecrypt;
        } catch (IndexOutOfBoundsException unused) {
            throw new a("The cached file is tampered, throw a indexOutOfBoundsException");
        }
    }

    public static void a() {
        try {
            a(b("encodeString".getBytes("UTF-8")));
        } catch (IOException e) {
            FLogger.w(y1.f15624a, "initAesGcm fail", e);
        }
    }
}
