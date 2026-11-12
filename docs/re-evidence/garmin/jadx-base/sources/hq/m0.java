package hq;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lhq/m0;", "Landroidx/fragment/app/Fragment;", "Landroidx/core/view/s;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 extends Fragment implements androidx.core.view.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f85071d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f85072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f85073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f85074c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f85075a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f85075a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f85075a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f85075a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f85076a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f85076a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f85076a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f85077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f85078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f85077a = aVar;
            this.f85078b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f85077a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f85078b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f85079a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f85079a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f85079a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f85080a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar) {
            super(0);
            this.f85080a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f85080a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f85081a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o13.l lVar) {
            super(0);
            this.f85081a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f85081a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f85082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f85083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, o13.l lVar) {
            super(0);
            this.f85082a = aVar;
            this.f85083b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f85082a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f85083b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f85084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f85085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment, o13.l lVar) {
            super(0);
            this.f85084a = fragment;
            this.f85085b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f85085b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f85084a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    static {
        new a(null);
    }

    public m0() {
        super(R.layout.fragment_new_select_exercise_filter_summary);
        final int i14 = 0;
        o13.l lVarA = o13.m.a(o13.n.NONE, new f(new e23.a(this) { // from class: hq.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f85050b;

            {
                this.f85050b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                m0 m0Var = this.f85050b;
                switch (i15) {
                    case 0:
                        int i16 = m0.f85071d;
                        Fragment fragmentRequireParentFragment = m0Var.requireParentFragment();
                        fragmentRequireParentFragment.getClass();
                        return fragmentRequireParentFragment;
                    default:
                        int i17 = m0.f85071d;
                        return m0Var.getString(R.string.lbl_exercise_not_specified);
                }
            }
        }));
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        this.f85072a = new w1(t0Var.b(n0.class), new g(lVarA), new i(this, lVarA), new h(null, lVarA));
        this.f85073b = new w1(t0Var.b(com.garmin.android.apps.connectmobile.activities.stats.exercises.c.class), new c(this), new e(this), new d(null, this));
        final int i15 = 1;
        this.f85074c = o13.m.b(new e23.a(this) { // from class: hq.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f85050b;

            {
                this.f85050b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                m0 m0Var = this.f85050b;
                switch (i16) {
                    case 0:
                        int i17 = m0.f85071d;
                        Fragment fragmentRequireParentFragment = m0Var.requireParentFragment();
                        fragmentRequireParentFragment.getClass();
                        return fragmentRequireParentFragment;
                    default:
                        int i18 = m0.f85071d;
                        return m0Var.getString(R.string.lbl_exercise_not_specified);
                }
            }
        });
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.menu_apply, menu);
        menu.findItem(R.id.menu_item_apply).setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        z1 z1Var = mVarRequireActivity instanceof z1 ? (z1) mVarRequireActivity : null;
        if (z1Var != null) {
            z1Var.updateActionBar(getString(R.string.lbl_filter), 3);
        }
        g22.e.k(this, this, androidx.lifecycle.b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.muscle_group);
        final int i14 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: hq.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f85058b;

            {
                this.f85058b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                m0 m0Var = this.f85058b;
                switch (i15) {
                    case 0:
                        int i16 = m0.f85071d;
                        m0Var.u6().f85095i.j(i.MUSCLE);
                        break;
                    case 1:
                        int i17 = m0.f85071d;
                        m0Var.u6().f85090d.j(p13.j0.f134944a);
                        break;
                    default:
                        int i18 = m0.f85071d;
                        m0Var.u6().f85095i.j(i.EQUIPMENT);
                        break;
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.equipment_group);
        TextView textView = (TextView) view2.findViewById(R.id.tip_message);
        Button button = (Button) view2.findViewById(R.id.reset);
        final int i15 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: hq.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f85058b;

            {
                this.f85058b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                m0 m0Var = this.f85058b;
                switch (i16) {
                    case 0:
                        int i17 = m0.f85071d;
                        m0Var.u6().f85095i.j(i.MUSCLE);
                        break;
                    case 1:
                        int i18 = m0.f85071d;
                        m0Var.u6().f85090d.j(p13.j0.f134944a);
                        break;
                    default:
                        int i19 = m0.f85071d;
                        m0Var.u6().f85095i.j(i.EQUIPMENT);
                        break;
                }
            }
        });
        final k32.l lVar = new k32.l(viewFindViewById);
        androidx.lifecycle.w0 w0Var = u6().f85091e;
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        final int i16 = 0;
        dh.b.L(w0Var, viewLifecycleOwner, new b(new e23.l(this) { // from class: hq.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f85064b;

            {
                this.f85064b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                k32.l lVar2 = lVar;
                m0 m0Var = this.f85064b;
                List list = (List) obj;
                int i18 = m0.f85071d;
                switch (i17) {
                    case 0:
                        list.getClass();
                        String strK0 = !list.isEmpty() ? p13.h0.k0(list, null, null, null, new f0(4), 31) : (String) m0Var.f85074c.getValue();
                        String string = m0Var.getString(R.string.strength_training_filter_muscle_groups);
                        string.getClass();
                        lVar2.b(string, strK0);
                        break;
                    default:
                        list.getClass();
                        String strK1 = !list.isEmpty() ? p13.h0.k0(list, null, null, null, new f0(3), 31) : (String) m0Var.f85074c.getValue();
                        String string2 = m0Var.getString(R.string.activity_details_equipment);
                        string2.getClass();
                        lVar2.b(string2, strK1);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        androidx.lifecycle.w0 w0Var2 = u6().f85093g;
        androidx.lifecycle.n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        dh.b.L(w0Var2, viewLifecycleOwner2, new b(new ho0.g(button, 3)));
        if (!((com.garmin.android.apps.connectmobile.activities.stats.exercises.c) this.f85073b.getValue()).f29905x) {
            viewFindViewById2.getClass();
            viewFindViewById2.setVisibility(8);
            textView.getClass();
            textView.setVisibility(8);
            return;
        }
        viewFindViewById2.getClass();
        viewFindViewById2.setVisibility(0);
        textView.getClass();
        textView.setVisibility(0);
        final int i17 = 2;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: hq.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f85058b;

            {
                this.f85058b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                m0 m0Var = this.f85058b;
                switch (i18) {
                    case 0:
                        int i19 = m0.f85071d;
                        m0Var.u6().f85095i.j(i.MUSCLE);
                        break;
                    case 1:
                        int i110 = m0.f85071d;
                        m0Var.u6().f85090d.j(p13.j0.f134944a);
                        break;
                    default:
                        int i111 = m0.f85071d;
                        m0Var.u6().f85095i.j(i.EQUIPMENT);
                        break;
                }
            }
        });
        final k32.l lVar2 = new k32.l(viewFindViewById2);
        androidx.lifecycle.w0 w0Var3 = u6().f85092f;
        androidx.lifecycle.n0 viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        final int i18 = 1;
        dh.b.L(w0Var3, viewLifecycleOwner3, new b(new e23.l(this) { // from class: hq.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f85064b;

            {
                this.f85064b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                k32.l lVar3 = lVar2;
                m0 m0Var = this.f85064b;
                List list = (List) obj;
                int i110 = m0.f85071d;
                switch (i19) {
                    case 0:
                        list.getClass();
                        String strK0 = !list.isEmpty() ? p13.h0.k0(list, null, null, null, new f0(4), 31) : (String) m0Var.f85074c.getValue();
                        String string = m0Var.getString(R.string.strength_training_filter_muscle_groups);
                        string.getClass();
                        lVar3.b(string, strK0);
                        break;
                    default:
                        list.getClass();
                        String strK1 = !list.isEmpty() ? p13.h0.k0(list, null, null, null, new f0(3), 31) : (String) m0Var.f85074c.getValue();
                        String string2 = m0Var.getString(R.string.activity_details_equipment);
                        string2.getClass();
                        lVar3.b(string2, strK1);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        textView.setText(getString(R.string.lbl_select_exercise_tip_message_2));
    }

    public final n0 u6() {
        return (n0) this.f85072a.getValue();
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        String str;
        String str2;
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_apply) {
            return false;
        }
        List<hq.h> listD = u6().f85090d.d();
        if (listD == null) {
            listD = p13.j0.f134944a;
        }
        List<hq.h> list = listD;
        w1 w1Var = this.f85073b;
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar = (com.garmin.android.apps.connectmobile.activities.stats.exercises.c) w1Var.getValue();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c.C4(cVar, contextRequireContext, null, null, list, 6);
        list.getClass();
        ht.a aVar = ht.a.f85464a;
        for (hq.h hVar : list) {
            if (hVar instanceof hq.h.b) {
                str = "MuscleFilterOptionApplied";
                str2 = "primaryMuscleKey";
            } else {
                if (!(hVar instanceof hq.h.a)) {
                    lc.u0.r();
                    return false;
                }
                str = "EquipmentFilterOptionApplied";
                str2 = "equipmentKey";
            }
            Bundle bundleA = h7.c.a(new o13.p(str2, hVar.f()));
            aVar.getClass();
            ht.a.a(bundleA, str);
        }
        requireActivity().onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhq/m0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
