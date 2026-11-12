package a8;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public class l implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1925a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f1926b;

    public static class a {
    }

    public static class b extends a {
    }

    public l(Spanned spanned) {
        this.f1926b = new SpannableString(spanned);
    }

    public final void a() {
        Spannable spannable = this.f1926b;
        if (!this.f1925a) {
            new b();
            if ((spannable instanceof PrecomputedText) || (spannable instanceof j7.b)) {
                this.f1926b = new SpannableString(spannable);
            }
        }
        this.f1925a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i14) {
        return this.f1926b.charAt(i14);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1926b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1926b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1926b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1926b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1926b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i14, int i15, Class<T> cls) {
        return (T[]) this.f1926b.getSpans(i14, i15, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1926b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i14, int i15, Class cls) {
        return this.f1926b.nextSpanTransition(i14, i15, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1926b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i14, int i15, int i16) {
        a();
        this.f1926b.setSpan(obj, i14, i15, i16);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i14, int i15) {
        return this.f1926b.subSequence(i14, i15);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1926b.toString();
    }

    public l(Spannable spannable) {
        this.f1926b = spannable;
    }

    public l(CharSequence charSequence) {
        this.f1926b = new SpannableString(charSequence);
    }
}
