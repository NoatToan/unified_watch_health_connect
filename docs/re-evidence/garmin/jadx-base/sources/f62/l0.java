package f62;

import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel", f = "WorkoutEditCreateViewModel.kt", l = {1714, 1716, 1721, 1722, 1724, 1729}, m = "uploadAudioNoteAndProcessWorkoutSave", v = 2)
public final class l0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f69277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.workouts.data.model.a f69278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f69279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.r f69280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVar, t13.d<? super l0> dVar) {
        super(dVar);
        this.f69280d = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69279c = obj;
        this.f69281e |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.D4(this.f69280d, this);
    }
}
