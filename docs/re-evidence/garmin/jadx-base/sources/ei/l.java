package ei;

import p005kotlin.Metadata;
import vh.n0;
import vh.n0.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore", f = "DefaultApolloStore.kt", l = {195}, m = "writeOperationWithRecords")
public final class l<D extends n0.a> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f64129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f64130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f64130b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64129a = obj;
        this.f64131c |= Integer.MIN_VALUE;
        return this.f64130b.g(null, this, null, null, null);
    }
}
