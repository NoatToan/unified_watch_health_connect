package com.huami.sleep.daysleep.sleepstagechart.util;

import android.content.Context;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.util.HMColor;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.util.TransModelToChartUtil;
import com.huami.sleep.model.ChartSleep;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes13.dex */
public class TransModelToChartUtil {
    private static final String a = "TransModelToChartUtil";
    private static TransModelToChartUtil b;

    private TransModelToChartUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor A(int i, int i2, BaseIndex baseIndex) {
        return new HMColor(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor B(int i, int i2, BaseIndex baseIndex) {
        return new HMColor(i, i2);
    }

    public static TransModelToChartUtil getInstance() {
        if (b == null) {
            b = new TransModelToChartUtil();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor o(int i, BaseIndex baseIndex) {
        return new HMColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor p(int i, BaseIndex baseIndex) {
        return new HMColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor q(int i, int i2, BaseIndex baseIndex) {
        return new HMColor(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor r(int i, BaseIndex baseIndex) {
        return new HMColor(i, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor s(int i, int i2, BaseIndex baseIndex) {
        return new HMColor(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor t(int i, int i2, BaseIndex baseIndex) {
        return new HMColor(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor u(int i, BaseIndex baseIndex) {
        return new HMColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor v(int i, BaseIndex baseIndex) {
        return new HMColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor w(int i, BaseIndex baseIndex) {
        return new HMColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor x(int i, BaseIndex baseIndex) {
        return new HMColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor y(int i, BaseIndex baseIndex) {
        return new HMColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMColor z(int i, BaseIndex baseIndex) {
        return new HMColor(i, i);
    }

    public ChartDataList getSleepChart(Context context, ChartSleep chartSleep) {
        return getSleepChart(context, chartSleep, ContextCompat.getColor(context, R.color.s25), ContextCompat.getColor(context, R.color.s16), ContextCompat.getColor(context, R.color.s34));
    }

    public ChartDataList getSleepChart(Context context, ChartSleep chartSleep, final int deepSleepColor, final int lightSleepColor, final int awakeSleepColor) {
        int i;
        int i2;
        final int i3;
        ChartData chartData;
        ChartData chartData2;
        Context context2 = context;
        int i4 = R.color.s17;
        final int color = ContextCompat.getColor(context2, i4);
        final int color2 = ContextCompat.getColor(context2, R.color.s24);
        final int color3 = ContextCompat.getColor(context2, R.color.s15);
        final int color4 = ContextCompat.getColor(context2, R.color.s33);
        int color5 = ContextCompat.getColor(context2, i4);
        final int color6 = ContextCompat.getColor(context2, R.color.s4);
        final int color7 = ContextCompat.getColor(context2, R.color.s10);
        int i5 = R.color.s19;
        final int color8 = ContextCompat.getColor(context2, i5);
        final int color9 = ContextCompat.getColor(context2, i5);
        SparseArray sparseArray = new SparseArray();
        int i6 = 0;
        while (i6 < chartSleep.getItems().size()) {
            ChartSleep.ChartSleepItem chartSleepItem = chartSleep.getItems().get(i6);
            int start = chartSleepItem.getStart();
            int end = chartSleepItem.getEnd();
            if (i6 != chartSleep.getItems().size() - 1) {
                end++;
            }
            int i7 = end;
            String str = a;
            SparseArray sparseArray2 = sparseArray;
            StringBuilder sb = new StringBuilder();
            int i8 = color5;
            sb.append("start ");
            sb.append(start);
            sb.append(" end ");
            sb.append(i7);
            sb.append(" index ");
            sb.append(i6);
            int i9 = i6;
            HMLog.d(str, sb.toString(), new Object[0]);
            if (chartSleep.getStyle() == ChartSleep.Style.HOMEPAGE) {
                if (chartSleepItem.getMode() == 3) {
                    chartData = new ChartData(new BaseIndex(start, i7), 10.0f);
                    chartData.addExtends(new IDataExtendListener() { // from class: ey7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.o(color7, baseIndex);
                        }
                    });
                } else if (chartSleepItem.getMode() == 5) {
                    chartData = new ChartData(new BaseIndex(start, i7), 10.0f);
                    chartData.addExtends(new IDataExtendListener() { // from class: by7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.p(deepSleepColor, baseIndex);
                        }
                    });
                } else if (chartSleepItem.getMode() == 4) {
                    chartData = new ChartData(new BaseIndex(start, i7), 10.0f);
                    chartData.addExtends(new IDataExtendListener() { // from class: gy7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.u(lightSleepColor, baseIndex);
                        }
                    });
                } else if (chartSleepItem.getMode() == 6) {
                    chartData = new ChartData(new BaseIndex(start, i7), 10.0f);
                    chartData.addExtends(new IDataExtendListener() { // from class: cy7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.v(awakeSleepColor, baseIndex);
                        }
                    });
                } else if (chartSleepItem.getMode() == 8) {
                    chartData = new ChartData(new BaseIndex(start, i7), 10.0f);
                    chartData.addExtends(new IDataExtendListener() { // from class: ay7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.w(color6, baseIndex);
                        }
                    });
                } else if (chartSleepItem.getMode() == 9) {
                    chartData = new ChartData(new BaseIndex(start, i7), 10.0f);
                    chartData.addExtends(new IDataExtendListener() { // from class: hy7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.x(color8, baseIndex);
                        }
                    });
                } else {
                    chartData = new ChartData(new BaseIndex(start, i7), 10.0f);
                    chartData.addExtends(new IDataExtendListener() { // from class: dy7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.y(color, baseIndex);
                        }
                    });
                }
                i = color;
                i2 = color8;
            } else if (chartSleep.getStyle() == ChartSleep.Style.DETAILVIEW) {
                final int color10 = ContextCompat.getColor(context2, R.color.s25);
                final int color11 = ContextCompat.getColor(context2, R.color.s16);
                final int color12 = ContextCompat.getColor(context2, R.color.s34);
                final int color13 = ContextCompat.getColor(context2, R.color.s17);
                i = color;
                final int color14 = ContextCompat.getColor(context2, R.color.s19);
                i2 = color8;
                if (chartSleepItem.getMode() == 3) {
                    chartData2 = new ChartData(new BaseIndex(start, i7), 76.0f);
                    chartData2.addExtends(new IDataExtendListener() { // from class: vx7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.z(color7, baseIndex);
                        }
                    });
                } else if (chartSleepItem.getMode() == 5) {
                    chartData2 = new ChartData(new BaseIndex(start, i7), 135.0f);
                    chartData2.addExtends(new IDataExtendListener() { // from class: yx7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.A(color10, color2, baseIndex);
                        }
                    });
                } else if (chartSleepItem.getMode() == 4) {
                    chartData2 = new ChartData(new BaseIndex(start, i7), 76.0f);
                    chartData2.addExtends(new IDataExtendListener() { // from class: wx7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.B(color11, color3, baseIndex);
                        }
                    });
                } else if (chartSleepItem.getMode() == 6) {
                    chartData2 = new ChartData(new BaseIndex(start, i7), 135.0f);
                    chartData2.addExtends(new IDataExtendListener() { // from class: xx7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.q(color12, color4, baseIndex);
                        }
                    });
                } else if (chartSleepItem.getMode() == 8) {
                    chartData2 = new ChartData(new BaseIndex(start, i7), 135.0f);
                    chartData2.addExtends(new IDataExtendListener() { // from class: fy7
                        @Override // com.huami.chart.listener.IDataExtendListener
                        public final Object get(BaseIndex baseIndex) {
                            return TransModelToChartUtil.r(color6, baseIndex);
                        }
                    });
                } else {
                    if (chartSleepItem.getMode() == 9) {
                        chartData2 = new ChartData(new BaseIndex(start, i7), 135.0f);
                        chartData2.addExtends(new IDataExtendListener() { // from class: zx7
                            @Override // com.huami.chart.listener.IDataExtendListener
                            public final Object get(BaseIndex baseIndex) {
                                return TransModelToChartUtil.s(color14, color9, baseIndex);
                            }
                        });
                    } else {
                        ChartData chartData3 = new ChartData(new BaseIndex(start, i7), 76.0f);
                        i3 = i8;
                        chartData3.addExtends(new IDataExtendListener() { // from class: iy7
                            @Override // com.huami.chart.listener.IDataExtendListener
                            public final Object get(BaseIndex baseIndex) {
                                return TransModelToChartUtil.t(color13, i3, baseIndex);
                            }
                        });
                        chartData = chartData3;
                    }
                    sparseArray = sparseArray2;
                    sparseArray.put(chartData.getIndex(), chartData);
                    i6 = i9 + 1;
                    context2 = context;
                    color5 = i3;
                    color = i;
                    color8 = i2;
                }
                chartData = chartData2;
            } else {
                throw new IllegalStateException("style 错误， 不应该进入这里..");
            }
            i3 = i8;
            sparseArray = sparseArray2;
            sparseArray.put(chartData.getIndex(), chartData);
            i6 = i9 + 1;
            context2 = context;
            color5 = i3;
            color = i;
            color8 = i2;
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(chartSleep.getStartSleep());
        chartDataList.setEnd(chartSleep.getEndSleep());
        chartDataList.setMaxValue(chartSleep.getStyle() == ChartSleep.Style.DETAILVIEW ? 135.0f : 10.0f);
        chartDataList.setMinValue(0.0f);
        HMLog.d(a, "totalStart " + chartSleep.getStartSleep() + " totalEnd " + chartSleep.getEndSleep(), new Object[0]);
        return chartDataList;
    }
}
