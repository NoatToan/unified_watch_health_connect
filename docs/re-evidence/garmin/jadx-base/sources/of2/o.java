package of2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession", f = "LSVSession.kt", l = {454, 455}, m = "notifySessionEnded", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rf2.e f131881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f131882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f131883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f131884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b bVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f131883c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131882b = obj;
        this.f131884d |= Integer.MIN_VALUE;
        int i14 = b.f131721p;
        return this.f131883c.e(null, this);
    }
}
