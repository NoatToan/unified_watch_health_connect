package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import am.c2;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import fo1.b2;
import fo1.z1;
import mt0.h4;
import mt0.v3;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/r0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/o0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/q0$a;", "<init>", "()V", "a", "d", "b", "c", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 extends o0 implements q0.a {
    public static final a K0 = new a(null);
    public b H0;
    public c I0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public d f37813k0;
    public final Logger Y = gt2.c.b(a2.CHALLENGES.f28756a);
    public final Object Z = o13.m.a(o13.n.NONE, new h(this, null, new g(this), null, null));
    public final o13.t J0 = o13.m.b(new mh1.i(this, 14));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/r0$b;", "", "Landroid/view/View;", TtmlNode.RUBY_CONTAINER, "<init>", "(Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f37815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UserLevelImageView f37816c;

        public b(View view2) {
            view2.getClass();
            this.f37814a = view2;
            View viewFindViewById = view2.findViewById(R.id.header_container);
            viewFindViewById.getClass();
            this.f37815b = viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.challenge_leaderboard_current_leader_image);
            viewFindViewById2.getClass();
            this.f37816c = (UserLevelImageView) viewFindViewById2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/r0$c;", "", "Landroid/view/View;", TtmlNode.RUBY_CONTAINER, "<init>", "(Landroid/view/View;)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f37818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f37819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UserLevelImageView f37820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f37821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f37822f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final UserLevelImageView f37823g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a f37824h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/r0$c$a;", "", "", "imageSize", "background", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "textSize", "<init>", "(ILjava/lang/Integer;II)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f37825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f37826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f37827c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f37828d;

            public a(int i14, Integer num, int i15, int i16) {
                this.f37825a = i14;
                this.f37826b = num;
                this.f37827c = i15;
                this.f37828d = i16;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f37825a == aVar.f37825a && p005kotlin.jvm.internal.s.g(this.f37826b, aVar.f37826b) && this.f37827c == aVar.f37827c && this.f37828d == aVar.f37828d;
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f37825a) * 31;
                Integer num = this.f37826b;
                return Integer.hashCode(this.f37828d) + q2.d(this.f37827c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("RankViewResources(imageSize=");
                sb3.append(this.f37825a);
                sb3.append(", background=");
                sb3.append(this.f37826b);
                sb3.append(", textColor=");
                return androidx.core.view.j.e(this.f37827c, this.f37828d, ", textSize=", ")", sb3);
            }
        }

        public c(View view2) {
            view2.getClass();
            this.f37817a = view2;
            View viewFindViewById = view2.findViewById(R.id.header_container);
            viewFindViewById.getClass();
            this.f37818b = viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.leaderboard_header_first_rank);
            viewFindViewById2.getClass();
            this.f37819c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.leaderboard_header_profile_picture_center);
            viewFindViewById3.getClass();
            this.f37820d = (UserLevelImageView) viewFindViewById3;
            this.f37821e = new a(R.dimen.leaderboard_image_large_size, 2131231818, R.color.gcm_text_yellow, R.dimen.leaderboard_ranking_text_size);
            View viewFindViewById4 = view2.findViewById(R.id.leaderboard_header_second_rank);
            viewFindViewById4.getClass();
            this.f37822f = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.leaderboard_header_profile_picture_left);
            viewFindViewById5.getClass();
            this.f37823g = (UserLevelImageView) viewFindViewById5;
            this.f37824h = new a(R.dimen.leaderboard_image_medium_size, null, R.color.gcm_text_primary, R.dimen.andfont_h_2);
            ((TextView) view2.findViewById(R.id.leaderboard_header_third_rank)).setVisibility(8);
            ((UserLevelImageView) view2.findViewById(R.id.leaderboard_header_profile_picture_right)).setVisibility(8);
        }

        public final void a(com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var, TextView textView, UserLevelImageView userLevelImageView, a aVar) {
            Context context = this.f37817a.getContext();
            Resources resources = context.getResources();
            Integer teamRanking = j0Var.getTeamRanking();
            textView.setText(teamRanking != null ? String.valueOf(teamRanking.intValue()) : null);
            textView.setTextColor(a7.b.getColor(context, aVar.f37827c));
            textView.setTextSize(0, c22.b.b(context, resources.getDimension(aVar.f37828d), 1.0f));
            Integer num = aVar.f37826b;
            if (num != null) {
                textView.setBackgroundResource(num.intValue());
            } else {
                textView.setBackground(null);
            }
            userLevelImageView.setImageUrl(j0Var.getProfileImageUrl());
            int dimension = (int) resources.getDimension(aVar.f37825a);
            userLevelImageView.getLayoutParams().height = dimension;
            userLevelImageView.getLayoutParams().width = dimension;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/r0$d;", "", "Landroid/view/View;", TtmlNode.RUBY_CONTAINER, "<init>", "(Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f37830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f37831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f37832d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f37833a;

            static {
                int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.v.values().length];
                try {
                    iArr[com.garmin.android.apps.connectmobile.leaderboard.model.v.STOPPED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.leaderboard.model.v.LOCKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f37833a = iArr;
            }
        }

        public d(View view2) {
            view2.getClass();
            this.f37829a = view2;
            View viewFindViewById = view2.findViewById(R.id.challenge_details_title);
            viewFindViewById.getClass();
            this.f37830b = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.challenge_details_period);
            viewFindViewById2.getClass();
            this.f37831c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.consent_message);
            viewFindViewById3.getClass();
            this.f37832d = (TextView) viewFindViewById3;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37834a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37834a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37835a;

        public f(e23.l lVar) {
            lVar.getClass();
            this.f37835a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37835a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37835a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37836a;

        public g(Fragment fragment) {
            this.f37836a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37836a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<h4> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37841e;

        public h(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37837a = fragment;
            this.f37838b = qualifier;
            this.f37839c = aVar;
            this.f37840d = aVar2;
            this.f37841e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, mt0.h4] */
        @Override // e23.a
        public final h4 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37839c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37837a;
            e23.a aVar = this.f37840d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(h4.class), f189591b, null, defaultViewModelCreationExtras, this.f37838b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37841e, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        super.I6();
        u7().x4();
        d7();
    }

    @Override // mt0.h2
    public final boolean U6(int i14) {
        return false;
    }

    @Override // mt0.h2
    public final boolean V6() {
        return false;
    }

    @Override // mt0.h2
    public final void X6() {
    }

    @Override // mt0.h2
    public final void c7() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.q0.a
    public final void d(com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var) {
        Context context = getContext();
        if (context != null) {
            com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) u7().f120607g.d();
            String teamUuid = j0Var.getTeamUuid();
            if (h0Var == null || teamUuid == null) {
                return;
            }
            TeamChallengePlayersActivity.f37285a.getClass();
            TeamChallengePlayersActivity.a.a(context, h0Var, teamUuid, 1);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    public final void e7(int i14) {
        h4 h4VarU7 = u7();
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        adHocChallengeDTO.getClass();
        c2 c2VarS = x.s(adHocChallengeDTO);
        AdHocChallengeDTO adHocChallengeDTO2 = this.f37694z;
        adHocChallengeDTO2.getClass();
        String str = adHocChallengeDTO2.f37993g;
        str.getClass();
        h4VarU7.getClass();
        c2VarS.getClass();
        fo1.c2 c2Var = h4VarU7.f120601a;
        c2Var.getClass();
        dh.b.L(o53.f0.N(new z1(c2Var, c2VarS, str, i14, 6, null)), this, new f(new ap.b(this, i14, 10)));
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    public final ListAdapter f7() {
        return (q0) this.J0.getValue();
    }

    @Override // lo1.c.a
    public final void k3(ConversationCommentDTO conversationCommentDTO) {
        conversationCommentDTO.getClass();
        String str = conversationCommentDTO.f44547b;
        String str2 = conversationCommentDTO.f44546a;
        String str3 = conversationCommentDTO.f44548c;
        if (str == null || str2 == null || str3 == null) {
            n7();
            return;
        }
        h4 h4VarU7 = u7();
        h4VarU7.getClass();
        fo1.c2 c2Var = h4VarU7.f120601a;
        c2Var.getClass();
        dh.b.L(o53.f0.N(new fo1.y1(c2Var, str, str2, conversationCommentDTO, null)), this, new f(new mt0.e0(this, str, str2, str3, 1)));
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView.b
    public final void m6(Editable editable) {
        if (this.A != null) {
            v7(editable);
            return;
        }
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        adHocChallengeDTO.getClass();
        c2 c2VarS = x.s(adHocChallengeDTO);
        p7();
        AdHocChallengeDTO adHocChallengeDTO2 = this.f37694z;
        if ((adHocChallengeDTO2 != null ? adHocChallengeDTO2.f37993g : null) == null) {
            return;
        }
        fo1.o0 o0VarG7 = g7();
        String strName = c2VarS.name();
        AdHocChallengeDTO adHocChallengeDTO3 = this.f37694z;
        adHocChallengeDTO3.getClass();
        String str = adHocChallengeDTO3.f37993g;
        str.getClass();
        strName.getClass();
        fo1.l0 l0Var = o0VarG7.f72654a;
        l0Var.getClass();
        dh.b.L(androidx.lifecycle.m.a(null, new fo1.f0(l0Var, strName, str, null), 3), this, new f(new ml0.e(6, this, editable)));
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    public final boolean m7() {
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    @SuppressLint({"InflateParams"})
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.challenge_details_header_3_0, (ViewGroup) null, false);
        viewInflate.getClass();
        this.f37813k0 = new d(viewInflate);
        View viewInflate2 = layoutInflater.inflate(R.layout.challenge_leaderboard_header_3_0, (ViewGroup) null, false);
        viewInflate2.getClass();
        this.H0 = new b(viewInflate2);
        View viewInflate3 = layoutInflater.inflate(R.layout.ad_hoc_challenge_leaderboard_podium_header, (ViewGroup) null, false);
        viewInflate3.getClass();
        this.I0 = new c(viewInflate3);
        return layoutInflater.inflate(R.layout.challenge_leaderboard_3_0, viewGroup, false);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (getActivity() != null) {
            g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0> g3VarD = u7().f120606f.d();
            this.f37694z = (g3VarD == null || (h0Var = g3VarD.f35301b) == null) ? null : o53.f0.M(h0Var);
        }
        u7().f120607g.f(getViewLifecycleOwner(), new f(new mh1.x(this, 11)));
        y0<g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0>> y0Var = u7().f120606f;
        y0Var.m(y0Var.d());
        this.F = u7().f120647m;
        u7().f120647m = false;
        u6();
        ListView listView = this.f7311e;
        d dVar = this.f37813k0;
        if (dVar == null) {
            p005kotlin.jvm.internal.s.m("titleHeaderViewHolder");
            throw null;
        }
        listView.addHeaderView(dVar.f37829a, null, false);
        u6();
        ListView listView2 = this.f7311e;
        b bVar = this.H0;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("currentLeaderHeaderViewHolder");
            throw null;
        }
        listView2.addHeaderView(bVar.f37814a, null, false);
        u6();
        ListView listView3 = this.f7311e;
        c cVar = this.I0;
        if (cVar != null) {
            listView3.addHeaderView(cVar.f37817a, null, false);
        } else {
            p005kotlin.jvm.internal.s.m("podiumHeaderViewHolder");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final h4 u7() {
        return (h4) this.Z.getValue();
    }

    public final void v7(Editable editable) {
        String uuid;
        p7();
        ConversationCommentDTO conversationCommentDTO = new ConversationCommentDTO();
        conversationCommentDTO.f44555j = editable.toString();
        mo1.d dVar = this.A;
        if (dVar != null) {
            String uuid2 = dVar.getUuid();
            uuid2.getClass();
            conversationCommentDTO.f44547b = uuid2;
        }
        conversationCommentDTO.f44559n = null;
        mo1.d dVar2 = this.A;
        if (dVar2 == null || (uuid = dVar2.getUuid()) == null) {
            uuid = "";
        }
        fo1.c2 c2Var = u7().f120601a;
        c2Var.getClass();
        dh.b.L(o53.f0.N(new b2(c2Var, uuid, conversationCommentDTO, null)), this, new f(new v3(this)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/r0$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
