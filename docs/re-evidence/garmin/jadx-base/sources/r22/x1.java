package r22;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr22/x1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f149922a;

    public x1(Context context) {
        context.getClass();
        this.f149922a = context;
    }

    public static SpannableStringBuilder b(x1 x1Var, CharSequence charSequence, int i14) {
        int length = charSequence.length();
        x1Var.getClass();
        charSequence.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(x1Var.f149922a, i14), 0, length, 18);
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder a(CharSequence charSequence, int i14, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (String str : strArr) {
            if (d53.w.z(charSequence, str, true)) {
                int iH = d53.w.H(charSequence, str, 0, true, 2);
                int length = str.length() + iH;
                if (iH > 0) {
                    int i15 = iH - 1;
                    if (Character.isWhitespace(charSequence.charAt(i15))) {
                        iH = i15;
                    }
                }
                spannableStringBuilder.setSpan(new TextAppearanceSpan(this.f149922a, i14), iH, length, 18);
            }
        }
        return spannableStringBuilder;
    }
}
