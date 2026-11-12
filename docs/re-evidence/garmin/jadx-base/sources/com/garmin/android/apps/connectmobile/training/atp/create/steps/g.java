package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rt1.r;
import wt1.u;
import xw1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/g;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/b;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/a$b;", "Lxw1/m;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/a$c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends com.garmin.android.apps.connectmobile.training.atp.create.steps.b implements com.garmin.android.apps.connectmobile.training.atp.create.steps.a.b<m>, com.garmin.android.apps.connectmobile.training.atp.create.steps.a.c<m> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f45268m = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f45269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f45270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f45271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f45272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45273l = -1;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/create/steps/g$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lxw1/m;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<? extends m>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.training.atp.create.steps.a<m> f45274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45275b;

        public b(com.garmin.android.apps.connectmobile.training.atp.create.steps.a<m> aVar, g gVar) {
            this.f45274a = aVar;
            this.f45275b = gVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            Long lValueOf = Long.valueOf(j8);
            g gVar = this.f45275b;
            gVar.A6(lValueOf, cVar);
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                if (gVar.y6()) {
                    View view2 = gVar.f45271j;
                    if (view2 == null) {
                        s.m("listHeader");
                        throw null;
                    }
                    this.f45274a.A(view2, gVar.getString(R.string.atp_msg_goal_header));
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<? extends m> list) {
            List<? extends m> list2 = list;
            eVar.getClass();
            list2.getClass();
            com.garmin.android.apps.connectmobile.training.atp.create.steps.a<m> aVar = this.f45274a;
            aVar.f45241d = list2;
            aVar.notifyDataSetChanged();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.a.b
    public final void C(m mVar) {
        m mVar2 = mVar;
        mVar2.getClass();
        this.f45272k = mVar2;
        yt1.c cVar = this.f45248a;
        if (cVar != null) {
            cVar.c(mVar2);
        }
    }

    public final void E6() {
        Integer planType = w6().getPlanType();
        u uVar = this.f45249b;
        if (uVar == null) {
            s.m("trainingService");
            throw null;
        }
        Integer prePlanWeeklyMileage = w6().getPrePlanWeeklyMileage();
        Integer prePlanTrainingPace = w6().getPrePlanTrainingPace();
        b bVar = this.f45269h;
        if (bVar != null) {
            com.garmin.android.apps.connectmobile.training.atp.create.steps.b.C6(this, Long.valueOf(uVar.s(planType, prePlanWeeklyMileage, prePlanTrainingPace, bVar)));
        } else {
            s.m("resultListener");
            throw null;
        }
    }

    @Override // yt1.e
    public final int V5() {
        return z6() ? R.string.lbl_edit_training_5k_goal : this.f45273l;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.a.c
    public final String b3(m mVar) {
        m mVar2 = mVar;
        mVar2.getClass();
        return mVar2.getLocalizedGoal();
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b
    public final String b5() {
        return "PersonalGoalFragment";
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        wt1.b bVar;
        super.onActivityCreated(bundle);
        wt1.b bVar2 = this.f45252e;
        if (bVar2 != null) {
            bVar2.b();
            Unit unit = Unit.INSTANCE;
        }
        au1.e eVar = new au1.e(this, 0);
        wt1.b bVar3 = this.f45252e;
        if (bVar3 != null) {
            bVar3.c(eVar);
        }
        if (z6() && (bVar = this.f45252e) != null) {
            bVar.f();
            Unit unit2 = Unit.INSTANCE;
        }
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            com.garmin.android.apps.connectmobile.training.atp.create.steps.a aVar = new com.garmin.android.apps.connectmobile.training.atp.create.steps.a(activity);
            aVar.f45242e = this;
            aVar.f45243f = this;
            RecyclerView recyclerView = this.f45270i;
            if (recyclerView == null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView.setAdapter(aVar);
            this.f45269h = new b(aVar, this);
            E6();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Integer planType = w6().getPlanType();
        int i14 = r.FIVE_K.f154560a;
        if (planType != null && planType.intValue() == i14) {
            this.f45273l = R.string.lbl_your_5k_goal;
            return;
        }
        int i15 = r.TEN_K.f154560a;
        if (planType != null && planType.intValue() == i15) {
            this.f45273l = R.string.atp_lbl_your_10k_goal;
            return;
        }
        int i16 = r.HALF_MARATHON.f154560a;
        if (planType != null && planType.intValue() == i16) {
            this.f45273l = R.string.atp_lbl_your_half_marathon_goal;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_training_create_default_step, viewGroup, false);
        View viewInflate2 = layoutInflater.inflate(R.layout.gcm4_training_create_step_header, viewGroup, false);
        viewInflate2.getClass();
        this.f45271j = viewInflate2;
        if (z6()) {
            viewInflate.getClass();
            v22.e.u(v6(), viewInflate);
        }
        return viewInflate;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.simple_recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f45270i = recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
