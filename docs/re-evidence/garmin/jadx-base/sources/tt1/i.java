package tt1;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import com.garmin.android.apps.connectmobile.training.findplan.presentation.FindTrainingPlanActivity;
import com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.training.view.TrainingPlansTwoLineButton;
import e23.p;
import java.util.Iterator;
import java.util.List;
import kotlin.w3;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import vt1.o;
import ww1.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity$initViews$2", f = "ActiveTrainingPlansActivity.kt", l = {145}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166445b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity$initViews$2$1", f = "ActiveTrainingPlansActivity.kt", l = {146}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActiveTrainingPlansActivity f166447b;

        /* JADX INFO: renamed from: tt1.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3130a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ActiveTrainingPlansActivity f166448a;

            public C3130a(ActiveTrainingPlansActivity activeTrainingPlansActivity) {
                this.f166448a = activeTrainingPlansActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                int i14;
                ww1.c cVar;
                ww1.a aVar;
                boolean z14;
                g3 g3Var = (g3) obj;
                if (g3Var != null) {
                    ActiveTrainingPlansActivity.a aVar2 = ActiveTrainingPlansActivity.f45098w;
                    ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166448a;
                    activeTrainingPlansActivity.getClass();
                    int i15 = ActiveTrainingPlansActivity.b.f45115a[g3Var.f35300a.ordinal()];
                    if (i15 == 1) {
                        activeTrainingPlansActivity.setTitle("");
                        View view2 = activeTrainingPlansActivity.f45099e;
                        if (view2 == null) {
                            s.m("trainingPlansContainer");
                            throw null;
                        }
                        view2.setVisibility(8);
                        wt1.b bVar = activeTrainingPlansActivity.f45107m;
                        if (bVar == null) {
                            s.m("errorViewHolder");
                            throw null;
                        }
                        bVar.e();
                        activeTrainingPlansActivity.showProgressOverlay();
                    } else if (i15 == 2) {
                        activeTrainingPlansActivity.hideProgressOverlay();
                        e0 e0Var = (e0) g3Var.f35301b;
                        if (e0Var != null) {
                            int i16 = e0Var.f187754g;
                            ww1.c cVar2 = e0Var.f187749b;
                            ww1.a aVar3 = e0Var.f187750c;
                            ww1.b bVar2 = e0Var.f187751d;
                            List<ww1.e> list = e0Var.f187748a;
                            ww1.d dVar2 = e0Var.f187752e;
                            if (cVar2 == null && aVar3 == null && bVar2 == null && list.isEmpty() && dVar2 == null) {
                                if (i16 < 1) {
                                    FindTrainingPlanActivity.a aVar4 = FindTrainingPlanActivity.f45585g;
                                    int iOrdinal = jw1.a.GENESIS.ordinal();
                                    String str = activeTrainingPlansActivity.f45113t;
                                    z14 = str != null;
                                    aVar4.getClass();
                                    FindTrainingPlanActivity.a.a(activeTrainingPlansActivity, str, iOrdinal, 0, z14);
                                } else {
                                    FindTrainingPlanActivity.a aVar5 = FindTrainingPlanActivity.f45585g;
                                    int iOrdinal2 = jw1.a.COMPLETED_NO_ACTIVE.ordinal();
                                    String str2 = activeTrainingPlansActivity.f45113t;
                                    z14 = str2 != null;
                                    aVar5.getClass();
                                    FindTrainingPlanActivity.a.a(activeTrainingPlansActivity, str2, iOrdinal2, i16, z14);
                                }
                                activeTrainingPlansActivity.finish();
                            } else {
                                List listK = x.k(cVar2, aVar3, bVar2, dVar2);
                                if (listK == null || !listK.isEmpty()) {
                                    Iterator<T> it = listK.iterator();
                                    int i17 = 0;
                                    while (it.hasNext()) {
                                        if (((ww1.f) it.next()) != null && (i17 = i17 + 1) < 0) {
                                            x.p();
                                            throw null;
                                        }
                                    }
                                    i14 = i17;
                                } else {
                                    i14 = 0;
                                }
                                int size = list.size() + (i14 > 1 ? 2 : 1);
                                if (activeTrainingPlansActivity.f45111q && size < 2 && list.isEmpty()) {
                                    if (bVar2 != null) {
                                        FBTDashBoardActivity.a aVar6 = FBTDashBoardActivity.f45458n;
                                        long j8 = bVar2.f187755a;
                                        o oVar = bVar2.f187720g;
                                        oVar.getClass();
                                        String str3 = activeTrainingPlansActivity.f45113t;
                                        boolean z15 = str3 != null;
                                        boolean z16 = activeTrainingPlansActivity.f45112r;
                                        aVar6.getClass();
                                        Intent intentA = FBTDashBoardActivity.a.a(activeTrainingPlansActivity, j8, oVar, z15, str3);
                                        activeTrainingPlansActivity = activeTrainingPlansActivity;
                                        activeTrainingPlansActivity.startActivityForResult(intentA.putExtra("extra_launch_edit_preferences", z16), 1007);
                                    } else if (cVar2 != null) {
                                        wt1.a aVar7 = (wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null);
                                        long j14 = cVar2.f187755a;
                                        String str4 = activeTrainingPlansActivity.f45113t;
                                        aVar7.c(activeTrainingPlansActivity, j14, str4 != null, str4);
                                    } else if (aVar3 != null) {
                                        TrainingPlanDashboardActivity.a aVar8 = TrainingPlanDashboardActivity.f45383n;
                                        long j15 = aVar3.f187755a;
                                        String str5 = activeTrainingPlansActivity.f45113t;
                                        TrainingPlanDashboardActivity.a.c(aVar8, activeTrainingPlansActivity, j15, str5 != null, str5, null, 1002, 32);
                                    } else if (dVar2 != null) {
                                        StrengthTrainingPlanDashboardActivity.a aVar9 = StrengthTrainingPlanDashboardActivity.f45641h;
                                        long j16 = dVar2.f187755a;
                                        String str6 = activeTrainingPlansActivity.f45113t;
                                        boolean z17 = str6 != null;
                                        aVar9.getClass();
                                        StrengthTrainingPlanDashboardActivity.a.a(activeTrainingPlansActivity, j16, z17, str6, 1008);
                                        activeTrainingPlansActivity = activeTrainingPlansActivity;
                                    }
                                    activeTrainingPlansActivity.finish();
                                } else {
                                    ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).i(activeTrainingPlansActivity, (cVar2 == null && aVar3 == null && dVar2 == null && list.isEmpty()) ? false : true);
                                    activeTrainingPlansActivity.setTitle(R.string.atp_lbl_plans_section_title);
                                    View view3 = activeTrainingPlansActivity.f45099e;
                                    if (view3 == null) {
                                        s.m("trainingPlansContainer");
                                        throw null;
                                    }
                                    view3.setVisibility(0);
                                    wt1.b bVar3 = activeTrainingPlansActivity.f45107m;
                                    if (bVar3 == null) {
                                        s.m("errorViewHolder");
                                        throw null;
                                    }
                                    bVar3.e();
                                    TextView textView = activeTrainingPlansActivity.f45100f;
                                    if (textView == null) {
                                        s.m("activePlansTextView");
                                        throw null;
                                    }
                                    textView.setText(size == 1 ? R.string.atp_active_plan_section_title : R.string.itp_active_plans_title);
                                    boolean zIsEmpty = list.isEmpty();
                                    ComposeView composeView = activeTrainingPlansActivity.f45101g;
                                    if (zIsEmpty) {
                                        if (composeView == null) {
                                            s.m("activeStaticPlansContainer");
                                            throw null;
                                        }
                                        composeView.setVisibility(8);
                                    } else {
                                        if (composeView == null) {
                                            s.m("activeStaticPlansContainer");
                                            throw null;
                                        }
                                        composeView.setVisibility(0);
                                        ComposeView composeView2 = activeTrainingPlansActivity.f45101g;
                                        if (composeView2 == null) {
                                            s.m("activeStaticPlansContainer");
                                            throw null;
                                        }
                                        composeView2.setViewCompositionStrategy(w3.c.f91623b);
                                        composeView2.setContent(new z3.e(-1197572523, true, new d(list, activeTrainingPlansActivity, 1)));
                                    }
                                    if (cVar2 != null) {
                                        int i18 = cVar2.f187757c;
                                        int i19 = cVar2.f187758d;
                                        String strQa = activeTrainingPlansActivity.qa(cVar2.f187759e);
                                        ComposeView composeView3 = activeTrainingPlansActivity.f45102h;
                                        if (composeView3 == null) {
                                            s.m("activeCyclingPlanBtn");
                                            throw null;
                                        }
                                        composeView3.setVisibility(0);
                                        composeView3.setViewCompositionStrategy(w3.c.f91623b);
                                        e eVar = new e(cVar2, activeTrainingPlansActivity, i18, i19, strQa, 1);
                                        cVar = cVar2;
                                        activeTrainingPlansActivity = activeTrainingPlansActivity;
                                        composeView3.setContent(new z3.e(1302543470, true, eVar));
                                    } else {
                                        cVar = cVar2;
                                        ComposeView composeView4 = activeTrainingPlansActivity.f45102h;
                                        if (composeView4 == null) {
                                            s.m("activeCyclingPlanBtn");
                                            throw null;
                                        }
                                        composeView4.setVisibility(8);
                                    }
                                    if (aVar3 != null) {
                                        int i24 = aVar3.f187757c;
                                        int i25 = aVar3.f187758d;
                                        String strQa2 = activeTrainingPlansActivity.qa(aVar3.f187759e);
                                        ComposeView composeView5 = activeTrainingPlansActivity.f45103i;
                                        if (composeView5 == null) {
                                            s.m("activeRunningPlanBtn");
                                            throw null;
                                        }
                                        composeView5.setViewCompositionStrategy(w3.c.f91623b);
                                        aVar = aVar3;
                                        composeView5.setContent(new z3.e(-1350856958, true, new f(activeTrainingPlansActivity, aVar, i24, i25, strQa2, 1)));
                                        ComposeView composeView6 = activeTrainingPlansActivity.f45103i;
                                        if (composeView6 == null) {
                                            s.m("activeRunningPlanBtn");
                                            throw null;
                                        }
                                        composeView6.setOnClickListener(new pm0.h(26, activeTrainingPlansActivity, aVar));
                                    } else {
                                        aVar = aVar3;
                                        ComposeView composeView7 = activeTrainingPlansActivity.f45103i;
                                        if (composeView7 == null) {
                                            s.m("activeRunningPlanBtn");
                                            throw null;
                                        }
                                        composeView7.setVisibility(8);
                                    }
                                    if ((bVar2 != null ? bVar2.f187720g : null) != null) {
                                        o oVar2 = bVar2.f187720g;
                                        if (oVar2 != null) {
                                            ComposeView composeView8 = activeTrainingPlansActivity.f45104j;
                                            if (composeView8 == null) {
                                                s.m("activeSinglePlanBtn");
                                                throw null;
                                            }
                                            composeView8.setVisibility(0);
                                            composeView8.setViewCompositionStrategy(w3.c.f91623b);
                                            composeView8.setContent(new z3.e(-1771328095, true, new c(oVar2, activeTrainingPlansActivity, bVar2, 0)));
                                        }
                                    } else {
                                        if ((dVar2 != null ? dVar2.f187743h : null) != null) {
                                            o oVar3 = dVar2.f187743h;
                                            if (oVar3 != null) {
                                                ComposeView composeView9 = activeTrainingPlansActivity.f45104j;
                                                if (composeView9 == null) {
                                                    s.m("activeSinglePlanBtn");
                                                    throw null;
                                                }
                                                composeView9.setVisibility(0);
                                                composeView9.setViewCompositionStrategy(w3.c.f91623b);
                                                composeView9.setContent(new z3.e(1264043947, true, new b(oVar3, activeTrainingPlansActivity, dVar2, 0)));
                                            }
                                        } else {
                                            ComposeView composeView10 = activeTrainingPlansActivity.f45104j;
                                            if (composeView10 == null) {
                                                s.m("activeSinglePlanBtn");
                                                throw null;
                                            }
                                            composeView10.setVisibility(8);
                                        }
                                    }
                                    TrainingPlansTwoLineButton trainingPlansTwoLineButton = activeTrainingPlansActivity.f45105k;
                                    if (trainingPlansTwoLineButton == null) {
                                        s.m("findPlanBtn");
                                        throw null;
                                    }
                                    trainingPlansTwoLineButton.setOnClickListener(new bw2.a(activeTrainingPlansActivity, aVar, cVar, bVar2, dVar2, list, 2));
                                    gy1.a aVar10 = activeTrainingPlansActivity.f45106l;
                                    if (aVar10 == null) {
                                        s.m("completedPlansBtnViewHolder");
                                        throw null;
                                    }
                                    TrainingPlansTwoLineButton trainingPlansTwoLineButton2 = aVar10.f80289a;
                                    TrainingPlansTwoLineButton.a(trainingPlansTwoLineButton2, String.valueOf(i16));
                                    trainingPlansTwoLineButton2.setOnClickListener(new aq.b0(i16, activeTrainingPlansActivity, 6));
                                    ut1.e eVar2 = activeTrainingPlansActivity.f45108n;
                                    if (eVar2 == null) {
                                        s.m("viewModel");
                                        throw null;
                                    }
                                    eVar2.f172584c = i16;
                                }
                            }
                        }
                        ut1.e eVar3 = activeTrainingPlansActivity.f45108n;
                        if (eVar3 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        eVar3.f172582a.f160851d.setValue(null);
                    } else {
                        if (i15 != 3) {
                            u0.r();
                            return null;
                        }
                        activeTrainingPlansActivity.hideProgressOverlay();
                        activeTrainingPlansActivity.na();
                        ut1.e eVar4 = activeTrainingPlansActivity.f45108n;
                        if (eVar4 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        eVar4.f172582a.f160851d.setValue(null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActiveTrainingPlansActivity activeTrainingPlansActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f166447b = activeTrainingPlansActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f166447b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to tt1.i$a for r4v1 'this'  t13.d
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
                int r1 = r4.f166446a
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
                com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity r5 = r4.f166447b
                ut1.e r1 = r5.f45108n
                if (r1 == 0) goto L33
                r53.b2 r1 = r1.f172585d
                tt1.i$a$a r3 = new tt1.i$a$a
                r3.<init>(r5)
                r4.f166446a = r2
                r53.o2<T> r5 = r1.f150540a
                java.lang.Object r5 = r5.collect(r3, r4)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                o2.c.f()
                goto Le
            L33:
                java.lang.String r5 = "viewModel"
                p005kotlin.jvm.internal.s.m(r5)
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: tt1.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ActiveTrainingPlansActivity activeTrainingPlansActivity, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f166445b = activeTrainingPlansActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f166445b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166444a;
        if (i14 == 0) {
            r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166445b;
            a aVar2 = new a(activeTrainingPlansActivity, null);
            this.f166444a = 1;
            if (h1.b(activeTrainingPlansActivity, bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
