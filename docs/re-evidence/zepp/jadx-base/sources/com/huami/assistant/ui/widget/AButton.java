package com.huami.assistant.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.assistant.R;

/* JADX INFO: loaded from: classes5.dex */
public class AButton extends LinearLayout {
    private ImageView a;
    private TextView b;

    public AButton(Context context) {
        this(context, null);
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_button, (ViewGroup) this, true);
        this.a = (ImageView) findViewById(R.id.iv_icon);
        this.b = (TextView) findViewById(R.id.iv_text);
    }

    private void b(TypedArray a) {
        setIcon(a.getDrawable(R.styleable.AButton_src));
        setTextColor(a.getColorStateList(R.styleable.AButton_textColor1));
        setText(a.getString(R.styleable.AButton_text));
        a.recycle();
    }

    private void setIcon(Drawable drawable) {
        ImageView imageView;
        if (drawable == null || (imageView = this.a) == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    private void setText(String title) {
        TextView textView;
        if (title == null || (textView = this.b) == null) {
            return;
        }
        textView.setText(title);
    }

    private void setTextColor(ColorStateList stateList) {
        TextView textView;
        if (stateList == null || (textView = this.b) == null) {
            return;
        }
        textView.setTextColor(stateList);
    }

    public AButton(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        a();
        b(context.obtainStyledAttributes(attrs, R.styleable.AButton));
    }
}
