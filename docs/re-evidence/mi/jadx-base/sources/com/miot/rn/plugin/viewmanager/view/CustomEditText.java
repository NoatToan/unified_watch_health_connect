package com.miot.rn.plugin.viewmanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/* JADX INFO: loaded from: classes5.dex */
public class CustomEditText extends EditText {
    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public void onEditorAction(int i) {
        super.onEditorAction(i);
        if (i == 6) {
            clearFocus();
        }
    }
}
