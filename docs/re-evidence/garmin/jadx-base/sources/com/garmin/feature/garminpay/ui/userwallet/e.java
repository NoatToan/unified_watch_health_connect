package com.garmin.feature.garminpay.ui.userwallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import e23.l;
import g.h;
import g22.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import ms2.g;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import ps2.w;
import tn2.n0;
import tr2.x;
import tr2.y;
import tr2.z;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/e;", "Landroidx/fragment/app/Fragment;", "Lcr2/b;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment implements cr2.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f52303k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f52304l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<q> f52305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<? extends fs2.a> f52306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f52307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s03.a f52308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f52309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f52310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComposeView f52311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f52312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j22.e f52313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.c<Intent> f52314j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements l<d.c, Unit> {
        public b(Object obj) {
            super(1, obj, e.class, "onAdapterItemClick", "onAdapterItemClick(Lcom/garmin/feature/garminpay/ui/userwallet/UserWalletAdapter$ItemClick;)V", 0);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0090  */
        @Override // e23.l
        public final Unit invoke(d.c cVar) {
            d.c cVar2 = cVar;
            cVar2.getClass();
            e eVar = (e) this.receiver;
            a aVar = e.f52303k;
            eVar.getClass();
            if (cVar2 instanceof d.c.b) {
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                if (s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get(), Boolean.TRUE)) {
                    m mVarRequireActivity = eVar.requireActivity();
                    mVarRequireActivity.getClass();
                    com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(mVarRequireActivity, false, new x(eVar, 1));
                } else {
                    d.c.b bVar = (d.c.b) cVar2;
                    q qVar = bVar.f52288a;
                    if (!w3.x.q(qVar.f179658e)) {
                        HashSet hashSet = new HashSet();
                        Iterator<T> it = eVar.f52306b.iterator();
                        while (it.hasNext()) {
                            if (!hashSet.add(((fs2.a) it.next()).f73426a)) {
                                eVar.u6(qVar);
                            }
                        }
                        is2.b bVar2 = qVar.f179660g;
                        fs2.a aVar2 = qVar.f179658e;
                        if (bVar2 == null) {
                            e0.v("Failed to navigate to card details for ", qVar.f179654a, e.f52304l);
                        } else {
                            g gVarA = w.f140538a.a(bVar2);
                            Intent intentE = gVarA != null ? gVarA.e(aVar2) : null;
                            if (intentE != null) {
                                eVar.startActivity(intentE);
                            } else {
                                e0.v("Failed to navigate to card details for ", qVar.f179654a, e.f52304l);
                            }
                        }
                    } else if (bVar.f52289b) {
                        z zVar = eVar.f52312h;
                        if (zVar != null) {
                            zVar.N4(qVar);
                        }
                    } else {
                        eVar.u6(qVar);
                    }
                }
            } else {
                if (!(cVar2 instanceof d.c.a)) {
                    u0.r();
                    return null;
                }
                eVar.f52313i.a();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52304l = gt2.b.f79005a.h("PAY#UserWalletCardListFragment");
    }

    public e() {
        j0 j0Var = j0.f134944a;
        this.f52305a = j0Var;
        this.f52306b = j0Var;
        this.f52307c = new d();
        this.f52308d = new s03.a();
        j22.e.a aVar = j22.e.f96744g;
        String name = f52304l.getName();
        name.getClass();
        this.f52313i = j22.e.a.b(aVar, name, new x(this, 0), new tk0.a(27));
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new h(), new y(this, 0));
        cVarRegisterForActivityResult.getClass();
        this.f52314j = cVarRegisterForActivityResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f52312h = (z) context;
        } catch (ClassCastException unused) {
            f52304l.warn("Activity must implement UserWalletListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Iterable<Parcelable> iterableAsList;
        Iterable<Parcelable> iterableAsList2;
        Parcelable[] parcelableArray;
        Parcelable[] parcelableArray2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (parcelableArray2 = arguments.getParcelableArray("CardListBundleKey")) == null) {
            iterableAsList = j0.f134944a;
        } else {
            iterableAsList = Arrays.asList(parcelableArray2);
            iterableAsList.getClass();
        }
        ArrayList arrayList = new ArrayList(p13.y.r(iterableAsList, 10));
        for (Parcelable parcelable : iterableAsList) {
            parcelable.getClass();
            arrayList.add((q) parcelable);
        }
        this.f52305a = arrayList;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (parcelableArray = arguments2.getParcelableArray("DeviceWalletItemBundleKey")) == null) {
            iterableAsList2 = j0.f134944a;
        } else {
            iterableAsList2 = Arrays.asList(parcelableArray);
            iterableAsList2.getClass();
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(iterableAsList2, 10));
        for (Parcelable parcelable2 : iterableAsList2) {
            parcelable2.getClass();
            arrayList2.add((fs2.a) parcelable2);
        }
        this.f52306b = arrayList2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_user_wallet_card_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.f52308d.e();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f52308d.a(this.f52307c.f52286c.d(new tr2.b(new b(this), 6), new tr2.b(new n0(12), 7)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.layout_user_wallet_recycler_view);
        viewFindViewById.getClass();
        this.f52310f = (RecyclerView) viewFindViewById;
        this.f52311g = (ComposeView) view2.findViewById(R.id.missing_payment_info_compose_container);
        eo2.d.f64794a.getClass();
        if (n.d(eo2.d.f64799f.get())) {
            RecyclerView recyclerView = this.f52310f;
            if (recyclerView == null) {
                s.m("userWalletRecyclerView");
                throw null;
            }
            recyclerView.setVisibility(8);
            eo2.d.f64797d.set(Boolean.TRUE);
            ComposeView composeView = this.f52311g;
            if (composeView != null) {
                composeView.setContent(new z3.e(1403005716, true, new tr2.w(this, 0)));
            }
        }
        RecyclerView recyclerView2 = this.f52310f;
        if (recyclerView2 == null) {
            s.m("userWalletRecyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        RecyclerView recyclerView3 = this.f52310f;
        if (recyclerView3 == null) {
            s.m("userWalletRecyclerView");
            throw null;
        }
        recyclerView3.setAdapter(this.f52307c);
        v6(false);
    }

    @Override // cr2.b
    public final void t1(boolean z14) {
        this.f52309e = z14;
        v6(z14);
    }

    public final void u6(q qVar) {
        is2.b bVar = qVar.f179660g;
        String str = qVar.f179661h;
        if (bVar != null && str != null) {
            g gVarA = w.f140538a.a(bVar);
            Intent intentK = gVarA != null ? gVarA.k(str, qVar) : null;
            if (intentK != null) {
                this.f52314j.a(intentK, null);
                return;
            }
        }
        e0.v("navigateToCardDetails: Missing required details for cardItem ", qVar.f179658e.f73426a, f52304l);
    }

    public final void v6(boolean z14) {
        RecyclerView recyclerView;
        d.b bVar = d.f52283d;
        List<q> list = this.f52305a;
        boolean z15 = this.f52309e;
        bVar.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new d.g.b((q) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (z15) {
            arrayList2.add(d.g.a.f52300a);
        }
        arrayList2.addAll(arrayList);
        d.f fVar = new d.f(arrayList2);
        d dVar = this.f52307c;
        dVar.getClass();
        Logger logger = d.f52284e;
        StringBuilder sb3 = new StringBuilder("submitList(");
        List<d.g> list2 = fVar.f52299a;
        sb3.append(list2);
        sb3.append(")");
        logger.debug(sb3.toString());
        dVar.t(list2);
        if (!z14 || (recyclerView = this.f52310f) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(0);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/e$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "CARD_LIST_BUNDLE_KEY", "Ljava/lang/String;", "DEVICE_WALLET_ITEM_KEY", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
