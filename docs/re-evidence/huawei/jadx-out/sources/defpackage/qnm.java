package defpackage;

import android.content.Context;
import com.github.mikephil.charting.components.Legend;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class qnm {
    public static void b(Context context, Legend legend) {
        if (legend == null) {
            LogUtil.j("HealthChat_HwSingleLegendUtil", "custom legend == null");
            return;
        }
        legend.setTextColor(qqn.d(R.color.textColorSecondary));
        legend.setTextSize(10.0f);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        legend.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        legend.setOrientation(Legend.LegendOrientation.HORIZONTAL);
    }
}
