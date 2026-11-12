package ou1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.GetExerciseListWithTranslationUseCase", f = "GetExerciseListWithTranslationUseCase.kt", l = {41}, m = "getTranslationForExercises", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.d[] f134040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f134042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f134042c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134041b = obj;
        this.f134043d |= Integer.MIN_VALUE;
        return this.f134042c.a(null, null, this);
    }
}
