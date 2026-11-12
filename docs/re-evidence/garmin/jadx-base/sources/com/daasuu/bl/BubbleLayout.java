package com.daasuu.bl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ch.qos.logback.core.net.SyslogConstants;
import uj.b;
import uj.c;

/* JADX INFO: loaded from: classes7.dex */
public class BubbleLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uj.a f28579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f28580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f28582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f28583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f28584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f28586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28587i;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28588a;

        static {
            int[] iArr = new int[uj.a.values().length];
            f28588a = iArr;
            try {
                iArr[uj.a.LEFT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28588a[uj.a.RIGHT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28588a[uj.a.TOP_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28588a[uj.a.BOTTOM_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28588a[uj.a.TOP_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28588a[uj.a.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28588a[uj.a.LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28588a[uj.a.RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28588a[uj.a.TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28588a[uj.a.BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f171464a);
        this.f28581c = typedArrayObtainStyledAttributes.getDimension(3, (context.getResources().getDisplayMetrics().densityDpi / SyslogConstants.LOG_LOCAL4) * 8.0f);
        this.f28583e = typedArrayObtainStyledAttributes.getDimension(1, 8.0f * (context.getResources().getDisplayMetrics().densityDpi / SyslogConstants.LOG_LOCAL4));
        this.f28582d = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f28584f = typedArrayObtainStyledAttributes.getDimension(2, 12.0f * (context.getResources().getDisplayMetrics().densityDpi / SyslogConstants.LOG_LOCAL4));
        this.f28585g = typedArrayObtainStyledAttributes.getColor(4, -1);
        this.f28586h = typedArrayObtainStyledAttributes.getDimension(7, -1.0f);
        this.f28587i = typedArrayObtainStyledAttributes.getColor(6, -7829368);
        int i15 = typedArrayObtainStyledAttributes.getInt(0, uj.a.LEFT.f171452a);
        for (uj.a aVar : uj.a.values()) {
            if (i15 == aVar.f171452a) {
                this.f28579a = aVar;
                typedArrayObtainStyledAttributes.recycle();
                a();
            }
        }
        aVar = uj.a.LEFT;
        this.f28579a = aVar;
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i14 = a.f28588a[this.f28579a.ordinal()];
        float f14 = this.f28581c;
        float f15 = this.f28583e;
        switch (i14) {
            case 1:
            case 7:
                paddingLeft = (int) (paddingLeft + f14);
                break;
            case 2:
            case 8:
                paddingRight = (int) (paddingRight + f14);
                break;
            case 3:
            case 5:
            case 9:
                paddingTop = (int) (paddingTop + f15);
                break;
            case 4:
            case 6:
            case 10:
                paddingBottom = (int) (paddingBottom + f15);
                break;
        }
        float f16 = this.f28586h;
        if (f16 > 0.0f) {
            paddingLeft = (int) (paddingLeft + f16);
            paddingRight = (int) (paddingRight + f16);
            paddingTop = (int) (paddingTop + f16);
            paddingBottom = (int) (paddingBottom + f16);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public final void b() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i14 = a.f28588a[this.f28579a.ordinal()];
        float f14 = this.f28581c;
        float f15 = this.f28583e;
        switch (i14) {
            case 1:
            case 7:
                paddingLeft = (int) (paddingLeft - f14);
                break;
            case 2:
            case 8:
                paddingRight = (int) (paddingRight - f14);
                break;
            case 3:
            case 5:
            case 9:
                paddingTop = (int) (paddingTop - f15);
                break;
            case 4:
            case 6:
            case 10:
                paddingBottom = (int) (paddingBottom - f15);
                break;
        }
        float f16 = this.f28586h;
        if (f16 > 0.0f) {
            paddingLeft = (int) (paddingLeft - f16);
            paddingRight = (int) (paddingRight - f16);
            paddingTop = (int) (paddingTop - f16);
            paddingBottom = (int) (paddingBottom - f16);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b bVar = this.f28580b;
        if (bVar != null) {
            bVar.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public uj.a getArrowDirection() {
        return this.f28579a;
    }

    public float getArrowHeight() {
        return this.f28583e;
    }

    public float getArrowPosition() {
        return this.f28584f;
    }

    public float getArrowWidth() {
        return this.f28581c;
    }

    public int getBubbleColor() {
        return this.f28585g;
    }

    public float getCornersRadius() {
        return this.f28582d;
    }

    public int getStrokeColor() {
        return this.f28587i;
    }

    public float getStrokeWidth() {
        return this.f28586h;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        int width = getWidth();
        int height = getHeight();
        if (width < 0 || height < 0) {
            return;
        }
        float f14 = 0;
        float f15 = width;
        RectF rectF = new RectF(f14, f14, f15, height);
        float f16 = this.f28584f;
        int i18 = a.f28588a[this.f28579a.ordinal()];
        float f17 = this.f28581c;
        switch (i18) {
            case 1:
            case 2:
                f16 = (height / 2.0f) - (this.f28583e / 2.0f);
                break;
            case 3:
            case 4:
                f16 = (width / 2.0f) - (f17 / 2.0f);
                break;
            case 5:
            case 6:
                f16 = (f15 - this.f28584f) - (f17 / 2.0f);
                break;
        }
        this.f28580b = new b(rectF, this.f28581c, this.f28582d, this.f28583e, f16, this.f28586h, this.f28587i, this.f28585g, this.f28579a);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleLayout(Context context) {
        this(context, null, 0);
    }
}
