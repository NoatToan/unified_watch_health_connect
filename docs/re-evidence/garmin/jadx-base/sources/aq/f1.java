package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel", f = "EditExercisesMultiSelectViewModel.kt", l = {339, 340}, m = "updateDuration", v = 2)
public final class f1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EditExercisesMultiSelectViewModel f11935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel, t13.d<? super f1> dVar) {
        super(dVar);
        this.f11935e = editExercisesMultiSelectViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11934d = obj;
        this.f11936f |= Integer.MIN_VALUE;
        return this.f11935e.F4(0, 0, false, this);
    }
}
