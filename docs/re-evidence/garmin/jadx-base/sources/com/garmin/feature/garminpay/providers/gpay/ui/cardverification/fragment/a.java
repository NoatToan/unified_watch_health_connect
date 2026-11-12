package com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dq2.f;
import e23.p;
import o13.r;
import o53.b0;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2WebVerificationFragment$handleRequest$1", f = "FitPayApp2WebVerificationFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FitPayApp2WebVerificationFragment f51539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f51540b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment, View view2, d<? super a> dVar) {
        super(2, dVar);
        this.f51539a = fitPayApp2WebVerificationFragment;
        this.f51540b = view2;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f51539a, this.f51540b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        eq2.a aVar;
        eq2.b data;
        JsonObject outbound;
        eq2.a aVar2;
        eq2.a aVar3;
        eq2.a aVar4;
        u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment = this.f51539a;
        fitPayApp2WebVerificationFragment.w6().debug("handleRequest");
        try {
            View viewFindViewById = this.f51540b.findViewById(R.id.verification_web_view);
            viewFindViewById.getClass();
            WebView webView = (WebView) viewFindViewById;
            fitPayApp2WebVerificationFragment.f51496f = webView;
            webView.setVisibility(0);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(fitPayApp2WebVerificationFragment.f51497g);
            f fVar = fitPayApp2WebVerificationFragment.f51492b;
            if (fVar != null && (aVar4 = fVar.f60811f) != null) {
                aVar4.getData();
            }
            f fVar2 = fitPayApp2WebVerificationFragment.f51492b;
            if (fVar2 != null && (aVar3 = fVar2.f60811f) != null) {
                aVar3.getData();
            }
            f fVar3 = fitPayApp2WebVerificationFragment.f51492b;
            String action = (fVar3 == null || (aVar2 = fVar3.f60811f) == null) ? null : aVar2.getAction();
            f fVar4 = fitPayApp2WebVerificationFragment.f51492b;
            JSONObject jSONObject = (fVar4 == null || (aVar = fVar4.f60811f) == null || (data = aVar.getData()) == null || (outbound = data.getOutbound()) == null) ? null : new JSONObject(new Gson().toJson((JsonElement) outbound));
            JSONArray jSONArrayNames = jSONObject != null ? jSONObject.names() : null;
            if (action != null) {
                Uri.Builder builderBuildUpon = Uri.parse(action).buildUpon();
                if (jSONArrayNames != null) {
                    int length = jSONArrayNames.length();
                    for (int i14 = 0; i14 < length; i14++) {
                        String string = jSONArrayNames.getString(i14);
                        string.getClass();
                        String string2 = jSONObject.getString(string);
                        string2.getClass();
                        builderBuildUpon.appendQueryParameter(string, string2);
                    }
                }
                builderBuildUpon.build();
                WebView webView2 = fitPayApp2WebVerificationFragment.f51496f;
                if (webView2 == null) {
                    s.m("webViewContainer");
                    throw null;
                }
                webView2.loadUrl(builderBuildUpon.toString());
            } else {
                fitPayApp2WebVerificationFragment.w6().error("handleRequest: baseUrl cannot be null");
                fitPayApp2WebVerificationFragment.y6();
            }
        } catch (Exception e4) {
            fitPayApp2WebVerificationFragment.w6().error("handleRequest: " + e4.getMessage());
            fitPayApp2WebVerificationFragment.y6();
        }
        return Unit.INSTANCE;
    }
}
