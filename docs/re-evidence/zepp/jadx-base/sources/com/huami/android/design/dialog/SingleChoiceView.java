package com.huami.android.design.dialog;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.choice.ChoiceItemInfo;
import com.huami.android.design.dialog.choice.ColorView;

/* JADX INFO: loaded from: classes4.dex */
public class SingleChoiceView extends FrameLayout implements Checkable {
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private View e;
    private ColorView f;
    private Context g;
    private View h;

    public SingleChoiceView(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        FrameLayout.inflate(this.g, R.layout.abcd_dialog_single_choice, this);
        this.a = (ImageView) findViewById(R.id.dialog_image);
        this.b = (TextView) findViewById(R.id.dialog_title);
        this.c = (TextView) findViewById(R.id.dialog_sub_title);
        this.d = (TextView) findViewById(R.id.dialog_tips_tv);
        this.e = findViewById(R.id.dialog_divider);
        this.h = findViewById(R.id.item_content);
    }

    private void b() {
        if (this.f == null) {
            this.f = new ColorView(this.g);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dialog_color_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 8388629;
            layoutParams.setMarginEnd(this.g.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
            this.f.setLayoutParams(layoutParams);
            addView(this.f);
        }
    }

    private void setColorRes(@ColorRes int i) {
        if (i >= 0) {
            if (this.f == null) {
                b();
            }
            this.f.setColor(ContextCompat.getColor(this.g, i));
        }
    }

    public void bindData(ChoiceItemInfo choiceItemInfo) {
        setTitle(choiceItemInfo.title, choiceItemInfo.strikeThroughLength);
        setSummary(choiceItemInfo.summary);
        setTips(choiceItemInfo.tips);
        setColorRes(choiceItemInfo.color);
        int i = choiceItemInfo.arrowIcon;
        if (i > -1) {
            this.a.setImageDrawable(ContextCompat.getDrawable(this.g, i));
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.a.getVisibility() == 0;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (z) {
            this.a.setVisibility(0);
            this.h.setBackgroundResource(R.drawable.bg_dialog_single_choice_select);
        } else {
            this.a.setVisibility(8);
            this.h.setBackgroundResource(android.R.color.transparent);
        }
    }

    public void setDividerVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    public void setSummary(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.setText(charSequence);
        }
    }

    public void setTips(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.d.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, 0);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public SingleChoiceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setTitle(CharSequence charSequence, int i) {
        if (i == 0) {
            this.b.setText(charSequence);
        } else {
            this.b.setText(charSequence, TextView.BufferType.SPANNABLE);
            ((Spannable) this.b.getText()).setSpan(new StrikethroughSpan(), 0, i, 33);
        }
    }

    public SingleChoiceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = context;
        a();
    }
}
