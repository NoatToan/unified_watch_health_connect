package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.settings.sendswitchcommandtask.SendSwitchTask;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mfl extends SendSwitchTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41612c;
    private mfd e;

    public mfl(String str, int i, int i2, mfd mfdVar) {
        super(str, i);
        this.e = mfdVar;
        this.f41612c = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        mfd mfdVar = this.e;
        if (mfdVar != null) {
            mfdVar.d(this.f41612c);
            this.e = null;
        } else {
            LogUtil.j("HwDefaultSleepTask", "mHeartRateHelper is null.");
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settings.sendswitchcommandtask.SendSwitchTask
    public boolean isWillRunTask() {
        return (this.f41612c & 1) == 1;
    }
}
