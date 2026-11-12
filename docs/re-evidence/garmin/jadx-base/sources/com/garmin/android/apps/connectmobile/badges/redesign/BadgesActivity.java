package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.redesign.filter.BadgesFilterActivity;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import com.garmin.android.apps.connectmobile.view.HexagonLevelView;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSlidingTabLayout;
import f12.t;
import f12.u;
import fw.p;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p1.b0;
import p1.l1;
import uu.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/BadgesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lvu/e;", "<init>", "()V", "a", "b", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BadgesActivity extends com.garmin.android.apps.connectmobile.c implements vu.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f30332j = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwipeViewPager f30333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f30334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UserLevelImageView f30335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HexagonLevelView f30336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f30337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f30338f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f30340h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.l<uu.q> f30339g = KoinJavaComponent.inject$default(uu.q.class, null, null, 6, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public vu.b f30341i = new vu.b();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/BadgesActivity$a;", "Lh32/b;", "Landroidx/viewpager/widget/ViewPager$j;", "Landroidx/fragment/app/v;", "fm", "<init>", "(Lcom/garmin/android/apps/connectmobile/badges/redesign/BadgesActivity;Landroidx/fragment/app/v;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends h32.b implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l1<Fragment> f30342a;

        public a(v vVar) {
            super(vVar);
            this.f30342a = new l1<>(0, 1, null);
        }

        @Override // androidx.fragment.app.a0, fe.a
        public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
            viewGroup.getClass();
            obj.getClass();
            super.destroyItem(viewGroup, i14, obj);
            l1<Fragment> l1Var = this.f30342a;
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
        public final int getF44052d() {
            return 3;
        }

        @Override // androidx.fragment.app.a0
        public final Fragment getItem(int i14) {
            if (i14 == 0) {
                j.f30502r.getClass();
                return new j();
            }
            if (i14 == 1) {
                com.garmin.android.apps.connectmobile.badges.redesign.a.f30373x.getClass();
                return new com.garmin.android.apps.connectmobile.badges.redesign.a();
            }
            if (i14 != 2) {
                com.garmin.android.apps.connectmobile.badges.redesign.c.f30427b.getClass();
                return new com.garmin.android.apps.connectmobile.badges.redesign.c();
            }
            com.garmin.android.apps.connectmobile.badges.redesign.c.f30427b.getClass();
            return new com.garmin.android.apps.connectmobile.badges.redesign.c();
        }

        @Override // fe.a
        public final CharSequence getPageTitle(int i14) {
            BadgesActivity badgesActivity = BadgesActivity.this;
            if (i14 == 0) {
                return badgesActivity.getString(R.string.social_earned);
            }
            if (i14 == 1) {
                return badgesActivity.getString(R.string.social_available);
            }
            if (i14 != 2) {
                return null;
            }
            return badgesActivity.getString(R.string.social_leaders);
        }

        @Override // androidx.fragment.app.a0, fe.a
        public final Object instantiateItem(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            Object objInstantiateItem = super.instantiateItem(viewGroup, i14);
            objInstantiateItem.getClass();
            Fragment fragment = (Fragment) objInstantiateItem;
            this.f30342a.e(i14, fragment);
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
            l1<Fragment> l1Var = this.f30342a;
            if (l1Var.f() == 0) {
                return;
            }
            Fragment fragmentC = l1Var.c(l1Var.d(i14));
            if (fragmentC instanceof m0) {
                ((m0) fragmentC).M7();
            }
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30344a;

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
            f30344a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f30345a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f30345a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f30345a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30345a.invoke(obj);
        }
    }

    @Override // vu.e
    public final void N1() {
        BadgesFilterActivity.a aVar = BadgesFilterActivity.f30466d;
        vu.b bVar = this.f30341i;
        aVar.getClass();
        bVar.getClass();
        Intent intent = new Intent(this, (Class<?>) BadgesFilterActivity.class);
        intent.putExtra("GCM_badges_filter_data", bVar);
        startActivityForResult(intent, 0);
    }

    @Override // vu.e
    /* JADX INFO: renamed from: O, reason: from getter */
    public final vu.b getF30341i() {
        return this.f30341i;
    }

    public final void ca() {
        o13.l<uu.q> lVar = this.f30339g;
        c2 c2Var = lVar.getValue().f172745j;
        if (c2Var == null || !c2Var.isActive()) {
            String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
            uu.q value = lVar.getValue();
            value.getClass();
            userDisplayName.getClass();
            y0 y0Var = new y0();
            value.f172745j = ge1.b.T(v1.a(value), null, null, new z(y0Var, value, userDisplayName, null), 3);
            y0Var.f(this, new d(new uo1.a(this, 1)));
        }
    }

    public final void da() {
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo;
        int color;
        q qVar = this.f30340h;
        if (qVar == null || (userInfo = qVar.getUserInfo()) == null) {
            return;
        }
        View viewFindViewById = findViewById(R.id.user_profile_header_image);
        viewFindViewById.getClass();
        this.f30335c = (UserLevelImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.next_user_level);
        viewFindViewById2.getClass();
        this.f30336d = (HexagonLevelView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.user_level_progress);
        viewFindViewById3.getClass();
        this.f30337e = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.user_level_progress_description);
        viewFindViewById4.getClass();
        this.f30338f = (TextView) viewFindViewById4;
        u uVarA = u.a(userInfo.getUserLevel());
        int i14 = uVarA.f68114a;
        int i15 = uVarA.f68115b;
        int userPoints = userInfo.getUserPoints();
        u uVarA2 = u.a(i14 + 1);
        UserLevelImageView userLevelImageView = this.f30335c;
        if (userLevelImageView != null) {
            userLevelImageView.setProfileImageData(userInfo.j());
        }
        ProgressBar progressBar = this.f30337e;
        progressBar.getClass();
        progressBar.setVisibility(0);
        u[] uVarArrValues = u.values();
        int i16 = uVarArrValues[uVarArrValues.length - 1].f68114a;
        HexagonLevelView hexagonLevelView = this.f30336d;
        if (i14 < i16) {
            hexagonLevelView.getClass();
            hexagonLevelView.setVisibility(0);
            HexagonLevelView hexagonLevelView2 = this.f30336d;
            hexagonLevelView2.getClass();
            int i17 = uVarA2.f68114a;
            int i18 = uVarA2.f68115b;
            hexagonLevelView2.setLevel(i17);
            HexagonLevelView hexagonLevelView3 = this.f30336d;
            hexagonLevelView3.getClass();
            hexagonLevelView3.setLevelContentDescription(getString(R.string.lbl_next_level, String.valueOf(uVarA2.f68114a)));
            if (c22.b.e(this)) {
                Resources resources = getResources();
                resources.getClass();
                int iC = (int) c22.b.c(this, xy2.b.n(resources, 22.0f), 1.8f);
                HexagonLevelView hexagonLevelView4 = this.f30336d;
                hexagonLevelView4.getClass();
                hexagonLevelView4.getLayoutParams().width = iC;
                HexagonLevelView hexagonLevelView5 = this.f30336d;
                hexagonLevelView5.getClass();
                hexagonLevelView5.getLayoutParams().height = iC;
            }
            ProgressBar progressBar2 = this.f30337e;
            progressBar2.getClass();
            progressBar2.setMax(i18 - i15);
            ProgressBar progressBar3 = this.f30337e;
            progressBar3.getClass();
            progressBar3.setProgress(userPoints - i15);
            color = a7.b.getColor(this, t.a(uVarA2));
            int i19 = i18 - userPoints;
            TextView textView = this.f30338f;
            textView.getClass();
            textView.setText(i19 > 1 ? getString(R.string.social_points_to_next_level, String.valueOf(i19)) : getString(R.string.social_point_to_next_level));
            TextView textView2 = this.f30338f;
            textView2.getClass();
            textView2.setContentDescription(i19 > 1 ? getString(R.string.lbl_points_to_next_level, String.valueOf(i19)) : getString(R.string.lbl_point_to_next_level));
        } else {
            hexagonLevelView.getClass();
            hexagonLevelView.setVisibility(4);
            ProgressBar progressBar4 = this.f30337e;
            progressBar4.getClass();
            progressBar4.setMax(userPoints);
            ProgressBar progressBar5 = this.f30337e;
            progressBar5.getClass();
            progressBar5.setProgress(userPoints);
            color = a7.b.getColor(this, t.a(uVarA));
            TextView textView3 = this.f30338f;
            textView3.getClass();
            textView3.setText(getString(R.string.badges_max_level_reached));
        }
        ProgressBar progressBar6 = this.f30337e;
        progressBar6.getClass();
        progressBar6.setProgressTintList(ColorStateList.valueOf(color));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        if (i14 != 0) {
            super.onActivityResult(i14, i15, intent);
            return;
        }
        if (i15 == -1) {
            intent.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("GCM_badges_filter_data", vu.b.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("GCM_badges_filter_data");
                if (!(parcelableExtra instanceof vu.b)) {
                    parcelableExtra = null;
                }
                parcelable = (vu.b) parcelableExtra;
            }
            vu.b bVar = (vu.b) parcelable;
            if (s.g(this.f30341i, bVar)) {
                return;
            }
            bVar.getClass();
            this.f30341i = bVar;
            a aVar = this.f30334b;
            aVar.getClass();
            int iF = aVar.f30342a.f();
            for (int i16 = 0; i16 < iF; i16++) {
                a aVar2 = this.f30334b;
                aVar2.getClass();
                l1<Fragment> l1Var = aVar2.f30342a;
                a aVar3 = this.f30334b;
                aVar3.getClass();
                n0 n0Var = (Fragment) l1Var.c(aVar3.f30342a.d(i16));
                if (n0Var instanceof vu.a) {
                    ((vu.a) n0Var).L4();
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.badges);
        initActionBar(true, R.string.concept_badges);
        Bundle extras = getIntent().getExtras();
        boolean z14 = false;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_userProfile", q.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_userProfile");
                if (!(parcelable2 instanceof q)) {
                    parcelable2 = null;
                }
                parcelable = (q) parcelable2;
            }
            this.f30340h = (q) parcelable;
            z14 = extras.getBoolean("GCM_selected_tab_available_badges", false);
        }
        View viewFindViewById = findViewById(R.id.badges_view_pager);
        viewFindViewById.getClass();
        SwipeViewPager swipeViewPager = (SwipeViewPager) viewFindViewById;
        this.f30333a = swipeViewPager;
        swipeViewPager.setOffscreenPageLimit(2);
        this.f30334b = new a(getSupportFragmentManager());
        SwipeViewPager swipeViewPager2 = this.f30333a;
        swipeViewPager2.getClass();
        swipeViewPager2.setAdapter(this.f30334b);
        SwipeViewPager swipeViewPager3 = this.f30333a;
        swipeViewPager3.getClass();
        a aVar = this.f30334b;
        aVar.getClass();
        swipeViewPager3.c(aVar);
        if (z14) {
            SwipeViewPager swipeViewPager4 = this.f30333a;
            swipeViewPager4.getClass();
            swipeViewPager4.setCurrentItem(1);
        }
        View viewFindViewById2 = findViewById(R.id.badges_sliding_tabs);
        viewFindViewById2.getClass();
        GCMSlidingTabLayout gCMSlidingTabLayout = (GCMSlidingTabLayout) viewFindViewById2;
        gCMSlidingTabLayout.f47853b = R.layout.gcm_tab;
        gCMSlidingTabLayout.f47854c = R.id.tab_title;
        gCMSlidingTabLayout.f47842h = R.id.tab_icon;
        gCMSlidingTabLayout.setViewPager(this.f30333a);
        if (this.f30340h != null) {
            da();
        } else {
            ca();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final void onNetworkConnected() {
        if (this.f30340h == null) {
            ca();
        }
        a aVar = this.f30334b;
        aVar.getClass();
        SwipeViewPager swipeViewPager = this.f30333a;
        swipeViewPager.getClass();
        aVar.onPageSelected(swipeViewPager.getCurrentItem());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/BadgesActivity$b;", "", "<init>", "()V", "", "REQUEST_CODE_FILTER", "I", "TAB_POSITION_EARNED", "TAB_POSITION_AVAILABLE", "TAB_POSITION_LEADERS", "TABS_COUNT", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, q qVar, boolean z14) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) BadgesActivity.class);
            intent.putExtra("GCM_userProfile", qVar);
            intent.putExtra("GCM_selected_tab_available_badges", z14);
            return intent;
        }

        private b() {
        }
    }
}
