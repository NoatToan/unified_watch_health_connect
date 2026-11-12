package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public abstract class oub extends ViewDataBinding {
    public final ProgressBar A;
    public final TextView B;
    public final TextView C;

    public oub(Object obj, View view, int i, ProgressBar progressBar, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = progressBar;
        this.B = textView;
        this.C = textView2;
    }
}
