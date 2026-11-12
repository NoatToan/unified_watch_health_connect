package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class y3a extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final RecyclerView C;
    public final RecyclerView D;

    public y3a(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = recyclerView;
        this.D = recyclerView2;
    }
}
