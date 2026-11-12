package com.huami.watch.companion.unlock;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.huami.watch.companion.R;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class TipComponent extends FrameLayout {
    private static final String k = "TipComponent";
    private Context a;
    private ImageView b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private ViewGroup g;
    private CharSequence h;
    private CharSequence i;
    private CharSequence j;

    public TipComponent(Context context) {
        this(context, null);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.tipComponent);
        setIcon(typedArrayObtainStyledAttributes.getDrawable(R.styleable.tipComponent_tipIcon));
        setEndIcon(typedArrayObtainStyledAttributes.getDrawable(R.styleable.tipComponent_tipEndIcon));
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.tipComponent_tipTitle);
        setTitle(string);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.tipComponent_tipSubTitle);
        setSubTitle(string2);
        String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.tipComponent_tipButton);
        setButton(string3, (View.OnClickListener) null);
        typedArrayObtainStyledAttributes.recycle();
        Log.i(k, "title:" + string + ",subtitle:" + string2 + ",button:" + string3, new Object[0]);
    }

    private void b() {
        this.b = (ImageView) findViewById(R.id.tip_icon);
        this.c = (ImageView) findViewById(R.id.tip_end_icon);
        this.d = (TextView) findViewById(R.id.tip_title);
        this.e = (TextView) findViewById(R.id.tip_sub_title);
        this.f = (TextView) findViewById(R.id.tip_button);
        this.g = (ViewGroup) findViewById(R.id.loading_parent);
    }

    private void c() {
        if (!TextUtils.isEmpty(this.i)) {
            this.d.setText(this.i);
        }
        if (TextUtils.isEmpty(this.h)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setText(this.h);
        }
        if (TextUtils.isEmpty(this.j)) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.f.setText(this.j);
        }
    }

    public void clear() {
        setTitle((CharSequence) null);
        setSubTitle(null);
        setButton((CharSequence) null, (View.OnClickListener) null);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
    }

    public boolean isLoading() {
        return this.g.getVisibility() == 0;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        findViewById(R.id.root).setBackgroundColor(i);
    }

    public ViewGroup setButton(CharSequence charSequence, View.OnClickListener onClickListener) {
        if (!TextUtils.equals(this.j, charSequence)) {
            this.j = charSequence;
            c();
            if (onClickListener != null) {
                this.f.setOnClickListener(onClickListener);
            }
        }
        return this;
    }

    public void setDividerVisibility(int i) {
        findViewById(R.id.divider).setVisibility(i);
    }

    public ViewGroup setEndIcon(@DrawableRes int i) {
        if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
        }
        this.c.setImageResource(i);
        return this;
    }

    public ViewGroup setIcon(@DrawableRes int i) {
        if (this.b.getVisibility() != 0) {
            this.b.setVisibility(0);
        }
        this.b.setImageResource(i);
        return this;
    }

    public ViewGroup setIconVisibility(int i) {
        this.b.setVisibility(i);
        return this;
    }

    public void setLoadingVisibility(int i) {
        this.g.setVisibility(i);
    }

    public ViewGroup setSubTitle(CharSequence charSequence) {
        if (!TextUtils.equals(this.h, charSequence)) {
            this.h = charSequence;
            c();
        }
        return this;
    }

    public ViewGroup setTitle(CharSequence charSequence) {
        if (!TextUtils.equals(this.i, charSequence)) {
            this.i = charSequence;
            c();
        }
        return this;
    }

    public void setTitleTextSize(float f) {
        this.d.setTextSize(2, f);
    }

    public void startLoading() {
        if (this.g.getVisibility() != 0) {
            this.g.setVisibility(0);
        }
    }

    public void stopLoading() {
        if (this.g.getVisibility() != 8) {
            this.g.setVisibility(8);
        }
    }

    public TipComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TipComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
        View.inflate(context, R.layout.watch_view_tip_component, this);
        b();
        a(attributeSet);
        c();
    }

    public void setEndIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.c.getVisibility() != 0) {
                this.c.setVisibility(0);
            }
            this.c.setImageDrawable(drawable);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
            this.b.setImageDrawable(drawable);
        }
    }

    public ViewGroup setSubTitle(@StringRes int i, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.e.setOnClickListener(onClickListener);
        }
        return setSubTitle(getResources().getString(i));
    }

    public ViewGroup setTitle(@StringRes int i) {
        return setTitle(getResources().getString(i));
    }

    public ViewGroup setButton(@StringRes int i, View.OnClickListener onClickListener) {
        return setButton(getResources().getString(i), onClickListener);
    }
}
