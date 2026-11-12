package zu1;

import am.a2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.consent.CoachConsentActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.m2;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.editgoal.FBTEditGoalActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.triathloneditgoal.FBTTriathlonEditGoalActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.workouts.FBTWorkoutScheduleActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import fg0.t;
import fw.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jv1.e0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import q92.v;
import q92.x;
import rt1.l;
import tr2.y;
import vu1.n;
import vu1.o;
import vu1.w;
import wd2.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lzu1/c;", "Landroidx/fragment/app/Fragment;", "Lvu1/w;", "", TtmlNode.TAG_LAYOUT, "<init>", "(Ljava/lang/Integer;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class c extends Fragment implements w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f207075i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f207076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f207077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wu1.c f207078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public wt1.b f207079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f207080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f207081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f207082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.c<Intent> f207083h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207084a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f207084a = iArr;
        }
    }

    /* JADX INFO: renamed from: zu1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C3861c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f207085a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3861c(Fragment fragment) {
            super(0);
            this.f207085a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f207085a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f207086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f207087b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f207086a = aVar;
            this.f207087b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f207086a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f207087b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f207088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f207088a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f207088a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    public c(Integer num) {
        boolean z14;
        super(num != null ? num.intValue() : R.layout.fbt_dashboard_frag);
        this.f207076a = new w1(s0.f105811a.b(o.class), new C3861c(this), new e(this), new d(null, this));
        p92.o oVar = p92.o.f136619a;
        x xVar = x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
        oVar.getClass();
        v vVarN = p92.o.n(xVar);
        boolean zB = s3.b();
        this.f207080e = zB;
        if (zB && vVarN != null) {
            z14 = q92.c.a(vVarN);
        }
        this.f207081f = z14;
        this.f207082g = new h0(this, 21);
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new y(this, 26));
        cVarRegisterForActivityResult.getClass();
        this.f207083h = cVarRegisterForActivityResult;
    }

    @Override // vu1.w
    public final void D0(long j8, hv1.c cVar) {
        cVar.getClass();
        u6().i5(j8, cVar);
    }

    @Override // vu1.w
    public final void E5() {
        fy1.i.a.t(fy1.i.f73924a);
        u6().c5();
    }

    @Override // vu1.w
    public final void F2() {
        l.f154545a.getClass();
        l.a("GarminCoachPlanOverviewView");
        u6().f5().m(new o13.p<>("FBTPlanOverviewFragment", Unit.INSTANCE));
    }

    @Override // vu1.w
    public final void K2(fg0.k kVar) {
        Unit unit;
        kVar.getClass();
        m activity = getActivity();
        vt1.o oVar = u6().H0;
        if (activity == null || oVar == null) {
            unit = null;
        } else {
            FBTEditGoalActivity.f45493c.getClass();
            Intent intent = new Intent(activity, (Class<?>) FBTEditGoalActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_extra_event", kVar);
            bundle.putString("EXTRA_PLAN_TYPE", oVar.name());
            m2.a(intent, bundle);
            activity.startActivityForResult(intent, 1002);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            g22.e.a(this, null);
        }
    }

    @Override // vu1.w
    public final void R0(fg0.k kVar) {
        kVar.getClass();
        m activity = getActivity();
        if (activity == null) {
            g22.e.a(this, null);
            return;
        }
        FBTTriathlonEditGoalActivity.f45524b.getClass();
        Intent intent = new Intent(activity, (Class<?>) FBTTriathlonEditGoalActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("GCM_extra_event", kVar);
        m2.a(intent, bundle);
        activity.startActivityForResult(intent, 1002);
    }

    @Override // vu1.w
    public final void U0() {
        CoachConsentActivity.a aVar = CoachConsentActivity.f32153p;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f207083h.a(CoachConsentActivity.a.a(aVar, contextRequireContext, null, 6), null);
    }

    @Override // vu1.w
    public final void c6() {
        u6().f5().j(new o13.p<>("FBTTrainingGuidanceDetailsFrag", Unit.INSTANCE));
    }

    @Override // vu1.w
    public final void f4() {
        fy1.i.a.t(fy1.i.f73924a);
        u6().c5();
    }

    @Override // vu1.w
    public final void o5(boolean z14) {
        m activity = getActivity();
        FBTDashBoardActivity fBTDashBoardActivity = activity instanceof FBTDashBoardActivity ? (FBTDashBoardActivity) activity : null;
        if (fBTDashBoardActivity != null) {
            ge1.b.T(f0.w(fBTDashBoardActivity), null, null, new n(z14, fBTDashBoardActivity, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        vt1.o oVar;
        super.onResume();
        m activity = getActivity();
        if (activity == null || (oVar = u6().H0) == null) {
            return;
        }
        activity.setTitle(oVar.e(activity));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.simple_recycler_view);
        viewFindViewById.getClass();
        this.f207077b = (RecyclerView) viewFindViewById;
        wt1.b bVar = new wt1.b(view2.findViewById(R.id.training_error_layout));
        this.f207079d = bVar;
        bVar.b();
        wt1.b bVar2 = this.f207079d;
        if (bVar2 != null) {
            bVar2.c(new zu1.a(0));
        }
        wt1.b bVar3 = this.f207079d;
        if (bVar3 != null) {
            bVar3.f();
        }
        wt1.b bVar4 = this.f207079d;
        if (bVar4 != null) {
            bVar4.d(new zu1.b(this, 0));
        }
        wt1.b bVar5 = this.f207079d;
        if (bVar5 != null) {
            bVar5.e();
        }
        m activity = getActivity();
        if (activity != null) {
            RecyclerView recyclerView = this.f207077b;
            if (recyclerView == null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(activity));
            wu1.c cVar = new wu1.c(activity, this);
            this.f207078c = cVar;
            RecyclerView recyclerView2 = this.f207077b;
            if (recyclerView2 == null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView2.setAdapter(cVar);
            wu1.c cVar2 = this.f207078c;
            if (cVar2 != null) {
                cVar2.A(null, this.f207081f, f0.w(this));
            }
        }
        u6().J0.f(getViewLifecycleOwner(), this.f207082g);
    }

    public final o u6() {
        return (o) this.f207076a.getValue();
    }

    @Override // vu1.w
    public final void v0(tw1.m mVar, List<av1.d> list, List<? extends ActivityListItemDTO> list2, List<fg0.k> list3, Map<Long, t> map) {
        Unit unit;
        av1.a aVar;
        av1.a aVar2;
        map.getClass();
        m activity = getActivity();
        if (activity != null) {
            if (mVar != null) {
                l.f154545a.getClass();
                l.a("GarminCoachWorkoutScheduleView");
                FBTWorkoutScheduleActivity.a aVar3 = FBTWorkoutScheduleActivity.f45552c;
                g3<av1.a> g3VarD = u6().d5().d();
                fg0.k kVar = (g3VarD == null || (aVar2 = g3VarD.f35301b) == null) ? null : aVar2.f13227b;
                g3<av1.a> g3VarD2 = u6().d5().d();
                e0 e0Var = (g3VarD2 == null || (aVar = g3VarD2.f35301b) == null) ? null : aVar.f13229d;
                aVar3.getClass();
                Intent intent = new Intent(activity, (Class<?>) FBTWorkoutScheduleActivity.class);
                Bundle bundle = new Bundle();
                a2.b(bundle, "extra_training_plan", mVar);
                a2.b(bundle, "extra_user_settings", e0Var);
                a2.b(bundle, "GCM_extra_event", kVar);
                a2.a("extra_fitness_stats_Activity", bundle, list);
                a2.a("extra_completed_activity_list", bundle, list2);
                a2.a("extra_supporting_events_list", bundle, list3);
                HashMap map2 = new HashMap();
                map2.putAll(map);
                a2.f3853a.getClass();
                bundle.putSerializable("extra_events_weather_data", map2);
                com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
                activity.startActivityForResult(intent, 101);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        g22.e.a(this, null);
    }

    @Override // vu1.w
    public final void w2() {
        m activity = getActivity();
        FBTDashBoardActivity fBTDashBoardActivity = activity instanceof FBTDashBoardActivity ? (FBTDashBoardActivity) activity : null;
        if (fBTDashBoardActivity != null) {
            fBTDashBoardActivity.na();
        }
    }

    @Override // cz.a
    public final void y1(int i14, Bundle bundle) {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzu1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
