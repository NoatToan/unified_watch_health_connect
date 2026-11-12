package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.StartRequestProcessor", f = "StartRequestProcessor.kt", l = {79, 87, 92}, m = "processClassic", v = 2)
public final class g2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f70759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(e2 e2Var, t13.d<? super g2> dVar) {
        super(dVar);
        this.f70759b = e2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70758a = obj;
        this.f70760c |= Integer.MIN_VALUE;
        int i14 = e2.f70727d;
        return this.f70759b.b(null, null, 0, this);
    }
}
