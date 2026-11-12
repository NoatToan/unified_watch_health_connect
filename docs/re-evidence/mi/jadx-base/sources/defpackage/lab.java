package defpackage;

import com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class lab extends den {
    private void j(PhoneSportData phoneSportData) {
        SportGymSender sportGymSenderI0;
        ene eneVarQ = g2o.s().q();
        if (eneVarQ == null || (sportGymSenderI0 = eneVarQ.I0()) == null) {
            return;
        }
        sportGymSenderI0.sendPhoneSportDataToWear(phoneSportData, null);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        j(phoneSportData);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(y7r y7rVar) {
    }

    @Override // defpackage.den, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr) {
    }
}
