package l03;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import j03.r;

/* JADX INFO: loaded from: classes3.dex */
public class g extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f108032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i03.c f108034c;

    public g(r rVar, String str, i03.c cVar) {
        super(str);
        this.f108032a = rVar;
        this.f108033b = str;
        this.f108034c = cVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view2) {
        ((i03.d) this.f108034c).getClass();
        Uri uriBuild = Uri.parse(this.f108033b);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme("https").build();
        }
        Context context = view2.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f108032a.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
