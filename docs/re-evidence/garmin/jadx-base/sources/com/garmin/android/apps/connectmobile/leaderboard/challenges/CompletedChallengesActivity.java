package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import mt0.b2;
import mt0.c2;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b²\u0006 \u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00068\nX\u008a\u0084\u0002²\u0006 \u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/CompletedChallengesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/m0$c;", "<init>", "()V", "a", "", "Lot0/g;", "kotlin.jvm.PlatformType", "availableFilters", "selectedFilter", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CompletedChallengesActivity extends com.garmin.android.apps.connectmobile.c implements m0.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f37243g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37244a = o13.m.a(o13.n.NONE, new c(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f37245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f37246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComposeView f37247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SwipeRefreshLayout f37248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f37249f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37250a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f37250a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37250a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37250a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<pt0.z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f37251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37254d;

        public c(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f37251a = gVar;
            this.f37252b = qualifier;
            this.f37253c = aVar;
            this.f37254d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, pt0.z] */
        @Override // e23.a
        public final pt0.z invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f37251a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f37253c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.z.class), f189591b, null, defaultViewModelCreationExtras, this.f37252b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f37254d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.m0.c
    public final void B7(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var) {
        a0Var.getClass();
        g0.a(this, a0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final pt0.z ca() {
        return (pt0.z) this.f37244a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 7 && i15 == -1) {
            ((s51.a) ca().f140797d.getValue()).f157373d.invoke();
            setResult(-1);
        } else if (i14 == 7 && i15 == 701) {
            new androidx.appcompat.app.e.a(this).setMessage(R.string.social_challenge_not_available).setPositiveButton(R.string.lbl_close, (DialogInterface.OnClickListener) null).setCancelable(true).create().show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.paged_challenge_list);
        initActionBar(true, getString(R.string.social_leaderboard_challenges_past_challenges));
        View viewFindViewById = findViewById(R.id.compose_view);
        viewFindViewById.getClass();
        this.f37247d = (ComposeView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.recycler_view);
        viewFindViewById2.getClass();
        this.f37246c = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.swipe_refresh_layout);
        viewFindViewById3.getClass();
        this.f37248e = (SwipeRefreshLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.empty_text);
        viewFindViewById4.getClass();
        this.f37249f = (TextView) viewFindViewById4;
        SwipeRefreshLayout swipeRefreshLayout = this.f37248e;
        if (swipeRefreshLayout == null) {
            p005kotlin.jvm.internal.s.m("swipeRefreshView");
            throw null;
        }
        swipeRefreshLayout.setOnRefreshListener(new b2(this, 0));
        ComposeView composeView = this.f37247d;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("composeView");
            throw null;
        }
        composeView.setContent(new z3.e(-1203534864, true, new c2(this, 0)));
        ge1.b.T(o53.f0.w(this), null, null, new z(this, null), 3);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/CompletedChallengesActivity$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
