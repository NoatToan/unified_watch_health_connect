package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes7.dex */
public class j implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f11119a;

    public j(Rect rect) {
        this.f11119a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f14, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i14 = rect3.left;
        int i15 = i14 + ((int) ((rect4.left - i14) * f14));
        int i16 = rect3.top;
        int i17 = i16 + ((int) ((rect4.top - i16) * f14));
        int i18 = rect3.right;
        int i19 = i18 + ((int) ((rect4.right - i18) * f14));
        int i24 = rect3.bottom;
        int i25 = i24 + ((int) ((rect4.bottom - i24) * f14));
        Rect rect5 = this.f11119a;
        if (rect5 == null) {
            return new Rect(i15, i17, i19, i25);
        }
        rect5.set(i15, i17, i19, i25);
        return rect5;
    }

    public j() {
    }
}
