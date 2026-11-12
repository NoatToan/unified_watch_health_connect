package com.xiaomi.fitness.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.eri;
import defpackage.jui;
import defpackage.n4j;

/* JADX INFO: loaded from: classes10.dex */
public class CardUnderstandView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f13329a;

    public CardUnderstandView(Context context) {
        this(context, null);
    }

    private void initView() {
        this.f13329a = (TextView) findViewById(eri.vo);
    }

    private void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(n4j.c0);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f13329a.setText(string);
    }

    public int getLayoutRes() {
        return jui.X6;
    }

    public CardUnderstandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardUnderstandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(getLayoutRes(), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.b0);
        initView();
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
