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
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
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
import u53.o;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/fragment/FitPayApp2WebVerificationFragment;", "Lbr2/h;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayApp2WebVerificationFragment extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f51492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yo2.b f51493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f51494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b f51495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f51496f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f51491a = m.b(new ll0.b(3));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f51497g = new d();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51498a;

        static {
            int[] iArr = new int[mp2.b.values().length];
            try {
                iArr[mp2.b.AWAITING_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mp2.b.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51498a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2WebVerificationFragment$onViewCreated$1$1", f = "FitPayApp2WebVerificationFragment.kt", l = {99}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51499a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f51501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f51501c = view2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FitPayApp2WebVerificationFragment.this.new b(this.f51501c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51499a;
            FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment = FitPayApp2WebVerificationFragment.this;
            if (i14 == 0) {
                r.b(obj);
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                Boolean bool = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get();
                Boolean bool2 = Boolean.TRUE;
                boolean zG = s.g(bool, bool2);
                View view2 = this.f51501c;
                if (!zG) {
                    fitPayApp2WebVerificationFragment.getClass();
                    i0 i0VarW = f0.w(fitPayApp2WebVerificationFragment);
                    x53.c cVar = s0.f129406a;
                    ge1.b.T(i0VarW, o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.a(fitPayApp2WebVerificationFragment, view2, null), 2);
                } else if (s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51200k.get(), bool2)) {
                    fitPayApp2WebVerificationFragment.getClass();
                    i0 i0VarW2 = f0.w(fitPayApp2WebVerificationFragment);
                    x53.c cVar2 = s0.f129406a;
                    ge1.b.T(i0VarW2, o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.a(fitPayApp2WebVerificationFragment, view2, null), 2);
                } else {
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = fitPayApp2WebVerificationFragment.f51494d;
                    if (aVar2 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    String externalTokenReference = aVar2.y4().getExternalTokenReference();
                    if (externalTokenReference == null || externalTokenReference.length() == 0) {
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar3 = fitPayApp2WebVerificationFragment.f51494d;
                        if (aVar3 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        j0 j0VarC4 = aVar3.C4();
                        this.f51499a = 1;
                        if (j0VarC4.C(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        AtomicReference<String> atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar4 = fitPayApp2WebVerificationFragment.f51494d;
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
            androidx.fragment.app.m mVarRequireActivity = fitPayApp2WebVerificationFragment.requireActivity();
            mVarRequireActivity.getClass();
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar5 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.REQUIRE_ADDITIONAL_AUTHENTICATION;
            cVar3.getClass();
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(mVarRequireActivity, aVar5, null);
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51502a;

        public c(l lVar) {
            lVar.getClass();
            this.f51502a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51502a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51502a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/cardverification/fragment/FitPayApp2WebVerificationFragment$d", "Landroid/webkit/WebViewClient;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (webView == null || webResourceRequest == null) {
                return false;
            }
            Uri url = webResourceRequest.getUrl();
            url.getClass();
            FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment = FitPayApp2WebVerificationFragment.this;
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = fitPayApp2WebVerificationFragment.f51495e;
            if (bVar == null) {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
            bVar.x(true);
            String string = url.toString();
            string.getClass();
            fitPayApp2WebVerificationFragment.w6().debug("handleResponse ".concat(string));
            if (fitPayApp2WebVerificationFragment.f51493c != null) {
                i0 i0VarW = f0.w(fitPayApp2WebVerificationFragment);
                x53.c cVar = s0.f129406a;
                ge1.b.T(i0VarW, o.f168762a, null, new lp2.c(fitPayApp2WebVerificationFragment, string, null), 2);
                return false;
            }
            fitPayApp2WebVerificationFragment.w6().error("handleResponse: creditCard is null");
            fitPayApp2WebVerificationFragment.y6();
            Unit unit = Unit.INSTANCE;
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
            this.f51495e = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b) activity;
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
        this.f51494d = aVar;
        this.f51492b = aVar.f51471e.d();
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = this.f51494d;
        if (aVar2 != null) {
            this.f51493c = aVar2.y4();
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.fragment_fit_pay_app2_web_verification, viewGroup, false);
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
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = this.f51495e;
        if (bVar == null) {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        bVar.x(false);
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = this.f51494d;
        if (aVar != null) {
            aVar.f51469c.f(getViewLifecycleOwner(), new c(new p1(19, this, view2)));
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    public final Logger w6() {
        return (Logger) this.f51491a.getValue();
    }

    public final void y6() {
        w6().error("showVerificationFailedErrorDialog");
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = this.f51495e;
        if (bVar == null) {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        bVar.x(true);
        String string = getString(R.string.dialog_title_error);
        string.getClass();
        String string2 = getString(R.string.verification_failed);
        string2.getClass();
        String string3 = getString(R.string.lbl_ok);
        string3.getClass();
        br2.c cVar = br2.c.f19585a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, contextRequireContext, string, string2, new o13.p(string3, new kk1.h(this, 25)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }
}
