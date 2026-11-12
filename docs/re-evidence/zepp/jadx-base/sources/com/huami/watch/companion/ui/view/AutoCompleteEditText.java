package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.huami.watch.companionlib.R;
import com.huami.watch.util.ArraysUtil;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class AutoCompleteEditText extends AppCompatAutoCompleteTextView implements TextWatcher {
    private Drawable a;
    private ArrayAdapter<String> b;
    private HistoryCallback c;
    private String d;

    public interface HistoryCallback {
        void onClear();

        void onFilterChange(String str);
    }

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (!AutoCompleteEditText.this.getContext().getString(R.string.clear_history).equals(AutoCompleteEditText.this.b.getItem(i)) || AutoCompleteEditText.this.c == null) {
                return;
            }
            AutoCompleteEditText.this.c.onClear();
        }
    }

    public AutoCompleteEditText(Context context) {
        this(context, null);
    }

    private void c() {
        Drawable drawable = getCompoundDrawables()[2];
        this.a = drawable;
        if (drawable == null) {
            this.a = getResources().getDrawable(R.drawable.btn_edit_text_clear_selector);
        }
        Drawable drawable2 = this.a;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.a.getIntrinsicHeight());
        setClearIconVisible(false);
        addTextChangedListener(this);
    }

    private void d() {
        setOnItemClickListener(new a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setClearIconVisible(getText().length() > 0);
        } else {
            setClearIconVisible(false);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (isFocused()) {
            setClearIconVisible(charSequence.length() > 0);
        }
        if (getContext().getString(R.string.clear_history).equals(charSequence.toString())) {
            setText(this.d);
            return;
        }
        String string = charSequence.toString();
        this.d = string;
        HistoryCallback historyCallback = this.c;
        if (historyCallback != null) {
            historyCallback.onFilterChange(string);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (getCompoundDrawables()[2] != null) {
                if (motionEvent.getX() > ((float) (getWidth() - getTotalPaddingRight())) && motionEvent.getX() < ((float) (getWidth() - getPaddingRight()))) {
                    setText("");
                }
            }
            if (this.b.getCount() > 0) {
                showDropDown();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClearIconVisible(boolean z) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], z ? this.a : null, getCompoundDrawablesRelative()[3]);
    }

    public void setHistory(List<String> list) {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line);
        this.b = arrayAdapter;
        arrayAdapter.addAll(list);
        if (!ArraysUtil.isEmpty(list)) {
            this.b.add(getContext().getString(R.string.clear_history));
        }
        setAdapter(this.b);
    }

    public void setHistoryCallback(HistoryCallback historyCallback) {
        this.c = historyCallback;
    }

    public AutoCompleteEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.editTextStyle);
    }

    public AutoCompleteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = "";
        c();
        d();
    }
}
