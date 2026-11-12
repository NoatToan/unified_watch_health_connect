package pi;

import com.apollographql.apollo3.exception.ApolloWebSocketClosedException;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpi/d;", "Lokhttp3/WebSocketListener;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d extends WebSocketListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.r<Unit> f137731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ li.b<String> f137732b;

    public d(o53.r<Unit> rVar, li.b<String> bVar) {
        this.f137731a = rVar;
        this.f137732b = bVar;
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(WebSocket webSocket, int i14, String str) {
        webSocket.getClass();
        str.getClass();
        this.f137732b.q(null);
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosing(WebSocket webSocket, int i14, String str) {
        webSocket.getClass();
        str.getClass();
        this.f137731a.p(Unit.INSTANCE);
        this.f137732b.q(new ApolloWebSocketClosedException(i14, str, null, 4, null));
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(WebSocket webSocket, Throwable th3, Response response) {
        webSocket.getClass();
        th3.getClass();
        this.f137731a.p(Unit.INSTANCE);
        this.f137732b.q(th3);
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket webSocket, w63.h hVar) {
        webSocket.getClass();
        hVar.getClass();
        this.f137732b.i(hVar.s());
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(WebSocket webSocket, Response response) {
        webSocket.getClass();
        response.getClass();
        this.f137731a.p(Unit.INSTANCE);
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket webSocket, String str) {
        webSocket.getClass();
        str.getClass();
        this.f137732b.i(str);
    }
}
