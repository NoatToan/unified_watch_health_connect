package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import c62.k1;
import c62.l2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import java.util.List;
import p005kotlin.Metadata;
import ww1.i0;

/* JADX INFO: loaded from: classes9.dex */
public interface e extends k1, r52.h {
    e C(WorkoutDetailsDTO workoutDetailsDTO, c62.c cVar);

    /* JADX INFO: renamed from: G */
    WorkoutScheduleDTO getF48578b();

    e K(l2 l2Var);

    /* JADX INFO: renamed from: e */
    com.garmin.android.apps.connectmobile.workouts.presentation.details.a getF48584h();

    /* JADX INFO: renamed from: i */
    com.garmin.android.apps.connectmobile.workouts.presentation.details.b getF48585i();

    e k(WorkoutDetailsDTO workoutDetailsDTO);

    e m(com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar);

    /* JADX INFO: renamed from: n */
    z52.a getF48586j();

    e q(com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar);

    /* JADX INFO: renamed from: r */
    l2 getF48582f();

    /* JADX INFO: renamed from: s */
    WorkoutDetailsDTO getF48577a();

    /* JADX INFO: renamed from: w */
    com.garmin.android.apps.connectmobile.workouts.data.model.y getF48583g();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/k1;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "workoutDetails", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutScheduleDTO;", "workoutSchedule", "info", "Lc62/l2;", "workoutLoadingDialogState", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/y;", "startWorkoutType", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/a;", "activityInProgressDialogState", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/b;", "deviceDisconnectedDialogState", "Lz52/a;", "biometricsProvider", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutScheduleDTO;Lc62/k1;Lc62/l2;Lcom/garmin/android/apps/connectmobile/workouts/data/model/y;Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/a;Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/b;Lz52/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements e, k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkoutDetailsDTO f48569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WorkoutScheduleDTO f48570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k1 f48571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l2 f48572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.data.model.y f48573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.details.a f48574f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.details.b f48575g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final z52.a f48576h;

        public /* synthetic */ a(WorkoutDetailsDTO workoutDetailsDTO, WorkoutScheduleDTO workoutScheduleDTO, k1 k1Var, l2 l2Var, com.garmin.android.apps.connectmobile.workouts.data.model.y yVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar, z52.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(workoutDetailsDTO, workoutScheduleDTO, k1Var, (i14 & 8) != 0 ? new l2(false, null, null, 7, null) : l2Var, yVar, (i14 & 32) != 0 ? com.garmin.android.apps.connectmobile.workouts.presentation.details.a.C0944a.f48507a : aVar, (i14 & 64) != 0 ? com.garmin.android.apps.connectmobile.workouts.presentation.details.b.a.f48509a : bVar, aVar2);
        }

        public static a L(a aVar, WorkoutDetailsDTO workoutDetailsDTO, k1 k1Var, l2 l2Var, com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar2, com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar, int i14) {
            if ((i14 & 1) != 0) {
                workoutDetailsDTO = aVar.f48569a;
            }
            WorkoutDetailsDTO workoutDetailsDTO2 = workoutDetailsDTO;
            WorkoutScheduleDTO workoutScheduleDTO = aVar.f48570b;
            if ((i14 & 4) != 0) {
                k1Var = aVar.f48571c;
            }
            k1 k1Var2 = k1Var;
            if ((i14 & 8) != 0) {
                l2Var = aVar.f48572d;
            }
            l2 l2Var2 = l2Var;
            com.garmin.android.apps.connectmobile.workouts.data.model.y yVar = aVar.f48573e;
            if ((i14 & 32) != 0) {
                aVar2 = aVar.f48574f;
            }
            com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar3 = aVar2;
            if ((i14 & 64) != 0) {
                bVar = aVar.f48575g;
            }
            com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar2 = bVar;
            z52.a aVar4 = aVar.f48576h;
            workoutDetailsDTO2.getClass();
            k1Var2.getClass();
            l2Var2.getClass();
            yVar.getClass();
            aVar3.getClass();
            bVar2.getClass();
            return new a(workoutDetailsDTO2, workoutScheduleDTO, k1Var2, l2Var2, yVar, aVar3, bVar2, aVar4);
        }

