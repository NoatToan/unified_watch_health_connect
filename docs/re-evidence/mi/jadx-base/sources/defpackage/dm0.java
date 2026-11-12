package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class dm0 extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;

    public dm0(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
        this.E = textView3;
    }
}
