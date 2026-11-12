package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes22.dex */
public class SimpleToolbar extends Toolbar {
    private ImageView a;
    private TextView b;
    private ImageView c;

    public SimpleToolbar(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.iv_left);
        this.b = (TextView) findViewById(R.id.txt_main_title);
        this.c = (ImageView) findViewById(R.id.iv_right);
    }

    public void setLeftIconDrawable(int i) {
        if (i == -1) {
            this.a.setVisibility(4);
        } else {
            this.a.setVisibility(0);
            this.a.setImageResource(i);
        }
    }

    public void setLeftTitleClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setMainTitle(String str) {
        setTitle(" ");
        this.b.setVisibility(TextUtils.isEmpty(str) ? 4 : 0);
        this.b.setText(str);
    }

    public void setMainTitleColor(int i) {
        this.b.setTextColor(i);
    }

    public void setRightIconDrawable(int i) {
        if (i == -1) {
            this.c.setVisibility(4);
        } else {
            this.c.setVisibility(0);
            this.c.setImageResource(i);
        }
    }

    public void setRightTitleClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public SimpleToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
