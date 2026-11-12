package t13;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface e extends g.a {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final a f161746w0 = a.f161747a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lt13/e$a;", "Lt13/g$b;", "Lt13/e;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements g.b<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f161747a = new a();

        private a() {
        }
    }

    <T> d<T> interceptContinuation(d<? super T> dVar);

    void releaseInterceptedContinuation(d<?> dVar);
}
