package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {
    public float d;
    public float e;
    public Path f;
    public ViewOutlineProvider g;
    public RectF h;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionButton.this.d) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.e);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.d = 0.0f;
        this.e = Float.NaN;
        c(context, null);
    }

    private void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.J5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.T5) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == u4j.U5) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.e;
    }

    public float getRoundPercent() {
        return this.d;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.e = f;
            float f2 = this.d;
            this.d = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.e != f;
        this.e = f;
        if (f != 0.0f) {
            if (this.f == null) {
                this.f = new Path();
            }
            if (this.h == null) {
                this.h = new RectF();
            }
            if (this.g == null) {
                b bVar = new b();
                this.g = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f.reset();
            Path path = this.f;
            RectF rectF = this.h;
            float f3 = this.e;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = this.d != f;
        this.d = f;
        if (f != 0.0f) {
            if (this.f == null) {
                this.f = new Path();
            }
            if (this.h == null) {
                this.h = new RectF();
            }
            if (this.g == null) {
                a aVar = new a();
                this.g = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.d) / 2.0f;
            this.h.set(0.0f, 0.0f, width, height);
            this.f.reset();
            this.f.addRoundRect(this.h, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0.0f;
        this.e = Float.NaN;
        c(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0.0f;
        this.e = Float.NaN;
        c(context, attributeSet);
    }
}
