package pw0;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.lteconnect.LteConnectionActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/c;", "Landroid/text/style/ClickableSpan;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LteConnectionActivity f141704a;

    public c(LteConnectionActivity lteConnectionActivity) {
        this.f141704a = lteConnectionActivity;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        view2.getClass();
        LteConnectionActivity.a aVar = LteConnectionActivity.f38695j;
        this.f141704a.ga();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f141704a.getColor(R.color.gcm_text_primary_action));
        textPaint.setUnderlineText(false);
    }
}
