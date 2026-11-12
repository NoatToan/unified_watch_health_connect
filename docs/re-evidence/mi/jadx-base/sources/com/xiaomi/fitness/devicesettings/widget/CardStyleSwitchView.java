package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.eui;
import defpackage.fli;
import defpackage.i4j;
import defpackage.jni;
import defpackage.zqi;

/* JADX INFO: loaded from: classes8.dex */
public class CardStyleSwitchView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f12018b;
    public TextView c;
    public SwitchButton d;

    public CardStyleSwitchView(Context context) {
        this(context, null);
    }

    private void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(i4j.U);
        String string2 = typedArray.getString(i4j.T);
        int resourceId = typedArray.getResourceId(i4j.R, 0);
        if (resourceId == 0) {
            this.f12018b.setVisibility(8);
        } else {
            this.f12018b.setImageResource(resourceId);
        }
        this.f12017a.setText(string);
        setSubTitle(string2);
        int resourceId2 = typedArray.getResourceId(i4j.Q, 0);
        if (resourceId2 != 0) {
            setBackgroundResource(resourceId2);
        } else {
            setBackgroundResource(jni.R);
        }
        findViewById(zqi.y4).setVisibility(typedArray.getBoolean(i4j.S, false) ? 0 : 8);
    }

    public final int a(Context context, int i) {
        return (int) (((double) (context.getResources().getDisplayMetrics().density * i)) + 0.5d);
    }

    public int getLayoutRes() {
        return eui.K2;
    }

    public final void initView(Context context) {
        setMinimumHeight((int) context.getResources().getDimension(fli.common_card_item_height));
        int iA = a(context, 18);
        setPadding(iA, 0, iA, 0);
        this.f12018b = (ImageView) findViewById(zqi.p0);
        this.f12017a = (TextView) findViewById(zqi.q0);
        this.c = (TextView) findViewById(zqi.r0);
        this.d = (SwitchButton) findViewById(zqi.o0);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (i != 0) {
            super.setBackgroundResource(i);
        } else {
            super.setBackgroundResource(jni.R);
        }
    }

    public void setChecked(boolean z) {
        this.d.setChecked(z);
    }

    public void setLeft_(int i) {
        if (i == 0) {
            this.f12018b.setVisibility(8);
        } else {
            this.f12018b.setVisibility(0);
            this.f12018b.setImageResource(i);
        }
    }

    public void setOnSwitchCheckedChangeListener(ISwitchButton.a aVar) {
        this.d.setOnCheckedChangeCallback(aVar);
    }

    public void setSubTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(str);
            this.c.setVisibility(0);
        }
    }

    public void setTitle(String str) {
        this.f12017a.setText(str);
    }

    public CardStyleSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardStyleSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(getLayoutRes(), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i4j.P);
        initView(context);
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
