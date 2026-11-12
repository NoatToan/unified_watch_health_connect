package com.garmin.android.apps.connectmobile.workouts.presentation.benchmark;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import b.u;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.workouts.data.model.l;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkExerciseDetailsFragment;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder.BenchmarkExerciseOneRepMaxView;
import fw.p;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p005kotlin.math.MathKt;
import ps.z1;
import qs.y;
import r22.c1;
import r22.o0;
import s52.j;
import s52.k;
import s52.m;
import s52.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseDetailsFragment;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "b", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BenchmarkExerciseDetailsFragment extends m0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f48362v = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f48363h = new w1(s0.f105811a.b(s52.h.class), new g(this), new i(this), new h(null, this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BenchmarkExerciseOneRepMaxView f48364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e32.g f48365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f48366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ComposeView f48367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f48368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f48369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Double f48370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.workouts.data.model.b f48371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.workouts.data.model.b f48372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f.c<n> f48373r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f48374t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseDetailsFragment$b;", "Lr22/c1;", "Landroid/content/res/Resources;", "resources", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseDetailsFragment;Landroid/content/res/Resources;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends c1 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int f48375i = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ BenchmarkExerciseDetailsFragment f48376h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment, Resources resources) {
            super(resources, resources.getColor(R.color.gcm_surface_danger_action, null), R.string.lbl_remove, resources.getColor(R.color.palette_white_alpha_5, null), R.dimen.andfont_body_1);
            resources.getClass();
            this.f48376h = benchmarkExerciseDetailsFragment;
        }

        @Override // r22.c1, androidx.recyclerview.widget.s.d
        public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            recyclerView.getClass();
            f0Var.getClass();
            if (p(f0Var)) {
                return s.d.k(0, 4);
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.s.d
        public final void o(int i14, RecyclerView.f0 f0Var) {
            f0Var.getClass();
            if (i14 == 4) {
                BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment = this.f48376h;
                final rk0.g gVar = new rk0.g(18, f0Var, benchmarkExerciseDetailsFragment);
                int i15 = BenchmarkExerciseDetailsFragment.f48362v;
                benchmarkExerciseDetailsFragment.getClass();
                o0.a aVar = o0.f149771c;
                String string = benchmarkExerciseDetailsFragment.getString(R.string.lbl_remove_exercise);
                String string2 = benchmarkExerciseDetailsFragment.getString(R.string.msg_remove_exercise_from_benchmark);
                final int i16 = 0;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: s52.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i17 = i16;
                        rk0.g gVar2 = gVar;
                        switch (i17) {
                            case 0:
                                int i18 = BenchmarkExerciseDetailsFragment.f48362v;
                                gVar2.invoke(Boolean.TRUE);
                                break;
                            default:
                                int i19 = BenchmarkExerciseDetailsFragment.f48362v;
                                gVar2.invoke(Boolean.FALSE);
                                break;
                        }
                    }
                };
                final int i17 = 1;
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: s52.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i18 = i17;
                        rk0.g gVar2 = gVar;
                        switch (i18) {
                            case 0:
                                int i19 = BenchmarkExerciseDetailsFragment.f48362v;
                                gVar2.invoke(Boolean.TRUE);
                                break;
                            default:
                                int i110 = BenchmarkExerciseDetailsFragment.f48362v;
                                gVar2.invoke(Boolean.FALSE);
                                break;
                        }
                    }
                };
                aVar.getClass();
                o0.a.a(string, string2, R.string.lbl_remove, onClickListener, R.string.lbl_cancel, onClickListener2).u6(benchmarkExerciseDetailsFragment);
            }
        }

        @Override // r22.c1
        public final boolean p(RecyclerView.f0 f0Var) {
            f0Var.getClass();
            if (this.f48376h.f48366k != null) {
                return f0Var.getBindingAdapterPosition() > 0;
            }
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseDetailsFragment$c", "Landroidx/core/view/s;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements androidx.core.view.s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            Bundle arguments = BenchmarkExerciseDetailsFragment.this.getArguments();
            if (arguments != null ? arguments.getBoolean("SHOW_RESET_OPTION") : true) {
                MenuItem menuItemAdd = menu.add(0, 2, 0, R.string.lbl_reset_benchmark);
                if (menuItemAdd != null) {
                    menuItemAdd.setShowAsActionFlags(0);
                    return;
                }
                return;
            }
            MenuItem menuItemAdd2 = menu.add(0, 1, 0, R.string.lbl_save);
            if (menuItemAdd2 != null) {
                menuItemAdd2.setShowAsActionFlags(2);
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment = BenchmarkExerciseDetailsFragment.this;
            int i14 = 1;
            if (itemId == 1) {
                BenchmarkExerciseDetailsFragment.I6(benchmarkExerciseDetailsFragment);
                benchmarkExerciseDetailsFragment.f48374t.f(false);
                androidx.fragment.app.m activity = benchmarkExerciseDetailsFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return true;
            }
            if (itemId != 2) {
                return false;
            }
            s52.c cVar = new s52.c(benchmarkExerciseDetailsFragment, i14);
            int i15 = BenchmarkExerciseDetailsFragment.f48362v;
            benchmarkExerciseDetailsFragment.getClass();
            o0.a aVar = o0.f149771c;
            String string = benchmarkExerciseDetailsFragment.getString(R.string.lbl_reset_benchmark_question);
            String string2 = benchmarkExerciseDetailsFragment.getString(R.string.msg_reset_benchmark_description);
            oq.a aVar2 = new oq.a(cVar, 21);
            aVar.getClass();
            o0.a.a(string, string2, R.string.lbl_common_continue, aVar2, R.string.common_cancel, null).u6(benchmarkExerciseDetailsFragment);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseDetailsFragment$d", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/viewbinder/BenchmarkExerciseOneRepMaxView$a;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements BenchmarkExerciseOneRepMaxView.a {
        public d() {
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder.BenchmarkExerciseOneRepMaxView.a
        public final void a(int i14, Double d14, Double d15) {
            BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment = BenchmarkExerciseDetailsFragment.this;
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = benchmarkExerciseDetailsFragment.f48372q;
            if (bVar != null) {
                bVar.y(Integer.valueOf(i14));
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar2 = benchmarkExerciseDetailsFragment.f48372q;
            if (bVar2 != null) {
                bVar2.t(d14);
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar3 = benchmarkExerciseDetailsFragment.f48372q;
            if (bVar3 != null) {
                bVar3.u(d15);
            }
            benchmarkExerciseDetailsFragment.S6();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001¨\u0006\u0005"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseDetailsFragment$e", "Le32/e;", "Lfw/m;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends e32.e<fw.m<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.b>>> {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48380a;

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
                f48380a = iArr;
            }
        }

        public e() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // e32.e
        public final void a(fw.m<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.b>> mVar) {
            fw.m<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.b>> mVar2 = mVar;
            int i14 = a.f48380a[mVar2.f73769b.ordinal()];
            BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment = BenchmarkExerciseDetailsFragment.this;
            if (i14 == 1) {
                benchmarkExerciseDetailsFragment.H6(true);
                return;
            }
            if (i14 == 2) {
                benchmarkExerciseDetailsFragment.y6(true);
                g22.e.a(benchmarkExerciseDetailsFragment, mVar2.f73771d);
                benchmarkExerciseDetailsFragment.f48374t.f(false);
                androidx.fragment.app.m activity = benchmarkExerciseDetailsFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    return;
                }
                return;
            }
            if (i14 != 3) {
                u0.r();
                return;
            }
            benchmarkExerciseDetailsFragment.y6(true);
            List list = (List) mVar2.f73770c;
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = null;
            Object obj = null;
            if (list != null) {
                for (Object obj2 : list) {
                    if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.workouts.data.model.b) obj2).getBenchmarkKey(), benchmarkExerciseDetailsFragment.f48369n)) {
                        obj = obj2;
                        break;
                    }
                }
                bVar = (com.garmin.android.apps.connectmobile.workouts.data.model.b) obj;
            }
            benchmarkExerciseDetailsFragment.M6(bVar, benchmarkExerciseDetailsFragment.K6().f157415f);
            benchmarkExerciseDetailsFragment.U6();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseDetailsFragment$f", "Lb/s;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends b.s {
        public f() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            f(false);
            BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment = BenchmarkExerciseDetailsFragment.this;
            BenchmarkExerciseDetailsFragment.I6(benchmarkExerciseDetailsFragment);
            androidx.fragment.app.m activity = benchmarkExerciseDetailsFragment.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f48382a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f48382a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48382a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f48384b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, Fragment fragment) {
            super(0);
            this.f48383a = aVar;
            this.f48384b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48383a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48384b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f48385a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f48385a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48385a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    public BenchmarkExerciseDetailsFragment() {
        f.c<n> cVarRegisterForActivityResult = registerForActivityResult(((o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null)).H(), new jp.a(this, 28));
        cVarRegisterForActivityResult.getClass();
        this.f48373r = cVarRegisterForActivityResult;
        this.f48374t = new f();
    }

    public static final void I6(BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment) {
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = benchmarkExerciseDetailsFragment.f48372q;
        if (bVar != null) {
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar2 = benchmarkExerciseDetailsFragment.f48371p;
            if (bVar.m() != null) {
                if (p005kotlin.jvm.internal.s.d(bVar.m(), bVar2 != null ? bVar2.m() : null)) {
                    if (p005kotlin.jvm.internal.s.g(bVar.getReps(), bVar2 != null ? bVar2.getReps() : null)) {
                        if (p005kotlin.jvm.internal.s.d(bVar.k(), bVar2 != null ? bVar2.k() : null)) {
                            if (p005kotlin.jvm.internal.s.g(bVar.j(), bVar2 != null ? bVar2.j() : null)) {
                                return;
                            }
                        }
                    }
                }
                Long l14 = bVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                if (l14 == null) {
                    s52.h hVarK6 = benchmarkExerciseDetailsFragment.K6();
                    hVarK6.f157412c = ge1.b.T(v1.a(hVarK6), null, null, new j(hVarK6, bVar, null), 3);
                } else {
                    s52.h hVarK7 = benchmarkExerciseDetailsFragment.K6();
                    hVarK7.f157412c = ge1.b.T(v1.a(hVarK7), null, null, new k(hVarK7, l14.longValue(), bVar, null), 3);
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
    }

    public final com.garmin.android.apps.connectmobile.workouts.data.model.b J6() {
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = this.f48371p;
        if (bVar == null) {
            return new com.garmin.android.apps.connectmobile.workouts.data.model.b(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }
        List<l> listJ = bVar.j();
        return com.garmin.android.apps.connectmobile.workouts.data.model.b.d(bVar, listJ != null ? new ArrayList(listJ) : null);
    }

    public final s52.h K6() {
        return (s52.h) this.f48363h.getValue();
    }

    public final void M6(com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, com.garmin.android.apps.connectmobile.repcounting.model.c cVar) {
        this.f48371p = bVar;
        this.f48368m = cVar;
        boolean z14 = am.j.z(f12.l.f68084a);
        this.f48372q = J6();
        Double d14 = this.f48370o;
        if (d14 != null) {
            double dDoubleValue = d14.doubleValue();
            if (!z14) {
                l3.f23124b.getClass();
                dDoubleValue = ((double) MathKt.b((dDoubleValue * 2.20462d) * 10.0d)) / 10.0d;
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar2 = this.f48372q;
            if (bVar2 != null) {
                bVar2.z(new z1((Double) null, (Integer) null, (z14 ? y.UNIT_WEIGHT_KILOGRAM : y.UNIT_WEIGHT_POUND).f147239a, 3, (p005kotlin.jvm.internal.j) null));
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar3 = this.f48372q;
            if (bVar3 != null) {
                bVar3.y(1);
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar4 = this.f48372q;
            if (bVar4 != null) {
                bVar4.t(Double.valueOf(dDoubleValue));
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar5 = this.f48372q;
            if (bVar5 != null) {
                bVar5.u(Double.valueOf(dDoubleValue));
            }
        }
    }

    public final void S6() {
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = this.f48372q;
        boolean z14 = (bVar != null ? bVar.m() : null) != null;
        m mVar = this.f48366k;
        if (mVar == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        mVar.f157451c = z14;
        mVar.notifyDataSetChanged();
        ComposeView composeView = this.f48367l;
        if (composeView != null) {
            composeView.setContent(new z3.e(1348100966, true, new s52.a(z14, this, 0)));
        }
    }

    public final void T6() {
        m mVar = this.f48366k;
        if (mVar == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        mVar.f157452d = this.f48368m;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = this.f48372q;
        List<l> listJ = bVar != null ? bVar.j() : null;
        ArrayList arrayList = mVar.f157453e;
        arrayList.clear();
        if (listJ != null) {
            arrayList.addAll(listJ);
        }
        mVar.notifyDataSetChanged();
    }

    public final void U6() {
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            activity.setTitle(new k52.a(new l22.a(contextRequireContext)).c(this.f48372q));
        }
        BenchmarkExerciseOneRepMaxView benchmarkExerciseOneRepMaxView = this.f48364i;
        if (benchmarkExerciseOneRepMaxView == null) {
            p005kotlin.jvm.internal.s.m("oneRepMaxView");
            throw null;
        }
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = this.f48372q;
        Integer reps = bVar != null ? bVar.getReps() : null;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar2 = this.f48372q;
        benchmarkExerciseOneRepMaxView.a(bVar2 != null ? bVar2.k() : null, reps);
        T6();
        S6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar;
        u onBackPressedDispatcher;
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("BENCHMARK_EXERCISE_EXTRA", com.garmin.android.apps.connectmobile.workouts.data.model.b.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("BENCHMARK_EXERCISE_EXTRA");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.b)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.workouts.data.model.b) parcelable2;
            }
            bVar = (com.garmin.android.apps.connectmobile.workouts.data.model.b) parcelable;
        } else {
            bVar = null;
        }
        M6(bVar, K6().f157415f);
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar2 = this.f48371p;
        f fVar = this.f48374t;
        if (bVar2 == null || this.f48368m == null) {
            Bundle arguments2 = getArguments();
            this.f48369n = arguments2 != null ? arguments2.getString("BENCHMARK_KEY_EXTRA") : null;
            Bundle arguments3 = getArguments();
            this.f48370o = arguments3 != null ? Double.valueOf(arguments3.getDouble("PR_ONE_REP_MAX_EXTRA")) : null;
            String str = this.f48369n;
            if (str == null || str.length() == 0) {
                g22.e.a(this, new fw.g());
                fVar.f(false);
                androidx.fragment.app.m activity = getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }
        androidx.fragment.app.m activity2 = getActivity();
        if (activity2 == null || (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.a(fVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm_benchmark_detail_fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        F6(false);
        View viewFindViewById = view2.findViewById(R.id.one_rep_max);
        ((BenchmarkExerciseOneRepMaxView) viewFindViewById).setOnValuesChangedListener(new d());
        viewFindViewById.getClass();
        this.f48364i = (BenchmarkExerciseOneRepMaxView) viewFindViewById;
        TextView textView = (TextView) view2.findViewById(R.id.benchmark_detail_help_link);
        String string = getString(xx0.a.EnumC3592a.AMERICAN_ACADEMY_OF_FAMILY_PHYSICIANS.getId());
        string.getClass();
        v22.e.m(textView, string, "https://familydoctor.org/weight-training-and-weight-lifting-safety/");
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f48366k = new m(contextRequireContext);
        e32.g gVar = new e32.g(null, view2, null);
        m mVar = this.f48366k;
        if (mVar == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        gVar.a(mVar);
        this.f48365j = gVar;
        Resources resources = getResources();
        resources.getClass();
        s sVar = new s(new b(this, resources));
        e32.g gVar2 = this.f48365j;
        if (gVar2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerHolder");
            throw null;
        }
        sVar.e(gVar2.f62782a);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.add_exercise);
        this.f48367l = composeView;
        if (composeView != null) {
            composeView.setContent(new z3.e(1348100966, true, new s52.a(true, this, 0)));
        }
        if (this.f48371p != null && this.f48368m != null) {
            U6();
        } else {
            K6().z4();
            K6().f157414e.f(getViewLifecycleOwner(), new e());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseDetailsFragment$a;", "", "<init>", "()V", "", "BENCHMARK_EXERCISE_EXTRA", "Ljava/lang/String;", "BENCHMARK_KEY_EXTRA", "PR_ONE_REP_MAX_EXTRA", "SHOW_RESET_OPTION", "", "MENU_ITEM_SAVE_BENCHMARK", "I", "MENU_ITEM_RESET_BENCHMARK", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
