package defpackage;

import com.huawei.wearengine.core.common.OnFinishedCallback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes46.dex */
public class yiu implements OnFinishedCallback {
    private final CountDownLatch e;

    public yiu(int i) {
        this.e = new CountDownLatch(i);
    }

    public boolean a(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.e.await(j, timeUnit);
    }

    @Override // com.huawei.wearengine.core.common.OnFinishedCallback
    public void onFinish() {
        this.e.countDown();
    }
}
