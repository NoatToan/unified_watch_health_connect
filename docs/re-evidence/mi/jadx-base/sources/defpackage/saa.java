package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class saa extends ViewDataBinding {
    public final RelativeLayout A;
    public final RecyclerView B;
    public final TextView C;

    public saa(Object obj, View view, int i, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = recyclerView;
        this.C = textView;
    }
}
