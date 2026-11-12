package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.w0;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes14.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w0 w0VarF = w0.f(context, attributeSet, R.styleable.TabItem);
        int i14 = R.styleable.TabItem_android_text;
        TypedArray typedArray = w0VarF.f5271b;
        this.text = typedArray.getText(i14);
        this.icon = w0VarF.b(R.styleable.TabItem_android_icon);
        this.customLayout = typedArray.getResourceId(R.styleable.TabItem_android_layout, 0);
        w0VarF.h();
    }

    public TabItem(Context context) {
        this(context, null);
    }
}
