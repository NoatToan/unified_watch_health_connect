package com.garmin.android.apps.connectmobile.workouts.presentation.reschedule;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p3.x3;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/reschedule/RescheduleSTPWorkoutActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "", "isLoading", "isError", "Ll62/g;", "rescheduleState", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RescheduleSTPWorkoutActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49530b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f49531a = new w1(s0.f105811a.b(l62.d.class), new e(this), new d(this), new f(null, this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.reschedule.RescheduleSTPWorkoutActivity$onCreate$1$1$3$1", f = "RescheduleSTPWorkoutActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Long f49532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RescheduleSTPWorkoutActivity f49533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f49534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WorkoutScheduleDTO f49535d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l14, RescheduleSTPWorkoutActivity rescheduleSTPWorkoutActivity, long j8, WorkoutScheduleDTO workoutScheduleDTO, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f49532a = l14;
            this.f49533b = rescheduleSTPWorkoutActivity;
            this.f49534c = j8;
            this.f49535d = workoutScheduleDTO;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f49532a, this.f49533b, this.f49534c, this.f49535d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Long l14 = this.f49532a;
            if (l14 != null) {
                a aVar2 = RescheduleSTPWorkoutActivity.f49530b;
                l62.d dVarCa = this.f49533b.ca();
                long jLongValue = l14.longValue();
                DateTime dateTimeC = this.f49535d.C();
                if (dateTimeC == null) {
                    dateTimeC = DateTime.now();
                }
                DateTime dateTime = dateTimeC;
                dateTime.getClass();
                w9.a aVarA = v1.a(dVarCa);
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new l62.b(dVarCa, jLongValue, dateTime, this.f49534c, null), 2);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.reschedule.RescheduleSTPWorkoutActivity$onCreate$1$1$4$1", f = "RescheduleSTPWorkoutActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f49537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3<Boolean> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f49537b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return RescheduleSTPWorkoutActivity.this.new c(this.f49537b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = RescheduleSTPWorkoutActivity.f49530b;
            if (this.f49537b.getF182175a().booleanValue()) {
                RescheduleSTPWorkoutActivity rescheduleSTPWorkoutActivity = RescheduleSTPWorkoutActivity.this;
                rescheduleSTPWorkoutActivity.displayFailedMessage();
                l62.d dVarCa = rescheduleSTPWorkoutActivity.ca();
                w9.a aVarA = v1.a(dVarCa);
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new l62.a(dVarCa, null), 2);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f49538a;

        public d(g gVar) {
            this.f49538a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f49538a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f49539a;

        public e(g gVar) {
            this.f49539a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49539a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f49541b;

        public f(e23.a aVar, g gVar) {
            this.f49540a = aVar;
            this.f49541b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49540a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49541b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final l62.d ca() {
        return (l62.d) this.f49531a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WorkoutScheduleDTO workoutScheduleDTO;
        WorkoutDetailsDTO workoutDetailsDTO;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        Bundle extras = getIntent().getExtras();
        Long lValueOf = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_workout_lite_data", WorkoutScheduleDTO.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_workout_lite_data");
                if (!(parcelable2 instanceof WorkoutScheduleDTO)) {
                    parcelable2 = null;
                }
                parcelable = (WorkoutScheduleDTO) parcelable2;
            }
            workoutScheduleDTO = (WorkoutScheduleDTO) parcelable;
        } else {
            workoutScheduleDTO = null;
        }
        long j8 = workoutScheduleDTO != null ? workoutScheduleDTO.f48067c : -1L;
        if (workoutScheduleDTO != null && (workoutDetailsDTO = workoutScheduleDTO.f48065a) != null) {
            lValueOf = Long.valueOf(workoutDetailsDTO.Y);
        }
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1603134371, true, new da0.d(this, lValueOf, j8, workoutScheduleDTO, 3)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/reschedule/RescheduleSTPWorkoutActivity$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
