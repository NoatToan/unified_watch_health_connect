package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class uaa extends ViewDataBinding {
    public final RelativeLayout A;
    public final RecyclerView B;
    public final TextView C;
    public final TextView D;

    public uaa(Object obj, View view, int i, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = recyclerView;
        this.C = textView;
        this.D = textView2;
    }
}
