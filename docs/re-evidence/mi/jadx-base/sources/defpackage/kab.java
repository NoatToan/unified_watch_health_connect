package defpackage;

import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.wearable.fitness.launch.device.gym.SportGymSender;

/* JADX INFO: loaded from: classes10.dex */
public class kab extends cen {
    private void l(PhoneSportData phoneSportData) {
        SportGymSender sportGymSenderR0;
        dne dneVarW = f2o.x().w();
        if (dneVarW == null || (sportGymSenderR0 = dneVarW.R0()) == null) {
            return;
        }
        sportGymSenderR0.sendPhoneSportDataToWear(phoneSportData, null);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(SportLocationResult sportLocationResult) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        l(phoneSportData);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(x7r x7rVar) {
    }

    @Override // defpackage.cen, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, byte[] bArr, FinishSportData finishSportData) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
    }
}
