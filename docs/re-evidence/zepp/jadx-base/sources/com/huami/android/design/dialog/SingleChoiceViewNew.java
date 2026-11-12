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
public class SingleChoiceViewNew extends FrameLayout implements Checkable {
    private ImageView a;
    private TextView b;
    private TextView c;
    private View d;
    private ColorView e;
    private Context f;
    private boolean g;

    public SingleChoiceViewNew(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        FrameLayout.inflate(this.f, R.layout.abcd_dialog_single_choice_new, this);
        this.a = (ImageView) findViewById(R.id.dialog_image);
        this.b = (TextView) findViewById(R.id.dialog_title);
        this.c = (TextView) findViewById(R.id.dialog_sub_title);
        this.d = findViewById(R.id.dialog_divider);
    }

    private void b() {
        if (this.e == null) {
            this.e = new ColorView(this.f);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dialog_color_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 8388629;
            layoutParams.setMarginEnd(this.f.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
            this.e.setLayoutParams(layoutParams);
            addView(this.e);
        }
    }

    private void setColorRes(@ColorRes int i) {
        if (i >= 0) {
            if (this.e == null) {
                b();
            }
            this.e.setColor(ContextCompat.getColor(this.f, i));
        }
    }

    public void bindData(ChoiceItemInfo choiceItemInfo) {
        setTitle(choiceItemInfo.title, choiceItemInfo.strikeThroughLength);
        setSummary(choiceItemInfo.summary);
        setColorRes(choiceItemInfo.color);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.a.getVisibility() == 0;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (z) {
            this.a.setVisibility(0);
        } else {
            this.a.setVisibility(8);
        }
    }

    public void setDividerVisible(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    public void setSummary(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence, int i) {
        this.b.setText(charSequence, TextView.BufferType.SPANNABLE);
        ((Spannable) this.b.getText()).setSpan(new StrikethroughSpan(), 0, i, 33);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public SingleChoiceViewNew(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SingleChoiceViewNew(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
        this.f = context;
        a();
    }
}
