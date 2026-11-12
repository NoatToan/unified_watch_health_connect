package com.huami.android.design.dialog;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.android.design.dialog.choice.ChoiceItemInfo;

/* JADX INFO: loaded from: classes4.dex */
public class MultiChoiceView extends RelativeLayout implements Checkable {
    public static final int RED_CHECKBOX_STYLE = 1;
    private Context a;
    private ImageView b;
    private TextView c;
    private CheckBox d;
    private View e;

    public MultiChoiceView(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        RelativeLayout.inflate(this.a, R.layout.abcd_dialog_multi_choice, this);
        this.c = (TextView) findViewById(R.id.dialog_title);
        this.d = (CheckBox) findViewById(R.id.dialog_checkbox);
        this.e = findViewById(R.id.dialog_divider);
    }

    private void b() {
        this.b = new ImageView(this.a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(this.a.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
        this.b.setLayoutParams(layoutParams);
        addView(this.b);
        setTitleMarginStart(R.dimen.dialog_multi_choice_title_start_margin);
    }

    private void setCheckboxStyle(int i) {
        if (i == 1) {
            this.d.setButtonDrawable(ContextCompat.getDrawable(this.a, R.drawable.red_checkbox));
        }
    }

    private void setTitleMarginStart(@DimenRes int i) {
        ((RelativeLayout.LayoutParams) this.c.getLayoutParams()).setMarginStart(this.a.getResources().getDimensionPixelSize(i));
    }

    public void bindData(ChoiceItemInfo choiceItemInfo) {
        setTitle(choiceItemInfo.title, choiceItemInfo.strikeThroughLength);
        setIconRes(choiceItemInfo.icon, choiceItemInfo.iconTintColor);
        setChecked(choiceItemInfo.checked);
        setCheckboxEnable(choiceItemInfo.checkboxEnable);
        setCheckboxStyle(choiceItemInfo.checkboxStyle);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.d.isChecked();
    }

    public void setCheckboxEnable(boolean z) {
        this.d.setEnabled(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.d.setChecked(z);
    }

    public void setDividerVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    public void setIconRes(@DrawableRes int i, @ColorRes int i2) {
        if (i > 0) {
            if (this.b == null) {
                b();
            }
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
            this.b.setBackgroundResource(i);
        } else {
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(8);
                setTitleMarginStart(R.dimen.common_item_padding);
            }
        }
        ImageView imageView2 = this.b;
        if (imageView2 == null || imageView2.getVisibility() != 0 || i2 == -1) {
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(this.b.getBackground().mutate());
        DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, i2));
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        this.b.setBackground(drawableWrap);
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, 0);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.d.toggle();
    }

    public MultiChoiceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setTitle(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        if (i == 0) {
            this.c.setText(charSequence);
        } else {
            this.c.setText(charSequence, TextView.BufferType.SPANNABLE);
            ((Spannable) this.c.getText()).setSpan(new StrikethroughSpan(), 0, i, 33);
        }
    }

    public MultiChoiceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
        a();
    }
}
