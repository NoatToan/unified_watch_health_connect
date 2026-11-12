package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w0;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import bs2.nv;
import bs2.sw;
import c62.a0;
import c62.c0;
import c62.c1;
import c62.d0;
import c62.e0;
import c62.g0;
import c62.h0;
import c62.i0;
import c62.i2;
import c62.j0;
import c62.k0;
import c62.k2;
import c62.l0;
import c62.m0;
import c62.m2;
import c62.n0;
import c62.o0;
import c62.r0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.StartWorkoutCapableDeviceSelectionActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutExerciseActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.schedule.ScheduleWorkoutTypeActivity;
import com.google.mlkit.common.MlKitException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o53.b0;
import o53.f0;
import o53.s0;
import o53.t1;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import r22.p0;
import r22.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/WorkoutDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class WorkoutDetailsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48482f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p0 f48483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f48484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f48485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o52.e f48486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f48487e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f48489b;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.SEND_TO_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.HELP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.EDIT_WORKOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c1.SAVE_WORKOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c1.ADD_TO_CALENDAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c1.CLONE_WORKOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c1.DELETE_WORKOUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c1.RENAME_WORKOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c1.REMOVE_FROM_CALENDAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c1.RESCHEDULE_WORKOUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c1.REMOVE_WORKOUT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f48488a = iArr;
            int[] iArr2 = new int[fw.p.values().length];
            try {
                iArr2[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            f48489b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.q<String, String, t13.d<? super Boolean>, Object> {
        public c(Object obj) {
            super(3, obj, w52.e.class, "downloadAudioNote", "downloadAudioNote(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // e23.q
        public final Object invoke(String str, String str2, t13.d<? super Boolean> dVar) {
            return ((w52.e) this.receiver).x4(str, str2, dVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity$onLaunch$3", f = "WorkoutDetailsActivity.kt", l = {SyslogConstants.LOG_LOCAL6, 1072}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48490a;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements r53.i<v52.c.C3278c<com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f48492a;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0942a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f48493a;

                /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity$d$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity$onLaunch$3$invokeSuspend$$inlined$mapNotNull$1$2", f = "WorkoutDetailsActivity.kt", l = {52}, m = "emit", v = 2)
                public static final class C0943a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f48494a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f48495b;

                    public C0943a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f48494a = obj;
                        this.f48495b |= Integer.MIN_VALUE;
                        return C0942a.this.emit(null, this);
                    }
                }

                public C0942a(r53.j jVar) {
                    this.f48493a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C0943a c0943a;
                    if (dVar instanceof C0943a) {
                        c0943a = (C0943a) dVar;
                        int i14 = c0943a.f48495b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c0943a.f48495b = i14 - Integer.MIN_VALUE;
                        } else {
                            c0943a = new C0943a(dVar);
                        }
                    } else {
                        c0943a = new C0943a(dVar);
                    }
                    Object obj2 = c0943a.f48494a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c0943a.f48495b;
                    if (i15 == 0) {
                        o13.r.b(obj2);
                        v52.c cVar = (v52.c) obj;
                        v52.c.C3278c c3278c = cVar instanceof v52.c.C3278c ? (v52.c.C3278c) cVar : null;
                        if (c3278c != null) {
                            c0943a.f48495b = 1;
                            if (this.f48493a.emit(c3278c, c0943a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public a(r53.i iVar) {
                this.f48492a = iVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super v52.c.C3278c<com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar, t13.d dVar) {
                Object objCollect = this.f48492a.collect(new C0942a(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b implements e23.a<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.e f48497a;

            public b(com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar) {
                this.f48497a = eVar;
            }

            @Override // e23.a
            public final Unit invoke() {
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = this.f48497a;
                if (eVar.getF48577a().H() || eVar.getF48577a().F()) {
                    String str = eVar.getF48577a().E;
                    if (str == null) {
                        str = "";
                    }
                    ht.a aVar = ht.a.f85464a;
                    Bundle bundleA = h7.c.a(new o13.p("MSNWorkoutId", str));
                    aVar.getClass();
                    ht.a.a(bundleA, "PageViewMSNWorkoutsDetails");
                }
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return WorkoutDetailsActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
        
            if (androidx.lifecycle.d2.a(r4, r5, r6, r7, r8, r10) == r0) goto L32;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48490a;
            WorkoutDetailsActivity workoutDetailsActivity = WorkoutDetailsActivity.this;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(workoutDetailsActivity.ea().Z);
                this.f48490a = 1;
                obj = r53.s.x(aVar2, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) ((v52.c.C3278c) obj).f175760a;
            androidx.lifecycle.b0 f158016a = workoutDetailsActivity.getF158016a();
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.RESUMED;
            x53.c cVar = s0.f129406a;
            t1 t1VarH = u53.o.f168762a.H();
            boolean zIsDispatchNeeded = t1VarH.isDispatchNeeded(getF157466b());
            if (zIsDispatchNeeded) {
                b bVar2 = new b(eVar);
                this.f48490a = 2;
            } else {
                if (f158016a.getF7973d() == androidx.lifecycle.b0.b.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (f158016a.getF7973d().compareTo(bVar) >= 0) {
                    if (eVar.getF48577a().H() || eVar.getF48577a().F()) {
                        String str = eVar.getF48577a().E;
                        if (str == null) {
                            str = "";
                        }
                        ht.a aVar3 = ht.a.f85464a;
                        Bundle bundleA = h7.c.a(new o13.p("MSNWorkoutId", str));
                        aVar3.getClass();
                        ht.a.a(bundleA, "PageViewMSNWorkoutsDetails");
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    b bVar3 = new b(eVar);
                    this.f48490a = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f48498a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f48498a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f48498a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48498a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48499a;

        public f(b.g gVar) {
            this.f48499a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48499a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48500a;

        public g(b.g gVar) {
            this.f48500a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48500a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f48502b;

        public h(e23.a aVar, b.g gVar) {
            this.f48501a = aVar;
            this.f48502b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48501a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48502b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48503a;

        public i(b.g gVar) {
            this.f48503a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48503a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48504a;

        public j(b.g gVar) {
            this.f48504a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48504a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f48506b;

        public k(e23.a aVar, b.g gVar) {
            this.f48505a = aVar;
            this.f48506b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48505a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48506b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public WorkoutDetailsActivity() {
        f fVar = new f(this);
        t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        this.f48484b = new w1(t0Var.b(com.garmin.android.apps.connectmobile.workouts.presentation.details.f.class), new g(this), fVar, new h(null, this));
        this.f48485c = new w1(t0Var.b(w52.e.class), new j(this), new i(this), new k(null, this));
        this.f48486d = (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null);
        this.f48487e = registerForActivityResult(new g.h(), new a61.i(this, 9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ca(WorkoutDetailsActivity workoutDetailsActivity, g3 g3Var) {
        Long l14;
        workoutDetailsActivity.getClass();
        fw.p pVar = g3Var.f35300a;
        T t7 = g3Var.f35301b;
        int i14 = b.f48489b[pVar.ordinal()];
        if (i14 == 1) {
            o13.p pVar2 = (o13.p) t7;
            if (pVar2 == null || (l14 = (Long) pVar2.f128594a) == null) {
                return;
            }
            long jLongValue = l14.longValue();
            m52.k kVarR4 = workoutDetailsActivity.ea().R4(workoutDetailsActivity.ea().f48605r, Boolean.FALSE);
            com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = workoutDetailsActivity.ea();
            String string = workoutDetailsActivity.getString(k2.b(kVarR4));
            string.getClass();
            String string2 = workoutDetailsActivity.getString(R.string.workout_send_to_device_complete_message, workoutDetailsActivity.f48486d.i(jLongValue));
            string2.getClass();
            ge1.b.T(v1.a(fVarEa), null, null, new i2(fVarEa, string, string2, null), 3);
            return;
        }
        if (i14 == 2) {
            o13.p pVar3 = (o13.p) t7;
            ge1.b.T(f0.w(workoutDetailsActivity), null, null, new c62.p0(workoutDetailsActivity, pVar3 != null ? (String) pVar3.f128595b : null, null), 3);
            return;
        }
        if (i14 != 3) {
            u0.r();
            return;
        }
        workoutDetailsActivity.ea().Z4();
        String string3 = workoutDetailsActivity.getString(R.string.txt_error_occurred);
        string3.getClass();
        workoutDetailsActivity.ja(string3);
        String str = g3Var.f35302c;
        com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "WorkoutDetailsActivity", str);
    }

    public z3.e da() {
        r52.e eVar = new r52.e(ea().Z, ea().H0, ea(), c62.f0.f24735a, g0.f24741a, h0.f24751a, i0.f24758a);
        eVar.f150496i = j0.f24763a;
        k0 k0Var = k0.f24773a;
        k0Var.getClass();
        eVar.f150500m = k0Var;
        l0 l0Var = l0.f24777a;
        l0Var.getClass();
        eVar.f150495h.add(l0Var);
        m0 m0Var = m0.f24806a;
        m0Var.getClass();
        eVar.f150497j.add(m0Var);
        n0 n0Var = n0.f24817a;
        n0Var.getClass();
        eVar.f150498k.add(n0Var);
        c62.v vVar = c62.v.f24911a;
        vVar.getClass();
        ArrayList arrayList = eVar.f150499l;
        arrayList.add(vVar);
        c62.w wVar = c62.w.f24928a;
        wVar.getClass();
        arrayList.add(wVar);
        c62.x xVar = c62.x.f24930a;
        xVar.getClass();
        arrayList.add(xVar);
        c62.y yVar = c62.y.f24932a;
        yVar.getClass();
        eVar.f150501n = yVar;
        eVar.f150502o = new c62.z(this);
        eVar.f150503p = new a0(this);
        eVar.f150504q = new c62.b0(this);
        c0 c0Var = c0.f24693a;
        d0 d0Var = new d0(this);
        c0Var.getClass();
        eVar.f150505r = new o13.p<>(c0Var, d0Var);
        eVar.f150506s = new e0(this);
        return new z3.e(-1136927854, true, new r12.a(eVar, 8));
    }

    public final com.garmin.android.apps.connectmobile.workouts.presentation.details.f ea() {
        return (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) this.f48484b.getValue();
    }

    public final void fa(com.garmin.android.apps.connectmobile.workouts.presentation.details.d dVar) {
        String str;
        dVar.getClass();
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.p) {
            ComposeView composeView = (ComposeView) findViewById(R.id.composable_container);
            q0.b bVar = q0.f149800b;
            composeView.getClass();
            bVar.getClass();
            q0.b.a(composeView, R.string.msg_workouts_show_on_sync, 0).show();
            return;
        }
        boolean z14 = dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.q;
        o52.e eVar = this.f48486d;
        if (z14) {
            com.garmin.android.apps.connectmobile.workouts.presentation.details.d.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d.q) dVar;
            eVar.B(this, qVar.f48538a, qVar.f48539b);
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.c) {
            boolean z15 = ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.c) dVar).f48520a;
            p0 p0Var = this.f48483a;
            if (!z15) {
                if (p0Var != null) {
                    p0Var.w6();
                    return;
                }
                return;
            }
            if (p0Var != null) {
                p0Var.y6(R.string.save_msn_workout_success_title, R.string.save_msn_workout_success_msg);
            }
            setResult(-1);
            long longExtra = getIntent().getLongExtra("GCM_workout_queue_download_to_device", -1L);
            if (longExtra > 0) {
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = ea();
                int i14 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                k2.a(fVarEa.c5(longExtra, false), new a02.a(longExtra, 8)).f(this, new e(new o0(this)));
                return;
            }
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.o) {
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
            Toast.makeText(this, R.string.workout_has_been_scheduled, 1).show();
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.f) {
            if (ea().f48605r == null) {
                displayFailedMessage();
                return;
            }
            com.garmin.android.apps.connectmobile.workouts.presentation.details.d.f fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d.f) dVar;
            long j8 = fVar.f48523b;
            ArrayList arrayList = fVar.f48522a.f48038a;
            arrayList.getClass();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            for (Object obj : arrayList) {
                String str2 = ((com.garmin.android.apps.connectmobile.workouts.data.model.a0) obj).f48094w;
                if (!(str2 != null && str2.equals("FBT_ADAPTIVE"))) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() == 0) {
                WorkoutDetailsDTO workoutDetailsDTO = ea().f48605r;
                if (workoutDetailsDTO != null) {
                    long j14 = workoutDetailsDTO.f48040a;
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa2 = ea();
                    ge1.b.T(v1.a(fVarEa2), null, null, new s(fVarEa2, c22.j0.b(new DateTime(j8), "\"yyyy-MM-dd\"", null), j14, null), 3);
                    return;
                }
                return;
            }
            WorkoutDetailsDTO workoutDetailsDTO2 = ea().f48605r;
            Intent intent = new Intent(this, (Class<?>) ScheduleWorkoutTypeActivity.class);
            intent.putExtra("GCM_workout_dto", workoutDetailsDTO2);
            intent.putExtra("extra.date.time", j8);
            intent.putParcelableArrayListExtra("GCM_tp_active_plans", arrayList2);
            startActivityForResult(intent, 9478);
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.v) {
            if (!((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.v) dVar).f48550a) {
                Toast.makeText(this, R.string.workout_update_failed, 0).show();
                return;
            } else {
                setResult(-1);
                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                return;
            }
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.C0946d) {
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
            setResult(-1);
            finish();
            return;
        }
        boolean z16 = dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.b;
        a aVar = f48482f;
        if (z16) {
            WorkoutDetailsDTO workoutDetailsDTO3 = ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.b) dVar).f48519a;
            if (workoutDetailsDTO3 == null) {
                Toast.makeText(this, R.string.workout_create_failed, 1).show();
                return;
            }
            long j15 = workoutDetailsDTO3.f48040a;
            aVar.getClass();
            a.c(this, j15, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR);
            setResult(-1);
            finish();
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.l) {
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
            setResult(-1);
            finish();
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h) {
            return;
        }
        int i15 = 7;
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.r) {
            new androidx.appcompat.app.e.a(this).setTitle(R.string.audio_note_failed_to_download_alert_title).setMessage(R.string.audio_note_failed_to_download_alert_message).setPositiveButton(R.string.common_retry, new ag0.d(i15, this, dVar)).setNegativeButton(R.string.common_cancel, new ag0.e(21)).show();
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.s) {
            p0 p0Var2 = new p0();
            this.f48483a = p0Var2;
            p0Var2.show(getSupportFragmentManager(), (String) null);
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.x) {
            long j16 = ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.x) dVar).f48552a;
            aVar.getClass();
            a.c(this, j16, 209);
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.w) {
            MultiSportsDetailsActivity.a aVar2 = MultiSportsDetailsActivity.f48440z;
            long j17 = ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.w) dVar).f48551a;
            aVar2.getClass();
            MultiSportsDetailsActivity.a.a(this, j17, -1L, false);
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.t) {
            MSNWorkoutExerciseActivity.a aVar3 = MSNWorkoutExerciseActivity.f49450e;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.d.t tVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d.t) dVar;
            ArrayList<com.garmin.android.apps.connectmobile.workouts.data.model.m> arrayList3 = tVar.f48546c;
            String str3 = tVar.f48544a;
            String str4 = tVar.f48545b;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = ea().f48607v;
            WorkoutDetailsDTO workoutDetailsDTO4 = ea().f48605r;
            str = workoutDetailsDTO4 != null ? workoutDetailsDTO4.P : null;
            aVar3.getClass();
            Intent intent2 = new Intent(this, (Class<?>) MSNWorkoutExerciseActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("GCM_workout_exercise_step_list", arrayList3);
            bundle.putString("GCM_workout_exercise_category", str3);
            bundle.putString("GCM_workout_exercise_name", str4);
            bundle.putParcelable("GCM_workout_exercise_list", cVar);
            bundle.putString("GCM_workout_exercise_details_list", str);
            l2.f37135b.getClass();
            l2.a.b().a(intent2, bundle);
            startActivity(intent2);
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.a) {
            com.garmin.android.apps.connectmobile.workouts.presentation.details.c cVar2 = ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.a) dVar).f48518a;
            if (cVar2 == com.garmin.android.apps.connectmobile.workouts.presentation.details.c.WithPushingWorkoutEdit) {
                ha();
                return;
            }
            if (cVar2 == com.garmin.android.apps.connectmobile.workouts.presentation.details.c.WithSendingWorkoutToDevice) {
                long longExtra2 = getIntent().getLongExtra("GCM_workout_queue_download_to_device", -1L);
                if (longExtra2 > 0) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa3 = ea();
                    int i16 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                    k2.a(fVarEa3.c5(longExtra2, false), new a02.a(longExtra2, i15)).f(this, new e(new c62.q0(this)));
                    return;
                }
                return;
            }
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.u) {
            WorkoutDetailsDTO workoutDetailsDTO5 = ea().f48605r;
            if (workoutDetailsDTO5 != null) {
                com.garmin.android.apps.connectmobile.workouts.presentation.details.d.u uVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d.u) dVar;
                z zVar = uVar.f48549c;
                boolean z17 = zVar instanceof z.a;
                f.c<Intent> cVar3 = this.f48487e;
                if (!z17) {
                    if (zVar instanceof z.b) {
                        long j18 = uVar.f48547a;
                        m2 m2Var = uVar.f48548b;
                        cVar3.a(this.f48486d.A(this, j18, m2Var.f24809a, m2Var.f24810b, m2Var.f24811c, (int) ((z.b) zVar).f48842a, workoutDetailsDTO5.f48041b), null);
                        return;
                    } else {
                        if (!(zVar instanceof z.c)) {
                            u0.r();
                            return;
                        }
                        String string = getString(R.string.txt_error_occurred);
                        string.getClass();
                        ja(string);
                        return;
                    }
                }
                try {
                    cVar3.a(this.f48486d.w(this, ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.u) dVar).f48547a, ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.u) dVar).f48548b.f24809a, ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.u) dVar).f48548b.f24810b, ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.u) dVar).f48548b.f24811c, ((z.a) ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.u) dVar).f48549c).f48840a, ((z.a) ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.u) dVar).f48549c).f48841b, workoutDetailsDTO5.f48041b), null);
                    return;
                } catch (IllegalArgumentException e4) {
                    com.garmin.android.apps.connectmobile.i2.a aVar4 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar4.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.g(a2Var, "WorkoutDetailsActivity", e4);
                    String string2 = getString(R.string.txt_error_occurred);
                    string2.getClass();
                    ja(string2);
                    return;
                } catch (DateTimeParseException e14) {
                    com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar5.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.g(a2Var2, "WorkoutDetailsActivity", e14);
                    String string3 = getString(R.string.txt_error_occurred);
                    string3.getClass();
                    ja(string3);
                    return;
                }
            }
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.g) {
            com.garmin.android.apps.connectmobile.workouts.presentation.details.d.g gVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d.g) dVar;
            long j19 = gVar.f48524a;
            Integer num = gVar.f48525b;
            Integer num2 = gVar.f48526c;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa4 = ea();
            Long lValueOf = Long.valueOf(j19);
            w0 w0Var = new w0();
            ge1.b.T(v1.a(fVarEa4), null, null, new m(lValueOf, w0Var, fVarEa4, num, num2, null), 3);
            w0Var.f(this, new e(new r0(this)));
            return;
        }
        if (dVar.equals(com.garmin.android.apps.connectmobile.workouts.presentation.details.d.k.f48530a)) {
            setResult(-1);
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.n) {
            StartWorkoutCapableDeviceSelectionActivity.a aVar6 = StartWorkoutCapableDeviceSelectionActivity.f48554a;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.d.n nVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d.n) dVar;
            List<sd2.f> list = nVar.f48534a;
            boolean z18 = nVar.f48535b;
            aVar6.getClass();
            Intent intent3 = new Intent(this, (Class<?>) StartWorkoutCapableDeviceSelectionActivity.class);
            intent3.putParcelableArrayListExtra("extra_devices", new ArrayList<>(list));
            intent3.putExtra("extra_is_multi_device", z18);
            startActivityForResult(intent3, 1001);
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.e) {
            String string4 = getString(R.string.txt_error_occurred);
            string4.getClass();
            ja(string4);
            return;
        }
        if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.y) {
            eVar.p(this);
            return;
        }
        if (!(dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.m)) {
            if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.i) {
                eVar.z(this);
                return;
            } else if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.j) {
                eVar.D(this);
                return;
            } else {
                u0.r();
                return;
            }
        }
        WorkoutActivityProfileSelectionActivity.b bVar2 = WorkoutActivityProfileSelectionActivity.f48559a;
        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.m mVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d.m) dVar;
        long j24 = mVar.f48532a;
        List<d62.i> list2 = mVar.f48533b;
        WorkoutDetailsDTO workoutDetailsDTO6 = ea().f48605r;
        str = workoutDetailsDTO6 != null ? workoutDetailsDTO6.f48041b : null;
        if (str == null) {
            str = "";
        }
        bVar2.getClass();
        Intent intent4 = new Intent(this, (Class<?>) WorkoutActivityProfileSelectionActivity.class);
        intent4.putExtra("extra_selected_device_unit_id", j24);
        intent4.putParcelableArrayListExtra("extra_profiles", new ArrayList<>(list2));
        intent4.putExtra("extra_workout_name", str);
        startActivityForResult(intent4, 1002);
    }

    public final void ga() {
        WorkoutDetailsDTO workoutDetailsDTO = ea().f48605r;
        if (workoutDetailsDTO == null || !workoutDetailsDTO.D()) {
            ea().U4(ea().f48605r);
        } else {
            com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = ea();
            ge1.b.T(v1.a(fVarEa), null, null, new t(fVarEa, null), 3);
        }
    }

    public final void ha() {
        if (ea().f48605r == null) {
            return;
        }
        ea();
        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.a5(ea().f48605r)) {
            Intent intent = new Intent();
            intent.putExtra("extra_workout_segment_order", ea().f48600m);
            setResult(-1, intent);
            finish();
            return;
        }
        long longExtra = getIntent().getLongExtra("GCM_workout_queue_download_to_device", -1L);
        WorkoutEditActivity.a aVar = WorkoutEditActivity.f48854j;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        WorkoutDetailsDTO workoutDetailsDTO = ea().f48605r;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list = ea().f48609x;
        Parcelable parcelable = ea().f48610y;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list2 = ea().f48608w;
        boolean z14 = ea().C > 0;
        aVar.getClass();
        Intent intent2 = new Intent(applicationContext, (Class<?>) WorkoutEditActivity.class);
        intent2.putExtra("extra_workout_dto", workoutDetailsDTO);
        intent2.putExtra("extra_benchmark_list_dto", list != null ? (com.garmin.android.apps.connectmobile.workouts.data.model.b[]) list.toArray(new com.garmin.android.apps.connectmobile.workouts.data.model.b[0]) : null);
        intent2.putExtra("extra_cycling_power_zone_dto", parcelable);
        intent2.putExtra("extra_power_curve_target_dto", list2 != null ? (com.garmin.android.apps.connectmobile.workouts.data.model.v[]) list2.toArray(new com.garmin.android.apps.connectmobile.workouts.data.model.v[0]) : null);
        intent2.putExtra("extra_has_training.plan", z14);
        intent2.putExtra("extra_is_from_multi_sports_workout", (workoutDetailsDTO != null ? workoutDetailsDTO.f48044e : null) == m52.k.A);
        intent2.putExtra("GCM_workout_queue_download_to_device", longExtra);
        startActivityForResult(intent2, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
    }

    public final void ia() {
        Parcelable parcelable;
        Bundle extras = getIntent().getExtras();
        com.garmin.android.apps.connectmobile.workouts.presentation.details.c.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.c.f48511a;
        Integer numValueOf = extras != null ? Integer.valueOf(extras.getInt("GCM_extra_activity_type")) : null;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.workouts.presentation.details.c cVarA = com.garmin.android.apps.connectmobile.workouts.presentation.details.c.a.a(numValueOf);
        if (extras != null) {
            try {
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = ea();
                boolean z14 = extras.getBoolean("GCM_workout_is_protected");
                boolean z15 = extras.getBoolean("GCM_workout_is_race");
                boolean z16 = extras.getBoolean("EXTRA_IS_FBT_WORKOUT", false);
                boolean z17 = extras.getBoolean("GCM_workout_is_stp", false);
                int i14 = extras.getInt("extra_workout_segment_order", 1);
                Long lValueOf = Long.valueOf(extras.getLong("GCM_workout_id", -1L));
                Long lValueOf2 = Long.valueOf(extras.getLong("GCM_workout_schedule_id", -1L));
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) extras.getParcelable("GCM_calendar_items", CalendarItemDTO.class);
                } else {
                    Parcelable parcelable2 = extras.getParcelable("GCM_calendar_items");
                    if (!(parcelable2 instanceof CalendarItemDTO)) {
                        parcelable2 = null;
                    }
                    parcelable = (CalendarItemDTO) parcelable2;
                }
                CalendarItemDTO calendarItemDTO = (CalendarItemDTO) parcelable;
                String string = extras.getString("EXTRA_SCHEDULE_WORKOUT_UUID");
                String string2 = extras.getString("GCM_workout_source_id");
                boolean z18 = extras.getBoolean("GCM_workout_completed", false);
                boolean z19 = extras.getBoolean("GCM_workout_is_plan_completed", false);
                long j8 = extras.getLong("GCM_preselected_device_id", -1L);
                fVarEa.e5(z14, z15, z16, z17, i14, lValueOf, lValueOf2, calendarItemDTO, string, string2, cVarA, z18, z19, j8 > -1 ? Long.valueOf(j8) : null);
            } catch (Throwable unused) {
                Toast.makeText(this, getString(R.string.txt_something_went_wrong_try_again), 0).show();
                finish();
            }
        }
        ge1.b.T(f0.w(this), null, null, new d(null), 3);
    }

    public final void ja(String str) {
        Toast toastMakeText = Toast.makeText(this, str, 1);
        toastMakeText.setGravity(49, 0, 150);
        toastMakeText.show();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        d62.j jVar;
        sw swVar;
        nv nvVar;
        Object serializableExtra;
        WorkoutDetailsDTO workoutDetailsDTO;
        WorkoutDetailsDTO workoutDetailsDTO2;
        Integer numValueOf = null;
        if (i14 == 203) {
            if (i15 != -1) {
                return;
            }
            if (intent != null ? intent.getBooleanExtra("extra_start_workout", false) : false) {
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = ea();
                Long lS4 = fVarEa.S4();
                fVarEa.K4(new o(fVarEa, lS4 != null ? lS4.longValue() : -1L, null));
                return;
            } else {
                String stringExtra = intent != null ? intent.getStringExtra("KEY_SNACKBAR_MESSAGE") : null;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa2 = ea();
                int i16 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                w0 w0Var = new w0(g3.a.c(g3.f35298f));
                ge1.b.T(v1.a(fVarEa2), null, null, new r(fVarEa2, w0Var, null, null), 3);
                k2.a(w0Var, new defpackage.b(stringExtra, 29)).f(this, new e(new c62.s0(this)));
                return;
            }
        }
        if (i14 == 204 || i14 == 208) {
            if (i15 != 0) {
                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                setResult(-1);
                finish();
                return;
            }
            return;
        }
        if (i14 == 9478) {
            if (i15 == -1) {
                Toast.makeText(this, R.string.workout_has_been_scheduled, 1).show();
                return;
            }
            return;
        }
        if (i14 == 1001) {
            if (i15 != -1) {
                return;
            }
            StartWorkoutCapableDeviceSelectionActivity.f48554a.getClass();
            if (intent != null ? intent.getBooleanExtra("extra_send_to_device", false) : false) {
                ga();
                return;
            }
            long longExtra = intent != null ? intent.getLongExtra("extra_selected_device_unit_id", -1L) : -1L;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa3 = ea();
            fVarEa3.K4(new o(fVarEa3, longExtra, null));
            return;
        }
        if (i14 != 1002) {
            if (i15 == -1 && ea().f48605r != null && (((workoutDetailsDTO = ea().f48605r) != null && workoutDetailsDTO.H()) || ((workoutDetailsDTO2 = ea().f48605r) != null && workoutDetailsDTO2.F()))) {
                setResult(-1);
            }
            super.onActivityResult(i14, i15, intent);
            return;
        }
        if (i15 != -1) {
            return;
        }
        WorkoutActivityProfileSelectionActivity.f48559a.getClass();
        long longExtra2 = intent != null ? intent.getLongExtra("extra_selected_device_unit_id", -1L) : -1L;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("extra_selected_profile", d62.j.class);
            } else {
                Object serializableExtra2 = intent.getSerializableExtra("extra_selected_profile");
                if (!(serializableExtra2 instanceof d62.j)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (d62.j) serializableExtra2;
            }
            jVar = (d62.j) serializableExtra;
        } else {
            jVar = null;
        }
        Integer numValueOf2 = (jVar == null || (nvVar = jVar.f58024a) == null) ? null : Integer.valueOf(nvVar.f20362a);
        if (jVar != null && (swVar = jVar.f58025b) != null) {
            numValueOf = Integer.valueOf(swVar.f20563a);
        }
        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa4 = ea();
        fVarEa4.K4(new n(fVarEa4, longExtra2, numValueOf2, numValueOf, null));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = ea();
        w1 w1Var = this.f48485c;
        String str = ((w52.e) w1Var.getValue()).f182503c;
        c cVar = new c((w52.e) w1Var.getValue());
        str.getClass();
        fVarEa.X = new com.garmin.android.apps.connectmobile.workouts.presentation.details.f.a(str, cVar);
        Bundle extras = getIntent().getExtras();
        com.garmin.android.apps.connectmobile.workouts.presentation.details.c.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.c.f48511a;
        Integer numValueOf = extras != null ? Integer.valueOf(extras.getInt("GCM_extra_activity_type")) : null;
        aVar.getClass();
        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.c.a.a(numValueOf) == com.garmin.android.apps.connectmobile.workouts.presentation.details.c.SetResultOnCreate) {
            setResult(-1);
        }
        setContentView(R.layout.composable_container);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(da());
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/WorkoutDetailsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_SCHEDULE_WORKOUT_UUID", "EXTRA_IS_FBT_WORKOUT", "EXTRA_WORKOUT_SEGMENT_ORDER", "EXTRA_START_WORKOUT", "KEY_SNACKBAR_MESSAGE", "", "DUPLICATED_PREVIEW_WORKOUT_REQUEST_CODE", "I", "REQUEST_CODE_TARGET_DEVICE_SELECTION", "REQUEST_CODE_EDIT_WORKOUT", "SEND_TO_DEVICE_DIALOG_DISMISS_DELAY_MS", "REQUEST_CODE_PREVIEW_THE_DUPLICATED_ONE", "REQUEST_CODE_VIEW_WORKOUT_FROM_GSM", "REQUEST_CODE_RESCHEDULE_WORKOUT", "REQUEST_CODE_VIEW_MSN_WORKOUT_COPY", "MOBILE_LINK_VIEW_WORKOUT_REQUEST_CODE", "MOBILE_LINK_EDIT_WORKOUT_REQUEST_CODE", "REQUEST_CODE_WORKOUTS_APP_EDIT_WORKOUT", "REQUEST_CODE_WORKOUTS_APP_SEND_TO_DEVICE", "MSN_WORKOUT_DETAILS_REQUEST_CODE", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, Long l14) {
            Intent intentD = yc.l2.d(context, WorkoutDetailsActivity.class, "GCM_workout_id", j8);
            intentD.putExtra("GCM_preselected_device_id", l14);
            return intentD;
        }

        public static Intent b(Context context, long j8, long j14, boolean z14, boolean z15) {
            Intent intentD = sn.a.d(context, context, WorkoutDetailsActivity.class);
            intentD.putExtra("GCM_workout_id", j8);
            intentD.putExtra("GCM_workout_schedule_id", j14);
            intentD.putExtra("GCM_workout_is_protected", z14);
            intentD.putExtra("GCM_workout_is_stp", z15);
            return intentD;
        }

        public static void c(i.c cVar, long j8, int i14) {
            cVar.getClass();
            Intent intent = new Intent(cVar, (Class<?>) WorkoutDetailsActivity.class);
            intent.putExtra("GCM_extra_activity_type", i14);
            intent.putExtra("GCM_workout_id", j8);
            cVar.startActivityForResult(intent, i14);
        }

        private a() {
        }
    }
}
