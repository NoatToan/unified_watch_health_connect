package u5;

import android.text.TextPaint;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu5/d;", "Lu5/c;", "", "text", "Landroid/text/TextPaint;", "textPaint", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f168632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f168633b;

    public d(CharSequence charSequence, TextPaint textPaint) {
        this.f168632a = charSequence;
        this.f168633b = textPaint;
    }

    @Override // u5.c
    public final int e(int i14) {
        CharSequence charSequence = this.f168632a;
        return this.f168633b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i14, 0);
    }

    @Override // u5.c
    public final int f(int i14) {
        CharSequence charSequence = this.f168632a;
        return this.f168633b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i14, 2);
    }
}
