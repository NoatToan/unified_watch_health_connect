package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.b98;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEmojiTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b98 f1575b;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.f1574a = textView;
        this.f1575b = new b98(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1575b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1575b.b();
    }

    public void c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f1574a.getContext().obtainStyledAttributes(attributeSet, z5j.i0, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(z5j.w0) ? typedArrayObtainStyledAttributes.getBoolean(z5j.w0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void d(boolean z) {
        this.f1575b.c(z);
    }

    public void e(boolean z) {
        this.f1575b.d(z);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f1575b.e(transformationMethod);
    }
}
