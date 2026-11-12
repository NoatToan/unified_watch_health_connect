package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.redesign.CompareBadgesActivity;
import com.garmin.android.apps.connectmobile.badges.service.model.v;
import com.garmin.android.apps.connectmobile.view.HexagonLevelView;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import f12.u;
import fw.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import uu.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/CompareBadgesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CompareBadgesActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f30346q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.l f30348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConstraintLayout f30349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConstraintLayout f30350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UserLevelImageView f30351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UserLevelImageView f30352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f30353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f30354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f30356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HexagonLevelView f30357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HexagonLevelView f30358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f30359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f30360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o13.l<q> f30361o = KoinJavaComponent.inject$default(q.class, null, null, 6, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ru.d f30362p = (ru.d) KoinJavaComponent.get$default(ru.d.class, null, null, 6, null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30363a;

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
            f30363a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f30364a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f30364a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f30364a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30364a.invoke(obj);
        }
    }

    public final void ca() {
        com.garmin.android.apps.connectmobile.badges.service.model.l lVar = this.f30348b;
        if (lVar != null) {
            final v userProfile = lVar.getUserProfile();
            com.garmin.android.apps.connectmobile.badges.service.model.l lVar2 = this.f30348b;
            lVar2.getClass();
            final v connectionProfile = lVar2.getConnectionProfile();
            if (userProfile != null) {
                TextView textView = this.f30353g;
                textView.getClass();
                textView.setText(userProfile.getFullName());
                int i14 = u.a(userProfile.getUserLevel()).f68114a;
                HexagonLevelView hexagonLevelView = this.f30357k;
                hexagonLevelView.getClass();
                hexagonLevelView.setLevel(i14);
                HexagonLevelView hexagonLevelView2 = this.f30357k;
                hexagonLevelView2.getClass();
                hexagonLevelView2.setLevelContentDescription(getString(R.string.lbl_badge_level_value, String.valueOf(i14)));
                TextView textView2 = this.f30355i;
                textView2.getClass();
                textView2.setText(userProfile.getUserPoints() == 1 ? getString(R.string.lbl_user_level_points_abbr_singular) : getString(R.string.social_points, String.valueOf(userProfile.getUserPoints())));
                TextView textView3 = this.f30355i;
                textView3.getClass();
                textView3.setContentDescription(userProfile.getUserPoints() == 1 ? getString(R.string.social_one_point) : getString(R.string.lbl_number_points, String.valueOf(userProfile.getUserPoints())));
                UserLevelImageView userLevelImageView = this.f30351e;
                if (userLevelImageView != null) {
                    userLevelImageView.setProfileImageData(userProfile.o(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_PROFILE));
                    final int i15 = 0;
                    userLevelImageView.setOnClickListener(new View.OnClickListener(this) { // from class: uu.a0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CompareBadgesActivity f172651b;

                        {
                            this.f172651b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i15) {
                                case 0:
                                    CompareBadgesActivity compareBadgesActivity = this.f172651b;
                                    ru.d dVar = compareBadgesActivity.f30362p;
                                    com.garmin.android.apps.connectmobile.badges.service.model.v vVar = userProfile;
                                    dVar.a(compareBadgesActivity, vVar.getDisplayName(), vVar.getFullName(), vVar.getProfileImageUrlLarge());
                                    break;
                                default:
                                    CompareBadgesActivity compareBadgesActivity2 = this.f172651b;
                                    ru.d dVar2 = compareBadgesActivity2.f30362p;
                                    com.garmin.android.apps.connectmobile.badges.service.model.v vVar2 = userProfile;
                                    dVar2.a(compareBadgesActivity2, vVar2.getDisplayName(), vVar2.getFullName(), vVar2.getProfileImageUrlLarge());
                                    break;
                            }
                        }
                    });
                }
                ConstraintLayout constraintLayout = this.f30349c;
                constraintLayout.getClass();
                final int i16 = 0;
                constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: uu.b0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CompareBadgesActivity f172656b;

                    {
                        this.f172656b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i16) {
                            case 0:
                                UserLevelImageView userLevelImageView2 = this.f172656b.f30351e;
                                userLevelImageView2.getClass();
                                userLevelImageView2.callOnClick();
                                break;
                            default:
                                UserLevelImageView userLevelImageView3 = this.f172656b.f30352f;
                                userLevelImageView3.getClass();
                                userLevelImageView3.callOnClick();
                                break;
                        }
                    }
                });
            }
            if (connectionProfile != null) {
                TextView textView4 = this.f30354h;
                textView4.getClass();
                textView4.setText(connectionProfile.getFullName());
                int i17 = u.a(connectionProfile.getUserLevel()).f68114a;
                HexagonLevelView hexagonLevelView3 = this.f30358l;
                hexagonLevelView3.getClass();
                hexagonLevelView3.setLevel(i17);
                HexagonLevelView hexagonLevelView4 = this.f30358l;
                hexagonLevelView4.getClass();
                hexagonLevelView4.setLevelContentDescription(getString(R.string.lbl_badge_level_value, String.valueOf(i17)));
                TextView textView5 = this.f30356j;
                textView5.getClass();
                textView5.setText(connectionProfile.getUserPoints() == 1 ? getString(R.string.lbl_user_level_points_abbr_singular) : getString(R.string.social_points, String.valueOf(connectionProfile.getUserPoints())));
                TextView textView6 = this.f30356j;
                textView6.getClass();
                textView6.setContentDescription(connectionProfile.getUserPoints() == 1 ? getString(R.string.social_one_point) : getString(R.string.lbl_number_points, String.valueOf(connectionProfile.getUserPoints())));
                UserLevelImageView userLevelImageView2 = this.f30352f;
                if (userLevelImageView2 != null) {
                    userLevelImageView2.setProfileImageData(connectionProfile.o(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_PROFILE));
                    final int i18 = 1;
                    userLevelImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: uu.a0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CompareBadgesActivity f172651b;

                        {
                            this.f172651b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i18) {
                                case 0:
                                    CompareBadgesActivity compareBadgesActivity = this.f172651b;
                                    ru.d dVar = compareBadgesActivity.f30362p;
                                    com.garmin.android.apps.connectmobile.badges.service.model.v vVar = connectionProfile;
                                    dVar.a(compareBadgesActivity, vVar.getDisplayName(), vVar.getFullName(), vVar.getProfileImageUrlLarge());
                                    break;
                                default:
                                    CompareBadgesActivity compareBadgesActivity2 = this.f172651b;
                                    ru.d dVar2 = compareBadgesActivity2.f30362p;
                                    com.garmin.android.apps.connectmobile.badges.service.model.v vVar2 = connectionProfile;
                                    dVar2.a(compareBadgesActivity2, vVar2.getDisplayName(), vVar2.getFullName(), vVar2.getProfileImageUrlLarge());
                                    break;
                            }
                        }
                    });
                }
                ConstraintLayout constraintLayout2 = this.f30350d;
                constraintLayout2.getClass();
                final int i19 = 1;
                constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: uu.b0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CompareBadgesActivity f172656b;

                    {
                        this.f172656b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i19) {
                            case 0:
                                UserLevelImageView userLevelImageView3 = this.f172656b.f30351e;
                                userLevelImageView3.getClass();
                                userLevelImageView3.callOnClick();
                                break;
                            default:
                                UserLevelImageView userLevelImageView4 = this.f172656b.f30352f;
                                userLevelImageView4.getClass();
                                userLevelImageView4.callOnClick();
                                break;
                        }
                    }
                });
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        v vVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f30347a = extras.getString("GCM_userDisplayName");
            if (extras.containsKey("GCM_extra_connection_profile_badges")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) extras.getParcelable("GCM_extra_connection_profile_badges", v.class);
                } else {
                    Parcelable parcelable2 = extras.getParcelable("GCM_extra_connection_profile_badges");
                    if (!(parcelable2 instanceof v)) {
                        parcelable2 = null;
                    }
                    parcelable = (v) parcelable2;
                }
                vVar = (v) parcelable;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                String userFullName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
                f12.l.f68084a.getClass();
                this.f30348b = new com.garmin.android.apps.connectmobile.badges.service.model.l(new v(0, userFullName, userDisplayName, false, f12.l.a.a().z4("PREMIUM_PROFILE"), null, null, f12.l.a.a().j(), f12.l.a.a().c3(), 0, null, false, false, null, 15977, null), vVar);
                if (this.f30347a == null) {
                    this.f30347a = vVar.getDisplayName();
                }
            }
        }
        if (this.f30347a == null) {
            finish();
        }
        setContentView(R.layout.badges_compare_layout);
        initActionBar(true, R.string.social_compare_badges);
        View viewFindViewById = findViewById(R.id.user_1_layout);
        viewFindViewById.getClass();
        this.f30349c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.user_2_layout);
        viewFindViewById2.getClass();
        this.f30350d = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.user_profile_image_1);
        viewFindViewById3.getClass();
        this.f30351e = (UserLevelImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.user_profile_image_2);
        viewFindViewById4.getClass();
        this.f30352f = (UserLevelImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.user_name_1);
        viewFindViewById5.getClass();
        this.f30353g = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.user_name_2);
        viewFindViewById6.getClass();
        this.f30354h = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.user_level_points_1);
        viewFindViewById7.getClass();
        this.f30355i = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.user_level_points_2);
        viewFindViewById8.getClass();
        this.f30356j = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.user_level_1);
        viewFindViewById9.getClass();
        this.f30357k = (HexagonLevelView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.user_level_2);
        viewFindViewById10.getClass();
        this.f30358l = (HexagonLevelView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.compare_badges_list);
        viewFindViewById11.getClass();
        this.f30359m = (RecyclerView) viewFindViewById11;
        this.f30360n = new d();
        RecyclerView recyclerView = this.f30359m;
        recyclerView.getClass();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        int dimension = ((int) getResources().getDimension(R.dimen.spacing_normal)) + ((int) getResources().getDimension(R.dimen.badges_icon_small_size)) + ((int) getResources().getDimension(R.dimen.spacing_normal));
        RecyclerView recyclerView2 = this.f30359m;
        recyclerView2.getClass();
        recyclerView2.addItemDecoration(new r22.j(this, dimension));
        RecyclerView recyclerView3 = this.f30359m;
        recyclerView3.getClass();
        recyclerView3.setAdapter(this.f30360n);
        if (c22.b.e(this)) {
            Resources resources = getResources();
            resources.getClass();
            int iC = (int) c22.b.c(this, xy2.b.n(resources, 22.0f), 1.8f);
            HexagonLevelView hexagonLevelView = this.f30357k;
            hexagonLevelView.getClass();
            hexagonLevelView.getLayoutParams().width = iC;
            HexagonLevelView hexagonLevelView2 = this.f30357k;
            hexagonLevelView2.getClass();
            hexagonLevelView2.getLayoutParams().height = iC;
            HexagonLevelView hexagonLevelView3 = this.f30358l;
            hexagonLevelView3.getClass();
            hexagonLevelView3.getLayoutParams().width = iC;
            HexagonLevelView hexagonLevelView4 = this.f30358l;
            hexagonLevelView4.getClass();
            hexagonLevelView4.getLayoutParams().height = iC;
        }
        if (this.f30348b != null) {
            ca();
        }
        q value = this.f30361o.getValue();
        String str = this.f30347a;
        str.getClass();
        value.getClass();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(value), null, null, new uu.u(y0Var, value, str, null), 3);
        y0Var.f(this, new c(new uo1.a(this, 2)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/CompareBadgesActivity$a;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
