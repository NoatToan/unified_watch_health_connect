package ue2;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lue2/f;", "Landroid/text/style/ClickableSpan;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f170272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f170273b;

    public f(e23.a<Unit> aVar, int i14) {
        this.f170272a = aVar;
        this.f170273b = i14;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        view2.getClass();
        this.f170272a.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f170273b);
        textPaint.setUnderlineText(true);
    }
}
