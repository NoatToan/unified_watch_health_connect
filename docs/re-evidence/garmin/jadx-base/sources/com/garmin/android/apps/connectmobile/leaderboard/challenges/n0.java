package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/n0;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "", "rowListener", "<init>", "(Landroid/view/View;Le23/l;)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 extends RecyclerView.f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f37680l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<com.garmin.android.apps.connectmobile.leaderboard.model.a0, Unit> f37681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f37682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f37683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UserLevelImageView f37684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f37685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearProgressIndicator f37686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f37687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f37688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f37689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f37690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f37691k;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37692a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.w.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_AD_HOC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_TEAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.BADGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37692a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(View view2, e23.l<? super com.garmin.android.apps.connectmobile.leaderboard.model.a0, Unit> lVar) {
        super(view2);
        view2.getClass();
        lVar.getClass();
        this.f37681a = lVar;
        View viewFindViewById = this.itemView.findViewById(R.id.challenge_icon);
        viewFindViewById.getClass();
        this.f37682b = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.challenge_icon_compose);
        viewFindViewById2.getClass();
        this.f37683c = (ComposeView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.user_profile);
        viewFindViewById3.getClass();
        this.f37684d = (UserLevelImageView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.challenge_name);
        viewFindViewById4.getClass();
        this.f37685e = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R.id.challenge_progress);
        viewFindViewById5.getClass();
        this.f37686f = (LinearProgressIndicator) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(R.id.challenge_status);
        viewFindViewById6.getClass();
        this.f37687g = (TextView) viewFindViewById6;
        View viewFindViewById7 = this.itemView.findViewById(R.id.challenge_players);
        viewFindViewById7.getClass();
        this.f37688h = (TextView) viewFindViewById7;
        View viewFindViewById8 = this.itemView.findViewById(R.id.challenge_weekly);
        viewFindViewById8.getClass();
        this.f37689i = (TextView) viewFindViewById8;
        View viewFindViewById9 = this.itemView.findViewById(R.id.exit_to_app_icon);
        viewFindViewById9.getClass();
        this.f37690j = (ImageView) viewFindViewById9;
        View viewFindViewById10 = this.itemView.findViewById(R.id.inflated_point_image);
        viewFindViewById10.getClass();
        this.f37691k = (ImageView) viewFindViewById10;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:157:0x046f  */
    /* JADX WARN: Code duplicated, block: B:163:0x047a  */
    public final void d(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, String str, gg1.o0 o0Var, boolean z14) {
        com.garmin.android.apps.connectmobile.leaderboard.model.w wVar;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        DateTime endDate;
        int i14;
        com.garmin.android.apps.connectmobile.leaderboard.model.w wVarG;
        LinearProgressIndicator linearProgressIndicator;
        com.garmin.android.apps.connectmobile.leaderboard.model.w wVarG2;
        int i15;
        str.getClass();
        o0Var.getClass();
        Context context = this.itemView.getContext();
        View view2 = this.itemView;
        TextView textView = this.f37685e;
        ImageView imageView = this.f37690j;
        TextView textView2 = this.f37689i;
        ComposeView composeView = this.f37683c;
        TextView textView3 = this.f37688h;
        ImageView imageView2 = this.f37682b;
        TextView textView4 = this.f37687g;
        if (a0Var != null) {
            view2.setOnClickListener(new lq.g(12, this, a0Var));
            v22.e.q(imageView2);
            v22.e.j(composeView);
            UserLevelImageView userLevelImageView = this.f37684d;
            v22.e.j(userLevelImageView);
            if (a0Var.D() != com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED) {
                int i16 = b.f37692a[a0Var.G().ordinal()];
                if (i16 == 1) {
                    imageView2.setImageResource(2131231827);
                } else if (i16 == 2 || i16 == 3) {
                    imageView2.setImageResource(2131233624);
                } else {
                    int i17 = 4;
                    if (i16 != 4) {
                        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarD = a0Var.d();
                        if (sVarD != null) {
                            imageView2.setVisibility(8);
                            composeView.setVisibility(0);
                            composeView.setContent(new z3.e(-1516184887, true, new com.garmin.android.apps.connectmobile.leaderboard.model.x(sVarD, 5, (byte) 0)));
                        }
                    } else {
                        Long badgeId = a0Var.getBadgeId();
                        String badgeUuid = a0Var.getBadgeUuid();
                        if (badgeId == null && badgeUuid == null) {
                            com.garmin.android.apps.connectmobile.leaderboard.model.s sVarD2 = a0Var.d();
                            if (sVarD2 != null) {
                                imageView2.setVisibility(8);
                                composeView.setVisibility(0);
                                composeView.setContent(new z3.e(-462736373, true, new com.garmin.android.apps.connectmobile.leaderboard.model.x(sVarD2, i17, (byte) 0)));
                            }
                        } else {
                            String strB = uu.i0.b(badgeId != null ? (int) badgeId.longValue() : 0, a0Var.getBadgeUuid());
                            context.getClass();
                            zp0.c cVar = new zp0.c(context);
                            cVar.f206565e = strB;
                            cVar.f206570j = 2131231129;
                            cVar.f206578r = "cache_availability_today";
                            cVar.h(imageView2);
                        }
                    }
                }
            } else if (a0Var.G() == com.garmin.android.apps.connectmobile.leaderboard.model.w.BADGE && a0Var.getBadgeId() != null) {
                Long badgeId2 = a0Var.getBadgeId();
                badgeId2.getClass();
                String strB2 = uu.i0.b((int) badgeId2.longValue(), a0Var.getBadgeUuid());
                context.getClass();
                zp0.c cVar2 = new zp0.c(context);
                cVar2.f206565e = strB2;
                cVar2.f206570j = 2131231129;
                cVar2.f206578r = "cache_availability_today";
                cVar2.h(imageView2);
            } else if (a0Var.G() != com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_AD_HOC || a0Var.getWinnerAvatarId() == -1) {
                imageView2.setVisibility(8);
                userLevelImageView.setVisibility(0);
                userLevelImageView.setProfileImageData(a0Var.X);
            } else {
                imageView2.setVisibility(8);
                userLevelImageView.setVisibility(0);
                userLevelImageView.setImageUrl(uu.i0.d(a0Var.getWinnerAvatarId()));
            }
            com.garmin.android.apps.connectmobile.leaderboard.model.w wVarG3 = a0Var.G();
            com.garmin.android.apps.connectmobile.leaderboard.model.w wVar2 = com.garmin.android.apps.connectmobile.leaderboard.model.w.BADGE;
            imageView2.setColorFilter(uu.p.c(wVarG3 == wVar2 && !a0Var.e0()));
            if (g22.n.d(a0Var.getName())) {
                if (com.garmin.android.apps.connectmobile.leaderboard.model.w.AUTO == a0Var.G()) {
                    context.getClass();
                    String name = a0Var.getName();
                    name.getClass();
                    textView.setText(x.d(context, name));
                } else {
                    textView.setText(a0Var.getName());
                }
            } else if (wVar2 == a0Var.G()) {
                textView.setText(a0Var.j());
            } else {
                textView.setText(com.garmin.android.apps.connectmobile.leaderboard.model.s.a(a0Var.d()));
            }
            if (a0Var.h0()) {
                textView4.setText(R.string.social_waiting_for_response);
                textView4.setTextColor(a7.b.getColor(context, R.color.palette_mango_2));
            } else if (wVar2 == a0Var.G()) {
                if (!a0Var.f0() && a0Var.f() == com.garmin.android.apps.connectmobile.leaderboard.model.r.STOP) {
                    textView4.setText(context.getString(R.string.social_gathering_results));
                    textView4.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary_disabled));
                } else if (a0Var.a0()) {
                    context.getClass();
                    textView4.setText(x.b(context, a0Var, o0Var));
                    textView4.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
                } else {
                    if (a0Var.f0()) {
                        context.getClass();
                        x xVar = x.f37955a;
                        String string = context.getString(R.string.string_space_bullet_string_pattern, context.getString(R.string.lbl_completed), x.j(context, a0Var.getStartDate(), a0Var.getEndDate(), true, false));
                        string.getClass();
                        textView4.setText(string);
                        String string2 = context.getString(R.string.string_space_bullet_string_pattern, context.getString(R.string.lbl_completed), x.j(context, a0Var.getStartDate(), a0Var.getEndDate(), true, true));
                        string2.getClass();
                        textView4.setContentDescription(string2);
                    } else if (p005kotlin.jvm.internal.s.c(a0Var.getBadgeTargetValue(), 0.0d)) {
                        context.getClass();
                        textView4.setText(x.j(context, a0Var.getStartDate(), a0Var.getEndDate(), true, false));
                        textView4.setContentDescription(x.j(context, a0Var.getStartDate(), a0Var.getEndDate(), true, true));
                    } else {
                        context.getClass();
                        textView4.setText(x.l(context, a0Var, o0Var));
                        textView4.setContentDescription(x.m(context, a0Var, o0Var));
                    }
                    textView4.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
                }
            } else if (a0Var.D() == com.garmin.android.apps.connectmobile.leaderboard.model.v.STOPPED || a0Var.D() == com.garmin.android.apps.connectmobile.leaderboard.model.v.LOCKED) {
                textView4.setText(context.getString(R.string.social_gathering_results));
                textView4.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary_disabled));
            } else {
                context.getClass();
                textView4.setText(x.j(context, a0Var.getStartDate(), a0Var.getEndDate(), true, false));
                textView4.setContentDescription(x.j(context, a0Var.getStartDate(), a0Var.getEndDate(), true, true));
                textView4.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
            }
            if (a0Var.h0()) {
                if (a0Var.G() == com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_TEAM) {
                    context.getClass();
                    textView3.setText(x.n(context, a0Var));
                    textView3.setVisibility(0);
                    i15 = 8;
                } else {
                    textView3.setText("");
                    i15 = 8;
                    textView3.setVisibility(8);
                }
                textView2.setVisibility(i15);
            } else {
                if (wVar2 == a0Var.G()) {
                    textView3.setText("");
                    textView3.setVisibility(8);
                    textView2.setVisibility(8);
                } else if (com.garmin.android.apps.connectmobile.leaderboard.model.w.AUTO != a0Var.G()) {
                    if (com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_TEAM == a0Var.G()) {
                        context.getClass();
                        textView3.setText(x.n(context, a0Var));
                    } else {
                        context.getClass();
                        textView3.setText(x.k(context, a0Var, str));
                    }
                    i14 = 0;
                    textView3.setVisibility(0);
                    textView2.setVisibility(8);
                } else {
                    i14 = 0;
                    textView3.setText("");
                    textView3.setVisibility(8);
                    textView2.setVisibility(0);
                }
                wVarG = a0Var.G();
                linearProgressIndicator = this.f37686f;
                if (wVar2 == wVarG || p005kotlin.jvm.internal.s.c(a0Var.getBadgeTargetValue(), 0.0d)) {
                    linearProgressIndicator.setVisibility(8);
                } else {
                    linearProgressIndicator.setVisibility(i14);
                    if (a0Var.e0()) {
                        linearProgressIndicator.setIndicatorColor(context.getColor(R.color.gcm_challenges_progress_indicator_completed));
                        linearProgressIndicator.setProgress(100);
                    } else {
                        linearProgressIndicator.setIndicatorColor(context.getColor(R.color.gcm_challenges_progress_indicator));
                        Double badgeProgressValue = a0Var.getBadgeProgressValue();
                        if (badgeProgressValue != null) {
                            double dDoubleValue = badgeProgressValue.doubleValue();
                            Double badgeTargetValue = a0Var.getBadgeTargetValue();
                            Integer numValueOf = badgeTargetValue != null ? Integer.valueOf((int) ((dDoubleValue / badgeTargetValue.doubleValue()) * ((double) 100))) : null;
                            linearProgressIndicator.setProgress(numValueOf != null ? numValueOf.intValue() : 0);
                        }
                    }
                }
                wVarG2 = a0Var.G();
                if ((wVarG2 != com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_AD_HOC || wVarG2 == com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_TEAM) && x.u(context) && a0Var.g0()) {
                    imageView.setVisibility(0);
                    imageView.setImageDrawable(a7.b.getDrawable(context, R.drawable.exterior_link));
                    imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary)));
                } else {
                    imageView.setVisibility(8);
                }
                wVar = null;
                z15 = false;
            }
            i14 = 0;
            wVarG = a0Var.G();
            linearProgressIndicator = this.f37686f;
            if (wVar2 == wVarG) {
                linearProgressIndicator.setVisibility(8);
            } else {
                linearProgressIndicator.setVisibility(8);
            }
            wVarG2 = a0Var.G();
            if (wVarG2 != com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_AD_HOC) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(a7.b.getDrawable(context, R.drawable.exterior_link));
                imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary)));
            } else {
                imageView.setVisibility(0);
                imageView.setImageDrawable(a7.b.getDrawable(context, R.drawable.exterior_link));
                imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary)));
            }
            wVar = null;
            z15 = false;
        } else {
            wVar = null;
            view2.setOnClickListener(null);
            this.itemView.setOnLongClickListener(null);
            imageView2.setImageResource(2131231986);
            v22.e.j(composeView);
            textView.setText("");
            textView4.setText("");
            textView3.setText("");
            z15 = false;
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            imageView.setVisibility(8);
        }
        boolean z24 = (a0Var != null ? a0Var.G() : wVar) == com.garmin.android.apps.connectmobile.leaderboard.model.w.BADGE ? true : z15;
        if (a0Var != null && (endDate = a0Var.getEndDate()) != null) {
            z16 = true;
            if (endDate.isBeforeNow()) {
                z17 = true;
            }
            if (a0Var == null && a0Var.t() == z16) {
                z18 = z16;
            } else {
                z18 = z15;
            }
            if (!z24 && z18 && (z17 || z14)) {
                z19 = z16;
            } else {
                z19 = z15;
            }
            v22.e.r(this.f37691k, z19);
        }
        z16 = true;
        z17 = z15;
        if (a0Var == null) {
            z18 = z15;
        } else {
            z18 = z15;
        }
        if (!z24) {
            z19 = z15;
        } else {
            z19 = z15;
        }
        v22.e.r(this.f37691k, z19);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/n0$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
