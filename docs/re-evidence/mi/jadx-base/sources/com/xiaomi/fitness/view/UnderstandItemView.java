package com.xiaomi.fitness.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.eri;
import defpackage.jui;
import defpackage.n4j;

/* JADX INFO: loaded from: classes10.dex */
public class UnderstandItemView extends LinearLayout {
    public UnderstandItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        View viewInflate = LayoutInflater.from(context).inflate(jui.b8, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(eri.cj);
        TextView textView2 = (TextView) viewInflate.findViewById(eri.o3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.y6);
        String string = typedArrayObtainStyledAttributes.getString(n4j.A6);
        String string2 = typedArrayObtainStyledAttributes.getString(n4j.z6);
        typedArrayObtainStyledAttributes.recycle();
        if (TextUtils.isEmpty(string)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(string);
        }
        if (TextUtils.isEmpty(string2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(string2);
        }
        addView(viewInflate);
    }
}
