package w50;

import am.x0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.SlidingUpPanelLayout;
import com.garmin.android.library.mapsdkadapter.f;
import com.garmin.android.library.mapsdkadapter.i;
import e23.l;
import ie2.j;
import ie2.k;
import java.util.LinkedHashMap;
import mv0.g;
import o13.h;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import tr2.y;
import vn2.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lw50/d;", "Lqw0/a;", "Lcom/garmin/android/library/mapsdkadapter/i$j;", "Lcom/garmin/android/library/mapsdkadapter/i$m;", "Lcom/garmin/android/library/mapsdkadapter/i$g;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends qw0.a implements i.j, i.m {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f182192w = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f182193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f182194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressBar f182195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.e f182196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SlidingUpPanelLayout f182197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u20.b f182198m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w50.e f182202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.d f182203r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f.c<String> f182205v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f182199n = new LinkedHashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f182200o = new LinkedHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f182201p = m.a(n.NONE, new e(this, null, new C3392d(this), null, null));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f182204t = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"w50/d$b", "Landroid/os/CountDownTimer;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends CountDownTimer {
        public b() {
            super(2000L, 40L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            d dVar = d.this;
            ProgressBar progressBar = dVar.f182195j;
            if (progressBar == null) {
                s.m("progressBar");
                throw null;
            }
            progressBar.setProgress(0);
            dVar.C6();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
            ProgressBar progressBar = d.this.f182195j;
            if (progressBar != null) {
                progressBar.setProgress(2000 - ((int) j8));
            } else {
                s.m("progressBar");
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f182207a;

        public c(l lVar) {
            lVar.getClass();
            this.f182207a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f182207a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f182207a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: w50.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3392d implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f182208a;

        public C3392d(Fragment fragment) {
            this.f182208a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f182208a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f182209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f182210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f182211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f182212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f182213e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f182209a = fragment;
            this.f182210b = qualifier;
            this.f182211c = aVar;
            this.f182212d = aVar2;
            this.f182213e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, mv0.g] */
        @Override // e23.a
        public final g invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f182211c.invoke()).getF189591b();
            Fragment fragment = this.f182209a;
            e23.a aVar = this.f182212d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(g.class), f189591b, null, defaultViewModelCreationExtras, this.f182210b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f182213e, 4, null);
        }
    }

    static {
        new a(null);
    }

    public d() {
        f.c<String> cVarRegisterForActivityResult = registerForActivityResult(new g.g(), new y(this, 7));
        cVarRegisterForActivityResult.getClass();
        this.f182205v = cVarRegisterForActivityResult;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @SuppressLint({"MissingPermission"})
    public final void A6() {
        ((g) this.f182201p.getValue()).x4("CoursesMapFragment").f(getViewLifecycleOwner(), new c(new vu1.b(this, 10)));
    }

    public final void C6() {
        w50.e eVar;
        if (this.f182202q == null || this.f182196k == null) {
            return;
        }
        ProgressBar progressBar = this.f182195j;
        if (progressBar == null) {
            s.m("progressBar");
            throw null;
        }
        progressBar.setVisibility(0);
        ProgressBar progressBar2 = this.f182195j;
        if (progressBar2 == null) {
            s.m("progressBar");
            throw null;
        }
        progressBar2.setIndeterminate(true);
        com.garmin.android.library.mapsdkadapter.e eVar2 = this.f182196k;
        if (eVar2 != null && (eVar = this.f182202q) != null) {
            eVar.Z1(eVar2);
        }
        this.f182194i = true;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.m
    public final boolean O2(j jVar) {
        w50.b bVar;
        com.garmin.android.apps.connectmobile.courses.model.d dVar;
        ImageView imageView;
        k uiSettings;
        LinkedHashMap linkedHashMap = this.f182199n;
        if (linkedHashMap.isEmpty() || (bVar = (w50.b) jVar.getTag()) == null || (dVar = (com.garmin.android.apps.connectmobile.courses.model.d) linkedHashMap.get(bVar.f182187a)) == null) {
            return false;
        }
        com.garmin.android.apps.connectmobile.courses.model.i.a aVar = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
        x0 x0VarC = dVar.C();
        aVar.getClass();
        com.garmin.android.apps.connectmobile.courses.model.i iVarA = com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        jVar.f(iVarA.b(contextRequireContext, true));
        SlidingUpPanelLayout slidingUpPanelLayout = this.f182197l;
        if (slidingUpPanelLayout == null) {
            s.m("slidingLayout");
            throw null;
        }
        slidingUpPanelLayout.c();
        qe2.h hVar = this.f148294e;
        if (hVar != null && (uiSettings = hVar.f144584a.getUiSettings()) != null) {
            uiSettings.setZoomControlsEnabled(false);
        }
        u20.b bVar2 = this.f182198m;
        if (bVar2 == null) {
            s.m("courseHeaderHolder");
            throw null;
        }
        bVar2.b(dVar.distanceInMeters, dVar.elevationGainInMeters, dVar.elevationLossInMeters);
        if (bVar2.f167874k && (imageView = bVar2.f167878o) != null) {
            x0 x0VarC2 = dVar.C();
            aVar.getClass();
            imageView.setImageResource(com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC2).f32981c);
        }
        bVar2.a();
        u20.b bVar3 = this.f182198m;
        if (bVar3 == null) {
            s.m("courseHeaderHolder");
            throw null;
        }
        bVar3.f167864a.setOnClickListener(new u12.e(24, this, dVar));
        this.f182203r = dVar;
        return false;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public final void X(f fVar) {
        z6();
    }

    @Override // qw0.a, com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(i iVar) {
        w6();
        iVar.getUiSettings().setMapToolbarEnabled(false);
        s20.l.f156021a.getClass();
        int iC1 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).c1();
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            com.garmin.android.library.mapsdkadapter.m.f50298a.getClass();
            if (iC1 == 1 || iC1 == 2 || iC1 == 4 || iC1 == 3) {
                hVar.setMapType(iC1);
            }
        }
        iVar.O(this);
        iVar.E(this);
        iVar.B(this);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        iVar.k(new w50.a(contextRequireContext));
        iVar.t(new n23.j());
        iVar.H(new t0(this, 11));
    }

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr = {j22.a.f96719h};
        bVar.getClass();
        if (!j22.b.k(aVarArr)) {
            this.f182205v.a("android.permission.ACCESS_FINE_LOCATION", null);
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.COURSES;
        aVar.getClass();
        i2.a.b(a2Var, "CoursesMapFragment", "onActivityCreated:location perm on, creating the location client");
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            hVar.setMyLocationEnabled(true);
        }
        u6(this.f182196k, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qw0.a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f182202q = (w50.e) context;
        } catch (ClassCastException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.COURSES;
            aVar.getClass();
            i2.a.b(a2Var, "CoursesMapFragment", "Activity must implement OnCourseMapActionListener");
        }
    }

    @Override // qw0.a, com.garmin.android.library.mapsdkadapter.i.g
    public final void onCameraIdle() {
        qe2.h hVar = this.f148294e;
        this.f182196k = hVar != null ? hVar.f144584a.getZ() : null;
        if (this.f182193h || this.f182203r != null) {
            return;
        }
        z6();
        if (!this.f182194i) {
            C6();
            return;
        }
        ProgressBar progressBar = this.f182195j;
        if (progressBar == null) {
            s.m("progressBar");
            throw null;
        }
        progressBar.setVisibility(0);
        ProgressBar progressBar2 = this.f182195j;
        if (progressBar2 == null) {
            s.m("progressBar");
            throw null;
        }
        progressBar2.setIndeterminate(false);
        ProgressBar progressBar3 = this.f182195j;
        if (progressBar3 == null) {
            s.m("progressBar");
            throw null;
        }
        progressBar3.setProgress(0);
        ProgressBar progressBar4 = this.f182195j;
        if (progressBar4 == null) {
            s.m("progressBar");
            throw null;
        }
        progressBar4.setMax(2000);
        b bVar = this.f182204t;
        bVar.cancel();
        bVar.start();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f182193h = true;
    }

    @Override // qw0.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_course_search_map_fragment, viewGroup, false);
        ((ViewGroup) viewInflate.findViewById(R.id.map_container)).addView(super.onCreateView(layoutInflater, viewGroup, bundle));
        return viewInflate;
    }

    @Override // qw0.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view2 = getView();
        if (view2 != null) {
            view2.setFocusableInTouchMode(true);
            view2.requestFocus();
            view2.setOnKeyListener(new com.garmin.android.gncs.settings.e(this, 2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        j22.b bVar = j22.b.f96736a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        if (j22.b.c(contextRequireContext)) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.COURSES;
            aVar.getClass();
            i2.a.b(a2Var, "CoursesMapFragment", "onStart:location perm on, calling connect on the location client");
            A6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f182204t.cancel();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.progress_bar);
        viewFindViewById.getClass();
        this.f182195j = (ProgressBar) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.course_details_container);
        viewFindViewById2.getClass();
        this.f182198m = new u20.b(viewFindViewById2);
        View viewFindViewById3 = view2.findViewById(R.id.map_slide_layout);
        viewFindViewById3.getClass();
        this.f182197l = (SlidingUpPanelLayout) viewFindViewById3;
        ProgressBar progressBar = this.f182195j;
        if (progressBar == null) {
            s.m("progressBar");
            throw null;
        }
        Drawable progressDrawable = progressBar.getProgressDrawable();
        int color = a7.b.getColor(requireContext(), R.color.gcm_icon_secondary);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        progressDrawable.setColorFilter(new PorterDuffColorFilter(color, mode));
        ProgressBar progressBar2 = this.f182195j;
        if (progressBar2 != null) {
            progressBar2.getIndeterminateDrawable().setColorFilter(new PorterDuffColorFilter(a7.b.getColor(requireContext(), R.color.gcm_icon_primary_action), mode));
        } else {
            s.m("progressBar");
            throw null;
        }
    }

    public final void z6() {
        k uiSettings;
        SlidingUpPanelLayout slidingUpPanelLayout = this.f182197l;
        if (slidingUpPanelLayout == null) {
            s.m("slidingLayout");
            throw null;
        }
        if (!slidingUpPanelLayout.f47539w) {
            slidingUpPanelLayout.e(1.0f);
        }
        this.f182203r = null;
        qe2.h hVar = this.f148294e;
        if (hVar == null || (uiSettings = hVar.f144584a.getUiSettings()) == null) {
            return;
        }
        uiSettings.setZoomControlsEnabled(true);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lw50/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INITIAL_ZOOM_LEVEL", "I", "BOUNDS_CHANGE_THROTTLE_MILLIS", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
