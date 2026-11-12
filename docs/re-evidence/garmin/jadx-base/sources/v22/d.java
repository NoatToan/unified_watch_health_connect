package v22;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import c22.f3;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import d53.w;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v22/d$a", "Landroid/text/style/ClickableSpan;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f175341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f175342b;

        public a(e23.a<Unit> aVar, TextView textView) {
            this.f175341a = aVar;
            this.f175342b = textView;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            this.f175341a.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setColor(a7.b.getColor(this.f175342b.getContext(), R.color.gcm_text_primary_action_selector));
            textPaint.setUnderlineText(false);
        }
    }

    public static final void a(TextView textView, float f14) {
        textView.getClass();
        float textSize = textView.getTextSize() / textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        if (textView.getContext().getResources().getConfiguration().fontScale > f14) {
            textView.setTextSize(0, f14 * textSize * textView.getContext().getResources().getDisplayMetrics().density);
        }
    }

    public static final void b(TextView textView, String str, e23.a<Unit> aVar) {
        textView.getClass();
        int i14 = 0;
        int iH = w.H(str, "<link>", 0, false, 6);
        int iH2 = w.H(str, "</link>", 0, false, 6) - 6;
        if (iH < 0 || iH > iH2) {
            iH2 = str.length();
        } else {
            str = u.v(u.v(str, "<link>", "", false), "</link>", "", false);
            i14 = iH;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new a(aVar, textView), i14, iH2, 17);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    public static final void c(TextView textView, String str) {
        f3 f3Var = f3.f23054a;
        if (str == null) {
            str = "";
        }
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        f3Var.getClass();
        SpannableString spannableString = new SpannableString(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        uRLSpanArr.getClass();
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new f3.a(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_primary_action_selector));
    }

    public static final void d(TextView textView, l<? super oi0.b, Unit> lVar) {
        if (textView == null) {
            return;
        }
        String string = textView.getText().toString();
        Context context = textView.getContext();
        context.getClass();
        textView.setContentDescription(oi0.c.A(context, lVar, string));
    }
}
