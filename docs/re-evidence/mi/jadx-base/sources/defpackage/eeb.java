package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class eeb extends ViewDataBinding {
    public final Button A;
    public final RecyclerView B;

    public eeb(Object obj, View view, int i, Button button, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = button;
        this.B = recyclerView;
    }
}
