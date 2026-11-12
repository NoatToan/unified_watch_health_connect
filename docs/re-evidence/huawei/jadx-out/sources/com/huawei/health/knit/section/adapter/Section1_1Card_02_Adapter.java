package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fsu;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section1_1Card_02_Adapter extends RecyclerView.Adapter<Section1_1Card_02_ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f7254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7255b;
    private OnClickSectionListener e;

    public Section1_1Card_02_Adapter(Context context, List<Object> list, OnClickSectionListener onClickSectionListener) {
        this.f7255b = context;
        this.f7254a = list;
        this.e = onClickSectionListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Section1_1Card_02_ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new Section1_1Card_02_ViewHolder(LayoutInflater.from(this.f7255b).inflate(R.layout.section1_1card_02_recyclerview_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(Section1_1Card_02_ViewHolder section1_1Card_02_ViewHolder, final int i) {
        RecyclerView.LayoutParams layoutParamsC = c(section1_1Card_02_ViewHolder, i);
        if (layoutParamsC == null) {
            LogUtil.e("Section1_1Card_02_Adapter", "params is invalid!");
            return;
        }
        if (section1_1Card_02_ViewHolder.e != null) {
            section1_1Card_02_ViewHolder.e.setLayoutParams(layoutParamsC);
        }
        if (njy.e(this.f7254a, i)) {
            LogUtil.e("Section1_1Card_02_Adapter", "position is out of bounds");
            return;
        }
        List<Object> list = this.f7254a;
        if (list != null && (list.get(i) instanceof fsu)) {
            fsu fsuVar = (fsu) this.f7254a.get(i);
            section1_1Card_02_ViewHolder.f7257a.setImageResource(fsuVar.d());
            section1_1Card_02_ViewHolder.f7258c.setText(this.f7255b.getString(fsuVar.b()));
        }
        section1_1Card_02_ViewHolder.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.Section1_1Card_02_Adapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Section1_1Card_02_Adapter.this.e != null) {
                    Section1_1Card_02_Adapter.this.e.onClick(i);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Object> list = this.f7254a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    protected RecyclerView.LayoutParams c(Section1_1Card_02_ViewHolder section1_1Card_02_ViewHolder, int i) {
        ViewGroup.LayoutParams layoutParams = section1_1Card_02_ViewHolder.e.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.e("layoutParams error", new Object[0]);
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        int dimensionPixelSize = this.f7255b.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.f7255b.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int dimensionPixelSize3 = this.f7255b.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (i == 0) {
            layoutParams2.setMarginStart(dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue());
            return layoutParams2;
        }
        if (i == getItemCount() - 1 && layoutParams2.getMarginStart() == 0 && layoutParams2.getMarginEnd() == 0) {
            layoutParams2.setMarginStart(dimensionPixelSize3);
            layoutParams2.setMarginEnd(dimensionPixelSize2 + ((Integer) safeRegionWidth.second).intValue());
            return layoutParams2;
        }
        a(layoutParams2, dimensionPixelSize3);
        return layoutParams2;
    }

    private void a(RecyclerView.LayoutParams layoutParams, int i) {
        if (layoutParams.getMarginStart() == 0) {
            layoutParams.setMarginStart(i);
        }
    }

    public static class Section1_1Card_02_ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f7257a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7258c;
        private LinearLayout e;

        public Section1_1Card_02_ViewHolder(View view) {
            super(view);
            this.e = (LinearLayout) view.findViewById(R.id.section1_1card_02_recyclerview_item_ll);
            this.f7257a = (ImageView) view.findViewById(R.id.section_top_image);
            this.f7258c = (HealthTextView) view.findViewById(R.id.section_bottom_text);
        }
    }
}
