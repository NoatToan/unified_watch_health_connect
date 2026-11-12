package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f169252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f169253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f169254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f169255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f169256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f169257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p.a f169258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f169259h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p.a aVar, t13.d dVar) {
        super(dVar);
        this.f169258g = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169257f = obj;
        this.f169259h |= Integer.MIN_VALUE;
        return this.f169258g.a(null, this);
    }
}
