package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public class StepType extends BaseType {
    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseType
    public int getBgId() {
        return R.drawable.icon_run_step;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseType
    public String getName(Context context) {
        return context.getString(R.string.run_step);
    }
}
