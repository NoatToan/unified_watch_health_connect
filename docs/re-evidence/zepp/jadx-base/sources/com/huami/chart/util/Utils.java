package com.huami.chart.util;

import android.content.Context;
import androidx.annotation.ColorInt;
import com.huami.chart.R;
import com.huami.chart.helper.HMChartHelperKt;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Utils {
    @ColorInt
    public static int getChartBackgroundColor(Context context) {
        return HMChartHelperKt.getResColor(context, R.color.s38);
    }

    public static float[] transListToArray(List<Float> list) {
        float[] fArr = new float[list.size() - 1];
        for (int i = 0; i < list.size(); i++) {
            fArr[i] = list.get(i).floatValue();
        }
        return fArr;
    }
}
