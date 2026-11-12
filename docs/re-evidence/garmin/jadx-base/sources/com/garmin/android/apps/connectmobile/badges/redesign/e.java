package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c22.l1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import uu.d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f30447q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f30448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f30449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f30450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f30451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f30452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f30453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f30454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f30455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f30457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public UserLevelImageView f30458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f30459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f30460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f30461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ru.d f30462o = (ru.d) KoinJavaComponent.get$default(ru.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f30463p;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m mVar = this.f30448a;
        if (mVar != null) {
            u6(mVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_connection_badge_details, viewGroup, false);
        this.f30449b = viewInflate;
        View viewFindViewById = viewInflate != null ? viewInflate.findViewById(R.id.badge_image) : null;
        viewFindViewById.getClass();
        this.f30450c = (ImageView) viewFindViewById;
        View view2 = this.f30449b;
        View viewFindViewById2 = view2 != null ? view2.findViewById(R.id.badge_name) : null;
        viewFindViewById2.getClass();
        this.f30451d = (TextView) viewFindViewById2;
        View view3 = this.f30449b;
        View viewFindViewById3 = view3 != null ? view3.findViewById(R.id.badge_description) : null;
        viewFindViewById3.getClass();
        this.f30453f = (TextView) viewFindViewById3;
        View view4 = this.f30449b;
        this.f30452e = view4 != null ? (TextView) view4.findViewById(R.id.badge_multiplier_description) : null;
        View view5 = this.f30449b;
        View viewFindViewById4 = view5 != null ? view5.findViewById(R.id.badge_repeatable) : null;
        viewFindViewById4.getClass();
        this.f30454g = (TextView) viewFindViewById4;
        View view6 = this.f30449b;
        View viewFindViewById5 = view6 != null ? view6.findViewById(R.id.badge_limited_time) : null;
        viewFindViewById5.getClass();
        this.f30455h = (TextView) viewFindViewById5;
        View view7 = this.f30449b;
        this.f30456i = view7 != null ? (TextView) view7.findViewById(R.id.badge_special) : null;
        View view8 = this.f30449b;
        TextView textView = view8 != null ? (TextView) view8.findViewById(R.id.badge_special_2) : null;
        this.f30457j = textView;
        if (textView != null) {
            textView.setText(getString(R.string.lbl_garmin_connect_plus));
        }
        View view9 = this.f30449b;
        View viewFindViewById6 = view9 != null ? view9.findViewById(R.id.badge_earned_description) : null;
        viewFindViewById6.getClass();
        this.f30459l = (TextView) viewFindViewById6;
        View view10 = this.f30449b;
        View viewFindViewById7 = view10 != null ? view10.findViewById(R.id.badge_earned_by_me) : null;
        viewFindViewById7.getClass();
        this.f30460m = (TextView) viewFindViewById7;
        View view11 = this.f30449b;
        View viewFindViewById8 = view11 != null ? view11.findViewById(R.id.badge_tag_layout) : null;
        viewFindViewById8.getClass();
        this.f30461n = (LinearLayout) viewFindViewById8;
        View view12 = this.f30449b;
        View viewFindViewById9 = view12 != null ? view12.findViewById(R.id.connection_user_level) : null;
        viewFindViewById9.getClass();
        this.f30458k = (UserLevelImageView) viewFindViewById9;
        View view13 = this.f30449b;
        this.f30463p = view13 != null ? (TextView) view13.findViewById(R.id.available_date_range) : null;
        return this.f30449b;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View view3 = this.f30449b;
        view3.getClass();
        view3.setVisibility(8);
        TextView textView = this.f30459l;
        textView.getClass();
        textView.setOnClickListener(new d0(this, 0));
    }

    public final void u6(m mVar) {
        String string;
        String string2;
        String connectionDisplayName;
        m mVar2;
        m mVar3;
        TextView textView;
        this.f30448a = mVar;
        if (isAdded() && this.f30448a != null) {
            View view2 = this.f30449b;
            view2.getClass();
            view2.setVisibility(0);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            zp0.c cVar = new zp0.c(contextRequireContext);
            m mVar4 = this.f30448a;
            mVar4.getClass();
            cVar.f206565e = mVar4.u();
            cVar.f206570j = 2131231128;
            cVar.f206576p = true;
            cVar.f206578r = "cache_availability_today";
            ImageView imageView = this.f30450c;
            imageView.getClass();
            cVar.h(imageView);
            TextView textView2 = this.f30451d;
            textView2.getClass();
            m mVar5 = this.f30448a;
            mVar5.getClass();
            textView2.setText(mVar5.A());
            m mVar6 = this.f30448a;
            int i14 = mVar6 != null ? mVar6.o().f30564b : 1;
            m mVar7 = this.f30448a;
            if (mVar7 == null || !mVar7.w0()) {
                TextView textView3 = this.f30452e;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                if (i14 == 1) {
                    string2 = getString(R.string.lbl_user_level_points_abbr_singular);
                    string2.getClass();
                    string = getString(R.string.social_one_point);
                    string.getClass();
                } else {
                    String string3 = getString(R.string.social_points, String.valueOf(i14));
                    string3.getClass();
                    String string4 = getString(R.string.lbl_number_points, String.valueOf(i14));
                    string4.getClass();
                    string = string4;
                    string2 = string3;
                }
                TextView textView4 = this.f30453f;
                if (textView4 != null) {
                    m mVar8 = this.f30448a;
                    mVar8.getClass();
                    textView4.setText(getString(R.string.string_space_bullet_string_pattern, string2, mVar8.m()));
                }
                TextView textView5 = this.f30453f;
                if (textView5 != null) {
                    m mVar9 = this.f30448a;
                    mVar9.getClass();
                    textView5.setContentDescription(getString(R.string.string_comma_string_pattern, string, mVar9.m()));
                }
            } else {
                m mVar10 = this.f30448a;
                int earnedMultiplier = mVar10 != null ? mVar10.getEarnedMultiplier() : 1;
                TextView textView6 = this.f30452e;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
                TextView textView7 = this.f30452e;
                if (textView7 != null) {
                    uu.i iVar = uu.i.f172715a;
                    Context contextRequireContext2 = requireContext();
                    contextRequireContext2.getClass();
                    iVar.getClass();
                    textView7.setText(uu.i.a(earnedMultiplier, i14, contextRequireContext2));
                }
                TextView textView8 = this.f30453f;
                if (textView8 != null) {
                    m mVar11 = this.f30448a;
                    textView8.setText(mVar11 != null ? mVar11.m() : null);
                }
            }
            TextView textView9 = this.f30455h;
            textView9.getClass();
            textView9.setVisibility(8);
            TextView textView10 = this.f30454g;
            textView10.getClass();
            textView10.setVisibility(8);
            TextView textView11 = this.f30456i;
            textView11.getClass();
            textView11.setVisibility(8);
            TextView textView12 = this.f30457j;
            if (textView12 != null) {
                textView12.setVisibility(8);
            }
            m mVar12 = this.f30448a;
            boolean zB = mVar12 != null ? mVar12.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_SINGLE) : false;
            m mVar13 = this.f30448a;
            boolean zB2 = mVar13 != null ? mVar13.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_ANNUAL) : false;
            m mVar14 = this.f30448a;
            boolean zB3 = mVar14 != null ? mVar14.b(com.garmin.android.apps.connectmobile.badges.service.model.j.REPEATABLE) : false;
            m mVar15 = this.f30448a;
            boolean zB4 = mVar15 != null ? mVar15.b(com.garmin.android.apps.connectmobile.badges.service.model.j.SERIES_EVENTS) : false;
            m mVar16 = this.f30448a;
            boolean z14 = mVar16 != null && mVar16.getIsPremium();
            if (((!zB3 && zB2) || zB || zB4) && (textView = this.f30455h) != null) {
                textView.setVisibility(0);
            }
            m mVar17 = this.f30448a;
            mVar17.getClass();
            com.garmin.android.apps.connectmobile.badges.service.model.j jVar = com.garmin.android.apps.connectmobile.badges.service.model.j.REPEATABLE;
            if (mVar17.b(jVar)) {
                TextView textView13 = this.f30454g;
                textView13.getClass();
                textView13.setVisibility(0);
            }
            m mVar18 = this.f30448a;
            mVar18.getClass();
            if (mVar18.getAssocTypeId() == com.garmin.android.apps.connectmobile.badges.service.model.a.BADGE_CHALLENGE.f30551a) {
                TextView textView14 = this.f30456i;
                textView14.getClass();
                textView14.setVisibility(0);
            }
            TextView textView15 = this.f30457j;
            if (textView15 != null) {
                textView15.setVisibility(z14 ? 0 : 8);
            }
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            if (c22.b.a(contextRequireContext3) > 1.3f) {
                LinearLayout linearLayout = this.f30461n;
                linearLayout.getClass();
                linearLayout.setOrientation(1);
                LinearLayout linearLayout2 = this.f30461n;
                linearLayout2.getClass();
                linearLayout2.setGravity(1);
                TextView textView16 = this.f30454g;
                textView16.getClass();
                ViewGroup.LayoutParams layoutParams = textView16.getLayoutParams();
                layoutParams.getClass();
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                TextView textView17 = this.f30454g;
                textView17.getClass();
                ViewGroup.LayoutParams layoutParams2 = textView17.getLayoutParams();
                layoutParams2.getClass();
                ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                TextView textView18 = this.f30455h;
                textView18.getClass();
                ViewGroup.LayoutParams layoutParams3 = textView18.getLayoutParams();
                layoutParams3.getClass();
                ((LinearLayout.LayoutParams) layoutParams3).leftMargin = 0;
                TextView textView19 = this.f30455h;
                textView19.getClass();
                ViewGroup.LayoutParams layoutParams4 = textView19.getLayoutParams();
                layoutParams4.getClass();
                ((LinearLayout.LayoutParams) layoutParams4).rightMargin = 0;
                TextView textView20 = this.f30456i;
                textView20.getClass();
                ViewGroup.LayoutParams layoutParams5 = textView20.getLayoutParams();
                layoutParams5.getClass();
                ((LinearLayout.LayoutParams) layoutParams5).rightMargin = 0;
                TextView textView21 = this.f30456i;
                textView21.getClass();
                ViewGroup.LayoutParams layoutParams6 = textView21.getLayoutParams();
                layoutParams6.getClass();
                ((LinearLayout.LayoutParams) layoutParams6).leftMargin = 0;
            }
            UserLevelImageView userLevelImageView = this.f30458k;
            m mVar19 = this.f30448a;
            if (userLevelImageView != null && mVar19 != null) {
                userLevelImageView.setProfileImageData(mVar19.n0(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_THUMBNAIL, mVar19.getConnectionUserLevel()));
                userLevelImageView.setOnClickListener(new u12.e(8, this, mVar19));
            }
            m mVar20 = this.f30448a;
            mVar20.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(mVar20.getConnectionFullName());
            m mVar21 = this.f30448a;
            if (zIsEmpty) {
                mVar21.getClass();
                connectionDisplayName = mVar21.getConnectionDisplayName();
            } else {
                mVar21.getClass();
                connectionDisplayName = mVar21.getConnectionFullName();
            }
            String str = connectionDisplayName;
            TextView textView22 = this.f30459l;
            textView22.getClass();
            androidx.fragment.app.m activity = getActivity();
            m mVar22 = this.f30448a;
            mVar22.getClass();
            int assocTypeId = mVar22.getAssocTypeId();
            m mVar23 = this.f30448a;
            mVar23.getClass();
            String assocDataId = mVar23.getAssocDataId();
            m mVar24 = this.f30448a;
            mVar24.getClass();
            String assocDataName = mVar24.getAssocDataName();
            m mVar25 = this.f30448a;
            mVar25.getClass();
            String badgeEarnedDate = mVar25.getBadgeEarnedDate();
            m mVar26 = this.f30448a;
            mVar26.getClass();
            int badgeEarnedNumber = mVar26.getBadgeEarnedNumber();
            m mVar27 = this.f30448a;
            mVar27.getClass();
            String strC = uu.k.c(activity, assocTypeId, assocDataId, assocDataName, badgeEarnedDate, badgeEarnedNumber, mVar27.getBadgeLimitCount(), str);
            strC.getClass();
            textView22.setText(l1.a(strC));
            m mVar28 = this.f30448a;
            mVar28.getClass();
            boolean isBadgeEarned = mVar28.getIsBadgeEarned();
            TextView textView23 = this.f30460m;
            if (isBadgeEarned) {
                textView23.getClass();
                textView23.setText(getString(R.string.badges_msg_badge_earned));
            } else {
                textView23.getClass();
                textView23.setText(getString(R.string.social_msg_you_have_not_earned_this_badge));
            }
            TextView textView24 = this.f30460m;
            textView24.getClass();
            textView24.setOnClickListener(new d0(this, 1));
            m mVar29 = this.f30448a;
            if ((mVar29 == null || !mVar29.b(jVar)) && (((mVar2 = this.f30448a) == null || !mVar2.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_SINGLE)) && ((mVar3 = this.f30448a) == null || !mVar3.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_ANNUAL)))) {
                TextView textView25 = this.f30463p;
                if (textView25 != null) {
                    textView25.setVisibility(8);
                    return;
                }
                return;
            }
            TextView textView26 = this.f30463p;
            if (textView26 != null) {
                Context contextRequireContext4 = requireContext();
                m mVar30 = this.f30448a;
                DateTime dateTimeJ0 = mVar30 != null ? mVar30.j0() : null;
                m mVar31 = this.f30448a;
                textView26.setText(uu.k.b(contextRequireContext4, dateTimeJ0, mVar31 != null ? mVar31.i0() : null));
            }
            TextView textView27 = this.f30463p;
            if (textView27 != null) {
                textView27.setVisibility(0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/e$a;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
