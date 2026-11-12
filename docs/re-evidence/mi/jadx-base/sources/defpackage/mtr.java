package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mtr extends ViewDataBinding {
    public final ProgressBar A;
    public final TextView B;
    public final TextView C;

    public mtr(Object obj, View view, int i, ProgressBar progressBar, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = progressBar;
        this.B = textView;
        this.C = textView2;
    }
}
