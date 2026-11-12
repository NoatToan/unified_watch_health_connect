package wr2;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwr2/t;", "Landroid/text/style/ClickableSpan;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f186887a;

    public t(e23.a<Unit> aVar) {
        this.f186887a = aVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        view2.getClass();
        this.f186887a.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setColor(a7.b.getColor(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), R.color.GPcolorAccent));
        textPaint.setUnderlineText(true);
    }
}
