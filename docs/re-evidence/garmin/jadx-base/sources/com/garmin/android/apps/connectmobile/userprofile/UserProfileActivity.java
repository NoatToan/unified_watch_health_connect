package com.garmin.android.apps.connectmobile.userprofile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k0;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import com.garmin.android.apps.connectmobile.userprofile.view.GCMAppBarLayout;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import e11.f0;
import e23.l;
import ew1.r1;
import fw.p;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m12.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p1.b0;
import p1.l1;
import p13.x;
import p3.c2;
import p3.p0;
import r22.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000f²\u0006\u0014\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\u0014\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity;", "Lcom/garmin/android/apps/connectmobile/k0;", "Lca1/d$c;", "Lca1/d$b;", "<init>", "()V", "c", "d", "b", "a", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/q;", "userProfile", "Lcom/garmin/android/apps/connectmobile/userprofile/i$d;", "followState", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UserProfileActivity extends k0 implements ca1.d.c, ca1.d.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f46494x = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f46495e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMAppBarLayout f46498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMSlidingTabLayout f46499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f46500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f46501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SwipeViewPager f46502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f46503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ComposeView f46504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ComposeView f46505o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Menu f46506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem f46507q;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q0 f46511w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f46496f = new q(0, null, 0, null, 0, 0, 0, null, null, null, false, null, null, null, null, null, 65535, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c2 f46508r = p0.n(Boolean.FALSE);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w1 f46509t = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.userprofile.i.class), new h(this), new g(this), new i(null, this));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r f46510v = (r) KoinJavaComponent.get$default(r.class, null, null, 6, null);

    public interface b {
        void D3(q qVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity$c;", "Lh32/b;", "Landroidx/viewpager/widget/ViewPager$j;", "Landroidx/fragment/app/v;", "fm", "<init>", "(Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity;Landroidx/fragment/app/v;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends h32.b implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l1<Fragment> f46512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46513b;

        public c(v vVar) {
            super(vVar);
            this.f46512a = new l1<>(0, 1, null);
        }

        public final void c() {
            l1<Fragment> l1Var = this.f46512a;
            int iF = l1Var.f();
            for (int i14 = 0; i14 < iF; i14++) {
                if (!(l1Var.f() == 0)) {
                    n0 n0Var = (Fragment) l1Var.c(l1Var.d(i14));
                    d dVar = n0Var instanceof d ? (d) n0Var : null;
                    if (dVar != null) {
                        dVar.M3();
                    }
                }
            }
            onPageSelected(this.f46513b);
        }

        @Override // androidx.fragment.app.a0, fe.a
        public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
            viewGroup.getClass();
            obj.getClass();
            super.destroyItem(viewGroup, i14, obj);
            l1<Fragment> l1Var = this.f46512a;
            int iA = q1.a.a(l1Var.f134767d, i14, l1Var.f134765b);
            if (iA >= 0) {
                Object[] objArr = l1Var.f134766c;
                Object obj2 = objArr[iA];
                Object obj3 = b0.f134676c;
                if (obj2 != obj3) {
                    objArr[iA] = obj3;
                    l1Var.f134764a = true;
                }
            }
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount */
        public final int getF149591t() {
            return 3;
        }

        @Override // androidx.fragment.app.a0
        public final Fragment getItem(int i14) {
            UserProfileActivity userProfileActivity = UserProfileActivity.this;
            if (i14 == 0) {
                com.garmin.android.apps.connectmobile.userprofile.f.a aVar = com.garmin.android.apps.connectmobile.userprofile.f.f46715v;
                String str = userProfileActivity.f46495e;
                if (str == null) {
                    s.m("displayName");
                    throw null;
                }
                aVar.getClass();
                com.garmin.android.apps.connectmobile.userprofile.f fVar = new com.garmin.android.apps.connectmobile.userprofile.f();
                Bundle bundle = new Bundle();
                bundle.putString("GCM_userDisplayName", str);
                fVar.setArguments(bundle);
                return fVar;
            }
            if (i14 != 1) {
                com.garmin.android.apps.connectmobile.userprofile.d.a aVar2 = com.garmin.android.apps.connectmobile.userprofile.d.f46550p;
                String str2 = userProfileActivity.f46495e;
                if (str2 == null) {
                    s.m("displayName");
                    throw null;
                }
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.userprofile.d dVar = new com.garmin.android.apps.connectmobile.userprofile.d();
                Bundle bundle2 = new Bundle();
                bundle2.putString("GCM_userDisplayName", str2);
                dVar.setArguments(bundle2);
                return dVar;
            }
            com.garmin.android.apps.connectmobile.userprofile.g.a aVar3 = com.garmin.android.apps.connectmobile.userprofile.g.f46732p;
            String str3 = userProfileActivity.f46495e;
            if (str3 == null) {
                s.m("displayName");
                throw null;
            }
            aVar3.getClass();
            com.garmin.android.apps.connectmobile.userprofile.g gVar = new com.garmin.android.apps.connectmobile.userprofile.g();
            Bundle bundle3 = new Bundle();
            bundle3.putString("GCM_userDisplayName", str3);
            gVar.setArguments(bundle3);
            return gVar;
        }

        @Override // fe.a
        public final CharSequence getPageTitle(int i14) {
            UserProfileActivity userProfileActivity = UserProfileActivity.this;
            if (i14 == 0) {
                String string = userProfileActivity.getString(R.string.device_screen_activity);
                string.getClass();
                return string;
            }
            if (i14 != 1) {
                String string2 = userProfileActivity.getString(R.string.lbl_about);
                string2.getClass();
                return string2;
            }
            String string3 = userProfileActivity.getString(R.string.app_tour_stats_title);
            string3.getClass();
            return string3;
        }

        @Override // androidx.fragment.app.a0, fe.a
        public final Object instantiateItem(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            Object objInstantiateItem = super.instantiateItem(viewGroup, i14);
            objInstantiateItem.getClass();
            Fragment fragment = (Fragment) objInstantiateItem;
            this.f46512a.e(i14, fragment);
            return fragment;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            q qVar;
            this.f46513b = i14;
            l1<Fragment> l1Var = this.f46512a;
            if (l1Var.f() == 0) {
                return;
            }
            n0 n0Var = (Fragment) l1Var.c(l1Var.d(i14));
            a aVar = UserProfileActivity.f46494x;
            UserProfileActivity userProfileActivity = UserProfileActivity.this;
            if (userProfileActivity.ia() && (qVar = userProfileActivity.f46496f) != null) {
                b bVar = n0Var instanceof b ? (b) n0Var : null;
                if (bVar != null) {
                    bVar.D3(qVar);
                }
            }
            userProfileActivity.ga().B.m(Boolean.valueOf(i14 == 1));
            d dVar = n0Var instanceof d ? (d) n0Var : null;
            if (dVar != null) {
                dVar.o2();
            }
        }
    }

    public interface d {
        void M3();

        void o2();
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46516b;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.userprofile.i.c.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.i.c.EDIT_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.i.c.SHARE_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.i.c.CHALLENGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.i.c.NAVIGATE_FOLLOWER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.i.c.NAVIGATE_FOLLOWING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.i.c.FOLLOWER_REQUEST_ACCEPT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.i.c.FOLLOWER_REQUEST_REJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.i.c.FOLLOWER_REQUEST_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.i.c.REFRESH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.i.c.REFRESH_HEADER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f46515a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f46516b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46517a;

        public f(l lVar) {
            lVar.getClass();
            this.f46517a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46517a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46517a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f46518a;

        public g(b.g gVar) {
            this.f46518a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46518a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f46519a;

        public h(b.g gVar) {
            this.f46519a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46519a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f46521b;

        public i(e23.a aVar, b.g gVar) {
            this.f46520a = aVar;
            this.f46521b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46520a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46521b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // ca1.d.b
    public final androidx.lifecycle.s0<v2<da1.b>> A7(ea1.a aVar, String str) {
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo;
        aVar.getClass();
        q qVar = this.f46496f;
        String strF = (qVar == null || (userInfo = qVar.getUserInfo()) == null) ? null : userInfo.f();
        if (strF == null || strF.length() == 0) {
            return null;
        }
        com.garmin.android.apps.connectmobile.userprofile.i iVarGa = ga();
        String str2 = this.f46495e;
        if (str2 == null) {
            s.m("displayName");
            throw null;
        }
        androidx.lifecycle.j jVarA = m.a(v1.a(iVarGa).f183565a, new g12.s(iVarGa, str2, aVar, str, null), 2);
        dh.b.I(jVarA, this, new g12.h(this, 1));
        return jVarA;
    }

    @Override // ca1.d.c
    public final ca1.d.b M2() {
        return this;
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final void applyTopInsets(View view2) {
        if (view2 == null) {
            return;
        }
        fb1.c cVar = new fb1.c(15);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(view2, cVar);
        view2.requestApplyInsets();
    }

    @Override // com.garmin.android.apps.connectmobile.k0
    public final void da() {
        fa(true);
        c cVar = this.f46503m;
        if (cVar != null) {
            cVar.c();
        }
        ca();
    }

    public final void fa(boolean z14) {
        com.garmin.android.apps.connectmobile.userprofile.i iVarGa = ga();
        String str = this.f46495e;
        if (str == null) {
            s.m("displayName");
            throw null;
        }
        int i14 = com.garmin.android.apps.connectmobile.userprofile.i.I;
        w13.c cVar = k.f46891k;
        cVar.getClass();
        m.a(null, new j(iVarGa, str, cVar, null), 3).f(this, new f(new as2.d(z14, this, 8)));
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f46497g) {
            setResult(-1);
        } else {
            setResult(0);
        }
        super.finish();
    }

    public final com.garmin.android.apps.connectmobile.userprofile.i ga() {
        return (com.garmin.android.apps.connectmobile.userprofile.i) this.f46509t.getValue();
    }

    public final boolean ha() {
        String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        String str = this.f46495e;
        if (str != null) {
            return s.g(userDisplayName, str);
        }
        s.m("displayName");
        throw null;
    }

    public final boolean ia() {
        q qVar = this.f46496f;
        boolean z14 = false;
        if (qVar != null && qVar.getUserId() == 0) {
            z14 = true;
        }
        return !z14;
    }

    public final void ja(boolean z14) {
        String fullName;
        hi0.a userFollowProfile;
        q0 q0Var = this.f46511w;
        if (!z14) {
            if (q0Var != null) {
                q0Var.dismiss();
            }
            q0.b bVar = q0.f149800b;
            View viewFindViewById = findViewById(R.id.user_profile_main_layout);
            viewFindViewById.getClass();
            bVar.getClass();
            q0 q0VarA = q0.b.a(viewFindViewById, R.string.msg_profile_request_cancelled_description, 0);
            q0VarA.b(R.string.common_undo, new cw2.b(17, q0VarA, this));
            this.f46511w = q0VarA;
            q0VarA.show();
            return;
        }
        if (q0Var != null) {
            q0Var.dismiss();
        }
        q0.b bVar2 = q0.f149800b;
        View viewFindViewById2 = findViewById(R.id.user_profile_main_layout);
        viewFindViewById2.getClass();
        q qVar = this.f46496f;
        if (qVar == null || (userFollowProfile = qVar.getUserFollowProfile()) == null || (fullName = userFollowProfile.getFullName()) == null) {
            fullName = "";
        }
        String string = getString(R.string.msg_profile_request_accepted_description, fullName);
        string.getClass();
        q0 q0VarC = q0.b.c(bVar2, viewFindViewById2, string, null, 12);
        this.f46511w = q0VarC;
        q0VarC.show();
    }

    public final void ka() {
        if (this.f46506p == null) {
            return;
        }
        if (ha()) {
            MenuItem menuItem = this.f46507q;
            if (menuItem != null) {
                menuItem.setVisible(false);
                return;
            }
            return;
        }
        boolean zIa = ia();
        MenuItem menuItem2 = this.f46507q;
        if (zIa) {
            if (menuItem2 != null) {
                menuItem2.setVisible(true);
            }
        } else if (menuItem2 != null) {
            menuItem2.setVisible(false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        ActivityListItemDTO activityListItemDTO;
        com.garmin.android.apps.connectmobile.userprofile.f fVar;
        com.garmin.android.apps.connectmobile.userprofile.e eVar;
        ArrayList<ActivityListItemDTO> arrayList;
        l1<Fragment> l1Var;
        com.garmin.android.apps.connectmobile.userprofile.e eVar2;
        ArrayList<ActivityListItemDTO> arrayList2;
        l1<Fragment> l1Var2;
        Parcelable parcelable;
        com.garmin.android.apps.connectmobile.userprofile.e eVar3;
        com.garmin.android.apps.connectmobile.userprofile.e.a aVar;
        ArrayList<ActivityListItemDTO> arrayList3;
        l1<Fragment> l1Var3;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 1001 && i15 == -1) {
            this.f46497g = true;
            da();
            return;
        }
        int i16 = 0;
        if (i14 == 1002 && i15 == -1 && intent != null) {
            long longExtra = intent.getLongExtra("GCM_conversation_resource_id", -1L);
            int intExtra = intent.getIntExtra("GCM_conversation_comments_edited_count", 0);
            if (longExtra == 0 || intExtra == 0) {
                return;
            }
            c cVar = this.f46503m;
            Fragment fragmentC = (cVar == null || (l1Var3 = cVar.f46512a) == null) ? null : l1Var3.c(0);
            com.garmin.android.apps.connectmobile.userprofile.f fVar2 = fragmentC instanceof com.garmin.android.apps.connectmobile.userprofile.f ? (com.garmin.android.apps.connectmobile.userprofile.f) fragmentC : null;
            if (fVar2 == null || (eVar3 = fVar2.f46719p) == null || (aVar = eVar3.f46567c) == null || (arrayList3 = aVar.f46573d) == null) {
                return;
            }
            for (ActivityListItemDTO activityListItemDTO2 : arrayList3) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    x.q();
                    throw null;
                }
                ActivityListItemDTO activityListItemDTO3 = activityListItemDTO2;
                if (longExtra == activityListItemDTO3.f29250b) {
                    activityListItemDTO3.T0 += intExtra;
                    eVar3.r(eVar3.f46569e, i16);
                }
                i16 = i17;
            }
            return;
        }
        if (i14 == 1003 && i15 == -1 && intent != null) {
            l2.f37135b.getClass();
            Bundle bundleA = l2.a.a(intent);
            if (bundleA != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_activity_metadata", ActivityListItemDTO.class);
                } else {
                    Parcelable parcelable2 = bundleA.getParcelable("GCM_extra_activity_metadata");
                    if (!(parcelable2 instanceof ActivityListItemDTO)) {
                        parcelable2 = null;
                    }
                    parcelable = (ActivityListItemDTO) parcelable2;
                }
                activityListItemDTO = (ActivityListItemDTO) parcelable;
            } else {
                activityListItemDTO = null;
            }
            boolean z14 = bundleA != null ? bundleA.getBoolean("GCM_extra_activity_deleted") : false;
            Long lValueOf = bundleA != null ? Long.valueOf(bundleA.getLong("GCM_extra_activity_id")) : null;
            if (lValueOf != null && z14) {
                long jLongValue = lValueOf.longValue();
                c cVar2 = this.f46503m;
                Fragment fragmentC2 = (cVar2 == null || (l1Var2 = cVar2.f46512a) == null) ? null : l1Var2.c(0);
                fVar = fragmentC2 instanceof com.garmin.android.apps.connectmobile.userprofile.f ? (com.garmin.android.apps.connectmobile.userprofile.f) fragmentC2 : null;
                if (fVar == null || (eVar2 = fVar.f46719p) == null) {
                    return;
                }
                com.garmin.android.apps.connectmobile.userprofile.e.a aVar2 = eVar2.f46567c;
                if (aVar2 == null || (arrayList2 = aVar2.f46573d) == null) {
                    arrayList2 = new ArrayList<>();
                }
                int size = arrayList2.size();
                while (i16 < size) {
                    if (jLongValue == arrayList2.get(i16).f29250b) {
                        arrayList2.remove(i16);
                        eVar2.x(eVar2.f46569e, i16);
                        return;
                    }
                    i16++;
                }
                return;
            }
            if (activityListItemDTO == null || activityListItemDTO.f29250b == 0) {
                return;
            }
            c cVar3 = this.f46503m;
            Fragment fragmentC3 = (cVar3 == null || (l1Var = cVar3.f46512a) == null) ? null : l1Var.c(0);
            fVar = fragmentC3 instanceof com.garmin.android.apps.connectmobile.userprofile.f ? (com.garmin.android.apps.connectmobile.userprofile.f) fragmentC3 : null;
            if (fVar == null || (eVar = fVar.f46719p) == null) {
                return;
            }
            long j8 = activityListItemDTO.f29250b;
            com.garmin.android.apps.connectmobile.userprofile.e.a aVar3 = eVar.f46567c;
            if (aVar3 == null || (arrayList = aVar3.f46573d) == null) {
                arrayList = new ArrayList<>();
            }
            int size2 = arrayList.size();
            while (i16 < size2) {
                ActivityListItemDTO activityListItemDTO4 = arrayList.get(i16);
                if (j8 == activityListItemDTO4.f29250b) {
                    if (activityListItemDTO.equals(activityListItemDTO4)) {
                        return;
                    }
                    arrayList.set(i16, activityListItemDTO);
                    eVar.r(eVar.f46569e, i16);
                    return;
                }
                i16++;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f46497g) {
            setResult(-1);
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo2;
        super.onCreate(bundle);
        setContentView(R.layout.user_profile_main_layout);
        initActionBar(true, R.string.lbl_profile);
        Bundle extras = getIntent().getExtras();
        Bundle extras2 = getIntent().getExtras();
        if (extras2 == null || (string = extras2.getString("GCM_userDisplayName")) == null) {
            string = "";
        }
        this.f46495e = string;
        if (string.length() == 0) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.USER;
            aVar.getClass();
            i2.a.f(a2Var, "UserProfileActivity", "Illegal state: display name is empty.");
            displayFailedMessage();
            finish();
            return;
        }
        q qVar = this.f46496f;
        if (qVar != null && (userInfo2 = qVar.getUserInfo()) != null) {
            String str = this.f46495e;
            if (str == null) {
                s.m("displayName");
                throw null;
            }
            userInfo2.m(str);
        }
        q qVar2 = this.f46496f;
        if (qVar2 != null && (userInfo = qVar2.getUserInfo()) != null) {
            userInfo.o(extras != null ? extras.getString("GCM_extra_user_full_name") : null);
        }
        View viewFindViewById = findViewById(R.id.user_profile_appbar_layout);
        viewFindViewById.getClass();
        GCMAppBarLayout gCMAppBarLayout = (GCMAppBarLayout) viewFindViewById;
        this.f46498h = gCMAppBarLayout;
        gCMAppBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new g12.g(this, 0));
        View viewFindViewById2 = findViewById(R.id.user_profile_view_pager);
        viewFindViewById2.getClass();
        SwipeViewPager swipeViewPager = (SwipeViewPager) viewFindViewById2;
        this.f46502l = swipeViewPager;
        swipeViewPager.setOffscreenPageLimit(2);
        SwipeViewPager swipeViewPager2 = this.f46502l;
        if (swipeViewPager2 == null) {
            s.m("tabsViewPager");
            throw null;
        }
        swipeViewPager2.setForceHorizontalScroll(true);
        c cVar = new c(getSupportFragmentManager());
        this.f46503m = cVar;
        SwipeViewPager swipeViewPager3 = this.f46502l;
        if (swipeViewPager3 == null) {
            s.m("tabsViewPager");
            throw null;
        }
        swipeViewPager3.setAdapter(cVar);
        SwipeViewPager swipeViewPager4 = this.f46502l;
        if (swipeViewPager4 == null) {
            s.m("tabsViewPager");
            throw null;
        }
        swipeViewPager4.c(cVar);
        View viewFindViewById3 = findViewById(R.id.user_profile_sliding_tabs);
        viewFindViewById3.getClass();
        GCMSlidingTabLayout gCMSlidingTabLayout = (GCMSlidingTabLayout) viewFindViewById3;
        this.f46499i = gCMSlidingTabLayout;
        gCMSlidingTabLayout.f47853b = R.layout.user_profile_tab;
        gCMSlidingTabLayout.f47854c = R.id.tab_title;
        gCMSlidingTabLayout.f47842h = R.id.tab_icon;
        gCMSlidingTabLayout.setAllocateEqualTabSpace(true);
        GCMSlidingTabLayout gCMSlidingTabLayout2 = this.f46499i;
        if (gCMSlidingTabLayout2 == null) {
            s.m("slidingTabLayout");
            throw null;
        }
        gCMSlidingTabLayout2.setBottomBorderColor(a7.b.getColor(this, R.color.gcm_list_item_background));
        GCMSlidingTabLayout gCMSlidingTabLayout3 = this.f46499i;
        if (gCMSlidingTabLayout3 == null) {
            s.m("slidingTabLayout");
            throw null;
        }
        SwipeViewPager swipeViewPager5 = this.f46502l;
        if (swipeViewPager5 == null) {
            s.m("tabsViewPager");
            throw null;
        }
        gCMSlidingTabLayout3.setViewPager(swipeViewPager5);
        View viewFindViewById4 = findViewById(R.id.user_profile_header_divider);
        viewFindViewById4.getClass();
        this.f46500j = viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.user_profile_sliding_tab_view_pager_divider);
        viewFindViewById5.getClass();
        this.f46501k = viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.user_profile_header_container);
        viewFindViewById6.getClass();
        this.f46504n = (ComposeView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.user_profile_blocked_container);
        viewFindViewById7.getClass();
        this.f46505o = (ComposeView) viewFindViewById7;
        ComposeView composeView = this.f46504n;
        if (composeView == null) {
            s.m("userProfileHeaderContainer");
            throw null;
        }
        final int i14 = 0;
        composeView.setContent(new z3.e(-1525549852, true, new e23.p(this) { // from class: g12.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f74895b;

            {
                this.f74895b = this;
            }

            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                int i15 = i14;
                UserProfileActivity userProfileActivity = this.f74895b;
                int i16 = 1;
                switch (i15) {
                    case 0:
                        p3.m mVar = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        UserProfileActivity.a aVar2 = UserProfileActivity.f46494x;
                        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var = p3.n.f135158a;
                            z02.b.a(false, null, null, null, false, z3.f.c(-852445714, new f0(userProfileActivity, 23, o53.f0.G(userProfileActivity.ga().f46767t, mVar), o53.f0.G(userProfileActivity.ga().f46757i, mVar)), mVar), mVar, 196608, 31);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        UserProfileActivity.a aVar3 = UserProfileActivity.f46494x;
                        if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            p3.x1 x1Var2 = p3.n.f135158a;
                            z02.b.a(false, null, null, null, false, z3.f.c(-1958940187, new r1(userProfileActivity, o53.f0.G(userProfileActivity.ga().f46767t, mVar2)), mVar2), mVar2, 196608, 31);
                        } else {
                            mVar2.e();
                        }
                        break;
                    default:
                        p3.m mVar3 = (p3.m) obj;
                        int iIntValue3 = ((Integer) obj2).intValue();
                        UserProfileActivity.a aVar4 = UserProfileActivity.f46494x;
                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            z02.b.a(false, null, null, null, false, z3.f.c(1862001126, new dv0.l(o53.f0.G(userProfileActivity.ga().f46757i, mVar3), i16), mVar3), mVar3, 196608, 31);
                        } else {
                            mVar3.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        ((ComposeView) findViewById(R.id.overflow_menu_container)).setContent(new z3.e(-271955109, true, new e23.p(this) { // from class: g12.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f74895b;

            {
                this.f74895b = this;
            }

            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                int i16 = i15;
                UserProfileActivity userProfileActivity = this.f74895b;
                int i17 = 1;
                switch (i16) {
                    case 0:
                        p3.m mVar = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        UserProfileActivity.a aVar2 = UserProfileActivity.f46494x;
                        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var = p3.n.f135158a;
                            z02.b.a(false, null, null, null, false, z3.f.c(-852445714, new f0(userProfileActivity, 23, o53.f0.G(userProfileActivity.ga().f46767t, mVar), o53.f0.G(userProfileActivity.ga().f46757i, mVar)), mVar), mVar, 196608, 31);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        UserProfileActivity.a aVar3 = UserProfileActivity.f46494x;
                        if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            p3.x1 x1Var2 = p3.n.f135158a;
                            z02.b.a(false, null, null, null, false, z3.f.c(-1958940187, new r1(userProfileActivity, o53.f0.G(userProfileActivity.ga().f46767t, mVar2)), mVar2), mVar2, 196608, 31);
                        } else {
                            mVar2.e();
                        }
                        break;
                    default:
                        p3.m mVar3 = (p3.m) obj;
                        int iIntValue3 = ((Integer) obj2).intValue();
                        UserProfileActivity.a aVar4 = UserProfileActivity.f46494x;
                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            z02.b.a(false, null, null, null, false, z3.f.c(1862001126, new dv0.l(o53.f0.G(userProfileActivity.ga().f46757i, mVar3), i17), mVar3), mVar3, 196608, 31);
                        } else {
                            mVar3.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        ComposeView composeView2 = this.f46505o;
        if (composeView2 == null) {
            s.m("userProfileBlockedContainer");
            throw null;
        }
        final int i16 = 2;
        composeView2.setContent(new z3.e(-745981092, true, new e23.p(this) { // from class: g12.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f74895b;

            {
                this.f74895b = this;
            }

            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                int i17 = i16;
                UserProfileActivity userProfileActivity = this.f74895b;
                int i18 = 1;
                switch (i17) {
                    case 0:
                        p3.m mVar = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        UserProfileActivity.a aVar2 = UserProfileActivity.f46494x;
                        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var = p3.n.f135158a;
                            z02.b.a(false, null, null, null, false, z3.f.c(-852445714, new f0(userProfileActivity, 23, o53.f0.G(userProfileActivity.ga().f46767t, mVar), o53.f0.G(userProfileActivity.ga().f46757i, mVar)), mVar), mVar, 196608, 31);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        UserProfileActivity.a aVar3 = UserProfileActivity.f46494x;
                        if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            p3.x1 x1Var2 = p3.n.f135158a;
                            z02.b.a(false, null, null, null, false, z3.f.c(-1958940187, new r1(userProfileActivity, o53.f0.G(userProfileActivity.ga().f46767t, mVar2)), mVar2), mVar2, 196608, 31);
                        } else {
                            mVar2.e();
                        }
                        break;
                    default:
                        p3.m mVar3 = (p3.m) obj;
                        int iIntValue3 = ((Integer) obj2).intValue();
                        UserProfileActivity.a aVar4 = UserProfileActivity.f46494x;
                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            z02.b.a(false, null, null, null, false, z3.f.c(1862001126, new dv0.l(o53.f0.G(userProfileActivity.ga().f46757i, mVar3), i18), mVar3), mVar3, 196608, 31);
                        } else {
                            mVar3.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        fa(true);
    }

    @Override // android.app.Activity
    @SuppressLint({"InflateParams"})
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        this.f46506p = menu;
        getMenuInflater().inflate(R.menu.user_follow_profile, menu);
        this.f46507q = menu.findItem(R.id.menu_item_overflow);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final void onNetworkConnected() {
        if (!ia()) {
            fa(true);
        }
        c cVar = this.f46503m;
        Integer numValueOf = cVar != null ? Integer.valueOf(cVar.f46513b) : null;
        if (cVar == null || numValueOf == null) {
            return;
        }
        cVar.onPageSelected(numValueOf.intValue());
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_overflow) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f46508r.setValue(Boolean.TRUE);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        ka();
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (s.g(ga().A.d(), Boolean.TRUE)) {
            ga().f46772z.m(Boolean.FALSE);
        }
        if (ia()) {
            return;
        }
        fa(true);
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Override // ca1.d.b
    public final void w1() {
        this.f46497g = true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "CONNECTION_LIMIT", "I", "TABS_COUNT", "TAB_POSITION_ACTIVITY", "TAB_POSITION_STATS", "REQUEST_CODE_EDIT_PROFILE", "REQUEST_CODE_ADD_COMMENT", "REQUEST_CODE_EDIT_ACTIVITY", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context) {
            context.getClass();
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            return b(context, bVar.getUserDisplayName(), bVar.getUserFullName(), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).q4());
        }

        public static Intent b(Context context, String str, String str2, String str3) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) UserProfileActivity.class);
            intent.putExtra("GCM_userDisplayName", str);
            intent.putExtra("GCM_extra_user_full_name", str2);
            intent.putExtra("GCM_extra_user_image_url", str3);
            return intent;
        }

        public static void c(Context context, String str, String str2, String str3) {
            context.getClass();
            str.getClass();
            context.startActivity(b(context, str, str2, str3));
        }

        private a() {
        }
    }
}
