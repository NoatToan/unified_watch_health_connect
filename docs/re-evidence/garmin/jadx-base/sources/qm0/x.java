package qm0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.i0;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lqm0/x;", "Landroidx/fragment/app/Fragment;", "Lk32/d;", "Lqm0/x$b;", "<init>", "()V", "b", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends Fragment implements k32.d<b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f145575g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f145576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f145577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f145578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppBarLayout f145579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k32.c<b> f145580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f145581f;

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145588a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.POST_FEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.ACTIVITY_FEED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f145588a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f145589a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f145589a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f145589a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f145589a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f145590a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f145590a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f145590a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f145591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f145592b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f145591a = aVar;
            this.f145592b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f145591a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f145592b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f145593a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f145593a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f145593a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f145594a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f145594a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f145594a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f145595a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar) {
            super(0);
            this.f145595a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f145595a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f145596a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(o13.l lVar) {
            super(0);
            this.f145596a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f145596a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f145597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f145598b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e23.a aVar, o13.l lVar) {
            super(0);
            this.f145597a = aVar;
            this.f145598b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f145597a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f145598b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class l extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f145599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f145600b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment, o13.l lVar) {
            super(0);
            this.f145599a = fragment;
            this.f145600b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f145600b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f145599a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    static {
        new a(null);
    }

    public x() {
        super(R.layout.fragment_group_feed_frame_fragment);
        t0 t0Var = s0.f105811a;
        this.f145576a = new w1(t0Var.b(mm0.e.class), new e(this), new g(this), new f(null, this));
        o13.l lVarA = o13.m.a(o13.n.NONE, new i(new h(this)));
        this.f145577b = new w1(t0Var.b(w.class), new j(lVarA), new l(this, lVarA), new k(null, lVarA));
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new jp.a(this, 23));
        cVarRegisterForActivityResult.getClass();
        this.f145581f = cVarRegisterForActivityResult;
    }

    public static qm0.d u6(b bVar) {
        int i14 = c.f145588a[bVar.ordinal()];
        if (i14 == 1) {
            return new sm0.c();
        }
        if (i14 == 2) {
            return new um0.d();
        }
        if (i14 == 3) {
            return new rm0.d();
        }
        u0.r();
        return null;
    }

    @Override // k32.d
    public final void C(b bVar) {
        String str;
        b bVar2 = bVar;
        bVar2.getClass();
        String str2 = bVar2.f145587b;
        i2.f36769a.getClass();
        i2.a.b(a2.GENERAL, "GroupPostFrameFragment", "onOptionSelected: " + bVar2);
        this.f145578c = bVar2;
        b[] bVarArrValues = b.values();
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : bVarArrValues) {
            if (bVar3 != bVar2) {
                arrayList.add(bVar3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Fragment fragmentG = getChildFragmentManager().G(((b) it.next()).f145587b);
            if (fragmentG != null) {
                androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                aVar.v(fragmentG);
                aVar.e();
            }
        }
        Fragment fragmentG2 = getChildFragmentManager().G(str2);
        if (fragmentG2 != null) {
            a2 a2Var = a2.GENERAL;
            String strM = am.j.m("Contain fragment:", fragmentG2.getClass().getSimpleName(), ", and show it");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GroupPostFrameFragment", strM);
            androidx.fragment.app.v childFragmentManager2 = getChildFragmentManager();
            childFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager2);
            aVar2.x(fragmentG2);
            aVar2.e();
        } else {
            i2.f36769a.getClass();
            i2.a.b(a2.GENERAL, "GroupPostFrameFragment", "Create fragment by type: " + bVar2);
            androidx.fragment.app.v childFragmentManager3 = getChildFragmentManager();
            childFragmentManager3.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(childFragmentManager3);
            aVar3.j(R.id.fragment_container, u6(bVar2), str2, 1);
            aVar3.e();
        }
        int i14 = jm0.d.a.f99564b[bVar2.ordinal()];
        if (i14 == 1) {
            str = "All";
        } else if (i14 == 2) {
            str = "Activity";
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            str = "Post";
        }
        Bundle bundleD = b71.i.d("chip", str);
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "GroupFeedChipSelected");
    }

    @Override // k32.d
    public final void Z3(b bVar) {
        bVar.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        boolean z14;
        Fragment fragmentG;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        AppBarLayout appBarLayout = (AppBarLayout) view2.findViewById(R.id.appbar_layout);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) appBarLayout.findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.getViewTreeObserver().addOnGlobalLayoutListener(new y(collapsingToolbarLayout));
        this.f145579d = appBarLayout;
        b bVar = (b) p13.u.E(b.values());
        this.f145578c = bVar;
        b[] bVarArrValues = b.values();
        int length = bVarArrValues.length;
        int i14 = 0;
        while (true) {
            z14 = true;
            if (i14 >= length) {
                break;
            }
            b bVar2 = bVarArrValues[i14];
            androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
            androidx.fragment.app.a aVarB = androidx.core.view.j.b(childFragmentManager, childFragmentManager);
            qm0.d dVarU6 = u6(bVar2);
            String str = bVar2.f145587b;
            aVarB.j(R.id.fragment_container, dVarU6, str, 1);
            aVarB.t();
            if (bVar2 != bVar && (fragmentG = getChildFragmentManager().G(str)) != null) {
                androidx.fragment.app.v childFragmentManager2 = getChildFragmentManager();
                childFragmentManager2.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager2);
                aVar.v(fragmentG);
                aVar.e();
            }
            i14++;
        }
        int dimension = (int) getResources().getDimension(R.dimen.spacing_normal);
        View view3 = getView();
        ViewGroup viewGroup = view3 != null ? (ViewGroup) view3.findViewById(R.id.chip_group_layout) : null;
        LinearLayout linearLayout = viewGroup != null ? (LinearLayout) viewGroup.findViewById(R.id.chip_container_layout) : null;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        b[] bVarArrValues2 = b.values();
        ArrayList arrayList = new ArrayList(bVarArrValues2.length);
        int length2 = bVarArrValues2.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length2) {
            b bVar3 = bVarArrValues2[i15];
            int i17 = i16 + 1;
            boolean z15 = i16 == 0 ? z14 : false;
            boolean z16 = bVar3 == bVar ? z14 : false;
            View viewInflate = getLayoutInflater().inflate(R.layout.view_display_chip, (ViewGroup) linearLayout, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.getClass();
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(z15 ? 0 : dimension);
            if (linearLayout != null) {
                linearLayout.addView(viewInflate);
            }
            boolean z17 = z16;
            k32.e eVar = new k32.e(viewInflate, bVar3, false, 4, null);
            eVar.d(bVar3.f145586a);
            eVar.c(z17);
            arrayList.add(eVar);
            i15++;
            i16 = i17;
            z14 = true;
        }
        this.f145580e = new k32.c<>(arrayList, this, new l32.d());
        UserLevelImageView userLevelImageView = (UserLevelImageView) view2.findViewById(R.id.post_avatar);
        i0 i0VarB = g22.f.b(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(i0VarB, x53.b.f189152a, null, new z(userLevelImageView, null), 2);
        view2.findViewById(R.id.create_post_container).setOnClickListener(new oq.a(this, 12));
        y0<Unit> y0Var = ((w) this.f145577b.getValue()).f145568c;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new d(new qd0.a(this, 22)));
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lqm0/x$b;", "", "", "title", "", HeaderParameterNames.AUTHENTICATION_TAG, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        ALL(R.string.common_all, "GroupAllPostFragment"),
        ACTIVITY_FEED(R.string.concept_activities, "GroupDetailActivityFeedFragment"),
        POST_FEED(R.string.social_group_posts, "GroupPostFeedFragment");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f145586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145587b;

        static {
            new a(null);
            b[] bVarArrValues = values();
            int iA = p13.t0.a(bVarArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            for (b bVar : bVarArrValues) {
                linkedHashMap.put(bVar.f145587b, bVar);
            }
        }

        b(int i14, String str) {
            this.f145586a = i14;
            this.f145587b = str;
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqm0/x$b$a;", "", "<init>", "()V", "", "", "Lqm0/x$b;", "map", "Ljava/util/Map;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lqm0/x$a;", "", "<init>", "()V", "", "PREVIOUS_TYPE", "Ljava/lang/String;", "TAG", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
