package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes34.dex */
public class n3 extends f3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15120c = "SiteConnectCall";
    public static final z6 d = new z6(0, 1, TimeUnit.MILLISECONDS);

    @Override // com.huawei.hms.network.embedded.f3, com.huawei.hms.network.embedded.t6
    public t7 request() {
        return this.request;
    }

    @Override // com.huawei.hms.network.embedded.f3
    /* JADX INFO: renamed from: clone */
    public t6 mo1385clone() {
        return new n3(this.client, this.request);
    }

    public class a implements n7 {
        @Override // com.huawei.hms.network.embedded.n7
        public v7 intercept(n7.a aVar) throws IOException {
            n3.this.exchange = ((k9) aVar).e();
            Logger.v(n3.f15120c, "Site connect success and return construct response");
            v7.a aVarA = new v7.a().a(n3.this.request).a(200);
            y8 y8Var = n3.this.transmitter.i;
            return aVarA.a(y8Var == null ? r7.HTTP_1_1 : y8Var.d()).a("site detect success").a(w7.a(o7.a("text/plain; charset=UTF-8"), "site detect success")).a();
        }

        public a() {
        }
    }

    public static final class b implements f7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t7 f15122b;

        @Override // com.huawei.hms.network.embedded.f7
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            Logger.v(n3.f15120c, "ConnectDetectDNS lookup %s and result %s", str, this.f15122b.j());
            return (List) (this.f15122b.j() == null ? Collections.EMPTY_LIST : this.f15122b.j());
        }

        public b(t7 t7Var) {
            this.f15122b = t7Var;
        }
    }

    @Override // com.huawei.hms.network.embedded.f3
    public void addResponseInterceptor() {
        this.interceptors.add(new a());
    }

    public n3(q7 q7Var, t7 t7Var) {
        super(q7Var, t7Var);
        this.client = q7Var.u().a(d).a(new b(t7Var)).a();
        this.transmitter = new d9(this.client, this);
    }
}
