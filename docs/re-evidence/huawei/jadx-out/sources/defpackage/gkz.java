package defpackage;

import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ProgressListener;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class gkz extends oer {
    private final DataCallback e;

    public gkz(String str, Map<String, String> map, File file, ProgressListener<File> progressListener, DataCallback dataCallback) {
        super(str, map, file, progressListener);
        this.e = dataCallback;
    }

    @Override // defpackage.oer, com.huawei.networkclient.IDownloadStrategy
    public void handleException(Throwable th, int i) {
        super.handleException(th, i);
        if (this.e == null) {
            LogUtil.j("MediaDownloadStrategy", "handleException mCallback is null");
        } else {
            ghu.e(getUrl(), th, this.e, i);
        }
    }
}
