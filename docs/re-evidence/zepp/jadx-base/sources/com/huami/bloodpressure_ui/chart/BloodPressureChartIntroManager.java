package com.huami.bloodpressure_ui.chart;

import android.app.Activity;
import android.graphics.Paint;
import androidx.fragment.app.Fragment;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.ext.ContextExKt;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartIntroManager;", "", "Landroid/app/Activity;", "activity", "", "checkBoxVisible", "Landroidx/fragment/app/Fragment;", "getChartIntroFragment", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureChartIntroManager {

    @NotNull
    public static final BloodPressureChartIntroManager INSTANCE = new BloodPressureChartIntroManager();

    private BloodPressureChartIntroManager() {
    }

    @NotNull
    public final Fragment getChartIntroFragment(@NotNull Activity activity, boolean checkBoxVisible) {
        Paint paint = new Paint();
        paint.setTextSize(ViewExKt.dp2px(activity, 14.0f));
        return (((float) ContextExKt.getScreenWidth(activity)) > (((paint.measureText(activity.getResources().getString(R.string.blood_pressure_sbp)) + paint.measureText(activity.getResources().getString(R.string.blood_pressure_dbp))) + paint.measureText(activity.getResources().getString(R.string.blood_pressure_avg_line))) + ViewExKt.dp2px(activity, 150.0f)) ? 1 : (((float) ContextExKt.getScreenWidth(activity)) == (((paint.measureText(activity.getResources().getString(R.string.blood_pressure_sbp)) + paint.measureText(activity.getResources().getString(R.string.blood_pressure_dbp))) + paint.measureText(activity.getResources().getString(R.string.blood_pressure_avg_line))) + ViewExKt.dp2px(activity, 150.0f)) ? 0 : -1)) > 0 ? BloodPressureChartIntroFragment.INSTANCE.newInstance(checkBoxVisible) : BloodPressureChartIntroLongFragment.INSTANCE.newInstance(checkBoxVisible);
    }
}
