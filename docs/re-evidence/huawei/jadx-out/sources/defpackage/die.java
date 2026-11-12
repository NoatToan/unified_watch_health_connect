package defpackage;

import android.content.Intent;
import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;

/* JADX INFO: loaded from: classes7.dex */
public class die extends JumpDeviceStrategy {
    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean checkSupportCapability(DeviceInfo deviceInfo) {
        return false;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        return true;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        if (this.mContext == null) {
            LogUtil.j("JumpPlayMachineStrategy", "mContext is null");
            return;
        }
        String str = lon.c().d("domain_play_machine") + "/hwtips/app/health_app/zh-CN/index.html#/app?cid=11068";
        Intent intent = new Intent();
        intent.setClass(this.mContext, WebViewActivity.class);
        intent.putExtra("url", str);
        iov.d(this.mContext, intent);
    }
}
