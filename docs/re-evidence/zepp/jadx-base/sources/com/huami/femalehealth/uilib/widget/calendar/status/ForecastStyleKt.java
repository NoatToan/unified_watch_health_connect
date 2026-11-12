package com.huami.femalehealth.uilib.widget.calendar.status;

import android.content.Context;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.SupportAppHelper;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getForecastColor", "uilib_release"}, k = 2, mv = {1, 5, 1})
public final class ForecastStyleKt {
    public static final int getForecastColor(@NotNull Context context) {
        return SupportAppHelper.INSTANCE.isAmazfit() ? ExtKt.addAlpha(ExtKt.getResColor(context, R.color.fh_forecast_state_circle_color), 0.3d) : ExtKt.getResColor(context, R.color.fh_forecast_state_circle_color);
    }
}
