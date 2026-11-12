package com.garmin.android.apps.connectmobile.training.findplan.presentation;

import am.a2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import b.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.r0;
import fg0.k;
import lw1.f;
import nw1.d;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/findplan/presentation/FindTrainingPlanActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FindTrainingPlanActivity extends r0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f45585g = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f45586e = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45587f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f45589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f45590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f45591d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f45588a = gVar;
            this.f45589b = qualifier;
            this.f45590c = aVar;
            this.f45591d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, lw1.f] */
        @Override // e23.a
        public final f invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f45588a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f45590c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(f.class), f189591b, null, defaultViewModelCreationExtras, this.f45589b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f45591d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (isTopNavigation()) {
            return this.f45587f;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        d dVar;
        Object value;
        Bundle extras;
        Bundle extras2;
        String str;
        Bundle extras3;
        j.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        Intent intent = getIntent();
        this.f45587f = (intent == null || (extras3 = intent.getExtras()) == null) ? null : extras3.getString("GCM_tp_sel_navigation_item");
        if (isTopNavigation() && (str = this.f45587f) != null) {
            ca(str);
        }
        int intExtra = getIntent().getIntExtra("navigation_flow_type", -1);
        int iOrdinal = jw1.a.EVENT_TRAINING_PLAN_FLOW.ordinal();
        ?? r14 = this.f45586e;
        if (intExtra == iOrdinal) {
            ((f) r14.getValue()).f115112e = true;
            dVar = d.c.INSTANCE;
        } else {
            dVar = d.a.INSTANCE;
        }
        d dVar2 = dVar;
        f fVar = (f) r14.getValue();
        fVar.getClass();
        dVar2.getClass();
        p2 p2Var = fVar.f115117j;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, lw1.a.a((lw1.a) value, false, false, false, dVar2, 0, null, null, null, false, false, false, false, 4087)));
        f fVar2 = (f) r14.getValue();
        Intent intent2 = getIntent();
        boolean z14 = false;
        fVar2.y4(intent2 != null ? intent2.getIntExtra("GCM_tp_completed_plans", 0) : 0);
        Intent intent3 = getIntent();
        fVar2.f115114g = (ww1.g) a2.c(intent3 != null ? intent3.getExtras() : null, "extra_active_plan_info_dto");
        Intent intent4 = getIntent();
        fVar2.f115113f = (k) a2.c(intent4 != null ? intent4.getExtras() : null, "GCM_extra_event");
        Intent intent5 = getIntent();
        fVar2.f115115h = (intent5 == null || (extras2 = intent5.getExtras()) == null) ? false : extras2.getBoolean("extras_launch_event_details");
        Intent intent6 = getIntent();
        if (intent6 != null && (extras = intent6.getExtras()) != null) {
            z14 = extras.getBoolean("extras_navigating_from_event_creation");
        }
        fVar2.f115116i = z14;
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(1997545847, true, new lw1.b(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/findplan/presentation/FindTrainingPlanActivity$a;", "", "<init>", "()V", "", "NAVIGATION_FLOW_TYPE", "Ljava/lang/String;", "EXTRA_TP_COMPLETED_PLANS", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, String str, int i14, int i15, boolean z14) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) FindTrainingPlanActivity.class);
            intent.putExtra("navigation_flow_type", i14);
            intent.putExtra("GCM_extra_top_navigation", z14);
            intent.putExtra("GCM_tp_sel_navigation_item", str);
            intent.putExtra("GCM_tp_completed_plans", i15);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
