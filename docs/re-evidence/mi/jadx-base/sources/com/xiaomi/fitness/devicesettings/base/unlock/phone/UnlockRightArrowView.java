package com.xiaomi.fitness.devicesettings.base.unlock.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cji;
import defpackage.eui;
import defpackage.i4j;
import defpackage.jni;
import defpackage.ni4;
import defpackage.zqi;

/* JADX INFO: loaded from: classes8.dex */
public class UnlockRightArrowView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f11954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f11955b;
    public TextView c;
    public TextView d;
    public ImageView e;

    public UnlockRightArrowView(Context context) {
        this(context, null);
    }

    private void initView() {
        this.f11954a = findViewById(zqi.E7);
        this.f11955b = (TextView) findViewById(zqi.F);
        this.e = (ImageView) findViewById(zqi.G);
        this.c = (TextView) findViewById(zqi.E);
        this.d = (TextView) findViewById(zqi.H);
    }

    private void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(i4j.M5);
        boolean z = typedArray.getBoolean(i4j.N5, true);
        boolean z2 = typedArray.getBoolean(i4j.O5, false);
        String string2 = typedArray.getString(i4j.L5);
        this.f11955b.setText(string);
        setThemeBlack(z2);
        if (!z) {
            this.e.setVisibility(8);
        }
        this.c.setVisibility(TextUtils.isEmpty(string2) ? 8 : 0);
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        this.c.setText(string2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f11955b.setEnabled(z);
    }

    public void setRightValue(String str) {
        this.d.setText(str);
    }

    public void setThemeBlack(boolean z) {
        this.f11954a.setBackgroundResource(z ? cji.common_main_dark_gray_color : jni.R);
        setTitleColor(z ? cji.H : cji.A);
    }

    public void setTitle(String str) {
        this.f11955b.setText(str);
    }

    public void setTitleColor(int i) {
        if (i != -1) {
            this.f11955b.setTextColor(ni4.d(getContext(), i));
        }
    }

    public UnlockRightArrowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UnlockRightArrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(eui.B1, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i4j.K5);
        initView();
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
