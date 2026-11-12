package com.garmin.android.apps.connectmobile.activities.stats.exercises;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import g22.p;
import hq.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k32.v;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.u;
import r22.m1;
import r22.n1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "d", "c", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f29861g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n1<m1> f29863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f29864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f29865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29866e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f29862a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.activities.stats.exercises.c.class), new f(this), new h(this), new g(null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f29867f = new e();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.stats.exercises.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/b$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0458b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f29868b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f29869a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0458b(View view2) {
            super(view2);
            view2.getClass();
            this.f29869a = new v(view2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/b$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f29878a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.section_header_title);
            viewFindViewById.getClass();
            this.f29878a = (TextView) viewFindViewById;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/stats/exercises/b$e", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/b$c$b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements c.InterfaceC0459b {
        public e() {
        }

        @Override // com.garmin.android.apps.connectmobile.activities.stats.exercises.b.c.InterfaceC0459b
        public final void a(com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
            ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).o0(dVar);
            Intent intent = new Intent();
            intent.putExtra("RESULT_SELECTED_EXERCISE", dVar);
            b bVar = b.this;
            m activity = bVar.getActivity();
            if (activity != null) {
                activity.setResult(-1, intent);
            }
            m activity2 = bVar.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f29880a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f29880a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29880a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f29882b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f29881a = aVar;
            this.f29882b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29881a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29882b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f29883a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f29883a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29883a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f29866e = arguments != null ? arguments.getBoolean("RECENT_EXERCISES") : false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_simple_recycler_view_layout, viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x0109  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr2;
        String string;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF;
        String string2;
        e eVar;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr3;
        c cVar;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr4;
        c cVar2;
        n1<m1> n1Var;
        c cVar3;
        n1<m1> n1Var2;
        c cVar4;
        e32.g gVar;
        n1<m1> n1Var3;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF2;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF3;
        view2.getClass();
        w1 w1Var = this.f29862a;
        ArrayList arrayList = ((com.garmin.android.apps.connectmobile.activities.stats.exercises.c) w1Var.getValue()).f29899p;
        if (!this.f29866e) {
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar5 = ((com.garmin.android.apps.connectmobile.activities.stats.exercises.c) w1Var.getValue()).f29896m;
            dVarArr = (cVar5 == null || (dVarArrF3 = cVar5.F()) == null) ? null : (com.garmin.android.apps.connectmobile.repcounting.model.d[]) u.X(dVarArrF3);
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar6 = ((com.garmin.android.apps.connectmobile.activities.stats.exercises.c) w1Var.getValue()).f29897n;
            dVarArr2 = (cVar6 == null || (dVarArrF2 = cVar6.F()) == null) ? null : (com.garmin.android.apps.connectmobile.repcounting.model.d[]) u.X(dVarArrF2);
            if (dVarArr2 != null) {
                string = getString(R.string.common_all);
                string2 = getString(R.string.common_suggested);
            } else {
                string = null;
            }
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            eVar = this.f29867f;
            c cVar7 = new c(contextRequireContext, string2, eVar);
            this.f29864c = cVar7;
            cVar7.f29873d = dVarArr2;
            if (dVarArr2 != null) {
                dVarArr3 = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) Arrays.copyOf(dVarArr2, dVarArr2.length);
            } else {
                dVarArr3 = null;
            }
            cVar7.f29874e = dVarArr3;
            cVar = this.f29864c;
            if (cVar != null) {
                s.m("suggestedExercisesAdapterSection");
                throw null;
            }
            cVar.f29875f = arrayList;
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            c cVar8 = new c(contextRequireContext2, string, eVar);
            this.f29865d = cVar8;
            cVar8.f29873d = dVarArr;
            if (dVarArr != null) {
                dVarArr4 = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) Arrays.copyOf(dVarArr, dVarArr.length);
            } else {
                dVarArr4 = null;
            }
            cVar8.f29874e = dVarArr4;
            cVar2 = this.f29865d;
            if (cVar2 != null) {
                s.m("exercisesAdapterSection");
                throw null;
            }
            cVar2.f29875f = arrayList;
            n1Var = new n1<>();
            this.f29863b = n1Var;
            cVar3 = this.f29864c;
            if (cVar3 != null) {
                s.m("suggestedExercisesAdapterSection");
                throw null;
            }
            n1Var.f149766a.add(cVar3);
            n1Var2 = this.f29863b;
            if (n1Var2 != null) {
                s.m("exercisesAdapter");
                throw null;
            }
            cVar4 = this.f29865d;
            if (cVar4 != null) {
                s.m("exercisesAdapterSection");
                throw null;
            }
            n1Var2.f149766a.add(cVar4);
            gVar = new e32.g(null, view2, null);
            n1Var3 = this.f29863b;
            if (n1Var3 != null) {
                s.m("exercisesAdapter");
                throw null;
            }
            RecyclerView recyclerView = gVar.f62782a;
            recyclerView.setAdapter(n1Var3);
            p.a(recyclerView, n1Var3);
        }
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar9 = ((com.garmin.android.apps.connectmobile.activities.stats.exercises.c) w1Var.getValue()).f29898o;
        dVarArr = (cVar9 == null || (dVarArrF = cVar9.F()) == null) ? null : (com.garmin.android.apps.connectmobile.repcounting.model.d[]) u.X(dVarArrF);
        dVarArr2 = null;
        string = null;
        string2 = string;
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        eVar = this.f29867f;
        c cVar10 = new c(contextRequireContext3, string2, eVar);
        this.f29864c = cVar10;
        cVar10.f29873d = dVarArr2;
        if (dVarArr2 != null) {
            dVarArr3 = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) Arrays.copyOf(dVarArr2, dVarArr2.length);
        } else {
            dVarArr3 = null;
        }
        cVar10.f29874e = dVarArr3;
        cVar = this.f29864c;
        if (cVar != null) {
            s.m("suggestedExercisesAdapterSection");
            throw null;
        }
        cVar.f29875f = arrayList;
        Context contextRequireContext4 = requireContext();
        contextRequireContext4.getClass();
        c cVar11 = new c(contextRequireContext4, string, eVar);
        this.f29865d = cVar11;
        cVar11.f29873d = dVarArr;
        if (dVarArr != null) {
            dVarArr4 = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) Arrays.copyOf(dVarArr, dVarArr.length);
        } else {
            dVarArr4 = null;
        }
        cVar11.f29874e = dVarArr4;
        cVar2 = this.f29865d;
        if (cVar2 != null) {
            s.m("exercisesAdapterSection");
            throw null;
        }
        cVar2.f29875f = arrayList;
        n1Var = new n1<>();
        this.f29863b = n1Var;
        cVar3 = this.f29864c;
        if (cVar3 != null) {
            s.m("suggestedExercisesAdapterSection");
            throw null;
        }
        n1Var.f149766a.add(cVar3);
        n1Var2 = this.f29863b;
        if (n1Var2 != null) {
            s.m("exercisesAdapter");
            throw null;
        }
        cVar4 = this.f29865d;
        if (cVar4 != null) {
            s.m("exercisesAdapterSection");
            throw null;
        }
        n1Var2.f149766a.add(cVar4);
        gVar = new e32.g(null, view2, null);
        n1Var3 = this.f29863b;
        if (n1Var3 != null) {
            s.m("exercisesAdapter");
            throw null;
        }
        RecyclerView recyclerView2 = gVar.f62782a;
        recyclerView2.setAdapter(n1Var3);
        p.a(recyclerView2, n1Var3);
    }

    public final void u6(String str) {
        c cVar = this.f29864c;
        if (cVar == null) {
            s.m("suggestedExercisesAdapterSection");
            throw null;
        }
        final int i14 = 0;
        cVar.new C0460c().filter(str, new Filter.FilterListener(this) { // from class: hq.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.stats.exercises.b f85114b;

            {
                this.f85114b = this;
            }

            @Override // android.widget.Filter.FilterListener
            public final void onFilterComplete(int i15) {
                switch (i14) {
                    case 0:
                        n1<m1> n1Var = this.f85114b.f29863b;
                        if (n1Var != null) {
                            n1Var.notifyDataSetChanged();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("exercisesAdapter");
                            throw null;
                        }
                    default:
                        n1<m1> n1Var2 = this.f85114b.f29863b;
                        if (n1Var2 != null) {
                            n1Var2.notifyDataSetChanged();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("exercisesAdapter");
                            throw null;
                        }
                }
            }
        });
        c cVar2 = this.f29865d;
        if (cVar2 == null) {
            s.m("exercisesAdapterSection");
            throw null;
        }
        final int i15 = 1;
        cVar2.new C0460c().filter(str, new Filter.FilterListener(this) { // from class: hq.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.stats.exercises.b f85114b;

            {
                this.f85114b = this;
            }

            @Override // android.widget.Filter.FilterListener
            public final void onFilterComplete(int i16) {
                switch (i15) {
                    case 0:
                        n1<m1> n1Var = this.f85114b.f29863b;
                        if (n1Var != null) {
                            n1Var.notifyDataSetChanged();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("exercisesAdapter");
                            throw null;
                        }
                    default:
                        n1<m1> n1Var2 = this.f85114b.f29863b;
                        if (n1Var2 != null) {
                            n1Var2.notifyDataSetChanged();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("exercisesAdapter");
                            throw null;
                        }
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/b$c;", "Lr22/m1;", "Landroid/widget/Filterable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "headerText", "Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/b$c$b;", "onItemClickListener", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/b$c$b;)V", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements m1, Filterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f29870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC0459b f29872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public com.garmin.android.apps.connectmobile.repcounting.model.d[] f29873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.garmin.android.apps.connectmobile.repcounting.model.d[] f29874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<? extends com.garmin.android.apps.connectmobile.repcounting.model.a> f29875f;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.stats.exercises.b$c$b, reason: collision with other inner class name */
        public interface InterfaceC0459b {
            void a(com.garmin.android.apps.connectmobile.repcounting.model.d dVar);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.stats.exercises.b$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/stats/exercises/b$c$c", "Landroid/widget/Filter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0460c extends Filter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int f29876b = 0;

            public C0460c() {
            }

            @Override // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence) {
                Filter.FilterResults filterResults = new Filter.FilterResults();
                c cVar = c.this;
                com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr = cVar.f29873d;
                List listI0 = dVarArr != null ? u.i0(dVarArr) : null;
                if (listI0 != null) {
                    List listF = zf.b.f(listI0, String.valueOf(charSequence), true, new f0(9));
                    filterResults.values = listF.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                    filterResults.count = listF.size();
                    return filterResults;
                }
                com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr2 = cVar.f29874e;
                filterResults.values = dVarArr2;
                filterResults.count = dVarArr2 != null ? dVarArr2.length : 0;
                return filterResults;
            }

            @Override // android.widget.Filter
            public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                c.this.f29874e = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) (filterResults != null ? filterResults.values : null);
            }
        }

        static {
            new a(null);
        }

        public c(Context context, String str, InterfaceC0459b interfaceC0459b) {
            context.getClass();
            interfaceC0459b.getClass();
            this.f29870a = context;
            this.f29871b = str;
            this.f29872c = interfaceC0459b;
        }

        @Override // r22.m1
        public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
            Context context = this.f29870a;
            if (i14 == 0) {
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_header_list_view_section_3_0, viewGroup, false);
                viewInflate.getClass();
                return new d(viewInflate);
            }
            View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.gcm_two_row_label_list_item, viewGroup, false);
            viewInflate2.getClass();
            return new C0458b(viewInflate2);
        }

        @Override // r22.m1
        public final void b(RecyclerView.f0 f0Var, int i14) {
            com.garmin.android.apps.connectmobile.repcounting.model.d dVar;
            com.garmin.android.apps.connectmobile.repcounting.model.a aVar;
            Object next;
            com.garmin.android.apps.connectmobile.repcounting.model.d dVar2;
            boolean z14 = f0Var instanceof C0458b;
            String str = this.f29871b;
            if (!z14) {
                if (f0Var instanceof d) {
                    ((d) f0Var).f29878a.setText(str);
                    return;
                }
                return;
            }
            if (str != null && str.length() > 0 && i14 > 0) {
                i14--;
            }
            com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr = this.f29874e;
            if (dVarArr == null || (dVar = dVarArr[i14]) == null) {
                dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
            }
            List<? extends com.garmin.android.apps.connectmobile.repcounting.model.a> list = this.f29875f;
            if (list != null) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        dVar2 = ((com.garmin.android.apps.connectmobile.repcounting.model.a) next).f41091a;
                    }
                } while (!zf.b.E(dVar2.f41102a, dVar2.f41106e, dVar.f41102a, dVar.f41106e));
                aVar = (com.garmin.android.apps.connectmobile.repcounting.model.a) next;
            } else {
                aVar = null;
            }
            C0458b c0458b = (C0458b) f0Var;
            v vVar = c0458b.f29869a;
            TextView textView = vVar.f102745b;
            TextView textView2 = vVar.f102746c;
            textView.setText(dVar.f41107f);
            TextView textView3 = vVar.f102745b;
            if (aVar == null) {
                textView3.setTextAppearance(R.style.Text_Body1_Primary);
                v22.e.j(textView2);
                c0458b.itemView.setClickable(true);
                c0458b.itemView.setOnClickListener(new cw2.b(26, this.f29872c, dVar));
                return;
            }
            textView3.setTextAppearance(R.style.Text_Body1_Secondary);
            String strB = aVar.b(this.f29870a);
            if (strB == null || strB.length() <= 0) {
                v22.e.j(textView2);
            } else {
                textView2.setText(strB);
                textView2.setTextAppearance(R.style.Text_Label_Medium_Secondary);
                textView2.setVisibility(0);
            }
            c0458b.itemView.setClickable(false);
            c0458b.itemView.setOnClickListener(null);
        }

        @Override // android.widget.Filterable
        public final Filter getFilter() {
            return new C0460c();
        }

        @Override // r22.m1
        public final int getItemCount() {
            String str;
            com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr = this.f29874e;
            int length = dVarArr != null ? dVarArr.length : 0;
            return (length <= 0 || (str = this.f29871b) == null || str.length() <= 0) ? length : length + 1;
        }

        @Override // r22.m1
        public final int getItemViewType(int i14) {
            String str;
            return (i14 != 0 || (str = this.f29871b) == null || str.length() <= 0) ? 1 : 0;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/b$c$a;", "", "<init>", "()V", "", "VIEW_TYPE_HEADER", "I", "VIEW_TYPE_ITEM", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/b$a;", "", "<init>", "()V", "", "ARG_RECENT_EXERCISES", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
