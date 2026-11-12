package s53;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls53/p;", "Lt13/g;", "", JWKParameterNames.RSA_EXPONENT, "originalContext", "<init>", "(Ljava/lang/Throwable;Lt13/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements t13.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.g f157588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f157589b;

    public p(Throwable th3, t13.g gVar) {
        this.f157588a = gVar;
        this.f157589b = th3;
    }

    @Override // t13.g
    public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) this.f157588a.fold(r14, pVar);
    }

    @Override // t13.g
    public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        return (E) this.f157588a.get(bVar);
    }

    @Override // t13.g
    public final t13.g minusKey(t13.g.b<?> bVar) {
        return this.f157588a.minusKey(bVar);
    }

    @Override // t13.g
    public final t13.g plus(t13.g gVar) {
        return this.f157588a.plus(gVar);
    }
}
