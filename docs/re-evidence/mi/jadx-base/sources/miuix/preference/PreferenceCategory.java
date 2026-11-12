package miuix.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.eii;
import defpackage.n5j;
import defpackage.p5q;

/* JADX INFO: loaded from: classes3.dex */
public class PreferenceCategory extends androidx.preference.PreferenceCategory {
    public boolean i;

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p5q.a(context, eii.q, R.attr.preferenceCategoryStyle));
    }

    public void A(boolean z) {
        this.i = z;
    }

    public boolean y() {
        return !TextUtils.isEmpty(getTitle());
    }

    public boolean z() {
        return this.i;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.F1, i, i2);
        A(typedArrayObtainStyledAttributes.getBoolean(n5j.G1, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
