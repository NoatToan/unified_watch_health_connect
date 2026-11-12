package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ayq;
import defpackage.iqi;
import defpackage.kwi;
import defpackage.u8p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Chip f8919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f8920b;
    public final EditText c;
    public TextWatcher d;
    public TextView e;

    public class b extends u8p {
        public b() {
        }

        @Override // defpackage.u8p, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f8919a.setText(ChipTextInputComboView.this.d("00"));
            } else {
                ChipTextInputComboView.this.f8919a.setText(ChipTextInputComboView.this.d(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.c.setFilters(inputFilterArr);
    }

    public final String d(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    public TextInputLayout e() {
        return this.f8920b;
    }

    public void f(androidx.core.view.a aVar) {
        androidx.core.view.c.r0(this.f8919a, aVar);
    }

    public void g(CharSequence charSequence) {
        this.f8919a.setText(d(charSequence));
        if (TextUtils.isEmpty(this.c.getText())) {
            return;
        }
        this.c.removeTextChangedListener(this.d);
        this.c.setText((CharSequence) null);
        this.c.addTextChangedListener(this.d);
    }

    public final void h() {
        this.c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f8919a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f8919a.setChecked(z);
        this.c.setVisibility(z ? 0 : 4);
        this.f8919a.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            ayq.o(this.c);
            if (TextUtils.isEmpty(this.c.getText())) {
                return;
            }
            EditText editText = this.c;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f8919a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f8919a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f8919a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(kwi.f24374r, (ViewGroup) this, false);
        this.f8919a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(kwi.s, (ViewGroup) this, false);
        this.f8920b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.d = bVar;
        editText.addTextChangedListener(bVar);
        h();
        addView(chip);
        addView(textInputLayout);
        this.e = (TextView) findViewById(iqi.f21997r);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
