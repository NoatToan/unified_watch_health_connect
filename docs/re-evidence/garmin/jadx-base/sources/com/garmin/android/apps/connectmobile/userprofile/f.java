package com.garmin.android.apps.connectmobile.userprofile;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import e23.l;
import f2.o0;
import g12.n;
import g12.o;
import o13.m;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import r22.i0;
import z12.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/f;", "Lcom/garmin/android/apps/connectmobile/d0;", "Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity$d;", "Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity$b;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends d0 implements UserProfileActivity.d, UserProfileActivity.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f46715v = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f46716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f46717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f46718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.e f46719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46720q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w1 f46721r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a4.b f46722t;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/f$b", "Lr22/i0;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f46723f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView.p pVar, int i14, f fVar) {
            super(pVar, i14);
            this.f46723f = fVar;
        }

        @Override // r22.i0
        public final void a(int i14) {
            com.garmin.android.apps.connectmobile.userprofile.e.a aVar;
            i2.a aVar2 = i2.f36769a;
            aVar2.getClass();
            i2.a.b(a2.USER, "ProfileActivitiesFragment", "onLoadComplete: total number = " + i14);
            f fVar = this.f46723f;
            com.garmin.android.apps.connectmobile.userprofile.e eVar = fVar.f46719p;
            if (eVar != null && ((aVar = eVar.f46567c) == null || !aVar.f46575f)) {
                if (aVar != null) {
                    aVar.f46575f = true;
                }
                k kVar = eVar.f33125b;
                if (kVar != null) {
                    eVar.r(kVar, 0);
                }
            }
            fVar.T6(true);
        }

        @Override // r22.i0
        public final void b(int i14, int i15) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.USER, "ProfileActivitiesFragment", "onLoadMore: start = " + i14 + ", limit = " + i15);
            a aVar2 = f.f46715v;
            f fVar = this.f46723f;
            if (fVar.d7()) {
                fVar.c7();
                i iVar = (i) fVar.f46721r.getValue();
                ge1.b.T(v1.a(iVar), null, null, new n(iVar, fVar.f46716m, i14, i15, null), 3);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46724a;

        public c(l lVar) {
            lVar.getClass();
            this.f46724a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46724a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46724a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46725a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f46725a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f46725a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46726a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar) {
            super(0);
            this.f46726a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f46726a.invoke();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0902f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f46727a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0902f(o13.l lVar) {
            super(0);
            this.f46727a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f46727a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f46729b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, o13.l lVar) {
            super(0);
            this.f46728a = aVar;
            this.f46729b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46728a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f46729b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f46731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment, o13.l lVar) {
            super(0);
            this.f46730a = fragment;
            this.f46731b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f46731b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f46730a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public f() {
        o13.l lVarA = m.a(o13.n.NONE, new e(new d(this)));
        this.f46721r = new w1(s0.f105811a.b(i.class), new C0902f(lVarA), new h(this, lVarA), new g(null, lVarA));
        this.f46722t = new a4.b(this, 24);
    }

    @Override // com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity.b
    public final void D3(q qVar) {
        qVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.USER;
        aVar.getClass();
        i2.a.b(a2Var, "ProfileActivitiesFragment", "updateUserProfileInfo");
        if (s.g(this.f46717n, qVar)) {
            return;
        }
        this.f46717n = qVar;
        if (isAdded()) {
            com.garmin.android.apps.connectmobile.userprofile.e eVar = this.f46719p;
            if (eVar != null) {
                com.garmin.android.apps.connectmobile.userprofile.e.a aVar2 = eVar.f46567c;
                if (!s.g(aVar2 != null ? aVar2.f46570a : null, qVar)) {
                    com.garmin.android.apps.connectmobile.userprofile.e.a aVar3 = eVar.f46567c;
                    if (aVar3 != null) {
                        aVar3.f46570a = qVar;
                    }
                    eVar.notifyDataSetChanged();
                }
            }
            if (this.f46720q && !e7() && d7()) {
                M7();
            }
            f7();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.USER;
        aVar.getClass();
        i2.a.b(a2Var, "ProfileActivitiesFragment", "onRefreshed");
        if (!e7()) {
            q qVar = this.f46717n;
            if (qVar == null) {
                return;
            }
            if (qVar != null && qVar.i() == com.garmin.android.apps.connectmobile.userprofile.model.n.PRIVATE) {
                return;
            }
        }
        w1 w1Var = this.f46721r;
        i iVar = (i) w1Var.getValue();
        String str = this.f46716m;
        if (str == null) {
            str = "";
        }
        androidx.lifecycle.m.a(v1.a(iVar).f183565a, new o(iVar, str, 8, null), 2).f(this, new c(new o0(this, 29)));
        i0 i0Var = this.f33123k;
        int i14 = i0Var.f149677b;
        int i15 = i0Var.f149678c;
        c7();
        i iVar2 = (i) w1Var.getValue();
        ge1.b.T(v1.a(iVar2), null, null, new n(iVar2, this.f46716m, i14, i15, null), 3);
        this.f46720q = false;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final d0.a I6() {
        com.garmin.android.apps.connectmobile.userprofile.e eVar = new com.garmin.android.apps.connectmobile.userprofile.e();
        this.f46719p = eVar;
        return eVar;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final i0 J6(RecyclerView.p pVar, int i14) {
        pVar.getClass();
        return new b(pVar, i14, this);
    }

    @Override // com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity.d
    public final void M3() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.USER;
        aVar.getClass();
        i2.a.b(a2Var, "ProfileActivitiesFragment", "onPageInvalidated");
        this.f46720q = true;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final void V6() {
        super.V6();
        com.garmin.android.apps.connectmobile.userprofile.e eVar = this.f46719p;
        if (eVar != null) {
            com.garmin.android.apps.connectmobile.userprofile.e.a aVar = eVar.f46567c;
            if (aVar == null || aVar.f46575f) {
                if (aVar != null) {
                    aVar.f46575f = false;
                }
                k kVar = eVar.f33125b;
                if (kVar != null) {
                    eVar.r(kVar, 0);
                }
            }
        }
    }

    public final boolean d7() {
        q qVar;
        com.garmin.android.apps.connectmobile.userprofile.e eVar;
        com.garmin.android.apps.connectmobile.userprofile.e.a aVar;
        return e7() || (((qVar = this.f46717n) == null || qVar.i() != com.garmin.android.apps.connectmobile.userprofile.model.n.PRIVATE) && (eVar = this.f46719p) != null && (aVar = eVar.f46567c) != null && aVar.f46574e);
    }

    public final boolean e7() {
        String str = this.f46716m;
        Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        obj.getClass();
        return TextUtils.equals(str, ((f12.b) obj).getUserDisplayName());
    }

    public final void f7() {
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo;
        if (this.f46717n == null) {
            return;
        }
        boolean zD7 = d7();
        TextView textView = this.f46718o;
        if (zD7) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.f33121i.setVisibility(0);
            return;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f46718o;
        if (textView2 != null) {
            q qVar = this.f46717n;
            textView2.setText(getString(R.string.user_profile_private, (qVar == null || (userInfo = qVar.getUserInfo()) == null) ? null : userInfo.b()));
        }
        this.f33121i.setVisibility(8);
    }

    @Override // com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity.d
    public final void o2() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.USER;
        aVar.getClass();
        i2.a.b(a2Var, "ProfileActivitiesFragment", "onPageSelected");
        if (this.f46720q) {
            M7();
        } else {
            this.f33123k.f149679d = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f46716m = arguments.getString("GCM_userDisplayName");
        }
        if (TextUtils.isEmpty(this.f46716m)) {
            Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            obj.getClass();
            this.f46716m = ((f12.b) obj).getUserDisplayName();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.user_profile_activities);
    }

    @Override // com.garmin.android.apps.connectmobile.d0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f46718o = (TextView) view2.findViewById(R.id.profile_privacy);
        F6(false);
        ((i) this.f46721r.getValue()).f46763o.f(getViewLifecycleOwner(), this.f46722t);
        if (e7()) {
            M7();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_BADGE_COUNT", "I", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
