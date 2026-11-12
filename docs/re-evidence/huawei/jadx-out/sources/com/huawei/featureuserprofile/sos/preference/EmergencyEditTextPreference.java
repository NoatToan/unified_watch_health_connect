package com.huawei.featureuserprofile.sos.preference;

import android.content.Context;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.sos.interf.OnPreferenceChangedListener;
import com.huawei.featureuserprofile.sos.interf.ReloadablePreferenceInterface;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.cxz;
import health.compact.a.HwEncryptUtil;
import health.compact.a.StorageParams;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public class EmergencyEditTextPreference extends EditTextPreference implements ReloadablePreferenceInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnPreferenceChangedListener f5701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f5703c;
    private boolean d;
    private String e;

    public EmergencyEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutResource(R.layout.preference_item);
        this.e = getKey();
        this.f5703c = context;
    }

    @Override // com.huawei.featureuserprofile.sos.interf.ReloadablePreferenceInterface
    public void reloadFromPreference() {
        setText(getText());
    }

    @Override // android.preference.Preference
    public CharSequence getSummary() {
        String text = getText();
        return TextUtils.isEmpty(text) ? super.getSummary() : text;
    }

    @Override // android.preference.EditTextPreference
    public void setText(String str) {
        try {
            String strE = HwEncryptUtil.b(getContext()).e(2, str);
            boolean zEquals = TextUtils.equals(this.f5702b, str);
            if (zEquals && this.d) {
                return;
            }
            this.f5702b = str;
            this.d = true;
            EmergencyInfoManager.a().setSharedPreference(cxz.a() + this.e, strE, new StorageParams(1));
            if (zEquals) {
                return;
            }
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
            OnPreferenceChangedListener onPreferenceChangedListener = this.f5701a;
            if (onPreferenceChangedListener != null) {
                onPreferenceChangedListener.onPreferenceChanged(this.e, this.f5702b);
            }
        } catch (GeneralSecurityException unused) {
            LogUtil.e("EmergencyEditTextPreference", "setText catch GeneralSecurityException");
        }
    }

    @Override // android.preference.EditTextPreference
    public String getText() {
        try {
            return HwEncryptUtil.b(getContext()).c(2, EmergencyInfoManager.a().getSharedPreference(cxz.a() + this.e));
        } catch (GeneralSecurityException unused) {
            LogUtil.e("EmergencyEditTextPreference", "getText catch GeneralSecurityException");
            return "";
        }
    }

    @Override // android.preference.EditTextPreference, android.preference.Preference
    protected void onSetInitialValue(boolean z, Object obj) {
        if (obj instanceof String) {
            setText(z ? getText() : (String) obj);
        } else {
            setText(z ? getText() : "");
        }
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        if (view == null) {
            LogUtil.j("EmergencyEditTextPreference", "onBindView view is null");
        } else {
            super.onBindView(view);
            d(view);
        }
    }

    protected void d(View view) {
        BaseActivity.setViewSafeRegion(true, (LinearLayout) view.findViewById(R.id.ll_name_preference));
        ImageView imageView = (ImageView) view.findViewById(R.id.preference_image);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.single_text);
        setDialogTitle(R.string.IDS_emergency_name);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_name));
        if ("".equals(getText())) {
            healthTextView.setText(getContext().getString(R.string.IDS_emergency_name));
            healthTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.name_empty_color));
        } else {
            healthTextView.setText(getText());
            healthTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.textColorPrimary));
        }
    }

    public void d(OnPreferenceChangedListener onPreferenceChangedListener) {
        this.f5701a = onPreferenceChangedListener;
    }

    @Override // android.preference.EditTextPreference, android.preference.DialogPreference
    protected void showDialog(Bundle bundle) {
        View viewInflate = View.inflate(this.f5703c, R.layout.commonui_dialog_single_edit, null);
        final HealthEditText healthEditText = (HealthEditText) viewInflate.findViewById(R.id.edit);
        healthEditText.setImeOptions(268435456);
        healthEditText.setSelectAllOnFocus(true);
        if (this.f5703c.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager) {
            WindowManager windowManager = (WindowManager) this.f5703c.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            healthEditText.setMaxHeight((displayMetrics.heightPixels * 2) / 3);
        }
        CharSequence hint = getEditText() == null ? null : getEditText().getHint();
        if (!TextUtils.isEmpty(hint)) {
            healthEditText.setHint(hint.toString());
        }
        String text = getText();
        if (!TextUtils.isEmpty(text)) {
            healthEditText.setText(text);
        }
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f5703c);
        builder.a(getTitle() != null ? getTitle().toString() : null).d(viewInflate).d(R.string.IDS_emergency_confirm, new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.preference.EmergencyEditTextPreference.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EmergencyEditTextPreference.this.setText(healthEditText.getText().toString());
            }
        }).c(R.string.IDS_emergency_cancel, new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.preference.EmergencyEditTextPreference.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
        customViewDialogD.getWindow().setSoftInputMode(32);
    }
}
