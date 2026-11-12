package com.garmin.android.apps.connectmobile.training.atp.dashboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.i0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.CoachConsentActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.o1;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.x;
import cu1.d0;
import cu1.f0;
import cu1.k;
import fu1.m;
import fw.p;
import java.util.HashMap;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import v13.i;
import xw1.l;
import xw1.n;
import xw1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/d;", "Landroidx/fragment/app/Fragment;", "Lcu1/k;", "<init>", "()V", "b", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment implements k {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f45412x = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f45413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f45414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f45415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f45416d = new w1(s0.f105811a.b(wt1.d.class), new f(this), new h(this), new g(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f45417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f45418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public cu1.a f45419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public cu1.b f45421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f45422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Menu f45423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuItem f45424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem f45425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MenuItem f45426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MenuItem f45427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem f45428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public wt1.b f45429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o1 f45430r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f45431t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f45432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f.c<Intent> f45433w;

    public interface b extends s2, cu1.g {
        void H();

        void J(String str);

        void K(fu1.h hVar);

        void L(int i14, Bundle bundle);

        Unit N(com.garmin.android.library.backgroundtaskmanagement.b.c cVar);

        void P1(xw1.d dVar, String str, fg0.k kVar, n nVar);

        void Q(xw1.d dVar);

        void Q2(Integer num);

        void U();

        void g5(xw1.d dVar);

        void l();

        void m(long j8, boolean z14, boolean z15);

        void r(o oVar);
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45434a;

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
            f45434a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.dashboard.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardFragment$checkAndShowAddToHomePrompt$1", f = "TrainingPlanDashboardFragment.kt", l = {489}, m = "invokeSuspend", v = 2)
    public static final class C0873d extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45435a;

        public C0873d(t13.d<? super C0873d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new C0873d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0873d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            Context context;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f45435a;
            if (i14 == 0) {
                r.b(obj);
                tu1.i.a aVar2 = tu1.i.f166483a;
                this.f45435a = 1;
                obj = aVar2.n(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (((Boolean) obj).booleanValue() && (context = (dVar = d.this).getContext()) != null) {
                v childFragmentManager = dVar.getChildFragmentManager();
                childFragmentManager.getClass();
                i0 i0VarB = g22.f.b(dVar);
                View viewRequireView = dVar.requireView();
                viewRequireView.getClass();
                tu1.a.q(context, childFragmentManager, i0VarB, viewRequireView, new d0(dVar, 4));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/dashboard/d$e", "Landroidx/core/view/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements s {
        public e() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            menu.clear();
            menuInflater.inflate(R.menu.training_plan_dashboard_menu, menu);
            d dVar = d.this;
            dVar.f45423k = menu;
            dVar.f45424l = menu.findItem(R.id.menu_item_help);
            dVar.f45425m = menu.findItem(R.id.menu_item_edit);
            dVar.f45426n = menu.findItem(R.id.menu_item_pause_resume);
            dVar.f45427o = menu.findItem(R.id.menu_item_quit);
            dVar.f45428p = menu.findItem(R.id.menu_item_remove_plan);
            cu1.b bVar = dVar.f45421i;
            if (bVar == null) {
                p005kotlin.jvm.internal.s.m("presenter");
                throw null;
            }
            xw1.d dVarB = bVar.b();
            boolean zC0 = dVarB != null ? dVarB.c0() : false;
            boolean Z = dVarB != null ? dVarB.Z() : false;
            boolean zA0 = dVarB != null ? dVarB.a0() : false;
            boolean zM = dVarB != null ? dVarB.M() : false;
            boolean zH = dVarB != null ? dVarB.H() : false;
            d.u6(dVar, dVarB);
            dVar.z6(zC0);
            MenuItem menuItem = dVar.f45424l;
            if (menuItem != null) {
                menuItem.setVisible(Z && zH);
            }
            MenuItem menuItem2 = dVar.f45428p;
            if (menuItem2 != null) {
                menuItem2.setVisible(zA0 || zM);
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            b bVar;
            xw1.d dVar;
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            Integer confidence = null;
            final int i14 = 1;
            final d dVar2 = d.this;
            if (itemId == R.id.menu_item_help) {
                b bVar2 = dVar2.f45422j;
                if (bVar2 != null) {
                    cu1.b bVar3 = dVar2.f45421i;
                    if (bVar3 == null) {
                        p005kotlin.jvm.internal.s.m("presenter");
                        throw null;
                    }
                    fu1.v vVar = bVar3.f55632f;
                    if (vVar != null && (dVar = vVar.f73560a) != null) {
                        confidence = dVar.getConfidence();
                    }
                    bVar2.Q2(confidence);
                    return true;
                }
            } else {
                if (itemId == R.id.menu_item_pause_resume) {
                    cu1.b bVar4 = dVar2.f45421i;
                    if (bVar4 == null) {
                        p005kotlin.jvm.internal.s.m("presenter");
                        throw null;
                    }
                    xw1.d dVarB = bVar4.b();
                    if (dVarB != null && dVarB.e0()) {
                        if (dVar2.f45432v) {
                            dVar2.G5();
                            return true;
                        }
                        dVar2.l();
                        return true;
                    }
                    q1.b bVar5 = q1.f41066b;
                    String string = dVar2.getString(R.string.msg_pause_plan);
                    string.getClass();
                    String string2 = dVar2.getString(R.string.msg_pause_plan_info);
                    string2.getClass();
                    final int i15 = 2;
                    q1.a aVar = new q1.a() { // from class: cu1.e0
                        /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
                        
                            if (r8.length() != 0) goto L41;
                         */
                        @Override // com.garmin.android.apps.connectmobile.q1.a
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void g(boolean z14) {
                            xw1.k selectedRace;
                            xw1.k selectedRace2;
                            int i16 = i15;
                            com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar3 = dVar2;
                            switch (i16) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar2 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                                    if (z14) {
                                        if (dVar3.w6().f187048o != null) {
                                            wt1.d dVarW6 = dVar3.w6();
                                            xw1.c cVar = dVarW6.f187045l;
                                            if (((cVar == null || (selectedRace2 = cVar.getSelectedRace()) == null) ? null : selectedRace2.getRaceEventId()) == null) {
                                                xw1.c cVar2 = dVarW6.f187045l;
                                                String raceEventUuid = (cVar2 == null || (selectedRace = cVar2.getSelectedRace()) == null) ? null : selectedRace.getRaceEventUuid();
                                                if (raceEventUuid != null) {
                                                }
                                                break;
                                            }
                                            fg0.k kVar = dVar3.w6().f187048o;
                                            kVar.getClass();
                                            fg0.k kVar2 = dVar3.w6().f187048o;
                                            String string3 = (kVar2 == null || !kVar2.p0()) ? dVar3.getString(R.string.keep_training_plan_with_event_created, kVar.r(false)) : dVar3.getString(R.string.keep_training_plan_with_event_subscribed, kVar.r(false));
                                            string3.getClass();
                                            fg0.k kVar3 = dVar3.w6().f187048o;
                                            int i17 = (kVar3 == null || !kVar3.p0()) ? R.string.delete_event : R.string.workout_remove_from_calendar;
                                            Context context = dVar3.getContext();
                                            if (context != null) {
                                                androidx.fragment.app.v childFragmentManager = dVar3.getChildFragmentManager();
                                                childFragmentManager.getClass();
                                                rt1.n.d(context, childFragmentManager, string3, i17, new cn1.d(10, dVar3, kVar));
                                                return;
                                            }
                                            return;
                                        }
                                        b bVar6 = dVar3.f45421i;
                                        if (bVar6 != null) {
                                            bVar6.f();
                                            return;
                                        } else {
                                            p005kotlin.jvm.internal.s.m("presenter");
                                            throw null;
                                        }
                                    }
                                    return;
                                case 1:
                                    if (!z14) {
                                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar3 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                                        return;
                                    }
                                    b bVar7 = dVar3.f45421i;
                                    if (bVar7 == null) {
                                        p005kotlin.jvm.internal.s.m("presenter");
                                        throw null;
                                    }
                                    bVar7.f55627a.U1();
                                    bVar7.f55630d.add(Long.valueOf(bVar7.f55629c.L(bVar7.f55628b, bVar7.f55641o)));
                                    return;
                                default:
                                    if (!z14) {
                                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar4 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                                        return;
                                    }
                                    b bVar8 = dVar3.f45421i;
                                    if (bVar8 != null) {
                                        bVar8.e();
                                        return;
                                    } else {
                                        p005kotlin.jvm.internal.s.m("presenter");
                                        throw null;
                                    }
                            }
                        }
                    };
                    bVar5.getClass();
                    q1 q1VarC = q1.b.c(string, string2, R.string.common_confirm, R.string.device_action_cancel, aVar);
                    v childFragmentManager = dVar2.getChildFragmentManager();
                    childFragmentManager.getClass();
                    q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
                    return true;
                }
                final int i16 = 0;
                if (itemId == R.id.menu_item_quit) {
                    a aVar2 = d.f45412x;
                    dVar2.getClass();
                    q1.b bVar6 = q1.f41066b;
                    String string3 = dVar2.getString(R.string.msg_quit_plan);
                    string3.getClass();
                    String string4 = dVar2.getString(R.string.msg_quit_plan_info);
                    string4.getClass();
                    q1.a aVar3 = new q1.a() { // from class: cu1.e0
                        /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
                        
                            if (r8.length() != 0) goto L41;
                         */
                        @Override // com.garmin.android.apps.connectmobile.q1.a
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void g(boolean z14) {
                            xw1.k selectedRace;
                            xw1.k selectedRace2;
                            int i17 = i16;
                            com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar3 = dVar2;
                            switch (i17) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar4 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                                    if (z14) {
                                        if (dVar3.w6().f187048o != null) {
                                            wt1.d dVarW6 = dVar3.w6();
                                            xw1.c cVar = dVarW6.f187045l;
                                            if (((cVar == null || (selectedRace2 = cVar.getSelectedRace()) == null) ? null : selectedRace2.getRaceEventId()) == null) {
                                                xw1.c cVar2 = dVarW6.f187045l;
                                                String raceEventUuid = (cVar2 == null || (selectedRace = cVar2.getSelectedRace()) == null) ? null : selectedRace.getRaceEventUuid();
                                                if (raceEventUuid != null) {
                                                }
                                                break;
                                            }
                                            fg0.k kVar = dVar3.w6().f187048o;
                                            kVar.getClass();
                                            fg0.k kVar2 = dVar3.w6().f187048o;
                                            String string5 = (kVar2 == null || !kVar2.p0()) ? dVar3.getString(R.string.keep_training_plan_with_event_created, kVar.r(false)) : dVar3.getString(R.string.keep_training_plan_with_event_subscribed, kVar.r(false));
                                            string5.getClass();
                                            fg0.k kVar3 = dVar3.w6().f187048o;
                                            int i18 = (kVar3 == null || !kVar3.p0()) ? R.string.delete_event : R.string.workout_remove_from_calendar;
                                            Context context = dVar3.getContext();
                                            if (context != null) {
                                                androidx.fragment.app.v childFragmentManager2 = dVar3.getChildFragmentManager();
                                                childFragmentManager2.getClass();
                                                rt1.n.d(context, childFragmentManager2, string5, i18, new cn1.d(10, dVar3, kVar));
                                                return;
                                            }
                                            return;
                                        }
                                        b bVar7 = dVar3.f45421i;
                                        if (bVar7 != null) {
                                            bVar7.f();
                                            return;
                                        } else {
                                            p005kotlin.jvm.internal.s.m("presenter");
                                            throw null;
                                        }
                                    }
                                    return;
                                case 1:
                                    if (!z14) {
                                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar5 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                                        return;
                                    }
                                    b bVar8 = dVar3.f45421i;
                                    if (bVar8 == null) {
                                        p005kotlin.jvm.internal.s.m("presenter");
                                        throw null;
                                    }
                                    bVar8.f55627a.U1();
                                    bVar8.f55630d.add(Long.valueOf(bVar8.f55629c.L(bVar8.f55628b, bVar8.f55641o)));
                                    return;
                                default:
                                    if (!z14) {
                                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar6 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                                        return;
                                    }
                                    b bVar9 = dVar3.f45421i;
                                    if (bVar9 != null) {
                                        bVar9.e();
                                        return;
                                    } else {
                                        p005kotlin.jvm.internal.s.m("presenter");
                                        throw null;
                                    }
                            }
                        }
                    };
                    bVar6.getClass();
                    q1 q1VarC2 = q1.b.c(string3, string4, R.string.common_confirm, R.string.device_action_cancel, aVar3);
                    v childFragmentManager2 = dVar2.getChildFragmentManager();
                    childFragmentManager2.getClass();
                    q1VarC2.v6(childFragmentManager2, "GCMFragTwoBttnAlertDialog");
                    return true;
                }
                if (itemId != R.id.menu_item_edit) {
                    if (itemId != R.id.menu_item_remove_plan) {
                        return false;
                    }
                    a aVar4 = d.f45412x;
                    dVar2.getClass();
                    q1.b bVar7 = q1.f41066b;
                    String string5 = dVar2.getString(R.string.atp_remove_plan_title);
                    string5.getClass();
                    cu1.b bVar8 = dVar2.f45421i;
                    if (bVar8 == null) {
                        p005kotlin.jvm.internal.s.m("presenter");
                        throw null;
                    }
                    String string6 = dVar2.getString(R.string.atp_remove_plan_msg, bVar8.d());
                    string6.getClass();
                    q1.a aVar5 = new q1.a() { // from class: cu1.e0
                        /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
                        
                            if (r8.length() != 0) goto L41;
                         */
                        @Override // com.garmin.android.apps.connectmobile.q1.a
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void g(boolean z14) {
                            xw1.k selectedRace;
                            xw1.k selectedRace2;
                            int i17 = i14;
                            com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar3 = dVar2;
                            switch (i17) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar6 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                                    if (z14) {
                                        if (dVar3.w6().f187048o != null) {
                                            wt1.d dVarW6 = dVar3.w6();
                                            xw1.c cVar = dVarW6.f187045l;
                                            if (((cVar == null || (selectedRace2 = cVar.getSelectedRace()) == null) ? null : selectedRace2.getRaceEventId()) == null) {
                                                xw1.c cVar2 = dVarW6.f187045l;
                                                String raceEventUuid = (cVar2 == null || (selectedRace = cVar2.getSelectedRace()) == null) ? null : selectedRace.getRaceEventUuid();
                                                if (raceEventUuid != null) {
                                                }
                                                break;
                                            }
                                            fg0.k kVar = dVar3.w6().f187048o;
                                            kVar.getClass();
                                            fg0.k kVar2 = dVar3.w6().f187048o;
                                            String string7 = (kVar2 == null || !kVar2.p0()) ? dVar3.getString(R.string.keep_training_plan_with_event_created, kVar.r(false)) : dVar3.getString(R.string.keep_training_plan_with_event_subscribed, kVar.r(false));
                                            string7.getClass();
                                            fg0.k kVar3 = dVar3.w6().f187048o;
                                            int i18 = (kVar3 == null || !kVar3.p0()) ? R.string.delete_event : R.string.workout_remove_from_calendar;
                                            Context context = dVar3.getContext();
                                            if (context != null) {
                                                androidx.fragment.app.v childFragmentManager3 = dVar3.getChildFragmentManager();
                                                childFragmentManager3.getClass();
                                                rt1.n.d(context, childFragmentManager3, string7, i18, new cn1.d(10, dVar3, kVar));
                                                return;
                                            }
                                            return;
                                        }
                                        b bVar9 = dVar3.f45421i;
                                        if (bVar9 != null) {
                                            bVar9.f();
                                            return;
                                        } else {
                                            p005kotlin.jvm.internal.s.m("presenter");
                                            throw null;
                                        }
                                    }
                                    return;
                                case 1:
                                    if (!z14) {
                                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar7 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                                        return;
                                    }
                                    b bVar10 = dVar3.f45421i;
                                    if (bVar10 == null) {
                                        p005kotlin.jvm.internal.s.m("presenter");
                                        throw null;
                                    }
                                    bVar10.f55627a.U1();
                                    bVar10.f55630d.add(Long.valueOf(bVar10.f55629c.L(bVar10.f55628b, bVar10.f55641o)));
                                    return;
                                default:
                                    if (!z14) {
                                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar8 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                                        return;
                                    }
                                    b bVar11 = dVar3.f45421i;
                                    if (bVar11 != null) {
                                        bVar11.e();
                                        return;
                                    } else {
                                        p005kotlin.jvm.internal.s.m("presenter");
                                        throw null;
                                    }
                            }
                        }
                    };
                    bVar7.getClass();
                    q1 q1VarC3 = q1.b.c(string5, string6, R.string.lbl_common_remove, R.string.device_action_cancel, aVar5);
                    v childFragmentManager3 = dVar2.getChildFragmentManager();
                    childFragmentManager3.getClass();
                    q1VarC3.v6(childFragmentManager3, "GCMFragTwoBttnAlertDialog");
                    return true;
                }
                cu1.b bVar9 = dVar2.f45421i;
                if (bVar9 == null) {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
                xw1.d dVarB2 = bVar9.b();
                if (dVarB2 != null && (bVar = dVar2.f45422j) != null) {
                    cu1.b bVar10 = dVar2.f45421i;
                    if (bVar10 != null) {
                        bVar.P1(dVarB2, bVar10.d(), dVar2.w6().f187048o, dVar2.w6().f187049p);
                        return true;
                    }
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45438a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f45438a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45438a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45440b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45439a = aVar;
            this.f45440b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45439a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45440b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f45441a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45441a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0057  */
    /* JADX WARN: Type inference failed for: r0v0, types: [cu1.f0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [cu1.f0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [cu1.f0] */
    public d() {
        boolean z14;
        final int i14 = 0;
        this.f45413a = new z0(this) { // from class: cu1.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.training.atp.dashboard.d f55673b;

            {
                this.f55673b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f55673b;
                switch (i15) {
                    case 0:
                        xw1.l lVar = (xw1.l) obj;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                        if (lVar != null) {
                            Integer num = lVar.f192415a;
                            if (num != null && num.intValue() == R.string.event_date_changed) {
                                rt1.l.f154545a.getClass();
                                rt1.l.a("GarminCoachATPDateChangeNotification");
                            }
                            o1 o1VarA = o1.b.a(o1.f39651c, num != null ? num.intValue() : -1, lVar.f192416b, lVar.f192417c, lVar.f192418d, new g0(lVar, dVar), null, null, null, 448);
                            dVar.f45430r = o1VarA;
                            o1VarA.setCancelable(false);
                            o1 o1Var = dVar.f45430r;
                            if (o1Var != null) {
                                androidx.fragment.app.v childFragmentManager = dVar.getChildFragmentManager();
                                childFragmentManager.getClass();
                                o1Var.show(childFragmentManager, "GCMFragTwoBtnVerticalAlertDialog");
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar2 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                        g3Var.getClass();
                        int i16 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.c.f45434a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            g22.e.l(dVar);
                            return;
                        }
                        if (i16 != 2) {
                            if (i16 != 3) {
                                u0.r();
                                return;
                            } else {
                                dVar.i3();
                                g22.e.f(dVar);
                                return;
                            }
                        }
                        g22.e.f(dVar);
                        b bVar = dVar.f45421i;
                        if (bVar != null) {
                            bVar.f();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("presenter");
                            throw null;
                        }
                    default:
                        rt1.a aVar3 = (rt1.a) obj;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar4 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                        aVar3.getClass();
                        if (aVar3 instanceof rt1.a.c) {
                            g22.e.l(dVar);
                            return;
                        }
                        if (aVar3 instanceof rt1.a.b) {
                            fg0.k kVar = ((rt1.a.b) aVar3).f154511a;
                            if (kVar != null) {
                                b bVar2 = dVar.f45421i;
                                if (bVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("presenter");
                                    throw null;
                                }
                                xw1.d dVarB = bVar2.b();
                                if (dVarB != null) {
                                    dVar.w6().H4(kVar, dVarB);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (!(aVar3 instanceof rt1.a.d)) {
                            if (!(aVar3 instanceof rt1.a.C2926a)) {
                                u0.r();
                                return;
                            } else {
                                g22.e.f(dVar);
                                dVar.i3();
                                return;
                            }
                        }
                        g22.e.f(dVar);
                        ((y0) dVar.w6().f187041h.getValue()).m(null);
                        b bVar3 = dVar.f45421i;
                        if (bVar3 == null) {
                            p005kotlin.jvm.internal.s.m("presenter");
                            throw null;
                        }
                        bVar3.c(-1);
                        if (dVar.getActivity() instanceof TrainingPlanDashboardActivity) {
                            androidx.fragment.app.m activity = dVar.getActivity();
                            activity.getClass();
                            ((TrainingPlanDashboardActivity) activity).f45391l = true;
                            return;
                        }
                        return;
                }
            }
        };
        final int i15 = 1;
        this.f45414b = new z0(this) { // from class: cu1.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.training.atp.dashboard.d f55673b;

            {
                this.f55673b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f55673b;
                switch (i16) {
                    case 0:
                        xw1.l lVar = (xw1.l) obj;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                        if (lVar != null) {
                            Integer num = lVar.f192415a;
                            if (num != null && num.intValue() == R.string.event_date_changed) {
                                rt1.l.f154545a.getClass();
                                rt1.l.a("GarminCoachATPDateChangeNotification");
                            }
                            o1 o1VarA = o1.b.a(o1.f39651c, num != null ? num.intValue() : -1, lVar.f192416b, lVar.f192417c, lVar.f192418d, new g0(lVar, dVar), null, null, null, 448);
                            dVar.f45430r = o1VarA;
                            o1VarA.setCancelable(false);
                            o1 o1Var = dVar.f45430r;
                            if (o1Var != null) {
                                androidx.fragment.app.v childFragmentManager = dVar.getChildFragmentManager();
                                childFragmentManager.getClass();
                                o1Var.show(childFragmentManager, "GCMFragTwoBtnVerticalAlertDialog");
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar2 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                        g3Var.getClass();
                        int i17 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.c.f45434a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            g22.e.l(dVar);
                            return;
                        }
                        if (i17 != 2) {
                            if (i17 != 3) {
                                u0.r();
                                return;
                            } else {
                                dVar.i3();
                                g22.e.f(dVar);
                                return;
                            }
                        }
                        g22.e.f(dVar);
                        b bVar = dVar.f45421i;
                        if (bVar != null) {
                            bVar.f();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("presenter");
                            throw null;
                        }
                    default:
                        rt1.a aVar3 = (rt1.a) obj;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar4 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                        aVar3.getClass();
                        if (aVar3 instanceof rt1.a.c) {
                            g22.e.l(dVar);
                            return;
                        }
                        if (aVar3 instanceof rt1.a.b) {
                            fg0.k kVar = ((rt1.a.b) aVar3).f154511a;
                            if (kVar != null) {
                                b bVar2 = dVar.f45421i;
                                if (bVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("presenter");
                                    throw null;
                                }
                                xw1.d dVarB = bVar2.b();
                                if (dVarB != null) {
                                    dVar.w6().H4(kVar, dVarB);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (!(aVar3 instanceof rt1.a.d)) {
                            if (!(aVar3 instanceof rt1.a.C2926a)) {
                                u0.r();
                                return;
                            } else {
                                g22.e.f(dVar);
                                dVar.i3();
                                return;
                            }
                        }
                        g22.e.f(dVar);
                        ((y0) dVar.w6().f187041h.getValue()).m(null);
                        b bVar3 = dVar.f45421i;
                        if (bVar3 == null) {
                            p005kotlin.jvm.internal.s.m("presenter");
                            throw null;
                        }
                        bVar3.c(-1);
                        if (dVar.getActivity() instanceof TrainingPlanDashboardActivity) {
                            androidx.fragment.app.m activity = dVar.getActivity();
                            activity.getClass();
                            ((TrainingPlanDashboardActivity) activity).f45391l = true;
                            return;
                        }
                        return;
                }
            }
        };
        final int i16 = 2;
        this.f45415c = new z0(this) { // from class: cu1.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.training.atp.dashboard.d f55673b;

            {
                this.f55673b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f55673b;
                switch (i17) {
                    case 0:
                        xw1.l lVar = (xw1.l) obj;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                        if (lVar != null) {
                            Integer num = lVar.f192415a;
                            if (num != null && num.intValue() == R.string.event_date_changed) {
                                rt1.l.f154545a.getClass();
                                rt1.l.a("GarminCoachATPDateChangeNotification");
                            }
                            o1 o1VarA = o1.b.a(o1.f39651c, num != null ? num.intValue() : -1, lVar.f192416b, lVar.f192417c, lVar.f192418d, new g0(lVar, dVar), null, null, null, 448);
                            dVar.f45430r = o1VarA;
                            o1VarA.setCancelable(false);
                            o1 o1Var = dVar.f45430r;
                            if (o1Var != null) {
                                androidx.fragment.app.v childFragmentManager = dVar.getChildFragmentManager();
                                childFragmentManager.getClass();
                                o1Var.show(childFragmentManager, "GCMFragTwoBtnVerticalAlertDialog");
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar2 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                        g3Var.getClass();
                        int i18 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.c.f45434a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            g22.e.l(dVar);
                            return;
                        }
                        if (i18 != 2) {
                            if (i18 != 3) {
                                u0.r();
                                return;
                            } else {
                                dVar.i3();
                                g22.e.f(dVar);
                                return;
                            }
                        }
                        g22.e.f(dVar);
                        b bVar = dVar.f45421i;
                        if (bVar != null) {
                            bVar.f();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("presenter");
                            throw null;
                        }
                    default:
                        rt1.a aVar3 = (rt1.a) obj;
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar4 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                        aVar3.getClass();
                        if (aVar3 instanceof rt1.a.c) {
                            g22.e.l(dVar);
                            return;
                        }
                        if (aVar3 instanceof rt1.a.b) {
                            fg0.k kVar = ((rt1.a.b) aVar3).f154511a;
                            if (kVar != null) {
                                b bVar2 = dVar.f45421i;
                                if (bVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("presenter");
                                    throw null;
                                }
                                xw1.d dVarB = bVar2.b();
                                if (dVarB != null) {
                                    dVar.w6().H4(kVar, dVarB);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (!(aVar3 instanceof rt1.a.d)) {
                            if (!(aVar3 instanceof rt1.a.C2926a)) {
                                u0.r();
                                return;
                            } else {
                                g22.e.f(dVar);
                                dVar.i3();
                                return;
                            }
                        }
                        g22.e.f(dVar);
                        ((y0) dVar.w6().f187041h.getValue()).m(null);
                        b bVar3 = dVar.f45421i;
                        if (bVar3 == null) {
                            p005kotlin.jvm.internal.s.m("presenter");
                            throw null;
                        }
                        bVar3.c(-1);
                        if (dVar.getActivity() instanceof TrainingPlanDashboardActivity) {
                            androidx.fragment.app.m activity = dVar.getActivity();
                            activity.getClass();
                            ((TrainingPlanDashboardActivity) activity).f45391l = true;
                            return;
                        }
                        return;
                }
            }
        };
        p92.o oVar = p92.o.f136619a;
        q92.x xVar = q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
        oVar.getClass();
        q92.v vVarN = p92.o.n(xVar);
        boolean zB = s3.b();
        this.f45431t = zB;
        if (zB && vVarN != null) {
            z14 = q92.c.a(vVarN);
        }
        this.f45432v = z14;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new a61.i(this, 11));
        cVarRegisterForActivityResult.getClass();
        this.f45433w = cVarRegisterForActivityResult;
    }

    public static final void u6(d dVar, xw1.d dVar2) {
        MenuItem menuItemFindItem;
        Menu menu = dVar.f45423k;
        if (menu == null || (menuItemFindItem = menu.findItem(R.id.menu_item_pause_resume)) == null) {
            return;
        }
        if (dVar2 == null || !dVar2.e0()) {
            menuItemFindItem.setTitle(dVar.getString(R.string.lbl_pause));
        } else if (dVar.f45432v) {
            menuItemFindItem.setTitle(dVar.getString(R.string.lbl_review_consent));
        } else {
            menuItemFindItem.setTitle(dVar.getString(R.string.lbl_resume));
        }
    }

    @Override // cu1.k
    public final void G2() {
        ge1.b.T(g22.f.b(this), null, null, new C0873d(null), 3);
    }

    @Override // cu1.k
    public final void G5() {
        CoachConsentActivity.a aVar = CoachConsentActivity.f32153p;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f45433w.a(CoachConsentActivity.a.a(aVar, contextRequireContext, null, 6), null);
    }

    @Override // cu1.k
    public final void H() {
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.H();
        }
    }

    @Override // cu1.k
    public final void J(String str) {
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.J(str);
        }
    }

    @Override // cu1.k
    public final void K(fu1.h hVar) {
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.K(hVar);
        }
    }

    @Override // cu1.k
    public final void L(int i14, Bundle bundle) {
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.L(i14, bundle);
        }
    }

    @Override // cu1.k
    public final void M0(m mVar) {
        mVar.getClass();
        cu1.a aVar = this.f45419g;
        if (aVar != null) {
            HashMap map = aVar.f55613e;
            int i14 = mVar.f73540a;
            map.put(Integer.valueOf(i14), mVar);
            aVar.notifyItemChanged(aVar.f34942a.size() + i14);
        }
    }

    @Override // cu1.k
    public final Unit N(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        b bVar = this.f45422j;
        if (bVar != null) {
            return bVar.N(cVar);
        }
        return null;
    }

    @Override // cu1.k
    public final void N5(fu1.n nVar) {
        nVar.getClass();
        cu1.a aVar = this.f45419g;
        if (aVar != null) {
            HashMap map = aVar.f55615g;
            int i14 = nVar.f73540a;
            map.put(Integer.valueOf(i14), nVar);
            aVar.notifyItemChanged(aVar.f34942a.size() + i14);
        }
    }

    @Override // cu1.k
    public final void Q(xw1.d dVar) {
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.Q(dVar);
        }
    }

    @Override // cu1.k
    public final void Q3(fu1.p pVar) {
        pVar.getClass();
        cu1.a aVar = this.f45419g;
        if (aVar != null) {
            HashMap map = aVar.f55614f;
            int i14 = pVar.f73540a;
            map.put(Integer.valueOf(i14), pVar);
            aVar.notifyItemChanged(aVar.f34942a.size() + i14);
        }
    }

    @Override // cu1.k
    public final void S3(int i14) {
        z6(false);
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.showProgressOverlay(getString(i14));
        }
    }

    @Override // cu1.k
    public final void U() {
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.U();
        }
    }

    @Override // cu1.k
    public final Unit U1() {
        z6(false);
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.showProgressOverlay();
        }
        return Unit.INSTANCE;
    }

    @Override // cu1.k
    public final void V(int i14) {
        Button button;
        wt1.b bVar = this.f45429q;
        if (bVar != null) {
            bVar.c(new ag0.a(this, i14, 2));
        }
        wt1.b bVar2 = this.f45429q;
        if (bVar2 != null && (button = bVar2.f187030e) != null) {
            button.setVisibility(0);
            Unit unit = Unit.INSTANCE;
        }
        wt1.b bVar3 = this.f45429q;
        if (bVar3 != null) {
            bVar3.g();
        }
    }

    @Override // cu1.k
    public final void Y2() {
        wt1.b bVar = this.f45429q;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // cu1.k
    public final Unit g3(fu1.v vVar) {
        vVar.getClass();
        o53.f0.w(this).b(new com.garmin.android.apps.connectmobile.training.atp.dashboard.e(this, vVar, null));
        return Unit.INSTANCE;
    }

    @Override // cu1.k
    public final void i3() {
        wt1.b bVar = this.f45429q;
        if (bVar != null) {
            bVar.c(new d0(this, 0));
        }
        wt1.b bVar2 = this.f45429q;
        if (bVar2 != null) {
            bVar2.a();
        }
        wt1.b bVar3 = this.f45429q;
        if (bVar3 != null) {
            bVar3.g();
        }
    }

    @Override // cu1.k
    public final void l() {
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.l();
        }
    }

    @Override // cu1.k
    public final void m(long j8, boolean z14, boolean z15) {
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.m(j8, z14, z15);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            RecyclerView recyclerView = this.f45418f;
            if (recyclerView == null) {
                p005kotlin.jvm.internal.s.m("recyclerView");
                throw null;
            }
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(activity));
            this.f45421i = new cu1.b(this, this.f45420h);
            cu1.b bVar = this.f45421i;
            if (bVar == null) {
                p005kotlin.jvm.internal.s.m("presenter");
                throw null;
            }
            cu1.a aVar = new cu1.a(activity, bVar, this.f45422j);
            this.f45419g = aVar;
            RecyclerView recyclerView2 = this.f45418f;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(aVar);
            } else {
                p005kotlin.jvm.internal.s.m("recyclerView");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f45422j = (b) context;
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement DashboardHandler");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        b bVar;
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f45420h = arguments != null ? arguments.getLong("EXTRA_ATHLETE_PLAN_ID") : 0L;
            Bundle arguments2 = getArguments();
            String string = arguments2 != null ? arguments2.getString("EXTRA_ATHLETE_PLAN_TITLE") : null;
            if (string == null || (bVar = this.f45422j) == null) {
                return;
            }
            bVar.J(string);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_training_create_default_step, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.simple_recycler_view);
        viewFindViewById.getClass();
        this.f45418f = (RecyclerView) viewFindViewById;
        wt1.b bVar = new wt1.b(viewInflate.findViewById(R.id.training_error_layout));
        this.f45429q = bVar;
        bVar.b();
        wt1.b bVar2 = this.f45429q;
        if (bVar2 != null) {
            bVar2.c(new d0(this, 1));
        }
        wt1.b bVar3 = this.f45429q;
        if (bVar3 != null) {
            bVar3.f();
        }
        wt1.b bVar4 = this.f45429q;
        if (bVar4 != null) {
            bVar4.d(new d0(this, 2));
        }
        wt1.b bVar5 = this.f45429q;
        if (bVar5 != null) {
            bVar5.e();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        o1 o1Var;
        super.onResume();
        o1 o1Var2 = this.f45430r;
        if (o1Var2 == null || o1Var2.isVisible() || (o1Var = this.f45430r) == null) {
            return;
        }
        v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        o1Var.show(childFragmentManager, "GCMFragTwoBtnVerticalAlertDialog");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        cu1.b bVar = this.f45421i;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        if (!bVar.f55631e) {
            bVar.c(-1);
        }
        bVar.f55631e = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        cu1.b bVar = this.f45421i;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        bVar.f55627a.t();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.c(bVar.f55630d);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new e(), androidx.lifecycle.b0.b.RESUMED);
        ((androidx.lifecycle.s0) w6().f187042i.getValue()).f(getViewLifecycleOwner(), this.f45413a);
        ((androidx.lifecycle.s0) w6().f187044k.getValue()).f(getViewLifecycleOwner(), this.f45414b);
        ((androidx.lifecycle.s0) w6().f187040g.getValue()).f(getViewLifecycleOwner(), this.f45415c);
    }

    @Override // cu1.k
    public final void p5(List<? extends sd2.f> list) {
        String string;
        list.getClass();
        Context context = getContext();
        if (context != null) {
            if (list.size() >= 3) {
                String string2 = getString(R.string.common_conjunct_3, String.valueOf(list.get(0).getDisplayName()), String.valueOf(list.get(1).getDisplayName()), String.valueOf(list.get(2).getDisplayName()));
                string2.getClass();
                string = getString(R.string.gcm_training_status_paused_many_devices_desc, string2);
            } else if (list.size() == 2) {
                String string3 = getString(R.string.common_conjunct_2, String.valueOf(list.get(0).getDisplayName()), String.valueOf(list.get(1).getDisplayName()));
                string3.getClass();
                string = getString(R.string.gcm_training_status_paused_many_devices_desc, string3);
            } else {
                string = list.size() == 1 ? getString(R.string.gcm_training_status_paused_single_device_desc, String.valueOf(list.get(0).getDisplayName())) : getString(R.string.gcm_training_status_paused_from_plan_desc);
            }
            new androidx.appcompat.app.e.a(context).setTitle(getString(R.string.gcm_training_status_paused_label)).setMessage(string).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(5)).show();
        }
    }

    @Override // cu1.k
    public final void r(o oVar) {
        b bVar = this.f45422j;
        if (bVar != null) {
            bVar.r(oVar);
        }
    }

    @Override // cu1.k
    public final Unit t() {
        cu1.b bVar = this.f45421i;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        xw1.d dVarB = bVar.b();
        z6(dVarB != null ? dVarB.c0() : false);
        b bVar2 = this.f45422j;
        if (bVar2 != null) {
            bVar2.hideProgressOverlay();
        }
        return Unit.INSTANCE;
    }

    public final void v6() {
        xw1.d dVar;
        cu1.b bVar = this.f45421i;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        fu1.v vVar = bVar.f55632f;
        if (vVar != null && (dVar = vVar.f73560a) != null) {
            dVar.b();
        }
        fu1.v vVar2 = bVar.f55632f;
        if (vVar2 != null) {
            bVar.f55627a.g3(vVar2);
        }
    }

    public final wt1.d w6() {
        return (wt1.d) this.f45416d.getValue();
    }

    public final void y6(l lVar, boolean z14, int i14) {
        ww1.h athleteRace;
        cu1.b bVar = this.f45421i;
        xw1.k kVarJ = null;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        xw1.d dVarB = bVar.b();
        if (dVarB != null) {
            rt1.r.a aVar = rt1.r.f154555d;
            int workoutPlanTypeId = dVarB.getWorkoutPlanTypeId();
            aVar.getClass();
            rt1.r rVarB = rt1.r.a.b(workoutPlanTypeId);
            if (rVarB != null) {
                wt1.a aVar2 = (wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null);
                androidx.fragment.app.m mVarRequireActivity = requireActivity();
                mVarRequireActivity.getClass();
                int iOrdinal = rVarB.ordinal();
                DateTime dateTime = lVar.f192419e;
                DateTime dateTime2 = lVar.f192420f;
                cu1.b bVar2 = this.f45421i;
                if (bVar2 == null) {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
                String strD = bVar2.d();
                if (z14) {
                    cu1.b bVar3 = this.f45421i;
                    if (bVar3 == null) {
                        p005kotlin.jvm.internal.s.m("presenter");
                        throw null;
                    }
                    xw1.d dVarB2 = bVar3.b();
                    if (dVarB2 != null && (athleteRace = dVarB2.getAthleteRace()) != null) {
                        kVarJ = athleteRace.j();
                    }
                }
                aVar2.m(mVarRequireActivity, iOrdinal, dateTime, dateTime2, strD, kVarJ, Integer.valueOf(i14));
            }
        }
    }

    public final void z6(boolean z14) {
        cu1.b bVar = this.f45421i;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        xw1.d dVarB = bVar.b();
        boolean zC0 = dVarB != null ? dVarB.c0() : false;
        cu1.b bVar2 = this.f45421i;
        if (bVar2 == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        xw1.d dVarB2 = bVar2.b();
        boolean Z = dVarB2 != null ? dVarB2.Z() : false;
        cu1.b bVar3 = this.f45421i;
        if (bVar3 == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        xw1.d dVarB3 = bVar3.b();
        boolean zA0 = dVarB3 != null ? dVarB3.a0() : false;
        cu1.b bVar4 = this.f45421i;
        if (bVar4 == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        xw1.d dVarB4 = bVar4.b();
        boolean zM = dVarB4 != null ? dVarB4.M() : false;
        cu1.b bVar5 = this.f45421i;
        if (bVar5 == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        xw1.d dVarB5 = bVar5.b();
        boolean zH = dVarB5 != null ? dVarB5.H() : false;
        cu1.b bVar6 = this.f45421i;
        if (bVar6 == null) {
            p005kotlin.jvm.internal.s.m("presenter");
            throw null;
        }
        xw1.d dVarB6 = bVar6.b();
        boolean zE0 = dVarB6 != null ? dVarB6.e0() : false;
        MenuItem menuItem = this.f45424l;
        if (menuItem != null) {
            menuItem.setVisible(z14 && zH && Z);
        }
        MenuItem menuItem2 = this.f45425m;
        if (menuItem2 != null) {
            menuItem2.setVisible(z14 && zC0 && !zE0);
        }
        MenuItem menuItem3 = this.f45426n;
        if (menuItem3 != null) {
            menuItem3.setVisible(z14 && zC0);
        }
        MenuItem menuItem4 = this.f45427o;
        if (menuItem4 != null) {
            menuItem4.setVisible(z14 && (Z || this.f45432v));
        }
        MenuItem menuItem5 = this.f45428p;
        if (menuItem5 != null) {
            menuItem5.setVisible(zA0 || zM);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_ATHLETE_PLAN_ID", "EXTRA_ATHLETE_PLAN_TITLE", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
