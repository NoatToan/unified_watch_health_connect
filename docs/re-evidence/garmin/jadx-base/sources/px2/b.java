package px2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.samd.protoimpl.EcgServiceHandler", f = "EcgServiceHandler.kt", l = {83}, m = "sendAppStatusRequest$SaMD_release")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f141781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f141783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f141783c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141782b = obj;
        this.f141784d |= Integer.MIN_VALUE;
        return this.f141783c.d(this);
    }
}
