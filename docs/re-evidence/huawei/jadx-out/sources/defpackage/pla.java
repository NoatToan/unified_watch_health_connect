package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ProgressListener;
import com.huawei.pluginsocialshare.cloud.bean.DataCallback;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class pla extends oer {
    private DataCallback e;

    public pla(String str, Map<String, String> map, File file, ProgressListener<File> progressListener, DataCallback dataCallback) {
        super(str, map, file, progressListener);
        this.e = dataCallback;
    }

    @Override // defpackage.oer, com.huawei.networkclient.IDownloadStrategy
    public void handleException(Throwable th, int i) {
        super.handleException(th, i);
        DataCallback dataCallback = this.e;
        if (dataCallback == null) {
            LogUtil.j("ShareDataDownloadStrategy", "handleException mCallback is null");
        } else {
            dataCallback.onFailure(i, ExceptionUtils.c(th));
        }
    }
}
