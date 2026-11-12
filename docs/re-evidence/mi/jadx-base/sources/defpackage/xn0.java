package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xn0 extends ViewDataBinding {
    public final RelativeLayout A;
    public final RecyclerView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;

    public xn0(Object obj, View view, int i, RelativeLayout relativeLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = recyclerView;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
    }
}
