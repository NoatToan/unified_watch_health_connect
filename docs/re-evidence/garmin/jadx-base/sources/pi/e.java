package pi;

import java.util.List;
import o53.s;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpi/e;", "Lpi/j;", "Lokhttp3/WebSocket$Factory;", "webSocketFactory", "<init>", "(Lokhttp3/WebSocket$Factory;)V", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebSocket.Factory f137733a;

    public e(WebSocket.Factory factory) {
        factory.getClass();
        this.f137733a = factory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pi.j
    public final Object a(String str, List list, v13.c cVar) {
        a aVar;
        WebSocket webSocketNewWebSocket;
        li.b bVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f137727e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f137727e = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj = aVar.f137725c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f137727e;
        if (i15 == 0) {
            o13.r.b(obj);
            li.b bVar2 = new li.b(q53.l.a(Integer.MAX_VALUE, 6, null));
            s sVarB = gl.b.b();
            webSocketNewWebSocket = this.f137733a.newWebSocket(new Request.Builder().url(str).headers(ni.b.a(list)).build(), new d(sVarB, bVar2));
            aVar.f137723a = bVar2;
            aVar.f137724b = webSocketNewWebSocket;
            aVar.f137727e = 1;
            if (sVarB.C(aVar) == aVar2) {
                return aVar2;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            webSocketNewWebSocket = aVar.f137724b;
            bVar = aVar.f137723a;
            o13.r.b(obj);
        }
        b bVar3 = new b(webSocketNewWebSocket);
        bVar.getClass();
        bVar.f112563b = bVar3;
        return new c(bVar, webSocketNewWebSocket);
    }

    public e() {
        this(new OkHttpClient());
    }
}
