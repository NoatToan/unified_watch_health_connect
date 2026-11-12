package fb1;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfb1/j;", "Landroid/text/style/ClickableSpan;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70251a;

    public j(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar) {
        this.f70251a = bVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        view2.getClass();
        Toast.makeText(this.f70251a.requireContext(), "Launch Connect IQ Pregnancy APP will be done in CA-73835", 0).show();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setColor(a7.b.getColor(this.f70251a.requireContext(), R.color.gcm_text_primary_action));
        textPaint.setUnderlineText(false);
    }
}
