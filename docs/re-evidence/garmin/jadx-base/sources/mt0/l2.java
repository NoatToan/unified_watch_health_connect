package mt0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l2 implements b32.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b32.a f120702b;

    public /* synthetic */ l2(b32.a aVar, int i14) {
        this.f120701a = i14;
        this.f120702b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0301  */
    /* JADX WARN: Code duplicated, block: B:101:0x030d  */
    /* JADX WARN: Code duplicated, block: B:103:0x031e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0321  */
    /* JADX WARN: Code duplicated, block: B:106:0x0332  */
    /* JADX WARN: Code duplicated, block: B:107:0x0343  */
    /* JADX WARN: Code duplicated, block: B:110:0x0355  */
    /* JADX WARN: Code duplicated, block: B:112:0x0362  */
    /* JADX WARN: Code duplicated, block: B:115:0x036c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0384  */
    /* JADX WARN: Code duplicated, block: B:119:0x0389  */
    /* JADX WARN: Code duplicated, block: B:131:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x0250  */
    /* JADX WARN: Code duplicated, block: B:67:0x0255  */
    /* JADX WARN: Code duplicated, block: B:69:0x025f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0267  */
    /* JADX WARN: Code duplicated, block: B:80:0x0290  */
    /* JADX WARN: Code duplicated, block: B:83:0x029e  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:87:0x02af  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:96:0x02df  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ea  */
    @Override // b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) {
        com.garmin.android.apps.connectmobile.leaderboard.model.w wVar;
        boolean z14;
        com.garmin.android.apps.connectmobile.leaderboard.model.w wVarG;
        com.garmin.android.apps.connectmobile.leaderboard.model.w wVar2;
        boolean z15;
        int i15;
        int i16;
        com.garmin.android.apps.connectmobile.leaderboard.model.w wVarG2;
        Integer currentPlayerType;
        Double badgeProgressValue;
        Double badgeTargetValue;
        String name;
        b12.b bVar;
        ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.m> arrayList;
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar;
        String strD;
        String string;
        switch (this.f120701a) {
            case 0:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.c0 c0Var = (com.garmin.android.apps.connectmobile.leaderboard.challenges.c0) this.f120702b;
                f0Var.getClass();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.c0.a aVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.c0.a) f0Var;
                ArrayList arrayList2 = c0Var.f37384d;
                com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.a0) arrayList2.get(i14);
                arrayList2.size();
                String str = c0Var.f37382b;
                TextView textView = aVar.f37394h;
                TextView textView2 = aVar.f37395i;
                gg1.o0 o0Var = aVar.f37398l;
                TextView textView3 = aVar.f37393g;
                TextView textView4 = aVar.f37392f;
                LinearProgressIndicator linearProgressIndicator = aVar.f37391e;
                ImageView imageView = aVar.f37389c;
                ImageView imageView2 = aVar.f37396j;
                UserLevelImageView userLevelImageView = aVar.f37390d;
                str.getClass();
                Context context = aVar.itemView.getContext();
                View view2 = aVar.f37388b;
                if (a0Var == null) {
                    view2.setOnClickListener(null);
                    view2.setOnLongClickListener(null);
                    imageView.setImageResource(2131231986);
                    v22.e.l(userLevelImageView);
                    textView4.setText("");
                    textView3.setText("");
                    textView.setText("");
                    textView2.setVisibility(8);
                    imageView2.setVisibility(8);
                } else {
                    view2.setOnClickListener(new bv2.j(context, 22, a0Var, aVar));
                    v22.e.l(imageView);
                    v22.e.l(userLevelImageView);
                    com.garmin.android.apps.connectmobile.leaderboard.model.w wVarG3 = a0Var.G();
                    com.garmin.android.apps.connectmobile.leaderboard.model.w wVar3 = com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_AD_HOC;
                    if (wVarG3 == wVar3) {
                        wVar = wVar3;
                        if (a0Var.getWinnerAvatarId() != -1) {
                            userLevelImageView.setVisibility(0);
                            userLevelImageView.setImageUrl(uu.i0.d(a0Var.getWinnerAvatarId()));
                            z14 = true;
                        }
                        wVarG = a0Var.G();
                        wVar2 = com.garmin.android.apps.connectmobile.leaderboard.model.w.BADGE;
                        if (wVarG != wVar2 && a0Var.getBadgeId() != null) {
                            imageView.setVisibility(0);
                            String strB = uu.i0.b((int) a0Var.getBadgeId().longValue(), a0Var.getBadgeUuid());
                            context.getClass();
                            zp0.c cVar = new zp0.c(context);
                            cVar.f206565e = strB;
                            cVar.f206570j = 2131231129;
                            cVar.f206578r = "cache_availability_today";
                            cVar.h(imageView);
                            z14 = true;
                        }
                        if (!z14) {
                            bVar = a0Var.X;
                            if (p005kotlin.jvm.internal.s.g(b12.b.f14386g, bVar)) {
                                userLevelImageView.setVisibility(0);
                                userLevelImageView.setImageUrl(a0Var.getWinnerProfileImageSmall());
                            } else {
                                userLevelImageView.setVisibility(0);
                                userLevelImageView.setProfileImageData(bVar);
                            }
                        }
                        ImageView imageView3 = aVar.f37399m;
                        if (TextUtils.isEmpty(a0Var.getName()) && wVar2 == a0Var.G() && aVar.f37387a && a0Var.t()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        v22.e.r(imageView3, z15);
                        if (TextUtils.isEmpty(a0Var.getName())) {
                            if (wVar2 == a0Var.G()) {
                                textView4.setText(a0Var.j());
                            } else {
                                textView4.setText(com.garmin.android.apps.connectmobile.leaderboard.model.s.a(a0Var.d()));
                            }
                        } else if (com.garmin.android.apps.connectmobile.leaderboard.model.w.AUTO == a0Var.G()) {
                            context.getClass();
                            name = a0Var.getName();
                            if (name == null) {
                                name = "";
                            }
                            textView4.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.d(context, name));
                        } else {
                            textView4.setText(a0Var.getName());
                        }
                        if (a0Var.a0()) {
                            context.getClass();
                            textView3.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.b(context, a0Var, o0Var));
                        } else {
                            context.getClass();
                            textView3.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.l(context, a0Var, o0Var));
                            textView3.setContentDescription(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.m(context, a0Var, o0Var));
                        }
                        if (a0Var.a0()) {
                            textView2.setVisibility(8);
                            textView.setVisibility(8);
                            i16 = 0;
                        } else {
                            i15 = com.garmin.android.apps.connectmobile.leaderboard.challenges.c0.a.C0669a.f37400a[a0Var.G().ordinal()];
                            if (i15 != 3) {
                                i16 = 0;
                                textView2.setVisibility(0);
                                textView.setText("");
                                textView.setVisibility(8);
                            } else if (i15 != 5) {
                                textView.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.k(context, a0Var, str));
                                i16 = 0;
                                textView.setVisibility(0);
                                textView2.setVisibility(8);
                            } else {
                                i16 = 0;
                                textView.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.n(context, a0Var));
                                textView.setVisibility(0);
                                textView2.setVisibility(8);
                            }
                        }
                        if (wVar2 == a0Var.G()) {
                            linearProgressIndicator.setVisibility(i16);
                            badgeProgressValue = a0Var.getBadgeProgressValue();
                            badgeTargetValue = a0Var.getBadgeTargetValue();
                            if (badgeProgressValue != null) {
                                linearProgressIndicator.setProgress(0);
                            } else if (badgeTargetValue != null || p005kotlin.jvm.internal.s.c(badgeTargetValue, 0.0d)) {
                                linearProgressIndicator.setProgress(0);
                            } else {
                                linearProgressIndicator.setProgress((int) ((badgeProgressValue.doubleValue() / badgeTargetValue.doubleValue()) * ((double) 100)));
                            }
                        } else {
                            linearProgressIndicator.setVisibility(8);
                        }
                        wVarG2 = a0Var.G();
                        if ((wVarG2 == wVar || wVarG2 == com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_TEAM) && com.garmin.android.apps.connectmobile.leaderboard.challenges.x.u(context)) {
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.GUARDIAN.f38167a;
                            currentPlayerType = a0Var.getCurrentPlayerType();
                            if (currentPlayerType == null || i17 != currentPlayerType.intValue()) {
                                imageView2.setVisibility(8);
                            } else {
                                Drawable drawable = a7.b.getDrawable(context, R.drawable.exterior_link);
                                imageView2.setVisibility(0);
                                imageView2.setImageDrawable(drawable);
                                imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary)));
                            }
                        } else {
                            imageView2.setVisibility(8);
                        }
                    } else {
                        wVar = wVar3;
                    }
                    z14 = false;
                    wVarG = a0Var.G();
                    wVar2 = com.garmin.android.apps.connectmobile.leaderboard.model.w.BADGE;
                    if (wVarG != wVar2) {
                    }
                    if (!z14) {
                        bVar = a0Var.X;
                        if (p005kotlin.jvm.internal.s.g(b12.b.f14386g, bVar)) {
                            userLevelImageView.setVisibility(0);
                            userLevelImageView.setProfileImageData(bVar);
                        } else {
                            userLevelImageView.setVisibility(0);
                            userLevelImageView.setImageUrl(a0Var.getWinnerProfileImageSmall());
                        }
                    }
                    ImageView imageView4 = aVar.f37399m;
                    if (TextUtils.isEmpty(a0Var.getName())) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    v22.e.r(imageView4, z15);
                    if (TextUtils.isEmpty(a0Var.getName())) {
                        if (com.garmin.android.apps.connectmobile.leaderboard.model.w.AUTO == a0Var.G()) {
                            context.getClass();
                            name = a0Var.getName();
                            if (name == null) {
                                name = "";
                            }
                            textView4.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.d(context, name));
                        } else {
                            textView4.setText(a0Var.getName());
                        }
                    } else if (wVar2 == a0Var.G()) {
                        textView4.setText(a0Var.j());
                    } else {
                        textView4.setText(com.garmin.android.apps.connectmobile.leaderboard.model.s.a(a0Var.d()));
                    }
                    if (a0Var.a0()) {
                        context.getClass();
                        textView3.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.b(context, a0Var, o0Var));
                    } else {
                        context.getClass();
                        textView3.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.l(context, a0Var, o0Var));
                        textView3.setContentDescription(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.m(context, a0Var, o0Var));
                    }
                    if (a0Var.a0()) {
                        textView2.setVisibility(8);
                        textView.setVisibility(8);
                        i16 = 0;
                    } else {
                        i15 = com.garmin.android.apps.connectmobile.leaderboard.challenges.c0.a.C0669a.f37400a[a0Var.G().ordinal()];
                        if (i15 != 3) {
                            i16 = 0;
                            textView2.setVisibility(0);
                            textView.setText("");
                            textView.setVisibility(8);
                        } else if (i15 != 5) {
                            textView.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.k(context, a0Var, str));
                            i16 = 0;
                            textView.setVisibility(0);
                            textView2.setVisibility(8);
                        } else {
                            i16 = 0;
                            textView.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.n(context, a0Var));
                            textView.setVisibility(0);
                            textView2.setVisibility(8);
                        }
                    }
                    if (wVar2 == a0Var.G()) {
                        linearProgressIndicator.setVisibility(i16);
                        badgeProgressValue = a0Var.getBadgeProgressValue();
                        badgeTargetValue = a0Var.getBadgeTargetValue();
                        if (badgeProgressValue != null) {
                            linearProgressIndicator.setProgress(0);
                        } else if (badgeTargetValue != null) {
                            linearProgressIndicator.setProgress(0);
                        } else {
                            linearProgressIndicator.setProgress(0);
                        }
                    } else {
                        linearProgressIndicator.setVisibility(8);
                    }
                    wVarG2 = a0Var.G();
                    if (wVarG2 == wVar) {
                        int i18 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.GUARDIAN.f38167a;
                        currentPlayerType = a0Var.getCurrentPlayerType();
                        if (currentPlayerType == null) {
                            Drawable drawable2 = a7.b.getDrawable(context, R.drawable.exterior_link);
                            imageView2.setVisibility(0);
                            imageView2.setImageDrawable(drawable2);
                            imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary)));
                        }
                        imageView2.setVisibility(8);
                    } else {
                        int i19 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.GUARDIAN.f38167a;
                        currentPlayerType = a0Var.getCurrentPlayerType();
                        if (currentPlayerType == null) {
                            Drawable drawable3 = a7.b.getDrawable(context, R.drawable.exterior_link);
                            imageView2.setVisibility(0);
                            imageView2.setImageDrawable(drawable3);
                            imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary)));
                        }
                        imageView2.setVisibility(8);
                    }
                    imageView2.setVisibility(8);
                }
                break;
            default:
                uu.a.b bVar2 = (uu.a.b) this.f120702b;
                f0Var.getClass();
                uu.a aVar2 = bVar2.f172646c;
                if (aVar2 != null && (arrayList = aVar2.f172630c) != null && (mVar = (com.garmin.android.apps.connectmobile.badges.service.model.m) p13.h0.e0(i14 - 1, arrayList)) != null) {
                    uu.a.C3226a c3226a = (uu.a.C3226a) f0Var;
                    boolean z16 = i14 != bVar2.getItemCount() + (-2);
                    boolean z17 = bVar2.f172647d;
                    TextView textView5 = c3226a.f172639h;
                    TextView textView6 = c3226a.f172638g;
                    TextView textView7 = c3226a.f172637f;
                    TextView textView8 = c3226a.f172636e;
                    ProgressBar progressBar = c3226a.f172641j;
                    Context context2 = c3226a.f172643l;
                    zp0.c cVar2 = new zp0.c(context2);
                    cVar2.f206565e = mVar.t();
                    cVar2.f206570j = 2131231129;
                    cVar2.f206576p = true;
                    cVar2.f206578r = "cache_availability_today";
                    ImageView imageView5 = c3226a.f172634c;
                    cVar2.h(imageView5);
                    imageView5.setColorFilter(uu.p.c(!mVar.getIsBadgeEarned()));
                    int i24 = mVar.o().f30564b;
                    if (i24 == 1) {
                        string = context2.getString(R.string.lbl_user_level_points_abbr_singular);
                        strD = p6.b.d(context2, R.string.social_one_point, string);
                    } else {
                        String string2 = context2.getString(R.string.social_points, String.valueOf(i24));
                        string2.getClass();
                        String string3 = context2.getString(R.string.lbl_number_points, String.valueOf(i24));
                        string3.getClass();
                        strD = string3;
                        string = string2;
                    }
                    c3226a.f172635d.setText(mVar.A());
                    v22.e.r(c3226a.f172644m, z17 && mVar.o0());
                    textView8.setText(context2.getString(R.string.string_space_bullet_string_pattern, string, mVar.m()));
                    textView8.setContentDescription(context2.getString(R.string.string_space_bullet_string_pattern, strD, mVar.m()));
                    textView7.setVisibility(8);
                    textView6.setVisibility(8);
                    textView5.setVisibility(8);
                    boolean zB = mVar.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_SINGLE);
                    boolean zB2 = mVar.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_ANNUAL);
                    boolean zB3 = mVar.b(com.garmin.android.apps.connectmobile.badges.service.model.j.REPEATABLE);
                    v22.e.r(textView6, (!zB3 && zB2) || zB || mVar.b(com.garmin.android.apps.connectmobile.badges.service.model.j.SERIES_EVENTS));
                    v22.e.r(textView7, zB3);
                    if (mVar.getAssocTypeId() == com.garmin.android.apps.connectmobile.badges.service.model.a.BADGE_CHALLENGE.f30551a) {
                        textView5.setVisibility(0);
                    }
                    if (!mVar.b(com.garmin.android.apps.connectmobile.badges.service.model.j.CUMULATIVE) || mVar.getBadgeProgressValue() <= 0.0d) {
                        progressBar.setVisibility(8);
                    } else {
                        int badgeProgressValue2 = (int) ((mVar.getBadgeProgressValue() / mVar.getBadgeTargetValue()) * ((double) 100));
                        progressBar.setProgress(badgeProgressValue2);
                        progressBar.setVisibility(0);
                        progressBar.setContentDescription(context2.getString(R.string.lbl_progress_value_percent, String.valueOf(badgeProgressValue2)) + "%");
                        if (Build.VERSION.SDK_INT >= 30) {
                            progressBar.setStateDescription("⠀");
                        }
                    }
                    View view3 = c3226a.f172642k;
                    if (z16) {
                        view3.setVisibility(0);
                    } else {
                        view3.setVisibility(8);
                    }
                    c3226a.f172633b.setOnClickListener(new u12.e(7, c3226a, mVar));
                    if (c22.b.a(context2) > 1.8f) {
                        c3226a.f172640i.setOrientation(1);
                    }
                    break;
                }
                break;
        }
    }
}
