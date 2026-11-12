package com.garmin.android.library.mobileauth.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.b0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/f;", "Landroid/text/style/ClickableSpan;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends ClickableSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f50452b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f50453a;

    public f(e eVar) {
        this.f50453a = eVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        view2.getClass();
        re2.b.f152215a.getClass();
        if (re2.b.u()) {
            e eVar = this.f50453a;
            TextView textView = eVar.f50434f;
            if (textView != null) {
                textView.post(new b0(eVar, 24));
            } else {
                s.m("privacyUIComponent");
                throw null;
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        Integer num = this.f50453a.f50437i;
        num.getClass();
        textPaint.setColor(num.intValue());
        textPaint.setUnderlineText(false);
    }
}
