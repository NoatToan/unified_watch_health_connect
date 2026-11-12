package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.TrainingPrioritySelectionActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import mz1.e0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f45928o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexTwoLineButton f45930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f45931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f45932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexTwoLineButton f45933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexTwoLineButton f45934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexTwoLineButton f45935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ComposeView f45936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fg0.k f45937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jy1.b f45938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ww1.g f45939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.c<Intent> f45940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.c<Intent> f45941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f.c<Intent> f45942n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45943a;

        static {
            int[] iArr = new int[gg0.h.values().length];
            try {
                iArr[gg0.h.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.h.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45943a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f45944a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f45944a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f45944a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45944a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45945a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f45945a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45945a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0887e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0887e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45946a = aVar;
            this.f45947b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45946a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45947b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f45948a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45948a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public e() {
        super(R.layout.event_details_training_fragment);
        this.f45929a = new w1(s0.f105811a.b(e0.class), new d(this), new f(this), new C0887e(null, this));
        this.f45938j = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
        final int i14 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: ty1.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167256b;

            {
                this.f167256b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Parcelable parcelable;
                Parcelable parcelable2;
                int i15 = i14;
                fg0.k kVar = null;
                fg0.k kVar2 = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = this.f167256b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("GCM_extra_sharable_event_dto", fg0.k.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("GCM_extra_sharable_event_dto");
                                    parcelable = (fg0.k) (parcelableExtra instanceof fg0.k ? parcelableExtra : null);
                                }
                                kVar = (fg0.k) parcelable;
                            }
                            if (kVar != null) {
                                eVar.w6().E5(kVar);
                            }
                            eVar.w6().f204399p = intent != null ? intent.getBooleanExtra("extra_event_dashboard_refresh_needed", false) : false;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent2 = aVar.f67586b;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) intent2.getParcelableExtra("GCM_extra_sharable_event_dto", fg0.k.class);
                                } else {
                                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("GCM_extra_sharable_event_dto");
                                    parcelable2 = (fg0.k) (parcelableExtra2 instanceof fg0.k ? parcelableExtra2 : null);
                                }
                                kVar2 = (fg0.k) parcelable2;
                            }
                            if (kVar2 != null) {
                                eVar.w6().M5(kVar2);
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            androidx.fragment.app.m activity = eVar.getActivity();
                            EventDetailsActivity eventDetailsActivity = activity instanceof EventDetailsActivity ? (EventDetailsActivity) activity : null;
                            if (eventDetailsActivity != null) {
                                eventDetailsActivity.ma();
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f45940l = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new g.h(), new f.b(this) { // from class: ty1.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167256b;

            {
                this.f167256b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Parcelable parcelable;
                Parcelable parcelable2;
                int i16 = i15;
                fg0.k kVar = null;
                fg0.k kVar2 = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = this.f167256b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("GCM_extra_sharable_event_dto", fg0.k.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("GCM_extra_sharable_event_dto");
                                    parcelable = (fg0.k) (parcelableExtra instanceof fg0.k ? parcelableExtra : null);
                                }
                                kVar = (fg0.k) parcelable;
                            }
                            if (kVar != null) {
                                eVar.w6().E5(kVar);
                            }
                            eVar.w6().f204399p = intent != null ? intent.getBooleanExtra("extra_event_dashboard_refresh_needed", false) : false;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent2 = aVar.f67586b;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) intent2.getParcelableExtra("GCM_extra_sharable_event_dto", fg0.k.class);
                                } else {
                                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("GCM_extra_sharable_event_dto");
                                    parcelable2 = (fg0.k) (parcelableExtra2 instanceof fg0.k ? parcelableExtra2 : null);
                                }
                                kVar2 = (fg0.k) parcelable2;
                            }
                            if (kVar2 != null) {
                                eVar.w6().M5(kVar2);
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            androidx.fragment.app.m activity = eVar.getActivity();
                            EventDetailsActivity eventDetailsActivity = activity instanceof EventDetailsActivity ? (EventDetailsActivity) activity : null;
                            if (eventDetailsActivity != null) {
                                eventDetailsActivity.ma();
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f45941m = cVarRegisterForActivityResult2;
        final int i16 = 2;
        f.c<Intent> cVarRegisterForActivityResult3 = registerForActivityResult(new g.h(), new f.b(this) { // from class: ty1.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167256b;

            {
                this.f167256b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Parcelable parcelable;
                Parcelable parcelable2;
                int i17 = i16;
                fg0.k kVar = null;
                fg0.k kVar2 = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = this.f167256b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("GCM_extra_sharable_event_dto", fg0.k.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("GCM_extra_sharable_event_dto");
                                    parcelable = (fg0.k) (parcelableExtra instanceof fg0.k ? parcelableExtra : null);
                                }
                                kVar = (fg0.k) parcelable;
                            }
                            if (kVar != null) {
                                eVar.w6().E5(kVar);
                            }
                            eVar.w6().f204399p = intent != null ? intent.getBooleanExtra("extra_event_dashboard_refresh_needed", false) : false;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent2 = aVar.f67586b;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) intent2.getParcelableExtra("GCM_extra_sharable_event_dto", fg0.k.class);
                                } else {
                                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("GCM_extra_sharable_event_dto");
                                    parcelable2 = (fg0.k) (parcelableExtra2 instanceof fg0.k ? parcelableExtra2 : null);
                                }
                                kVar2 = (fg0.k) parcelable2;
                            }
                            if (kVar2 != null) {
                                eVar.w6().M5(kVar2);
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            androidx.fragment.app.m activity = eVar.getActivity();
                            EventDetailsActivity eventDetailsActivity = activity instanceof EventDetailsActivity ? (EventDetailsActivity) activity : null;
                            if (eventDetailsActivity != null) {
                                eventDetailsActivity.ma();
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult3.getClass();
        this.f45942n = cVarRegisterForActivityResult3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a u6(e eVar, sy.i iVar, v13.c cVar) {
        ty1.y yVar;
        eVar.getClass();
        if (cVar instanceof ty1.y) {
            yVar = (ty1.y) cVar;
            int i14 = yVar.f167269c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f167269c = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new ty1.y(eVar, cVar);
            }
        } else {
            yVar = new ty1.y(eVar, cVar);
        }
        Object obj = yVar.f167267a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f167269c;
        if (i15 == 0) {
            o13.r.b(obj);
            p2 p2VarY4 = eVar.w6().y4();
            ty1.z zVar = new ty1.z(eVar, iVar);
            yVar.f167269c = 1;
            if (p2VarY4.collect(zVar, yVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        fg0.k kVar;
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("EXTRA_EVENT_DTO", fg0.k.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("EXTRA_EVENT_DTO");
                if (!(parcelable2 instanceof fg0.k)) {
                    parcelable2 = null;
                }
                parcelable = (fg0.k) parcelable2;
            }
            kVar = (fg0.k) parcelable;
        } else {
            kVar = null;
        }
        kVar.getClass();
        this.f45937i = kVar;
        View viewFindViewById = view2.findViewById(R.id.leg_goals_view);
        viewFindViewById.getClass();
        this.f45936h = (ComposeView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.edit_event_goal);
        viewFindViewById2.getClass();
        this.f45933e = (GCMComplexTwoLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.edit_race_time_prediction);
        viewFindViewById3.getClass();
        this.f45934f = (GCMComplexTwoLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.training_title);
        viewFindViewById4.getClass();
        this.f45932d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.training_priority);
        viewFindViewById5.getClass();
        this.f45935g = (GCMComplexTwoLineButton) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.training_plan_details);
        viewFindViewById6.getClass();
        this.f45930b = (GCMComplexTwoLineButton) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.list_spacer_view);
        viewFindViewById7.getClass();
        this.f45931c = viewFindViewById7;
        viewFindViewById7.setVisibility(8);
        boolean z14 = w6().f204395l;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f45935g;
        if (z14) {
            if (gCMComplexTwoLineButton == null) {
                p005kotlin.jvm.internal.s.m("mTrainingPriority");
                throw null;
            }
            gCMComplexTwoLineButton.setClickable(false);
        } else {
            if (gCMComplexTwoLineButton == null) {
                p005kotlin.jvm.internal.s.m("mTrainingPriority");
                throw null;
            }
            final int i14 = 0;
            gCMComplexTwoLineButton.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167262b;

                {
                    this.f167262b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ww1.j trainingPlanType;
                    xw1.d dVar;
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = this.f167262b;
                    switch (i15) {
                        case 0:
                            f.c<Intent> cVar = eVar.f45940l;
                            TrainingPrioritySelectionActivity.a aVar = TrainingPrioritySelectionActivity.f46174b;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            fg0.k kVar2 = eVar.f45937i;
                            if (kVar2 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            aVar.getClass();
                            cVar.a(TrainingPrioritySelectionActivity.a.a(contextRequireContext, kVar2, false, true), null);
                            return;
                        case 1:
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                            ht.a.f85464a.getClass();
                            ht.a.a(null, "AddGoalsClicked");
                            EventGoalActivity.a aVar3 = EventGoalActivity.f45976e;
                            androidx.fragment.app.m mVarRequireActivity = eVar.requireActivity();
                            mVarRequireActivity.getClass();
                            EventDetailsActivity eventDetailsActivity = (EventDetailsActivity) mVarRequireActivity;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            fg0.k kVar3 = eVar.f45937i;
                            if (kVar3 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            aVar3.getClass();
                            Intent intent = new Intent(contextRequireContext2, (Class<?>) EventGoalActivity.class);
                            intent.putExtra("GCM_extra_sharable_event_dto", kVar3);
                            eventDetailsActivity.startActivityForResult(intent, 123);
                            return;
                        case 2:
                            jy1.b bVar = eVar.f45938j;
                            androidx.fragment.app.m mVarRequireActivity2 = eVar.requireActivity();
                            mVarRequireActivity2.getClass();
                            fg0.k kVar4 = eVar.f45937i;
                            if (kVar4 != null) {
                                bVar.u(mVarRequireActivity2, kVar4);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                        default:
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                            mz1.e0 e0VarW6 = eVar.w6();
                            jy1.b bVar2 = eVar.f45938j;
                            if (e0VarW6.f204398o) {
                                fg0.k kVar5 = eVar.f45937i;
                                if (kVar5 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                fg0.j eventCustomization = kVar5.getEventCustomization();
                                if (eventCustomization != null && eventCustomization.t()) {
                                    o13.p pVar = (o13.p) ((androidx.lifecycle.y0) eVar.w6().f121705z1.getValue()).d();
                                    Long lValueOf = (pVar == null || (dVar = (xw1.d) pVar.f128595b) == null) ? null : Long.valueOf(dVar.getAthletePlanId());
                                    if (eVar.getActivity() != null && lValueOf != null) {
                                        androidx.fragment.app.m mVarRequireActivity3 = eVar.requireActivity();
                                        mVarRequireActivity3.getClass();
                                        bVar2.i(mVarRequireActivity3, lValueOf.longValue());
                                        return;
                                    }
                                    fg0.k kVar6 = eVar.f45937i;
                                    if (kVar6 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    Long l14 = kVar6.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                    fg0.k kVar7 = eVar.f45937i;
                                    if (kVar7 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String shareableEventUuid = kVar7.getShareableEventUuid();
                                    fg0.k kVar8 = eVar.f45937i;
                                    if (kVar8 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String eventName = kVar8.getEventName();
                                    StringBuilder sbJ = b71.i.j("Error occurred in getting atp plan ID for ", "/", shareableEventUuid, l14, StringUtils.SPACE);
                                    sbJ.append(eventName);
                                    String string = sbJ.toString();
                                    com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                    aVar5.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventDetailsTrainingFragment", string);
                                    g22.e.a(eVar, null);
                                    return;
                                }
                                fg0.k kVar9 = eVar.f45937i;
                                if (kVar9 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                fg0.j eventCustomization2 = kVar9.getEventCustomization();
                                if (eventCustomization2 != null && eventCustomization2.z()) {
                                    ww1.i iVarD = eVar.w6().t5().d();
                                    Long lValueOf2 = iVarD != null ? Long.valueOf(iVarD.getTrainingPlanId()) : null;
                                    if (eVar.getActivity() != null && lValueOf2 != null) {
                                        androidx.fragment.app.m mVarRequireActivity4 = eVar.requireActivity();
                                        mVarRequireActivity4.getClass();
                                        bVar2.m(mVarRequireActivity4, lValueOf2.longValue());
                                        return;
                                    }
                                    fg0.k kVar10 = eVar.f45937i;
                                    if (kVar10 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    Long l15 = kVar10.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                    fg0.k kVar11 = eVar.f45937i;
                                    if (kVar11 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String shareableEventUuid2 = kVar11.getShareableEventUuid();
                                    fg0.k kVar12 = eVar.f45937i;
                                    if (kVar12 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String eventName2 = kVar12.getEventName();
                                    StringBuilder sbJ2 = b71.i.j("Error occurred in getting itp plan ID for ", "/", shareableEventUuid2, l15, StringUtils.SPACE);
                                    sbJ2.append(eventName2);
                                    String string2 = sbJ2.toString();
                                    com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                    aVar6.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "EventDetailsTrainingFragment", string2);
                                    g22.e.a(eVar, null);
                                    return;
                                }
                                fg0.k kVar13 = eVar.f45937i;
                                if (kVar13 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                fg0.j eventCustomization3 = kVar13.getEventCustomization();
                                if (eventCustomization3 == null || !eventCustomization3.u()) {
                                    ww1.g gVar = eVar.f45939k;
                                    if (gVar == null || !gVar.f187763a) {
                                        eVar.z6();
                                        return;
                                    }
                                    Context contextRequireContext3 = eVar.requireContext();
                                    contextRequireContext3.getClass();
                                    String string3 = eVar.getString(R.string.quit_current_plan_question);
                                    string3.getClass();
                                    lz1.e.f(contextRequireContext3, string3, eVar.getString(R.string.quit_active_plan_message), R.string.atp_quit_plan, new u(eVar, 2));
                                    return;
                                }
                                if (eVar.w6().f204395l) {
                                    return;
                                }
                                ww1.i iVarD2 = eVar.w6().t5().d();
                                Long lValueOf3 = iVarD2 != null ? Long.valueOf(iVarD2.getTrainingPlanId()) : null;
                                ww1.i iVarD3 = eVar.w6().t5().d();
                                vt1.o oVarB = (iVarD3 == null || (trainingPlanType = iVarD3.getTrainingPlanType()) == null) ? null : trainingPlanType.b();
                                if (eVar.getActivity() != null && lValueOf3 != null && oVarB != null) {
                                    androidx.fragment.app.m mVarRequireActivity5 = eVar.requireActivity();
                                    mVarRequireActivity5.getClass();
                                    bVar2.s(mVarRequireActivity5, lValueOf3.longValue(), oVarB);
                                    return;
                                }
                                fg0.k kVar14 = eVar.f45937i;
                                if (kVar14 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                Long l16 = kVar14.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                fg0.k kVar15 = eVar.f45937i;
                                if (kVar15 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                String shareableEventUuid3 = kVar15.getShareableEventUuid();
                                fg0.k kVar16 = eVar.f45937i;
                                if (kVar16 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                String eventName3 = kVar16.getEventName();
                                StringBuilder sbJ3 = b71.i.j("Error occurred in getting fbt plan ID for ", "/", shareableEventUuid3, l16, StringUtils.SPACE);
                                sbJ3.append(eventName3);
                                String string4 = sbJ3.toString();
                                com.garmin.android.apps.connectmobile.i2.a aVar7 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar7.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "EventDetailsTrainingFragment", string4);
                                g22.e.a(eVar, null);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        fg0.k kVar2 = this.f45937i;
        if (kVar2 == null) {
            p005kotlin.jvm.internal.s.m("eventDTO");
            throw null;
        }
        fg0.j eventCustomization = kVar2.getEventCustomization();
        if ((eventCustomization == null || !eventCustomization.t()) && !w6().x5()) {
            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f45933e;
            if (gCMComplexTwoLineButton2 == null) {
                p005kotlin.jvm.internal.s.m("mEditEventGoal");
                throw null;
            }
            final int i15 = 1;
            gCMComplexTwoLineButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167262b;

                {
                    this.f167262b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ww1.j trainingPlanType;
                    xw1.d dVar;
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = this.f167262b;
                    switch (i16) {
                        case 0:
                            f.c<Intent> cVar = eVar.f45940l;
                            TrainingPrioritySelectionActivity.a aVar = TrainingPrioritySelectionActivity.f46174b;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            fg0.k kVar3 = eVar.f45937i;
                            if (kVar3 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            aVar.getClass();
                            cVar.a(TrainingPrioritySelectionActivity.a.a(contextRequireContext, kVar3, false, true), null);
                            return;
                        case 1:
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                            ht.a.f85464a.getClass();
                            ht.a.a(null, "AddGoalsClicked");
                            EventGoalActivity.a aVar3 = EventGoalActivity.f45976e;
                            androidx.fragment.app.m mVarRequireActivity = eVar.requireActivity();
                            mVarRequireActivity.getClass();
                            EventDetailsActivity eventDetailsActivity = (EventDetailsActivity) mVarRequireActivity;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            fg0.k kVar4 = eVar.f45937i;
                            if (kVar4 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            aVar3.getClass();
                            Intent intent = new Intent(contextRequireContext2, (Class<?>) EventGoalActivity.class);
                            intent.putExtra("GCM_extra_sharable_event_dto", kVar4);
                            eventDetailsActivity.startActivityForResult(intent, 123);
                            return;
                        case 2:
                            jy1.b bVar = eVar.f45938j;
                            androidx.fragment.app.m mVarRequireActivity2 = eVar.requireActivity();
                            mVarRequireActivity2.getClass();
                            fg0.k kVar5 = eVar.f45937i;
                            if (kVar5 != null) {
                                bVar.u(mVarRequireActivity2, kVar5);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                        default:
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                            mz1.e0 e0VarW6 = eVar.w6();
                            jy1.b bVar2 = eVar.f45938j;
                            if (e0VarW6.f204398o) {
                                fg0.k kVar6 = eVar.f45937i;
                                if (kVar6 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                fg0.j eventCustomization2 = kVar6.getEventCustomization();
                                if (eventCustomization2 != null && eventCustomization2.t()) {
                                    o13.p pVar = (o13.p) ((androidx.lifecycle.y0) eVar.w6().f121705z1.getValue()).d();
                                    Long lValueOf = (pVar == null || (dVar = (xw1.d) pVar.f128595b) == null) ? null : Long.valueOf(dVar.getAthletePlanId());
                                    if (eVar.getActivity() != null && lValueOf != null) {
                                        androidx.fragment.app.m mVarRequireActivity3 = eVar.requireActivity();
                                        mVarRequireActivity3.getClass();
                                        bVar2.i(mVarRequireActivity3, lValueOf.longValue());
                                        return;
                                    }
                                    fg0.k kVar7 = eVar.f45937i;
                                    if (kVar7 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    Long l14 = kVar7.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                    fg0.k kVar8 = eVar.f45937i;
                                    if (kVar8 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String shareableEventUuid = kVar8.getShareableEventUuid();
                                    fg0.k kVar9 = eVar.f45937i;
                                    if (kVar9 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String eventName = kVar9.getEventName();
                                    StringBuilder sbJ = b71.i.j("Error occurred in getting atp plan ID for ", "/", shareableEventUuid, l14, StringUtils.SPACE);
                                    sbJ.append(eventName);
                                    String string = sbJ.toString();
                                    com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                    aVar5.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventDetailsTrainingFragment", string);
                                    g22.e.a(eVar, null);
                                    return;
                                }
                                fg0.k kVar10 = eVar.f45937i;
                                if (kVar10 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                fg0.j eventCustomization3 = kVar10.getEventCustomization();
                                if (eventCustomization3 != null && eventCustomization3.z()) {
                                    ww1.i iVarD = eVar.w6().t5().d();
                                    Long lValueOf2 = iVarD != null ? Long.valueOf(iVarD.getTrainingPlanId()) : null;
                                    if (eVar.getActivity() != null && lValueOf2 != null) {
                                        androidx.fragment.app.m mVarRequireActivity4 = eVar.requireActivity();
                                        mVarRequireActivity4.getClass();
                                        bVar2.m(mVarRequireActivity4, lValueOf2.longValue());
                                        return;
                                    }
                                    fg0.k kVar11 = eVar.f45937i;
                                    if (kVar11 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    Long l15 = kVar11.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                    fg0.k kVar12 = eVar.f45937i;
                                    if (kVar12 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String shareableEventUuid2 = kVar12.getShareableEventUuid();
                                    fg0.k kVar13 = eVar.f45937i;
                                    if (kVar13 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String eventName2 = kVar13.getEventName();
                                    StringBuilder sbJ2 = b71.i.j("Error occurred in getting itp plan ID for ", "/", shareableEventUuid2, l15, StringUtils.SPACE);
                                    sbJ2.append(eventName2);
                                    String string2 = sbJ2.toString();
                                    com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                    aVar6.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "EventDetailsTrainingFragment", string2);
                                    g22.e.a(eVar, null);
                                    return;
                                }
                                fg0.k kVar14 = eVar.f45937i;
                                if (kVar14 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                fg0.j eventCustomization4 = kVar14.getEventCustomization();
                                if (eventCustomization4 == null || !eventCustomization4.u()) {
                                    ww1.g gVar = eVar.f45939k;
                                    if (gVar == null || !gVar.f187763a) {
                                        eVar.z6();
                                        return;
                                    }
                                    Context contextRequireContext3 = eVar.requireContext();
                                    contextRequireContext3.getClass();
                                    String string3 = eVar.getString(R.string.quit_current_plan_question);
                                    string3.getClass();
                                    lz1.e.f(contextRequireContext3, string3, eVar.getString(R.string.quit_active_plan_message), R.string.atp_quit_plan, new u(eVar, 2));
                                    return;
                                }
                                if (eVar.w6().f204395l) {
                                    return;
                                }
                                ww1.i iVarD2 = eVar.w6().t5().d();
                                Long lValueOf3 = iVarD2 != null ? Long.valueOf(iVarD2.getTrainingPlanId()) : null;
                                ww1.i iVarD3 = eVar.w6().t5().d();
                                vt1.o oVarB = (iVarD3 == null || (trainingPlanType = iVarD3.getTrainingPlanType()) == null) ? null : trainingPlanType.b();
                                if (eVar.getActivity() != null && lValueOf3 != null && oVarB != null) {
                                    androidx.fragment.app.m mVarRequireActivity5 = eVar.requireActivity();
                                    mVarRequireActivity5.getClass();
                                    bVar2.s(mVarRequireActivity5, lValueOf3.longValue(), oVarB);
                                    return;
                                }
                                fg0.k kVar15 = eVar.f45937i;
                                if (kVar15 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                Long l16 = kVar15.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                fg0.k kVar16 = eVar.f45937i;
                                if (kVar16 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                String shareableEventUuid3 = kVar16.getShareableEventUuid();
                                fg0.k kVar17 = eVar.f45937i;
                                if (kVar17 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                String eventName3 = kVar17.getEventName();
                                StringBuilder sbJ3 = b71.i.j("Error occurred in getting fbt plan ID for ", "/", shareableEventUuid3, l16, StringUtils.SPACE);
                                sbJ3.append(eventName3);
                                String string4 = sbJ3.toString();
                                com.garmin.android.apps.connectmobile.i2.a aVar7 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar7.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "EventDetailsTrainingFragment", string4);
                                g22.e.a(eVar, null);
                                return;
                            }
                            return;
                    }
                }
            });
            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f45934f;
            if (gCMComplexTwoLineButton3 == null) {
                p005kotlin.jvm.internal.s.m("mRaceTimePrediction");
                throw null;
            }
            final int i16 = 2;
            gCMComplexTwoLineButton3.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167262b;

                {
                    this.f167262b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ww1.j trainingPlanType;
                    xw1.d dVar;
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = this.f167262b;
                    switch (i17) {
                        case 0:
                            f.c<Intent> cVar = eVar.f45940l;
                            TrainingPrioritySelectionActivity.a aVar = TrainingPrioritySelectionActivity.f46174b;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            fg0.k kVar3 = eVar.f45937i;
                            if (kVar3 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            aVar.getClass();
                            cVar.a(TrainingPrioritySelectionActivity.a.a(contextRequireContext, kVar3, false, true), null);
                            return;
                        case 1:
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                            ht.a.f85464a.getClass();
                            ht.a.a(null, "AddGoalsClicked");
                            EventGoalActivity.a aVar3 = EventGoalActivity.f45976e;
                            androidx.fragment.app.m mVarRequireActivity = eVar.requireActivity();
                            mVarRequireActivity.getClass();
                            EventDetailsActivity eventDetailsActivity = (EventDetailsActivity) mVarRequireActivity;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            fg0.k kVar4 = eVar.f45937i;
                            if (kVar4 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            aVar3.getClass();
                            Intent intent = new Intent(contextRequireContext2, (Class<?>) EventGoalActivity.class);
                            intent.putExtra("GCM_extra_sharable_event_dto", kVar4);
                            eventDetailsActivity.startActivityForResult(intent, 123);
                            return;
                        case 2:
                            jy1.b bVar = eVar.f45938j;
                            androidx.fragment.app.m mVarRequireActivity2 = eVar.requireActivity();
                            mVarRequireActivity2.getClass();
                            fg0.k kVar5 = eVar.f45937i;
                            if (kVar5 != null) {
                                bVar.u(mVarRequireActivity2, kVar5);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                        default:
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                            mz1.e0 e0VarW6 = eVar.w6();
                            jy1.b bVar2 = eVar.f45938j;
                            if (e0VarW6.f204398o) {
                                fg0.k kVar6 = eVar.f45937i;
                                if (kVar6 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                fg0.j eventCustomization2 = kVar6.getEventCustomization();
                                if (eventCustomization2 != null && eventCustomization2.t()) {
                                    o13.p pVar = (o13.p) ((androidx.lifecycle.y0) eVar.w6().f121705z1.getValue()).d();
                                    Long lValueOf = (pVar == null || (dVar = (xw1.d) pVar.f128595b) == null) ? null : Long.valueOf(dVar.getAthletePlanId());
                                    if (eVar.getActivity() != null && lValueOf != null) {
                                        androidx.fragment.app.m mVarRequireActivity3 = eVar.requireActivity();
                                        mVarRequireActivity3.getClass();
                                        bVar2.i(mVarRequireActivity3, lValueOf.longValue());
                                        return;
                                    }
                                    fg0.k kVar7 = eVar.f45937i;
                                    if (kVar7 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    Long l14 = kVar7.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                    fg0.k kVar8 = eVar.f45937i;
                                    if (kVar8 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String shareableEventUuid = kVar8.getShareableEventUuid();
                                    fg0.k kVar9 = eVar.f45937i;
                                    if (kVar9 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String eventName = kVar9.getEventName();
                                    StringBuilder sbJ = b71.i.j("Error occurred in getting atp plan ID for ", "/", shareableEventUuid, l14, StringUtils.SPACE);
                                    sbJ.append(eventName);
                                    String string = sbJ.toString();
                                    com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                    aVar5.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventDetailsTrainingFragment", string);
                                    g22.e.a(eVar, null);
                                    return;
                                }
                                fg0.k kVar10 = eVar.f45937i;
                                if (kVar10 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                fg0.j eventCustomization3 = kVar10.getEventCustomization();
                                if (eventCustomization3 != null && eventCustomization3.z()) {
                                    ww1.i iVarD = eVar.w6().t5().d();
                                    Long lValueOf2 = iVarD != null ? Long.valueOf(iVarD.getTrainingPlanId()) : null;
                                    if (eVar.getActivity() != null && lValueOf2 != null) {
                                        androidx.fragment.app.m mVarRequireActivity4 = eVar.requireActivity();
                                        mVarRequireActivity4.getClass();
                                        bVar2.m(mVarRequireActivity4, lValueOf2.longValue());
                                        return;
                                    }
                                    fg0.k kVar11 = eVar.f45937i;
                                    if (kVar11 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    Long l15 = kVar11.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                    fg0.k kVar12 = eVar.f45937i;
                                    if (kVar12 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String shareableEventUuid2 = kVar12.getShareableEventUuid();
                                    fg0.k kVar13 = eVar.f45937i;
                                    if (kVar13 == null) {
                                        p005kotlin.jvm.internal.s.m("eventDTO");
                                        throw null;
                                    }
                                    String eventName2 = kVar13.getEventName();
                                    StringBuilder sbJ2 = b71.i.j("Error occurred in getting itp plan ID for ", "/", shareableEventUuid2, l15, StringUtils.SPACE);
                                    sbJ2.append(eventName2);
                                    String string2 = sbJ2.toString();
                                    com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                    aVar6.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "EventDetailsTrainingFragment", string2);
                                    g22.e.a(eVar, null);
                                    return;
                                }
                                fg0.k kVar14 = eVar.f45937i;
                                if (kVar14 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                fg0.j eventCustomization4 = kVar14.getEventCustomization();
                                if (eventCustomization4 == null || !eventCustomization4.u()) {
                                    ww1.g gVar = eVar.f45939k;
                                    if (gVar == null || !gVar.f187763a) {
                                        eVar.z6();
                                        return;
                                    }
                                    Context contextRequireContext3 = eVar.requireContext();
                                    contextRequireContext3.getClass();
                                    String string3 = eVar.getString(R.string.quit_current_plan_question);
                                    string3.getClass();
                                    lz1.e.f(contextRequireContext3, string3, eVar.getString(R.string.quit_active_plan_message), R.string.atp_quit_plan, new u(eVar, 2));
                                    return;
                                }
                                if (eVar.w6().f204395l) {
                                    return;
                                }
                                ww1.i iVarD2 = eVar.w6().t5().d();
                                Long lValueOf3 = iVarD2 != null ? Long.valueOf(iVarD2.getTrainingPlanId()) : null;
                                ww1.i iVarD3 = eVar.w6().t5().d();
                                vt1.o oVarB = (iVarD3 == null || (trainingPlanType = iVarD3.getTrainingPlanType()) == null) ? null : trainingPlanType.b();
                                if (eVar.getActivity() != null && lValueOf3 != null && oVarB != null) {
                                    androidx.fragment.app.m mVarRequireActivity5 = eVar.requireActivity();
                                    mVarRequireActivity5.getClass();
                                    bVar2.s(mVarRequireActivity5, lValueOf3.longValue(), oVarB);
                                    return;
                                }
                                fg0.k kVar15 = eVar.f45937i;
                                if (kVar15 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                Long l16 = kVar15.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                fg0.k kVar16 = eVar.f45937i;
                                if (kVar16 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                String shareableEventUuid3 = kVar16.getShareableEventUuid();
                                fg0.k kVar17 = eVar.f45937i;
                                if (kVar17 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                String eventName3 = kVar17.getEventName();
                                StringBuilder sbJ3 = b71.i.j("Error occurred in getting fbt plan ID for ", "/", shareableEventUuid3, l16, StringUtils.SPACE);
                                sbJ3.append(eventName3);
                                String string4 = sbJ3.toString();
                                com.garmin.android.apps.connectmobile.i2.a aVar7 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar7.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "EventDetailsTrainingFragment", string4);
                                g22.e.a(eVar, null);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f45933e;
            if (gCMComplexTwoLineButton4 == null) {
                p005kotlin.jvm.internal.s.m("mEditEventGoal");
                throw null;
            }
            gCMComplexTwoLineButton4.setClickable(false);
            GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f45934f;
            if (gCMComplexTwoLineButton5 == null) {
                p005kotlin.jvm.internal.s.m("mRaceTimePrediction");
                throw null;
            }
            gCMComplexTwoLineButton5.setClickable(false);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f45930b;
        if (gCMComplexTwoLineButton6 == null) {
            p005kotlin.jvm.internal.s.m("mGarminCoachPlans");
            throw null;
        }
        final int i17 = 3;
        gCMComplexTwoLineButton6.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167262b;

            {
                this.f167262b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ww1.j trainingPlanType;
                xw1.d dVar;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = this.f167262b;
                switch (i18) {
                    case 0:
                        f.c<Intent> cVar = eVar.f45940l;
                        TrainingPrioritySelectionActivity.a aVar = TrainingPrioritySelectionActivity.f46174b;
                        Context contextRequireContext = eVar.requireContext();
                        contextRequireContext.getClass();
                        fg0.k kVar3 = eVar.f45937i;
                        if (kVar3 == null) {
                            p005kotlin.jvm.internal.s.m("eventDTO");
                            throw null;
                        }
                        aVar.getClass();
                        cVar.a(TrainingPrioritySelectionActivity.a.a(contextRequireContext, kVar3, false, true), null);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "AddGoalsClicked");
                        EventGoalActivity.a aVar3 = EventGoalActivity.f45976e;
                        androidx.fragment.app.m mVarRequireActivity = eVar.requireActivity();
                        mVarRequireActivity.getClass();
                        EventDetailsActivity eventDetailsActivity = (EventDetailsActivity) mVarRequireActivity;
                        Context contextRequireContext2 = eVar.requireContext();
                        contextRequireContext2.getClass();
                        fg0.k kVar4 = eVar.f45937i;
                        if (kVar4 == null) {
                            p005kotlin.jvm.internal.s.m("eventDTO");
                            throw null;
                        }
                        aVar3.getClass();
                        Intent intent = new Intent(contextRequireContext2, (Class<?>) EventGoalActivity.class);
                        intent.putExtra("GCM_extra_sharable_event_dto", kVar4);
                        eventDetailsActivity.startActivityForResult(intent, 123);
                        return;
                    case 2:
                        jy1.b bVar = eVar.f45938j;
                        androidx.fragment.app.m mVarRequireActivity2 = eVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        fg0.k kVar5 = eVar.f45937i;
                        if (kVar5 != null) {
                            bVar.u(mVarRequireActivity2, kVar5);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("eventDTO");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        mz1.e0 e0VarW6 = eVar.w6();
                        jy1.b bVar2 = eVar.f45938j;
                        if (e0VarW6.f204398o) {
                            fg0.k kVar6 = eVar.f45937i;
                            if (kVar6 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            fg0.j eventCustomization2 = kVar6.getEventCustomization();
                            if (eventCustomization2 != null && eventCustomization2.t()) {
                                o13.p pVar = (o13.p) ((androidx.lifecycle.y0) eVar.w6().f121705z1.getValue()).d();
                                Long lValueOf = (pVar == null || (dVar = (xw1.d) pVar.f128595b) == null) ? null : Long.valueOf(dVar.getAthletePlanId());
                                if (eVar.getActivity() != null && lValueOf != null) {
                                    androidx.fragment.app.m mVarRequireActivity3 = eVar.requireActivity();
                                    mVarRequireActivity3.getClass();
                                    bVar2.i(mVarRequireActivity3, lValueOf.longValue());
                                    return;
                                }
                                fg0.k kVar7 = eVar.f45937i;
                                if (kVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                Long l14 = kVar7.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                fg0.k kVar8 = eVar.f45937i;
                                if (kVar8 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                String shareableEventUuid = kVar8.getShareableEventUuid();
                                fg0.k kVar9 = eVar.f45937i;
                                if (kVar9 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                String eventName = kVar9.getEventName();
                                StringBuilder sbJ = b71.i.j("Error occurred in getting atp plan ID for ", "/", shareableEventUuid, l14, StringUtils.SPACE);
                                sbJ.append(eventName);
                                String string = sbJ.toString();
                                com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar5.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventDetailsTrainingFragment", string);
                                g22.e.a(eVar, null);
                                return;
                            }
                            fg0.k kVar10 = eVar.f45937i;
                            if (kVar10 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            fg0.j eventCustomization3 = kVar10.getEventCustomization();
                            if (eventCustomization3 != null && eventCustomization3.z()) {
                                ww1.i iVarD = eVar.w6().t5().d();
                                Long lValueOf2 = iVarD != null ? Long.valueOf(iVarD.getTrainingPlanId()) : null;
                                if (eVar.getActivity() != null && lValueOf2 != null) {
                                    androidx.fragment.app.m mVarRequireActivity4 = eVar.requireActivity();
                                    mVarRequireActivity4.getClass();
                                    bVar2.m(mVarRequireActivity4, lValueOf2.longValue());
                                    return;
                                }
                                fg0.k kVar11 = eVar.f45937i;
                                if (kVar11 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                Long l15 = kVar11.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                fg0.k kVar12 = eVar.f45937i;
                                if (kVar12 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                String shareableEventUuid2 = kVar12.getShareableEventUuid();
                                fg0.k kVar13 = eVar.f45937i;
                                if (kVar13 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDTO");
                                    throw null;
                                }
                                String eventName2 = kVar13.getEventName();
                                StringBuilder sbJ2 = b71.i.j("Error occurred in getting itp plan ID for ", "/", shareableEventUuid2, l15, StringUtils.SPACE);
                                sbJ2.append(eventName2);
                                String string2 = sbJ2.toString();
                                com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar6.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "EventDetailsTrainingFragment", string2);
                                g22.e.a(eVar, null);
                                return;
                            }
                            fg0.k kVar14 = eVar.f45937i;
                            if (kVar14 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            fg0.j eventCustomization4 = kVar14.getEventCustomization();
                            if (eventCustomization4 == null || !eventCustomization4.u()) {
                                ww1.g gVar = eVar.f45939k;
                                if (gVar == null || !gVar.f187763a) {
                                    eVar.z6();
                                    return;
                                }
                                Context contextRequireContext3 = eVar.requireContext();
                                contextRequireContext3.getClass();
                                String string3 = eVar.getString(R.string.quit_current_plan_question);
                                string3.getClass();
                                lz1.e.f(contextRequireContext3, string3, eVar.getString(R.string.quit_active_plan_message), R.string.atp_quit_plan, new u(eVar, 2));
                                return;
                            }
                            if (eVar.w6().f204395l) {
                                return;
                            }
                            ww1.i iVarD2 = eVar.w6().t5().d();
                            Long lValueOf3 = iVarD2 != null ? Long.valueOf(iVarD2.getTrainingPlanId()) : null;
                            ww1.i iVarD3 = eVar.w6().t5().d();
                            vt1.o oVarB = (iVarD3 == null || (trainingPlanType = iVarD3.getTrainingPlanType()) == null) ? null : trainingPlanType.b();
                            if (eVar.getActivity() != null && lValueOf3 != null && oVarB != null) {
                                androidx.fragment.app.m mVarRequireActivity5 = eVar.requireActivity();
                                mVarRequireActivity5.getClass();
                                bVar2.s(mVarRequireActivity5, lValueOf3.longValue(), oVarB);
                                return;
                            }
                            fg0.k kVar15 = eVar.f45937i;
                            if (kVar15 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            Long l16 = kVar15.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                            fg0.k kVar16 = eVar.f45937i;
                            if (kVar16 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            String shareableEventUuid3 = kVar16.getShareableEventUuid();
                            fg0.k kVar17 = eVar.f45937i;
                            if (kVar17 == null) {
                                p005kotlin.jvm.internal.s.m("eventDTO");
                                throw null;
                            }
                            String eventName3 = kVar17.getEventName();
                            StringBuilder sbJ3 = b71.i.j("Error occurred in getting fbt plan ID for ", "/", shareableEventUuid3, l16, StringUtils.SPACE);
                            sbJ3.append(eventName3);
                            String string4 = sbJ3.toString();
                            com.garmin.android.apps.connectmobile.i2.a aVar7 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar7.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "EventDetailsTrainingFragment", string4);
                            g22.e.a(eVar, null);
                            return;
                        }
                        return;
                }
            }
        });
        w6().k5().f(getViewLifecycleOwner(), new c(new ty1.u(this, 3)));
        ((androidx.lifecycle.s0) w6().C1.getValue()).f(getViewLifecycleOwner(), new c(new ty1.u(this, 0)));
        ((androidx.lifecycle.s0) w6().f121691l1.getValue()).f(getViewLifecycleOwner(), new c(new ty1.u(this, 1)));
        w6().q5();
        fg0.k kVar3 = this.f45937i;
        if (kVar3 == null) {
            p005kotlin.jvm.internal.s.m("eventDTO");
            throw null;
        }
        ComposeView composeView = this.f45936h;
        if (composeView != null) {
            composeView.setContent(new z3.e(-398899170, true, new ty1.v(this, kVar3, 0)));
        } else {
            p005kotlin.jvm.internal.s.m("legGoalsView");
            throw null;
        }
    }

    public final Drawable v6() {
        Drawable drawable = a7.b.getDrawable(requireContext(), R.drawable.check);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        if (drawableMutate != null) {
            drawableMutate.setTint(a7.b.getColor(requireContext(), R.color.gcm_icon_success));
        }
        return drawableMutate;
    }

    public final e0 w6() {
        return (e0) this.f45929a.getValue();
    }

    public final void y6() {
        int i14;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f45935g;
        if (gCMComplexTwoLineButton == null) {
            p005kotlin.jvm.internal.s.m("mTrainingPriority");
            throw null;
        }
        v22.e.q(gCMComplexTwoLineButton);
        fg0.k kVar = this.f45937i;
        if (kVar == null) {
            p005kotlin.jvm.internal.s.m("eventDTO");
            throw null;
        }
        fg0.j eventCustomization = kVar.getEventCustomization();
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f45935g;
        if (eventCustomization == null) {
            if (gCMComplexTwoLineButton2 != null) {
                v22.e.j(gCMComplexTwoLineButton2);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mTrainingPriority");
                throw null;
            }
        }
        if (gCMComplexTwoLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("mTrainingPriority");
            throw null;
        }
        dg0.a.C1269a c1269a = dg0.a.f59507d;
        fg0.k kVar2 = this.f45937i;
        if (kVar2 == null) {
            p005kotlin.jvm.internal.s.m("eventDTO");
            throw null;
        }
        fg0.j eventCustomization2 = kVar2.getEventCustomization();
        c1269a.getClass();
        if (eventCustomization2 != null ? p005kotlin.jvm.internal.s.g(eventCustomization2.getIsPrimaryEvent(), Boolean.TRUE) : false) {
            i14 = dg0.a.PRIMARY_EVENT.f59512a;
        } else {
            i14 = eventCustomization2 != null ? p005kotlin.jvm.internal.s.g(eventCustomization2.getIsTrainingEvent(), Boolean.TRUE) : false ? dg0.a.SUPPORTING_EVENT.f59512a : dg0.a.NO_PRIORITY.f59512a;
        }
        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(getString(i14));
    }

    public final void z6() {
        fg0.k kVar = this.f45937i;
        if (kVar == null) {
            p005kotlin.jvm.internal.s.m("eventDTO");
            throw null;
        }
        rt1.m mVar = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f45942n.a(mVar.u(contextRequireContext, kVar, this.f45939k, false, false), null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_EVENT_DTO", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
