package com.xiaomi.smarthome.library.crypto.rc4coder;

import com.xiaomi.smarthome.library.crypto.Base64Coder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;
import okio.Buffer;
import okio.GzipSource;
import okio.Okio;

/* JADX INFO: loaded from: classes2.dex */
public class RC4DropCoder {
    private static final int DropLength = 1024;
    private static final byte[] dropBytes;
    RC4 rc4instance;

    static {
        byte[] bArr = new byte[1024];
        dropBytes = bArr;
        Arrays.fill(bArr, (byte) 0);
    }

    public RC4DropCoder(byte[] bArr) throws SecurityException {
        if (isEmpty(bArr)) {
            throw new SecurityException("rc4 key is null");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("rc4Key length is invalid");
        }
        this.rc4instance = new RC4(bArr);
        decrypt(dropBytes);
    }

    private static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public byte[] decrypt(byte[] bArr) throws SecurityException {
        try {
            if (bArr == null) {
                throw new IllegalBlockSizeException("no block data");
            }
            this.rc4instance.encrypt(bArr);
            return bArr;
        } catch (IllegalBlockSizeException e) {
            throw new SecurityException(e);
        }
    }

    public byte[] encrypt(byte[] bArr) throws SecurityException {
        try {
            if (bArr == null) {
                throw new IllegalBlockSizeException("no block data");
            }
            this.rc4instance.encrypt(bArr);
            return bArr;
        } catch (IllegalBlockSizeException e) {
            throw new SecurityException(e);
        }
    }

    public String decrypt(String str) {
        return decrypt(false, str);
    }

    public String encrypt(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = null;
        }
        return String.valueOf(Base64Coder.encode(encrypt(bytes)));
    }

    public String decrypt(boolean z, String str) {
        try {
            byte[] bArrDecrypt = decrypt(Base64Coder.decode(str));
            if (z) {
                return Okio.buffer(new GzipSource(new Buffer().write(bArrDecrypt))).readString(StandardCharsets.UTF_8);
            }
            return new String(bArrDecrypt, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new SecurityException(e);
        }
    }

    public RC4DropCoder(String str) throws SecurityException {
        this(Base64Coder.decode(str));
    }
}
