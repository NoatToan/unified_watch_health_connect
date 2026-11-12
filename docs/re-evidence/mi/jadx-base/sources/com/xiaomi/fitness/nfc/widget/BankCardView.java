package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.mri;
import defpackage.sui;

/* JADX INFO: loaded from: classes9.dex */
public class BankCardView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintLayout f12632b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public ConstraintLayout g;
    public TextView h;
    public SelectorImageView i;

    public BankCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(sui.w0, this);
        initView();
    }

    private void initView() {
        this.f12631a = (TextView) findViewById(mri.A);
        this.f12632b = (ConstraintLayout) findViewById(mri.E);
        this.c = (ImageView) findViewById(mri.G);
        this.d = (TextView) findViewById(mri.H);
        this.e = (TextView) findViewById(mri.F);
        this.f = (TextView) findViewById(mri.U);
        this.g = (ConstraintLayout) findViewById(mri.x5);
        this.h = (TextView) findViewById(mri.b1);
        this.i = (SelectorImageView) findViewById(mri.w);
    }

    public void setBackgroundView(int i) {
        this.i.setImageResource(i);
    }

    public void setBankCardTextView(boolean z) {
        this.f12631a.setVisibility(z ? 0 : 8);
    }

    public void setCardNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f.setVisibility(8);
        } else {
            this.f.setText(str);
            this.f.setVisibility(0);
        }
    }

    public void setCvc2Preview(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }

    public void setValidPeriod(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }
}
