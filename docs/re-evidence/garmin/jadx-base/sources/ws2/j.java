package ws2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.FileManager", f = "FileManager.kt", l = {286}, m = "readFile")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f186992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.gfdi.file.a f186993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f186994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.garmin.gfdi.file.a aVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f186993b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f186992a = obj;
        this.f186994c |= Integer.MIN_VALUE;
        return this.f186993b.h(0, false, null, this);
    }
}
