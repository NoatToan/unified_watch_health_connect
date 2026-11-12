package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.CompletedChallengesActivity;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.CompletedChallengesActivity$initChallengesAdapter$1", f = "CompletedChallengesActivity.kt", l = {81}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CompletedChallengesActivity f37966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CompletedChallengesActivity f37968c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.CompletedChallengesActivity$initChallengesAdapter$1$hasGCPlusSocialFeature$1", f = "CompletedChallengesActivity.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37969a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f37969a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            c80.q qVar = c80.q.SOCIAL;
            this.f37969a = 1;
            Object objL = j1Var.l(qVar, this);
            return objL == aVar ? aVar : objL;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(CompletedChallengesActivity completedChallengesActivity, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f37968c = completedChallengesActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f37968c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        CompletedChallengesActivity completedChallengesActivity;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f37967b;
        final int i15 = 1;
        final CompletedChallengesActivity completedChallengesActivity2 = this.f37968c;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(null);
            this.f37966a = completedChallengesActivity2;
            this.f37967b = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            completedChallengesActivity = completedChallengesActivity2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            completedChallengesActivity = this.f37966a;
            o13.r.b(obj);
        }
        m0 m0Var = new m0(completedChallengesActivity, ((Boolean) obj).booleanValue());
        completedChallengesActivity2.f37245b = m0Var;
        RecyclerView recyclerView = completedChallengesActivity2.f37246c;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView.setAdapter(m0Var);
        s51.a aVar3 = (s51.a) completedChallengesActivity2.ca().f140797d.getValue();
        final int i16 = 0;
        aVar3.f157370a.f(completedChallengesActivity, new CompletedChallengesActivity.b(new e23.l() { // from class: mt0.d2
            @Override // e23.l
            public final Object invoke(Object obj2) {
                switch (i16) {
                    case 0:
                        yc.m2 m2Var = (yc.m2) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.m0 m0Var2 = completedChallengesActivity2.f37245b;
                        if (m0Var2 != null) {
                            m0Var2.t(m2Var);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("listAdapter");
                        throw null;
                    case 1:
                        s51.e eVar = (s51.e) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.m0 m0Var3 = completedChallengesActivity2.f37245b;
                        if (m0Var3 != null) {
                            m0Var3.u(eVar);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("listAdapter");
                        throw null;
                    case 2:
                        s51.e eVar2 = (s51.e) obj2;
                        SwipeRefreshLayout swipeRefreshLayout = completedChallengesActivity2.f37248e;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(eVar2 == s51.e.LOADING);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeRefreshView");
                        throw null;
                    default:
                        Boolean bool = (Boolean) obj2;
                        CompletedChallengesActivity completedChallengesActivity3 = completedChallengesActivity2;
                        TextView textView = completedChallengesActivity3.f37249f;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("emptyStateTitle");
                            throw null;
                        }
                        bool.getClass();
                        textView.setVisibility(bool.booleanValue() ? 0 : 8);
                        RecyclerView recyclerView2 = completedChallengesActivity3.f37246c;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView2.setVisibility(!bool.booleanValue() ? 0 : 8);
                        ComposeView composeView = completedChallengesActivity3.f37247d;
                        if (composeView == null) {
                            p005kotlin.jvm.internal.s.m("composeView");
                            throw null;
                        }
                        List<ot0.g> listD = completedChallengesActivity3.ca().f140796c.f120703a.d();
                        composeView.setVisibility((listD != null ? listD.size() : 0) > 1 && !bool.booleanValue() ? 0 : 8);
                        return Unit.INSTANCE;
                }
            }
        }));
        aVar3.f157371b.f(completedChallengesActivity, new CompletedChallengesActivity.b(new e23.l() { // from class: mt0.d2
            @Override // e23.l
            public final Object invoke(Object obj2) {
                switch (i15) {
                    case 0:
                        yc.m2 m2Var = (yc.m2) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.m0 m0Var2 = completedChallengesActivity2.f37245b;
                        if (m0Var2 != null) {
                            m0Var2.t(m2Var);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("listAdapter");
                        throw null;
                    case 1:
                        s51.e eVar = (s51.e) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.m0 m0Var3 = completedChallengesActivity2.f37245b;
                        if (m0Var3 != null) {
                            m0Var3.u(eVar);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("listAdapter");
                        throw null;
                    case 2:
                        s51.e eVar2 = (s51.e) obj2;
                        SwipeRefreshLayout swipeRefreshLayout = completedChallengesActivity2.f37248e;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(eVar2 == s51.e.LOADING);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeRefreshView");
                        throw null;
                    default:
                        Boolean bool = (Boolean) obj2;
                        CompletedChallengesActivity completedChallengesActivity3 = completedChallengesActivity2;
                        TextView textView = completedChallengesActivity3.f37249f;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("emptyStateTitle");
                            throw null;
                        }
                        bool.getClass();
                        textView.setVisibility(bool.booleanValue() ? 0 : 8);
                        RecyclerView recyclerView2 = completedChallengesActivity3.f37246c;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView2.setVisibility(!bool.booleanValue() ? 0 : 8);
                        ComposeView composeView = completedChallengesActivity3.f37247d;
                        if (composeView == null) {
                            p005kotlin.jvm.internal.s.m("composeView");
                            throw null;
                        }
                        List<ot0.g> listD = completedChallengesActivity3.ca().f140796c.f120703a.d();
                        composeView.setVisibility((listD != null ? listD.size() : 0) > 1 && !bool.booleanValue() ? 0 : 8);
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 2;
        aVar3.f157372c.f(completedChallengesActivity, new CompletedChallengesActivity.b(new e23.l() { // from class: mt0.d2
            @Override // e23.l
            public final Object invoke(Object obj2) {
                switch (i17) {
                    case 0:
                        yc.m2 m2Var = (yc.m2) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.m0 m0Var2 = completedChallengesActivity2.f37245b;
                        if (m0Var2 != null) {
                            m0Var2.t(m2Var);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("listAdapter");
                        throw null;
                    case 1:
                        s51.e eVar = (s51.e) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.m0 m0Var3 = completedChallengesActivity2.f37245b;
                        if (m0Var3 != null) {
                            m0Var3.u(eVar);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("listAdapter");
                        throw null;
                    case 2:
                        s51.e eVar2 = (s51.e) obj2;
                        SwipeRefreshLayout swipeRefreshLayout = completedChallengesActivity2.f37248e;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(eVar2 == s51.e.LOADING);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeRefreshView");
                        throw null;
                    default:
                        Boolean bool = (Boolean) obj2;
                        CompletedChallengesActivity completedChallengesActivity3 = completedChallengesActivity2;
                        TextView textView = completedChallengesActivity3.f37249f;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("emptyStateTitle");
                            throw null;
                        }
                        bool.getClass();
                        textView.setVisibility(bool.booleanValue() ? 0 : 8);
                        RecyclerView recyclerView2 = completedChallengesActivity3.f37246c;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView2.setVisibility(!bool.booleanValue() ? 0 : 8);
                        ComposeView composeView = completedChallengesActivity3.f37247d;
                        if (composeView == null) {
                            p005kotlin.jvm.internal.s.m("composeView");
                            throw null;
                        }
                        List<ot0.g> listD = completedChallengesActivity3.ca().f140796c.f120703a.d();
                        composeView.setVisibility((listD != null ? listD.size() : 0) > 1 && !bool.booleanValue() ? 0 : 8);
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 3;
        aVar3.f157376g.f(completedChallengesActivity, new CompletedChallengesActivity.b(new e23.l() { // from class: mt0.d2
            @Override // e23.l
            public final Object invoke(Object obj2) {
                switch (i18) {
                    case 0:
                        yc.m2 m2Var = (yc.m2) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.m0 m0Var2 = completedChallengesActivity2.f37245b;
                        if (m0Var2 != null) {
                            m0Var2.t(m2Var);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("listAdapter");
                        throw null;
                    case 1:
                        s51.e eVar = (s51.e) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.m0 m0Var3 = completedChallengesActivity2.f37245b;
                        if (m0Var3 != null) {
                            m0Var3.u(eVar);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("listAdapter");
                        throw null;
                    case 2:
                        s51.e eVar2 = (s51.e) obj2;
                        SwipeRefreshLayout swipeRefreshLayout = completedChallengesActivity2.f37248e;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(eVar2 == s51.e.LOADING);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeRefreshView");
                        throw null;
                    default:
                        Boolean bool = (Boolean) obj2;
                        CompletedChallengesActivity completedChallengesActivity3 = completedChallengesActivity2;
                        TextView textView = completedChallengesActivity3.f37249f;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("emptyStateTitle");
                            throw null;
                        }
                        bool.getClass();
                        textView.setVisibility(bool.booleanValue() ? 0 : 8);
                        RecyclerView recyclerView2 = completedChallengesActivity3.f37246c;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView2.setVisibility(!bool.booleanValue() ? 0 : 8);
                        ComposeView composeView = completedChallengesActivity3.f37247d;
                        if (composeView == null) {
                            p005kotlin.jvm.internal.s.m("composeView");
                            throw null;
                        }
                        List<ot0.g> listD = completedChallengesActivity3.ca().f140796c.f120703a.d();
                        composeView.setVisibility((listD != null ? listD.size() : 0) > 1 && !bool.booleanValue() ? 0 : 8);
                        return Unit.INSTANCE;
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
