package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import com.huami.watch.companionlib.R;
import com.huami.watch.util.DensityUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HeartrateProgressItem extends RelativeLayout {
    private String a;
    private int b;
    private int c;
    private int d;
    private TextView e;
    private ProgressBar f;
    private TextView g;
    private TextView h;
    private TextView i;

    public static class ProgressBar extends View {
        private static final String j = "ProgressBar";
        private int a;
        private int b;
        private float c;
        private Paint d;
        private Paint e;
        private float f;
        private float g;
        private int h;
        private int i;

        public ProgressBar(Context context) {
            this(context, null);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.d.setColor(this.h);
            this.e.setColor(this.i);
            float paddingLeft = ((this.a - getPaddingLeft()) - getPaddingRight()) - this.c;
            float paddingLeft2 = getPaddingLeft();
            float paddingLeft3 = getPaddingLeft() + ((this.g * paddingLeft) / 100.0f);
            float paddingLeft4 = paddingLeft + getPaddingLeft();
            float paddingTop = getPaddingTop();
            canvas.drawRect(paddingLeft2, paddingTop, paddingLeft4, paddingTop + (this.c * 2.0f), this.d);
            float f = this.c;
            canvas.drawCircle(paddingLeft4, paddingTop + f, f, this.d);
            if (this.g == 0.0f) {
                canvas.drawRect(paddingLeft2, paddingTop, getPaddingLeft() + this.f, paddingTop + (this.c * 2.0f), this.e);
                return;
            }
            canvas.drawRect(paddingLeft2, paddingTop, paddingLeft3, paddingTop + (this.c * 2.0f), this.e);
            float f2 = this.c;
            canvas.drawCircle(paddingLeft3, paddingTop + f2, f2, this.e);
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.b = getMeasuredHeight();
            this.a = getMeasuredWidth();
            this.c = ((this.b - getPaddingBottom()) - getPaddingTop()) / 2;
        }

        public void setBgColor(int i) {
            this.h = i;
            invalidate();
        }

        public void setProgress(float f) {
            if (f > 100.0f) {
                f = 100.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.g = f;
            invalidate();
        }

        public void setProgressColor(int i) {
            this.i = i;
            invalidate();
        }

        public ProgressBar(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            this.b = 0;
            this.c = 0.0f;
            this.f = DensityUtil.dpToPx(getContext(), 1.5f);
            this.g = 50.0f;
            this.h = InputDeviceCompat.SOURCE_ANY;
            this.i = -16776961;
            this.d = new Paint(1);
            this.e = new Paint(1);
        }
    }

    public HeartrateProgressItem(Context context) {
        this(context, null);
    }

    private void a() {
        this.e.setText(TextUtils.isEmpty(this.a) ? "" : this.a);
        this.g.setText(this.b + "%");
        this.f.setProgress((float) this.b);
        this.f.setBgColor(this.d);
        this.f.setProgressColor(this.c);
    }

    private void b(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HeartrateProgressItem);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R.styleable.HeartrateProgressItem_piv_Name) {
                this.a = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R.styleable.HeartrateProgressItem_piv_ForeColor) {
                this.c = typedArrayObtainStyledAttributes.getColor(index, -16776961);
            } else if (index == R.styleable.HeartrateProgressItem_piv_BackColor) {
                this.d = typedArrayObtainStyledAttributes.getColor(index, this.d);
            } else if (index == R.styleable.HeartrateProgressItem_piv_Progress) {
                this.b = typedArrayObtainStyledAttributes.getInt(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.view_hr_progress_item, (ViewGroup) this, true);
        this.e = (TextView) findViewById(R.id.progress_layout_name);
        this.f = (ProgressBar) findViewById(R.id.progress_layout_progress);
        this.g = (TextView) findViewById(R.id.progress_layout_desc);
        this.h = (TextView) findViewById(R.id.time);
        this.i = (TextView) findViewById(R.id.region_value);
        a();
    }

    public void setName(String str) {
        this.e.setText(str);
    }

    public void setProgress(int i) {
        this.g.setText(i + "%");
        this.f.setProgress((float) i);
    }

    public void setProgressAndName(int i, String str) {
        this.e.setText(str);
        setProgress(i);
    }

    public void setProgressColor(int i) {
        this.c = i;
        this.f.setProgressColor(i);
    }

    public void setRegionText(String str) {
        this.i.setText(str);
        this.i.setVisibility(0);
    }

    public void setTimeText(String str) {
        this.h.setText(str);
        this.h.setVisibility(0);
    }

    public HeartrateProgressItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeartrateProgressItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = Color.parseColor("#F4F5F7");
        b(context, attributeSet);
    }
}
