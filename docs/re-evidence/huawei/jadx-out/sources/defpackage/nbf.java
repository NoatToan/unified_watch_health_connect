package defpackage;

import android.text.TextUtils;
import com.huawei.hwdevice.phoneprocess.mgr.linkage.eventproducer.SampleEventProducer;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nbf implements SampleEventProducer {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.eventproducer.SampleEventProducer
    public eee createSampleEvent(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            eee eeeVar = new eee();
            eeeVar.a(Long.MAX_VALUE);
            return eeeVar;
        }
        byte[] bArrE = new cqj().b(2, 2).b(4, Integer.parseInt(str)).e();
        LogUtil.a("LINKAGE_ReplyResumeLinkageEvent", "ReplyResumeLinkageEvent replyData: ", eeq.e(bArrE));
        return sampleEventBulid(800400014L, bArrE);
    }
}
