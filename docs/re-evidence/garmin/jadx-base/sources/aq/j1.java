package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel", f = "EditExercisesMultiSelectViewModel.kt", l = {357, 358}, m = "updateReps", v = 2)
public final class j1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EditExercisesMultiSelectViewModel f12022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel, t13.d<? super j1> dVar) {
        super(dVar);
        this.f12022e = editExercisesMultiSelectViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12021d = obj;
        this.f12023f |= Integer.MIN_VALUE;
        return this.f12022e.H4(0, 0L, false, this);
    }
}
