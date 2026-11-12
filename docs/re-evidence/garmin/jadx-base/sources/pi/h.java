package pi;

import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.garmin.android.gncs.NotificationConstants;
import i3.e5;
import java.util.Map;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$connectionInit$2", f = "SubscriptionWsProtocol.kt", l = {39}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f137746b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f137746b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f137746b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137745a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f137745a = 1;
            obj = this.f137746b.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        Map map = (Map) obj;
        Object obj2 = map.get(NotificationConstants.KEY_DATA_MIME_TYPE);
        if (s.g(obj2, "connection_ack")) {
            return Unit.INSTANCE;
        }
        if (s.g(obj2, "connection_error")) {
            throw new ApolloNetworkException("Connection error:\n" + map, null, 2, null);
        }
        System.out.println((Object) e5.f(obj2, "unknown message while waiting for connection_ack: '"));
        return Unit.INSTANCE;
    }
}
