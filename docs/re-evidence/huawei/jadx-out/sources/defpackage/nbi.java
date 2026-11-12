package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.linkage.eventproducer.SampleEventProducer;

/* JADX INFO: loaded from: classes11.dex */
public class nbi implements SampleEventProducer {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.eventproducer.SampleEventProducer
    public eee createSampleEvent(int i, String str) {
        eee eeeVar = new eee();
        eeeVar.a(Long.MAX_VALUE);
        return eeeVar;
    }
}
