package com.xiaomi.hm.health.baseui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes19.dex */
public class TextLinkAdView extends LinearLayout {
    private static final String h = "com.xiaomi.hm.health";
    private static final String i = "com.huami.web.container.WebActivity";
    private static final String j = "com.xiaomi.hm.health.action.WEB_URL";
    private static final String k = "广告";
    private TextView a;

    @ColorInt
    private int b;
    private TextView c;

    @ColorInt
    private int d;
    private AdClickedListener e;
    private boolean f;
    private View g;

    public interface AdClickedListener {
        void onAdClicked();
    }

    public TextLinkAdView(@NonNull Context context) {
        this(context, null);
    }

    private int b(float f) {
        return (int) (TypedValue.applyDimension(1, f, getContext().getResources().getDisplayMetrics()) + 0.5f);
    }

    private Drawable c(@ColorInt int i2) {
        int iB = b(1.0f);
        int iB2 = b(1.9f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iB2);
        gradientDrawable.setStroke(iB, i2);
        return gradientDrawable;
    }

    private void d(final int i2, final String str) {
        setOnClickListener(new View.OnClickListener() { // from class: mn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e(i2, str, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i2, String str, View view) {
        if (i2 != 1) {
            return;
        }
        AdClickedListener adClickedListener = this.e;
        if (adClickedListener != null) {
            adClickedListener.onAdClicked();
        }
        f(str);
    }

    private void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ComponentName componentName = new ComponentName("com.xiaomi.hm.health", i);
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setComponent(componentName);
        intent.putExtra(j, str);
        getContext().startActivity(intent);
    }

    private void g() {
        TextView textView = new TextView(getContext());
        this.a = textView;
        textView.setVisibility(8);
        int i2 = this.b;
        this.a.setBackground(c(i2));
        this.a.setTextColor(i2);
        this.a.setTextSize(9.6f);
        this.a.setPadding(b(2.0f), 0, b(2.0f), 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, b(5.0f), 0);
        addView(this.a, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        TextView textView2 = new TextView(getContext());
        this.c = textView2;
        textView2.setTextSize(13.0f);
        this.c.setTextColor(this.d);
        frameLayout.addView(this.c, -2, -2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, 0, 80);
        View view = new View(getContext());
        this.g = view;
        view.setBackgroundColor(this.d);
        frameLayout.addView(this.g, layoutParams2);
        addView(frameLayout);
    }

    public void loadAd(boolean z, boolean z2, String str, int i2, String str2) {
        if (z && z2) {
            this.a.setVisibility(0);
            this.a.setText(k);
        } else {
            this.a.setVisibility(8);
        }
        this.c.setText(str);
        if (this.f) {
            this.g.getLayoutParams().width = (int) this.c.getPaint().measureText(str);
            this.g.getLayoutParams().height = b(0.33f);
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
        d(i2, str2);
    }

    public void setAdClickedListener(AdClickedListener adClickedListener) {
        this.e = adClickedListener;
    }

    public TextLinkAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextLinkAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TextLinkAdView, 0, i2);
        this.b = typedArrayObtainStyledAttributes.getColor(R.styleable.TextLinkAdView_badgeColor, InputDeviceCompat.SOURCE_ANY);
        this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.TextLinkAdView_textColor, -1);
        this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextLinkAdView_hasUnderline, false);
        typedArrayObtainStyledAttributes.recycle();
        g();
    }
}
