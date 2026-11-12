package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p2a extends ViewDataBinding {
    public final ImageView A;
    public final RecyclerView B;
    public final ConstraintLayout C;
    public final TextView D;

    public p2a(Object obj, View view, int i, ImageView imageView, RecyclerView recyclerView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = recyclerView;
        this.C = constraintLayout;
        this.D = textView;
    }
}
