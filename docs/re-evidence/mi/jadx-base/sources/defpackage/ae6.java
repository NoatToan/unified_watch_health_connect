package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ae6 extends ViewDataBinding {
    public final RecyclerView A;
    public final ImageButton B;
    public final TextView C;

    public ae6(Object obj, View view, int i, RecyclerView recyclerView, ImageButton imageButton, TextView textView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = imageButton;
        this.C = textView;
    }
}
