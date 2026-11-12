package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes5.dex */
public abstract class yn7 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ProgressBar C;
    public final TextView D;
    public final TextView E;

    public yn7(Object obj, View view, int i, TextView textView, TextView textView2, ProgressBar progressBar, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = progressBar;
        this.D = textView3;
        this.E = textView4;
    }

    public static yn7 A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static yn7 B0(View view, Object obj) {
        return (yn7) ViewDataBinding.k(obj, view, sti.h);
    }
}
