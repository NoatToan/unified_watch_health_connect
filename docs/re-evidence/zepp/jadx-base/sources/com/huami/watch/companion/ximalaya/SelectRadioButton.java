package com.huami.watch.companion.ximalaya;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class SelectRadioButton extends AppCompatRadioButton {
    public SelectRadioButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            setBackgroundResource(R.drawable.bg_radiobutton_selected);
            setTextColor(-1);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            setBackgroundResource(R.drawable.bg_radiobutton_normal);
            setTextColor(-16777216);
        }
        return super.onTouchEvent(motionEvent);
    }

    public SelectRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SelectRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
