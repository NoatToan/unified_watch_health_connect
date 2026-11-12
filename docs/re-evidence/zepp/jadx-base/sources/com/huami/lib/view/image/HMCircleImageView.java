package com.huami.lib.view.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.R;

/* JADX INFO: loaded from: classes10.dex */
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
    public void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(z);
        if (this.D) {
            this.F = z;
            invalidate();
        } else if (z) {
            setBorderColor(this.C);
        } else {
            setBorderColor(this.B);
        }
    }

    @Override // com.huami.lib.view.image.CircleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.D && this.F) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, this.E);
        }
    }

    public HMCircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HMCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = false;
        this.B = getBorderColor();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HMCircleImageView, i, 0);
        this.C = typedArrayObtainStyledAttributes.getColor(R.styleable.HMCircleImageView_hm_civ_border_color_touch, this.B);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.HMCircleImageView_hm_civ_mask_color, ContextCompat.getColor(context, R.color.black30));
        this.D = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HMCircleImageView_hm_civ_show_mask, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.D) {
            Paint paint = new Paint(1);
            this.E = paint;
            paint.setColor(color);
        }
    }
}
