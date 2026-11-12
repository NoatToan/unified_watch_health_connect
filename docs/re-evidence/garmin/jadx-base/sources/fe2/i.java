package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession", f = "ClassicSession.kt", l = {95, 96}, m = "stop", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f70773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f70773b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70772a = obj;
        this.f70774c |= Integer.MIN_VALUE;
        return this.f70773b.g(null, this);
    }
}
