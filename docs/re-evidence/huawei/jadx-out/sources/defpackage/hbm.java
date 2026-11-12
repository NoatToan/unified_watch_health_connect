package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sportservice.download.common.BaseDownloader;
import com.huawei.health.sportservice.download.listener.ResDownloadCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class hbm extends BaseDownloader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResDownloadCallback f36360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f36361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hbf f36362c;
    private float d;
    private String f;
    private String i;
    private Context j;
    private String n;
    private String o;
    private int k = 0;
    private int l = 0;
    private View.OnClickListener g = new View.OnClickListener() { // from class: hbk
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.d.a(view);
        }
    };
    private ResDownloadCallback h = new AnonymousClass5();
    private hav e = new hav();

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public int getMaxNumberOfDownload() {
        return 2;
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public void onCancelDownload() {
    }

    /* synthetic */ void a(View view) {
        onStartDownload();
    }

    /* JADX INFO: renamed from: hbm$5, reason: invalid class name */
    class AnonymousClass5 implements ResDownloadCallback {
        AnonymousClass5() {
        }

        @Override // com.huawei.health.sportservice.download.listener.ResDownloadCallback
        public void onProgress(int i, String str) {
            int i2;
            if ("commonAudioDownloadState".equals(str)) {
                int i3 = (int) ((i - hbm.this.k) * hbm.this.d);
                if (i3 < 1) {
                    return;
                }
                hbm.this.k = i;
                hbm.this.f36360a.onProgress(i3, str);
            }
            if (!"audioBusinessCompleteDownloadState".equals(str) || (i2 = (int) ((i - hbm.this.l) * hbm.this.f36361b)) < 1) {
                return;
            }
            hbm.this.l = i;
            hbm.this.f36360a.onProgress(i2, str);
        }

        @Override // com.huawei.health.sportservice.download.listener.ResDownloadCallback
        public void onQueryCloudResult(HashMap<String, Boolean> map, boolean z, long j) {
            LogUtil.a("SportService_LanguageAudioDownload", "onQueryDownloadResult", Long.valueOf(j));
            Iterator<String> it = map.keySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (map.get(it.next()).booleanValue()) {
                    i++;
                }
            }
            long size = j / (i == 0 ? map.size() : i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(hbm.this.i);
            int i2 = 0;
            for (String str : map.keySet()) {
                boolean zEquals = Boolean.TRUE.equals(map.get(str));
                if (zEquals) {
                    z = false;
                }
                i2++;
                if (i2 == map.size() && !z && (hbm.this.j instanceof Activity)) {
                    ((Activity) hbm.this.j).runOnUiThread(new Runnable() { // from class: hbn
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f36365a.e();
                        }
                    });
                }
                hbm.this.f36360a.onQueryResult(str, zEquals, z, size, arrayList);
            }
        }

        /* synthetic */ void e() {
            if (hbm.this.f36362c != null) {
                hbm.this.f36362c.startQueryState();
            }
        }

        @Override // com.huawei.health.sportservice.download.listener.ResDownloadCallback
        public void onCompleteDownload(String str) {
            if ("commonAudioDownloadState".equals(str) || "audioBusinessCompleteDownloadState".equals(str)) {
                hbm.this.f36360a.onCompleteDownload(str);
            }
        }

        @Override // com.huawei.health.sportservice.download.listener.ResDownloadCallback
        public void onDownloadFail(int i, String str) {
            hbm.this.f36360a.onDownloadFail(i, str);
        }

        @Override // com.huawei.health.sportservice.download.listener.ResDownloadCallback
        public void onInstallSuccess(String str) {
            hbm.this.f36360a.onInstallSuccess(str);
        }
    }

    public hbm(Context context, String str, String str2, String str3, String str4) {
        this.j = context;
        this.f = str;
        this.o = str2;
        this.n = str3;
        this.i = str4;
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public void startQueryState() {
        this.e.downAudioResource(this.j, this.f, this.o, this.n, this.h);
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public void onStartDownload() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hbm.3
            @Override // java.lang.Runnable
            public void run() {
                hbm.this.e.startDownload();
            }
        });
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public View.OnClickListener cancelListener() {
        return this.e.d();
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public View.OnClickListener confirmListener() {
        return this.g;
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public void setDownloadListener(ResDownloadCallback resDownloadCallback) {
        this.f36360a = resDownloadCallback;
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public void setProgressRatio(String str, float f) {
        if ("commonAudioDownloadState".equals(str)) {
            this.d = f;
        }
        if ("audioBusinessCompleteDownloadState".equals(str)) {
            this.f36361b = f;
        }
    }

    public void e(hbf hbfVar) {
        this.f36362c = hbfVar;
    }
}
