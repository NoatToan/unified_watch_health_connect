package com.huawei.health.suggestion.model.customcourse;

import android.content.Context;
import com.huawei.health.suggestion.R;

/* JADX INFO: loaded from: classes9.dex */
public class TargetCalorie {
    private static final int DEFAULT_VALUE = 100;
    public static final int INTERVAL = 50;
    private static final int MAX_VALUE = 5000;

    public static int getDefaultValuePosition() {
        return 1;
    }

    public static String[] getCalorieArray(Context context) {
        String[] strArr = new String[100];
        int i = 0;
        while (i < 100) {
            int i2 = i + 1;
            int i3 = i2 * 50;
            strArr[i] = context.getResources().getQuantityString(R.plurals.sug_chart_kcals, i3, Integer.valueOf(i3));
            i = i2;
        }
        return strArr;
    }
}
