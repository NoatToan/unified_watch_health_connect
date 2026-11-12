package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class t6b extends ViewDataBinding {
    public final RecyclerView A;
    public final Button B;
    public final AppCompatTextView C;

    public t6b(Object obj, View view, int i, RecyclerView recyclerView, Button button, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = button;
        this.C = appCompatTextView;
    }
}
