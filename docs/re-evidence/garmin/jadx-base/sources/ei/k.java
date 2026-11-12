package ei;

import p005kotlin.Metadata;
import vh.n0;
import vh.n0.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore", f = "DefaultApolloStore.kt", l = {143}, m = "writeOperation")
public final class k<D extends n0.a> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f64126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f64127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f64127b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64126a = obj;
        this.f64128c |= Integer.MIN_VALUE;
        return this.f64127b.a(null, this, null, null, null);
    }
}
