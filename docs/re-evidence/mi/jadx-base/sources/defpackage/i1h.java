package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class i1h extends ViewDataBinding {
    public final RecyclerView A;
    public final Button B;
    public final AppCompatTextView C;

    public i1h(Object obj, View view, int i, RecyclerView recyclerView, Button button, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = button;
        this.C = appCompatTextView;
    }
}
