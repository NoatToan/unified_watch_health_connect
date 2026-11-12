package com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.lifecycle.i0;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import br2.h;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dq2.f;
import e23.l;
import e23.p;
import java.util.concurrent.atomic.AtomicReference;
import l3.p1;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import o53.j0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import t13.d;
import u53.o;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/fragment/FitPayOnlineVerificationFragment;", "Lbr2/h;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayOnlineVerificationFragment extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f51529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f51530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b f51531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f51532e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f51528a = m.b(new ll0.b(6));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f51533f = new c();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayOnlineVerificationFragment$onViewCreated$1$1", f = "FitPayOnlineVerificationFragment.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51534a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f51536c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2, d<? super a> dVar) {
            super(2, dVar);
            this.f51536c = view2;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return FitPayOnlineVerificationFragment.this.new a(this.f51536c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51534a;
            FitPayOnlineVerificationFragment fitPayOnlineVerificationFragment = FitPayOnlineVerificationFragment.this;
            if (i14 == 0) {
                r.b(obj);
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                Boolean bool = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get();
                Boolean bool2 = Boolean.TRUE;
                boolean zG = s.g(bool, bool2);
                View view2 = this.f51536c;
                if (!zG) {
                    fitPayOnlineVerificationFragment.getClass();
                    i0 i0VarW = f0.w(fitPayOnlineVerificationFragment);
                    x53.c cVar = s0.f129406a;
                    ge1.b.T(i0VarW, o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.b(fitPayOnlineVerificationFragment, view2, null), 2);
                } else if (s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51200k.get(), bool2)) {
                    fitPayOnlineVerificationFragment.getClass();
                    i0 i0VarW2 = f0.w(fitPayOnlineVerificationFragment);
                    x53.c cVar2 = s0.f129406a;
                    ge1.b.T(i0VarW2, o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.b(fitPayOnlineVerificationFragment, view2, null), 2);
                } else {
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = fitPayOnlineVerificationFragment.f51530c;
                    if (aVar2 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    String externalTokenReference = aVar2.y4().getExternalTokenReference();
                    if (externalTokenReference == null || externalTokenReference.length() == 0) {
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar3 = fitPayOnlineVerificationFragment.f51530c;
                        if (aVar3 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        j0 j0VarC4 = aVar3.C4();
                        this.f51534a = 1;
                        if (j0VarC4.C(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        AtomicReference<String> atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar4 = fitPayOnlineVerificationFragment.f51530c;
                        if (aVar4 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        atomicReference.set(aVar4.y4().getExternalTokenReference());
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
            androidx.fragment.app.m mVarRequireActivity = fitPayOnlineVerificationFragment.requireActivity();
            mVarRequireActivity.getClass();
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar5 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.REQUIRE_ADDITIONAL_AUTHENTICATION;
            cVar3.getClass();
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(mVarRequireActivity, aVar5, null);
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51537a;

        public b(l lVar) {
            lVar.getClass();
            this.f51537a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51537a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51537a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/cardverification/fragment/FitPayOnlineVerificationFragment$c", "Landroid/webkit/WebViewClient;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (webView != null && webResourceRequest != null) {
                Uri url = webResourceRequest.getUrl();
                url.getClass();
                FitPayOnlineVerificationFragment fitPayOnlineVerificationFragment = FitPayOnlineVerificationFragment.this;
                fitPayOnlineVerificationFragment.getClass();
                String string = url.toString();
                string.getClass();
                fitPayOnlineVerificationFragment.w6().debug("handleResponse ".concat(string));
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            a7.e activity = getActivity();
            activity.getClass();
            this.f51531d = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b) activity;
        } catch (ClassCastException unused) {
            w6().error(getActivity() + " must implement IVerificationUIListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a) new x1(mVarRequireActivity).a(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.class);
        this.f51530c = aVar;
        this.f51529b = aVar.f51471e.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.fragment_fit_pay_online_verification, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.verify_identity);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.UP);
        hn2.c.ba(u6(), Boolean.TRUE, null, null, 14);
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = this.f51531d;
        if (bVar == null) {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        bVar.x(false);
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = this.f51530c;
        if (aVar != null) {
            aVar.f51469c.f(getViewLifecycleOwner(), new b(new p1(20, this, view2)));
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    public final Logger w6() {
        return (Logger) this.f51528a.getValue();
    }
}
