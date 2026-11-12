package com.garmin.android.apps.connectmobile.group.details;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager2.widget.ViewPager2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailFragment;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupDetailMemberListFragment;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity;
import com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteActivity;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import fw.p;
import java.util.List;
import lc.m0;
import lc.v;
import lc.y;
import mm0.r;
import o13.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.u;
import r53.p2;
import v62.fa;
import v62.z4;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/GroupDetailActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Llc/y$c;", "Lcom/garmin/android/apps/connectmobile/social/share/b$b;", "<init>", "()V", "b", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupDetailActivity extends com.garmin.android.apps.connectmobile.c implements y.c, com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f36137j = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComposeView f36142e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.c<Intent> f36144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.c<Intent> f36145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.c<Intent> f36146i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm0.b f36138a = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f36139b = new w1(s0.f105811a.b(mm0.e.class), new f(this), new e(this), new g(null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36143f = true;

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36152a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36152a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36153a;

        public d(l lVar) {
            lVar.getClass();
            this.f36153a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f36153a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36153a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36154a;

        public e(b.g gVar) {
            this.f36154a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36154a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36155a;

        public f(b.g gVar) {
            this.f36155a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36155a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f36157b;

        public g(e23.a aVar, b.g gVar) {
            this.f36156a = aVar;
            this.f36157b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36156a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36157b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public GroupDetailActivity() {
        final int i14 = 0;
        this.f36144g = registerForActivityResult(new g.h(), new f.b(this) { // from class: mm0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailActivity f119496b;

            {
                this.f119496b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                androidx.fragment.app.v childFragmentManager;
                List<Fragment> listF;
                Object value;
                androidx.fragment.app.v childFragmentManager2;
                List<Fragment> listF2;
                int i15 = i14;
                GroupDetailActivity groupDetailActivity = this.f119496b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        GroupDetailActivity.a aVar2 = GroupDetailActivity.f36137j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            groupDetailActivity.ca(String.valueOf(groupDetailActivity.fa().B4()));
                            groupDetailActivity.setResult(-1);
                            return;
                        }
                        return;
                    case 1:
                        GroupDetailActivity.a aVar3 = GroupDetailActivity.f36137j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            groupDetailActivity.ca(String.valueOf(groupDetailActivity.fa().B4()));
                            groupDetailActivity.setResult(-1);
                            groupDetailActivity.ea().f111904b.q(R.id.groupDetailsFragment, false);
                            Fragment fragmentF = groupDetailActivity.getSupportFragmentManager().F(R.id.nav_host_fragment);
                            NavHostFragment navHostFragment = fragmentF instanceof NavHostFragment ? (NavHostFragment) fragmentF : null;
                            Fragment fragment = (navHostFragment == null || (childFragmentManager = navHostFragment.getChildFragmentManager()) == null || (listF = childFragmentManager.f7372c.f()) == null) ? null : (Fragment) h0.d0(listF);
                            GroupDetailFragment groupDetailFragment = fragment instanceof GroupDetailFragment ? (GroupDetailFragment) fragment : null;
                            if (groupDetailFragment != null) {
                                com.garmin.android.apps.connectmobile.group.details.b bVar = groupDetailFragment.f36158a;
                                if (bVar == null) {
                                    p005kotlin.jvm.internal.s.m("adapter");
                                    throw null;
                                }
                                int iIndexOf = bVar.f36267k.indexOf(com.garmin.android.apps.connectmobile.group.details.b.a.f36274g);
                                if (iIndexOf >= 0) {
                                    com.garmin.android.apps.connectmobile.group.details.b bVar2 = groupDetailFragment.f36158a;
                                    if (bVar2 == null) {
                                        p005kotlin.jvm.internal.s.m("adapter");
                                        throw null;
                                    }
                                    if (iIndexOf < bVar2.f36267k.size()) {
                                        ViewPager2 viewPager2 = groupDetailFragment.f36159b;
                                        if (viewPager2 == null) {
                                            p005kotlin.jvm.internal.s.m("viewPager");
                                            throw null;
                                        }
                                        viewPager2.setCurrentItem(iIndexOf);
                                        com.garmin.android.apps.connectmobile.group.details.b bVar3 = groupDetailFragment.f36158a;
                                        if (bVar3 != null) {
                                            bVar3.notifyDataSetChanged();
                                            return;
                                        } else {
                                            p005kotlin.jvm.internal.s.m("adapter");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        GroupDetailActivity.a aVar4 = GroupDetailActivity.f36137j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent = aVar.f67586b;
                            Bundle extras = intent != null ? intent.getExtras() : null;
                            if (extras != null && extras.getBoolean("USER_NO_LONGER_IN_GROUP")) {
                                Intent intent2 = new Intent();
                                intent2.putExtra("Leave Group", true);
                                groupDetailActivity.setResult(-1, intent2);
                                groupDetailActivity.finish();
                            }
                            if (extras == null || !extras.getBoolean("MEMBER_UPDATED")) {
                                return;
                            }
                            groupDetailActivity.ca(String.valueOf(groupDetailActivity.fa().B4()));
                            lc.h0 h0VarJ = groupDetailActivity.ea().f111904b.j();
                            if (h0VarJ == null || h0VarJ.f111773b.f144346e != R.id.groupDetailMemberListFragment) {
                                return;
                            }
                            Fragment fragmentF2 = groupDetailActivity.getSupportFragmentManager().F(R.id.nav_host_fragment);
                            NavHostFragment navHostFragment2 = fragmentF2 instanceof NavHostFragment ? (NavHostFragment) fragmentF2 : null;
                            Fragment fragment2 = (navHostFragment2 == null || (childFragmentManager2 = navHostFragment2.getChildFragmentManager()) == null || (listF2 = childFragmentManager2.f7372c.f()) == null) ? null : (Fragment) h0.d0(listF2);
                            GroupDetailMemberListFragment groupDetailMemberListFragment = fragment2 instanceof GroupDetailMemberListFragment ? (GroupDetailMemberListFragment) fragment2 : null;
                            if (groupDetailMemberListFragment != null) {
                                nm0.f fVar = (nm0.f) groupDetailMemberListFragment.f36181b.getValue();
                                p2 p2Var = fVar.f126578c;
                                do {
                                    value = p2Var.getValue();
                                    ((Number) value).intValue();
                                } while (!p2Var.b(value, Integer.valueOf(((Number) p2Var.getValue()).intValue() + 1)));
                                fVar.f126579d = null;
                                fVar.f126580e = null;
                                fVar.f126581f.clear();
                                ge1.b.T(v1.a(fVar), null, null, new nm0.g(fVar, null), 3);
                                ((e) groupDetailMemberListFragment.f36180a.getValue()).f119511g = true;
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i15 = 1;
        this.f36145h = registerForActivityResult(new g.h(), new f.b(this) { // from class: mm0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailActivity f119496b;

            {
                this.f119496b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                androidx.fragment.app.v childFragmentManager;
                List<Fragment> listF;
                Object value;
                androidx.fragment.app.v childFragmentManager2;
                List<Fragment> listF2;
                int i16 = i15;
                GroupDetailActivity groupDetailActivity = this.f119496b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        GroupDetailActivity.a aVar2 = GroupDetailActivity.f36137j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            groupDetailActivity.ca(String.valueOf(groupDetailActivity.fa().B4()));
                            groupDetailActivity.setResult(-1);
                            return;
                        }
                        return;
                    case 1:
                        GroupDetailActivity.a aVar3 = GroupDetailActivity.f36137j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            groupDetailActivity.ca(String.valueOf(groupDetailActivity.fa().B4()));
                            groupDetailActivity.setResult(-1);
                            groupDetailActivity.ea().f111904b.q(R.id.groupDetailsFragment, false);
                            Fragment fragmentF = groupDetailActivity.getSupportFragmentManager().F(R.id.nav_host_fragment);
                            NavHostFragment navHostFragment = fragmentF instanceof NavHostFragment ? (NavHostFragment) fragmentF : null;
                            Fragment fragment = (navHostFragment == null || (childFragmentManager = navHostFragment.getChildFragmentManager()) == null || (listF = childFragmentManager.f7372c.f()) == null) ? null : (Fragment) h0.d0(listF);
                            GroupDetailFragment groupDetailFragment = fragment instanceof GroupDetailFragment ? (GroupDetailFragment) fragment : null;
                            if (groupDetailFragment != null) {
                                com.garmin.android.apps.connectmobile.group.details.b bVar = groupDetailFragment.f36158a;
                                if (bVar == null) {
                                    p005kotlin.jvm.internal.s.m("adapter");
                                    throw null;
                                }
                                int iIndexOf = bVar.f36267k.indexOf(com.garmin.android.apps.connectmobile.group.details.b.a.f36274g);
                                if (iIndexOf >= 0) {
                                    com.garmin.android.apps.connectmobile.group.details.b bVar2 = groupDetailFragment.f36158a;
                                    if (bVar2 == null) {
                                        p005kotlin.jvm.internal.s.m("adapter");
                                        throw null;
                                    }
                                    if (iIndexOf < bVar2.f36267k.size()) {
                                        ViewPager2 viewPager2 = groupDetailFragment.f36159b;
                                        if (viewPager2 == null) {
                                            p005kotlin.jvm.internal.s.m("viewPager");
                                            throw null;
                                        }
                                        viewPager2.setCurrentItem(iIndexOf);
                                        com.garmin.android.apps.connectmobile.group.details.b bVar3 = groupDetailFragment.f36158a;
                                        if (bVar3 != null) {
                                            bVar3.notifyDataSetChanged();
                                            return;
                                        } else {
                                            p005kotlin.jvm.internal.s.m("adapter");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        GroupDetailActivity.a aVar4 = GroupDetailActivity.f36137j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent = aVar.f67586b;
                            Bundle extras = intent != null ? intent.getExtras() : null;
                            if (extras != null && extras.getBoolean("USER_NO_LONGER_IN_GROUP")) {
                                Intent intent2 = new Intent();
                                intent2.putExtra("Leave Group", true);
                                groupDetailActivity.setResult(-1, intent2);
                                groupDetailActivity.finish();
                            }
                            if (extras == null || !extras.getBoolean("MEMBER_UPDATED")) {
                                return;
                            }
                            groupDetailActivity.ca(String.valueOf(groupDetailActivity.fa().B4()));
                            lc.h0 h0VarJ = groupDetailActivity.ea().f111904b.j();
                            if (h0VarJ == null || h0VarJ.f111773b.f144346e != R.id.groupDetailMemberListFragment) {
                                return;
                            }
                            Fragment fragmentF2 = groupDetailActivity.getSupportFragmentManager().F(R.id.nav_host_fragment);
                            NavHostFragment navHostFragment2 = fragmentF2 instanceof NavHostFragment ? (NavHostFragment) fragmentF2 : null;
                            Fragment fragment2 = (navHostFragment2 == null || (childFragmentManager2 = navHostFragment2.getChildFragmentManager()) == null || (listF2 = childFragmentManager2.f7372c.f()) == null) ? null : (Fragment) h0.d0(listF2);
                            GroupDetailMemberListFragment groupDetailMemberListFragment = fragment2 instanceof GroupDetailMemberListFragment ? (GroupDetailMemberListFragment) fragment2 : null;
                            if (groupDetailMemberListFragment != null) {
                                nm0.f fVar = (nm0.f) groupDetailMemberListFragment.f36181b.getValue();
                                p2 p2Var = fVar.f126578c;
                                do {
                                    value = p2Var.getValue();
                                    ((Number) value).intValue();
                                } while (!p2Var.b(value, Integer.valueOf(((Number) p2Var.getValue()).intValue() + 1)));
                                fVar.f126579d = null;
                                fVar.f126580e = null;
                                fVar.f126581f.clear();
                                ge1.b.T(v1.a(fVar), null, null, new nm0.g(fVar, null), 3);
                                ((e) groupDetailMemberListFragment.f36180a.getValue()).f119511g = true;
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i16 = 2;
        this.f36146i = registerForActivityResult(new g.h(), new f.b(this) { // from class: mm0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailActivity f119496b;

            {
                this.f119496b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                androidx.fragment.app.v childFragmentManager;
                List<Fragment> listF;
                Object value;
                androidx.fragment.app.v childFragmentManager2;
                List<Fragment> listF2;
                int i17 = i16;
                GroupDetailActivity groupDetailActivity = this.f119496b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        GroupDetailActivity.a aVar2 = GroupDetailActivity.f36137j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            groupDetailActivity.ca(String.valueOf(groupDetailActivity.fa().B4()));
                            groupDetailActivity.setResult(-1);
                            return;
                        }
                        return;
                    case 1:
                        GroupDetailActivity.a aVar3 = GroupDetailActivity.f36137j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            groupDetailActivity.ca(String.valueOf(groupDetailActivity.fa().B4()));
                            groupDetailActivity.setResult(-1);
                            groupDetailActivity.ea().f111904b.q(R.id.groupDetailsFragment, false);
                            Fragment fragmentF = groupDetailActivity.getSupportFragmentManager().F(R.id.nav_host_fragment);
                            NavHostFragment navHostFragment = fragmentF instanceof NavHostFragment ? (NavHostFragment) fragmentF : null;
                            Fragment fragment = (navHostFragment == null || (childFragmentManager = navHostFragment.getChildFragmentManager()) == null || (listF = childFragmentManager.f7372c.f()) == null) ? null : (Fragment) h0.d0(listF);
                            GroupDetailFragment groupDetailFragment = fragment instanceof GroupDetailFragment ? (GroupDetailFragment) fragment : null;
                            if (groupDetailFragment != null) {
                                com.garmin.android.apps.connectmobile.group.details.b bVar = groupDetailFragment.f36158a;
                                if (bVar == null) {
                                    p005kotlin.jvm.internal.s.m("adapter");
                                    throw null;
                                }
                                int iIndexOf = bVar.f36267k.indexOf(com.garmin.android.apps.connectmobile.group.details.b.a.f36274g);
                                if (iIndexOf >= 0) {
                                    com.garmin.android.apps.connectmobile.group.details.b bVar2 = groupDetailFragment.f36158a;
                                    if (bVar2 == null) {
                                        p005kotlin.jvm.internal.s.m("adapter");
                                        throw null;
                                    }
                                    if (iIndexOf < bVar2.f36267k.size()) {
                                        ViewPager2 viewPager2 = groupDetailFragment.f36159b;
                                        if (viewPager2 == null) {
                                            p005kotlin.jvm.internal.s.m("viewPager");
                                            throw null;
                                        }
                                        viewPager2.setCurrentItem(iIndexOf);
                                        com.garmin.android.apps.connectmobile.group.details.b bVar3 = groupDetailFragment.f36158a;
                                        if (bVar3 != null) {
                                            bVar3.notifyDataSetChanged();
                                            return;
                                        } else {
                                            p005kotlin.jvm.internal.s.m("adapter");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        GroupDetailActivity.a aVar4 = GroupDetailActivity.f36137j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent = aVar.f67586b;
                            Bundle extras = intent != null ? intent.getExtras() : null;
                            if (extras != null && extras.getBoolean("USER_NO_LONGER_IN_GROUP")) {
                                Intent intent2 = new Intent();
                                intent2.putExtra("Leave Group", true);
                                groupDetailActivity.setResult(-1, intent2);
                                groupDetailActivity.finish();
                            }
                            if (extras == null || !extras.getBoolean("MEMBER_UPDATED")) {
                                return;
                            }
                            groupDetailActivity.ca(String.valueOf(groupDetailActivity.fa().B4()));
                            lc.h0 h0VarJ = groupDetailActivity.ea().f111904b.j();
                            if (h0VarJ == null || h0VarJ.f111773b.f144346e != R.id.groupDetailMemberListFragment) {
                                return;
                            }
                            Fragment fragmentF2 = groupDetailActivity.getSupportFragmentManager().F(R.id.nav_host_fragment);
                            NavHostFragment navHostFragment2 = fragmentF2 instanceof NavHostFragment ? (NavHostFragment) fragmentF2 : null;
                            Fragment fragment2 = (navHostFragment2 == null || (childFragmentManager2 = navHostFragment2.getChildFragmentManager()) == null || (listF2 = childFragmentManager2.f7372c.f()) == null) ? null : (Fragment) h0.d0(listF2);
                            GroupDetailMemberListFragment groupDetailMemberListFragment = fragment2 instanceof GroupDetailMemberListFragment ? (GroupDetailMemberListFragment) fragment2 : null;
                            if (groupDetailMemberListFragment != null) {
                                nm0.f fVar = (nm0.f) groupDetailMemberListFragment.f36181b.getValue();
                                p2 p2Var = fVar.f126578c;
                                do {
                                    value = p2Var.getValue();
                                    ((Number) value).intValue();
                                } while (!p2Var.b(value, Integer.valueOf(((Number) p2Var.getValue()).intValue() + 1)));
                                fVar.f126579d = null;
                                fVar.f126580e = null;
                                fVar.f126581f.clear();
                                ge1.b.T(v1.a(fVar), null, null, new nm0.g(fVar, null), 3);
                                ((e) groupDetailMemberListFragment.f36180a.getValue()).f119511g = true;
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final void ca(String str) {
        fa().A4(str).f(this, new d(new mm0.b(this, 3)));
    }

    public final String da(lc.h0 h0Var, Bundle bundle) {
        com.garmin.android.apps.connectmobile.group.details.challenges.b bVar = null;
        Integer numValueOf = h0Var != null ? Integer.valueOf(h0Var.f111773b.f144346e) : null;
        if (numValueOf == null || numValueOf.intValue() != R.id.groupDetailChallengeListFragment) {
            if (numValueOf != null && numValueOf.intValue() == R.id.groupDetailMemberListFragment) {
                return String.valueOf(h0Var.f111775d);
            }
            GroupDetailsDTO groupDetailsDTO = fa().f119507c;
            if (groupDetailsDTO != null) {
                return groupDetailsDTO.f31559b;
            }
            return null;
        }
        Integer numValueOf2 = bundle != null ? Integer.valueOf(bundle.getInt("group_challenge_status_type")) : null;
        if (numValueOf2 != null) {
            com.garmin.android.apps.connectmobile.group.details.challenges.b.a aVar = com.garmin.android.apps.connectmobile.group.details.challenges.b.f36295b;
            int iIntValue = numValueOf2.intValue();
            aVar.getClass();
            bVar = (com.garmin.android.apps.connectmobile.group.details.challenges.b) u.L(iIntValue, com.garmin.android.apps.connectmobile.group.details.challenges.b.values());
        }
        if (bVar != null) {
            return bVar.a(this);
        }
        String string = getString(R.string.concept_challenges);
        string.getClass();
        return string;
    }

    public final m0 ea() {
        Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
        fragmentF.getClass();
        return ((NavHostFragment) fragmentF).u6();
    }

    public final mm0.e fa() {
        return (mm0.e) this.f36139b.getValue();
    }

    public final void ga(Menu menu, boolean z14) {
        GroupDetailsDTO groupDetailsDTO;
        if (menu == null || (groupDetailsDTO = fa().f119507c) == null) {
            return;
        }
        boolean zF = jm0.e.f(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), groupDetailsDTO);
        jm0.e eVar = jm0.e.f99565a;
        GroupDTO.c cVar = groupDetailsDTO.f31578w;
        eVar.getClass();
        boolean zD = jm0.e.d(cVar);
        GroupDTO.c cVar2 = groupDetailsDTO.f31578w;
        cVar2.getClass();
        boolean zE = jm0.e.e(cVar2);
        boolean z15 = zF && groupDetailsDTO.f31580y <= 1;
        menu.findItem(R.id.menu_item_share_group).setVisible(zE && z14);
        menu.findItem(R.id.menu_item_group_settings).setVisible((zF || zD) && z14);
        menu.findItem(R.id.menu_item_transfer_group).setVisible(zF && !z15 && z14);
        menu.findItem(R.id.menu_item_group_invite).setVisible((zF || zD) && z14);
        menu.findItem(R.id.menu_item_manage_members).setVisible((zF || zD) && !z15 && z14);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_group_delete);
        menuItemFindItem.setVisible(zF && z14);
        SpannableString spannableString = new SpannableString(menuItemFindItem.getTitle());
        spannableString.setSpan(new ForegroundColorSpan(getColor(R.color.gcm_text_danger_action)), 0, spannableString.length(), 0);
        menuItemFindItem.setTitle(spannableString);
        menu.findItem(R.id.menu_item_leave_group).setVisible(!zF && (zD || zE) && z14);
    }

    public final void ha(Menu menu, boolean z14) {
        Drawable icon;
        MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.menu_item_share_group) : null;
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(z14 && !this.f36143f);
        }
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
            return;
        }
        icon.setTint(a7.b.getColor(this, R.color.gcm_icon_primary));
        menuItemFindItem.setIcon(icon);
    }

    @Override // com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b
    public final void i8(ro1.e eVar, Intent intent) {
        eVar.getClass();
        intent.getClass();
        ActivityInfo activityInfo = eVar.f153929a;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        long jB4 = fa().B4();
        jm0.b bVar = this.f36138a;
        String strY = bVar.y(jB4);
        intent.putExtra("android.intent.extra.TEXT", "Check out my group on Garmin Connect. #beatyesterday ".concat(strY));
        intent.putExtra("EXTRA_WEB_LINK", strY);
        bVar.k(this, intent);
        String str = activityInfo.packageName;
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("target", str);
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "GroupLinkShared");
    }

    @Override // lc.y.c
    public final void m8(y yVar, lc.h0 h0Var, Bundle bundle) {
        lc.h0 h0Var2;
        h0Var.getClass();
        invalidateOptionsMenu();
        String strDa = da(h0Var, bundle);
        if (strDa != null) {
            updateActionBarTitle(strDa);
        }
        v vVarF = ea().f();
        if (vVarF == null || (h0Var2 = vVarF.f111882b) == null || h0Var2.f111773b.f144346e != R.id.groupDetailMemberListFragment) {
            return;
        }
        mm0.e eVarFa = fa();
        boolean z14 = eVarFa.f119511g;
        eVarFa.f119511g = false;
        if (z14) {
            ca(String.valueOf(fa().B4()));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("GCM_extra_connection_group_name")) == null) {
            string = "";
        }
        Bundle extras2 = getIntent().getExtras();
        String string2 = extras2 != null ? extras2.getString("GCM_extra_connection_group_id") : null;
        Bundle extras3 = getIntent().getExtras();
        this.f36141d = extras3 != null ? extras3.getBoolean("extra_group_need_check_announcement_exists") : false;
        setContentView(R.layout.activity_group_detail);
        initActionBar(true, string);
        setTitleMaxLines(1);
        View viewFindViewById = findViewById(R.id.error_view);
        viewFindViewById.getClass();
        this.f36142e = (ComposeView) viewFindViewById;
        dh.b.L(fa().f119516l, this, new d(new mm0.b(this, 2)));
        Bundle extras4 = getIntent().getExtras();
        Integer numValueOf = extras4 != null ? Integer.valueOf(extras4.getInt("extra_error_title")) : null;
        Bundle extras5 = getIntent().getExtras();
        Integer numValueOf2 = extras5 != null ? Integer.valueOf(extras5.getInt("extra_error_message")) : null;
        if (numValueOf != null && numValueOf.intValue() != 0 && numValueOf2 != null && numValueOf2.intValue() != 0) {
            new androidx.appcompat.app.e.a(this).setTitle(numValueOf.intValue()).setMessage(numValueOf2.intValue()).setPositiveButton(R.string.lbl_ok, new jm0.c(26)).show();
        }
        if (string2 != null) {
            ca(string2);
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        MenuItem menuItemFindItem2;
        MenuItem menuItemFindItem3;
        getMenuInflater().inflate(R.menu.group_details, menu);
        if (menu != null && (menuItemFindItem3 = menu.findItem(R.id.menu_item_manage_members)) != null) {
            menuItemFindItem3.setTitle(R.string.lbl_manage_members);
        }
        lc.h0 h0VarJ = ea().f111904b.j();
        Integer numValueOf = h0VarJ != null ? Integer.valueOf(h0VarJ.f111773b.f144346e) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.groupDetailsFragment) {
            ga(menu, true);
            ha(menu, true);
            return true;
        }
        boolean z14 = false;
        if (numValueOf == null || numValueOf.intValue() != R.id.groupDetailMemberListFragment) {
            ga(menu, false);
            ha(menu, false);
            return true;
        }
        ga(menu, false);
        ha(menu, false);
        GroupDetailsDTO groupDetailsDTO = fa().f119507c;
        if (groupDetailsDTO != null) {
            boolean zF = jm0.e.f(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), groupDetailsDTO);
            jm0.e eVar = jm0.e.f99565a;
            GroupDTO.c cVar = groupDetailsDTO.f31578w;
            eVar.getClass();
            boolean zD = jm0.e.d(cVar);
            boolean z15 = zF && groupDetailsDTO.f31580y <= 1;
            if (menu != null && (menuItemFindItem2 = menu.findItem(R.id.menu_item_transfer_group)) != null) {
                menuItemFindItem2.setVisible(zF && !z15);
            }
            if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_item_manage_members)) != null) {
                if ((zF || zD) && !z15) {
                    z14 = true;
                }
                menuItemFindItem.setVisible(z14);
            }
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        jm0.b bVar = this.f36138a;
        if (itemId == R.id.menu_item_share_group) {
            com.garmin.android.apps.connectmobile.social.share.b.a aVar = com.garmin.android.apps.connectmobile.social.share.b.f44643d;
            Intent intentJ = bVar.j(bVar.y(fa().B4()));
            aVar.getClass();
            com.garmin.android.apps.connectmobile.social.share.b bVarA = com.garmin.android.apps.connectmobile.social.share.b.a.a(intentJ, true);
            bVarA.show(getSupportFragmentManager(), bVarA.getTag());
        } else if (itemId == R.id.menu_item_group_settings) {
            this.f36144g.a(bVar.n(this, fa().f119507c), null);
        } else if (itemId == R.id.menu_item_transfer_group) {
            androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            final int i14 = 0;
            r.a(this, supportFragmentManager, "transfer_ownership_dialog_tag", R.string.lbl_transfer_ownership, R.string.msg_transfer_group, R.string.lbl_common_continue, new e23.a(this) { // from class: mm0.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GroupDetailActivity f119503b;

                {
                    this.f119503b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i15 = i14;
                    GroupDetailActivity groupDetailActivity = this.f119503b;
                    switch (i15) {
                        case 0:
                            groupDetailActivity.f36145h.a(groupDetailActivity.f36138a.l(groupDetailActivity, groupDetailActivity.fa().f119507c), null);
                            break;
                        case 1:
                            GroupDetailActivity.a aVar2 = GroupDetailActivity.f36137j;
                            e eVarFa = groupDetailActivity.fa();
                            int i16 = e.f119504m;
                            String strValueOf = String.valueOf(eVarFa.B4());
                            strValueOf.getClass();
                            dh.b.L(xy2.b.K(eVarFa, new i(eVarFa, strValueOf, null)), groupDetailActivity, new GroupDetailActivity.d(new b(groupDetailActivity, 1)));
                            break;
                        default:
                            GroupDetailActivity.a aVar3 = GroupDetailActivity.f36137j;
                            e eVarFa2 = groupDetailActivity.fa();
                            int i17 = e.f119504m;
                            String strValueOf2 = String.valueOf(eVarFa2.B4());
                            strValueOf2.getClass();
                            dh.b.L(androidx.lifecycle.m.a(null, new m(eVarFa2, strValueOf2, null), 3), groupDetailActivity, new GroupDetailActivity.d(new b(groupDetailActivity, 0)));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        } else if (itemId == R.id.menu_item_group_invite) {
            GroupInviteActivity.a aVar2 = GroupInviteActivity.f36358e;
            long jB4 = fa().B4();
            aVar2.getClass();
            Intent intent = new Intent(this, (Class<?>) GroupInviteActivity.class);
            intent.putExtra("GCM_extra_connection_group_id", jB4);
            startActivity(intent);
        } else if (itemId == R.id.menu_item_manage_members) {
            GroupManageMembersActivity.a aVar3 = GroupManageMembersActivity.f36194d;
            GroupDetailsDTO groupDetailsDTO = fa().f119507c;
            aVar3.getClass();
            Intent intent2 = new Intent(this, (Class<?>) GroupManageMembersActivity.class);
            intent2.putExtra("GCM_extra_connection_group", groupDetailsDTO);
            this.f36146i.a(intent2, null);
        } else if (itemId == R.id.menu_item_group_delete) {
            androidx.fragment.app.v supportFragmentManager2 = getSupportFragmentManager();
            supportFragmentManager2.getClass();
            final int i15 = 1;
            r.a(this, supportFragmentManager2, "delete_group_dialog_tag", R.string.lbl_delete_group, R.string.msg_delete_group_warning, R.string.lbl_yes_im_sure, new e23.a(this) { // from class: mm0.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GroupDetailActivity f119503b;

                {
                    this.f119503b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i16 = i15;
                    GroupDetailActivity groupDetailActivity = this.f119503b;
                    switch (i16) {
                        case 0:
                            groupDetailActivity.f36145h.a(groupDetailActivity.f36138a.l(groupDetailActivity, groupDetailActivity.fa().f119507c), null);
                            break;
                        case 1:
                            GroupDetailActivity.a aVar4 = GroupDetailActivity.f36137j;
                            e eVarFa = groupDetailActivity.fa();
                            int i17 = e.f119504m;
                            String strValueOf = String.valueOf(eVarFa.B4());
                            strValueOf.getClass();
                            dh.b.L(xy2.b.K(eVarFa, new i(eVarFa, strValueOf, null)), groupDetailActivity, new GroupDetailActivity.d(new b(groupDetailActivity, 1)));
                            break;
                        default:
                            GroupDetailActivity.a aVar5 = GroupDetailActivity.f36137j;
                            e eVarFa2 = groupDetailActivity.fa();
                            int i18 = e.f119504m;
                            String strValueOf2 = String.valueOf(eVarFa2.B4());
                            strValueOf2.getClass();
                            dh.b.L(androidx.lifecycle.m.a(null, new m(eVarFa2, strValueOf2, null), 3), groupDetailActivity, new GroupDetailActivity.d(new b(groupDetailActivity, 0)));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        } else if (itemId == R.id.menu_item_leave_group) {
            androidx.fragment.app.v supportFragmentManager3 = getSupportFragmentManager();
            supportFragmentManager3.getClass();
            final int i16 = 2;
            r.a(this, supportFragmentManager3, "leave_group_dialog_tag", R.string.lbl_leave_group_2, R.string.msg_leave_group_warning_2, R.string.lbl_leave, new e23.a(this) { // from class: mm0.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GroupDetailActivity f119503b;

                {
                    this.f119503b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i17 = i16;
                    GroupDetailActivity groupDetailActivity = this.f119503b;
                    switch (i17) {
                        case 0:
                            groupDetailActivity.f36145h.a(groupDetailActivity.f36138a.l(groupDetailActivity, groupDetailActivity.fa().f119507c), null);
                            break;
                        case 1:
                            GroupDetailActivity.a aVar4 = GroupDetailActivity.f36137j;
                            e eVarFa = groupDetailActivity.fa();
                            int i18 = e.f119504m;
                            String strValueOf = String.valueOf(eVarFa.B4());
                            strValueOf.getClass();
                            dh.b.L(xy2.b.K(eVarFa, new i(eVarFa, strValueOf, null)), groupDetailActivity, new GroupDetailActivity.d(new b(groupDetailActivity, 1)));
                            break;
                        default:
                            GroupDetailActivity.a aVar5 = GroupDetailActivity.f36137j;
                            e eVarFa2 = groupDetailActivity.fa();
                            int i19 = e.f119504m;
                            String strValueOf2 = String.valueOf(eVarFa2.B4());
                            strValueOf2.getClass();
                            dh.b.L(androidx.lifecycle.m.a(null, new m(eVarFa2, strValueOf2, null), 3), groupDetailActivity, new GroupDetailActivity.d(new b(groupDetailActivity, 0)));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        FirebaseAnalytics.getInstance(this).setCurrentScreen(this, "GroupDetail", null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/GroupDetailActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LEAVE_GROUP", "EXTRA_ERROR_TITLE", "EXTRA_ERROR_MESSAGE", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, String str, String str2, Boolean bool, Integer num, Integer num2, int i14) {
            if ((i14 & 8) != 0) {
                bool = Boolean.FALSE;
            }
            if ((i14 & 16) != 0) {
                num = null;
            }
            if ((i14 & 32) != 0) {
                num2 = null;
            }
            aVar.getClass();
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) GroupDetailActivity.class);
            intent.putExtra("GCM_extra_connection_group_id", str);
            intent.putExtra("GCM_extra_connection_group_name", str2);
            intent.putExtra("extra_group_need_check_announcement_exists", bool);
            intent.putExtra("extra_error_title", num);
            intent.putExtra("extra_error_message", num2);
            return intent;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\t\nB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/GroupDetailActivity$b;", "", "Lu4/d;", "imageVector", "", "titleRes", "messageRes", "<init>", "(Lu4/d;II)V", "a", "b", "Lcom/garmin/android/apps/connectmobile/group/details/GroupDetailActivity$b$a;", "Lcom/garmin/android/apps/connectmobile/group/details/GroupDetailActivity$b$b;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u4.d f36147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36149c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/GroupDetailActivity$b$a;", "Lcom/garmin/android/apps/connectmobile/group/details/GroupDetailActivity$b;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final a f36150d = new a();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private a() {
                super(fa.a(t62.b.f162798a), R.string.social_group_not_found_title, R.string.social_group_removed_message, null);
                s62.a.f157643a.getClass();
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2034836609;
            }

            public final String toString() {
                return "GroupDeleteError";
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/GroupDetailActivity$b$b;", "Lcom/garmin/android/apps/connectmobile/group/details/GroupDetailActivity$b;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0628b extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final C0628b f36151d = new C0628b();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private C0628b() {
                super(z4.a(t62.b.f162798a), R.string.social_private_group_access_title, R.string.social_access_private_group_message, null);
                s62.a.f157643a.getClass();
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0628b);
            }

            public final int hashCode() {
                return 2138487206;
            }

            public final String toString() {
                return "GroupVisibilityChanged";
            }
        }

        private b(u4.d dVar, int i14, int i15) {
            this.f36147a = dVar;
            this.f36148b = i14;
            this.f36149c = i15;
        }

        public /* synthetic */ b(u4.d dVar, int i14, int i15, j jVar) {
            this(dVar, i14, i15);
        }
    }
}
