package com.huawei.ui.commonui.chartanimation;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize;
import defpackage.qng;
import defpackage.qnh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class TweenAnimatiionMgr {
    private UserLevelView d = UserLevelView.CHART_UNKNOWN;
    private List<HwHealthBaseScrollBarLineChart> e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<UserLevelView, HwHealthBaseScrollBarLineChart> f23373c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnSwitchLevelView f23371a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qng f23372b = new qng();

    public interface OnSwitchLevelView {
        void onNotifySwitchStatus(UserLevelView userLevelView, UserLevelView userLevelView2, float f);
    }

    public void b(UserLevelView userLevelView, HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        this.e.add(hwHealthBaseScrollBarLineChart);
        this.f23373c.put(userLevelView, hwHealthBaseScrollBarLineChart);
    }

    public void b(OnSwitchLevelView onSwitchLevelView) {
        this.f23371a = onSwitchLevelView;
    }

    public void d(UserLevelView userLevelView) {
        this.d = userLevelView;
    }

    public boolean b(UserLevelView userLevelView) {
        return this.f23373c.get(userLevelView) != null;
    }

    public void a(final UserLevelView userLevelView) {
        c();
        final UserLevelView userLevelView2 = this.d;
        final HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChartE = e();
        final HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChartE2 = e(userLevelView);
        final long jB = b(hwHealthBaseScrollBarLineChartE.queryMarkerViewTimeMills(), userLevelView);
        final AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(new Handler(Looper.getMainLooper())) { // from class: com.huawei.ui.commonui.chartanimation.TweenAnimatiionMgr.5
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize
            public void onFailed(int i) {
            }

            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize
            public void onSuccess(Map map) {
            }
        };
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.Action() { // from class: com.huawei.ui.commonui.chartanimation.TweenAnimatiionMgr.4
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.Action
            public int getFailedValue() {
                return 0;
            }

            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                TweenAnimatiionMgr.this.f23372b.d(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ui.commonui.chartanimation.TweenAnimatiionMgr.4.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fD = TweenAnimatiionMgr.this.f23372b.d();
                        TweenAnimatiionMgr.this.a(hwHealthBaseScrollBarLineChartE, hwHealthBaseScrollBarLineChartE2);
                        boolean zBlinkToUnixTime = hwHealthBaseScrollBarLineChartE2.blinkToUnixTime((int) (jB / 60000));
                        hwHealthBaseScrollBarLineChartE2.highlightDefValue(-1, false);
                        if (fD == 0.0f) {
                            TweenAnimatiionMgr.this.d = userLevelView;
                        }
                        TweenAnimatiionMgr.this.b(userLevelView2, userLevelView, fD);
                        if (zBlinkToUnixTime) {
                            return;
                        }
                        float translationX = hwHealthBaseScrollBarLineChartE2.getTranslationX();
                        hwHealthBaseScrollBarLineChartE2.setTranslationX(1.0f + translationX);
                        hwHealthBaseScrollBarLineChartE2.setTranslationX(translationX);
                        asyncSelectorSerialize.next(null);
                    }
                }, 800);
            }
        });
        asyncSelectorSerialize.run();
    }

    private long b(long j, UserLevelView userLevelView) {
        if (userLevelView == UserLevelView.CHART_DAY) {
            return qnh.e(j);
        }
        if (userLevelView == UserLevelView.CHART_WEEK) {
            return qnh.n(j);
        }
        if (userLevelView == UserLevelView.CHART_MONTH) {
            return qnh.f(j);
        }
        if (userLevelView == UserLevelView.CHART_YEAR) {
            return qnh.r(j);
        }
        if (userLevelView == UserLevelView.CHART_ALL) {
            throw new RuntimeException("unsupport showMode in computeSpecifiedLevelTimeBoarder");
        }
        throw new RuntimeException("unsupport showMode in computeSpecifiedLevelTimeBoarder");
    }

    private HwHealthBaseScrollBarLineChart e(UserLevelView userLevelView) {
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = this.f23373c.get(userLevelView);
        if (hwHealthBaseScrollBarLineChart != null) {
            return hwHealthBaseScrollBarLineChart;
        }
        throw new RuntimeException("level unknown,queryLevelChart error:" + userLevelView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(UserLevelView userLevelView, UserLevelView userLevelView2, float f) {
        this.f23371a.onNotifySwitchStatus(userLevelView, userLevelView2, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart2) {
        if (!hwHealthBaseScrollBarLineChart.isMarkerViewEnable() || !hwHealthBaseScrollBarLineChart2.isMarkerViewEnable()) {
            throw new RuntimeException("TweenAnimatiionMgr base on markerview,error markerview disable!!!");
        }
        if (!hwHealthBaseScrollBarLineChart.containsMarkViewShow()) {
            throw new RuntimeException("TweenAnimatiionMgr base on markerview,error not contains markerview!!!");
        }
        if (!hwHealthBaseScrollBarLineChart.isMarkerViewTimeSelected()) {
            throw new RuntimeException("TweenAnimatiionMgr base on markerview,error markerview time not validate!!!");
        }
    }

    private void c() {
        if (this.e.size() < 1) {
            throw new RuntimeException("checkViewPosition charts size less than one,error");
        }
        int[] iArr = new int[2];
        this.e.get(0).getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        if (iArr[0] == 0 && iArr[1] == 0) {
            return;
        }
        Iterator<HwHealthBaseScrollBarLineChart> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().getLocationInWindow(iArr2);
            int i = iArr2[0];
            if (i != 0 || iArr2[1] != 0) {
                if (iArr[0] != i || iArr[1] != iArr2[1]) {
                    throw new RuntimeException("charts's LocationInWindow not same,error");
                }
            }
        }
    }

    public HwHealthBaseScrollBarLineChart e() {
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = this.f23373c.get(this.d);
        if (hwHealthBaseScrollBarLineChart != null) {
            return hwHealthBaseScrollBarLineChart;
        }
        throw new RuntimeException("level unknown,getCurrentLevelChart error");
    }

    public enum UserLevelView {
        CHART_ALL(5),
        CHART_YEAR(4),
        CHART_MONTH(3),
        CHART_WEEK(2),
        CHART_DAY(1),
        CHART_UNKNOWN(0);

        int mLevel;

        UserLevelView(int i) {
            this.mLevel = i;
        }

        public static UserLevelView query(DataInfos dataInfos) {
            if (dataInfos.isDayData()) {
                return CHART_DAY;
            }
            if (dataInfos.isWeekData()) {
                return CHART_WEEK;
            }
            if (dataInfos.isMonthData()) {
                return CHART_MONTH;
            }
            if (dataInfos.isYearData()) {
                return CHART_YEAR;
            }
            if (dataInfos.isAllData()) {
                return CHART_ALL;
            }
            throw new RuntimeException("query UserLevelView unknown Exception");
        }
    }
}
