package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\t\n\u000bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/e;", "Landroid/widget/ArrayAdapter;", "Lot0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;", "mChallenge", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;)V", "c", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends ArrayAdapter<ot0.a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f37435g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdHocChallengeDTO f37436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseBooleanArray f37438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.model.l f37441f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/e$b;", "", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/e;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f37442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LinearLayout f37443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f37444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LinearLayout f37445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f37446e;

        public b(e eVar) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/e$c;", "", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/e;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup f37447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f37448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public UserLevelImageView f37449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f37450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f37451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f37452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CheckBox f37453g;

        public c(e eVar) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AdHocChallengeDTO adHocChallengeDTO) {
        super(context, R.layout.challenge_leaderboard_list_item_3_0);
        context.getClass();
        adHocChallengeDTO.getClass();
        this.f37436a = adHocChallengeDTO;
        this.f37438c = new SparseBooleanArray();
        this.f37439d = true;
    }

    public final void a(c cVar, ot0.a aVar, int i14) {
        String strR;
        String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
        aVar.getClass();
        if (p005kotlin.jvm.internal.s.g(strValueOf, aVar.f133706a)) {
            cVar.getClass();
            ViewGroup viewGroup = cVar.f37447a;
            viewGroup.getClass();
            viewGroup.setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_surface_3));
            TextView textView = cVar.f37450d;
            textView.getClass();
            textView.setTypeface(h22.a.a("font/roboto_regular.ttf", getContext()));
            boolean z14 = this.f37437b;
            TextView textView2 = cVar.f37448b;
            if (z14) {
                textView2.getClass();
                textView2.setVisibility(8);
            } else {
                textView2.getClass();
                textView2.setVisibility(0);
            }
            CheckBox checkBox = cVar.f37453g;
            checkBox.getClass();
            checkBox.setVisibility(8);
        } else {
            cVar.getClass();
            ViewGroup viewGroup2 = cVar.f37447a;
            viewGroup2.getClass();
            viewGroup2.setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_list_item_background));
            TextView textView3 = cVar.f37450d;
            textView3.getClass();
            textView3.setTypeface(h22.a.a("font/roboto_light.ttf", getContext()));
            boolean z15 = this.f37437b;
            TextView textView4 = cVar.f37448b;
            if (z15) {
                textView4.getClass();
                textView4.setVisibility(4);
                CheckBox checkBox2 = cVar.f37453g;
                checkBox2.getClass();
                checkBox2.setVisibility(0);
            } else {
                textView4.getClass();
                textView4.setVisibility(0);
                CheckBox checkBox3 = cVar.f37453g;
                checkBox3.getClass();
                checkBox3.setVisibility(8);
            }
        }
        TextView textView5 = cVar.f37448b;
        textView5.getClass();
        l3.a aVar2 = l3.f23124b;
        double d14 = aVar.f133709d;
        aVar2.getClass();
        textView5.setText(l3.a.B(d14));
        TextView textView6 = cVar.f37450d;
        textView6.getClass();
        textView6.setText(c22.p0.a(aVar.f133712g, aVar.f133713h));
        TextView textView7 = cVar.f37452f;
        textView7.getClass();
        AdHocChallengeDTO adHocChallengeDTO = this.f37436a;
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO.f37989c);
        if (sVarB != null) {
            Context context = getContext();
            context.getClass();
            strR = x.r(context, sVarB, aVar.f133707b);
        } else {
            strR = null;
        }
        textView7.setText(strR);
        if (p005kotlin.jvm.internal.s.g(aVar.f133714i, Boolean.TRUE)) {
            int i15 = aVar.f133715j;
            UserLevelImageView userLevelImageView = cVar.f37449c;
            if (userLevelImageView != null) {
                userLevelImageView.setImageUrl(uu.i0.d(i15));
            }
        } else {
            UserLevelImageView userLevelImageView2 = cVar.f37449c;
            if (userLevelImageView2 != null) {
                userLevelImageView2.setProfileImageData(aVar.f133717l);
            }
        }
        CheckBox checkBox4 = cVar.f37453g;
        checkBox4.getClass();
        SparseBooleanArray sparseBooleanArray = this.f37438c;
        checkBox4.setChecked(sparseBooleanArray != null ? sparseBooleanArray.get(i14, false) : false);
        com.garmin.android.apps.connectmobile.leaderboard.model.v vVarC = adHocChallengeDTO.C();
        com.garmin.android.apps.connectmobile.leaderboard.model.v vVar = com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED;
        TextView textView8 = cVar.f37451e;
        if (vVarC == vVar) {
            textView8.getClass();
            textView8.setVisibility(8);
            return;
        }
        textView8.getClass();
        textView8.setVisibility(0);
        String str = aVar.f133708c;
        DateTime dateTimeN = TextUtils.isEmpty(str) ? null : c22.j0.N(str, true);
        TextView textView9 = cVar.f37451e;
        if (dateTimeN == null) {
            textView9.getClass();
            textView9.setText(R.string.common_has_not_synced);
        } else {
            textView9.getClass();
            Context context2 = getContext();
            context2.getClass();
            textView9.setText(xy2.b.o(context2, dateTimeN));
        }
    }

    public final c c(View view2) {
        c cVar = new c(this);
        cVar.f37447a = (ViewGroup) view2.findViewById(R.id.challenge_leaderboard_item_container);
        cVar.f37448b = (TextView) view2.findViewById(R.id.challenge_leaderboard_rank);
        cVar.f37449c = (UserLevelImageView) view2.findViewById(R.id.challenge_leaderboard_profile_image);
        cVar.f37450d = (TextView) view2.findViewById(R.id.challenge_leaderboard_name);
        cVar.f37451e = (TextView) view2.findViewById(R.id.challenge_leaderboard_last_sync);
        cVar.f37452f = (TextView) view2.findViewById(R.id.challenge_leaderboard_value);
        cVar.f37453g = (CheckBox) view2.findViewById(R.id.challenge_leaderboard_checkbox);
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.challenge_leaderboard_main_section);
        TextView textView = cVar.f37452f;
        textView.getClass();
        Context context = textView.getContext();
        context.getClass();
        if (c22.b.a(context) > 1.5f) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.getClass();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(21);
            layoutParams2.removeRule(15);
            constraintLayout.getClass();
            layoutParams2.addRule(3, constraintLayout.getId());
            layoutParams2.addRule(18, constraintLayout.getId());
            layoutParams2.setMarginStart(0);
            ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
            layoutParams3.getClass();
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.removeRule(16);
            layoutParams4.removeRule(15);
        }
        return cVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ot0.a getItem(int i14) {
        if (i14 >= 50) {
            return null;
        }
        if (i14 < (super.getCount() <= 50 ? super.getCount() : 50)) {
            return (ot0.a) super.getItem(i14);
        }
        return null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return (super.getCount() <= 50 ? super.getCount() : 50) + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i14) {
        if (i14 < 50) {
            return i14 < (super.getCount() <= 50 ? super.getCount() : 50) ? 0 : 1;
        }
        return 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        c cVarC;
        View viewInflate;
        b bVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        viewGroup.getClass();
        int itemViewType = getItemViewType(i14);
        if (itemViewType == 0) {
            if (view2 == null) {
                viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.challenge_leaderboard_list_item_3_0, viewGroup, false);
                viewInflate.getClass();
                cVarC = c(viewInflate);
                viewInflate.setTag(cVarC);
            } else {
                Object tag = view2.getTag();
                tag.getClass();
                cVarC = (c) tag;
                viewInflate = view2;
            }
            a(cVarC, getItem(i14), i14);
        } else if (itemViewType != 1) {
            viewInflate = view2;
        } else {
            if (view2 == null) {
                viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.challenge_leaderboard_list_footer_3_0, viewGroup, false);
                bVar = new b(this);
                bVar.f37442a = viewInflate;
                bVar.f37443b = (LinearLayout) viewInflate.findViewById(R.id.footer_current_user_rank);
                bVar.f37444c = c(viewInflate);
                bVar.f37445d = (LinearLayout) viewInflate.findViewById(R.id.footer_full_leaderboard);
                bVar.f37446e = (TextView) viewInflate.findViewById(R.id.footer_full_leaderboard_text);
                viewInflate.setTag(bVar);
            } else {
                Object tag2 = view2.getTag();
                tag2.getClass();
                bVar = (b) tag2;
                viewInflate = view2;
            }
            boolean z14 = this.f37440e;
            View view3 = bVar.f37442a;
            if (z14) {
                view3.getClass();
                view3.setVisibility(8);
            } else {
                view3.getClass();
                view3.setVisibility(0);
                TextView textView = bVar.f37446e;
                textView.getClass();
                textView.setOnClickListener(new js0.d(this, 25));
                AdHocChallengeDTO adHocChallengeDTO = this.f37436a;
                AdHocChallengePlayerDTO adHocChallengePlayerDTO = adHocChallengeDTO.f37998l;
                if (adHocChallengePlayerDTO != null) {
                    int count = (super.getCount() > 50 ? 50 : super.getCount()) - 1;
                    while (true) {
                        if (-1 >= count) {
                            LinearLayout linearLayout = bVar.f37443b;
                            linearLayout.getClass();
                            linearLayout.setVisibility(0);
                            AdHocChallengePlayerDTO adHocChallengePlayerDTO2 = adHocChallengeDTO.f37998l;
                            ot0.a aVarX = null;
                            str = null;
                            String str = null;
                            if (adHocChallengePlayerDTO2 != null) {
                                x xVar = x.f37955a;
                                com.garmin.android.apps.connectmobile.userprofile.model.l lVar = this.f37441f;
                                b12.b bVar2 = new b12.b((lVar == null || (profileImageUrls2 = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls2.f46878g, null, null, null, null, 30, null);
                                com.garmin.android.apps.connectmobile.userprofile.model.l lVar2 = this.f37441f;
                                if (lVar2 != null && (profileImageUrls = lVar2.getProfileImageUrls()) != null) {
                                    str = profileImageUrls.f46879h;
                                }
                                b12.b bVar3 = new b12.b(str, null, null, null, null, 30, null);
                                xVar.getClass();
                                aVarX = x.x(adHocChallengePlayerDTO2, bVar2, bVar3);
                            }
                            a(bVar.f37444c, aVarX, i14);
                            break;
                        }
                        ot0.a item = getItem(count);
                        if (item != null && (adHocChallengePlayerDTO.f38010d < item.f133709d || TextUtils.equals(item.f133706a, adHocChallengePlayerDTO.f38007a))) {
                            LinearLayout linearLayout2 = bVar.f37443b;
                            linearLayout2.getClass();
                            linearLayout2.setVisibility(8);
                            break;
                        }
                        count--;
                    }
                } else {
                    LinearLayout linearLayout3 = bVar.f37443b;
                    linearLayout3.getClass();
                    linearLayout3.setVisibility(8);
                    break;
                }
                if (super.getCount() <= 50 || !this.f37439d) {
                    LinearLayout linearLayout4 = bVar.f37445d;
                    linearLayout4.getClass();
                    linearLayout4.setVisibility(8);
                } else {
                    LinearLayout linearLayout5 = bVar.f37445d;
                    linearLayout5.getClass();
                    linearLayout5.setVisibility(0);
                }
            }
        }
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/e$a;", "", "<init>", "()V", "", "MAX_LEADERBOARD_COUNT", "I", "VIEW_TYPE_ITEM", "VIEW_TYPE_FOOTER", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
