package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class svk extends ViewDataBinding {
    public final LinearLayout A;
    public final ImageView B;
    public final ImageView C;
    public final RecyclerView D;
    public final ConstraintLayout E;
    public final TextView F;
    public final TextView G;

    public svk(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, RecyclerView recyclerView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = imageView;
        this.C = imageView2;
        this.D = recyclerView;
        this.E = constraintLayout;
        this.F = textView;
        this.G = textView2;
    }
}
