package com.huawei.hihealth.motion.util;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.health.IStepDataReport;
import com.huawei.hihealth.motion.ICommonReport;

/* JADX INFO: loaded from: classes2.dex */
public class StepLocalToRemoteProxy extends IStepDataReport.Stub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICommonReport f12328b;

    public ICommonReport getSelf() {
        return this.f12328b;
    }

    public StepLocalToRemoteProxy(ICommonReport iCommonReport) {
        this.f12328b = iCommonReport;
    }

    public boolean isScameLocalCallback(ICommonReport iCommonReport) {
        return this.f12328b == iCommonReport;
    }

    @Override // com.huawei.health.IStepDataReport
    public void report(Bundle bundle) throws RemoteException {
        ICommonReport iCommonReport = this.f12328b;
        if (iCommonReport != null) {
            iCommonReport.report(bundle);
        }
    }
}
