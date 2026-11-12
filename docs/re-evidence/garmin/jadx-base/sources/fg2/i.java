package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {243}, m = "getLiveActivityDefinition$live_session_view", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ag2.d f71515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f71516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f71517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f71517c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71516b = obj;
        this.f71518d |= Integer.MIN_VALUE;
        return this.f71517c.g(null, false, null, 0L, this);
    }
}
