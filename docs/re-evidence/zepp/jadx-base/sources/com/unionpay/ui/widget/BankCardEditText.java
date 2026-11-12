package com.unionpay.ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes18.dex */
public class BankCardEditText extends AppCompatEditText {
    private boolean a;
    private final String b;
    private int c;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            BankCardEditText.this.b(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public BankCardEditText(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Editable editable) {
        if (this.a) {
            this.a = false;
            return;
        }
        this.a = true;
        String strReplaceAll = editable.toString().trim().replaceAll(" ", "");
        int length = strReplaceAll.length();
        int selectionStart = getSelectionStart();
        int length2 = editable.toString().trim().length();
        boolean z = selectionStart >= editable.toString().trim().length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(strReplaceAll.charAt(i));
            if ((i == 3 || i == 7 || i == 11 || i == 15) && i != length - 1) {
                sb.append(" ");
            }
        }
        int length3 = sb.length();
        setText(sb.toString());
        if (z) {
            setSelection(length3);
        } else {
            if (length2 >= this.c && " ".equals(String.valueOf(sb.charAt(selectionStart - 1)))) {
                selectionStart++;
            }
            setSelection(selectionStart);
        }
        this.c = sb.length();
    }

    private void c() {
        b(getText());
        this.a = false;
        setFocusable(true);
        setEnabled(true);
        setFocusableInTouchMode(true);
        addTextChangedListener(new a());
    }

    public String getBankCardText() {
        return getText().toString().trim().replaceAll(" ", "");
    }

    public BankCardEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BankCardEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        this.b = " ";
        this.c = 0;
        c();
    }
}
