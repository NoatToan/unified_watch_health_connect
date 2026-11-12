package lh2;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Llh2/e;", "Llh2/b;", "Lzh2/b;", "Landroid/content/Context;", "ctx", "Lei2/d;", "transform", "<init>", "(Landroid/content/Context;Lei2/d;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lii2/b;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lei2/d;Lii2/b;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends lh2.b implements zh2.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f112471j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ei2.d f112472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f112473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StyledTextView f112474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f112475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StyledTextView f112476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f112477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Dialog f112478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f112479i;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f112480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f112481b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, d dVar) {
            super(0);
            this.f112480a = fragment;
            this.f112481b = dVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f112480a.getF158016a().d(this.f112481b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "deviceAssociated", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends w implements e23.l<Boolean, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f112483b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(1);
            this.f112483b = fragment;
        }

        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                e.j(e.this, this.f112483b);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112484a;

        static {
            int[] iArr = new int[mh2.e.values().length];
            try {
                iArr[mh2.e.NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mh2.e.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112484a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lh2/e$d", "Landroidx/lifecycle/n;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements androidx.lifecycle.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ei2.i f112485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f112486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f112487c;

        public d(ei2.i iVar, e eVar, Fragment fragment) {
            this.f112485a = iVar;
            this.f112486b = eVar;
            this.f112487c = fragment;
        }

        @Override // androidx.lifecycle.n
        public final void onStart(n0 n0Var) {
            ei2.i iVar = this.f112485a;
            if (iVar == null || !(iVar instanceof ei2.i.a)) {
                return;
            }
            zh2.e.f204807a.getClass();
            zh2.a aVarA = zh2.e.a();
            ei2.i.a aVar = (ei2.i.a) iVar;
            String str = aVar.f64393d;
            if (((uc0.d) aVarA).f(str, aVar.f64390a).f112456b.invoke(str).booleanValue()) {
                e.j(this.f112486b, this.f112487c);
            }
        }
    }

    /* JADX INFO: renamed from: lh2.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C2160e extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2160e f112488a = new C2160e();

        public C2160e() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class f implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f112489a;

        public f(e23.l lVar) {
            lVar.getClass();
            this.f112489a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof z0) || !(obj instanceof p005kotlin.jvm.internal.n)) {
                return false;
            }
            return this.f112489a.equals(((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f112489a;
        }

        public final int hashCode() {
            return this.f112489a.hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f112489a.invoke(obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Fragment fragment, ei2.d dVar, ii2.b bVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        dVar.getClass();
        bVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, dVar);
        dVar.o(this);
        ei2.i iVarR = dVar.r(bVar, map);
        d dVar2 = new d(iVarR, this, fragment);
        fragment.getF158016a().a(dVar2);
        this.f112479i = new a(fragment, dVar2);
        bVar.f93793c.f(fragment.getViewLifecycleOwner(), new dn0.g(this, map, bVar, iVarR, fragment, dVar, 1));
        androidx.fragment.app.m mVarRequireActivity = fragment.requireActivity();
        mVarRequireActivity.getClass();
        ((ii2.a) new x1(mVarRequireActivity).b(s0.f105811a.b(ii2.a.class))).f93790a.f(fragment, new f(new b(fragment)));
    }

    public static final void j(e eVar, Fragment fragment) {
        FrameLayout frameLayout;
        eVar.getClass();
        v childFragmentManager = fragment.getChildFragmentManager();
        lh2.d.f112457i.getClass();
        Fragment fragmentG = childFragmentManager.G(lh2.d.f112458j);
        if (fragmentG != null) {
            v childFragmentManager2 = fragment.getChildFragmentManager();
            childFragmentManager2.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager2);
            aVar.k(fragmentG);
            aVar.e();
            return;
        }
        View view2 = fragment.getView();
        if (view2 == null || (frameLayout = (FrameLayout) view2.findViewById(R.id.frag_device_link_banner)) == null) {
            return;
        }
        frameLayout.removeAllViews();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [e23.a, kotlin.jvm.internal.w] */
    @Override // zh2.b
    public final void a() {
        this.f112472b.p();
        Dialog dialog = this.f112478h;
        if (dialog != null) {
            dialog.cancel();
        }
        this.f112478h = null;
        this.f112479i.invoke();
    }

    @Override // zh2.b
    public final void b(String str) {
        mh2.e eVar;
        this.f112473c.getClass();
        mh2.e[] eVarArrValues = mh2.e.values();
        int length = eVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i14];
            if (p005kotlin.jvm.internal.s.g(eVar.name(), str)) {
                break;
            } else {
                i14++;
            }
        }
        if (eVar == null) {
            eVar = mh2.e.NOT_CONNECTED;
        }
        this.f112474d.setText(getContext().getString(eVar.f118545a));
        k(eVar);
    }

    public final void k(mh2.e eVar) {
        int i14;
        eVar.name();
        this.f112473c.getClass();
        Dialog dialog = this.f112478h;
        if (dialog != null) {
            dialog.cancel();
        }
        int i15 = c.f112484a[eVar.ordinal()];
        if (i15 == 1) {
            i14 = 0;
        } else {
            if (i15 != 2) {
                u0.r();
                return;
            }
            i14 = 8;
        }
        this.f112475e.setVisibility(i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, ei2.d dVar) {
        super(context, null, 2, null);
        context.getClass();
        dVar.getClass();
        this.f112472b = dVar;
        this.f112473c = new hi2.d("DeviceView", null, 2, null);
        View.inflate(context, R.layout.dsl_device_image_row, this);
        View viewFindViewById = findViewById(R.id.device_status);
        viewFindViewById.getClass();
        this.f112474d = (StyledTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.device_status_icon);
        viewFindViewById2.getClass();
        this.f112475e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.device_name);
        viewFindViewById3.getClass();
        this.f112476f = (StyledTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.device_image);
        viewFindViewById4.getClass();
        this.f112477g = (ImageView) viewFindViewById4;
        this.f112479i = C2160e.f112488a;
    }
}
