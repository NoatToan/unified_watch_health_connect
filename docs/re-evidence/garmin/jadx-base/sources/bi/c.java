package bi;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.CacheMissException;
import p005kotlin.Metadata;
import vh.g0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0016\u0017BE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB5\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0015¨\u0006\u0018"}, d2 = {"Lbi/c;", "Lvh/g0$b;", "", "cacheStartMillis", "cacheEndMillis", "networkStartMillis", "networkEndMillis", "", "isCacheHit", "Lcom/apollographql/apollo3/exception/CacheMissException;", "cacheMissException", "Lcom/apollographql/apollo3/exception/ApolloException;", "networkException", "<init>", "(JJJJZLcom/apollographql/apollo3/exception/CacheMissException;Lcom/apollographql/apollo3/exception/ApolloException;)V", "millisStart", "millisEnd", "hit", "", "missedKey", "missedField", "(JJZLjava/lang/String;Ljava/lang/String;)V", "a", "b", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements g0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f17923h = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ApolloException f17929g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbi/c$a;", "", "<init>", "()V", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f17930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f17931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f17932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f17933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CacheMissException f17935f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ApolloException f17936g;

        public final c a() {
            return new c(this.f17930a, this.f17931b, this.f17932c, this.f17933d, this.f17934e, this.f17935f, this.f17936g, null);
        }
    }

    @o13.e
    public c(long j8, long j14, boolean z14, String str, String str2) {
        this(j8, j14, 0L, 0L, z14, str != null ? new CacheMissException(str, str2) : null, null);
    }

    @Override // vh.g0
    public final g0 a(g0.c<?> cVar) {
        return g0.b.a.c(this, cVar);
    }

    @Override // vh.g0
    public final <E extends g0.b> E b(g0.c<E> cVar) {
        return (E) g0.b.a.b(this, cVar);
    }

    @Override // vh.g0
    public final g0 c(g0 g0Var) {
        return g0.b.a.d(g0Var, this);
    }

    public final a d() {
        a aVar = new a();
        aVar.f17930a = this.f17924b;
        aVar.f17931b = this.f17925c;
        aVar.f17932c = this.f17926d;
        aVar.f17933d = this.f17927e;
        aVar.f17934e = this.f17928f;
        aVar.f17936g = this.f17929g;
        return aVar;
    }

    @Override // vh.g0
    public final <R> R fold(R r14, e23.p<? super R, ? super g0.b, ? extends R> pVar) {
        return (R) g0.b.a.a(this, r14, pVar);
    }

    @Override // vh.g0.b
    public final g0.c<?> getKey() {
        return f17923h;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbi/c$b;", "Lvh/g0$c;", "Lbi/c;", "<init>", "()V", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements g0.c<c> {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    private c(long j8, long j14, long j15, long j16, boolean z14, CacheMissException cacheMissException, ApolloException apolloException) {
        this.f17924b = j8;
        this.f17925c = j14;
        this.f17926d = j15;
        this.f17927e = j16;
        this.f17928f = z14;
        this.f17929g = apolloException;
    }

    public /* synthetic */ c(long j8, long j14, long j15, long j16, boolean z14, CacheMissException cacheMissException, ApolloException apolloException, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, z14, cacheMissException, apolloException);
    }
}
