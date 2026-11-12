package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qba extends ViewDataBinding {
    public final rbe A;
    public final LinearLayout B;
    public final TextView C;
    public final RecyclerView D;
    public final View E;

    public qba(Object obj, View view, int i, rbe rbeVar, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, View view2) {
        super(obj, view, i);
        this.A = rbeVar;
        this.B = linearLayout;
        this.C = textView;
        this.D = recyclerView;
        this.E = view2;
    }
}
