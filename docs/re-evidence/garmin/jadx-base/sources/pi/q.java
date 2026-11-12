package pi;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@v13.e(c = "com.apollographql.apollo3.network.ws.WsProtocol", f = "WsProtocol.kt", l = {131}, m = "receiveMessageMap")
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f137823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f137824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f137825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f137826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f137827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f137826d = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137825c = obj;
        this.f137827e |= Integer.MIN_VALUE;
        return this.f137826d.b(this);
    }
}
