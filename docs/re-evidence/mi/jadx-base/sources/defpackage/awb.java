package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class awb extends ViewDataBinding {
    public final Button A;
    public final Button B;
    public final RecyclerView C;

    public awb(Object obj, View view, int i, Button button, Button button2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = button;
        this.B = button2;
        this.C = recyclerView;
    }
}
