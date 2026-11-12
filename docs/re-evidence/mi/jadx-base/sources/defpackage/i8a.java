package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class i8a extends ViewDataBinding {
    public final TextView A;
    public final RelativeLayout B;
    public final RecyclerView C;
    public final TextView D;

    public i8a(Object obj, View view, int i, TextView textView, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = relativeLayout;
        this.C = recyclerView;
        this.D = textView2;
    }
}
