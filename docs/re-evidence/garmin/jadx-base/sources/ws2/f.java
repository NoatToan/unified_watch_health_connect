package ws2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.FileManager", f = "FileManager.kt", l = {511}, m = "getSupportedFileTypes")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f186977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.gfdi.file.a f186978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f186979c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.garmin.gfdi.file.a aVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f186978b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f186977a = obj;
        this.f186979c |= Integer.MIN_VALUE;
        return this.f186978b.e(this);
    }
}
