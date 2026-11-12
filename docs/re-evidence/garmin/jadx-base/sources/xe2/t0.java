package xe2;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxe2/t0;", "Landroid/text/style/ClickableSpan;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t0 extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190552a;

    public t0(com.garmin.android.library.mobileauth.ui.e eVar) {
        this.f190552a = eVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        com.garmin.android.library.mobileauth.ui.e eVar = this.f190552a;
        view2.getClass();
        lc2.a aVarValueOf = lc2.a.GARMIN_PRIVACY_POLICY;
        try {
            String str = eVar.getMobileAuthConfig$mobile_auth_release().A;
            if (str == null) {
                p005kotlin.jvm.internal.s.m("privacyPolicyEnumName");
                throw null;
            }
            aVarValueOf = lc2.a.valueOf(str);
            com.garmin.android.library.mobileauth.ui.e.a aVar = com.garmin.android.library.mobileauth.ui.e.f50426m;
            androidx.lifecycle.n0 viewLifecycleOwner = eVar.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            androidx.lifecycle.i0 i0VarW = o53.f0.w(viewLifecycleOwner);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(i0VarW, x53.b.f189152a, null, new u0(eVar, aVarValueOf, null), 2);
        } catch (Exception unused) {
            ((Logger) eVar.f50440l.getValue()).error("Invalid 'ssoPrivacyPolicyEnumName' value. Developer, check your app's 'mobile_auth_config.xml' file!");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        Integer num = this.f190552a.f50437i;
        num.getClass();
        textPaint.setColor(num.intValue());
    }
}
