package c22;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final void a(View view2, Context context, int i14, float f14, float f15) {
        view2.getClass();
        context.getClass();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        b bVar = b.f23007a;
        float dimension = view2.getResources().getDimension(i14);
        bVar.getClass();
        layoutParams.width = MathKt.c(b.d(context, dimension, f14, f15));
        layoutParams.height = MathKt.c(b.d(context, view2.getResources().getDimension(i14), f14, f15));
    }

    public static final SpannableString b(String str, float f14, Context context, float f15) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan((int) b.b(context, f14, f15)), 0, spannableString.length(), 33);
        return spannableString;
    }
}
