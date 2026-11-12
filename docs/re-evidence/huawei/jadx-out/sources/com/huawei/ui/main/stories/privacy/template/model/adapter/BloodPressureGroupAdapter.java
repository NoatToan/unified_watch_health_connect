package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.ftw;
import defpackage.qqz;
import defpackage.vzm;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class BloodPressureGroupAdapter extends GroupDataAdapter {
    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter
    public View a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_pressure_child_item, viewGroup, false);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter
    public GroupDataAdapter.e d(View view) {
        return new d(view);
    }

    class d extends GroupDataAdapter.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f28673b;
        private ImageView j;
        private HealthTextView l;

        d(View view) {
            super(view);
            this.l = (HealthTextView) view.findViewById(R.id.hw_show_value_status);
            this.f28673b = (ImageView) view.findViewById(R.id.hw_show_child_left_img);
            ImageView imageView = (ImageView) view.findViewById(R.id.privacy_measure_abnormal);
            this.j = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.privacy.template.model.adapter.BloodPressureGroupAdapter.d.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    View viewInflate = LayoutInflater.from(view2.getContext()).inflate(R.layout.privacy_bubble_layout, (ViewGroup) null);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.privacy_content);
                    if (view2.getTag() instanceof Integer) {
                        textView.setText(vzm.a.d(((Integer) view2.getTag()).intValue()));
                    }
                    PopupWindow popupWindow = new PopupWindow(view2.getContext());
                    popupWindow.setContentView(viewInflate);
                    popupWindow.setBackgroundDrawable(null);
                    popupWindow.setFocusable(true);
                    viewInflate.measure(0, 0);
                    popupWindow.showAsDropDown(view2, (-(viewInflate.getMeasuredWidth() - view2.getWidth())) / 2, view2.getResources().getDimensionPixelSize(R.dimen.health_common_8dp));
                }
            });
        }

        @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter.e
        protected void b(PrivacyDataModel privacyDataModel) {
            super.b(privacyDataModel);
            int i = privacyDataModel.getInt(BleConstants.BLOODPRESSURE_SYSTOLIC);
            int i2 = privacyDataModel.getInt(BleConstants.BLOODPRESSURE_DIASTOLIC);
            this.l.setText(ftw.e(i, i2));
            this.l.setTextColor(ftw.e(ftw.b(i, i2)));
            int i3 = Integer.parseInt(privacyDataModel.getString("iconResource"));
            if (LanguageUtil.ba(BaseApplication.b())) {
                BitmapDrawable bitmapDrawableE = qqz.e(BaseApplication.b(), i3);
                if (bitmapDrawableE != null) {
                    this.f28673b.setImageDrawable(bitmapDrawableE);
                }
            } else {
                this.f28673b.setImageResource(i3);
            }
            int i4 = privacyDataModel.getInt("measureAbnormal");
            if (i4 == 2) {
                this.j.setBackgroundResource(R.drawable.ic_bp_wrong_posture);
                this.j.setTag(2);
                return;
            }
            if (i4 == 3) {
                this.j.setBackgroundResource(R.drawable.ic_bp_moving);
                this.j.setTag(3);
                return;
            }
            if (i4 == 4) {
                this.j.setBackgroundResource(R.drawable.ic_bp_after_exercise);
                this.j.setTag(4);
                return;
            }
            if (i4 == 5) {
                this.j.setBackgroundResource(R.drawable.ic_bp_wear_wrongly);
                this.j.setTag(5);
                return;
            }
            switch (i4) {
                case 9:
                    this.j.setBackgroundResource(R.drawable.ic_bp_abnomal_heart_rate);
                    this.j.setTag(9);
                    break;
                case 10:
                case 11:
                    this.j.setBackgroundResource(R.drawable.ic_bp_wear_loose);
                    this.j.setTag(10);
                    break;
                default:
                    this.j.setBackground(null);
                    break;
            }
        }
    }
}
