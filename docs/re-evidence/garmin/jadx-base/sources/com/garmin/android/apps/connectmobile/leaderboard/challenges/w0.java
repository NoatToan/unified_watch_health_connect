package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import am.c2;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import fo1.b2;
import fo1.z1;
import mt0.a4;
import mt0.c4;
import mt0.d4;
import mt0.e4;
import mt0.h4;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.i3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/w0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/o0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/x0$a;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w0 extends o0 implements x0.a {
    public static final a M0 = new a(null);
    public View H0;
    public View I0;
    public c L0;
    public final Logger Y = gt2.c.b(a2.CHALLENGES.f28756a);
    public final w1 Z = new w1(p005kotlin.jvm.internal.s0.f105811a.b(i3.class), new g(this), new i(this), new h(null, this));

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f37941k0 = o13.m.a(o13.n.NONE, new f(this, null, new e(this), null, null));
    public final o13.t J0 = o13.m.b(new a4(this, 1));
    public final o13.t K0 = o13.m.b(new a4(this, 2));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37942a;

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
            f37942a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/w0$c", "Lb/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = w0.M0;
            w0 w0Var = w0.this;
            if (w0Var.v7().f120648n) {
                w0Var.p7();
                h4 h4VarV7 = w0Var.v7();
                if (h4VarV7.f120603c.length() > 0) {
                    ge1.b.T(v1.a(h4VarV7), null, null, new e4(h4VarV7, null), 3);
                    return;
                }
                return;
            }
            c cVar = w0Var.L0;
            if (cVar == null) {
                p005kotlin.jvm.internal.s.m("onBackPressedCallback");
                throw null;
            }
            cVar.f(false);
            ((b.u) w0Var.K0.getValue()).d();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37944a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f37944a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37944a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37944a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37945a;

        public e(Fragment fragment) {
            this.f37945a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37945a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<h4> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37950e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37946a = fragment;
            this.f37947b = qualifier;
            this.f37948c = aVar;
            this.f37949d = aVar2;
            this.f37950e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, mt0.h4] */
        @Override // e23.a
        public final h4 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37948c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37946a;
            e23.a aVar = this.f37949d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(h4.class), f189591b, null, defaultViewModelCreationExtras, this.f37947b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37950e, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37951a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f37951a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37951a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37953b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37952a = aVar;
            this.f37953b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37952a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37953b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37954a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f37954a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37954a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        super.I6();
        v7().x4();
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
    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.x0.a
    public final void d(com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var) {
        Context context = getContext();
        if (context != null) {
            com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) v7().f120607g.d();
            String teamUuid = j0Var.getTeamUuid();
            if (h0Var == null || teamUuid == null) {
                return;
            }
            TeamChallengePlayersActivity.f37285a.getClass();
            TeamChallengePlayersActivity.a.a(context, h0Var, teamUuid, 0);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    public final void e7(int i14) {
        h4 h4VarV7 = v7();
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        adHocChallengeDTO.getClass();
        c2 c2VarS = x.s(adHocChallengeDTO);
        AdHocChallengeDTO adHocChallengeDTO2 = this.f37694z;
        adHocChallengeDTO2.getClass();
        String str = adHocChallengeDTO2.f37993g;
        str.getClass();
        h4VarV7.getClass();
        c2VarS.getClass();
        fo1.c2 c2Var = h4VarV7.f120601a;
        c2Var.getClass();
        dh.b.L(o53.f0.N(new z1(c2Var, c2VarS, str, i14, 6, null)), this, new d(new ap.b(this, i14, 11)));
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
        h4 h4VarV7 = v7();
        h4VarV7.getClass();
        fo1.c2 c2Var = h4VarV7.f120601a;
        c2Var.getClass();
        dh.b.L(o53.f0.N(new fo1.y1(c2Var, str, str2, conversationCommentDTO, null)), this, new d(new mt0.e0(this, str, str2, str3, 2)));
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView.b
    public final void m6(Editable editable) {
        if (this.A != null) {
            w7(editable);
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
        dh.b.L(androidx.lifecycle.m.a(null, new fo1.f0(l0Var, strName, str, null), 3), this, new d(new ml0.e(7, this, editable)));
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    public final boolean m7() {
        return p005kotlin.jvm.internal.s.g(v7().f120650p.d(), Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 == 4 && i15 == -1) {
            p7();
            h4 h4VarV7 = v7();
            if (h4VarV7.f120603c.length() > 0) {
                ge1.b.T(v1.a(h4VarV7), null, null, new d4(h4VarV7, null), 3);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L0 = new c();
        b.u uVar = (b.u) this.K0.getValue();
        c cVar = this.L0;
        if (cVar != null) {
            uVar.b(cVar, this);
        } else {
            p005kotlin.jvm.internal.s.m("onBackPressedCallback");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    @SuppressLint({"InflateParams"})
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.H0 = com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.challenge_details_header_3_0, null, false);
        return layoutInflater.inflate(R.layout.challenge_leaderboard_3_0, viewGroup, false);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0> g3VarD = v7().f120606f.d();
        this.f37694z = (g3VarD == null || (h0Var = g3VarD.f35301b) == null) ? null : o53.f0.M(h0Var);
        final int i14 = 1;
        v7().f120607g.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: mt0.z3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 f120953b;

            {
                this.f120953b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        j4 j4Var = (j4) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var = this.f120953b;
                        w0Var.Y.debug("fragment teams: " + j4Var);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.x0 x0VarF7 = w0Var.f7();
                        x0VarF7.f81385b.clear();
                        x0VarF7.f81386c.clear();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.x0 x0VarF8 = w0Var.f7();
                        AdHocChallengeDTO adHocChallengeDTO = w0Var.f37694z;
                        x0VarF8.f37960f = adHocChallengeDTO != null ? com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO.f37989c) : null;
                        w0Var.f7().a(w0Var.getString(R.string.social_challenge_your_team), j4Var.f120675a);
                        w0Var.f7().a(w0Var.getString(R.string.social_challenge_opposing_team), j4Var.f120676b);
                        w0Var.f7().notifyDataSetChanged();
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var2 = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var2 = this.f120953b;
                        w0Var2.Y.debug("fragment teamChallenge");
                        h0Var2.getClass();
                        w0Var2.f37694z = o53.f0.M(h0Var2);
                        am.c2 c2Var = am.c2.ADHOC_CHALLENGE;
                        AdHocChallengeDTO adHocChallengeDTO2 = w0Var2.f37694z;
                        adHocChallengeDTO2.getClass();
                        String str = adHocChallengeDTO2.f37993g;
                        str.getClass();
                        fo1.s1 s1Var = new fo1.s1(c2Var, str, null, null, false, false, false, false, 252, null);
                        androidx.lifecycle.y1 f189591b = w0Var2.getF189591b();
                        f189591b.getClass();
                        w0Var2.P = (fo1.o0) new androidx.lifecycle.x1(f189591b, s1Var, null, 4, null).b(p005kotlin.jvm.internal.s0.f105811a.b(fo1.o0.class));
                        View view3 = w0Var2.H0;
                        if (view3 == null) {
                            p005kotlin.jvm.internal.s.m("headerView");
                            throw null;
                        }
                        Context context = view3.getContext();
                        View view4 = w0Var2.H0;
                        if (view4 == null) {
                            p005kotlin.jvm.internal.s.m("headerView");
                            throw null;
                        }
                        TextView textView = (TextView) view4.findViewById(R.id.challenge_details_title);
                        View view5 = w0Var2.H0;
                        if (view5 == null) {
                            p005kotlin.jvm.internal.s.m("headerView");
                            throw null;
                        }
                        TextView textView2 = (TextView) view5.findViewById(R.id.challenge_details_period);
                        context.getClass();
                        textView.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.p(context, w0Var2.f37694z));
                        textView2.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.o(context, w0Var2.f37694z, p005kotlin.jvm.internal.s.g(w0Var2.v7().f120650p.d(), Boolean.TRUE)));
                        return Unit.INSTANCE;
                    default:
                        Boolean bool = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var3 = this.f120953b;
                        w0Var3.Y.debug("fragment userJoined: " + bool);
                        View view6 = w0Var3.I0;
                        if (view6 == null) {
                            p005kotlin.jvm.internal.s.m("challengeDetailsPending");
                            throw null;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        view6.setVisibility(!p005kotlin.jvm.internal.s.g(bool, bool2) ? 0 : 8);
                        boolean zG = p005kotlin.jvm.internal.s.g(bool, bool2);
                        PostCommentView postCommentView = w0Var3.B;
                        if (zG) {
                            if (postCommentView == null) {
                                p005kotlin.jvm.internal.s.m("mPostComment");
                                throw null;
                            }
                            postCommentView.setVisibility(0);
                        } else {
                            if (postCommentView == null) {
                                p005kotlin.jvm.internal.s.m("mPostComment");
                                throw null;
                            }
                            postCommentView.j();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 2;
        v7().f120650p.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: mt0.z3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 f120953b;

            {
                this.f120953b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        j4 j4Var = (j4) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var = this.f120953b;
                        w0Var.Y.debug("fragment teams: " + j4Var);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.x0 x0VarF7 = w0Var.f7();
                        x0VarF7.f81385b.clear();
                        x0VarF7.f81386c.clear();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.x0 x0VarF8 = w0Var.f7();
                        AdHocChallengeDTO adHocChallengeDTO = w0Var.f37694z;
                        x0VarF8.f37960f = adHocChallengeDTO != null ? com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO.f37989c) : null;
                        w0Var.f7().a(w0Var.getString(R.string.social_challenge_your_team), j4Var.f120675a);
                        w0Var.f7().a(w0Var.getString(R.string.social_challenge_opposing_team), j4Var.f120676b);
                        w0Var.f7().notifyDataSetChanged();
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var2 = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var2 = this.f120953b;
                        w0Var2.Y.debug("fragment teamChallenge");
                        h0Var2.getClass();
                        w0Var2.f37694z = o53.f0.M(h0Var2);
                        am.c2 c2Var = am.c2.ADHOC_CHALLENGE;
                        AdHocChallengeDTO adHocChallengeDTO2 = w0Var2.f37694z;
                        adHocChallengeDTO2.getClass();
                        String str = adHocChallengeDTO2.f37993g;
                        str.getClass();
                        fo1.s1 s1Var = new fo1.s1(c2Var, str, null, null, false, false, false, false, 252, null);
                        androidx.lifecycle.y1 f189591b = w0Var2.getF189591b();
                        f189591b.getClass();
                        w0Var2.P = (fo1.o0) new androidx.lifecycle.x1(f189591b, s1Var, null, 4, null).b(p005kotlin.jvm.internal.s0.f105811a.b(fo1.o0.class));
                        View view3 = w0Var2.H0;
                        if (view3 == null) {
                            p005kotlin.jvm.internal.s.m("headerView");
                            throw null;
                        }
                        Context context = view3.getContext();
                        View view4 = w0Var2.H0;
                        if (view4 == null) {
                            p005kotlin.jvm.internal.s.m("headerView");
                            throw null;
                        }
                        TextView textView = (TextView) view4.findViewById(R.id.challenge_details_title);
                        View view5 = w0Var2.H0;
                        if (view5 == null) {
                            p005kotlin.jvm.internal.s.m("headerView");
                            throw null;
                        }
                        TextView textView2 = (TextView) view5.findViewById(R.id.challenge_details_period);
                        context.getClass();
                        textView.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.p(context, w0Var2.f37694z));
                        textView2.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.o(context, w0Var2.f37694z, p005kotlin.jvm.internal.s.g(w0Var2.v7().f120650p.d(), Boolean.TRUE)));
                        return Unit.INSTANCE;
                    default:
                        Boolean bool = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var3 = this.f120953b;
                        w0Var3.Y.debug("fragment userJoined: " + bool);
                        View view6 = w0Var3.I0;
                        if (view6 == null) {
                            p005kotlin.jvm.internal.s.m("challengeDetailsPending");
                            throw null;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        view6.setVisibility(!p005kotlin.jvm.internal.s.g(bool, bool2) ? 0 : 8);
                        boolean zG = p005kotlin.jvm.internal.s.g(bool, bool2);
                        PostCommentView postCommentView = w0Var3.B;
                        if (zG) {
                            if (postCommentView == null) {
                                p005kotlin.jvm.internal.s.m("mPostComment");
                                throw null;
                            }
                            postCommentView.setVisibility(0);
                        } else {
                            if (postCommentView == null) {
                                p005kotlin.jvm.internal.s.m("mPostComment");
                                throw null;
                            }
                            postCommentView.j();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 0;
        v7().f120649o.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: mt0.z3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 f120953b;

            {
                this.f120953b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        j4 j4Var = (j4) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var = this.f120953b;
                        w0Var.Y.debug("fragment teams: " + j4Var);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.x0 x0VarF7 = w0Var.f7();
                        x0VarF7.f81385b.clear();
                        x0VarF7.f81386c.clear();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.x0 x0VarF8 = w0Var.f7();
                        AdHocChallengeDTO adHocChallengeDTO = w0Var.f37694z;
                        x0VarF8.f37960f = adHocChallengeDTO != null ? com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO.f37989c) : null;
                        w0Var.f7().a(w0Var.getString(R.string.social_challenge_your_team), j4Var.f120675a);
                        w0Var.f7().a(w0Var.getString(R.string.social_challenge_opposing_team), j4Var.f120676b);
                        w0Var.f7().notifyDataSetChanged();
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var2 = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var2 = this.f120953b;
                        w0Var2.Y.debug("fragment teamChallenge");
                        h0Var2.getClass();
                        w0Var2.f37694z = o53.f0.M(h0Var2);
                        am.c2 c2Var = am.c2.ADHOC_CHALLENGE;
                        AdHocChallengeDTO adHocChallengeDTO2 = w0Var2.f37694z;
                        adHocChallengeDTO2.getClass();
                        String str = adHocChallengeDTO2.f37993g;
                        str.getClass();
                        fo1.s1 s1Var = new fo1.s1(c2Var, str, null, null, false, false, false, false, 252, null);
                        androidx.lifecycle.y1 f189591b = w0Var2.getF189591b();
                        f189591b.getClass();
                        w0Var2.P = (fo1.o0) new androidx.lifecycle.x1(f189591b, s1Var, null, 4, null).b(p005kotlin.jvm.internal.s0.f105811a.b(fo1.o0.class));
                        View view3 = w0Var2.H0;
                        if (view3 == null) {
                            p005kotlin.jvm.internal.s.m("headerView");
                            throw null;
                        }
                        Context context = view3.getContext();
                        View view4 = w0Var2.H0;
                        if (view4 == null) {
                            p005kotlin.jvm.internal.s.m("headerView");
                            throw null;
                        }
                        TextView textView = (TextView) view4.findViewById(R.id.challenge_details_title);
                        View view5 = w0Var2.H0;
                        if (view5 == null) {
                            p005kotlin.jvm.internal.s.m("headerView");
                            throw null;
                        }
                        TextView textView2 = (TextView) view5.findViewById(R.id.challenge_details_period);
                        context.getClass();
                        textView.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.p(context, w0Var2.f37694z));
                        textView2.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.o(context, w0Var2.f37694z, p005kotlin.jvm.internal.s.g(w0Var2.v7().f120650p.d(), Boolean.TRUE)));
                        return Unit.INSTANCE;
                    default:
                        Boolean bool = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var3 = this.f120953b;
                        w0Var3.Y.debug("fragment userJoined: " + bool);
                        View view6 = w0Var3.I0;
                        if (view6 == null) {
                            p005kotlin.jvm.internal.s.m("challengeDetailsPending");
                            throw null;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        view6.setVisibility(!p005kotlin.jvm.internal.s.g(bool, bool2) ? 0 : 8);
                        boolean zG = p005kotlin.jvm.internal.s.g(bool, bool2);
                        PostCommentView postCommentView = w0Var3.B;
                        if (zG) {
                            if (postCommentView == null) {
                                p005kotlin.jvm.internal.s.m("mPostComment");
                                throw null;
                            }
                            postCommentView.setVisibility(0);
                        } else {
                            if (postCommentView == null) {
                                p005kotlin.jvm.internal.s.m("mPostComment");
                                throw null;
                            }
                            postCommentView.j();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        y0<g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0>> y0Var = v7().f120606f;
        y0Var.m(y0Var.d());
        this.F = v7().f120647m;
        v7().f120647m = false;
        u6();
        this.f7311e.setSelector(android.R.color.transparent);
        u6();
        ListView listView = this.f7311e;
        View view3 = this.H0;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("headerView");
            throw null;
        }
        listView.addHeaderView(view3, null, false);
        View viewFindViewById = view2.findViewById(R.id.challenge_details_pending);
        viewFindViewById.getClass();
        this.I0 = viewFindViewById;
        TextView textView = (TextView) view2.findViewById(R.id.consent_message);
        TextView textView2 = (TextView) view2.findViewById(R.id.challenge_accept);
        TextView textView3 = (TextView) view2.findViewById(R.id.challenge_decline);
        TextView textView4 = (TextView) view2.findViewById(R.id.challenge_declined_undo);
        final LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.challenge_accept_decline_container);
        final LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.challenge_declined_container);
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        textView.setText((adHocChallengeDTO != null ? com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO.f37989c) : null) == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k ? requireContext().getString(R.string.lbl_adhoc_challenge_rules_wheelchair) : requireContext().getString(R.string.lbl_adhoc_challenge_rules));
        textView.setVisibility(8);
        textView2.setOnClickListener(new mt0.h0(this, 7));
        final int i17 = 0;
        textView3.setOnClickListener(new View.OnClickListener() { // from class: mt0.b4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var = this;
                LinearLayout linearLayout3 = linearLayout2;
                LinearLayout linearLayout4 = linearLayout;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.M0;
                        linearLayout4.setVisibility(8);
                        linearLayout3.setVisibility(0);
                        w0Var.v7().f120648n = true;
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.M0;
                        linearLayout4.setVisibility(0);
                        linearLayout3.setVisibility(8);
                        w0Var.v7().f120648n = false;
                        break;
                }
            }
        });
        final int i18 = 1;
        textView4.setOnClickListener(new View.OnClickListener() { // from class: mt0.b4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var = this;
                LinearLayout linearLayout3 = linearLayout2;
                LinearLayout linearLayout4 = linearLayout;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.M0;
                        linearLayout4.setVisibility(8);
                        linearLayout3.setVisibility(0);
                        w0Var.v7().f120648n = true;
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.M0;
                        linearLayout4.setVisibility(0);
                        linearLayout3.setVisibility(8);
                        w0Var.v7().f120648n = false;
                        break;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    /* JADX INFO: renamed from: u7, reason: merged with bridge method [inline-methods] */
    public final x0 f7() {
        return (x0) this.J0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final h4 v7() {
        return (h4) this.f37941k0.getValue();
    }

    public final void w7(Editable editable) {
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
        fo1.c2 c2Var = v7().f120601a;
        c2Var.getClass();
        dh.b.L(o53.f0.N(new b2(c2Var, uuid, conversationCommentDTO, null)), this, new d(new c4(this)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/w0$a;", "", "<init>", "()V", "", "REQ_CODE_AGREE_CHALLENGE_TERMS", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
