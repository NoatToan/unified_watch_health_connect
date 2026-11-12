package com.huawei.hms.network.file.b;

import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.task.l;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.upload.api.BodyRequest;
import com.huawei.hms.network.httpclient.HttpClient;
import java.io.Closeable;

/* JADX INFO: loaded from: classes10.dex */
public class h implements com.huawei.hms.network.file.core.task.g<f, l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.huawei.hms.network.file.core.task.f f15721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    GlobalRequestConfig f15722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.huawei.hms.network.file.core.task.b f15723c;
    HttpClient d;

    @Override // com.huawei.hms.network.file.core.task.g
    public void a(com.huawei.hms.network.file.core.task.f fVar) {
        this.f15721a = fVar;
    }

    @Override // com.huawei.hms.network.file.core.task.g
    public l a(f fVar) {
        FLogger.i("Uploader", "process task:" + fVar, new Object[0]);
        GlobalRequestConfig globalRequestConfigGenMergedRequestConfig = this.f15722b;
        if (((BodyRequest) fVar.p()).getConfig() != null) {
            globalRequestConfigGenMergedRequestConfig = globalRequestConfigGenMergedRequestConfig.genMergedRequestConfig(((BodyRequest) fVar.p()).getConfig());
        }
        b bVar = new b(globalRequestConfigGenMergedRequestConfig, this.d);
        this.f15723c = bVar;
        Closeable closeableA = bVar.a(fVar, this.f15721a);
        l lVar = new l(Constants.ErrorCode.SUCCESS);
        lVar.setTask(fVar);
        lVar.setRawResponse(closeableA);
        fVar.a(lVar);
        lVar.a(fVar.f() + " finished success");
        fVar.c(true);
        return lVar;
    }

    public h(GlobalRequestConfig globalRequestConfig, HttpClient httpClient) {
        this.f15722b = globalRequestConfig;
        this.d = httpClient;
    }
}
