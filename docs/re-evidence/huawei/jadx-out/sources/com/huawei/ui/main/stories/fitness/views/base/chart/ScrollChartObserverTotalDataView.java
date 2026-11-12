package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.huawei.health.knit.api.ICustomCalculator;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize;
import defpackage.qnh;
import health.compact.a.HiDateUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class ScrollChartObserverTotalDataView extends ScrollChartObserverView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ICustomCalculator f27178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValueCapture f27179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<OnDataChange> f27180c;
    private HwHealthBaseScrollBarLineChart.DataRatioProvider d;
    private AsyncSelectorSerialize e;
    private AtomicBoolean j;

    public interface OnDataChange {
        void onChange(float f);
    }

    public interface ValueCapture {

        public interface Callback {
            void onResult(float f);
        }

        void filter(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, float f, Callback callback);

        boolean isAcceptable(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart);
    }

    public ScrollChartObserverTotalDataView(Context context, ObserveredClassifiedView observeredClassifiedView, String str, String str2, HwHealthBaseScrollBarLineChart.DataRatioProvider dataRatioProvider) {
        super(context, observeredClassifiedView, str, str2);
        this.j = new AtomicBoolean(false);
        this.e = null;
        this.f27180c = new ArrayList<>(16);
        this.d = dataRatioProvider;
        if (observeredClassifiedView.getStepDataType().isTimeStrengthData() && observeredClassifiedView.getStepDataType().isWeekData()) {
            this.mExplain.setVisibility(0);
        }
    }

    public void setCustomCalculator(ICustomCalculator iCustomCalculator) {
        if (iCustomCalculator == null) {
            LogUtil.e("ScrollChartObserverTotalDataView", "sumCalculator == null");
        } else {
            this.f27178a = iCustomCalculator;
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        if (!this.j.get()) {
            e(hwHealthBaseScrollBarLineChart);
        } else {
            a(hwHealthBaseScrollBarLineChart);
        }
    }

    public void a(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(new Handler(Looper.getMainLooper())) { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.5
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize
            public void onSuccess(Map map) {
            }

            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize
            public void onFailed(int i) {
                LogUtil.d("ScrollChartObserverTotalDataView", "process onRangeShow end onFailed");
            }
        };
        this.e = asyncSelectorSerialize;
        a(asyncSelectorSerialize, hwHealthBaseScrollBarLineChart);
        asyncSelectorSerialize.run();
    }

    private void a(final AsyncSelectorSerialize asyncSelectorSerialize, final HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.4
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.BaseAction, com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                final HashMap map2 = new HashMap();
                float showDataByRatio = hwHealthBaseScrollBarLineChart.getShowDataByRatio(ScrollChartObserverTotalDataView.this.d);
                if (ScrollChartObserverTotalDataView.this.f27179b == null || !ScrollChartObserverTotalDataView.this.f27179b.isAcceptable(hwHealthBaseScrollBarLineChart)) {
                    if (ScrollChartObserverTotalDataView.this.f27178a != null) {
                        map2.put("value", Float.valueOf(ScrollChartObserverTotalDataView.this.f27178a.calculate(hwHealthBaseScrollBarLineChart, ScrollChartObserverTotalDataView.this.mHost.getStepDataType())));
                        asyncSelectorSerialize.next(map2);
                        return;
                    } else {
                        map2.put("value", Float.valueOf(showDataByRatio));
                        asyncSelectorSerialize.next(map2);
                        return;
                    }
                }
                ScrollChartObserverTotalDataView.this.f27179b.filter(hwHealthBaseScrollBarLineChart, showDataByRatio, new ValueCapture.Callback() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.4.5
                    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.ValueCapture.Callback
                    public void onResult(float f) {
                        map2.put("value", Float.valueOf(f));
                        asyncSelectorSerialize.next(map2);
                    }
                });
            }
        });
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.3
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.BaseAction, com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                if (map != null) {
                    AsyncSelectorSerialize asyncSelectorSerialize2 = ScrollChartObserverTotalDataView.this.e;
                    AsyncSelectorSerialize asyncSelectorSerialize3 = asyncSelectorSerialize;
                    if (asyncSelectorSerialize2 != asyncSelectorSerialize3) {
                        asyncSelectorSerialize3.postError();
                        return;
                    }
                    if (map.get("value") instanceof Float) {
                        float fFloatValue = ((Float) map.get("value")).floatValue();
                        LogUtil.a("ScrollChartObserverTotalDataView", "mValueCapture total" + fFloatValue);
                        ScrollChartObserverTotalDataView.this.d(fFloatValue);
                    }
                    asyncSelectorSerialize.next(null);
                    return;
                }
                asyncSelectorSerialize.postError();
            }
        });
    }

    public void e(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        float showDataByRatio = hwHealthBaseScrollBarLineChart.getShowDataByRatio(this.d);
        ICustomCalculator iCustomCalculator = this.f27178a;
        if (iCustomCalculator != null) {
            d(iCustomCalculator.calculate(hwHealthBaseScrollBarLineChart, this.mHost.getStepDataType()));
        } else {
            d(showDataByRatio);
        }
    }

    protected void d(float f) {
        setContentText(this.mHost.convertFloat2TextShow(f));
        for (OnDataChange onDataChange : this.f27180c) {
            if (onDataChange != null) {
                onDataChange.onChange(f);
            }
        }
    }

    public void setOnDataChange(OnDataChange onDataChange) {
        this.f27180c.add(onDataChange);
    }

    public void b(ValueCapture valueCapture) {
        this.j.set(true);
        this.f27179b = valueCapture;
    }

    public static class c implements ValueCapture {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27185a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f27186c;
        private float d;

        /* JADX WARN: Code duplicated, block: B:14:0x0042  */
        public c(float f, int i, DataInfos dataInfos) {
            float fE = 1.0f;
            this.f27186c = 1.0f;
            this.d = f;
            this.f27185a = i;
            if (dataInfos.isDistanceData()) {
                if (UnitUtil.f()) {
                    fE = ((float) UnitUtil.e(1.0d, 3)) * 0.001f;
                } else {
                    fE = 0.001f;
                }
            } else if (dataInfos.isClimbData()) {
                fE = 0.1f;
                if (UnitUtil.f()) {
                    fE = 0.1f * ((float) UnitUtil.e(1.0d, 1));
                }
            } else if (dataInfos.isCaloriesData()) {
                fE = 0.001f;
            }
            this.f27186c = fE;
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.ValueCapture
        public boolean isAcceptable(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
            return hwHealthBaseScrollBarLineChart.isInPagerPosition();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.ValueCapture
        public void filter(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, final float f, ValueCapture.Callback callback) {
            long jK = qnh.k(TimeUnit.MINUTES.toMillis((long) hwHealthBaseScrollBarLineChart.acquireShowRangeMinimum()));
            if (HiDateUtil.d(jK) == HiDateUtil.d(hwHealthBaseScrollBarLineChart.getDefaultTimeMillis())) {
                float f2 = this.d;
                if (f2 > -1.0f) {
                    if (f < f2) {
                        callback.onResult(f2);
                        return;
                    } else {
                        callback.onResult(f);
                        return;
                    }
                }
            }
            HiDataReadOption hiDataReadOption = new HiDataReadOption();
            hiDataReadOption.setTimeInterval(jK, HiDateUtil.g(jK));
            hiDataReadOption.setType(new int[]{this.f27185a});
            HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new ValueCaptureReadListener(callback) { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.c.4
                /* JADX WARN: Code duplicated, block: B:11:0x0037  */
                @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.ValueCaptureReadListener
                public void onResultData(Object obj) {
                    float floatValue;
                    if (obj instanceof SparseArray) {
                        SparseArray sparseArray = (SparseArray) obj;
                        if (sparseArray.size() > 0) {
                            List list = (List) sparseArray.get(c.this.f27185a);
                            if (list.size() == 0 || list.get(0) == null) {
                                floatValue = 0.0f;
                            } else {
                                floatValue = ((HiHealthData) list.get(0)).getFloatValue() * c.this.f27186c;
                            }
                        } else {
                            floatValue = 0.0f;
                        }
                    } else {
                        floatValue = 0.0f;
                    }
                    if (f < floatValue) {
                        this.mCallback.onResult(floatValue);
                    } else {
                        this.mCallback.onResult(f);
                    }
                }
            });
        }
    }

    public static abstract class ValueCaptureReadListener implements HiDataReadResultListener {
        protected ValueCapture.Callback mCallback;

        public abstract void onResultData(Object obj);

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        protected ValueCaptureReadListener(ValueCapture.Callback callback) {
            this.mCallback = callback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("ScrollChartObserverTotalDataView", "ValueCaptureReadListener onResult", "anchor", Integer.valueOf(i2));
            onResultData(obj);
            if (i2 == 2 || i == 1) {
                this.mCallback = null;
            }
        }
    }
}
