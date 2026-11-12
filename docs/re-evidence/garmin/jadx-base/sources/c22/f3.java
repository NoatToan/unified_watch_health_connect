package c22;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc22/f3;", "", "<init>", "()V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f3 f23054a = new f3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f23055b = new SimpleDateFormat("EEE, MMM d, yyyy hh:mm aa", Locale.ENGLISH);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc22/f3$a;", "Landroid/text/style/URLSpan;", "", "url", "<init>", "(Ljava/lang/String;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends URLSpan {
        public a(String str) {
            super(str);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    private f3() {
    }

    public static final boolean a(String str, String str2) {
        return p005kotlin.jvm.internal.s.g(str, str2);
    }

    public static String b(Context context, String str, boolean z14) {
        String string = context.getString(R.string.lbl_asterisk);
        string.getClass();
        if (z14) {
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format("%s%s %s", Arrays.copyOf(new Object[]{string, string, str}, 3));
        }
        p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
        return String.format("%s %s%s", Arrays.copyOf(new Object[]{str, string, string}, 3));
    }

    public static String c(Context context, String str, boolean z14) {
        String strE = androidx.room.a0.e(R.string.lbl_asterisk, context);
        if (z14) {
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format("%s%s", Arrays.copyOf(new Object[]{strE, str}, 2));
        }
        p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
        return String.format("%s %s", Arrays.copyOf(new Object[]{str, strE}, 2));
    }

    public static SpannableString d(TextView textView, ClickableSpan clickableSpan) {
        textView.getClass();
        String string = textView.getText().toString();
        int iH = d53.w.H(string, "<link>", 0, false, 6);
        if (iH < 0) {
            iH = 0;
        }
        int iH2 = d53.w.H(string, "</link>", 0, false, 6) - 6;
        if (iH2 < 0) {
            iH2 = 0;
        }
        SpannableString spannableString = new SpannableString(d53.u.v(d53.u.v(string, "<link>", "", false), "</link>", "", false));
        spannableString.setSpan(clickableSpan, iH, iH2, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        textView.setLinksClickable(true);
        return spannableString;
    }
}
