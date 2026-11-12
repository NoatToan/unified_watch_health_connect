package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yj6 extends ViewDataBinding {
    public final Button A;
    public final LinearLayout B;
    public final RecyclerView C;

    public yj6(Object obj, View view, int i, Button button, LinearLayout linearLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = button;
        this.B = linearLayout;
        this.C = recyclerView;
    }
}
