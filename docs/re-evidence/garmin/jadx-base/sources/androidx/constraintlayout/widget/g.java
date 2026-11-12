package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.classic.spi.CallerData;

/* JADX INFO: loaded from: classes.dex */
public class g extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f6307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6308c;

    public g(Context context) {
        super(context);
        this.f6306a = -1;
        this.f6307b = null;
        this.f6308c = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f6308c);
        this.f6306a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f6311c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 0) {
                    this.f6306a = typedArrayObtainStyledAttributes.getResourceId(index, this.f6306a);
                } else if (index == 1) {
                    this.f6308c = typedArrayObtainStyledAttributes.getInt(index, this.f6308c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f6307b;
    }

    public int getEmptyVisibility() {
        return this.f6308c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(CallerData.NA, 0, 1, rect);
            canvas.drawText(CallerData.NA, ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i14) {
        View viewFindViewById;
        if (this.f6306a == i14) {
            return;
        }
        View view2 = this.f6307b;
        if (view2 != null) {
            view2.setVisibility(0);
            ((ConstraintLayout.b) this.f6307b.getLayoutParams()).f6107f0 = false;
            this.f6307b = null;
        }
        this.f6306a = i14;
        if (i14 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i14)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i14) {
        this.f6308c = i14;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6306a = -1;
        this.f6307b = null;
        this.f6308c = 4;
        a(attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f6306a = -1;
        this.f6307b = null;
        this.f6308c = 4;
        a(attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14);
        this.f6306a = -1;
        this.f6307b = null;
        this.f6308c = 4;
        a(attributeSet);
    }
}
