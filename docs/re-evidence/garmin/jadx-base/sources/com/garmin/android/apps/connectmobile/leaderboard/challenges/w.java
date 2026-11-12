package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/w;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l0$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/view/View;Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l0$c;)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends RecyclerView.f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f37932i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.c f37933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f37934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f37935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f37936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f37937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f37938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ComposeView f37939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f37940h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(View view2, l0.c cVar) {
        super(view2);
        view2.getClass();
        cVar.getClass();
        this.f37933a = cVar;
        View view3 = this.itemView;
        view3.getClass();
        this.f37934b = view3;
        View viewFindViewById = this.itemView.findViewById(R.id.challenge_icon);
        viewFindViewById.getClass();
        this.f37935c = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.challenge_name);
        viewFindViewById2.getClass();
        this.f37936d = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.challenge_status);
        viewFindViewById3.getClass();
        this.f37937e = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.challenge_players);
        viewFindViewById4.getClass();
        this.f37938f = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R.id.challenge_join_compose);
        viewFindViewById5.getClass();
        this.f37939g = (ComposeView) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(R.id.inflated_point_image);
        viewFindViewById6.getClass();
        this.f37940h = (ImageView) viewFindViewById6;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/w$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
