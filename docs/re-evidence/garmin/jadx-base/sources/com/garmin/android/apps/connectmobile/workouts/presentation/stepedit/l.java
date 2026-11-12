package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import e23.p;
import java.io.File;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditViewModel$updateAudioNote$1", f = "WorkoutStepEditViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f49726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f49727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.a f49728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, File file, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f49726b = jVar;
        this.f49727c = file;
        this.f49728d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f49726b, this.f49727c, this.f49728d, dVar);
        lVar.f49725a = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        j jVar = this.f49726b;
        j.a aVar2 = jVar.f49709i;
        if (aVar2 == null) {
            return Unit.INSTANCE;
        }
        aVar2.f49713d.set(this.f49727c);
        y0<j0> y0Var = jVar.f49703c;
        j0 j0VarG4 = jVar.G4();
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar3 = this.f49728d;
        y0Var.m(j0.b(j0VarG4, 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, aVar3 != null ? aVar3.getAudioNoteUuid() : null, this.f49728d, -1, 4095));
        return Unit.INSTANCE;
    }
}
