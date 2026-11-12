package com.huawei.featureuserprofile.sos.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.featureuserprofile.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class EmergencyEditTextTipPreference extends EmergencyEditTextPreference {
    public EmergencyEditTextTipPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutResource(R.layout.preference_item_double);
    }

    @Override // com.huawei.featureuserprofile.sos.preference.EmergencyEditTextPreference
    public void d(View view) {
        BaseActivity.setViewSafeRegion(true, (LinearLayout) view.findViewById(R.id.ll_edit_preference));
        String key = getKey();
        if (TextUtils.isEmpty(key)) {
            LogUtil.a("EmergencyEditTextTipPreference", "initBindView keyName empty");
        } else {
            d(key, (ImageView) view.findViewById(R.id.preference_image), (HealthTextView) view.findViewById(R.id.double_title), (HealthTextView) view.findViewById(R.id.double_summary));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    private void d(String str, ImageView imageView, HealthTextView healthTextView, HealthTextView healthTextView2) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "address":
                b2 = 0;
                break;
            case "allergies":
                b2 = 1;
                break;
            case "medications":
                b2 = 2;
                break;
            case "medical_conditions":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            setDialogTitle(R.string.IDS_emergency_address);
            imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_gps));
            healthTextView2.setText(getContext().getString(R.string.IDS_emergency_address));
            if ("".equals(getText())) {
                healthTextView.setText(getContext().getString(R.string.IDS_unknown_address));
                return;
            } else {
                healthTextView.setText(getText());
                return;
            }
        }
        if (b2 == 1) {
            setDialogTitle(R.string.IDS_allergies);
            imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_allergies));
            healthTextView2.setText(getContext().getString(R.string.IDS_allergies));
            if ("".equals(getText())) {
                healthTextView.setText(getContext().getString(R.string.IDS_unknown_allergies));
                return;
            } else {
                healthTextView.setText(getText());
                return;
            }
        }
        if (b2 == 2) {
            setDialogTitle(R.string.IDS_medications);
            imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_medic));
            healthTextView2.setText(getContext().getString(R.string.IDS_medications));
            if ("".equals(getText())) {
                healthTextView.setText(getContext().getString(R.string.IDS_unknown_medications));
                return;
            } else {
                healthTextView.setText(getText());
                return;
            }
        }
        if (b2 != 3) {
            LogUtil.d("EmergencyEditTextTipPreference", "initBindView default");
            return;
        }
        setDialogTitle(R.string.IDS_medical_conditions);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_medic_conditions));
        healthTextView2.setText(getContext().getString(R.string.IDS_medical_conditions));
        if ("".equals(getText())) {
            healthTextView.setText(getContext().getString(R.string.IDS_unknown_medical_conditions));
        } else {
            healthTextView.setText(getText());
        }
    }
}
