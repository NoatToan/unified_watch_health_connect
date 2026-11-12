package com.huawei.featureuserprofile.sos.preference;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.sos.activity.EditContactActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class EntryContactPreference extends Preference {
    private Context e;

    public EntryContactPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        setLayoutResource(R.layout.preference_item_entry);
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        if (view == null) {
            LogUtil.c("EntryContactPreference", "onBindView view is null");
            return;
        }
        super.onBindView(view);
        BaseActivity.setViewSafeRegion(true, (LinearLayout) view.findViewById(R.id.ll_contact_preference));
        ImageView imageView = (ImageView) view.findViewById(R.id.preference_image);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.single_text);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_contacts_edit_nickname));
        healthTextView.setText(getContext().getString(R.string.IDS_emergency_contacts_title));
        healthTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.textColorPrimary));
        if (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
            layoutParams.setMarginStart(getContext().getResources().getDimensionPixelSize(R.dimen.all_marginstart_sos_emergency_entry));
            healthTextView.setLayoutParams(layoutParams);
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.arrow);
        if (LanguageUtil.ba(this.e)) {
            imageView2.setImageDrawable(getContext().getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            imageView2.setImageDrawable(getContext().getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        if (getKey().equals("entry_contact_edit")) {
            setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.huawei.featureuserprofile.sos.preference.EntryContactPreference.4
                @Override // android.preference.Preference.OnPreferenceClickListener
                public boolean onPreferenceClick(Preference preference) {
                    if (EntryContactPreference.this.e == null) {
                        LogUtil.c("EntryContactPreference", "onPreferenceClick context is null");
                        return false;
                    }
                    try {
                        EntryContactPreference.this.e.startActivity(new Intent(EntryContactPreference.this.e, (Class<?>) EditContactActivity.class));
                        return true;
                    } catch (ActivityNotFoundException e) {
                        LogUtil.c("EntryContactPreference", "ActivityNotFoundException", e.getMessage());
                        return true;
                    }
                }
            });
        }
    }
}
