package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k4a extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final LinearLayout C;

    public k4a(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = linearLayout;
    }
}
