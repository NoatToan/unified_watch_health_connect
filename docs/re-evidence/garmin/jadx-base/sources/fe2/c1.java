package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenTerminator", f = "DeviceDrivenTerminator.kt", l = {45}, m = "terminateSessionById", v = 2)
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f70682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(z0 z0Var, t13.d<? super c1> dVar) {
        super(dVar);
        this.f70682b = z0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70681a = obj;
        this.f70683c |= Integer.MIN_VALUE;
        return this.f70682b.c(null, this);
    }
}
