package com.huami.moving.sport.ui.view.chart.dataprovider.common;

import android.content.Context;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.util.HMColor;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.BaseType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BodyStatusType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PowerMeterType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PressureType;
import com.huami.moving.sport.ui.view.chart.dataprovider.Spo2Type;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepFreqType;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepType;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ChartDataConverter {
    private static final String a = "ChartDataConverter";
    private static ChartDataConverter b;

    private ChartDataConverter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b(Context context, BaseType baseType, float[] fArr, float f, BaseIndex baseIndex) {
        int[] iArr;
        int color = ContextCompat.getColor(context, R.color.p3);
        int color2 = ContextCompat.getColor(context, R.color.s20);
        int color3 = ContextCompat.getColor(context, R.color.s33);
        int color4 = ContextCompat.getColor(context, R.color.s15);
        int color5 = ContextCompat.getColor(context, R.color.s26);
        HMColor hMColor = new HMColor(color);
        if (baseType instanceof StepFreqType) {
            iArr = new int[]{DataTypeSource.SPORT_TYPE_MODERN_DANCE, DataTypeSource.SPORT_TYPE_CHECKERS, 163, 151};
        } else if (baseType instanceof StepType) {
            iArr = new int[]{151, 121, 81, 51};
        } else {
            if (baseType instanceof PressureType) {
                int[] iArr2 = {80, 60, 40, 0};
                for (int i = 0; i < 4; i++) {
                    if (fArr[0] >= iArr2[0]) {
                        hMColor = new HMColor(getColorWithAlpha(f, color), getColorWithAlpha(f, color));
                    } else if (fArr[0] >= iArr2[1]) {
                        hMColor = new HMColor(getColorWithAlpha(f, color3), getColorWithAlpha(f, color3));
                    } else {
                        hMColor = fArr[0] >= ((float) iArr2[2]) ? new HMColor(getColorWithAlpha(f, color2), getColorWithAlpha(f, color2)) : new HMColor(getColorWithAlpha(f, color4), getColorWithAlpha(f, color4));
                    }
                }
                return hMColor;
            }
            if (baseType instanceof Spo2Type) {
                int[] iArr3 = {90, 80, 50};
                for (int i2 = 0; i2 < 3; i2++) {
                    hMColor = fArr[0] >= iArr3[0] ? new HMColor(getColorWithAlpha(f, color2)) : fArr[0] >= ((float) iArr3[1]) ? new HMColor(getColorWithAlpha(f, color4)) : new HMColor(getColorWithAlpha(f, color3));
                }
                return hMColor;
            }
            iArr = null;
        }
        if (iArr != null) {
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (fArr[0] >= iArr[0]) {
                    hMColor = new HMColor(getColorWithAlpha(f, color5));
                } else if (fArr[0] >= iArr[1]) {
                    hMColor = new HMColor(getColorWithAlpha(f, color4));
                } else if (fArr[0] >= iArr[2]) {
                    hMColor = new HMColor(getColorWithAlpha(f, color2));
                } else {
                    hMColor = fArr[0] >= ((float) iArr[3]) ? new HMColor(getColorWithAlpha(f, color3)) : new HMColor(getColorWithAlpha(f, color));
                }
            }
        }
        return hMColor;
    }

    public static int getColorWithAlpha(float f, int i) {
        return (Math.min(255, Math.max(0, (int) (f * 255.0f))) << 24) + (i & 16777215);
    }

    public static ChartDataConverter getInstance() {
        if (b == null) {
            b = new ChartDataConverter();
        }
        return b;
    }

    public void addChartExtend(ChartData chartData, final float[] fArr, final BaseType baseType, boolean z, final Context context) {
        if ((baseType instanceof StepFreqType) || (baseType instanceof StepType) || (baseType instanceof Spo2Type) || (baseType instanceof PressureType) || (baseType instanceof PowerMeterType)) {
            final float f = z ? 0.3f : 1.0f;
            chartData.addExtends(new IDataExtendListener() { // from class: ln0
                @Override // com.huami.chart.listener.IDataExtendListener
                public final Object get(BaseIndex baseIndex) {
                    return ChartDataConverter.b(context, baseType, fArr, f, baseIndex);
                }
            });
        }
    }

    public void convertTo(List<CommonTimeValuePoint> list, SparseArray<ChartData> sparseArray, long j, BaseType baseType, Context context) {
        HMLog.d(a, "convertTo begin..", new Object[0]);
        for (CommonTimeValuePoint commonTimeValuePoint : list) {
            if ((baseType instanceof BodyStatusType) || commonTimeValuePoint.getValue() != -1.0f) {
                ChartData chartData = new ChartData(commonTimeValuePoint.getRelativeTime(j), commonTimeValuePoint.getValue());
                addChartExtend(chartData, chartData.getValues(), baseType, false, context);
                sparseArray.put(commonTimeValuePoint.getRelativeTime(j), chartData);
            }
        }
        HMLog.d(a, "convertTo end..", new Object[0]);
    }

    public void convertToByDataSize(List<CommonTimeValuePoint> list, SparseArray<ChartData> sparseArray, BaseType baseType, Context context) {
        HMLog.d(a, "convertTo begin..", new Object[0]);
        Iterator<CommonTimeValuePoint> it2 = list.iterator();
        int i = 1;
        while (it2.hasNext()) {
            ChartData chartData = new ChartData(i, it2.next().getValue());
            addChartExtend(chartData, chartData.getValues(), baseType, false, context);
            sparseArray.put(i, chartData);
            i++;
        }
        HMLog.d(a, "convertTo end..", new Object[0]);
    }
}
