package com.huami.lib.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.lib.view.R;

/* JADX INFO: loaded from: classes10.dex */
public class TipComponent extends LinearLayout {
    private ImageView a;
    private ImageView b;
    private View c;
    private TextView d;
    private TextView e;
    private LoadingView f;
    private ViewGroup g;

    public TipComponent(Context context) {
        this(context, null);
    }

    @Nullable
    private Drawable a(@DrawableRes int i) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i);
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.s1)));
        }
        return drawable;
    }

    private void b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.tipComponent);
        setIcon(typedArrayObtainStyledAttributes.getDrawable(R.styleable.tipComponent_tipIcon));
        setActionIcon(typedArrayObtainStyledAttributes.getDrawable(R.styleable.tipComponent_tipEndIcon));
        setTitle(typedArrayObtainStyledAttributes.getString(R.styleable.tipComponent_tipTitle));
        setSubTitle(typedArrayObtainStyledAttributes.getString(R.styleable.tipComponent_tipSubTitle));
        setBottomAreaVisible(typedArrayObtainStyledAttributes.getBoolean(R.styleable.tipComponent_tipShowBottomArea, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c() {
        this.a = (ImageView) findViewById(R.id.tip_icon);
        this.b = (ImageView) findViewById(R.id.tip_action_icon);
        this.d = (TextView) findViewById(R.id.tip_title);
        this.e = (TextView) findViewById(R.id.tip_sub_title);
        this.c = findViewById(R.id.divider_vertical);
        this.f = (LoadingView) findViewById(R.id.loading_view);
        this.g = (ViewGroup) findViewById(R.id.loading_parent);
    }

    private Drawable d(Context context, int i, ColorStateList colorStateList) {
        Drawable drawableWrap = DrawableCompat.wrap(context.getResources().getDrawable(i));
        DrawableCompat.setTintList(drawableWrap, colorStateList);
        return drawableWrap;
    }

    private void setActionIcon(@DrawableRes int i) {
        if (i <= 0) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.c.setVisibility(0);
            this.b.setImageResource(i);
        }
    }

    public void clear() {
        stopLoading();
        setTitle((CharSequence) null);
        setSubTitle(null);
        setActionIcon(0);
        setOnClickListener(null);
        this.a.setVisibility(8);
    }

    public String getTitle() {
        TextView textView = this.d;
        return textView == null ? "" : textView.getText().toString();
    }

    public boolean isLoading() {
        return this.g.getVisibility() == 0;
    }

    public void setAction(@DrawableRes int i, View.OnClickListener onClickListener) {
        setAction(i, onClickListener, false);
    }

    public void setActionClose(View.OnClickListener onClickListener) {
        setAction(a(R.drawable.icon_common_close), onClickListener, false);
    }

    public void setActionGoto(View.OnClickListener onClickListener) {
        setAction(a(R.drawable.warn_set), onClickListener, true);
    }

    public void setActionHelp(View.OnClickListener onClickListener) {
        setAction(a(R.drawable.warn_help), onClickListener, false);
    }

    public void setActionRetry(View.OnClickListener onClickListener) {
        setAction(a(R.drawable.warn_retry), onClickListener, false);
    }

    public void setActionSearch(View.OnClickListener onClickListener) {
        setAction(a(R.drawable.warn_search), onClickListener, false);
    }

    public void setBottomAreaVisible(boolean z) {
        findViewById(R.id.bottom_area).setVisibility(z ? 0 : 8);
    }

    public void setDividerVisibility(int i) {
        findViewById(R.id.divider).setVisibility(i);
    }

    public ViewGroup setIcon(@DrawableRes int i) {
        if (this.a.getVisibility() != 0) {
            this.a.setVisibility(0);
        }
        this.a.setImageResource(i);
        return this;
    }

    public void setLoadingVisibility(int i) {
        this.g.setVisibility(i);
    }

    public void setSubTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setText(charSequence);
        }
    }

    public void setSuccess(LoadingView.OnAnimEndListener onAnimEndListener) {
        this.f.setSuccess(onAnimEndListener);
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.d.setText(charSequence);
        }
    }

    public void setWarningStyle(CharSequence charSequence, CharSequence charSequence2) {
        showWarningIcon();
        setTitle(charSequence);
        setSubTitle(charSequence2);
    }

    public void showWarningIcon() {
        setIcon(d(getContext(), R.drawable.ic_warning_error, ContextCompat.getColorStateList(getContext(), R.color.color_warning)));
    }

    public void startLoading() {
        if (this.g.getVisibility() != 0) {
            this.g.setVisibility(0);
        }
        this.f.startLoading();
    }

    public void stopLoading() {
        if (this.g.getVisibility() != 8) {
            this.g.setVisibility(8);
        }
        this.f.stopLoading();
    }

    public TipComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setAction(@DrawableRes int i, View.OnClickListener onClickListener, boolean z) {
        setActionIcon(i);
        if (z) {
            setOnClickListener(onClickListener);
        }
        this.b.setOnClickListener(onClickListener);
    }

    public TipComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.inflate(context, R.layout.view_tip_component, this);
        c();
        b(attributeSet);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.a.getVisibility() != 0) {
                this.a.setVisibility(0);
            }
            this.a.setImageDrawable(drawable);
        }
    }

    public void setAction(Drawable drawable, View.OnClickListener onClickListener, boolean z) {
        setActionIcon(drawable);
        if (z) {
            setOnClickListener(onClickListener);
        }
        this.b.setOnClickListener(onClickListener);
    }

    public void setTitle(@StringRes int i) {
        setTitle(getResources().getString(i));
    }

    public void setActionIcon(Drawable drawable) {
        if (drawable == null) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.c.setVisibility(0);
            this.b.setImageDrawable(drawable);
        }
    }
}
