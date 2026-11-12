package defpackage;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class xv9 extends zv9 {
    public SportLocationResult g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39500k;
    public PhoneSportData l;
    public String f = "FitnessSportV2Controller";
    public long m = 0;

    public class a implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f39501a;

        public a(boolean z) {
            this.f39501a = z;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            if (this.f39501a) {
                return;
            }
            FitnessLogUtils.i(xv9.this.f, "timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + ",fail , sendPhoneSportData resultCode = " + i2 + ",sportVersion=2");
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            if (this.f39501a) {
                return;
            }
            FitnessLogUtils.i(xv9.this.f, "timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + ",success ,sportVersion=2");
        }
    }

    public xv9() {
        FitnessLogUtils.i("FitnessSportV2Controller", "FitnessSportV2Controller , constructor");
    }

    @Override // defpackage.mrc
    public boolean b(float f, int i, int i2) {
        this.i = i2;
        this.h = i;
        FitnessLogUtils.i(this.f, "sportNotifyKm");
        return false;
    }

    @Override // defpackage.mrc
    public boolean c(int i) {
        this.j = i;
        FitnessLogUtils.i(this.f, "sportNotifySpeed");
        return false;
    }

    @Override // defpackage.cen
    public void g() {
        super.g();
        PhoneSportData phoneSportData = this.l;
        if (phoneSportData != null) {
            phoneSportData.duration = (int) f2o.x().J();
            m(this.l);
        }
    }

    public final void m(PhoneSportData phoneSportData) {
        if (System.currentTimeMillis() - this.m < 800 || phoneSportData == null) {
            return;
        }
        FitnessLogUtils.i(this.f, "sendDataToWear  timestamp : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + ", phoneSportData : " + phoneSportData + ",this:" + this);
        if (f2o.x().t() == 6) {
            phoneSportData.duration = (int) phoneSportData.deviceDuration;
        }
        n(false, phoneSportData, f2o.x().U(f2o.x().I()));
        Map<String, fv2> mapAccessoriesGet = f2o.x().r().accessoriesGet();
        if (mapAccessoriesGet != null) {
            Iterator<String> it = mapAccessoriesGet.keySet().iterator();
            while (it.hasNext()) {
                fv2 fv2Var = mapAccessoriesGet.get(it.next());
                if (fv2Var != null) {
                    n(true, phoneSportData, fv2Var.t0());
                }
            }
        }
        this.m = System.currentTimeMillis();
    }

    public final void n(boolean z, PhoneSportData phoneSportData, e6o e6oVar) {
        if (e6oVar != null) {
            e6oVar.h(phoneSportData, new a(z), f2o.x().K());
        } else {
            FitnessLogUtils.i(this.f, "sportWearSender == null");
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(SportLocationResult sportLocationResult) {
        this.g = sportLocationResult;
    }

    @Override // defpackage.zv9, com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        PhoneSportData phoneSportDataCopy = phoneSportData.copy();
        super.onPhoneDataChanged(phoneSportDataCopy);
        this.l = phoneSportDataCopy;
        phoneSportDataCopy.reminder_heart_rate = 0;
        phoneSportDataCopy.reminder_kilometre_duration = 0;
        phoneSportDataCopy.reminder_kilometre_pace = 0;
        phoneSportDataCopy.reminder_pace = 0;
        int i = this.j;
        if (i != 0) {
            phoneSportDataCopy.reminder_pace = i;
            FitnessLogUtils.i(this.f, "remind sportNotifyPace:" + this.j);
            this.j = 0;
        }
        int i2 = this.f39500k;
        if (i2 != 0) {
            phoneSportDataCopy.reminder_heart_rate = i2;
            FitnessLogUtils.i(this.f, "remind sportNotifyHr :" + this.f39500k);
            this.f39500k = 0;
        }
        int i3 = this.h;
        if (i3 != 0) {
            phoneSportDataCopy.reminder_kilometre_duration = i3;
            FitnessLogUtils.i(this.f, "remind sportNotifyKm , diatance:" + phoneSportDataCopy.distance + ", duration:" + this.h);
            this.h = 0;
        }
        int i4 = this.i;
        if (i4 != 0) {
            phoneSportDataCopy.reminder_kilometre_pace = i4;
            FitnessLogUtils.i(this.f, "remind sportNotifyKm , diatance:" + phoneSportDataCopy.distance + ", pace:" + this.i);
            this.i = 0;
        }
        if (this.e) {
            return;
        }
        m(phoneSportDataCopy);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(x7r x7rVar) {
    }

    @Override // defpackage.cen, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, byte[] bArr, FinishSportData finishSportData) {
        j();
        k();
        this.l = null;
    }

    @Override // defpackage.cen, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        super.onSportPaused();
        this.l = null;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
    }

    @Override // defpackage.mrc
    public boolean sportNotifyHr(int i) {
        this.f39500k = i;
        FitnessLogUtils.i(this.f, "sportNotifyHr");
        return false;
    }

    @Override // defpackage.mrc
    public boolean sportNotifyPace(int i) {
        this.j = i;
        FitnessLogUtils.i(this.f, "sportNotifyPace");
        return false;
    }
}
