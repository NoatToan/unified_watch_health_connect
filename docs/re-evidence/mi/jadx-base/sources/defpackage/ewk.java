package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ewk extends ViewDataBinding {
    public final LinearLayout A;
    public final ImageView B;
    public final RecyclerView C;
    public final TextView D;

    public ewk(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = imageView;
        this.C = recyclerView;
        this.D = textView;
    }
}
