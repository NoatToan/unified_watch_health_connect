package lp2;

import androidx.fragment.app.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayCardVerificationSubmitFragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.l;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayCardVerificationSubmitFragment f114242b;

    public /* synthetic */ g(FitPayCardVerificationSubmitFragment fitPayCardVerificationSubmitFragment, int i14) {
        this.f114241a = i14;
        this.f114242b = fitPayCardVerificationSubmitFragment;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f114241a;
        FitPayCardVerificationSubmitFragment fitPayCardVerificationSubmitFragment = this.f114242b;
        switch (i14) {
            case 0:
                int i15 = FitPayCardVerificationSubmitFragment.f51514k;
                fitPayCardVerificationSubmitFragment.w6().error("Something went wrong when processing submit verification item click event (" + ((Throwable) obj) + ")");
                return Unit.INSTANCE;
            case 1:
                int i16 = FitPayCardVerificationSubmitFragment.f51514k;
                if (((Boolean) obj).booleanValue()) {
                    fitPayCardVerificationSubmitFragment.w6().debug("onViewCreated: viewModel is initialized");
                    SwipeRefreshLayout swipeRefreshLayout = fitPayCardVerificationSubmitFragment.f51522h;
                    if (swipeRefreshLayout == null) {
                        s.m("swipeToRefreshLayout");
                        throw null;
                    }
                    swipeRefreshLayout.setEnabled(false);
                    RecyclerView recyclerView = fitPayCardVerificationSubmitFragment.f51518d;
                    if (recyclerView == null) {
                        s.m("recyclerView");
                        throw null;
                    }
                    kp2.b bVar = fitPayCardVerificationSubmitFragment.f51519e;
                    if (bVar == null) {
                        s.m("cardSubmitVerificationAdapter");
                        throw null;
                    }
                    recyclerView.setAdapter(bVar);
                    m activity = fitPayCardVerificationSubmitFragment.getActivity();
                    activity.getClass();
                    recyclerView.setLayoutManager(new LinearLayoutManager((FitPayCardVerificationActivity) activity));
                    recyclerView.setItemAnimator(null);
                    kp2.b bVar2 = fitPayCardVerificationSubmitFragment.f51519e;
                    if (bVar2 == null) {
                        s.m("cardSubmitVerificationAdapter");
                        throw null;
                    }
                    kp2.b.C2044b c2044b = kp2.b.f106012f;
                    dq2.f fVar = fitPayCardVerificationSubmitFragment.f51516b;
                    fVar.getClass();
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = fitPayCardVerificationSubmitFragment.f51517c;
                    if (aVar == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    bVar2.t(kp2.b.C2044b.b(c2044b, fVar, aVar.y4(), null, null, 12));
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar3 = fitPayCardVerificationSubmitFragment.f51521g;
                    if (bVar3 == null) {
                        s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                    bVar3.x(false);
                } else {
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar4 = fitPayCardVerificationSubmitFragment.f51521g;
                    if (bVar4 == null) {
                        s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                    bVar4.P0(FitPayCardVerificationActivity.a.g.f51462a);
                }
                return Unit.INSTANCE;
            default:
                int i17 = FitPayCardVerificationSubmitFragment.f51514k;
                fitPayCardVerificationSubmitFragment.w6().debug("Successful");
                return Unit.INSTANCE;
        }
    }
}
