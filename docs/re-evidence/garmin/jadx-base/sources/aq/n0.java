package aq;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.NewSelectExerciseActivity;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Laq/n0;", "Landroidx/fragment/app/Fragment;", "Laq/c2;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 extends Fragment implements c2, KoinComponent {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f12063j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f12064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckBox f12065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f12066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f2 f12067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.w1 f12068e = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(EditExercisesMultiSelectViewModel.class), new j(this), new l(this), new k(null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12069f = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new m(this, null, null));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12070g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f12071h = new d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.c<Intent> f12072i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laq/n0$a;", "", "", "exerciseNameColumnWidth", "durationColumnWidth", "repsColumnWidth", "weightColumnWidth", "<init>", "(IIII)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f12076d;

        public a(int i14, int i15, int i16, int i17) {
            this.f12073a = i14;
            this.f12074b = i15;
            this.f12075c = i16;
            this.f12076d = i17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12073a == aVar.f12073a && this.f12074b == aVar.f12074b && this.f12075c == aVar.f12075c && this.f12076d == aVar.f12076d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12076d) + r1.q2.d(this.f12075c, r1.q2.d(this.f12074b, Integer.hashCode(this.f12073a) * 31, 31), 31);
        }

        public final String toString() {
            return androidx.core.view.j.e(this.f12075c, this.f12076d, ", weightColumnWidth=", ")", e5.j(this.f12073a, this.f12074b, "ColumnWidthData(exerciseNameColumnWidth=", ", durationColumnWidth=", ", repsColumnWidth="));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectFragment$durationOnEdited$1", f = "EditExercisesMultiSelectFragment.kt", l = {254}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12077a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f12079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f12080d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i14, int i15, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f12079c = i14;
            this.f12080d = i15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n0.this.new c(this.f12079c, this.f12080d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f12077a;
            n0 n0Var = n0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = n0.f12063j;
                EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
                this.f12077a = 1;
                int i16 = EditExercisesMultiSelectViewModel.f29788p;
                if (editExercisesMultiSelectViewModelU6.F4(this.f12079c, this.f12080d, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            int i17 = n0.f12063j;
            n0Var.u6().y4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"aq/n0$d", "", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public d() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectFragment$onEditStarted$1", f = "EditExercisesMultiSelectFragment.kt", l = {285}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f12083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n0 f12084c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z14, n0 n0Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f12083b = z14;
            this.f12084c = n0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f12083b, this.f12084c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f12082a;
            if (i14 == 0) {
                o13.r.b(obj);
                boolean z14 = this.f12083b;
                n0 n0Var = this.f12084c;
                if (z14) {
                    RecyclerView recyclerView = n0Var.f12064a;
                    if (recyclerView == null) {
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    }
                    Iterator<View> it = new androidx.core.view.x0(recyclerView).iterator();
                    while (true) {
                        androidx.core.view.z0 z0Var = (androidx.core.view.z0) it;
                        if (!z0Var.hasNext()) {
                            break;
                        }
                        View view2 = (View) z0Var.next();
                        RecyclerView recyclerView2 = n0Var.f12064a;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        RecyclerView.f0 childViewHolder = recyclerView2.getChildViewHolder(view2);
                        f2.g gVar = childViewHolder instanceof f2.g ? (f2.g) childViewHolder : null;
                        if (gVar != null) {
                            gVar.f11957f.clearFocus();
                            gVar.f11959h.clearFocus();
                        }
                    }
                }
                int i15 = n0.f12063j;
                EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
                this.f12082a = 1;
                if (editExercisesMultiSelectViewModelU6.x4(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectFragment$onSelect$1", f = "EditExercisesMultiSelectFragment.kt", l = {245}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12085a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f12087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f12088d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i14, boolean z14, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f12087c = i14;
            this.f12088d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n0.this.new f(this.f12087c, this.f12088d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f12085a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = n0.f12063j;
                EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0.this.u6();
                boolean z14 = !this.f12088d;
                this.f12085a = 1;
                if (editExercisesMultiSelectViewModelU6.I4(this.f12087c, z14, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectFragment$repOnEdited$1", f = "EditExercisesMultiSelectFragment.kt", l = {261}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12089a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f12091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f12092d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i14, long j8, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f12091c = i14;
            this.f12092d = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n0.this.new g(this.f12091c, this.f12092d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f12089a;
            n0 n0Var = n0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = n0.f12063j;
                EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
                this.f12089a = 1;
                int i16 = EditExercisesMultiSelectViewModel.f29788p;
                if (editExercisesMultiSelectViewModelU6.H4(this.f12091c, this.f12092d, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            int i17 = n0.f12063j;
            n0Var.u6().y4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f12093a;

        public h(e23.l lVar) {
            lVar.getClass();
            this.f12093a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f12093a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12093a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectFragment$selectExerciseActivityLauncher$1$1", f = "EditExercisesMultiSelectFragment.kt", l = {94, 98}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n0 f12094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f.a f12096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n0 f12097d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f.a aVar, n0 n0Var, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f12096c = aVar;
            this.f12097d = n0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new i(this.f12096c, this.f12097d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            com.garmin.android.apps.connectmobile.repcounting.model.d dVar;
            n0 n0Var;
            n0 n0Var2;
            Parcelable parcelable;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f12095b;
            n0 n0Var3 = this.f12097d;
            if (i14 == 0) {
                o13.r.b(obj);
                Intent intent = this.f12096c.f67586b;
                if (intent != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) intent.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                    } else {
                        Parcelable parcelableExtra = intent.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                        if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.repcounting.model.d)) {
                            parcelableExtra = null;
                        }
                        parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelableExtra;
                    }
                    dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    int i15 = n0Var3.f12070g;
                    if (i15 == -2) {
                        EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var3.u6();
                        this.f12094a = n0Var3;
                        this.f12095b = 1;
                        com.garmin.android.apps.connectmobile.repcounting.model.e eVarP = gl.b.P(dVar);
                        eVarP.g0(new Double(0.0d));
                        eVarP.i0(new Long(-2L));
                        eVarP.n0(dVar.f41105d ? new Long(-1L) : new Long(-2L));
                        u0 u0Var = new u0(editExercisesMultiSelectViewModelU6.f29803o.size(), eVarP, false, editExercisesMultiSelectViewModelU6.f29803o.size() % 2 == 0 ? R.color.gcm_surface_2 : R.color.gcm_background, 4, null);
                        ArrayList arrayListD1 = p13.h0.d1(editExercisesMultiSelectViewModelU6.f29803o);
                        arrayListD1.add(u0Var);
                        editExercisesMultiSelectViewModelU6.f29803o = arrayListD1;
                        x53.c cVar = o53.s0.f129406a;
                        Object objE0 = ge1.b.e0(u53.o.f168762a, new v0(editExercisesMultiSelectViewModelU6, null), this);
                        if (objE0 != obj2) {
                            objE0 = Unit.INSTANCE;
                        }
                        if (objE0 != obj2) {
                            n0Var2 = n0Var3;
                            int i16 = n0.f12063j;
                            n0Var2.u6().y4();
                        }
                    } else if (i15 != -1) {
                        com.garmin.android.apps.connectmobile.repcounting.model.d dVar2 = dVar;
                        EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU7 = n0Var3.u6();
                        int i17 = n0Var3.f12070g;
                        this.f12094a = n0Var3;
                        this.f12095b = 2;
                        int i18 = EditExercisesMultiSelectViewModel.f29788p;
                        if (editExercisesMultiSelectViewModelU7.G4(i17, null, dVar2, true, this) != obj2) {
                            n0Var = n0Var3;
                            int i19 = n0.f12063j;
                            n0Var.u6().y4();
                        }
                    }
                    return obj2;
                }
            } else if (i14 == 1) {
                n0Var2 = this.f12094a;
                o13.r.b(obj);
                int i110 = n0.f12063j;
                n0Var2.u6().y4();
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n0Var = this.f12094a;
                o13.r.b(obj);
                int i111 = n0.f12063j;
                n0Var.u6().y4();
            }
            n0Var3.f12070g = -1;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f12098a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f12098a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f12098a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f12099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f12100b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e23.a aVar, Fragment fragment) {
            super(0);
            this.f12099a = aVar;
            this.f12100b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f12099a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12100b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class l extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f12101a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f12101a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f12101a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.a<am.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f12102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f12103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f12104c;

        public m(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f12102a = koinComponent;
            this.f12103b = qualifier;
            this.f12104c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [am.d, java.lang.Object] */
        @Override // e23.a
        public final am.d invoke() {
            KoinComponent koinComponent = this.f12102a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.d.class), this.f12103b, this.f12104c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectFragment$weightOnEdited$1", f = "EditExercisesMultiSelectFragment.kt", l = {268}, m = "invokeSuspend", v = 2)
    public static final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12105a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f12107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f12108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.d f12109e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i14, long j8, com.garmin.android.apps.connectmobile.repcounting.model.d dVar, t13.d<? super n> dVar2) {
            super(2, dVar2);
            this.f12107c = i14;
            this.f12108d = j8;
            this.f12109e = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n0.this.new n(this.f12107c, this.f12108d, this.f12109e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f12105a;
            n0 n0Var = n0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = n0.f12063j;
                EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
                Long l14 = new Long(this.f12108d);
                this.f12105a = 1;
                int i16 = EditExercisesMultiSelectViewModel.f29788p;
                if (editExercisesMultiSelectViewModelU6.G4(this.f12107c, l14, this.f12109e, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            int i17 = n0.f12063j;
            n0Var.u6().y4();
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public n0() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new a61.i(this, 3));
        cVarRegisterForActivityResult.getClass();
        this.f12072i = cVarRegisterForActivityResult;
    }

    @Override // aq.c2
    public final void J4(int i14, int i15) {
        ge1.b.T(g22.f.b(this), null, null, new c(i14, i15, null), 3);
    }

    @Override // aq.c2
    public final void T() {
        v6(-2);
    }

    @Override // aq.c2
    public final void V0(boolean z14) {
        ge1.b.T(g22.f.b(this), null, null, new e(z14, this, null), 3);
    }

    @Override // aq.c2
    public final void c5(int i14, boolean z14) {
        ge1.b.T(g22.f.b(this), null, null, new f(i14, z14, null), 3);
    }

    @Override // aq.c2
    public final void d4(int i14, long j8) {
        ge1.b.T(g22.f.b(this), null, null, new g(i14, j8, null), 3);
    }

    @Override // aq.c2
    public final void d5(int i14) {
        v6(i14);
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.edit_exercises_multi_select_fragment, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.layout_edit_exercise_multi_select_header);
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new p0(viewGroup, this, view2));
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.checkbox_edit_exercise_click_area);
        View viewFindViewById = viewGroup.findViewById(R.id.checkbox_edit_exercise);
        viewFindViewById.getClass();
        this.f12065b = (CheckBox) viewFindViewById;
        final int i14 = 1;
        viewGroup2.setOnClickListener(new View.OnClickListener(this) { // from class: aq.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f12037b;

            {
                this.f12037b = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                x xVar;
                int i15 = i14;
                n0 n0Var = this.f12037b;
                switch (i15) {
                    case 0:
                        int i16 = n0.f12063j;
                        EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
                        List<u0> list = editExercisesMultiSelectViewModelU6.f29803o;
                        ArrayList arrayList = new ArrayList();
                        int i17 = 0;
                        for (Object obj : list) {
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            u0 u0Var = (u0) obj;
                            if (u0Var.f12254c) {
                                com.garmin.android.apps.connectmobile.repcounting.model.e eVarC = u0Var.f12253b.C();
                                com.garmin.android.apps.connectmobile.repcounting.model.d dVarN = zf.b.n(eVarC.f41115e, eVarC.f41116f, editExercisesMultiSelectViewModelU6.f29800l);
                                xVar = new x(i17, eVarC, dVarN, editExercisesMultiSelectViewModelU6.A4(dVarN));
                            } else {
                                xVar = null;
                            }
                            if (xVar != null) {
                                arrayList.add(xVar);
                            }
                            i17 = i18;
                        }
                        editExercisesMultiSelectViewModelU6.f29798j.j(arrayList);
                        return;
                    default:
                        int i19 = n0.f12063j;
                        ge1.b.T(g22.f.b(n0Var), null, null, new q0(n0Var, null), 3);
                        return;
                }
            }
        });
        TextView textView = (TextView) viewGroup.findViewById(R.id.unit);
        am.d dVar = (am.d) this.f12069f.getValue();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        textView.setText(dVar.f0(contextRequireContext));
        View viewFindViewById2 = view2.findViewById(R.id.layout_edit_exercise_multi_select_footer);
        viewFindViewById2.getClass();
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById2;
        this.f12066c = viewGroup3;
        final int i15 = 0;
        ((Button) viewGroup3.findViewById(R.id.edit_exercise_multi_select_edit_button)).setOnClickListener(new View.OnClickListener(this) { // from class: aq.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f12037b;

            {
                this.f12037b = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                x xVar;
                int i16 = i15;
                n0 n0Var = this.f12037b;
                switch (i16) {
                    case 0:
                        int i17 = n0.f12063j;
                        EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
                        List<u0> list = editExercisesMultiSelectViewModelU6.f29803o;
                        ArrayList arrayList = new ArrayList();
                        int i18 = 0;
                        for (Object obj : list) {
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            u0 u0Var = (u0) obj;
                            if (u0Var.f12254c) {
                                com.garmin.android.apps.connectmobile.repcounting.model.e eVarC = u0Var.f12253b.C();
                                com.garmin.android.apps.connectmobile.repcounting.model.d dVarN = zf.b.n(eVarC.f41115e, eVarC.f41116f, editExercisesMultiSelectViewModelU6.f29800l);
                                xVar = new x(i18, eVarC, dVarN, editExercisesMultiSelectViewModelU6.A4(dVarN));
                            } else {
                                xVar = null;
                            }
                            if (xVar != null) {
                                arrayList.add(xVar);
                            }
                            i18 = i19;
                        }
                        editExercisesMultiSelectViewModelU6.f29798j.j(arrayList);
                        return;
                    default:
                        int i110 = n0.f12063j;
                        ge1.b.T(g22.f.b(n0Var), null, null, new q0(n0Var, null), 3);
                        return;
                }
            }
        });
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(new o0(this), viewLifecycleOwner);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        t0 t0Var = new t0(this);
        androidx.lifecycle.n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        mVarRequireActivity.addMenuProvider(t0Var, viewLifecycleOwner2);
    }

    public final EditExercisesMultiSelectViewModel u6() {
        return (EditExercisesMultiSelectViewModel) this.f12068e.getValue();
    }

    public final void v6(int i14) {
        this.f12070g = i14;
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = i14 >= 0 ? u6().f29803o.get(i14).f12253b : null;
        NewSelectExerciseActivity.a aVar = NewSelectExerciseActivity.f29823c;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = u6().f29792d;
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        String strB = hq.j.b(contextRequireContext2, u6().f29790b);
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        this.f12072i.a(NewSelectExerciseActivity.a.a(aVar, contextRequireContext, cVar, eVar, strB, false, hq.j.a(contextRequireContext3, u6().f29790b), hq.j.d(u6().f29790b), hq.j.c(u6().f29790b), false, 272), null);
    }

    @Override // aq.c2
    public final void x0(int i14, long j8, com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
        ge1.b.T(g22.f.b(this), null, null, new n(i14, j8, dVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Laq/n0$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_SELECT_POSITION", "I", "ADD_NEW_SET_POSITION", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
