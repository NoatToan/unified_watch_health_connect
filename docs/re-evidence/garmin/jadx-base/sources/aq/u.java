package aq;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.NewSelectExerciseActivity;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.mobeta.android.dslv.DragSortListView;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class u extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> f12226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f12227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mt0.q3 f12228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mt0.r3 f12229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public mt0.k0 f12230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f12231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ExerciseSetsDTO f12232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.d f12233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.d> f12234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> f12235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> f12236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DragSortListView f12237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f12238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public am.x0 f12239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12240r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12241t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12243w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f12223a = new DragSortListView.d() { // from class: aq.s
        @Override // com.mobeta.android.dslv.DragSortListView.d
        public final void a(int i14, int i15) {
            this.f12192a.v6();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f12224b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f12225c = new DragSortListView.n() { // from class: aq.t
        @Override // com.mobeta.android.dslv.DragSortListView.n
        public final void remove(int i14) {
            int i15;
            u uVar = this.f12217a;
            uVar.v6();
            uVar.f12243w = true;
            uVar.f12227e.remove((com.garmin.android.apps.connectmobile.repcounting.model.e) uVar.f12227e.getItem(i14));
            DragSortListView dragSortListView = uVar.f12237o;
            SparseBooleanArray checkedItemPositions = dragSortListView.getCheckedItemPositions();
            if (checkedItemPositions.size() != 0) {
                int[] iArr = new int[checkedItemPositions.size()];
                int[] iArr2 = new int[checkedItemPositions.size()];
                int iKeyAt = checkedItemPositions.keyAt(checkedItemPositions.size() - 1) + 1;
                int iD = DragSortListView.d(checkedItemPositions, i14, iKeyAt, iArr, iArr2);
                for (int i16 = 0; i16 != iD; i16++) {
                    int i17 = iArr[i16];
                    if (i17 != i14 && ((i15 = iArr2[i16]) >= i17 || i15 <= i14)) {
                        dragSortListView.setItemChecked(DragSortListView.u(i17, i14, iKeyAt), true);
                    }
                    dragSortListView.setItemChecked(DragSortListView.u(iArr2[i16], i14, iKeyAt), false);
                }
            }
            uVar.f12243w = false;
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12242v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12244x = 9999;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f12245y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f12246z = 0;
    public double A = 0.0d;

    public class a implements DragSortListView.j {
        public a() {
        }

        @Override // com.mobeta.android.dslv.DragSortListView.j
        public final void b(int i14, int i15) {
            int i16;
            int i17;
            int i18;
            u uVar = u.this;
            uVar.f12243w = true;
            ArrayList arrayList = new ArrayList();
            if (i14 != i15 && i14 < uVar.f12227e.getCount()) {
                com.garmin.android.apps.connectmobile.repcounting.model.e eVar = (com.garmin.android.apps.connectmobile.repcounting.model.e) uVar.f12227e.getItem(i14);
                com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.e) uVar.f12227e.getItem(i15);
                ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList2 = new ArrayList<>(uVar.f12236n);
                uVar.f12227e.remove(eVar);
                uVar.f12227e.insert(eVar, i15);
                DragSortListView dragSortListView = uVar.f12237o;
                SparseBooleanArray checkedItemPositions = dragSortListView.getCheckedItemPositions();
                if (i15 < i14) {
                    i17 = i14;
                    i16 = i15;
                } else {
                    i16 = i14;
                    i17 = i15;
                }
                int i19 = i17 + 1;
                int[] iArr = new int[checkedItemPositions.size()];
                int[] iArr2 = new int[checkedItemPositions.size()];
                int iD = DragSortListView.d(checkedItemPositions, i16, i19, iArr, iArr2);
                if (iD != 1 || iArr[0] != iArr2[0]) {
                    if (i14 < i15) {
                        for (int i24 = 0; i24 != iD; i24++) {
                            dragSortListView.setItemChecked(DragSortListView.u(iArr[i24], i16, i19), true);
                            dragSortListView.setItemChecked(DragSortListView.u(iArr2[i24], i16, i19), false);
                        }
                    } else {
                        boolean z14 = false;
                        int i25 = 0;
                        while (i25 != iD) {
                            dragSortListView.setItemChecked(iArr[i25], z14);
                            dragSortListView.setItemChecked(iArr2[i25], true);
                            i25++;
                            z14 = false;
                        }
                    }
                }
                int i26 = 0;
                while (true) {
                    if (i26 >= uVar.f12236n.size()) {
                        i18 = 0;
                        i26 = 0;
                        break;
                    } else {
                        if (eVar.I() == uVar.f12236n.get(i26).I()) {
                            arrayList.add(uVar.f12236n.get(i26));
                            i18 = 0;
                            for (int i27 = i26 + 1; i27 < uVar.f12236n.size() && uVar.f12236n.get(i27).f0(); i27++) {
                                arrayList.add(uVar.f12236n.get(i27));
                                i18++;
                            }
                            break;
                        }
                        i26++;
                    }
                }
                int i28 = i26 + i18;
                while (i18 > 0) {
                    arrayList2.remove(i28);
                    i18--;
                    i28--;
                }
                if (arrayList2.size() > 0) {
                    arrayList2.remove(i26);
                }
                int i29 = 0;
                while (true) {
                    if (i29 >= uVar.f12236n.size()) {
                        i29 = 0;
                        break;
                    } else if (eVar2.I() == uVar.f12236n.get(i29).I()) {
                        break;
                    } else {
                        i29++;
                    }
                }
                if (i29 > arrayList2.size() - 1) {
                    arrayList2.addAll(arrayList2.size(), arrayList);
                } else {
                    arrayList2.addAll(i29, arrayList);
                }
                uVar.f12236n = new ArrayList<>(arrayList2);
                mt0.r3 r3Var = uVar.f12229g;
                if (r3Var != null) {
                    r3Var.Q3(arrayList2);
                }
            }
            uVar.f12243w = false;
            uVar.z6();
            uVar.f12227e.a(uVar.f12226d);
        }
    }

    public class b implements androidx.core.view.s {
        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            u uVar;
            Context context;
            if (menuItem.getItemId() != R.id.menu_item_add || (context = (uVar = u.this).getContext()) == null) {
                return false;
            }
            uVar.startActivityForResult(NewSelectExerciseActivity.ca(context, uVar.f12231i, null, hq.j.b(context, uVar.f12239q), hq.j.a(context, uVar.f12239q), hq.j.d(uVar.f12239q), hq.j.c(uVar.f12239q)), 1002);
            return false;
        }
    }

    public class c implements mt0.k0 {
        public c() {
        }

        @Override // mt0.k0
        public final void D2(ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList) {
        }

        @Override // mt0.k0
        public final void b8(int i14, long j8, long j14, double d14) {
            u uVar = u.this;
            uVar.f12244x = i14;
            uVar.f12245y = j8;
            uVar.f12246z = j14;
            uVar.A = d14;
        }

        @Override // mt0.k0
        public final void z7(int i14, int i15) {
            if (i15 >= 0) {
                u uVar = u.this;
                if (i15 >= uVar.f12236n.size()) {
                    return;
                }
                uVar.f12240r = i15;
                uVar.f12241t = i14;
                uVar.f12242v = true;
                com.garmin.android.apps.connectmobile.repcounting.model.e eVar = uVar.f12236n.get(i15);
                String[] strArr = eVar.f41120j;
                if ((strArr != null ? (String[]) Arrays.copyOf(strArr, strArr.length) : null) != null && eVar.f41116f.equals("UNKNOWN")) {
                    String[] strArr2 = eVar.f41120j;
                    String[] strArr3 = strArr2 != null ? (String[]) Arrays.copyOf(strArr2, strArr2.length) : null;
                    if (strArr3 != null) {
                        int length = strArr3.length;
                        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr = new com.garmin.android.apps.connectmobile.repcounting.model.d[length];
                        for (int i16 = 0; i16 < strArr3.length; i16++) {
                            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
                            dVar.f41106e = strArr3[i16];
                            dVarArr[i16] = dVar;
                        }
                        for (int i17 = 0; i17 < length; i17++) {
                            com.garmin.android.apps.connectmobile.repcounting.model.d dVar2 = dVarArr[i17];
                            dVarArr[i17] = uVar.f12231i.D(dVar2.f41102a, dVar2.f41106e);
                        }
                        new com.garmin.android.apps.connectmobile.repcounting.model.c(dVarArr);
                    }
                }
                Context context = uVar.getContext();
                if (context != null) {
                    uVar.startActivityForResult(NewSelectExerciseActivity.ca(context, uVar.f12231i, eVar, hq.j.b(context, uVar.f12239q), hq.j.a(context, uVar.f12239q), hq.j.d(uVar.f12239q), hq.j.c(uVar.f12239q)), 1003);
                }
            }
        }
    }

    public class d implements mt0.k0 {
        public d() {
        }

        @Override // mt0.k0
        public final void D2(ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList) {
        }

        @Override // mt0.k0
        public final void b8(int i14, long j8, long j14, double d14) {
        }

        @Override // mt0.k0
        public final void z7(int i14, int i15) {
            u uVar = u.this;
            uVar.f12240r = i15;
            uVar.f12241t = i14;
            uVar.f12242v = false;
            Context context = uVar.getContext();
            if (context != null) {
                uVar.startActivityForResult(NewSelectExerciseActivity.ca(context, null, null, hq.j.b(context, uVar.f12239q), hq.j.a(context, uVar.f12239q), hq.j.d(uVar.f12239q), hq.j.c(uVar.f12239q)), 1003);
            }
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12251a;

        static {
            int[] iArr = new int[am.x0.values().length];
            f12251a = iArr;
            try {
                iArr[am.x0.f4309n1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12251a[am.x0.C2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12251a[am.x0.f4326r2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12251a[am.x0.f4322q2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12251a[am.x0.f4329s2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static u y6(long j8, am.x0 x0Var, ExerciseSetsDTO exerciseSetsDTO, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
        u uVar = new u();
        Bundle bundle = new Bundle();
        if (cVar != null) {
            bundle.putParcelable("ARGS_EXERCISES_TYPES", cVar);
        }
        if (exerciseSetsDTO != null) {
            bundle.putParcelable("ARGS_EXERCISES_DETAILS", exerciseSetsDTO);
        }
        bundle.putLong("ARGS_EXERCISES_ACTIVITY_ID", j8);
        bundle.putSerializable("ARGS_EXERCISES_ACTIVITY_TYPE", x0Var);
        if (dVar != null) {
            bundle.putParcelable("ARGS_EXTRA_EXERCISE_ADDED", dVar);
        }
        com.garmin.android.apps.connectmobile.l2.f37135b.getClass();
        com.garmin.android.apps.connectmobile.l2.a.c(uVar, bundle);
        return uVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f12236n == null || this.f12234l == null) {
            return;
        }
        z6();
        w6((i.c) getActivity(), this.f12239q, this.f12234l, this.f12226d, new c());
        this.f12237o.setAdapter((ListAdapter) this.f12227e);
        this.f12237o.setDragListener(this.f12223a);
        this.f12237o.setDropListener(this.f12224b);
        this.f12237o.setRemoveListener(this.f12225c);
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar = this.f12233k;
        if (dVar != null) {
            u6(dVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (intent == null) {
            if (i14 == 1003) {
                this.f12240r = 0;
                this.f12241t = 0;
                this.f12242v = false;
                this.f12244x = 9999;
                this.f12245y = 0L;
                this.f12246z = 0L;
                this.A = 0.0d;
                return;
            }
            return;
        }
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) intent.getParcelableExtra("RESULT_SELECTED_EXERCISE");
        if (dVar != null) {
            if (i14 == 1002) {
                u6(dVar);
                this.f12227e.notifyDataSetChanged();
            } else if (i14 == 1003) {
                this.f12236n.set(this.f12241t, u6(dVar));
                z6();
                this.f12227e.a(this.f12226d);
            }
            if (getActivity() != null) {
                getActivity().invalidateOptionsMenu();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f12228f = (mt0.q3) context;
            try {
                this.f12229g = (mt0.r3) context;
                try {
                    this.f12230h = (mt0.k0) context;
                } catch (ClassCastException unused) {
                    p6.b.m(context.toString(), mt0.k0.class.getName());
                }
            } catch (ClassCastException unused2) {
                p6.b.m(context.toString(), mt0.r3.class.getName());
            }
        } catch (ClassCastException unused3) {
            p6.b.m(context.toString(), mt0.q3.class.getName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.garmin.android.apps.connectmobile.l2.f37135b.getClass();
        Bundle bundleC = com.garmin.android.apps.connectmobile.l2.a.b().c(this);
        if (bundleC != null) {
            this.f12232j = (ExerciseSetsDTO) bundleC.getParcelable("ARGS_EXERCISES_DETAILS");
            this.f12231i = (com.garmin.android.apps.connectmobile.repcounting.model.c) bundleC.getParcelable("ARGS_EXERCISES_TYPES");
            this.f12233k = (com.garmin.android.apps.connectmobile.repcounting.model.d) bundleC.getParcelable("ARGS_EXTRA_EXERCISE_ADDED");
            if (this.f12231i != null) {
                this.f12234l = new ArrayList<>(Arrays.asList(this.f12231i.F()));
            }
            if (this.f12232j != null) {
                this.f12235m = new ArrayList<>(Arrays.asList(this.f12232j.f41089a));
                this.f12236n = new ArrayList<>(Arrays.asList(this.f12232j.f41089a));
            }
            this.f12238p = bundleC.getLong("ARGS_EXERCISES_ACTIVITY_ID");
            this.f12239q = (am.x0) bundleC.getSerializable("ARGS_EXERCISES_ACTIVITY_TYPE");
        }
        if (this.f12239q == null) {
            this.f12239q = am.x0.f4309n1;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.edit_exercises_reorder_layout, viewGroup, false);
        if (this.f12239q == am.x0.C2) {
            viewInflate.findViewById(R.id.exercise_checkbox_space).setVisibility(8);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new b(), androidx.lifecycle.b0.b.RESUMED);
        this.f12237o = (DragSortListView) view2.findViewById(R.id.list_view);
        if (getContext() != null) {
            Context context = getContext();
            w wVar = new w(view2);
            am.x0 x0Var = this.f12239q;
            context.getClass();
            x0Var.getClass();
            int i14 = v.a.f12266a[x0Var.ordinal()];
            if (i14 == 1 || i14 == 2) {
                String string = context.getString(R.string.lbl_set_name);
                string.getClass();
                v.a(wVar, string, context.getString(R.string.lbl_time), context.getString(R.string.strength_training_reps), null, null);
            } else if (i14 == 3) {
                String string2 = context.getString(R.string.lbl_set_name);
                string2.getClass();
                v.a(wVar, string2, StringUtils.SPACE, context.getString(R.string.lbl_time), null, null);
            } else {
                String strF0 = ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).f0(context);
                String string3 = context.getString(R.string.strength_training_exercises);
                string3.getClass();
                v.a(wVar, string3, context.getString(R.string.lbl_time), context.getString(R.string.strength_training_reps), context.getString(R.string.lbl_weight), strF0);
            }
        }
    }

    public final com.garmin.android.apps.connectmobile.repcounting.model.e u6(com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
        u uVar;
        com.garmin.android.apps.connectmobile.repcounting.model.e eVarP = gl.b.P(dVar);
        eVarP.g0(Double.valueOf(this.A));
        if (this.f12244x != 9999) {
            eVarP.i0(Long.valueOf(this.f12245y));
            if (dVar.f41105d) {
                eVarP.n0(-1L);
            } else {
                eVarP.n0(Long.valueOf(this.f12246z));
            }
            this.f12244x = 9999;
            this.f12245y = 0L;
            this.f12246z = 0L;
            this.A = 0.0d;
        } else {
            eVarP.i0(-2L);
            if (dVar.f41105d) {
                eVarP.n0(-1L);
            } else {
                eVarP.n0(-2L);
            }
        }
        boolean z14 = this.f12242v;
        ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList = this.f12236n;
        if (z14) {
            uVar = this;
            if (arrayList != null) {
                boolean z15 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (size == uVar.f12240r) {
                        eVarP.j0(uVar.f12236n.get(size).I());
                        ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList2 = uVar.f12236n;
                        arrayList2.remove(arrayList2.get(size));
                        if (size < uVar.f12236n.size() && uVar.f12236n.get(size).f0()) {
                            z15 = true;
                        }
                        do {
                            if (z15) {
                                uVar.f12236n.remove(size);
                            }
                            if (size >= uVar.f12227e.getCount() || size >= uVar.f12236n.size()) {
                                break;
                            }
                        } while (uVar.f12236n.get(size).f0());
                    }
                }
                uVar.f12236n.add(uVar.f12240r, eVarP);
                uVar.f12242v = false;
            }
        } else if (arrayList != null) {
            arrayList.add(eVarP);
            this.f12227e.add(eVarP);
            z6();
            this.f12227e.a(this.f12226d);
            uVar = this;
        } else {
            ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList3 = new ArrayList<>();
            this.f12236n = arrayList3;
            arrayList3.add(eVarP);
            z6();
            uVar = this;
            uVar.w6((i.c) getActivity(), this.f12239q, this.f12234l, this.f12226d, new d());
            uVar.f12237o.setAdapter((ListAdapter) uVar.f12227e);
            uVar.f12237o.setDropListener(uVar.f12224b);
            uVar.f12237o.setRemoveListener(uVar.f12225c);
            uVar.f12227e.a(uVar.f12226d);
        }
        uVar.f12230h.D2(uVar.f12236n);
        return eVarP;
    }

    public final void v6() {
        InputMethodManager inputMethodManager;
        if (getActivity() == null || getActivity().getCurrentFocus() == null || (inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 2);
    }

    public final void w6(i.c cVar, am.x0 x0Var, ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.d> arrayList, ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList2, mt0.k0 k0Var) {
        if (cVar != null) {
            mt0.q3 q3Var = new mt0.q3() { // from class: aq.r
                @Override // mt0.q3
                public final void Q1(long j8, ArrayList arrayList3) {
                    u uVar = this.f12169a;
                    q qVar = uVar.f12227e;
                    if (qVar == null || qVar.getCount() <= 0) {
                        return;
                    }
                    uVar.v6();
                    if (!uVar.f12243w) {
                        q qVar2 = uVar.f12227e;
                        qVar2.getClass();
                        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                        int count = qVar2.getCount();
                        for (int i14 = 0; i14 < count; i14++) {
                            com.garmin.android.apps.connectmobile.repcounting.model.e eVar = (com.garmin.android.apps.connectmobile.repcounting.model.e) qVar2.getItem(i14);
                            if (eVar != null && eVar.f41123m) {
                                sparseBooleanArray.put(i14, true);
                            }
                        }
                        for (int count2 = uVar.f12227e.getCount() - 1; count2 >= 0; count2--) {
                            if (sparseBooleanArray.get(count2, false)) {
                                q qVar3 = uVar.f12227e;
                                qVar3.remove((com.garmin.android.apps.connectmobile.repcounting.model.e) qVar3.getItem(count2));
                                sparseBooleanArray.put(count2, false);
                                if (count2 < uVar.f12236n.size()) {
                                    int i15 = uVar.f12236n.get(count2).f0() ? count2 + 1 : count2;
                                    do {
                                        uVar.f12236n.remove(i15);
                                        if (count2 >= uVar.f12227e.getCount()) {
                                            break;
                                        }
                                    } while (uVar.f12236n.get(i15).f0());
                                }
                            }
                        }
                    }
                    uVar.z6();
                    uVar.f12227e.a(uVar.f12226d);
                    mt0.q3 q3Var2 = uVar.f12228f;
                    if (q3Var2 != null) {
                        q3Var2.Q1(uVar.f12238p, uVar.f12236n);
                    }
                }
            };
            int i14 = e.f12251a[x0Var.ordinal()];
            if (i14 == 2) {
                this.f12227e = new y1(cVar, arrayList, arrayList2, k0Var);
                return;
            }
            if (i14 == 3) {
                this.f12227e = new b2(cVar, arrayList, arrayList2, k0Var, q3Var);
                return;
            }
            if (i14 == 4) {
                this.f12227e = new h2(cVar, arrayList, arrayList2, k0Var, q3Var);
            } else if (i14 != 5) {
                this.f12227e = new d2(cVar, arrayList, arrayList2, k0Var, q3Var);
            } else {
                this.f12227e = new a2(cVar, arrayList, arrayList2, k0Var, q3Var);
            }
        }
    }

    public final void z6() {
        ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList;
        ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList2;
        this.f12226d = new ArrayList<>();
        int i14 = 0;
        while (true) {
            int size = this.f12236n.size();
            arrayList = this.f12226d;
            if (i14 >= size) {
                break;
            }
            arrayList.add(this.f12236n.get(i14));
            if (this.f12236n.get(i14).f0()) {
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    int size2 = this.f12235m.size();
                    arrayList2 = this.f12235m;
                    if (i15 >= size2) {
                        break;
                    }
                    if (arrayList2.get(i15).I() != this.f12236n.get(i14).I()) {
                        i16++;
                    }
                    i15++;
                }
                if (i16 < arrayList2.size() && i14 > 0) {
                    int i17 = i14 - 1;
                    if (this.f12236n.get(i17) != null) {
                        this.f12235m.add(this.f12236n.get(i17));
                        this.f12235m.add(this.f12236n.get(i14));
                    }
                }
            }
            i14++;
        }
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            if (this.f12226d.get(size3).f0()) {
                this.f12236n.remove(size3);
                this.f12226d.remove(size3);
            }
        }
    }
}
