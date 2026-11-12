package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.wgv;
import defpackage.wia;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class BloodOxygenDayAdapter extends DayDataViewAdapter {
    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DayDataViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a */
    public DayDataViewAdapter.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_blood_oxygen_child_item, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.privacy_item_rl);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(0);
            layoutParams2.setMarginEnd(0);
        }
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setBackgroundResource(R.drawable.privacy_card_view_bg_round);
        return new d(viewInflate);
    }

    class d extends DayDataViewAdapter.a {
        private HealthTextView j;

        d(View view) {
            super(view);
            this.j = (HealthTextView) view.findViewById(R.id.privacy_extra_data);
        }

        @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DayDataViewAdapter.a
        protected void d(PrivacyDataModel privacyDataModel) {
            int i = privacyDataModel.getInt("bloodOxygenKey");
            this.f.setText(wia.e(this.j.getContext(), "[\\d%]", BaseApplication.getContext().getResources().getString(R.string.IDS_health_blood_oxygen_info, wia.b(privacyDataModel.getInt("bloodOxygenCardKey")), UnitUtil.e(i, 2, 0)), wia.c(i), wia.e()));
            this.d.setText(privacyDataModel.getDataDesc());
            int i2 = privacyDataModel.getInt("altitudeKey");
            if (wia.g(i2)) {
                this.j.setText(this.j.getResources().getString(R.string.IDS_hw_health_blood_oxygen_elevation) + " " + wgv.e(i2));
                this.j.setVisibility(0);
                return;
            }
            this.j.setVisibility(8);
        }
    }
}
