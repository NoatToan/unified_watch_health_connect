package defpackage;

import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hms.network.embedded.r3;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ProgressListener;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class fdv implements ProgressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f33921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DownloadCallback f33922c;
    String d;
    String e;

    public fdv(String str, String str2, String str3, File file, DownloadCallback downloadCallback) {
        this.e = str;
        this.d = str2;
        this.f33920a = str3;
        this.f33921b = file;
        this.f33922c = downloadCallback;
    }

    @Override // com.huawei.networkclient.ProgressListener
    public void onFinish(Object obj) {
        DownloadCallback downloadCallback = this.f33922c;
        if (downloadCallback == null || this.f33921b == null) {
            LogUtil.j("DownloadListener", "onFinish, listener or mFile is null");
            return;
        }
        downloadCallback.onFinish(obj);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(r3.A, "true");
        linkedHashMap.put(RecommendConstants.DOWNLOAD_URL, this.f33920a);
        linkedHashMap.put("configId", this.e);
        linkedHashMap.put(RecommendConstants.FILE_ID, this.d);
        try {
            linkedHashMap.put("fileAbsolutePath", this.f33921b.getCanonicalPath());
        } catch (IOException e) {
            LogUtil.e("DownloadListener", "mFile getCanonicalPath exception is: ", e.getMessage());
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_HEALTH_CLOUD_DOWNLOAD_ON_FAIL_85070035.value(), linkedHashMap);
    }

    @Override // com.huawei.networkclient.ProgressListener
    public void onProgress(long j, long j2, boolean z) {
        DownloadCallback downloadCallback = this.f33922c;
        if (downloadCallback == null) {
            LogUtil.j("DownloadListener", "onProgress, listener is null");
        } else {
            downloadCallback.onProgress(j, j2, z, this.d);
        }
    }

    @Override // com.huawei.networkclient.ProgressListener
    public void onFail(Throwable th) {
        DownloadCallback downloadCallback = this.f33922c;
        if (downloadCallback == null || th == null || this.f33921b == null) {
            LogUtil.j("DownloadListener", "onFail, listener or throwable or mFile is null");
            return;
        }
        downloadCallback.onFail(1000, new IOException(th.getMessage()));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(r3.A, "false");
        linkedHashMap.put(RecommendConstants.DOWNLOAD_URL, this.f33920a);
        linkedHashMap.put("configId", this.e);
        linkedHashMap.put(RecommendConstants.FILE_ID, this.d);
        try {
            linkedHashMap.put("fileAbsolutePath", this.f33921b.getCanonicalPath());
        } catch (IOException e) {
            LogUtil.e("DownloadListener", "mFile getCanonicalPath exception is: ", e.getMessage());
        }
        linkedHashMap.put("onFailThrowable: ", th.getMessage());
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_HEALTH_CLOUD_DOWNLOAD_ON_FAIL_85070035.value(), linkedHashMap);
    }
}
