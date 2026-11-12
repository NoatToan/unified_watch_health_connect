package ws2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.FileManager", f = "FileManager.kt", l = {263}, m = "write")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f186996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f186997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.gfdi.file.a f186998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f186999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.garmin.gfdi.file.a aVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f186998d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f186997c = obj;
        this.f186999e |= Integer.MIN_VALUE;
        int i14 = com.garmin.gfdi.file.a.f52360l;
        return this.f186998d.i(null, 0, null, null, 0L, false, null, this);
    }
}
