package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class sj6 extends ViewDataBinding {
    public final FrameLayout A;
    public final RelativeLayout B;
    public final RecyclerView C;
    public final TextView D;
    public final TextView E;

    public sj6(Object obj, View view, int i, FrameLayout frameLayout, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = relativeLayout;
        this.C = recyclerView;
        this.D = textView;
        this.E = textView2;
    }
}
