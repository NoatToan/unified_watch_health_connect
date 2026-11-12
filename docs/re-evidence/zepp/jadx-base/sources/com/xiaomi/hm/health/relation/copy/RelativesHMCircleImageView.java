package com.xiaomi.hm.health.relation.copy;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.xiaomi.hm.health.relation.R;

/* JADX INFO: loaded from: classes21.dex */
public class RelativesHMCircleImageView extends RelativesCircleImageView {
    private int B;
    private int C;
    private boolean D;
    private Paint E;
    private boolean F;

    public RelativesHMCircleImageView(Context context) {
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

    @Override // com.xiaomi.hm.health.relation.copy.RelativesCircleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.D && this.F) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, this.E);
        }
    }

    public RelativesHMCircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RelativesHMCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = false;
        this.B = getBorderColor();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RelativesHMCircleImageView, i, 0);
        this.C = typedArrayObtainStyledAttributes.getColor(R.styleable.RelativesHMCircleImageView_relatives_hm_civ_border_color_touch, this.B);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.RelativesHMCircleImageView_relatives_hm_civ_mask_color, ContextCompat.getColor(context, R.color.relatives_black30));
        this.D = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RelativesHMCircleImageView_relatives_hm_civ_show_mask, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.D) {
            Paint paint = new Paint(1);
            this.E = paint;
            paint.setColor(color);
        }
    }
}
