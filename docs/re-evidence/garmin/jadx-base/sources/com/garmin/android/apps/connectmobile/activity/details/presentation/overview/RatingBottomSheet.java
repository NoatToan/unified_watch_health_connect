package com.garmin.android.apps.connectmobile.activity.details.presentation.overview;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nr.v0;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.x;
import p13.y;
import ps.q1;
import ps.r;
import qr.t;
import xr.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/overview/RatingBottomSheet;", "Lcom/garmin/android/apps/connectmobile/f;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RatingBottomSheet extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f30098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f30099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Double f30100j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30101a;

        public a(Fragment fragment) {
            this.f30101a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f30101a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30106e;

        public b(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30102a = fragment;
            this.f30103b = qualifier;
            this.f30104c = aVar;
            this.f30105d = aVar2;
            this.f30106e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f30104c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f30102a;
            e23.a aVar = this.f30105d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), f189591b, null, defaultViewModelCreationExtras, this.f30103b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30106e, 4, null);
        }
    }

    public RatingBottomSheet() {
        super(R.layout.edit_rating_bottom_sheet_content, false, false, false, 14, null);
        this.f30098h = o13.m.a(n.NONE, new b(this, null, new a(this), null, null));
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final boolean A6() {
        return this.f30100j != null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.f
    public final void C6() {
        Double d14 = this.f30100j;
        if (d14 != null) {
            double dDoubleValue = d14.doubleValue();
            t tVar = (t) this.f30098h.getValue();
            tVar.getClass();
            tVar.X5(tVar.f146575z, new r(null, null, null, null, null, null, null, null, null, null, null, null, new q1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -513, FlexItem.MAX_SIZE, null), null, null, null, null, null, 258047, null), v0.RATING);
        }
        NavHostFragment.f10124e.getClass();
        NavHostFragment.a.a(this).n();
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        m mVar = new m();
        mVar.f191995c = new xa2.g(this, 15);
        this.f30099i = mVar;
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.rating_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        m mVar2 = this.f30099i;
        if (mVar2 == null) {
            s.m("ratingAdapter");
            throw null;
        }
        recyclerView.setAdapter(mVar2);
        m mVar3 = this.f30099i;
        if (mVar3 == null) {
            s.m("ratingAdapter");
            throw null;
        }
        List listK = x.k(Float.valueOf(0.0f), Float.valueOf(25.0f), Float.valueOf(50.0f), Float.valueOf(75.0f), Float.valueOf(100.0f));
        ArrayList arrayList = new ArrayList(y.r(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            double dFloatValue = ((Number) it.next()).floatValue();
            arrayList.add(new hr.b(dFloatValue, s.a(dFloatValue, this.f30100j)));
        }
        ArrayList arrayList2 = mVar3.f191994b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        Iterator it3 = arrayList2.iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            if (((hr.b) it3.next()).f85285b) {
                mVar3.f191993a = i14;
                mVar3.notifyDataSetChanged();
            }
            i14++;
        }
        i14 = -1;
        mVar3.f191993a = i14;
        mVar3.notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String y6() {
        String string = getString(R.string.lbl_submit);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String z6() {
        String string = getString(R.string.lbl_rate_activity);
        string.getClass();
        return string;
    }
}
