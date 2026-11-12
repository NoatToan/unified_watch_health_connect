package com.xiaomi.fitness.about.widget;

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
import defpackage.cni;
import defpackage.e4j;
import defpackage.ni4;
import defpackage.uqi;
import defpackage.xii;
import defpackage.yti;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class SetRightArrowView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f11534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f11535b;
    public TextView c;
    public View d;
    public TextView e;
    public ImageView f;
    public View g;

    public SetRightArrowView(Context context) {
        this(context, null);
    }

    private void initView() {
        this.f11534a = findViewById(uqi.D);
        this.f11535b = (TextView) findViewById(uqi.f);
        this.c = (TextView) findViewById(uqi.d);
        this.d = findViewById(uqi.e);
        this.f = (ImageView) findViewById(uqi.g);
        this.e = (TextView) findViewById(uqi.i);
        this.g = findViewById(uqi.h);
    }

    private void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(e4j.x3);
        String string2 = typedArray.getString(e4j.u3);
        Drawable drawable = typedArray.getDrawable(e4j.y3);
        String string3 = typedArray.getString(e4j.B3);
        boolean z = typedArray.getBoolean(e4j.v3, false);
        boolean z2 = typedArray.getBoolean(e4j.w3, false);
        boolean z3 = typedArray.getBoolean(e4j.A3, false);
        boolean z4 = typedArray.getBoolean(e4j.z3, true);
        boolean z5 = typedArray.getBoolean(e4j.D3, false);
        boolean z6 = typedArray.getBoolean(e4j.E3, false);
        int resourceId = typedArray.getResourceId(e4j.C3, -1);
        this.f11535b.setText(string);
        setThemeBlack(z6);
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
        this.f11535b.setEnabled(z);
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

    public void setThemeBlack(boolean z) {
        this.f11534a.setBackgroundResource(z ? xii.common_main_dark_gray_color : cni.c);
        setTitleColor(z ? xii.c : xii.f39160a);
        setRightValueTextColor(z ? xii.c : xii.f39160a);
        this.d.setBackgroundResource(z ? xii.d : cni.f5578b);
    }

    public void setTitle(String str) {
        this.f11535b.setText(str);
    }

    public void setTitleColor(int i) {
        if (i != -1) {
            this.f11535b.setTextColor(ni4.d(getContext(), i));
        }
    }

    public void setTitleStyle(Typeface typeface) {
        this.f11535b.setTypeface(typeface);
    }

    public SetRightArrowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SetRightArrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(yti.c, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e4j.t3);
        initView();
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
