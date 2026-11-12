package com.huawei.health.suggestion.ui.fitness.module;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.util.StaticHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes9.dex */
public class TimeProgressPlus extends RelativeLayout {
    private static final String e = "Suggestion_TimeProgressPlus";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f9414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f9415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f9416c;
    private HealthTextView d;
    private TimeProgress f;
    private OnTimeCountFinishListener i;
    private HealthTextView j;

    public interface OnTimeCountFinishListener {
        void onTimeCountFinished();

        void setCountDownResidueSec(int i);
    }

    static /* synthetic */ float e(TimeProgressPlus timeProgressPlus) {
        float f = timeProgressPlus.f9414a;
        timeProgressPlus.f9414a = f - 1.0f;
        return f;
    }

    static class c extends StaticHandler<TimeProgressPlus> {
        c(TimeProgressPlus timeProgressPlus) {
            super(timeProgressPlus);
        }

        @Override // com.huawei.health.suggestion.util.StaticHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessage(TimeProgressPlus timeProgressPlus, Message message) {
            if (timeProgressPlus == null) {
                LogUtil.j(TimeProgressPlus.e, "handleMessage TimeProgressPlus is null");
                return;
            }
            TimeProgressPlus.e(timeProgressPlus);
            timeProgressPlus.setAutoProgress((int) timeProgressPlus.f9414a);
            if (timeProgressPlus.f9414a >= 0.0f) {
                timeProgressPlus.i.setCountDownResidueSec((int) timeProgressPlus.f9414a);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            timeProgressPlus.f9414a = -1.0f;
            if (timeProgressPlus.i != null) {
                timeProgressPlus.i.setCountDownResidueSec(0);
                timeProgressPlus.i.onTimeCountFinished();
            }
        }
    }

    public TimeProgressPlus(Context context) {
        super(context);
        this.f9414a = -1.0f;
        this.f9415b = new c(this);
    }

    public TimeProgressPlus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9414a = -1.0f;
        this.f9415b = new c(this);
    }

    public TimeProgressPlus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9414a = -1.0f;
        this.f9415b = new c(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        setGravity(17);
        layoutInflaterFrom.inflate(R.layout.sug_coach_time_progress, this);
        e();
    }

    private void e() {
        this.d = (HealthTextView) findViewById(R.id.sug_coach_fg_);
        this.f = (TimeProgress) findViewById(R.id.sug_round_tp);
        this.f9416c = (HealthTextView) findViewById(R.id.sug_coach_motionc);
        this.j = (HealthTextView) findViewById(R.id.sug_coach_motion_totle);
    }

    private void f() {
        if (this.d.getVisibility() == 0) {
            this.d.setVisibility(8);
            this.j.setVisibility(8);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void a(OnTimeCountFinishListener onTimeCountFinishListener) {
        this.i = onTimeCountFinishListener;
    }

    public TimeProgressPlus d(int i) {
        this.f.setVisibility(8);
        f();
        float f = i;
        this.f9414a = f;
        this.f9416c.setText(UnitUtil.e(i, 1, 0));
        this.f.e(f);
        this.f.a(f);
        this.f9415b.sendEmptyMessageDelayed(1, 1000L);
        e(1.0f);
        return this;
    }

    public void setAutoProgress(int i) {
        e(1.0f);
        this.f.setVisibility(8);
        float f = i;
        this.f9414a = f;
        this.f.a(f);
        this.f9416c.setText(UnitUtil.e(i, 1, 0));
    }

    public TimeProgressPlus c() {
        this.f9415b.removeMessages(1);
        return this;
    }

    public TimeProgressPlus d() {
        this.f9415b.removeMessages(1);
        return this;
    }

    public TimeProgressPlus b() {
        this.f9415b.sendEmptyMessageDelayed(1, 1000L);
        return this;
    }

    private void e(float f) {
        this.f9416c.setTextSize(1, 18.0f * f);
        this.j.setTextSize(1, f * 13.0f);
    }
}
