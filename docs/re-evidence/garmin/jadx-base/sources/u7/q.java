package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f169294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f169295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f169298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m<Object> mVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f169297d = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169296c = obj;
        this.f169298e |= Integer.MIN_VALUE;
        return m.b(this.f169297d, this);
    }
}
