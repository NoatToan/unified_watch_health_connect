package defpackage;

import com.huawei.ads.adsrec.IEventReportCallback;
import com.huawei.ads.fund.util.JsonUtil;
import com.huawei.openplatform.abl.log.HiAdLog;

/* JADX INFO: loaded from: classes4.dex */
public class ayl {
    public void d(axg axgVar) {
        IEventReportCallback iEventReportCallbackD = awz.d();
        if (iEventReportCallbackD == null) {
            return;
        }
        if (HiAdLog.isDebugEnable()) {
            axgVar.c();
            axgVar.i();
            axgVar.o();
            axgVar.m();
            JsonUtil.toJsonNoException(axgVar);
        }
        iEventReportCallbackD.eventProcess(axgVar);
    }
}
