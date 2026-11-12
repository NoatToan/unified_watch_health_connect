package com.huawei.ui.commonui.linechart.common.touch;

import android.content.Context;
import android.view.MotionEvent;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import defpackage.qmh;
import defpackage.qmv;
import defpackage.qmz;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class TouchModeDelegateMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f23694b = (int) Utils.convertDpToPixel(3.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23695a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthBaseBarLineChart f23696c;
    private TouchModeDelegate d;
    private TouchModeDelegate e;
    private TouchModeDelegate f;
    private HwHealthBarLineChartTouchListener g;
    private ViewPortHandler h;

    enum Area {
        CONTENT,
        MARK_VIEW,
        OTHER
    }

    public interface TouchModeDelegate {
        TouchModeDelegate monitor(MotionEvent motionEvent);
    }

    public TouchModeDelegateMgr(HwHealthBarLineChartTouchListener hwHealthBarLineChartTouchListener, HwHealthBaseBarLineChart hwHealthBaseBarLineChart, ViewPortHandler viewPortHandler) {
        this.e = null;
        this.d = null;
        this.f = null;
        this.f23696c = null;
        this.g = null;
        this.h = null;
        this.f23695a = hwHealthBaseBarLineChart.getContext();
        this.g = hwHealthBarLineChartTouchListener;
        this.f23696c = hwHealthBaseBarLineChart;
        this.h = viewPortHandler;
        this.e = new d();
        this.d = new a();
        this.f = new e();
    }

    public TouchModeDelegate b() {
        return this.e;
    }

    class d implements TouchModeDelegate {
        private d() {
        }

        @Override // com.huawei.ui.commonui.linechart.common.touch.TouchModeDelegateMgr.TouchModeDelegate
        public TouchModeDelegate monitor(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return null;
            }
            return (motionEvent.getAction() & 255) != 0 ? this : e(motionEvent);
        }

        private TouchModeDelegate e(MotionEvent motionEvent) {
            Area areaC = c(motionEvent);
            if (areaC == Area.CONTENT) {
                return TouchModeDelegateMgr.this.d.monitor(motionEvent);
            }
            return areaC == Area.MARK_VIEW ? TouchModeDelegateMgr.this.f.monitor(motionEvent) : TouchModeDelegateMgr.this.e;
        }

        private Area c(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (!TouchModeDelegateMgr.this.d(x) || !TouchModeDelegateMgr.this.c(y)) {
                if (TouchModeDelegateMgr.this.f23696c.getViewPortHandler().isInBounds(x, TouchModeDelegateMgr.this.e(y))) {
                    return Area.CONTENT;
                }
                return Area.OTHER;
            }
            return Area.MARK_VIEW;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float e(float f) {
        HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.f23696c;
        return ((hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart) && ((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart).acquireChartShowMode() == HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_SCALE_MODE && f > this.f23696c.getViewPortHandler().contentBottom()) ? f - Utils.convertDpToPixel(15.0f) : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(float f) {
        return f >= ((float) this.f23696c.getLeft()) && f <= ((float) this.f23696c.getRight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(float f) {
        HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.f23696c;
        if ((hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart) && ((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart).acquireChartShowMode() == HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_SCALE_MODE) {
            return f >= this.f23696c.getViewPortHandler().contentBottom() + Utils.convertDpToPixel(15.0f) && f <= ((float) this.f23696c.getBottom()) + Utils.convertDpToPixel(45.0f);
        }
        return f >= this.f23696c.getViewPortHandler().contentBottom() - Utils.convertDpToPixel(15.0f) && f <= ((float) this.f23696c.getBottom()) + Utils.convertDpToPixel(45.0f);
    }

    class a implements TouchModeDelegate {
        private OperationSequence d = null;
        private List<OperationSequence> e;

        a() {
            ArrayList arrayList = new ArrayList(2);
            this.e = arrayList;
            arrayList.add(new qmz(TouchModeDelegateMgr.this.f23695a, TouchModeDelegateMgr.this.f23696c, TouchModeDelegateMgr.this.h, TouchModeDelegateMgr.this.g));
            this.e.add(new qmv(TouchModeDelegateMgr.this.f23695a, TouchModeDelegateMgr.this.f23696c, TouchModeDelegateMgr.this.h, TouchModeDelegateMgr.this.g));
        }

        @Override // com.huawei.ui.commonui.linechart.common.touch.TouchModeDelegateMgr.TouchModeDelegate
        public TouchModeDelegate monitor(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return null;
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0 || action == 5) {
                for (OperationSequence operationSequence : this.e) {
                    if (operationSequence.canSeqStart(motionEvent)) {
                        OperationSequence operationSequence2 = this.d;
                        if (operationSequence2 != null) {
                            operationSequence2.release();
                        }
                        operationSequence.prepare();
                        this.d = operationSequence;
                        break;
                    }
                }
            }
            OperationSequence operationSequence3 = this.d;
            if (operationSequence3 == null) {
                throw new RuntimeException("no op seq defined,logic error!!!");
            }
            operationSequence3.onTouchEvent(motionEvent);
            return this.d.isSeqInterrupted() ? TouchModeDelegateMgr.this.e : this;
        }
    }

    class e implements TouchModeDelegate {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private GlobalActionMonitor f23700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23701c = false;
        private MPPointF d = MPPointF.getInstance(0.0f, 0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23699a = false;

        e() {
            this.f23700b = null;
            this.f23700b = new GlobalActionMonitor(TouchModeDelegateMgr.this.f23696c);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0036  */
        /* JADX WARN: Code duplicated, block: B:23:0x003e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0043  */
        @Override // com.huawei.ui.commonui.linechart.common.touch.TouchModeDelegateMgr.TouchModeDelegate
        public TouchModeDelegate monitor(MotionEvent motionEvent) {
            TouchModeDelegate touchModeDelegateC = null;
            if (motionEvent == null) {
                return null;
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f23699a = false;
                if (!this.f23700b.e(motionEvent)) {
                    touchModeDelegateC = c(motionEvent);
                }
            } else if (action == 1) {
                if (!this.f23700b.a(motionEvent)) {
                    touchModeDelegateC = TouchModeDelegateMgr.this.e;
                } else {
                    touchModeDelegateC = b(motionEvent);
                }
            } else if (action == 2) {
                touchModeDelegateC = !this.f23700b.d(motionEvent) ? e(motionEvent) : this;
                if (this.f23699a) {
                    this.f23700b.c();
                }
            } else if (action != 3) {
                touchModeDelegateC = TouchModeDelegateMgr.this.e;
            } else if (!this.f23700b.a(motionEvent)) {
                touchModeDelegateC = TouchModeDelegateMgr.this.e;
            } else {
                touchModeDelegateC = b(motionEvent);
            }
            if (touchModeDelegateC == TouchModeDelegateMgr.this.e) {
                this.f23701c = false;
                if (TouchModeDelegateMgr.this.f23696c instanceof HwHealthBaseScrollBarLineChart) {
                    ((HwHealthBaseScrollBarLineChart) TouchModeDelegateMgr.this.f23696c).adsorbMarkerViewToSelectedDataByDataArea();
                }
            }
            return touchModeDelegateC;
        }

        private TouchModeDelegate e(MotionEvent motionEvent) {
            if (!this.f23699a) {
                float fAbs = Math.abs(motionEvent.getX() - this.d.getX());
                float fAbs2 = Math.abs(motionEvent.getY() - this.d.getY());
                if (fAbs > TouchModeDelegateMgr.f23694b && fAbs2 > TouchModeDelegateMgr.f23694b) {
                    this.f23699a = true;
                    if (fAbs < fAbs2 * 2.0f) {
                        return TouchModeDelegateMgr.this.e;
                    }
                }
            }
            if (!this.f23701c) {
                return this;
            }
            g(motionEvent);
            return this;
        }

        private TouchModeDelegate c(MotionEvent motionEvent) {
            this.f23701c = d(motionEvent);
            j(motionEvent);
            return this;
        }

        private void j(MotionEvent motionEvent) {
            this.d.x = motionEvent.getX();
            this.d.y = motionEvent.getY();
        }

        private TouchModeDelegate b(MotionEvent motionEvent) {
            return TouchModeDelegateMgr.this.e;
        }

        private void g(MotionEvent motionEvent) {
            TouchModeDelegateMgr.this.f23696c.highlightValuePx(a(motionEvent), false);
            TouchModeDelegateMgr.this.f23696c.invalidateForce();
        }

        private boolean d(MotionEvent motionEvent) {
            return Math.abs(motionEvent.getX() - TouchModeDelegateMgr.this.f23696c.fetchMarkViewXValPx()) < Utils.convertDpToPixel(40.0f);
        }

        private float a(MotionEvent motionEvent) {
            if (TouchModeDelegateMgr.this.f23696c.getGlobalPointFlag()) {
                if (!qmh.e(TouchModeDelegateMgr.this.f23695a)) {
                    float x = motionEvent.getX();
                    float fG = TouchModeDelegateMgr.this.f23696c.acquireChartAnchor().g();
                    HwHealthBaseBarLineChart unused = TouchModeDelegateMgr.this.f23696c;
                    if (x > fG - Utils.convertDpToPixel(26.0f)) {
                        float fG2 = TouchModeDelegateMgr.this.f23696c.acquireChartAnchor().g();
                        HwHealthBaseBarLineChart unused2 = TouchModeDelegateMgr.this.f23696c;
                        return fG2 - Utils.convertDpToPixel(26.0f);
                    }
                }
                if (qmh.e(TouchModeDelegateMgr.this.f23695a)) {
                    float x2 = motionEvent.getX();
                    float f = TouchModeDelegateMgr.this.f23696c.acquireChartAnchor().f();
                    HwHealthBaseBarLineChart unused3 = TouchModeDelegateMgr.this.f23696c;
                    if (x2 < f + Utils.convertDpToPixel(26.0f)) {
                        float f2 = TouchModeDelegateMgr.this.f23696c.acquireChartAnchor().f();
                        HwHealthBaseBarLineChart unused4 = TouchModeDelegateMgr.this.f23696c;
                        return f2 + Utils.convertDpToPixel(26.0f);
                    }
                }
            }
            if (motionEvent.getX() > TouchModeDelegateMgr.this.f23696c.getViewPortHandler().contentRight()) {
                return TouchModeDelegateMgr.this.f23696c.getViewPortHandler().contentRight();
            }
            if (motionEvent.getX() < TouchModeDelegateMgr.this.f23696c.getViewPortHandler().contentLeft()) {
                return TouchModeDelegateMgr.this.f23696c.getViewPortHandler().contentLeft();
            }
            return motionEvent.getX();
        }
    }
}
