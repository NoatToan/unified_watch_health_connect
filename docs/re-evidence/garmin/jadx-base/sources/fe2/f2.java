package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.StartRequestProcessor", f = "StartRequestProcessor.kt", l = {36, 50}, m = "process", v = 2)
public final class f2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f70744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(e2 e2Var, t13.d<? super f2> dVar) {
        super(dVar);
        this.f70744b = e2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70743a = obj;
        this.f70745c |= Integer.MIN_VALUE;
        return this.f70744b.a(null, null, this);
    }
}
