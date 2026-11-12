package com.huawei.openalliance.ad.analysis;

import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentRecord f18253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppInfo f18254c;
    private AppDownloadTask d;
    private boolean e;

    public boolean e() {
        return this.e;
    }

    public AppDownloadTask d() {
        return this.d;
    }

    public ContentRecord c() {
        return this.f18253b;
    }

    public AppInfo b() {
        return this.f18254c;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void a(AppInfo appInfo) {
        this.f18254c = appInfo;
    }

    public void a(AppDownloadTask appDownloadTask) {
        this.d = appDownloadTask;
    }

    public void a(ContentRecord contentRecord) {
        this.f18253b = contentRecord;
    }

    public int a() {
        return this.f18252a;
    }

    public e(int i) {
        this.f18252a = i;
    }
}
