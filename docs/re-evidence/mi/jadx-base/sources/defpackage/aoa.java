package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aoa extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;

    public aoa(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
    }
}
