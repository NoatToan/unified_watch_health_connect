package c22;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc22/q1;", "Landroid/text/SpannableString;", "", "text", "linkText", "url", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "linkColorId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q1 extends SpannableString {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"c22/q1$a", "Landroid/text/style/ClickableSpan;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f23205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f23206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f23207c;

        public a(Context context, String str, int i14) {
            this.f23205a = context;
            this.f23206b = str;
            this.f23207c = i14;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            String str = this.f23206b;
            Context context = this.f23205a;
            view2.getClass();
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (ActivityNotFoundException e4) {
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                String strN = fb1.c.n("openExternalUrl ", str);
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.g(a2Var, strN, e4);
                Toast.makeText(context.getApplicationContext(), R.string.txt_error_occurred, 0).show();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setColor(a7.b.getColor(this.f23205a, this.f23207c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(String str, String str2, String str3, Context context, int i14) {
        super(str);
        str.getClass();
        str2.getClass();
        str3.getClass();
        context.getClass();
        if (d53.w.z(this, str2, false)) {
            setSpan(new a(context, str3, i14), d53.w.H(this, str2, 0, false, 6), str2.length() + d53.w.H(this, str2, 0, false, 6), 33);
        }
    }
}
