package com.xiaomi.hm.health.device.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.devicex.R;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;

/* JADX INFO: loaded from: classes19.dex */
public class VerifyCodeView extends RelativeLayout {
    private TextView[] a;
    private EditText b;
    private String c;
    private EmptyCallback d;

    public interface EmptyCallback {
        void onEmpty();

        void onNotEmpty();
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            VerifyCodeView.this.c = editable.toString();
            if (VerifyCodeView.this.c.isEmpty()) {
                VerifyCodeView.this.d.onEmpty();
            } else {
                VerifyCodeView.this.d.onNotEmpty();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = i3 - i2;
            if (i4 > 0) {
                int i5 = i3 + i;
                if (i5 < 4) {
                    VerifyCodeView.this.a[i5].setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, R.drawable.underline_verify_code_special);
                }
                VerifyCodeView.this.a[i].setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, R.drawable.underline_verify_code_normal);
                return;
            }
            if (i4 < 0) {
                int i6 = i2 + i;
                if (i6 < 4) {
                    VerifyCodeView.this.a[i6].setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, R.drawable.underline_verify_code_normal);
                }
                VerifyCodeView.this.a[i].setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, R.drawable.underline_verify_code_special);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = i3 - i2;
            if (i4 > 0) {
                VerifyCodeView.this.a[i].setText(String.valueOf(charSequence.charAt(i)));
            } else if (i4 < 0) {
                VerifyCodeView.this.a[i].setText("");
            }
        }
    }

    public VerifyCodeView(Context context) {
        this(context, null);
    }

    private void e(Context context) {
        TextView[] textViewArr = new TextView[4];
        this.a = textViewArr;
        textViewArr[0] = (TextView) findViewById(R.id.verify_code_first);
        this.a[1] = (TextView) findViewById(R.id.verify_code_second);
        this.a[2] = (TextView) findViewById(R.id.verify_code_third);
        this.a[3] = (TextView) findViewById(R.id.verify_code_forth);
        g(context, this.a);
        EditText editText = (EditText) findViewById(R.id.verify_code_input);
        this.b = editText;
        editText.setCursorVisible(false);
    }

    private void f() {
        this.b.addTextChangedListener(new a());
    }

    private void g(Context context, TextView[] textViewArr) {
        for (TextView textView : textViewArr) {
            textView.setTypeface(TypefaceManager.get().getTypeface(context, Font.KM));
        }
    }

    public void clear() {
        this.b.setText("");
        for (int i = 0; i < 4; i++) {
            this.a[i].setText("");
        }
    }

    public String getContent() {
        return this.c;
    }

    public void setCallback(EmptyCallback emptyCallback) {
        this.d = emptyCallback;
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.view_verify_code, this);
        e(context);
        f();
    }
}
