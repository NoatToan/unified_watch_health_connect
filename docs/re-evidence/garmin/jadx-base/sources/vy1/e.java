package vy1;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.s;
import c22.r0;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.library.mapsdkadapter.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.DescriptorProtos;
import e23.l;
import fg0.o;
import fg0.u;
import fg0.x;
import fw.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import mz1.k;
import o53.b0;
import o53.c0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p13.y;
import ty1.h0;
import vn2.t0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvy1/e;", "Lty1/h0;", "Lo53/b0;", "Lto0/a$c;", "Lwy1/b$a;", "", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends h0 implements b0, to0.a.c, wy1.b.a {
    public static final a T = new a(null);
    public static final Logger X;
    public RecyclerView A;
    public BubbleLayout B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public wy1.a I;
    public final c P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u53.d f180803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f180804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ry1.a f180805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SearchView f180806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f180807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f180808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f180809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f180810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f180811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f180812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f180813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public to0.a f180814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f180815n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f180816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f180817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f180818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f180819r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f180820t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f180821v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f180822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f180823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f180824y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f180825z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f180827b;

        static {
            int[] iArr = new int[j22.f.values().length];
            try {
                iArr[j22.f.ALLOWED_ALL_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j22.f.ALLOWED_WHILE_USING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f180826a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f180827b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vy1/e$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            e eVar = e.this;
            if (eVar.C6().P) {
                eVar.requireActivity().finish();
                return;
            }
            if (!eVar.E) {
                eVar.C6().N2.j(null);
                eVar.P.f(false);
                eVar.requireActivity().onBackPressed();
                return;
            }
            eVar.F6();
            SearchView searchView = eVar.f180806e;
            if (searchView == null) {
                p005kotlin.jvm.internal.s.m("locationSearchView");
                throw null;
            }
            CharSequence query = searchView.getQuery();
            if (query == null || query.length() == 0) {
                eVar.C6().P6(null, null, true);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f180829a;

        public d(l lVar) {
            lVar.getClass();
            this.f180829a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f180829a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f180829a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: vy1.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C3369e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f180830a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3369e(Fragment fragment) {
            super(0);
            this.f180830a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f180830a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f180831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f180832b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f180831a = aVar;
            this.f180832b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f180831a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f180832b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f180833a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f180833a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f180833a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        X = gt2.b.f79005a.h("TIFindEventFragment");
    }

    public e() {
        super(R.layout.ti_find_event_fragment);
        this.f180803b = c0.b();
        this.f180804c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new C3369e(this), new g(this), new f(null, this));
        this.C = true;
        this.D = true;
        this.P = new c();
    }

    public static Location E6(Context context) {
        j22.b.f96736a.getClass();
        int i14 = b.f180826a[j22.b.j(context).ordinal()];
        Location lastKnownLocation = null;
        if (i14 == 1 || i14 == 2) {
            Criteria criteria = new Criteria();
            criteria.setAltitudeRequired(false);
            criteria.setBearingRequired(false);
            criteria.setSpeedRequired(false);
            criteria.setCostAllowed(true);
            criteria.setAccuracy(0);
            criteria.setHorizontalAccuracy(0);
            criteria.setPowerRequirement(0);
            criteria.setVerticalAccuracy(0);
            Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            List<String> providers = locationManager != null ? locationManager.getProviders(criteria, false) : null;
            if (providers != null && !providers.isEmpty()) {
                Iterator<String> it = providers.iterator();
                while (it.hasNext() && (lastKnownLocation = locationManager.getLastKnownLocation(it.next())) == null) {
                }
            }
        }
        return lastKnownLocation;
    }

    public final void A6() {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        Location locationE6 = E6(contextRequireContext);
        AddTIEventViewModel addTIEventViewModelC6 = C6();
        Double dValueOf = locationE6 != null ? Double.valueOf(locationE6.getLatitude()) : null;
        Double dValueOf2 = locationE6 != null ? Double.valueOf(locationE6.getLongitude()) : null;
        String[] strArr = AddTIEventViewModel.V2;
        addTIEventViewModelC6.P6(dValueOf, dValueOf2, true);
    }

    @Override // wy1.b.a
    public final void B3(o oVar) {
        Object next;
        oVar.getClass();
        this.C = false;
        AddTIEventViewModel addTIEventViewModelC6 = C6();
        List<fg0.g> listH = oVar.h();
        if (listH == null) {
            listH = j0.f134944a;
        }
        Iterator<T> it = listH.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((fg0.g) next).getView() != fg0.h.GC);
        fg0.g gVar = (fg0.g) next;
        if (gVar == null) {
            gVar = (fg0.g) p13.h0.d0(listH);
        }
        if (gVar != null) {
            ge1.b.T(v1.a(addTIEventViewModelC6), null, null, new k(addTIEventViewModelC6, gVar, oVar, null), 3);
        } else {
            addTIEventViewModelC6.v5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            p005kotlin.jvm.internal.s.m("eventSearchDTO");
            throw null;
        }
    }

    public final AddTIEventViewModel C6() {
        return (AddTIEventViewModel) this.f180804c.getValue();
    }

    public final void F6() {
        EditText editText = this.f180808g;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
            throw null;
        }
        Editable text = editText.getText();
        if (text != null && text.length() != 0) {
            H6(false);
            this.C = true;
            return;
        }
        this.E = false;
        this.C = false;
        EditText editText2 = this.f180808g;
        if (editText2 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
            throw null;
        }
        Context context = getContext();
        if (context != null) {
            Object systemService = context.getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(editText2.getWindowToken(), 0);
        } else {
            X.trace("Context is null");
        }
        SearchView searchView = this.f180806e;
        if (searchView == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        searchView.setSelected(false);
        SearchView searchView2 = this.f180806e;
        if (searchView2 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        searchView2.clearFocus();
        SearchView searchView3 = this.f180806e;
        if (searchView3 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        searchView3.j("");
        ImageView imageView = this.f180807f;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("locationSearchImageView");
            throw null;
        }
        imageView.setVisibility(8);
        EditText editText3 = this.f180808g;
        if (editText3 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
            throw null;
        }
        editText3.setHintTextColor(getResources().getColor(R.color.gcm_text_primary, null));
        SearchView searchView4 = this.f180806e;
        if (searchView4 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        searchView4.setQueryHint(getString(R.string.city_state_zip));
        TextView textView = this.f180816o;
        if (textView != null) {
            textView.setVisibility(0);
        } else {
            p005kotlin.jvm.internal.s.m("createAnEventView");
            throw null;
        }
    }

    public final void G6(CalendarItemDTO calendarItemDTO, o oVar, fg0.k kVar) {
        EventDetailsActivity.a aVar = EventDetailsActivity.f45692o;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        fg0.p pVarY = oVar.y();
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF = oVar.f();
        boolean zG = p005kotlin.jvm.internal.s.g(C6().f204393j, Boolean.TRUE);
        x xVar = C6().f204394k;
        boolean z14 = C6().f204395l;
        u uVar = C6().f204397n;
        aVar.getClass();
        requireActivity().startActivityForResult(EventDetailsActivity.a.a(contextRequireContext, calendarItemDTO, kVar, pVarY, listF, zG, xVar, z14, uVar), DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE);
    }

    public final void H6(boolean z14) {
        this.E = z14;
        if (z14) {
            ImageView imageView = this.f180807f;
            if (imageView == null) {
                p005kotlin.jvm.internal.s.m("locationSearchImageView");
                throw null;
            }
            imageView.setVisibility(0);
            LinearLayout linearLayout = this.f180811j;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("eventNameLayout");
                throw null;
            }
            linearLayout.setVisibility(8);
            TextView textView = this.f180816o;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("createAnEventView");
                throw null;
            }
        }
        RecyclerView recyclerView = this.f180812k;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView.setVisibility(8);
        ImageView imageView2 = this.f180807f;
        if (imageView2 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchImageView");
            throw null;
        }
        imageView2.setVisibility(8);
        LinearLayout linearLayout2 = this.f180809h;
        if (linearLayout2 == null) {
            p005kotlin.jvm.internal.s.m("currentLocationLayout");
            throw null;
        }
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = this.f180811j;
        if (linearLayout3 == null) {
            p005kotlin.jvm.internal.s.m("eventNameLayout");
            throw null;
        }
        linearLayout3.setVisibility(0);
        TextView textView2 = this.f180816o;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            p005kotlin.jvm.internal.s.m("createAnEventView");
            throw null;
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return this.f180803b.f168725a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f180805d = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddEventMainFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (i14 != 2) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            A6();
        } else {
            new androidx.appcompat.app.e.a(requireContext()).setTitle(getString(R.string.weather_location_permission_needed)).setMessage(getString(R.string.allow_access_to_phone_settings)).setPositiveButton(R.string.lbl_settings, new sa2.b(this, 23)).setNegativeButton(R.string.common_cancel, new vu1.k(2)).show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AddTIEventViewModel addTIEventViewModelC6 = C6();
        zf0.a aVar = zf0.a.FIND_EVENT_WO_TYPE_SELECTION;
        aVar.getClass();
        ((y0) addTIEventViewModelC6.Y.getValue()).m(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String strG;
        String strA;
        Location locationE6;
        LocalDate localDate;
        o13.p pVarN;
        ez1.d dVar;
        gg0.f fVarD;
        my1.d dVarB;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new h(this), androidx.lifecycle.b0.b.RESUMED);
        ry1.a aVar = this.f180805d;
        final int i14 = 2;
        if (aVar != null) {
            String string = getString(R.string.atp_lbl_find_race_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.P, viewLifecycleOwner);
        ht.a aVar2 = ht.a.f85464a;
        Bundle bundle2 = new Bundle(1);
        bundle2.putString("EventCreationType", "FindAnEvent");
        Unit unit = Unit.INSTANCE;
        aVar2.getClass();
        ht.a.a(bundle2, "EventCreationTypeSelection");
        View viewFindViewById = view2.findViewById(R.id.ll_event_name);
        viewFindViewById.getClass();
        this.f180811j = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.use_my_location_layout);
        viewFindViewById2.getClass();
        this.f180809h = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.use_my_location_label);
        viewFindViewById3.getClass();
        this.f180810i = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.location_search_view);
        viewFindViewById4.getClass();
        SearchView searchView = (SearchView) viewFindViewById4;
        this.f180806e = searchView;
        View viewFindViewById5 = searchView.findViewById(R.id.search_src_text);
        viewFindViewById5.getClass();
        EditText editText = (EditText) viewFindViewById5;
        this.f180808g = editText;
        editText.setHintTextColor(getResources().getColor(R.color.gcm_text_primary, null));
        EditText editText2 = this.f180808g;
        if (editText2 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
            throw null;
        }
        editText2.setGravity(8388627);
        View viewFindViewById6 = view2.findViewById(R.id.location_search_image_view);
        viewFindViewById6.getClass();
        ImageView imageView = (ImageView) viewFindViewById6;
        this.f180807f = imageView;
        imageView.setVisibility(8);
        View viewFindViewById7 = view2.findViewById(R.id.location_search_recycler_view);
        viewFindViewById7.getClass();
        this.f180812k = (RecyclerView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.recycler_view_events);
        viewFindViewById8.getClass();
        this.f180813l = (RecyclerView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.event_search_title_view);
        viewFindViewById9.getClass();
        this.f180815n = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.create_an_event);
        viewFindViewById10.getClass();
        this.f180816o = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.create_an_event_helper_text);
        viewFindViewById11.getClass();
        View viewFindViewById12 = view2.findViewById(R.id.event_name_text_view);
        viewFindViewById12.getClass();
        this.f180817p = (TextView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.search_event_clear_button);
        viewFindViewById13.getClass();
        this.f180818q = (ImageView) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.search_event_name_layout);
        viewFindViewById14.getClass();
        this.f180819r = (LinearLayout) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.search_event_name_label);
        viewFindViewById15.getClass();
        this.f180821v = (TextView) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.ll_no_results);
        viewFindViewById16.getClass();
        this.f180822w = (LinearLayout) viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.tl_no_data_image);
        viewFindViewById17.getClass();
        this.f180823x = (ImageView) viewFindViewById17;
        View viewFindViewById18 = view2.findViewById(R.id.location_omitted_helper_text);
        viewFindViewById18.getClass();
        this.f180824y = (TextView) viewFindViewById18;
        View viewFindViewById19 = view2.findViewById(R.id.search_event_edit_text);
        viewFindViewById19.getClass();
        this.f180820t = (EditText) viewFindViewById19;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f180814m = new to0.a(contextRequireContext, this);
        View viewFindViewById20 = view2.findViewById(R.id.chip_container);
        viewFindViewById20.getClass();
        this.f180825z = (LinearLayout) viewFindViewById20;
        View viewFindViewById21 = view2.findViewById(R.id.chip_recycler_view);
        viewFindViewById21.getClass();
        this.A = (RecyclerView) viewFindViewById21;
        View viewFindViewById22 = view2.findViewById(R.id.tool_tip_container);
        viewFindViewById22.getClass();
        this.B = (BubbleLayout) viewFindViewById22;
        RecyclerView recyclerView = this.f180812k;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        to0.a aVar3 = this.f180814m;
        if (aVar3 == null) {
            p005kotlin.jvm.internal.s.m("searchResultAdapter");
            throw null;
        }
        recyclerView.setAdapter(aVar3);
        RecyclerView recyclerView2 = this.f180812k;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        to0.a aVar4 = this.f180814m;
        if (aVar4 == null) {
            p005kotlin.jvm.internal.s.m("searchResultAdapter");
            throw null;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(aVar4.f93012b);
        linearLayoutManager.setOrientation(1);
        recyclerView2.setLayoutManager(linearLayoutManager);
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        wy1.a aVar5 = new wy1.a(contextRequireContext2, null == true ? 1 : 0, i14, null == true ? 1 : 0);
        this.I = aVar5;
        aVar5.f188051b = this;
        RecyclerView recyclerView3 = this.A;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("chipRecyclerView");
            throw null;
        }
        recyclerView3.setAdapter(aVar5);
        RecyclerView recyclerView4 = this.A;
        if (recyclerView4 == null) {
            p005kotlin.jvm.internal.s.m("chipRecyclerView");
            throw null;
        }
        final int i15 = 0;
        recyclerView4.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        DateTime dateTimeP5 = C6().p5();
        if (dateTimeP5 == null) {
            dateTimeP5 = new DateTime();
        }
        final int i16 = 7;
        Date date = dateTimeP5.plusDays(7).toDate();
        date.getClass();
        String strG2 = c22.j0.g(date, "MMM d", null);
        int days = Days.daysBetween(LocalDate.now(), dateTimeP5.toLocalDate()).getDays();
        if (days < 7) {
            Date date2 = dateTimeP5.minusDays(days).toDate();
            date2.getClass();
            strG = c22.j0.g(date2, "MMM d", null);
        } else {
            Date date3 = dateTimeP5.minusDays(7).toDate();
            date3.getClass();
            strG = c22.j0.g(date3, "MMM d", null);
        }
        o13.p pVar = new o13.p(strG, strG2);
        TextView textView = this.f180815n;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("searchTitleView");
            throw null;
        }
        textView.setText(getString(R.string.event_results_between_date_range, pVar.f128594a, pVar.f128595b));
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView5 = this.f180813l;
        if (recyclerView5 == null) {
            p005kotlin.jvm.internal.s.m("recyclerViewEvents");
            throw null;
        }
        recyclerView5.setLayoutManager(linearLayoutManager2);
        TextView textView2 = this.f180821v;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("searchEventHintView");
            throw null;
        }
        gg0.f fVarD2 = C6().D5().d();
        if (fVarD2 != null) {
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            strA = fVarD2.a(contextRequireContext3);
        } else {
            strA = "";
        }
        textView2.setText(getString(R.string.event_name_search, strA));
        final int i17 = 6;
        if (new jy1.a((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).f101852a.W2("keyShouldShowTooltip", true)) {
            new jy1.a((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).f101852a.O2("keyShouldShowTooltip", false);
            TextView textView3 = (TextView) view2.findViewById(R.id.tool_tip_label);
            BubbleLayout bubbleLayout = this.B;
            if (bubbleLayout == null) {
                p005kotlin.jvm.internal.s.m("tooltipView");
                throw null;
            }
            String string2 = getString(R.string.adjust_search_preferences);
            string2.getClass();
            og.a.Y(bubbleLayout, string2);
            String string3 = requireContext().getString(R.string.adjust_search_preferences);
            string3.getClass();
            textView3.setText(string3);
            BubbleLayout bubbleLayout2 = this.B;
            if (bubbleLayout2 == null) {
                p005kotlin.jvm.internal.s.m("tooltipView");
                throw null;
            }
            bubbleLayout2.setVisibility(0);
            bubbleLayout2.bringToFront();
            BubbleLayout bubbleLayout3 = this.B;
            if (bubbleLayout3 == null) {
                p005kotlin.jvm.internal.s.m("tooltipView");
                throw null;
            }
            bubbleLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: vy1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f180798b;

                {
                    this.f180798b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i18 = i15;
                    e eVar = this.f180798b;
                    switch (i18) {
                        case 0:
                            BubbleLayout bubbleLayout4 = eVar.B;
                            if (bubbleLayout4 != null) {
                                bubbleLayout4.setVisibility(8);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("tooltipView");
                                throw null;
                            }
                        case 1:
                            TextView textView4 = eVar.f180817p;
                            if (textView4 == null) {
                                p005kotlin.jvm.internal.s.m("searchEventTextView");
                                throw null;
                            }
                            textView4.setVisibility(8);
                            LinearLayout linearLayout = eVar.f180819r;
                            if (linearLayout == null) {
                                p005kotlin.jvm.internal.s.m("searchKeywordLayout");
                                throw null;
                            }
                            linearLayout.setVisibility(0);
                            EditText editText3 = eVar.f180820t;
                            if (editText3 != null) {
                                editText3.requestFocus();
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                                throw null;
                            }
                        case 2:
                            EditText editText4 = eVar.f180820t;
                            if (editText4 != null) {
                                editText4.setText("");
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                                throw null;
                            }
                        case 3:
                            if (!eVar.C) {
                                eVar.C = true;
                                RecyclerView recyclerView6 = eVar.f180812k;
                                if (recyclerView6 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerView");
                                    throw null;
                                }
                                recyclerView6.setVisibility(0);
                                LinearLayout linearLayout2 = eVar.f180809h;
                                if (linearLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("currentLocationLayout");
                                    throw null;
                                }
                                linearLayout2.setVisibility(0);
                                EditText editText5 = eVar.f180808g;
                                if (editText5 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                editText5.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                                EditText editText6 = eVar.f180808g;
                                if (editText6 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                editText6.setHint(eVar.getString(R.string.lbl_enter_group_location));
                            }
                            eVar.H6(true);
                            return;
                        case 4:
                            e.a aVar6 = e.T;
                            eVar.C6().N2.j(null);
                            if (!eVar.C6().f204396m) {
                                AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                                zf0.a aVar7 = zf0.a.CREATE_EVENT;
                                aVar7.getClass();
                                ((y0) addTIEventViewModelC6.Y.getValue()).m(aVar7);
                                addTIEventViewModelC6.O5().m("TIAddEventNameFragment");
                                return;
                            }
                            Intent intent = new Intent();
                            intent.putExtra("extra_fbt_navigate_event_creation_flow", true);
                            m activity = eVar.getActivity();
                            if (activity != null) {
                                activity.setResult(-1, intent);
                            }
                            m activity2 = eVar.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                                return;
                            }
                            return;
                        case 5:
                            e.a aVar8 = e.T;
                            eVar.H6(true);
                            SearchView searchView2 = eVar.f180806e;
                            if (searchView2 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            if (searchView2.isFocused()) {
                                return;
                            }
                            SearchView searchView3 = eVar.f180806e;
                            if (searchView3 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView3.setIconified(false);
                            SearchView searchView4 = eVar.f180806e;
                            if (searchView4 != null) {
                                searchView4.requestFocus();
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                        case 6:
                            e.a aVar9 = e.T;
                            j22.b bVar = j22.b.f96736a;
                            Context contextRequireContext4 = eVar.requireContext();
                            contextRequireContext4.getClass();
                            bVar.getClass();
                            if (j22.b.c(contextRequireContext4)) {
                                eVar.A6();
                                return;
                            } else {
                                j22.b.z(eVar, 2, j22.a.f96719h);
                                return;
                            }
                        default:
                            e.a aVar10 = e.T;
                            AddTIEventViewModel addTIEventViewModelC7 = eVar.C6();
                            String[] strArr = AddTIEventViewModel.V2;
                            addTIEventViewModelC7.P6(null, null, true);
                            EditText editText7 = eVar.f180808g;
                            if (editText7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText7.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                            SearchView searchView5 = eVar.f180806e;
                            if (searchView5 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView5.setQueryHint(eVar.getString(R.string.lbl_enter_group_location));
                            EditText editText8 = eVar.f180808g;
                            if (editText8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText8.setText("");
                            eVar.D = false;
                            return;
                    }
                }
            });
        }
        SearchView searchView2 = this.f180806e;
        if (searchView2 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        searchView2.setOnQueryTextListener(new vy1.f(this));
        C6().N2.f(getViewLifecycleOwner(), new d(new l(this) { // from class: vy1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180800b;

            {
                this.f180800b = this;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x010b  */
            /* JADX WARN: Code duplicated, block: B:54:0x010f  */
            /* JADX WARN: Code duplicated, block: B:57:0x0115  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                vo0.f fVar;
                LinearLayout linearLayout;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
                int i18 = i15;
                e eVar = this.f180800b;
                switch (i18) {
                    case 0:
                        ky1.b bVar = (ky1.b) obj;
                        e.a aVar6 = e.T;
                        List<vo0.e> listB = (bVar == null || (fVar = (vo0.f) bVar.f107775a) == null) ? null : fVar.b();
                        if (bVar == null) {
                            eVar.H6(false);
                        } else if (listB != null) {
                            eVar.H6(true);
                            if (listB.isEmpty()) {
                                to0.a aVar7 = eVar.f180814m;
                                if (aVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar7.t(p13.w.c(new to0.a.AbstractC3116a.b("")));
                                eVar.F6();
                            } else {
                                ArrayList arrayList = new ArrayList(y.r(listB, 10));
                                Iterator<T> it = listB.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new to0.a.AbstractC3116a.C3117a((vo0.e) it.next()));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : arrayList) {
                                    to0.a.AbstractC3116a.C3117a c3117a = (to0.a.AbstractC3116a.C3117a) obj2;
                                    if (c3117a.f165833a.getAddress() == null) {
                                        vo0.a address = c3117a.f165833a.getAddress();
                                        if ((address != null ? address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String() : null) != null) {
                                        }
                                    }
                                    arrayList2.add(obj2);
                                }
                                EditText editText3 = eVar.f180808g;
                                if (editText3 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                if (editText3.hasFocus()) {
                                    RecyclerView recyclerView6 = eVar.f180812k;
                                    if (recyclerView6 == null) {
                                        p005kotlin.jvm.internal.s.m("recyclerView");
                                        throw null;
                                    }
                                    if (!v22.e.d(recyclerView6)) {
                                        RecyclerView recyclerView7 = eVar.f180812k;
                                        if (recyclerView7 == null) {
                                            p005kotlin.jvm.internal.s.m("recyclerView");
                                            throw null;
                                        }
                                        recyclerView7.setVisibility(0);
                                    }
                                }
                                to0.a aVar8 = eVar.f180814m;
                                if (aVar8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar8.t(arrayList2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) obj;
                        if (fVar2 == null) {
                            e.a aVar9 = e.T;
                            eVar.C6().J6(null);
                        } else if (eVar.D) {
                            o13.p<String, com.garmin.android.library.mapsdkadapter.f> pVar2 = eVar.C6().f46447y2;
                            if (!(pVar2 != null ? fVar2.equals(pVar2.f128595b) : false)) {
                                eVar.C6().L5(fVar2);
                            }
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            ge1.b.T(v1.a(addTIEventViewModelC6), null, null, new mz1.o(addTIEventViewModelC6, fVar2, null), 3);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        String str = (String) obj;
                        if (str != null) {
                            eVar.C = false;
                            SearchView searchView3 = eVar.f180806e;
                            if (searchView3 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView3.clearFocus();
                            SearchView searchView4 = eVar.f180806e;
                            if (searchView4 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView4.j(str);
                            EditText editText4 = eVar.f180808g;
                            if (editText4 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText4.setCursorVisible(true);
                            SearchView searchView5 = eVar.f180806e;
                            if (searchView5 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView5.setFocusable(false);
                            SearchView searchView6 = eVar.f180806e;
                            if (searchView6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView6.clearFocus();
                            eVar.H6(false);
                        } else {
                            e.a aVar10 = e.T;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var = (g3) obj;
                        e.a aVar11 = e.T;
                        int i19 = e.b.f180827b[g3Var.f35300a.ordinal()];
                        if (i19 == 1) {
                            g22.e.l(eVar);
                        } else if (i19 == 2) {
                            g22.e.f(eVar);
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            xy1.b bVar2 = (xy1.b) g3Var.f35301b;
                            if (bVar2 != null) {
                                Context contextRequireContext4 = eVar.requireContext();
                                contextRequireContext4.getClass();
                                List<o> list = bVar2.f192701c;
                                boolean z14 = bVar2.f192703e;
                                wy1.b bVar3 = new wy1.b(contextRequireContext4, list);
                                bVar3.f188057c = eVar;
                                RecyclerView recyclerView8 = eVar.f180813l;
                                if (recyclerView8 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                                    throw null;
                                }
                                recyclerView8.setAdapter(bVar3);
                                LinearLayout linearLayout2 = eVar.f180822w;
                                if (linearLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("noSearchResultsView");
                                    throw null;
                                }
                                v22.e.v(linearLayout2, list.isEmpty());
                                ImageView imageView2 = eVar.f180823x;
                                if (imageView2 == null) {
                                    p005kotlin.jvm.internal.s.m("noDataImage");
                                    throw null;
                                }
                                r0 r0Var = r0.f23226a;
                                Context contextRequireContext5 = eVar.requireContext();
                                contextRequireContext5.getClass();
                                r0Var.getClass();
                                Drawable drawable = a7.b.getDrawable(contextRequireContext5, R.drawable.gcm_no_data_stats_image);
                                drawable.getClass();
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable drawable2 = a7.b.getDrawable(contextRequireContext5, R.drawable.search);
                                Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
                                if (drawableMutate == null) {
                                    drawableMutate = null;
                                }
                                if (drawableMutate != null) {
                                    drawableMutate.setTint(a7.b.getColor(contextRequireContext5, R.color.gcm_icon_secondary));
                                    drawableMutate.setTintMode(PorterDuff.Mode.SRC_IN);
                                }
                                layerDrawable.setDrawableByLayerId(R.id.no_data_icon_drawable, drawableMutate);
                                imageView2.setImageDrawable(layerDrawable);
                                TextView textView4 = eVar.f180815n;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                v22.e.v(textView4, true ^ list.isEmpty());
                                EditText editText5 = eVar.f180808g;
                                if (editText5 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                editText5.clearFocus();
                                SearchView searchView7 = eVar.f180806e;
                                if (searchView7 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchView");
                                    throw null;
                                }
                                searchView7.clearFocus();
                                eVar.F = false;
                                RecyclerView recyclerView9 = eVar.f180812k;
                                if (recyclerView9 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerView");
                                    throw null;
                                }
                                recyclerView9.setVisibility(8);
                                LinearLayout linearLayout3 = eVar.f180811j;
                                if (linearLayout3 == null) {
                                    p005kotlin.jvm.internal.s.m("eventNameLayout");
                                    throw null;
                                }
                                linearLayout3.setVisibility(0);
                                TextView textView5 = eVar.f180815n;
                                if (textView5 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                textView5.setText(eVar.getString(R.string.event_results_between_date_range, bVar2.f192699a, bVar2.f192700b));
                                if (bVar2.f192702d || z14) {
                                    TextView textView6 = eVar.f180824y;
                                    if (textView6 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView6.setVisibility(0);
                                    TextView textView7 = eVar.f180824y;
                                    if (textView7 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView7.setText(z14 ? eVar.getString(R.string.location_is_omitted_worldwide) : eVar.getString(R.string.location_is_omitted));
                                } else {
                                    TextView textView8 = eVar.f180824y;
                                    if (textView8 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView8.setVisibility(8);
                                }
                            }
                            g22.e.f(eVar);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        List<xy1.d> list2 = (List) obj;
                        if (list2 != null) {
                            e.a aVar12 = e.T;
                            if (list2.isEmpty()) {
                                linearLayout = eVar.f180825z;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            } else {
                                LinearLayout linearLayout4 = eVar.f180825z;
                                if (linearLayout4 == null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout4.setVisibility(0);
                                wy1.a aVar13 = eVar.I;
                                if (aVar13 != null) {
                                    aVar13.f188050a = list2;
                                    aVar13.notifyDataSetChanged();
                                }
                            }
                        } else {
                            linearLayout = eVar.f180825z;
                            if (linearLayout != null) {
                                p005kotlin.jvm.internal.s.m("chipContainer");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        e.a aVar14 = e.T;
                        int i24 = e.b.f180827b[g3Var2.f35300a.ordinal()];
                        e eVar2 = this.f180800b;
                        if (i24 == 1) {
                            g22.e.l(eVar2);
                        } else if (i24 == 2) {
                            g22.e.f(eVar2);
                        } else {
                            if (i24 != 3) {
                                u0.r();
                                return null;
                            }
                            my1.b bVar4 = (my1.b) g3Var2.f35301b;
                            if (bVar4 != null) {
                                CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
                                calendarItemDTO.I1 = true;
                                if (bVar4 instanceof my1.b.a) {
                                    my1.b.a aVar15 = (my1.b.a) bVar4;
                                    o oVar = aVar15.f121479b;
                                    fg0.k kVar = aVar15.f121478a;
                                    calendarItemDTO.H1 = kVar.getShareableEventUuid();
                                    if (kVar.getEventType() == gg0.f.f77136l && ((listH = kVar.h()) == null || listH.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVar, oVar, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar, kVar);
                                    }
                                } else {
                                    if (!(bVar4 instanceof my1.b.C2302b)) {
                                        u0.r();
                                        return null;
                                    }
                                    o oVar2 = ((my1.b.C2302b) bVar4).f121480a;
                                    String garminEventUuid = oVar2.getGarminEventUuid();
                                    if (garminEventUuid == null) {
                                        garminEventUuid = oVar2.getEventRef();
                                    }
                                    calendarItemDTO.H1 = garminEventUuid;
                                    fg0.k kVarU = oVar2.u();
                                    if (oVar2.getEventType() == gg0.f.f77136l && ((listF = oVar2.f()) == null || listF.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVarU, oVar2, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar2, kVarU);
                                    }
                                }
                            }
                            g22.e.f(eVar2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        SearchView searchView3 = this.f180806e;
        if (searchView3 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        searchView3.setOnCloseListener(new t0(this, 9));
        EditText editText3 = this.f180808g;
        if (editText3 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
            throw null;
        }
        final int i18 = 3;
        editText3.setOnClickListener(new View.OnClickListener(this) { // from class: vy1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180798b;

            {
                this.f180798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i19 = i18;
                e eVar = this.f180798b;
                switch (i19) {
                    case 0:
                        BubbleLayout bubbleLayout4 = eVar.B;
                        if (bubbleLayout4 != null) {
                            bubbleLayout4.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("tooltipView");
                            throw null;
                        }
                    case 1:
                        TextView textView4 = eVar.f180817p;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("searchEventTextView");
                            throw null;
                        }
                        textView4.setVisibility(8);
                        LinearLayout linearLayout = eVar.f180819r;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("searchKeywordLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText4 = eVar.f180820t;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 2:
                        EditText editText5 = eVar.f180820t;
                        if (editText5 != null) {
                            editText5.setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 3:
                        if (!eVar.C) {
                            eVar.C = true;
                            RecyclerView recyclerView6 = eVar.f180812k;
                            if (recyclerView6 == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            recyclerView6.setVisibility(0);
                            LinearLayout linearLayout2 = eVar.f180809h;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("currentLocationLayout");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                            EditText editText6 = eVar.f180808g;
                            if (editText6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText6.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                            EditText editText7 = eVar.f180808g;
                            if (editText7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText7.setHint(eVar.getString(R.string.lbl_enter_group_location));
                        }
                        eVar.H6(true);
                        return;
                    case 4:
                        e.a aVar6 = e.T;
                        eVar.C6().N2.j(null);
                        if (!eVar.C6().f204396m) {
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            zf0.a aVar7 = zf0.a.CREATE_EVENT;
                            aVar7.getClass();
                            ((y0) addTIEventViewModelC6.Y.getValue()).m(aVar7);
                            addTIEventViewModelC6.O5().m("TIAddEventNameFragment");
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("extra_fbt_navigate_event_creation_flow", true);
                        m activity = eVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        m activity2 = eVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar8 = e.T;
                        eVar.H6(true);
                        SearchView searchView4 = eVar.f180806e;
                        if (searchView4 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        if (searchView4.isFocused()) {
                            return;
                        }
                        SearchView searchView5 = eVar.f180806e;
                        if (searchView5 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView5.setIconified(false);
                        SearchView searchView6 = eVar.f180806e;
                        if (searchView6 != null) {
                            searchView6.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                    case 6:
                        e.a aVar9 = e.T;
                        j22.b bVar = j22.b.f96736a;
                        Context contextRequireContext4 = eVar.requireContext();
                        contextRequireContext4.getClass();
                        bVar.getClass();
                        if (j22.b.c(contextRequireContext4)) {
                            eVar.A6();
                            return;
                        } else {
                            j22.b.z(eVar, 2, j22.a.f96719h);
                            return;
                        }
                    default:
                        e.a aVar10 = e.T;
                        AddTIEventViewModel addTIEventViewModelC7 = eVar.C6();
                        String[] strArr = AddTIEventViewModel.V2;
                        addTIEventViewModelC7.P6(null, null, true);
                        EditText editText8 = eVar.f180808g;
                        if (editText8 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText8.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                        SearchView searchView7 = eVar.f180806e;
                        if (searchView7 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView7.setQueryHint(eVar.getString(R.string.lbl_enter_group_location));
                        EditText editText9 = eVar.f180808g;
                        if (editText9 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText9.setText("");
                        eVar.D = false;
                        return;
                }
            }
        });
        TextView textView4 = this.f180816o;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("createAnEventView");
            throw null;
        }
        final int i19 = 4;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: vy1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180798b;

            {
                this.f180798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i19;
                e eVar = this.f180798b;
                switch (i110) {
                    case 0:
                        BubbleLayout bubbleLayout4 = eVar.B;
                        if (bubbleLayout4 != null) {
                            bubbleLayout4.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("tooltipView");
                            throw null;
                        }
                    case 1:
                        TextView textView5 = eVar.f180817p;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("searchEventTextView");
                            throw null;
                        }
                        textView5.setVisibility(8);
                        LinearLayout linearLayout = eVar.f180819r;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("searchKeywordLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText4 = eVar.f180820t;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 2:
                        EditText editText5 = eVar.f180820t;
                        if (editText5 != null) {
                            editText5.setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 3:
                        if (!eVar.C) {
                            eVar.C = true;
                            RecyclerView recyclerView6 = eVar.f180812k;
                            if (recyclerView6 == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            recyclerView6.setVisibility(0);
                            LinearLayout linearLayout2 = eVar.f180809h;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("currentLocationLayout");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                            EditText editText6 = eVar.f180808g;
                            if (editText6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText6.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                            EditText editText7 = eVar.f180808g;
                            if (editText7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText7.setHint(eVar.getString(R.string.lbl_enter_group_location));
                        }
                        eVar.H6(true);
                        return;
                    case 4:
                        e.a aVar6 = e.T;
                        eVar.C6().N2.j(null);
                        if (!eVar.C6().f204396m) {
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            zf0.a aVar7 = zf0.a.CREATE_EVENT;
                            aVar7.getClass();
                            ((y0) addTIEventViewModelC6.Y.getValue()).m(aVar7);
                            addTIEventViewModelC6.O5().m("TIAddEventNameFragment");
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("extra_fbt_navigate_event_creation_flow", true);
                        m activity = eVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        m activity2 = eVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar8 = e.T;
                        eVar.H6(true);
                        SearchView searchView4 = eVar.f180806e;
                        if (searchView4 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        if (searchView4.isFocused()) {
                            return;
                        }
                        SearchView searchView5 = eVar.f180806e;
                        if (searchView5 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView5.setIconified(false);
                        SearchView searchView6 = eVar.f180806e;
                        if (searchView6 != null) {
                            searchView6.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                    case 6:
                        e.a aVar9 = e.T;
                        j22.b bVar = j22.b.f96736a;
                        Context contextRequireContext4 = eVar.requireContext();
                        contextRequireContext4.getClass();
                        bVar.getClass();
                        if (j22.b.c(contextRequireContext4)) {
                            eVar.A6();
                            return;
                        } else {
                            j22.b.z(eVar, 2, j22.a.f96719h);
                            return;
                        }
                    default:
                        e.a aVar10 = e.T;
                        AddTIEventViewModel addTIEventViewModelC7 = eVar.C6();
                        String[] strArr = AddTIEventViewModel.V2;
                        addTIEventViewModelC7.P6(null, null, true);
                        EditText editText8 = eVar.f180808g;
                        if (editText8 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText8.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                        SearchView searchView7 = eVar.f180806e;
                        if (searchView7 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView7.setQueryHint(eVar.getString(R.string.lbl_enter_group_location));
                        EditText editText9 = eVar.f180808g;
                        if (editText9 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText9.setText("");
                        eVar.D = false;
                        return;
                }
            }
        });
        SearchView searchView4 = this.f180806e;
        if (searchView4 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        final int i24 = 5;
        searchView4.setOnClickListener(new View.OnClickListener(this) { // from class: vy1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180798b;

            {
                this.f180798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i24;
                e eVar = this.f180798b;
                switch (i110) {
                    case 0:
                        BubbleLayout bubbleLayout4 = eVar.B;
                        if (bubbleLayout4 != null) {
                            bubbleLayout4.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("tooltipView");
                            throw null;
                        }
                    case 1:
                        TextView textView5 = eVar.f180817p;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("searchEventTextView");
                            throw null;
                        }
                        textView5.setVisibility(8);
                        LinearLayout linearLayout = eVar.f180819r;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("searchKeywordLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText4 = eVar.f180820t;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 2:
                        EditText editText5 = eVar.f180820t;
                        if (editText5 != null) {
                            editText5.setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 3:
                        if (!eVar.C) {
                            eVar.C = true;
                            RecyclerView recyclerView6 = eVar.f180812k;
                            if (recyclerView6 == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            recyclerView6.setVisibility(0);
                            LinearLayout linearLayout2 = eVar.f180809h;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("currentLocationLayout");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                            EditText editText6 = eVar.f180808g;
                            if (editText6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText6.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                            EditText editText7 = eVar.f180808g;
                            if (editText7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText7.setHint(eVar.getString(R.string.lbl_enter_group_location));
                        }
                        eVar.H6(true);
                        return;
                    case 4:
                        e.a aVar6 = e.T;
                        eVar.C6().N2.j(null);
                        if (!eVar.C6().f204396m) {
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            zf0.a aVar7 = zf0.a.CREATE_EVENT;
                            aVar7.getClass();
                            ((y0) addTIEventViewModelC6.Y.getValue()).m(aVar7);
                            addTIEventViewModelC6.O5().m("TIAddEventNameFragment");
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("extra_fbt_navigate_event_creation_flow", true);
                        m activity = eVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        m activity2 = eVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar8 = e.T;
                        eVar.H6(true);
                        SearchView searchView5 = eVar.f180806e;
                        if (searchView5 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        if (searchView5.isFocused()) {
                            return;
                        }
                        SearchView searchView6 = eVar.f180806e;
                        if (searchView6 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView6.setIconified(false);
                        SearchView searchView7 = eVar.f180806e;
                        if (searchView7 != null) {
                            searchView7.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                    case 6:
                        e.a aVar9 = e.T;
                        j22.b bVar = j22.b.f96736a;
                        Context contextRequireContext4 = eVar.requireContext();
                        contextRequireContext4.getClass();
                        bVar.getClass();
                        if (j22.b.c(contextRequireContext4)) {
                            eVar.A6();
                            return;
                        } else {
                            j22.b.z(eVar, 2, j22.a.f96719h);
                            return;
                        }
                    default:
                        e.a aVar10 = e.T;
                        AddTIEventViewModel addTIEventViewModelC7 = eVar.C6();
                        String[] strArr = AddTIEventViewModel.V2;
                        addTIEventViewModelC7.P6(null, null, true);
                        EditText editText8 = eVar.f180808g;
                        if (editText8 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText8.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                        SearchView searchView8 = eVar.f180806e;
                        if (searchView8 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView8.setQueryHint(eVar.getString(R.string.lbl_enter_group_location));
                        EditText editText9 = eVar.f180808g;
                        if (editText9 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText9.setText("");
                        eVar.D = false;
                        return;
                }
            }
        });
        TextView textView5 = this.f180810i;
        if (textView5 == null) {
            p005kotlin.jvm.internal.s.m("currentLocation");
            throw null;
        }
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: vy1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180798b;

            {
                this.f180798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i17;
                e eVar = this.f180798b;
                switch (i110) {
                    case 0:
                        BubbleLayout bubbleLayout4 = eVar.B;
                        if (bubbleLayout4 != null) {
                            bubbleLayout4.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("tooltipView");
                            throw null;
                        }
                    case 1:
                        TextView textView6 = eVar.f180817p;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("searchEventTextView");
                            throw null;
                        }
                        textView6.setVisibility(8);
                        LinearLayout linearLayout = eVar.f180819r;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("searchKeywordLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText4 = eVar.f180820t;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 2:
                        EditText editText5 = eVar.f180820t;
                        if (editText5 != null) {
                            editText5.setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 3:
                        if (!eVar.C) {
                            eVar.C = true;
                            RecyclerView recyclerView6 = eVar.f180812k;
                            if (recyclerView6 == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            recyclerView6.setVisibility(0);
                            LinearLayout linearLayout2 = eVar.f180809h;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("currentLocationLayout");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                            EditText editText6 = eVar.f180808g;
                            if (editText6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText6.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                            EditText editText7 = eVar.f180808g;
                            if (editText7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText7.setHint(eVar.getString(R.string.lbl_enter_group_location));
                        }
                        eVar.H6(true);
                        return;
                    case 4:
                        e.a aVar6 = e.T;
                        eVar.C6().N2.j(null);
                        if (!eVar.C6().f204396m) {
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            zf0.a aVar7 = zf0.a.CREATE_EVENT;
                            aVar7.getClass();
                            ((y0) addTIEventViewModelC6.Y.getValue()).m(aVar7);
                            addTIEventViewModelC6.O5().m("TIAddEventNameFragment");
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("extra_fbt_navigate_event_creation_flow", true);
                        m activity = eVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        m activity2 = eVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar8 = e.T;
                        eVar.H6(true);
                        SearchView searchView5 = eVar.f180806e;
                        if (searchView5 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        if (searchView5.isFocused()) {
                            return;
                        }
                        SearchView searchView6 = eVar.f180806e;
                        if (searchView6 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView6.setIconified(false);
                        SearchView searchView7 = eVar.f180806e;
                        if (searchView7 != null) {
                            searchView7.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                    case 6:
                        e.a aVar9 = e.T;
                        j22.b bVar = j22.b.f96736a;
                        Context contextRequireContext4 = eVar.requireContext();
                        contextRequireContext4.getClass();
                        bVar.getClass();
                        if (j22.b.c(contextRequireContext4)) {
                            eVar.A6();
                            return;
                        } else {
                            j22.b.z(eVar, 2, j22.a.f96719h);
                            return;
                        }
                    default:
                        e.a aVar10 = e.T;
                        AddTIEventViewModel addTIEventViewModelC7 = eVar.C6();
                        String[] strArr = AddTIEventViewModel.V2;
                        addTIEventViewModelC7.P6(null, null, true);
                        EditText editText8 = eVar.f180808g;
                        if (editText8 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText8.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                        SearchView searchView8 = eVar.f180806e;
                        if (searchView8 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView8.setQueryHint(eVar.getString(R.string.lbl_enter_group_location));
                        EditText editText9 = eVar.f180808g;
                        if (editText9 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText9.setText("");
                        eVar.D = false;
                        return;
                }
            }
        });
        ImageView imageView2 = this.f180807f;
        if (imageView2 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchImageView");
            throw null;
        }
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: vy1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180798b;

            {
                this.f180798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i16;
                e eVar = this.f180798b;
                switch (i110) {
                    case 0:
                        BubbleLayout bubbleLayout4 = eVar.B;
                        if (bubbleLayout4 != null) {
                            bubbleLayout4.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("tooltipView");
                            throw null;
                        }
                    case 1:
                        TextView textView6 = eVar.f180817p;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("searchEventTextView");
                            throw null;
                        }
                        textView6.setVisibility(8);
                        LinearLayout linearLayout = eVar.f180819r;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("searchKeywordLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText4 = eVar.f180820t;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 2:
                        EditText editText5 = eVar.f180820t;
                        if (editText5 != null) {
                            editText5.setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 3:
                        if (!eVar.C) {
                            eVar.C = true;
                            RecyclerView recyclerView6 = eVar.f180812k;
                            if (recyclerView6 == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            recyclerView6.setVisibility(0);
                            LinearLayout linearLayout2 = eVar.f180809h;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("currentLocationLayout");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                            EditText editText6 = eVar.f180808g;
                            if (editText6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText6.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                            EditText editText7 = eVar.f180808g;
                            if (editText7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText7.setHint(eVar.getString(R.string.lbl_enter_group_location));
                        }
                        eVar.H6(true);
                        return;
                    case 4:
                        e.a aVar6 = e.T;
                        eVar.C6().N2.j(null);
                        if (!eVar.C6().f204396m) {
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            zf0.a aVar7 = zf0.a.CREATE_EVENT;
                            aVar7.getClass();
                            ((y0) addTIEventViewModelC6.Y.getValue()).m(aVar7);
                            addTIEventViewModelC6.O5().m("TIAddEventNameFragment");
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("extra_fbt_navigate_event_creation_flow", true);
                        m activity = eVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        m activity2 = eVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar8 = e.T;
                        eVar.H6(true);
                        SearchView searchView5 = eVar.f180806e;
                        if (searchView5 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        if (searchView5.isFocused()) {
                            return;
                        }
                        SearchView searchView6 = eVar.f180806e;
                        if (searchView6 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView6.setIconified(false);
                        SearchView searchView7 = eVar.f180806e;
                        if (searchView7 != null) {
                            searchView7.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                    case 6:
                        e.a aVar9 = e.T;
                        j22.b bVar = j22.b.f96736a;
                        Context contextRequireContext4 = eVar.requireContext();
                        contextRequireContext4.getClass();
                        bVar.getClass();
                        if (j22.b.c(contextRequireContext4)) {
                            eVar.A6();
                            return;
                        } else {
                            j22.b.z(eVar, 2, j22.a.f96719h);
                            return;
                        }
                    default:
                        e.a aVar10 = e.T;
                        AddTIEventViewModel addTIEventViewModelC7 = eVar.C6();
                        String[] strArr = AddTIEventViewModel.V2;
                        addTIEventViewModelC7.P6(null, null, true);
                        EditText editText8 = eVar.f180808g;
                        if (editText8 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText8.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                        SearchView searchView8 = eVar.f180806e;
                        if (searchView8 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView8.setQueryHint(eVar.getString(R.string.lbl_enter_group_location));
                        EditText editText9 = eVar.f180808g;
                        if (editText9 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText9.setText("");
                        eVar.D = false;
                        return;
                }
            }
        });
        EditText editText4 = this.f180808g;
        if (editText4 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
            throw null;
        }
        editText4.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: vy1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180802b;

            {
                this.f180802b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z14) {
                switch (i15) {
                    case 0:
                        e eVar = this.f180802b;
                        if (eVar.F) {
                            return;
                        }
                        if (!z14) {
                            eVar.H6(false);
                            return;
                        }
                        eVar.C = true;
                        RecyclerView recyclerView6 = eVar.f180812k;
                        if (recyclerView6 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView6.setVisibility(0);
                        LinearLayout linearLayout = eVar.f180809h;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("currentLocationLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText5 = eVar.f180808g;
                        if (editText5 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText5.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                        EditText editText6 = eVar.f180808g;
                        if (editText6 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText6.setHint(eVar.getString(R.string.lbl_enter_group_location));
                        eVar.H6(true);
                        return;
                    default:
                        TextView textView6 = this.f180802b.f180816o;
                        if (textView6 != null) {
                            textView6.setEnabled(!z14);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("createAnEventView");
                            throw null;
                        }
                }
            }
        });
        EditText editText5 = this.f180820t;
        if (editText5 == null) {
            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
            throw null;
        }
        final char c14 = 1 == true ? 1 : 0;
        editText5.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: vy1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180802b;

            {
                this.f180802b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z14) {
                switch (c14) {
                    case 0:
                        e eVar = this.f180802b;
                        if (eVar.F) {
                            return;
                        }
                        if (!z14) {
                            eVar.H6(false);
                            return;
                        }
                        eVar.C = true;
                        RecyclerView recyclerView6 = eVar.f180812k;
                        if (recyclerView6 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView6.setVisibility(0);
                        LinearLayout linearLayout = eVar.f180809h;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("currentLocationLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText6 = eVar.f180808g;
                        if (editText6 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText6.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                        EditText editText7 = eVar.f180808g;
                        if (editText7 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText7.setHint(eVar.getString(R.string.lbl_enter_group_location));
                        eVar.H6(true);
                        return;
                    default:
                        TextView textView6 = this.f180802b.f180816o;
                        if (textView6 != null) {
                            textView6.setEnabled(!z14);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("createAnEventView");
                            throw null;
                        }
                }
            }
        });
        TextView textView6 = this.f180817p;
        if (textView6 == null) {
            p005kotlin.jvm.internal.s.m("searchEventTextView");
            throw null;
        }
        final char c15 = 1 == true ? 1 : 0;
        textView6.setOnClickListener(new View.OnClickListener(this) { // from class: vy1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180798b;

            {
                this.f180798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = c15;
                e eVar = this.f180798b;
                switch (i110) {
                    case 0:
                        BubbleLayout bubbleLayout4 = eVar.B;
                        if (bubbleLayout4 != null) {
                            bubbleLayout4.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("tooltipView");
                            throw null;
                        }
                    case 1:
                        TextView textView7 = eVar.f180817p;
                        if (textView7 == null) {
                            p005kotlin.jvm.internal.s.m("searchEventTextView");
                            throw null;
                        }
                        textView7.setVisibility(8);
                        LinearLayout linearLayout = eVar.f180819r;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("searchKeywordLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText6 = eVar.f180820t;
                        if (editText6 != null) {
                            editText6.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 2:
                        EditText editText7 = eVar.f180820t;
                        if (editText7 != null) {
                            editText7.setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 3:
                        if (!eVar.C) {
                            eVar.C = true;
                            RecyclerView recyclerView6 = eVar.f180812k;
                            if (recyclerView6 == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            recyclerView6.setVisibility(0);
                            LinearLayout linearLayout2 = eVar.f180809h;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("currentLocationLayout");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                            EditText editText8 = eVar.f180808g;
                            if (editText8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText8.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                            EditText editText9 = eVar.f180808g;
                            if (editText9 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText9.setHint(eVar.getString(R.string.lbl_enter_group_location));
                        }
                        eVar.H6(true);
                        return;
                    case 4:
                        e.a aVar6 = e.T;
                        eVar.C6().N2.j(null);
                        if (!eVar.C6().f204396m) {
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            zf0.a aVar7 = zf0.a.CREATE_EVENT;
                            aVar7.getClass();
                            ((y0) addTIEventViewModelC6.Y.getValue()).m(aVar7);
                            addTIEventViewModelC6.O5().m("TIAddEventNameFragment");
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("extra_fbt_navigate_event_creation_flow", true);
                        m activity = eVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        m activity2 = eVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar8 = e.T;
                        eVar.H6(true);
                        SearchView searchView5 = eVar.f180806e;
                        if (searchView5 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        if (searchView5.isFocused()) {
                            return;
                        }
                        SearchView searchView6 = eVar.f180806e;
                        if (searchView6 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView6.setIconified(false);
                        SearchView searchView7 = eVar.f180806e;
                        if (searchView7 != null) {
                            searchView7.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                    case 6:
                        e.a aVar9 = e.T;
                        j22.b bVar = j22.b.f96736a;
                        Context contextRequireContext4 = eVar.requireContext();
                        contextRequireContext4.getClass();
                        bVar.getClass();
                        if (j22.b.c(contextRequireContext4)) {
                            eVar.A6();
                            return;
                        } else {
                            j22.b.z(eVar, 2, j22.a.f96719h);
                            return;
                        }
                    default:
                        e.a aVar10 = e.T;
                        AddTIEventViewModel addTIEventViewModelC7 = eVar.C6();
                        String[] strArr = AddTIEventViewModel.V2;
                        addTIEventViewModelC7.P6(null, null, true);
                        EditText editText10 = eVar.f180808g;
                        if (editText10 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText10.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                        SearchView searchView8 = eVar.f180806e;
                        if (searchView8 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView8.setQueryHint(eVar.getString(R.string.lbl_enter_group_location));
                        EditText editText11 = eVar.f180808g;
                        if (editText11 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText11.setText("");
                        eVar.D = false;
                        return;
                }
            }
        });
        ImageView imageView3 = this.f180818q;
        if (imageView3 == null) {
            p005kotlin.jvm.internal.s.m("searchEventClearButton");
            throw null;
        }
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: vy1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180798b;

            {
                this.f180798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i14;
                e eVar = this.f180798b;
                switch (i110) {
                    case 0:
                        BubbleLayout bubbleLayout4 = eVar.B;
                        if (bubbleLayout4 != null) {
                            bubbleLayout4.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("tooltipView");
                            throw null;
                        }
                    case 1:
                        TextView textView7 = eVar.f180817p;
                        if (textView7 == null) {
                            p005kotlin.jvm.internal.s.m("searchEventTextView");
                            throw null;
                        }
                        textView7.setVisibility(8);
                        LinearLayout linearLayout = eVar.f180819r;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("searchKeywordLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText6 = eVar.f180820t;
                        if (editText6 != null) {
                            editText6.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 2:
                        EditText editText7 = eVar.f180820t;
                        if (editText7 != null) {
                            editText7.setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
                            throw null;
                        }
                    case 3:
                        if (!eVar.C) {
                            eVar.C = true;
                            RecyclerView recyclerView6 = eVar.f180812k;
                            if (recyclerView6 == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            recyclerView6.setVisibility(0);
                            LinearLayout linearLayout2 = eVar.f180809h;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("currentLocationLayout");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                            EditText editText8 = eVar.f180808g;
                            if (editText8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText8.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                            EditText editText9 = eVar.f180808g;
                            if (editText9 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText9.setHint(eVar.getString(R.string.lbl_enter_group_location));
                        }
                        eVar.H6(true);
                        return;
                    case 4:
                        e.a aVar6 = e.T;
                        eVar.C6().N2.j(null);
                        if (!eVar.C6().f204396m) {
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            zf0.a aVar7 = zf0.a.CREATE_EVENT;
                            aVar7.getClass();
                            ((y0) addTIEventViewModelC6.Y.getValue()).m(aVar7);
                            addTIEventViewModelC6.O5().m("TIAddEventNameFragment");
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("extra_fbt_navigate_event_creation_flow", true);
                        m activity = eVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        m activity2 = eVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar8 = e.T;
                        eVar.H6(true);
                        SearchView searchView5 = eVar.f180806e;
                        if (searchView5 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        if (searchView5.isFocused()) {
                            return;
                        }
                        SearchView searchView6 = eVar.f180806e;
                        if (searchView6 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView6.setIconified(false);
                        SearchView searchView7 = eVar.f180806e;
                        if (searchView7 != null) {
                            searchView7.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                    case 6:
                        e.a aVar9 = e.T;
                        j22.b bVar = j22.b.f96736a;
                        Context contextRequireContext4 = eVar.requireContext();
                        contextRequireContext4.getClass();
                        bVar.getClass();
                        if (j22.b.c(contextRequireContext4)) {
                            eVar.A6();
                            return;
                        } else {
                            j22.b.z(eVar, 2, j22.a.f96719h);
                            return;
                        }
                    default:
                        e.a aVar10 = e.T;
                        AddTIEventViewModel addTIEventViewModelC7 = eVar.C6();
                        String[] strArr = AddTIEventViewModel.V2;
                        addTIEventViewModelC7.P6(null, null, true);
                        EditText editText10 = eVar.f180808g;
                        if (editText10 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText10.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                        SearchView searchView8 = eVar.f180806e;
                        if (searchView8 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchView");
                            throw null;
                        }
                        searchView8.setQueryHint(eVar.getString(R.string.lbl_enter_group_location));
                        EditText editText11 = eVar.f180808g;
                        if (editText11 == null) {
                            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                            throw null;
                        }
                        editText11.setText("");
                        eVar.D = false;
                        return;
                }
            }
        });
        EditText editText6 = this.f180820t;
        if (editText6 == null) {
            p005kotlin.jvm.internal.s.m("searchKeywordEditText");
            throw null;
        }
        editText6.setOnEditorActionListener(new bl0.a(this, 12));
        androidx.lifecycle.s0<com.garmin.android.library.mapsdkadapter.f> s0VarG5 = C6().G5();
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        final char c16 = 1 == true ? 1 : 0;
        s0VarG5.f(viewLifecycleOwner2, new d(new l(this) { // from class: vy1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180800b;

            {
                this.f180800b = this;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x010b  */
            /* JADX WARN: Code duplicated, block: B:54:0x010f  */
            /* JADX WARN: Code duplicated, block: B:57:0x0115  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                vo0.f fVar;
                LinearLayout linearLayout;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
                int i110 = c16;
                e eVar = this.f180800b;
                switch (i110) {
                    case 0:
                        ky1.b bVar = (ky1.b) obj;
                        e.a aVar6 = e.T;
                        List<vo0.e> listB = (bVar == null || (fVar = (vo0.f) bVar.f107775a) == null) ? null : fVar.b();
                        if (bVar == null) {
                            eVar.H6(false);
                        } else if (listB != null) {
                            eVar.H6(true);
                            if (listB.isEmpty()) {
                                to0.a aVar7 = eVar.f180814m;
                                if (aVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar7.t(p13.w.c(new to0.a.AbstractC3116a.b("")));
                                eVar.F6();
                            } else {
                                ArrayList arrayList = new ArrayList(y.r(listB, 10));
                                Iterator<T> it = listB.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new to0.a.AbstractC3116a.C3117a((vo0.e) it.next()));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : arrayList) {
                                    to0.a.AbstractC3116a.C3117a c3117a = (to0.a.AbstractC3116a.C3117a) obj2;
                                    if (c3117a.f165833a.getAddress() == null) {
                                        vo0.a address = c3117a.f165833a.getAddress();
                                        if ((address != null ? address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String() : null) != null) {
                                        }
                                    }
                                    arrayList2.add(obj2);
                                }
                                EditText editText7 = eVar.f180808g;
                                if (editText7 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                if (editText7.hasFocus()) {
                                    RecyclerView recyclerView6 = eVar.f180812k;
                                    if (recyclerView6 == null) {
                                        p005kotlin.jvm.internal.s.m("recyclerView");
                                        throw null;
                                    }
                                    if (!v22.e.d(recyclerView6)) {
                                        RecyclerView recyclerView7 = eVar.f180812k;
                                        if (recyclerView7 == null) {
                                            p005kotlin.jvm.internal.s.m("recyclerView");
                                            throw null;
                                        }
                                        recyclerView7.setVisibility(0);
                                    }
                                }
                                to0.a aVar8 = eVar.f180814m;
                                if (aVar8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar8.t(arrayList2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) obj;
                        if (fVar2 == null) {
                            e.a aVar9 = e.T;
                            eVar.C6().J6(null);
                        } else if (eVar.D) {
                            o13.p<String, com.garmin.android.library.mapsdkadapter.f> pVar2 = eVar.C6().f46447y2;
                            if (!(pVar2 != null ? fVar2.equals(pVar2.f128595b) : false)) {
                                eVar.C6().L5(fVar2);
                            }
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            ge1.b.T(v1.a(addTIEventViewModelC6), null, null, new mz1.o(addTIEventViewModelC6, fVar2, null), 3);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        String str = (String) obj;
                        if (str != null) {
                            eVar.C = false;
                            SearchView searchView5 = eVar.f180806e;
                            if (searchView5 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView5.clearFocus();
                            SearchView searchView6 = eVar.f180806e;
                            if (searchView6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView6.j(str);
                            EditText editText8 = eVar.f180808g;
                            if (editText8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText8.setCursorVisible(true);
                            SearchView searchView7 = eVar.f180806e;
                            if (searchView7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView7.setFocusable(false);
                            SearchView searchView8 = eVar.f180806e;
                            if (searchView8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView8.clearFocus();
                            eVar.H6(false);
                        } else {
                            e.a aVar10 = e.T;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var = (g3) obj;
                        e.a aVar11 = e.T;
                        int i111 = e.b.f180827b[g3Var.f35300a.ordinal()];
                        if (i111 == 1) {
                            g22.e.l(eVar);
                        } else if (i111 == 2) {
                            g22.e.f(eVar);
                        } else {
                            if (i111 != 3) {
                                u0.r();
                                return null;
                            }
                            xy1.b bVar2 = (xy1.b) g3Var.f35301b;
                            if (bVar2 != null) {
                                Context contextRequireContext4 = eVar.requireContext();
                                contextRequireContext4.getClass();
                                List<o> list = bVar2.f192701c;
                                boolean z14 = bVar2.f192703e;
                                wy1.b bVar3 = new wy1.b(contextRequireContext4, list);
                                bVar3.f188057c = eVar;
                                RecyclerView recyclerView8 = eVar.f180813l;
                                if (recyclerView8 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                                    throw null;
                                }
                                recyclerView8.setAdapter(bVar3);
                                LinearLayout linearLayout2 = eVar.f180822w;
                                if (linearLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("noSearchResultsView");
                                    throw null;
                                }
                                v22.e.v(linearLayout2, list.isEmpty());
                                ImageView imageView4 = eVar.f180823x;
                                if (imageView4 == null) {
                                    p005kotlin.jvm.internal.s.m("noDataImage");
                                    throw null;
                                }
                                r0 r0Var = r0.f23226a;
                                Context contextRequireContext5 = eVar.requireContext();
                                contextRequireContext5.getClass();
                                r0Var.getClass();
                                Drawable drawable = a7.b.getDrawable(contextRequireContext5, R.drawable.gcm_no_data_stats_image);
                                drawable.getClass();
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable drawable2 = a7.b.getDrawable(contextRequireContext5, R.drawable.search);
                                Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
                                if (drawableMutate == null) {
                                    drawableMutate = null;
                                }
                                if (drawableMutate != null) {
                                    drawableMutate.setTint(a7.b.getColor(contextRequireContext5, R.color.gcm_icon_secondary));
                                    drawableMutate.setTintMode(PorterDuff.Mode.SRC_IN);
                                }
                                layerDrawable.setDrawableByLayerId(R.id.no_data_icon_drawable, drawableMutate);
                                imageView4.setImageDrawable(layerDrawable);
                                TextView textView7 = eVar.f180815n;
                                if (textView7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                v22.e.v(textView7, true ^ list.isEmpty());
                                EditText editText9 = eVar.f180808g;
                                if (editText9 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                editText9.clearFocus();
                                SearchView searchView9 = eVar.f180806e;
                                if (searchView9 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchView");
                                    throw null;
                                }
                                searchView9.clearFocus();
                                eVar.F = false;
                                RecyclerView recyclerView9 = eVar.f180812k;
                                if (recyclerView9 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerView");
                                    throw null;
                                }
                                recyclerView9.setVisibility(8);
                                LinearLayout linearLayout3 = eVar.f180811j;
                                if (linearLayout3 == null) {
                                    p005kotlin.jvm.internal.s.m("eventNameLayout");
                                    throw null;
                                }
                                linearLayout3.setVisibility(0);
                                TextView textView8 = eVar.f180815n;
                                if (textView8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                textView8.setText(eVar.getString(R.string.event_results_between_date_range, bVar2.f192699a, bVar2.f192700b));
                                if (bVar2.f192702d || z14) {
                                    TextView textView9 = eVar.f180824y;
                                    if (textView9 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView9.setVisibility(0);
                                    TextView textView10 = eVar.f180824y;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView10.setText(z14 ? eVar.getString(R.string.location_is_omitted_worldwide) : eVar.getString(R.string.location_is_omitted));
                                } else {
                                    TextView textView11 = eVar.f180824y;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            }
                            g22.e.f(eVar);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        List<xy1.d> list2 = (List) obj;
                        if (list2 != null) {
                            e.a aVar12 = e.T;
                            if (list2.isEmpty()) {
                                linearLayout = eVar.f180825z;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            } else {
                                LinearLayout linearLayout4 = eVar.f180825z;
                                if (linearLayout4 == null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout4.setVisibility(0);
                                wy1.a aVar13 = eVar.I;
                                if (aVar13 != null) {
                                    aVar13.f188050a = list2;
                                    aVar13.notifyDataSetChanged();
                                }
                            }
                        } else {
                            linearLayout = eVar.f180825z;
                            if (linearLayout != null) {
                                p005kotlin.jvm.internal.s.m("chipContainer");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        e.a aVar14 = e.T;
                        int i25 = e.b.f180827b[g3Var2.f35300a.ordinal()];
                        e eVar2 = this.f180800b;
                        if (i25 == 1) {
                            g22.e.l(eVar2);
                        } else if (i25 == 2) {
                            g22.e.f(eVar2);
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            my1.b bVar4 = (my1.b) g3Var2.f35301b;
                            if (bVar4 != null) {
                                CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
                                calendarItemDTO.I1 = true;
                                if (bVar4 instanceof my1.b.a) {
                                    my1.b.a aVar15 = (my1.b.a) bVar4;
                                    o oVar = aVar15.f121479b;
                                    fg0.k kVar = aVar15.f121478a;
                                    calendarItemDTO.H1 = kVar.getShareableEventUuid();
                                    if (kVar.getEventType() == gg0.f.f77136l && ((listH = kVar.h()) == null || listH.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVar, oVar, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar, kVar);
                                    }
                                } else {
                                    if (!(bVar4 instanceof my1.b.C2302b)) {
                                        u0.r();
                                        return null;
                                    }
                                    o oVar2 = ((my1.b.C2302b) bVar4).f121480a;
                                    String garminEventUuid = oVar2.getGarminEventUuid();
                                    if (garminEventUuid == null) {
                                        garminEventUuid = oVar2.getEventRef();
                                    }
                                    calendarItemDTO.H1 = garminEventUuid;
                                    fg0.k kVarU = oVar2.u();
                                    if (oVar2.getEventType() == gg0.f.f77136l && ((listF = oVar2.f()) == null || listF.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVarU, oVar2, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar2, kVarU);
                                    }
                                }
                            }
                            g22.e.f(eVar2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ((androidx.lifecycle.s0) C6().f46424n1.getValue()).f(getViewLifecycleOwner(), new d(new l(this) { // from class: vy1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180800b;

            {
                this.f180800b = this;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x010b  */
            /* JADX WARN: Code duplicated, block: B:54:0x010f  */
            /* JADX WARN: Code duplicated, block: B:57:0x0115  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                vo0.f fVar;
                LinearLayout linearLayout;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
                int i110 = i14;
                e eVar = this.f180800b;
                switch (i110) {
                    case 0:
                        ky1.b bVar = (ky1.b) obj;
                        e.a aVar6 = e.T;
                        List<vo0.e> listB = (bVar == null || (fVar = (vo0.f) bVar.f107775a) == null) ? null : fVar.b();
                        if (bVar == null) {
                            eVar.H6(false);
                        } else if (listB != null) {
                            eVar.H6(true);
                            if (listB.isEmpty()) {
                                to0.a aVar7 = eVar.f180814m;
                                if (aVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar7.t(p13.w.c(new to0.a.AbstractC3116a.b("")));
                                eVar.F6();
                            } else {
                                ArrayList arrayList = new ArrayList(y.r(listB, 10));
                                Iterator<T> it = listB.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new to0.a.AbstractC3116a.C3117a((vo0.e) it.next()));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : arrayList) {
                                    to0.a.AbstractC3116a.C3117a c3117a = (to0.a.AbstractC3116a.C3117a) obj2;
                                    if (c3117a.f165833a.getAddress() == null) {
                                        vo0.a address = c3117a.f165833a.getAddress();
                                        if ((address != null ? address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String() : null) != null) {
                                        }
                                    }
                                    arrayList2.add(obj2);
                                }
                                EditText editText7 = eVar.f180808g;
                                if (editText7 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                if (editText7.hasFocus()) {
                                    RecyclerView recyclerView6 = eVar.f180812k;
                                    if (recyclerView6 == null) {
                                        p005kotlin.jvm.internal.s.m("recyclerView");
                                        throw null;
                                    }
                                    if (!v22.e.d(recyclerView6)) {
                                        RecyclerView recyclerView7 = eVar.f180812k;
                                        if (recyclerView7 == null) {
                                            p005kotlin.jvm.internal.s.m("recyclerView");
                                            throw null;
                                        }
                                        recyclerView7.setVisibility(0);
                                    }
                                }
                                to0.a aVar8 = eVar.f180814m;
                                if (aVar8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar8.t(arrayList2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) obj;
                        if (fVar2 == null) {
                            e.a aVar9 = e.T;
                            eVar.C6().J6(null);
                        } else if (eVar.D) {
                            o13.p<String, com.garmin.android.library.mapsdkadapter.f> pVar2 = eVar.C6().f46447y2;
                            if (!(pVar2 != null ? fVar2.equals(pVar2.f128595b) : false)) {
                                eVar.C6().L5(fVar2);
                            }
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            ge1.b.T(v1.a(addTIEventViewModelC6), null, null, new mz1.o(addTIEventViewModelC6, fVar2, null), 3);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        String str = (String) obj;
                        if (str != null) {
                            eVar.C = false;
                            SearchView searchView5 = eVar.f180806e;
                            if (searchView5 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView5.clearFocus();
                            SearchView searchView6 = eVar.f180806e;
                            if (searchView6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView6.j(str);
                            EditText editText8 = eVar.f180808g;
                            if (editText8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText8.setCursorVisible(true);
                            SearchView searchView7 = eVar.f180806e;
                            if (searchView7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView7.setFocusable(false);
                            SearchView searchView8 = eVar.f180806e;
                            if (searchView8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView8.clearFocus();
                            eVar.H6(false);
                        } else {
                            e.a aVar10 = e.T;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var = (g3) obj;
                        e.a aVar11 = e.T;
                        int i111 = e.b.f180827b[g3Var.f35300a.ordinal()];
                        if (i111 == 1) {
                            g22.e.l(eVar);
                        } else if (i111 == 2) {
                            g22.e.f(eVar);
                        } else {
                            if (i111 != 3) {
                                u0.r();
                                return null;
                            }
                            xy1.b bVar2 = (xy1.b) g3Var.f35301b;
                            if (bVar2 != null) {
                                Context contextRequireContext4 = eVar.requireContext();
                                contextRequireContext4.getClass();
                                List<o> list = bVar2.f192701c;
                                boolean z14 = bVar2.f192703e;
                                wy1.b bVar3 = new wy1.b(contextRequireContext4, list);
                                bVar3.f188057c = eVar;
                                RecyclerView recyclerView8 = eVar.f180813l;
                                if (recyclerView8 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                                    throw null;
                                }
                                recyclerView8.setAdapter(bVar3);
                                LinearLayout linearLayout2 = eVar.f180822w;
                                if (linearLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("noSearchResultsView");
                                    throw null;
                                }
                                v22.e.v(linearLayout2, list.isEmpty());
                                ImageView imageView4 = eVar.f180823x;
                                if (imageView4 == null) {
                                    p005kotlin.jvm.internal.s.m("noDataImage");
                                    throw null;
                                }
                                r0 r0Var = r0.f23226a;
                                Context contextRequireContext5 = eVar.requireContext();
                                contextRequireContext5.getClass();
                                r0Var.getClass();
                                Drawable drawable = a7.b.getDrawable(contextRequireContext5, R.drawable.gcm_no_data_stats_image);
                                drawable.getClass();
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable drawable2 = a7.b.getDrawable(contextRequireContext5, R.drawable.search);
                                Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
                                if (drawableMutate == null) {
                                    drawableMutate = null;
                                }
                                if (drawableMutate != null) {
                                    drawableMutate.setTint(a7.b.getColor(contextRequireContext5, R.color.gcm_icon_secondary));
                                    drawableMutate.setTintMode(PorterDuff.Mode.SRC_IN);
                                }
                                layerDrawable.setDrawableByLayerId(R.id.no_data_icon_drawable, drawableMutate);
                                imageView4.setImageDrawable(layerDrawable);
                                TextView textView7 = eVar.f180815n;
                                if (textView7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                v22.e.v(textView7, true ^ list.isEmpty());
                                EditText editText9 = eVar.f180808g;
                                if (editText9 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                editText9.clearFocus();
                                SearchView searchView9 = eVar.f180806e;
                                if (searchView9 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchView");
                                    throw null;
                                }
                                searchView9.clearFocus();
                                eVar.F = false;
                                RecyclerView recyclerView9 = eVar.f180812k;
                                if (recyclerView9 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerView");
                                    throw null;
                                }
                                recyclerView9.setVisibility(8);
                                LinearLayout linearLayout3 = eVar.f180811j;
                                if (linearLayout3 == null) {
                                    p005kotlin.jvm.internal.s.m("eventNameLayout");
                                    throw null;
                                }
                                linearLayout3.setVisibility(0);
                                TextView textView8 = eVar.f180815n;
                                if (textView8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                textView8.setText(eVar.getString(R.string.event_results_between_date_range, bVar2.f192699a, bVar2.f192700b));
                                if (bVar2.f192702d || z14) {
                                    TextView textView9 = eVar.f180824y;
                                    if (textView9 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView9.setVisibility(0);
                                    TextView textView10 = eVar.f180824y;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView10.setText(z14 ? eVar.getString(R.string.location_is_omitted_worldwide) : eVar.getString(R.string.location_is_omitted));
                                } else {
                                    TextView textView11 = eVar.f180824y;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            }
                            g22.e.f(eVar);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        List<xy1.d> list2 = (List) obj;
                        if (list2 != null) {
                            e.a aVar12 = e.T;
                            if (list2.isEmpty()) {
                                linearLayout = eVar.f180825z;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            } else {
                                LinearLayout linearLayout4 = eVar.f180825z;
                                if (linearLayout4 == null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout4.setVisibility(0);
                                wy1.a aVar13 = eVar.I;
                                if (aVar13 != null) {
                                    aVar13.f188050a = list2;
                                    aVar13.notifyDataSetChanged();
                                }
                            }
                        } else {
                            linearLayout = eVar.f180825z;
                            if (linearLayout != null) {
                                p005kotlin.jvm.internal.s.m("chipContainer");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        e.a aVar14 = e.T;
                        int i25 = e.b.f180827b[g3Var2.f35300a.ordinal()];
                        e eVar2 = this.f180800b;
                        if (i25 == 1) {
                            g22.e.l(eVar2);
                        } else if (i25 == 2) {
                            g22.e.f(eVar2);
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            my1.b bVar4 = (my1.b) g3Var2.f35301b;
                            if (bVar4 != null) {
                                CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
                                calendarItemDTO.I1 = true;
                                if (bVar4 instanceof my1.b.a) {
                                    my1.b.a aVar15 = (my1.b.a) bVar4;
                                    o oVar = aVar15.f121479b;
                                    fg0.k kVar = aVar15.f121478a;
                                    calendarItemDTO.H1 = kVar.getShareableEventUuid();
                                    if (kVar.getEventType() == gg0.f.f77136l && ((listH = kVar.h()) == null || listH.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVar, oVar, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar, kVar);
                                    }
                                } else {
                                    if (!(bVar4 instanceof my1.b.C2302b)) {
                                        u0.r();
                                        return null;
                                    }
                                    o oVar2 = ((my1.b.C2302b) bVar4).f121480a;
                                    String garminEventUuid = oVar2.getGarminEventUuid();
                                    if (garminEventUuid == null) {
                                        garminEventUuid = oVar2.getEventRef();
                                    }
                                    calendarItemDTO.H1 = garminEventUuid;
                                    fg0.k kVarU = oVar2.u();
                                    if (oVar2.getEventType() == gg0.f.f77136l && ((listF = oVar2.f()) == null || listF.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVarU, oVar2, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar2, kVarU);
                                    }
                                }
                            }
                            g22.e.f(eVar2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        C6().f46410g2.f(getViewLifecycleOwner(), new d(new l(this) { // from class: vy1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180800b;

            {
                this.f180800b = this;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x010b  */
            /* JADX WARN: Code duplicated, block: B:54:0x010f  */
            /* JADX WARN: Code duplicated, block: B:57:0x0115  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                vo0.f fVar;
                LinearLayout linearLayout;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
                int i110 = i18;
                e eVar = this.f180800b;
                switch (i110) {
                    case 0:
                        ky1.b bVar = (ky1.b) obj;
                        e.a aVar6 = e.T;
                        List<vo0.e> listB = (bVar == null || (fVar = (vo0.f) bVar.f107775a) == null) ? null : fVar.b();
                        if (bVar == null) {
                            eVar.H6(false);
                        } else if (listB != null) {
                            eVar.H6(true);
                            if (listB.isEmpty()) {
                                to0.a aVar7 = eVar.f180814m;
                                if (aVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar7.t(p13.w.c(new to0.a.AbstractC3116a.b("")));
                                eVar.F6();
                            } else {
                                ArrayList arrayList = new ArrayList(y.r(listB, 10));
                                Iterator<T> it = listB.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new to0.a.AbstractC3116a.C3117a((vo0.e) it.next()));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : arrayList) {
                                    to0.a.AbstractC3116a.C3117a c3117a = (to0.a.AbstractC3116a.C3117a) obj2;
                                    if (c3117a.f165833a.getAddress() == null) {
                                        vo0.a address = c3117a.f165833a.getAddress();
                                        if ((address != null ? address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String() : null) != null) {
                                        }
                                    }
                                    arrayList2.add(obj2);
                                }
                                EditText editText7 = eVar.f180808g;
                                if (editText7 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                if (editText7.hasFocus()) {
                                    RecyclerView recyclerView6 = eVar.f180812k;
                                    if (recyclerView6 == null) {
                                        p005kotlin.jvm.internal.s.m("recyclerView");
                                        throw null;
                                    }
                                    if (!v22.e.d(recyclerView6)) {
                                        RecyclerView recyclerView7 = eVar.f180812k;
                                        if (recyclerView7 == null) {
                                            p005kotlin.jvm.internal.s.m("recyclerView");
                                            throw null;
                                        }
                                        recyclerView7.setVisibility(0);
                                    }
                                }
                                to0.a aVar8 = eVar.f180814m;
                                if (aVar8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar8.t(arrayList2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) obj;
                        if (fVar2 == null) {
                            e.a aVar9 = e.T;
                            eVar.C6().J6(null);
                        } else if (eVar.D) {
                            o13.p<String, com.garmin.android.library.mapsdkadapter.f> pVar2 = eVar.C6().f46447y2;
                            if (!(pVar2 != null ? fVar2.equals(pVar2.f128595b) : false)) {
                                eVar.C6().L5(fVar2);
                            }
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            ge1.b.T(v1.a(addTIEventViewModelC6), null, null, new mz1.o(addTIEventViewModelC6, fVar2, null), 3);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        String str = (String) obj;
                        if (str != null) {
                            eVar.C = false;
                            SearchView searchView5 = eVar.f180806e;
                            if (searchView5 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView5.clearFocus();
                            SearchView searchView6 = eVar.f180806e;
                            if (searchView6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView6.j(str);
                            EditText editText8 = eVar.f180808g;
                            if (editText8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText8.setCursorVisible(true);
                            SearchView searchView7 = eVar.f180806e;
                            if (searchView7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView7.setFocusable(false);
                            SearchView searchView8 = eVar.f180806e;
                            if (searchView8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView8.clearFocus();
                            eVar.H6(false);
                        } else {
                            e.a aVar10 = e.T;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var = (g3) obj;
                        e.a aVar11 = e.T;
                        int i111 = e.b.f180827b[g3Var.f35300a.ordinal()];
                        if (i111 == 1) {
                            g22.e.l(eVar);
                        } else if (i111 == 2) {
                            g22.e.f(eVar);
                        } else {
                            if (i111 != 3) {
                                u0.r();
                                return null;
                            }
                            xy1.b bVar2 = (xy1.b) g3Var.f35301b;
                            if (bVar2 != null) {
                                Context contextRequireContext4 = eVar.requireContext();
                                contextRequireContext4.getClass();
                                List<o> list = bVar2.f192701c;
                                boolean z14 = bVar2.f192703e;
                                wy1.b bVar3 = new wy1.b(contextRequireContext4, list);
                                bVar3.f188057c = eVar;
                                RecyclerView recyclerView8 = eVar.f180813l;
                                if (recyclerView8 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                                    throw null;
                                }
                                recyclerView8.setAdapter(bVar3);
                                LinearLayout linearLayout2 = eVar.f180822w;
                                if (linearLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("noSearchResultsView");
                                    throw null;
                                }
                                v22.e.v(linearLayout2, list.isEmpty());
                                ImageView imageView4 = eVar.f180823x;
                                if (imageView4 == null) {
                                    p005kotlin.jvm.internal.s.m("noDataImage");
                                    throw null;
                                }
                                r0 r0Var = r0.f23226a;
                                Context contextRequireContext5 = eVar.requireContext();
                                contextRequireContext5.getClass();
                                r0Var.getClass();
                                Drawable drawable = a7.b.getDrawable(contextRequireContext5, R.drawable.gcm_no_data_stats_image);
                                drawable.getClass();
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable drawable2 = a7.b.getDrawable(contextRequireContext5, R.drawable.search);
                                Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
                                if (drawableMutate == null) {
                                    drawableMutate = null;
                                }
                                if (drawableMutate != null) {
                                    drawableMutate.setTint(a7.b.getColor(contextRequireContext5, R.color.gcm_icon_secondary));
                                    drawableMutate.setTintMode(PorterDuff.Mode.SRC_IN);
                                }
                                layerDrawable.setDrawableByLayerId(R.id.no_data_icon_drawable, drawableMutate);
                                imageView4.setImageDrawable(layerDrawable);
                                TextView textView7 = eVar.f180815n;
                                if (textView7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                v22.e.v(textView7, true ^ list.isEmpty());
                                EditText editText9 = eVar.f180808g;
                                if (editText9 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                editText9.clearFocus();
                                SearchView searchView9 = eVar.f180806e;
                                if (searchView9 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchView");
                                    throw null;
                                }
                                searchView9.clearFocus();
                                eVar.F = false;
                                RecyclerView recyclerView9 = eVar.f180812k;
                                if (recyclerView9 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerView");
                                    throw null;
                                }
                                recyclerView9.setVisibility(8);
                                LinearLayout linearLayout3 = eVar.f180811j;
                                if (linearLayout3 == null) {
                                    p005kotlin.jvm.internal.s.m("eventNameLayout");
                                    throw null;
                                }
                                linearLayout3.setVisibility(0);
                                TextView textView8 = eVar.f180815n;
                                if (textView8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                textView8.setText(eVar.getString(R.string.event_results_between_date_range, bVar2.f192699a, bVar2.f192700b));
                                if (bVar2.f192702d || z14) {
                                    TextView textView9 = eVar.f180824y;
                                    if (textView9 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView9.setVisibility(0);
                                    TextView textView10 = eVar.f180824y;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView10.setText(z14 ? eVar.getString(R.string.location_is_omitted_worldwide) : eVar.getString(R.string.location_is_omitted));
                                } else {
                                    TextView textView11 = eVar.f180824y;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            }
                            g22.e.f(eVar);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        List<xy1.d> list2 = (List) obj;
                        if (list2 != null) {
                            e.a aVar12 = e.T;
                            if (list2.isEmpty()) {
                                linearLayout = eVar.f180825z;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            } else {
                                LinearLayout linearLayout4 = eVar.f180825z;
                                if (linearLayout4 == null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout4.setVisibility(0);
                                wy1.a aVar13 = eVar.I;
                                if (aVar13 != null) {
                                    aVar13.f188050a = list2;
                                    aVar13.notifyDataSetChanged();
                                }
                            }
                        } else {
                            linearLayout = eVar.f180825z;
                            if (linearLayout != null) {
                                p005kotlin.jvm.internal.s.m("chipContainer");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        e.a aVar14 = e.T;
                        int i25 = e.b.f180827b[g3Var2.f35300a.ordinal()];
                        e eVar2 = this.f180800b;
                        if (i25 == 1) {
                            g22.e.l(eVar2);
                        } else if (i25 == 2) {
                            g22.e.f(eVar2);
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            my1.b bVar4 = (my1.b) g3Var2.f35301b;
                            if (bVar4 != null) {
                                CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
                                calendarItemDTO.I1 = true;
                                if (bVar4 instanceof my1.b.a) {
                                    my1.b.a aVar15 = (my1.b.a) bVar4;
                                    o oVar = aVar15.f121479b;
                                    fg0.k kVar = aVar15.f121478a;
                                    calendarItemDTO.H1 = kVar.getShareableEventUuid();
                                    if (kVar.getEventType() == gg0.f.f77136l && ((listH = kVar.h()) == null || listH.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVar, oVar, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar, kVar);
                                    }
                                } else {
                                    if (!(bVar4 instanceof my1.b.C2302b)) {
                                        u0.r();
                                        return null;
                                    }
                                    o oVar2 = ((my1.b.C2302b) bVar4).f121480a;
                                    String garminEventUuid = oVar2.getGarminEventUuid();
                                    if (garminEventUuid == null) {
                                        garminEventUuid = oVar2.getEventRef();
                                    }
                                    calendarItemDTO.H1 = garminEventUuid;
                                    fg0.k kVarU = oVar2.u();
                                    if (oVar2.getEventType() == gg0.f.f77136l && ((listF = oVar2.f()) == null || listF.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVarU, oVar2, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar2, kVarU);
                                    }
                                }
                            }
                            g22.e.f(eVar2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ((androidx.lifecycle.s0) C6().f46414i2.getValue()).f(getViewLifecycleOwner(), new d(new l(this) { // from class: vy1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180800b;

            {
                this.f180800b = this;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x010b  */
            /* JADX WARN: Code duplicated, block: B:54:0x010f  */
            /* JADX WARN: Code duplicated, block: B:57:0x0115  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                vo0.f fVar;
                LinearLayout linearLayout;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
                int i110 = i19;
                e eVar = this.f180800b;
                switch (i110) {
                    case 0:
                        ky1.b bVar = (ky1.b) obj;
                        e.a aVar6 = e.T;
                        List<vo0.e> listB = (bVar == null || (fVar = (vo0.f) bVar.f107775a) == null) ? null : fVar.b();
                        if (bVar == null) {
                            eVar.H6(false);
                        } else if (listB != null) {
                            eVar.H6(true);
                            if (listB.isEmpty()) {
                                to0.a aVar7 = eVar.f180814m;
                                if (aVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar7.t(p13.w.c(new to0.a.AbstractC3116a.b("")));
                                eVar.F6();
                            } else {
                                ArrayList arrayList = new ArrayList(y.r(listB, 10));
                                Iterator<T> it = listB.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new to0.a.AbstractC3116a.C3117a((vo0.e) it.next()));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : arrayList) {
                                    to0.a.AbstractC3116a.C3117a c3117a = (to0.a.AbstractC3116a.C3117a) obj2;
                                    if (c3117a.f165833a.getAddress() == null) {
                                        vo0.a address = c3117a.f165833a.getAddress();
                                        if ((address != null ? address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String() : null) != null) {
                                        }
                                    }
                                    arrayList2.add(obj2);
                                }
                                EditText editText7 = eVar.f180808g;
                                if (editText7 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                if (editText7.hasFocus()) {
                                    RecyclerView recyclerView6 = eVar.f180812k;
                                    if (recyclerView6 == null) {
                                        p005kotlin.jvm.internal.s.m("recyclerView");
                                        throw null;
                                    }
                                    if (!v22.e.d(recyclerView6)) {
                                        RecyclerView recyclerView7 = eVar.f180812k;
                                        if (recyclerView7 == null) {
                                            p005kotlin.jvm.internal.s.m("recyclerView");
                                            throw null;
                                        }
                                        recyclerView7.setVisibility(0);
                                    }
                                }
                                to0.a aVar8 = eVar.f180814m;
                                if (aVar8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar8.t(arrayList2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) obj;
                        if (fVar2 == null) {
                            e.a aVar9 = e.T;
                            eVar.C6().J6(null);
                        } else if (eVar.D) {
                            o13.p<String, com.garmin.android.library.mapsdkadapter.f> pVar2 = eVar.C6().f46447y2;
                            if (!(pVar2 != null ? fVar2.equals(pVar2.f128595b) : false)) {
                                eVar.C6().L5(fVar2);
                            }
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            ge1.b.T(v1.a(addTIEventViewModelC6), null, null, new mz1.o(addTIEventViewModelC6, fVar2, null), 3);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        String str = (String) obj;
                        if (str != null) {
                            eVar.C = false;
                            SearchView searchView5 = eVar.f180806e;
                            if (searchView5 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView5.clearFocus();
                            SearchView searchView6 = eVar.f180806e;
                            if (searchView6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView6.j(str);
                            EditText editText8 = eVar.f180808g;
                            if (editText8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText8.setCursorVisible(true);
                            SearchView searchView7 = eVar.f180806e;
                            if (searchView7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView7.setFocusable(false);
                            SearchView searchView8 = eVar.f180806e;
                            if (searchView8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView8.clearFocus();
                            eVar.H6(false);
                        } else {
                            e.a aVar10 = e.T;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var = (g3) obj;
                        e.a aVar11 = e.T;
                        int i111 = e.b.f180827b[g3Var.f35300a.ordinal()];
                        if (i111 == 1) {
                            g22.e.l(eVar);
                        } else if (i111 == 2) {
                            g22.e.f(eVar);
                        } else {
                            if (i111 != 3) {
                                u0.r();
                                return null;
                            }
                            xy1.b bVar2 = (xy1.b) g3Var.f35301b;
                            if (bVar2 != null) {
                                Context contextRequireContext4 = eVar.requireContext();
                                contextRequireContext4.getClass();
                                List<o> list = bVar2.f192701c;
                                boolean z14 = bVar2.f192703e;
                                wy1.b bVar3 = new wy1.b(contextRequireContext4, list);
                                bVar3.f188057c = eVar;
                                RecyclerView recyclerView8 = eVar.f180813l;
                                if (recyclerView8 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                                    throw null;
                                }
                                recyclerView8.setAdapter(bVar3);
                                LinearLayout linearLayout2 = eVar.f180822w;
                                if (linearLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("noSearchResultsView");
                                    throw null;
                                }
                                v22.e.v(linearLayout2, list.isEmpty());
                                ImageView imageView4 = eVar.f180823x;
                                if (imageView4 == null) {
                                    p005kotlin.jvm.internal.s.m("noDataImage");
                                    throw null;
                                }
                                r0 r0Var = r0.f23226a;
                                Context contextRequireContext5 = eVar.requireContext();
                                contextRequireContext5.getClass();
                                r0Var.getClass();
                                Drawable drawable = a7.b.getDrawable(contextRequireContext5, R.drawable.gcm_no_data_stats_image);
                                drawable.getClass();
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable drawable2 = a7.b.getDrawable(contextRequireContext5, R.drawable.search);
                                Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
                                if (drawableMutate == null) {
                                    drawableMutate = null;
                                }
                                if (drawableMutate != null) {
                                    drawableMutate.setTint(a7.b.getColor(contextRequireContext5, R.color.gcm_icon_secondary));
                                    drawableMutate.setTintMode(PorterDuff.Mode.SRC_IN);
                                }
                                layerDrawable.setDrawableByLayerId(R.id.no_data_icon_drawable, drawableMutate);
                                imageView4.setImageDrawable(layerDrawable);
                                TextView textView7 = eVar.f180815n;
                                if (textView7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                v22.e.v(textView7, true ^ list.isEmpty());
                                EditText editText9 = eVar.f180808g;
                                if (editText9 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                editText9.clearFocus();
                                SearchView searchView9 = eVar.f180806e;
                                if (searchView9 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchView");
                                    throw null;
                                }
                                searchView9.clearFocus();
                                eVar.F = false;
                                RecyclerView recyclerView9 = eVar.f180812k;
                                if (recyclerView9 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerView");
                                    throw null;
                                }
                                recyclerView9.setVisibility(8);
                                LinearLayout linearLayout3 = eVar.f180811j;
                                if (linearLayout3 == null) {
                                    p005kotlin.jvm.internal.s.m("eventNameLayout");
                                    throw null;
                                }
                                linearLayout3.setVisibility(0);
                                TextView textView8 = eVar.f180815n;
                                if (textView8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                textView8.setText(eVar.getString(R.string.event_results_between_date_range, bVar2.f192699a, bVar2.f192700b));
                                if (bVar2.f192702d || z14) {
                                    TextView textView9 = eVar.f180824y;
                                    if (textView9 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView9.setVisibility(0);
                                    TextView textView10 = eVar.f180824y;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView10.setText(z14 ? eVar.getString(R.string.location_is_omitted_worldwide) : eVar.getString(R.string.location_is_omitted));
                                } else {
                                    TextView textView11 = eVar.f180824y;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            }
                            g22.e.f(eVar);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        List<xy1.d> list2 = (List) obj;
                        if (list2 != null) {
                            e.a aVar12 = e.T;
                            if (list2.isEmpty()) {
                                linearLayout = eVar.f180825z;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            } else {
                                LinearLayout linearLayout4 = eVar.f180825z;
                                if (linearLayout4 == null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout4.setVisibility(0);
                                wy1.a aVar13 = eVar.I;
                                if (aVar13 != null) {
                                    aVar13.f188050a = list2;
                                    aVar13.notifyDataSetChanged();
                                }
                            }
                        } else {
                            linearLayout = eVar.f180825z;
                            if (linearLayout != null) {
                                p005kotlin.jvm.internal.s.m("chipContainer");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        e.a aVar14 = e.T;
                        int i25 = e.b.f180827b[g3Var2.f35300a.ordinal()];
                        e eVar2 = this.f180800b;
                        if (i25 == 1) {
                            g22.e.l(eVar2);
                        } else if (i25 == 2) {
                            g22.e.f(eVar2);
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            my1.b bVar4 = (my1.b) g3Var2.f35301b;
                            if (bVar4 != null) {
                                CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
                                calendarItemDTO.I1 = true;
                                if (bVar4 instanceof my1.b.a) {
                                    my1.b.a aVar15 = (my1.b.a) bVar4;
                                    o oVar = aVar15.f121479b;
                                    fg0.k kVar = aVar15.f121478a;
                                    calendarItemDTO.H1 = kVar.getShareableEventUuid();
                                    if (kVar.getEventType() == gg0.f.f77136l && ((listH = kVar.h()) == null || listH.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVar, oVar, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar, kVar);
                                    }
                                } else {
                                    if (!(bVar4 instanceof my1.b.C2302b)) {
                                        u0.r();
                                        return null;
                                    }
                                    o oVar2 = ((my1.b.C2302b) bVar4).f121480a;
                                    String garminEventUuid = oVar2.getGarminEventUuid();
                                    if (garminEventUuid == null) {
                                        garminEventUuid = oVar2.getEventRef();
                                    }
                                    calendarItemDTO.H1 = garminEventUuid;
                                    fg0.k kVarU = oVar2.u();
                                    if (oVar2.getEventType() == gg0.f.f77136l && ((listF = oVar2.f()) == null || listF.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVarU, oVar2, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar2, kVarU);
                                    }
                                }
                            }
                            g22.e.f(eVar2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ((y0) C6().f46425n2.getValue()).f(getViewLifecycleOwner(), new d(new l(this) { // from class: vy1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f180800b;

            {
                this.f180800b = this;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x010b  */
            /* JADX WARN: Code duplicated, block: B:54:0x010f  */
            /* JADX WARN: Code duplicated, block: B:57:0x0115  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                vo0.f fVar;
                LinearLayout linearLayout;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
                int i110 = i24;
                e eVar = this.f180800b;
                switch (i110) {
                    case 0:
                        ky1.b bVar = (ky1.b) obj;
                        e.a aVar6 = e.T;
                        List<vo0.e> listB = (bVar == null || (fVar = (vo0.f) bVar.f107775a) == null) ? null : fVar.b();
                        if (bVar == null) {
                            eVar.H6(false);
                        } else if (listB != null) {
                            eVar.H6(true);
                            if (listB.isEmpty()) {
                                to0.a aVar7 = eVar.f180814m;
                                if (aVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar7.t(p13.w.c(new to0.a.AbstractC3116a.b("")));
                                eVar.F6();
                            } else {
                                ArrayList arrayList = new ArrayList(y.r(listB, 10));
                                Iterator<T> it = listB.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new to0.a.AbstractC3116a.C3117a((vo0.e) it.next()));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : arrayList) {
                                    to0.a.AbstractC3116a.C3117a c3117a = (to0.a.AbstractC3116a.C3117a) obj2;
                                    if (c3117a.f165833a.getAddress() == null) {
                                        vo0.a address = c3117a.f165833a.getAddress();
                                        if ((address != null ? address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String() : null) != null) {
                                        }
                                    }
                                    arrayList2.add(obj2);
                                }
                                EditText editText7 = eVar.f180808g;
                                if (editText7 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                if (editText7.hasFocus()) {
                                    RecyclerView recyclerView6 = eVar.f180812k;
                                    if (recyclerView6 == null) {
                                        p005kotlin.jvm.internal.s.m("recyclerView");
                                        throw null;
                                    }
                                    if (!v22.e.d(recyclerView6)) {
                                        RecyclerView recyclerView7 = eVar.f180812k;
                                        if (recyclerView7 == null) {
                                            p005kotlin.jvm.internal.s.m("recyclerView");
                                            throw null;
                                        }
                                        recyclerView7.setVisibility(0);
                                    }
                                }
                                to0.a aVar8 = eVar.f180814m;
                                if (aVar8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchResultAdapter");
                                    throw null;
                                }
                                aVar8.t(arrayList2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) obj;
                        if (fVar2 == null) {
                            e.a aVar9 = e.T;
                            eVar.C6().J6(null);
                        } else if (eVar.D) {
                            o13.p<String, com.garmin.android.library.mapsdkadapter.f> pVar2 = eVar.C6().f46447y2;
                            if (!(pVar2 != null ? fVar2.equals(pVar2.f128595b) : false)) {
                                eVar.C6().L5(fVar2);
                            }
                            AddTIEventViewModel addTIEventViewModelC6 = eVar.C6();
                            ge1.b.T(v1.a(addTIEventViewModelC6), null, null, new mz1.o(addTIEventViewModelC6, fVar2, null), 3);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        String str = (String) obj;
                        if (str != null) {
                            eVar.C = false;
                            SearchView searchView5 = eVar.f180806e;
                            if (searchView5 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView5.clearFocus();
                            SearchView searchView6 = eVar.f180806e;
                            if (searchView6 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView6.j(str);
                            EditText editText8 = eVar.f180808g;
                            if (editText8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                throw null;
                            }
                            editText8.setCursorVisible(true);
                            SearchView searchView7 = eVar.f180806e;
                            if (searchView7 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView7.setFocusable(false);
                            SearchView searchView8 = eVar.f180806e;
                            if (searchView8 == null) {
                                p005kotlin.jvm.internal.s.m("locationSearchView");
                                throw null;
                            }
                            searchView8.clearFocus();
                            eVar.H6(false);
                        } else {
                            e.a aVar10 = e.T;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var = (g3) obj;
                        e.a aVar11 = e.T;
                        int i111 = e.b.f180827b[g3Var.f35300a.ordinal()];
                        if (i111 == 1) {
                            g22.e.l(eVar);
                        } else if (i111 == 2) {
                            g22.e.f(eVar);
                        } else {
                            if (i111 != 3) {
                                u0.r();
                                return null;
                            }
                            xy1.b bVar2 = (xy1.b) g3Var.f35301b;
                            if (bVar2 != null) {
                                Context contextRequireContext4 = eVar.requireContext();
                                contextRequireContext4.getClass();
                                List<o> list = bVar2.f192701c;
                                boolean z14 = bVar2.f192703e;
                                wy1.b bVar3 = new wy1.b(contextRequireContext4, list);
                                bVar3.f188057c = eVar;
                                RecyclerView recyclerView8 = eVar.f180813l;
                                if (recyclerView8 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                                    throw null;
                                }
                                recyclerView8.setAdapter(bVar3);
                                LinearLayout linearLayout2 = eVar.f180822w;
                                if (linearLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("noSearchResultsView");
                                    throw null;
                                }
                                v22.e.v(linearLayout2, list.isEmpty());
                                ImageView imageView4 = eVar.f180823x;
                                if (imageView4 == null) {
                                    p005kotlin.jvm.internal.s.m("noDataImage");
                                    throw null;
                                }
                                r0 r0Var = r0.f23226a;
                                Context contextRequireContext5 = eVar.requireContext();
                                contextRequireContext5.getClass();
                                r0Var.getClass();
                                Drawable drawable = a7.b.getDrawable(contextRequireContext5, R.drawable.gcm_no_data_stats_image);
                                drawable.getClass();
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable drawable2 = a7.b.getDrawable(contextRequireContext5, R.drawable.search);
                                Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
                                if (drawableMutate == null) {
                                    drawableMutate = null;
                                }
                                if (drawableMutate != null) {
                                    drawableMutate.setTint(a7.b.getColor(contextRequireContext5, R.color.gcm_icon_secondary));
                                    drawableMutate.setTintMode(PorterDuff.Mode.SRC_IN);
                                }
                                layerDrawable.setDrawableByLayerId(R.id.no_data_icon_drawable, drawableMutate);
                                imageView4.setImageDrawable(layerDrawable);
                                TextView textView7 = eVar.f180815n;
                                if (textView7 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                v22.e.v(textView7, true ^ list.isEmpty());
                                EditText editText9 = eVar.f180808g;
                                if (editText9 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
                                    throw null;
                                }
                                editText9.clearFocus();
                                SearchView searchView9 = eVar.f180806e;
                                if (searchView9 == null) {
                                    p005kotlin.jvm.internal.s.m("locationSearchView");
                                    throw null;
                                }
                                searchView9.clearFocus();
                                eVar.F = false;
                                RecyclerView recyclerView9 = eVar.f180812k;
                                if (recyclerView9 == null) {
                                    p005kotlin.jvm.internal.s.m("recyclerView");
                                    throw null;
                                }
                                recyclerView9.setVisibility(8);
                                LinearLayout linearLayout3 = eVar.f180811j;
                                if (linearLayout3 == null) {
                                    p005kotlin.jvm.internal.s.m("eventNameLayout");
                                    throw null;
                                }
                                linearLayout3.setVisibility(0);
                                TextView textView8 = eVar.f180815n;
                                if (textView8 == null) {
                                    p005kotlin.jvm.internal.s.m("searchTitleView");
                                    throw null;
                                }
                                textView8.setText(eVar.getString(R.string.event_results_between_date_range, bVar2.f192699a, bVar2.f192700b));
                                if (bVar2.f192702d || z14) {
                                    TextView textView9 = eVar.f180824y;
                                    if (textView9 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView9.setVisibility(0);
                                    TextView textView10 = eVar.f180824y;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView10.setText(z14 ? eVar.getString(R.string.location_is_omitted_worldwide) : eVar.getString(R.string.location_is_omitted));
                                } else {
                                    TextView textView11 = eVar.f180824y;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("locationOmittedHelperTextView");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            }
                            g22.e.f(eVar);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        List<xy1.d> list2 = (List) obj;
                        if (list2 != null) {
                            e.a aVar12 = e.T;
                            if (list2.isEmpty()) {
                                linearLayout = eVar.f180825z;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            } else {
                                LinearLayout linearLayout4 = eVar.f180825z;
                                if (linearLayout4 == null) {
                                    p005kotlin.jvm.internal.s.m("chipContainer");
                                    throw null;
                                }
                                linearLayout4.setVisibility(0);
                                wy1.a aVar13 = eVar.I;
                                if (aVar13 != null) {
                                    aVar13.f188050a = list2;
                                    aVar13.notifyDataSetChanged();
                                }
                            }
                        } else {
                            linearLayout = eVar.f180825z;
                            if (linearLayout != null) {
                                p005kotlin.jvm.internal.s.m("chipContainer");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        e.a aVar14 = e.T;
                        int i25 = e.b.f180827b[g3Var2.f35300a.ordinal()];
                        e eVar2 = this.f180800b;
                        if (i25 == 1) {
                            g22.e.l(eVar2);
                        } else if (i25 == 2) {
                            g22.e.f(eVar2);
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            my1.b bVar4 = (my1.b) g3Var2.f35301b;
                            if (bVar4 != null) {
                                CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
                                calendarItemDTO.I1 = true;
                                if (bVar4 instanceof my1.b.a) {
                                    my1.b.a aVar15 = (my1.b.a) bVar4;
                                    o oVar = aVar15.f121479b;
                                    fg0.k kVar = aVar15.f121478a;
                                    calendarItemDTO.H1 = kVar.getShareableEventUuid();
                                    if (kVar.getEventType() == gg0.f.f77136l && ((listH = kVar.h()) == null || listH.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVar, oVar, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar, kVar);
                                    }
                                } else {
                                    if (!(bVar4 instanceof my1.b.C2302b)) {
                                        u0.r();
                                        return null;
                                    }
                                    o oVar2 = ((my1.b.C2302b) bVar4).f121480a;
                                    String garminEventUuid = oVar2.getGarminEventUuid();
                                    if (garminEventUuid == null) {
                                        garminEventUuid = oVar2.getEventRef();
                                    }
                                    calendarItemDTO.H1 = garminEventUuid;
                                    fg0.k kVarU = oVar2.u();
                                    if (oVar2.getEventType() == gg0.f.f77136l && ((listF = oVar2.f()) == null || listF.isEmpty())) {
                                        eVar2.C6().Y5().f(eVar2.getViewLifecycleOwner(), new e.d(new t42.l(eVar2, kVarU, oVar2, calendarItemDTO, 16)));
                                    } else {
                                        eVar2.G6(calendarItemDTO, oVar2, kVarU);
                                    }
                                }
                            }
                            g22.e.f(eVar2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        AddTIEventViewModel addTIEventViewModelC6 = C6();
        if (C6().G5().d() == null) {
            Context contextRequireContext4 = requireContext();
            contextRequireContext4.getClass();
            locationE6 = E6(contextRequireContext4);
        } else {
            locationE6 = null;
        }
        if (locationE6 != null) {
            com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(locationE6.getLatitude(), locationE6.getLongitude(), i.b.WGS84);
            addTIEventViewModelC6.I6(fVar);
            addTIEventViewModelC6.L5(fVar);
        }
        com.garmin.android.library.mapsdkadapter.f fVarI5 = addTIEventViewModelC6.I5();
        boolean z14 = fVarI5 != null;
        DateTime dateTimeP6 = addTIEventViewModelC6.p5();
        if (dateTimeP6 == null || (localDate = dateTimeP6.toLocalDate()) == null) {
            localDate = new LocalDate();
        }
        Boolean bool = addTIEventViewModelC6.f204393j;
        Boolean bool2 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
            lz1.f.a aVar6 = lz1.f.f115404a;
            x xVar = addTIEventViewModelC6.f204394k;
            DateTime dateTime = xVar != null ? xVar.f71370f : null;
            dateTime.getClass();
            x xVar2 = addTIEventViewModelC6.f204394k;
            DateTime dateTime2 = xVar2 != null ? xVar2.f71371g : null;
            dateTime2.getClass();
            aVar6.getClass();
            pVarN = new o13.p(dateTime.toString("MM/dd/yy"), dateTime2.toString("MM/dd/yy"));
        } else if (addTIEventViewModelC6.f204395l) {
            u uVar = addTIEventViewModelC6.f204397n;
            if (uVar == null) {
                uVar = new u(null, false, null, null, null, null, false, null, null, null, 1023, null);
            }
            DateTime dateTime3 = uVar.f71354f;
            if (dateTime3 == null) {
                dateTime3 = uVar.f71352d;
            }
            lz1.f.a aVar7 = lz1.f.f115404a;
            DateTime dateTime4 = uVar.f71353e;
            aVar7.getClass();
            dateTime3.getClass();
            dateTime4.getClass();
            pVarN = new o13.p(dateTime3.toString("MM/dd/yy"), dateTime4.toString("MM/dd/yy"));
        } else {
            lz1.f.a aVar8 = lz1.f.f115404a;
            LocalDate localDatePlusMonths = p005kotlin.jvm.internal.s.g(addTIEventViewModelC6.f204392i, bool2) ? localDate.plusMonths(3) : null;
            aVar8.getClass();
            pVarN = lz1.f.a.n(localDate, localDatePlusMonths);
        }
        if (z14) {
            bg0.a.f17827a.getClass();
            dVar = bg0.a.C0255a.e() ? ez1.e.KM_100 : ez1.f.MILES_50;
        } else {
            bg0.a.f17827a.getClass();
            dVar = bg0.a.C0255a.e() ? ez1.e.WORLD_WIDE : ez1.f.WORLD_WIDE;
        }
        ez1.d dVar2 = dVar;
        if (p005kotlin.jvm.internal.s.g(addTIEventViewModelC6.f204393j, bool2)) {
            fVarD = gg0.f.f77130f;
        } else if (addTIEventViewModelC6.f204395l) {
            u uVar2 = addTIEventViewModelC6.f204397n;
            if (uVar2 == null || (fVarD = uVar2.f71349a) == null) {
                fVarD = gg0.f.f77130f;
            }
        } else {
            fVarD = addTIEventViewModelC6.D5().d();
            if (fVarD == null) {
                fVarD = gg0.f.f77129e;
            }
        }
        my1.d dVar3 = new my1.d((String) pVarN.f128594a, (String) pVarN.f128595b, p005kotlin.jvm.internal.s.g(addTIEventViewModelC6.f204392i, bool2) ? ny1.f.THREEMONTHS : ny1.f.CUSTOM, fVarD, null, dVar2, null, false, null, null, null, null, 0.0d, 0.0d, null, localDate, addTIEventViewModelC6.D5().d(), Boolean.valueOf(z14), addTIEventViewModelC6.f204394k, addTIEventViewModelC6.f204397n, 32720, null);
        my1.d dVar4 = addTIEventViewModelC6.K2;
        if (dVar4 == null) {
            lz1.f.f115404a.getClass();
            addTIEventViewModelC6.K2 = my1.d.b(dVar3, lz1.f.a.m(null), lz1.f.a.m(365), ny1.f.ALL, null, null, ez1.f.WORLD_WIDE, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048536);
        } else if (dVar4.f121487d != addTIEventViewModelC6.E5().d()) {
            my1.d dVar5 = addTIEventViewModelC6.K2;
            if (dVar5 != null) {
                gg0.f fVarD3 = addTIEventViewModelC6.E5().d();
                if (fVarD3 == null) {
                    fVarD3 = gg0.f.f77129e;
                }
                dVarB = my1.d.b(dVar5, null, null, null, fVarD3, null, null, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048567);
            } else {
                dVarB = null;
            }
            addTIEventViewModelC6.K2 = dVarB;
        }
        addTIEventViewModelC6.z5().m(new xy1.a(null, null, fVarI5 != null ? Double.valueOf(fVarI5.f50283a.latitude) : null, fVarI5 != null ? Double.valueOf(fVarI5.f50283a.longitude) : null, dVar3, 3, null));
    }

    @Override // ty1.h0
    public final boolean y6() {
        return false;
    }

    @Override // to0.a.c
    public final void z3(vo0.e eVar) {
        String title;
        eVar.getClass();
        this.C = false;
        this.D = false;
        SearchView searchView = this.f180806e;
        if (searchView == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        searchView.clearFocus();
        vo0.a address = eVar.getAddress();
        if (address == null || (title = address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String()) == null) {
            title = eVar.getTitle();
        }
        SearchView searchView2 = this.f180806e;
        if (searchView2 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        searchView2.setQueryHint(String.valueOf(title));
        C6().J6(title);
        vo0.c cVar = eVar.getCom.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper.POSITION java.lang.String();
        if (cVar != null) {
            C6().P6(cVar.getLatitude(), cVar.getLongitude(), false);
            Double latitude = cVar.getLatitude();
            if (latitude != null) {
                double dDoubleValue = latitude.doubleValue();
                Double longitude = cVar.getLongitude();
                if (longitude != null) {
                    com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, longitude.doubleValue(), i.d.GOOGLE);
                    C6().f46447y2 = title != null ? new o13.p<>(title, fVar) : null;
                }
            }
        }
        EditText editText = this.f180808g;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("locationSearchViewEditText");
            throw null;
        }
        editText.setCursorVisible(true);
        SearchView searchView3 = this.f180806e;
        if (searchView3 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        searchView3.setFocusable(false);
        SearchView searchView4 = this.f180806e;
        if (searchView4 == null) {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
        searchView4.clearFocus();
        H6(false);
        this.D = true;
    }

    @Override // ty1.h0
    public final boolean z6() {
        return C6().f204395l && !C6().I2;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lvy1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_PERM_LOCATION", "I", "", "SEARCH_VIEW_INPUT_DELAY_IN_MILLIS", "J", "REQ_CODE_FILTER", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
