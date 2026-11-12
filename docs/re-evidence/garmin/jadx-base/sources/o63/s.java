package o63;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo63/s;", "Lo63/l;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f129882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f129883b;

    public s() {
        char[] cArr;
        d dVar = d.f129845c;
        synchronized (dVar) {
            p13.k<char[]> kVar = dVar.f129847a;
            cArr = null;
            char[] cArrRemoveLast = kVar.isEmpty() ? null : kVar.removeLast();
            if (cArrRemoveLast != null) {
                dVar.f129848b -= cArrRemoveLast.length;
                cArr = cArrRemoveLast;
            }
        }
        this.f129882a = cArr == null ? new char[128] : cArr;
    }

    @Override // o63.l
    public final void a(char c14) {
        d(this.f129883b, 1);
        char[] cArr = this.f129882a;
        int i14 = this.f129883b;
        this.f129883b = i14 + 1;
        cArr[i14] = c14;
    }

    @Override // o63.l
    public final void b(String str) {
        byte b14;
        str.getClass();
        d(this.f129883b, str.length() + 2);
        char[] cArr = this.f129882a;
        int i14 = this.f129883b;
        int i15 = i14 + 1;
        cArr[i14] = CoreConstants.DOUBLE_QUOTE_CHAR;
        int length = str.length();
        str.getChars(0, length, cArr, i15);
        int i16 = length + i15;
        int i17 = i15;
        while (i17 < i16) {
            char c14 = cArr[i17];
            byte[] bArr = f0.f129853b;
            if (c14 < bArr.length && bArr[c14] != 0) {
                int length2 = str.length();
                for (int i18 = i17 - i15; i18 < length2; i18++) {
                    d(i17, 2);
                    char cCharAt = str.charAt(i18);
                    byte[] bArr2 = f0.f129853b;
                    if (cCharAt >= bArr2.length || (b14 = bArr2[cCharAt]) == 0) {
                        int i19 = i17 + 1;
                        this.f129882a[i17] = cCharAt;
                        i17 = i19;
                    } else if (b14 == 1) {
                        String str2 = f0.f129852a[cCharAt];
                        str2.getClass();
                        d(i17, str2.length());
                        str2.getChars(0, str2.length(), this.f129882a, i17);
                        int length3 = str2.length() + i17;
                        this.f129883b = length3;
                        i17 = length3;
                    } else {
                        char[] cArr2 = this.f129882a;
                        cArr2[i17] = '\\';
                        cArr2[i17 + 1] = (char) b14;
                        i17 += 2;
                        this.f129883b = i17;
                    }
                }
                d(i17, 1);
                this.f129882a[i17] = CoreConstants.DOUBLE_QUOTE_CHAR;
                this.f129883b = i17 + 1;
                return;
            }
            i17++;
        }
        cArr[i16] = CoreConstants.DOUBLE_QUOTE_CHAR;
        this.f129883b = i16 + 1;
    }

    @Override // o63.l
    public final void c(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        d(this.f129883b, length);
        str.getChars(0, str.length(), this.f129882a, this.f129883b);
        this.f129883b += length;
    }

    public final void d(int i14, int i15) {
        int i16 = i15 + i14;
        char[] cArr = this.f129882a;
        if (cArr.length <= i16) {
            int i17 = i14 * 2;
            if (i16 < i17) {
                i16 = i17;
            }
            this.f129882a = Arrays.copyOf(cArr, i16);
        }
    }

    public final void e() {
        d dVar = d.f129845c;
        char[] cArr = this.f129882a;
        dVar.getClass();
        cArr.getClass();
        synchronized (dVar) {
            try {
                int i14 = dVar.f129848b;
                if (cArr.length + i14 < c.f129843a) {
                    dVar.f129848b = i14 + cArr.length;
                    dVar.f129847a.addLast(cArr);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final String toString() {
        return new String(this.f129882a, 0, this.f129883b);
    }

    @Override // o63.l
    public final void writeLong(long j8) {
        c(String.valueOf(j8));
    }
}
