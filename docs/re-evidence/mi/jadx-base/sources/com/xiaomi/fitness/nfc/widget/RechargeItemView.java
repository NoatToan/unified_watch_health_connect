package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.miui.tsmclient.common.util.DisplayUtils;
import defpackage.mri;
import defpackage.r4j;
import defpackage.sui;

/* JADX INFO: loaded from: classes9.dex */
public class RechargeItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f12652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12653b;
    public TextView c;
    public View d;
    public ImageView e;

    public RechargeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet);
    }

    public final void a() {
        LayoutInflater.from(getContext()).inflate(sui.R0, this);
        this.f12652a = findViewById(mri.v0);
        this.f12653b = (TextView) findViewById(mri.x0);
        this.c = (TextView) findViewById(mri.u0);
        this.d = findViewById(mri.w0);
        this.e = (ImageView) findViewById(mri.y0);
    }

    public final void b(AttributeSet attributeSet) {
        a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r4j.Z4);
            String string = typedArrayObtainStyledAttributes.getString(r4j.a5);
            float dimension = typedArrayObtainStyledAttributes.getDimension(r4j.b5, 14.0f);
            String string2 = typedArrayObtainStyledAttributes.getString(r4j.c5);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(r4j.d5, 12.0f);
            this.d.setVisibility(typedArrayObtainStyledAttributes.getBoolean(r4j.e5, false) ? 0 : 8);
            this.e.setVisibility(typedArrayObtainStyledAttributes.getBoolean(r4j.f5, false) ? 0 : 8);
            typedArrayObtainStyledAttributes.recycle();
            this.f12653b.setText(string);
            this.f12653b.setTextSize(2, DisplayUtils.pxToSp(getContext(), dimension));
            this.c.setText(string2);
            this.c.setTextSize(2, DisplayUtils.pxToSp(getContext(), dimension2));
        }
    }

    public void setItemClickListener(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.f12652a.setOnClickListener(onClickListener);
        }
    }

    public void setKey(String str) {
        this.f12653b.setText(str);
    }

    public void setTipListener(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.d.setOnClickListener(onClickListener);
        }
    }

    public void setTitle(String str) {
        this.f12653b.setText(str);
    }

    public void setValue(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public void setValueColor(int i) {
        this.c.setTextColor(getResources().getColor(i));
    }

    public RechargeItemView(Context context) {
        super(context);
        b(null);
    }

    public RechargeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet);
    }
}
