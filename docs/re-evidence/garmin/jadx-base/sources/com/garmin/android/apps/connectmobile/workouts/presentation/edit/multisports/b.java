package com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.GCMSnackbarContentLayout;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditActivity;
import e23.l;
import fe2.z;
import g62.p;
import g62.q;
import g62.t;
import g62.u;
import java.io.File;
import java.util.ArrayList;
import o13.r;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.w;
import v.e0;
import w52.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/b;", "Landroidx/fragment/app/Fragment;", "Lw52/x0;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment implements x0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f49107t = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f49108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f49109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ComposeView f49110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComposeView f49111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f49112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexTwoLineButton f49113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f49114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f f49115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f49116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ComposeView f49117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GCMSnackbarContentLayout f49118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public NestedScrollView f49119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem f49120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k32.h f49121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f.c<Intent> f49122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f49123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f49124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0962b f49125r;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/b$b", "Lsq0/d;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0962b implements sq0.d {
        public C0962b() {
        }

        @Override // sq0.d
        public final void a() {
            a aVar = b.f49107t;
            b bVar = b.this;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6 = bVar.y6();
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = bVar.f49115h;
            if (fVar != null) {
                cVarY6.b5(fVar.f49183h);
            } else {
                p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/b$c", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/f$b;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b {
        public c() {
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b
        public final void a(h0 h0Var) {
            h0Var.getClass();
            a aVar = b.f49107t;
            b bVar = b.this;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6 = bVar.y6();
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = bVar.f49115h;
            if (fVar == null) {
                p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
                throw null;
            }
            ArrayList arrayList = fVar.f49183h;
            arrayList.getClass();
            WorkoutDetailsDTO workoutDetailsDTO = new WorkoutDetailsDTO();
            workoutDetailsDTO.Q0.addAll(arrayList);
            workoutDetailsDTO.Q0.add(h0Var);
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.Y4(cVarY6, workoutDetailsDTO, true, false, 4);
            RecyclerView recyclerView = bVar.f49114g;
            if (recyclerView == null) {
                p005kotlin.jvm.internal.s.m("recyclerView");
                throw null;
            }
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar2 = bVar.f49115h;
            if (fVar2 != null) {
                recyclerView.scrollToPosition(fVar2.f49183h.size() - 1);
            } else {
                p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
                throw null;
            }
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b
        public final void b(int i14) {
            a aVar = b.f49107t;
            b bVar = b.this;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6 = bVar.y6();
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = bVar.f49115h;
            if (fVar == null) {
                p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
                throw null;
            }
            ArrayList arrayList = fVar.f49183h;
            arrayList.getClass();
            WorkoutDetailsDTO workoutDetailsDTO = new WorkoutDetailsDTO();
            workoutDetailsDTO.Q0.addAll(arrayList);
            if (p13.h0.e0(i14, workoutDetailsDTO.Q0) != null) {
                workoutDetailsDTO.Q0.remove(i14);
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.Y4(cVarY6, workoutDetailsDTO, false, false, 6);
            } else {
                a2 a2Var = a2.WORKOUTS;
                String strF = e0.f(i14, "Segment to delete was not found at position ", ".");
                i2.f36769a.getClass();
                i2.a.a(a2Var, strF);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b
        public final void c(int i14) {
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = b.this.f49115h;
            if (fVar != null) {
                fVar.notifyItemChanged(i14, Boolean.FALSE);
            } else {
                p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f49128a;

        public d(l lVar) {
            lVar.getClass();
            this.f49128a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f49128a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49128a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f49129a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f49129a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49129a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f49131b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f49130a = aVar;
            this.f49131b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49130a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49131b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f49132a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f49132a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f49132a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f49133a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f49133a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49133a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f49135b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, Fragment fragment) {
            super(0);
            this.f49134a = aVar;
            this.f49135b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49134a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49135b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f49136a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f49136a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f49136a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/b$k", "Lsq0/e;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k implements sq0.e {
        public k() {
        }

        @Override // sq0.e
        public final void H6(RecyclerView.f0 f0Var) {
            f0Var.getClass();
            s sVar = b.this.f49116i;
            if (sVar != null) {
                sVar.o(f0Var);
            } else {
                p005kotlin.jvm.internal.s.m("mItemTouchHelper");
                throw null;
            }
        }
    }

    public b() {
        t0 t0Var = s0.f105811a;
        this.f49108a = new w1(t0Var.b(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.class), new e(this), new g(this), new f(null, this));
        this.f49109b = new w1(t0Var.b(w52.e.class), new h(this), new j(this), new i(null, this));
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new a61.i(this, 21));
        cVarRegisterForActivityResult.getClass();
        this.f49122o = cVarRegisterForActivityResult;
        this.f49123p = new c();
        this.f49124q = new k();
        this.f49125r = new C0962b();
    }

    public static final Object u6(b bVar, v13.i iVar) throws Throwable {
        bVar.getClass();
        o53.k kVar = new o53.k(u13.f.b(iVar), 1);
        kVar.q();
        new androidx.appcompat.app.e.a(bVar.requireContext()).setTitle(R.string.msg_workout_audio_notes_not_supported_alert_title).setMessage(bVar.getString(R.string.msg_workout_audio_notes_not_supported_alert_msg, bVar.getString(R.string.workout_pool_swim))).setPositiveButton(R.string.lbl_common_continue, new g62.i(kVar)).setNegativeButton(R.string.lbl_cancel, new g62.j(kVar)).setOnCancelListener(new g62.k(kVar)).show();
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    public final void A6(int i14, WorkoutDetailsDTO workoutDetailsDTO) {
        WorkoutEditActivity.a aVar = WorkoutEditActivity.f48854j;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        workoutDetailsDTO.getClass();
        Intent intent = new Intent(contextRequireContext, (Class<?>) WorkoutEditActivity.class);
        intent.putExtra("extra_is_from_multi_sports_workout", true);
        intent.putExtra("extra_sports_segment_index", i14);
        intent.putExtra("extra_workout_dto", workoutDetailsDTO);
        this.f49122o.a(intent, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C6(File file, v13.c cVar) throws Throwable {
        g62.w wVar;
        Object objC6;
        if (cVar instanceof g62.w) {
            wVar = (g62.w) cVar;
            int i14 = wVar.f76116d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f76116d = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new g62.w(this, cVar);
            }
        } else {
            wVar = new g62.w(this, cVar);
        }
        Object objE0 = wVar.f76114b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f76116d;
        if (i15 == 0) {
            r.b(objE0);
            g22.e.l(this);
            w52.e eVarW6 = w6();
            wVar.f76113a = file;
            wVar.f76116d = 1;
            x53.c cVar2 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new w52.g(file, eVarW6, null), wVar);
            if (objE0 != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            file = wVar.f76113a;
            r.b(objE0);
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    r.b(objE0);
                    return objE0;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = wVar.f76113a;
            r.b(objE0);
        }
        if (!((Boolean) objE0).booleanValue()) {
            return null;
        }
        wVar.f76113a = null;
        wVar.f76116d = 3;
        objC6 = C6(file, wVar);
        if (objC6 != obj) {
            return obj;
        }
        return objC6;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = (com.garmin.android.apps.connectmobile.workouts.data.model.a) objE0;
        g22.e.f(this);
        if (aVar != null) {
            return aVar;
        }
        wVar.f76113a = file;
        wVar.f76116d = 2;
        o53.k kVar = new o53.k(u13.f.b(wVar), 1);
        kVar.q();
        new androidx.appcompat.app.e.a(requireContext()).setTitle(R.string.workout_unable_to_save_alert_title).setMessage(R.string.workout_unable_to_save_alert_message).setPositiveButton(R.string.common_retry, new g62.s(kVar)).setNegativeButton(R.string.common_cancel, new t(kVar)).setOnCancelListener(new u(kVar)).show();
        objE0 = kVar.p();
        if (objE0 != obj) {
            if (!((Boolean) objE0).booleanValue()) {
                return null;
            }
            wVar.f76113a = null;
            wVar.f76116d = 3;
            objC6 = C6(file, wVar);
            if (objC6 != obj) {
                return objC6;
            }
        }
        return obj;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WorkoutDetailsDTO workoutDetailsDTO;
        Parcelable parcelable;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("extra_workout_dto", WorkoutDetailsDTO.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("extra_workout_dto");
                if (!(parcelable2 instanceof WorkoutDetailsDTO)) {
                    parcelable2 = null;
                }
                parcelable = (WorkoutDetailsDTO) parcelable2;
            }
            workoutDetailsDTO = (WorkoutDetailsDTO) parcelable;
        } else {
            workoutDetailsDTO = null;
        }
        Bundle arguments2 = getArguments();
        Integer numValueOf = arguments2 != null ? Integer.valueOf(arguments2.getInt("extra_sports_segment_index", -1)) : null;
        if (workoutDetailsDTO != null && numValueOf != null && numValueOf.intValue() >= 0) {
            A6(numValueOf.intValue(), workoutDetailsDTO);
        }
        return layoutInflater.inflate(R.layout.multisport_workout_overview_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        WorkoutDetailsDTO workoutDetailsDTO;
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("extra_workout_dto", WorkoutDetailsDTO.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("extra_workout_dto");
                if (!(parcelable2 instanceof WorkoutDetailsDTO)) {
                    parcelable2 = null;
                }
                parcelable = (WorkoutDetailsDTO) parcelable2;
            }
            workoutDetailsDTO = (WorkoutDetailsDTO) parcelable;
        } else {
            workoutDetailsDTO = null;
        }
        f0.k(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new g62.g(this, 4), 2);
        View viewFindViewById = view2.findViewById(R.id.view_edit_text);
        viewFindViewById.getClass();
        this.f49110c = (ComposeView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.audio_note_view);
        viewFindViewById2.getClass();
        this.f49111d = (ComposeView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.add_another_sports);
        viewFindViewById3.getClass();
        this.f49112e = (GCMComplexOneLineButton) viewFindViewById3;
        Drawable drawable = a7.b.getDrawable(requireContext(), R.drawable.plus);
        if (drawable != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            og2.k.F(R.color.gcm_icon_primary_action, contextRequireContext, drawable);
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f49112e;
            if (gCMComplexOneLineButton == null) {
                p005kotlin.jvm.internal.s.m("addAnotherLegButton");
                throw null;
            }
            gCMComplexOneLineButton.c(drawable, Float.valueOf(20.0f));
        }
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f49112e;
        if (gCMComplexOneLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("addAnotherLegButton");
            throw null;
        }
        gCMComplexOneLineButton2.setOnClickListener(new x(this, 27));
        View viewFindViewById4 = view2.findViewById(R.id.recycler_view);
        viewFindViewById4.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f49114g = recyclerView;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.f49114g;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f(contextRequireContext2, this.f49123p, this.f49124q, this.f49125r, new g62.h(this, 1));
        this.f49115h = fVar;
        fVar.f49181f = Boolean.FALSE;
        fVar.notifyDataSetChanged();
        RecyclerView recyclerView3 = this.f49114g;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar2 = this.f49115h;
        if (fVar2 == null) {
            p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
            throw null;
        }
        recyclerView3.setAdapter(fVar2);
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar3 = this.f49115h;
        if (fVar3 == null) {
            p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
            throw null;
        }
        s sVar = new s(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.a(fVar3));
        this.f49116i = sVar;
        RecyclerView recyclerView4 = this.f49114g;
        if (recyclerView4 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        sVar.e(recyclerView4);
        View viewFindViewById5 = view2.findViewById(R.id.transition_toggle);
        viewFindViewById5.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById5;
        this.f49113f = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.f(true);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f49113f;
        if (gCMComplexTwoLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("transitions");
            throw null;
        }
        gCMComplexTwoLineButton2.setParentContainerScreenReaderFocusable(true);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f49113f;
        if (gCMComplexTwoLineButton3 == null) {
            p005kotlin.jvm.internal.s.m("transitions");
            throw null;
        }
        gCMComplexTwoLineButton3.setOnCheckedChangeListener(new com.google.android.material.chip.a(this, 2));
        View viewFindViewById6 = view2.findViewById(R.id.sports_list_header);
        viewFindViewById6.getClass();
        k32.h hVar = new k32.h(viewFindViewById6);
        this.f49121n = hVar;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar4 = this.f49115h;
        if (fVar4 == null) {
            p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
            throw null;
        }
        int i14 = p005kotlin.jvm.internal.s.g(fVar4.f49181f, Boolean.TRUE) ? R.string.lbl_done : R.string.lbl_edit;
        z zVar = new z(this, 12);
        TextView textView = hVar.f102692a;
        if (textView != null) {
            textView.setText(R.string.lbl_workout_legs);
        }
        TextView textView2 = hVar.f102693b;
        if (textView2 != null) {
            textView2.setText(i14);
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setOnClickListener(new js0.d(zVar, 3));
        }
        View viewFindViewById7 = view2.findViewById(R.id.estimate_view);
        viewFindViewById7.getClass();
        this.f49117j = (ComposeView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.snackbar_footer);
        viewFindViewById8.getClass();
        this.f49118k = (GCMSnackbarContentLayout) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.scroll_view);
        viewFindViewById9.getClass();
        this.f49119l = (NestedScrollView) viewFindViewById9;
        m activity = getActivity();
        activity.getClass();
        activity.addMenuProvider(new g62.l(this), getViewLifecycleOwner(), b0.b.CREATED);
        y6().f49142x.f(getViewLifecycleOwner(), new d(new g62.g(this, 2)));
        y6().f49143y.f(getViewLifecycleOwner(), new d(new g62.g(this, 3)));
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6 = y6();
        if (workoutDetailsDTO != null) {
            cVarY6.f49138r = workoutDetailsDTO;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.Y4(cVarY6, workoutDetailsDTO, false, false, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v6(String str, String str2, v13.c cVar) throws Throwable {
        g62.m mVar;
        String str3;
        boolean z14;
        Object objV6;
        if (cVar instanceof g62.m) {
            mVar = (g62.m) cVar;
            int i14 = mVar.f76099f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f76099f = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new g62.m(this, cVar);
            }
        } else {
            mVar = new g62.m(this, cVar);
        }
        Object objX4 = mVar.f76097d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f76099f;
        if (i15 == 0) {
            r.b(objX4);
            g22.e.l(this);
            w52.e eVarW6 = w6();
            mVar.f76094a = str;
            mVar.f76095b = str2;
            mVar.f76099f = 1;
            objX4 = eVarW6.x4(str, str2, mVar);
            if (objX4 != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            str2 = mVar.f76095b;
            str = mVar.f76094a;
            r.b(objX4);
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    r.b(objX4);
                    return objX4;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = mVar.f76096c;
            str2 = mVar.f76095b;
            str3 = mVar.f76094a;
            r.b(objX4);
        }
        if (!((Boolean) objX4).booleanValue()) {
            return Boolean.FALSE;
        }
        mVar.f76094a = null;
        mVar.f76095b = null;
        mVar.f76096c = z14;
        mVar.f76099f = 3;
        objV6 = v6(str3, str2, mVar);
        if (objV6 != obj) {
            return obj;
        }
        return objV6;
        boolean zBooleanValue = ((Boolean) objX4).booleanValue();
        g22.e.f(this);
        if (zBooleanValue) {
            return Boolean.TRUE;
        }
        mVar.f76094a = str;
        mVar.f76095b = str2;
        mVar.f76096c = zBooleanValue;
        mVar.f76099f = 2;
        o53.k kVar = new o53.k(u13.f.b(mVar), 1);
        kVar.q();
        new androidx.appcompat.app.e.a(requireContext()).setTitle(R.string.audio_note_failed_to_download_alert_title).setMessage(R.string.audio_note_failed_to_download_alert_message).setPositiveButton(R.string.common_retry, new p(kVar)).setNegativeButton(R.string.common_cancel, new q(kVar)).setOnCancelListener(new g62.r(kVar)).show();
        Object objP = kVar.p();
        if (objP != obj) {
            str3 = str;
            z14 = zBooleanValue;
            objX4 = objP;
            if (!((Boolean) objX4).booleanValue()) {
                return Boolean.FALSE;
            }
            mVar.f76094a = null;
            mVar.f76095b = null;
            mVar.f76096c = z14;
            mVar.f76099f = 3;
            objV6 = v6(str3, str2, mVar);
            if (objV6 != obj) {
                return objV6;
            }
        }
        return obj;
    }

    public final w52.e w6() {
        return (w52.e) this.f49109b.getValue();
    }

    public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c y6() {
        return (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) this.f49108a.getValue();
    }

    public final void z6() {
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = this.f49115h;
        if (fVar == null) {
            p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
            throw null;
        }
        Boolean bool = fVar.f49181f;
        Boolean bool2 = Boolean.TRUE;
        fVar.f49181f = Boolean.valueOf(!p005kotlin.jvm.internal.s.g(bool, bool2));
        fVar.notifyDataSetChanged();
        k32.h hVar = this.f49121n;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("headerViewHolder");
            throw null;
        }
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar2 = this.f49115h;
        if (fVar2 == null) {
            p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
            throw null;
        }
        int i14 = p005kotlin.jvm.internal.s.g(fVar2.f49181f, bool2) ? R.string.lbl_done : R.string.lbl_edit;
        TextView textView = hVar.f102693b;
        if (textView != null) {
            textView.setText(i14);
        }
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6 = y6();
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar3 = this.f49115h;
        if (fVar3 == null) {
            p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
            throw null;
        }
        cVarY6.b5(fVar3.f49183h);
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY7 = y6();
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar4 = this.f49115h;
        if (fVar4 == null) {
            p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
            throw null;
        }
        ArrayList arrayList = fVar4.f49183h;
        arrayList.getClass();
        WorkoutDetailsDTO workoutDetailsDTO = new WorkoutDetailsDTO();
        workoutDetailsDTO.Q0.addAll(arrayList);
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.Y4(cVarY7, workoutDetailsDTO, false, false, 4);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_WORKOUT_DTO", "EXTRA_SPORTS_SEGMENT_INDEX", "", "MINIMUM_LEG_COUNT_THRESHOLD", "I", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
