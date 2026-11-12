package com.garmin.android.apps.connectmobile.training;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import ro0.g;
import rt1.d;
import rt1.f;
import rt1.i;
import ww1.m;
import ww1.o;
import ww1.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/CompletedTrainingPlansActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CompletedTrainingPlansActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f45088h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f45089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f45090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wt1.b f45091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f45092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45095g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45096a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45096a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f45097a;

        public c(l lVar) {
            lVar.getClass();
            this.f45097a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f45097a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45097a.invoke(obj);
        }
    }

    public final void ca(List<? extends r> list) {
        RecyclerView recyclerView = this.f45090b;
        if (recyclerView == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView.setVisibility(0);
        f fVar = this.f45089a;
        if (fVar == null) {
            s.m("adapter");
            throw null;
        }
        list.getClass();
        ArrayList arrayList = fVar.f154524b;
        arrayList.clear();
        arrayList.addAll(list);
        fVar.notifyDataSetChanged();
    }

    public final void da() {
        i iVar = this.f45092d;
        if (iVar == null) {
            s.m("viewModel");
            throw null;
        }
        y0 y0Var = new y0();
        ge1.b.T(v1.a(iVar), null, null, new rt1.h(y0Var, iVar, null), 3);
        y0Var.f(this, new c(new d(this, 1)));
    }

    public final void ea(boolean z14) {
        f fVar = this.f45089a;
        if (fVar == null) {
            s.m("adapter");
            throw null;
        }
        int size = fVar.f154524b.size();
        Intent intent = new Intent();
        intent.putExtra("GCM_tp_completed_plans", size);
        intent.putExtra("fetch_active_plans_key", z14);
        setResult(-1, intent);
        f fVar2 = this.f45089a;
        if (fVar2 == null) {
            s.m("adapter");
            throw null;
        }
        if (fVar2.f154524b.size() == 0) {
            finish();
        }
    }

    public final void fa(r rVar) {
        if (rVar instanceof o) {
            ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).j(this, ((o) rVar).f187841a);
            return;
        }
        if (rVar instanceof m) {
            m mVar = (m) rVar;
            TrainingPlanDashboardActivity.a.c(TrainingPlanDashboardActivity.f45383n, this, mVar.f187826a, false, null, mVar.f187827b, 1002, 28);
            return;
        }
        if (rVar instanceof ww1.n) {
            ww1.n nVar = (ww1.n) rVar;
            tw1.n nVar2 = nVar.f187837d;
            vt1.o oVarB = nVar2 != null ? nVar2.b() : null;
            if (oVarB != null) {
                FBTDashBoardActivity.a.c(FBTDashBoardActivity.f45458n, this, nVar.f187834a, oVarB, 1002, 88);
                return;
            }
            return;
        }
        if (!(rVar instanceof ww1.p)) {
            fy1.i.f73924a.getClass();
            fy1.i.a.v(this);
        } else {
            StrengthTrainingPlanDashboardActivity.a aVar = StrengthTrainingPlanDashboardActivity.f45641h;
            long j8 = ((ww1.p) rVar).f187846a;
            aVar.getClass();
            StrengthTrainingPlanDashboardActivity.a.a(this, j8, false, null, 1003);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            long j8 = (intent == null || (extras = intent.getExtras()) == null) ? -1L : extras.getLong("GCM_tp_removed_plan_id", -1L);
            if (j8 > -1) {
                f fVar = this.f45089a;
                if (fVar == null) {
                    s.m("adapter");
                    throw null;
                }
                ArrayList arrayList = fVar.f154524b;
                Iterator it = arrayList.iterator();
                int i16 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i16 = -1;
                        break;
                    } else if (((r) it.next()).getF187853a() == j8) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i16 > -1) {
                    arrayList.remove(i16);
                    fVar.notifyItemRemoved(i16);
                }
                ea(false);
            }
            if (i14 == 1003) {
                if (intent != null && intent.getBooleanExtra("stp_restarted_key", false)) {
                    ea(true);
                    finish();
                } else if (intent != null && intent.getBooleanExtra("fetch_activities_key", false)) {
                    da();
                }
            }
        }
        if (i15 == 11) {
            ea(false);
            finish();
        }
        if (i15 == 12) {
            setResult(i15);
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (this.f45095g) {
            setResult(0);
        } else {
            ea(false);
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_completed_training_plans);
        initActionBar(true, R.string.lbl_completed_plans);
        Intent intent = getIntent();
        boolean z14 = false;
        if (intent != null && (extras = intent.getExtras()) != null) {
            z14 = extras.getBoolean("is_from_deeplink_key", false);
        }
        this.f45093e = z14;
        this.f45089a = new f(new d(this, 0));
        View viewFindViewById = findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f45090b = recyclerView;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.f45090b;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView3 = this.f45090b;
        if (recyclerView3 == null) {
            s.m("recyclerView");
            throw null;
        }
        f fVar = this.f45089a;
        if (fVar == null) {
            s.m("adapter");
            throw null;
        }
        recyclerView3.setAdapter(fVar);
        wt1.b bVar = new wt1.b(findViewById(R.id.training_error_layout));
        this.f45091c = bVar;
        bVar.b();
        wt1.b bVar2 = this.f45091c;
        if (bVar2 == null) {
            s.m("errorViewHolder");
            throw null;
        }
        bVar2.a();
        wt1.b bVar3 = this.f45091c;
        if (bVar3 == null) {
            s.m("errorViewHolder");
            throw null;
        }
        bVar3.c(new g(this, 6));
        this.f45092d = (i) new x1(this).b(s0.f105811a.b(i.class));
        da();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f45095g) {
            setResult(0);
        } else {
            ea(false);
        }
        finish();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/CompletedTrainingPlansActivity$a;", "", "<init>", "()V", "", "ITP_DASHBOARD_REQUEST_CODE", "I", "ATP_DASHBOARD_REQUEST_CODE", "STP_DASHBOARD_REQUEST_CODE", "", "EXTRA_FETCH_ACTIVE_PLANS_KEY", "Ljava/lang/String;", "EXTRA_IS_FROM_DEEPLINK_KEY", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
