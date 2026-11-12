package com.huawei.ui.commonui.spinner;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.phone.hwspinner.widget.HwSpinner;

/* JADX INFO: loaded from: classes16.dex */
public class HealthSpinner extends HwSpinner {
    public HealthSpinner(Context context) {
        super(context);
        a();
    }

    public HealthSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public HealthSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        if (SystemInfo.e()) {
            return;
        }
        setPopupBackgroundResource(R.drawable.spinner_shadow_background);
    }
}
