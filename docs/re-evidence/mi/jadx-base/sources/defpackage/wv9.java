package defpackage;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class wv9 extends aw9 {
    public String g = "FitnessSportV1Controller";

    public class a implements OnEcoSyncCallback {
        public a() {
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String str, int i, int i2) {
            FitnessLogUtils.i(wv9.this.g, "timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + "fail , sendPhoneSportData resultCode = " + i2);
            wv9.this.f15453b.set(false);
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onSuccess(String str, int i, EcoSyncResult ecoSyncResult) {
            FitnessLogUtils.i(wv9.this.g, "timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + "success ,sportVersion=");
            wv9.this.f15453b.set(false);
        }
    }

    @Override // defpackage.den
    public void f(int i, int i2, int i3) {
    }

    @Override // defpackage.aw9, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        super.onPhoneDataChanged(phoneSportData);
        if (this.f15453b.get()) {
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.i(this.g, "has pending phoneSportData to send, abort this");
        } else {
            this.f15453b.set(true);
            if (g2o.s().M(g2o.s().D()) == null) {
                return;
            }
            g2o.s().M(g2o.s().D()).sendPhoneSportDataToWear(phoneSportData, new a());
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(y7r y7rVar) {
    }

    @Override // defpackage.den, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr) {
    }
}
