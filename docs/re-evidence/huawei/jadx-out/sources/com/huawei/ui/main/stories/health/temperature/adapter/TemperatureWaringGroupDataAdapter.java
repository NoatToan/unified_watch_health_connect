package com.huawei.ui.main.stories.health.temperature.adapter;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseGroupDataAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.main.R;
import defpackage.vae;
import defpackage.vai;
import defpackage.vbr;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class TemperatureWaringGroupDataAdapter extends BaseGroupDataAdapter<vae, vai> {
    private boolean d = UnitUtil.a();

    @Override // com.huawei.ui.commonui.adapter.BaseGroupDataAdapter
    public void setChildViewData(RecyclerHolder recyclerHolder, int i, int i2) {
        super.setChildViewData(recyclerHolder, i, i2);
        vai child = getChild(i2, i);
        if (child != null) {
            a(child, recyclerHolder, this.d);
            recyclerHolder.a(R.id.item_right_data, child.b());
        }
    }

    private static void a(vai vaiVar, RecyclerHolder recyclerHolder, boolean z) {
        String string;
        if (recyclerHolder == null || vaiVar == null) {
            LogUtil.j("TemperatureWaringGroupDataAdapter", "setTextProperties holder or itemData is null");
            return;
        }
        Context context = BaseApplication.getContext();
        if (z) {
            string = context.getResources().getString(R.string.IDS_settings_health_temperature_unit, vaiVar.f());
        } else {
            string = context.getResources().getString(R.string.IDS_temp_unit_fahrenheit, vaiVar.f());
        }
        recyclerHolder.a(R.id.item_title, string);
        int iA = vaiVar.a();
        if (iA == vbr.f50911b) {
            recyclerHolder.d(R.id.item_subtitle, ContextCompat.getColor(context, R.color.temperature_level_high_color));
            recyclerHolder.a(R.id.item_subtitle, context.getString(R.string.IDS_temperature_warning_high));
        } else if (iA == vbr.d) {
            recyclerHolder.d(R.id.item_subtitle, ContextCompat.getColor(context, R.color.temperature_level_low_color_blue));
            recyclerHolder.a(R.id.item_subtitle, context.getString(R.string.IDS_temperature_warning_low));
        } else {
            recyclerHolder.d(R.id.item_subtitle, ContextCompat.getColor(context, R.color.temperature_level_high_color_red));
            recyclerHolder.a(R.id.item_subtitle, context.getString(R.string.IDS_temperature_warning_high));
        }
    }
}
