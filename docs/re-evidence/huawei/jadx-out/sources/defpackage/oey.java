package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.networkclient.ProgressListener;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes12.dex */
public class oey implements ProgressListener {
    @Override // com.huawei.networkclient.ProgressListener
    public void onFinish(Object obj) {
    }

    @Override // com.huawei.networkclient.ProgressListener
    public void onProgress(long j, long j2, boolean z) {
    }

    @Override // com.huawei.networkclient.ProgressListener
    public void onFail(Throwable th) {
        LogUtil.d("NullProgressListener", "onFail", ExceptionUtils.c(th));
    }
}
