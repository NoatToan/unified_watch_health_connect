package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes8.dex */
public class zee implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41191a;

    public zee(int i) {
        this.f41191a = i;
    }

    public static int a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i = str.charAt(i2) > 255 ? i + 2 : i + 1;
        }
        return i;
    }

    public CharSequence b(String str, String str2) {
        int i;
        int iA = a(str);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f41191a;
            if (i2 >= i - iA) {
                break;
            }
            i2 = str2.charAt(i3) > 255 ? i2 + 2 : i2 + 1;
            i3++;
        }
        if (iA + i2 > i) {
            i3--;
        }
        return str2.substring(0, i3);
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (a(spanned.toString()) + a(charSequence.toString()) > this.f41191a) {
            return a(spanned.toString()) >= this.f41191a ? "" : b(spanned.toString(), charSequence.toString());
        }
        return null;
    }
}
