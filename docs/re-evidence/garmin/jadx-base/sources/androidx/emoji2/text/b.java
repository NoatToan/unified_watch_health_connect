package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f7027b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f7028a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.f7028a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
