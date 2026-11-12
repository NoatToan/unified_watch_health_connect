package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import yc.r2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/m0;", "Lyc/r2;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/m0$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "hasGCPlusSocialFeature", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/m0$c;Z)V", "c", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 extends r2<com.garmin.android.apps.connectmobile.leaderboard.model.a0, RecyclerView.f0> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f37672h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f37673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gg1.o0 f37676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s51.e f37677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mh1.x f37678g;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/m0$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.recyclerview.widget.o.f<com.garmin.android.apps.connectmobile.leaderboard.model.a0> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var2) {
            a0Var.getClass();
            a0Var2.getClass();
            return false;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var2) {
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var3 = a0Var;
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var4 = a0Var2;
            a0Var3.getClass();
            a0Var4.getClass();
            return p005kotlin.jvm.internal.s.g(a0Var3.getUuid(), a0Var4.getUuid());
        }
    }

    public interface c {
        void B7(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var);
    }

    static {
        new b(null);
        f37672h = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(c cVar, boolean z14) {
        super(f37672h);
        cVar.getClass();
        this.f37673b = cVar;
        this.f37674c = z14;
        this.f37675d = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        this.f37676e = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).g();
        this.f37678g = new mh1.x(this, 10);
    }

    @Override // yc.r2, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        int iA = this.f196366a.a();
        s51.e eVar = this.f37677f;
        return ((eVar == null || eVar == s51.e.LOADED) ? 0 : 1) + iA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        s51.e eVar = this.f37677f;
        return (eVar == null || eVar == s51.e.LOADED || i14 != getItemCount() + (-1)) ? R.layout.leaderboard_challenges_list_item : R.layout.gcm_list_loading_footer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (getItemViewType(i14) == R.layout.leaderboard_challenges_list_item) {
            ((n0) f0Var).d(r(i14), this.f37675d, this.f37676e, this.f37674c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 != R.layout.leaderboard_challenges_list_item) {
            if (i14 == R.layout.gcm_list_loading_footer) {
                h12.a.f80820a.getClass();
                return h12.a.C1612a.a(viewGroup);
            }
            vb.h.s(am.j.h(i14, "unknown view type "));
            return null;
        }
        n0.f37680l.getClass();
        mh1.x xVar = this.f37678g;
        xVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.leaderboard_challenges_list_item, viewGroup, false);
        viewInflate.getClass();
        return new n0(viewInflate, xVar);
    }

    public final void u(s51.e eVar) {
        s51.e eVar2 = this.f37677f;
        boolean z14 = false;
        boolean z15 = (eVar2 == null || eVar2 == s51.e.LOADED) ? false : true;
        this.f37677f = eVar;
        if (eVar != null && eVar != s51.e.LOADED) {
            z14 = true;
        }
        if (z15 != z14) {
            yc.e<T> eVar3 = this.f196366a;
            if (z15) {
                notifyItemRemoved(eVar3.a());
            } else {
                notifyItemInserted(eVar3.a());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/m0$b;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
