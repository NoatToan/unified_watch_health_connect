package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.content.Context;
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
import com.huawei.ui.main.stories.privacy.template.model.adapter.BloodPressureDoubleGroupAdapter;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.uikit.hwbubblelayout.widget.HwBubbleLayout;
import defpackage.ftw;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.vzm;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class BloodPressureDoubleGroupAdapter extends DoubleGroupDataAdapter {
    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter
    public int d() {
        return R.layout.privacy_pressure_child_item;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter
    public DoubleGroupDataAdapter.b b(View view) {
        return new d(view);
    }

    public class d extends DoubleGroupDataAdapter.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f28672c;
        ImageView d;
        HealthTextView e;

        d(View view) {
            super(view);
            this.e = (HealthTextView) view.findViewById(R.id.hw_show_value_status);
            this.f28672c = (ImageView) view.findViewById(R.id.hw_show_child_left_img);
            ImageView imageView = (ImageView) view.findViewById(R.id.privacy_measure_abnormal);
            this.d = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: whh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodPressureDoubleGroupAdapter.d.d(view2);
                }
            });
        }

        public static /* synthetic */ void d(View view) {
            Context context = view.getContext();
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.privacy_bubble_layout, (ViewGroup) null);
            if (viewInflate instanceof HwBubbleLayout) {
                HwBubbleLayout hwBubbleLayout = (HwBubbleLayout) viewInflate;
                TextView textView = (TextView) hwBubbleLayout.findViewById(R.id.privacy_content);
                if (view.getTag() instanceof Integer) {
                    textView.setText(vzm.a.d(((Integer) view.getTag()).intValue()));
                }
                PopupWindow popupWindow = new PopupWindow(context);
                popupWindow.setContentView(hwBubbleLayout);
                popupWindow.setBackgroundDrawable(null);
                popupWindow.setFocusable(true);
                hwBubbleLayout.measure(0, 0);
                int measuredWidth = hwBubbleLayout.getMeasuredWidth();
                int measuredHeight = hwBubbleLayout.getMeasuredHeight();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if ((((qrs.m() - iArr[1]) - view.getHeight()) - (qrs.ad(context) ? qrs.q(context) : 0)) - measuredHeight < view.getResources().getDimensionPixelSize(R.dimen.health_common_8dp)) {
                    hwBubbleLayout.setArrowDirection(HwBubbleLayout.ArrowDirection.BOTTOM);
                    popupWindow.showAtLocation(view, 0, (int) ((iArr[0] + (view.getWidth() * 0.5f)) - (measuredWidth * 0.5f)), (iArr[1] - measuredHeight) - view.getResources().getDimensionPixelSize(R.dimen.health_common_8dp));
                } else {
                    hwBubbleLayout.setArrowDirection(HwBubbleLayout.ArrowDirection.TOP);
                    popupWindow.showAsDropDown(view, (int) ((-(measuredWidth - view.getWidth())) * 0.5f), view.getResources().getDimensionPixelSize(R.dimen.health_common_8dp));
                }
            }
        }

        @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter.b
        void a(PrivacyDataModel privacyDataModel) {
            super.a(privacyDataModel);
            int i = privacyDataModel.getInt(BleConstants.BLOODPRESSURE_SYSTOLIC);
            int i2 = privacyDataModel.getInt(BleConstants.BLOODPRESSURE_DIASTOLIC);
            this.e.setText(ftw.e(i, i2));
            this.e.setTextColor(ftw.e(ftw.b(i, i2)));
            int i3 = Integer.parseInt(privacyDataModel.getString("iconResource"));
            if (LanguageUtil.ba(BaseApplication.b())) {
                BitmapDrawable bitmapDrawableE = qqz.e(BaseApplication.b(), i3);
                if (bitmapDrawableE != null) {
                    this.f28672c.setImageDrawable(bitmapDrawableE);
                }
            } else {
                this.f28672c.setImageResource(i3);
            }
            int i4 = privacyDataModel.getInt("measureAbnormal");
            if (i4 == 2) {
                this.d.setBackgroundResource(R.drawable.ic_bp_wrong_posture);
                this.d.setTag(2);
                return;
            }
            if (i4 == 3) {
                this.d.setBackgroundResource(R.drawable.ic_bp_moving);
                this.d.setTag(3);
                return;
            }
            if (i4 == 4) {
                this.d.setBackgroundResource(R.drawable.ic_bp_after_exercise);
                this.d.setTag(4);
                return;
            }
            if (i4 == 5) {
                this.d.setBackgroundResource(R.drawable.ic_bp_wear_wrongly);
                this.d.setTag(5);
                return;
            }
            switch (i4) {
                case 9:
                    this.d.setBackgroundResource(R.drawable.ic_bp_abnomal_heart_rate);
                    this.d.setTag(9);
                    break;
                case 10:
                case 11:
                    this.d.setBackgroundResource(R.drawable.ic_bp_wear_loose);
                    this.d.setTag(10);
                    break;
                default:
                    this.d.setBackground(null);
                    break;
            }
        }
    }
}
