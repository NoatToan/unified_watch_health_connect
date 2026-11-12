package ei;

import p005kotlin.Metadata;
import vh.n0;
import vh.s0;
import vh.s0.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor", f = "ApolloCacheInterceptor.kt", l = {209}, m = "readFromCache")
public final class e<D extends s0.a> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vh.e f64096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n0 f64097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f64098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f64099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f64100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f64101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f64100e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64099d = obj;
        this.f64101f |= Integer.MIN_VALUE;
        return a.b(this.f64100e, null, null, this);
    }
}
