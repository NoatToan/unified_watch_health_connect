package com.huami.ui.widget.sleepdial;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes15.dex */
public class TimeDialView extends FrameLayout {
    private DragChangeTimeView a;
    private VibrateService b;

    public TimeDialView(@NonNull Context context) {
        this(context, null);
    }

    private void a(Context context) {
        FrameLayout.inflate(context, R.layout.sd_frame, this);
        this.a = (DragChangeTimeView) findViewById(R.id.alarmTimer);
    }

    public void attachScrollView(ScrollWrapper scrollWrapper) {
        this.a.f(scrollWrapper);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public void setOnTimeChangeListener(OnTimeChangedListener onTimeChangedListener) {
        this.a.p(onTimeChangedListener);
    }

    public void setVibrateEnable(boolean z) {
        if (getContext() == null) {
            return;
        }
        if (!z) {
            this.a.q(null);
            return;
        }
        if (this.b == null) {
            VibrateService vibrateService = new VibrateService(getContext());
            this.b = vibrateService;
            vibrateService.initial();
        }
        this.a.q(this.b);
    }

    public void updateEndTime(@NonNull Integer num) {
        this.a.u(num.intValue());
    }

    public void updateStartTime(@NonNull int i) {
        this.a.s(i);
    }

    public TimeDialView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public TimeDialView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    @RequiresApi(api = 21)
    public TimeDialView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context);
    }
}
