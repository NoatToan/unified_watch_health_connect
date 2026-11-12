package com.huawei.maps.offlinedata.service.download;

import android.text.TextUtils;
import com.huawei.hms.network.file.api.Callback;
import com.huawei.hms.network.file.api.RequestManager;
import com.huawei.hms.network.file.api.Result;
import com.huawei.hms.network.file.download.api.DownloadManager;
import com.huawei.hms.network.file.download.api.GetRequest;
import com.huawei.maps.offlinedata.handler.dto.DownloadRequest;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.utils.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f17973b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DownloadManager f17974a = null;

    private a() {
        RequestManager.init(com.huawei.maps.offlinedata.utils.a.b());
        b();
    }

    public static a a() {
        if (f17973b == null) {
            synchronized (a.class) {
                if (f17973b == null) {
                    f17973b = new a();
                }
            }
        }
        return f17973b;
    }

    private void b() {
        this.f17974a = new DownloadManager.Builder("offline_download_manager").commonConfig(DownloadManager.newGlobalRequestConfigBuilder().threadPoolSize(6).build()).build(com.huawei.maps.offlinedata.utils.a.b());
    }

    public void c() {
        List<GetRequest> allRequests = this.f17974a.getAllRequests();
        if (allRequests == null || allRequests.isEmpty()) {
            return;
        }
        g.c("FileDownloadManager", "pause all task from download manager, the size is " + allRequests.size());
        Iterator<GetRequest> it = allRequests.iterator();
        while (it.hasNext()) {
            this.f17974a.pauseRequest(it.next().getId());
        }
    }

    private List a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length == 0) {
            return new ArrayList();
        }
        return Arrays.asList(strArrSplit);
    }

    private boolean b(DownloadRequest downloadRequest) {
        if (TextUtils.isEmpty(downloadRequest.getDownloadUri())) {
            g.b("FileDownloadManager", "startOfflineDataDownload failed , downloadUrl is null");
            return false;
        }
        if (!TextUtils.isEmpty(downloadRequest.getFilePath())) {
            return true;
        }
        g.b("FileDownloadManager", "startOfflineDataDownload failed , local save filePath is null");
        return false;
    }

    private GetRequest a(DownloadRequest downloadRequest) {
        return DownloadManager.newGetRequestBuilder().filePath(downloadRequest.getFilePath()).backupUrls(a(downloadRequest.getBackDownloadUri())).name("offline_download_request").config(DownloadManager.newRequestConfigBuilder().retryTimes(3).build()).enableSlice(false).url(downloadRequest.getDownloadUri()).sha256(downloadRequest.getSha256()).build();
    }

    public boolean b(long j) {
        g.c("FileDownloadManager", "pauseOfflineDataDownland ..." + j);
        if (j <= 0) {
            g.b("FileDownloadManager", "pauseOfflineDataDownland failed .requestId is invalid.");
            return false;
        }
        if (a(this.f17974a.pauseRequest(j))) {
            g.b("FileDownloadManager", "pauseOfflineDataDownland failed, result is invalid");
            return false;
        }
        g.c("FileDownloadManager", "pauseOfflineDataDownland success ...");
        return true;
    }

    private boolean a(Result result) {
        if (result == null) {
            g.b("FileDownloadManager", "result is invalid, result is null");
            return true;
        }
        if (result.getCode() == Result.SUCCESS) {
            return false;
        }
        g.b("FileDownloadManager", "result is invalid , errorCode : " + result.getCode() + " ,msg: " + result.getMessage());
        return true;
    }

    public String a(DownloadRequest downloadRequest, OfflineDataTaskEntity offlineDataTaskEntity) {
        g.c("FileDownloadManager", "startOfflineDataDownload ...");
        if (!b(downloadRequest)) {
            return "";
        }
        GetRequest getRequestA = a(downloadRequest);
        if (a(this.f17974a.start(getRequestA, (Callback) new com.huawei.maps.offlinedata.service.download.dto.a(offlineDataTaskEntity)))) {
            g.b("FileDownloadManager", "startOfflineDataDownload failed. result is invalid.");
            return "";
        }
        g.c("FileDownloadManager", "startOfflineDataDownload success, requestId is " + getRequestA.getId());
        return String.valueOf(getRequestA.getId());
    }

    public boolean a(long j) {
        g.c("FileDownloadManager", "cancelOfflineDataDownload ..." + j);
        if (j <= 0) {
            g.b("FileDownloadManager", "cancelOfflineDataDownloadfailed .requestId is invalid.");
            return false;
        }
        if (a(this.f17974a.cancelRequest(j))) {
            g.b("FileDownloadManager", "cancelOfflineDataDownload failed,result is invalid.");
            return false;
        }
        g.c("FileDownloadManager", "cancelOfflineDataDownload success ...");
        return true;
    }

    public boolean a(long j, OfflineDataTaskEntity offlineDataTaskEntity) {
        g.c("FileDownloadManager", "resumeOfflineDataDownland ..." + j);
        if (j <= 0) {
            g.b("FileDownloadManager", "resumeOfflineDataDownland failed .requestId is invalid.");
            return false;
        }
        GetRequest request = this.f17974a.getRequest(j);
        if (request == null) {
            g.b("FileDownloadManager", "resumeOfflineDataDownland failed , query getRequest by requestId is null ,can not resume.");
            return false;
        }
        if (a(this.f17974a.resumeRequest(request, (Callback) new com.huawei.maps.offlinedata.service.download.dto.a(offlineDataTaskEntity)))) {
            g.b("FileDownloadManager", "resumeOfflineDataDownland failed, result is invalid");
            return false;
        }
        g.c("FileDownloadManager", "resumeOfflineDataDownland success ...");
        return true;
    }
}
