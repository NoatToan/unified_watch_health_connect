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
import mt0.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/s0;", "Lh32/k;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/i0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "currentUserProfileId", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/s0$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/garmin/android/apps/connectmobile/leaderboard/challenges/s0$a;)V", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 extends h32.k<com.garmin.android.apps.connectmobile.leaderboard.model.i0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f37883e;

    public interface a {
        void x(com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/s0$b;", "", "Landroid/view/View;", TtmlNode.RUBY_CONTAINER, "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/s0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UserLevelImageView f37885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f37886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s0 f37887d;

        public b(s0 s0Var, View view2) {
            view2.getClass();
            this.f37887d = s0Var;
            this.f37884a = view2;
            View viewFindViewById = view2.findViewById(R.id.item_icon);
            viewFindViewById.getClass();
            this.f37885b = (UserLevelImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.item_name);
            viewFindViewById2.getClass();
            this.f37886c = (TextView) viewFindViewById2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, long j8, a aVar) {
        super(context);
        context.getClass();
        this.f37882d = j8;
        this.f37883e = aVar;
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
    public final void h(int i14, View view2) {
        b12.b bVar;
        view2.getClass();
        Object tag = view2.getTag();
        tag.getClass();
        b bVar2 = (b) tag;
        Object item = getItem(i14);
        item.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.i0) item;
        UserLevelImageView userLevelImageView = bVar2.f37885b;
        x1 x1Var = x1.f120920a;
        View view3 = bVar2.f37884a;
        TextView textView = bVar2.f37886c;
        long userProfileId = i0Var.getUserProfileId();
        s0 s0Var = bVar2.f37887d;
        boolean z14 = userProfileId == s0Var.f37882d;
        x1Var.getClass();
        x1.a(view3, textView, z14);
        textView.setText(c22.p0.a(i0Var.getFullName(), i0Var.getDisplayName()));
        b12.b bVar3 = i0Var.f38208r;
        if (i0Var.o()) {
            userLevelImageView.setImageUrl(uu.i0.d(i0Var.getAvatarId()));
        } else if (bVar3 == null || (bVar = i0Var.f38208r) == null || p005kotlin.jvm.internal.s.g(bVar, b12.b.f14386g)) {
            userLevelImageView.setImageUrl(i0Var.getProfileImageMedium());
        } else {
            userLevelImageView.setProfileImageData(bVar3);
        }
        view3.setOnClickListener(new lq.g(14, s0Var, i0Var));
    }

    public /* synthetic */ s0(Context context, long j8, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, j8, (i14 & 4) != 0 ? null : aVar);
    }
}
