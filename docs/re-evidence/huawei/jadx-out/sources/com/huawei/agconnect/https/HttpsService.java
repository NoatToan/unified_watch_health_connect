package com.huawei.agconnect.https;

import com.huawei.agconnect.https.connector.HttpsPlatform;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public class HttpsService implements Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f5016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f5017b;

    @Override // com.huawei.agconnect.https.Service
    public Task<HttpsResult> execute(final Method method) {
        return Tasks.callInBackground(this.f5017b, new Callable<HttpsResult>() { // from class: com.huawei.agconnect.https.HttpsService.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HttpsResult call() throws Exception {
                if (!HttpsPlatform.getInstance().getConnector().hasActiveNetwork()) {
                    throw new HttpsException(false, "There's no network");
                }
                try {
                    Response responseExecute = HttpsService.this.f5016a.newCall(method.create().build()).execute();
                    return new HttpsResult(true, responseExecute.code(), responseExecute);
                } catch (IOException e) {
                    throw new HttpsException(true, e);
                }
            }
        });
    }

    public HttpsService(OkHttpClient okHttpClient, Executor executor) {
        this.f5016a = okHttpClient;
        this.f5017b = executor;
    }
}
