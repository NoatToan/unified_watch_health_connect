package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class SettingItemView extends RelativeLayout {
    private TextView a;
    private TextView b;
    private ImageView c;
    private View d;
    private View e;

    public SettingItemView(Context context) {
        this(context, null);
    }

    public void setInfoText(String str) {
        this.b.setText(str);
        this.b.setVisibility(0);
    }

    public void setTitleText(String str) {
        this.a.setText(str);
    }

    public void showDivider(boolean z) {
        if (z) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
    }

    public void showIcon(boolean z) {
        if (z) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
    }

    public void showIndicator(boolean z) {
        if (z) {
            this.e.setVisibility(0);
        } else {
            this.e.setVisibility(8);
        }
    }

    public SettingItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SettingItemView, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SettingItemView_title);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.SettingItemView_icon);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SettingItemView_show_divider, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SettingItemView_show_arrow, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(R.layout.view_setting_item, this);
        this.b = (TextView) findViewById(R.id.info);
        this.d = findViewById(R.id.divider);
        this.e = findViewById(R.id.red_dot);
        this.a = (TextView) findViewById(R.id.title);
        this.c = (ImageView) findViewById(R.id.icon);
        ImageView imageView = (ImageView) findViewById(R.id.arrow);
        this.a.setText(string);
        this.c.setImageDrawable(drawable);
        showDivider(z);
        showIndicator(false);
        if (z2) {
            return;
        }
        imageView.setVisibility(8);
    }
}
