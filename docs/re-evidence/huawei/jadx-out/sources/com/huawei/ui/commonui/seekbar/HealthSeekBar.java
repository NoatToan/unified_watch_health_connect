package com.huawei.ui.commonui.seekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.phone.hwseekbar.widget.HwSeekBar;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthSeekBar extends HwSeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Float> f23886c;
    private float d;
    private Paint e;
    private OnSeekBarChangeListener f;
    private com.huawei.uikit.hwseekbar.widget.HwSeekBar.OnSeekBarChangeListener h;
    private int j;

    public interface OnSeekBarChangeListener {
        void onProgressChanged(HealthSeekBar healthSeekBar, int i, boolean z);

        void onStartTrackingTouch(HealthSeekBar healthSeekBar);

        void onStopTrackingTouch(HealthSeekBar healthSeekBar);
    }

    public HealthSeekBar(Context context) {
        this(context, null);
    }

    public HealthSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HealthSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23884a = false;
        this.f23886c = new ArrayList();
        this.e = new Paint();
        this.h = new com.huawei.uikit.hwseekbar.widget.HwSeekBar.OnSeekBarChangeListener() { // from class: com.huawei.ui.commonui.seekbar.HealthSeekBar.5
            @Override // com.huawei.uikit.hwseekbar.widget.HwSeekBar.OnSeekBarChangeListener
            public void onProgressChanged(com.huawei.uikit.hwseekbar.widget.HwSeekBar hwSeekBar, int i2, boolean z) {
                if (HealthSeekBar.this.f != null) {
                    HealthSeekBar.this.f.onProgressChanged(HealthSeekBar.this, i2, z);
                }
            }

            @Override // com.huawei.uikit.hwseekbar.widget.HwSeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(com.huawei.uikit.hwseekbar.widget.HwSeekBar hwSeekBar) {
                if (HealthSeekBar.this.f != null) {
                    HealthSeekBar.this.f.onStartTrackingTouch(HealthSeekBar.this);
                }
            }

            @Override // com.huawei.uikit.hwseekbar.widget.HwSeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(com.huawei.uikit.hwseekbar.widget.HwSeekBar hwSeekBar) {
                if (HealthSeekBar.this.f != null) {
                    HealthSeekBar.this.f.onStopTrackingTouch(HealthSeekBar.this);
                }
            }
        };
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            LogUtil.j("CommonUI_HealthSeekBar", "initAttributes, the input parameter is incorrect.");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthSeekBar);
        this.d = typedArrayObtainStyledAttributes.getDimension(R.styleable.HealthSeekBar_seekBarNodeRadius, 0.0f);
        this.e.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.HealthSeekBar_seekBarNodeColor, 0));
        typedArrayObtainStyledAttributes.recycle();
        this.e.setAntiAlias(true);
    }

    @Override // com.huawei.uikit.hwseekbar.widget.HwSeekBar, android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23884a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setTouchable(boolean z) {
        this.f23884a = z;
    }

    @Override // com.huawei.uikit.hwseekbar.widget.HwSeekBar
    public void setTip(boolean z, int i, boolean z2) {
        super.setTip(z, i, z2);
    }

    @Override // com.huawei.uikit.hwseekbar.widget.HwSeekBar
    public void setTipText(String str) {
        super.setTipText(str);
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(this.h);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j = (i - getPaddingStart()) - getPaddingEnd();
        this.f23885b = i2;
    }

    @Override // com.huawei.uikit.hwseekbar.widget.HwSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (njy.e(this.f23886c) || this.f23886c.size() < 2) {
            return;
        }
        for (Float f : this.f23886c) {
            if (f.floatValue() != 0.0f) {
                canvas.drawCircle((this.j * f.floatValue()) + getPaddingStart(), (((this.f23885b - getPaddingBottom()) - getPaddingTop()) / 2) + getPaddingTop(), this.d, this.e);
            }
        }
    }

    public void setNodeList(List<Float> list) {
        if (njy.e(list)) {
            LogUtil.j("CommonUI_HealthSeekBar", "setMotions nodePercentageList is empty.");
            return;
        }
        this.f23886c.clear();
        this.f23886c = list;
        invalidate();
    }
}
