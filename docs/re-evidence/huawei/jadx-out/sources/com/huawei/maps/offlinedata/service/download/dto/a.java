package com.huawei.maps.offlinedata.service.download.dto;

import com.huawei.hms.network.file.api.Progress;
import com.huawei.hms.network.file.api.Response;
import com.huawei.hms.network.file.api.Result;
import com.huawei.hms.network.file.api.exception.InterruptedException;
import com.huawei.hms.network.file.api.exception.NetworkException;
import com.huawei.hms.network.file.download.api.FileRequestCallback;
import com.huawei.hms.network.file.download.api.GetRequest;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.logpush.b;
import com.huawei.maps.offlinedata.logpush.c;
import com.huawei.maps.offlinedata.service.device.f;
import com.huawei.maps.offlinedata.utils.d;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.secure.android.common.util.SecurityCommonException;
import com.huawei.secure.android.common.util.ZipUtil;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class a extends FileRequestCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile OfflineDataTaskEntity f17978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17980c;
    private final com.huawei.maps.offlinedata.logpush.dto.a d = com.huawei.maps.offlinedata.logpush.dto.a.C0185a.b().a("FileDownloadCallback").a();

    public a(OfflineDataTaskEntity offlineDataTaskEntity) {
        this.f17980c = true;
        this.f17978a = offlineDataTaskEntity;
        if (this.f17978a == null) {
            this.f17980c = false;
        }
    }

    private void b() {
        this.d.b("060015");
        b.b(this.d);
        if (!com.huawei.maps.offlinedata.service.a.a().b()) {
            this.f17980c = true;
        }
        com.huawei.maps.offlinedata.service.download.b.b().d().remove(a());
        if (!this.f17980c) {
            com.huawei.maps.offlinedata.jsbridge.b.a().a("downloadHandler.error", this.f17979b);
            return;
        }
        com.huawei.maps.offlinedata.service.persist.b.e().c(a().getId(), a().getItemState(), a().getTaskState());
        com.huawei.maps.offlinedata.jsbridge.b.a().a("syncData", d.a(a()));
        if (com.huawei.maps.offlinedata.service.a.a().b()) {
            return;
        }
        com.huawei.maps.offlinedata.service.download.b.b().h();
    }

    private void c() {
        if (a() != null && !com.huawei.maps.offlinedata.service.download.b.b().d().contains(a())) {
            com.huawei.maps.offlinedata.service.download.b.b().d().add(a());
        }
        if (!com.huawei.maps.offlinedata.service.a.a().b()) {
            this.f17980c = true;
        }
        if (!this.f17980c) {
            com.huawei.maps.offlinedata.jsbridge.b.a().a("downloadHandler.start", this.f17979b);
            return;
        }
        a().setTaskState("{\"download\":\"doing\"}");
        com.huawei.maps.offlinedata.service.persist.b.e().c(a().getId(), a().getItemState(), a().getTaskState());
        com.huawei.maps.offlinedata.jsbridge.b.a().a("syncData", d.a(a()));
    }

    public OfflineDataTaskEntity a() {
        if (this.f17978a == null) {
            this.f17978a = com.huawei.maps.offlinedata.service.persist.b.e().c(this.f17979b);
            if (this.f17978a == null) {
                g.b("FileDownloadCallback", "the task is null.");
            }
        }
        return this.f17978a;
    }

    @Override // com.huawei.hms.network.file.api.Callback
    public void onSuccess(Response response) {
        g.c("FileDownloadCallback", "onSuccess.");
        a((File) response.getContent());
    }

    @Override // com.huawei.hms.network.file.api.Callback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetRequest onStart(GetRequest getRequest) {
        this.f17979b = String.valueOf(getRequest.getId());
        g.c("FileDownloadCallback", "onStart, requestId is " + this.f17979b);
        c();
        return getRequest;
    }

    @Override // com.huawei.hms.network.file.api.Callback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onProgress(GetRequest getRequest, Progress progress) {
        int progress2 = progress.getProgress();
        g.c("FileDownloadCallback", "onProgress: " + progress2 + ", requestId:" + this.f17979b);
        a().setDownloadProgress(Integer.valueOf(progress2));
        a(progress2);
    }

    @Override // com.huawei.hms.network.file.api.Callback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onException(GetRequest getRequest, NetworkException networkException, Response response) {
        g.b("FileDownloadCallback", "onException e:" + networkException.getMessage());
        if (response != null) {
            g.b("FileDownloadCallback", "onException code:" + response.getCode() + ", message:" + response.getMessage());
        }
        if (networkException instanceof InterruptedException) {
            int statusCode = ((InterruptedException) networkException).getStatusCode();
            g.c("FileDownloadCallback", "downloadData onException errorCode：" + statusCode);
            if (Result.CANCEL == statusCode) {
                g.c("FileDownloadCallback", "cancel file download");
                a().setTaskState("{\"download\":\"error\"}");
            } else if (Result.PAUSE == statusCode) {
                g.c("FileDownloadCallback", "pause file download");
                a().setTaskState("{\"download\":\"pause\"}");
            }
        }
        c.a(new com.huawei.maps.offlinedata.logpush.dto.b.a().b("FILE_DOWNLOAD_FAILED").a(networkException.getMessage()).a());
        b();
    }

    private void a(File file) {
        this.d.b("0");
        b.b(this.d);
        if (!com.huawei.maps.offlinedata.service.a.a().b()) {
            this.f17980c = true;
        }
        com.huawei.maps.offlinedata.service.download.b.b().d().remove(a());
        if (!this.f17980c) {
            com.huawei.maps.offlinedata.jsbridge.b.a().a("downloadHandler.success", this.f17979b);
            return;
        }
        a().setDownloadProgress(100);
        a().setTaskState("{\"download\":\"finish\"}");
        com.huawei.maps.offlinedata.service.persist.b.e().b(a().getId(), a().getDownloadProgress().intValue(), 0);
        com.huawei.maps.offlinedata.service.persist.b.e().c(a().getId(), a().getItemState(), a().getTaskState());
        com.huawei.maps.offlinedata.jsbridge.b.a().a("syncData", d.a(a()));
        if (com.huawei.maps.offlinedata.service.a.a().b()) {
            return;
        }
        com.huawei.maps.offlinedata.service.download.b.b().h();
        if (!a(file.getPath(), com.huawei.maps.offlinedata.service.storage.a.e().c() + file.getName()) || com.huawei.maps.offlinedata.service.a.a().b()) {
            return;
        }
        f.b().a(a(), (MapOfflineDataItemEntity) null);
    }

    private boolean a(String str, String str2) {
        a().setTaskState("{\"decompress\":\"error\"}");
        boolean z = false;
        try {
            g.c("FileDownloadCallback", "start unZip offline map data");
            List<File> listUnZipNew = ZipUtil.unZipNew(str, str2, 5368709120L, 1000, true);
            com.huawei.maps.offlinedata.utils.c.a(new File(str));
            if (listUnZipNew != null && !listUnZipNew.isEmpty()) {
                a().setTaskState("{\"transmit\":\"queue\"}");
                z = true;
            }
            g.c("FileDownloadCallback", "unZip offline map data success.");
        } catch (SecurityCommonException unused) {
            com.huawei.maps.offlinedata.utils.c.c(new File(str2));
            g.b("FileDownloadCallback", "unZip: SecurityCommonException: ");
        } catch (IllegalArgumentException unused2) {
            com.huawei.maps.offlinedata.utils.c.c(new File(str2));
            g.b("FileDownloadCallback", "unZip: IllegalArgumentException: ");
        } catch (Exception unused3) {
            com.huawei.maps.offlinedata.utils.c.c(new File(str2));
            g.b("FileDownloadCallback", "unZip: Exception: ");
        }
        com.huawei.maps.offlinedata.service.persist.b.e().c(this.f17978a.getId(), this.f17978a.getItemState(), this.f17978a.getTaskState());
        return z;
    }

    private void a(int i) {
        if (a() != null && !com.huawei.maps.offlinedata.service.download.b.b().d().contains(a())) {
            com.huawei.maps.offlinedata.service.download.b.b().d().add(a());
        }
        if (!com.huawei.maps.offlinedata.service.a.a().b()) {
            this.f17980c = true;
        }
        if (!this.f17980c) {
            com.huawei.maps.offlinedata.jsbridge.b.a().a("downloadHandler.progress", this.f17979b, String.valueOf(i));
            return;
        }
        a().setTaskState("{\"download\":\"doing\"}");
        com.huawei.maps.offlinedata.service.persist.b.e().b(a().getId(), i, 0);
        com.huawei.maps.offlinedata.jsbridge.b.a().a("syncData", d.a(a()));
    }
}
