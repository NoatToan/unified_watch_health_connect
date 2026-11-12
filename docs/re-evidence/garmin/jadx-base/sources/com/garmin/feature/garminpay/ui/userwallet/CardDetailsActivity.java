package com.garmin.feature.garminpay.ui.userwallet;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.g0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.userwallet.CardDetailsActivity;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import e23.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import ms2.g;
import o13.p;
import o62.b0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.j0;
import ps2.w;
import tn2.n0;
import tn2.p0;
import vb.h;
import vn2.b1;
import vn2.t0;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/CardDetailsActivity;", "Lhn2/c;", "Lcr2/a;", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CardDetailsActivity extends hn2.c implements cr2.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f52166n = new b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f52167o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s03.a f52168g = new s03.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MenuItem f52169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public vr2.c f52170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.garmin.feature.garminpay.ui.userwallet.a f52171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f52172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SwipeRefreshLayout f52173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f52174m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/CardDetailsActivity$a;", "Landroid/os/Parcelable;", "", "canRemoveCard", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C1103a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f52175a;

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.userwallet.CardDetailsActivity$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1103a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public a(boolean z14) {
            this.f52175a = z14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f52175a == ((a) obj).f52175a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f52175a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("CardDetailsOptions(canRemoveCard=", ")", this.f52175a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f52175a ? 1 : 0);
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52176a;

        static {
            int[] iArr = new int[wr2.q.b.values().length];
            try {
                iArr[wr2.q.b.REMOVED_COMPLETELY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wr2.q.b.REMOVED_PARTIALLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wr2.q.b.REMOVE_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wr2.q.b.REMOVE_PRECONDITIONS_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[wr2.q.b.ALREADY_REMOVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[wr2.q.b.API_UNDER_MAINTENANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f52176a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements l<com.garmin.feature.garminpay.ui.userwallet.a.e, Unit> {
        public d(Object obj) {
            super(1, obj, CardDetailsActivity.class, "onAdapterItemClick", "onAdapterItemClick(Lcom/garmin/feature/garminpay/ui/userwallet/CardDetailsAdapter$ItemClick;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(com.garmin.feature.garminpay.ui.userwallet.a.e eVar) {
            Object next;
            com.garmin.feature.garminpay.ui.userwallet.a.e eVar2 = eVar;
            eVar2.getClass();
            CardDetailsActivity cardDetailsActivity = (CardDetailsActivity) this.receiver;
            Logger logger = CardDetailsActivity.f52167o;
            vr2.c cVar = cardDetailsActivity.f52170i;
            if (cVar == null) {
                s.m("cardDetailsViewModel");
                throw null;
            }
            if (!s.g(cVar.f179573k.d(), Boolean.TRUE)) {
                if (!(eVar2 instanceof com.garmin.feature.garminpay.ui.userwallet.a.e.C1107a)) {
                    u0.r();
                    return null;
                }
                vr2.c cVar2 = cardDetailsActivity.f52170i;
                if (cVar2 == null) {
                    s.m("cardDetailsViewModel");
                    throw null;
                }
                Iterator it = cVar2.f179567e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    q qVar = (q) next;
                    if (qVar.f179658e.f73431f == ((com.garmin.feature.garminpay.ui.userwallet.a.e.C1107a) eVar2).f52250a.f19599a) {
                        String str = qVar.f179656c;
                        q qVar2 = cardDetailsActivity.f52172k;
                        if (qVar2 == null) {
                            s.m("selectedCardModel");
                            throw null;
                        }
                        if (s.g(str, qVar2.f179656c)) {
                            break;
                        }
                    }
                }
                q qVar3 = (q) next;
                if (qVar3 != null) {
                    is2.b bVar = qVar3.f179660g;
                    if (bVar != null) {
                        g gVarA = w.f140538a.a(bVar);
                        if (gVarA == null) {
                            logger.error("Cannot get provider for " + bVar);
                        } else {
                            cardDetailsActivity.startActivity(gVarA.e(qVar3.f179658e));
                        }
                    }
                } else {
                    logger.debug("onAdapterItemClick(): selectedCard is null!");
                    br2.c.f19585a.g(null, cardDetailsActivity);
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52167o = gt2.b.f79005a.h("PAY#CardDetailsActivity");
    }

    @Override // cr2.a
    public final void Q5(wr2.q.b bVar, String str, List<Long> list, List<String> list2) {
        bVar.getClass();
        int i14 = c.f52176a[bVar.ordinal()];
        Logger logger = f52167o;
        switch (i14) {
            case 1:
            case 2:
                if (str == null || list.isEmpty()) {
                    logger.warn("Card removed with NO card name");
                } else {
                    wr2.e.f186838m.m(new wr2.f.b(str, ((Number) h0.b0(list)).longValue(), bVar, list2));
                }
                finish();
                break;
            case 3:
            case 4:
                br2.c.f19585a.b(this);
                break;
            case 5:
                logger.debug("Card no longer exists. Finishing activity");
                finish();
                break;
            case 6:
                logger.debug("Api is under maintenance show maintenance dialog");
                String string = getString(R.string.lbl_server_maintenance);
                string.getClass();
                String string2 = getString(R.string.garmin_pay_maintenance_description);
                string2.getClass();
                String string3 = getString(R.string.lbl_cancel);
                string3.getClass();
                androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, this, string, string2, new p(string3, new td0.a((byte) 0, 29)), null, null, false, 224);
                if (eVarQ != null) {
                    eVarQ.show();
                }
                break;
            default:
                u0.r();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, p13.j0] */
    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        String str;
        super.onCreate(bundle);
        f52167o.debug("onCreate");
        R9(R.layout.layout_swipe_refreshable_recycler_view, hn2.c.a.BACK, getString(R.string.wallet_card_details));
        View viewFindViewById = findViewById(R.id.generic_swipe_refresh_layout);
        viewFindViewById.getClass();
        this.f52173l = (SwipeRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.generic_recycler_view);
        viewFindViewById2.getClass();
        this.f52174m = (RecyclerView) viewFindViewById2;
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("card.details.item", q.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("card.details.item") : null;
            if (!(parcelableExtra instanceof q)) {
                parcelableExtra = null;
            }
            parcelable = (q) parcelableExtra;
        }
        q qVar = (q) parcelable;
        if (qVar == null) {
            h.s("Card details item must be provided");
            return;
        }
        this.f52172k = qVar;
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            parcelable2 = intent2 != null ? (Parcelable) intent2.getParcelableExtra("card.details.options", a.class) : null;
        } else {
            Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("card.details.options") : null;
            if (!(parcelableExtra2 instanceof a)) {
                parcelableExtra2 = null;
            }
            parcelable2 = (a) parcelableExtra2;
        }
        if (((a) parcelable2) == null) {
            h.s("Card details options must be provided");
            return;
        }
        vr2.c cVar = (vr2.c) new x1(this).b(s0.f105811a.b(vr2.c.class));
        this.f52170i = cVar;
        y0<Boolean> y0Var = cVar.f179573k;
        y0Var.m(Boolean.TRUE);
        r0 r0Var = new r0();
        r0Var.f105810a = j0.f134944a;
        t0 t0Var = new t0(r0Var, 6);
        int i15 = w03.b.f181178a;
        cVar.f179568f = new z03.h(t0Var).k(l13.a.f108327b).i(new t0(new b1(11), 7), new b0(23, r0Var, cVar));
        y0Var.m(Boolean.FALSE);
        vr2.c cVar2 = this.f52170i;
        if (cVar2 == null) {
            s.m("cardDetailsViewModel");
            throw null;
        }
        q qVar2 = this.f52172k;
        if (qVar2 == null) {
            s.m("selectedCardModel");
            throw null;
        }
        cVar2.f179569g = qVar2;
        final int i16 = 1;
        cVar2.y4(true);
        cVar2.z4(true);
        vr2.c.f179562o.debug("Refreshing Wallet Items");
        q qVar3 = cVar2.f179569g;
        if (qVar3 != null && (str = qVar3.f179661h) != null) {
            GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
            Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            bVar.getClass();
            g0 g0VarA = GarminPayCoreDatabase.b.a(contextC).e().a(str);
            cVar2.f179564b = g0VarA;
            g0VarA.g(cVar2.f179576n);
        }
        com.garmin.feature.garminpay.ui.userwallet.a aVar = new com.garmin.feature.garminpay.ui.userwallet.a(this);
        this.f52171j = aVar;
        RecyclerView recyclerView = this.f52174m;
        if (recyclerView == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        RecyclerView recyclerView2 = this.f52174m;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView3 = this.f52174m;
        if (recyclerView3 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView3.setItemAnimator(null);
        vr2.c cVar3 = this.f52170i;
        if (cVar3 == null) {
            s.m("cardDetailsViewModel");
            throw null;
        }
        final int i17 = 0;
        cVar3.f179572j.f(this, new z0(this) { // from class: tr2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDetailsActivity f166134b;

            {
                this.f166134b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v2, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r8v4, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ?? arrayList;
                ?? arrayList2;
                hs2.a aVar2;
                Set<is2.b> setI;
                hs2.a aVar3;
                Set<is2.b> setI2;
                switch (i17) {
                    case 0:
                        vr2.a aVar4 = (vr2.a) obj;
                        CardDetailsActivity cardDetailsActivity = this.f166134b;
                        com.garmin.feature.garminpay.ui.userwallet.a aVar5 = cardDetailsActivity.f52171j;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("cardDetailsAdapter");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.userwallet.a.d dVar = com.garmin.feature.garminpay.ui.userwallet.a.f52233e;
                        vr2.q qVar4 = cardDetailsActivity.f52172k;
                        if (qVar4 == null) {
                            p005kotlin.jvm.internal.s.m("selectedCardModel");
                            throw null;
                        }
                        dVar.getClass();
                        is2.b bVar2 = qVar4.f179660g;
                        List listC = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.a.b.C1106b(qVar4));
                        List listC2 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.a.b.f.f52246a);
                        List<br2.f> list = aVar4 != null ? aVar4.f179558a : null;
                        if (list == null || !(!list.isEmpty())) {
                            list = null;
                        }
                        if (list != null) {
                            ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(new com.garmin.feature.garminpay.ui.userwallet.a.b.d((br2.f) it.next()));
                            }
                            arrayList = new ArrayList();
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                ps2.w wVar = ps2.w.f140538a;
                                Iterator it4 = it3;
                                long j8 = ((com.garmin.feature.garminpay.ui.userwallet.a.b.d) next).f52244a.f19599a;
                                wVar.getClass();
                                ps2.n nVarI = ps2.w.i(j8);
                                if ((nVarI == null || (aVar3 = nVarI.f140498a) == null || (setI2 = aVar3.i()) == null) ? false : h0.R(setI2, bVar2)) {
                                    arrayList.add(next);
                                }
                                it3 = it4;
                            }
                        } else {
                            arrayList = j0.f134944a;
                        }
                        List listC3 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.a.b.h.f52248a);
                        List<br2.f> list2 = aVar4 != null ? aVar4.f179559b : null;
                        List<br2.f> list3 = list2 != null && (list2.isEmpty() ^ true) ? list2 : null;
                        if (list3 != null) {
                            ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                arrayList4.add(new com.garmin.feature.garminpay.ui.userwallet.a.b.g((br2.f) it5.next()));
                            }
                            arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList4) {
                                ps2.w wVar2 = ps2.w.f140538a;
                                long j14 = ((com.garmin.feature.garminpay.ui.userwallet.a.b.g) obj2).f52247a.f19599a;
                                wVar2.getClass();
                                ps2.n nVarI2 = ps2.w.i(j14);
                                if ((nVarI2 == null || (aVar2 = nVarI2.f140498a) == null || (setI = aVar2.i()) == null) ? false : h0.R(setI, bVar2)) {
                                    arrayList2.add(obj2);
                                }
                            }
                        } else {
                            arrayList2 = j0.f134944a;
                        }
                        aVar5.t(new com.garmin.feature.garminpay.ui.userwallet.a.C1104a(aVar4, qVar4, (!arrayList2.isEmpty() || ((Collection) arrayList).isEmpty()) ? (!arrayList.isEmpty() || ((Collection) arrayList2).isEmpty()) ? h0.C0(h0.C0(h0.C0(h0.C0(h0.C0(listC, listC2), (Iterable) arrayList), p13.w.c(com.garmin.feature.garminpay.ui.userwallet.a.b.e.f52245a)), listC3), (Iterable) arrayList2) : h0.C0(h0.C0(listC, listC3), (Iterable) arrayList2) : h0.C0(h0.C0(h0.C0(listC, listC2), (Iterable) arrayList), p13.w.c(com.garmin.feature.garminpay.ui.userwallet.a.b.e.f52245a))).f52240c);
                        return;
                    default:
                        Boolean bool = (Boolean) obj;
                        SwipeRefreshLayout swipeRefreshLayout = this.f166134b.f52173l;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE));
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("swipeToRefreshView");
                            throw null;
                        }
                }
            }
        });
        vr2.c cVar4 = this.f52170i;
        if (cVar4 == null) {
            s.m("cardDetailsViewModel");
            throw null;
        }
        cVar4.f179573k.f(this, new z0(this) { // from class: tr2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDetailsActivity f166134b;

            {
                this.f166134b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v2, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r8v4, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ?? arrayList;
                ?? arrayList2;
                hs2.a aVar2;
                Set<is2.b> setI;
                hs2.a aVar3;
                Set<is2.b> setI2;
                switch (i16) {
                    case 0:
                        vr2.a aVar4 = (vr2.a) obj;
                        CardDetailsActivity cardDetailsActivity = this.f166134b;
                        com.garmin.feature.garminpay.ui.userwallet.a aVar5 = cardDetailsActivity.f52171j;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("cardDetailsAdapter");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.userwallet.a.d dVar = com.garmin.feature.garminpay.ui.userwallet.a.f52233e;
                        vr2.q qVar4 = cardDetailsActivity.f52172k;
                        if (qVar4 == null) {
                            p005kotlin.jvm.internal.s.m("selectedCardModel");
                            throw null;
                        }
                        dVar.getClass();
                        is2.b bVar2 = qVar4.f179660g;
                        List listC = p13.w.c(new com.garmin.feature.garminpay.ui.userwallet.a.b.C1106b(qVar4));
                        List listC2 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.a.b.f.f52246a);
                        List<br2.f> list = aVar4 != null ? aVar4.f179558a : null;
                        if (list == null || !(!list.isEmpty())) {
                            list = null;
                        }
                        if (list != null) {
                            ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(new com.garmin.feature.garminpay.ui.userwallet.a.b.d((br2.f) it.next()));
                            }
                            arrayList = new ArrayList();
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                ps2.w wVar = ps2.w.f140538a;
                                Iterator it4 = it3;
                                long j8 = ((com.garmin.feature.garminpay.ui.userwallet.a.b.d) next).f52244a.f19599a;
                                wVar.getClass();
                                ps2.n nVarI = ps2.w.i(j8);
                                if ((nVarI == null || (aVar3 = nVarI.f140498a) == null || (setI2 = aVar3.i()) == null) ? false : h0.R(setI2, bVar2)) {
                                    arrayList.add(next);
                                }
                                it3 = it4;
                            }
                        } else {
                            arrayList = j0.f134944a;
                        }
                        List listC3 = p13.w.c(com.garmin.feature.garminpay.ui.userwallet.a.b.h.f52248a);
                        List<br2.f> list2 = aVar4 != null ? aVar4.f179559b : null;
                        List<br2.f> list3 = list2 != null && (list2.isEmpty() ^ true) ? list2 : null;
                        if (list3 != null) {
                            ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                arrayList4.add(new com.garmin.feature.garminpay.ui.userwallet.a.b.g((br2.f) it5.next()));
                            }
                            arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList4) {
                                ps2.w wVar2 = ps2.w.f140538a;
                                long j14 = ((com.garmin.feature.garminpay.ui.userwallet.a.b.g) obj2).f52247a.f19599a;
                                wVar2.getClass();
                                ps2.n nVarI2 = ps2.w.i(j14);
                                if ((nVarI2 == null || (aVar2 = nVarI2.f140498a) == null || (setI = aVar2.i()) == null) ? false : h0.R(setI, bVar2)) {
                                    arrayList2.add(obj2);
                                }
                            }
                        } else {
                            arrayList2 = j0.f134944a;
                        }
                        aVar5.t(new com.garmin.feature.garminpay.ui.userwallet.a.C1104a(aVar4, qVar4, (!arrayList2.isEmpty() || ((Collection) arrayList).isEmpty()) ? (!arrayList.isEmpty() || ((Collection) arrayList2).isEmpty()) ? h0.C0(h0.C0(h0.C0(h0.C0(h0.C0(listC, listC2), (Iterable) arrayList), p13.w.c(com.garmin.feature.garminpay.ui.userwallet.a.b.e.f52245a)), listC3), (Iterable) arrayList2) : h0.C0(h0.C0(listC, listC3), (Iterable) arrayList2) : h0.C0(h0.C0(h0.C0(listC, listC2), (Iterable) arrayList), p13.w.c(com.garmin.feature.garminpay.ui.userwallet.a.b.e.f52245a))).f52240c);
                        return;
                    default:
                        Boolean bool = (Boolean) obj;
                        SwipeRefreshLayout swipeRefreshLayout = this.f166134b.f52173l;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE));
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("swipeToRefreshView");
                            throw null;
                        }
                }
            }
        });
        SwipeRefreshLayout swipeRefreshLayout = this.f52173l;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new tr2.b(this, i16));
        } else {
            s.m("swipeToRefreshView");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_card_details, menu);
        if (menu != null) {
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_remove_card);
            this.f52169h = menuItemFindItem;
            if (menuItemFindItem != null) {
                vr2.c cVar = this.f52170i;
                if (cVar == null) {
                    s.m("cardDetailsViewModel");
                    throw null;
                }
                menuItemFindItem.setVisible(cVar.f179574l);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.menu_item_remove_card) {
            String string = getString(R.string.lbl_remove);
            string.getClass();
            String string2 = getString(R.string.lbl_cancel);
            string2.getClass();
            String string3 = getString(R.string.wallet_remove_card);
            string3.getClass();
            x0 x0Var = x0.f105818a;
            String string4 = getString(R.string.wallet_remove_card_confirmation_message);
            string4.getClass();
            q qVar = this.f52172k;
            if (qVar == null) {
                s.m("selectedCardModel");
                throw null;
            }
            androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, this, string3, String.format(string4, Arrays.copyOf(new Object[]{qVar.f179654a}, 1)), new p(string, new s5.a(this, 29)), new p(string2, new td0.a((byte) 0, 28)), null, false, 224);
            if (eVarQ != null) {
                eVarQ.show();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f52168g.e();
        if (this.f52170i != null) {
            return;
        }
        s.m("cardDetailsViewModel");
        throw null;
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        vr2.c cVar = this.f52170i;
        if (cVar == null) {
            s.m("cardDetailsViewModel");
            throw null;
        }
        cVar.x4();
        com.garmin.feature.garminpay.ui.userwallet.a aVar = this.f52171j;
        if (aVar == null) {
            s.m("cardDetailsAdapter");
            throw null;
        }
        this.f52168g.a(aVar.f52237d.d(new p0(new d(this), 29), new tr2.b(new n0(10), 0)));
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/CardDetailsActivity$b;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "EXTRA_CARD_DETAILS_ITEM", "Ljava/lang/String;", "EXTRA_CARD_DETAILS_OPTIONS", "EXTRA_CARD_DISPLAY_NAME", "EXTRA_WATCH_DISPLAY_NAMES", "", "RESULT_CARD_REMOVED", "I", "RESULT_CARD_REMOVED_PARTIALLY", "UNION_PAY_MANAGE_CARD_REQUEST_CODE", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
