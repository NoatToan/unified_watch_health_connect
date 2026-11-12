package yg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.ui.workout.ExerciseEditViewModel", f = "ExerciseEditViewModel.kt", l = {95}, m = "registerUpdateHandlerListener", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f197050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f197051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f197052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f197051b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f197050a = obj;
        this.f197052c |= Integer.MIN_VALUE;
        return h.x4(this.f197051b, null, this);
    }
}
