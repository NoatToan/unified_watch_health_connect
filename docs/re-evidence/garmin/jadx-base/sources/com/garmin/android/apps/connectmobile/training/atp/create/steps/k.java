package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import am.a2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import j23.l;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/k;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/b;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/a$b;", "", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/a$c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends b implements com.garmin.android.apps.connectmobile.training.atp.create.steps.a.b<Integer>, com.garmin.android.apps.connectmobile.training.atp.create.steps.a.c<Integer> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f45307l = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f45308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f45309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xw1.h f45310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.training.atp.create.steps.a<Integer> f45311k;

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.a.b
    public final void C(Integer num) {
        int iIntValue = num.intValue();
        yt1.c cVar = this.f45248a;
        if (cVar != null) {
            cVar.g(iIntValue);
        }
    }

    @Override // yt1.e
    public final int V5() {
        return R.string.lbl_workouts_per_week_title;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.a.c
    public final String b3(Integer num) {
        return String.valueOf(num.intValue());
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b
    public final String b5() {
        return "WorkoutsPerWeekFragment";
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        if (activity != null) {
            com.garmin.android.apps.connectmobile.training.atp.create.steps.a<Integer> aVar = new com.garmin.android.apps.connectmobile.training.atp.create.steps.a<>(activity);
            this.f45311k = aVar;
            RecyclerView recyclerView = this.f45308h;
            if (recyclerView == null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView.setAdapter(aVar);
            xw1.h hVar = this.f45310j;
            if (hVar != null) {
                com.garmin.android.apps.connectmobile.training.atp.create.steps.a<Integer> aVar2 = this.f45311k;
                if (aVar2 == null) {
                    s.m("stepAdapter");
                    throw null;
                }
                List listB1 = h0.b1(new l(hVar.getMinWorkoutsPerWeek(), hVar.getMaxWorkoutsPerWeek()));
                if (listB1 == null) {
                    listB1 = j0.f134944a;
                }
                aVar2.f45241d = listB1;
                aVar2.notifyDataSetChanged();
                if (y6()) {
                    com.garmin.android.apps.connectmobile.training.atp.create.steps.a<Integer> aVar3 = this.f45311k;
                    if (aVar3 == null) {
                        s.m("stepAdapter");
                        throw null;
                    }
                    aVar3.A(this.f45309i, getString(R.string.atp_msg_workouts_per_week));
                }
                com.garmin.android.apps.connectmobile.training.atp.create.steps.a<Integer> aVar4 = this.f45311k;
                if (aVar4 == null) {
                    s.m("stepAdapter");
                    throw null;
                }
                aVar4.f45242e = this;
                aVar4.f45243f = this;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f45310j = (xw1.h) a2.c(getArguments(), "COACH_PLAN_EXTRA");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_training_create_default_step, viewGroup, false);
        this.f45309i = layoutInflater.inflate(R.layout.gcm4_training_create_step_header, viewGroup, false);
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
        this.f45308h = recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "COACH_PLAN_EXTRA", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
