package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zng extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final RecyclerView C;

    public zng(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = recyclerView;
    }
}
