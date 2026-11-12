package com.huami.moving.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes5.dex */
public class LinearGradientView extends View {
    private boolean a;
    private int[] b;

    public LinearGradientView(Context context) {
        super(context);
        this.a = false;
    }

    private void a() {
        Resources resources = getResources();
        int i = R.color.color_black66;
        this.b = new int[]{resources.getColor(i), 0, 0, getResources().getColor(i)};
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        Paint paint = new Paint();
        float f = height;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, this.b, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, width, f, paint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setColor(int[] iArr) {
        this.b = iArr;
        invalidate();
    }

    public void setIsTouch(boolean z) {
        this.a = z;
    }

    public LinearGradientView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
    }

    public LinearGradientView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        a();
    }
}
