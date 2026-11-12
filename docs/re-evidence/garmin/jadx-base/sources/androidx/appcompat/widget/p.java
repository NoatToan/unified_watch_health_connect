package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class p extends PopupWindow {
    public p(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        a(context, attributeSet, i14, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i14, int i15) {
        w0 w0VarG = w0.g(context, attributeSet, h.a.f80440t, i14, i15);
        TypedArray typedArray = w0VarG.f5271b;
        if (typedArray.hasValue(2)) {
            setOverlapAnchor(typedArray.getBoolean(2, false));
        }
        setBackgroundDrawable(w0VarG.b(0));
        w0VarG.h();
    }

    public p(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        a(context, attributeSet, i14, i15);
    }
}
