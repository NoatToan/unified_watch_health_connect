package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel", f = "EditExercisesMultiSelectViewModel.kt", l = {218, 219}, m = "removeItems", v = 2)
public final class b1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditExercisesMultiSelectViewModel f11833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel, t13.d<? super b1> dVar) {
        super(dVar);
        this.f11833b = editExercisesMultiSelectViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11832a = obj;
        this.f11834c |= Integer.MIN_VALUE;
        return this.f11833b.D4(null, this);
    }
}
