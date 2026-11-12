package cs1;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.HeaderParameterNames;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcs1/c;", "Landroid/text/style/ClickableSpan;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lds1/a;", HeaderParameterNames.AUTHENTICATION_TAG, "Lkotlin/Function1;", "", "onTagClick", "<init>", "(Landroid/content/Context;Lds1/a;Le23/l;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds1.a f55461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<ds1.a, Unit> f55462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Typeface f55463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55464d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, ds1.a aVar, l<? super ds1.a, Unit> lVar) {
        context.getClass();
        aVar.getClass();
        lVar.getClass();
        this.f55461a = aVar;
        this.f55462b = lVar;
        this.f55463c = h22.a.a("font/roboto_medium.ttf", context);
        this.f55464d = a7.b.getColor(context, R.color.palette_blue_22);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        view2.getClass();
        this.f55462b.invoke(this.f55461a);
        ht.a.f85464a.getClass();
        ht.a.a(null, "TagTextClicked");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        Typeface typeface = this.f55463c;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setColor(this.f55464d);
    }
}
