package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.ftw;

/* JADX INFO: loaded from: classes19.dex */
public class BloodPressureDetailAdapter extends DataSourceViewAdapter {
    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DataSourceViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b */
    public DataSourceViewAdapter.c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_blood_pressure_detail_item, viewGroup, false));
    }

    class e extends DataSourceViewAdapter.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f28670c;
        private TextView f;

        e(View view) {
            super(view);
            this.f28670c = (ImageView) view.findViewById(R.id.privacy_title_icon);
            this.f = (TextView) view.findViewById(R.id.privacy_value_status);
        }

        @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DataSourceViewAdapter.c
        void b(PrivacyDataModel privacyDataModel) {
            super.b(privacyDataModel);
            String dataTitle = privacyDataModel.getDataTitle();
            Context context = BaseApplication.getContext();
            if (context.getString(R.string.IDS_hw_show_main_home_page_bloodpressure).equals(dataTitle)) {
                int i = privacyDataModel.getInt(BleConstants.BLOODPRESSURE_SYSTOLIC);
                int i2 = privacyDataModel.getInt(BleConstants.BLOODPRESSURE_DIASTOLIC);
                this.f.setText(ftw.e(i, i2));
                this.f.setTextColor(ftw.e(ftw.b(i, i2)));
            } else {
                this.f.setText("");
            }
            if (context.getString(R.string.IDS_privacy_measure_abnormal).equals(dataTitle)) {
                this.f28677b.setTextColor(context.getColor(R.color.colorError));
                int i3 = privacyDataModel.getInt("measureAbnormal");
                if (i3 == 2) {
                    this.f28670c.setImageResource(R.drawable.ic_bp_wrong_posture);
                    return;
                }
                if (i3 == 3) {
                    this.f28670c.setImageResource(R.drawable.ic_bp_moving);
                    return;
                }
                if (i3 == 4) {
                    this.f28670c.setImageResource(R.drawable.ic_bp_after_exercise);
                    return;
                }
                if (i3 == 5) {
                    this.f28670c.setImageResource(R.drawable.ic_bp_wear_wrongly);
                    return;
                }
                switch (i3) {
                    case 9:
                        this.f28670c.setImageResource(R.drawable.ic_bp_abnomal_heart_rate);
                        break;
                    case 10:
                    case 11:
                        this.f28670c.setImageResource(R.drawable.ic_bp_wear_loose);
                        break;
                    default:
                        this.f28670c.setImageDrawable(null);
                        break;
                }
                return;
            }
            this.f28677b.setTextColor(context.getColor(R.color.textColorPrimary));
        }
    }
}
