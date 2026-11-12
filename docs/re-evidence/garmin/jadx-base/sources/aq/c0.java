package aq;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.NewSelectExerciseActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Laq/c0;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends Fragment implements KoinComponent {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f11852i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f11854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.w1 f11855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f11856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f11857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f11858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f11859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.c<Intent> f11860h;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f11861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11861a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f11861a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f11862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f11863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f11862a = aVar;
            this.f11863b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f11862a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f11863b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f11864a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11864a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f11864a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<f12.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f11865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f11866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f11867c;

        public e(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f11865a = koinComponent;
            this.f11866b = qualifier;
            this.f11867c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [f12.l, java.lang.Object] */
        @Override // e23.a
        public final f12.l invoke() {
            KoinComponent koinComponent = this.f11865a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), this.f11866b, this.f11867c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f11868a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f11868a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f11868a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f11869a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar) {
            super(0);
            this.f11869a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f11869a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f11870a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(o13.l lVar) {
            super(0);
            this.f11870a = lVar;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return ((ViewModelStoreOwner) this.f11870a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f11871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f11872b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, o13.l lVar) {
            super(0);
            this.f11871a = aVar;
            this.f11872b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f11871a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f11872b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f11873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f11874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment, o13.l lVar) {
            super(0);
            this.f11873a = fragment;
            this.f11874b = lVar;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            androidx.lifecycle.x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f11874b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f11873a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    static {
        new a(null);
    }

    public c0() {
        super(R.layout.fragment_edit_exercises_multi_edit);
        this.f11853a = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new e(this, null, null));
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        this.f11854b = new androidx.lifecycle.w1(t0Var.b(EditExercisesMultiSelectViewModel.class), new b(this), new d(this), new c(null, this));
        o13.l lVarA = o13.m.a(o13.n.NONE, new g(new f(this)));
        this.f11855c = new androidx.lifecycle.w1(t0Var.b(i0.class), new h(lVarA), new j(this, lVarA), new i(null, lVarA));
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new a61.i(this, 2));
        cVarRegisterForActivityResult.getClass();
        this.f11860h = cVarRegisterForActivityResult;
    }

    public static final void w6(Object obj, TextView textView) {
        if (obj instanceof Integer) {
            textView.setText(((Number) obj).intValue());
        } else if (obj instanceof String) {
            textView.setText((CharSequence) obj);
        } else {
            textView.setText("");
        }
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        List<x> listD = u6().f29798j.d();
        if (listD == null) {
            listD = p13.j0.f134944a;
        }
        int i14 = listD.size() > 1 ? R.string.strength_training_edit_exercise_sets : R.string.strength_training_edit_single_exercise_set;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        ((com.garmin.android.apps.connectmobile.z1) mVarRequireActivity).updateActionBar(getString(i14), 2);
        androidx.fragment.app.m mVarRequireActivity2 = requireActivity();
        f0 f0Var = new f0(this);
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        mVarRequireActivity2.addMenuProvider(f0Var, viewLifecycleOwner);
        ((ComposeView) view2.findViewById(R.id.weight_picker_compose_view)).setContent(new z3.e(-49360648, true, new a61.d(this, 3)));
        final int i15 = 0;
        ((ViewGroup) view2.findViewById(R.id.change_exercise_name_layout)).setOnClickListener(new View.OnClickListener(this) { // from class: aq.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f11809b;

            {
                this.f11809b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0083  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int iLongValue;
                int i16 = i15;
                int iB = 0;
                c0 c0Var = this.f11809b;
                switch (i16) {
                    case 0:
                        int i17 = c0.f11852i;
                        NewSelectExerciseActivity.a aVar = NewSelectExerciseActivity.f29823c;
                        Context contextRequireContext = c0Var.requireContext();
                        contextRequireContext.getClass();
                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = c0Var.u6().f29792d;
                        Context contextRequireContext2 = c0Var.requireContext();
                        contextRequireContext2.getClass();
                        String strB = hq.j.b(contextRequireContext2, c0Var.u6().f29790b);
                        Context contextRequireContext3 = c0Var.requireContext();
                        contextRequireContext3.getClass();
                        c0Var.f11860h.a(NewSelectExerciseActivity.a.a(aVar, contextRequireContext, cVar, null, strB, false, hq.j.a(contextRequireContext3, c0Var.u6().f29790b), hq.j.d(c0Var.u6().f29790b), hq.j.c(c0Var.u6().f29790b), false, 276), null);
                        break;
                    case 1:
                        int i18 = c0.f11852i;
                        Double d14 = c0Var.v6().f12001l;
                        if (d14 != null) {
                            if (d14.doubleValue() <= 0.0d) {
                                d14 = null;
                            }
                            if (d14 != null) {
                                iB = MathKt.b(d14.doubleValue());
                            }
                        }
                        r22.f0 f0VarB = r22.f0.a.b(r22.f0.U0, iB, 23, 24);
                        f0VarB.T = new a73.j(c0Var, 17);
                        f0VarB.show(c0Var.getParentFragmentManager(), (String) null);
                        break;
                    case 2:
                        int i19 = c0.f11852i;
                        j23.l lVar = new j23.l(0, 999);
                        rk1.b.e eVar = new rk1.b.e(c0Var.requireContext());
                        ArrayList arrayList = new ArrayList(p13.y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((j23.k) it).f96801c) {
                            arrayList.add(String.valueOf(((p13.p0) it).nextInt()));
                        }
                        eVar.h((String[]) arrayList.toArray(new String[0]), false);
                        eVar.e(lVar.f96796a);
                        eVar.d(lVar.f96797b);
                        rk1.b.d dVar = eVar.f153344b;
                        dVar.f153345a = 1;
                        Long l14 = c0Var.v6().f12002m;
                        if (l14 == null) {
                            iLongValue = 0;
                        } else {
                            Long l15 = l14.longValue() > 0 ? l14 : null;
                            if (l15 != null) {
                                iLongValue = (int) l15.longValue();
                            } else {
                                iLongValue = 0;
                            }
                        }
                        eVar.c(Integer.valueOf(iLongValue));
                        dVar.f153346b = c0Var.getString(R.string.strength_training_reps);
                        eVar.f(new z(c0Var, 0));
                        eVar.a();
                        break;
                    default:
                        int i24 = c0.f11852i;
                        c0Var.v6().f11999j.j(Boolean.TRUE);
                        break;
                }
            }
        });
        View viewFindViewById = view2.findViewById(R.id.exercise_name_label_text_view);
        viewFindViewById.getClass();
        this.f11856d = (TextView) viewFindViewById;
        final int i16 = 1;
        ((ViewGroup) view2.findViewById(R.id.edit_duration_layout)).setOnClickListener(new View.OnClickListener(this) { // from class: aq.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f11809b;

            {
                this.f11809b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0083  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int iLongValue;
                int i17 = i16;
                int iB = 0;
                c0 c0Var = this.f11809b;
                switch (i17) {
                    case 0:
                        int i18 = c0.f11852i;
                        NewSelectExerciseActivity.a aVar = NewSelectExerciseActivity.f29823c;
                        Context contextRequireContext = c0Var.requireContext();
                        contextRequireContext.getClass();
                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = c0Var.u6().f29792d;
                        Context contextRequireContext2 = c0Var.requireContext();
                        contextRequireContext2.getClass();
                        String strB = hq.j.b(contextRequireContext2, c0Var.u6().f29790b);
                        Context contextRequireContext3 = c0Var.requireContext();
                        contextRequireContext3.getClass();
                        c0Var.f11860h.a(NewSelectExerciseActivity.a.a(aVar, contextRequireContext, cVar, null, strB, false, hq.j.a(contextRequireContext3, c0Var.u6().f29790b), hq.j.d(c0Var.u6().f29790b), hq.j.c(c0Var.u6().f29790b), false, 276), null);
                        break;
                    case 1:
                        int i19 = c0.f11852i;
                        Double d14 = c0Var.v6().f12001l;
                        if (d14 != null) {
                            if (d14.doubleValue() <= 0.0d) {
                                d14 = null;
                            }
                            if (d14 != null) {
                                iB = MathKt.b(d14.doubleValue());
                            }
                        }
                        r22.f0 f0VarB = r22.f0.a.b(r22.f0.U0, iB, 23, 24);
                        f0VarB.T = new a73.j(c0Var, 17);
                        f0VarB.show(c0Var.getParentFragmentManager(), (String) null);
                        break;
                    case 2:
                        int i110 = c0.f11852i;
                        j23.l lVar = new j23.l(0, 999);
                        rk1.b.e eVar = new rk1.b.e(c0Var.requireContext());
                        ArrayList arrayList = new ArrayList(p13.y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((j23.k) it).f96801c) {
                            arrayList.add(String.valueOf(((p13.p0) it).nextInt()));
                        }
                        eVar.h((String[]) arrayList.toArray(new String[0]), false);
                        eVar.e(lVar.f96796a);
                        eVar.d(lVar.f96797b);
                        rk1.b.d dVar = eVar.f153344b;
                        dVar.f153345a = 1;
                        Long l14 = c0Var.v6().f12002m;
                        if (l14 == null) {
                            iLongValue = 0;
                        } else {
                            Long l15 = l14.longValue() > 0 ? l14 : null;
                            if (l15 != null) {
                                iLongValue = (int) l15.longValue();
                            } else {
                                iLongValue = 0;
                            }
                        }
                        eVar.c(Integer.valueOf(iLongValue));
                        dVar.f153346b = c0Var.getString(R.string.strength_training_reps);
                        eVar.f(new z(c0Var, 0));
                        eVar.a();
                        break;
                    default:
                        int i24 = c0.f11852i;
                        c0Var.v6().f11999j.j(Boolean.TRUE);
                        break;
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.exercise_duration_label_text_view);
        viewFindViewById2.getClass();
        this.f11857e = (TextView) viewFindViewById2;
        final int i17 = 2;
        ((ViewGroup) view2.findViewById(R.id.edit_reps_layout)).setOnClickListener(new View.OnClickListener(this) { // from class: aq.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f11809b;

            {
                this.f11809b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0083  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int iLongValue;
                int i18 = i17;
                int iB = 0;
                c0 c0Var = this.f11809b;
                switch (i18) {
                    case 0:
                        int i19 = c0.f11852i;
                        NewSelectExerciseActivity.a aVar = NewSelectExerciseActivity.f29823c;
                        Context contextRequireContext = c0Var.requireContext();
                        contextRequireContext.getClass();
                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = c0Var.u6().f29792d;
                        Context contextRequireContext2 = c0Var.requireContext();
                        contextRequireContext2.getClass();
                        String strB = hq.j.b(contextRequireContext2, c0Var.u6().f29790b);
                        Context contextRequireContext3 = c0Var.requireContext();
                        contextRequireContext3.getClass();
                        c0Var.f11860h.a(NewSelectExerciseActivity.a.a(aVar, contextRequireContext, cVar, null, strB, false, hq.j.a(contextRequireContext3, c0Var.u6().f29790b), hq.j.d(c0Var.u6().f29790b), hq.j.c(c0Var.u6().f29790b), false, 276), null);
                        break;
                    case 1:
                        int i110 = c0.f11852i;
                        Double d14 = c0Var.v6().f12001l;
                        if (d14 != null) {
                            if (d14.doubleValue() <= 0.0d) {
                                d14 = null;
                            }
                            if (d14 != null) {
                                iB = MathKt.b(d14.doubleValue());
                            }
                        }
                        r22.f0 f0VarB = r22.f0.a.b(r22.f0.U0, iB, 23, 24);
                        f0VarB.T = new a73.j(c0Var, 17);
                        f0VarB.show(c0Var.getParentFragmentManager(), (String) null);
                        break;
                    case 2:
                        int i111 = c0.f11852i;
                        j23.l lVar = new j23.l(0, 999);
                        rk1.b.e eVar = new rk1.b.e(c0Var.requireContext());
                        ArrayList arrayList = new ArrayList(p13.y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((j23.k) it).f96801c) {
                            arrayList.add(String.valueOf(((p13.p0) it).nextInt()));
                        }
                        eVar.h((String[]) arrayList.toArray(new String[0]), false);
                        eVar.e(lVar.f96796a);
                        eVar.d(lVar.f96797b);
                        rk1.b.d dVar = eVar.f153344b;
                        dVar.f153345a = 1;
                        Long l14 = c0Var.v6().f12002m;
                        if (l14 == null) {
                            iLongValue = 0;
                        } else {
                            Long l15 = l14.longValue() > 0 ? l14 : null;
                            if (l15 != null) {
                                iLongValue = (int) l15.longValue();
                            } else {
                                iLongValue = 0;
                            }
                        }
                        eVar.c(Integer.valueOf(iLongValue));
                        dVar.f153346b = c0Var.getString(R.string.strength_training_reps);
                        eVar.f(new z(c0Var, 0));
                        eVar.a();
                        break;
                    default:
                        int i24 = c0.f11852i;
                        c0Var.v6().f11999j.j(Boolean.TRUE);
                        break;
                }
            }
        });
        View viewFindViewById3 = view2.findViewById(R.id.exercise_reps_label_text_view);
        viewFindViewById3.getClass();
        this.f11858f = (TextView) viewFindViewById3;
        final int i18 = 3;
        ((ViewGroup) view2.findViewById(R.id.edit_weight_layout)).setOnClickListener(new View.OnClickListener(this) { // from class: aq.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f11809b;

            {
                this.f11809b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0083  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int iLongValue;
                int i19 = i18;
                int iB = 0;
                c0 c0Var = this.f11809b;
                switch (i19) {
                    case 0:
                        int i110 = c0.f11852i;
                        NewSelectExerciseActivity.a aVar = NewSelectExerciseActivity.f29823c;
                        Context contextRequireContext = c0Var.requireContext();
                        contextRequireContext.getClass();
                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = c0Var.u6().f29792d;
                        Context contextRequireContext2 = c0Var.requireContext();
                        contextRequireContext2.getClass();
                        String strB = hq.j.b(contextRequireContext2, c0Var.u6().f29790b);
                        Context contextRequireContext3 = c0Var.requireContext();
                        contextRequireContext3.getClass();
                        c0Var.f11860h.a(NewSelectExerciseActivity.a.a(aVar, contextRequireContext, cVar, null, strB, false, hq.j.a(contextRequireContext3, c0Var.u6().f29790b), hq.j.d(c0Var.u6().f29790b), hq.j.c(c0Var.u6().f29790b), false, 276), null);
                        break;
                    case 1:
                        int i111 = c0.f11852i;
                        Double d14 = c0Var.v6().f12001l;
                        if (d14 != null) {
                            if (d14.doubleValue() <= 0.0d) {
                                d14 = null;
                            }
                            if (d14 != null) {
                                iB = MathKt.b(d14.doubleValue());
                            }
                        }
                        r22.f0 f0VarB = r22.f0.a.b(r22.f0.U0, iB, 23, 24);
                        f0VarB.T = new a73.j(c0Var, 17);
                        f0VarB.show(c0Var.getParentFragmentManager(), (String) null);
                        break;
                    case 2:
                        int i112 = c0.f11852i;
                        j23.l lVar = new j23.l(0, 999);
                        rk1.b.e eVar = new rk1.b.e(c0Var.requireContext());
                        ArrayList arrayList = new ArrayList(p13.y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((j23.k) it).f96801c) {
                            arrayList.add(String.valueOf(((p13.p0) it).nextInt()));
                        }
                        eVar.h((String[]) arrayList.toArray(new String[0]), false);
                        eVar.e(lVar.f96796a);
                        eVar.d(lVar.f96797b);
                        rk1.b.d dVar = eVar.f153344b;
                        dVar.f153345a = 1;
                        Long l14 = c0Var.v6().f12002m;
                        if (l14 == null) {
                            iLongValue = 0;
                        } else {
                            Long l15 = l14.longValue() > 0 ? l14 : null;
                            if (l15 != null) {
                                iLongValue = (int) l15.longValue();
                            } else {
                                iLongValue = 0;
                            }
                        }
                        eVar.c(Integer.valueOf(iLongValue));
                        dVar.f153346b = c0Var.getString(R.string.strength_training_reps);
                        eVar.f(new z(c0Var, 0));
                        eVar.a();
                        break;
                    default:
                        int i24 = c0.f11852i;
                        c0Var.v6().f11999j.j(Boolean.TRUE);
                        break;
                }
            }
        });
        View viewFindViewById4 = view2.findViewById(R.id.exercise_weight_label_text_view);
        viewFindViewById4.getClass();
        this.f11859g = (TextView) viewFindViewById4;
        List<x> listD2 = u6().f29798j.d();
        if (listD2 == null) {
            listD2 = p13.j0.f134944a;
        }
        int size = listD2.size();
        int i19 = size > 1 ? R.string.strength_traning_delete_exercise_sets_action : R.string.strength_training_delete_exercise_set_action;
        TextView textView = (TextView) view2.findViewById(R.id.delete_sets_text_view);
        textView.setText(i19);
        textView.setOnClickListener(new b0(this, size, 0));
        androidx.lifecycle.y0<Object> y0Var = v6().f11995f;
        androidx.lifecycle.n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        final int i24 = 2;
        dh.b.L(y0Var, viewLifecycleOwner2, new androidx.lifecycle.z0(this) { // from class: aq.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f12301b;

            {
                this.f12301b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i25 = i24;
                c0 c0Var = this.f12301b;
                switch (i25) {
                    case 0:
                        int i26 = c0.f11852i;
                        obj.getClass();
                        TextView textView2 = c0Var.f11858f;
                        if (textView2 != null) {
                            c0.w6(obj, textView2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editRepsLabelTextView");
                            throw null;
                        }
                    case 1:
                        int i27 = c0.f11852i;
                        if (!(obj instanceof String)) {
                            obj.getClass();
                            TextView textView3 = c0Var.f11859g;
                            if (textView3 != null) {
                                c0.w6(obj, textView3);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("editWeightLabelTextView");
                                throw null;
                            }
                        }
                        String str = obj + StringUtils.SPACE + c0Var.requireContext().getString(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? R.string.lbl_kg : R.string.lbl_lbs);
                        TextView textView4 = c0Var.f11859g;
                        if (textView4 != null) {
                            c0.w6(str, textView4);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editWeightLabelTextView");
                            throw null;
                        }
                    case 2:
                        int i28 = c0.f11852i;
                        obj.getClass();
                        TextView textView5 = c0Var.f11856d;
                        if (textView5 != null) {
                            c0.w6(obj, textView5);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("changeExerciseLabelTextView");
                            throw null;
                        }
                    default:
                        int i29 = c0.f11852i;
                        obj.getClass();
                        TextView textView6 = c0Var.f11857e;
                        if (textView6 != null) {
                            c0.w6(obj, textView6);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editDurationLabelTextView");
                            throw null;
                        }
                }
            }
        });
        androidx.lifecycle.y0<Object> y0Var2 = v6().f11996g;
        androidx.lifecycle.n0 viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        final int i25 = 3;
        dh.b.L(y0Var2, viewLifecycleOwner3, new androidx.lifecycle.z0(this) { // from class: aq.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f12301b;

            {
                this.f12301b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i26 = i25;
                c0 c0Var = this.f12301b;
                switch (i26) {
                    case 0:
                        int i27 = c0.f11852i;
                        obj.getClass();
                        TextView textView2 = c0Var.f11858f;
                        if (textView2 != null) {
                            c0.w6(obj, textView2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editRepsLabelTextView");
                            throw null;
                        }
                    case 1:
                        int i28 = c0.f11852i;
                        if (!(obj instanceof String)) {
                            obj.getClass();
                            TextView textView3 = c0Var.f11859g;
                            if (textView3 != null) {
                                c0.w6(obj, textView3);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("editWeightLabelTextView");
                                throw null;
                            }
                        }
                        String str = obj + StringUtils.SPACE + c0Var.requireContext().getString(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? R.string.lbl_kg : R.string.lbl_lbs);
                        TextView textView4 = c0Var.f11859g;
                        if (textView4 != null) {
                            c0.w6(str, textView4);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editWeightLabelTextView");
                            throw null;
                        }
                    case 2:
                        int i29 = c0.f11852i;
                        obj.getClass();
                        TextView textView5 = c0Var.f11856d;
                        if (textView5 != null) {
                            c0.w6(obj, textView5);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("changeExerciseLabelTextView");
                            throw null;
                        }
                    default:
                        int i210 = c0.f11852i;
                        obj.getClass();
                        TextView textView6 = c0Var.f11857e;
                        if (textView6 != null) {
                            c0.w6(obj, textView6);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editDurationLabelTextView");
                            throw null;
                        }
                }
            }
        });
        androidx.lifecycle.y0<Object> y0Var3 = v6().f11997h;
        androidx.lifecycle.n0 viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        final int i26 = 0;
        dh.b.L(y0Var3, viewLifecycleOwner4, new androidx.lifecycle.z0(this) { // from class: aq.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f12301b;

            {
                this.f12301b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i27 = i26;
                c0 c0Var = this.f12301b;
                switch (i27) {
                    case 0:
                        int i28 = c0.f11852i;
                        obj.getClass();
                        TextView textView2 = c0Var.f11858f;
                        if (textView2 != null) {
                            c0.w6(obj, textView2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editRepsLabelTextView");
                            throw null;
                        }
                    case 1:
                        int i29 = c0.f11852i;
                        if (!(obj instanceof String)) {
                            obj.getClass();
                            TextView textView3 = c0Var.f11859g;
                            if (textView3 != null) {
                                c0.w6(obj, textView3);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("editWeightLabelTextView");
                                throw null;
                            }
                        }
                        String str = obj + StringUtils.SPACE + c0Var.requireContext().getString(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? R.string.lbl_kg : R.string.lbl_lbs);
                        TextView textView4 = c0Var.f11859g;
                        if (textView4 != null) {
                            c0.w6(str, textView4);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editWeightLabelTextView");
                            throw null;
                        }
                    case 2:
                        int i210 = c0.f11852i;
                        obj.getClass();
                        TextView textView5 = c0Var.f11856d;
                        if (textView5 != null) {
                            c0.w6(obj, textView5);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("changeExerciseLabelTextView");
                            throw null;
                        }
                    default:
                        int i211 = c0.f11852i;
                        obj.getClass();
                        TextView textView6 = c0Var.f11857e;
                        if (textView6 != null) {
                            c0.w6(obj, textView6);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editDurationLabelTextView");
                            throw null;
                        }
                }
            }
        });
        androidx.lifecycle.y0<Object> y0Var4 = v6().f11998i;
        androidx.lifecycle.n0 viewLifecycleOwner5 = getViewLifecycleOwner();
        viewLifecycleOwner5.getClass();
        final int i27 = 1;
        dh.b.L(y0Var4, viewLifecycleOwner5, new androidx.lifecycle.z0(this) { // from class: aq.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f12301b;

            {
                this.f12301b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i28 = i27;
                c0 c0Var = this.f12301b;
                switch (i28) {
                    case 0:
                        int i29 = c0.f11852i;
                        obj.getClass();
                        TextView textView2 = c0Var.f11858f;
                        if (textView2 != null) {
                            c0.w6(obj, textView2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editRepsLabelTextView");
                            throw null;
                        }
                    case 1:
                        int i210 = c0.f11852i;
                        if (!(obj instanceof String)) {
                            obj.getClass();
                            TextView textView3 = c0Var.f11859g;
                            if (textView3 != null) {
                                c0.w6(obj, textView3);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("editWeightLabelTextView");
                                throw null;
                            }
                        }
                        String str = obj + StringUtils.SPACE + c0Var.requireContext().getString(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? R.string.lbl_kg : R.string.lbl_lbs);
                        TextView textView4 = c0Var.f11859g;
                        if (textView4 != null) {
                            c0.w6(str, textView4);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editWeightLabelTextView");
                            throw null;
                        }
                    case 2:
                        int i211 = c0.f11852i;
                        obj.getClass();
                        TextView textView5 = c0Var.f11856d;
                        if (textView5 != null) {
                            c0.w6(obj, textView5);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("changeExerciseLabelTextView");
                            throw null;
                        }
                    default:
                        int i212 = c0.f11852i;
                        obj.getClass();
                        TextView textView6 = c0Var.f11857e;
                        if (textView6 != null) {
                            c0.w6(obj, textView6);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editDurationLabelTextView");
                            throw null;
                        }
                }
            }
        });
        List<x> listD3 = u6().f29798j.d();
        if (listD3 == null) {
            listD3 = p13.j0.f134944a;
        }
        i0 i0VarV6 = v6();
        listD3.getClass();
        ArrayList arrayList = i0VarV6.f11990a;
        arrayList.clear();
        arrayList.addAll(listD3);
        i0VarV6.x4(listD3);
    }

    public final EditExercisesMultiSelectViewModel u6() {
        return (EditExercisesMultiSelectViewModel) this.f11854b.getValue();
    }

    public final i0 v6() {
        return (i0) this.f11855c.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laq/c0$a;", "", "<init>", "()V", "", "DURATION_PICKER_MAX_HOURS", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
