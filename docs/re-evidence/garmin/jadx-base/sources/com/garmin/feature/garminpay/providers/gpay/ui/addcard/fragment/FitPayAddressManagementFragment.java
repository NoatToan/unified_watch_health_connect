package com.garmin.feature.garminpay.providers.gpay.ui.addcard.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import br2.h;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.workouts.data.model.e0;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.fragment.FitPayAddressManagementFragment;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import d53.w;
import e23.l;
import fo2.j;
import fo2.k0;
import gh2.i;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import lc.u0;
import nj2.p;
import o13.m;
import o13.n;
import o13.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/fragment/FitPayAddressManagementFragment;", "Lbr2/h;", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayAddressManagementFragment extends h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f51413t = new b(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t f51414v = m.b(new com.google.accompanist.drawablepainter.a(6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dp2.b f51417c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f51419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51420f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ap2.h f51422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public yq2.a f51423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bp2.c f51424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f51425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SwipeRefreshLayout f51426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f51427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f51428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f51429o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f51415a = m.a(n.NONE, new g(this, null, new f(this), null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s03.a f51416b = new s03.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<fj2.a> f51418d = j0.f134944a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f51421g = a.ADD_CARD;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f51430p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f51431q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f51432r = j.SELECT_MODE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/fragment/FitPayAddressManagementFragment$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        ADD_CARD,
        MISSING_ADDRESS,
        ONE_TAP,
        PAYMENT_CARD_DETAILS
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f51439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f51440c;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ADD_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ONE_TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.MISSING_ADDRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.PAYMENT_CARD_DETAILS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f51438a = iArr;
            int[] iArr2 = new int[j.values().length];
            try {
                iArr2[j.EDIT_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[j.SELECT_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f51439b = iArr2;
            int[] iArr3 = new int[bp2.c.a.values().length];
            try {
                iArr3[bp2.c.a.ITEM_CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[bp2.c.a.ITEM_LONG_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[bp2.c.a.REMOVE_ICON_CLICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f51440c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements l<bp2.c.d, Unit> {
        public d(Object obj) {
            super(1, obj, FitPayAddressManagementFragment.class, "onAdapterItemClick", "onAdapterItemClick(Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/adapter/FitPayAddressListAdapter$ItemClick;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(bp2.c.d dVar) {
            String addressId;
            String addressId2;
            bp2.c.d dVar2 = dVar;
            dVar2.getClass();
            FitPayAddressManagementFragment fitPayAddressManagementFragment = (FitPayAddressManagementFragment) this.receiver;
            b bVar = FitPayAddressManagementFragment.f51413t;
            fitPayAddressManagementFragment.getClass();
            b bVar2 = FitPayAddressManagementFragment.f51413t;
            b.a(bVar2).debug("onAdapterItemClick: Items selected, mode:" + fitPayAddressManagementFragment.f51432r);
            if (dVar2 instanceof bp2.c.d.b) {
                bp2.c.d.b bVar3 = (bp2.c.d.b) dVar2;
                fj2.a aVar = bVar3.f19454a;
                int i14 = c.f51440c[bVar3.f19456c.ordinal()];
                if (i14 == 1) {
                    int i15 = c.f51439b[fitPayAddressManagementFragment.f51432r.ordinal()];
                    if (i15 == 1) {
                        FitPayAddressManagementFragment.C6(fitPayAddressManagementFragment, "EditAddressRoute", aVar.getAddressId(), null, 4);
                    } else if (i15 == 2) {
                        boolean z14 = aVar.f71863r;
                        aVar.f71863r = !z14;
                        if (!z14) {
                            if (fitPayAddressManagementFragment.f51424j == null) {
                                s.m("fitPayAddressListAdapter");
                                throw null;
                            }
                            for (fj2.a aVar2 : bp2.c.f19440g) {
                                if (!s.g(aVar2.getAddressId(), aVar.getAddressId())) {
                                    aVar2.f71863r = false;
                                }
                            }
                        }
                        bp2.c cVar = fitPayAddressManagementFragment.f51424j;
                        if (cVar == null) {
                            s.m("fitPayAddressListAdapter");
                            throw null;
                        }
                        cVar.notifyDataSetChanged();
                        fp2.c cVar2 = fp2.c.f73188a;
                        if (fitPayAddressManagementFragment.f51424j == null) {
                            s.m("fitPayAddressListAdapter");
                            throw null;
                        }
                        List<fj2.a> list = bp2.c.f19440g;
                        cVar2.getClass();
                        fitPayAddressManagementFragment.w6(fp2.c.a(list) != null);
                        nj2.a aVarZ6 = fitPayAddressManagementFragment.z6();
                        if (fitPayAddressManagementFragment.f51424j == null) {
                            s.m("fitPayAddressListAdapter");
                            throw null;
                        }
                        fj2.a aVarA = fp2.c.a(bp2.c.f19440g);
                        aVarZ6.f126251c = aVarA != null ? aVarA.getAddressId() : null;
                    }
                } else if (i14 != 2) {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    if (fitPayAddressManagementFragment.f51432r == j.EDIT_MODE && (addressId2 = aVar.getAddressId()) != null) {
                        fitPayAddressManagementFragment.y6(addressId2, aVar.getPhoneNumberId());
                    }
                } else if (fitPayAddressManagementFragment.f51432r == j.SELECT_MODE && (addressId = aVar.getAddressId()) != null) {
                    fitPayAddressManagementFragment.y6(addressId, aVar.getPhoneNumberId());
                }
            } else {
                if (!(dVar2 instanceof bp2.c.d.a)) {
                    u0.r();
                    return null;
                }
                b.a(bVar2).debug("onAdapterItemClick: go to Customer Management Screen");
                FitPayAddressManagementFragment.C6(fitPayAddressManagementFragment, "AddAddressRoute", null, null, 6);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51441a;

        public e(l lVar) {
            lVar.getClass();
            this.f51441a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51441a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51441a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f51442a;

        public f(Fragment fragment) {
            this.f51442a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f51442a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<nj2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f51443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f51444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f51445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f51446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f51447e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f51443a = fragment;
            this.f51444b = qualifier;
            this.f51445c = aVar;
            this.f51446d = aVar2;
            this.f51447e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, nj2.a] */
        @Override // e23.a
        public final nj2.a invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f51445c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f51443a;
            e23.a aVar = this.f51446d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(nj2.a.class), f189591b, null, defaultViewModelCreationExtras, this.f51444b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f51447e, 4, null);
        }
    }

    public static void C6(FitPayAddressManagementFragment fitPayAddressManagementFragment, String str, String str2, String str3, int i14) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 4) != 0) {
            str3 = null;
        }
        fitPayAddressManagementFragment.getClass();
        b.a(f51413t).debug("initializeCustomerManagementScreen");
        yq2.a aVar = fitPayAddressManagementFragment.f51423i;
        if (aVar != null) {
            aVar.e8(str, str2, str3);
        } else {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
    }

    public final void A6() {
        SwipeRefreshLayout swipeRefreshLayout = this.f51426l;
        if (swipeRefreshLayout == null) {
            s.m("swipeToRefreshLayout");
            throw null;
        }
        swipeRefreshLayout.setEnabled(false);
        RecyclerView recyclerView = this.f51425k;
        if (recyclerView == null) {
            s.m("addressesList");
            throw null;
        }
        bp2.c cVar = this.f51424j;
        if (cVar == null) {
            s.m("fitPayAddressListAdapter");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(null);
        int i14 = c.f51438a[this.f51421g.ordinal()];
        if (i14 == 1 || i14 == 2) {
            Button button = this.f51428n;
            if (button == null) {
                s.m("nextButton");
                throw null;
            }
            button.setVisibility(0);
            Button button2 = this.f51428n;
            if (button2 == null) {
                s.m("nextButton");
                throw null;
            }
            button2.setText(getString(R.string.common_button_next));
        } else if (i14 == 3) {
            Button button3 = this.f51428n;
            if (button3 == null) {
                s.m("nextButton");
                throw null;
            }
            button3.setVisibility(0);
            Button button4 = this.f51428n;
            if (button4 == null) {
                s.m("nextButton");
                throw null;
            }
            button4.setText(getString(R.string.common_button_done));
        } else {
            if (i14 != 4) {
                u0.r();
                return;
            }
            Button button5 = this.f51428n;
            if (button5 == null) {
                s.m("nextButton");
                throw null;
            }
            button5.setVisibility(8);
        }
        Button button6 = this.f51428n;
        if (button6 == null) {
            s.m("nextButton");
            throw null;
        }
        final int i15 = 0;
        button6.setOnClickListener(new View.OnClickListener(this) { // from class: cp2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FitPayAddressManagementFragment f54926b;

            {
                this.f54926b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        FitPayAddressManagementFragment.b bVar = FitPayAddressManagementFragment.f51413t;
                        Logger loggerA = FitPayAddressManagementFragment.b.a(bVar);
                        FitPayAddressManagementFragment fitPayAddressManagementFragment = this.f54926b;
                        loggerA.debug("handleUserClickSubmitButton: " + fitPayAddressManagementFragment.f51421g);
                        FitPayAddressManagementFragment.a aVar = fitPayAddressManagementFragment.f51421g;
                        if (aVar != FitPayAddressManagementFragment.a.ADD_CARD && aVar != FitPayAddressManagementFragment.a.ONE_TAP) {
                            FitPayAddressManagementFragment.b.a(bVar).debug("handleUserClickSubmitButton: fitPayCardInformationModel is null");
                            NavHostFragment.f10124e.getClass();
                            NavHostFragment.a.a(fitPayAddressManagementFragment).m();
                            return;
                        }
                        if (fitPayAddressManagementFragment.f51424j == null) {
                            s.m("fitPayAddressListAdapter");
                            throw null;
                        }
                        if (bp2.c.f19440g.isEmpty()) {
                            fitPayAddressManagementFragment.w6(false);
                            return;
                        }
                        fp2.c cVar2 = fp2.c.f73188a;
                        if (fitPayAddressManagementFragment.f51424j == null) {
                            s.m("fitPayAddressListAdapter");
                            throw null;
                        }
                        List<fj2.a> list = bp2.c.f19440g;
                        cVar2.getClass();
                        fj2.a aVarA = fp2.c.a(list);
                        if (aVarA == null) {
                            fitPayAddressManagementFragment.w6(false);
                            return;
                        }
                        yq2.a aVar2 = fitPayAddressManagementFragment.f51423i;
                        if (aVar2 == null) {
                            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        aVar2.x(true);
                        String phoneNumberId = aVarA.getPhoneNumberId();
                        if (phoneNumberId == null) {
                            FitPayAddressManagementFragment.b.a(bVar).error("handleUserClickSubmitButton: phoneNumberId cannot be null");
                            return;
                        } else {
                            fitPayAddressManagementFragment.z6().N4(phoneNumberId, false);
                            fitPayAddressManagementFragment.z6().f126265q.f(fitPayAddressManagementFragment.getViewLifecycleOwner(), new FitPayAddressManagementFragment.e(new cn1.d(7, aVarA, fitPayAddressManagementFragment)));
                            return;
                        }
                    default:
                        FitPayAddressManagementFragment.C6(this.f54926b, "AddAddressRoute", null, null, 6);
                        return;
                }
            }
        });
        Button button7 = this.f51429o;
        if (button7 == null) {
            s.m("addNewAddressButton");
            throw null;
        }
        button7.setEnabled(true);
        Button button8 = this.f51429o;
        if (button8 == null) {
            s.m("addNewAddressButton");
            throw null;
        }
        button8.setText(getString(R.string.pay_add_new_address));
        Button button9 = this.f51429o;
        if (button9 == null) {
            s.m("addNewAddressButton");
            throw null;
        }
        final int i16 = 1;
        button9.setOnClickListener(new View.OnClickListener(this) { // from class: cp2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FitPayAddressManagementFragment f54926b;

            {
                this.f54926b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        FitPayAddressManagementFragment.b bVar = FitPayAddressManagementFragment.f51413t;
                        Logger loggerA = FitPayAddressManagementFragment.b.a(bVar);
                        FitPayAddressManagementFragment fitPayAddressManagementFragment = this.f54926b;
                        loggerA.debug("handleUserClickSubmitButton: " + fitPayAddressManagementFragment.f51421g);
                        FitPayAddressManagementFragment.a aVar = fitPayAddressManagementFragment.f51421g;
                        if (aVar != FitPayAddressManagementFragment.a.ADD_CARD && aVar != FitPayAddressManagementFragment.a.ONE_TAP) {
                            FitPayAddressManagementFragment.b.a(bVar).debug("handleUserClickSubmitButton: fitPayCardInformationModel is null");
                            NavHostFragment.f10124e.getClass();
                            NavHostFragment.a.a(fitPayAddressManagementFragment).m();
                            return;
                        }
                        if (fitPayAddressManagementFragment.f51424j == null) {
                            s.m("fitPayAddressListAdapter");
                            throw null;
                        }
                        if (bp2.c.f19440g.isEmpty()) {
                            fitPayAddressManagementFragment.w6(false);
                            return;
                        }
                        fp2.c cVar2 = fp2.c.f73188a;
                        if (fitPayAddressManagementFragment.f51424j == null) {
                            s.m("fitPayAddressListAdapter");
                            throw null;
                        }
                        List<fj2.a> list = bp2.c.f19440g;
                        cVar2.getClass();
                        fj2.a aVarA = fp2.c.a(list);
                        if (aVarA == null) {
                            fitPayAddressManagementFragment.w6(false);
                            return;
                        }
                        yq2.a aVar2 = fitPayAddressManagementFragment.f51423i;
                        if (aVar2 == null) {
                            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        aVar2.x(true);
                        String phoneNumberId = aVarA.getPhoneNumberId();
                        if (phoneNumberId == null) {
                            FitPayAddressManagementFragment.b.a(bVar).error("handleUserClickSubmitButton: phoneNumberId cannot be null");
                            return;
                        } else {
                            fitPayAddressManagementFragment.z6().N4(phoneNumberId, false);
                            fitPayAddressManagementFragment.z6().f126265q.f(fitPayAddressManagementFragment.getViewLifecycleOwner(), new FitPayAddressManagementFragment.e(new cn1.d(7, aVarA, fitPayAddressManagementFragment)));
                            return;
                        }
                    default:
                        FitPayAddressManagementFragment.C6(this.f54926b, "AddAddressRoute", null, null, 6);
                        return;
                }
            }
        });
        yq2.a aVar = this.f51423i;
        if (aVar != null) {
            aVar.x(false);
        } else {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
    }

    public final void E6() {
        if (!this.f51418d.isEmpty()) {
            A6();
        } else {
            this.f51420f = true;
            C6(this, "AddAddressRoute", null, getResources().getString(R.string.add_billing_address), 2);
        }
    }

    public final void F6() {
        nj2.a aVarZ6 = z6();
        aVarZ6.getClass();
        ge1.b.T(v1.a(aVarZ6), null, null, new p(aVarZ6, null), 3);
        nj2.a aVarZ7 = z6();
        aVarZ7.getClass();
        ge1.b.T(v1.a(aVarZ7), null, null, new nj2.m(aVarZ7, null), 3);
        z6().f126264p.f(getViewLifecycleOwner(), new e(new cp2.b(this, 1)));
    }

    public final void G6() {
        requireActivity().invalidateOptionsMenu();
        bp2.c cVar = this.f51424j;
        if (cVar == null) {
            s.m("fitPayAddressListAdapter");
            throw null;
        }
        j jVar = this.f51432r;
        jVar.getClass();
        cVar.f19443c = jVar;
        bp2.c cVar2 = this.f51424j;
        if (cVar2 != null) {
            cVar2.notifyDataSetChanged();
        } else {
            s.m("fitPayAddressListAdapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_fit_pay_address_management, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f51416b.e();
    }

    @Override // br2.h, androidx.fragment.app.Fragment
    public final void onResume() {
        Object next;
        Object next2;
        k0 address;
        k0 address2;
        super.onResume();
        if (this.f51420f) {
            this.f51420f = false;
            NavHostFragment.f10124e.getClass();
            NavHostFragment.a.a(this).m();
        }
        this.f51432r = j.SELECT_MODE;
        G6();
        F6();
        Iterator<T> it = this.f51418d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((fj2.a) next).f71863r);
        if (((fj2.a) next) == null) {
            w6(false);
        }
        dp2.b bVar = this.f51417c;
        if (((bVar == null || (address2 = bVar.getAddress()) == null) ? null : address2.getAddressId()) != null) {
            nj2.a aVarZ6 = z6();
            dp2.b bVar2 = this.f51417c;
            aVarZ6.f126251c = (bVar2 == null || (address = bVar2.getAddress()) == null) ? null : address.getAddressId();
        }
        cj2.a.f27739a.getClass();
        AtomicReference<String> atomicReference = cj2.a.f27741c;
        if (g22.n.d(atomicReference.get())) {
            z6().f126251c = atomicReference.get();
            atomicReference.set(null);
            if (this.f51421g != a.ADD_CARD) {
                eo2.d.f64794a.getClass();
                if (eo2.d.f64799f.get() != null) {
                    String str = eo2.d.f64799f.get();
                    str.getClass();
                    if (!w.z(str, "connectiq://", false)) {
                        NavHostFragment.f10124e.getClass();
                        NavHostFragment.a.a(this).m();
                    }
                }
            }
        }
        if (s.g(z6().f126251c, cj2.a.f27742d.get())) {
            z6().f126251c = null;
        }
        if (this.f51424j == null) {
            s.m("fitPayAddressListAdapter");
            throw null;
        }
        Iterator<T> it3 = bp2.c.f19440g.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!s.g(((fj2.a) next2).getAddressId(), z6().f126251c));
        fj2.a aVar = (fj2.a) next2;
        if (aVar != null) {
            aVar.f71863r = true;
            w6(true);
        }
        bp2.c cVar = this.f51424j;
        if (cVar != null) {
            this.f51416b.a(cVar.f19445e.d(new com.mapbox.maps.renderer.e(new d(this), 3), new com.mapbox.maps.renderer.e(new com.google.maps.android.compose.clustering.d(7), 4)));
        } else {
            s.m("fitPayAddressListAdapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws IllegalAccessException {
        a aVar;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.pay_billing_address);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.BACK);
        a7.e activity = getActivity();
        yq2.a aVar2 = activity instanceof yq2.a ? (yq2.a) activity : null;
        if (aVar2 == null) {
            eo2.d.f64794a.getClass();
            if (g22.n.d(eo2.d.f64799f.get())) {
                wr2.j.f186862a.getClass();
                wr2.j.a("FitPayAddressManagementFragment.onViewCreated()", "IllegalAccessException");
            }
            com.nimbusds.jose.shaded.gson.internal.a.t("Activity should not be null");
            return;
        }
        this.f51423i = aVar2;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        ap2.h hVar = (ap2.h) new x1(mVarRequireActivity).b(s0.f105811a.b(ap2.h.class));
        this.f51422h = hVar;
        this.f51417c = hVar.f11699c.get();
        if (getActivity() instanceof FitPayAddCardActivity) {
            if (this.f51417c != null) {
                aVar = a.ADD_CARD;
            } else {
                ap2.h hVar2 = this.f51422h;
                if (hVar2 == null) {
                    s.m("fitPayAddCardViewModel");
                    throw null;
                }
                aVar = hVar2.f11700d.get() == gp2.g.VERIFY_CREDIT_CARD ? a.ONE_TAP : a.MISSING_ADDRESS;
            }
            this.f51421g = aVar;
        } else if (getActivity() instanceof PaymentCardDetailsActivity) {
            this.f51421g = a.PAYMENT_CARD_DETAILS;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("addressId");
        }
        yq2.a aVar3 = this.f51423i;
        if (aVar3 == null) {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        boolean z14 = true;
        aVar3.x(true);
        androidx.fragment.app.m mVarRequireActivity2 = requireActivity();
        mVarRequireActivity2.getClass();
        this.f51424j = new bp2.c(mVarRequireActivity2);
        g22.e.k(this, new cp2.d(this), b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.generic_swipe_refresh_layout);
        viewFindViewById.getClass();
        this.f51426l = (SwipeRefreshLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.addresses_list);
        viewFindViewById2.getClass();
        this.f51425k = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.button_next);
        viewFindViewById3.getClass();
        this.f51428n = (Button) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.empty_layout);
        viewFindViewById4.getClass();
        this.f51427m = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.button_add_new_address);
        viewFindViewById5.getClass();
        this.f51429o = (Button) viewFindViewById5;
        int i14 = c.f51438a[this.f51421g.ordinal()];
        if (i14 == 1) {
            wr2.a.f186828a.getClass();
            try {
                zf.b.r();
                i iVar = i.f77458c;
                boolean zC = iVar.a().f77477b.c("enable_address_button");
                GsonUtil.f47252a.getClass();
                Gson gson = GsonUtil.f47253b;
                zf.b.r();
                String json = gson.toJson(iVar.a().f77477b.h("address_verification_system_country_list"));
                json.getClass();
                String country = Locale.getDefault().getCountry();
                country.getClass();
                boolean z15 = w.z(json, country, false);
                if (!zC && z15) {
                    z14 = false;
                }
            } catch (Exception unused) {
            }
            this.f51419e = z14;
            w6(z14);
            boolean zIsEmpty = this.f51418d.isEmpty();
            LinearLayout linearLayout = this.f51427m;
            if (zIsEmpty) {
                if (linearLayout == null) {
                    s.m("emptyLayout");
                    throw null;
                }
                linearLayout.setVisibility(0);
                RecyclerView recyclerView = this.f51425k;
                if (recyclerView == null) {
                    s.m("addressesList");
                    throw null;
                }
                recyclerView.setVisibility(8);
                this.f51432r = j.EMPTY_MODE;
                G6();
            } else {
                if (linearLayout == null) {
                    s.m("emptyLayout");
                    throw null;
                }
                linearLayout.setVisibility(8);
                RecyclerView recyclerView2 = this.f51425k;
                if (recyclerView2 == null) {
                    s.m("addressesList");
                    throw null;
                }
                recyclerView2.setVisibility(0);
                bp2.c cVar = this.f51424j;
                if (cVar == null) {
                    s.m("fitPayAddressListAdapter");
                    throw null;
                }
                bp2.c.C0291c c0291c = bp2.c.f19439f;
                List<fj2.a> list = this.f51418d;
                String str = z6().f126251c;
                c0291c.getClass();
                cVar.t(bp2.c.C0291c.a(str, list));
            }
            A6();
        } else if (i14 == 2) {
            List<fj2.a> listD = z6().f126262n.d();
            if (listD == null) {
                listD = j0.f134944a;
            }
            this.f51418d = listD;
            E6();
        } else if (i14 != 3 && i14 != 4) {
            u0.r();
            return;
        } else {
            z6().M4();
            z6().f126262n.f(getViewLifecycleOwner(), new e(new cp2.b(this, 0)));
        }
        z6().f126259k.f(getViewLifecycleOwner(), new e(new cp2.b(this, 3)));
        z6().f126258j.f(getViewLifecycleOwner(), new e(new cp2.b(this, 4)));
    }

    public final void w6(boolean z14) {
        Button button = this.f51428n;
        if (button == null) {
            s.m("nextButton");
            throw null;
        }
        button.setEnabled(z14);
        Button button2 = this.f51428n;
        if (button2 != null) {
            button2.setClickable(z14);
        } else {
            s.m("nextButton");
            throw null;
        }
    }

    public final void y6(String str, String str2) {
        o13.p pVar = new o13.p(getString(R.string.lbl_remove), new c50.f(this, 11, str, str2));
        o13.p pVar2 = new o13.p(getString(R.string.lbl_cancel), new e0(6));
        br2.c cVar = br2.c.f19585a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String string = getResources().getString(R.string.pay_remove_address);
        string.getClass();
        String string2 = getResources().getString(R.string.pay_remove_address_message);
        string2.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, contextRequireContext, string, string2, pVar, pVar2, null, true, SyslogConstants.LOG_LOCAL4);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final nj2.a z6() {
        return (nj2.a) this.f51415a.getValue();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/fragment/FitPayAddressManagementFragment$b;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final Logger a(b bVar) {
            bVar.getClass();
            return (Logger) FitPayAddressManagementFragment.f51414v.getValue();
        }

        private b() {
        }
    }
}
