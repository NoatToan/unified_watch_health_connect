package c30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddNewPointUseCase", f = "AddNewPointUseCase.kt", l = {149}, m = "buildCleanRoutedSegments", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.g f23914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f23916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23917d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f23916c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23915b = obj;
        this.f23917d |= Integer.MIN_VALUE;
        int i14 = h.f23876f;
        return this.f23916c.b(null, null, null, 0, this);
    }
}
