package c30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddNewPointUseCase", f = "AddNewPointUseCase.kt", l = {230}, m = "buildSimpleSegment", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.g f23934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f23936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23937d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f23936c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23935b = obj;
        this.f23937d |= Integer.MIN_VALUE;
        int i14 = h.f23876f;
        return this.f23936c.d(null, null, null, null, this);
    }
}
