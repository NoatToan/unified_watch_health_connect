package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.SampelBaseHandler;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nax implements SampelBaseHandler {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.SampelBaseHandler
    public void handle(eec eecVar, LinkageDeviceCommandListener linkageDeviceCommandListener, IBaseCallback iBaseCallback) {
        ReleaseLogUtil.e("R_INKAGE_DefaultHandler", "getHandler sampleBaseClassName error");
    }
}
