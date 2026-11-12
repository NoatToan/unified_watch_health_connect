package defpackage;

import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class fdq implements DownloadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f33907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f33908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f33909c;
    DownloadCallback e;
    private long h;
    int d = 0;
    private String g = "";
    private Map<String, Long> j = new ConcurrentHashMap();
    private List<Object> f = new ArrayList(10);

    public fdq(String str, String str2, int i, DownloadCallback downloadCallback) {
        this.f33909c = str;
        this.f33908b = str2;
        this.f33907a = i;
        this.e = downloadCallback;
    }

    @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
    public void onFinish(Object obj) {
        this.d++;
        this.f.add(obj);
        if (this.d == this.f33907a) {
            DownloadCallback downloadCallback = this.e;
            if (downloadCallback == null) {
                LogUtil.j("DownloadListenerBatch", "onFinish, listener is null");
            } else {
                downloadCallback.onFinish(this.f);
            }
        }
    }

    @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
    public void onProgress(long j, long j2, boolean z, String str) {
        if (!this.j.containsKey(str)) {
            this.h += j2;
        }
        this.j.put(str, Long.valueOf(j));
        Iterator<Long> it = this.j.values().iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        if (z) {
            this.g += str + ", ";
        }
        long j3 = this.h;
        boolean z2 = j3 == jLongValue && z;
        DownloadCallback downloadCallback = this.e;
        if (downloadCallback == null) {
            LogUtil.j("DownloadListenerBatch", "onProgress, listener is null");
        } else {
            downloadCallback.onProgress(jLongValue, j3, z2, this.g);
        }
    }

    @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
    public void onFail(int i, Throwable th) {
        DownloadCallback downloadCallback = this.e;
        if (downloadCallback == null) {
            LogUtil.j("DownloadListenerBatch", "onFail, listener is null");
        } else {
            downloadCallback.onFail(i, th);
        }
    }
}
