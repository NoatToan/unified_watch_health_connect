package com.huawei.hms.network.file.a;

import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.task.k;
import com.huawei.hms.network.file.core.task.l;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.download.api.GetRequest;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Response;

/* JADX INFO: loaded from: classes10.dex */
public class e implements com.huawei.hms.network.file.core.task.g<k<GetRequest>, l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.huawei.hms.network.file.core.task.f f15669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.huawei.hms.network.file.core.task.b f15670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    GlobalRequestConfig f15671c;
    HttpClient d;

    @Override // com.huawei.hms.network.file.core.task.g
    public void a(com.huawei.hms.network.file.core.task.f fVar) {
        this.f15669a = fVar;
    }

    @Override // com.huawei.hms.network.file.core.task.g
    public l a(k<GetRequest> kVar) {
        GlobalRequestConfig globalRequestConfigGenMergedRequestConfig = this.f15671c;
        if (((GetRequest) kVar.p()).getConfig() != null) {
            globalRequestConfigGenMergedRequestConfig = globalRequestConfigGenMergedRequestConfig.genMergedRequestConfig(((GetRequest) kVar.p()).getConfig());
        }
        this.f15670b = new a(globalRequestConfigGenMergedRequestConfig, this.d);
        FLogger.i("Downloader", "process task:" + kVar, new Object[0]);
        Response response = (Response) this.f15670b.a(kVar, this.f15669a);
        l lVar = new l(Constants.ErrorCode.SUCCESS);
        lVar.setTask(kVar);
        kVar.a(lVar);
        lVar.setRawResponse(response);
        kVar.c(true);
        return lVar;
    }

    public e(GlobalRequestConfig globalRequestConfig, HttpClient httpClient) {
        this.f15671c = globalRequestConfig;
        this.d = httpClient;
    }
}
