package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f1983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f1984b;
    public Paint c;
    public boolean d;
    public boolean e;
    public String f;
    public Rect g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1985k;

    public MockView(Context context) {
        super(context);
        this.f1983a = new Paint();
        this.f1984b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.g = new Rect();
        this.h = Color.argb(255, 0, 0, 0);
        this.i = Color.argb(255, 200, 200, 200);
        this.j = Color.argb(255, 50, 50, 50);
        this.f1985k = 4;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.a9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.c9) {
                    this.f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == u4j.f9) {
                    this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                } else if (index == u4j.b9) {
                    this.h = typedArrayObtainStyledAttributes.getColor(index, this.h);
                } else if (index == u4j.d9) {
                    this.j = typedArrayObtainStyledAttributes.getColor(index, this.j);
                } else if (index == u4j.e9) {
                    this.i = typedArrayObtainStyledAttributes.getColor(index, this.i);
                } else if (index == u4j.g9) {
                    this.e = typedArrayObtainStyledAttributes.getBoolean(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f == null) {
            try {
                this.f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f1983a.setColor(this.h);
        this.f1983a.setAntiAlias(true);
        this.f1984b.setColor(this.i);
        this.f1984b.setAntiAlias(true);
        this.c.setColor(this.j);
        this.f1985k = Math.round(this.f1985k * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.d) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f1983a);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f1983a);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f1983a);
            canvas.drawLine(f, 0.0f, f, f2, this.f1983a);
            canvas.drawLine(f, f2, 0.0f, f2, this.f1983a);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f1983a);
        }
        String str = this.f;
        if (str == null || !this.e) {
            return;
        }
        this.f1984b.getTextBounds(str, 0, str.length(), this.g);
        float fWidth = (width - this.g.width()) / 2.0f;
        float fHeight = ((height - this.g.height()) / 2.0f) + this.g.height();
        this.g.offset((int) fWidth, (int) fHeight);
        Rect rect = this.g;
        int i = rect.left;
        int i2 = this.f1985k;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(this.g, this.c);
        canvas.drawText(this.f, fWidth, fHeight, this.f1984b);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1983a = new Paint();
        this.f1984b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.g = new Rect();
        this.h = Color.argb(255, 0, 0, 0);
        this.i = Color.argb(255, 200, 200, 200);
        this.j = Color.argb(255, 50, 50, 50);
        this.f1985k = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1983a = new Paint();
        this.f1984b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.g = new Rect();
        this.h = Color.argb(255, 0, 0, 0);
        this.i = Color.argb(255, 200, 200, 200);
        this.j = Color.argb(255, 50, 50, 50);
        this.f1985k = 4;
        a(context, attributeSet);
    }
}
