package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import defpackage.fpi;
import defpackage.h2j;
import defpackage.ia8;
import defpackage.u8p;

/* JADX INFO: loaded from: classes5.dex */
public class c extends ia8 {
    public final TextWatcher e;
    public final TextInputLayout.f f;
    public final TextInputLayout.g g;

    public class a extends u8p {
        public a() {
        }

        @Override // defpackage.u8p, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c cVar = c.this;
            cVar.c.setChecked(!cVar.g());
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            c cVar = c.this;
            cVar.c.setChecked(!cVar.g());
            editText.removeTextChangedListener(c.this.e);
            editText.addTextChangedListener(c.this.e);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.c$c, reason: collision with other inner class name */
    public class C0224c implements TextInputLayout.g {

        /* JADX INFO: renamed from: com.google.android.material.textfield.c$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EditText f8916a;

            public a(EditText editText) {
                this.f8916a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8916a.removeTextChangedListener(c.this.e);
            }
        }

        public C0224c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = c.this.f20937a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (c.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            c.this.f20937a.S();
        }
    }

    public c(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new a();
        this.f = new b();
        this.g = new C0224c();
    }

    public static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // defpackage.ia8
    public void a() {
        TextInputLayout textInputLayout = this.f20937a;
        int i = this.d;
        if (i == 0) {
            i = fpi.f18063a;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f20937a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(h2j.R));
        this.f20937a.setEndIconVisible(true);
        this.f20937a.setEndIconCheckable(true);
        this.f20937a.setEndIconOnClickListener(new d());
        this.f20937a.addOnEditTextAttachedListener(this.f);
        this.f20937a.addOnEndIconChangedListener(this.g);
        EditText editText = this.f20937a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean g() {
        EditText editText = this.f20937a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
