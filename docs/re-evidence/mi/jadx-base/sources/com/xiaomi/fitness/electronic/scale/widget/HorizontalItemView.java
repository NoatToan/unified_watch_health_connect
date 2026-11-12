package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.bri;
import defpackage.gui;
import defpackage.l4j;

/* JADX INFO: loaded from: classes8.dex */
public class HorizontalItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f12144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12145b;
    public TextView c;
    public TextView d;
    public ImageView e;
    public SwitchButton f;

    public HorizontalItemView(Context context) {
        super(context);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(gui.Y, this);
        this.f12144a = (ImageView) findViewById(bri.e1);
        this.f12145b = (TextView) findViewById(bri.h1);
        this.c = (TextView) findViewById(bri.f1);
        this.d = (TextView) findViewById(bri.u3);
        this.e = (ImageView) findViewById(bri.s3);
        this.f = (SwitchButton) findViewById(bri.t3);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4j.S0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(l4j.T0, -1);
            String string = typedArrayObtainStyledAttributes.getString(l4j.W0);
            String string2 = typedArrayObtainStyledAttributes.getString(l4j.V0);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(l4j.U0, false);
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != -1) {
                this.f12144a.setImageResource(resourceId);
            }
            this.f12145b.setText(string);
            if (string2 == null || TextUtils.isEmpty(string2)) {
                this.c.setVisibility(8);
            } else {
                this.c.setText(string2);
            }
            if (z) {
                this.e.setVisibility(8);
                this.d.setVisibility(8);
                this.f.setVisibility(0);
            } else {
                this.e.setVisibility(0);
                this.d.setVisibility(0);
                this.f.setVisibility(8);
            }
        }
    }

    public void setRightText(String str) {
        this.d.setText(str);
    }

    public HorizontalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public HorizontalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
