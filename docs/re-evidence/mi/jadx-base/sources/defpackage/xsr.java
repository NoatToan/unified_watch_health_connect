package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xsr extends ViewDataBinding {
    public final Button A;
    public final Button B;
    public final Button C;
    public final TextView D;
    public final TextView E;
    public final Button F;

    public xsr(Object obj, View view, int i, Button button, Button button2, Button button3, TextView textView, TextView textView2, Button button4) {
        super(obj, view, i);
        this.A = button;
        this.B = button2;
        this.C = button3;
        this.D = textView;
        this.E = textView2;
        this.F = button4;
    }
}
