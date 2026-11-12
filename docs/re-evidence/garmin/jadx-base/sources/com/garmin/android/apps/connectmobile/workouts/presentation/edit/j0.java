package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportCreateEditActivity;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import f62.u0;
import java.util.ArrayList;
import java.util.Collection;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity$updateListView$1$1$1$1$2$2$1$1", f = "WorkoutPreCreateActivity.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutPreCreateActivity f49017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m52.k f49018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f49019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(WorkoutPreCreateActivity workoutPreCreateActivity, m52.k kVar, long j8, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f49017b = workoutPreCreateActivity;
        this.f49018c = kVar;
        this.f49019d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f49017b, this.f49018c, this.f49019d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Intent intentA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49016a;
        m52.k kVar = this.f49018c;
        WorkoutPreCreateActivity workoutPreCreateActivity = this.f49017b;
        if (i14 == 0) {
            o13.r.b(obj);
            WorkoutPreCreateActivity.a aVar2 = WorkoutPreCreateActivity.f48888d;
            u0 u0Var = (u0) workoutPreCreateActivity.f48889a.getValue();
            this.f49016a = 1;
            obj = u0Var.A4(kVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        ArrayList<String> arrayList = new ArrayList<>((Collection<? extends String>) obj);
        f.c<Intent> cVar = workoutPreCreateActivity.f48891c;
        m52.k kVar2 = m52.k.A;
        long j8 = this.f49019d;
        if (kVar == kVar2) {
            MultiSportCreateEditActivity.f49083f.getClass();
            intentA = new Intent(workoutPreCreateActivity, (Class<?>) MultiSportCreateEditActivity.class);
            intentA.putStringArrayListExtra("extra_workout_name_list", arrayList);
            intentA.putExtra("GCM_workout_queue_download_to_device", j8);
        } else {
            WorkoutCreateActivity.f48852j.getClass();
            intentA = WorkoutCreateActivity.a.a(workoutPreCreateActivity, kVar, arrayList, j8);
        }
        cVar.a(intentA, null);
        return Unit.INSTANCE;
    }
}
