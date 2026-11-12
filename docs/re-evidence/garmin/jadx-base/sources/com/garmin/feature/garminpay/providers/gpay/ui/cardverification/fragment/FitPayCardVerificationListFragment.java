package com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment;

import a7.e;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i0;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import br2.h;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dq2.f;
import e23.l;
import hy.d;
import lc.u0;
import o13.m;
import o13.t;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import u53.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/fragment/FitPayCardVerificationListFragment;", "Lbr2/h;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayCardVerificationListFragment extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f51505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f51506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kp2.c f51507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SwipeRefreshLayout f51508e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b f51510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f51511h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f51504a = m.b(new ll0.b(4));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s03.a f51509f = new s03.a();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51512a;

        static {
            int[] iArr = new int[mp2.a.values().length];
            try {
                iArr[mp2.a.f120061e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mp2.a.f120062f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mp2.a.f120058b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51512a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<kp2.c.AbstractC2049c, Unit> {
        public b(Object obj) {
            super(1, obj, FitPayCardVerificationListFragment.class, "onAdapterItemClick", "onAdapterItemClick(Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/adapter/CardVerificationAdapter$ItemClick;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(kp2.c.AbstractC2049c abstractC2049c) {
            kp2.c.AbstractC2049c abstractC2049c2 = abstractC2049c;
            abstractC2049c2.getClass();
            FitPayCardVerificationListFragment fitPayCardVerificationListFragment = (FitPayCardVerificationListFragment) this.receiver;
            if (abstractC2049c2 instanceof kp2.c.AbstractC2049c.b) {
                Logger loggerW6 = fitPayCardVerificationListFragment.w6();
                f fVar = ((kp2.c.AbstractC2049c.b) abstractC2049c2).f106040a;
                loggerW6.debug("onAdapterItemClick: selected verification method: " + fVar);
                i0 i0VarW = f0.w(fitPayCardVerificationListFragment);
                x53.c cVar = s0.f129406a;
                ge1.b.T(i0VarW, o.f168762a, null, new lp2.f(fitPayCardVerificationListFragment, fVar, null), 2);
            } else {
                if (!(abstractC2049c2 instanceof kp2.c.AbstractC2049c.a)) {
                    fitPayCardVerificationListFragment.getClass();
                    u0.r();
                    return null;
                }
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = fitPayCardVerificationListFragment.f51510g;
                if (bVar == null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                bVar.P0(FitPayCardVerificationActivity.a.e.f51460a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51513a;

        public c(l lVar) {
            lVar.getClass();
            this.f51513a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51513a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51513a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            e activity = getActivity();
            activity.getClass();
            this.f51510g = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b) activity;
        } catch (ClassCastException unused) {
            w6().error(getActivity() + " must implement IVerificationUIListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a) new x1(mVarRequireActivity).b(p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.class));
        this.f51505b = aVar;
        aVar.f51469c.f(this, new c(new lp2.e(this, 2)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.layout_swipe_refreshable_recycler_view, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f51511h = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f51509f.e();
    }

    @Override // br2.h, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f51511h) {
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = this.f51505b;
            if (aVar == null) {
                s.m("viewModel");
                throw null;
            }
            ge1.b.T(v1.a(aVar), s0.f129406a, null, new jp2.h(aVar, null), 2);
        }
        kp2.c cVar = this.f51507d;
        if (cVar == null) {
            s.m("cardVerificationAdapter");
            throw null;
        }
        this.f51509f.a(cVar.f106032d.d(new d(new b(this), 24), new d(new lp2.e(this, 1), 25)));
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = this.f51510g;
        if (bVar != null) {
            bVar.x(false);
        } else {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.verify_identity);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.UP);
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        this.f51507d = new kp2.c((FitPayCardVerificationActivity) activity);
        View viewFindViewById = view2.findViewById(R.id.generic_recycler_view);
        viewFindViewById.getClass();
        this.f51506c = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.generic_swipe_refresh_layout);
        viewFindViewById2.getClass();
        this.f51508e = (SwipeRefreshLayout) viewFindViewById2;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = this.f51510g;
        if (bVar == null) {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        bVar.x(true);
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = this.f51505b;
        if (aVar != null) {
            aVar.f51469c.f(getViewLifecycleOwner(), new c(new lp2.e(this, 0)));
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    public final Logger w6() {
        return (Logger) this.f51504a.getValue();
    }
}
