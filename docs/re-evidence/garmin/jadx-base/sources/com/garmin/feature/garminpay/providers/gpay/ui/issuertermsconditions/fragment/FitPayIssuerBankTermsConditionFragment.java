package com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.fragment;

import a7.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import br2.h;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b;
import e23.l;
import hn2.c;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import rk0.g;
import rp2.f;
import sk0.i0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/issuertermsconditions/fragment/FitPayIssuerBankTermsConditionFragment;", "Lbr2/h;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayIssuerBankTermsConditionFragment extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dp2.a f51665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f51666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yq2.a f51667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebView f51668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f51669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f51670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f51671g = m.b(new i0(15));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51672a;

        public a(l lVar) {
            lVar.getClass();
            this.f51672a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51672a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51672a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_fit_pay_issuer_bank_terms_condition, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws IllegalAccessException {
        dp2.b bVar;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        c cVarU6 = u6();
        String string = getString(R.string.label_terms_and_conditions);
        string.getClass();
        cVarU6.W9(string, c.a.UP);
        e activity = getActivity();
        yq2.a aVar = activity instanceof yq2.a ? (yq2.a) activity : null;
        if (aVar == null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("Activity should not be null");
            return;
        }
        this.f51667c = aVar;
        aVar.x(true);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f51666b = (b) new x1(mVarRequireActivity).b(s0.f105811a.b(b.class));
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString("keyFitpayAdditionalInfoCvv") : null;
        if (string2 != null) {
            ((Logger) this.f51671g.getValue()).debug("onViewCreated: cvv not null, create AdditionalInfoModel");
            b bVar2 = this.f51666b;
            if (bVar2 == null) {
                s.m("viewModel");
                throw null;
            }
            if (bVar2.f51619i.get() != null) {
                b bVar3 = this.f51666b;
                if (bVar3 == null) {
                    s.m("viewModel");
                    throw null;
                }
                bVar = bVar3.f51619i.get();
                bVar.q(string2);
            } else {
                bVar = new dp2.b(null, null, null, null, string2, null, null, null, null, null, null, 2031, null);
            }
            this.f51665a = new dp2.a(string2);
            b bVar4 = this.f51666b;
            if (bVar4 == null) {
                s.m("viewModel");
                throw null;
            }
            bVar4.f51619i.set(bVar);
        }
        b bVar5 = this.f51666b;
        if (bVar5 == null) {
            s.m("viewModel");
            throw null;
        }
        ge1.b.T(v1.a(bVar5), o53.s0.f129406a, null, new f(bVar5, null), 2);
        b bVar6 = this.f51666b;
        if (bVar6 != null) {
            bVar6.f51616f.f(getViewLifecycleOwner(), new a(new g(28, this, view2)));
        } else {
            s.m("viewModel");
            throw null;
        }
    }
}
