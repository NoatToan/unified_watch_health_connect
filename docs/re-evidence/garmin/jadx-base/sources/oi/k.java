package oi;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloParseException;
import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lvh/f;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", l = {}, m = "invokeSuspend")
public final class k extends v13.i implements q<r53.j<? super vh.f<Object>>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Throwable f132235a;

    public k(t13.d<? super k> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super vh.f<Object>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        k kVar = new k(dVar);
        kVar.f132235a = th3;
        kVar.invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Throwable th3 = this.f132235a;
        h.f132193f.getClass();
        if (th3 instanceof ApolloException) {
            throw ((ApolloException) th3);
        }
        throw new ApolloParseException("Failed to parse GraphQL http network response", th3);
    }
}
