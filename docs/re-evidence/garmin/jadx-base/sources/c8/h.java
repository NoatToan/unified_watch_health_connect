package c8;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class h implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransformationMethod f25285a;

    public h(TransformationMethod transformationMethod) {
        this.f25285a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view2) {
        if (view2.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f25285a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view2);
        }
        if (charSequence == null || androidx.emoji2.text.d.a().c() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
        dVarA.getClass();
        return dVarA.h(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view2, CharSequence charSequence, boolean z14, int i14, Rect rect) {
        TransformationMethod transformationMethod = this.f25285a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view2, charSequence, z14, i14, rect);
        }
    }
}
