package defpackage;

import android.text.TextUtils;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class fdx extends fdq {
    private String h;
    private fcz j;

    public fdx(String str, String str2, int i, fcz fczVar, DownloadCallback downloadCallback) {
        super(str, str2, i, downloadCallback);
        this.h = "";
        this.j = fczVar;
    }

    public fdx(String str, String str2, int i, fcz fczVar, String str3, DownloadCallback downloadCallback) {
        super(str, str2, i, downloadCallback);
        this.j = fczVar;
        this.h = str3;
    }

    @Override // defpackage.fdq, com.huawei.health.healthcloudconfig.listener.DownloadCallback
    public void onFinish(Object obj) {
        this.d++;
        if (this.d == this.f33907a) {
            if (this.e == null) {
                LogUtil.j("BatchTaskResponseListener", "onFinish, listener is null");
                return;
            }
            this.e.onFinish(this.j);
            if (TextUtils.isEmpty(this.h)) {
                return;
            }
            fdy.c(System.currentTimeMillis(), fdy.d(this.f33909c, this.f33908b, true));
        }
    }
}
