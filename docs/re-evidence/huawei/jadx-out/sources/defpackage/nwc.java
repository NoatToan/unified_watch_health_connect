package defpackage;

import android.os.Handler;
import com.apprichtap.haptic.player.d;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nwc implements IBaseResponseCallback {
    private Handler d;

    public nwc(Handler handler) {
        this.d = handler;
    }

    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
    public void onResponse(int i, Object obj) {
        LogUtil.a("HWhealthLinkage_DeviceSportStatusCallback", "checkDeviceSportStatus: onResponse ", obj);
        if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
            LogUtil.a("HWhealthLinkage_DeviceSportStatusCallback", "device not sporting");
            return;
        }
        LogUtil.a("HWhealthLinkage_DeviceSportStatusCallback", "device is sporting");
        Handler handler = this.d;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(d.a.d, 300L);
        }
    }
}
