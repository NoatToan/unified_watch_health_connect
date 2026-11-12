package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xpp extends ViewDataBinding {
    public final LinearLayout A;
    public final RecyclerView B;

    public xpp(Object obj, View view, int i, LinearLayout linearLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = recyclerView;
    }
}
