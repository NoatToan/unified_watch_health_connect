package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import com.garmin.android.apps.connectmobile.badges.service.model.p;
import com.garmin.android.apps.connectmobile.badges.service.model.v;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import i3.e5;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "b", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f30433a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.l f30434b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/d$a;", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/m;", "detailedBadgeDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/badges/redesign/d;Lcom/garmin/android/apps/connectmobile/badges/service/model/m;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f30435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30437c;

        public a(d dVar, m mVar) {
            mVar.getClass();
            this.f30435a = mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/d$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f30438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f30439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f30440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UserLevelImageView f30441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final UserLevelImageView f30442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f30443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f30444g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ConstraintLayout f30445h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ConstraintLayout f30446i;

        public b(ViewGroup viewGroup) {
            super(e5.e(viewGroup, R.layout.badges_compare_list_item, viewGroup, false));
            View viewFindViewById = this.itemView.findViewById(R.id.badge_image);
            viewFindViewById.getClass();
            this.f30438a = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(R.id.badge_name);
            viewFindViewById2.getClass();
            this.f30439b = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.itemView.findViewById(R.id.badge_description);
            viewFindViewById3.getClass();
            this.f30440c = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.itemView.findViewById(R.id.badge_user_1);
            viewFindViewById4.getClass();
            this.f30441d = (UserLevelImageView) viewFindViewById4;
            View viewFindViewById5 = this.itemView.findViewById(R.id.badge_user_2);
            viewFindViewById5.getClass();
            this.f30442e = (UserLevelImageView) viewFindViewById5;
            View viewFindViewById6 = this.itemView.findViewById(R.id.badge_nb_earned_user_1);
            viewFindViewById6.getClass();
            this.f30443f = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.itemView.findViewById(R.id.badge_nb_earned_user_2);
            viewFindViewById7.getClass();
            this.f30444g = (TextView) viewFindViewById7;
            View viewFindViewById8 = this.itemView.findViewById(R.id.user_1_layout);
            viewFindViewById8.getClass();
            this.f30445h = (ConstraintLayout) viewFindViewById8;
            View viewFindViewById9 = this.itemView.findViewById(R.id.user_2_layout);
            viewFindViewById9.getClass();
            this.f30446i = (ConstraintLayout) viewFindViewById9;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f30433a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        boolean z14;
        v connectionProfile;
        v userProfile;
        v userProfile2;
        f0Var.getClass();
        b bVar = (b) f0Var;
        a aVar = this.f30433a.get(i14);
        aVar.getClass();
        a aVar2 = aVar;
        View view2 = bVar.itemView;
        UserLevelImageView userLevelImageView = bVar.f30441d;
        TextView textView = bVar.f30439b;
        TextView textView2 = bVar.f30444g;
        TextView textView3 = bVar.f30443f;
        UserLevelImageView userLevelImageView2 = bVar.f30442e;
        ImageView imageView = bVar.f30438a;
        final Context context = view2.getContext();
        final m mVar = aVar2.f30435a;
        context.getClass();
        zp0.c cVar = new zp0.c(context);
        cVar.f206565e = mVar.t();
        cVar.f206570j = 2131231129;
        cVar.f206576p = true;
        cVar.f206578r = "cache_availability_today";
        cVar.h(imageView);
        if (c22.b.e(context)) {
            if (imageView.getParent() instanceof ConstraintLayout) {
                androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                ViewParent parent = imageView.getParent();
                parent.getClass();
                dVar.f((ConstraintLayout) parent);
                dVar.e(imageView.getId(), 4);
                ViewParent parent2 = imageView.getParent();
                parent2.getClass();
                dVar.b((ConstraintLayout) parent2);
            }
            imageView.getLayoutParams().width = (int) c22.b.c(context, context.getResources().getDimensionPixelSize(R.dimen.badges_icon_small_size), 1.8f);
            imageView.getLayoutParams().height = (int) c22.b.c(context, context.getResources().getDimensionPixelSize(R.dimen.badges_icon_small_size), 1.8f);
        }
        textView.setText(mVar.A());
        bVar.f30440c.setText(mVar.m());
        int i15 = aVar2.f30436b;
        View view3 = bVar.itemView;
        boolean z15 = false;
        if (i15 != 0) {
            view3.setEnabled(true);
            final int i16 = 0;
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: uu.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    switch (i16) {
                        case 0:
                            BadgeDetailsActivity.a aVar3 = BadgeDetailsActivity.f30322l;
                            int badgeId = mVar.getBadgeId();
                            aVar3.getClass();
                            Context context2 = context;
                            context2.startActivity(BadgeDetailsActivity.a.a(badgeId, context2));
                            break;
                        default:
                            BadgeDetailsActivity.a aVar4 = BadgeDetailsActivity.f30322l;
                            int badgeId2 = mVar.getBadgeId();
                            aVar4.getClass();
                            Context context3 = context;
                            context3.startActivity(BadgeDetailsActivity.a.a(badgeId2, context3));
                            break;
                    }
                }
            });
        } else {
            view3.setEnabled(false);
        }
        StringBuilder sb3 = new StringBuilder();
        if (aVar2.f30436b != 0) {
            com.garmin.android.apps.connectmobile.badges.service.model.l lVar = this.f30434b;
            userLevelImageView.setProfileImageData((lVar == null || (userProfile2 = lVar.getUserProfile()) == null) ? b12.b.f14386g : userProfile2.o(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL));
            userLevelImageView.setVisibility(0);
            com.garmin.android.apps.connectmobile.badges.service.model.l lVar2 = this.f30434b;
            sb3.append(context.getString(R.string.lbl_earned_by_value, (lVar2 == null || (userProfile = lVar2.getUserProfile()) == null) ? null : userProfile.getFullName()));
        } else {
            userLevelImageView.setVisibility(4);
        }
        int i17 = aVar2.f30436b;
        if (i17 > 1) {
            textView3.setText(context.getString(R.string.times_string_pattern, String.valueOf(i17)));
            sb3.append(context.getString(R.string.lbl_value_times, String.valueOf(aVar2.f30436b)));
            textView3.setVisibility(0);
            z14 = false;
        } else {
            textView3.setVisibility(4);
            z14 = true;
        }
        bVar.f30445h.setContentDescription(sb3);
        com.garmin.android.apps.connectmobile.badges.service.model.l lVar3 = this.f30434b;
        lVar3.getClass();
        v connectionProfile2 = lVar3.getConnectionProfile();
        userLevelImageView2.setOnClickListener(new ty0.a(new p(connectionProfile2 != null ? Long.valueOf(connectionProfile2.getUserProfileId()) : null, connectionProfile2 != null ? connectionProfile2.getFullName() : null, connectionProfile2 != null ? connectionProfile2.getDisplayName() : null, connectionProfile2 != null ? connectionProfile2.getProfileImageUrlMedium() : null, connectionProfile2 != null ? connectionProfile2.getProfileImageUrlSmall() : null, connectionProfile2 != null ? Long.valueOf(connectionProfile2.getUserLevel()) : null, null, null, 192, null), 3, context, mVar));
        StringBuilder sb4 = new StringBuilder();
        if (aVar2.f30437c != 0) {
            bVar.itemView.setEnabled(true);
            final int i18 = 1;
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: uu.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    switch (i18) {
                        case 0:
                            BadgeDetailsActivity.a aVar3 = BadgeDetailsActivity.f30322l;
                            int badgeId = mVar.getBadgeId();
                            aVar3.getClass();
                            Context context2 = context;
                            context2.startActivity(BadgeDetailsActivity.a.a(badgeId, context2));
                            break;
                        default:
                            BadgeDetailsActivity.a aVar4 = BadgeDetailsActivity.f30322l;
                            int badgeId2 = mVar.getBadgeId();
                            aVar4.getClass();
                            Context context3 = context;
                            context3.startActivity(BadgeDetailsActivity.a.a(badgeId2, context3));
                            break;
                    }
                }
            });
            com.garmin.android.apps.connectmobile.badges.service.model.l lVar4 = this.f30434b;
            userLevelImageView2.setProfileImageData((lVar4 == null || (connectionProfile = lVar4.getConnectionProfile()) == null) ? b12.b.f14386g : connectionProfile.o(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL));
            userLevelImageView2.setVisibility(0);
            sb4.append(context.getString(R.string.lbl_earned_by_value, connectionProfile2 != null ? connectionProfile2.getFullName() : null));
        } else {
            userLevelImageView2.setVisibility(4);
        }
        userLevelImageView2.setContentDescription(connectionProfile2 != null ? connectionProfile2.getFullName() : null);
        userLevelImageView2.setClickable(true);
        int i19 = aVar2.f30437c;
        if (i19 > 1) {
            textView2.setText(context.getString(R.string.times_string_pattern, String.valueOf(i19)));
            textView2.setVisibility(0);
            sb4.append(context.getString(R.string.lbl_value_times, String.valueOf(aVar2.f30437c)));
        } else {
            textView2.setVisibility(4);
            z15 = z14;
        }
        if (z15) {
            textView3.setVisibility(8);
            textView2.setVisibility(8);
        }
        bVar.f30446i.setContentDescription(sb4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(viewGroup);
    }
}
