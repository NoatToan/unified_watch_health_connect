package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.mri;
import defpackage.ni4;
import defpackage.r4j;
import defpackage.sui;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class SetRightArrowView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f12678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12679b;
    public TextView c;
    public View d;
    public TextView e;
    public ImageView f;
    public View g;
    public ImageView h;

    public SetRightArrowView(Context context) {
        this(context, null);
    }

    private void initView() {
        this.f12678a = findViewById(mri.g4);
        this.f12679b = (TextView) findViewById(mri.p);
        this.c = (TextView) findViewById(mri.n);
        this.d = findViewById(mri.o);
        this.f = (ImageView) findViewById(mri.q);
        this.e = (TextView) findViewById(mri.s);
        this.g = findViewById(mri.f27134r);
        this.h = (ImageView) findViewById(mri.T1);
    }

    private void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(r4j.s5);
        String string2 = typedArray.getString(r4j.o5);
        Drawable drawable = typedArray.getDrawable(r4j.t5);
        String string3 = typedArray.getString(r4j.w5);
        boolean z = typedArray.getBoolean(r4j.p5, false);
        boolean z2 = typedArray.getBoolean(r4j.r5, false);
        boolean z3 = typedArray.getBoolean(r4j.v5, false);
        boolean z4 = typedArray.getBoolean(r4j.u5, true);
        boolean z5 = typedArray.getBoolean(r4j.y5, false);
        typedArray.getBoolean(r4j.z5, false);
        Drawable drawable2 = typedArray.getDrawable(r4j.q5);
        int resourceId = typedArray.getResourceId(r4j.x5, -1);
        this.f12679b.setText(string);
        if (drawable2 != null) {
            this.h.setVisibility(0);
            this.h.setImageDrawable(drawable2);
        }
        if (z) {
            this.c.setVisibility(0);
            this.c.setText(string2);
        } else {
            this.c.setVisibility(8);
        }
        if (z2) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
        if (z3) {
            this.e.setVisibility(0);
            this.e.setText(string3);
            setRightValueTextColor(resourceId);
        } else {
            this.e.setVisibility(8);
        }
        if (!z4) {
            this.f.setVisibility(8);
        }
        if (drawable != null) {
            this.f.setImageDrawable(drawable);
        }
        if (z5) {
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
    }

    public void a(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    public String getRightValue() {
        return this.e.getText().toString().trim();
    }

    public TextView getRightValueView() {
        return this.e;
    }

    public void setDes(@NotNull String str) {
        this.c.setText(str);
        this.c.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f12679b.setEnabled(z);
        this.c.setEnabled(z);
        this.e.setEnabled(z);
    }

    public void setLineShow(boolean z) {
        if (z) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(4);
        }
    }

    public void setRedPointShow(boolean z) {
        if (z) {
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
    }

    public void setRightValue(String str) {
        this.e.setVisibility(0);
        this.e.setText(str);
    }

    public void setRightValueTextColor(int i) {
        if (i != -1) {
            this.e.setTextColor(ni4.d(getContext(), i));
        }
    }

    public void setTitle(String str) {
        this.f12679b.setText(str);
    }

    public void setTitleColor(int i) {
        if (i != -1) {
            this.f12679b.setTextColor(ni4.d(getContext(), i));
        }
    }

    public void setTitleStyle(Typeface typeface) {
        this.f12679b.setTypeface(typeface);
    }

    public SetRightArrowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SetRightArrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(sui.y0, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r4j.n5);
        initView();
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
