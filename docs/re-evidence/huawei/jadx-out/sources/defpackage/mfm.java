package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.settings.sendswitchcommandtask.SendSwitchTask;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mfm extends SendSwitchTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41613c;
    private mfd e;

    public mfm(String str, int i, int i2, mfd mfdVar) {
        super(str, i);
        this.e = mfdVar;
        this.f41613c = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.e != null) {
            LogUtil.a("HwDefaultHeartRateTask", "run sendDefaultHeartRate");
            this.e.b(this.f41613c);
            this.e = null;
            return;
        }
        LogUtil.j("HwDefaultHeartRateTask", "mHeartRateHelper is null.");
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settings.sendswitchcommandtask.SendSwitchTask
    public boolean isWillRunTask() {
        int i = this.f41613c;
        return (i & 2) == 2 || (i & 8) == 8;
    }
}
