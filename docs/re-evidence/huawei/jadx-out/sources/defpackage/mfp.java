package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwdevice.mainprocess.mgr.settings.sendswitchcommandtask.SendSwitchTask;

/* JADX INFO: loaded from: classes10.dex */
public class mfp extends SendSwitchTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mfd f41623a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceCapability f41624c;

    @Override // com.huawei.hwdevice.mainprocess.mgr.settings.sendswitchcommandtask.SendSwitchTask
    public boolean isWillRunTask() {
        return true;
    }

    public mfp(String str, int i, mfd mfdVar, DeviceCapability deviceCapability) {
        super(str, i);
        this.f41623a = mfdVar;
        this.f41624c = deviceCapability;
    }

    @Override // java.lang.Runnable
    public void run() {
        mfd mfdVar = this.f41623a;
        if (mfdVar != null) {
            mfdVar.b(this.f41624c);
            this.f41623a = null;
        }
    }
}
