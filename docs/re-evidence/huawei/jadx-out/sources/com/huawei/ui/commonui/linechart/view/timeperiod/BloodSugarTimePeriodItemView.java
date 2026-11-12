package com.huawei.ui.commonui.linechart.view.timeperiod;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes16.dex */
class BloodSugarTimePeriodItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23758a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthCheckBox f23759c;
    private int d;
    private HealthTextView e;

    BloodSugarTimePeriodItemView(Context context) {
        this(context, null);
    }

    BloodSugarTimePeriodItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    BloodSugarTimePeriodItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context, attributeSet, i);
    }

    public void setChecked(boolean z) {
        HealthCheckBox healthCheckBox = this.f23759c;
        if (healthCheckBox == null || this.e == null) {
            LogUtil.j("BloodSugarTimePeriodItemView", "setChecked, the mTimePeriodIconCheckBox or mTimePeriodTextView is null");
            return;
        }
        healthCheckBox.setChecked(z);
        if (z) {
            this.e.setTextColor(this.f23758a);
        } else {
            this.e.setTextColor(this.d);
        }
    }

    public void setIconDrawable(int i) {
        HealthCheckBox healthCheckBox = this.f23759c;
        if (healthCheckBox != null) {
            healthCheckBox.setBackgroundResource(i);
        }
    }

    public void setTimePeriodText(CharSequence charSequence) {
        HealthTextView healthTextView = this.e;
        if (healthTextView != null) {
            healthTextView.setText(charSequence);
        }
    }

    private void e(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        inflate(context, R.layout.layout_blood_sugar_time_period_item_view, this);
        this.f23759c = (HealthCheckBox) findViewById(R.id.checkbox_time_period_icon);
        this.e = (HealthTextView) findViewById(R.id.text_view_time_period_name);
        this.f23758a = ContextCompat.getColor(context, R.color.blood_sugar_text_primary);
        this.d = ContextCompat.getColor(context, R.color.blood_sugar_text_secondary);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BloodSugarTimePeriodItemView, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BloodSugarTimePeriodItemView_timePeriodText)) {
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.BloodSugarTimePeriodItemView_timePeriodText);
            if (!TextUtils.isEmpty(string)) {
                setTimePeriodText(string);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BloodSugarTimePeriodItemView_timePeriodIcon) && (drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.BloodSugarTimePeriodItemView_timePeriodIcon)) != null) {
            this.f23759c.setButtonDrawable(drawable);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BloodSugarTimePeriodItemView_timePeriodChecked)) {
            setChecked(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BloodSugarTimePeriodItemView_timePeriodChecked, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
