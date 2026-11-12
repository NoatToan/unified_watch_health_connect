package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class cjq extends ViewDataBinding {
    public final Guideline A;
    public final TextView B;
    public final TextView C;

    public cjq(Object obj, View view, int i, Guideline guideline, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = guideline;
        this.B = textView;
        this.C = textView2;
    }
}
