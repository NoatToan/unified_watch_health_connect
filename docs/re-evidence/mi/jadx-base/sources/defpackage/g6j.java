package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;

/* JADX INFO: loaded from: classes7.dex */
public class g6j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f18649b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e6j f18650a;

    static {
        byte[] bArr = new byte[1024];
        f18649b = bArr;
        Arrays.fill(bArr, (byte) 0);
    }

    public g6j(byte[] bArr) throws SecurityException {
        if (e(bArr)) {
            throw new SecurityException("rc4 key is null");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("rc4Key length is invalid");
        }
        this.f18650a = new e6j(bArr);
        b(f18649b);
    }

    public static boolean e(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public String a(String str) {
        try {
            return new String(b(q12.e(str)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new SecurityException(e);
        }
    }

    public byte[] b(byte[] bArr) throws SecurityException {
        try {
            if (bArr == null) {
                throw new IllegalBlockSizeException("no block data");
            }
            this.f18650a.a(bArr);
            return bArr;
        } catch (IllegalBlockSizeException e) {
            throw new SecurityException(e);
        }
    }

    public String c(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = null;
        }
        return String.valueOf(q12.i(d(bytes)));
    }

    public byte[] d(byte[] bArr) throws SecurityException {
        try {
            if (bArr == null) {
                throw new IllegalBlockSizeException("no block data");
            }
            this.f18650a.a(bArr);
            return bArr;
        } catch (IllegalBlockSizeException e) {
            throw new SecurityException(e);
        }
    }

    public g6j(String str) throws SecurityException {
        this(q12.e(str));
    }
}
