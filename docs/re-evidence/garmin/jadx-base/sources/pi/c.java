package pi;

import okhttp3.WebSocket;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpi/c;", "Lpi/i;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ li.b<String> f137729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebSocket f137730b;

    public c(li.b<String> bVar, WebSocket webSocket) {
        this.f137729a = bVar;
        this.f137730b = webSocket;
    }

    @Override // pi.i
    public final Object a(q qVar) {
        return this.f137729a.f112562a.g(qVar);
    }

    @Override // pi.i
    public final void close() {
        this.f137730b.close(1000, null);
    }

    @Override // pi.i
    public final void send(w63.h hVar) {
        hVar.getClass();
        if (this.f137730b.send(hVar)) {
            return;
        }
        this.f137729a.q(null);
    }

    @Override // pi.i
    public final void send(String str) {
        if (this.f137730b.send(str)) {
            return;
        }
        this.f137729a.q(null);
    }
}
