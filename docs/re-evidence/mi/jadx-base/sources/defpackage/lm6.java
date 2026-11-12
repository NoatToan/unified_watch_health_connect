package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class lm6 extends ViewDataBinding {
    public final FrameLayout A;
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    public lm6(Object obj, View view, int i, FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = linearLayout;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
    }
}
