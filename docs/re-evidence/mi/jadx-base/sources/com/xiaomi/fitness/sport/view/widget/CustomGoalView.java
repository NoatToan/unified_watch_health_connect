package com.xiaomi.fitness.sport.view.widget;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.xri;
import defpackage.zxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/CustomGoalView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "goalEditText", "Landroid/widget/EditText;", "getGoalEditText", "()Landroid/widget/EditText;", "setGoalEditText", "(Landroid/widget/EditText;)V", "unit", "Landroid/widget/TextView;", "getUnit", "()Landroid/widget/TextView;", "setUnit", "(Landroid/widget/TextView;)V", "space", "getSpace", "setSpace", "initView", "", "setHint", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomGoalView extends LinearLayout {
    public EditText goalEditText;
    public TextView space;
    public TextView unit;

    public CustomGoalView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(dvi.p1, (ViewGroup) this, true);
        initView();
    }

    private final void initView() {
        setGoalEditText((EditText) findViewById(xri.S1));
        setUnit((TextView) findViewById(xri.e8));
        setSpace((TextView) findViewById(xri.i6));
        setHint();
        CharSequence quantityText = getResources().getQuantityText(zxi.common_unit_kilometer, 0);
        Intrinsics.checkNotNull(quantityText, "null cannot be cast to non-null type kotlin.String");
        getUnit().setText((String) quantityText);
        getGoalEditText().addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.sport.view.widget.CustomGoalView.initView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Intrinsics.checkNotNullParameter(s, "s");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Intrinsics.checkNotNullParameter(s, "s");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(s, "s");
                String string = CustomGoalView.this.getGoalEditText().getText().toString();
                if (Intrinsics.areEqual(".", string)) {
                    string = "0.";
                }
                CustomGoalView.this.getUnit().setText(CustomGoalView.this.getResources().getQuantityText(zxi.common_unit_kilometer, (int) (string.length() > 0 ? Float.parseFloat(string) : 0.0f)));
                if (s.length() > 0) {
                    CustomGoalView.this.getGoalEditText().setHint("");
                    CustomGoalView.this.getSpace().setVisibility(8);
                } else {
                    CustomGoalView.this.setHint();
                    CustomGoalView.this.getSpace().setVisibility(0);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHint() {
        SpannableString spannableString = new SpannableString(getResources().getString(c1j.m));
        spannableString.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString.length(), 33);
        getGoalEditText().setHint(new SpannedString(spannableString));
    }

    @NotNull
    public final EditText getGoalEditText() {
        EditText editText = this.goalEditText;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goalEditText");
        return null;
    }

    @NotNull
    public final TextView getSpace() {
        TextView textView = this.space;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("space");
        return null;
    }

    @NotNull
    public final TextView getUnit() {
        TextView textView = this.unit;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("unit");
        return null;
    }

    public final void setGoalEditText(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.goalEditText = editText;
    }

    public final void setSpace(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.space = textView;
    }

    public final void setUnit(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.unit = textView;
    }
}
