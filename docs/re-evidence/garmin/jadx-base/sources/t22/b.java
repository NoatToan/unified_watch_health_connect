package t22;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataConsentActivity;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt22/b;", "Lt22/c;", "", "message", "<init>", "(Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161984a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"t22/b$a", "Landroid/text/style/ClickableSpan;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f161985a;

        public a(Context context) {
            this.f161985a = context;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            bv.b.f21239a.getClass();
            bv.b.a();
            Context context = this.f161985a;
            context.getClass();
            DataConsentActivity.a.b(DataConsentActivity.f32169h, context);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setColor(a7.b.getColor(this.f161985a, R.color.gcm_text_primary_action_selector));
            textPaint.setUnderlineText(false);
        }
    }

    public b(String str) {
        str.getClass();
        this.f161984a = str;
    }

    @Override // t22.c
    public final CharSequence a(Context context) {
        String string = context.getString(R.string.msg_manage_permissions);
        string.getClass();
        SpannableString spannableString = new SpannableString(e5.g(this.f161984a, StringUtils.SPACE, string));
        spannableString.setSpan(new a(context), spannableString.length() - string.length(), spannableString.length(), 33);
        return spannableString;
    }
}
