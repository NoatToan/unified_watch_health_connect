package com.xiaomi.fitness.mine.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.lri;
import defpackage.q4j;
import defpackage.rui;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class CardStyleSetView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12489b;
    public ImageView c;
    public ImageView d;
    public TextView e;
    public View f;

    public CardStyleSetView(Context context) {
        this(context, null);
    }

    private void initView() {
        this.c = (ImageView) findViewById(lri.w);
        this.f12488a = (TextView) findViewById(lri.x);
        this.f12489b = (TextView) findViewById(lri.u);
        this.d = (ImageView) findViewById(lri.v);
        this.e = (TextView) findViewById(lri.z);
        this.f = findViewById(lri.t);
    }

    private void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(q4j.Q);
        String string2 = typedArray.getString(q4j.O);
        String string3 = typedArray.getString(q4j.P);
        if (!typedArray.getBoolean(q4j.N, true)) {
            this.d.setVisibility(8);
        }
        int resourceId = typedArray.getResourceId(q4j.M, 0);
        if (resourceId == 0) {
            this.c.setVisibility(8);
        } else {
            this.c.setImageResource(resourceId);
        }
        this.f12488a.setText(string);
        this.f12489b.setText(string2);
        setSubTitle(string3);
    }

    public int getLayoutRes() {
        return rui.p;
    }

    public void onInitView(Context context, AttributeSet attributeSet, TypedArray typedArray) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    public void setDes(@NotNull String str) {
        this.f12489b.setText(str);
    }

    public void setLeft_(int i) {
        if (i == 0) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.setImageResource(i);
        }
    }

    public void setSubTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.e.setVisibility(8);
        } else {
            this.e.setText(str);
            this.e.setVisibility(0);
        }
    }

    public void setTitle(String str) {
        this.f12488a.setText(str);
    }

    public CardStyleSetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardStyleSetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(getLayoutRes(), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q4j.L);
        initView();
        onInitView(context, attributeSet, typedArrayObtainStyledAttributes);
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
