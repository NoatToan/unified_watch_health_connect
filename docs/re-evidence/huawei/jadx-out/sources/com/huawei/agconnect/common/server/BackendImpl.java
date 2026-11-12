package com.huawei.agconnect.common.server;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.common.api.BaseResponse;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.credential.internal.AndroidExecutor;
import com.huawei.agconnect.credential.internal.BaseContext;
import com.huawei.agconnect.exception.AGCNetworkException;
import com.huawei.agconnect.exception.AGCServerException;
import com.huawei.agconnect.https.Adapter;
import com.huawei.agconnect.https.HttpsException;
import com.huawei.agconnect.https.HttpsKit;
import com.huawei.agconnect.https.HttpsResult;
import com.huawei.agconnect.https.Method;
import com.huawei.agconnect.https.adapter.JsonAdapterFactory;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.TaskExecutors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Authenticator;
import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes3.dex */
public class BackendImpl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4870c = "BackendImpl";
    private static final long d = 5000;
    private static final BackendImpl e = new BackendImpl();
    private static final ExecutorService f = AndroidExecutor.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<SiteUrl, UrlInterceptorClient> f4871a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Adapter.Factory f4872b = new JsonAdapterFactory();

    public Map<SiteUrl, UrlInterceptorClient> b() {
        return this.f4871a;
    }

    public <Req, Rsp> Task<Rsp> a(Req req, int i, Class<Rsp> cls, List<Interceptor> list, Authenticator authenticator, AGConnectOptions aGConnectOptions) {
        return a(req, i, cls, this.f4872b, 5000L, TimeUnit.MILLISECONDS, list, authenticator, aGConnectOptions);
    }

    public <Req, Rsp> Task<Rsp> a(Req req, int i, final Class<Rsp> cls, Adapter.Factory factory, long j, TimeUnit timeUnit, List<Interceptor> list, Authenticator authenticator, AGConnectOptions aGConnectOptions) {
        AGCServerException aGCServerException;
        final Adapter.Factory factory2 = factory != null ? factory : this.f4872b;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        String string = aGConnectOptions.getString("agcgw/url");
        String string2 = aGConnectOptions.getString("agcgw/backurl");
        if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2)) {
            Context contextA = BaseContext.b().a();
            if (contextA == null) {
                aGCServerException = new AGCServerException("context is error", 4);
            } else {
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    arrayList.addAll(list);
                } else {
                    arrayList.add(new UrlInterceptorV2(string, string2));
                }
                a(contextA, arrayList, authenticator, j, timeUnit).create(contextA).execute(a(req, i, factory2)).addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener<HttpsResult>() { // from class: com.huawei.agconnect.common.server.BackendImpl.2
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(HttpsResult httpsResult) {
                        Object response;
                        if (httpsResult.isSuccess()) {
                            if (String.class.equals(cls)) {
                                response = httpsResult.getResponse();
                            } else {
                                try {
                                    response = httpsResult.getResponse(cls, factory2);
                                } catch (RuntimeException e2) {
                                    taskCompletionSource.setException(e2);
                                    return;
                                }
                            }
                            taskCompletionSource.setResult(response);
                            return;
                        }
                        if (httpsResult.code() == 401) {
                            try {
                                BaseResponse baseResponse = (BaseResponse) httpsResult.getResponse(BaseResponse.class, factory2);
                                if (baseResponse != null && baseResponse.getRet() != null) {
                                    taskCompletionSource.setException(new AGCServerException(httpsResult.getErrorMsg(), httpsResult.code(), baseResponse.getRet().getCode()));
                                    return;
                                }
                            } catch (RuntimeException unused) {
                                Logger.e(BackendImpl.f4870c, "get base response error");
                            }
                        }
                        taskCompletionSource.setException(new AGCServerException(httpsResult.getErrorMsg(), httpsResult.code()));
                    }
                }).addOnFailureListener(TaskExecutors.immediate(), new OnFailureListener() { // from class: com.huawei.agconnect.common.server.BackendImpl.1
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public void onFailure(Exception exc) {
                        Exception aGCServerException2;
                        if (exc instanceof HttpsException) {
                            aGCServerException2 = !((HttpsException) exc).hasRequest() ? new AGCNetworkException(exc.getMessage(), 0) : new AGCNetworkException(exc.getMessage(), 1);
                        } else {
                            aGCServerException2 = new AGCServerException(exc.getMessage(), 2);
                        }
                        taskCompletionSource.setException(aGCServerException2);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }
        aGCServerException = new AGCServerException("url is null", 5);
        taskCompletionSource.setException(aGCServerException);
        return taskCompletionSource.getTask();
    }

    public <Req, Rsp> Task<Rsp> a(Req req, int i, Class<Rsp> cls, AGConnectOptions aGConnectOptions) {
        return a(req, i, cls, this.f4872b, 5000L, TimeUnit.MILLISECONDS, null, null, aGConnectOptions);
    }

    private <Req> Method a(Req req, int i, Adapter.Factory factory) {
        if (i == 1) {
            return new Method.Post(req, factory);
        }
        return i == 2 ? new Method.Put(req, factory) : new Method.Get(req);
    }

    private HttpsKit a(Context context, List<Interceptor> list, Authenticator authenticator, long j, TimeUnit timeUnit) {
        if (j == 0) {
            timeUnit = TimeUnit.MILLISECONDS;
            j = 5000;
        }
        return new HttpsKit.Builder().client(new ClientImpl(context, Collections.unmodifiableList(list), true).a(authenticator).a(j, timeUnit)).executor(f).build();
    }

    public static BackendImpl a() {
        return e;
    }

    private BackendImpl() {
    }
}
