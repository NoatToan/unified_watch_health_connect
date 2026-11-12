package oq;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes7.dex */
public class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f133264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f133265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133266c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f133267d = '.';

    public d(String str, String str2) {
        this.f133264a = Double.parseDouble(str);
        this.f133265b = Double.parseDouble(str2);
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
        try {
            String strConcat = spanned.toString().substring(0, i16).concat(spanned.toString().substring(i17, spanned.toString().length()));
            String str = strConcat.substring(0, i16) + charSequence.toString() + strConcat.substring(i16, strConcat.length());
            if (str.indexOf(this.f133267d) != -1 && (str.length() - str.indexOf(this.f133267d)) - 1 > this.f133266c) {
                return "";
            }
            double d14 = Double.parseDouble(str);
            double d15 = this.f133264a;
            double d16 = this.f133265b;
            if (d16 > d15) {
                if (d14 < d15 || d14 > d16) {
                    return "";
                }
                return null;
            }
            if (d14 < d16 || d14 > d15) {
                return "";
            }
            return null;
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public d(double d14, double d15) {
        this.f133264a = d14;
        this.f133265b = d15;
    }

    public d(int i14, int i15) {
        this.f133264a = i14;
        this.f133265b = i15;
    }
}
