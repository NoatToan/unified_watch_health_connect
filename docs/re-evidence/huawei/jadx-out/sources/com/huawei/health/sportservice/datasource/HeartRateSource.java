package com.huawei.health.sportservice.datasource;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.inter.DeviceToSource;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmg;
import defpackage.hbv;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.HEART_RATE_SOURCE)
public class HeartRateSource extends BaseSource<Integer> implements SportLifecycle, DeviceToSource {
    private static final String TAG = "SportService_HeartRateSource";
    private int mHeartRate;
    private Timer mTimer = new Timer(TAG);

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
        BaseSportManager.getInstance().updateSourceData(getLogTag(), "HEART_RATE_DATA", Integer.valueOf(this.mHeartRate));
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("HEART_RATE_DATA");
        BaseSportManager.getInstance().subscribeToDevice(arrayList, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void generateData(Integer num) {
        if (hbv.b(num.intValue())) {
            this.mHeartRate = num.intValue();
            cancelTimer();
            if (BaseSportManager.getInstance().getStatus() == 2) {
                this.mHeartRate = 0;
            } else {
                startTimer();
            }
            updateSourceData();
        }
        heartRateChange(this.mHeartRate);
    }

    public void heartRateChange(int i) {
        if (BaseSportManager.getInstance().getStatus() == 1 && BaseSportManager.getInstance().getSportType() == 283) {
            LogUtil.a(getLogTag(), "Skipping has started. Heart rate now. heartRate is : ", Integer.valueOf(i));
            dmg.a().setFitnessMachineControl(5, 0, new int[]{i});
        }
    }

    @Override // com.huawei.health.sportservice.inter.DeviceToSource
    public void onDeviceDataChanged(String str, Object obj) {
        LogUtil.a(TAG, "onDeviceDataChanged. heartRate is : ", obj);
        if (obj instanceof Integer) {
            generateData((Integer) obj);
        }
    }

    class MyTimerTask extends TimerTask {
        MyTimerTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            HeartRateSource.this.mHeartRate = 0;
            HeartRateSource.this.updateSourceData();
        }
    }

    private void cancelTimer() {
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
            this.mTimer.purge();
            this.mTimer = null;
        }
    }

    private void startTimer() {
        Timer timer = new Timer(TAG);
        this.mTimer = timer;
        timer.schedule(new MyTimerTask(), 8000L);
    }
}
