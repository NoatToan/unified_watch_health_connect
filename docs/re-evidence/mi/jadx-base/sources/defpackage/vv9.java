package defpackage;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class vv9 extends zv9 {
    public String f = "FitnessSportV1Controller";

    public class a implements OnSyncCallback {
        public a() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            FitnessLogUtils.i(vv9.this.f, "timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + "fail , sendPhoneSportData resultCode = " + i2);
            vv9.this.c.set(false);
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            FitnessLogUtils.i(vv9.this.f, "timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + "success ,sportVersion=");
            vv9.this.c.set(false);
        }
    }

    @Override // defpackage.cen
    public void f(SportRequestData sportRequestData, int i) {
        h(SportDeviceModel.INSTANCE.curDeviceDid(), 1);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(SportLocationResult sportLocationResult) {
    }

    @Override // defpackage.zv9, com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        super.onPhoneDataChanged(phoneSportData);
        if (this.c.get()) {
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.i(this.f, "has pending phoneSportData to send, abort this");
        } else {
            this.c.set(true);
            if (f2o.x().U(f2o.x().I()) == null) {
                return;
            }
            f2o.x().U(f2o.x().I()).sendPhoneSportDataToWear(phoneSportData, new a());
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(x7r x7rVar) {
    }

    @Override // defpackage.cen, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, byte[] bArr, FinishSportData finishSportData) {
        j();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
    }
}
