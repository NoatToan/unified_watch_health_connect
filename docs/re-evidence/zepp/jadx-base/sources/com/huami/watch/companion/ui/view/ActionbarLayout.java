package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.huami.watch.companionlib.R;

/* JADX INFO: loaded from: classes16.dex */
public class ActionbarLayout extends RelativeLayout {
    private ImageView a;
    private TextView b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private ImageView f;
    private OnActionBarRightTextClickListener g;

    public interface OnActionBarRightTextClickListener {
        void onActionBarRightTextClick();
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ActionbarLayout.this.g != null) {
                ActionbarLayout.this.g.onActionBarRightTextClick();
            }
        }
    }

    public ActionbarLayout(Context context) {
        this(context, null, 0);
    }

    private void b() {
        this.a = (ImageView) findViewById(R.id.btn_back);
        this.b = (TextView) findViewById(R.id.title);
        this.d = (TextView) findViewById(R.id.btn_back_text);
        this.e = (TextView) findViewById(R.id.right_text);
        this.f = (ImageView) findViewById(R.id.right_img);
        this.c = (ImageView) findViewById(R.id.iv_title_right);
        this.e.setOnClickListener(new a());
    }

    public void disableBackArrow() {
        this.a.setVisibility(4);
    }

    public void enableBackArrow() {
        this.a.setVisibility(0);
    }

    public void setBackArrowClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setBackText(String str) {
        this.d.setVisibility(0);
        this.d.setText(str);
    }

    public void setBackTextClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnActionBarRightTextClickListener(OnActionBarRightTextClickListener onActionBarRightTextClickListener) {
        this.g = onActionBarRightTextClickListener;
    }

    public void setRightImage(@DrawableRes int i) {
        this.f.setImageResource(i);
        this.f.setVisibility(0);
    }

    public void setRightImageClickListener(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }

    public void setRightImageVisible(boolean z) {
        if (z) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }

    public void setRightText(String str) {
        this.e.setVisibility(0);
        this.e.setText(str);
    }

    public void setRightTextClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public void setRightTextLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.e.setOnLongClickListener(onLongClickListener);
    }

    public void setRightTextVisibility(int i) {
        this.e.setVisibility(i);
    }

    public void setTitleRightImageClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public void setTitleRightImageRes(@DrawableRes int i) {
        this.c.setImageResource(i);
    }

    public void setTitleText(String str) {
        this.b.setText(str);
    }

    public void setTitleTextSize(int i) {
        this.b.setTextSize(2, i);
    }

    public ActionbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.view_app_bar, this);
        b();
    }
}
