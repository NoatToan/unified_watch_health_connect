package defpackage;

import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class qj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f31562a;

    public qj8(int i) {
        this.f31562a = new int[b(i, 1, 31, "numBuckets")];
    }

    public static int b(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        if (i <= i3) {
            return i;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public void a(int i) {
        if (i <= 0) {
            int[] iArr = this.f31562a;
            iArr[0] = iArr[0] + 1;
        } else {
            int[] iArr2 = this.f31562a;
            int iMin = Math.min(iArr2.length - 1, 32 - Integer.numberOfLeadingZeros(i));
            iArr2[iMin] = iArr2[iMin] + 1;
        }
    }

    public void c(String str, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        for (int i = 0; i < this.f31562a.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (i < this.f31562a.length - 1) {
                sb.append("<");
                sb.append(1 << i);
            } else {
                sb.append(">=");
                sb.append(1 << (i - 1));
            }
            sb.append(": ");
            sb.append(this.f31562a[i]);
        }
        sb.append("]");
    }
}
