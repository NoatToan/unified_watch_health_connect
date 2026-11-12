package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import i3.e5;
import java.util.ArrayList;
import mt0.l2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/c0;", "Lb32/a;", "", "currentUserDisplayName", "", "hasGCPlusSocialFeature", "<init>", "(Ljava/lang/String;Z)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends b32.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f37384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l2 f37385e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/c0$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "", "hasGCPlusSocialFeature", "<init>", "(Landroid/view/ViewGroup;Z)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int f37386n = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f37387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f37388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f37389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UserLevelImageView f37390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LinearProgressIndicator f37391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f37392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f37393g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f37394h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TextView f37395i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ImageView f37396j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final kt0.a f37397k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final gg1.o0 f37398l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ImageView f37399m;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.challenges.c0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0669a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f37400a;

            static {
                int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.w.values().length];
                try {
                    iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.AD_HOC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_AD_HOC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.AUTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.GROUP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_TEAM.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.BADGE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f37400a = iArr;
            }
        }

        public a(ViewGroup viewGroup, boolean z14) {
            super(e5.e(viewGroup, R.layout.leaderboard_challenges_list_item, viewGroup, false));
            this.f37387a = z14;
            View view2 = this.itemView;
            view2.getClass();
            this.f37388b = view2;
            View viewFindViewById = this.itemView.findViewById(R.id.challenge_icon);
            viewFindViewById.getClass();
            this.f37389c = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(R.id.user_profile);
            viewFindViewById2.getClass();
            this.f37390d = (UserLevelImageView) viewFindViewById2;
            View viewFindViewById3 = this.itemView.findViewById(R.id.challenge_progress);
            viewFindViewById3.getClass();
            this.f37391e = (LinearProgressIndicator) viewFindViewById3;
            View viewFindViewById4 = this.itemView.findViewById(R.id.challenge_name);
            viewFindViewById4.getClass();
            this.f37392f = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.itemView.findViewById(R.id.challenge_status);
            viewFindViewById5.getClass();
            this.f37393g = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.itemView.findViewById(R.id.challenge_players);
            viewFindViewById6.getClass();
            this.f37394h = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.itemView.findViewById(R.id.challenge_weekly);
            viewFindViewById7.getClass();
            this.f37395i = (TextView) viewFindViewById7;
            View viewFindViewById8 = this.itemView.findViewById(R.id.exit_to_app_icon);
            viewFindViewById8.getClass();
            this.f37396j = (ImageView) viewFindViewById8;
            this.f37397k = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);
            this.f37398l = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).g();
            View viewFindViewById9 = this.itemView.findViewById(R.id.inflated_point_image);
            viewFindViewById9.getClass();
            this.f37399m = (ImageView) viewFindViewById9;
        }
    }

    public c0(String str, boolean z14) {
        str.getClass();
        this.f37382b = str;
        this.f37383c = z14;
        this.f37384d = new ArrayList();
        this.f37385e = new l2(this, 0);
    }

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(viewGroup, this.f37383c);
    }

    @Override // b32.d
    public final int b() {
        return 1;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        return this.f37385e;
    }

    @Override // b32.d
    public final int getItemCount() {
        return this.f37384d.size();
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        return 0;
    }
}
