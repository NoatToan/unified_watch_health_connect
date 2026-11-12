package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSessionCreator", f = "ClassicSessionCreator.kt", l = {93}, m = "handleSessionsNotCreated", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ae2.o.b f70878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f70879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f70880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f70880c = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70879b = obj;
        this.f70881d |= Integer.MIN_VALUE;
        int i14 = n.f70853g;
        return this.f70880c.b(null, this);
    }
}
