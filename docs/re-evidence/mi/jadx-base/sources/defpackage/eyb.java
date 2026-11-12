package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class eyb extends ViewDataBinding {
    public final RecyclerView A;
    public final AppCompatImageView B;
    public final TextView C;
    public final TextView D;

    public eyb(Object obj, View view, int i, RecyclerView recyclerView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = appCompatImageView;
        this.C = textView;
        this.D = textView2;
    }
}
