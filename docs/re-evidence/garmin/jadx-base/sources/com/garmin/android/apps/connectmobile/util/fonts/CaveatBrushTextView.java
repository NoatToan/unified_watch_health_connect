package com.garmin.android.apps.connectmobile.util.fonts;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import h22.a;
import v22.d;

/* JADX INFO: loaded from: classes10.dex */
public class CaveatBrushTextView extends TextView {
    public CaveatBrushTextView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        setTypeface(a.a("font/caveat_brush_regular.ttf", context));
        d.a(this, 1.3f);
    }

    public CaveatBrushTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTypeface(a.a("font/caveat_brush_regular.ttf", context));
        d.a(this, 1.3f);
    }

    public CaveatBrushTextView(Context context) {
        super(context);
        setTypeface(a.a("font/caveat_brush_regular.ttf", context));
        d.a(this, 1.3f);
    }
}
