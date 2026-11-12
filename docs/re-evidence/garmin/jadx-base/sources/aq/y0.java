package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel", f = "EditExercisesMultiSelectViewModel.kt", l = {375, 381, 386, 389, 390}, m = "doneEditMultiSets", v = 2)
public final class y0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f12302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.e f12303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.e f12304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f12308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ EditExercisesMultiSelectViewModel f12310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12311j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel, t13.d<? super y0> dVar) {
        super(dVar);
        this.f12310i = editExercisesMultiSelectViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12309h = obj;
        this.f12311j |= Integer.MIN_VALUE;
        return this.f12310i.z4(null, this);
    }
}
