package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class jk0 extends ViewDataBinding {
    public final Button A;
    public final TextView B;
    public final LinearLayout C;
    public final LinearLayout D;
    public final RecyclerView E;

    public jk0(Object obj, View view, int i, Button button, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = button;
        this.B = textView;
        this.C = linearLayout;
        this.D = linearLayout2;
        this.E = recyclerView;
    }
}
