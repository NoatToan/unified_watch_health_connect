package com.huawei.openalliance.ad.net.http;

import com.huawei.hms.network.embedded.g3;
import com.huawei.openalliance.ad.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.br;
import com.huawei.openalliance.ad.utils.dg;
import java.util.WeakHashMap;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes12.dex */
public class d extends EventListener implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<Request, HttpConnection> f19688a;

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        if (connection == null) {
            return;
        }
        HttpConnection httpConnection = new HttpConnection(connection);
        hw.b(g3.h, "address:" + dg.h(httpConnection.a()));
        Request request = call.request();
        if (request == null) {
            return;
        }
        if (this.f19688a == null) {
            this.f19688a = new WeakHashMap<>();
        }
        hw.b(g3.h, "size: %s", Integer.valueOf(this.f19688a.size()));
        this.f19688a.put(request, httpConnection);
    }

    @Override // com.huawei.openalliance.ad.net.http.i
    public OkHttpClient.Builder a(OkHttpClient.Builder builder) {
        if (builder == null) {
            return null;
        }
        return builder.eventListener(this);
    }

    @Override // com.huawei.openalliance.ad.net.http.i
    public HttpConnection a(Request request) {
        HttpConnection httpConnection = (br.a(this.f19688a) || request == null || !this.f19688a.containsKey(request)) ? null : this.f19688a.get(request);
        return httpConnection == null ? new HttpConnection() : httpConnection;
    }
}
