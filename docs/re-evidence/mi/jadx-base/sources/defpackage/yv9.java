package defpackage;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class yv9 extends aw9 {
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40608k;
    public PhoneSportData l;
    public String g = "FitnessSportV2Controller";
    public long m = 0;

    public class a implements OnEcoSyncCallback {
        public a() {
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String str, int i, int i2) {
            FitnessLogUtils.i(yv9.this.g, "timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + ",fail , sendPhoneSportData resultCode = " + i2 + ",sportVersion=2");
            yv9.this.f15453b.set(false);
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onSuccess(String str, int i, EcoSyncResult ecoSyncResult) {
            FitnessLogUtils.i(yv9.this.g, "timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + ",success ,sportVersion=2");
            yv9.this.f15453b.set(false);
        }
    }

    public yv9() {
        FitnessLogUtils.i("FitnessSportV2Controller", "FitnessSportV2Controller , constructor");
    }

    @Override // defpackage.nrc
    public boolean b(float f, int i, int i2) {
        this.i = i2;
        this.h = i;
        FitnessLogUtils.i(this.g, "sportNotifyKm");
        return false;
    }

    @Override // defpackage.nrc
    public boolean c(int i) {
        this.j = i;
        FitnessLogUtils.i(this.g, "sportNotifySpeed");
        return false;
    }

    @Override // defpackage.den
    public void g() {
        super.g();
        PhoneSportData phoneSportData = this.l;
        if (phoneSportData != null) {
            phoneSportData.duration = (int) g2o.s().E();
            k(this.l);
        }
    }

    public final void k(PhoneSportData phoneSportData) {
        if (System.currentTimeMillis() - this.m >= 800) {
            FitnessLogUtils.i(this.g, "sendDataToWear  timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + ", phoneSportData : " + phoneSportData + ",this:" + this);
            f6o f6oVarM = g2o.s().M(g2o.s().D());
            if (f6oVarM != null) {
                f6oVarM.h(phoneSportData, new a(), g2o.s().F());
            }
            this.m = System.currentTimeMillis();
        }
    }

    @Override // defpackage.aw9, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        PhoneSportData phoneSportDataCopy = phoneSportData.copy();
        super.onPhoneDataChanged(phoneSportDataCopy);
        SportData sportDataZ = g2o.s().z();
        phoneSportDataCopy.step += sportDataZ == null ? 0 : sportDataZ.totalStep;
        this.l = phoneSportDataCopy;
        phoneSportDataCopy.reminder_heart_rate = 0;
        phoneSportDataCopy.reminder_kilometre_duration = 0;
        phoneSportDataCopy.reminder_kilometre_pace = 0;
        phoneSportDataCopy.reminder_pace = 0;
        int i = this.j;
        if (i != 0) {
            phoneSportDataCopy.reminder_pace = i;
            FitnessLogUtils.i(this.g, "remind sportNotifyPace:" + this.j);
            this.j = 0;
        }
        int i2 = this.f40608k;
        if (i2 != 0) {
            phoneSportDataCopy.reminder_heart_rate = i2;
            FitnessLogUtils.i(this.g, "remind sportNotifyHr :" + this.f40608k);
            this.f40608k = 0;
        }
        int i3 = this.h;
        if (i3 != 0) {
            phoneSportDataCopy.reminder_kilometre_duration = i3;
            FitnessLogUtils.i(this.g, "remind sportNotifyKm , diatance:" + phoneSportDataCopy.distance + ", duration:" + this.h);
            this.h = 0;
        }
        int i4 = this.i;
        if (i4 != 0) {
            phoneSportDataCopy.reminder_kilometre_pace = i4;
            FitnessLogUtils.i(this.g, "remind sportNotifyKm , diatance:" + phoneSportDataCopy.distance + ", pace:" + this.i);
            this.i = 0;
        }
        if (this.e) {
            return;
        }
        k(phoneSportDataCopy);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(y7r y7rVar) {
    }

    @Override // defpackage.den, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr) {
        i();
        this.l = null;
    }

    @Override // defpackage.nrc
    public boolean sportNotifyHr(int i) {
        this.f40608k = i;
        FitnessLogUtils.i(this.g, "sportNotifyHr");
        return false;
    }

    @Override // defpackage.nrc
    public boolean sportNotifyPace(int i) {
        this.j = i;
        FitnessLogUtils.i(this.g, "sportNotifyPace");
        return false;
    }
}
