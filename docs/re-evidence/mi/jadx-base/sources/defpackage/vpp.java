package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class vpp extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final LinearLayout C;

    public vpp(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = linearLayout;
    }
}
