package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {465}, m = "registerSessionHandlerListener", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f71527b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71526a = obj;
        this.f71528c |= Integer.MIN_VALUE;
        return f.b(this.f71527b, null, this);
    }
}
