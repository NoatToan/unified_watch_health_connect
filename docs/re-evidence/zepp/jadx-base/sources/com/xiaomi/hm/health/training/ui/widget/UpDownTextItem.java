package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes22.dex */
public class UpDownTextItem extends LinearLayout {
    private int a;
    private String b;
    private int c;
    private float d;
    private String e;
    private int f;
    private float g;
    private String h;
    private TextView i;
    private TextView j;

    public UpDownTextItem(Context context) {
        this(context, null, 0);
    }

    private void a() {
        this.i = (TextView) findViewById(R.id.tx_up);
        this.j = (TextView) findViewById(R.id.tx_down);
        this.i.setText(this.b);
        this.i.setTextColor(this.c);
        this.i.setTextSize(0, this.d);
        this.j.setText(this.e);
        this.j.setTextColor(this.f);
        this.j.setTextSize(0, this.g);
        String str = this.h;
        if (str != null) {
            setDownTextFontfamily(str);
        }
        c(this.a);
    }

    private void b() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_updown_textview, (ViewGroup) this, true);
        a();
    }

    private void c(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i, 0, 0);
        this.j.setLayoutParams(layoutParams);
    }

    public void setDownText(String str) {
        this.e = str;
        this.j.setText(str);
    }

    public void setDownTextFontfamily(String str) {
        this.h = str;
        TypefaceManager.get().applyTypeface(this.j, str);
    }

    public void setDownTextSize(@DimenRes int i) {
        float dimension = getResources().getDimension(i);
        this.g = dimension;
        this.j.setTextSize(0, dimension);
    }

    public void setTextPadding(@DimenRes int i) {
        int dimension = (int) getResources().getDimension(i);
        this.a = dimension;
        c(dimension);
    }

    public void setUpText(String str) {
        this.b = str;
        this.i.setText(str);
    }

    public UpDownTextItem(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UpDownTextItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 10;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.UpDownTextItem);
            int i2 = R.styleable.UpDownTextItem_textPadding;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
            this.a = (int) (resourceId > 0 ? getResources().getDimension(resourceId) : typedArrayObtainStyledAttributes.getDimension(i2, 0.0f));
            int i3 = R.styleable.UpDownTextItem_upText;
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
            this.b = resourceId2 > 0 ? getResources().getString(resourceId2) : typedArrayObtainStyledAttributes.getString(i3);
            int i4 = R.styleable.UpDownTextItem_upTextColor;
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(i4, 0);
            this.c = resourceId3 > 0 ? ContextCompat.getColor(context, resourceId3) : typedArrayObtainStyledAttributes.getColor(i4, -16777216);
            int i5 = R.styleable.UpDownTextItem_upTextSize;
            int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(i5, 0);
            this.d = resourceId4 > 0 ? getResources().getDimension(resourceId4) : typedArrayObtainStyledAttributes.getDimension(i5, 12.0f);
            int i6 = R.styleable.UpDownTextItem_downText;
            int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(i6, 0);
            this.e = resourceId5 > 0 ? getResources().getString(resourceId5) : typedArrayObtainStyledAttributes.getString(i6);
            int i7 = R.styleable.UpDownTextItem_downTextColor;
            int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(i7, 0);
            this.f = resourceId6 > 0 ? ContextCompat.getColor(context, resourceId6) : typedArrayObtainStyledAttributes.getColor(i7, -16777216);
            int i8 = R.styleable.UpDownTextItem_downTextSize;
            int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(i8, 0);
            this.g = resourceId7 > 0 ? getResources().getDimension(resourceId7) : typedArrayObtainStyledAttributes.getDimension(i8, 18.0f);
            this.h = typedArrayObtainStyledAttributes.getString(R.styleable.UpDownTextItem_downTextFontfamily);
            typedArrayObtainStyledAttributes.recycle();
        }
        setOrientation(1);
        b();
    }

    public void setUpText(@StringRes int i) {
        String string = getContext().getString(i);
        this.b = string;
        this.i.setText(string);
    }
}
