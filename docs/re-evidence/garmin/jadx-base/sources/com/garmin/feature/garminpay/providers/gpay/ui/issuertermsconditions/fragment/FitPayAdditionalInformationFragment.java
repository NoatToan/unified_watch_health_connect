package com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.fragment;

import a7.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import br2.h;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import e23.l;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import rk0.g;
import s70.b0;
import sk0.i0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/issuertermsconditions/fragment/FitPayAdditionalInformationFragment;", "Lbr2/h;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayAdditionalInformationFragment extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f51656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yq2.a f51657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextInputLayout f51658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextInputEditText f51659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f51660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f51661f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51662g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f51663h = m.b(new i0(14));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51664a;

        public a(l lVar) {
            lVar.getClass();
            this.f51664a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51664a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51664a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_fit_pay_additional_information, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws IllegalAccessException {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        e activity = getActivity();
        yq2.a aVar = activity instanceof yq2.a ? (yq2.a) activity : null;
        if (aVar == null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("Activity should not be null");
            return;
        }
        this.f51657b = aVar;
        aVar.x(true);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        b bVar = (b) new x1(mVarRequireActivity).b(s0.f105811a.b(b.class));
        this.f51656a = bVar;
        bVar.f51614d.f(getViewLifecycleOwner(), new a(new b0(this, 11)));
        b bVar2 = this.f51656a;
        if (bVar2 != null) {
            bVar2.f51618h.f(getViewLifecycleOwner(), new a(new g(27, this, view2)));
        } else {
            s.m("viewModel");
            throw null;
        }
    }
}
