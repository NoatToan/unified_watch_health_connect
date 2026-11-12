package v22;

import am.j;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv22/a;", "Landroid/text/style/ClickableSpan;", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f175336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f175337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f175338c;

    public a(Context context, Intent intent, int i14) {
        this.f175336a = context;
        this.f175337b = intent;
        this.f175338c = i14;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        Intent intent = this.f175337b;
        Context context = this.f175336a;
        view2.getClass();
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e4) {
            a2 a2Var = a2.GENERAL;
            String strJ = j.j(intent.getData(), "openExternalUrl ");
            i2.f36769a.getClass();
            i2.a.g(a2Var, strJ, e4);
            Toast.makeText(context.getApplicationContext(), R.string.txt_error_occurred, 0).show();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setColor(a7.b.getColor(this.f175336a, this.f175338c));
        textPaint.setUnderlineText(false);
    }
}
