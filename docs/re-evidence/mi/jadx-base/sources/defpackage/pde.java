package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pde extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final View C;
    public final TextView D;

    public pde(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, View view2, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = view2;
        this.D = textView2;
    }
}
