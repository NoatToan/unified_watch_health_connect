package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.RequiresApi;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public class dbq implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15349a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f15350b;

    @RequiresApi(24)
    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    @RequiresApi(28)
    public static class c extends b {
        @Override // dbq.b
        public boolean a(CharSequence charSequence) {
            return l5i.a(charSequence) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    public dbq(Spannable spannable) {
        this.f15350b = spannable;
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public final void a() {
        Spannable spannable = this.f15350b;
        if (!this.f15349a && c().a(spannable)) {
            this.f15350b = new SpannableString(spannable);
        }
        this.f15349a = true;
    }

    public Spannable b() {
        return this.f15350b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f15350b.charAt(i);
    }

    @Override // java.lang.CharSequence
    @RequiresApi(api = 24)
    public IntStream chars() {
        return a.a(this.f15350b);
    }

    @Override // java.lang.CharSequence
    @RequiresApi(api = 24)
    public IntStream codePoints() {
        return a.b(this.f15350b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f15350b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f15350b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f15350b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f15350b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f15350b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f15350b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f15350b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.f15350b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f15350b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f15350b.toString();
    }

    public dbq(CharSequence charSequence) {
        this.f15350b = new SpannableString(charSequence);
    }
}
