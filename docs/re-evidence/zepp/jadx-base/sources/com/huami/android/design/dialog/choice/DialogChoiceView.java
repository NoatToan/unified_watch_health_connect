package com.huami.android.design.dialog.choice;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.R;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class DialogChoiceView extends LinearLayout {
    private Context a;
    private TextView b;
    private ChoiceView c;

    public DialogChoiceView(Context context) {
        this(context, null);
    }

    @Deprecated
    public void setChoiceBuilder(ChoiceView.Builder builder) {
        if (builder != null) {
            this.c.setBuilder(builder);
        }
    }

    @Deprecated
    public void setTitle(@StringRes int i) {
        if (i > 0) {
            this.b.setText(i);
        }
    }

    public DialogChoiceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.b.setText(charSequence);
    }

    public DialogChoiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.item_title_size));
        this.b.setTextColor(ContextCompat.getColor(this.a, R.color.black80));
        addView(this.b);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 1;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dialog_choice_title_margin);
        layoutParams.topMargin = dimensionPixelSize;
        layoutParams.bottomMargin = dimensionPixelSize;
        View view = new View(this.a);
        view.setBackgroundColor(ContextCompat.getColor(this.a, R.color.divider));
        addView(view);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = getResources().getDimensionPixelSize(R.dimen.divider);
        ChoiceView choiceViewCreate = ChoiceView.Builder.with(this.a).create();
        this.c = choiceViewCreate;
        addView(choiceViewCreate);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
    }
}
