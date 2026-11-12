package com.huawei.hms.network.embedded;

/* JADX INFO: loaded from: classes34.dex */
public interface h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14837a = "Dns";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f14838b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f14839c = new b();
    public static final h0 d = new c();

    m0 lookup(String str);

    public class a implements h0 {
        @Override // com.huawei.hms.network.embedded.h0
        public m0 lookup(String str) {
            return g0.a(new k0(str, "dns_sync_query", new f0.b()));
        }
    }

    public class b implements h0 {
        @Override // com.huawei.hms.network.embedded.h0
        public m0 lookup(String str) {
            return g0.a(new e0(str, null));
        }
    }

    public class c implements h0 {
        @Override // com.huawei.hms.network.embedded.h0
        public m0 lookup(String str) {
            return g0.a(new j0(str, "dns_sync_query", new f0.b()));
        }
    }
}
