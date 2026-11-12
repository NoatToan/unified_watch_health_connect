package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.fow;

/* JADX INFO: loaded from: classes7.dex */
public class Section16_9Series_02Adapter extends Section16_9Series_01Adapter {
    private Context d;

    public Section16_9Series_02Adapter(Context context, fow fowVar) {
        super(context, fowVar);
        this.d = context;
    }

    @Override // com.huawei.health.knit.section.adapter.Section16_9Series_01Adapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a */
    public Section16_9Series_01Adapter.Section16_9Series_01ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new Section16_9Series_01Adapter.Section16_9Series_01ViewHolder(LayoutInflater.from(this.d).inflate(R.layout.section16_9series_02_item, viewGroup, false));
    }

    @Override // com.huawei.health.knit.section.adapter.Section16_9Series_01Adapter
    protected RecyclerView.LayoutParams c(Section16_9Series_01Adapter.Section16_9Series_01ViewHolder section16_9Series_01ViewHolder, int i) {
        ViewGroup.LayoutParams layoutParams = section16_9Series_01ViewHolder.a().getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.e("layoutParams error", new Object[0]);
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        int dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.d.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int dimensionPixelSize3 = this.d.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (i == 0) {
            layoutParams2.setMarginStart(dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue());
            return layoutParams2;
        }
        if (i == getItemCount() - 1) {
            layoutParams2.setMarginStart(dimensionPixelSize3);
            layoutParams2.setMarginEnd(dimensionPixelSize2 + ((Integer) safeRegionWidth.second).intValue());
            return layoutParams2;
        }
        layoutParams2.setMarginStart(dimensionPixelSize3);
        return layoutParams2;
    }
}
