package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ee6 extends ViewDataBinding {
    public final RecyclerView A;
    public final Button B;
    public final Button C;
    public final Button D;

    public ee6(Object obj, View view, int i, RecyclerView recyclerView, Button button, Button button2, Button button3) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = button;
        this.C = button2;
        this.D = button3;
    }
}
