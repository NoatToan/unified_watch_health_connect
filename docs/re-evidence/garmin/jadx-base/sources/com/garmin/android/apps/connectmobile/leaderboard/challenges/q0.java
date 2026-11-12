package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import mt0.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/q0;", "Landroid/widget/ArrayAdapter;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/j0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "currentUserProfileId", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/q0$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/garmin/android/apps/connectmobile/leaderboard/challenges/q0$a;)V", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends ArrayAdapter<com.garmin.android.apps.connectmobile.leaderboard.model.j0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f37801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.h0 f37802c;

    public interface a {
        void d(com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/q0$b;", "", "Landroid/view/View;", TtmlNode.RUBY_CONTAINER, "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/q0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f37804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UserLevelImageView f37805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f37806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f37807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final View f37808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q0 f37809g;

        public b(q0 q0Var, View view2) {
            view2.getClass();
            this.f37809g = q0Var;
            this.f37803a = view2;
            View viewFindViewById = view2.findViewById(R.id.challenge_leaderboard_rank);
            viewFindViewById.getClass();
            this.f37804b = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.challenge_leaderboard_profile_image);
            viewFindViewById2.getClass();
            this.f37805c = (UserLevelImageView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.challenge_leaderboard_checked);
            viewFindViewById3.getClass();
            View viewFindViewById4 = view2.findViewById(R.id.challenge_leaderboard_name);
            viewFindViewById4.getClass();
            this.f37806d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.challenge_leaderboard_last_sync);
            viewFindViewById5.getClass();
            View viewFindViewById6 = view2.findViewById(R.id.challenge_leaderboard_value);
            viewFindViewById6.getClass();
            this.f37807e = (TextView) viewFindViewById6;
            View viewFindViewById7 = view2.findViewById(R.id.footer_divider);
            viewFindViewById7.getClass();
            this.f37808f = viewFindViewById7;
            ((ImageView) viewFindViewById3).setVisibility(8);
            ((TextView) viewFindViewById5).setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, long j8, a aVar) {
        super(context, R.layout.challenge_leaderboard_list_item_3_0);
        context.getClass();
        this.f37800a = j8;
        this.f37801b = aVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        View viewD;
        viewGroup.getClass();
        if (view2 == null) {
            viewD = androidx.room.a0.d(viewGroup, R.layout.challenge_leaderboard_list_item_3_0, viewGroup, false);
            viewD.getClass();
            viewD.setTag(new b(this, viewD));
        } else {
            viewD = view2;
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = this.f37802c;
        if (h0Var == null) {
            return viewD;
        }
        Object tag = viewD.getTag();
        tag.getClass();
        b bVar = (b) tag;
        com.garmin.android.apps.connectmobile.leaderboard.model.j0 item = getItem(i14);
        item.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var = item;
        TextView textView = bVar.f37806d;
        View view3 = bVar.f37803a;
        q0 q0Var = bVar.f37809g;
        List<com.garmin.android.apps.connectmobile.leaderboard.model.i0> listB = j0Var.b();
        Object obj = null;
        if (listB != null) {
            for (Object obj2 : listB) {
                if (((com.garmin.android.apps.connectmobile.leaderboard.model.i0) obj2).getUserProfileId() == q0Var.f37800a) {
                    obj = obj2;
                    break;
                }
            }
            obj = (com.garmin.android.apps.connectmobile.leaderboard.model.i0) obj;
        }
        boolean z14 = obj != null;
        x1.f120920a.getClass();
        x1.a(view3, textView, z14);
        TextView textView2 = bVar.f37804b;
        l3.a aVar = l3.f23124b;
        Integer teamRanking = j0Var.getTeamRanking();
        double dIntValue = teamRanking != null ? teamRanking.intValue() : 0.0d;
        aVar.getClass();
        textView2.setText(l3.a.B(dIntValue));
        textView.setText(j0Var.getTeamName());
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB = h0Var.b();
        if (sVarB != null) {
            TextView textView3 = bVar.f37807e;
            Context context = q0Var.getContext();
            context.getClass();
            Double score = j0Var.getScore();
            textView3.setText(x.r(context, sVarB, score != null ? score.doubleValue() : 0.0d));
        }
        bVar.f37805c.setImageUrl(j0Var.getProfileImageUrl());
        bVar.f37808f.setVisibility(i14 == q0Var.getCount() - 1 ? 0 : 8);
        view3.setOnClickListener(new lq.g(13, q0Var, j0Var));
        return viewD;
    }

    public /* synthetic */ q0(Context context, long j8, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, j8, (i14 & 4) != 0 ? null : aVar);
    }
}
