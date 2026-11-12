package com.xmlywind.sdk.base.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.mta.PointCategory;

/* JADX INFO: loaded from: classes22.dex */
public class SkipButtonWidget extends RelativeLayout {
    public int a;
    public boolean b;
    private final TextView c;
    private final TextView d;
    private int e;

    public SkipButtonWidget(Context context) {
        super(context);
        this.a = 0;
        this.b = false;
        this.a = com.xmlywind.sdk.common.utils.c.c(30.0f, context);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.a, -2);
        this.c = new TextView(context);
        TextView textView = new TextView(context);
        this.d = textView;
        setLayoutParams(layoutParams);
        int i = this.a;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(9);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.addRule(20);
        }
        textView.setTextColor(-16777216);
        textView.setId(com.xmlywind.sdk.common.a.r());
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, layoutParams2);
        int i2 = this.a / 2;
        int color = Color.parseColor("#ffffff");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(i2);
        gradientDrawable.setAlpha(102);
        setBackground(gradientDrawable);
        setContentDescription(PointCategory.SKIP);
    }

    public void a(int i) {
        this.e = i;
        if (!this.b) {
            if (i > 0) {
                this.d.setText(String.valueOf(i));
            }
        } else if (i > 0) {
            this.c.setText(com.xmlywind.sdk.base.b.c(Integer.valueOf(i)));
            if (this.c.getVisibility() != 0) {
                this.c.setVisibility(0);
            }
        }
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        SigmobLog.d("show skip widget");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.a);
        this.c.setTextColor(-16777216);
        this.c.setTextSize(1, 14.0f);
        this.c.setGravity(17);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        TextView textView = this.c;
        int i = this.a;
        textView.setPadding((int) (i / 3.0f), 0, (int) (i / 3.0f), 0);
        int i2 = this.e;
        if (i2 > 0) {
            this.c.setText(com.xmlywind.sdk.base.b.c(Integer.valueOf(i2)));
        } else {
            this.c.setText(com.xmlywind.sdk.base.b.g());
        }
        addView(this.c, layoutParams);
    }

    public int getTime() {
        return this.e;
    }
}
