package com.huawei.health.knit.section.adapter;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import defpackage.ftk;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionRemindViewAdapter extends BaseRecyclerAdapter<ftk> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7425c;
    private String e;
    private static final int d = DicDataTypeUtil.DataType.LOW_BODY_TEMPERATURE_ALARM.value();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f7424a = DicDataTypeUtil.DataType.HIGH_BODY_TEMPERATURE_ALARM.value();

    public SectionRemindViewAdapter(List<ftk> list, int i, String str, String str2) {
        super(list, i);
        this.e = str;
        this.f7425c = str2;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, ftk ftkVar) {
        c(ftkVar, recyclerHolder);
        recyclerHolder.a(R.id.temperature_list_time, ftkVar.e());
        if (ftkVar.c()) {
            recyclerHolder.e(R.id.temperature_red_dot, 0);
        } else {
            recyclerHolder.e(R.id.temperature_red_dot, 8);
        }
        if (i == getItemCount() - 1) {
            recyclerHolder.e(R.id.temperature_divider, 8);
        } else {
            recyclerHolder.e(R.id.temperature_divider, 0);
        }
    }

    private void c(ftk ftkVar, RecyclerHolder recyclerHolder) {
        if (recyclerHolder == null || ftkVar == null) {
            LogUtil.j("SectionRemindViewAdapter", "setTextProperties holder or itemData is null");
            return;
        }
        Context context = BaseApplication.getContext();
        recyclerHolder.a(R.id.temperature_list_data, ftkVar.b());
        if (ftkVar.d() == d) {
            recyclerHolder.d(R.id.temperature_list_status, ContextCompat.getColor(context, R.color.temperature_level_low_color_blue));
            recyclerHolder.a(R.id.temperature_list_status, this.e);
        } else if (ftkVar.d() == f7424a) {
            recyclerHolder.d(R.id.temperature_list_status, ContextCompat.getColor(context, R.color.temperature_level_high_color_red));
            recyclerHolder.a(R.id.temperature_list_status, this.f7425c);
        } else {
            recyclerHolder.d(R.id.temperature_list_status, ContextCompat.getColor(context, R.color.temperature_new_level_high_color_red));
            recyclerHolder.a(R.id.temperature_list_status, this.f7425c);
        }
    }
}
