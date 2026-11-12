package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.esimhandler.BaseHandler;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;

/* JADX INFO: loaded from: classes15.dex */
public class pwf extends BaseHandler {
    @Override // com.huawei.sim.esimhandler.EsimHandler
    public void handle(pxp pxpVar) {
        if (pxpVar == null) {
            LogUtil.e("ActivateEsimHandler", "request is null");
            return;
        }
        setContext(pxpVar.f45946b);
        setMsgHandler(pxpVar.f);
        if (this.mHwMultiDeviceManager == null) {
            LogUtil.j("ActivateEsimHandler", "mHwMultiDeviceManager is null");
            this.mMsgHandler.sendEmptyMessage(AdapterWithBottomView.TYPE_BOTTOM);
        } else {
            this.mMsgHandler.sendEmptyMessageDelayed(AdapterWithBottomView.TYPE_BOTTOM, 10000L);
            LogUtil.a("ActivateEsimHandler", "addMultiSIMRequest");
            this.mHwMultiDeviceManager.a(pxk.a(pxpVar.h, pxpVar.n), pxk.e(pxpVar.j.d), this.mMsgHandler.obtainMessage(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007));
        }
    }
}
