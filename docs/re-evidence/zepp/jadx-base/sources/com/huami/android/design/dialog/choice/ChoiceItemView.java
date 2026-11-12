package com.huami.android.design.dialog.choice;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.R;
import com.huami.android.design.dialog.ViewUtils;

/* JADX INFO: loaded from: classes4.dex */
public class ChoiceItemView extends FrameLayout implements Checkable {
    private Context a;
    private TextView b;
    private TextView c;
    private View d;
    private View e;
    private ImageView f;
    private TextView g;
    private TextView h;
    private View i;
    private CheckBox j;
    private ColorView k;
    private ChoiceItemInfo l;

    public class a implements Runnable {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a || ChoiceItemView.this.i != null) {
                if (ChoiceItemView.this.i == null) {
                    ChoiceItemView choiceItemView = ChoiceItemView.this;
                    choiceItemView.i = choiceItemView.getMaskView();
                }
                if (!((Boolean) ChoiceItemView.this.i.getTag()).booleanValue()) {
                    ChoiceItemView.this.i.setLayoutParams(new FrameLayout.LayoutParams(ChoiceItemView.this.getMeasuredWidth(), ChoiceItemView.this.getMeasuredHeight()));
                    ChoiceItemView choiceItemView2 = ChoiceItemView.this;
                    choiceItemView2.addView(choiceItemView2.i, ChoiceItemView.this.getChildCount());
                    ChoiceItemView.this.i.setTag(Boolean.TRUE);
                }
                ChoiceItemView.this.i.setVisibility(this.a ? 0 : 8);
            }
        }
    }

    public ChoiceItemView(Context context) {
        this(context, null);
    }

    private void d() {
        FrameLayout.inflate(this.a, R.layout.abcd_view_choice_item, this);
        this.e = findViewById(R.id.start_arrow);
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.summary);
        this.d = findViewById(R.id.bottom_divider);
    }

    private void e() {
        if (this.j == null) {
            CheckBox checkBox = new CheckBox(this.a);
            this.j = checkBox;
            checkBox.setButtonDrawable(R.drawable.checkbox_style);
            this.j.setFocusable(false);
            this.j.setClickable(false);
            this.j.setFocusableInTouchMode(false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388629;
            this.j.setLayoutParams(layoutParams);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content);
            linearLayout.addView(this.j, linearLayout.getChildCount());
        }
    }

    private void f() {
        if (this.k == null) {
            this.k = new ColorView(this.a);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dialog_color_size);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 8388629;
            this.k.setLayoutParams(layoutParams);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content);
            linearLayout.addView(this.k, linearLayout.getChildCount());
        }
    }

    private void g() {
        this.f = new ImageView(this.a);
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.choice_icon_margin_end);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(dimensionPixelOffset);
        layoutParams.gravity = 16;
        this.f.setLayoutParams(layoutParams);
        ((LinearLayout) findViewById(R.id.content)).addView(this.f, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getMaskView() {
        View view = new View(this.a);
        view.setFocusable(true);
        view.setVisibility(8);
        view.setTag(Boolean.FALSE);
        return view;
    }

    private void h() {
        TextView textView = new TextView(this.a);
        this.h = textView;
        textView.setTextSize(2, 11.3f);
        this.h.setTextColor(ContextCompat.getColor(this.a, R.color.s3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        this.h.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content);
        linearLayout.addView(this.h, linearLayout.getChildCount());
    }

    private void i() {
        TextView textView = new TextView(this.a);
        this.g = textView;
        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.item_title_size));
        if (isChecked()) {
            this.g.setTextColor(ContextCompat.getColor(this.a, R.color.p3));
        } else {
            this.g.setTextColor(ContextCompat.getColor(this.a, R.color.s3));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        this.g.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content);
        linearLayout.addView(this.g, linearLayout.getChildCount());
    }

    private void setCheckedExtra(boolean z) {
        TextView textView = this.g;
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        this.g.setTextColor(ContextCompat.getColor(this.a, z ? R.color.p3 : R.color.s1));
    }

    private void setColorRes(@ColorRes int i) {
        if (i >= 0) {
            if (this.k == null) {
                f();
            }
            this.k.setColor(ContextCompat.getColor(this.a, i));
        }
    }

    private void setDividerColor(int i) {
        this.d.setBackground(null);
        this.d.setBackgroundColor(getResources().getColor(i));
    }

    private void setDividerStyle(boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        if (z) {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
        } else {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.common_item_padding);
            layoutParams.setMarginEnd(dimensionPixelOffset);
            layoutParams.setMarginStart(dimensionPixelOffset);
        }
        this.d.setLayoutParams(layoutParams);
    }

    private void setIconRes(@DrawableRes int i) {
        if (i <= 0) {
            ImageView imageView = this.f;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f == null) {
            g();
        }
        if (this.f.getVisibility() != 0) {
            this.f.setVisibility(0);
        }
        this.f.setBackgroundResource(i);
    }

    private void setStyle(boolean z) {
        setDividerStyle(z);
        if (z) {
            this.b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.item_title_small_size));
        } else {
            this.b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.item_title_size));
        }
    }

    private void setSummary(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.setText(charSequence);
        }
    }

    private void setTipValue(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.h;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.h == null) {
            h();
        }
        if (this.h.getVisibility() != 0) {
            this.h.setVisibility(0);
        }
        this.h.setText(charSequence);
    }

    private void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setText(charSequence);
        }
    }

    private void setValue(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.g;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.g == null) {
            i();
        }
        if (this.g.getVisibility() != 0) {
            this.g.setVisibility(0);
        }
        this.g.setText(charSequence);
    }

    public void bindData(ChoiceItemInfo choiceItemInfo) {
        this.l = choiceItemInfo;
        setMaskViewShow(choiceItemInfo.showMaskView);
        setTitle(choiceItemInfo.title);
        setSummary(choiceItemInfo.summary);
        setValue(choiceItemInfo.value);
        setTipValue(choiceItemInfo.tipValue);
        setIconRes(choiceItemInfo.icon);
        setColorRes(choiceItemInfo.color);
        if (choiceItemInfo.hasCheckBox) {
            e();
            this.j.setChecked(choiceItemInfo.checked);
            this.e.setVisibility(8);
            if (!choiceItemInfo.checkboxEnable) {
                this.j.setEnabled(false);
            }
        }
        setStyle(choiceItemInfo.isSmallStyle);
        int i = choiceItemInfo.dividerColor;
        if (i > 0) {
            setDividerColor(i);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        if (this.l.hasCheckBox) {
            return this.j.isChecked();
        }
        return this.e.getVisibility() == 0;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.l.hasCheckBox) {
            this.j.setChecked(z);
        } else if (z) {
            this.e.setVisibility(0);
            this.b.setTextColor(ContextCompat.getColor(this.a, R.color.p3));
        } else {
            this.e.setVisibility(8);
            this.b.setTextColor(ContextCompat.getColor(this.a, this.l.showMaskView ? R.color.s3 : R.color.s1));
        }
        setCheckedExtra(z);
    }

    public void setDividerVisible(boolean z) {
        View view = this.d;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setHeight(float f) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = (int) ViewUtils.dp2px(getContext(), f);
        linearLayout.setLayoutParams(layoutParams);
    }

    public void setMaskViewShow(boolean z) {
        post(new a(z));
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public ChoiceItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChoiceItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
        setBackgroundResource(R.color.s38);
        d();
    }

    private void setSummary(@StringRes int i) {
        if (i <= 0) {
            this.c.setVisibility(0);
            this.c.setText(i);
        } else {
            this.c.setVisibility(8);
        }
    }

    private void setTitle(@StringRes int i) {
        if (i <= 0) {
            this.b.setVisibility(0);
            this.b.setText(i);
        } else {
            this.b.setVisibility(8);
        }
    }
}
