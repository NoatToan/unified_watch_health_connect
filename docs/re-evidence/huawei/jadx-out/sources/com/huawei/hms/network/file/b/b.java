package com.huawei.hms.network.file.b;

import com.huawei.hms.network.base.common.MediaType;
import com.huawei.hms.network.base.common.MultipartBody;
import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.FileManagerException;
import com.huawei.hms.network.file.core.task.l;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.upload.api.BodyRequest;
import com.huawei.hms.network.file.upload.api.FileEntity;
import com.huawei.hms.network.file.upload.api.PostRequest;
import com.huawei.hms.network.file.upload.api.PutRequest;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.Response;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class b implements com.huawei.hms.network.file.core.task.b<BodyRequest, f> {
    static final MediaType e = MediaType.parse("multipart/form-data");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    GlobalRequestConfig f15710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g f15711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f f15712c;
    HttpClient d;

    @Override // com.huawei.hms.network.file.core.task.b
    public Closeable a(f fVar, com.huawei.hms.network.file.core.task.f fVar2) {
        RequestBody requestBodyBuild;
        this.f15712c = fVar;
        this.f15711b = new g(this.f15710a, this.d);
        BodyRequest bodyRequestP = fVar.p();
        long jContentLength = 0;
        if (bodyRequestP instanceof PutRequest) {
            requestBodyBuild = new c(fVar, ((PutRequest) bodyRequestP).getFileEntityList(), fVar2);
            try {
                jContentLength = requestBodyBuild.contentLength();
            } catch (IOException e2) {
                FLogger.e("UploadImpl", "get requestBody contentLength error", e2);
            }
        } else {
            PostRequest postRequest = (PostRequest) bodyRequestP;
            MultipartBody.Builder type = new MultipartBody.Builder().setType(e);
            if (!postRequest.getParams().isEmpty()) {
                for (Map.Entry<String, String> entry : postRequest.getParams().entrySet()) {
                    FLogger.d("UploadImpl", "FormDataPart:" + entry, new Object[0]);
                    type.addFormDataPart(entry.getKey(), entry.getValue());
                }
            }
            for (String str : postRequest.getFileEntityMap().keySet()) {
                List<FileEntity> list = postRequest.getFileEntityMap().get(str);
                if (list == null || list.isEmpty()) {
                    FLogger.w("UploadImpl", "no FileEntity for:" + str, new Object[0]);
                } else {
                    FLogger.d("UploadImpl", "fileParams for:" + str + ",fileListSize:" + list.size(), new Object[0]);
                    String name = list.get(0).getName();
                    String fileName = list.get(0).getFileName();
                    c cVar = new c(fVar, list, fVar2);
                    try {
                        jContentLength += cVar.contentLength();
                    } catch (IOException e3) {
                        FLogger.e("UploadImpl", "get fileBody contentLength error", e3);
                    }
                    type.addFormDataPart(name, fileName, cVar);
                }
            }
            requestBodyBuild = type.build();
        }
        fVar.e(jContentLength);
        Response responseA = this.f15711b.a(requestBodyBuild, fVar, fVar2);
        l lVar = new l(Constants.ErrorCode.SUCCESS);
        lVar.setTask(fVar);
        lVar.setRawResponse(responseA);
        this.f15712c.a(lVar);
        a(responseA.getCode());
        return responseA;
    }

    private void a(int i) {
        String str;
        if (i == -1) {
            throw new FileManagerException(Constants.ErrorCode.SERVER_EXCEPTION, " upload failed,response null");
        }
        if (i != 416) {
            if (i / 100 == 2) {
                return;
            }
            throw new FileManagerException(i, "thread Upload failed:bad http response [responseCode=" + i + "]");
        }
        if (this.f15712c != null) {
            str = "server file is wrong : 416 response [name= " + this.f15712c.f() + ", uploadSize=" + this.f15712c.a() + "]";
        } else {
            str = "server file is wrong : 416 response";
        }
        throw new FileManagerException(i, str);
    }

    public b(GlobalRequestConfig globalRequestConfig, HttpClient httpClient) {
        this.f15710a = globalRequestConfig;
        this.d = httpClient;
    }
}
