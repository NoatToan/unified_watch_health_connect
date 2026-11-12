package cp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
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
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcp2/g;", "Lbr2/h;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends br2.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f54953g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f54954h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ap2.h f54955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yq2.a f54956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<zo2.a> f54957c = j0.f134944a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bp2.d f54958d = new bp2.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s03.a f54959e = new s03.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f54960f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<bp2.d.b, Unit> {
        public b(Object obj) {
            super(1, obj, g.class, "onAdapterItemClick", "onAdapterItemClick(Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/adapter/FitPayPaymentCardsListAdapter$ItemClick;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(bp2.d.b bVar) {
            bp2.d.b bVar2 = bVar;
            bVar2.getClass();
            g gVar = (g) this.receiver;
            a aVar = g.f54953g;
            gVar.getClass();
            if (!(bVar2 instanceof bp2.d.b.a)) {
                u0.r();
                return null;
            }
            zo2.a aVar2 = ((bp2.d.b.a) bVar2).f19461a;
            ap2.h hVar = gVar.f54955a;
            if (hVar == null) {
                s.m("fitPayAddCardViewModel");
                throw null;
            }
            hVar.f11700d.set(gp2.g.VERIFY_CREDENTIAL);
            yq2.a aVar3 = gVar.f54956b;
            if (aVar3 != null) {
                aVar3.v4(aVar2.getPaymentCardId());
                return Unit.INSTANCE;
            }
            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f54954h = gt2.b.f79005a.h("PAY#ECOM#PaymentCardsListFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        m activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            intent.getStringExtra("extra.payment.card.id");
        }
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f54955a = (ap2.h) new x1(mVarRequireActivity).a(ap2.h.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_fit_pay_payment_cards_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.f54959e.e();
        super.onPause();
    }

    @Override // br2.h, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f54959e.a(this.f54958d.f19460c.d(new com.mapbox.maps.renderer.e(new b(this), 5), new com.mapbox.maps.renderer.e(new com.google.maps.android.compose.clustering.d(8), 6)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws IllegalAccessException {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.select_a_card);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.BACK);
        a7.e activity = getActivity();
        yq2.a aVar = activity instanceof yq2.a ? (yq2.a) activity : null;
        if (aVar == null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("Activity should not be null");
            return;
        }
        this.f54956b = aVar;
        g22.e.k(this, new h(this), b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.payment_cards_list_recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f54960f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        RecyclerView recyclerView2 = this.f54960f;
        if (recyclerView2 == null) {
            s.m("paymentsCardListRecyclerView");
            throw null;
        }
        bp2.d dVar = this.f54958d;
        recyclerView2.setAdapter(dVar);
        ap2.h hVar = this.f54955a;
        if (hVar == null) {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
        List<zo2.a> listD = hVar.f11710n.d();
        if (listD != null) {
            this.f54957c = listD;
            bp2.d.f19457d.getClass();
            ArrayList arrayList = new ArrayList(y.r(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(new bp2.d.e.a((zo2.a) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            bp2.d.f fVar = new bp2.d.f(arrayList2);
            dVar.getClass();
            Logger logger = bp2.d.f19458e;
            StringBuilder sb3 = new StringBuilder("submitList(");
            List<bp2.d.e> list = fVar.f19467a;
            sb3.append(list);
            sb3.append(")");
            logger.debug(sb3.toString());
            dVar.t(list);
            yq2.a aVar2 = this.f54956b;
            if (aVar2 != null) {
                aVar2.x(false);
            } else {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcp2/g$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
