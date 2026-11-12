package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.esimhandler.BaseHandler;
import com.huawei.up.utils.ErrorCode;

/* JADX INFO: loaded from: classes15.dex */
public class pwm extends BaseHandler {
    @Override // com.huawei.sim.esimhandler.EsimHandler
    public void handle(pxp pxpVar) {
        if (pxpVar == null) {
            LogUtil.e("GetEsimStatusHandler", "request is null");
            return;
        }
        setContext(pxpVar.f45946b);
        setMsgHandler(pxpVar.f);
        if (this.mHwMultiDeviceManager == null) {
            LogUtil.j("GetEsimStatusHandler", "mHwMultiDeviceManager is null");
            this.mMsgHandler.sendEmptyMessage(100003);
        } else {
            this.mMsgHandler.sendEmptyMessageDelayed(100003, 10000L);
            LogUtil.a("GetEsimStatusHandler", "queryMultiSimServiceStatus");
            this.mHwMultiDeviceManager.e(pxk.a(pxpVar.h, pxpVar.n), pxk.e(pxpVar.j.d), this.mMsgHandler.obtainMessage(ErrorCode.HWID_IS_STOPED));
        }
    }
}
