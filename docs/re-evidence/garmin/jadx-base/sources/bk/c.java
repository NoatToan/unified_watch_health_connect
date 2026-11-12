package bk;

import ch.qos.logback.classic.spi.CallerData;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f18404c = l.ANT_VERSION;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18405b;

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        BAD_FORMAT,
        /* JADX INFO: Fake field, exist only in values array */
        VERSION,
        /* JADX INFO: Fake field, exist only in values array */
        VERSION_MODULE
    }

    public c(String str) {
        super(str.getBytes());
        a[] aVarArr = a.f18406a;
        this.f18405b = j();
        k();
    }

    @Override // bk.b
    public final l h() {
        return f18404c;
    }

    public final String j() {
        byte[] bArr;
        int i14 = 0;
        while (true) {
            bArr = this.f18402a;
            if (i14 >= bArr.length || bArr[i14] == 0) {
                break;
            }
            i14++;
        }
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, 0, bArr2, 0, i14);
        try {
            return new String(bArr2, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return CallerData.NA;
        }
    }

    public final void k() {
        String str = this.f18405b;
        int iIndexOf = str.indexOf(".");
        int i14 = iIndexOf - 1;
        if (i14 < 0) {
            return;
        }
        str.substring(0, i14).trim().replaceAll("\\-$", "");
        int i15 = iIndexOf + 3;
        Float.parseFloat(str.substring(i14, i15));
        if (str.length() - i15 < 3) {
            a[] aVarArr = a.f18406a;
            return;
        }
        int i16 = iIndexOf + 6;
        String strSubstring = str.substring(i15, i16);
        if (strSubstring.matches("[A-Za-z]{3}")) {
            str.substring(i15, i16);
            a[] aVarArr2 = a.f18406a;
        } else if (strSubstring.matches("[A-Za-z][0-9]{2}")) {
            str.charAt(i15);
            Integer.parseInt(str.substring(iIndexOf + 4, iIndexOf + 6));
            a[] aVarArr3 = a.f18406a;
        }
    }

    @Override // bk.b, ak.a
    public final String toString() {
        return i() + "\n  Version=" + this.f18405b;
    }

    public c(byte[] bArr) {
        super(bArr);
        a[] aVarArr = a.f18406a;
        this.f18405b = j();
        k();
    }

    public c(dk.a aVar) {
        this(b.g(f18404c, aVar));
    }
}
