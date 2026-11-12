package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f5163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c8.f f5164b;

    public k(TextView textView) {
        this.f5163a = textView;
        this.f5164b = new c8.f(textView, false);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f5164b.f25275a.a(inputFilterArr);
    }

    public final boolean b() {
        return this.f5164b.f25275a.b();
    }

    public final void c(AttributeSet attributeSet, int i14) {
        TypedArray typedArrayObtainStyledAttributes = this.f5163a.getContext().obtainStyledAttributes(attributeSet, h.a.f80429i, i14, 0);
        try {
            boolean z14 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z14);
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public final void d(boolean z14) {
        this.f5164b.f25275a.c(z14);
    }

    public final void e(boolean z14) {
        this.f5164b.f25275a.d(z14);
    }
}
