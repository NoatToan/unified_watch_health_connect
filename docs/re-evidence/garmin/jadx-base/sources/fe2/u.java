package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicTerminator", f = "ClassicTerminator.kt", l = {26, 27, 29, 31, 32, 32, 32, 33, 33}, m = "terminateSessions", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f70936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.i0 f70937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o53.i0 f70938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o53.i0 f70939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f70940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f70941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f70942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f70943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f70944i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f70943h = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70942g = obj;
        this.f70944i |= Integer.MIN_VALUE;
        return this.f70943h.d(null, this);
    }
}
