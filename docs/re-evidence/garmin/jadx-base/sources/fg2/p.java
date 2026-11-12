package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {444}, m = "registerUpdateHandlerListener", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71549c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f fVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f71548b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71547a = obj;
        this.f71549c |= Integer.MIN_VALUE;
        return f.c(this.f71548b, null, this);
    }
}
