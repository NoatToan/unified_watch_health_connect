package com.huawei.health.sportservice.download;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.huawei.health.sportservice.download.common.BaseDownloader;
import com.huawei.health.sportservice.download.common.ResDownloadUserConfirmation;
import com.huawei.health.sportservice.download.listener.ResDownloadCallback;
import com.huawei.pluginsport.multilingualaudio.AudioResDownloadListener;
import com.huawei.ui.commonui.R;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class CustomDownloadManager implements ResDownloadCallback {
    private AudioResDownloadListener d;
    private boolean f;
    private Context g;
    private int i;
    private ResDownloadUserConfirmation j;
    private int l;
    private int m;
    private long s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<View.OnClickListener> f8831a = new ArrayList();
    private List<View.OnClickListener> e = new ArrayList();
    private List<BaseDownloader> h = new ArrayList();
    private HashMap<String, Boolean> o = new HashMap<>();
    private HashMap<String, Long> k = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8832b = 0;
    private List<String> n = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8833c = false;

    public CustomDownloadManager(Context context) {
        this.g = context;
    }

    public void e(List<BaseDownloader> list, AudioResDownloadListener audioResDownloadListener) {
        if (njy.e(list)) {
            LogUtil.e("SportService_CustomDownloadManager", "downloaderList is empty");
            audioResDownloadListener.onResult(0);
            return;
        }
        if (Utils.k()) {
            LogUtil.e("SportService_CustomDownloadManager", "isOverseaNoCloudVersion");
            audioResDownloadListener.onResult(0);
            return;
        }
        this.h = list;
        this.d = audioResDownloadListener;
        for (BaseDownloader baseDownloader : list) {
            this.l += baseDownloader.getMaxNumberOfDownload();
            baseDownloader.setDownloadListener(this);
        }
    }

    @Override // com.huawei.health.sportservice.download.listener.ResDownloadCallback
    public void onQueryResult(String str, boolean z, boolean z2, long j, List<String> list) {
        LogUtil.b("SportService_CustomDownloadManager", "type= ", str, " isDownload= ", Boolean.valueOf(z), " isCancelAllDownload = ", Boolean.valueOf(z2), " size= ", Long.valueOf(j));
        this.k.put(str, Long.valueOf(j));
        a(list);
        if (z) {
            this.s += j;
            this.f8832b++;
            this.f = z;
        }
        if (z2) {
            LogUtil.b("SportService_CustomDownloadManager", "isCancelAllDownload");
            Iterator<BaseDownloader> it = this.h.iterator();
            while (it.hasNext()) {
                it.next().onCancelDownload();
            }
            this.d.onResult(0);
            return;
        }
        int size = this.k.size();
        int i = this.l;
        if (size != i) {
            LogUtil.b("SportService_CustomDownloadManager", "check statue...", Integer.valueOf(i));
            return;
        }
        if (!this.f) {
            LogUtil.b("SportService_CustomDownloadManager", "!mIsNeedDownload");
            this.d.onResult(0);
            return;
        }
        if (this.s == 0) {
            LogUtil.e("SportService_CustomDownloadManager", "mTotalSize == 0");
            this.d.onResult(0);
            return;
        }
        e();
        for (BaseDownloader baseDownloader : this.h) {
            for (String str2 : this.k.keySet()) {
                baseDownloader.setProgressRatio(str2, this.k.get(str2).longValue() / this.s);
            }
        }
        a();
        this.k.clear();
    }

    private void a(List<String> list) {
        if (njy.e(list)) {
            LogUtil.e("SportService_CustomDownloadManager", "moduleNames is null");
            return;
        }
        for (String str : list) {
            if (!this.n.contains(str)) {
                this.n.add(str);
            }
        }
    }

    private void a() {
        ResDownloadUserConfirmation.c(this.g).runOnUiThread(new Runnable() { // from class: hax
            @Override // java.lang.Runnable
            public final void run() {
                this.f36337c.c();
            }
        });
    }

    public /* synthetic */ void c() {
        ResDownloadUserConfirmation resDownloadUserConfirmation = new ResDownloadUserConfirmation(this.g);
        this.j = resDownloadUserConfirmation;
        resDownloadUserConfirmation.d(new View.OnClickListener() { // from class: com.huawei.health.sportservice.download.CustomDownloadManager.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomDownloadManager.this.d.onResult(0);
            }
        }, this.n, this.s, this.f8831a, this.e);
    }

    private void e() {
        for (BaseDownloader baseDownloader : this.h) {
            this.f8831a.add(baseDownloader.confirmListener());
            this.e.add(baseDownloader.cancelListener());
        }
    }

    @Override // com.huawei.health.sportservice.download.listener.ResDownloadCallback
    public void onProgress(int i, String str) {
        int i2 = this.m + i;
        this.m = i2;
        this.j.b("", i2, this.e);
    }

    @Override // com.huawei.health.sportservice.download.listener.ResDownloadCallback
    public void onCompleteDownload(String str) {
        this.o.put(str, true);
    }

    @Override // com.huawei.health.sportservice.download.listener.ResDownloadCallback
    public void onInstallSuccess(String str) {
        LogUtil.b("SportService_CustomDownloadManager", "mActualDownload= ", Integer.valueOf(this.f8832b));
        int i = this.i + 1;
        this.i = i;
        if (i < this.h.size()) {
            LogUtil.b("SportService_CustomDownloadManager", "mDownloadSuccessNum= ", Integer.valueOf(this.i));
        } else if (this.o.size() == this.f8832b) {
            ResDownloadUserConfirmation resDownloadUserConfirmation = this.j;
            if (resDownloadUserConfirmation != null) {
                resDownloadUserConfirmation.a();
            }
            this.d.onResult(1);
        }
    }

    @Override // com.huawei.health.sportservice.download.listener.ResDownloadCallback
    public void onDownloadFail(int i, String str) {
        LogUtil.b("SportService_CustomDownloadManager", "errorCode ", Integer.valueOf(i), " errorInfo= ", str, "onDownloadFail ", Integer.valueOf(this.f8832b));
        Activity activityC = ResDownloadUserConfirmation.c(this.g);
        if (this.f8833c) {
            LogUtil.b("SportService_CustomDownloadManager", "error dialog statue is open");
        } else {
            this.f8833c = true;
            activityC.runOnUiThread(new Runnable() { // from class: haw
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void b() {
        ResDownloadUserConfirmation resDownloadUserConfirmation = this.j;
        if (resDownloadUserConfirmation == null) {
            LogUtil.e("SportService_CustomDownloadManager", "show Error Dialog == null");
        } else {
            resDownloadUserConfirmation.a();
            this.j.c(this.g.getString(R.string.IDS_update_download_failed), new View.OnClickListener() { // from class: com.huawei.health.sportservice.download.CustomDownloadManager.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CustomDownloadManager.this.d.onResult(0);
                    CustomDownloadManager.this.f8833c = false;
                }
            }, new View.OnClickListener() { // from class: com.huawei.health.sportservice.download.CustomDownloadManager.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CustomDownloadManager.this.f8833c = false;
                    CustomDownloadManager.this.d();
                    if (CommonUtil.ab(CustomDownloadManager.this.g)) {
                        Iterator it = CustomDownloadManager.this.h.iterator();
                        while (it.hasNext()) {
                            ((BaseDownloader) it.next()).startQueryState();
                        }
                    } else {
                        LogUtil.e("SportService_CustomDownloadManager", "The network is not connected.");
                        CustomDownloadManager.this.b();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.s = 0L;
        this.k.clear();
        this.f8832b = 0;
        this.f = false;
        this.i = 0;
    }
}
