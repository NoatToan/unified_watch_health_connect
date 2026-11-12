package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fqp extends ViewDataBinding {
    public final FrameLayout A;
    public final ProgressBar B;
    public final TextView C;

    public fqp(Object obj, View view, int i, FrameLayout frameLayout, ProgressBar progressBar, TextView textView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = progressBar;
        this.C = textView;
    }
}
