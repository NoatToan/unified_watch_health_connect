package defpackage;

import android.os.Bundle;
import com.huawei.health.ui.notification.common.IReporter;
import health.compact.a.LogAnonymous;
import health.compact.a.StepsRecord;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class iuz extends IReporter {
    private iva e;

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void languageChanged() {
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStart(Bundle bundle) {
        super.onStart(bundle);
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void refresh(StepsRecord stepsRecord) {
        if (stepsRecord != null && stepsRecord.f == 0) {
            iva ivaVar = this.e;
            if (ivaVar != null) {
                ivaVar.e(0, stepsRecord.e());
                return;
            }
            return;
        }
        try {
            if (this.e == null) {
                iva ivaVar2 = new iva();
                this.e = ivaVar2;
                ivaVar2.e();
            }
            iva ivaVar3 = this.e;
            if (ivaVar3 == null || stepsRecord == null) {
                return;
            }
            ivaVar3.e(stepsRecord.f, stepsRecord.e());
        } catch (Exception e) {
            ReleaseLogUtil.a("R_StepForMmReporter", "refresh exception,", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStop() {
        super.onStop();
        try {
            iva ivaVar = this.e;
            if (ivaVar != null) {
                ivaVar.a();
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("R_StepForMmReporter", "onStop exception,", LogAnonymous.b(e));
        }
    }
}
