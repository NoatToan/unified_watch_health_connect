package com.huawei.health.manager.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.health.icommon.LocalStepDataReport;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.npt;
import health.compact.a.StepsRecord;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class StandReportReceiver {
    private AtomicBoolean e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScreenBroadcastReceiver f8089b = new ScreenBroadcastReceiver();
    private final List<LocalStepDataReport> d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnScreenOnListener f8088a = null;

    public interface OnScreenOnListener {
        void onScreenOn();
    }

    public StandReportReceiver(OnScreenOnListener onScreenOnListener) {
        b(onScreenOnListener);
        BroadcastManager.i(this.f8089b);
    }

    public int c(StepsRecord stepsRecord, boolean z) {
        if (stepsRecord == null) {
            return -3;
        }
        if (!stepsRecord.d()) {
            return -1;
        }
        boolean z2 = this.e.get();
        if (!z && !z2) {
            if ((!z2) == (!ScreenUtil.d())) {
                return -2;
            }
            ReleaseLogUtil.e("Step_StandRptRecv", "ScrnStateUnkn LikelyOn");
        }
        try {
            Iterator<LocalStepDataReport> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().report(stepsRecord);
            }
        } catch (SecurityException unused) {
            LogUtil.j("Step_StandRptRecv", "update SecurityException ");
        }
        ReleaseLogUtil.d("Step_StandRptRecv", npt.d("RPT:", Integer.valueOf(stepsRecord.f), " ", Integer.valueOf(stepsRecord.f36648b), " ", Integer.valueOf(stepsRecord.f36647a), " ", Integer.valueOf(stepsRecord.f36649c), " ", Integer.valueOf(stepsRecord.e), " ", Integer.valueOf(stepsRecord.g), " ", Integer.valueOf(stepsRecord.d), " ", Integer.valueOf(stepsRecord.h)));
        return 0;
    }

    public void b(LocalStepDataReport localStepDataReport) {
        if (localStepDataReport == null) {
            ReleaseLogUtil.e("Step_StandRptRecv", "add report is null.");
        } else {
            if (this.d.contains(localStepDataReport)) {
                return;
            }
            this.d.add(localStepDataReport);
        }
    }

    private void b(OnScreenOnListener onScreenOnListener) {
        if (onScreenOnListener != null) {
            this.f8088a = onScreenOnListener;
        } else {
            ReleaseLogUtil.e("Step_StandRptRecv", "listener == null");
        }
    }

    class ScreenBroadcastReceiver extends BroadcastReceiver {
        private ScreenBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            LogUtil.a("Step_StandRptRecv", "onReceive action: ", action);
            if (action == null || "".equals(action.trim())) {
                ReleaseLogUtil.e("Step_StandRptRecv", "intent no action");
                return;
            }
            if ("android.intent.action.SCREEN_ON".equals(action)) {
                StandReportReceiver.this.e.set(true);
                if (StandReportReceiver.this.f8088a != null) {
                    StandReportReceiver.this.f8088a.onScreenOn();
                    return;
                }
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                StandReportReceiver.this.e.set(false);
            } else {
                LogUtil.a("Step_StandRptRecv", "action:Neither right nor wrong ", action);
            }
        }
    }
}
