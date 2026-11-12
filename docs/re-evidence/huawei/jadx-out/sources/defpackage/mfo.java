package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.settings.sendswitchcommandtask.SendSwitchTask;

/* JADX INFO: loaded from: classes10.dex */
public class mfo extends SendSwitchTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mfd f41622a;

    @Override // com.huawei.hwdevice.mainprocess.mgr.settings.sendswitchcommandtask.SendSwitchTask
    public boolean isWillRunTask() {
        return true;
    }

    public mfo(String str, int i, mfd mfdVar) {
        super(str, i);
        this.f41622a = mfdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mfd mfdVar = this.f41622a;
        if (mfdVar != null) {
            mfdVar.e();
            this.f41622a = null;
        }
    }
}
