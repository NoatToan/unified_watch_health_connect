package com.huami.lib.view.dim;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes10.dex */
public class DimPanelBottomBar extends FrameLayout {
    private static final String m = "dark";
    private static final String n = "separated";
    private final TextView a;
    private final TextView b;
    private View c;
    private View d;
    private String e;
    private String f;
    private int g;
    private int h;
    private String i;
    private int j;
    private int k;
    private int l;

    public DimPanelBottomBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View getLeftButton() {
        return this.b;
    }

    public View getRightButton() {
        return this.a;
    }

    public void setLeftButtonText(String str) {
        this.e = str;
    }

    public void setLeftButtonTextColor(int i) {
        this.g = i;
    }

    public void setRightButtonText(String str) {
        this.f = str;
    }

    public void setRightButtonTextColor(int i) {
        this.h = i;
    }

    public void setStyle(String str) {
        this.i = str;
    }

    public void updateUI() {
        if (m.equals(this.i)) {
            this.j = R.drawable.click_btn_bg;
            this.k = R.drawable.click_btn_bg_left_round;
            this.l = R.drawable.click_btn_bg_right_round;
            this.d.setBackgroundResource(R.color.white30);
        } else if (n.equals(this.i)) {
            this.d.setVisibility(8);
        } else {
            this.j = R.drawable.click_btn_bg_3;
            this.k = R.drawable.click_btn_bg_3_left_round;
            this.l = R.drawable.click_btn_bg_3_right_round;
        }
        if (n.equals(this.i)) {
            if (!TextUtils.isEmpty(this.e)) {
                this.b.setText(this.e);
            }
            if (!TextUtils.isEmpty(this.f)) {
                this.a.setText(this.f);
            }
            TextView textView = this.b;
            int i = R.drawable.dialog_bottom_button_round;
            textView.setBackgroundResource(i);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int iDp2px = (int) ViewUtils.dp2px(getContext(), 10.0f);
            layoutParams.rightMargin = iDp2px;
            this.b.setLayoutParams(layoutParams);
            this.a.setBackgroundResource(i);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.a.getLayoutParams();
            layoutParams2.leftMargin = iDp2px;
            this.a.setLayoutParams(layoutParams2);
        } else {
            this.c.setBackgroundResource(R.drawable.click_btn_bg_3);
            if (TextUtils.isEmpty(this.e)) {
                this.b.setVisibility(8);
            } else {
                this.b.setText(this.e);
                this.b.setVisibility(0);
                this.b.setBackgroundResource(this.j);
            }
            if (TextUtils.isEmpty(this.f)) {
                this.a.setVisibility(8);
            } else {
                this.a.setText(this.f);
                this.a.setVisibility(0);
                this.a.setBackgroundResource(this.j);
            }
            if (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f)) {
                this.d.setVisibility(8);
                this.c.setBackgroundResource(R.color.trans);
            } else {
                this.d.setVisibility(0);
                this.c.setBackgroundResource(this.j);
                this.a.setBackgroundResource(this.l);
                this.b.setBackgroundResource(this.k);
            }
        }
        this.b.setTextColor(this.g);
        this.a.setTextColor(this.h);
    }

    public DimPanelBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = R.drawable.click_btn_bg_3;
        this.k = R.drawable.click_btn_bg_3_left_round;
        this.l = R.drawable.click_btn_bg_3_right_round;
        LayoutInflater.from(context).inflate(R.layout.dialog_bottom_bar, this);
        this.b = (TextView) findViewById(R.id.left_button);
        this.a = (TextView) findViewById(R.id.right_button);
        this.c = findViewById(R.id.bottom_bar_frame);
        this.d = findViewById(R.id.bottom_bar_frame_split);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.DimPanelFragmentBottomBar);
        this.e = typedArrayObtainStyledAttributes.getString(R.styleable.DimPanelFragmentBottomBar_left_text);
        this.f = typedArrayObtainStyledAttributes.getString(R.styleable.DimPanelFragmentBottomBar_right_text);
        int i2 = R.styleable.DimPanelFragmentBottomBar_left_text_color;
        int i3 = R.color.main_ui_title_color;
        this.g = typedArrayObtainStyledAttributes.getColor(i2, ContextCompat.getColor(context, i3));
        this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.DimPanelFragmentBottomBar_right_text_color, ContextCompat.getColor(context, i3));
        this.i = typedArrayObtainStyledAttributes.getString(R.styleable.DimPanelFragmentBottomBar_show_style);
        HMLog.d(getClass().getName(), "left:" + this.e + ", right:" + this.f, new Object[0]);
        updateUI();
        typedArrayObtainStyledAttributes.recycle();
    }
}
