package com.huawei.ui.main.stories.health.temperature.adapter;

import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.main.R;
import defpackage.vai;
import defpackage.vbr;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class TemperatureHomeWarningAdapter extends BaseRecyclerAdapter<vai> {
    public TemperatureHomeWarningAdapter(List<vai> list, int i) {
        super(list, i);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, vai vaiVar) {
        vbr.d(vaiVar, recyclerHolder);
        recyclerHolder.a(R.id.temperature_list_time, vaiVar.c());
        if (vaiVar.j()) {
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
}
