package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.helper;

import android.os.CountDownTimer;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class TimerHelper {
    private OnFinishListener d;
    private CountDownTimer e;

    public interface OnFinishListener {
        void finish();
    }

    public TimerHelper(int i, int i2, final int i3) {
        this.e = new CountDownTimer(i * 1000, i2 * 1000) { // from class: com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.helper.TimerHelper.2
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                LogUtil.a("PressureMeasureMessage", "flag=" + i3);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (TimerHelper.this.d != null) {
                    TimerHelper.this.d.finish();
                }
            }
        };
    }

    public void c(CountDownTimer countDownTimer) {
        this.e = countDownTimer;
    }

    public CountDownTimer b() {
        return this.e;
    }

    public void e() {
        LogUtil.a("PressureMeasureMessage", "TimerHelper start");
        this.e.start();
    }

    public void d(OnFinishListener onFinishListener) {
        LogUtil.a("PressureMeasureMessage", "TimerHelper setOnFinishListener");
        this.d = onFinishListener;
    }
}
