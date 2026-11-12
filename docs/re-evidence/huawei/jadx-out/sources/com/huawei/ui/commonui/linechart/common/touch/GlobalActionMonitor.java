package com.huawei.ui.commonui.linechart.common.touch;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.github.mikephil.charting.utils.MPPointF;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class GlobalActionMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<GlobalAction> f23686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GlobalAction f23687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23688c;
    private HwHealthBaseBarLineChart e;

    public GlobalActionMonitor(HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        ArrayList arrayList = new ArrayList();
        this.f23686a = arrayList;
        this.f23687b = null;
        this.f23688c = false;
        this.e = hwHealthBaseBarLineChart;
        arrayList.add(new e());
        this.f23686a.add(new d());
    }

    public boolean e(MotionEvent motionEvent) {
        this.f23688c = false;
        this.f23687b = null;
        for (GlobalAction globalAction : this.f23686a) {
            if (globalAction != null) {
                globalAction.reset();
                globalAction.handleActionDown(motionEvent);
            }
        }
        return false;
    }

    public boolean d(MotionEvent motionEvent) {
        if (this.f23688c) {
            return false;
        }
        GlobalAction globalAction = this.f23687b;
        if (globalAction != null) {
            globalAction.handleActionMove(motionEvent);
            return this.f23687b.inMode() && this.f23687b.isModeInterceptMove(motionEvent);
        }
        for (GlobalAction globalAction2 : this.f23686a) {
            if (globalAction2 != null) {
                globalAction2.handleActionMove(motionEvent);
                if (globalAction2.inMode()) {
                    this.f23687b = globalAction2;
                    break;
                }
            }
        }
        GlobalAction globalAction3 = this.f23687b;
        return globalAction3 != null && globalAction3.inMode() && this.f23687b.isModeInterceptMove(motionEvent);
    }

    public boolean a(MotionEvent motionEvent) {
        if (this.f23688c) {
            return false;
        }
        for (GlobalAction globalAction : this.f23686a) {
            if (globalAction != null) {
                globalAction.handleActionCancel(motionEvent);
                globalAction.reset();
            }
        }
        this.f23687b = null;
        return false;
    }

    public void c() {
        this.f23688c = true;
    }

    abstract class BaseGlobalAction implements GlobalAction {
        long mActionDownClockTime;
        private boolean mIsInMode;
        MPPointF mTouchStartPoint;

        @Override // com.huawei.ui.commonui.linechart.common.touch.GlobalAction
        public boolean handleActionCancel(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.huawei.ui.commonui.linechart.common.touch.GlobalAction
        public boolean handleActionMove(MotionEvent motionEvent) {
            return false;
        }

        private BaseGlobalAction() {
            this.mTouchStartPoint = MPPointF.getInstance(0.0f, 0.0f);
            this.mIsInMode = false;
        }

        @Override // com.huawei.ui.commonui.linechart.common.touch.GlobalAction
        public boolean inMode() {
            return this.mIsInMode;
        }

        void enableMode() {
            this.mIsInMode = true;
        }

        @Override // com.huawei.ui.commonui.linechart.common.touch.GlobalAction
        public boolean handleActionDown(MotionEvent motionEvent) {
            saveTouchStart(motionEvent);
            return false;
        }

        @Override // com.huawei.ui.commonui.linechart.common.touch.GlobalAction
        public void reset() {
            this.mIsInMode = false;
        }

        private void saveTouchStart(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            this.mTouchStartPoint.x = motionEvent.getX();
            this.mTouchStartPoint.y = motionEvent.getY();
            this.mActionDownClockTime = SystemClock.elapsedRealtime();
        }
    }

    class e extends BaseGlobalAction {
        @Override // com.huawei.ui.commonui.linechart.common.touch.GlobalAction
        public boolean isModeInterceptMove(MotionEvent motionEvent) {
            return false;
        }

        private e() {
            super();
        }

        @Override // com.huawei.ui.commonui.linechart.common.touch.GlobalActionMonitor.BaseGlobalAction, com.huawei.ui.commonui.linechart.common.touch.GlobalAction
        public boolean handleActionCancel(MotionEvent motionEvent) {
            super.handleActionCancel(motionEvent);
            float fAbs = Math.abs(motionEvent.getX() - this.mTouchStartPoint.getX());
            float fAbs2 = Math.abs(motionEvent.getY() - this.mTouchStartPoint.getY());
            LogUtil.d("HealthChart_GlobalActionMonitor", "SystemClock.elapsedRealtime() - mActionDownClockTime = " + (SystemClock.elapsedRealtime() - this.mActionDownClockTime));
            if (SystemClock.elapsedRealtime() - this.mActionDownClockTime >= 200 || fAbs >= TouchModeDelegateMgr.f23694b || fAbs2 >= TouchModeDelegateMgr.f23694b) {
                return false;
            }
            e(motionEvent);
            enableMode();
            return false;
        }

        private void e(MotionEvent motionEvent) {
            GlobalActionMonitor.this.e.highlightValuePxCorrectByUnix(c(motionEvent), false);
            GlobalActionMonitor.this.e.invalidateForce();
        }

        private float c(MotionEvent motionEvent) {
            return GlobalActionMonitor.this.c(motionEvent);
        }
    }

    class d extends BaseGlobalAction {
        @Override // com.huawei.ui.commonui.linechart.common.touch.GlobalAction
        public boolean isModeInterceptMove(MotionEvent motionEvent) {
            return true;
        }

        private d() {
            super();
        }

        @Override // com.huawei.ui.commonui.linechart.common.touch.GlobalActionMonitor.BaseGlobalAction, com.huawei.ui.commonui.linechart.common.touch.GlobalAction
        public boolean handleActionMove(MotionEvent motionEvent) {
            super.handleActionMove(motionEvent);
            if (inMode()) {
                e(motionEvent);
                return true;
            }
            float fAbs = Math.abs(motionEvent.getX() - this.mTouchStartPoint.getX());
            float fAbs2 = Math.abs(motionEvent.getY() - this.mTouchStartPoint.getY());
            if (SystemClock.elapsedRealtime() - this.mActionDownClockTime <= 250 || fAbs >= TouchModeDelegateMgr.f23694b || fAbs2 >= TouchModeDelegateMgr.f23694b) {
                return false;
            }
            e(motionEvent);
            enableMode();
            return true;
        }

        @Override // com.huawei.ui.commonui.linechart.common.touch.GlobalActionMonitor.BaseGlobalAction, com.huawei.ui.commonui.linechart.common.touch.GlobalAction
        public boolean handleActionCancel(MotionEvent motionEvent) {
            super.handleActionCancel(motionEvent);
            if (!(GlobalActionMonitor.this.e instanceof HwHealthBaseScrollBarLineChart)) {
                return false;
            }
            ((HwHealthBaseScrollBarLineChart) GlobalActionMonitor.this.e).adsorbMarkerViewToSelectedDataByDataArea();
            return false;
        }

        private void e(MotionEvent motionEvent) {
            GlobalActionMonitor.this.e.highlightValuePx(b(motionEvent), false);
            GlobalActionMonitor.this.e.invalidateForce();
        }

        private float b(MotionEvent motionEvent) {
            return GlobalActionMonitor.this.c(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float c(MotionEvent motionEvent) {
        if (motionEvent.getX() > this.e.getViewPortHandler().contentRight()) {
            return this.e.getViewPortHandler().contentRight();
        }
        if (motionEvent.getX() < this.e.getViewPortHandler().contentLeft()) {
            return this.e.getViewPortHandler().contentLeft();
        }
        return motionEvent.getX();
    }
}
