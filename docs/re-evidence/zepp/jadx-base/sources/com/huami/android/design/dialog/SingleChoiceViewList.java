package com.huami.android.design.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.android.design.dialog.choice.ChoiceItemInfo;

/* JADX INFO: loaded from: classes4.dex */
public class SingleChoiceViewList extends FrameLayout {
    private TextView a;
    private View b;

    public SingleChoiceViewList(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        FrameLayout.inflate(getContext(), R.layout.abcd_dialog_single_choice_list, this);
        this.a = (TextView) findViewById(R.id.dialog_title);
        this.b = findViewById(R.id.dialog_divider);
    }

    public void bindData(@NonNull ChoiceItemInfo choiceItemInfo) {
        setTitle(choiceItemInfo.title, choiceItemInfo.strikeThroughLength);
        int i = choiceItemInfo.color;
        if (i > 0) {
            this.a.setTextColor(getColorInt(i));
        }
    }

    @ColorInt
    public int getColorInt(int i) {
        try {
            return getResources().getColor(i);
        } catch (Resources.NotFoundException unused) {
            return i;
        }
    }

    public void setDividerVisible(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }

    public void setTitle(CharSequence charSequence, int i) {
        this.a.setText(charSequence, TextView.BufferType.SPANNABLE);
        ((Spannable) this.a.getText()).setSpan(new StrikethroughSpan(), 0, i, 33);
    }

    public SingleChoiceViewList(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SingleChoiceViewList(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
