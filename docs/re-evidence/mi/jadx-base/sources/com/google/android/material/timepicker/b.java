package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes5.dex */
public class b implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChipTextInputComboView f8953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChipTextInputComboView f8954b;
    public final TimeModel c;
    public boolean d = false;

    public b(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f8953a = chipTextInputComboView;
        this.f8954b = chipTextInputComboView2;
        this.c = timeModel;
    }

    public void a() {
        TextInputLayout textInputLayoutE = this.f8953a.e();
        TextInputLayout textInputLayoutE2 = this.f8954b.e();
        EditText editText = textInputLayoutE.getEditText();
        EditText editText2 = textInputLayoutE2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    public final void b(int i) {
        this.f8954b.setChecked(i == 12);
        this.f8953a.setChecked(i == 10);
        this.c.f = i;
    }

    public final boolean c(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null || i < 7 || i > 16 || keyEvent.getAction() != 1 || editText.getSelectionStart() != 2 || text.length() != 2) {
            return false;
        }
        b(12);
        return true;
    }

    public final boolean d(int i, KeyEvent keyEvent, EditText editText) {
        if (i != 67 || keyEvent.getAction() != 0 || !TextUtils.isEmpty(editText.getText())) {
            return false;
        }
        b(10);
        return true;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            b(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.d) {
            return false;
        }
        this.d = true;
        EditText editText = (EditText) view;
        boolean zD = this.c.f == 12 ? d(i, keyEvent, editText) : c(i, keyEvent, editText);
        this.d = false;
        return zD;
    }
}
