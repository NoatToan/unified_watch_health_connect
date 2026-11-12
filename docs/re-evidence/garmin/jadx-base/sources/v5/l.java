package v5;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv5/l;", "Landroid/text/style/CharacterStyle;", "", "isUnderlineText", "isStrikethroughText", "<init>", "(ZZ)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f175739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f175740b;

    public l(boolean z14, boolean z15) {
        this.f175739a = z14;
        this.f175740b = z15;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f175739a);
        textPaint.setStrikeThruText(this.f175740b);
    }
}
