package com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment;

import android.view.View;
import android.webkit.WebView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dq2.f;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayOnlineVerificationFragment$handleRequest$1", f = "FitPayOnlineVerificationFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FitPayOnlineVerificationFragment f51541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f51542b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FitPayOnlineVerificationFragment fitPayOnlineVerificationFragment, View view2, d<? super b> dVar) {
        super(2, dVar);
        this.f51541a = fitPayOnlineVerificationFragment;
        this.f51542b = view2;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f51541a, this.f51542b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        FitPayOnlineVerificationFragment fitPayOnlineVerificationFragment = this.f51541a;
        fitPayOnlineVerificationFragment.w6().debug("handleRequest");
        View viewFindViewById = this.f51542b.findViewById(R.id.verification_web_view);
        viewFindViewById.getClass();
        WebView webView = (WebView) viewFindViewById;
        fitPayOnlineVerificationFragment.f51532e = webView;
        webView.setVisibility(0);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(fitPayOnlineVerificationFragment.f51533f);
        f fVar = fitPayOnlineVerificationFragment.f51529b;
        if (fVar == null || (str = fVar.f60809d) == null) {
            fitPayOnlineVerificationFragment.w6().error("handleRequest: baseUrl cannot be null");
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = fitPayOnlineVerificationFragment.f51531d;
            if (bVar == null) {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
            bVar.P0(FitPayCardVerificationActivity.a.f.f51461a);
        } else {
            WebView webView2 = fitPayOnlineVerificationFragment.f51532e;
            if (webView2 == null) {
                s.m("webViewContainer");
                throw null;
            }
            webView2.loadUrl(str);
        }
        return Unit.INSTANCE;
    }
}
