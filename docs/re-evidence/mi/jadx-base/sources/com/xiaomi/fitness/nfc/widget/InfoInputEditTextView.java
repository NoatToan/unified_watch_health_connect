package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.mri;
import defpackage.r4j;
import defpackage.sui;

/* JADX INFO: loaded from: classes9.dex */
public class InfoInputEditTextView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f12638b;

    public InfoInputEditTextView(Context context) {
        this(context, null);
    }

    public void a(TextWatcher textWatcher) {
        this.f12638b.addTextChangedListener(textWatcher);
    }

    public String getInputInfo() {
        return this.f12638b.getText().toString();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f12638b.setFilters(inputFilterArr);
    }

    public void setHintText(String str) {
        this.f12638b.setHint(str);
    }

    public void setInfoInput(String str) {
        this.f12638b.setText(str);
    }

    public void setInputType(int i) {
        this.f12638b.setInputType(i);
    }

    public void setTitle(String str) {
        this.f12637a.setText(str);
    }

    public InfoInputEditTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setHintText(int i) {
        this.f12638b.setHint(i);
    }

    public void setTitle(int i) {
        this.f12637a.setText(i);
    }

    public InfoInputEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r4j.L4);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(r4j.O4, true);
        String string = typedArrayObtainStyledAttributes.getString(r4j.Q4);
        String string2 = typedArrayObtainStyledAttributes.getString(r4j.N4);
        int i2 = typedArrayObtainStyledAttributes.getInt(r4j.M4, 1);
        typedArrayObtainStyledAttributes.getInt(r4j.P4, 32767);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(context).inflate(sui.x0, (ViewGroup) this, true);
        this.f12637a = (TextView) viewInflate.findViewById(mri.g5);
        this.f12638b = (EditText) viewInflate.findViewById(mri.v1);
        this.f12637a.setVisibility(z ? 0 : 8);
        setTitle(string);
        setHintText(string2);
        this.f12638b.setInputType(i2);
    }
}
