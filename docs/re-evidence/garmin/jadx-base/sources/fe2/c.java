package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession", f = "ClassicSession.kt", l = {214}, m = "handleSessionCreated", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f70676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f70676b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70675a = obj;
        this.f70677c |= Integer.MIN_VALUE;
        int i14 = b.f70632t;
        return this.f70676b.u(null, this);
    }
}
