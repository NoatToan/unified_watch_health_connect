package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class no0 extends ViewDataBinding {
    public final ImageView A;
    public final RecyclerView B;
    public final TextView C;

    public no0(Object obj, View view, int i, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = recyclerView;
        this.C = textView;
    }
}
