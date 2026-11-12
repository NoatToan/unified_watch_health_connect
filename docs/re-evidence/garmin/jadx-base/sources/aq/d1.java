package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel", f = "EditExercisesMultiSelectViewModel.kt", l = {226}, m = "selectAll", v = 2)
public final class d1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditExercisesMultiSelectViewModel f11901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel, t13.d<? super d1> dVar) {
        super(dVar);
        this.f11901b = editExercisesMultiSelectViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11900a = obj;
        this.f11902c |= Integer.MIN_VALUE;
        return this.f11901b.E4(this);
    }
}
