package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/x0;", "Lh32/k;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/j0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/x0$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/x0$a;)V", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 extends h32.k<com.garmin.android.apps.connectmobile.leaderboard.model.j0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f37958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f37959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.s f37960f;

    public interface a {
        void d(com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/x0$b;", "", "Landroid/view/View;", TtmlNode.RUBY_CONTAINER, "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/x0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UserLevelImageView f37962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f37963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0 f37964d;

        public b(x0 x0Var, View view2) {
            view2.getClass();
            this.f37964d = x0Var;
            this.f37961a = view2;
            View viewFindViewById = view2.findViewById(R.id.item_icon);
            viewFindViewById.getClass();
            this.f37962b = (UserLevelImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.item_name);
            viewFindViewById2.getClass();
            this.f37963c = (TextView) viewFindViewById2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context, a aVar) {
        super(context);
        context.getClass();
        this.f37958d = context;
        this.f37959e = aVar;
    }

    @Override // h32.k
    public final View c(ViewGroup viewGroup) {
        return e5.e(viewGroup, R.layout.team_challenge_pre_competition_footer, viewGroup, false);
    }

    @Override // h32.k
    public final View e(ViewGroup viewGroup) {
        View viewE = e5.e(viewGroup, R.layout.team_challenge_list_item_header, viewGroup, false);
        viewE.setTag(viewE.findViewById(R.id.list_items_group_header_title));
        return viewE;
    }

    @Override // h32.k
    public final View f(ViewGroup viewGroup) {
        View viewE = e5.e(viewGroup, R.layout.team_challenge_list_item, viewGroup, false);
        viewE.getClass();
        viewE.setTag(new b(this, viewE));
        return viewE;
    }

    @Override // h32.k
    public final void g(int i14, View view2) {
        view2.getClass();
        TextView textView = (TextView) view2.findViewById(R.id.consent_message);
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVar = this.f37960f;
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVar2 = com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k;
        Context context = this.f37958d;
        textView.setText(sVar == sVar2 ? context.getString(R.string.lbl_adhoc_challenge_rules_wheelchair) : context.getString(R.string.lbl_adhoc_challenge_rules));
        if (i14 == 0) {
            textView.setVisibility(8);
        } else {
            if (i14 != 1) {
                return;
            }
            textView.setVisibility(0);
        }
    }

    @Override // h32.k
    public final void h(int i14, View view2) {
        view2.getClass();
        Object tag = view2.getTag();
        tag.getClass();
        b bVar = (b) tag;
        Object item = getItem(i14);
        item.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.j0) item;
        bVar.f37963c.setText(j0Var.getTeamName());
        bVar.f37962b.setImageUrl(j0Var.getProfileImageUrl());
        bVar.f37961a.setOnClickListener(new lq.g(16, bVar.f37964d, j0Var));
    }

    public /* synthetic */ x0(Context context, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : aVar);
    }
}
