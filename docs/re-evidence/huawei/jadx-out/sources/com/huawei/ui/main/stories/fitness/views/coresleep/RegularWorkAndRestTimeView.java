package com.huawei.ui.main.stories.fitness.views.coresleep;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.ezo;

/* JADX INFO: loaded from: classes2.dex */
public class RegularWorkAndRestTimeView extends FrameLayout {
    private HealthTextView d;
    private HealthTextView e;

    public RegularWorkAndRestTimeView(Context context) {
        super(context);
        e(context);
    }

    public RegularWorkAndRestTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public RegularWorkAndRestTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    private void e(Context context) {
        LayoutInflater.from(context).inflate(R.layout.sleep_task_regular_work_and_rest_time, this);
        this.d = (HealthTextView) findViewById(R.id.sleep_time);
        this.e = (HealthTextView) findViewById(R.id.wakeup_time);
    }

    public void setupSleepWakeupTime(long j, long j2, boolean z, boolean z2) {
        e(j, z, this.d);
        e(j2, z2, this.e);
    }

    private void e(long j, boolean z, HealthTextView healthTextView) {
        if (j == 0) {
            return;
        }
        healthTextView.setText(ezo.c(j));
        Drawable drawable = ContextCompat.getDrawable(BaseApplication.b(), z ? R.drawable.ic_regular_work_and_rest_success : R.drawable.ic_regular_work_and_rest_fail);
        if (drawable != null) {
            int dimension = (int) BaseApplication.b().getResources().getDimension(R.dimen.health_common_15dp);
            drawable.setBounds(0, 0, dimension, dimension);
        }
        healthTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
