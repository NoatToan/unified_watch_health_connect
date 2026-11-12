package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class fxk {
    /* JADX WARN: Multi-variable type inference failed */
    public static exk a(View view) {
        View view2 = view;
        while (!(view2 instanceof exk)) {
            Object parent = view2.getParent();
            if (parent == null) {
                return null;
            }
            sk1.a(parent instanceof View);
            view2 = (View) parent;
        }
        return (exk) view2;
    }
}
