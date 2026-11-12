package com.xiaomi.hm.health.lab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Chronometer;
import com.huami.widget.typeface.TypefaceManager;

/* JADX INFO: loaded from: classes21.dex */
public class TypefaceChronometer extends Chronometer {
    public TypefaceChronometer(Context context) {
        super(context);
    }

    public TypefaceChronometer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypefaceManager.get().applyTypeface(this, attributeSet);
    }

    public TypefaceChronometer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypefaceManager.get().applyTypeface(this, attributeSet);
    }
}
