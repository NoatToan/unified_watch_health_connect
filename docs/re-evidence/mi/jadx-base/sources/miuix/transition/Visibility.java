package miuix.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.u5j;

/* JADX INFO: loaded from: classes3.dex */
public class Visibility extends a {
    public static final String[] C = {"android:visibility:visibility", "android:visibility:parent"};
    public int A;
    public boolean B;

    public Visibility() {
        this.A = 3;
        this.B = false;
    }

    public int e() {
        return this.A;
    }

    public void f(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.A = i;
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = 3;
        this.B = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u5j.B);
        int i = typedArrayObtainStyledAttributes.getInt(u5j.C, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            f(i);
        }
    }
}
