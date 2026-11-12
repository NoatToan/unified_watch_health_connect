package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;

/* JADX INFO: loaded from: classes7.dex */
public class f6j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f17461b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d6j f17462a;

    static {
        byte[] bArr = new byte[1024];
        f17461b = bArr;
        Arrays.fill(bArr, (byte) 0);
    }

    public f6j(byte[] bArr) throws SecurityException {
        if (e(bArr)) {
            throw new SecurityException("rc4 key is null");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("rc4Key length is invalid");
        }
        this.f17462a = new d6j(bArr);
        b(f17461b);
    }

    public static boolean e(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public String a(String str) {
        try {
            return new String(b(r12.e(str)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new SecurityException(e);
        }
    }

    public byte[] b(byte[] bArr) throws SecurityException {
        try {
            if (bArr == null) {
                throw new IllegalBlockSizeException("no block data");
            }
            this.f17462a.a(bArr);
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
        return String.valueOf(r12.i(d(bytes)));
    }

    public byte[] d(byte[] bArr) throws SecurityException {
        try {
            if (bArr == null) {
                throw new IllegalBlockSizeException("no block data");
            }
            this.f17462a.a(bArr);
            return bArr;
        } catch (IllegalBlockSizeException e) {
            throw new SecurityException(e);
        }
    }

    public f6j(String str) throws SecurityException {
        this(r12.e(str));
    }
}
