package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.linkage.eventproducer.SampleEventProducer;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nbr implements SampleEventProducer {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.eventproducer.SampleEventProducer
    public eee createSampleEvent(int i, String str) {
        byte[] bArrE = new cqj().e(1, System.currentTimeMillis()).e(2, i).e();
        LogUtil.a("LINKAGE_SportStopEvent", "SportStopEvent create: ", eeq.e(bArrE));
        return sampleEventBulid(800400003L, bArrE);
    }
}
