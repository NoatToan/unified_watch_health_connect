package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.RestrictTo;
import defpackage.jjh;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class b implements c.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f2286b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f2287a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.f2287a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f2286b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.c.d
    public boolean a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i < i2) {
            sbB.append(charSequence.charAt(i));
            i++;
        }
        return jjh.a(this.f2287a, sbB.toString());
    }
}
