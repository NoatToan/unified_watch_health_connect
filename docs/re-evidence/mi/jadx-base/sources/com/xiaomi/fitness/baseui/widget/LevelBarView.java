package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.doq;
import defpackage.ez5;
import defpackage.gki;
import defpackage.jrk;
import defpackage.k47;
import defpackage.loi;
import defpackage.ni4;
import defpackage.z4j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class LevelBarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f11679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f11680b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public List<LevelItem> g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11681k;
    public int l;
    public int m;
    public boolean n;
    public final Rect o;
    public final Rect p;
    public final Rect q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11682r;

    public LevelBarView(Context context) {
        super(context);
        this.g = new ArrayList();
        this.h = 4;
        this.i = 0;
        this.j = 10;
        this.n = false;
        this.o = new Rect(0, 0, 0, 0);
        this.p = new Rect(0, 0, 0, 0);
        this.q = new Rect(0, 0, 0, 0);
        e(context, null);
    }

    public Drawable a(int i, int i2) {
        try {
            Drawable drawableB = doq.b(getResources(), i, null);
            Drawable.ConstantState constantState = drawableB.getConstantState();
            Drawable drawableMutate = k47.r(constantState == null ? drawableB : constantState.newDrawable()).mutate();
            drawableMutate.setBounds(0, 0, drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight());
            k47.n(drawableMutate, ni4.c(getContext(), i2));
            return drawableMutate;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void b(Canvas canvas) {
        LevelItem levelItem = this.g.get(this.i);
        Drawable drawableA = a(loi.d, levelItem.f11683a);
        if (drawableA == null) {
            drawableA = jrk.f(getResources(), loi.e, null);
        }
        if (drawableA != null) {
            k47.n(drawableA, getContext().getResources().getColor(levelItem.f11683a));
        }
        Rect rect = this.q;
        int i = this.i + 1;
        int i2 = this.c;
        int i3 = this.h;
        rect.left = ((((i * (i2 + i3)) - (i2 / 2)) - i3) - (this.f11681k / 2)) + getPaddingStart();
        this.q.top = getPaddingTop();
        Rect rect2 = this.q;
        rect2.right = rect2.left + this.f11681k;
        rect2.bottom = getPaddingTop() + this.f11681k;
        drawableA.setBounds(this.q);
        drawableA.draw(canvas);
    }

    public final void c(Canvas canvas) {
        Drawable drawable = getResources().getDrawable(loi.f25270a);
        if (drawable == null) {
            drawable = jrk.f(getResources(), loi.e, null);
        }
        Rect rect = this.q;
        int i = this.i + 1;
        int i2 = this.c;
        int i3 = this.h;
        rect.left = ((((i * (i2 + i3)) - (i2 / 2)) - i3) - (this.f11681k / 2)) + getPaddingStart();
        this.q.top = getPaddingTop() + DisplayUtil.dip2px(4.0f);
        Rect rect2 = this.q;
        rect2.right = rect2.left + this.f11681k;
        int iDip2px = DisplayUtil.dip2px(12.0f);
        this.q.bottom = getPaddingTop() + DisplayUtil.dip2px(4.0f) + iDip2px;
        drawable.setBounds(this.q);
        drawable.draw(canvas);
    }

    public final void d(Canvas canvas) {
        int i;
        int i2;
        int i3 = 0;
        while (i3 < this.g.size()) {
            LevelItem levelItem = this.g.get(i3);
            this.o.left += i3 == 0 ? getPaddingStart() : this.c + this.h;
            this.o.top = getPaddingTop() + this.f11681k;
            Rect rect = this.o;
            rect.right = rect.left + this.c;
            rect.bottom = getPaddingTop() + this.d + this.f11681k;
            int color = getContext().getResources().getColor(levelItem.f11683a);
            if (i3 == 0) {
                Drawable drawable = getResources().getDrawable(loi.f25273r);
                if ((drawable instanceof GradientDrawable) && (i2 = this.e) > 0) {
                    float f = i2;
                    float f2 = i2;
                    ((GradientDrawable) drawable).setCornerRadii(new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2});
                }
                k47.n(drawable, color);
                drawable.setBounds(this.o);
                drawable.draw(canvas);
            } else if (i3 == this.g.size() - 1) {
                Drawable drawable2 = getResources().getDrawable(loi.q);
                if ((drawable2 instanceof GradientDrawable) && (i = this.e) > 0) {
                    float f3 = i;
                    float f4 = i;
                    ((GradientDrawable) drawable2).setCornerRadii(new float[]{0.0f, 0.0f, f3, f3, f4, f4, 0.0f, 0.0f});
                }
                k47.n(drawable2, color);
                drawable2.setBounds(this.o);
                drawable2.draw(canvas);
            } else {
                this.f11679a.setColor(color);
                canvas.drawRect(this.o, this.f11679a);
            }
            if (!TextUtils.isEmpty(levelItem.d)) {
                String str = levelItem.d;
                Rect rect2 = this.o;
                canvas.drawText(str, rect2.right, rect2.bottom + DisplayUtil.dip2px(21.6f), this.f11680b);
            }
            i3++;
        }
    }

    public final void e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.v1);
            this.m = typedArrayObtainStyledAttributes.getResourceId(z4j.z1, 0);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(z4j.x1, ez5.a(20));
            this.f = typedArrayObtainStyledAttributes.getBoolean(z4j.w1, false);
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(z4j.y1, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.d <= 0) {
            this.d = ez5.a(20);
        }
        this.f11681k = ez5.a(12);
        this.l = ez5.a(6);
        this.f11682r = this.d + this.f11681k + ez5.a(11) + (this.l * 2) + getPaddingTop() + getPaddingBottom();
    }

    public final void f() {
        this.o.left = 0;
        this.q.left = 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        f();
        List<LevelItem> list = this.g;
        if (list == null || list.isEmpty()) {
            return;
        }
        d(canvas);
        if (this.n) {
            b(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = this.f11682r;
        if (measuredHeight < i3) {
            setMeasuredDimension(measuredWidth, View.resolveSize(i3, i2));
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11679a = new Paint(1);
        Paint paint = new Paint(1);
        this.f11680b = paint;
        paint.setTextSize(ez5.a(12));
        this.f11680b.setColor(getContext().getResources().getColor(gki.q));
        this.f11680b.setTextAlign(Paint.Align.CENTER);
        List<LevelItem> list = this.g;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.c = (getWidth() / this.g.size()) - this.h;
    }

    public void setDownArrowTintItemColor(boolean z) {
        this.n = z;
    }

    public void setItemDividerWidth(int i) {
        if (i <= 0 || i >= 100) {
            throw new IllegalArgumentException("divider is too large");
        }
        this.h = i;
    }

    public void setLevel(int i) {
        if (i < 0) {
            i = 0;
        }
        int size = this.g.size() - 1;
        if (AppUtil.isRTLDirection() && this.f) {
            int i2 = size - i;
            int i3 = i2 > 0 ? i2 : 0;
            this.i = i3;
            this.i = Math.min(size, i3);
        } else {
            this.i = i;
        }
        invalidate();
    }

    public void setLevels(List<LevelItem> list) {
        if (list == null) {
            throw new IllegalArgumentException("error params");
        }
        this.g.clear();
        if (AppUtil.isRTLDirection() && this.f) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.g.add(list.get(size));
            }
        } else {
            this.g.addAll(list);
        }
        if (this.g.isEmpty()) {
            return;
        }
        this.c = (getWidth() / this.g.size()) - this.h;
    }

    public void setTextVisible(boolean z) {
        int iA = this.d + this.f11681k + ez5.a(11) + getPaddingTop() + getPaddingBottom();
        this.f11682r = iA;
        if (z) {
            this.f11682r = iA + (this.l * 2);
        }
    }

    public static class LevelItem implements Parcelable {
        public static final Parcelable.Creator<LevelItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11684b;
        public int c;
        public String d;
        public int e;
        public boolean f;

        public class a implements Parcelable.Creator<LevelItem> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LevelItem createFromParcel(Parcel parcel) {
                return new LevelItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LevelItem[] newArray(int i) {
                return new LevelItem[i];
            }
        }

        public LevelItem(int i) {
            this.f11684b = gki.q;
            this.f11683a = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11683a);
            parcel.writeInt(this.c);
            parcel.writeInt(this.f11684b);
            parcel.writeString(this.d);
        }

        public LevelItem(int i, int i2) {
            int i3 = gki.q;
            this.f11683a = i;
            this.c = i2;
            this.f11684b = i3;
        }

        public LevelItem(int i, int i2, int i3) {
            this.f11683a = i;
            this.f11684b = i2;
            this.c = i3;
        }

        public LevelItem(int i, int i2, String str) {
            this.f11684b = gki.q;
            this.f11683a = i;
            this.c = i2;
            this.d = str;
        }

        public LevelItem(Parcel parcel) {
            this.f11684b = gki.q;
            this.f11683a = parcel.readInt();
            this.c = parcel.readInt();
            this.f11684b = parcel.readInt();
            this.d = parcel.readString();
        }
    }

    public LevelBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ArrayList();
        this.h = 4;
        this.i = 0;
        this.j = 10;
        this.n = false;
        this.o = new Rect(0, 0, 0, 0);
        this.p = new Rect(0, 0, 0, 0);
        this.q = new Rect(0, 0, 0, 0);
        e(context, attributeSet);
    }

    public LevelBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new ArrayList();
        this.h = 4;
        this.i = 0;
        this.j = 10;
        this.n = false;
        this.o = new Rect(0, 0, 0, 0);
        this.p = new Rect(0, 0, 0, 0);
        this.q = new Rect(0, 0, 0, 0);
        e(context, attributeSet);
    }
}
