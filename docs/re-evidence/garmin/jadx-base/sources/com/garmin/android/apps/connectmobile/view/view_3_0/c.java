package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes10.dex */
public class c extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f47867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f47869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f47872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.view.view_3_0.a.c f47873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f47874i;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        float f14 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
        int i14 = typedValue.data;
        int iArgb = Color.argb(127, Color.red(i14), Color.green(i14), Color.blue(i14));
        this.f47870e = iArgb;
        a aVar = new a(0);
        this.f47874i = aVar;
        aVar.f47875a = new int[]{-13388315};
        int i15 = (int) (f14 * 2.0f);
        this.f47866a = i15;
        Paint paint = new Paint();
        this.f47867b = paint;
        paint.setColor(iArgb);
        this.f47868c = i15;
        this.f47869d = new Paint();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getHeight();
        int childCount = getChildCount();
        Object obj = this.f47873h;
        if (obj == null) {
            obj = this.f47874i;
        }
        float f14 = height;
        canvas.drawRect(0.0f, height - this.f47866a, getWidth(), f14, this.f47867b);
        if (childCount > 0) {
            View childAt = getChildAt(this.f47871f);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int i14 = this.f47871f;
            a aVar = (a) obj;
            int[] iArr = aVar.f47875a;
            int iRgb = iArr[i14 % iArr.length];
            if (this.f47872g > 0.0f && i14 < getChildCount() - 1) {
                int i15 = this.f47871f + 1;
                int[] iArr2 = aVar.f47875a;
                int i16 = iArr2[i15 % iArr2.length];
                if (iRgb != i16) {
                    float f15 = this.f47872g;
                    float f16 = 1.0f - f15;
                    iRgb = Color.rgb((int) ((Color.red(iRgb) * f16) + (Color.red(i16) * f15)), (int) ((Color.green(iRgb) * f16) + (Color.green(i16) * f15)), (int) ((Color.blue(iRgb) * f16) + (Color.blue(i16) * f15)));
                }
                View childAt2 = getChildAt(this.f47871f + 1);
                float left2 = this.f47872g * childAt2.getLeft();
                float f17 = this.f47872g;
                left = (int) (((1.0f - f17) * left) + left2);
                right = (int) (((1.0f - this.f47872g) * right) + (f17 * childAt2.getRight()));
            }
            Paint paint = this.f47869d;
            paint.setColor(iRgb);
            canvas.drawRect(left, height - this.f47868c, right, f14, paint);
        }
    }

    public static class a implements com.garmin.android.apps.connectmobile.view.view_3_0.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f47875a;

        public /* synthetic */ a(int i14) {
            this();
        }

        private a() {
        }
    }

    public c(Context context) {
        this(context, null);
    }
}
