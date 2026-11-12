package com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i0;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import br2.h;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.tasks.Task;
import dq2.f;
import e23.l;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import lp2.g;
import lp2.i;
import o13.m;
import o13.t;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import u53.o;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/fragment/FitPayCardVerificationSubmitFragment;", "Lbr2/h;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayCardVerificationSubmitFragment extends h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f51514k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f51516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f51517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f51518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kp2.b f51519e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b f51521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SwipeRefreshLayout f51522h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.c<Intent> f51524j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f51515a = m.b(new ll0.b(5));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s03.a f51520f = new s03.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f51523i = new d();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51525a;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.CARD_VERIFICATION_INCORRECT_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.CARD_VERIFICATION_INCORRECT_CODE_RETRIES_EXCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.CARD_VERIFICATION_EXPIRED_SESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z.CARD_VERIFICATION_INCORRECT_TAV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[z.CARD_VERIFICATION_EXPIRED_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f51525a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements l<kp2.b.c, Unit> {
        public c(Object obj) {
            super(1, obj, FitPayCardVerificationSubmitFragment.class, "onAdapterItemClick", "onAdapterItemClick(Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/adapter/CardSubmitVerificationAdapter$ItemClick;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(kp2.b.c cVar) {
            kp2.b.c cVar2 = cVar;
            cVar2.getClass();
            FitPayCardVerificationSubmitFragment fitPayCardVerificationSubmitFragment = (FitPayCardVerificationSubmitFragment) this.receiver;
            int i14 = FitPayCardVerificationSubmitFragment.f51514k;
            fitPayCardVerificationSubmitFragment.w6().debug("onAdapterItemClick: " + cVar2);
            if (cVar2 instanceof kp2.b.c.C2046c) {
                SwipeRefreshLayout swipeRefreshLayout = fitPayCardVerificationSubmitFragment.f51522h;
                if (swipeRefreshLayout == null) {
                    s.m("swipeToRefreshLayout");
                    throw null;
                }
                swipeRefreshLayout.setRefreshing(true);
                String str = ((kp2.b.c.C2046c) cVar2).f106027a;
                i0 i0VarW = f0.w(fitPayCardVerificationSubmitFragment);
                x53.c cVar3 = s0.f129406a;
                ge1.b.T(i0VarW, o.f168762a, null, new i(fitPayCardVerificationSubmitFragment, str, null), 2);
            } else if (cVar2 instanceof kp2.b.c.a) {
                NavHostFragment.f10124e.getClass();
                NavHostFragment.a.a(fitPayCardVerificationSubmitFragment).m();
            } else {
                if (!(cVar2 instanceof kp2.b.c.C2045b)) {
                    u0.r();
                    return null;
                }
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = fitPayCardVerificationSubmitFragment.f51521g;
                if (bVar == null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                bVar.P0(FitPayCardVerificationActivity.a.e.f51460a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/cardverification/fragment/FitPayCardVerificationSubmitFragment$d", "Landroid/content/BroadcastReceiver;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Parcelable parcelable;
            context.getClass();
            intent.getClass();
            int i14 = FitPayCardVerificationSubmitFragment.f51514k;
            FitPayCardVerificationSubmitFragment fitPayCardVerificationSubmitFragment = FitPayCardVerificationSubmitFragment.this;
            fitPayCardVerificationSubmitFragment.w6().debug("onReceive: OTP Verification received");
            if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
                obj.getClass();
                int statusCode = ((Status) obj).getStatusCode();
                if (statusCode != 0) {
                    if (statusCode != 15) {
                        return;
                    }
                    fitPayCardVerificationSubmitFragment.w6().debug(InstanceID.ERROR_TIMEOUT);
                    return;
                }
                fitPayCardVerificationSubmitFragment.w6().debug("SUCCESS");
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = extras != null ? (Parcelable) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT, Intent.class) : null;
                } else {
                    Parcelable parcelable2 = extras != null ? extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT) : null;
                    if (!(parcelable2 instanceof Intent)) {
                        parcelable2 = null;
                    }
                    parcelable = (Intent) parcelable2;
                }
                Intent intent2 = (Intent) parcelable;
                if (intent2 != null) {
                    try {
                        fitPayCardVerificationSubmitFragment.f51524j.a(intent2, null);
                        Unit unit = Unit.INSTANCE;
                    } catch (ActivityNotFoundException e4) {
                        fitPayCardVerificationSubmitFragment.w6().error("Couldn't start activity: " + e4);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51527a;

        public e(l lVar) {
            lVar.getClass();
            this.f51527a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51527a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51527a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public FitPayCardVerificationSubmitFragment() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new jp.a(this, 6));
        cVarRegisterForActivityResult.getClass();
        this.f51524j = cVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            a7.e activity = getActivity();
            activity.getClass();
            this.f51521g = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b) activity;
        } catch (ClassCastException unused) {
            w6().error(getActivity() + " must implement IVerificationUIListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.layout_swipe_refreshable_recycler_view, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f51520f.e();
        f fVar = this.f51516b;
        if ((fVar != null ? fVar.f60808c : null) == mp2.a.f120059c) {
            w6().debug("onPause: Broadcast Receiver should be initialized");
            androidx.fragment.app.m activity = getActivity();
            if (activity != null) {
                activity.unregisterReceiver(this.f51523i);
            }
        }
    }

    @Override // br2.h, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        kp2.b bVar = this.f51519e;
        if (bVar == null) {
            s.m("cardSubmitVerificationAdapter");
            throw null;
        }
        this.f51520f.a(bVar.f106017e.d(new hy.d(new c(this), 27), new hy.d(new g(this, 0), 28)));
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar2 = this.f51521g;
        if (bVar2 == null) {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        bVar2.x(false);
        f fVar = this.f51516b;
        if ((fVar != null ? fVar.f60808c : null) == mp2.a.f120059c) {
            w6().debug("onResume: Broadcast Receiver should be initialized");
            IntentFilter intentFilter = new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION);
            androidx.fragment.app.m activity = getActivity();
            if (activity != null) {
                a7.b.registerReceiver(activity, this.f51523i, intentFilter, SmsRetriever.SEND_PERMISSION, null, 2);
            }
            Task<Void> taskStartSmsUserConsent = SmsRetriever.getClient((Activity) requireActivity()).startSmsUserConsent(null);
            taskStartSmsUserConsent.getClass();
            taskStartSmsUserConsent.addOnSuccessListener(new hy.d(new g(this, 2), 29));
            taskStartSmsUserConsent.addOnFailureListener(new lp2.h(this, 0));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        f fVar;
        List<f> list;
        Object next;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.verify_identity);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.BACK);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a) new x1(mVarRequireActivity).b(p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.class));
        this.f51517c = aVar;
        f fVarD = aVar.f51471e.d();
        this.f51516b = fVarD;
        if (fVarD == null) {
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = this.f51517c;
            if (aVar2 == null) {
                s.m("viewModel");
                throw null;
            }
            dq2.g gVarD = aVar2.f51470d.d();
            if (gVarD == null || (list = gVarD.f60815a) == null) {
                fVar = null;
            } else {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((f) next).f60807b != mp2.b.AWAITING_VERIFICATION);
                fVar = (f) next;
            }
            this.f51516b = fVar;
        }
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        f fVar2 = this.f51516b;
        fVar2.getClass();
        this.f51519e = new kp2.b((FitPayCardVerificationActivity) activity, fVar2);
        View viewFindViewById = view2.findViewById(R.id.generic_swipe_refresh_layout);
        viewFindViewById.getClass();
        this.f51522h = (SwipeRefreshLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.generic_recycler_view);
        viewFindViewById2.getClass();
        this.f51518d = (RecyclerView) viewFindViewById2;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar3 = this.f51517c;
        if (aVar3 != null) {
            aVar3.f51469c.f(getViewLifecycleOwner(), new e(new g(this, 1)));
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    public final Logger w6() {
        return (Logger) this.f51515a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/fragment/FitPayCardVerificationSubmitFragment$a;", "", "<init>", "()V", "", "SMS_REGEX", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
