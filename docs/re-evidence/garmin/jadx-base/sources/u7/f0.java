package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.p0 f169125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f169126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f169128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(m<Object> mVar, t13.d<? super f0> dVar) {
        super(dVar);
        this.f169127c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169126b = obj;
        this.f169128d |= Integer.MIN_VALUE;
        return this.f169127c.j(null, false, this);
    }
}
