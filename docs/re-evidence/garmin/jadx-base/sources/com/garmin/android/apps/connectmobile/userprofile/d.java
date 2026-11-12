package com.garmin.android.apps.connectmobile.userprofile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import e23.l;
import f2.o0;
import j12.k;
import o13.m;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/d;", "Lcom/garmin/android/apps/connectmobile/m0;", "Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity$d;", "Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity$b;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends m0 implements UserProfileActivity.d, UserProfileActivity.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f46550p = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f46551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f46552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f46553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.c f46554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f46555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f46556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46557n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w1 f46558o;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46559a;

        public b(l lVar) {
            lVar.getClass();
            this.f46559a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46559a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46559a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46560a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f46560a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f46560a;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0899d extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46561a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0899d(e23.a aVar) {
            super(0);
            this.f46561a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f46561a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f46562a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o13.l lVar) {
            super(0);
            this.f46562a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f46562a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f46564b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, o13.l lVar) {
            super(0);
            this.f46563a = aVar;
            this.f46564b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46563a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f46564b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f46566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, o13.l lVar) {
            super(0);
            this.f46565a = fragment;
            this.f46566b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f46566b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f46565a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public d() {
        o13.l lVarA = m.a(o13.n.NONE, new C0899d(new c(this)));
        this.f46558o = new w1(s0.f105811a.b(g12.c.class), new e(lVarA), new g(this, lVarA), new f(null, lVarA));
    }

    @Override // com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity.b
    public final void D3(q qVar) {
        com.garmin.android.apps.connectmobile.userprofile.c cVar;
        qVar.getClass();
        if (s.g(this.f46552i, qVar)) {
            return;
        }
        this.f46552i = qVar;
        if (!isAdded() || (cVar = this.f46554k) == null) {
            return;
        }
        cVar.f46547b.f46548a = this.f46552i;
        cVar.notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        q qVar;
        I6();
        J6();
        String str = this.f46551h;
        if (str == null) {
            s.m("displayName");
            throw null;
        }
        if (str.equals(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName()) || ((qVar = this.f46552i) != null && qVar.r())) {
            G6();
            g12.c cVar = (g12.c) this.f46558o.getValue();
            String str2 = this.f46551h;
            if (str2 == null) {
                s.m("displayName");
                throw null;
            }
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            androidx.lifecycle.m.a(null, new g12.a(cVar, str2, new k22.b(contextRequireContext), null), 3).f(getViewLifecycleOwner(), new b(new o0(this, 28)));
            this.f46557n = false;
        }
    }

    public final void I6() {
        com.garmin.android.apps.connectmobile.userprofile.c.a aVar;
        com.garmin.android.apps.connectmobile.userprofile.c cVar = this.f46554k;
        if (cVar == null || (aVar = cVar.f46547b) == null || !aVar.a()) {
            return;
        }
        RecyclerView recyclerView = this.f46556m;
        ViewGroup.LayoutParams layoutParams = recyclerView != null ? recyclerView.getLayoutParams() : null;
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0;
        RecyclerView recyclerView2 = this.f46556m;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutParams(marginLayoutParams);
        }
    }

    public final void J6() {
        q qVar;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo;
        if (this.f46552i == null) {
            return;
        }
        String str = this.f46551h;
        String strB = null;
        if (str == null) {
            s.m("displayName");
            throw null;
        }
        if (str.equals(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName()) || ((qVar = this.f46552i) != null && qVar.r())) {
            TextView textView = this.f46555l;
            if (textView != null) {
                textView.setVisibility(8);
            }
            RecyclerView recyclerView = this.f46556m;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
                return;
            }
            return;
        }
        TextView textView2 = this.f46555l;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.f46555l;
        if (textView3 != null) {
            q qVar2 = this.f46552i;
            if (qVar2 != null && (userInfo = qVar2.getUserInfo()) != null) {
                strB = userInfo.b();
            }
            textView3.setText(getString(R.string.user_profile_private, strB));
        }
        RecyclerView recyclerView2 = this.f46556m;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity.d
    public final void M3() {
        this.f46557n = true;
    }

    @Override // com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity.d
    public final void o2() {
        if (this.f46557n) {
            E6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        q qVar = this.f46552i;
        if (qVar != null) {
            com.garmin.android.apps.connectmobile.userprofile.c cVar = this.f46554k;
            if (cVar != null) {
                cVar.f46547b.f46548a = qVar;
                cVar.notifyDataSetChanged();
            }
            I6();
        }
        J6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("GCM_userDisplayName") : null;
        if (!g22.n.d(string)) {
            string = null;
        }
        if (string == null) {
            string = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        }
        this.f46551h = string;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.user_profile_about);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f46556m = (RecyclerView) view2.findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = this.f46556m;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.f46556m;
        if (recyclerView2 != null) {
            recyclerView2.setHasFixedSize(true);
        }
        this.f46555l = (TextView) view2.findViewById(R.id.profile_privacy);
        com.garmin.android.apps.connectmobile.userprofile.c cVar = new com.garmin.android.apps.connectmobile.userprofile.c();
        this.f46554k = cVar;
        RecyclerView recyclerView3 = this.f46556m;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(cVar);
        }
        F6(false);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/d$a;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
