package com.huawei.ui.commonui.activetips;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qrs;
import defpackage.qsp;
import java.util.Objects;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveTipsTextView extends HealthTextView {
    private boolean e;

    public ActiveTipsTextView(Context context) {
        super(context);
    }

    public ActiveTipsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ActiveTipsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActiveTipsTextView);
        this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ActiveTipsTextView_isNeedAutoFocus, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.huawei.uikit.hwtextview.widget.HwTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (Objects.equals(charSequence, getText())) {
            return;
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (this.e) {
            return qsp.e(this) || qrs.y();
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (z) {
            super.onWindowFocusChanged(true);
        }
    }

    public void setAutoFocus(boolean z) {
        this.e = z;
    }
}
