package com.xiaomi.fitness.health.bloodpressure.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.preference.SwitchPreference;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.c0j;
import defpackage.eri;
import defpackage.g7i;

/* JADX INFO: loaded from: classes9.dex */
public class CustomerSwitchPreference extends SwitchPreference {
    public View d;
    public SwitchButton e;

    public class a extends View.AccessibilityDelegate {
        public a() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            Logger.i("CustomerSwitchPreference", accessibilityNodeInfo);
        }
    }

    public CustomerSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final /* synthetic */ void h(boolean z, ISwitchButton iSwitchButton) {
        setChecked(z);
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        View viewA = g7iVar.a(eri.Ap);
        View view = g7iVar.itemView;
        this.d = view;
        view.setAccessibilityDelegate(new a());
        syncSwitchView(viewA);
        super.syncSummaryView(g7iVar);
    }

    public void setSwitchButton(Boolean bool) {
        SwitchButton switchButton = this.e;
        if (switchButton != null) {
            switchButton.setChecked(bool.booleanValue());
            this.e.setContentDescription(bool.booleanValue() ? ResourceExtKt.getString(c0j.common_switch_open_content) : ResourceExtKt.getString(c0j.common_switch_off_content));
        }
    }

    public final void syncSwitchView(View view) {
        if (view instanceof SwitchButton) {
            SwitchButton switchButton = (SwitchButton) view;
            this.e = switchButton;
            switchButton.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ve5
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    this.f36796a.h(z, iSwitchButton);
                }
            });
            this.e.setChecked(isChecked());
        }
    }

    public CustomerSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CustomerSwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomerSwitchPreference(Context context) {
        this(context, null);
    }
}
