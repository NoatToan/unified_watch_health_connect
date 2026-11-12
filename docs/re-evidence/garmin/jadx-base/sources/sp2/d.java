package sp2;

import android.webkit.WebView;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.fragment.FitPayIssuerBankTermsConditionFragment;
import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.fragment.FitPayIssuerBankTermsConditionFragment$loadIssuerTermsWebView$1", f = "FitPayIssuerBankTermsConditionFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FitPayIssuerBankTermsConditionFragment f160518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f160519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FitPayIssuerBankTermsConditionFragment fitPayIssuerBankTermsConditionFragment, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f160518a = fitPayIssuerBankTermsConditionFragment;
        this.f160519b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f160518a, this.f160519b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        FitPayIssuerBankTermsConditionFragment fitPayIssuerBankTermsConditionFragment = this.f160518a;
        ((Logger) fitPayIssuerBankTermsConditionFragment.f51671g.getValue()).debug("loadIssuerTermsWebView");
        WebView webView = fitPayIssuerBankTermsConditionFragment.f51668d;
        if (webView != null) {
            webView.loadDataWithBaseURL(null, this.f160519b, "text/html", "utf-8", null);
            return Unit.INSTANCE;
        }
        s.m("webViewContainer");
        throw null;
    }
}
