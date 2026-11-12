package com.huawei.health.suggestion.ui.fitness.module;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.pluginfitnessadvice.VideoSegment;
import com.huawei.ui.commonui.R;
import defpackage.njy;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class LongMediaProgress extends AppCompatSeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f9390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Motion> f9392c;
    private boolean d;
    private int e;
    private float g;
    private List<VideoSegment> i;

    public LongMediaProgress(Context context) {
        this(context, null);
    }

    public LongMediaProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LongMediaProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9392c = new ArrayList(16);
        this.i = new ArrayList(16);
        this.e = 3;
        this.d = false;
        c();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.e = qrs.d(getContext(), this.e);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9391b = i;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar
    public void setMax(int i) {
        super.setMax(i);
        invalidate();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setTouchable(boolean z) {
        this.d = z;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (VideoSegment videoSegment : this.i) {
            if (videoSegment != null) {
                float startTime = (this.f9391b / this.g) * videoSegment.getStartTime();
                if (startTime != 0.0f) {
                    float f = this.e / 2.0f;
                    canvas.drawCircle(startTime, f, f, this.f9390a);
                }
            }
        }
    }

    public void setMotions(List<Motion> list) {
        if (list == null) {
            return;
        }
        this.g = 0.0f;
        this.f9392c.clear();
        this.i.clear();
        this.f9392c.addAll(list);
        for (Motion motion : list) {
            if (motion != null && motion.getVideoSegments() != null && !njy.e(motion.getVideoSegments(), 0)) {
                VideoSegment videoSegment = motion.getVideoSegments().get(0);
                this.g += videoSegment.getDuration() * 1000;
                this.i.add(videoSegment);
            }
        }
        invalidate();
    }

    public void setTotalTime(float f) {
        this.g = f;
        invalidate();
    }

    private void c() {
        if (this.f9390a == null) {
            this.f9390a = new Paint();
        }
        this.f9390a.setAntiAlias(true);
        this.f9390a.setColor(BaseApplication.getContext().getResources().getColor(R.color.common_white_50alpha));
    }
}
