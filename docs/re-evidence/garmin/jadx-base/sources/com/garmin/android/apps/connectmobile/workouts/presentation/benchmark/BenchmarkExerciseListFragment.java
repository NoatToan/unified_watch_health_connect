package com.garmin.android.apps.connectmobile.workouts.presentation.benchmark;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.m0;
import e32.g;
import fw.m;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.y;
import ro0.l;
import s5.e0;
import s52.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseListFragment;", "Lcom/garmin/android/apps/connectmobile/m0;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/a$b;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BenchmarkExerciseListFragment extends m0 implements com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.a.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f48386l = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.a f48388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MenuItem f48389j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f48387h = new w1(s0.f105811a.b(h.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f48390k = new b();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001¨\u0006\u0005"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseListFragment$b", "Le32/e;", "Lfw/m;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends e32.e<m<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.b>>> {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48392a;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f48392a = iArr;
            }
        }

        public b() {
        }

        @Override // e32.e
        public final void a(m<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.b>> mVar) {
            m<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.b>> mVar2 = mVar;
            T t7 = mVar2.f73770c;
            int i14 = a.f48392a[mVar2.f73769b.ordinal()];
            BenchmarkExerciseListFragment benchmarkExerciseListFragment = BenchmarkExerciseListFragment.this;
            if (i14 == 1) {
                benchmarkExerciseListFragment.G6();
                List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list = (List) t7;
                if (list != null) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.a aVar = benchmarkExerciseListFragment.f48388i;
                    if (aVar != null) {
                        aVar.A(list);
                        return;
                    } else {
                        s.m("summaryAdapter");
                        throw null;
                    }
                }
                return;
            }
            if (i14 == 2) {
                MenuItem menuItem = benchmarkExerciseListFragment.f48389j;
                if (menuItem != null) {
                    menuItem.setVisible(true);
                }
                benchmarkExerciseListFragment.w6();
                g22.e.a(benchmarkExerciseListFragment, mVar2.f73771d);
                return;
            }
            if (i14 != 3) {
                u0.r();
                return;
            }
            MenuItem menuItem2 = benchmarkExerciseListFragment.f48389j;
            if (menuItem2 != null) {
                menuItem2.setVisible(true);
            }
            benchmarkExerciseListFragment.w6();
            com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.a aVar2 = benchmarkExerciseListFragment.f48388i;
            if (aVar2 != null) {
                aVar2.A((List) t7);
            } else {
                s.m("summaryAdapter");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseListFragment$c", "Landroidx/core/view/s;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements androidx.core.view.s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            BenchmarkExerciseListFragment benchmarkExerciseListFragment = BenchmarkExerciseListFragment.this;
            boolean z14 = benchmarkExerciseListFragment.f48389j != null;
            MenuItem menuItemAdd = menu.add(0, 100, 0, R.string.lbl_help);
            benchmarkExerciseListFragment.f48389j = menuItemAdd;
            if (menuItemAdd != null) {
                menuItemAdd.setShowAsActionFlags(1);
            }
            MenuItem menuItem = benchmarkExerciseListFragment.f48389j;
            if (menuItem != null) {
                menuItem.setVisible(z14);
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != 100) {
                return false;
            }
            Bundle bundle = new Bundle();
            int i14 = BenchmarkExerciseListFragment.f48386l;
            BenchmarkExerciseListFragment benchmarkExerciseListFragment = BenchmarkExerciseListFragment.this;
            List<com.garmin.android.apps.connectmobile.workouts.data.model.b> listA4 = ((h) benchmarkExerciseListFragment.f48387h.getValue()).A4();
            if (listA4 != null && (!listA4.isEmpty())) {
                Context contextRequireContext = benchmarkExerciseListFragment.requireContext();
                contextRequireContext.getClass();
                k52.a aVar = new k52.a(new l22.a(contextRequireContext));
                ArrayList arrayList = new ArrayList(y.r(listA4, 10));
                Iterator<T> it = listA4.iterator();
                while (it.hasNext()) {
                    arrayList.add(aVar.c((com.garmin.android.apps.connectmobile.workouts.data.model.b) it.next()));
                }
                bundle.putStringArrayList("EXTRA_BENCHMARKS", new ArrayList<>(h0.M0(arrayList)));
            }
            HelpActivity.a.e(HelpActivity.f36653a, benchmarkExerciseListFragment.getContext(), l.BENCHMARK_EXERCISE, null, bundle, 4);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f48394a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f48394a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48394a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f48396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f48395a = aVar;
            this.f48396b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48395a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48396b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f48397a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f48397a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48397a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        ((h) this.f48387h.getValue()).z4();
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.a.b
    public final void U4(com.garmin.android.apps.connectmobile.workouts.data.model.b bVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BENCHMARK_EXERCISE_EXTRA", bVar);
        bundle.putBoolean("SHOW_RESET_OPTION", true);
        NavHostFragment.f10124e.getClass();
        NavHostFragment.a.a(this).g(R.id.action_benchmarkExerciseListFragment_to_benchmarkExerciseDetailsFragment, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((h) this.f48387h.getValue()).z4();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm_benchmark_list_fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f48388i = new com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.a(contextRequireContext, this);
        g gVar = new g(this, view2, null);
        com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.a aVar = this.f48388i;
        if (aVar == null) {
            s.m("summaryAdapter");
            throw null;
        }
        gVar.a(aVar);
        TextView textView = (TextView) view2.findViewById(R.id.benchmark_list_fragment_title);
        String string = getString(R.string.msg_benchmark_exercises_description);
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        textView.setContentDescription(oi0.c.A(contextRequireContext2, new e0(11), string));
        ((h) this.f48387h.getValue()).f157414e.f(getViewLifecycleOwner(), this.f48390k);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseListFragment$a;", "", "<init>", "()V", "", "MENU_ITEM_ITEM_HELP", "I", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
