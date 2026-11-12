package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z0;
import c22.b3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.social.LegacyCommentsAndLikesActivity;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import java.util.ArrayList;
import java.util.List;
import mt0.h2;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/o0;", "Lmt0/h2;", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/PostCommentView$b;", "Llo1/d$d;", "Llo1/c$a;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class o0 extends h2 implements PostCommentView.b, lo1.d.InterfaceC2172d, lo1.c.a {
    public static final /* synthetic */ int X = 0;
    public mo1.d A;
    public PostCommentView B;
    public TextView C;
    public boolean D;
    public lo1.d<ListAdapter> E;
    public boolean F;
    public boolean I;
    public fo1.o0 P;
    public final c T = new c();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AdHocChallengeDTO f37694z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37695a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37695a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/o0$c", "Lpo1/a;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements po1.a {
        public c() {
        }

        @Override // po1.a
        public final void F() {
            o0 o0Var = o0.this;
            o0Var.D = true;
            o0Var.r7(true);
        }

        @Override // pi2.b
        public final String getIdentifier() {
            String str;
            AdHocChallengeDTO adHocChallengeDTO = o0.this.f37694z;
            return (adHocChallengeDTO == null || (str = adHocChallengeDTO.f37993g) == null) ? "" : str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.ParticipantsWithCommentsListFragment$handlePostComment$1", f = "ParticipantsWithCommentsListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConversationCommentDTO f37697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o0 f37698b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ConversationCommentDTO conversationCommentDTO, o0 o0Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f37697a = conversationCommentDTO;
            this.f37698b = o0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f37697a, this.f37698b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ConversationCommentDTO conversationCommentDTO = this.f37697a;
            if (TextUtils.isEmpty(conversationCommentDTO.f44551f)) {
                conversationCommentDTO.f44551f = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
            }
            f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
            String strZ4 = lVar.z4("PREMIUM_FRIEND");
            if (strZ4 == null) {
                strZ4 = lVar.q4();
            }
            String str = strZ4;
            conversationCommentDTO.f44552g = str;
            conversationCommentDTO.f44561p = new b12.b(str, null, null, null, null, 30, null);
            o0 o0Var = this.f37698b;
            lo1.d<ListAdapter> dVarH7 = o0Var.h7();
            if (dVarH7.f114018f == null) {
                dVarH7.f114018f = new ArrayList();
            }
            dVarH7.f114018f.add(conversationCommentDTO);
            o0Var.h7().notifyDataSetChanged();
            o0Var.hideProgressOverlay();
            if (o0Var.isAdded()) {
                o0Var.u6();
                ListView listView = o0Var.f7311e;
                listView.getClass();
                listView.smoothScrollToPosition(listView.getCount());
            }
            if (o0Var.isAdded()) {
                PostCommentView postCommentView = o0Var.B;
                if (postCommentView == null) {
                    p005kotlin.jvm.internal.s.m("mPostComment");
                    throw null;
                }
                postCommentView.setCommentText("");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37699a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f37699a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37699a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37699a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Override // lo1.d.InterfaceC2172d
    public final void A5() {
        p7();
        ArrayList arrayList = h7().f114018f;
        e7((arrayList != null ? arrayList.size() : 0) + 1);
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public void I6() {
        PostCommentView postCommentView = this.B;
        if (postCommentView != null) {
            postCommentView.k();
        } else {
            p005kotlin.jvm.internal.s.m("mPostComment");
            throw null;
        }
    }

    @Override // lo1.d.InterfaceC2172d
    public final void a0(ConversationCommentDTO conversationCommentDTO) {
        conversationCommentDTO.getClass();
        LegacyCommentsAndLikesActivity.a aVar = LegacyCommentsAndLikesActivity.f44483f;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String str = conversationCommentDTO.f44546a;
        boolean zT = x.t(this.f37694z);
        aVar.getClass();
        Intent intent = new Intent(contextRequireContext, (Class<?>) LegacyCommentsAndLikesActivity.class);
        intent.putExtra("GCM_conversation_comment_id", str);
        intent.putExtra("GCM_challenge_is_vivokid", zT);
        intent.setAction("GCM_action_view_comment_likes");
        contextRequireContext.startActivity(intent);
    }

    @Override // lo1.c.a
    public final void b1(String str) {
        Object systemService = requireContext().getSystemService("clipboard");
        systemService.getClass();
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(getString(R.string.lbl_comment), str));
    }

    public final void d7() {
        q7(true);
        if (!m7()) {
            F6();
        } else {
            S6();
            e7(1);
        }
    }

    public abstract void e7(int i14);

    public abstract ListAdapter f7();

    public final fo1.o0 g7() {
        fo1.o0 o0Var = this.P;
        if (o0Var != null) {
            return o0Var;
        }
        p005kotlin.jvm.internal.s.m("conversationViewModel");
        throw null;
    }

    public final lo1.d<ListAdapter> h7() {
        lo1.d<ListAdapter> dVar = this.E;
        if (dVar != null) {
            return dVar;
        }
        p005kotlin.jvm.internal.s.m("mCommentsAdapter");
        throw null;
    }

    public final void hideProgressOverlay() {
        if (getActivity() != null) {
            com.garmin.android.apps.connectmobile.c cVar = (com.garmin.android.apps.connectmobile.c) getActivity();
            cVar.getClass();
            cVar.hideProgressOverlay();
        }
    }

    public final <T extends ConversationCommentDTO> void i7(g3<? extends List<? extends T>> g3Var, int i14) {
        ArrayList arrayList;
        g3Var.getClass();
        int i15 = b.f37695a[g3Var.f35300a.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    lc.u0.r();
                    return;
                }
                F6();
                hideProgressOverlay();
                lj0.b bVar = lj0.b.f112956j;
                bVar.getClass();
                g22.e.b(this, bVar);
                return;
            }
            return;
        }
        if (i14 == 1 && (arrayList = h7().f114018f) != null) {
            arrayList.clear();
        }
        T t7 = g3Var.f35301b;
        t7.getClass();
        List list = (List) t7;
        if (list.size() > 5) {
            lo1.d<ListAdapter> dVarH7 = h7();
            boolean z14 = !dVarH7.f114024l;
            dVarH7.f114024l = true;
            if (z14) {
                dVarH7.notifyDataSetChanged();
            }
            lo1.d<ListAdapter> dVarH8 = h7();
            List listSubList = list.subList(1, list.size());
            if (dVarH8.f114018f == null) {
                dVarH8.f114018f = new ArrayList();
            }
            if (listSubList != null && !listSubList.isEmpty()) {
                dVarH8.f114018f.addAll(0, listSubList);
            }
        } else {
            lo1.d<ListAdapter> dVarH9 = h7();
            boolean z15 = dVarH9.f114024l;
            dVarH9.f114024l = false;
            if (z15) {
                dVarH9.notifyDataSetChanged();
            }
            lo1.d<ListAdapter> dVarH10 = h7();
            if (dVarH10.f114018f == null) {
                dVarH10.f114018f = new ArrayList();
            }
            if (!list.isEmpty()) {
                dVarH10.f114018f.addAll(0, list);
            }
        }
        h7().notifyDataSetChanged();
        F6();
        hideProgressOverlay();
        if (list.isEmpty()) {
            return;
        }
        ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) list.get(0);
        if (this.A == null) {
            mo1.d dVar = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
            dVar.s(conversationCommentDTO.f44547b);
            this.A = dVar;
        }
        if (this.F) {
            this.F = false;
            l2.f37135b.getClass();
            Bundle bundleC = l2.a.b().c(this);
            if (bundleC == null) {
                bundleC = getArguments();
            }
            if (bundleC != null) {
                bundleC.putBoolean("ARGS_FOCUS_ON_COMMENTS", this.F);
            }
            if (isAdded()) {
                u6();
                ListView listView = this.f7311e;
                listView.getClass();
                listView.smoothScrollToPosition(listView.getCount());
            }
        }
        this.D = false;
        r7(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j7(g3<? extends ConversationCommentDTO> g3Var) {
        g3Var.getClass();
        int i14 = b.f37695a[g3Var.f35300a.ordinal()];
        if (i14 == 1) {
            ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) g3Var.f35301b;
            if (conversationCommentDTO != null) {
                ge1.b.T(g22.f.b(this), null, null, new d(conversationCommentDTO, this, null), 3);
                return;
            }
            if (!zy0.g.a(null) || getContext() == null) {
                o7(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            } else {
                b3.b(requireContext());
            }
            hideProgressOverlay();
            return;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                lc.u0.r();
                return;
            }
            if (!zy0.g.a(g3Var.f35304e) || getContext() == null) {
                o7(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            } else {
                b3.b(requireContext());
            }
            hideProgressOverlay();
        }
    }

    public abstract boolean m7();

    public final void n7() {
        o7(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
    }

    public final void o7(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        if (!isAdded() || cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE) {
            return;
        }
        Toast.makeText(getContext(), R.string.txt_error_occurred, 0).show();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T extends android.widget.ListAdapter, android.widget.Adapter, android.widget.ListAdapter] */
    @Override // mt0.h2, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        String str;
        super.onActivityCreated(bundle);
        u6();
        ListView listView = this.f7311e;
        listView.getClass();
        listView.setOnItemClickListener(new ey.a(this, 5));
        u6();
        this.f7311e.setDividerHeight(0);
        this.E = new lo1.d<>(requireContext(), this);
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        if (adHocChallengeDTO != null && (str = adHocChallengeDTO.f37992f) != null) {
            h7().f114021i = new lo1.c(requireContext(), str, this);
        }
        lo1.d<ListAdapter> dVarH7 = h7();
        ?? F7 = f7();
        DataSetObserver dataSetObserver = dVarH7.f114013a;
        T t7 = dVarH7.f114019g;
        if (t7 != 0) {
            t7.unregisterDataSetObserver(dataSetObserver);
        }
        dVarH7.f114019g = F7;
        if (F7 != 0) {
            F7.registerDataSetObserver(dataSetObserver);
        }
        w6(h7());
        AdHocChallengeDTO adHocChallengeDTO2 = this.f37694z;
        if (adHocChallengeDTO2 != null) {
            DateTime dateTimeN = !TextUtils.isEmpty(adHocChallengeDTO2.f37995i) ? c22.j0.N(adHocChallengeDTO2.f37995i, false) : null;
            if (dateTimeN != null) {
                x xVar = x.f37955a;
                this.I = dateTimeN.plusDays(5).getMillis() < DateTime.now().getMillis();
            }
        }
        d7();
    }

    @Override // mt0.h2, android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getClass();
        menu.getClass();
        super.onCreateActionMode(actionMode, menu);
        q7(false);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.challenge_leaderboard_3_0, viewGroup, false);
    }

    @Override // mt0.h2, android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        actionMode.getClass();
        super.onDestroyActionMode(actionMode);
        q7(true);
        M6(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        po1.j jVar = po1.j.f139048a;
        c cVar = this.T;
        cVar.getClass();
        po1.j.f139049b.remove(cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        po1.j jVar = po1.j.f139048a;
        c cVar = this.T;
        cVar.getClass();
        po1.j.f139049b.add(cVar);
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.post_comment_view);
        viewFindViewById.getClass();
        PostCommentView postCommentView = (PostCommentView) viewFindViewById;
        this.B = postCommentView;
        postCommentView.setPostCommentListener(this);
        View viewFindViewById2 = view2.findViewById(R.id.new_comment_button);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.C = textView;
        textView.setOnClickListener(new mt0.h0(this, 6));
    }

    public final void p7() {
        if (getActivity() != null) {
            com.garmin.android.apps.connectmobile.c cVar = (com.garmin.android.apps.connectmobile.c) getActivity();
            cVar.getClass();
            cVar.showProgressOverlay();
        }
    }

    public final void q7(boolean z14) {
        if (m7() && z14) {
            boolean z15 = this.I;
            PostCommentView postCommentView = this.B;
            if (z15) {
                if (postCommentView == null) {
                    p005kotlin.jvm.internal.s.m("mPostComment");
                    throw null;
                }
                postCommentView.j();
            } else {
                if (postCommentView == null) {
                    p005kotlin.jvm.internal.s.m("mPostComment");
                    throw null;
                }
                postCommentView.setVisibility(0);
            }
            lo1.d<ListAdapter> dVarH7 = h7();
            boolean z16 = !dVarH7.f114022j;
            dVarH7.f114022j = true;
            if (z16) {
                dVarH7.notifyDataSetChanged();
            }
            lo1.d<ListAdapter> dVarH8 = h7();
            boolean z17 = this.I;
            boolean z18 = dVarH8.f114023k != z17;
            dVarH8.f114023k = z17;
            if (z18) {
                dVarH8.notifyDataSetChanged();
            }
        } else {
            PostCommentView postCommentView2 = this.B;
            if (postCommentView2 == null) {
                p005kotlin.jvm.internal.s.m("mPostComment");
                throw null;
            }
            postCommentView2.j();
            lo1.d<ListAdapter> dVarH9 = h7();
            boolean z19 = dVarH9.f114022j;
            dVarH9.f114022j = false;
            if (z19) {
                dVarH9.notifyDataSetChanged();
            }
        }
        r7(z14);
    }

    public final void r7(boolean z14) {
        if (this.D && m7() && !this.f120643x && z14) {
            TextView textView = this.C;
            if (textView != null) {
                textView.setVisibility(0);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mNewCommentButton");
                throw null;
            }
        }
        TextView textView2 = this.C;
        if (textView2 != null) {
            textView2.setVisibility(8);
        } else {
            p005kotlin.jvm.internal.s.m("mNewCommentButton");
            throw null;
        }
    }

    @Override // lo1.d.InterfaceC2172d
    public final void y0(final ConversationCommentDTO conversationCommentDTO) {
        conversationCommentDTO.getClass();
        boolean z14 = conversationCommentDTO.f44556k;
        final int i14 = conversationCommentDTO.f44557l;
        if (z14) {
            conversationCommentDTO.f44556k = false;
            conversationCommentDTO.f44557l = i14 - 1;
            fo1.o0 o0VarG7 = g7();
            String str = conversationCommentDTO.f44546a;
            str.getClass();
            fo1.l0 l0Var = o0VarG7.f72654a;
            l0Var.getClass();
            androidx.lifecycle.j jVarN = o53.f0.N(new fo1.j0(l0Var, str, null));
            final int i15 = 0;
            dh.b.L(jVarN, this, new e(new e23.l(this) { // from class: mt0.n3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.o0 f120772b;

                {
                    this.f120772b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i15;
                    int i17 = i14;
                    ConversationCommentDTO conversationCommentDTO2 = conversationCommentDTO;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.o0 o0Var = this.f120772b;
                    com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                    switch (i16) {
                        case 0:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.o0.X;
                            g3Var.getClass();
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.o0.b.f37695a[g3Var.f35300a.ordinal()];
                            if (i19 != 1 && i19 != 2) {
                                if (i19 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                o0Var.o7(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                                conversationCommentDTO2.f44556k = true;
                                conversationCommentDTO2.f44557l = i17;
                                o0Var.h7().notifyDataSetChanged();
                            }
                            return Unit.INSTANCE;
                        default:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.o0.X;
                            g3Var.getClass();
                            fw.p pVar = g3Var.f35300a;
                            Integer num = g3Var.f35304e;
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.o0.b.f37695a[pVar.ordinal()];
                            if (i25 != 1 && i25 != 2) {
                                if (i25 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                if (zy0.g.a(num)) {
                                    androidx.fragment.app.m activity = o0Var.getActivity();
                                    if (activity != null) {
                                        c22.b3.c(activity);
                                    }
                                } else if (!zy0.g.b(num)) {
                                    o0Var.o7(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                                }
                                conversationCommentDTO2.f44556k = false;
                                conversationCommentDTO2.f44557l = i17;
                                o0Var.h7().notifyDataSetChanged();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
            h7().notifyDataSetChanged();
            return;
        }
        conversationCommentDTO.f44556k = true;
        conversationCommentDTO.f44557l = i14 + 1;
        fo1.o0 o0VarG8 = g7();
        String str2 = conversationCommentDTO.f44546a;
        str2.getClass();
        fo1.l0 l0Var2 = o0VarG8.f72654a;
        l0Var2.getClass();
        androidx.lifecycle.j jVarN2 = o53.f0.N(new fo1.g0(l0Var2, str2, null));
        final int i16 = 1;
        dh.b.L(jVarN2, this, new e(new e23.l(this) { // from class: mt0.n3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.o0 f120772b;

            {
                this.f120772b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                int i18 = i14;
                ConversationCommentDTO conversationCommentDTO2 = conversationCommentDTO;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.o0 o0Var = this.f120772b;
                com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                switch (i17) {
                    case 0:
                        int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.o0.X;
                        g3Var.getClass();
                        int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.o0.b.f37695a[g3Var.f35300a.ordinal()];
                        if (i110 != 1 && i110 != 2) {
                            if (i110 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            o0Var.o7(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                            conversationCommentDTO2.f44556k = true;
                            conversationCommentDTO2.f44557l = i18;
                            o0Var.h7().notifyDataSetChanged();
                        }
                        return Unit.INSTANCE;
                    default:
                        int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.o0.X;
                        g3Var.getClass();
                        fw.p pVar = g3Var.f35300a;
                        Integer num = g3Var.f35304e;
                        int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.o0.b.f37695a[pVar.ordinal()];
                        if (i25 != 1 && i25 != 2) {
                            if (i25 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            if (zy0.g.a(num)) {
                                androidx.fragment.app.m activity = o0Var.getActivity();
                                if (activity != null) {
                                    c22.b3.c(activity);
                                }
                            } else if (!zy0.g.b(num)) {
                                o0Var.o7(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                            }
                            conversationCommentDTO2.f44556k = false;
                            conversationCommentDTO2.f44557l = i18;
                            o0Var.h7().notifyDataSetChanged();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        h7().notifyDataSetChanged();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/o0$a;", "", "<init>", "()V", "", "ARGS_FOCUS_ON_COMMENTS", "Ljava/lang/String;", "", "COMMENTS_LIMIT", "I", "COMMENTS_EMPTY_START_INDEX", "COMMENTS_DISPLAY_LIMIT", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
