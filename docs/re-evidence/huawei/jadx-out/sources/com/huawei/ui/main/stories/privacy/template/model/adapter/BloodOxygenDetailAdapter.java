package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.wgv;
import defpackage.wia;
import defpackage.wua;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes19.dex */
public class BloodOxygenDetailAdapter extends DataSourceViewAdapter {
    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DataSourceViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b */
    public DataSourceViewAdapter.c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_blood_oxygen_detail_item, viewGroup, false));
    }

    class e extends DataSourceViewAdapter.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f28666c;

        e(View view) {
            super(view);
            this.f28666c = (HealthTextView) view.findViewById(R.id.privacy_detail_point);
        }

        @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DataSourceViewAdapter.c
        void b(PrivacyDataModel privacyDataModel) {
            super.b(privacyDataModel);
            String dataTitle = privacyDataModel.getDataTitle();
            String dataDesc = privacyDataModel.getDataDesc();
            Context context = BaseApplication.getContext();
            if (context.getString(R.string.IDS_privacy_highland_risk).equals(dataTitle)) {
                int iB = CommonUtil.b(dataDesc, 10);
                this.f28676a.setTextColor(wua.e(iB));
                this.f28676a.setText(wgv.d(iB));
                this.f28666c.setBackground(wia.i(iB));
                this.f28666c.setText(wua.h(iB));
                this.f28666c.setVisibility(0);
                return;
            }
            if (context.getString(R.string.IDS_hw_show_main_permission_blood_oxygen).equals(dataTitle)) {
                int iB2 = CommonUtil.b(dataDesc, 10);
                this.f28676a.setTextColor(wua.c(iB2));
                this.f28676a.setText(wgv.c(iB2));
                this.f28666c.setVisibility(8);
                return;
            }
            this.f28676a.setText(dataDesc);
            this.f28676a.setTextColor(context.getColor(R.color.textColorSecondary));
            this.f28666c.setVisibility(8);
        }
    }
}