        @Override // c62.n2
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d A() {
            return this.f48571c.A();
        }

        @Override // c62.n2
        public final m52.k B() {
            return this.f48571c.B();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        public final e C(WorkoutDetailsDTO workoutDetailsDTO, c62.c cVar) {
            return L(this, workoutDetailsDTO, this.f48571c.J(cVar), null, null, null, 250);
        }

        @Override // c62.n2
        public final String D() {
            return this.f48571c.D();
        }

        @Override // c62.k1
        public final List<i0> E() {
            return this.f48571c.E();
        }

        @Override // c62.k1
        public final com.garmin.android.apps.connectmobile.workouts.data.model.a F() {
            return this.f48571c.F();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: G, reason: from getter */
        public final WorkoutScheduleDTO getF48578b() {
            return this.f48570b;
        }

        @Override // c62.n2
        public final PowerZonesDTO H() {
            return this.f48571c.H();
        }

        @Override // c62.k1
        public final f62.p I() {
            return this.f48571c.I();
        }

        @Override // c62.k1
        public final k1 J(c62.c cVar) {
            return this.f48571c.J(cVar);
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        public final e K(l2 l2Var) {
            return L(this, null, null, l2Var, null, null, 247);
        }

        @Override // c62.k1
        public final long a() {
            return this.f48571c.a();
        }

        @Override // c62.n2
        public final f62.o b() {
            return this.f48571c.b();
        }

        @Override // c62.n2
        public final com.garmin.android.apps.connectmobile.repcounting.model.c c() {
            return this.f48571c.c();
        }

        @Override // c62.n2
        public final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> d() {
            return this.f48571c.d();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: e, reason: from getter */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.details.a getF48584h() {
            return this.f48574f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f48569a, aVar.f48569a) && p005kotlin.jvm.internal.s.g(this.f48570b, aVar.f48570b) && p005kotlin.jvm.internal.s.g(this.f48571c, aVar.f48571c) && p005kotlin.jvm.internal.s.g(this.f48572d, aVar.f48572d) && p005kotlin.jvm.internal.s.g(this.f48573e, aVar.f48573e) && p005kotlin.jvm.internal.s.g(this.f48574f, aVar.f48574f) && p005kotlin.jvm.internal.s.g(this.f48575g, aVar.f48575g) && p005kotlin.jvm.internal.s.g(this.f48576h, aVar.f48576h);
        }

        @Override // c62.k1
        public final boolean f() {
            return this.f48571c.f();
        }

        @Override // c62.k1
        public final boolean g() {
            return this.f48571c.g();
        }

        @Override // c62.k1
        public final boolean h() {
            return this.f48571c.h();
        }

        public final int hashCode() {
            int iHashCode = this.f48569a.hashCode() * 31;
            WorkoutScheduleDTO workoutScheduleDTO = this.f48570b;
            int iHashCode2 = (this.f48575g.hashCode() + ((this.f48574f.hashCode() + ((this.f48573e.hashCode() + ((this.f48572d.hashCode() + ((this.f48571c.hashCode() + ((iHashCode + (workoutScheduleDTO == null ? 0 : workoutScheduleDTO.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            z52.a aVar = this.f48576h;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: i, reason: from getter */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.details.b getF48585i() {
            return this.f48575g;
        }

        @Override // c62.k1
        public final boolean j() {
            return this.f48571c.j();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        public final e k(WorkoutDetailsDTO workoutDetailsDTO) {
            workoutDetailsDTO.getClass();
            return L(this, workoutDetailsDTO, null, null, null, null, 254);
        }

        @Override // c62.k1
        public final c62.c l() {
            return this.f48571c.l();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        public final e m(com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar) {
            aVar.getClass();
            return L(this, null, null, null, aVar, null, 223);
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: n, reason: from getter */
        public final z52.a getF48586j() {
            return this.f48576h;
        }

        @Override // c62.n2
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.g o() {
            return this.f48571c.o();
        }

        @Override // c62.n2
        public final l52.i<j0> p() {
            return this.f48571c.p();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        public final e q(com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar) {
            bVar.getClass();
            return L(this, null, null, null, null, bVar, 191);
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: r, reason: from getter */
        public final l2 getF48582f() {
            return this.f48572d;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: s, reason: from getter */
        public final WorkoutDetailsDTO getF48577a() {
            return this.f48569a;
        }

        @Override // c62.k1
        public final boolean t() {
            return this.f48571c.t();
        }

        public final String toString() {
            return "NonRepCountingWorkoutDetails(workoutDetails=" + this.f48569a + ", workoutSchedule=" + this.f48570b + ", info=" + this.f48571c + ", workoutLoadingDialogState=" + this.f48572d + ", startWorkoutType=" + this.f48573e + ", activityInProgressDialogState=" + this.f48574f + ", deviceDisconnectedDialogState=" + this.f48575g + ", biometricsProvider=" + this.f48576h + ")";
        }

        @Override // c62.n2
        public final String u() {
            return this.f48571c.u();
        }

        @Override // c62.k1
        public final boolean v() {
            return this.f48571c.v();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: w, reason: from getter */
        public final com.garmin.android.apps.connectmobile.workouts.data.model.y getF48583g() {
            return this.f48573e;
        }

        @Override // c62.k1
        public final c x() {
            return this.f48571c.x();
        }

        @Override // c62.n2
        public final double y() {
            return this.f48571c.y();
        }

        @Override // c62.n2
        public final o13.p<Boolean, Double> z() {
            return this.f48571c.z();
        }

        public a(WorkoutDetailsDTO workoutDetailsDTO, WorkoutScheduleDTO workoutScheduleDTO, k1 k1Var, l2 l2Var, com.garmin.android.apps.connectmobile.workouts.data.model.y yVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar, z52.a aVar2) {
            workoutDetailsDTO.getClass();
            k1Var.getClass();
            l2Var.getClass();
            yVar.getClass();
            aVar.getClass();
            bVar.getClass();
            this.f48569a = workoutDetailsDTO;
            this.f48570b = workoutScheduleDTO;
            this.f48571c = k1Var;
            this.f48572d = l2Var;
            this.f48573e = yVar;
            this.f48574f = aVar;
            this.f48575g = bVar;
            this.f48576h = aVar2;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/k1;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "workoutDetails", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutScheduleDTO;", "workoutSchedule", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseList", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "benchmarks", "info", "Lc62/l2;", "workoutLoadingDialogState", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/y;", "startWorkoutType", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/a;", "activityInProgressDialogState", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/b;", "deviceDisconnectedDialogState", "Lz52/a;", "biometricsProvider", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutScheduleDTO;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Ljava/util/List;Lc62/k1;Lc62/l2;Lcom/garmin/android/apps/connectmobile/workouts/data/model/y;Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/a;Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/b;Lz52/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements e, k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkoutDetailsDTO f48577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WorkoutScheduleDTO f48578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.repcounting.model.c f48579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f48580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final k1 f48581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l2 f48582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.data.model.y f48583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.details.a f48584h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.details.b f48585i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final z52.a f48586j;

        public /* synthetic */ b(WorkoutDetailsDTO workoutDetailsDTO, WorkoutScheduleDTO workoutScheduleDTO, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, List list, k1 k1Var, l2 l2Var, com.garmin.android.apps.connectmobile.workouts.data.model.y yVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar, z52.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(workoutDetailsDTO, workoutScheduleDTO, cVar, list, k1Var, (i14 & 32) != 0 ? new l2(false, null, null, 7, null) : l2Var, yVar, (i14 & 128) != 0 ? com.garmin.android.apps.connectmobile.workouts.presentation.details.a.C0944a.f48507a : aVar, (i14 & 256) != 0 ? com.garmin.android.apps.connectmobile.workouts.presentation.details.b.a.f48509a : bVar, aVar2);
        }

        public static b L(b bVar, WorkoutDetailsDTO workoutDetailsDTO, k1 k1Var, l2 l2Var, com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar2, int i14) {
            if ((i14 & 1) != 0) {
                workoutDetailsDTO = bVar.f48577a;
            }
            WorkoutDetailsDTO workoutDetailsDTO2 = workoutDetailsDTO;
            WorkoutScheduleDTO workoutScheduleDTO = bVar.f48578b;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = bVar.f48579c;
            List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list = bVar.f48580d;
            if ((i14 & 16) != 0) {
                k1Var = bVar.f48581e;
            }
            k1 k1Var2 = k1Var;
            l2 l2Var2 = (i14 & 32) != 0 ? bVar.f48582f : l2Var;
            com.garmin.android.apps.connectmobile.workouts.data.model.y yVar = bVar.f48583g;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar2 = (i14 & 128) != 0 ? bVar.f48584h : aVar;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar3 = (i14 & 256) != 0 ? bVar.f48585i : bVar2;
            z52.a aVar3 = bVar.f48586j;
            workoutDetailsDTO2.getClass();
            cVar.getClass();
            k1Var2.getClass();
            l2Var2.getClass();
            yVar.getClass();
            aVar2.getClass();
            bVar3.getClass();
            return new b(workoutDetailsDTO2, workoutScheduleDTO, cVar, list, k1Var2, l2Var2, yVar, aVar2, bVar3, aVar3);
        }

        @Override // c62.n2
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d A() {
            return this.f48581e.A();
        }

        @Override // c62.n2
        public final m52.k B() {
            return this.f48581e.B();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        public final e C(WorkoutDetailsDTO workoutDetailsDTO, c62.c cVar) {
            return L(this, workoutDetailsDTO, this.f48581e.J(cVar), null, null, null, 1006);
        }

        @Override // c62.n2
        public final String D() {
            return this.f48581e.D();
        }

        @Override // c62.k1
        public final List<i0> E() {
            return this.f48581e.E();
        }

        @Override // c62.k1
        public final com.garmin.android.apps.connectmobile.workouts.data.model.a F() {
            return this.f48581e.F();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: G, reason: from getter */
        public final WorkoutScheduleDTO getF48578b() {
            return this.f48578b;
        }

        @Override // c62.n2
        public final PowerZonesDTO H() {
            return this.f48581e.H();
        }

        @Override // c62.k1
        public final f62.p I() {
            return this.f48581e.I();
        }

        @Override // c62.k1
        public final k1 J(c62.c cVar) {
            return this.f48581e.J(cVar);
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        public final e K(l2 l2Var) {
            return L(this, null, null, l2Var, null, null, 991);
        }

        @Override // c62.k1
        public final long a() {
            return this.f48581e.a();
        }

        @Override // c62.n2
        public final f62.o b() {
            return this.f48581e.b();
        }

        @Override // c62.n2
        public final com.garmin.android.apps.connectmobile.repcounting.model.c c() {
            return this.f48581e.c();
        }

        @Override // c62.n2
        public final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> d() {
            return this.f48581e.d();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: e, reason: from getter */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.details.a getF48584h() {
            return this.f48584h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f48577a, bVar.f48577a) && p005kotlin.jvm.internal.s.g(this.f48578b, bVar.f48578b) && p005kotlin.jvm.internal.s.g(this.f48579c, bVar.f48579c) && p005kotlin.jvm.internal.s.g(this.f48580d, bVar.f48580d) && p005kotlin.jvm.internal.s.g(this.f48581e, bVar.f48581e) && p005kotlin.jvm.internal.s.g(this.f48582f, bVar.f48582f) && p005kotlin.jvm.internal.s.g(this.f48583g, bVar.f48583g) && p005kotlin.jvm.internal.s.g(this.f48584h, bVar.f48584h) && p005kotlin.jvm.internal.s.g(this.f48585i, bVar.f48585i) && p005kotlin.jvm.internal.s.g(this.f48586j, bVar.f48586j);
        }

        @Override // c62.k1
        public final boolean f() {
            return this.f48581e.f();
        }

        @Override // c62.k1
        public final boolean g() {
            return this.f48581e.g();
        }

        @Override // c62.k1
        public final boolean h() {
            return this.f48581e.h();
        }

        public final int hashCode() {
            int iHashCode = this.f48577a.hashCode() * 31;
            WorkoutScheduleDTO workoutScheduleDTO = this.f48578b;
            int iHashCode2 = (this.f48579c.hashCode() + ((iHashCode + (workoutScheduleDTO == null ? 0 : workoutScheduleDTO.hashCode())) * 31)) * 31;
            List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list = this.f48580d;
            int iHashCode3 = (this.f48585i.hashCode() + ((this.f48584h.hashCode() + ((this.f48583g.hashCode() + ((this.f48582f.hashCode() + ((this.f48581e.hashCode() + ((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            z52.a aVar = this.f48586j;
            return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: i, reason: from getter */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.details.b getF48585i() {
            return this.f48585i;
        }

        @Override // c62.k1
        public final boolean j() {
            return this.f48581e.j();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        public final e k(WorkoutDetailsDTO workoutDetailsDTO) {
            workoutDetailsDTO.getClass();
            return L(this, workoutDetailsDTO, null, null, null, null, 1022);
        }

        @Override // c62.k1
        public final c62.c l() {
            return this.f48581e.l();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        public final e m(com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar) {
            aVar.getClass();
            return L(this, null, null, null, aVar, null, 895);
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: n, reason: from getter */
        public final z52.a getF48586j() {
            return this.f48586j;
        }

        @Override // c62.n2
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.g o() {
            return this.f48581e.o();
        }

        @Override // c62.n2
        public final l52.i<j0> p() {
            return this.f48581e.p();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        public final e q(com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar) {
            bVar.getClass();
            return L(this, null, null, null, null, bVar, 767);
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: r, reason: from getter */
        public final l2 getF48582f() {
            return this.f48582f;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: s, reason: from getter */
        public final WorkoutDetailsDTO getF48577a() {
            return this.f48577a;
        }

        @Override // c62.k1
        public final boolean t() {
            return this.f48581e.t();
        }

        public final String toString() {
            return "RepCountingWorkoutDetails(workoutDetails=" + this.f48577a + ", workoutSchedule=" + this.f48578b + ", exerciseList=" + this.f48579c + ", benchmarks=" + this.f48580d + ", info=" + this.f48581e + ", workoutLoadingDialogState=" + this.f48582f + ", startWorkoutType=" + this.f48583g + ", activityInProgressDialogState=" + this.f48584h + ", deviceDisconnectedDialogState=" + this.f48585i + ", biometricsProvider=" + this.f48586j + ")";
        }

        @Override // c62.n2
        public final String u() {
            return this.f48581e.u();
        }

        @Override // c62.k1
        public final boolean v() {
            return this.f48581e.v();
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.e
        /* JADX INFO: renamed from: w, reason: from getter */
        public final com.garmin.android.apps.connectmobile.workouts.data.model.y getF48583g() {
            return this.f48583g;
        }

        @Override // c62.k1
        public final c x() {
            return this.f48581e.x();
        }

        @Override // c62.n2
        public final double y() {
            return this.f48581e.y();
        }

        @Override // c62.n2
        public final o13.p<Boolean, Double> z() {
            return this.f48581e.z();
        }

        public b(WorkoutDetailsDTO workoutDetailsDTO, WorkoutScheduleDTO workoutScheduleDTO, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list, k1 k1Var, l2 l2Var, com.garmin.android.apps.connectmobile.workouts.data.model.y yVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.a aVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar, z52.a aVar2) {
            workoutDetailsDTO.getClass();
            cVar.getClass();
            k1Var.getClass();
            l2Var.getClass();
            yVar.getClass();
            aVar.getClass();
            bVar.getClass();
            this.f48577a = workoutDetailsDTO;
            this.f48578b = workoutScheduleDTO;
            this.f48579c = cVar;
            this.f48580d = list;
            this.f48581e = k1Var;
            this.f48582f = l2Var;
            this.f48583g = yVar;
            this.f48584h = aVar;
            this.f48585i = bVar;
            this.f48586j = aVar2;
        }
    }
}
