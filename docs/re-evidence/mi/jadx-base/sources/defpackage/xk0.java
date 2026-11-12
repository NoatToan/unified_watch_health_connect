package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class xk0 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final Button C;

    public xk0(Object obj, View view, int i, TextView textView, TextView textView2, Button button) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = button;
    }
}
