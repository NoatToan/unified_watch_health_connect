package com.huami.sleepassistant.lib.widget.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.huami.sleepassistant.lib.R;

/* JADX INFO: loaded from: classes13.dex */
public class HMCircleImageView extends CircleImageView {
    private int B;
    private int C;
    private boolean D;
    private Paint E;
    private boolean F;

    public HMCircleImageView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void dispatchSetPressed(boolean pressed) {
        super.dispatchSetPressed(pressed);
        if (this.D) {
            this.F = pressed;
            invalidate();
        } else if (pressed) {
            setBorderColor(this.C);
        } else {
            setBorderColor(this.B);
        }
    }

    @Override // com.huami.sleepassistant.lib.widget.circleimageview.CircleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.D && this.F) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, this.E);
        }
    }

    public HMCircleImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HMCircleImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.F = false;
        this.B = getBorderColor();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.Sls_HMCircleImageView, defStyle, 0);
        this.C = typedArrayObtainStyledAttributes.getColor(R.styleable.Sls_HMCircleImageView_sls_hm_civ_border_color_touch, this.B);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.Sls_HMCircleImageView_sls_hm_civ_mask_color, ContextCompat.getColor(context, R.color.black30));
        this.D = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Sls_HMCircleImageView_sls_hm_civ_show_mask, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.D) {
            Paint paint = new Paint(1);
            this.E = paint;
            paint.setColor(color);
        }
    }
}
