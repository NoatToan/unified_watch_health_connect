package cs1;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcs1/d;", "Landroid/text/SpannableStringBuilder;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends SpannableStringBuilder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CharSequence charSequence) {
        super(charSequence);
        charSequence.getClass();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i14, int i15, int i16) {
        if (obj instanceof CharacterStyle) {
            if (!(getSpans(i14, i15, a.class).length == 0)) {
                return;
            }
        }
        super.setSpan(obj, i14, i15, i16);
    }
}
