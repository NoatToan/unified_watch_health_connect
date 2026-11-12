package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.helper;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.uey;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class CustTimerHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownTimer f26981c;
    private OnFinishListener d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26980b = BaseApplication.getContext();
    private List<Long> e = null;

    public interface OnFinishListener {
        void finish();
    }

    public CustTimerHelper(int i, int i2) {
        this.f26981c = new CountDownTimer((i * 1000) + 15, i2 * 1000) { // from class: com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.helper.CustTimerHelper.3
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                LogUtil.a("PressureMeasureMessage", "CustTimerHelper current = ");
                if (CustTimerHelper.this.e == null) {
                    CustTimerHelper.this.e = new ArrayList(16);
                    LogUtil.a("PressureMeasureMessage", "mTimeFlagList instance");
                }
                CustTimerHelper.this.e.add(Long.valueOf(System.currentTimeMillis()));
                if (uey.a().y() > 0) {
                    LogUtil.a("PressureMeasureMessage", "first time !!!");
                    uey.a().f(0);
                    return;
                }
                CustTimerHelper custTimerHelper = CustTimerHelper.this;
                if (custTimerHelper.d(custTimerHelper.e)) {
                    CustTimerHelper.this.d();
                    return;
                }
                LogUtil.a("PressureMeasureMessage", "this is last time ,time = " + System.currentTimeMillis());
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (CustTimerHelper.this.e != null) {
                    CustTimerHelper.this.e.clear();
                    CustTimerHelper.this.e = null;
                }
                if (CustTimerHelper.this.d != null) {
                    CustTimerHelper.this.d.finish();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int size = uey.a().k().size();
        LogUtil.a("PressureMeasureMessage", "PressureUtil.getInstance().mListBack.size() == " + size);
        int iP = uey.a().p();
        LogUtil.a("PressureMeasureMessage", "PressureUtil.getInstance().mListBack.size() sum == " + iP);
        if (size <= iP) {
            if (uey.a().q() > 0) {
                uey.a().j(0);
                Intent intent = new Intent("com.huawei.ui.pressure.measure.suddenness");
                intent.setPackage(this.f26980b.getPackageName());
                this.f26980b.sendOrderedBroadcast(intent, LocalBroadcast.f36595c);
                Intent intent2 = new Intent("com.huawei.ui.pressure.measure.calibrate.stop");
                intent2.setPackage(this.f26980b.getPackageName());
                this.f26980b.sendOrderedBroadcast(intent2, LocalBroadcast.f36595c);
                LogUtil.a("PressureMeasureMessage", "data is lose ,Timer is STOP");
                uey.a().b(true);
                uey.a().h(false);
                uey.a().i(false);
                uey.a().c(true);
                return;
            }
            return;
        }
        uey.a().c(size);
    }

    public CountDownTimer e() {
        return this.f26981c;
    }

    public void c(CountDownTimer countDownTimer) {
        this.f26981c = countDownTimer;
    }

    public void a() {
        this.f26981c.start();
    }

    public void c(OnFinishListener onFinishListener) {
        this.d = onFinishListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(List<Long> list) {
        if (list == null || list.size() <= 1) {
            return false;
        }
        Long l = list.get(list.size() - 1);
        long jLongValue = l.longValue();
        Long l2 = list.get(list.size() - 2);
        int iLongValue = (int) (jLongValue - l2.longValue());
        LogUtil.a("PressureMeasureMessage", "lastTime = ", l, ", lastTwoTime = ", l2, ", duringTime = ", Integer.valueOf(iLongValue));
        return iLongValue > 11500;
    }
}
