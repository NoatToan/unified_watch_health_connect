package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Arrays;
import mt0.s1;
import mt0.w1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import yc.r2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\b\tB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l0;", "Lyc/r2;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/p;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l0$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l0$c;)V", "c", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 extends r2<com.garmin.android.apps.connectmobile.leaderboard.model.p, RecyclerView.f0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f37664f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f37665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s51.e f37667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gg1.o0 f37668e;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/l0$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/p;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.recyclerview.widget.o.f<com.garmin.android.apps.connectmobile.leaderboard.model.p> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar2) {
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar3 = pVar;
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar4 = pVar2;
            pVar3.getClass();
            pVar4.getClass();
            return pVar3.equals(pVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar2) {
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar3 = pVar;
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar4 = pVar2;
            pVar3.getClass();
            pVar4.getClass();
            return p005kotlin.jvm.internal.s.g(pVar3.getUuid(), pVar4.getUuid());
        }
    }

    public interface c {
        void a(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar);

        void p(String str);
    }

    static {
        new b(null);
        f37664f = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(c cVar) {
        super(f37664f);
        cVar.getClass();
        this.f37665b = cVar;
        this.f37668e = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).g();
    }

    @Override // yc.r2, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        int iA = this.f196366a.a();
        s51.e eVar = this.f37667d;
        return ((eVar == null || eVar == s51.e.LOADED) ? 0 : 1) + iA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        s51.e eVar = this.f37667d;
        return (eVar == null || eVar == s51.e.LOADED || i14 != getItemCount() + (-1)) ? R.layout.leaderboard_challenges_list_item : R.layout.gcm_list_loading_footer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (getItemViewType(i14) == R.layout.leaderboard_challenges_list_item) {
            w wVar = (w) f0Var;
            ComposeView composeView = wVar.f37939g;
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVarR = r(i14);
            boolean z14 = this.f37666c;
            TextView textView = wVar.f37936d;
            TextView textView2 = wVar.f37937e;
            ImageView imageView = wVar.f37935c;
            TextView textView3 = wVar.f37938f;
            gg1.o0 o0Var = this.f37668e;
            o0Var.getClass();
            Context context = wVar.itemView.getContext();
            View view2 = wVar.f37934b;
            String str = "";
            if (pVarR == null) {
                view2.setOnClickListener(null);
                imageView.setImageResource(2131231986);
                textView.setText("");
                textView2.setText("");
                textView3.setVisibility(8);
                v22.e.j(composeView);
                return;
            }
            Long badgeId = pVarR.getBadgeId();
            String badgeUuid = pVarR.getBadgeUuid();
            view2.setOnClickListener(new lq.g(11, badgeUuid, wVar));
            if (badgeId == null && badgeUuid == null) {
                imageView.setImageResource(2131231129);
            } else {
                context.getClass();
                zp0.c cVar = new zp0.c(context);
                cVar.f206565e = pVarR.z0();
                cVar.f206570j = 2131231129;
                cVar.f206578r = "cache_availability_today";
                cVar.h(imageView);
            }
            textView.setText(pVarR.k());
            int i15 = 0;
            v22.e.r(wVar.f37940h, z14 && pVarR.k0());
            if (!pVarR.L0()) {
                context.getClass();
                textView2.setText(x.j(context, pVarR.getStartDate(), pVarR.getEndDate(), true, false));
                textView2.setContentDescription(x.j(context, pVarR.getStartDate(), pVarR.getEndDate(), true, true));
                textView3.setVisibility(8);
                textView3.setText("");
                v22.e.q(composeView);
                boolean z15 = pVarR.Z0() && !z14;
                x xVar = x.f37955a;
                boolean zV0 = pVarR.V0();
                Boolean joinable = pVarR.getJoinable();
                s1 s1Var = new s1(i15, wVar, pVarR);
                xVar.getClass();
                composeView.getClass();
                composeView.setContent(new z3.e(1181535624, true, new w1(zV0, joinable, s1Var, z15, 0)));
                return;
            }
            context.getClass();
            x xVar2 = x.f37955a;
            com.garmin.android.apps.connectmobile.leaderboard.model.o oVarC = pVarR.C();
            int i16 = oVarC == null ? -1 : x.a.f37957b[oVarC.ordinal()];
            if (i16 == 1) {
                String string = context.getString(R.string.string_space_bullet_string_pattern);
                string.getClass();
                str = String.format(string, Arrays.copyOf(new Object[]{context.getString(R.string.social_adventure_type_hike), pVarR.q()}, 2));
            } else if (i16 == 2) {
                String string2 = context.getString(R.string.string_space_bullet_string_pattern);
                string2.getClass();
                str = String.format(string2, Arrays.copyOf(new Object[]{context.getString(R.string.social_adventure_type_climb), pVarR.q()}, 2));
            }
            textView2.setText(str);
            textView3.setVisibility(0);
            textView3.setText(x.c(context, pVarR, o0Var));
            v22.e.j(composeView);
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
        w.f37932i.getClass();
        c cVar = this.f37665b;
        cVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.leaderboard_challenges_list_item, viewGroup, false);
        viewInflate.getClass();
        return new w(viewInflate, cVar);
    }

    public final void u(s51.e eVar) {
        s51.e eVar2 = this.f37667d;
        boolean z14 = false;
        boolean z15 = (eVar2 == null || eVar2 == s51.e.LOADED) ? false : true;
        this.f37667d = eVar;
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

    public final void x(boolean z14) {
        this.f37666c = z14;
        yc.e<T> eVar = this.f196366a;
        Iterable iterable = eVar.f195863e;
        if (iterable == null) {
            iterable = eVar.f195862d;
        }
        if (iterable != null) {
            int i14 = 0;
            for (Object obj : iterable) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                if (((com.garmin.android.apps.connectmobile.leaderboard.model.p) obj).Z0()) {
                    notifyItemChanged(i14);
                }
                i14 = i15;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l0$b;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
