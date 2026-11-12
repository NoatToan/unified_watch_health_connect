package defpackage;

import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class fdt extends fdv {
    public fdt(String str, String str2, String str3, File file, DownloadCallback downloadCallback) {
        super(str, str2, str3, file, downloadCallback);
    }

    @Override // defpackage.fdv, com.huawei.networkclient.ProgressListener
    public void onFinish(Object obj) {
        super.onFinish(obj);
        fdy.c(System.currentTimeMillis(), this.e + "_" + this.d);
    }
}
