package com.garmin.android.apps.connectmobile.training.stp.presentation.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.v;
import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.r0;
import e23.p;
import ey1.j;
import o13.r;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import ov1.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import px1.c;
import rt1.n;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/stp/presentation/activity/StrengthTrainingPlanDashboardActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StrengthTrainingPlanDashboardActivity extends r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f45641h = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f45642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f45644g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity$onCreate$5", f = "StrengthTrainingPlanDashboardActivity.kt", l = {64}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45645a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity$onCreate$5$1", f = "StrengthTrainingPlanDashboardActivity.kt", l = {65}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f45647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrengthTrainingPlanDashboardActivity f45648b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0882a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ StrengthTrainingPlanDashboardActivity f45649a;

                public C0882a(StrengthTrainingPlanDashboardActivity strengthTrainingPlanDashboardActivity) {
                    this.f45649a = strengthTrainingPlanDashboardActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, d dVar) {
                    g3 g3Var = (g3) obj;
                    if (g3Var != null) {
                        a aVar = StrengthTrainingPlanDashboardActivity.f45641h;
                        StrengthTrainingPlanDashboardActivity strengthTrainingPlanDashboardActivity = this.f45649a;
                        strengthTrainingPlanDashboardActivity.getClass();
                        fw.p pVar = g3Var.f35300a;
                        if (pVar == fw.p.SUCCESS) {
                            v supportFragmentManager = strengthTrainingPlanDashboardActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            rt1.j jVar = (rt1.j) g3Var.f35301b;
                            j jVar2 = strengthTrainingPlanDashboardActivity.f45642e;
                            if (jVar2 == null) {
                                s.m("strengthTrainingPlanDashboardViewModel");
                                throw null;
                            }
                            c cVar = new c(jVar2);
                            j jVar3 = strengthTrainingPlanDashboardActivity.f45642e;
                            if (jVar3 == null) {
                                s.m("strengthTrainingPlanDashboardViewModel");
                                throw null;
                            }
                            n.b(strengthTrainingPlanDashboardActivity, supportFragmentManager, jVar, cVar, new px1.d(jVar3));
                            strengthTrainingPlanDashboardActivity.setResult(-1);
                            j jVar4 = strengthTrainingPlanDashboardActivity.f45642e;
                            if (jVar4 == null) {
                                s.m("strengthTrainingPlanDashboardViewModel");
                                throw null;
                            }
                            jVar4.f67340g.f160872d.setValue(null);
                        } else if (pVar == fw.p.ERROR) {
                            j jVar5 = strengthTrainingPlanDashboardActivity.f45642e;
                            if (jVar5 == null) {
                                s.m("strengthTrainingPlanDashboardViewModel");
                                throw null;
                            }
                            jVar5.C4();
                            j jVar6 = strengthTrainingPlanDashboardActivity.f45642e;
                            if (jVar6 == null) {
                                s.m("strengthTrainingPlanDashboardViewModel");
                                throw null;
                            }
                            jVar6.f67340g.f160872d.setValue(null);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StrengthTrainingPlanDashboardActivity strengthTrainingPlanDashboardActivity, d<? super a> dVar) {
                super(2, dVar);
                this.f45648b = strengthTrainingPlanDashboardActivity;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new a(this.f45648b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity$b$a for r4v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r4.f45647a
                    r2 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r2) goto L10
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r5)
                Le:
                    r5 = 0
                    return r5
                L10:
                    o13.r.b(r5)
                    goto L2f
                L14:
                    o13.r.b(r5)
                    com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity r5 = r4.f45648b
                    ey1.j r1 = r5.f45642e
                    if (r1 == 0) goto L33
                    r53.b2 r1 = r1.T
                    com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity$b$a$a r3 = new com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity$b$a$a
                    r3.<init>(r5)
                    r4.f45647a = r2
                    r53.o2<T> r5 = r1.f150540a
                    java.lang.Object r5 = r5.collect(r3, r4)
                    if (r5 != r0) goto L2f
                    return r0
                L2f:
                    o2.c.f()
                    goto Le
                L33:
                    java.lang.String r5 = "strengthTrainingPlanDashboardViewModel"
                    p005kotlin.jvm.internal.s.m(r5)
                    r5 = 0
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return StrengthTrainingPlanDashboardActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f45645a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                StrengthTrainingPlanDashboardActivity strengthTrainingPlanDashboardActivity = StrengthTrainingPlanDashboardActivity.this;
                a aVar2 = new a(strengthTrainingPlanDashboardActivity, null);
                this.f45645a = 1;
                if (h1.b(strengthTrainingPlanDashboardActivity, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (isTopNavigation()) {
            return this.f45643f;
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 100 && i15 == -1) {
            j jVar = this.f45642e;
            if (jVar == null) {
                s.m("strengthTrainingPlanDashboardViewModel");
                throw null;
            }
            j.B4(jVar, this, 2);
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        Intent intent = getIntent();
        this.f45644g = (intent == null || (extras2 = intent.getExtras()) == null || !extras2.containsKey("extra_stp_id_key")) ? null : Long.valueOf(extras2.getLong("extra_stp_id_key"));
        this.f45642e = (j) GetViewModelKt.resolveViewModel$default(s0.f105811a.b(j.class), getF189591b(), null, getDefaultViewModelCreationExtras(), null, AndroidKoinScopeExtKt.getKoinScope(this), new u(this, 25), 4, null);
        if (isTopNavigation()) {
            Intent intent2 = getIntent();
            String string = (intent2 == null || (extras = intent2.getExtras()) == null) ? null : extras.getString("GCM_tp_sel_navigation_item");
            this.f45643f = string;
            if (string != null) {
                ca(string);
            }
        }
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-1070201457, true, new px1.b(this, 0)));
        ge1.b.T(f0.w(this), null, null, new b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/stp/presentation/activity/StrengthTrainingPlanDashboardActivity$a;", "", "<init>", "()V", "", "RESTART_STP_REQUEST_CODE", "I", "", "EXTRA_STP_ID_KEY", "Ljava/lang/String;", "EXTRA_FETCH_ACTIVITIES_KEY", "EXTRA_STP_RESTARTED_KEY", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Activity activity, long j8, boolean z14, String str, int i14) {
            activity.getClass();
            Intent intent = new Intent(activity, (Class<?>) StrengthTrainingPlanDashboardActivity.class);
            intent.putExtras(h7.c.a(new o13.p("extra_stp_id_key", Long.valueOf(j8)), new o13.p("GCM_extra_top_navigation", Boolean.valueOf(z14)), new o13.p("GCM_tp_sel_navigation_item", str)));
            activity.startActivityForResult(intent, i14);
        }

        private a() {
        }
    }
}
