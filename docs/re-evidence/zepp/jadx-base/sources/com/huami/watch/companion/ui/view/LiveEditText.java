package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes16.dex */
public class LiveEditText extends AppCompatEditText {
    private MutableLiveData<String> a;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LiveEditText.this.a.postValue(charSequence.toString());
        }
    }

    public LiveEditText(Context context) {
        super(context);
        this.a = new MutableLiveData<>();
        b();
    }

    private void b() {
        this.a.postValue("");
        addTextChangedListener(new a());
    }

    public LiveData<String> getLiveText() {
        return this.a;
    }

    public LiveEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new MutableLiveData<>();
        b();
    }

    public LiveEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new MutableLiveData<>();
        b();
    }
}
