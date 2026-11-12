package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import com.huami.moving.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\n"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/dataprovider/GolfUpDownTimeType;", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getName", "", "getBgId", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class GolfUpDownTimeType extends BaseType {
    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseType
    public int getBgId() {
        return R.drawable.icon_run_step;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseType
    @NotNull
    public String getName(@Nullable Context context) {
        String string;
        return (context == null || (string = context.getString(R.string.sport_chart_up_down_swing)) == null) ? "" : string;
    }
}
