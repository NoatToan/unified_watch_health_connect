package pi;

import okhttp3.WebSocket;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@v13.e(c = "com.apollographql.apollo3.network.ws.DefaultWebSocketEngine", f = "OkHttpWebSocketEngine.kt", l = {74}, m = "open")
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public li.b f137723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebSocket f137724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f137725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f137726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f137727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f137726d = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137725c = obj;
        this.f137727e |= Integer.MIN_VALUE;
        return this.f137726d.a(null, null, this);
    }
}
