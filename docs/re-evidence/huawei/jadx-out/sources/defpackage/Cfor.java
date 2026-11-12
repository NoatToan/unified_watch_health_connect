package defpackage;

import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: renamed from: for, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class Cfor implements HiUnSubscribeListener {
    private final String d;

    public Cfor(String str) {
        this.d = str;
    }

    @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
    public void onResult(boolean z) {
        LogUtil.a(this.d, "KnitHealthDataUnSubscriber unsubscribe isSuccess = ", Boolean.valueOf(z));
    }
}
