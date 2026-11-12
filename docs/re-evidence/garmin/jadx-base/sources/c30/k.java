package c30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddNewPointUseCase", f = "AddNewPointUseCase.kt", l = {130, 131, 133}, m = "buildNewSegments", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.g f23918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.i.d f23919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.f f23920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f23921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f23923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f23924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23925h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f23924g = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23923f = obj;
        this.f23925h |= Integer.MIN_VALUE;
        int i14 = h.f23876f;
        return this.f23924g.c(null, null, null, null, this);
    }
}
