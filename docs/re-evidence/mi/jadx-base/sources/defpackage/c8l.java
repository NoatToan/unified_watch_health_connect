package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes8.dex */
public class c8l {
    public static Drawable a(Context context, int i, int i2) {
        try {
            Drawable drawableB = doq.b(context.getResources(), i, null);
            Drawable.ConstantState constantState = drawableB.getConstantState();
            Drawable drawableMutate = k47.r(constantState == null ? drawableB : constantState.newDrawable()).mutate();
            drawableMutate.setBounds(0, 0, drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight());
            k47.n(drawableMutate, ni4.c(context, i2));
            return drawableMutate;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
