package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel", f = "EditExercisesMultiSelectViewModel.kt", l = {234}, m = "clearAllSelection", v = 2)
public final class w0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditExercisesMultiSelectViewModel f12277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel, t13.d<? super w0> dVar) {
        super(dVar);
        this.f12277b = editExercisesMultiSelectViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12276a = obj;
        this.f12278c |= Integer.MIN_VALUE;
        return this.f12277b.x4(this);
    }
}
