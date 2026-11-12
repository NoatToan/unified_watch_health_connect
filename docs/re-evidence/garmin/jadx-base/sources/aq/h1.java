package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel", f = "EditExercisesMultiSelectViewModel.kt", l = {266, 267}, m = "updateExerciseAndWeight", v = 2)
public final class h1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EditExercisesMultiSelectViewModel f11977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11978f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel, t13.d<? super h1> dVar) {
        super(dVar);
        this.f11977e = editExercisesMultiSelectViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11976d = obj;
        this.f11978f |= Integer.MIN_VALUE;
        return this.f11977e.G4(0, null, null, false, this);
    }
}
