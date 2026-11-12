package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession", f = "ClassicSession.kt", l = {107}, m = "stopSession", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v1 f70784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f70785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f70786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f70786c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70785b = obj;
        this.f70787d |= Integer.MIN_VALUE;
        return this.f70786c.p(null, this);
    }
}
