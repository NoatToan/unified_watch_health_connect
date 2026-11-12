package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2014b;
    public int c;
    public boolean d;

    public ReactiveGuide(Context context) {
        super(context);
        this.f2013a = -1;
        this.f2014b = false;
        this.c = 0;
        this.d = true;
        super.setVisibility(8);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.x3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.B3) {
                    this.f2013a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2013a);
                } else if (index == u4j.y3) {
                    this.f2014b = typedArrayObtainStyledAttributes.getBoolean(index, this.f2014b);
                } else if (index == u4j.A3) {
                    this.c = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                } else if (index == u4j.z3) {
                    this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f2013a != -1) {
            ConstraintLayout.getSharedValues().a(this.f2013a, this);
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.c;
    }

    public int getAttributeId() {
        return this.f2013a;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f2014b = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.c = i;
    }

    public void setAttributeId(int i) {
        b sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f2013a;
        if (i2 != -1) {
            sharedValues.b(i2, this);
        }
        this.f2013a = i;
        if (i != -1) {
            sharedValues.a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2001a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2002b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.c = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2013a = -1;
        this.f2014b = false;
        this.c = 0;
        this.d = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2013a = -1;
        this.f2014b = false;
        this.c = 0;
        this.d = true;
        super.setVisibility(8);
        a(attributeSet);
    }
}
