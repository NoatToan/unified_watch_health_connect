package com.huawei.agconnect.common.api;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.common.server.BackendImpl;
import com.huawei.agconnect.https.Adapter;
import com.huawei.hmf.tasks.Task;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Authenticator;
import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes3.dex */
public class Backend {

    /* JADX INFO: loaded from: classes22.dex */
    public interface MethodType {
        public static final int GET = 0;
        public static final int POST = 1;
        public static final int PUT = 2;
    }

    public static <Req, Rsp> Task<Rsp> call(Req req, int i, Class<Rsp> cls, Adapter.Factory factory, long j, TimeUnit timeUnit, List<Interceptor> list, Authenticator authenticator, AGConnectOptions aGConnectOptions) {
        return BackendImpl.a().a(req, i, cls, factory, j, timeUnit, list, authenticator, aGConnectOptions);
    }

    @Deprecated
    public static <Req, Rsp> Task<Rsp> call(Req req, int i, Class<Rsp> cls, Adapter.Factory factory, long j, TimeUnit timeUnit, AGConnectOptions aGConnectOptions) {
        return call(req, i, cls, factory, j, timeUnit, null, null, aGConnectOptions);
    }

    @Deprecated
    public static <Req, Rsp> Task<Rsp> call(Req req, int i, Class<Rsp> cls, Adapter.Factory factory, long j, TimeUnit timeUnit) {
        return call(req, i, cls, factory, j, timeUnit, null, null, AGConnectInstance.getInstance().getOptions());
    }

    @Deprecated
    public static <Req, Rsp> Task<Rsp> call(Req req, int i, Class<Rsp> cls, AGConnectOptions aGConnectOptions) {
        return BackendImpl.a().a(req, i, cls, aGConnectOptions);
    }

    @Deprecated
    public static <Req, Rsp> Task<Rsp> call(Req req, int i, Class<Rsp> cls) {
        return BackendImpl.a().a(req, i, cls, AGConnectInstance.getInstance().getOptions());
    }
}
