package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import mt0.x1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/u0;", "Landroid/widget/ArrayAdapter;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/i0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "currentUserProfileId", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/u0$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/garmin/android/apps/connectmobile/leaderboard/challenges/u0$a;)V", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 extends ArrayAdapter<com.garmin.android.apps.connectmobile.leaderboard.model.i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f37900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.h0 f37901c;

    public interface a {
        void x(com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/u0$b;", "", "Landroid/view/View;", TtmlNode.RUBY_CONTAINER, "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/u0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f37903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UserLevelImageView f37904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f37905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f37906e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f37907f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ u0 f37908g;

        public b(u0 u0Var, View view2) {
            view2.getClass();
            this.f37908g = u0Var;
            this.f37902a = view2;
            View viewFindViewById = view2.findViewById(R.id.challenge_leaderboard_rank);
            viewFindViewById.getClass();
            this.f37903b = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.challenge_leaderboard_profile_image);
            viewFindViewById2.getClass();
            this.f37904c = (UserLevelImageView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.challenge_leaderboard_name);
            viewFindViewById3.getClass();
            this.f37905d = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.challenge_leaderboard_last_sync);
            viewFindViewById4.getClass();
            this.f37906e = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.challenge_leaderboard_value);
            viewFindViewById5.getClass();
            this.f37907f = (TextView) viewFindViewById5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Context context, long j8, a aVar) {
        super(context, R.layout.challenge_leaderboard_list_item_3_0);
        context.getClass();
        this.f37899a = j8;
        this.f37900b = aVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        b12.b bVar;
        DateTime lastSyncTime;
        String strQ;
        viewGroup.getClass();
        if (view2 == null) {
            view2 = androidx.room.a0.d(viewGroup, R.layout.challenge_leaderboard_list_item_3_0, viewGroup, false);
            view2.getClass();
            view2.setTag(new b(this, view2));
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = this.f37901c;
        if (h0Var != null) {
            Object tag = view2.getTag();
            tag.getClass();
            b bVar2 = (b) tag;
            com.garmin.android.apps.connectmobile.leaderboard.model.i0 item = getItem(i14);
            item.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var = item;
            TextView textView = bVar2.f37906e;
            UserLevelImageView userLevelImageView = bVar2.f37904c;
            x1 x1Var = x1.f120920a;
            View view3 = bVar2.f37902a;
            TextView textView2 = bVar2.f37905d;
            long userProfileId = i0Var.getUserProfileId();
            u0 u0Var = bVar2.f37908g;
            boolean z14 = userProfileId == u0Var.f37899a;
            x1Var.getClass();
            x1.a(view3, textView2, z14);
            Integer ranking = i0Var.getRanking();
            if (ranking != null) {
                double dIntValue = ranking.intValue();
                TextView textView3 = bVar2.f37903b;
                l3.f23124b.getClass();
                textView3.setText(l3.a.B(dIntValue));
            }
            textView2.setText(c22.p0.a(i0Var.getFullName(), i0Var.getDisplayName()));
            com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB = h0Var.b();
            if (sVarB != null) {
                DateTime lastSyncTime2 = i0Var.getLastSyncTime();
                TextView textView4 = bVar2.f37907f;
                if (lastSyncTime2 != null) {
                    Context context = u0Var.getContext();
                    context.getClass();
                    Double totalNumber = i0Var.getTotalNumber();
                    textView4.setText(x.r(context, sVarB, totalNumber != null ? totalNumber.doubleValue() : 0.0d));
                } else {
                    textView4.setText(u0Var.getContext().getString(R.string.no_value_card));
                }
            }
            b12.b bVar3 = i0Var.f38208r;
            if (i0Var.o()) {
                userLevelImageView.setImageUrl(uu.i0.d(i0Var.getAvatarId()));
            } else if (bVar3 == null || (bVar = i0Var.f38208r) == null || p005kotlin.jvm.internal.s.g(bVar, b12.b.f14386g)) {
                userLevelImageView.setImageUrl(i0Var.getProfileImageMedium());
            } else {
                userLevelImageView.setProfileImageData(bVar3);
            }
            if (h0Var.f() == com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED || (lastSyncTime = i0Var.getLastSyncTime()) == null) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                c22.j0 j0Var = c22.j0.f23099a;
                Context context2 = u0Var.getContext();
                context2.getClass();
                j0Var.getClass();
                if (p005kotlin.jvm.internal.s.g(lastSyncTime.toLocalDate(), new LocalDate())) {
                    strQ = context2.getString(R.string.mct_lbl_today);
                    strQ.getClass();
                } else {
                    strQ = c22.j0.q(context2, lastSyncTime);
                }
                textView.setText(strQ);
            }
            view3.setOnClickListener(new lq.g(15, u0Var, i0Var));
        }
        return view2;
    }

    public /* synthetic */ u0(Context context, long j8, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, j8, (i14 & 4) != 0 ? null : aVar);
    }
}
