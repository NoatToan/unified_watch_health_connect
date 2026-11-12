package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.huami.lib.view.ViewUtils;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes22.dex */
public class CustomSpinnerTab extends FrameLayout {
    private TextView a;
    private ImageView b;

    @ColorInt
    private int c;

    @ColorInt
    private int d;

    public CustomSpinnerTab(Context context) {
        super(context);
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CustomSpinnerTab);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CustomSpinnerTab_textAppearance, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CustomSpinnerTab_drawablePadding, (int) ViewUtils.dp2px(getContext(), 4.0f));
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.CustomSpinnerTab_normalIconColor, ContextCompat.getColor(context, R.color.black20));
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.CustomSpinnerTab_selectedIconColor, ContextCompat.getColor(context, R.color.pumpkin_orange));
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.CustomSpinnerTab_text);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CustomSpinnerTab_icon);
        typedArrayObtainStyledAttributes.recycle();
        this.c = color;
        this.d = color2;
        FrameLayout.inflate(context, R.layout.custom_spinner_tab, this);
        this.a = (TextView) findViewById(R.id.spinner_text);
        this.b = (ImageView) findViewById(R.id.spinner_icon);
        TextViewCompat.setTextAppearance(this.a, resourceId);
        this.a.setText(string);
        if (drawable != null) {
            ImageView imageView = this.b;
            if (isSelected()) {
                color = color2;
            }
            imageView.setImageDrawable(TintUtils.tintDrawable(drawable, color));
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.setMarginEnd(dimensionPixelSize);
        this.a.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        if (z2) {
            TintUtils.tintDrawable(this.b, z ? this.d : this.c);
            this.b.animate().rotation(z ? 180.0f : 0.0f);
        }
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    public CustomSpinnerTab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public CustomSpinnerTab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
