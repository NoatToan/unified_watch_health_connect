package defpackage;

import com.xiaomi.fitness.sport_eco_manager.sensor.SportSensorResult;

/* JADX INFO: loaded from: classes10.dex */
public class zth extends ia2 implements ezc {
    public zth(kdn kdnVar, um5 um5Var) {
        super(kdnVar, um5Var);
    }

    @Override // defpackage.ezc
    public void a(SportSensorResult sportSensorResult) {
        this.f20929a.onReceivePhoneSensorData(sportSensorResult);
    }
}
