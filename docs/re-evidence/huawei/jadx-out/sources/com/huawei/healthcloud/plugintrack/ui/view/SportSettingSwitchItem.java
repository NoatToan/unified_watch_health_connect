package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;

/* JADX INFO: loaded from: classes10.dex */
public class SportSettingSwitchItem extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthImageView f11325a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSwitchButton f11326c;
    private HealthTextView d;
    private HealthTextView e;

    public SportSettingSwitchItem(Context context) {
        super(context);
        b();
    }

    public SportSettingSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public SportSettingSwitchItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.item_sport_setting_switch, this);
        this.e = (HealthTextView) findViewById(R.id.title_txt);
        this.d = (HealthTextView) findViewById(R.id.tips_txt);
        this.f11326c = (HealthSwitchButton) findViewById(R.id.switch_btn);
        this.f11325a = (HealthImageView) findViewById(R.id.title_red_point);
    }

    public void setTitleText(int i) {
        this.e.setText(i);
    }

    public void setTipsTxt(int i) {
        this.d.setVisibility(0);
        this.d.setText(i);
    }

    public void setChecked(boolean z) {
        this.f11326c.setChecked(z);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f11326c.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setRedPointShow(boolean z) {
        this.f11325a.setVisibility(z ? 0 : 8);
    }
}
