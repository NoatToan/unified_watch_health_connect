package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ie6 extends ViewDataBinding {
    public final RecyclerView A;
    public final Button B;

    public ie6(Object obj, View view, int i, RecyclerView recyclerView, Button button) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = button;
    }
}
