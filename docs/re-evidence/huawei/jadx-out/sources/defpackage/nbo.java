package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.linkage.eventproducer.SampleEventProducer;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nbo implements SampleEventProducer {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.eventproducer.SampleEventProducer
    public eee createSampleEvent(int i, String str) {
        byte[] bArrE = new cqj().b(2, 1).e();
        LogUtil.a("LINKAGE_StopLinkageEvent", "createStopLinkageEvent eventData: ", eeq.e(bArrE));
        return sampleEventBulid(800400014L, bArrE);
    }
}
