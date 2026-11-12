package cs1;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcs1/a;", "Landroid/text/style/CharacterStyle;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lds1/a;", HeaderParameterNames.AUTHENTICATION_TAG, "<init>", "(Landroid/content/Context;Lds1/a;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds1.a f55456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Typeface f55457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55458c;

    public a(Context context, ds1.a aVar) {
        context.getClass();
        aVar.getClass();
        this.f55456a = aVar;
        this.f55457b = h22.a.a("font/roboto_medium.ttf", context);
        this.f55458c = a7.b.getColor(context, R.color.palette_blue_22);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        Typeface typeface = this.f55457b;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setColor(this.f55458c);
        textPaint.setUnderlineText(false);
    }
}
