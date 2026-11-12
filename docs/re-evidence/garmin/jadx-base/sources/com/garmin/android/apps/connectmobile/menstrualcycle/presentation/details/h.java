package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.e1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import g2.m1;
import ht1.v;
import hx0.d0;
import hx0.g0;
import hx0.h0;
import hx0.i0;
import hx0.j0;
import hx0.n0;
import j23.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import lc.u0;
import o13.m;
import o13.n;
import o13.t;
import o53.c2;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.math.MathKt;
import p13.b1;
import ww0.p;
import ww0.r;
import ww0.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/h;", "Landroidx/fragment/app/Fragment;", "Lhx0/n0;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends Fragment implements n0 {
    public static final a P = new a(null);
    public static final l T = new l(0, 20);
    public static final l X = new l(40, 53);
    public final t A;
    public final t B;
    public boolean C;
    public String D;
    public List<db1.a> E;
    public boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e1 f38949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f38950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f38951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f38952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LottieAnimationView f38953e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f38955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f38956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f38957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f38958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ww0.h f38959k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f38961m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f38963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f38964p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f38966r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f38967t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f38969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f38970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s f38971y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f38954f = m.a(n.NONE, new g(this, null, new f(this), null, null));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f38960l = m.b(new v(10));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashSet<ww0.t> f38962n = new HashSet<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet<p> f38965q = new HashSet<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HashSet<ww0.e> f38968v = new HashSet<>();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final t f38972z = m.b(new v(11));
    public final HashMap<String, Object> I = new HashMap<>();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38973a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.AVERAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38973a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/h$c", "Landroidx/core/view/s;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements androidx.core.view.s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.save_menu, menu);
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
            h hVar = h.this;
            if (menuItemFindItem != null) {
                menuItemFindItem.setEnabled(hVar.F);
            } else {
                a aVar = h.P;
                hVar.getClass();
            }
            SpannableString spannableString = new SpannableString(hVar.getString(R.string.lbl_save));
            if (hVar.F) {
                spannableString.setSpan(new ForegroundColorSpan(a7.b.getColor(hVar.requireContext(), R.color.gcm_text_primary_action_selector)), 0, spannableString.length(), 0);
            } else {
                spannableString.setSpan(new ForegroundColorSpan(a7.b.getColor(hVar.requireContext(), R.color.gcm_text_secondary)), 0, spannableString.length(), 0);
            }
            if (menuItemFindItem != null) {
                menuItemFindItem.setTitle(spannableString);
            }
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o13.l] */
        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            h hVar = h.this;
            if (itemId == 16908332) {
                e1 e1Var = hVar.f38949a;
                if (e1Var != null) {
                    e1Var.onFragmentFinished((2 & 1) != 0 ? null : -1, null);
                    return true;
                }
            } else {
                if (itemId != R.id.save_menu_item) {
                    return false;
                }
                a aVar = h.P;
                LocalDate localDate = (LocalDate) hVar.f38956h.getValue();
                if (localDate != null) {
                    g22.e.l(hVar);
                    ww0.b bVarW6 = hVar.w6();
                    i0 i0Var = (i0) hVar.f38954f.getValue();
                    i0Var.getClass();
                    ReentrantLock reentrantLock = i0Var.f86081b;
                    reentrantLock.lock();
                    try {
                        c2 c2Var = i0Var.f86085f;
                        if (c2Var == null || !c2Var.isActive()) {
                            i0Var.f86085f = ge1.b.T(i0Var, null, null, new h0(i0Var, localDate, bVarW6, null), 3);
                        }
                        Unit unit = Unit.INSTANCE;
                        reentrantLock.unlock();
                        ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                        return true;
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/h$d", "Landroidx/core/view/a;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends androidx.core.view.a {
        public d() {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            view2.getClass();
            fVar.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.t(h.this.C);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f38976a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f38976a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f38976a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38976a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38977a;

        public f(Fragment fragment) {
            this.f38977a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f38977a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f38982e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f38978a = fragment;
            this.f38979b = qualifier;
            this.f38980c = aVar;
            this.f38981d = aVar2;
            this.f38982e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, hx0.i0] */
        @Override // e23.a
        public final i0 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 viewModelStore = ((ViewModelStoreOwner) this.f38980c.invoke()).getF189591b();
            Fragment fragment = this.f38978a;
            e23.a aVar = this.f38981d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i0.class), viewModelStore, null, defaultViewModelCreationExtras, this.f38979b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f38982e, 4, null);
        }
    }

    public h() {
        final int i14 = 9;
        this.f38955g = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i16 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i16 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i17 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i18 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i19 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i24 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i25 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i15 = 1;
        this.f38956h = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i17 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i17 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i18 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i19 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i110 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i24 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i25 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i16 = 2;
        this.f38957i = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i18 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i18 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i19 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i110 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i111 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i24 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i25 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i17 = 3;
        this.f38958j = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i19 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i19 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i110 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i111 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i112 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i24 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i25 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i18 = 4;
        this.f38961m = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i19 = i18;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i110 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i110 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i111 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i112 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i113 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i24 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i25 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i19 = 5;
        this.f38963o = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i110 = i19;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i111 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i111 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i112 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i113 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i114 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i24 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i25 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i24 = 6;
        this.f38964p = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i110 = i24;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i111 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i111 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i112 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i113 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i114 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i25 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i26 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i25 = 7;
        this.f38966r = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i110 = i25;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i111 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i111 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i112 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i113 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i114 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i26 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i27 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i26 = 8;
        this.f38967t = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i110 = i26;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i111 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i111 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i112 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i113 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i114 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i27 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i28 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i27 = 10;
        this.f38969w = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i110 = i27;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i111 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i111 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i112 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i113 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i114 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i28 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i29 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i28 = 11;
        this.f38970x = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i110 = i28;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i111 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i111 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i112 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i113 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i114 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i29 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i210 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i29 = 12;
        this.A = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i110 = i29;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i111 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i111 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i112 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i113 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i114 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i210 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i211 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
        final int i30 = 0;
        this.B = m.b(new e23.a(this) { // from class: hx0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86050b;

            {
                this.f86050b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v38, types: [java.util.HashSet] */
            /* JADX WARN: Type inference failed for: r2v42 */
            /* JADX WARN: Type inference failed for: r2v43 */
            /* JADX WARN: Type inference failed for: r2v44 */
            /* JADX WARN: Type inference failed for: r2v45 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Enum, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Enum, java.lang.Object] */
            @Override // e23.a
            public final Object invoke() {
                Serializable serializable;
                Integer num;
                Serializable serializable2;
                Integer num2;
                Serializable serializable3;
                ?? L0;
                int i110 = i30;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86050b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        hVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i111 = displayMetrics.widthPixels;
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        float dimension = (hVar.getResources().getDimension(R.dimen.spacing_micro) * 2) + TypedValue.applyDimension(1, c22.b.a(contextRequireContext) < 1.5f ? 88.0f : 120.0f, hVar.getResources().getDisplayMetrics());
                        float dimension2 = i111 - hVar.getResources().getDimension(R.dimen.spacing_normal);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / dimension)) - 0.5d));
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle = (Bundle) hVar.f38955g.getValue();
                        if (bundle == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
                        } else {
                            Serializable serializable4 = bundle.getSerializable("EXTRA_DATE_KEY");
                            serializable = (LocalDate) (serializable4 instanceof LocalDate ? serializable4 : null);
                        }
                        return (LocalDate) serializable;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle2 = (Bundle) hVar.f38955g.getValue();
                        if (bundle2 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("EXTRA_PHASE_KEY", Integer.class);
                            } else {
                                Serializable serializable5 = bundle2.getSerializable("EXTRA_PHASE_KEY");
                                if (!(serializable5 instanceof Integer)) {
                                    serializable5 = null;
                                }
                                serializable2 = (Integer) serializable5;
                            }
                            num = (Integer) serializable2;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return num;
                        }
                        return null;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        Bundle bundle3 = (Bundle) hVar.f38955g.getValue();
                        if (bundle3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = bundle3.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
                            } else {
                                Serializable serializable6 = bundle3.getSerializable("EXTRA_CYCLE_TYPE");
                                if (!(serializable6 instanceof Integer)) {
                                    serializable6 = null;
                                }
                                serializable3 = (Integer) serializable6;
                            }
                            num2 = (Integer) serializable3;
                        } else {
                            num2 = null;
                        }
                        return w3.x.l(num2 != null ? num2 : null);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86050b;
                        double dY6 = hVar2.y6();
                        int i112 = ww0.g.f187556a;
                        Context contextRequireContext2 = hVar2.requireContext();
                        contextRequireContext2.getClass();
                        List<??> list = (List) hVar2.f38960l.getValue();
                        ww0.h hVar3 = hVar2.f38959k;
                        ?? C = hVar3 != null ? b1.c(hVar3) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (?? r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = C.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new b0(iOrdinal, zContains, fVar.a(contextRequireContext2), fVar.b()));
                        }
                        return new d0(false, dY6, new ArrayList(arrayList), null, hVar2, 8, null);
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.t.a aVar7 = ww0.t.f187658a;
                        Context contextRequireContext3 = hVar.requireContext();
                        contextRequireContext3.getClass();
                        aVar7.getClass();
                        tb1.c.a aVar8 = tb1.c.f163744a;
                        i52.a.f91796a.getClass();
                        ww0.a aVarL = i52.a.l();
                        aVar8.getClass();
                        if (tb1.c.a.a(aVarL)) {
                            return ww0.t.a.a(contextRequireContext3, p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.SWELLING.ordinal())));
                        }
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().G4()) {
                            List listB1 = p13.h0.b1(ww0.t.X);
                            L0 = new ArrayList();
                            for (Object obj : listB1) {
                                if (!ww0.t.f187659b.contains((ww0.t) obj)) {
                                    L0.add(obj);
                                }
                            }
                        } else {
                            L0 = p13.h0.L0(ww0.t.X, new j23.l(ww0.t.ACNE.ordinal(), ww0.t.TENDER_BREASTS.ordinal()));
                        }
                        return ww0.t.a.a(contextRequireContext3, L0);
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        double dY7 = hVar.y6();
                        int i113 = ww0.g.f187556a;
                        Context contextRequireContext4 = hVar.requireContext();
                        contextRequireContext4.getClass();
                        List<??> list2 = (List) hVar.f38963o.getValue();
                        HashSet<ww0.t> hashSet = hVar.f38962n;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                        for (?? r15 : list2) {
                            int iOrdinal2 = r15.ordinal();
                            boolean zContains2 = hashSet.contains(r15);
                            ww0.f fVar2 = (ww0.f) r15;
                            arrayList2.add(new b0(iOrdinal2, zContains2, fVar2.a(contextRequireContext4), fVar2.b()));
                        }
                        return new j0(dY7, new ArrayList(arrayList2), hVar);
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.p.a aVar11 = ww0.p.f187627a;
                        ww0.a aVar12 = (ww0.a) hVar.f38958j.getValue();
                        aVar11.getClass();
                        aVar12.getClass();
                        ww0.p[] pVarArrValues = ww0.p.values();
                        tb1.c.f163744a.getClass();
                        if (tb1.c.a.a(aVar12)) {
                            return p13.u.i0(ww0.p.values());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ww0.p pVar : pVarArrValues) {
                            if (pVar != ww0.p.WORRIED) {
                                arrayList3.add(pVar);
                            }
                        }
                        return arrayList3;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar13 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86050b;
                        double dY8 = hVar4.y6();
                        int i114 = ww0.g.f187556a;
                        Context contextRequireContext5 = hVar4.requireContext();
                        contextRequireContext5.getClass();
                        List<??> list3 = (List) hVar4.f38966r.getValue();
                        HashSet<ww0.p> hashSet2 = hVar4.f38965q;
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        for (?? r16 : list3) {
                            int iOrdinal3 = r16.ordinal();
                            boolean zContains3 = hashSet2.contains(r16);
                            ww0.f fVar3 = (ww0.f) r16;
                            arrayList4.add(new b0(iOrdinal3, zContains3, fVar3.a(contextRequireContext5), fVar3.b()));
                        }
                        return new d0(true, dY8, new ArrayList(arrayList4), null, hVar4, 8, null);
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar14 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        l2.f37135b.getClass();
                        return l2.a.b().c(hVar);
                    case 10:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        ww0.e.a aVar16 = ww0.e.f187542a;
                        Context contextRequireContext6 = hVar.requireContext();
                        contextRequireContext6.getClass();
                        aVar16.getClass();
                        i52.a.f91796a.getClass();
                        return p13.h0.b1(i52.a.l() == ww0.a.PREGNANT ? ww0.e.f187543b : ww0.e.a.a(contextRequireContext6, p13.s.c(ww0.e.values())));
                    case 11:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        int i210 = ww0.g.f187556a;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar5 = this.f86050b;
                        Context contextRequireContext7 = hVar5.requireContext();
                        contextRequireContext7.getClass();
                        List<??> list4 = (List) hVar5.f38969w.getValue();
                        HashSet<ww0.e> hashSet3 = hVar5.f38968v;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(list4, 10));
                        for (?? r17 : list4) {
                            int iOrdinal4 = r17.ordinal();
                            boolean zContains4 = hashSet3.contains(r17);
                            ww0.f fVar4 = (ww0.f) r17;
                            arrayList5.add(new b0(iOrdinal4, zContains4, fVar4.a(contextRequireContext7), fVar4.b()));
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        return new d0(true, hVar5.y6(), arrayList6, (b0) arrayList6.get(ww0.e.NO_DISCHARGE.ordinal()), hVar5);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar18 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar6 = this.f86050b;
                        double dY9 = hVar6.y6();
                        int i211 = ww0.g.f187556a;
                        Context contextRequireContext8 = hVar6.requireContext();
                        contextRequireContext8.getClass();
                        List<??> list5 = (List) hVar6.f38972z.getValue();
                        ww0.s sVar = hVar6.f38971y;
                        ?? C2 = sVar != null ? b1.c(sVar) : new HashSet();
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list5, 10));
                        for (?? r18 : list5) {
                            int iOrdinal5 = r18.ordinal();
                            boolean zContains5 = C2.contains(r18);
                            ww0.f fVar5 = (ww0.f) r18;
                            arrayList7.add(new b0(iOrdinal5, zContains5, fVar5.a(contextRequireContext8), fVar5.b()));
                        }
                        return new d0(false, dY9, new ArrayList(arrayList7), null, hVar6, 8, null);
                }
            }
        });
    }

    public final void A6(View view2, ww0.b bVar) {
        List<ww0.e> listG;
        List<p> listI;
        List<ww0.t> listO;
        this.D = bVar != null ? bVar.getNotes() : null;
        this.E = bVar != null ? bVar.d() : null;
        this.f38962n = (bVar == null || (listO = bVar.o()) == null) ? new HashSet<>() : p13.h0.Z0(p13.h0.Z(listO));
        this.f38965q = (bVar == null || (listI = bVar.i()) == null) ? new HashSet<>() : p13.h0.Z0(p13.h0.Z(listI));
        this.f38959k = bVar != null ? bVar.getFlow() : null;
        this.f38968v = (bVar == null || (listG = bVar.g()) == null) ? new HashSet<>() : p13.h0.Z0(p13.h0.Z(listG));
        this.f38971y = bVar != null ? bVar.getSexualActivity() : null;
        this.C = bVar != null ? p005kotlin.jvm.internal.s.g(bVar.getIsOvulationDay(), Boolean.TRUE) : false;
        View viewFindViewById = view2.findViewById(R.id.flow_group);
        MenstrualCycleSymptomActivity.a aVar = MenstrualCycleSymptomActivity.f38817c;
        Integer num = (Integer) this.f38957i.getValue();
        aVar.getClass();
        if (num != null && num.intValue() == 1 && com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.d(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a)) {
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(8);
        }
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.selection_flow_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        recyclerView.setAdapter((d0) this.f38961m.getValue());
        View viewFindViewById2 = view2.findViewById(R.id.symptom_group);
        i52.a.f91796a.getClass();
        boolean zQ = i52.a.q();
        viewFindViewById2.getClass();
        if (zQ) {
            viewFindViewById2.setVisibility(0);
        } else {
            viewFindViewById2.setVisibility(8);
        }
        RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(R.id.selection_symptom_list);
        recyclerView2.setLayoutManager(new GridLayoutManager(requireContext(), 2, 0, false));
        recyclerView2.setAdapter((j0) this.f38964p.getValue());
        View viewFindViewById3 = view2.findViewById(R.id.mood_group);
        boolean zP = i52.a.p();
        viewFindViewById3.getClass();
        if (zP) {
            viewFindViewById3.setVisibility(0);
        } else {
            viewFindViewById3.setVisibility(8);
        }
        RecyclerView recyclerView3 = (RecyclerView) view2.findViewById(R.id.selection_mood_list);
        recyclerView3.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        recyclerView3.setAdapter((d0) this.f38967t.getValue());
        View viewFindViewById4 = view2.findViewById(R.id.discharge_group);
        boolean zM = i52.a.m();
        viewFindViewById4.getClass();
        if (zM) {
            viewFindViewById4.setVisibility(0);
        } else {
            viewFindViewById4.setVisibility(8);
        }
        RecyclerView recyclerView4 = (RecyclerView) view2.findViewById(R.id.selection_discharge_list);
        recyclerView4.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        recyclerView4.setAdapter((d0) this.f38970x.getValue());
        View viewFindViewById5 = view2.findViewById(R.id.ovulation_group);
        f12.l.a aVar2 = f12.l.f68084a;
        aVar2.getClass();
        if (!f12.l.a.a().E1() || ((ww0.a) this.f38958j.getValue()) == ww0.a.PREGNANT) {
            viewFindViewById5.getClass();
            viewFindViewById5.setVisibility(8);
        } else {
            viewFindViewById5.getClass();
            viewFindViewById5.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView = this.f38953e;
        if (lottieAnimationView == null) {
            p005kotlin.jvm.internal.s.m("ovulationToggleCheck");
            throw null;
        }
        lottieAnimationView.setFrame((this.C ? T : X).f96797b);
        View viewFindViewById6 = view2.findViewById(R.id.sexual_activity_group);
        boolean zR = i52.a.r();
        viewFindViewById6.getClass();
        if (zR) {
            viewFindViewById6.setVisibility(0);
        } else {
            viewFindViewById6.setVisibility(8);
        }
        RecyclerView recyclerView5 = (RecyclerView) view2.findViewById(R.id.selection_sexual_activity_list);
        recyclerView5.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        recyclerView5.setAdapter((d0) this.A.getValue());
        View viewFindViewById7 = view2.findViewById(R.id.sex_drive_group);
        aVar2.getClass();
        boolean zX0 = f12.l.a.a().x0();
        viewFindViewById7.getClass();
        if (zX0) {
            viewFindViewById7.setVisibility(0);
        } else {
            viewFindViewById7.setVisibility(8);
        }
        r sexDrive = bVar != null ? bVar.getSexDrive() : null;
        int i14 = sexDrive == null ? -1 : b.f38973a[sexDrive.ordinal()];
        if (i14 == -1) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "DailyMenstrualCycleLogDTO", "DailyMenstrualCycleLogDTO is null");
        } else if (i14 == 1) {
            Button button = this.f38950b;
            if (button == null) {
                p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                throw null;
            }
            button.setSelected(true);
        } else if (i14 == 2) {
            Button button2 = this.f38951c;
            if (button2 == null) {
                p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                throw null;
            }
            button2.setSelected(true);
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            Button button3 = this.f38952d;
            if (button3 == null) {
                p005kotlin.jvm.internal.s.m("highSexDriveChip");
                throw null;
            }
            button3.setSelected(true);
        }
        u6(this.I);
    }

    @Override // hx0.n0
    public final void B0() {
        HashMap<String, Object> map = new HashMap<>();
        u6(map);
        HashMap<String, Object> map2 = this.I;
        Object obj = map2.get("SYMPTOMS");
        HashSet hashSet = obj instanceof HashSet ? (HashSet) obj : null;
        Object obj2 = map.get("SYMPTOMS");
        HashSet hashSet2 = obj2 instanceof HashSet ? (HashSet) obj2 : null;
        boolean z14 = true;
        if (hashSet == null || hashSet2 == null || (hashSet.size() == hashSet2.size() && hashSet.equals(hashSet2))) {
            Object obj3 = map2.get("MOOD");
            HashSet hashSet3 = obj3 instanceof HashSet ? (HashSet) obj3 : null;
            Object obj4 = map.get("MOOD");
            HashSet hashSet4 = obj4 instanceof HashSet ? (HashSet) obj4 : null;
            if (hashSet3 == null || hashSet4 == null || (hashSet3.size() == hashSet4.size() && hashSet3.equals(hashSet4))) {
                Object obj5 = map2.get("FLOW");
                HashSet hashSet5 = obj5 instanceof HashSet ? (HashSet) obj5 : null;
                Object obj6 = map.get("FLOW");
                HashSet hashSet6 = obj6 instanceof HashSet ? (HashSet) obj6 : null;
                if (hashSet5 == null || hashSet6 == null || (hashSet5.size() == hashSet6.size() && hashSet5.equals(hashSet6))) {
                    Object obj7 = map2.get("DISCHARGE");
                    HashSet hashSet7 = obj7 instanceof HashSet ? (HashSet) obj7 : null;
                    Object obj8 = map.get("DISCHARGE");
                    HashSet hashSet8 = obj8 instanceof HashSet ? (HashSet) obj8 : null;
                    if (hashSet7 == null || hashSet8 == null || (hashSet7.size() == hashSet8.size() && hashSet7.equals(hashSet8))) {
                        Object obj9 = map2.get("SEXUAL_ACTIVITY");
                        HashSet hashSet9 = obj9 instanceof HashSet ? (HashSet) obj9 : null;
                        Object obj10 = map.get("SEXUAL_ACTIVITY");
                        HashSet hashSet10 = obj10 instanceof HashSet ? (HashSet) obj10 : null;
                        if (hashSet9 == null || hashSet10 == null || (hashSet9.size() == hashSet10.size() && hashSet9.equals(hashSet10))) {
                            Object obj11 = map2.get("OVULATION");
                            Boolean bool = obj11 instanceof Boolean ? (Boolean) obj11 : null;
                            Object obj12 = map.get("OVULATION");
                            Boolean bool2 = obj12 instanceof Boolean ? (Boolean) obj12 : null;
                            if (bool == null || bool2 == null || ((!bool.booleanValue() || bool2.booleanValue()) && (bool.booleanValue() || !bool2.booleanValue()))) {
                                Object obj13 = map2.get("SEX_DRIVE");
                                Integer num = obj13 instanceof Integer ? (Integer) obj13 : null;
                                Object obj14 = map.get("SEX_DRIVE");
                                Integer num2 = obj14 instanceof Integer ? (Integer) obj14 : null;
                                if ((num != null || num2 == null) && ((num == null || num2 != null) && p005kotlin.jvm.internal.s.g(num, num2))) {
                                    z14 = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.F = z14;
        requireActivity().invalidateOptionsMenu();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof e1) {
            this.f38949a = (e1) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_menstrual_symptom_log, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        y0<cx0.a<ww0.b>> y0Var = ((i0) this.f38954f.getValue()).f86083d;
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new e(new ho0.g(this, 7)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        ww0.b bVar;
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.sex_drive_low);
        viewFindViewById.getClass();
        this.f38950b = (Button) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.sex_drive_avg);
        viewFindViewById2.getClass();
        this.f38951c = (Button) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.sex_drive_high);
        viewFindViewById3.getClass();
        this.f38952d = (Button) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.ovulation_toggle_check);
        viewFindViewById4.getClass();
        this.f38953e = (LottieAnimationView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.symptoms_description);
        viewFindViewById5.getClass();
        ((TextView) viewFindViewById5).setText(getString(((ww0.a) this.f38958j.getValue()) == ww0.a.PREGNANT ? R.string.pregnancy_log_throughout_pregnancy : R.string.mct_log_symptoms_description));
        Bundle bundle2 = (Bundle) this.f38955g.getValue();
        if (bundle2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle2.getParcelable("EXTRA_LOG_KEY", ww0.b.class);
            } else {
                Parcelable parcelable2 = bundle2.getParcelable("EXTRA_LOG_KEY");
                if (!(parcelable2 instanceof ww0.b)) {
                    parcelable2 = null;
                }
                parcelable = (ww0.b) parcelable2;
            }
            bVar = (ww0.b) parcelable;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            v6(view2);
        } else {
            A6(view2, bVar);
        }
        View viewFindViewById6 = view2.findViewById(R.id.ovulation);
        final int i14 = 0;
        viewFindViewById6.setOnClickListener(new View.OnClickListener(this) { // from class: hx0.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86048b;

            {
                this.f86048b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86048b;
                        if (hVar.C) {
                            hVar.z6(40, 53);
                        } else {
                            hVar.z6(0, 20);
                        }
                        hVar.C = !hVar.C;
                        hVar.B0();
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86048b;
                        Button button = hVar2.f38950b;
                        if (button == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button.setSelected(!button.isSelected());
                        Button button2 = hVar2.f38951c;
                        if (button2 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button2.setSelected(false);
                        Button button3 = hVar2.f38952d;
                        if (button3 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button3.setSelected(false);
                        hVar2.B0();
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar3 = this.f86048b;
                        Button button4 = hVar3.f38951c;
                        if (button4 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button4.setSelected(!button4.isSelected());
                        Button button5 = hVar3.f38950b;
                        if (button5 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button5.setSelected(false);
                        Button button6 = hVar3.f38952d;
                        if (button6 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button6.setSelected(false);
                        hVar3.B0();
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86048b;
                        Button button7 = hVar4.f38952d;
                        if (button7 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button7.setSelected(!button7.isSelected());
                        Button button8 = hVar4.f38950b;
                        if (button8 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button8.setSelected(false);
                        Button button9 = hVar4.f38951c;
                        if (button9 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button9.setSelected(false);
                        hVar4.B0();
                        return;
                }
            }
        });
        androidx.core.view.s0.r(viewFindViewById6, new d());
        Button button = this.f38950b;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
            throw null;
        }
        button.setText(R.string.mct_low_sex_drive);
        Button button2 = this.f38951c;
        if (button2 == null) {
            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
            throw null;
        }
        button2.setText(R.string.mct_average_sex_drive);
        Button button3 = this.f38952d;
        if (button3 == null) {
            p005kotlin.jvm.internal.s.m("highSexDriveChip");
            throw null;
        }
        button3.setText(R.string.mct_high_sex_drive);
        Button button4 = this.f38950b;
        if (button4 == null) {
            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
            throw null;
        }
        final int i15 = 1;
        button4.setOnClickListener(new View.OnClickListener(this) { // from class: hx0.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86048b;

            {
                this.f86048b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86048b;
                        if (hVar.C) {
                            hVar.z6(40, 53);
                        } else {
                            hVar.z6(0, 20);
                        }
                        hVar.C = !hVar.C;
                        hVar.B0();
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86048b;
                        Button button5 = hVar2.f38950b;
                        if (button5 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button5.setSelected(!button5.isSelected());
                        Button button6 = hVar2.f38951c;
                        if (button6 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button6.setSelected(false);
                        Button button7 = hVar2.f38952d;
                        if (button7 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button7.setSelected(false);
                        hVar2.B0();
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar3 = this.f86048b;
                        Button button8 = hVar3.f38951c;
                        if (button8 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button8.setSelected(!button8.isSelected());
                        Button button9 = hVar3.f38950b;
                        if (button9 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button9.setSelected(false);
                        Button button10 = hVar3.f38952d;
                        if (button10 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button10.setSelected(false);
                        hVar3.B0();
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86048b;
                        Button button11 = hVar4.f38952d;
                        if (button11 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button11.setSelected(!button11.isSelected());
                        Button button12 = hVar4.f38950b;
                        if (button12 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button12.setSelected(false);
                        Button button13 = hVar4.f38951c;
                        if (button13 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button13.setSelected(false);
                        hVar4.B0();
                        return;
                }
            }
        });
        Button button5 = this.f38951c;
        if (button5 == null) {
            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
            throw null;
        }
        final int i16 = 2;
        button5.setOnClickListener(new View.OnClickListener(this) { // from class: hx0.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86048b;

            {
                this.f86048b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86048b;
                        if (hVar.C) {
                            hVar.z6(40, 53);
                        } else {
                            hVar.z6(0, 20);
                        }
                        hVar.C = !hVar.C;
                        hVar.B0();
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86048b;
                        Button button6 = hVar2.f38950b;
                        if (button6 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button6.setSelected(!button6.isSelected());
                        Button button7 = hVar2.f38951c;
                        if (button7 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button7.setSelected(false);
                        Button button8 = hVar2.f38952d;
                        if (button8 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button8.setSelected(false);
                        hVar2.B0();
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar3 = this.f86048b;
                        Button button9 = hVar3.f38951c;
                        if (button9 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button9.setSelected(!button9.isSelected());
                        Button button10 = hVar3.f38950b;
                        if (button10 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button10.setSelected(false);
                        Button button11 = hVar3.f38952d;
                        if (button11 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button11.setSelected(false);
                        hVar3.B0();
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86048b;
                        Button button12 = hVar4.f38952d;
                        if (button12 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button12.setSelected(!button12.isSelected());
                        Button button13 = hVar4.f38950b;
                        if (button13 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button13.setSelected(false);
                        Button button14 = hVar4.f38951c;
                        if (button14 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button14.setSelected(false);
                        hVar4.B0();
                        return;
                }
            }
        });
        Button button6 = this.f38952d;
        if (button6 == null) {
            p005kotlin.jvm.internal.s.m("highSexDriveChip");
            throw null;
        }
        final int i17 = 3;
        button6.setOnClickListener(new View.OnClickListener(this) { // from class: hx0.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h f86048b;

            {
                this.f86048b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar = this.f86048b;
                        if (hVar.C) {
                            hVar.z6(40, 53);
                        } else {
                            hVar.z6(0, 20);
                        }
                        hVar.C = !hVar.C;
                        hVar.B0();
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar2 = this.f86048b;
                        Button button7 = hVar2.f38950b;
                        if (button7 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button7.setSelected(!button7.isSelected());
                        Button button8 = hVar2.f38951c;
                        if (button8 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button8.setSelected(false);
                        Button button9 = hVar2.f38952d;
                        if (button9 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button9.setSelected(false);
                        hVar2.B0();
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar3 = this.f86048b;
                        Button button10 = hVar3.f38951c;
                        if (button10 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button10.setSelected(!button10.isSelected());
                        Button button11 = hVar3.f38950b;
                        if (button11 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button11.setSelected(false);
                        Button button12 = hVar3.f38952d;
                        if (button12 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button12.setSelected(false);
                        hVar3.B0();
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = this.f86048b;
                        Button button13 = hVar4.f38952d;
                        if (button13 == null) {
                            p005kotlin.jvm.internal.s.m("highSexDriveChip");
                            throw null;
                        }
                        button13.setSelected(!button13.isSelected());
                        Button button14 = hVar4.f38950b;
                        if (button14 == null) {
                            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                            throw null;
                        }
                        button14.setSelected(false);
                        Button button15 = hVar4.f38951c;
                        if (button15 == null) {
                            p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                            throw null;
                        }
                        button15.setSelected(false);
                        hVar4.B0();
                        return;
                }
            }
        });
    }

    public final void u6(HashMap<String, Object> map) {
        map.put("SYMPTOMS", ((j0) this.f38964p.getValue()).t());
        map.put("MOOD", ((d0) this.f38967t.getValue()).t());
        map.put("FLOW", ((d0) this.f38961m.getValue()).t());
        map.put("DISCHARGE", ((d0) this.f38970x.getValue()).t());
        map.put("SEXUAL_ACTIVITY", ((d0) this.A.getValue()).t());
        map.put("OVULATION", Boolean.valueOf(this.C));
        Button button = this.f38950b;
        Integer numValueOf = null;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
            throw null;
        }
        if (button.isSelected()) {
            Button button2 = this.f38950b;
            if (button2 == null) {
                p005kotlin.jvm.internal.s.m("lowSexDriveChip");
                throw null;
            }
            numValueOf = Integer.valueOf(button2.getId());
        } else {
            Button button3 = this.f38951c;
            if (button3 == null) {
                p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                throw null;
            }
            if (button3.isSelected()) {
                Button button4 = this.f38951c;
                if (button4 == null) {
                    p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                    throw null;
                }
                numValueOf = Integer.valueOf(button4.getId());
            } else {
                Button button5 = this.f38952d;
                if (button5 == null) {
                    p005kotlin.jvm.internal.s.m("highSexDriveChip");
                    throw null;
                }
                if (button5.isSelected()) {
                    Button button6 = this.f38952d;
                    if (button6 == null) {
                        p005kotlin.jvm.internal.s.m("highSexDriveChip");
                        throw null;
                    }
                    numValueOf = Integer.valueOf(button6.getId());
                }
            }
        }
        map.put("SEX_DRIVE", numValueOf);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o13.l] */
    public final void v6(View view2) {
        LocalDate localDate = (LocalDate) this.f38956h.getValue();
        if (localDate != null) {
            g22.e.l(this);
            i0 i0Var = (i0) this.f38954f.getValue();
            i0Var.getClass();
            ReentrantLock reentrantLock = i0Var.f86082c;
            reentrantLock.lock();
            try {
                c2 c2Var = i0Var.f86086g;
                if (c2Var == null || !c2Var.isActive()) {
                    i0Var.f86086g = ge1.b.T(i0Var, null, null, new g0(i0Var, localDate, null), 3);
                }
                y0<cx0.a<ww0.c>> y0Var = i0Var.f86084e;
                reentrantLock.unlock();
                y0Var.f(getViewLifecycleOwner(), new e(new m1(29, this, view2)));
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:41:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x0151  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:4: B:45:0x014b->B:78:?, LOOP_END, SYNTHETIC] */
    public final ww0.b w6() {
        r rVar;
        r rVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        Object next;
        ArrayList arrayList3;
        HashSet<Integer> hashSetT = ((j0) this.f38964p.getValue()).t();
        HashSet<Integer> hashSetT2 = ((d0) this.f38961m.getValue()).t();
        HashSet<Integer> hashSetT3 = ((d0) this.f38967t.getValue()).t();
        HashSet<Integer> hashSetT4 = ((d0) this.f38970x.getValue()).t();
        HashSet<Integer> hashSetT5 = ((d0) this.A.getValue()).t();
        Button button = this.f38950b;
        Object obj = null;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("lowSexDriveChip");
            throw null;
        }
        if (button.isSelected()) {
            rVar2 = r.LOW;
        } else {
            Button button2 = this.f38951c;
            if (button2 == null) {
                p005kotlin.jvm.internal.s.m("avgSexDriveChip");
                throw null;
            }
            if (!button2.isSelected()) {
                Button button3 = this.f38952d;
                if (button3 == null) {
                    p005kotlin.jvm.internal.s.m("highSexDriveChip");
                    throw null;
                }
                if (button3.isSelected()) {
                    rVar2 = r.HIGH;
                } else {
                    rVar = null;
                }
                Long lValueOf = Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                LocalDate localDate = (LocalDate) this.f38956h.getValue();
                List list = (List) this.f38963o.getValue();
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (hashSetT.contains(Integer.valueOf(((ww0.t) obj2).ordinal()))) {
                        arrayList.add(obj2);
                    }
                }
                List list2 = (List) this.f38966r.getValue();
                arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (hashSetT3.contains(Integer.valueOf(((p) obj3).ordinal()))) {
                        arrayList2.add(obj3);
                    }
                }
                it = ((List) this.f38960l.getValue()).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!hashSetT2.contains(Integer.valueOf(((ww0.h) next).ordinal())));
                ww0.h hVar = (ww0.h) next;
                List list3 = (List) this.f38969w.getValue();
                arrayList3 = new ArrayList();
                for (Object obj4 : list3) {
                    if (hashSetT4.contains(Integer.valueOf(((ww0.e) obj4).ordinal()))) {
                        arrayList3.add(obj4);
                    }
                }
                for (Object obj5 : (List) this.f38972z.getValue()) {
                    if (hashSetT5.contains(Integer.valueOf(((s) obj5).ordinal()))) {
                        obj = obj5;
                        break;
                    }
                }
                return new ww0.b(lValueOf, localDate, arrayList, arrayList2, hVar, arrayList3, rVar, (s) obj, this.D, DateTime.now(DateTimeZone.UTC), Boolean.valueOf(this.C), this.E, null, 4096, null);
            }
            rVar2 = r.AVERAGE;
        }
        rVar = rVar2;
        Long lValueOf2 = Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
        LocalDate localDate2 = (LocalDate) this.f38956h.getValue();
        List list4 = (List) this.f38963o.getValue();
        arrayList = new ArrayList();
        while (r6.hasNext()) {
            if (hashSetT.contains(Integer.valueOf(((ww0.t) obj2).ordinal()))) {
                arrayList.add(obj2);
            }
        }
        List list5 = (List) this.f38966r.getValue();
        arrayList2 = new ArrayList();
        while (r1.hasNext()) {
            if (hashSetT3.contains(Integer.valueOf(((p) obj3).ordinal()))) {
                arrayList2.add(obj3);
            }
        }
        it = ((List) this.f38960l.getValue()).iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!hashSetT2.contains(Integer.valueOf(((ww0.h) next).ordinal())));
        ww0.h hVar2 = (ww0.h) next;
        List list6 = (List) this.f38969w.getValue();
        arrayList3 = new ArrayList();
        while (r1.hasNext()) {
            if (hashSetT4.contains(Integer.valueOf(((ww0.e) obj4).ordinal()))) {
                arrayList3.add(obj4);
            }
        }
        while (r1.hasNext()) {
            if (hashSetT5.contains(Integer.valueOf(((s) obj5).ordinal()))) {
                obj = obj5;
                break;
            }
        }
        return new ww0.b(lValueOf2, localDate2, arrayList, arrayList2, hVar2, arrayList3, rVar, (s) obj, this.D, DateTime.now(DateTimeZone.UTC), Boolean.valueOf(this.C), this.E, null, 4096, null);
    }

    public final double y6() {
        return ((Number) this.B.getValue()).doubleValue();
    }

    public final void z6(Integer num, Integer num2) {
        LottieAnimationView lottieAnimationView = this.f38953e;
        if (lottieAnimationView == null) {
            p005kotlin.jvm.internal.s.m("ovulationToggleCheck");
            throw null;
        }
        lottieAnimationView.setMinAndMaxFrame(num.intValue(), num2.intValue());
        LottieAnimationView lottieAnimationView2 = this.f38953e;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.playAnimation();
        } else {
            p005kotlin.jvm.internal.s.m("ovulationToggleCheck");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lj23/l;", "ovulationCheck", "Lj23/l;", "ovulationUncheck", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
