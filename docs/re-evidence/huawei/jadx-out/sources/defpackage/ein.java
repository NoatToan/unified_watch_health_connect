package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.dnurse.sdk.DnurseDeviceTest;
import com.huawei.dnurse.sdk.IMeasureDataResultCallback;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Calendar;

/* JADX INFO: loaded from: classes7.dex */
public class ein extends MeasureController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IHealthDeviceCallback f33036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DnurseDeviceTest f33037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthDevice f33038c;
    private int d = -1;
    private IMeasureDataResultCallback e = new IMeasureDataResultCallback() { // from class: ein.3
        @Override // com.huawei.dnurse.sdk.IMeasureDataResultCallback
        public void onSuccess(SparseArray sparseArray) {
            Float f = (Float) sparseArray.get(1);
            float fFloatValue = f.floatValue();
            ReleaseLogUtil.d("DEVMGR_EcologyDevice_DnurseMeasureController", "mMeasureDataResultCallback onSuccess, result = ", f);
            emq emqVar = new emq();
            emqVar.setBloodSugar(fFloatValue);
            Calendar calendar = sparseArray.get(2) instanceof Calendar ? (Calendar) sparseArray.get(2) : null;
            if (calendar != null) {
                LogUtil.d("DnurseMeasureController", "onSuccess mTime = ", Long.valueOf(calendar.getTimeInMillis()));
                emqVar.setStartTime(calendar.getTimeInMillis());
                emqVar.setEndTime(calendar.getTimeInMillis());
            }
            emqVar.setSequenceNumber(0);
            if (ein.this.f33036a != null) {
                ein.this.f33036a.onDataChanged(ein.this.f33038c, emqVar);
            }
            ein.this.d = 8;
        }

        @Override // com.huawei.dnurse.sdk.IMeasureDataResultCallback
        public void onMeasuring(int i, int i2) {
            LogUtil.a("DnurseMeasureController", "Enter onMeasuring, status=", Integer.valueOf(i));
            if (ein.this.d != i) {
                ein.this.d = i;
                if (ein.this.f33038c instanceof dmr) {
                    ((dmr) ein.this.f33038c).a(ein.this.f33037b.getDeviceSn());
                }
                if (ein.this.f33036a == null || i == 8) {
                    return;
                }
                ein.this.f33036a.onStatusChanged(ein.this.f33038c, i);
            }
        }
    };

    public ein() {
        LogUtil.a("DnurseMeasureController", "Enter constructor");
        this.f33037b = DnurseDeviceTest.getInstance(dxw.d());
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.a("DnurseMeasureController", "Enter prepare");
        this.f33038c = healthDevice;
        this.f33036a = iHealthDeviceCallback;
        return true;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        ReleaseLogUtil.d("DEVMGR_EcologyDevice_DnurseMeasureController", "Enter start, mStatus=", Integer.valueOf(this.d));
        int i = this.d;
        if (i == 9) {
            this.f33037b.wakeupDevice();
        } else if (i < 0) {
            this.f33037b.startTest(this.e);
        } else {
            this.f33036a.onStatusChanged(this.f33038c, i);
        }
        enm.b(this.f33038c.getAddress(), 1);
        return true;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void ending() {
        LogUtil.a("DnurseMeasureController", "Enter ending");
        this.d = -1;
        this.f33037b.stopTest();
        enm.b(this.f33038c.getAddress(), 0);
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        LogUtil.a("DnurseMeasureController", "Enter cleanup");
        this.f33036a = null;
        this.f33038c = null;
        this.f33037b = null;
    }
}
