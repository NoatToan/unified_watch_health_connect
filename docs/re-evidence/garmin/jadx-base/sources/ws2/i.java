package ws2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.FileManager", f = "FileManager.kt", l = {441, 443, 444}, m = "listFiles")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f186988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f186989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.gfdi.file.a f186990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f186991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.garmin.gfdi.file.a aVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f186990c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f186989b = obj;
        this.f186991d |= Integer.MIN_VALUE;
        return this.f186990c.g(null, this);
    }
}
