package defpackage;

import com.huawei.health.healthcloudconfig.listener.DownloadCallback;

/* JADX INFO: loaded from: classes7.dex */
public class fdw extends fdq {
    public fdw(String str, String str2, int i, DownloadCallback downloadCallback) {
        super(str, str2, i, downloadCallback);
    }

    @Override // defpackage.fdq, com.huawei.health.healthcloudconfig.listener.DownloadCallback
    public void onFinish(Object obj) {
        super.onFinish(obj);
        fdy.c(System.currentTimeMillis(), fdy.d(this.f33909c, this.f33908b, false));
    }
}
