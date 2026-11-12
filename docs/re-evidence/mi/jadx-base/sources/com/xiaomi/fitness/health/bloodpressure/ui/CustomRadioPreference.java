package com.xiaomi.fitness.health.bloodpressure.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.g7i;
import java.util.Objects;
import miuix.preference.RadioButtonPreference;

/* JADX INFO: loaded from: classes9.dex */
public class CustomRadioPreference extends RadioButtonPreference {

    public class a extends View.AccessibilityDelegate {
        public a() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            Logger.i("CustomRadioPreference", "isCheck " + CustomRadioPreference.this.isChecked() + "info " + accessibilityNodeInfo);
            if (CustomRadioPreference.this.isChecked()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            } else {
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            }
        }
    }

    public CustomRadioPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // miuix.preference.RadioButtonPreference, miuix.preference.BaseCheckBoxPreference, androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        g7iVar.itemView.setAccessibilityDelegate(new a());
    }

    @Override // miuix.preference.RadioButtonPreference, androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        SharedPreferences sharedPreferences = getSharedPreferences();
        Objects.requireNonNull(sharedPreferences);
        sharedPreferences.edit().putBoolean(getKey(), isChecked()).apply();
    }

    public CustomRadioPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomRadioPreference(Context context) {
        super(context);
    }
}
