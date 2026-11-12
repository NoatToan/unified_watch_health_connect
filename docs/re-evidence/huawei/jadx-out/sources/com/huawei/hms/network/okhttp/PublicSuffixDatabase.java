package com.huawei.hms.network.okhttp;

import com.huawei.hms.network.embedded.db;
import com.huawei.hms.network.embedded.kb;
import com.huawei.hms.network.embedded.ma;
import com.huawei.hms.network.embedded.ob;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes34.dex */
public final class PublicSuffixDatabase {
    public static final String e = "publicsuffixes.gz";
    public static final byte i = 33;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f15797a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f15798b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f15799c;
    public byte[] d;
    public static final byte[] f = {42};
    public static final String[] g = new String[0];
    public static final String[] h = {"*"};
    public static final PublicSuffixDatabase j = new PublicSuffixDatabase();

    public void a(byte[] bArr, byte[] bArr2) {
        this.f15799c = bArr;
        this.d = bArr2;
        this.f15797a.set(true);
        this.f15798b.countDown();
    }

    public String a(String str) {
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrA = a(strArrSplit);
        if (strArrSplit.length == strArrA.length && strArrA[0].charAt(0) != '!') {
            return null;
        }
        char cCharAt = strArrA[0].charAt(0);
        int length = strArrSplit.length;
        int length2 = strArrA.length;
        if (cCharAt != '!') {
            length2++;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit2 = str.split("\\.");
        for (int i2 = length - length2; i2 < strArrSplit2.length; i2++) {
            sb.append(strArrSplit2[i2]);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private void c() {
        boolean z = false;
        while (true) {
            try {
                try {
                    b();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    ma.f().a(5, "Failed to read public suffix list", e2);
                    if (!z) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        db dbVarA = ob.a(new kb(ob.a(resourceAsStream)));
        try {
            byte[] bArr = new byte[dbVarA.readInt()];
            dbVarA.readFully(bArr);
            byte[] bArr2 = new byte[dbVarA.readInt()];
            dbVarA.readFully(bArr2);
            if (dbVarA != null) {
                dbVarA.close();
            }
            synchronized (this) {
                this.f15799c = bArr;
                this.d = bArr2;
            }
            this.f15798b.countDown();
        } catch (Throwable th) {
            if (dbVarA != null) {
                try {
                    dbVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private String[] a(String[] strArr) {
        String str;
        String strA;
        String strA2;
        if (this.f15797a.get() || !this.f15797a.compareAndSet(false, true)) {
            try {
                this.f15798b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            c();
        }
        synchronized (this) {
            if (this.f15799c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                strA = null;
                break;
            }
            strA = a(this.f15799c, bArr, i3);
            if (strA != null) {
                break;
            }
            i3++;
        }
        if (length <= 1) {
            strA2 = null;
            break;
        }
        byte[][] bArr2 = (byte[][]) bArr.clone();
        int i4 = 0;
        while (true) {
            if (i4 >= bArr2.length - 1) {
                strA2 = null;
                break;
            }
            bArr2[i4] = f;
            strA2 = a(this.f15799c, bArr2, i4);
            if (strA2 != null) {
                break;
            }
            i4++;
        }
        if (strA2 != null) {
            for (int i5 = 0; i5 < length - 1; i5++) {
                String strA3 = a(this.d, bArr, i5);
                if (strA3 != null) {
                    str = strA3;
                    break;
                }
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (strA == null && strA2 == null) {
            return h;
        }
        String[] strArrSplit = strA != null ? strA.split("\\.") : g;
        String[] strArrSplit2 = strA2 != null ? strA2.split("\\.") : g;
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }

    public static String a(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > -1 && bArr[i7] != 10) {
                i7--;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i3 = i8 + i9;
                if (bArr[i3] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i3 - i8;
            int i11 = i2;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i4 = 46;
                    z = false;
                } else {
                    z = z2;
                    i4 = bArr2[i11][i12] & 255;
                }
                i5 = i4 - (bArr[i8 + i13] & 255);
                if (i5 == 0) {
                    i13++;
                    i12++;
                    if (i13 == i10) {
                        break;
                    }
                    if (bArr2[i11].length != i12) {
                        z2 = z;
                    } else {
                        if (i11 == bArr2.length - 1) {
                            break;
                        }
                        i11++;
                        i12 = -1;
                        z2 = true;
                    }
                } else {
                    break;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i14 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    while (true) {
                        i11++;
                        if (i11 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i11].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr, i8, i10, StandardCharsets.UTF_8);
                        }
                    }
                }
                i6 = i3 + 1;
            }
            length = i7;
        }
        return null;
    }

    public static PublicSuffixDatabase a() {
        return j;
    }
}
