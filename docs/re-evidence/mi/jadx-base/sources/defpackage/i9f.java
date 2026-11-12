package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes5.dex */
public class i9f implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20906a;

    public i9f(int i) {
        this.f20906a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f20906a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
