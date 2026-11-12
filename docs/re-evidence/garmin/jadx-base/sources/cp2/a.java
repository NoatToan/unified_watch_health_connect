package cp2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m;
import androidx.lifecycle.x1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcp2/a;", "Lbr2/h;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends br2.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1196a f54915g = new C1196a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f54916h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ap2.h f54917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yq2.a f54918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bp2.a f54919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<zo2.a> f54920d = j0.f134944a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s03.a f54921e = new s03.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f54922f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<bp2.a.e, Unit> {
        public b(Object obj) {
            super(1, obj, a.class, "onAdapterItemClick", "onAdapterItemClick(Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/adapter/FitPayAddCardOptionListAdapter$ItemClick;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(bp2.a.e eVar) {
            bp2.a.e eVar2 = eVar;
            eVar2.getClass();
            a aVar = (a) this.receiver;
            if (eVar2 instanceof bp2.a.e.b) {
                ap2.h hVar = aVar.f54917a;
                if (hVar == null) {
                    s.m("fitPayAddCardViewModel");
                    throw null;
                }
                hVar.f11700d.set(gp2.g.VERIFY_CREDIT_CARD);
                yq2.a aVar2 = aVar.f54918b;
                if (aVar2 == null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                aVar2.x(true);
                yq2.a aVar3 = aVar.f54918b;
                if (aVar3 == null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                zo2.a aVar4 = ((bp2.a.e.b) eVar2).f19431a;
                aVar3.B3(aVar4.getPaymentCardId(), aVar4.getCreditCardImage(), aVar4.getCardType());
            } else {
                C1196a c1196a = a.f54915g;
                aVar.getClass();
                if (!eVar2.equals(bp2.a.e.C0288a.f19430a)) {
                    u0.r();
                    return null;
                }
                yq2.a aVar5 = aVar.f54918b;
                if (aVar5 == null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                aVar5.a0();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f54916h = gt2.b.f79005a.h("PAY#FitPayAddCardOptionsFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f54919c = new bp2.a(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_fit_pay_add_card_options, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.f54921e.e();
        super.onPause();
    }

    @Override // br2.h, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        bp2.a aVar = this.f54919c;
        if (aVar == null) {
            s.m("addCardOptionsAdapter");
            throw null;
        }
        this.f54921e.a(aVar.f19423c.d(new com.mapbox.maps.renderer.e(new b(this), 1), new com.mapbox.maps.renderer.e(new com.google.maps.android.compose.clustering.d(6), 2)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws IllegalAccessException {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.wallet_title_add_a_card);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.UP);
        a7.e activity = getActivity();
        yq2.a aVar = activity instanceof yq2.a ? (yq2.a) activity : null;
        if (aVar == null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("Activity should not be null");
            return;
        }
        this.f54918b = aVar;
        requireActivity().getIntent().getStringExtra("extra.payment.card.id");
        yq2.a aVar2 = this.f54918b;
        if (aVar2 == null) {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        aVar2.x(true);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        ap2.h hVar = (ap2.h) new x1(mVarRequireActivity).b(s0.f105811a.b(ap2.h.class));
        this.f54917a = hVar;
        List<zo2.a> listD = hVar.f11708l.d();
        String str = "paymentCards size: " + (listD != null ? Integer.valueOf(listD.size()) : null);
        Logger logger = f54916h;
        logger.debug(str);
        yq2.a aVar3 = this.f54918b;
        if (aVar3 == null) {
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        aVar3.x(false);
        View viewFindViewById = view2.findViewById(R.id.generic_recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f54922f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        RecyclerView recyclerView2 = this.f54922f;
        if (recyclerView2 == null) {
            s.m("genericRecyclerView");
            throw null;
        }
        bp2.a aVar4 = this.f54919c;
        if (aVar4 == null) {
            s.m("addCardOptionsAdapter");
            throw null;
        }
        recyclerView2.setAdapter(aVar4);
        logger.debug("updateCardList: " + (listD != null ? Integer.valueOf(listD.size()) : null));
        if (listD != null) {
            this.f54920d = listD;
        }
        bp2.a.d dVar = bp2.a.f19420d;
        List<zo2.a> list = this.f54920d;
        dVar.getClass();
        list.getClass();
        bp2.a.f19421e.debug("createAdapterState: " + list.size());
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new bp2.a.b.d((zo2.a) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bp2.a.b.c.f19427a);
        arrayList2.add(bp2.a.b.C0287b.f19426a);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add((bp2.a.b.d) it3.next());
            arrayList2.add(bp2.a.b.C0287b.f19426a);
        }
        arrayList2.add(bp2.a.b.c.f19427a);
        bp2.a.b.C0287b c0287b = bp2.a.b.C0287b.f19426a;
        arrayList2.add(c0287b);
        arrayList2.add(bp2.a.b.C0286a.f19425a);
        arrayList2.add(c0287b);
        bp2.a.f19421e.debug("displayList: " + arrayList2.size());
        bp2.a.c cVar = new bp2.a.c(arrayList2);
        bp2.a aVar5 = this.f54919c;
        if (aVar5 == null) {
            s.m("addCardOptionsAdapter");
            throw null;
        }
        aVar5.t(cVar.f19429a);
        RecyclerView recyclerView3 = this.f54922f;
        if (recyclerView3 != null) {
            recyclerView3.smoothScrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: cp2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcp2/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1196a {
        public /* synthetic */ C1196a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1196a() {
        }
    }
}
