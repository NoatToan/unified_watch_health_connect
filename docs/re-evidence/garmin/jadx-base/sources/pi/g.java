package pi;

import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@v13.e(c = "com.apollographql.apollo3.network.ws.SubscriptionWsProtocol", f = "SubscriptionWsProtocol.kt", l = {31, 38}, m = "connectionInit")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f137740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedHashMap f137741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f137742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f137743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f137744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f137743d = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137742c = obj;
        this.f137744e |= Integer.MIN_VALUE;
        return this.f137743d.g(this);
    }
}
