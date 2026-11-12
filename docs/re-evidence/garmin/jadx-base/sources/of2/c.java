package of2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession", f = "LSVSession.kt", l = {561}, m = "clean$live_session_view", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f131769b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131768a = obj;
        this.f131770c |= Integer.MIN_VALUE;
        return this.f131769b.c(this);
    }
}
