package com.garmin.android.apps.connectmobile.userprofile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import e23.l;
import g12.r;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/g;", "Lcom/garmin/android/apps/connectmobile/m0;", "Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity$d;", "Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity$b;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends m0 implements UserProfileActivity.d, UserProfileActivity.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f46732p = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f46734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f46735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f46736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.b f46737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f46738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g12.e f46739n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f46733h = new w1(s0.f105811a.b(i.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f46740o = true;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46741a;

        public b(l lVar) {
            lVar.getClass();
            this.f46741a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46741a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46741a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46742a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f46742a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46742a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46743a = aVar;
            this.f46744b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46743a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46744b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46745a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46745a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46745a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity.b
    public final void D3(q qVar) {
        qVar.getClass();
        y0<g3<q>> y0Var = I6().f46756h;
        g3<q> g3VarD = y0Var.d();
        if ((g3VarD != null ? g3VarD.f35301b : null) == qVar) {
            return;
        }
        g3.f35298f.getClass();
        y0Var.m(g3.a.d(qVar));
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        if (!I6().x4() && !I6().z4()) {
            i iVarI6 = I6();
            iVarI6.f46758j.j(g3.a.e(g3.f35298f));
            iVarI6.f46760l.j(g3.a.d(null));
            w6();
            return;
        }
        i iVarI7 = I6();
        String str = this.f46734i;
        if (str == null) {
            s.m("mDisplayName");
            throw null;
        }
        iVarI7.f46758j.j(g3.a.c(g3.f35298f));
        String strB = j0.b(DateTime.now(), "yyyy-MM-dd", null);
        if (strB == null) {
            strB = "";
        }
        ge1.b.T(v1.a(iVarI7), null, null, new r(iVarI7, iVarI7.f46749a.b(str, strB), null), 3);
        i iVarI8 = I6();
        String str2 = this.f46734i;
        if (str2 == null) {
            s.m("mDisplayName");
            throw null;
        }
        iVarI8.f46760l.j(g3.a.b(null));
        ge1.b.T(v1.a(iVarI8), null, null, new g12.q(iVarI8, str2, null), 3);
        this.f46740o = false;
    }

    public final i I6() {
        return (i) this.f46733h.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity.d
    public final void M3() {
        this.f46740o = true;
    }

    @Override // com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity.d
    public final void o2() {
        if (this.f46740o) {
            E6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        com.garmin.android.apps.connectmobile.userprofile.b.f46539e.getClass();
        this.f46737l = new com.garmin.android.apps.connectmobile.userprofile.b();
        v parentFragmentManager = getParentFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(parentFragmentManager, parentFragmentManager);
        com.garmin.android.apps.connectmobile.userprofile.b bVar = this.f46737l;
        if (bVar == null) {
            s.m("mMonthlySummarySection");
            throw null;
        }
        aVarB.l(R.id.stats_sections, bVar, null);
        aVarB.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("GCM_userDisplayName");
            if (string == null) {
                string = "";
            }
            this.f46734i = string;
        }
        String str = this.f46734i;
        if (str == null) {
            s.m("mDisplayName");
            throw null;
        }
        if (str.length() == 0) {
            this.f46734i = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.user_profile_stats);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.profile_only_me);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f46735j = textView;
        textView.setText(R.string.user_profile_status_private_hint);
        TextView textView2 = this.f46735j;
        if (textView2 == null) {
            s.m("mProfileOnlyMeText");
            throw null;
        }
        textView2.setVisibility(8);
        View viewFindViewById2 = view2.findViewById(R.id.profile_privacy);
        viewFindViewById2.getClass();
        this.f46736k = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.user_profile_stats);
        viewFindViewById3.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f46738m = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = this.f46738m;
        if (recyclerView2 == null) {
            s.m("mRecyclerView");
            throw null;
        }
        recyclerView2.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = this.f46738m;
        if (recyclerView3 == null) {
            s.m("mRecyclerView");
            throw null;
        }
        recyclerView3.setFocusable(false);
        g12.e eVar = new g12.e(I6());
        this.f46739n = eVar;
        RecyclerView recyclerView4 = this.f46738m;
        if (recyclerView4 == null) {
            s.m("mRecyclerView");
            throw null;
        }
        recyclerView4.setAdapter(eVar);
        F6(false);
        I6().D.f(getViewLifecycleOwner(), new b(new g12.f(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/g$a;", "", "<init>", "()V", "", "USER_NOT_AUTHORIZED_RESPONSE_CODE", "I", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
