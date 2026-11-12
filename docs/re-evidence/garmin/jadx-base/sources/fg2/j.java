package fg2;

import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {439}, m = "loadExerciseList", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f71519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f71520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f71521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f71521c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71520b = obj;
        this.f71522d |= Integer.MIN_VALUE;
        return f.a(this.f71521c, this);
    }
}
